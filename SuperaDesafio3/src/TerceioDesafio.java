
import java.util.InputMismatchException;
import java.util.Scanner;

public class TerceioDesafio {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do conjunto");
			
			int n = scanner.nextInt();
			
			int paresAlvos = 0;
			
			System.out.println("Digite o numero alvo");
			
			int k = scanner.nextInt();
			
			int[] numeros = new int[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("digite numeros inteiros a lista");
				numeros[i] = scanner.nextInt();
			}
			
			for (int i=0; i<n; i++) {
				
				for (int j= 0; j<n; j++) {
					if (i!=j && (numeros[i]-numeros[j] == k))  {
						paresAlvos++;
					}
				}
			}
		
			System.out.println("O numero de pares alvos é :" + paresAlvos);
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros inteiros são aceitos, programa encerrado!! :)");
			System.exit(0);

		}
	}

}