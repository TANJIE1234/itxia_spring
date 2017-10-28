package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zyzz on 10/28/17.
 */
@Controller
@RequestMapping(value = "/",method = RequestMethod.GET)
public class HomeController {
    public String getHome(){
        return "home";
    }
}
