import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello")
public class AnnotationHelloWorldController {
    @RequestMapping(value = "list")
    @ResponseBody
    public void list() throws Exception {
    }
}