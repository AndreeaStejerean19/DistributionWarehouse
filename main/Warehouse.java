import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Fruits> fruits = new ArrayList<Fruits>(); //array gol

    public List<Fruits> getFruits() {
        return fruits;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public List<OtherProducts> getOtherProducts() {
        return otherProducts;
    }

    private List<Vegetables> vegetables = new ArrayList<Vegetables>();


    private List<OtherProducts> otherProducts = new ArrayList<OtherProducts>();


    public Warehouse() {   //constructor fara param
        arrayFruits();
        arrayVegetables();
        arrayOtherProducts();
    }

    public void arrayFruits() {
        Fruits fruits1 = new Fruits();
        fruits1.setName("Apple");
        fruits1.setMeasurableUnit("Kg");
        fruits1.setPricePerUnit(6);
        fruits.add(fruits1);

        fruits1.setName("Peaches");
        fruits1.setMeasurableUnit("Box");
        fruits1.setPricePerUnit(30);
        fruits.add(fruits1);

        fruits1.setName("Oranges");
        fruits1.setMeasurableUnit("Bag");
        fruits1.setPricePerUnit(13);
        fruits.add(fruits1);
    }

    public void arrayVegetables() {
        Vegetables vegetables1=new Vegetables();
        vegetables1.setName("Potatoes");
        vegetables1.setMeasurableUnit("Bag");
        vegetables1.setPricePerUnit(15);
        vegetables.add(vegetables1);

        vegetables1.setName("Onions");
        vegetables1.setMeasurableUnit("Bag");
        vegetables1.setPricePerUnit(2.5f);
        vegetables.add(vegetables1);
    }

    public void arrayOtherProducts() {
        OtherProducts otherProducts1=new OtherProducts();
        otherProducts1.setName("Crackers");
        otherProducts1.setMeasurableUnit("Pack");
        otherProducts1.setPricePerUnit(2);
        otherProducts.add(otherProducts1);
    }
}


//PRICE RULE:
//INTERFATA CU METODA EXPIRES IMPLEMENTATA DIFEIRT IN FRUCTE SI LEGUME DIFERIT SI MA FOLOSESC DE ...
//FUNCTIIE PT A CALCULA CATE SAPT
//        PT A CALCULA CATE REDUCERE
//METODELE DE PROD DISCOUNT LE PUN LA PACKAGE UNDE CALC SI PRICE SI TERMEN DE EXPIRARE
//LOCALDATE