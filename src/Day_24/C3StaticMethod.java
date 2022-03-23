package Day_24;

public class C3StaticMethod {
    public static void main(String[] args) {
        Student.play();
        System.out.println(Student.getUniversity());
        Student s1= new Student();
        Student s2= new Student();
        //System.out.println(Student.getName()); ERROR: instance method cannot be called via
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}

class Student{

    private static String university = "Harvard";
    private String name;
    private String course;

    static void play(){
        System.out.println("student is playing");
    }
    public static String getUniversity(){
        return university;
    }

    //No-entry of instance members inside
    public String getName() {
        return name;
    }
}
