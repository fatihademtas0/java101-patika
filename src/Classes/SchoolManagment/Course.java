package Classes.SchoolManagment;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printteacherinfo();
            System.out.println("------------------------");
        } else {
            System.out.println("Teacher and course do not match !");
            System.out.println("------------------------");
        }
    }

    void printteacherinfo() {
        this.teacher.print();
    }
}
