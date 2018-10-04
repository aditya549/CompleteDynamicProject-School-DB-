package com.cubic.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cubic.project.beans.AdminBean;

public class AdminDAO{
	public static boolean login(AdminBean ab) {
		boolean status=false;
		Connection con=DBMain.getCon();
		System.out.println(ab.getAname());
		System.out.println(ab.getApass());
		try {
		PreparedStatement pst=con.prepareStatement("select * from admin where adminname=? and adminpassword=?");
		pst.setString(1, ab.getAname());
		pst.setString(2, ab.getApass());
		ResultSet rs=pst.executeQuery();
		status=rs.next();
		}catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
