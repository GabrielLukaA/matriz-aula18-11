package att18_11;

import java.util.Scanner;

public class questão1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.println("Informe quantas linhas terão as matrizes A e B: ");
		a = in.nextInt();
		System.out.println("Informe quantas colunas terão as matrizes A e B");
		b = in.nextInt();

		int matrizA[][] = new int[a][b];
		int matrizB[][] = new int[a][b];
		int matrizSom[][] = new int[a][b];
		int matrizSub[][] = new int[a][b];
		int matrizMul[][] = new int[a][b];

		System.out.println("\nMatriz A\n");

		for (int l = 0; l < a; l++) {
			for (int c = 0; c < b; c++) {
				System.out.println("Digite o valor da posição linha : " + l + " coluna: " + c);
				matrizA[l][c] = in.nextInt();
			}
		}

		System.out.println("\nMatriz B\n");

		for (int l = 0; l < a; l++) {
			for (int c = 0; c < b; c++) {
				System.out.println("Digite o valor da posição linha : " + l + " coluna: " + c);
				matrizB[l][c] = in.nextInt();
			}
		}

		for (int opcao=1; opcao != 0;opcao=opcao) {
		System.out.println("\nO que você deseja fazer?\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n0 - Sair");
		opcao = in.nextInt();

		switch (opcao) {
		case 1:
			for (int l = 0; l < a; l++) {
				for (int c = 0; c < b; c++) {
					matrizSom[l][c] = matrizA[l][c] + matrizB[l][c];
				}
			}

			for (int l = 0; l < a; l++) {

				for (int c = 0; c < b; c++) {

					System.out.println("O valor da posição coluna : " + c + " linha: " + l + " é : " + matrizSom[l][c]);

				}
			}

			break;

		case 2:
			for (int l = 0; l < a; l++) {
				for (int c = 0; c < b; c++) {
					matrizSub[l][c] = matrizA[l][c] - matrizB[l][c];
				}
			}

			for (int l = 0; l < a; l++) {

				for (int c = 0; c < b; c++) {

					System.out.println("O valor da posição coluna : " + c + " linha: " + l + " é : " + matrizSub[l][c]);

				}
			}

			break;

		case 3:
			for (int l = 0; l < a; l++) {
				for (int c = 0; c < b; c++) {
					matrizMul[l][c] = matrizA[l][c] * matrizB[l][c];
				}
			}

			for (int l = 0; l < a; l++) {

				for (int c = 0; c < b; c++) {

					System.out.println("O valor da posição coluna : " + c + " linha: " + l + " é : " + matrizMul[l][c]);

				}
			}
			break;

		case 0:
			System.out.println("Programa encerrado.");
			break;
		}
		}
	}

}
