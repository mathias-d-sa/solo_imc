package solo.imc;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImcBO pessoa = new ImcBO();
		
		double valorAltura, valorPeso;
		
		Object[] continuar = {"Repetir", "Sair"};
		Object desejaContinuar;
		
		do {
			pessoa.setNome(JOptionPane.showInputDialog("Olá. Bem-vindo(a) ao app de cálculo do IMC.\nPor favor, informe seu nome: "));
			
			valorAltura = Double.parseDouble(JOptionPane.showInputDialog(pessoa.getNome() + ", informe sua altura: "));
			pessoa.setAltura(valorAltura);
			
			valorPeso = Double.parseDouble(JOptionPane.showInputDialog(pessoa.getNome() + ", informe o seu peso: "));
			pessoa.setPeso(valorPeso);
			
			pessoa.calcularImc(valorAltura, valorPeso);
			JOptionPane.showMessageDialog(null, pessoa.retornaImc());
			
			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja repetir o cálculo?", "Continuar", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
			
		} while (desejaContinuar == "Repetir");
		
	}

}
