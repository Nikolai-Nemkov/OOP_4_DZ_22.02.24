




public class Student extends TeacherService implements Comparable<Student>{
    public long studentId;


    public Student(Long studentId, String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + "   " +
                super.toString()+
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(studentId > o.studentId)
            return 1;
        if(studentId < o.studentId)
            return -1;
        return 0;
    }
}

