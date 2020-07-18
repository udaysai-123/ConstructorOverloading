package com.dxc.constructoroverloadingdemo;

public class Product {
	private long pid;
	private String pname;
	private String sname;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Product(String sname) {
		super();
		this.sname = sname;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}


	


	
	
	

}
