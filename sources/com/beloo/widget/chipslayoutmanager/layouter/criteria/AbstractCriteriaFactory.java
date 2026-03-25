package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractCriteriaFactory implements ICriteriaFactory {
    int additionalLength;
    int additionalRowCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAdditionalRowsCount(int i) {
        this.additionalRowCount = i;
    }

    public void setAdditionalLength(@IntRange(from = 0) int i) {
        if (i < 0) {
            throw new IllegalArgumentException("additional height can't be negative");
        }
        this.additionalLength = i;
    }
}
