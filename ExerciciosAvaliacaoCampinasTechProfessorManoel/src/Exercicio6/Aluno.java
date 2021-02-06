package Exercicio6;

public class Aluno extends Curso {
	
	private String nome;
	private String matricula;
	private double[] notas;
	
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getMatricula() {
        return matricula;
    }

   
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   
    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInformacao(){

        String informacao = "Nome Aluno = " + nome + "; ";
        informacao += "Matricula = " + matricula + "; ";
        informacao += "Notas: ";

        double soma = 0;
        for (double nota : notas){
            soma += nota;
            informacao += nota + " ";
        }
        double media = soma/4;
        informacao += "\n" + "Média = " + media + " - ";
        if (media >= 7){
            informacao += "Aprovado!";
        } else {
            informacao += "Reprovado!";
        }

        return informacao;        
    }

    public double obterMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma/4;
    }
}