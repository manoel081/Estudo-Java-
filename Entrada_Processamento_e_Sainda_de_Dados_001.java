import java.util.Scanner;

public class MedidadoTerreno {
	public static void main(String[] ags) {

		System.out.println("Exercício 001: Área do terreno ");
		System.out.println();

		System.out.println(
				"Faça um programa que leia as medidas da largura e o comprimento  de um terreno retangular com uma casa\n"
						+ "decimal, bem como o valor do metro quadrado do terreno com duas casa decimais. Em seguida, o programa\ndeve mostrar"
						+ "o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas\ndecimais, conforme exemplo. ");
		System.out.println();
		System.out.println("Exemplo:");
		System.out.println();
		System.out.println(
				"Entrada:     Saída:   \n10.0         AREA  = 300.00   \n30.0         PRECO = 60000.00\n200.00");
		System.out.println();
		double largura, comprimento, valor, area, preco;

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a largura do terreno:");
		largura = sc.nextDouble();
		System.out.println();
		System.out.print("Informe a comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.println();
		System.out.print("Informe o valor da área do terreno: R$");
		valor = sc.nextDouble();
		System.out.println();

		area = largura * comprimento;
		preco = area * valor;

		System.out.printf("A AREA  do terreno é:%.2fm²", area);
		System.out.println();
		System.out.printf("O PREÇO do terreno é:R$%.2f", preco);

		sc.close();
	}

}
