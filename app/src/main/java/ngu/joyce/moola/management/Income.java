package ngu.joyce.moola.management;

import java.util.Date;

/**
 * Created by Joyce on 2015-02-28.
 */
public class Income extends Entry {

    public void Income(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.subcategories = category.getSubcategories();
        date = new Date();
    }
}
