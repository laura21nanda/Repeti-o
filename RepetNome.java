package repetica;

import java.util.Scanner;

public class RepetNome {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        
		String nome;
		
		for(int i = 0; i <= 5;  i++) {
			System.out.println("Informe o nome  ");
			nome = ler.next();
			System.out.println("O nome é: "+nome);
			
		}
			ler.close();
		}
	}
		
		


