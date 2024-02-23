
/*
� Создать класс Юзер и перенести в него базовые поля ( ФИО )
        � Модифицировать ранее созданный класс СтудентКомпаратор
        � Переименовать в ЮзерКомпаратор
        � Типизировать его T наследующегося от типа Юзер ( T extends User )
        � Типизировать реализуемый интерфейс Компаратор T
        � Изменить метод компаре, внеся во входные данные вместо конкретных
        классов типизацию T
        � Внести правки места, где использовался предыдущий компарато

        Создать интерфейс ЮзерВью
        � Типизировать его T наследующегося от типа Юзер
        � Создать в нем метод sendOnConsole(List<Student> students) используя
        типизацию
        � Создать класс СтудентВью реализующий созданный интерфей

Домашнее задание:
        — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
        — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;

        Формат сдачи: ссылка на гитхаб проект

*/

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());


        Student student1 = new Student(1L, "Bob", "Bob1", "Bob2");
        Student student2 = new Student(2L, "Alex", "Alex1", "Alex2");
        Student student3 = new Student(3L, "Goga", "Goga1", "Goga2");
        Student student4 = new Student(4L, "bul", "bul1", "bul2");


        List<Student> studentList = new ArrayList<>();
        studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}