package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7813aqs extends C7770aqB implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    public final C7808aqn AEQbTJ;
    public final C7904asd EZpvd;
    public final C7907asg copydefault;

    public C7813aqs(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
        this.AEQbTJ = new C7808aqn();
        this.EZpvd = new C7904asd();
        this.copydefault = new C7907asg();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7808aqn c7808aqn = this.AEQbTJ;
        if (c7808aqn != null) {
            c7808aqn.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.EZpvd;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.AEQbTJ.setBgColor(i);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.AEQbTJ.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.EZpvd.AEQbTJ(z);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.AEQbTJ.getBgColor();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.AEQbTJ.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.EZpvd.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.copydefault.EZpvd(i, c7350aiF, f, f2);
        this.copydefault.AEQbTJ(this);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.AEQbTJ.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.AEQbTJ.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.AEQbTJ.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
        this.EZpvd.KWHzl(f);
        this.copydefault.AEQbTJ(f);
        this.copydefault.OLrzqt(false);
        this.EZpvd.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.AEQbTJ.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
        this.EZpvd.EZpvd(f, f2, f3, f4);
        this.EZpvd.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.AEQbTJ.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
        this.EZpvd.OLrzqt(this.AEQbTJ);
        this.EZpvd.AEQbTJ(2);
        this.copydefault.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.AEQbTJ.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
        this.EZpvd.OLrzqt(this.AEQbTJ);
        this.copydefault.OLrzqt(false);
    }

    @Override // o.InterfaceC7408ajK
    public void initCornerManager(boolean z) {
        this.EZpvd.EZpvd(z);
    }

    @Override // o.InterfaceC7408ajK
    public void forceClipLevel(int i) {
        this.EZpvd.KWHzl(i);
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.AEQbTJ.getStrokeWidth();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.AEQbTJ.getCornerRadiusWithDirection(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.AEQbTJ.getRadii();
    }

    public void OLrzqt(android.graphics.Canvas canvas) {
        this.AEQbTJ.copydefault(canvas);
    }

    @Override // o.C7770aqB, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.EZpvd.AEQbTJ(i, i2, this.AEQbTJ.getStrokeWidth());
    }

    @Override // o.C7770aqB, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.EZpvd.OLrzqt()) {
            this.EZpvd.AEQbTJ(canvas, this, C7904asd.AEQbTJ(this));
        } else {
            super.draw(canvas);
        }
        OLrzqt(canvas);
    }

    @Override // o.C7904asd.Application
    public void innerDraw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            this.AEQbTJ.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.AEQbTJ.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.AEQbTJ);
    }
}
