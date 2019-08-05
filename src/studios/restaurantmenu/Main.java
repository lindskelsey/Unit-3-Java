package studios.restaurantmenu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new MenuItem("Pho", 8.5));
        menu.addItem(new MenuItem("Bahn Mi", 7));
        menu.addItem(new MenuItem("Ramen", 6.5));
        menu.addItem(new MenuItem("Matcha Ice Cream", 3, "dessert"));
        System.out.println(menu);
    }
}
