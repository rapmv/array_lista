package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i]=sc.nextDouble();
		}
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma+=vet[i];
		}
		
		System.out.println("Valor da soma de todos os numeros e: "+ soma);
		
		for(int i=0; i<n; i++) {
			System.out.println("Valor na posição"+i+": "+String.format("%.2f", vet[i]));
		}
		
		
		
		sc.close();
	}

}
