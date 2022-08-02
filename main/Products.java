import java.util.ArrayList;

public class Products {
    public String name;
    public String measurableUnit;
    public float pricePerUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurableUnit() {
        return measurableUnit;
    }

    public void setMeasurableUnit(String measurableUnit) {
        this.measurableUnit = measurableUnit;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", measurableUnit='" + measurableUnit + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }

}
