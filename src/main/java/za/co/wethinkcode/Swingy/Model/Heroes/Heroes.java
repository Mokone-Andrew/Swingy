package za.co.wethinkcode.Swingy.Model.Heroes;

import java.util.Scanner;

import za.co.wethinkcode.Swingy.Printers.PrintScreen;
import za.co.wethinkcode.Swingy.Views.Console.Console;

public class Heroes {
	
	static Scanner scan = new Scanner(System.in);
	static int choice;
	static String name;
	
	public static void Warrior() {
		
		System.out.println("Please Enter Name: ");
		name = scan.nextLine();
		System.out.println("Hero Name : " + name );
		System.out.println("Hero Class : Warrior");
		System.out.println("Level : Level1");
		System.out.println("Experience : 1000");
		System.out.println("Attack : 76");
		System.out.println("Defence : 50");
		System.out.println("Hit Points : 2\n");
		System.out.println("-----------------------------------------------");
		System.out.println("\t1. Continue");
		System.out.println("\t2. Back");
		System.out.println("-----------------------------------------------");
		
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			PrintScreen.Direction();
		}
		if ( choice == 2) {
			PrintScreen.HeroClasslist();
		}else {
			PrintScreen.Herodetails();
		}
	}
	public static void Snake() {
		
		System.out.println("Please Enter Name: ");
		name = scan.nextLine();
		System.out.println("Hero Name : " + name );
		System.out.println("Hero Class : Snake");
		System.out.println("Level : Level1");
		System.out.println("Experience : 1000");
		System.out.println("Attack : 55");
		System.out.println("Defence : 45");
		System.out.println("Hit Points : 1\n");
		System.out.println("-----------------------------------------------");
		System.out.println("\t1. Continue");
		System.out.println("\t2. Back");
		System.out.println("-----------------------------------------------");
		
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			PrintScreen.Direction();
		}
		if ( choice == 2) {
			PrintScreen.HeroClasslist();
		}else {
			
		}
	}
	public static void Reptile() {
		
		System.out.println("Please Enter Name: ");
		name = scan.nextLine();
		System.out.println("Hero Name : " + name );
		System.out.println("Hero Class : Reptile");
		System.out.println("Level : Level1");
		System.out.println("Experience : 87");
		System.out.println("Attack : 30");
		System.out.println("Defence : 30");
		System.out.println("Hit Points : 2\n");
		System.out.println("-----------------------------------------------");
		System.out.println("\t1. Continue");
		System.out.println("\t2. Back");
		System.out.println("-----------------------------------------------");
		
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			PrintScreen.Direction();
		}
		if ( choice == 2) {
			PrintScreen.HeroClasslist();
		}else {
			
		}
	}
}
