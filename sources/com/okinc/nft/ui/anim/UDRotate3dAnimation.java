package com.okinc.nft.ui.anim;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation;
import com.immomo.mls.fun.ud.view.UDView;
import o.C43550rrR;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UDRotate3dAnimation extends UDBaseAnimation {
    public static final String[] KWHzl = {"startRotateFromView"};
    public UDView AuCTel;
    public Globals EZpvd;
    public LuaFunction OLrzqt;
    public Boolean ejfBZ;
    public UDView fARcdN;
    public Float fIwbmz;
    public Float fJNWhG;
    public C43550rrR getNewProxyInstance;

    public UDRotate3dAnimation(Globals globals, LuaValue[] luaValueArr) {
        super(globals, luaValueArr);
        this.ejfBZ = Boolean.TRUE;
        this.EZpvd = globals;
    }

    @LuaBridge
    public void startRotateFromView(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2 = luaValueArr[0];
        if (luaValue2 == null || (luaValue = luaValueArr[1]) == null) {
            return;
        }
        UDView uDView = (UDView) luaValue2;
        UDView uDView2 = (UDView) luaValue;
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.OLrzqt = luaValueArr.length > 2 ? (LuaFunction) luaValueArr[2] : null;
        C43550rrR c43550rrR = this.getNewProxyInstance;
        if (c43550rrR == null || c43550rrR.hasEnded()) {
            this.fIwbmz = Float.valueOf(Math.min(uDView.zLjUOn(), uDView2.zLjUOn()));
            this.fJNWhG = Float.valueOf(Math.min(uDView.AuCTelauCTel(), uDView2.AuCTelauCTel()));
            if (this.fARcdN == null && this.AuCTel == null) {
                this.fARcdN = uDView;
                this.AuCTel = uDView2;
                this.ejfBZ = Boolean.TRUE;
            }
            if (this.getNewProxyInstance == null) {
                this.getNewProxyInstance = copydefault();
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation EZpvd() {
        this.getNewProxyInstance.cancel();
        return this.getNewProxyInstance;
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public UDBaseAnimation KWHzl() {
        UDRotate3dAnimation uDRotate3dAnimation = new UDRotate3dAnimation(this.EZpvd, null);
        uDRotate3dAnimation.getNewProxyInstance = this.getNewProxyInstance;
        return uDRotate3dAnimation;
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (this.ejfBZ.booleanValue()) {
            this.fARcdN.f_().setVisibility(8);
            this.AuCTel.f_().setVisibility(0);
            ((ViewGroup) this.fARcdN.f_().getParent()).startAnimation(djBIcL());
            LuaFunction luaFunction = this.OLrzqt;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
            this.copydefault = null;
        } else {
            this.fARcdN.f_().setVisibility(0);
            this.AuCTel.f_().setVisibility(8);
            ((ViewGroup) this.fARcdN.f_().getParent()).startAnimation(djBIcL());
            LuaFunction luaFunction2 = this.OLrzqt;
            if (luaFunction2 != null) {
                luaFunction2.OLrzqt();
            }
            this.copydefault = null;
        }
        this.ejfBZ = Boolean.valueOf(!this.ejfBZ.booleanValue());
        super.onAnimationEnd(animation);
    }

    public final C43550rrR copydefault() {
        C43550rrR c43550rrR = new C43550rrR(0.0f, 90.0f, this.fIwbmz.floatValue(), this.fJNWhG.floatValue(), 500.0f, true);
        c43550rrR.setDuration(this.gEmmrt);
        c43550rrR.setFillAfter(true);
        c43550rrR.setInterpolator(new DecelerateInterpolator());
        return c43550rrR;
    }

    public final C43550rrR djBIcL() {
        C43550rrR c43550rrR = new C43550rrR(270.0f, 360.0f, this.fIwbmz.floatValue(), this.fIwbmz.floatValue(), 500.0f, false);
        c43550rrR.setDuration(this.gEmmrt);
        c43550rrR.setFillAfter(true);
        c43550rrR.setInterpolator(new DecelerateInterpolator());
        return c43550rrR;
    }
}
