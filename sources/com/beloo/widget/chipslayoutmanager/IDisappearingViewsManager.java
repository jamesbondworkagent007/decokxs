package com.beloo.widget.chipslayoutmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.DisappearingViewsManager;

/* JADX INFO: loaded from: classes21.dex */
interface IDisappearingViewsManager {
    int calcDisappearingViewsLength(RecyclerView.Recycler recycler);

    int getDeletingItemsOnScreenCount();

    DisappearingViewsManager.DisappearingViewsContainer getDisappearingViews(RecyclerView.Recycler recycler);

    void reset();
}
