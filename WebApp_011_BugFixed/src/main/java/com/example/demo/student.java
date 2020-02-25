package com.example.demo;

public class student
{
		private int sid;
		private String name;
		private int points;
		
		
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
		@Override
		public String toString() {
			return "student [sid=" + sid + ", name=" + name + ", points=" + points + "]";
		}
}
