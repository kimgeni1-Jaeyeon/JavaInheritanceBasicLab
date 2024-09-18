class Human {
    String name;
    int age;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Age =  " + getAge() + " name = " + getName();
    }

    public String getProfession(){
        return "직업 : ?";
    }

}

public class Student extends Human{ //public 안쓰면 java 파일 이름 안바꿔도 된다
    String major;


    public Student(String name, int age, String major){
        super(name, age); // 부모에게 디폴트 생성자가 없으니 부모의 생성자를 호출하여야 한다.
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getProfession(){
        return "직업 : " + getMajor();
    }

    @Override
    public String toString() {
        return super.toString() + " Major = " + getMajor();
    }

    public static void main(String[] args) {
        Student s1 = new Student("명진", 21, "컴퓨터");
        Student s2 = new Student("미현", 22, "경영");
        Student s3 = new Student("용준", 24, "경제");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}