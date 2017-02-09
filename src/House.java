import java.io.Serializable;

/**
 * Created by user on 06.02.2017.
 */
public class House implements Serializable {
    private int count = 2;
    private Color color = new Color();

    @Override
    public String toString() {
        return "House{" + "count=" + count + "}" + ", " + color.toString() ;
    }
}
class Color implements Serializable {
    private int ton  = 145;
    private String name = "write";

    @Override
   public String toString() {
        return "Color{" +  "ton=" + ton + ", name=" + name + "}";
   }
}
