package att18_11;
import java.util.Scanner;
public class quest�o4 {
	
	public static void main(String []args) {
	
	int matriz [][] = new int [6][6];
	int numero;
	boolean verificador=false;
	Scanner in = new Scanner (System.in);

	for (int l = 0;l<6;l++) {
		for (int c=0; c<6; c++) {
			System.out.println("Digite o valor da posi��o linha "+l+" coluna "+c+ " �: ");
			matriz[l][c] = in.nextInt();
		}	
		}
	System.out.println("Escreva um n�mero que voc� queira localizar: ");
	numero=in.nextInt();
	
	for (int l=0; l<6;l++) {
		for (int c=0;c<6;c++) {
			if (matriz[l][c]==numero) {
				System.out.println("O n�mero pode ser localizado na posi��o linha "+l+" coluna "+c+".");
				verificador=true;
			} else {}
		}
	}
	if (verificador==false) {
		System.out.println("Valor n�o pode ser encontrado.");
	}
	}

}
