package creatingclass;

public class ClassList2 {
    private String name;
    private String tell;
    private long cpf;

    public ClassList2 (String name, String tell, long cpf){
        this.name = name;
        this.tell = tell;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getTell() {
        return tell;
    }

    public long getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "name= " + name + ", tell= " + tell + ", cpf= " + cpf+"\n";
    }
}