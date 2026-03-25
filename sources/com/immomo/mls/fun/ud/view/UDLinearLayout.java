package com.immomo.mls.fun.ud.view;

import android.view.View;
import android.view.ViewGroup;
import o.C7330ahm;
import o.C7541all;
import o.C7823arB;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDLinearLayout<V extends ViewGroup & InterfaceC7384ain> extends UDViewGroup<V> {
    public C7541all KWHzl;

    @InterfaceC60044zuT
    public UDLinearLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDLinearLayout(Globals globals, int i) {
        super(globals);
        ((C7541all) this.dHguZz).setOrientation(i);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        int i = 0;
        if (luaValueArr.length == 1 && luaValueArr[0] != LuaValue.Nil() && luaValueArr[0].toInt() == 2) {
            i = 1;
        }
        C7541all c7541all = new C7541all(AubY(), this, i);
        this.KWHzl = c7541all;
        return c7541all;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public boolean e_() {
        return C7330ahm.AEQbTJ;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public boolean d_() {
        return C7330ahm.AEQbTJ;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    public void KWHzl(UDView uDView, int i) {
        View viewF_;
        V vF_ = f_();
        if (vF_ == null || (viewF_ = uDView.f_()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParamsApplyLayoutParams = vF_.applyLayoutParams(viewF_.getLayoutParams(), uDView.hBpjJd);
        if (i > f_().getChildCount()) {
            i = -1;
        }
        vF_.addView(C7823arB.AEQbTJ(viewF_), i, layoutParamsApplyLayoutParams);
    }
}
