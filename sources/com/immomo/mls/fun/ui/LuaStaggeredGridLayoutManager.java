package com.immomo.mls.fun.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import o.InterfaceC7473akW;

/* JADX INFO: loaded from: classes14.dex */
public class LuaStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements InterfaceC7473akW {
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7473akW
    public void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    public LuaStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.OLrzqt = true;
    }

    public LuaStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
        this.OLrzqt = true;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.OLrzqt && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.OLrzqt && super.canScrollHorizontally();
    }
}
