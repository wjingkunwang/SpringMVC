package conversion.way1;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by wjk on 16/7/21.
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -3244941439014026595L;
    private String name;
    private String realName;
}
