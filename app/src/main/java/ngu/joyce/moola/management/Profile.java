package ngu.joyce.moola.management;

import android.provider.ContactsContract;

import java.util.List;

/**
 * Created by Joyce on 2015-02-28.
 */
public class Profile {

    String name;
    String email;
    List<Account> accounts;

    public Profile(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
