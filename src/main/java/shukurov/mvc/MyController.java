package shukurov.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String first() {
        return "first";
    }

    @RequestMapping("/askDetail")
    public String askname(Model model,Employee employee){
        employee = new Employee();
        model.addAttribute("employee",employee);
        return "askDetail";
    }

    @RequestMapping("/showDetail")
    public String showName(@Valid  @ModelAttribute("employee") Employee employee,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "askDetail";
        }else {
            return "showDetail";
        }
    }

}
