package Exercicio3;

import java.time.LocalDate;

public class Pessoa {
	
	private String nomePessoa;
	private Universidade universidade;
	private String dataAdmissao;
		
	public Pessoa(String nomePessoa, Universidade universidade, String dataAdmissao) {
		this.nomePessoa = nomePessoa;
		this.universidade = universidade;
		this.dataAdmissao = dataAdmissao;
	}
		
	private int calculaTempoAdmissao() {
		String[] dataCortada = dataAdmissao.split("/");
		int anoAdmissao = Integer.parseInt(dataCortada[2]);
		int anoAtual = LocalDate.now().getYear();
		int tempoDeCasa = anoAtual - anoAdmissao;
		return tempoDeCasa;
	}	
		
	public void mostrarDados(Pessoa pessoa) {
			System.out.println(("A pessoa ") + this.nomePessoa + (" trabalha na Universidade ") + this.universidade.getNomeUniversidade() +
					(" e já faz ")  + this.calculaTempoAdmissao() + (" anos que ela pertence a instituição."));	
	}

}
