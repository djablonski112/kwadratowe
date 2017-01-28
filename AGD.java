import java.lang.Math.*;
import java.util.Scanner;
public class AGD {

	public static void main(String[] args){
		int a = 3;
		double cena;
		double raty;
		double r1;double r2;double r3;
		
			do{
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj cenê zakupu z zakresu 100-10000");
		 cena = odczyt.nextDouble();
		 do{
		if (cena >= 100 && cena <=10000 ){
		Scanner odczyt1 = new Scanner(System.in);
		System.out.println("Podaj iloœæ rat z zakresu 6-48 ");
		 raty = odczyt.nextDouble();
		 if(raty >= 6 && raty <= 48){
		 if (raty >= 6 && raty <=12){
		 r1=((cena/raty)*0.025);
		 System.out.println("Miesiêczna rata wynosi ");
		 System.out.printf("%.2f%n",(cena/raty)+r1);
		a=5; 
		}
		 if (raty >= 13 && raty <=24){
		 r2=((cena/raty)*0.05);
		 System.out.println("Miesiêczna rata wynosi ");
		 System.out.printf("%.2f%n", (cena/raty)+r2);
		 a=5;
		 }
		 if (raty >= 25 && raty <=48){
		 a=5;
		 r3=((cena/raty)*0.1);
		 System.out.println("Miesiêczna rata wynosi ");
		 System.out.printf("%.2f%n", (cena/raty)+r3);
		 a=5;
		 }
		 }
		 else{ 
			 System.out.println("Niew³aœciwa iloœæ rat zakres 6-48 ");
		 }
		 }
		 else {System.out.println("Niew³aœciwa cena zakres 100-10000"); 
		 a=5;
		 }}
		 
		 while (a<4);
		 a=3;
			}
		 while(cena >=100 || cena <=10000);
}}
		
			
	
	
		

