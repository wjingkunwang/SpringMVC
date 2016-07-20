package conversion;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

/**
 * Created by wjk on 16/7/20.
 */
@Service
public class StringToUserConverter implements Converter<String, User> {

    public User convert(String source) {
        User user = new User();
        if (source != null) {

            String[] items = source.split(",");
            user.setPassword(items[0]);
            user.setPassword(items[1]);
        }
        return user;
    }
}