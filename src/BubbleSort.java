import javax.swing.JOptionPane;
public class BubbleSort {
	public static void main(String[]args){
		int vet[] = new int[5];
		int i, j, aux;
		for (i = 0; i <= 4; i++){
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserir o valor para a posição " + i));	
		}
		for (i = 0; i <= 3; i++){
			for (j = i + 1; j <= 4; j++){
				if (vet[i] > vet[j]){
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		for (i = 0; i <= 4; i++){
			JOptionPane.showMessageDialog(null, "O elemento da posição " + i + " do vetor ordenado é " + vet[i]);
		}
	}
}
