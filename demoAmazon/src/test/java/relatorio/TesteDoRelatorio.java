package relatorio;

import java.util.ArrayList;
import java.util.List;

import com.example.demoAmazon.model.Produto;
import com.example.demoAmazon.relatorio.Relatorio;

public class TesteDoRelatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


		// imprimir 400.0
		System.out.println(maiorPrecoEsperado == relatorio.getMaiorPreco());
		// imprimir 250.0
		System.out.println(menorPrecoEsperado == relatorio.getMenorPreco());
	}

}
