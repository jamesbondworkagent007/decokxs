package com.beloo.widget.chipslayoutmanager.layouter.placer;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
abstract class AbstractPlacer implements IPlacer {
    private RecyclerView.LayoutManager layoutManager;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecyclerView.LayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public AbstractPlacer(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }
}
