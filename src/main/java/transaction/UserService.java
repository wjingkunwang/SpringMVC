package transaction;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/login")
//    @Transactional(readOnly = true)
    public String login() throws Exception {
//        ((UserService) AopContext.currentProxy()).modify();
        String sql = "UPDATE student  SET name = ?   WHERE id = ? ";
        jdbcTemplate.update(sql, "222", 2);
        return "success";
    }


//    @Transactional(propagation = Propagation.REQUIRES_NEW, noRollbackFor = NullPointerException.class)
    public void modify() throws Exception {
        String sql = "UPDATE student  SET name = ?   WHERE id = ? ";
        jdbcTemplate.update(sql, "123312", 2);
        throw new NullPointerException();
    }
}