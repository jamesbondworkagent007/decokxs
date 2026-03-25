package com.immomo.mls.fun.ud.view.recycler;

import o.C7350aiF;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDCollectionAutoFitAdapter extends UDCollectionAdapter {
    public static final String[] AxsJAYaxsJAY = new String[0];

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public boolean copydefault() {
        return false;
    }

    @InterfaceC60044zuT
    public UDCollectionAutoFitAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Possible override for method com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter.getNewProxyInstance()Z */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter
    public C7350aiF getNewProxyInstance() {
        return new C7350aiF(2.8E-45f, 2.8E-45f);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void uzCIH() {
        super.uzCIH();
        this.AEQbTJ.KWHzl(2.8E-45f);
        this.AEQbTJ.AEQbTJ(2.8E-45f);
    }
}
