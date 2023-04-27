package com.cafe.user.service;

import com.cafe.user.domain.User;
import com.cafe.user.repository.UserRepository;
import com.cafe.common.AppStart;

import static com.cafe.common.AppInput.*;

public class UserJoin implements AppStart{

	public final UserRepository userRepository = new UserRepository();
	@Override
	public void start() {
		join();
	}
	//회원가입 로직
	public void join() {

		System.out.println("\n====== 회원가입을 진행합니다. ======");
		System.out.print("♥아이디: ");
		String ID = inputString();
		System.out.print("♥비밀번호: ");
		String PW = inputString();
		System.out.print("♥이름: ");
		String name = inputString();
		System.out.print("♥전화번호: ");
		String phone = inputString();

		User user = new User();
		user.setUserID(ID);
		user.setUserPW(PW);
		user.setUserName(name);
		user.setUserPhone(phone);

		userRepository.addUser(user);
 
	}
}
