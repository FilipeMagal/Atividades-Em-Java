package creatingclass;

public class ActivityClass {
    private String name;
    private String email;

    public ActivityClass(String nome, String email){
        this.name = nome;
        this.email = email;
    }
    public String toString(){
        return name + ", "+email;
    }

}
