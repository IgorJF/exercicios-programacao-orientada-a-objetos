public class Main{
	public static void main(String args[]){
		int[] vetor = new int[5];
		vetor[0] = 1;
		vetor[1] = 3;
		vetor[2] = 5;
		vetor[3] = 7;
		vetor[4] = 9;
		int chave = 7;
		
		for(int i = 0;i < vetor.length;i++){
			if(vetor[i] == chave){
				System.out.println("Chave encontrada na posicao: " + i);
			}
		}
		
	}
}