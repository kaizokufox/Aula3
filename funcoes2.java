import java.util.Scanner;

import javax.swing.JOptionPane;

public class funcoes2 {

	public static void main(String[] args) {
		

		Scanner ler = new Scanner(System.in);
		float peso, altura;
		float imc;
		
		System.out.print("Peso da pessoa (KG): ");
		peso=ler.nextFloat();

		System.out.print("Altura da pessoa (M): ");
		altura=ler.nextFloat();
		
		imc= calcIMC(peso,altura);

		System.out.println("Resultados do IMC : "+ resultadoIMC(imc));
		
		ler.close();
		
		
		
		//System.out.println("Soma :"+ soma(a,b));
		//System.out.println("Produto :"+ produto(a,b));
		
		
		
		

	}
	

}
