package KalkulatorSwitch;

import java.util.Scanner;

public class Kalkulatorswitch {
	public static void main(String[] args){
		int a ;
		int b ;
		String znak;
		System.out.println("Kalkulator do prostych dzia³añ arytmetycznych ");
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê ");
		 a = odczyt.nextInt();
		 System.out.println("Podaj znak dzia³ania ");
		 Scanner odczyt1 = new Scanner(System.in);
		 znak = odczyt1.nextLine();
		 System.out.println("Podaj drug¹ liczbê ");
		 b = odczyt.nextInt();
		
		switch (znak){
		case "+":
			System.out.println(a+b);
		break;
		case  "-":
			System.out.println(a-b);
		break;
		case  "*":
			System.out.println(a*b);
		break;
		case  "/":
			switch(a){
			case 0:
				System.out.println("Nie dziel przez zero");
				break;
				
					
					}
				switch(b)
			{
			case 0:
				System.out.println("Nie dziel przez zero");
				break;
				default:
				System.out.println(a/b);}
			
		break;
		default:
			  System.out.println("Nie potrafie policzyæ");
		
		}}
		 
		 
		 
	
     
	}
