package ProjetoCestaMae;

import java.util.Scanner;

public class Principal {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int resp;
			
			System.out.println("\nBem vindo a projeto Cesta m�e");
			System.out.println("\nSelecione uma op��o abaixo");
			System.out.println("\n(1)Para receber doa��o de cesta basica");
			System.out.println("\n(2)Para fazer uma doa��o");
			
			resp = leia.nextInt();
			
			if(resp == 1) {
				
				Usuario Novo = new Usuario("","","","",0,0);
				Novo.validarRenda();
				Novo.login();
				
			}else if(resp == 2){
				
				Doador doadorNovo = new Doador("","","",0,0);
				doadorNovo.doacao("","");
			}
			
			

	}

}


