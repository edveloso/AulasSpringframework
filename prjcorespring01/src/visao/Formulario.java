package visao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.ContaCorrente;
import controle.ContaCorrenteControler;

public class Formulario {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setAgencia("2342");
		conta.setNomeCorrentista("Charlana");
		conta.setNumeroConta(234456567);
		
		
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
	ContaCorrenteControler ctr = ctx.getBean(ContaCorrenteControler.class); 
	ctr.salvar(conta);
	
	ctr.listarTodasContas();
	
		
		
	}
	
}







