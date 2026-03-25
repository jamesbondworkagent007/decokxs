package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7815aqu extends C7820aqz implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    public final C7907asg AEQbTJ;
    public final C7808aqn EZpvd;
    public final C7904asd KWHzl;

    public C7815aqu(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
        this.EZpvd = new C7808aqn();
        this.KWHzl = new C7904asd();
        this.AEQbTJ = new C7907asg();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7808aqn c7808aqn = this.EZpvd;
        if (c7808aqn != null) {
            c7808aqn.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.KWHzl;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.EZpvd.setBgColor(i);
        C7823arB.AEQbTJ(this, this.EZpvd);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.EZpvd.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.EZpvd);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.KWHzl.AEQbTJ(z);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.EZpvd.getBgColor();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.EZpvd.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.EZpvd);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.KWHzl.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.AEQbTJ.EZpvd(i, c7350aiF, f, f2);
        this.AEQbTJ.AEQbTJ(this);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.EZpvd.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.EZpvd);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.EZpvd.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.EZpvd);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.EZpvd.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.EZpvd);
        this.KWHzl.KWHzl(f);
        this.AEQbTJ.AEQbTJ(f);
        this.AEQbTJ.OLrzqt(false);
        this.KWHzl.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.EZpvd.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.EZpvd);
        this.KWHzl.EZpvd(f, f2, f3, f4);
        this.KWHzl.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.EZpvd.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.EZpvd);
        this.KWHzl.OLrzqt(this.EZpvd);
        this.KWHzl.AEQbTJ(2);
        this.AEQbTJ.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.EZpvd.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.EZpvd);
        this.KWHzl.OLrzqt(this.EZpvd);
        this.AEQbTJ.OLrzqt(false);
    }

    @Override // o.InterfaceC7408ajK
    public void initCornerManager(boolean z) {
        this.KWHzl.EZpvd(z);
    }

    @Override // o.InterfaceC7408ajK
    public void forceClipLevel(int i) {
        this.KWHzl.KWHzl(i);
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.EZpvd.getStrokeWidth();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.EZpvd.getCornerRadiusWithDirection(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.EZpvd.getRadii();
    }

    public void AEQbTJ(android.graphics.Canvas canvas) {
        this.EZpvd.copydefault(canvas);
    }

    @Override // o.C7820aqz, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.KWHzl.AEQbTJ(i, i2, this.EZpvd.getStrokeWidth());
    }

    @Override // o.C7820aqz, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.KWHzl.OLrzqt()) {
            this.KWHzl.AEQbTJ(canvas, this, C7904asd.AEQbTJ(this));
        } else {
            super.draw(canvas);
        }
        AEQbTJ(canvas);
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
            this.EZpvd.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.EZpvd.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.EZpvd);
    }
}
