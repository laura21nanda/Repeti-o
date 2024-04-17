package repetica;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		
		
		System.out.println("Informe um número final: ");
		n = ler.nextInt();
		
		for(int i = 0; i <=n; i++) {
		if(i%2!=0) { 
			
			System.out.println("Os números impares de "  + 0 + " a "  + n +  " : " +i);
		}
		}
          ler.close();
	}

	}
