class Overriding {
    String name;
    int rollNo;
    String course;
    Overriding(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student Name: " + name
             + ", Roll No: " + rollNo
             + ", Course: " + course;
    }
    public static void main(String[] args) {
        Overriding s = new Overriding("Rahul", 101, "Java");
        System.out.println(s);
    }
}