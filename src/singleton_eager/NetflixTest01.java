package singleton_eager;

public class NetflixTest01 {
    public static void main(String[] args) {

        Netflix.getNetflix().addFilme("Batman");
        System.out.println(Netflix.getNetflix().getFilmes());

        Netflix netflix = Netflix.getNetflix();

        //Podemos ver pelo endereço de memória que o objeto criado é o mesmo existente na classe Netflix
        System.out.println(netflix);
        System.out.println(Netflix.getNetflix());

    }
}
