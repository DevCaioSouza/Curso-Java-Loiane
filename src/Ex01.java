import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x");
		int x = scan.nextInt();
		
		System.out.println("Entre com o valor de y");
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println("O numero ligado a x e maior");
		} else if (y > x) {
			System.out.println("O numero ligado a y e maior");
		}
	}

}