package validator;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class UserController {
    @RequestMapping("/save")
    public String save(@Valid @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        return "success";
    }
}