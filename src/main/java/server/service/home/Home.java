package server.service.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@RequestMapping(path = "/home")
@SessionScope
public class Home {

    @RequestMapping(method = RequestMethod.GET, path = "/welcome")
    public String greeting(Model model){

        model.addAttribute("name", "Ehsan");

        System.out.println("FUXK");
        return "home/welcome";
    }

}
