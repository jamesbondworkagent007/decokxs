package com.okinc.dexkline.market.widget.recycler_view;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes23.dex */
public final class NonScrollableGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }
}
