package Controller;

import DaoPack.PacientDao;
import FormHandlers.LogForm;
import Models.Pacient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RestController
public class RegisterController {

    @RequestMapping("/submitlog")
    public ModelAndView retloginfo(@ModelAttribute("LogForm")LogForm lf){
        System.out.println(lf.getParola()+lf.getTipUser()+lf.getUsername());
        ModelAndView x=new ModelAndView("submit");
        return x;
    }
    @RequestMapping(value="/submitl")
    public ModelAndView go(){
        PacientDao pdao=new PacientDao();

        ModelAndView x=new ModelAndView("DoctorView");
        List<Pacient> pp=pdao.getallp();
        x.addObject("list",pp);
        for(Pacient i:pp){
            System.out.println(i.getNume());
        }
        return x;
    }

}
