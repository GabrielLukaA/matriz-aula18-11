package att18_11;
import java.util.Scanner;
public class quest�o2 {
	public static void main(String[]args) {
		
		int matriz[][] = new int[5][5];
		Scanner in = new Scanner (System.in);
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("Digite o valor da posi��o linha : " + l + " coluna: " + c);
				matriz[l][c] = in.nextInt();
			}
		}
		for (int c=0;c<5;c++) {
		System.out.println("O valor que est� na matriz na posi��o e linha "+ c +" �: "+ matriz[c][c]);
	}
	}

}
