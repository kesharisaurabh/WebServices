package sk.WebApp_02;



import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.model.ParamQualifier;

@Path("stdRes")
public class stdResource 
{
	studentRepositry strepo=new studentRepositry();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<student> getStudent() throws Exception
	{
		
		
		System.out.println("GetStudent");
		return strepo.getStudent();
		
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("AddStudent")
	public student setStudent(student std) throws Exception
	{
		System.out.println("Student Created");
		
		strepo.create(std);
		return std;
		
	}
	
	@GET
	@Path("getStud/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public student setStudent(@PathParam("id")int id) throws Exception
	{
		System.out.println("Student getByID");
		return strepo.getStu(id);
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("UpdateStudent")
	public student updateStudent(student std) throws Exception
	{
		System.out.println("Student Created");
		
		strepo.update(std);
		return std;
		
	}
	
	@DELETE
	@Path("DeleteStu")
	public student killStd(@PathParam("id")int id) throws Exception
	{
		student s=strepo.getStu(id);
		
		strepo.delete(id);
		return s;
	}
}
