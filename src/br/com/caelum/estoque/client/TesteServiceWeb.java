package br.com.caelum.estoque.client;

public class TesteServiceWeb {
	
	public static void main(String[] args) {
		
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSImplPort();
		
		
		Filtro filtro = new Filtro();
		filtro.setNome("Iphone");
		filtro.setTipo(TipoItem.LIVRO.toString());
		
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);
		
		ListaItens itens = cliente.todosOsItens(filtros);
		
		System.out.println(itens);
	}
}
