package proyecto1ed;

public class Student {
    private String name, carreer;
    private int id;
    
    Student(){
        name=carreer="";
        id=-1;
    }
    
    Student (String name, String carreer, int id){
        this.name=name;
        this.carreer=carreer;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarreer() {
        return carreer;
    }

    public void setCarreer(String carreer) {
        this.carreer = carreer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", carreer=" + carreer + ", id=" + id + '}';
    }
    
    
}
