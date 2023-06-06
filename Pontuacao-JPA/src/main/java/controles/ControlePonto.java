package controles;

import daos.DAO;

public class ControlePonto {
	
	private static ControlePonto instance;
	
	private DAO<Ponto> dao = new PontoDAO();
	
	private ControlePonto () {}
	
	public static synchronized ControlePonto getInstance() {
		if(instance == null) {
			instance = new ControlePonto();
		}
		return instance;
	}
	
	

}
