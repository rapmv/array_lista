package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.Produtos;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		Produtos[] vetor = new Produtos[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produtos(nome,preco);
		}
		
		double soma = 0;
		for(int i=0; i<vetor.length; i++) {
			soma+=vetor[i].getPrice();
		}
		
		soma=soma/n;
		
		System.out.printf("A media dos valores dos produtos e: %.2f%n",soma);
		
		sc.close();
	}

}
