package opensource.desafio;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		int numero = 0;
	
	try(Scanner input = new Scanner(System.in)) {
		
		System.out.println("Seja muito bem-vindo! Vamos fazer um contador.");
		
		System.out.printf("Insira o primeiro número: ");
		int parametro1 = input.nextInt();
		
		System.out.printf("Insira o segundo número: ");
		int parametro2 = input.nextInt();
		
		analisarNumeros(parametro1, parametro2);
		
		System.out.println("Os números digitados foram: " + parametro1 + " e " + parametro2 + ". Agora vamos contá-los:");
		
		for(int i = parametro1; i < parametro2; i++) {
			
			numero++;
			if (numero == 1) {
				System.out.println("O número é contado " + numero + " vez.");
			} else {
				System.out.println("O número é contado " + numero + " vezes.");
			}
			

		}
		
	} catch(ParametrosInvalidosException e) {
		System.err.println(e.getMessage());
	}
	
  }
	
	public static void analisarNumeros(int parametro1, int parametro2) throws ParametrosInvalidosException {
		
		if (parametro1 > parametro2) {
			throw new ParametrosInvalidosException("Opa! O número 2 precisa ser MAIOR que o número 1!");
		}
		
	}

}
