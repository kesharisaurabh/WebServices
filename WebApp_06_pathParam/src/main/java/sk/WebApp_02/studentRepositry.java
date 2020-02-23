package sk.WebApp_02;

import java.util.ArrayList;
import java.util.List;

public class studentRepositry
{
	List<student> stdList;
	
	public studentRepositry() 
	{	
		stdList =new ArrayList<student>();
		
		student std1=new student();
		std1.setSid(01);
		std1.setName("saurabh");
		std1.setPoints(22);
		
		student std2=new student();
		std2.setSid(02);
		std2.setName("Harsh");
		std2.setPoints(44);
		
		stdList.add(std1);
		stdList.add(std2);
		
	}
	
	public List<student> getStudent()
	{
		return stdList;
	}
	
	public student getStu(int sid)
	{
		
		for(student str:stdList)
		{
			if(str.getSid()==sid)
			{
				return str;
			}
		}
		return new student();
	}

	public void create(student std) {
		stdList.add(std);
		
	}
	
}
