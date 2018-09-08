package za.co.wethinkcode.Swingy.Views.Console;

import java.util.Scanner;

import za.co.wethinkcode.Swingy.Model.Heroes.Heroes;
import za.co.wethinkcode.Swingy.Printers.PrintScreen;

public class Console {

	static Scanner scan = new Scanner(System.in);
	static int choice;
	static String name;
	public static Object selectHero;
	static String input;
	
	public static void run() {
		PrintScreen.printMenu();
		choice = scan.nextInt();
		
		if (choice == 1){
			createHero();
		}
		if (choice == 2) {
			selectHero();
		}
		else{
			run();
		}
    }
	public static void selectHero() {
		System.out.println("-----------------------------------------------");
		System.out.println("!!!!!!Please Select Hero!!!!!! ");
		System.out.println("\t1. Madume");
		System.out.println("\t2. Kagi");
		System.out.println("\t3. Neo");
		System.out.println("-----------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		if (choice == 1) {
			Heroes.Warrior();
		}
		if (choice == 2) {
			Heroes.Snake();
		}
		if (choice == 3) {
			Heroes.Reptile();
		}
		else {
			selectHero();
		}
	}
	public static void createHero() {
		
		System.out.println("-----------------------------------------------");
		PrintScreen.HeroClasslist();
		System.out.println("-----------------------------------------------");
	}
}




