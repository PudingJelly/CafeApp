package com.cafe.main;

import static com.cafe.common.AppInput.*;
import com.cafe.view.AppUI;

public class Main {

	public static void main(String[] args) {

		Controller ctr = new Controller();
		
		while(true) {
			AppUI.startMain();
			int chooseNum = inputInteger();
			ctr.mainMenu(chooseNum);
		}
	}

}
