package za.co.wethinkcode.Swingy.Printers;

import java.util.Random;
import java.util.Scanner;

import za.co.wethinkcode.Swingy.Controllers.Map;
import za.co.wethinkcode.Swingy.Model.Heroes.Heroes;

public class PrintScreen {
	
	Scanner Scan = new Scanner(System.in);
	static Random rand = new Random();
	static String[] weapon = {"Knife", "Sword", "Grasscutter", "Rope"}; 
	
	static int HeroHp;
	static String HeroName;
	static String HeroWeapon;
	static int VillianHp;
	static int choice;
	static String name;
	
	public static void printMenu() {
		System.out.println("-----------------------------------------------");
        System.out.println("\t1. Create a new hero");
        System.out.println("\t2. Select a previously created hero");
        System.out.println("-----------------------------------------------");
    }

	public static void HeroClasslist() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("!!!!! Please Select Hero Class !!!!!");
		System.out.println("-----------------------------------------------");
		System.out.println("\t1. Warrior");
		System.out.println("\t2. Snake");
		System.out.println("\t3. Reptile");
		System.out.println("-----------------------------------------------");
		
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
			HeroClasslist();
		}
	}
	public static void Herodetails(){
		int HeroHitpoints = 0;
		int VillianPoint = 0;
		HeroHp = 10;
		HeroHp = HeroHp - VillianPoint;
		VillianHp = 15;
		VillianHp = VillianHp - HeroHitpoints; 
		int weaponIndex = rand.nextInt(4);
		HeroWeapon = weapon[weaponIndex]; 
		System.out.println("Your HP: " + HeroHp);
		System.out.println("Villian HP: " + VillianHp);
		System.out.println("Your WEAPON:" + HeroWeapon);
	}
	public static void Direction() {
		System.out.println("-----------------------------------------------");
		System.out.println("Ayeye you have reached some enemies");
		System.out.println("!!!!Where do you wanna go!!!!\n");
		//SquareMap.drawMap();
		System.out.print("1.South");
		System.out.print(" 2.North");
		System.out.print(" 3.West");
		System.out.println(" 4.East");
		System.out.println("-----------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			Map.South();
		}
		if (choice == 2) {
			Map.North();
		}
		if (choice == 3) {
			Map.West();
		}
		if (choice == 4) {
			Map.East();
		}
		else {
			Direction();
		}
	}
	public static void Win() {
		System.out.println("-----------------------------------------------");
		System.out.println("Congratulations You Have Killed The Villian ");
		System.out.println("\t\tYOU WIN");
		System.out.println("-----------------------------------------------");
		
	}
	public static void Dead() {
		
		System.out.println("-----------------------------------------------");
		System.out.println("The Villian Was too Strong For You");
		System.out.println("\t!!!!You Are Dead!!!!");
		System.out.println("\t\tGAME OVER");
		System.out.println("-----------------------------------------------");
	}
}			