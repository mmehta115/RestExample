package com.jwt.rest;

public class Company
{
	private String name;
	private String id;
	private String address;
	
	public Company()
	{
		name = "";
		id = "";
		address = "";
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(String i)
	{
		id = i;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}
	
	public String getAddress()
	{
		return address;
	}
}