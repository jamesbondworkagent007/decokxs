package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7816aqv extends C7775aqG implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    public final C7904asd AEQbTJ;
    public final C7907asg AhwBna;
    public boolean EZpvd;
    public final C7808aqn copydefault;

    public C7816aqv(android.content.Context context) {
        super(context);
        this.copydefault = new C7808aqn();
        this.AEQbTJ = new C7904asd();
        this.AhwBna = new C7907asg();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7808aqn c7808aqn = this.copydefault;
        if (c7808aqn != null) {
            c7808aqn.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.AEQbTJ;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.copydefault.setBgColor(i);
        C7823arB.AEQbTJ(this, this.copydefault);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.copydefault.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.copydefault);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.AEQbTJ.AEQbTJ(z);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.copydefault.getBgColor();
    }

    @Override // o.InterfaceC7408ajK
    public void initCornerManager(boolean z) {
        this.AEQbTJ.EZpvd(z);
    }

    @Override // o.InterfaceC7408ajK
    public void forceClipLevel(int i) {
        this.AEQbTJ.KWHzl(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.copydefault.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.copydefault);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.AEQbTJ.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.AhwBna.EZpvd(i, c7350aiF, f, f2);
        this.AhwBna.AEQbTJ(this);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.copydefault.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.copydefault);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.copydefault.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.copydefault);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.EZpvd = f != 0.0f;
        this.copydefault.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.copydefault);
        this.AEQbTJ.KWHzl(f);
        this.AhwBna.AEQbTJ(f);
        this.AhwBna.OLrzqt(false);
        this.AEQbTJ.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.EZpvd = (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) ? false : true;
        this.copydefault.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.copydefault);
        this.AEQbTJ.EZpvd(f, f2, f3, f4);
        this.AEQbTJ.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.EZpvd = this.EZpvd || f != 0.0f;
        this.copydefault.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.copydefault);
        this.AEQbTJ.OLrzqt(this.copydefault);
        this.AEQbTJ.AEQbTJ(2);
        this.AhwBna.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.EZpvd = this.EZpvd || f != 0.0f;
        this.copydefault.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.copydefault);
        this.AEQbTJ.OLrzqt(this.copydefault);
        this.AhwBna.OLrzqt(false);
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.copydefault.getStrokeWidth();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.copydefault.getCornerRadiusWithDirection(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.copydefault.getRadii();
    }

    public void copydefault(android.graphics.Canvas canvas) {
        this.copydefault.copydefault(canvas);
    }

    @Override // o.C7775aqG, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.AEQbTJ.AEQbTJ(i, i2, this.copydefault.getStrokeWidth());
    }

    @Override // o.C7775aqG, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.AEQbTJ.OLrzqt()) {
            this.AEQbTJ.AEQbTJ(canvas, (C7904asd.Application) this, false);
        } else {
            super.draw(canvas);
        }
        copydefault(canvas);
    }

    @Override // o.C7904asd.Application
    public void innerDraw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            this.copydefault.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.copydefault.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.copydefault);
    }
}
