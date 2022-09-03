package com.cleancode.cleancode.chapter1;

public class TestDrive {
	
	public static String calculateArea(String types) {
		if(types.equalsIgnoreCase("f")) {
			return "f";
		} else if (types.equalsIgnoreCase("s")) {
			return "s";
		} else if (types.equalsIgnoreCase("q")) {
			return "x";
		} else if (types.equalsIgnoreCase("m")) {
			return "s";
		}
		return "";
	}
	
	public static void main(String[] args) {
		String a = null;
		if("f".equalsIgnoreCase(a) ) {
			
		}
	}
}
