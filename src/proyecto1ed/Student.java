package proyecto1ed;

public class Student {
    private String name, carreer, id;
    Grades grades;
    Student(){
        name=carreer=id="";
        grades=null;
    }
    
    Student (String name, String carreer, String id){
        this.name=name;
        this.carreer=carreer;
        this.id=id;
        this.grades=new Grades();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Grades getGrades(){
        return this.grades;
    }
    
    public void addGrade(double grade){
        this.grades.insert(grade, grades.length());
    }
    @Override
    public String toString() {
        return name + ": " + carreer + " - " + id ;
    }
    
    
}
