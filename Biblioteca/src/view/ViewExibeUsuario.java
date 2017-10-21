package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibeUsuario {

	public ViewExibeUsuario(Usuario usuario) {

		System.out.println("--------------");
		System.out.println(usuario);

		JOptionPane.showMessageDialog(null, usuario);
	}

}
