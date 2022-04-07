package creatingclass;

public class DolarExercise {
    public static double IOF = 0.06;

    public static double dollar_Converter(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 + IOF);
    }
}
