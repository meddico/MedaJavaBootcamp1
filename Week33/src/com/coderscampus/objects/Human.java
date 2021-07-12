package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (visibility modifier, return type, method name, params, scope
	
	String getInfo () {
		return "Gender:" + gender + ", Height: " + height +
				", Eye Color: " + eyeColor + ", Weight: " + weight;
		
	}
	
	void setproperties (String _gender, String _height, 
			String _weight, String _eyeColor) {
		
		this.gender = _gender;
		this.height = _height;
		this.weight = _weight;
		this.eyeColor = _eyeColor;
		
	}
}


