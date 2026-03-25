package com.immomo.mls.fun.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.flexbox.FlexboxLayoutManager;
import o.InterfaceC7473akW;

/* JADX INFO: loaded from: classes14.dex */
public class LuaFlexboxLayoutManager extends FlexboxLayoutManager implements InterfaceC7473akW {
    public boolean KWHzl;

    public LuaFlexboxLayoutManager(Context context) {
        super(context);
        this.KWHzl = true;
    }

    public LuaFlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.KWHzl = true;
    }

    @Override // o.InterfaceC7473akW
    public void KWHzl(boolean z) {
        this.KWHzl = z;
        setFlexWrap(!z ? 1 : 0);
    }

    @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.KWHzl && super.canScrollVertically();
    }

    @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.KWHzl && super.canScrollHorizontally();
    }
}
