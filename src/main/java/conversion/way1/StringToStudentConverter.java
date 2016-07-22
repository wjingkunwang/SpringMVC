package conversion.way1;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by wjk on 16/7/20.
 */
public class StringToStudentConverter implements Converter<String, Student> {
    @Override
    public Student convert(String source) {

        Student student = new Student();
        if (source != null) {
            String[] items = source.split(":");
            student.setName(items[0]);
            student.setRealName(items[1]);
        }
        return student;
    }
}
