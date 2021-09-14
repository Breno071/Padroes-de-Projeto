package singleton_eager;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    private final List<String> filmes = new ArrayList<>();
    private static final Netflix NETFLIX = new Netflix();

    public  void addFilme(String filme){
        filmes.add(filme);
    }

    {
        filmes.add("Star wars");
        filmes.add("Avengers");
    }

    public List<String> getFilmes() {
        return filmes;
    }

    public static Netflix getNetflix(){
        return NETFLIX;
    }
}
