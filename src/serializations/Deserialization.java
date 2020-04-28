package serializations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        FileInputStream fln = null;
        ObjectInputStream in = null;
        try {
            fln = new FileInputStream("data.txt");//Dosyamızı okumak üzere açtık
            in = new ObjectInputStream(fln);//Nesnemizi okuyacak olan sınıfın örneğini oluşturduk
            Data data = (Data) in.readObject();//nesnemize okuduğumuz nesneyi atadık
            System.out.println("Data; name: " + data.getName() + " lastName: " + data.getLastName() + " age : " + data.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fln != null)
                    fln.close();
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
