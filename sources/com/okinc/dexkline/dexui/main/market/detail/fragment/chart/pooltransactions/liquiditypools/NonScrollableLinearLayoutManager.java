package com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes23.dex */
public final class NonScrollableLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }
}
