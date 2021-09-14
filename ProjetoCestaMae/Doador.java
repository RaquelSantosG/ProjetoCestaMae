package ProjetoCestaMae;

import java.util.ArrayList;
import java.util.Scanner;

public class Doador extends Usuario {

	
	private int op;
	private int resposta;
	
	public Doador (String nome,String CPF,String endereco,int rendaFamiliar, int op) {
		
		super(nome, CPF, endereco, endereco, rendaFamiliar, op);
		
	}
	Scanner leia = new Scanner (System.in);
	
	ArrayList <Integer> doacoes = new ArrayList();
	

	
	public void doacao(String getNome, String getCPF)
	{
		System.out.println("\t\tBem-vindo ao sistema de doa��o Cesta M�e! Doe como um amor de m�e!");
		
		System.out.println("Se deseja doar, digite 1");
		resposta = leia.nextInt();
		System.out.println("Digite seu nome");
		getNome = leia.next();
		System.out.println("Digite seu CPF");
		getCPF = leia.next();
		
		
		if (resposta == 1)
		{
			System.out.println("\nEscolha uma op��o: ");
			System.out.println("\n(1) - Para doar 15 reais");
			System.out.println("\n(2) - Para doar 25 reais");
			System.out.println("\n(3) - Para doar 50 reais");
			System.out.println("\n(4) - Para doar outros valores");
			
			op = leia.nextInt();
			
			switch (op)
			{
			case 1: 
				doacoes.add(15);
				System.out.println("\nParab�ns!! Voc� doou 15 reais!Sua doa��o � muito importante para n�s!");
				break;
			case 2: 
				doacoes.add(25);
				System.out.println("\nParab�ns!! Voc� doou 25 reais!Sua doa��o � muito importante para n�s!");
				break;
			case 3: 
				doacoes.add(50);
				System.out.println("\nParab�ns!! Voc� doou 50 reais!Sua doa��o � muito importante para n�s!");
				break;
			case 4: 
				
				System.out.println("\nBanco Caixa Econ�mica cc 0002332 ag:1223");
				break;
				default:
					System.out.println("Op��o inv�lida!");
			}
		}
	}
	

}
