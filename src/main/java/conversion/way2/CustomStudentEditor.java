package conversion.way2;

import conversion.way1.Student;

import java.beans.PropertyEditorSupport;

/**
 * Created by wjk on 16/7/20.
 */
public class CustomStudentEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text.indexOf(":") > 0) {
            Student user = new Student();
            user.setName("wangjingkun");
            setValue(user);
        } else {
            throw new IllegalArgumentException("dept param is error");
        }

    }
}
