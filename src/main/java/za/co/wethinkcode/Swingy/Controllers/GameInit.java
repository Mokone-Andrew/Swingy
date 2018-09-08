package za.co.wethinkcode.Swingy.Controllers;

import java.util.Scanner;

import za.co.wethinkcode.Swingy.Printers.PrintScreen;

public class GameInit {
	
	public static void Run() {
		
	}
	public static void Fight() {
		
		int choice;
		System.out.println("-----------------------------------------------");
		System.out.println("\t1. Fight");
		System.out.println("\t2. Run");
		System.out.println("-----------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		if (choice == 1){
			Factory.FightRun();
		}
		if (choice == 2) {
			PrintScreen.Direction();
		}
		else {
			Fight();
		}
	}
}
