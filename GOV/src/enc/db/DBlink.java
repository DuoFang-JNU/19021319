package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import gover.User;

public class DBlink{
	public List<User> readFirst(){   //User是在User.java中类的名称
		List<User> list =new ArrayList<User>();
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_goverment","root","0513&1028root");//"password"是MySQL的密码
			String sql="select * from tb_data";
			psmt=conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				float dataA=rs.getFloat("dataA");
				float dataB=rs.getFloat("dataB");
				User u1=new User(id,name,dataA,dataB);
				list.add(u1);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null){
					rs.close();
				}
				if(psmt!=null){
					psmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
}