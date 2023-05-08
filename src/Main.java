public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        FoodMenu foodMenu = new FoodMenu("Crab",10,0);
        System.out.println( "Food name is :"+foodMenu.getName());
        System.out.println( "Food name is :"+foodMenu.getPrice());
    }
}