package Productmanagement;
import java.util.Scanner;
public class Productmain {
    public static void main(String[] args) {
        System.out.println("enter opetation to be perform");
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        ProductMethods dao=new ProductMethods();
        switch(op){
            case 1:
                Product p1 = new Product();
                p1.setProduct_id(2);
                p1.setProduct_name("Alaptop");
                p1.setProduct_price(200.0F);
                p1.setProduct_quantity(1);

                dao.saveproduct(p1);
                break;
            case 2:
                int id=1;
                dao.deleteproduct(id);
                break;
            case 3:
                int p_id=2;

                dao.updatedetails(p_id);
                break;
            case 4:
                int p_ide=2;

                dao.retriveproductdetails(p_ide);
                break;


            default:
                System.out.println("enter correct option");

        }


    }
}