package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MathController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @PostMapping("phuc")
    public ModelAndView result(@RequestParam("firstnumberr") String number1,
                               @RequestParam("secondnumber") String number2,
                               @RequestParam("opera") String opera) {
        int result =0;
        int firstnumberr=Integer.parseInt(number1);
        int secondnumber=Integer.parseInt(number2);
        switch (opera) {
            case "addition":
                result=firstnumberr+secondnumber;
                break;
            case "subtraction":
                result=firstnumberr-secondnumber;
                break;
            case "multiptication":
                result=firstnumberr*secondnumber;
                break;
            case "division":
                result=firstnumberr/secondnumber;
                break;
        }
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("kq",result);
        return modelAndView;
    }

}
