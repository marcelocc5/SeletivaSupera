
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out
					.println("Digite a quantidade de numeros que deseja organizar (numero inteiro entre 2 e 100.000)");

			int quantidadeDeNumeros = scanner.nextInt();

			while (quantidadeDeNumeros <= 1 || quantidadeDeNumeros > 100000) {
				System.out.println("Digite um valor valido");
				quantidadeDeNumeros = scanner.nextInt();
			}

			LinkedList<Integer> pares = new LinkedList<Integer>();
			LinkedList<Integer> impares = new LinkedList<Integer>();
			for (int cont = 0; cont < quantidadeDeNumeros; cont++) {

				System.out.println("Digite um valor para ser ordenado");
				int valorDeEntrada = scanner.nextInt();

				if (valorDeEntrada % 2 == 0) {
					pares.add(valorDeEntrada);
				} else {
					impares.add(valorDeEntrada);
				}

			}

			pares.sort((c1, c2) -> Integer.compare(c1, c2));
			for (int i= 0; i<pares.size(); i++) {
				System.out.println(pares.get(i));
			}
			impares.sort((c1, c2) -> Integer.compare(c2, c1));
			for (int i= 0; i<pares.size(); i++) {
				System.out.println(impares.get(i));
			}
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros inteiros são aceitos, programa encerrado!! :)");
			System.exit(0);

		}
	}

}