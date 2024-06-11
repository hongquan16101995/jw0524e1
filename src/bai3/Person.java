package bai3;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    
    public Person() {
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int canEat(String status) {
        // equals: là phương thức có sẵn của lớp Object
        // lớp Object: là lớp cha lớn nhất trong Java, 
        // khẳng định: mọi lớp trong Java tạo ra đều là con của Objet
        if (status.equals("No")) {
            return 0;
        } else if (status.equals("Doi")){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
    }
}
