public class CurrencyConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount * 4.20;
    }

    @Override
    public  double convertToUSD(double amount) {
        return amount * 5.19;
    }

    @Override
    public double getConversionRate(String currency) {
        switch (currency) {
            case "EUR":
                return 4.20;
            case "USD":
                return 5.19;
            default:
                return 1.0;
        }
    }
}
