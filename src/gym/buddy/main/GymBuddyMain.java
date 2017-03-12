package gym.buddy.main;

import java.util.Scanner;

/* Created by Bartosz Kosakowski
 * First developed in sublime 3 starting on 15/02/17
 * Started eclipse development on 20/02/17
 * Gym Buddy is an android app that will allow you to
 * keep track of your work outs (and potentially nutrition).
 * It will keep track of what exercises you plan on doing
 * per day and per week, as well as the name, category
 * (eg, chest, legs, etc), and number of reps and sets. It
 * will also have a built in rest timer. Future features may
 * include a calorie tracking app integrated into this one so
 * that you don't have a bazillion apps (at least that's how
 * I'd like my apps organized, but I digress).
 */
public class GymBuddyMain {
	//main method, creates a gui
	//*******NOTE: YOU MUST RESIZE THE WINDOW FOR THINGS TO APPEAR (THANKS ECLIPSE??)
	public static void main(String[] args) {
		//Gui gui = new Gui(500, 500);
		
		Scanner scan = new Scanner(System.in);
		RestTimer timer = new RestTimer();
		System.out.print("Enter an int to begin timer: ");
		timer.setTime(scan.nextInt());
		timer.startTimer();
		System.out.println("Done!");
		scan.close();
		/*
		RestTimer myTimer = new RestTimer(10);
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("enter true or false");
		input = scan.next();
		while (Boolean.parseBoolean(input)){
			myTimer.test();
			System.out.println("enter true or false");
			input = scan.next();
		}
		*/
	}//end of main method
}//end of GymBuddyMain
