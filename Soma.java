import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y;
		
		System.out.println("Soma de números inteiros");
		System.out.print("Valor 1: ");
		x=s.nextInt();
		System.out.print("Valor 2 : ");
		y=s.nextInt();
		System.out.println("Resultado: "+(x+y));
		System.exit(0);
	}

}
