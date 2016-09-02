package server.service.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/home")
public class Home {

    @RequestMapping(method = RequestMethod.GET, path = "/welcome")
    public String greeting(){
        return "home/welcome";
    }

}
