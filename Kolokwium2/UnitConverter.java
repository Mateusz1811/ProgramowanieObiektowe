public class UnitConverter implements Converter {
    double amount;

    public UnitConverter(double amount) {
        this.amount = amount;
    }


    @Override
    public double getConversionRate(String currency){
        if(currency.equals("EURO")){
            return 4.21;
        }
        if(currency.equals("USD")){
            return 4.02;
        }else{
            return 0;
        }
    }

    @Override
    public double convertToEuro(double amount) {
        return amount * getConversionRate("EURO");
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * getConversionRate("USD");
    }


}