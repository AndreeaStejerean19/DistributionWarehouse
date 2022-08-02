import java.util.ArrayList;

public class Fruits extends Products{

    public int nutritionalQuality;

    @Override
    public String toString() {
        return "Fruits{" +
                "nutritionalQuality=" + nutritionalQuality +
                '}';
    }

    public Fruits() {
        super();
    }
}
