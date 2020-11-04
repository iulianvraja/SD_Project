package DaoPack;

import Controller.IndexController;
import Models.FisaMedicala;
import Models.MedicPojo;
import Models.Pacient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MedicDao {
    private Session session;
    public MedicDao(){
        session=IndexController.getSession();
    }

    public void adaugapacient(Pacient p, FisaMedicala fis){
        Transaction tcx = null;
        // obtains the session

        tcx=session.beginTransaction();
        session.save(fis);

        List<FisaMedicala> f2=session.createCriteria(FisaMedicala.class).list();
        tcx.commit();
        FisaMedicala x=f2.get(f2.size()-1);
        p.setFis(x);
        tcx=session.beginTransaction();
        session.save(p);
        tcx.commit();
    }


}
