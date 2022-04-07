package creatingclass;

public class StudentsGrades {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;


    public double sumOfGrades(){
        return (nota1 + nota2 + nota3);
    }
    public double passOrFailed(){

        if(sumOfGrades() < (60.0/100)*100){
            return (60.0/100)*100 - sumOfGrades();
        }
        else
            return 0;

    }
}


