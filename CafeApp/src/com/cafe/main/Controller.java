package com.cafe.main;

import com.cafe.common.AppStart;
import com.cafe.user.service.UserJoin;
import com.cafe.user.service.UserLogin;

public class Controller {
	private AppStart service;
	
	//넘겨주는 값에 따라 실행되는 메뉴를 정해준다.
	public void mainMenu(int choose) {
		try {
			switch (choose) {
			case 1://로그인
				service = new UserLogin();
				break;
			case 2://회원가입
				service = new UserJoin();
				break;
			case 3://비회원 주문
				
				break;
			case 4://프로그램 종료
				System.out.println("♣이용해 주셔서 감사합니다♣");
				System.exit(0);

			default:
				System.out.println("잘못된 선택입니다.");
			}
			service.start();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
