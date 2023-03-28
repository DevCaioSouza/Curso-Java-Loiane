import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite M para cliente do sexo masculino e F para feminino"); 
		String sex = scan.nextLine();
		
//		System.out.println(sex);
		
		switch(sex) {
		case "m": System.out.println("Sexo Masculino"); break;
		case "f": System.out.println("Sexo feminino"); break;
		default: System.out.println("Escolha uma opcao valida - M ou F");
		}
		
	}

}
