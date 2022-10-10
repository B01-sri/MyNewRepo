package com.technoelevate.javabasics;

//4 methods with different access specifiers
public class AccessSpecifiersDemo {

	public void disp() {
		System.out.println("Public Access Specifier");
	}
	
	private void show() {
		System.out.println("Private Access Specifier");
	}
	
	protected void view() {
		System.out.println("Protected Access Specifier");
	}
	void exhibit() {
		System.out.println("Default Access Specifier");
	}
	
	public static void main(String[] args) {
		AccessSpecifiersDemo AccessSpecifiersDemo = new AccessSpecifiersDemo();
		AccessSpecifiersDemo.disp();
		AccessSpecifiersDemo.show();
		AccessSpecifiersDemo.view();
		AccessSpecifiersDemo.exhibit();

	}

}
