package att18_11;
import java.util.Scanner;
public class questão2 {
	public static void main(String[]args) {
		
		int matriz[][] = new int[5][5];
		Scanner in = new Scanner (System.in);
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("Digite o valor da posição linha : " + l + " coluna: " + c);
				matriz[l][c] = in.nextInt();
			}
		}
		for (int c=0;c<5;c++) {
		System.out.println("O valor que está na matriz na posição e linha "+ c +" é: "+ matriz[c][c]);
	}
	}

}
