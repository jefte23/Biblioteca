package Control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibeEmprestimo;
import view.ViewExibeEmprestimosString;

public class ControleExibeEmprestimo {

	@SuppressWarnings("unused")
	public ControleExibeEmprestimo() {
		// Criando BD Simulado
		BDSimulado bds = new BDSimulado();

		// Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = bds.getEmprestimos();

		// Exibir dodos os emprestimos
		ViewExibeEmprestimo vee = new ViewExibeEmprestimo(emprestimos);

		// Exibe todos os emprestimos usando outra classe
		String s = "";
		for (int i = 0; i < emprestimos.size(); i++) {
			s = s + "--------------------\n" + emprestimos.get(i);
		}

		ViewExibeEmprestimosString vees = new ViewExibeEmprestimosString(s);

	}

}
