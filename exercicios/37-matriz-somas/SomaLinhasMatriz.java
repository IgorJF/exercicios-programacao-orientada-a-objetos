import java.util.Scanner;

public class SomaLinhasMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da posicao [" + i + "][" + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + " ");
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int valor : matriz[i]) soma += valor;
            System.out.print("Soma linha" + i + ":" + soma);
        }
        scanner.close();
    }
}
