package ngu.joyce.moola.management;

/**
 * Created by Joyce on 2015-02-28.
 */
public class Subcategory  {

    String name;
    String description;

    public Subcategory (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

}
