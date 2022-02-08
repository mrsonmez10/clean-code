package com.tutorial.clean.code.chapter01.entrance;

public class TestDrive {
	
	// Optional..
	public static String calculateArea(String types)
	{
		if(types.equalsIgnoreCase("F"))
		{
			return "f";
		}
		else if (types.equalsIgnoreCase("s"))
		{
			return "s";
		}
		else if (types.equalsIgnoreCase("q"))
		{
			return "x";
		}
		else if (types.equalsIgnoreCase("m"))
		{
			return "s";
		}
		
		return "";
	}
	
	
	public static void main(String[] args) {
		
		/**
		 *  
		 * 
		 * 
		 */
		
		String a = null;
		
		if("F".equalsIgnoreCase(a)) {
			
		}
		
		if(a.equalsIgnoreCase("F")) {
			
		}

		
		
	}

}
