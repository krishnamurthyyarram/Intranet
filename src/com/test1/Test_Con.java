package com.test1;


class Run {

	public void Method1() {
		
		System.out.println("Printing Method");
	}
	Run() {
		System.out.println("Executing Constructor");
		
	}
}

class Test_Con{
	
	public static void main(String[] args) {
		Run ob= new Run();
		ob.Method1();
		
		
	}
}