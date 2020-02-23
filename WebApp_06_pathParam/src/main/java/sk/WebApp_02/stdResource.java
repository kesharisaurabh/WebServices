package sk.WebApp_02;



import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.model.ParamQualifier;

@Path("stdRes")
public class stdResource 
{
	studentRepositry strepo=new studentRepositry();
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<student> getStudent()
	{
		
		
		System.out.println("GetStudent");
		return strepo.getStudent();
		
	}
	
	@POST
	@Path("AddStudent")
	public student setStudent(student std)
	{
		System.out.println("Student Created");
		
		strepo.create(std);
		return std;
		
	}
	
	@POST
	@Path("getStud/{id}")
	public student setStudent(@PathParam("id")int id)
	{
		System.out.println("Student getByID");
		return strepo.getStu(id);
	}
}
