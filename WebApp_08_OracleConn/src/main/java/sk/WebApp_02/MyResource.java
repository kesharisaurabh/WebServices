package sk.WebApp_02;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("/sk")
    @Produces(MediaType.APPLICATION_XML)
	public student getStudent()
	{
		student std1=new student();
		std1.setName("saurabh");
		std1.setPoints(22);
		
		System.out.println("GetStudent");
		return std1;
		
	}
  
    
}
