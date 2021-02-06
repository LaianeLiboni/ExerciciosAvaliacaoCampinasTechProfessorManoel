package Exercicio4;

public class TesteExercicio4 {
	
	public static void main(String[] args) {
		
		Televisao samsung = new Televisao();
				
		ControleRemoto controle = new ControleRemoto(samsung);
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		
		System.out.println("Volume da tv samsung: "+ controle.getTelevisao().getVolume());
		System.out.println("Canal da tv samsung: "+ controle.getTelevisao().getCanal());
		
		
		controle.getTelevisao().diminuirVolume();
		controle.getTelevisao().diminuirVolume();
		controle.getTelevisao().diminuirCanal();
		
		System.out.println("O volume da TV samsung é: " +  controle.getTelevisao().getVolume());
		System.out.println("O canal da TV samsung é: " + controle.getTelevisao().getCanal());
		System.out.println("Volume da tv samsung: "+ controle.getTelevisao().getVolume());
		System.out.println("Canal da tv samsung: "+ controle.getTelevisao().getCanal());
	}
}