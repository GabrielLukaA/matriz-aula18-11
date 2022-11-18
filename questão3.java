package att18_11;
import java.util.Scanner;
public class questão3 {
public static void main(String[]args) {
	
	int matriz[][] = new int[4][4];
	int numero;
	
	Scanner in = new Scanner (System.in);
	
	for (int l=0;l<4;l++) {
		for (int c=0;c<4;c++) {
			System.out.println("Digite o valor da posição linha "+ l + " coluna "+ c +": ");
			numero=in.nextInt();
			if (numero<0) {
				numero=0;
				matriz[l][c]=numero;
			} else {
			matriz[l][c]=numero;
		}
		}
	}
	
	for (int l=0;l<4;l++) {
		for (int c=0;c<4;c++) {
			
			System.out.println("O valor da posição linha "+l+ " coluna " +c+ " é : "+matriz[l][c]);
		}
	}
}
}
