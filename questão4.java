package att18_11;
import java.util.Scanner;
public class questão4 {
	
	public static void main(String []args) {
	
	int matriz [][] = new int [6][6];
	int numero;
	boolean verificador=false;
	Scanner in = new Scanner (System.in);

	for (int l = 0;l<6;l++) {
		for (int c=0; c<6; c++) {
			System.out.println("Digite o valor da posição linha "+l+" coluna "+c+ " é: ");
			matriz[l][c] = in.nextInt();
		}	
		}
	System.out.println("Escreva um número que você queira localizar: ");
	numero=in.nextInt();
	
	for (int l=0; l<6;l++) {
		for (int c=0;c<6;c++) {
			if (matriz[l][c]==numero) {
				System.out.println("O número pode ser localizado na posição linha "+l+" coluna "+c+".");
				verificador=true;
			} else {}
		}
	}
	if (verificador==false) {
		System.out.println("Valor não pode ser encontrado.");
	}
	}

}
