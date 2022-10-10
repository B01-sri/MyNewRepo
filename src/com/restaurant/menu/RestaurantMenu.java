package com.restaurant.menu;

import java.util.Scanner;

public class RestaurantMenu {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		String[] menu = { "", "1.Idli", "2.Dosa", "3.Puri", "4.Pongal", "5.kara Bath" };
		int[] price = { 0, 20, 15, 30, 30, 35 };

		do {
			for (int i = 1; i < menu.length; i++) {
				System.out.println(menu[i] + "\t\t\t\t" + price[i]);

			}

		} while (false);
	
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
			str[i] = menu[item];
			p[i] = price[item];

		}
		System.out.println("Your Orders are :");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " is" + p[i]);
			sum = sum + p[i];
		}

		
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
	System.out.println("Total Bill amount  :" + sum);
	}

	
		
				
	

	}
	

