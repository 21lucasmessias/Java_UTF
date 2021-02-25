package aula03;

public class Carro {
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	
	public void ligar() {
		System.out.println("Ligando");
	}
	
	public void desligar() {
		System.out.println("Desligando");
	}
	
	public void aceler() {
		System.out.println("Acelerando");
	}
	
	public void frear() {
		System.out.println("Freando");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}