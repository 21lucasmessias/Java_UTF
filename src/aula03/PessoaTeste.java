package aula03;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.idade = 24;
		pessoa1.nome = "Lucas";
		pessoa1.peso = 65;
		
		pessoa1.correr();
		
		System.out.println(pessoa1);
	}
}
