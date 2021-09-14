package buider;

public class PessoaBuiderTest01 {
    public static void main(String[] args) {
        Pessoa breno = new Pessoa.PessoaBuilder()
                .nome("Breno")
                .sobremone("Narde")
                .email("breno@gamail")
                .build();

        System.out.println(breno);
    }
}
