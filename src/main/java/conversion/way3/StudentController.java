package conversion.way3;

import conversion.way1.Student;
import conversion.way2.CustomStudentEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Student.class,new CustomStudentEditor());
    }

    @RequestMapping("/student")
    public String save(@RequestParam("student") Student student) {
        System.out.println(student);
        return "success";
    }
}  