package ngu.joyce.moola.management;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import ngu.joyce.moola.exceptions.NotFoundException;

/**
 * Created by Joyce on 2015-02-28.
 */
public class EntryList {

    private List<Entry> entries;

    public void EntryList() {
        entries = new ArrayList<Entry>();
    }

    public void addEntry(Entry e) {
        entries.add(e);
    }

    public void removeEntry(Entry e) {
        entries.remove(e);
    }

    public List<Entry> getEntries() {
        return entries;
    }


}
