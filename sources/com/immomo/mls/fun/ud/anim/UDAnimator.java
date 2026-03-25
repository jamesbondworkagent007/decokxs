package com.immomo.mls.fun.ud.anim;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7366aiV;
import o.InterfaceC7835arN;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDAnimator extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public InterfaceC7835arN AEQbTJ;
    public InterfaceC7835arN EZpvd;
    public InterfaceC7835arN KWHzl;
    public InterfaceC7835arN OLrzqt;
    public InterfaceC7835arN copydefault;

    public UDAnimator() {
        EZpvd();
    }

    public final void EZpvd() {
        addUpdateListener(this);
        setInterpolator(C7366aiV.gEmmrt);
        addListener(this);
        setFloatValues(0.0f, 1.0f);
    }

    @LuaBridge
    public void setRepeat(int i, int i2) {
        if (i == 0) {
            i2 = 0;
        }
        if (i2 < 0) {
            i2 = -1;
        }
        setRepeatCount(i2);
        setRepeatMode(i);
    }

    @LuaBridge
    public void setDuration(float f) {
        setDuration((long) (f * 1000.0f));
    }

    @LuaBridge
    public void setDelay(float f) {
        setStartDelay((long) (f * 1000.0f));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @LuaBridge
    public void start() {
        if (super.isRunning()) {
            return;
        }
        super.start();
    }

    @LuaBridge
    public void stop() {
        if (isStarted()) {
            end();
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @LuaBridge
    public void cancel() {
        super.cancel();
    }

    @LuaBridge
    public void setStartCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.OLrzqt;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.OLrzqt = interfaceC7835arN;
    }

    @LuaBridge
    public void setStopCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.KWHzl;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.KWHzl = interfaceC7835arN;
    }

    @LuaBridge
    public void setCancelCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.EZpvd;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.EZpvd = interfaceC7835arN;
    }

    @LuaBridge
    public void setRepeatCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.AEQbTJ;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.AEQbTJ = interfaceC7835arN;
    }

    @LuaBridge
    public void setOnAnimationUpdateCallback(InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7835arN interfaceC7835arN2 = this.copydefault;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        this.copydefault = interfaceC7835arN;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @LuaBridge
    public boolean isRunning() {
        return super.isRunning();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Landroid/animation/Animator; */
    /* JADX DEBUG: Method merged with bridge method: clone()Landroid/animation/ValueAnimator; */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    @LuaBridge
    public UDAnimator clone() {
        UDAnimator uDAnimator = new UDAnimator();
        uDAnimator.setRepeatCount(getRepeatCount());
        uDAnimator.setRepeatMode(getRepeatMode());
        uDAnimator.setDuration(getDuration());
        uDAnimator.setStartDelay(getStartDelay());
        return uDAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InterfaceC7835arN interfaceC7835arN = this.copydefault;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(Float.valueOf(fFloatValue));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        InterfaceC7835arN interfaceC7835arN = this.OLrzqt;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        InterfaceC7835arN interfaceC7835arN = this.KWHzl;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        InterfaceC7835arN interfaceC7835arN = this.EZpvd;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        InterfaceC7835arN interfaceC7835arN = this.AEQbTJ;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    @LuaBridge
    public void setBezierPath(float f, float f2, float f3, float f4) {
        setInterpolator(new PathInterpolator(f, f2, f3, f4));
    }

    public void KWHzl() {
        InterfaceC7835arN interfaceC7835arN = this.OLrzqt;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.OLrzqt();
        }
        InterfaceC7835arN interfaceC7835arN2 = this.KWHzl;
        if (interfaceC7835arN2 != null) {
            interfaceC7835arN2.OLrzqt();
        }
        InterfaceC7835arN interfaceC7835arN3 = this.EZpvd;
        if (interfaceC7835arN3 != null) {
            interfaceC7835arN3.OLrzqt();
        }
        InterfaceC7835arN interfaceC7835arN4 = this.AEQbTJ;
        if (interfaceC7835arN4 != null) {
            interfaceC7835arN4.OLrzqt();
        }
        this.OLrzqt = null;
        this.KWHzl = null;
        this.EZpvd = null;
        this.AEQbTJ = null;
        cancel();
    }
}
