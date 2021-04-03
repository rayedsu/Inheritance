package java15;

import java.util.Scanner;

public class inheritance {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Please enter your last name");
		String lastName = input.nextLine();
		System.out.println("Please enter your Gender (Male/Female)");
		String gender = input.nextLine();
		System.out.println("Please enter your birth year");
		Integer year = input.nextInt();
		System.out.println("Please enter your birth month");
		Integer month = input.nextInt();
		System.out.println("Please enter your birth day");
		Integer day = input.nextInt();
		System.out.println("Please enter your Height");
		double height = input.nextDouble()/100;
		System.out.println("Please enter your Weight");
		double weight = input.nextDouble();

		HeartRateBeat obje1 =new HeartRateBeat (name,lastName,year,gender,weight,height);
		obje1.Calculate();




		//todo
		// HeartRates Anne
		// HeartRateBeat Çocuk
}
}