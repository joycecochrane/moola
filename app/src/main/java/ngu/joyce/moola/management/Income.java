package ngu.joyce.moola.management;

import java.util.Date;

/**
 * Created by Joyce on 2015-02-28.
 */
public class Income extends Entry {



    public Income(String name, String description,
                       Category category, Subcategory subcategory) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.subcategory = subcategory;
        date = new Date();
    }
}
