


import java.util.List;

public interface TeacherView<T extends TeacherService> {

    void sendOnConsole(List<T> list);
}
