package serializations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Data data = new Data("Kader", "ÇELİK", 25);//Nesnemizi oluşturduk
        FileOutputStream fOut = null;
        ObjectOutputStream out = null;

        try {
            fOut = new FileOutputStream("data.txt");//dosyamızı oluşturduk, Bu dosya doğrudan projenin olduğu klasörde oluşacaktır.
            out = new ObjectOutputStream(fOut); //serileştirme için nesneyi oluşturduk
            out.writeObject(data);//nesnemizi dosyaya yazdık, serileştirme gerçekleştirildi
            out.close();

        } catch (IOException i) {
            i.printStackTrace();

        } finally {
            try {
                if (fOut != null)
                    fOut.close();
                if (out != null)
                    out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }
}
