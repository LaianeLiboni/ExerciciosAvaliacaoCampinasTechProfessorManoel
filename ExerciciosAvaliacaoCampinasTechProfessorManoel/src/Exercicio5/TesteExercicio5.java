package Exercicio5;

import java.util.Scanner;

public class TesteExercicio5{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre na agenda: ");
		String nome = scanner.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		for (int i=0; i<3; i++){
        System.out.println("Entre com as informações do contato: " + (i+1));
        Contato contato = new Contato();
        
        System.out.println("Entre com o nome: ");
        nome = scanner.nextLine();
        contato.setNome(nome);

        System.out.println("Entre com o telefone: ");
        String telefone = scanner.nextLine();
        contato.setTelefone(telefone);

        System.out.println("Entre com o email: ");
        String email = scanner.nextLine();
        contato.setEmail(email);
        System.out.println("");

        contatos[i] = contato;
    }

		agenda.setContatos(contatos);

		if (agenda != null){
        System.out.println(agenda.obterInformacao());
        
        scanner.close();
    }

	}
}