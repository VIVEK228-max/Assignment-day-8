package AssignmentDay8;

import java.util.Scanner;

public class GeometryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter input");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		if(a == b&&b==c&&c==d) {
			System.out.println("Square");
		}else if (a==c&&b==d) {
			System.out.println("Rectangle");
		}else {
			System.out.println("Other");
		}
		s.close();
		
	}

}
