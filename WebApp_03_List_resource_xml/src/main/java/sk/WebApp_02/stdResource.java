package sk.WebApp_02;



import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("stdRes")
public class stdResource 
{
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<student> getStudent()
	{
		student std1=new student();
		std1.setName("saurabh");
		std1.setPoints(22);
		
		student std2=new student();
		std2.setName("Harsh");
		std2.setPoints(44);
		
		List<student> stdList=Arrays.asList(std1,std2);
		
		System.out.println("GetStudent");
		return stdList;
		
	}
}
