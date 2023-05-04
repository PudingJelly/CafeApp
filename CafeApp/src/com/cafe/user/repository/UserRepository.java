package com.cafe.user.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cafe.common.DBConnect;
import com.cafe.menu.domain.MenuList;
import com.cafe.user.domain.User;

public class UserRepository {

	private DBConnect connection = DBConnect.getInstance();
	private DBConnect connection2 = DBConnect.getInstance();

	// 회원가입
	public void addUser(User user) {
		System.out.println("확인하기::::" + user);
		String insertSql = "INSERT INTO cafeUser (user_ID, user_PW, user_name, user_phone)" + "VALUES(?,?,?,?)";
		String selectSql = "SELECT user_id from cafeUser where user_id = ?";
		try (Connection conn = connection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(insertSql);
				Connection conn2 = connection2.getConnection(); PreparedStatement pstmt2 = conn2.prepareStatement(selectSql)) {
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPW());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserPhone());
			
			pstmt2.setString(1,user.getUserID());
			ResultSet rs = pstmt2.executeQuery();
			
//			System.out.println(rs.next());
			if(rs.next()) {
				System.out.println("중복된 아이디 입니다!");
				return;
			}
			else {
				if (pstmt.executeUpdate() == 1) {
					System.out.println(user.getUserName() + "님 가입이 완료되었습니다!.");
				} else {
					System.out.println("회원가입에 실패했습니다.");
				}
			}
			
		} catch (Exception e) {
			System.out.println("회원가입에 실패했습니다.DB오류");
		}
	}

	// 로그인
	public int loginUser(User user) {
		String selectsql = "Select user_PW, user_name, user_point from cafeUser where user_id = ?";
		try (Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(selectsql);) {
			pstmt.setString(1, user.getUserID());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).contentEquals(user.getUserPW())) {
					System.out.println();
					System.out.println("╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ╮\r\n"
							+ "      ♡ "+rs.getString(2)+ "님 ♡\r\n"
							+ "      ♡ 환영합니다! ♡\r\n"
							+ "╰ ◟◞ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟◞ ╯\r\n"
							+ "⠀⠀⠀⠀O\r\n"
							+ "⠀⠀⠀⠀⠀°\r\n"
							+ "〃o　 (\\＿(\\\r\n"
							+ "‎⊂⌒（ ´ • ﻌ •）\r\n"
							+ "ヽ_っ＿/￣￣￣/\r\n"
							+ "　 　 ＼/＿＿＿/\r\n"
							+ "");
					user.setUserPoint(rs.getInt(3));// 유저의 포인트를 끌고 와야 나중에 계산할때 쓸수있다.	
//					return 1;
				}
				else if (!rs.getString(1).contentEquals(user.getUserPW())) {
					System.out.println("일치하는 비밀번호가 아닙니다.");
					return 0;
				}
				return 1;
			}
			else {
				System.out.println("일치하는 아이디가 없습니다.");
				return -1;
			}

		} catch (Exception e) {
			return -2;// DB오류
		}
	}

	// 가지고있는 user객체의 아이디정보를 사용해서 포인트를 불러온다.
	public void phoneNumber(User user) {
		String selectsql = "Select user_point from cafeUser where user_id = ?";
		try (Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(selectsql);) {
			pstmt.setString(1, user.getUserID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("\n☆☆☆☆☆ " + rs.getInt(1) + " 점 입니다. ☆☆☆☆☆");
			} else {
				System.out.println("조회에 실패했습니다.");
			}
		} catch (Exception e) {
		}
	}

	public void SelectNumber(MenuList MenuList, User user) {
		List<MenuList> orderList = new ArrayList<>();
		String selectsql = "Select * from orderMenus where who_order = ?";
		try (Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(selectsql);) {
			pstmt.setString(1, user.getUserID());
			ResultSet rs = pstmt.executeQuery();
//			System.out.println(rs.next());
			while (rs.next()) {
				MenuList order = new MenuList(rs.getInt("order_num"), rs.getString("o_menu_name"),
						rs.getInt("order_price"), rs.getString("payment"), rs.getString("who_order"));
				orderList.add(order);
			}
		} catch (Exception e) {
			System.out.println("디비오류?");
		}
		int count = orderList.size();
		if (count > 0) {
			System.out.println("주문 내역을 조회합니다.");
			for (MenuList o : orderList) {
				System.out.println(o);
			}
		}
	}
}
