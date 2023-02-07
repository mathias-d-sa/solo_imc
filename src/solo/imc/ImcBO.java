package solo.imc;

import javax.swing.JOptionPane;

public class ImcBO {

	private String nome;
	private double altura;
	private double peso;
	private double imc;
	
	public double calcularImc(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
		this.imc = getPeso() / (getAltura() * getAltura());
		return this.imc;
	}
		
	public String retornaImc () {
		if (this.imc < 18.5) {
			return "IMC: " + String.format("%.2f", getImc()) + "\nCuidado! Você está abaixo do peso ideal.";
		} else if (this.imc < 25) {
			return "IMC: " + String.format("%.2f", getImc()) + "\nParabéns! Você está no peso ideal.";
		} else if (this.imc < 30) {
			return "IMC: " + String.format("%.2f", getImc()) + "\nCuidado! Você está com excesso de peso.";
		} else if (this.imc < 35) {
			return "IMC: " + String.format("%.2f", getImc()) + "\nAtenção! Você está com obesidade";
		} else 
			return "IMC: " + String.format("%.2f", getImc()) + "\nAlerta! Você está com obesidade mórbida";
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	

}
