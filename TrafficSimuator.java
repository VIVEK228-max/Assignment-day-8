package AssignmentDay8;

import java.util.Scanner;

public class TrafficSimuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the light state(Green/yellow/red)");
		String lightstate=s.next();
		System.out.println("Enter Hour(0-23");
		int hour=s.nextInt();
		boolean isDaytime = (hour >=6 && hour <=18);
		String action;
		if(lightstate.equalsIgnoreCase("green")) {
			action="Go";
		}else {
			if(lightstate.equalsIgnoreCase("red")) {
				action="stop";
		}else {
			if(lightstate.equalsIgnoreCase("yellow")) {
			if( isDaytime ) {
				action="slow";
		}else {
			    action="stop";}
		}else {
				action="Invalid Light state";
		}
		    System.out.println(action);
		    s.close();
			}
			

		}
	}

}
