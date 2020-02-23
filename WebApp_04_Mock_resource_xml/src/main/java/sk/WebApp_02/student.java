package sk.WebApp_02;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student 
{
	private int sid;
	private String name;
	private int points;
	
	
	@XmlElement
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
  
	
	
}
