public class Principal {
    public static void main(String[] args) {
        System.out.println();

        //No Yahoo Finance, as empresas brasileiras terminam com ".sa"
//        cotacaoUsandoYahooFinance("MGLU3.SA"); //MGLU3 = Magazine Luiza
//        cotacaoUsandoAlphaVantage("INTL"); //INTL = Intel
//        cotacaoUsandoQuandl("WIKI/AAPL"); //AAPL = Apple

        System.out.println("MagaLu: "+ new YahooAdapter().getCotacao("MGLU3.SA"));
        System.out.println("Intel: "+  new QuandlAdapter().getCotacao("WIKI/AAPL"));
        System.out.println("Apple: "+  new AlphaVantageAdapter().getCotacao("INTL"));
    }
}
