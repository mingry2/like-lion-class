package studyclass.java_1006.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    public LikeLion2th() {
        students.add("김경록");
        students.add("김미지");
        students.add("김민경");
        students.add("김민지");
    }

    public List<String> getStudentList() {
        return this.students;
    }

}
