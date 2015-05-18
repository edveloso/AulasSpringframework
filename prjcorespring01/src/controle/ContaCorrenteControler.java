package controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import modelo.ContaCorrente;
import modelo.ContaCorrenteDAO;


@Component
public class ContaCorrenteControler {
	
	@Autowired
	private ContaCorrenteDAO contaCorrenteDAO;
	
	public void salvar(ContaCorrente conta){
		contaCorrenteDAO.salvar(conta);
	}
	
	public List<ContaCorrente> listarTodasContas(){
		return contaCorrenteDAO.listar();
	}

	public ContaCorrenteDAO getContaCorrenteDAO() {
		return contaCorrenteDAO;
	}

	public void setContaCorrenteDAO(ContaCorrenteDAO contaCorrenteDAO) {
		this.contaCorrenteDAO = contaCorrenteDAO;
	}
	
	
	
	

}
