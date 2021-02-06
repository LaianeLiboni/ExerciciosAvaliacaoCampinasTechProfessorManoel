package Exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Pais {

	private String codigoISO; 
	private String nome; 
	private double populacao; 
	private double dimensaokm2; 
	private Set<Pais> limitrofes = new HashSet<Pais>();
		
	public Pais(String codigoISO, String nome, double populacao, double dimensaokm2) {
		super();
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensaokm2 = dimensaokm2;
	}
	

	public String getCodigoISO() {
		return codigoISO;
	}
	
	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getPopulacao() {
		return populacao;
	}


	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}


	public double getDimensaokm2() {
		return dimensaokm2;
	}


	public void setDimensaokm2(double dimensaokm2) {
		this.dimensaokm2 = dimensaokm2;
	}
	
	public Set<Pais> getLimitrofes() {
		return limitrofes;
	}


	public void setLimitrofes(Set<Pais> limitrofes) {
		this.limitrofes = limitrofes;
	}

	public boolean ComparaPais(Pais pais) {
		if (this.codigoISO == pais.getCodigoISO()) {
			return true;
		} else {
			return false;
		}

	}
	
	public double CalculaDensidadePopulacional() {
		return this.populacao/this.dimensaokm2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoISO == null) ? 0 : codigoISO.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (codigoISO == null) {
			if (other.codigoISO != null)
				return false;
		} else if (!codigoISO.equals(other.codigoISO))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pais [codigoISO=" + codigoISO + ", nome=" + nome + "]";
	}


	public Boolean verificaSeOhPaisFazFronteira(Pais pais) {
		return this.limitrofes.contains(pais);
	}
	
	public Double getDensidadeDoPais() {
		return this.getPopulacao()/ this.getDimensaokm2();
	}
	
	
	
	public Set<Pais>getPaisesLimitrofesEmComum(Pais pais) {	
		Set<Pais>paisesLimitrofes() = new HashSet<Pais>(this.getLimitrofes());
		paisesLimitrofes.retainAll(pais.getLimitrofes());
		return getLimitrofes();
	}
	
	public void adicionaPaisLimitrofe(Pais pais) {
		this.getLimitrofes().add(pais);
	}
}

	
	