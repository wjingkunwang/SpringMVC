package json_xml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/json")
public class UserController {
    @RequestMapping(value = "list")
    @ResponseBody
    public Map<String, Object> list() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "wjk"));
        map.put("list", userList);
        return map;
    }
}