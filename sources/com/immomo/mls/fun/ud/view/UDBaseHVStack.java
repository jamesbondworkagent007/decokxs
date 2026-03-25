package com.immomo.mls.fun.ud.view;

import android.view.View;
import android.view.ViewGroup;
import o.AbstractC7780aqL;
import o.C7330ahm;
import o.C7823arB;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDBaseHVStack<V extends AbstractC7780aqL & InterfaceC7384ain> extends UDBaseStack<V> {
    public static final String[] AEQbTJ = {"mainAxisAlignment", "crossAxisAlignment", "wrap"};

    @InterfaceC60044zuT
    public UDBaseHVStack(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDBaseStack, com.immomo.mls.fun.ud.view.UDView
    public boolean e_() {
        return C7330ahm.AEQbTJ;
    }

    @Override // com.immomo.mls.fun.ud.view.UDBaseStack, com.immomo.mls.fun.ud.view.UDView
    public boolean d_() {
        return C7330ahm.AEQbTJ;
    }

    @InterfaceC60044zuT
    public LuaValue[] mainAxisAlignment(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            f_().setMainAxisAlignment(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(f_().valueOf());
    }

    @InterfaceC60044zuT
    public LuaValue[] crossAxisAlignment(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            f_().setCrossAxisAlignment(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(f_().KWHzl());
    }

    @InterfaceC60044zuT
    public LuaValue[] wrap(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            f_().setWrap(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(f_().AYXKKw());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.app.FragmentBreadCrumbs */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    public void KWHzl(UDView uDView, int i) {
        View viewF_;
        V vF_ = f_();
        if (vF_ == 0 || (viewF_ = uDView.f_()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParamsApplyLayoutParams = vF_.applyLayoutParams(viewF_.getLayoutParams(), uDView.hBpjJd);
        if (i > f_().getChildCount()) {
            i = -1;
        }
        vF_.addView(C7823arB.AEQbTJ(viewF_), i, layoutParamsApplyLayoutParams);
    }
}
