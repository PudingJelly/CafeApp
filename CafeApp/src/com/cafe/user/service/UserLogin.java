package com.cafe.user.service;

import static com.cafe.common.AppInput.*;

import com.cafe.common.AppStart;
import com.cafe.menu.repository.MenuRepository;
import com.cafe.user.domain.User;
import com.cafe.user.repository.UserRepository;
import com.cafe.view.AppUI;

public class UserLogin implements AppStart{
	public final UserRepository userRepository = new UserRepository();
	public final MenuRepository menuRepository = new MenuRepository();
	User user = new User();
	@Override
	public void start() {
		login();
		if(userRepository.loginUser(user)==1) {
			AppUI.UserMenu();
			int selection = inputInteger();
			switch (selection) {
			case 1://주문
				menuRepository.addMenu();				
				break;
			case 2://포인트조회
				findpoint();
				break;
			case 3:
				
				break;
			case 4:
				
				break;

			default:
				System.out.println("잘못된 선택");
			}
			return;
		}
		else {
			return;
		}
//		System.out.println(userRepository.loginUser(user)); 
		
	}

	public void login() {
		System.out.println("\n====== 로그인을 진행합니다. ======");
		System.out.print("♥아이디: ");
		String ID = inputString();
		System.out.print("♥비밀번호: ");
		String PW = inputString();
		
		
		user.setUserID(ID);
		user.setUserPW(PW);
		
//		userRepository.loginUser(user);
		
	}
	public void findpoint() {
		System.out.println("포인트조회");
		System.out.println("♥본인확인을 위한 전화번호를 입력해주세요! ");
		System.out.print(">>>");
		String phone = inputString();
		
		user.setUserPhone(phone);
		
	}

}
