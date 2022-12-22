
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o numero de linhas");
			
			int n = scanner.nextInt();
			
			scanner.nextLine();
			
			String [] frasesImpressas;
			frasesImpressas = new String[n];
			String [] frasesNormais;
			frasesNormais = new String[n];
			
			for (int i =0; i<n; i++) {
				
				System.out.println("Digite a frase");		
				
				frasesImpressas[i] = scanner.nextLine(); 			

				while (frasesImpressas[i].length() <2 || frasesImpressas[i].length()>100) {
					System.out.println("Tamanho de frases invalido (deve ser entre 2 e 100 caracteres)");
					frasesImpressas[i] = scanner.nextLine();
				}
			}
			
			for (int i = 0; i<n; i++) {
				int metade = (int) frasesImpressas[i].length()/2;
				String fraseInvertidaMetadeInicial= new StringBuilder(frasesImpressas[i]).substring(0, metade);
				String fraseInvertidaMetadeFinal= new StringBuilder(frasesImpressas[i]).substring(metade);
				
				String fraseMetadeInicial = new StringBuilder(fraseInvertidaMetadeInicial).reverse().toString();
				String fraseMetadeFinal = new StringBuilder(fraseInvertidaMetadeFinal).reverse().toString();
				
				frasesNormais[i]= fraseMetadeInicial + fraseMetadeFinal;
				
				System.out.println(frasesNormais[i]);
			}
		
		} catch (InputMismatchException e) {
			System.out.println("Somente numeros inteiros são aceitos, programa encerrado!! :)");
			System.exit(0);

		}
	}

}