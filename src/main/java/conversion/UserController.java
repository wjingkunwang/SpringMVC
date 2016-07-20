package conversion;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import validator.User;

import javax.validation.Valid;

@Controller
public class UserController {
    @RequestMapping(name = "save")
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, new CustomUserEditor());
    }
}  