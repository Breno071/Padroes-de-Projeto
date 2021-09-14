package buider;

public class Pessoa {
    private String nome;
    private String sobremone;
    private String email;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobremone='" + sobremone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PessoaBuilder {
        private String nome;
        private String sobremone;
        private String email;

        public PessoaBuilder() {
        }

        public static PessoaBuilder aPessoa() {
            return new PessoaBuilder();
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobremone(String sobremone) {
            this.sobremone = sobremone;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            Pessoa pessoa = new Pessoa();
            pessoa.nome = this.nome;
            pessoa.sobremone = this.sobremone;
            pessoa.email = this.email;
            return pessoa;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSobremone() {
        return sobremone;
    }

    public String getEmail() {
        return email;
    }
}
