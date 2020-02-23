package sk.WebApp_02;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student 
{
	private String name;
	private int points;
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
