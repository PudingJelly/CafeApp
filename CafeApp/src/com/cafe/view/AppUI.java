package com.cafe.view;

public class AppUI {

	public static void startMain() {
		System.out.println("\n=========== CAFE ORDER SYSTEM ===========");
		System.out.println("♠♠♠ 1. 로그인");
		System.out.println("♠♠♠ 2. 회원가입");
		System.out.println("♠♠♠ 4. 프로그램 종료");
		System.out.println("-----------------------------------------");
		System.out.print("☞ ");
	}
	
	public static void UserMenu() {
		System.out.println("\n=========== USER MENU ===========");
		System.out.println("♥♥♥ 1. 주문하기");
		System.out.println("♥♥♥ 2. 포인트조회");
		System.out.println("♥♥♥ 3. 주문조회");
		System.out.println("♥♥♥ 4. 메인으로");
		System.out.println("-----------------------------------------");
		System.out.print("☞ ");
	}
	
	public static void OrderMenu() {
		System.out.println("\n=========== ORDER MENU ===========");
		System.out.println("★★★ 1. 메뉴선택");
		System.out.println("★★★ 2. 뒤로가기");
		System.out.println("-----------------------------------------");
		System.out.print("☞ ");
	}
}
