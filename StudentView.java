

import java.util.List;

public class StudentView implements TeacherView<Student> {

    @Override
    public void sendOnConsole(List<Student> list){
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

