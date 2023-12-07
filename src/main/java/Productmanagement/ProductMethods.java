package Productmanagement;

import Studentdetailsman.Studentutil;
import org.hibernate.Session;

public class ProductMethods {
    public void saveproduct(Product product) {
        try (Session session = Studentutil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(product);

            session.getTransaction().commit();
            System.out.println("Product saved successfully into the database");
            session.close();

        }


    }



    public void deleteproduct(int i) {
        try (Session session = Studentutil.getSessionFactory().openSession()) {
            session.beginTransaction();


            Product p=session.get(Product.class,i);
            session.delete(p);
            session.getTransaction().commit();
            System.out.println("Product deleated successfully from the database");
            session.close();

        }
    }

    public void updatedetails(int id) {
        try(Session session=Studentutil.getSessionFactory().openSession()){
            session.beginTransaction();
            Product p=session.get(Product.class,id);
            p.setProduct_price(300.0F);
            session.save(p);
            session.getTransaction().commit();
            System.out.println("product updated succcessfully in db");
            session.close();
        }

    }


    public void retriveproductdetails(int pIde) {
        try(Session session=Studentutil.getSessionFactory().openSession()){
            session.beginTransaction();
            Product p=session.get(Product.class,pIde);
            System.out.println(p.toString());


        }
    }
}
