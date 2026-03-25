package com.immomo.mls.fun.ud.view.recycler;

import androidx.recyclerview.widget.RecyclerView;
import o.C7346aiB;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDFlexboxLayout extends UDCollectionLayout {
    public C7346aiB copydefault;

    @InterfaceC60044zuT
    public UDFlexboxLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public RecyclerView.ItemDecoration KWHzl() {
        return fIwbmz();
    }

    public final C7346aiB fIwbmz() {
        if (this.copydefault == null) {
            this.copydefault = new C7346aiB(this);
        }
        return this.copydefault;
    }
}
