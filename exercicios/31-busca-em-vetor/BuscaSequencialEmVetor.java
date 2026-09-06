public class BuscaSequencialEmVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9};
        int chave = 7;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Chave encontrada na posicao: " + i);
            }
        }
    }
}
