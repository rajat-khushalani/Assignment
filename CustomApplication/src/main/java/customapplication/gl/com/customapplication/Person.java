package customapplication.gl.com.customapplication;

public class Person {
     String name;
    String surname;
    String city;
    String education;

    public Person(String name, String surname, String city, String education) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
