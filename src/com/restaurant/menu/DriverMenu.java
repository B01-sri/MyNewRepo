package com.restaurant.menu;

import java.util.Scanner;

public class DriverMenu {

	public static int order() {
		Scanner scanner = new Scanner(System.in);
		
			while(true)
			{
				System.out.println("How many items would you like to have?");
			
			int count = scanner.nextInt();
				
			

				String[] str = new String[count];
				int[] p = new int[count];
				System.out.println("What are the items would you like to have?");
				System.out.println("Mention the Order Number");
				for (int i = 0; i < count; i++) {
					int item = scanner.nextInt();
					System.out.println("Is there any item you would like to add it to the Order ?   yes or no");
					String nstr = scanner.next();
					if (nstr.equalsIgnoreCase("yes")) {
						continue;
						}
						else
						{
						break;
					}
					
				}
			}
				return item;

			}
