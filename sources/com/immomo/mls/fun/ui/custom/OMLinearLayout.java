package com.immomo.mls.fun.ui.custom;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.utils.AssertUtils;
import o.C7330ahm;
import o.C7823arB;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class OMLinearLayout<V extends ViewGroup & InterfaceC7384ain> extends UDViewGroup<V> {
    public static final String[] EZpvd = {"requestWindowLayout", "getMeasuredHeight", "bgColor", "setGravity"};

    @InterfaceC60044zuT
    public OMLinearLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i = 0;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null && luaValue.toInt() == 2) {
            i = 1;
        }
        return new OLuaLinearLayout(AubY(), this, i);
    }

    @InterfaceC60044zuT
    public LuaValue[] requestWindowLayout(LuaValue[] luaValueArr) {
        requestLayout(luaValueArr);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    @InterfaceC60044zuT
    public LuaValue[] getMeasuredHeight(LuaValue[] luaValueArr) {
        f_().measure(0, 0);
        int i = 0;
        for (int i2 = 0; i2 < f_().getChildCount(); i2++) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f_().getChildAt(i2).getLayoutParams();
            i = i + layoutParams.topMargin + layoutParams.bottomMargin;
        }
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(f_().getMeasuredHeight() + i)));
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] setGravity(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || luaValueArr[0] == null) {
            return null;
        }
        ((OLuaLinearLayout) f_()).setLayoutGravity(luaValueArr[0].toInt());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] bgColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !AssertUtils.KWHzl(luaValueArr[0], UDColor.class, "bgColor", getGlobals())) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), iwGUEr()));
        }
        UDColor uDColor = (UDColor) luaValueArr[0];
        f_().setBackgroundColor(uDColor.AEQbTJ().getColor(this.globals));
        uDColor.destroy();
        return null;
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
