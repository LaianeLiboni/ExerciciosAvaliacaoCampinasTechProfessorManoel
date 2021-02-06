package Exercicio2;

import java.util.ArrayList;

public class Continente {

	private String nome;
	private ArrayList<Pais> paises;
	private double densidadePopulacional;
	private int maiorPopulacao;
	private int menorPopulacao;
	private Pais pais;
	
	public int getMaiorPopulacao() {
		return maiorPopulacao;
	}

	public void setMaiorPopulacao(int maiorPopulacao) {
		this.maiorPopulacao = maiorPopulacao;
	}

	public double getDensidadePopulacional() {
		return densidadePopulacional;
	}

	public void setDensidadePopulacional(double densidadePopulacional) {
		this.densidadePopulacional = densidadePopulacional;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getMenorPopulacao() {
		return menorPopulacao;
	}

	public void setMenorPopulacao(int menorPopulacao) {
		this.menorPopulacao = menorPopulacao;
	}



	public Continente(String nome) {
		this.nome = nome;
		this.paises = new ArrayList<>();
		System.out.println("Construindo o Continente: " + this.nome);
	}

	public void adiconaPais(Pais pais) {
		paises.add(pais);
		System.out.println(paises);
	}

	public double dimensaoTotal() {

		double totalDimensao = 0.00;

		for (Pais pais : paises) {
			totalDimensao = totalDimensao + pais.getDimensao();
		}

		return totalDimensao;
	}

	public double populacaoTotal() {

		double totalPopulacao = 0.00;

		for (Pais pais : paises) {
			totalPopulacao = totalPopulacao + pais.getPopulacao();
		}

		return totalPopulacao;
	}

	public double densidadeTotal() {

		double totalDensidade = 0.00;

		for (Pais pais : paises) {
			totalDensidade = totalDensidade + pais.getCalculaDensidadePopulacional();
		}

		return totalDensidade;
	}
   
	public String maiorDimensao() {
		String paisMaior = " ";
		double maiorDimensao = 0.00;
		
		for (Pais paises : this.paises) {
			if (paises.getDimensao() > maiorDimensao) {
				maiorDimensao = paises.getDimensao();
				paisMaior = paises.getNome();
			}
		}
		return paisMaior;
	}
	
	public String menorDimensao() {
		String paisMenor = " ";
		double menorDimensao = 999999999999999.99;
		
		for (Pais paises : this.paises) {
			if (paises.getDimensao() < menorDimensao) {
				menorDimensao = paises.getDimensao();
				paisMenor = paises.getNome();
			}
		}
		return paisMenor;
	}
	
	public String maiorPopulacao() {
		String paisMaiorPopulacao = " ";
		double maiorPopulacao = 0.00;
		
		for (Pais paises : this.paises) {
			if (paises.getPopulacao() > maiorPopulacao) {
				maiorPopulacao = paises.getDimensao();
				paisMaiorPopulacao = paises.getNome();
			}
		}
		return paisMaiorPopulacao;
	}
	
	public String menorPopulacao() {
		String paisMenorPopulacao = " ";
		double menorPopulacao = 999999999999999.99;
		
		for (Pais paises : this.paises) {
			
			if (paises.getPopulacao() < menorPopulacao) {
				menorPopulacao = paises.getPopulacao();
				paisMenorPopulacao = paises.getNome();
			}
		}
		return paisMenorPopulacao;
	}
	
	public double razaoTerritorial () {
		
		double maiorDimensao = 0.00;
		
		for (Pais paises : this.paises) {
			
			if (paises.getDimensao() > maiorDimensao) {
				maiorDimensao = paises.getDimensao();
			}
			
		}
		
		double menorDimensao = 999999999999999.99;
		
		for (Pais paises : this.paises) {
			
			if (paises.getDimensao() < menorDimensao) {
				menorDimensao = paises.getPopulacao();
			}
			
		}
		
		double razaoTerritorial = maiorDimensao / menorDimensao;
		
		return razaoTerritorial;
		
	}

}
	