
import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out
					.println("Digite o valor a ser decomposto (numero entre 0 e 1000000.00)");

			double valor = scanner.nextDouble();
			

			while (valor < 0 || valor > 1000000 ) {
				System.out.println("Digite um valor valido");
				valor = scanner.nextDouble();
			}

			int notas100=0;
			int notas50=0;
			int notas20=0;
			int notas10=0;
			int notas5=0;
			int notas2=0;
			int moedas1=0;
			int moedas050=0;
			int moedas025=0;
			int moedas010=0;
			int moedas005=0;
			int moedas001=0;
			
			while (valor>=100) {
				notas100++;
				valor=(Double) (valor-100);

			}
			while (valor>=50) {
				notas50++;
				valor=(Double) (valor-50.00);
			}
			while (valor>=20) {
				notas20++;
				valor=(Double) (valor-20.00);
			}
			while (valor>=10.00) {
				notas10++;
				valor=(Double) (valor-10.00);
			}
			while (valor>=5) {
				notas5++;
				valor=(Double) (valor-5.00);
			}
			while (valor>=2) {
				notas2++;
				valor=(Double) (valor-2.00);
			}
			
			while (valor>=1) {
				moedas1++;
				valor=(Double) (valor-1.00);
			}
			while (valor>=0.50) {
				moedas050++;
				valor=(Double) (valor-0.50);
			}
			while (valor>=0.25) {
				moedas025++;
				valor=(Double) (valor-0.25);
			}
			while (valor>=0.10) {
				moedas010++;
				valor=(Double) (valor-0.10);
			}
			while (valor>=0.05) {
				moedas005++;
				valor=(Double) (valor-0.05);
			}
			while (valor>=0.010000000) {
				moedas001++;
				valor=(Double) (valor-0.01);
			}
			
			System.out.println("Notas");
			System.out.println(notas100 + " Nota(s) de R$100.00");
			System.out.println(notas50 + " Nota(s) de R$50.00");
			System.out.println(notas20 + " Nota(s) de R$20.00");
			System.out.println(notas10 + " Nota(s) de R$10.00");
			System.out.println(notas5 + " Nota(s) de R$5.00");
			System.out.println(notas2 + " Nota(s) de R$2.00");
			System.out.println("Moedas");
			System.out.println(moedas1 + " Moeda(s) de R$1.00");
			System.out.println(moedas050 + " Moeda(s) de R$0.50");
			System.out.println(moedas025 + " Moeda(s) de R$0.25");
			System.out.println(moedas010 + " Moeda(s) de R$0.10");
			System.out.println(moedas005 + " Moeda(s) de R$0.05");
			System.out.println(moedas001 + " Moeda(s) de R$0.01");
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros são aceitos, programa encerrado!! :)");
			System.exit(0);

		}
	}

}