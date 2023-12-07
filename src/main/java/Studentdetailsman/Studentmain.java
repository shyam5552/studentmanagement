package Studentdetailsman;

public class Studentmain {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(2);
        s1.setName("shyam");
        s1.setYear(4);
        Studentdao da=new Studentdao();
        da.addProduct(s1);
    }
}
