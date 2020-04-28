package serializations;

import java.io.Serializable;
//Serializable  arayüzü implements edilir.
public class Data implements Serializable {
    private String name;
    private String lastName;
    private int age;
    //Sınıfımızın constructor’ı
    public Data(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    // get metodları oluşturuldu.
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
