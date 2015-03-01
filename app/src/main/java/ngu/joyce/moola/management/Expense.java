package ngu.joyce.moola.management;

import java.util.Date;

/**
 * Created by Joyce on 2015-02-28.
 */
public class Expense extends Entry {

    public void Expense(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.subcategories = category.getSubcategories();
        date = new Date();
    }
}
