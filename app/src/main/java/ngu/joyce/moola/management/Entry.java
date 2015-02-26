package ngu.joyce.moola.management;

import android.media.Image;

import java.util.Date;

/**
 * Created by Joyce on 2015-02-25.
 */
public abstract class Entry {

    protected String name;
    protected String description;
    protected Category category;

    private Date date;

   public void Entry(String name, String description, Category category) {
       this.name = name;
       this.description = description;
       this.category = category;
       date = new Date();
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public Category setCategory (String name, Image icon) {
        Category.setName(name);
        Category.setIcon(icon);


    }



}
