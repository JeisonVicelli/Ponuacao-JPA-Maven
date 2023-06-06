package controles;

import daos.DAO;
import modelos.Usuario;

public class ControleLogin {
	
	public static Usuario usuarioLogado;
	
	public static boolean isUsuaruioLogado() {
		return usuarioLogado != null;
		}
	public static void autenticar(String login, String senha) {
		DAO<Usuario> dao = new UsuarioDAO();
		String query = "from Usuario u where u.login = '" + login + "' and senha='" + senha + "'";
		usuarioLogado = dao.buscarPorQuery(query);

	}

}
