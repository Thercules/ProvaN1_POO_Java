package testando;

import java.util.Scanner;

public class testando3 {
public static void main(String[] args) {
	int i, n = 0, s=0; 
	double avg; 
	{
		System.out.println("Digite 5 numeros positivos: ");
	}
	for (i=0; i < 5; i++) {
		Scanner in = new Scanner(System.in); 
		n = in.nextInt();
		
		s += n; 		
	}
	avg = s / 5; 
	System.out.println("A soma dos 5 numeros de entrada: " + s + " sua média: " + avg);
}
}
