package DaoPack;

import Controller.IndexController;
import Models.Pacient;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class PacientDao {
    private Session session;
    public PacientDao(){
        session= IndexController.getSession();
    }

    public List<Pacient> getallp(){
        try
        {
            return session.createCriteria(Pacient.class).list();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public Pacient getpbyid(int id){
        Pacient p= (Pacient) session.get(Pacient.class,id);
        return p;
    }
    public void deletep(int id){
        Transaction tcx = null;
        tcx=session.beginTransaction();
        Pacient p=getpbyid(id);
        System.out.println("ia sa vedem: "+p.getNume()+p.getAdr());
        session.delete(p);
        tcx.commit();

    }
}
