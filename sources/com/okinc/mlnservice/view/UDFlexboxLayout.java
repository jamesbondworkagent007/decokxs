package com.okinc.mlnservice.view;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import o.C43183rkV;
import o.C7330ahm;
import o.C7823arB;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public class UDFlexboxLayout<V extends ViewGroup & InterfaceC7384ain> extends UDViewGroup<V> {
    public static final String[] copydefault = {"layoutDirection", "flexWrap", "horizontalAlignment", "verticalAlignment", "maxLine", "alignContent"};
    public C43183rkV EZpvd;

    @InterfaceC60044zuT
    public UDFlexboxLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        int i = 0;
        if (luaValueArr.length == 1 && luaValueArr[0] != LuaValue.Nil() && luaValueArr[0].toInt() == 2) {
            i = 2;
        }
        C43183rkV c43183rkV = new C43183rkV(AubY(), this, i);
        this.EZpvd = c43183rkV;
        return c43183rkV;
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

    @InterfaceC60044zuT
    public LuaValue[] layoutDirection(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
            if (luaValueArr[0].toInt() != 0 && luaValueArr[0].toInt() != 1 && luaValueArr[0].toInt() != 2 && luaValueArr[0].toInt() != 3) {
                return null;
            }
            this.EZpvd.setFlexDirection(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(this.EZpvd.getFlexDirection());
    }

    @InterfaceC60044zuT
    public LuaValue[] flexWrap(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
            if (luaValueArr[0].toInt() != 0 && luaValueArr[0].toInt() != 1 && luaValueArr[0].toInt() != 2) {
                return null;
            }
            this.EZpvd.setFlexWrap(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(this.EZpvd.getFlexWrap());
    }

    @InterfaceC60044zuT
    public LuaValue[] horizontalAlignment(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
            if (luaValueArr[0].toInt() != 0 && luaValueArr[0].toInt() != 1 && luaValueArr[0].toInt() != 2 && luaValueArr[0].toInt() != 3 && luaValueArr[0].toInt() != 4 && luaValueArr[0].toInt() != 5) {
                return null;
            }
            this.EZpvd.setJustifyContent(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(this.EZpvd.getJustifyContent());
    }

    @InterfaceC60044zuT
    public LuaValue[] verticalAlignment(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
            if (luaValueArr[0].toInt() != 0 && luaValueArr[0].toInt() != 1 && luaValueArr[0].toInt() != 2 && luaValueArr[0].toInt() != 3 && luaValueArr[0].toInt() != 4) {
                return null;
            }
            this.EZpvd.setAlignItems(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(this.EZpvd.getAlignItems());
    }

    @InterfaceC60044zuT
    public LuaValue[] alignContent(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
            if (luaValueArr[0].toInt() != 0 && luaValueArr[0].toInt() != 1 && luaValueArr[0].toInt() != 2 && luaValueArr[0].toInt() != 3 && luaValueArr[0].toInt() != 4 && luaValueArr[0].toInt() != 5) {
                return null;
            }
            this.EZpvd.setAlignContent(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(this.EZpvd.getAlignContent());
    }

    @InterfaceC60044zuT
    public LuaValue[] maxLine(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
            this.EZpvd.setMaxLine(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(this.EZpvd.getMaxLine());
    }
}
