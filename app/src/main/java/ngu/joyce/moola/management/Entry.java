package ngu.joyce.moola.management;

import android.media.Image;

import java.util.Date;

/**
 * Created by Joyce on 2015-02-25.
 */
public abstract class Entry {

    protected String name;
    protected String description;
    protected int amount;
    protected Category category;
    protected Subcategory subcategory;
    private Date date;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory (Category category) {
        this.category = category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory sub) {
        subcategory = sub;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }




}
