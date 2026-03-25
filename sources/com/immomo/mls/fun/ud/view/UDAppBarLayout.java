package com.immomo.mls.fun.ud.view;

import android.view.ViewGroup;
import o.C7533ald;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDAppBarLayout<V extends ViewGroup & InterfaceC7384ain> extends UDViewGroup<V> {
    public C7533ald copydefault;

    @InterfaceC60044zuT
    public UDAppBarLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        C7533ald c7533ald = new C7533ald(AubY(), this);
        this.copydefault = c7533ald;
        return c7533ald;
    }
}
