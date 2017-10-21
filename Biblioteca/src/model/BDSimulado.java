package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {

	// Atributos
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> emprestimo = new ArrayList<Emprestimo>();

	public BDSimulado() {

		// Criando livros
		Livro l1 = new Livro("Livro 1", "Autor 1", "Editora A", "2012", "123");
		Livro l2 = new Livro("Livro 2", "Autor 2", "Editora A", "2016", "456");
		Livro l3 = new Livro("Livro 3", "Autor 2", "Editora B", "2017", "789");

		// Adicionando livros
		this.livros.add(l1);
		this.livros.add(l2);
		this.livros.add(l3);

		// Criando Usuarios
		Usuario u1 = new Usuario("Jefte", "RA123451", "Ciencia da Computação");
		Usuario u2 = new Usuario("Larine", "RA213251", "Quimica");

		// Adiciona livros
		this.usuarios.add(u1);
		this.usuarios.add(u2);

		// Criando Bibliotecario
		Bibliotecario b1 = new Bibliotecario("Marcio", "987546");
		Bibliotecario b2 = new Bibliotecario("José", "123456");

		// Adiciona Bibliotecario
		this.bibliotecarios.add(b1);
		this.bibliotecarios.add(b2);

		// Criando Emprestimnos
		Emprestimo e1 = new Emprestimo(l1, u1, b1, LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 15));
		Emprestimo e2 = new Emprestimo(l2, u2, b2, LocalDate.of(2017, 10, 12), LocalDate.of(2017, 10, 17));

		// Adicionando Emprestimo
		this.emprestimo.add(e1);
		this.emprestimo.add(e2);
	}

	// Metodo para recuperar o arraylist de emprestimos
	public ArrayList<Emprestimo> getEmprestimos() {
		return this.emprestimo;
	}

	// Metodo que retorna usuario de acordo com a matricula
	public Usuario getUsuarioPorMatricula(String matricula) {
		Usuario retorno = null;

		// percorrer a lista de usuarios
		for (int i = 0; i < this.usuarios.size(); i++) {
			if (this.usuarios.get(i).getMatricula().equals(matricula)) {
				retorno = this.usuarios.get(i);
			}
		}
		return retorno;
	}

}
