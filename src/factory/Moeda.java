package factory;

public interface Moeda {
    String getSymbol();

    class Real implements Moeda {

        @Override
        public String getSymbol() {
            return "R$";
        }
    }

    class Dolar implements Moeda{

        @Override
        public String getSymbol() {
            return "$";
        }
    }


}
