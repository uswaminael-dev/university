package Immutable;

class Currency {
    //fields
    private final String code;
    private final String symbol;
    private final double exchangeRate;
    //constructor
    public Currency(String code, String symbol, double exchangeRate) {
        this.code = code;
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }
    //getters
    public String getCode() {
        return code;
    }
    public String getSymbol() {
        return symbol;
    }
    public double getExchangeRate() {
        return exchangeRate;
    }
    //methods
    public Currency convertTo(Currency baseCurrency) {
        double newExchangeRate = this.exchangeRate / baseCurrency.getExchangeRate();
        return new Currency(baseCurrency.getCode(), baseCurrency.getSymbol(), newExchangeRate);
    }
}

public class CurrencyTest {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", "$", 1.0);
        Currency eur = new Currency("EUR", "€", 0.85);
        Currency convertedCurrency = usd.convertTo(eur);
        System.out.println("Original Currency: " + usd.getCode() + " " + usd.getSymbol() + "\nExchange Rate: " + usd.getExchangeRate());
        System.out.println("Converted Currency: " + convertedCurrency.getCode() + " " + convertedCurrency.getSymbol() + "\nExchange Rate: " + convertedCurrency.getExchangeRate());
    }
}
