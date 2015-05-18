package modelo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Sessao {
	
	public void salvar(Object o){
		System.out.println("Objeto salvo com sucesso "+ o);
	}
	
	public void atualizar(Object o){
		System.out.println("Objeto atualizado com sucesso "+ o);
	}
	
	public void deletar(Object o){
		System.out.println("Objeto deletado com sucesso "+ o);
	}
	
	
	public List listarTodos(){
		System.out.println("os dados foram retornados");
		return new ArrayList();
	}
	
	
	
	
		

}
