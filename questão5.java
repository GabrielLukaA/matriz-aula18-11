package att18_11;
import java.util.Scanner;
public class quest�o5 {
	
	public static void main(String[]args) {
		
		int matriz [][] = new int [4][4];
		Scanner in = new Scanner (System.in);
		
		for (int l=0;l<4;l++) {
			for (int c=0;c<4;c++) {
				System.out.println("Digite o valor da posi��o linha "+l+" coluna "+c+" �: ");
				matriz[l][c] = in.nextInt();
			}
		}
		
		System.out.println("\nDiagonal principal\n");
		for (int c=0;c<4;c++) {
		System.out.println("O valor que est� na matriz na posi��o e linha "+ c +" �: "+ matriz[c][c]);
	}
		
		System.out.println("\nTodos com exce��o da diagonal principal\n");
		
		for (int l=0;l<4;l++) {
			for (int c=0;c<4;c++) {
				if (l!=c) {
					System.out.println("O valor da posi��o linha "+l+ " coluna " +c+ " � : "+matriz[l][c]);
				} else {}
			}
		}
	}

}
