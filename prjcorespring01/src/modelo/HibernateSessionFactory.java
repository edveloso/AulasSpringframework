package modelo;

public class HibernateSessionFactory {
	
	public Sessao openSession(){
		return new Sessao();
	}

}
