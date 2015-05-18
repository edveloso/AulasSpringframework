package modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ContaCorrenteDAO {

	@Autowired
	private Sessao sessao;
	
	public void salvar(ContaCorrente conta){
		sessao.salvar(conta);
	}
	
	public void atualizar(ContaCorrente conta){
		sessao.atualizar(conta);
	}
	
	public void deletar(ContaCorrente conta){
		sessao.deletar(conta);
	}
	
	
	public List<ContaCorrente> listar(){
		return sessao.listarTodos();
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	
	
}







