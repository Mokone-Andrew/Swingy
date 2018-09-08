package za.co.wethinkcode.Swingy.Controllers;

import java.util.Random;
import java.util.Scanner;

import za.co.wethinkcode.Swingy.Printers.PrintScreen;

public class Factory {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	static String[] weapon = {"Knife", "Sword", "Grasscutter", "Rope"}; 
	
	static int choice;
	static int HeroHp;
	static String HeroWeapon;
	static int VillianHp;
	
	public static void FightRun() {
		
		int HeroHitPoints = 0;
		int VillianPoint = 0;
		
		HeroHp = 10 - VillianPoint;
		//System.out.println("Your HP: " + HeroHp);
		VillianHp = 15 - HeroHitPoints;
		//System.out.println("Villian HP: " + VillianHp);
		int weaponIndex = rand.nextInt(4);
		HeroWeapon = weapon[weaponIndex]; 
		System.out.println("-----------------------------------------------");
		System.out.println("\t1. Attack");
		System.out.println("\t2. Run");
		System.out.println("-----------------------------------------------");
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			Attack();
		}
		if (choice == 2) {
			PrintScreen.Direction();
		}
		else {
			FightRun();
		}
	}
	public static void Attack() {
		
		int HeroHitpoints = 0;
		
		if (HeroWeapon.equals("Knife")) {
			HeroHitpoints = new java.util.Random().nextInt(5);
		}
		if (HeroWeapon.equals("Sword")) {
			HeroHitpoints = new java.util.Random().nextInt(7);
		}
		if (HeroWeapon.equals("Rope")) {
			HeroHitpoints = new java.util.Random().nextInt(4);
		}
		if (HeroWeapon.equals("Grasscutter")) {
			HeroHitpoints = new java.util.Random().nextInt(8);
		}
		System.out.println("Hero attacked the Villian with " + HeroHitpoints + " Damages");
		
		
		VillianHp = VillianHp - HeroHitpoints;
		
		System.out.println("VillianHp: " + VillianHp);
		
		if (VillianHp < 1) {
			PrintScreen.Win();
		}
		if (VillianHp > 0) {
			
			int VillianPoint = 0;
			
			VillianPoint = new java.util.Random().nextInt(5);
			
			System.out.println("Villian attacked the Hero with " + VillianPoint + " Damages");
			
			HeroHp = HeroHp - VillianPoint;
			
			System.out.println("Herohp: " + HeroHp);
			
			while(HeroHp >= 0 && VillianHp >= 0){
				Attack();
				}
			}
			
			if (HeroHp >= 1) {
				FightRun();
			}
			if (HeroHp < 1) {
				PrintScreen.Dead();
		}
	}
}

