package com.spring.sc03Ref;

public class Emp {
	
	 private int x ; 
	 private B ob ;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public Emp(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [x=" + x + ", ob=" + ob + "]";
	} 
	 
	 
	 
	
	
}
