package Controller;

import DaoPack.MedicDao;
import DaoPack.PacientDao;
import FormHandlers.AddPacientForm;
import Models.FisaMedicala;
import Models.Pacient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class MedicController{
    public MedicController(){}
   public static String id;
    @RequestMapping(value="/addpacient")
    public ModelAndView addp(){
        ModelAndView x=new ModelAndView("addp");
        AddPacientForm fo=new AddPacientForm();
        x.addObject("fo",fo);

    return x;
    }
    @RequestMapping(value="/addpp",method = RequestMethod.POST)
    public ModelAndView addpp(@ModelAttribute(value="fo") AddPacientForm fo){
        System.out.println(fo.getNume()+fo.getAdr()+fo.getData_n()+fo.getSex());
        Pacient p=new Pacient();
        p.setAdr(fo.getAdr());
        p.setData_n(fo.getData_n());
        p.setNume(fo.getNume());
        p.setParola(fo.getParola());
        p.setSex(fo.getSex());
        FisaMedicala fis=new FisaMedicala();
        fis.setPerioadaTratament(fo.getPerioadaTratament());
        fis.setStare(fo.getStare());
        MedicDao m=new MedicDao();
        m.adaugapacient(p,fis);
        ModelAndView x=new ModelAndView("DoctorView");

        return x;
    }
    @RequestMapping(value="/delp")
    public ModelAndView deletep(@RequestParam("id") String id){
        System.out.println(id);
        PacientDao p=new PacientDao();
        p.deletep(Integer.valueOf(id));
        List<Pacient> pp=p.getallp();
        ModelAndView x=new ModelAndView("DoctorView");
        x.addObject("list",pp);
        return x;
    }
    @RequestMapping(value="/upp")
    public ModelAndView updatep(@RequestParam("id") String id){
        System.out.println(id);
        this.id =id;
        ModelAndView x=new ModelAndView("updatep");
        AddPacientForm fo=new AddPacientForm();
        x.addObject("fo",fo);
        return x;
    }

    @RequestMapping(value="/uppp")
    public ModelAndView updatepDao(@ModelAttribute(value="fo") AddPacientForm fo){
        PacientDao pp=new PacientDao();
        pp.deletep(Integer.valueOf(id));
        Pacient p=new Pacient();
        p.setAdr(fo.getAdr());
        p.setData_n(fo.getData_n());
        p.setNume(fo.getNume());
        p.setParola(fo.getParola());
        p.setSex(fo.getSex());
        FisaMedicala fis=new FisaMedicala();
        fis.setPerioadaTratament(fo.getPerioadaTratament());
        fis.setStare(fo.getStare());
        MedicDao m=new MedicDao();
        m.adaugapacient(p,fis);
        ModelAndView x=new ModelAndView("DoctorView");
        List<Pacient> ppp=pp.getallp();
        x.addObject("list",ppp);
        return x;
    }

}
