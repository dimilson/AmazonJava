package relatorio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.demoAmazon.model.Produto;
import com.example.demoAmazon.relatorio.Relatorio;

import static org.junit.Assert.assertEquals;

public class RelatorioTest {
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutoEmOrdemCrescente() {
		
		Produto celular = new Produto("Moto G500", 250.0);
		Produto tv = new Produto("Samsung HD", 300.0);
		Produto dvd = new Produto("CCE DVD", 400.0);

		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);

		Relatorio relatorio = new Relatorio();
		relatorio.getRelatorioPreco(produtos);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;

		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());

		
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutoEmOrdemDecrescente() {
		
		
		Produto dvd = new Produto("CCE DVD", 400.0);
		Produto tv = new Produto("Samsung HD", 300.0);
		Produto celular = new Produto("Moto G500", 250.0);
		

		List<Produto> produtos = new ArrayList<>();
		produtos.add(dvd);
		produtos.add(tv);
		produtos.add(celular);
		

		Relatorio relatorio = new Relatorio();
		relatorio.getRelatorioPreco(produtos);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;

		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());

	}
	
	@Test
	public void deveMostrarEmOrdemAleatoriaOMaiorEMenorPrecoDosProdutos() {
		
		
		Produto tv = new Produto("Samsung HD", 300.0);
		Produto dvd = new Produto("CCE DVD", 400.0);
		Produto celular = new Produto("Moto G500", 250.0);
		

		List<Produto> produtos = new ArrayList<>();
		produtos.add(dvd);
		produtos.add(tv);
		produtos.add(celular);
		

		Relatorio relatorio = new Relatorio();
		relatorio.getRelatorioPreco(produtos);
		
		Double maiorPrecoEsperado  = 400.0;
		Double menorPrecoEsperado = 250.0;

		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());

	}
	
	
	@Test
	public void deveMostrarOMaiorEMenorPrecoComApenasUmProduto() {
		
		
		Produto tv = new Produto("Samsung HD", 300.0);
		
		

		List<Produto> produtos = new ArrayList<>();
		produtos.add(tv);		

		Relatorio relatorio = new Relatorio();
		relatorio.getRelatorioPreco(produtos);
		
		Double maiorPrecoEsperado  = 300.0;
		Double menorPrecoEsperado = 300.0;

		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());

	}
	

}
