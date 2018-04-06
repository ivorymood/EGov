package com.bitcamp.web.exam;

public class Calc {
	private int val;


	public void setVal() {
		this.val = 5;
	}
	
	public int add(int num){
		return val += num;
	}
	public int minus(int num){
		return val -= num;
	}
	public int multiply(int num){
		return val *= num;
	}
	public int divide(int num){
		return val /= num;
	}
}
