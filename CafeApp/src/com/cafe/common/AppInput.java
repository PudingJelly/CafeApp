package com.cafe.common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppInput {

	private static Scanner sc = new Scanner(System.in);
		
		public static String inputString() {//문자입력시 사용
			return sc.nextLine();
		}
		
		public static int inputInteger() {//정수입력시 사용
			int num =0;
			
			try {
				num = sc.nextInt();
			}
			catch (InputMismatchException e) {// 타입불일치 시
				System.out.println("정수로 입력해 주세요.");
			}
			finally {
				sc.nextLine();
			}
			
			return num;
		}
}
