package Studentdetailsman;

import org.hibernate.Session;

public class Studentdao {
    public void addProduct(Student user) {
        try (Session session = Studentutil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(user);
            System.out.println("Product saved successfully into the database");
            session.getTransaction().commit();
            session.close();

        }
    }
}


