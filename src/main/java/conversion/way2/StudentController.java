package conversion.way2;

import conversion.way1.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @RequestMapping("/student")
    public String save(@RequestParam("student") Student student) {
        System.out.println(student);
        return "success";
    }
}  