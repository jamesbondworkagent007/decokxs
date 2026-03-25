package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes21.dex */
class IncrementalPositionIterator extends AbstractPositionIterator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.pos < this.itemCount;
    }

    public IncrementalPositionIterator(@IntRange(from = 0) int i) {
        super(i);
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("position out of bounds reached");
        }
        int i = this.pos;
        this.pos = i + 1;
        return Integer.valueOf(i);
    }
}
