package ngu.joyce.moola.management;

import android.media.Image;

import java.util.List;

/**
 * Created by Joyce on 2015-02-28.
 */
public class Category {

    protected String name;
    protected Image image;
    protected List<Subcategory> subcategories;

    public void Category(String name, Image image, List<Subcategory> subcategories) {
        this.name = name;
        this.image = image;
        this.subcategories = subcategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void addSubcategory(Subcategory sub) {
        subcategories.add(sub);
    }

    public void removeSubcategory(Subcategory sub) {
        subcategories.remove(sub);
    }

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }
}
