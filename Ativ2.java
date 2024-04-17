package repetica;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n,soma=0,media;

		for(int i = 0; i <= 4;  i++) {
			System.out.println("Informe um  numero  ");
			n = ler.nextDouble();
			soma = soma+n;
		}
		media = soma/5;
		System.out.println("A soma é: " + soma + " e a media "+media);

	}
}