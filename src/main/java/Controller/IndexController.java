package Controller;

import FormHandlers.LogForm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    public static Session session;
    @RequestMapping(value="/")
    public ModelAndView getindex(){
       Configuration configuration = new Configuration().configure();
       ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
       registry.applySettings(configuration.getProperties());
       ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

       // builds a session factory from the service registry
       SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
       session = sessionFactory.openSession();
       ModelAndView x=new ModelAndView("index");
       return x;
   }
    @RequestMapping("/loginpage")
    public ModelAndView retloginpage(){

        ModelAndView x=new ModelAndView("submitlog");

        return x;
    }
    @RequestMapping("/recover")
    public ModelAndView retrecover(){
        System.out.println("intram in login page");
        ModelAndView x=new ModelAndView("submit");
        return x;
    }

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        IndexController.session = session;
    }
}
