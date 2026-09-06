import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		for(int i = 0; i < matriz.length;i++){
			for(int j = 0; j < matriz[i].length;j++){
				System.out.println("Digite o valor da posicao [" + i + "][" + j + "]");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++){ 
			for (int j = 0; j < matriz[i].length; j++){ 
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < matriz.length; i++){ 
			int soma = 0;
			for (int j = 0; j < matriz[i].length; j++){ 
				int aux = matriz [i][j];
				soma = soma + aux;
			}
			System.out.print("Soma linha" + i + ":" + soma);
		}
		
		sc.close();
	}
}