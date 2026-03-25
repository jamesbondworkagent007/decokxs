package com.immomo.mls.fun.ud.anim.canvasanim;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7366aiV;
import o.C7865arr;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(abstractClass = true)
public abstract class UDBaseAnimation implements Animation.AnimationListener {
    public Globals AhwBna;
    public InterfaceC7835arN AkhnZx;
    public Animation copydefault;
    public int djBIcL;
    public InterfaceC7835arN fetchVPNInfo;
    public int gEmmrt;
    public InterfaceC7835arN valueOf;
    public int values;
    public int DbNXlk = 0;
    public boolean AEQbTJ = false;
    public Interpolator isConnected = C7366aiV.OLrzqt(0);
    public boolean AYXKKw = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return this.djBIcL;
    }

    public abstract Animation EZpvd();

    public abstract UDBaseAnimation KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setAutoBack(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setDelay(double d) {
        this.djBIcL = (int) (d * 1000.0d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setDuration(double d) {
        this.gEmmrt = (int) (d * 1000.0d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setRepeat(int i, int i2) {
        this.values = i;
        if (i == 0) {
            i2 = 0;
        }
        this.DbNXlk = i2;
    }

    public UDBaseAnimation(Globals globals, LuaValue[] luaValueArr) {
        this.AhwBna = globals;
    }

    public void AEQbTJ() {
        InterfaceC7835arN interfaceC7835arN = this.fetchVPNInfo;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.OLrzqt();
        }
        InterfaceC7835arN interfaceC7835arN2 = this.valueOf;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        InterfaceC7835arN interfaceC7835arN3 = this.AkhnZx;
        if (interfaceC7835arN3 != null) {
            interfaceC7835arN3.OLrzqt();
        }
        this.fetchVPNInfo = null;
        this.valueOf = null;
        this.AkhnZx = null;
    }

    @LuaBridge
    public void setInterpolator(int i) {
        this.isConnected = C7366aiV.OLrzqt(i);
    }

    @LuaBridge
    public void cancel() {
        this.AYXKKw = true;
        Animation animation = this.copydefault;
        if (animation != null) {
            animation.cancel();
        }
    }

    @LuaBridge
    public void setStartCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.fetchVPNInfo;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.fetchVPNInfo = interfaceC7835arN;
    }

    @LuaBridge
    public void setEndCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.valueOf;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.valueOf = interfaceC7835arN;
    }

    @LuaBridge
    public void setRepeatCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.AkhnZx;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.AkhnZx = interfaceC7835arN;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @LuaBridge
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UDBaseAnimation m6331clone() {
        UDBaseAnimation uDBaseAnimationKWHzl = KWHzl();
        uDBaseAnimationKWHzl.values = this.values;
        uDBaseAnimationKWHzl.DbNXlk = this.DbNXlk;
        uDBaseAnimationKWHzl.AEQbTJ = this.AEQbTJ;
        uDBaseAnimationKWHzl.gEmmrt = this.gEmmrt;
        uDBaseAnimationKWHzl.djBIcL = this.djBIcL;
        uDBaseAnimationKWHzl.isConnected = this.isConnected;
        return uDBaseAnimationKWHzl;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        InterfaceC7835arN interfaceC7835arN = this.fetchVPNInfo;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        InterfaceC7835arN interfaceC7835arN = this.valueOf;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(Boolean.valueOf(!this.AYXKKw));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        InterfaceC7835arN interfaceC7835arN = this.AkhnZx;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    public Animation OLrzqt() {
        this.AYXKKw = false;
        if (this.copydefault == null) {
            this.copydefault = EZpvd();
        }
        this.copydefault.setRepeatMode(this.values);
        this.copydefault.setRepeatCount(this.DbNXlk);
        this.copydefault.setFillAfter(!this.AEQbTJ);
        this.copydefault.setFillEnabled(false);
        this.copydefault.setFillBefore(false);
        this.copydefault.setInterpolator(this.isConnected);
        this.copydefault.setDuration(this.gEmmrt);
        this.copydefault.setAnimationListener(this);
        return this.copydefault;
    }

    public static float copydefault(int i, float f) {
        return i == 0 ? C7865arr.copydefault(f) : f;
    }
}
