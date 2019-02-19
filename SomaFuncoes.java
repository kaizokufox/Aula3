import java.util.Scanner;

import javax.swing.JOptionPane;

public class SomaFuncoes {

	public static void main(String[] args) {
		
		String c, d;
		//Scanner s = new Scanner(System.in);
		float a,b;
		
		/*System.out.print("Valor 1: ");
		a=s.nextFloat();*/
		
		c=JOptionPane.showInputDialog("Valor 1");
		d=JOptionPane.showInputDialog("Valor 2");
		
		/*System.out.print("Valor 2: ");
		b=s.nextFloat();*/
		
		a= Float.parseFloat(c);
		b= Float.parseFloat(d);
		
		
		
		
		/*System.out.println("Soma :"+ soma(a,b));
		System.out.println("Produto :"+ produto(a,b));*/
		
		JOptionPane.showMessageDialog(null, "Resultado da Soma : "+ soma (a,b));
		JOptionPane.showMessageDialog(null, "Resultado da Produto : "+ produto (a,b));
		
	}
	
	//função de soma
	public static float soma(float  x, float y) {
		return(x+y);
	}
	
	//função produto *
	public static float produto(float a, float b) {
		return(a*b);
	}
	
}
