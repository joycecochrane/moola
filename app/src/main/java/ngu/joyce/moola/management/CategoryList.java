package ngu.joyce.moola.management;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joyce on 2015-02-28.
 */
public class CategoryList {

    private List<Category> categories;

    public void CategoryList() {
        categories = new ArrayList<Category>();
    }

    public void addCategory(Category c) {
        categories.add(c);
    }

    public void removeCategory(Category c) {
        categories.remove(c);
    }

    public List<Category> getCategories() {
        return categories;
    }

}
