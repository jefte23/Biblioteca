package Control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimo {

	public ControleExibeEmprestimo() {
		// Criando BD Simulado
		BDSimulado bds = new BDSimulado();

		// Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = bds.geEmprestimos();

		// Exibir dodos os emprestimos

	}

}
