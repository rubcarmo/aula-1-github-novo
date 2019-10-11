package application;

import java.util.Arrays;
import java.util.List;

import entities.Usuario;

public class UsuarioMain {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Rubens", 15, true);
		Usuario user2 = new Usuario("Valeria", 10, true);
		Usuario user3 = new Usuario("Viviane", 8, true);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for(Usuario x: usuarios) {
			System.out.println(x.getNome());
		}

	}

}
