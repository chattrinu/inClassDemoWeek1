public class FoodMenu {
    private String Name = "Rice";
    private double Price = 10;
    private int SpicyLavel;

    public FoodMenu (String name, double price, int spicyLavel) {
        Name = name;
        Price = price;
        SpicyLavel = spicyLavel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.contains("money"))
        {
            System.out.println("not allowed");
            return;
        }
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        if(price<1 || price > 1000) {
            throw new RuntimeException();

        }
        Price = price;
    }

    public int getSpicyLavel() {
        return SpicyLavel;
    }

    public void setSpicyLavel(int spicyLavel) {

        SpicyLavel = spicyLavel;
    }


}
