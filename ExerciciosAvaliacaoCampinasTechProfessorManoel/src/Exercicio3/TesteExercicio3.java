package Exercicio3;

public class TesteExercicio3 {
	
	public static void main(String[] args) {
		
		Universidade universidade = new Universidade("Federal da Paraíba , ");
		
		Pessoa laiane = new Pessoa("Laiane", universidade, "18/01/2010");
		
		laiane.mostrarDados(laiane);
	}
}
