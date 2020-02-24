package sk.WebApp_02;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class studentRepositry
{
	List<student> stdList;
	Connection con=null;
	public studentRepositry() 
	{	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public List<student> getStudent() throws Exception
	{
		List<student> listStu=new ArrayList<student>();
		String Sql="select * from student";
		Statement pst=con.createStatement();
		ResultSet rs= pst.executeQuery(Sql);
		
		while(rs.next())
		{
			student stc=new student();
			stc.setSid(rs.getInt(1));
			stc.setName(rs.getString(2));
			stc.setPoints(rs.getInt(3));
			
			stdList.add(stc);
		}
		return stdList;
	}
	
	public student getStu(int sid) throws Exception
	{
		student stc=new student();
		List<student> listStu=new ArrayList<student>();
		String Sql=("select * from student where id="+sid);
		Statement pst=con.createStatement();
		ResultSet rs= pst.executeQuery(Sql);
		
		while(rs.next())
		{
			
			stc.setSid(rs.getInt(1));
			stc.setName(rs.getString(2));
			stc.setPoints(rs.getInt(3));
			
			
		}
		return stc;
	}

	public void create(student std) throws Exception {
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
		pst.setInt(1, std.getSid());
		pst.setString(2, std.getName());
		pst.setInt(3, std.getPoints());
		
		pst.execute();
	}

	public void update(student std) throws Exception
	{
		PreparedStatement pst=con.prepareStatement("update student set name=? ,points=? where id=?");
		pst.setInt(3, std.getSid());
		pst.setString(1, std.getName());
		pst.setInt(2, std.getPoints());
		
		pst.execute();
	}

	public void delete(int id) throws Exception 
	{
		PreparedStatement pst=con.prepareStatement("delete from student where id=?");
		pst.setInt(3, id);
		
		
		pst.execute();
	}
	
}
