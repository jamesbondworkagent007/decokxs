package com.immomo.mls.fun.ud.view;

import android.view.ViewGroup;
import o.C7532alc;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDCoordinatorLayout<V extends ViewGroup & InterfaceC7384ain> extends UDViewGroup<V> {
    public C7532alc KWHzl;

    @InterfaceC60044zuT
    public UDCoordinatorLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        C7532alc c7532alc = new C7532alc(AubY(), this);
        this.KWHzl = c7532alc;
        return c7532alc;
    }
}
