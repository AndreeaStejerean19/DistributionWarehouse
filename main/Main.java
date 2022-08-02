public class Main {

    public static void main(String[] args) {
//SA AM UN SINGUR WAREHOUSE : WAREHOUSE.GETVEGETABLES, WAREHOUSE.GETFRUITS, WAREHOUSE.GETOHTHER

        Warehouse warehouse = new Warehouse();
        warehouse.arrayVegetables();
        warehouse.arrayFruits();
        warehouse.arrayOtherProducts();

        System.out.println(warehouse.getVegetables());
        System.out.println(warehouse.getFruits());
        System.out.println(warehouse.getOtherProducts());

    }
}
