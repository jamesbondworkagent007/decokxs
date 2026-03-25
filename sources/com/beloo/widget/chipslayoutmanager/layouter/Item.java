package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes21.dex */
public class Item {
    private int viewPosition;
    private Rect viewRect;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getViewPosition() {
        return this.viewPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rect getViewRect() {
        return this.viewRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.viewPosition;
    }

    public Item(Rect rect, int i) {
        this.viewRect = rect;
        this.viewPosition = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.viewPosition == ((Item) obj).viewPosition;
    }
}
