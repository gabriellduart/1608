package atividades;

public class atividade2 {

	public static void main(String[] args) {
		Pessoa pessoal = new Pessoa ();
		Pessoa pessoa2 = new Pessoa();
		//OBJETO 1
		pessoal.setNome ("Tom Cruise");
		pessoal.setIdade (60); pessoal.setEndereco ("California, USA"); pessoal.setProfissao ("Ator");
		//OBJETO 2
		pessoa2.setNome ("Messi");
		pessoa2.setIdade (35);
		pessoa2.setEndereco ("Miami, USA");
		pessoa2.setProfissao ("Jogador de Futebol");
		// Chamando o método get () para apresentar os objetos
		System.out.println(" OBJETO 1"); System.out.println(pessoal.getNome()); System.out.println(pessoal.getIdade ());
		System.out.println(pessoal.getEndereco());
		System.out.println(pessoal.getProfissao());
		System.out.println(" OBJETO 2-----");
		System.out.println(pessoa2.getNome()); System.out.println(pessoa2.getIdade ()); System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());

	}

}
