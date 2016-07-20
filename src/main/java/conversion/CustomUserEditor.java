package conversion;

import java.beans.PropertyEditorSupport;

/**
 * Created by wjk on 16/7/20.
 */
public class CustomUserEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text.indexOf(",") > 0) {
            User user = new User();
            user.setName("wangjingkun");
            setValue(user);
        } else {
            throw new IllegalArgumentException("dept param is error");
        }

    }
}
