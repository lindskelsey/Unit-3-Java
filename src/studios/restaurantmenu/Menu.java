package studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static int nextMenuId = 1;

    private final ArrayList<MenuItem> items;
    private Date lastUpdated;
    private int menuId;

    public Menu() {
        items = new ArrayList<>();
        lastUpdated = new Date();
        menuId = nextMenuId;
        nextMenuId++;
    }

    public void addItem(MenuItem item) {
        if (items.contains(item)) {
            return;
        }

        items.add(item);
        lastUpdated = new Date();
    }

    public boolean removeItem(MenuItem item) {
        boolean removed = items.remove(item);
        if (removed) {
            lastUpdated = new Date();
        }
        return removed;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String toString() {
        String menuStr = "==== Menu ====\n";
        for (MenuItem item : items) {
            menuStr += item+"\n";
        }
        return menuStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Menu menu = (Menu) obj;

        return menuId == menu.menuId;
    }

    @Override
    public int hashCode() {
        return menuId;
    }
}
