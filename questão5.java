package att18_11;
import java.util.Scanner;
public class questão5 {
	
	public static void main(String[]args) {
		
		int matriz [][] = new int [4][4];
		Scanner in = new Scanner (System.in);
		
		for (int l=0;l<4;l++) {
			for (int c=0;c<4;c++) {
				System.out.println("Digite o valor da posição linha "+l+" coluna "+c+" é: ");
				matriz[l][c] = in.nextInt();
			}
		}
		
		System.out.println("\nDiagonal principal\n");
		for (int c=0;c<4;c++) {
		System.out.println("O valor que está na matriz na posição e linha "+ c +" é: "+ matriz[c][c]);
	}
		
		System.out.println("\nTodos com exceção da diagonal principal\n");
		
		for (int l=0;l<4;l++) {
			for (int c=0;c<4;c++) {
				if (l!=c) {
					System.out.println("O valor da posição linha "+l+ " coluna " +c+ " é : "+matriz[l][c]);
				} else {}
			}
		}
	}

}
