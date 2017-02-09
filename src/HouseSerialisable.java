import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by user on 06.02.2017.
 */
public class HouseSerialisable {


    public void serialize(House cfs) throws IOException {
        FileOutputStream fos = new FileOutputStream("C://Temp//object.out");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(cfs);
            oos.flush();
            oos.close();
        }
    }

    public House deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C://Temp//object.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        return (House) oin.readObject();
    }

    public static void main(String[] args) {
        HouseSerialisable serialisable = new HouseSerialisable();
        House cfs = new House();

        try {
            serialisable.serialize(cfs);
            System.out.println(serialisable.deserialize());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(HouseSerialisable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
