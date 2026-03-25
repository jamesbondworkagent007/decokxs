package com.beloo.widget.chipslayoutmanager.util.log;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes21.dex */
public class LoggerFactory {
    public IFillLogger getFillLogger(SparseArray<View> sparseArray) {
        return new FillLogger(sparseArray);
    }
}
