package com.spring;

public class Singletone {
	private static Singletone sin=null;
	private Singletone()
	{
		
	}
	
	public static Singletone getSingletone()
	{
		if(sin==null)
		{
			sin=new Singletone();
			return sin;
		}
		else
			return sin;
	}
}
