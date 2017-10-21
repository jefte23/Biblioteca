package main;

import Control.ControleExibeEmprestimo;
import Control.ControlePesquisaUsuario;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// criar objetos da classe ControleExibirEmprestimo
		ControleExibeEmprestimo cee = new ControleExibeEmprestimo();

		ControlePesquisaUsuario cpu = new ControlePesquisaUsuario("RA123451");
	}

}
