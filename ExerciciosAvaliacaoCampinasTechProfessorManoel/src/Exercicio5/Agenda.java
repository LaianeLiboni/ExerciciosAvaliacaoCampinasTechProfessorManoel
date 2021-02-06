package Exercicio5;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInformacao(){
        String informacao = "Nome = " + nome + "\n";

        if (contatos != null){
            for (Contato contato : contatos){
                informacao += contato.obterInformacao() + "\n";
            }
        }

        return informacao;
    }
}