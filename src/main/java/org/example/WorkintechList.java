package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object e) {
        if (this.contains(e)) {
            return false;
        }
        boolean added = super.add(e);
        this.sort();
        return added;
    }

    public void sort() {
        if (this.isEmpty()) return;

        boolean isNumeric = this.stream().allMatch(o -> o instanceof Number);
        if (isNumeric) {
            Collections.sort((ArrayList)this, (a, b) -> Double.compare(((Number)a).doubleValue(), ((Number)b).doubleValue()));
        } else {
            Collections.sort((ArrayList)this, (a, b) -> a.toString().compareToIgnoreCase(b.toString()));
        }
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        this.sort();
        return removed;
    }
}
