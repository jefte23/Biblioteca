package view;

import java.util.ArrayList;

import model.Emprestimo;

public class ViewExibeEmprestimo {

	public ViewExibeEmprestimo(ArrayList<Emprestimo> emprestimos) {

		// Exibir todos os emprestimos
		for (int i = 0; i < emprestimos.size(); i++) {
			// imprimir no console
			System.out.println("--------------");
			System.out.println("Titulo: " + emprestimos.get(i).getLivro().getTitulo());
			System.out.println("Autor: " + emprestimos.get(i).getLivro().getAutor());
			System.out.println("Usuário: " + emprestimos.get(i).getUsuario().getNome());
			System.out.println("Data de retirada: " + emprestimos.get(i).getDataRetirada());
			System.out.println("Data de devolução: " + emprestimos.get(i).getDataDevolucao());
		}
	}
}
