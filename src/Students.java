public class Students {

    private String name;
    private String surname;
    private int grade;

    public Students(String name, String surname, int grade) {
        this.setName(name);
        this.setSurname(surname);
        this.setGrade(grade);
    }

    public void setName(String name) {
        if (name.contains("a") || name.equals("b") || name.equals("c") || name.equals("d")) {
            this.name = name;
        } else {
            this.name = "invalid";

        }

        }
    public String getName(){
        return name;
    }
 public void setSurname(String surname){
        this.surname=surname;
 }
 public String getSurname(){
        return surname;
 }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }
}


