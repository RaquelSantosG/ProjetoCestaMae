package ProjetoCestaMae;

import java.util.Scanner;

public class Usuario {

		
		private String nome, dataNasc, CPF, endereco;
		private double rendaFamiliar = 0,rendaFinal = 0;
		private int moradores = 0;
		
		Scanner leia = new Scanner(System.in);
		
		public Usuario(String nome, String dataNasc, String CPF, String endereco, double rendaFamiliar, int moradores){
		
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.CPF = CPF;
		this.endereco = endereco;
		this.rendaFamiliar = rendaFamiliar;
		this.moradores = moradores;		
	
	}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}

		public String getEnd() {
			return endereco;
		}

		public void setEnd(String endereco) {
			this.endereco = endereco;
		}

		public double getRendaFamiliar() {
			return rendaFamiliar;
		}

		public void setRendaFamiliar(double rendaFamiliar) {
			this.rendaFamiliar = rendaFamiliar;
		}

		public int getMoradores() {
			return moradores;
		}

		public void setMoradores(int moradores) {
			this.moradores = moradores;
		}
		
	
			public void validarRenda(){
			
				System.out.println("\nDigite sua renda familiar: ");
				rendaFamiliar = leia.nextDouble();	
				
				System.out.println("\nQuantos moradores tem na sua residencia? ");
				moradores = leia.nextInt();	
				  
				rendaFinal = rendaFamiliar / moradores;
				
				if(rendaFinal < 500) {
					
					System.out.println("\nVoce esta apto a prosseguir no programa! Continue com o cadastro!");
				
				}else { 
						
						System.out.println("\nVoce não esta apto a prosseguir no programa! ");
			
						System.exit(0);
					}	
				}
			
				
			

				public void login() {
					
					System.out.println("\nDigite seu nome: ");
					nome = leia.next();	
					
					System.out.println("\nDigite seu CPF:  ");
					CPF = leia.next();
					
					System.out.println("\nDigite sua data de nascimento:  ");
					dataNasc = leia.next();
					
					System.out.println("\nDigite seu endereço completo: ");
					endereco = leia.next();
					
					System.out.println("\nParabens cadastro finalizado, aguardar a aprovação!");
					
					System.exit(0);
				}
			}


