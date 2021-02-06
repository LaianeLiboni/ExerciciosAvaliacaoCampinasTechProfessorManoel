package Exercicio2;

public class TestaContinente {

	public static void main(String[] args) {
	
	Continente africano = new Continente("África");
	Pais egito = new Pais("EGY", "Egito", 98_420_000.0, 1_010_000.0);
	Pais sudao = new Pais("SDN", "Sudao", 41_000_000.0, 1_886_000.0);
	Pais chade = new Pais("TCD", "Chade", 14_152_314.0, 1_284_000.0);
	Pais nigeria = new Pais("NGA", "Nigeria", 206_000_000.0, 923_000.0);
	
	africano.adiconaPais(egito);
	africano.adiconaPais(sudao);
	africano.adiconaPais(chade);
	africano.adiconaPais(nigeria);
	
	System.out.println("\n Dimensão total: " +africano.dimensaoTotal());
	
	System.out.println("\n População total: " + africano.populacaoTotal());
	
	System.out.println("\n Densidade populacional do continente: " + africano.densidadeTotal());

	System.out.println("\n Pais com maior dimensao: " +africano.maiorDimensao());

	System.out.println("\n Pais com menor dimensao: " +africano.menorDimensao());
	
	System.out.println("\n Pais com maior populacao: " +africano.maiorPopulacao());
	
	System.out.println("\n Pais com menor populacao: " +africano.menorPopulacao());
	
	System.out.println("\n Razao territorial: " +africano.razaoTerritorial());
	
	}

}
	
