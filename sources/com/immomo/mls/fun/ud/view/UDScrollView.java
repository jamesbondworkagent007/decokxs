package com.immomo.mls.fun.ud.view;

import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.UDPoint;
import com.immomo.mls.fun.ud.UDSize;
import o.C7343ahz;
import o.C7350aiF;
import o.C7542alm;
import o.C7823arB;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import o.InterfaceC7408ajK;
import o.InterfaceC7472akV;
import o.InterfaceC7475akY;
import o.pUU;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDScrollView<V extends ViewGroup & InterfaceC7475akY & InterfaceC7472akV> extends UDViewGroup<V> implements InterfaceC7475akY.TaskDescription, InterfaceC7475akY.StateListAnimator, InterfaceC7475akY.ActionBar, View.OnTouchListener {
    public static final String[] OLrzqt = {"width", "height", "contentSize", "contentOffset", "scrollEnabled", "showsHorizontalScrollIndicator", "showsVerticalScrollIndicator", "i_bounces", "i_bounceHorizontal", "i_bounceVertical", "i_pagingEnabled", "setScrollEnable", "setScrollBeginCallback", "setScrollingCallback", "setScrollEndCallback", "setContentInset", "setOffsetWithAnim", "setEndDraggingCallback", "setStartDeceleratingCallback", "getContentInset", "removeAllSubviews", "a_flingSpeed", "refreshEnable", "isRefreshing", "startRefreshing", "stopRefreshing", "setRefreshingCallback", "setMaterialHeader", "setNFTManyChainHeader", "setOKXLiteHeader", "setOKXLightHeader", "setOffsetWithAnimAndTime"};
    public LuaFunction AEQbTJ;
    public LuaFunction AYXKKw;
    public LuaFunction AhwBna;
    public C7350aiF EZpvd;
    public boolean KWHzl;
    public LuaFunction copydefault;
    public LuaFunction djBIcL;
    public LuaFunction gEmmrt;
    public LuaFunction valueOf;
    public boolean values;

    @InterfaceC60044zuT
    public LuaValue[] getContentInset(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_bounceHorizontal(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_bounceVertical(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_pagingEnabled(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] isRefreshing(LuaValue[] luaValueArr) {
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @InterfaceC60044zuT
    public UDScrollView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.values = false;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (luaValueArr.length == 1) {
            z = !luaValueArr[0].isNumber() || luaValueArr[0].toInt() == 0;
            if (luaValueArr[0].isBoolean()) {
                z3 = true ^ luaValueArr[0].toBoolean();
                z2 = z3;
            }
            z2 = z;
        } else {
            if (luaValueArr.length == 2) {
                z = !luaValueArr[0].toBoolean();
                z4 = luaValueArr[1].toBoolean();
                z2 = z;
            }
            z2 = z3;
        }
        return new C7542alm(AubY(), this, z2, z4, AYXKKw());
    }

    public final AttributeSet AYXKKw() {
        try {
            XmlResourceParser xml = AubY().getResources().getXml(C7343ahz.FragmentManager.KWHzl);
            xml.next();
            xml.nextTag();
            return Xml.asAttributeSet(xml);
        } catch (Exception e) {
            pUU.copydefault("mln", Log.getStackTraceString(e));
            return null;
        }
    }

    public final void valueOf() {
        if (this.EZpvd == null) {
            this.EZpvd = new C7350aiF(2.8E-45f, 2.8E-45f);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] width(LuaValue[] luaValueArr) {
        valueOf();
        if (luaValueArr.length == 1) {
            float f = (float) luaValueArr[0].toDouble();
            if (f == -2.0f) {
                AhwBna(f);
                this.EZpvd.AEQbTJ(2.8E-45f);
            } else if (f == -1.0f) {
                AhwBna(f);
                this.EZpvd.AEQbTJ(Float.MIN_VALUE);
            } else if (f < 0.0f) {
                KWHzl(f);
                AhwBna(0.0f);
                this.EZpvd.AEQbTJ(0.0f);
            } else {
                AhwBna(C7865arr.copydefault(f));
                this.EZpvd.AEQbTJ(f);
            }
            KWHzl(this.EZpvd);
            return null;
        }
        return super.width(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] height(LuaValue[] luaValueArr) {
        valueOf();
        if (luaValueArr.length == 1) {
            float f = (float) luaValueArr[0].toDouble();
            if (f == -2.0f) {
                AEQbTJ(f);
                this.EZpvd.KWHzl(2.8E-45f);
            } else if (f == -1.0f) {
                AEQbTJ(f);
                this.EZpvd.KWHzl(Float.MIN_VALUE);
            } else if (f < 0.0f) {
                KWHzl(f);
                AEQbTJ(0.0f);
                this.EZpvd.KWHzl(0.0f);
            } else {
                AEQbTJ(C7865arr.copydefault(f));
                this.EZpvd.KWHzl(f);
            }
            KWHzl(this.EZpvd);
            return null;
        }
        return super.height(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] padding(LuaValue[] luaValueArr) {
        f_().djBIcL().setPaddingRelative(C7865arr.copydefault((float) luaValueArr[3].toDouble()), C7865arr.copydefault((float) luaValueArr[0].toDouble()), C7865arr.copydefault((float) luaValueArr[1].toDouble()), C7865arr.copydefault((float) luaValueArr[2].toDouble()));
        return null;
    }

    public void KWHzl(C7350aiF c7350aiF) {
        f_().setContentSize(c7350aiF);
    }

    @InterfaceC60044zuT
    public LuaValue[] contentSize(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(new UDSize(this.globals, f_().EZpvd()));
        }
        KWHzl(((UDSize) luaValueArr[0]).AEQbTJ());
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] contentOffset(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(new UDPoint(this.globals, f_().AEQbTJ()));
        }
        f_().setContentOffset(((UDPoint) luaValueArr[0]).EZpvd());
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollEnabled(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            f_().djBIcL().setEnabled(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(f_().djBIcL().isEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] showsHorizontalScrollIndicator(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            f_().setHorizontalScrollBarEnabled(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(f_().isHorizontalScrollBarEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] showsVerticalScrollIndicator(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            f_().setVerticalScrollBarEnabled(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(f_().isVerticalScrollBarEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollEnable(LuaValue[] luaValueArr) {
        f_().setScrollEnable(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_bounces(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0 || !luaValueArr[0].isBoolean()) {
            return null;
        }
        f_().setBouncesEnabled(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: android.view.ViewGroup */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    public void KWHzl(UDView uDView, int i) {
        View viewF_;
        ViewGroup viewGroupAYXKKw = f_().AYXKKw();
        if (viewGroupAYXKKw == 0 || (viewF_ = uDView.f_()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewF_.getLayoutParams();
        if (viewGroupAYXKKw instanceof InterfaceC7384ain) {
            InterfaceC7384ain interfaceC7384ain = (InterfaceC7384ain) viewGroupAYXKKw;
            layoutParams = interfaceC7384ain.applyChildCenter(interfaceC7384ain.applyLayoutParams(layoutParams, uDView.hBpjJd), uDView.hBpjJd);
        }
        if (i > f_().getChildCount()) {
            i = -1;
        }
        viewGroupAYXKKw.addView(C7823arB.AEQbTJ(viewF_), i, layoutParams);
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollBeginCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.djBIcL;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.djBIcL = luaFunction2;
        if (luaFunction2 == null) {
            return null;
        }
        f_().setOnScrollListener(this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.valueOf = luaFunction2;
        if (luaFunction2 == null) {
            return null;
        }
        f_().setOnScrollListener(this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollEndCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.AhwBna = luaFunction2;
        if (luaFunction2 == null) {
            return null;
        }
        f_().setOnScrollListener(this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setContentInset(LuaValue[] luaValueArr) {
        LuaValue.destroyAllParams(luaValueArr);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOffsetWithAnim(LuaValue[] luaValueArr) {
        f_().setOffsetWithAnim(((UDPoint) luaValueArr[0]).EZpvd());
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOffsetWithAnimAndTime(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            f_().setOffsetWithAnim(((UDPoint) luaValueArr[0]).EZpvd());
            luaValueArr[0].destroy();
            return null;
        }
        if (luaValueArr.length < 2) {
            return null;
        }
        UDPoint uDPoint = (UDPoint) luaValueArr[0];
        if (luaValueArr[1].isInt()) {
            f_().setOffsetWithAnim(uDPoint.EZpvd(), luaValueArr[1].toInt());
        } else {
            f_().setOffsetWithAnim(uDPoint.EZpvd());
        }
        uDPoint.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setEndDraggingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.AEQbTJ = luaFunction2;
        if (luaFunction2 == null) {
            return null;
        }
        f_().setTouchActionListener(this);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] touchBegin(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.AYXKKw = luaFunction2;
        if (luaFunction2 == null) {
            return null;
        }
        f_().setTouchActionListener(this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setStartDeceleratingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.gEmmrt = luaFunction2;
        if (luaFunction2 == null) {
            return null;
        }
        f_().setFlingListener(this);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    @InterfaceC60044zuT
    public LuaValue[] removeAllSubviews(LuaValue[] luaValueArr) {
        ViewGroup viewGroupAYXKKw = f_().AYXKKw();
        if (viewGroupAYXKKw == null) {
            return null;
        }
        viewGroupAYXKKw.removeAllViews();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] a_flingSpeed(LuaValue[] luaValueArr) {
        if (f_().AYXKKw() == null) {
            return null;
        }
        f_().setFlingSpeed(luaValueArr[0].toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshEnable(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.KWHzl = luaValueArr[0].toBoolean();
            f_().setRefreshEnable(this.KWHzl);
            return null;
        }
        return LuaValue.rBoolean(f_().OLrzqt());
    }

    @InterfaceC60044zuT
    public LuaValue[] startRefreshing(LuaValue[] luaValueArr) {
        f_().copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] stopRefreshing(LuaValue[] luaValueArr) {
        f_().KWHzl();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setRefreshingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.copydefault;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.copydefault = luaValue.toLuaFunction();
        return null;
    }

    public void OLrzqt() {
        LuaFunction luaFunction = this.copydefault;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] clipToBounds(LuaValue[] luaValueArr) {
        boolean z = luaValueArr[0].toBoolean();
        ((ViewGroup) this.dHguZz).setClipToPadding(z);
        ((ViewGroup) this.dHguZz).setClipChildren(z);
        ((InterfaceC7475akY) ((ViewGroup) this.dHguZz)).AYXKKw().setClipToPadding(z);
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7408ajK)) {
            return null;
        }
        ((InterfaceC7408ajK) v).forceClipLevel(z ? 1 : 2);
        return null;
    }

    @Override // o.InterfaceC7475akY.TaskDescription
    public void AhwBna() {
        LuaFunction luaFunction = this.djBIcL;
        if (luaFunction != null) {
            KWHzl(luaFunction);
        }
    }

    @Override // o.InterfaceC7475akY.TaskDescription
    public void DbNXlk() {
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            KWHzl(luaFunction);
        }
    }

    @Override // o.InterfaceC7475akY.TaskDescription
    public void isConnected() {
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction != null) {
            KWHzl(luaFunction);
        }
    }

    @Override // o.InterfaceC7475akY.StateListAnimator
    public void gEmmrt() {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            KWHzl(luaFunction);
        }
    }

    @Override // o.InterfaceC7475akY.StateListAnimator
    public void AuCTel() {
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            KWHzl(luaFunction);
        }
    }

    @Override // o.InterfaceC7475akY.ActionBar
    public void values() {
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            KWHzl(luaFunction);
        }
    }

    public final void KWHzl(LuaFunction luaFunction) {
        ViewGroup viewGroupDjBIcL = f_().djBIcL();
        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(viewGroupDjBIcL.getScrollX())), LuaNumber.copydefault(C7865arr.AEQbTJ(viewGroupDjBIcL.getScrollY()))));
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public boolean e_() {
        return ((ViewGroup) this.dHguZz).getClipToPadding();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public boolean d_() {
        return ((ViewGroup) this.dHguZz).getClipChildren();
    }

    @InterfaceC60044zuT
    public LuaValue[] setLottieJson(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        f_().setLottieJson(luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaterialHeader(LuaValue[] luaValueArr) {
        f_().setMaterialHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setNFTManyChainHeader(LuaValue[] luaValueArr) {
        f_().setNFTManyChainHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOKXLiteHeader(LuaValue[] luaValueArr) {
        f_().setOKXLiteHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOKXLightHeader(LuaValue[] luaValueArr) {
        f_().setOKXLightHeader();
        return null;
    }
}
