package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.annotation.IntRange;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractPositionIterator implements Iterator<Integer> {
    int itemCount;
    int pos;

    public AbstractPositionIterator(@IntRange(from = 0) int i) {
        if (i < 0) {
            throw new IllegalArgumentException("item count couldn't be negative");
        }
        this.itemCount = i;
    }

    public void move(@IntRange(from = 0) int i) {
        if (i >= this.itemCount) {
            throw new IllegalArgumentException("you can't move above of maxItemCount");
        }
        if (i < 0) {
            throw new IllegalArgumentException("can't move to negative position");
        }
        this.pos = i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("removing not supported in position iterator");
    }
}
