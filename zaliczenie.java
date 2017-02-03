
import java.util.Scanner;
import java.util.Random;
public class zaliczenie {
	public static void main(String[] args){
		
		
			{
	Random random = new Random(); 
	int rozmiar = random.nextInt(11)+10; 
	int wieksza = 0, najwieksza = 0, 
			WierszeSuma = 0, KolumnySuma = 0, Komorki = 0;
	double s = 0.0; 
	int[][] tablica1 = new int[rozmiar][rozmiar]; 
			for (int i = 0; i<tablica1.length; i++)
				{
		  for (int j = 0; j<tablica1[i].length; j++)
		     		{
		    if(i != j)
		     			{
		     	tablica1[i][j] = random.nextInt(201)-100; 
		     			}
		    else 
		     			{
		    if(random.nextInt(101) <= 35) 
		     				{
		     	tablica1[i][j] = 1;
		     				}
		     else
		     				{
		     					tablica1[i][j] = -1;
		     				}
		     			}
		     if(tablica1[i][j] > wieksza)
		 				{
		 					wieksza = tablica1[i][j];
		 	if(wieksza>najwieksza)
		 					{
				int zmiennaTymczasowa = 0;
					zmiennaTymczasowa = wieksza;
					wieksza = najwieksza;
					najwieksza = zmiennaTymczasowa;
							}
						}
			if( i % 2 == 0) 
		 				{
		 					WierszeSuma += tablica1[i][j];
		 				}
			if( j % 2 == 1) 
		 				{
		 					KolumnySuma += tablica1[i][j];
		 				}
		 	if(tablica1[i][j] < j*i) 
		 				{
		 					Komorki++;
		 				}
		     		}
				}
		boolean[][] tablica2 = new boolean[rozmiar][rozmiar];
				int licz = 0;
				for (int i = 0; i<tablica2.length; i++)
				{
		     		for (int j = 0; j<tablica2[i].length; j++)
		     		{
						if(random.nextInt(2) == 0)
						{
							tablica2[i][j] = false;
						}
						else
						{
							tablica2[i][j] = true;
							licz += tablica1[i][j];
						}
		     		}
				}
				s = (double)WierszeSuma/KolumnySuma;
				
				System.out.format("Suma elementów dla których  w drugiej tabeli jest true wynosi %d.\n", licz);
				System.out.format("Dwie najwiêksze liczby : %d i %d.\n", wieksza, najwieksza);
				System.out.format("Stosunek sumy liczb le¿¹cych w komórkach o parzystych indeksach wierszy i nieparzystych indeksach kolumn wynosi: %.3f.\n", s);
				System.out.format("Liczba komórek, o wartoœci mniejszej od iloczynu indeksu wiersza i kolumny tej komórki wynosi: %d.", Komorki);
			}
	}}