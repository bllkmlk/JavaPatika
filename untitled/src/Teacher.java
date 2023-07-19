public class Teacher {
    String name;
    String mnpo;
    String branch;

    Teacher(String name , String branch , String mnpo){
        this.name = name;
        this.branch = branch;
        this.mnpo = mnpo;
    }
    void print(){
        System.out.println(" Adı :" + this.name);
        System.out.println(" Bölümü :" + this.branch);
        System.out.println(" Telefon :" + this.mnpo);

    }
}
