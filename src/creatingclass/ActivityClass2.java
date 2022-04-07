package creatingclass;

public class ActivityClass2 {
    private String name;
    private String email;

    public ActivityClass2 (String name, String email){
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return ", nome: "+name + ", email: " + email;
    }
}
