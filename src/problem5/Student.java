package problem5;

public class Student {
    private StringBuilder name;
    private byte course, grade;

    Student(StringBuilder name, byte course, byte grade) {
        if (name.length() > 3) {
            this.name = name;
        } if (course > 0 && course <= 4) {
            this.course = course;
        } if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public StringBuilder getName() {
        return name;
    }

    public byte getCourse() {
        return course;
    }

    public byte getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println("Информация о студенте:" +
                "\nИмя - " + getName() +
                "\nКурс - " + getCourse() +
                "\nОценка - " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(new StringBuilder("Denis"), (byte) 4, (byte) 10);
        student.showInfo();
    }
}
