package model;

public class Usuario {
	// Atributos
	private String nome;
	private String matricula;
	private String curso;

	@Override
	public String toString() {
		return " - Nome do Usuario: " + nome + "\n - matricula: " + matricula + "\n - curso: " + curso;
	}

	public Usuario(String nome, String matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
