package factory;

public class MoedaFactoryTest01 {
    public static void main(String[] args) {
        Moeda moedaBR = MoedaFactory.novaMoeda(Paises.BRAZIL);
        System.out.println(moedaBR.getSymbol());

        Moeda moedaUS = MoedaFactory.novaMoeda(Paises.UNITED_STATES);
        System.out.println(moedaUS.getSymbol());

    }
}
