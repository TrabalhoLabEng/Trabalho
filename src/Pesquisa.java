import javax.swing.JOptionPane;

public class Pesquisa {
	public static void main(String[] args) {
		int vet[] = new int[5];
		int i, acha, pesq;
		for (i = 0; i <= 4; i++) {
			vet[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Inserir o valor para a posição " + i + " do nosso vetor."));
		}
		pesq = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que você deseja buscar no vetor."));
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
					"O número " + pesq + " foi localizado na posição " + i + " do nosso vetor.");
		} else {
			JOptionPane.showMessageDialog(null,
					"O número " + pesq + " que você buscou não foi encontrado em nenhuma posição do vetor.");
		}
	}
}
