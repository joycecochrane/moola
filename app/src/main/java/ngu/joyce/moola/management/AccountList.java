package ngu.joyce.moola.management;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joyce on 2015-02-28.
 */
public class AccountList {

    List<Account> accounts;

    public void AccountList() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(Account a) {
        accounts.remove(a);
    }

    public List<Account> getAccounts() {
        return accounts;
    }




}
