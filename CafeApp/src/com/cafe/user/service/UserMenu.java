package com.cafe.user.service;

import static com.cafe.common.AppInput.inputInteger;
import static com.cafe.common.AppInput.inputString;
import com.cafe.menu.domain.MenuList;
import com.cafe.common.AppStart;
import com.cafe.menu.domain.Menu;
import com.cafe.menu.domain.MenuList;
import com.cafe.menu.repository.MenuRepository;
import com.cafe.order.domain.Order;
import com.cafe.payment.Payment;
import com.cafe.user.domain.User;
import com.cafe.user.repository.UserRepository;
import com.cafe.view.AppUI;

public class UserMenu implements AppStart{
	public final UserRepository userRepository = new UserRepository();
	public final MenuRepository menuRepository = new MenuRepository();
	User user = new User();
	Menu menu = new Menu();
	Payment payment = new Payment();
	Order order = new Order();
	MenuList MenuList = new MenuList(); 
	
	String ID ="";
	@Override
	public void start() {
		login();
		if(userRepository.loginUser(user)==1) {
			while(true) {
//			login();
				AppUI.userMenu();
				int selection = inputInteger();
				switch (selection) {
				case 1://주문하기
					menuRepository.addMenu();
					AppUI.orderMenu();
					
					selection = inputInteger();
					switch (selection) {
					case 1: //메뉴선택
						chooseMenu();
						int check =menuRepository.findMenu(menu,user);//return에 따라 메뉴 확인후에 결제없이 빠져나가기
						if(check == 1) {
							menuRepository.writeHistory(menu,user);
							payment();
							menuRepository.paymentMenu(payment,user,menu,order);
							break;
						}
						else
						break;//메뉴end
						
					case 2: //뒤로가기
						break;
					default:
						System.out.println("잘못된 선택");
					}
					break;//주문end
					
				case 2://포인트조회
					findpoint();
					userRepository.phoneNumber(user);
					break;
					
				case 3://주문조회
					userRepository.SelectNumber(MenuList, user);
					break;
				case 4://로그아웃
					System.out.println("♡♡♡♡ 로그아웃 되었습니다 ♡♡♡♡");
					return;

				default:
					System.out.println("잘못된 선택");
				}
				
			}
		}
		else {//로그인실패이므로 while을 중지하고 처음메뉴로 나감
			return;
		}

		
	}


	public void login() {
		System.out.println("\n====== 로그인을 진행합니다. ======");
		System.out.print("♥아이디: ");
		ID = inputString();
		System.out.print("♥비밀번호: ");
		String PW = inputString();
		
		
		user.setUserID(ID);
		user.setUserPW(PW);
		
//		userRepository.loginUser(user);
		
	}
	public void findpoint() {
		System.out.println("☆☆☆ 포인트조회 ☆☆☆");
		user.setUserID(ID);
	}
	
	public void findorder() {
		System.out.println("☆☆☆ 주문 메뉴를 조회합니다 ☆☆☆");
		MenuList.setWho_order(ID);
	}
	
	
	public void chooseMenu() {
		System.out.println("주문하실 메뉴를 입력해주세요 ");
		System.out.print(">>>");
		String menuName = inputString();
		
		menu.setMenuName(menuName);
	}
	public void payment() {
		System.out.println("결제방법을 선택해주세요 ");
		System.out.println("[1.카드결제 | 2.포인트 결제]");
		System.out.print(">>>");
		int pay = inputInteger();
		
		if(pay == 1) {
			payment.setHowToPay("카드결제");
			user.setUserID(ID);
		}
		else if (pay == 2) {
			payment.setHowToPay("포인트결제");
			user.setUserID(ID);
		}
		else {
			System.out.println("잘못된선택");
		}
	}
	
}
