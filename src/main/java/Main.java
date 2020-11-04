
import Models.MedicPojo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {
    public static void main(String[] args){
       Configuration configuration = new Configuration().configure();
        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
        registry.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Transaction tcx = null;
        // obtains the session
        Session session = sessionFactory.openSession();
        tcx=session.beginTransaction();
        MedicPojo m=new MedicPojo();
        m.setNume("iulian");
        m.setParola("pass");
        session.save(m);
        tcx.commit();

        
        session.close();


    }
}
