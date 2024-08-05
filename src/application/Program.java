package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			if(resp == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else if(resp == 'c'){
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer numFunc = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFunc));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Pessoa pessoa : list) {
			System.out.println(pessoa);
		}
		
		double sum = 0;
		for(Pessoa pessoa : list) {
			sum += pessoa.calculoImposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		
		sc.close();
	}

}
