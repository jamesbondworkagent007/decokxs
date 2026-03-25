package com.okinc.business.invest_biz.ui.widget;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes23.dex */
public final class DisabledScrollGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }
}
