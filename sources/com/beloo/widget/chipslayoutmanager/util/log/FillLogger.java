package com.beloo.widget.chipslayoutmanager.util.log;

import android.util.SparseArray;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
class FillLogger implements IFillLogger {
    private int recycledItems;
    private int recycledSize;
    private int requestedItems;
    private int startCacheSize;
    private SparseArray<View> viewCache;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onItemRecycled() {
        this.recycledItems++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onItemRequested() {
        this.requestedItems++;
    }

    public FillLogger(SparseArray<View> sparseArray) {
        this.viewCache = sparseArray;
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onStartLayouter(int i) {
        this.requestedItems = 0;
        this.recycledItems = 0;
        this.startCacheSize = this.viewCache.size();
        Log.d("fillWithLayouter", "start position = " + i, 3);
        Log.d("fillWithLayouter", "cached items = " + this.startCacheSize, 3);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onFinishedLayouter() {
        Log.d("fillWithLayouter", String.format(Locale.getDefault(), "reattached items = %d : requested items = %d recycledItems = %d", Integer.valueOf(this.startCacheSize - this.viewCache.size()), Integer.valueOf(this.requestedItems), Integer.valueOf(this.recycledItems)), 3);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onAfterLayouter() {
        this.recycledSize = this.viewCache.size();
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onRemovedAndRecycled(int i) {
        Log.d("fillWithLayouter", " recycle position =" + this.viewCache.keyAt(i), 3);
        this.recycledSize = this.recycledSize + 1;
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onAfterRemovingViews() {
        Log.d("fillWithLayouter", "recycled count = " + this.recycledSize, 3);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.IFillLogger
    public void onBeforeLayouter(AnchorViewState anchorViewState) {
        if (anchorViewState.getAnchorViewRect() != null) {
            Log.d("fill", "anchorPos " + anchorViewState.getPosition(), 3);
            Log.d("fill", "anchorTop " + anchorViewState.getAnchorViewRect().top, 3);
        }
    }
}
