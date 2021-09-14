package factory;

public class MoedaFactory {

    public static Moeda novaMoeda(Paises pais) {
        switch (pais) {
            case BRAZIL:
                return new Moeda.Real();
            case UNITED_STATES:
                return new Moeda.Dolar();
            default:
                throw new IllegalStateException();
        }


    }
}
