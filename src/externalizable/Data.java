package externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
/* Bu örnekde age değeri serileştirilmemiştir.Dosya okunurken int tipinde olduğu için varsyılan degerini verir. */
public class Data implements Externalizable {
    private String name;
    private String lastName;
    private int age;

    public Data(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    //serileştirme yapan writeExternal metodu
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.lastName);
    }
    //serileştirilen nesneyi geri okuyan readExternal metodu
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       this.name = (String) in.readObject() ;
       this.lastName = (String) in.readObject();


    }
}
