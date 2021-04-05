package com.improv;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Improv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please, dear sucker, I mean, viewer, select a person!");
			System.out.println("0 = Joe Pesci, 1 = Schwarzenegger, 2 = De Niro, 3 = ScarJo, 4 = Joe Mama");
			System.out.println("5 = Ben Stein, 6 = Putin, 7 = Obama, 8 = James Buchanon, 9 = Yourself: ");
			int selection;
			selection = extracted(scanner);
			boolean properNumberSelected = false;
			String name = "";
			while (!properNumberSelected) {
				switch (selection) {
				case 0: {
					name = "Joe Pesci";
					properNumberSelected = true;
					break;
				}
				case 1: {
					name = "Schwarzenegger";
					properNumberSelected = true;
					break;
				}
				case 2: {
					name = "De Niro";
					properNumberSelected = true;
					break;
				}
				case 3: {
					name = "ScarJo";
					properNumberSelected = true;
					break;
				}
				case 4: {
					name = "Joe Mama";
					properNumberSelected = true;
					break;
				}
				case 5: {
					name = "Ben Stein";
					properNumberSelected = true;
					break;
				}
				case 6: {
					name = "Putin";
					properNumberSelected = true;
					break;
				}
				case 7: {
					name = "Obama";
					properNumberSelected = true;
					break;
				}
				case 8: {
					name = "James Buchanon";
					properNumberSelected = true;
					break;
				}
				case 9: {
					name = "Yourself";
					properNumberSelected = true;
					break;
				}
				default:
					System.out.println("Let's try this again, but smarter\n");
					System.out.println("Pick a number between 0 and 9. Yes, it is inclusive, Pythagoras");
					System.out.println("0 = Joe Pesci, 1 = Schwarzenegger, 2 = De Niro, 3 = ScarJo, 4 = Yo Mama");
					System.out.println("5 = Ben Stein, 6 = Putin, 7 = Obama, 8 = James Buchanon, 9 = Yourself: ");
					selection = extracted(scanner);
				}
			}
			System.out.println("Select another person in a funny way. Heck, it might even be funny to select the same person");
			System.out.println("0 = Joe Pesci, 1 = Schwarzenegger, 2 = De Niro, 3 = ScarJo, 4 = Joe Mama");
			System.out.println("5 = Ben Stein, 6 = Putin, 7 = Obama, 8 = James Buchanon, 9 = Yourself: ");
			selection = extracted(scanner);
			properNumberSelected = false;
			String secondName = "";
			while (!properNumberSelected) {
				switch (selection) {
				case 0: {
					secondName = "Joe Pesci";
					properNumberSelected = true;
					break;
				}
				case 1: {
					secondName = "Schwarzenegger";
					properNumberSelected = true;
					break;
				}
				case 2: {
					secondName = "De Niro";
					properNumberSelected = true;
					break;
				}
				case 3: {
					secondName = "ScarJo";
					properNumberSelected = true;
					break;
				}
				case 4: {
					secondName = "Joe Mama";
					properNumberSelected = true;
					break;
				}
				case 5: {
					secondName = "Ben Stein";
					properNumberSelected = true;
					break;
				}
				case 6: {
					secondName = "Putin";
					properNumberSelected = true;
					break;
				}
				case 7: {
					secondName = "Obama";
					properNumberSelected = true;
					break;
				}
				case 8: {
					secondName = "James Buchanon";
					properNumberSelected = true;
					break;
				}
				case 9: {
					secondName = "Yourself";
					properNumberSelected = true;
					break;
				}
				default:
					System.out.println("Let's try this again, but smarter\n");
					System.out.println("Pick a number between 0 and 9. This time with less messing up.");
					System.out.println("0 = Joe Pesci, 1 = Schwarzenegger, 2 = De Niro, 3 = ScarJo, 4 = Yo Mama");
					System.out.println("5 = Ben Stein, 6 = Putin, 7 = Obama, 8 = James Buchanon, 9 = Yourself: ");
					selection = extracted(scanner);
				}
			}
			System.out.println("Select a place you hate the most.");
			System.out.println("0 = NYC, 1 = Paris, 2 = Los Angeles, 3 = Boston, 4 = Amsterdam");
			selection = extracted(scanner);
			properNumberSelected = false;
			String place = "";
			while (!properNumberSelected) {
				switch (selection) {
				case 0: {
					place = "NYC";
					properNumberSelected = true;
					break;
				}
				case 1: {
					place = "Paris";
					properNumberSelected = true;
					break;
				}
				case 2: {
					place = "Los Angeles";
					properNumberSelected = true;
					break;
				}
				case 3: {
					place = "Boston";
					properNumberSelected = true;
					break;
				}
				case 4: {
					place = "Amsterdam";
					properNumberSelected = true;
					break;
				}
				default:
					System.out.println("Let's try this again, but smarter\n");
					System.out.println("Select a place you hate the most. Aside from your parent's house.");
					System.out.println("0 = NYC, 1 = Paris, 2 = Los Angeles, 3 = Boston, 4 = Amsterdam");
					selection = extracted(scanner);
				}
			}
			System.out.println("Select a funny activity (something not dirty).");
			System.out.println("0 = juggling chainsaws, 1 = beatboxing,"
							+ " 2 = solving mysteries in a van, 3 = monster truck crushing,"
							+ " 4 = kung fu on a bridge over a volcano");
			selection = extracted(scanner);
			properNumberSelected = false;
			String activity = "";
			while (!properNumberSelected) {
				switch (selection) {
				case 0: {
					activity = "juggling chainsaws";
					properNumberSelected = true;
					break;
				}
				case 1: {
					activity = "beatboxing";
					properNumberSelected = true;
					break;
				}
				case 2: {
					activity = "solving mysteries in a van";
					properNumberSelected = true;
					break;
				}
				case 3: {
					activity = "monster truck crushing";
					properNumberSelected = true;
					break;
				}
				case 4: {
					activity = "kung fu on a bridge over a volcano";
					properNumberSelected = true;
					break;
				}
				default:
					System.out.println("Let's try this again, but smarter\n");
					System.out.println("Select a funny activity (please keep it clean).");
					System.out.println("0 = juggling chainsaws, 1 = beatboxing,"
									+ " 2 = solving mysteries in a van, 3 = monster truck crushing,"
									+ " 4 = kung fu-ing on a bridge over a volcano");
					selection = extracted(scanner);
				}
			}
			System.out.format("%s and %s sitting in a tree...in %s %s. Dissappointment is my only sense of humor. "
							+ "Here's the world's shortest joke: stationary store moves.", name, secondName, place, activity);
		} finally {
			scanner.close();
		}
	}

	private static int extracted(Scanner scanner) {
		int selection;
		try {
			selection = scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.next();
			selection = 10;
		}
		return selection;
	}

}
