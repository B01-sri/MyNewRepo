package com.techno.javabasics;

import com.technoelevate.javabasics.AccessSpecifiersDemo;

public class AccessSpecifiersDemo2  extends AccessSpecifiersDemo{

	public static void main(String[] args) {
	AccessSpecifiersDemo AccessSpecifiersDemo= new AccessSpecifiersDemo2();
   AccessSpecifiersDemo2 AccessSpecifiersDemo2 = (AccessSpecifiersDemo2) AccessSpecifiersDemo;
		//AccessSpecifiersDemo.disp();;
		//AccessSpecifiersDemo.exhibit(); //
	    AccessSpecifiersDemo2.view(); //Downcasting and accessing by child class obj
	    //AccessSpecifiersDemo.show();

	}

}
