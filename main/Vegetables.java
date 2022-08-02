import java.util.ArrayList;

public class Vegetables extends Products {

    private int nutritionalQuality;
    private String producer;

    @Override
    public String toString() {
        return "Vegetables{" +
                "nutritionalQuality=" + nutritionalQuality +
                ", producer='" + producer + '\'' +
                '}';
    }
}
