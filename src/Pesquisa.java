import javax.swing.JOptionPane;

public class Pesquisa {
	public static void main(String[] args) {
		int vet[] = new int[5];
		int i, acha, pesq;
		for (i = 0; i <= 4; i++) {
			vet[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Inserir o valor para a posi��o " + i + " do nosso vetor."));
		}
		pesq = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que voc� deseja buscar no vetor."));
		i = 0;
		acha = 0;
		while (i <= 4 && acha == 0) {
			if (pesq == vet[i]) {
				acha = 1;
			} else {
				i = i + 1;
			}
		}
		if (acha == 1) {
			JOptionPane.showMessageDialog(null,
					"O n�mero " + pesq + " foi localizado na posi��o " + i + " do nosso vetor.");
		} else {
			JOptionPane.showMessageDialog(null,
					"O n�mero " + pesq + " que voc� buscou n�o foi encontrado em nenhuma posi��o do vetor.");
		}
	}
}
