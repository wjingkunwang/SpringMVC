package conversion.way2;

import conversion.way1.Student;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * 需要注册到适配器中
 */
public class MyBindingInitializer implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder binder, WebRequest request) {
         binder.registerCustomEditor(Student.class,new CustomStudentEditor());
    }
}
