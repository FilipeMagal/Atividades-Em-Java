package creatingclass;

public class RaioExercise {
    public static double numero_Qualquer;
    public static final double PI = 3.14;

    public static double circumference_Of_A_Number_Random(){
        double C =2*PI*numero_Qualquer;
        return C;
    }
    public static double volume_Of_A_Number_Random(){
        double v = (4*PI*Math.pow(numero_Qualquer,3)/3);
        return v;
    }

}
