package com.cafe.menu.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe.common.DBConnect;
import com.cafe.menu.domain.Menu;
import com.cafe.user.domain.User;

public class MenuRepository {

	private DBConnect connection = DBConnect.getInstance();

	//메뉴전체 불러오기
	public void addMenu () {

		List<Menu> menuList = new ArrayList<>();

		String menuSql = "SELECT * FROM cafeMenus";
		
		try (Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(menuSql)){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Menu menu = new Menu(
						rs.getString("menu_name"),
						rs.getInt("price"),
						rs.getString("menu_type")
						);
				menuList.add(menu);	
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	

		int count = menuList.size();
		if(count > 0) {
			System.out.print("\n=============== 전체 메뉴 목록 ===============\n");
			for(Menu m : menuList) {
				System.out.println(m);
			}
			System.out.println("===============================================");
		}
	}
	
	//메뉴입력해서 주문-주문내역에 남기기
	public void orderMenu() {
		String orderSql = "";
	}




}
