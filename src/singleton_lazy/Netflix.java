package singleton_lazy;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    private final List<String> filmes = new ArrayList<>();
    private static singleton_eager.Netflix NETFLIX;

    public void addFilme(String filme) {
        filmes.add(filme);
    }

    {
        filmes.add("Star wars");
        filmes.add("Avengers");
    }

    public List<String> getFilmes() {
        return filmes;
    }

    public static singleton_eager.Netflix getNetflix() {
        if (NETFLIX == null) {
            synchronized (Netflix.class) {
                if (NETFLIX == null) {
                    NETFLIX = new singleton_eager.Netflix();
                }
            }

        }
        return NETFLIX;
    }
}

