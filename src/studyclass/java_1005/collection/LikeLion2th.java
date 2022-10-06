package studyclass.java_1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    // 멋사자 2기 학생의 이름이 들어있는 list를 return하는 method
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<Student>();

    Names names = new Names();
    public LikeLion2th() {
        // this.students = new ArrayList<>();
        names.getName(students);
        this.studentObjs = names.getStudentObjs();
    }

    public List<String> getStudentList() {
        return this.students;
    }
}
