package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7811aqq extends C55001xbh implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    public final C7904asd KWHzl;
    public final C7805aqk OLrzqt;
    public final C7907asg gEmmrt;

    public C7811aqq(android.content.Context context) {
        super(context);
        this.OLrzqt = new C7805aqk();
        this.KWHzl = new C7904asd(this);
        this.gEmmrt = new C7907asg();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7805aqk c7805aqk = this.OLrzqt;
        if (c7805aqk != null) {
            c7805aqk.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.KWHzl;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.OLrzqt.setBgColor(i);
        C7823arB.AEQbTJ(this, this.OLrzqt);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.OLrzqt.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.OLrzqt);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.OLrzqt.getBgColor();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.OLrzqt.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.OLrzqt);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.KWHzl.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.gEmmrt.EZpvd(i, c7350aiF, f, f2);
        this.gEmmrt.AEQbTJ(this);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.KWHzl.AEQbTJ(z);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.OLrzqt.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.OLrzqt);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.OLrzqt.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.OLrzqt);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.OLrzqt.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.OLrzqt);
        this.KWHzl.KWHzl(f);
        this.gEmmrt.AEQbTJ(f);
        this.gEmmrt.OLrzqt(false);
        this.KWHzl.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.OLrzqt.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.OLrzqt);
        this.KWHzl.EZpvd(f, f2, f3, f4);
        this.KWHzl.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.OLrzqt.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.OLrzqt);
        this.KWHzl.OLrzqt(this.OLrzqt);
        this.KWHzl.AEQbTJ(2);
        this.gEmmrt.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.OLrzqt.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.OLrzqt);
        this.KWHzl.OLrzqt(this.OLrzqt);
        this.gEmmrt.OLrzqt(false);
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
        return this.OLrzqt.getStrokeWidth();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.OLrzqt.getCornerRadiusWithDirection(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.OLrzqt.getRadii();
    }

    public void KWHzl(android.graphics.Canvas canvas) {
        this.OLrzqt.copydefault(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.KWHzl.AEQbTJ(i, i2, this.OLrzqt.getStrokeWidth());
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.KWHzl.OLrzqt()) {
            this.KWHzl.AEQbTJ(canvas, (C7904asd.Application) this, false);
        } else {
            super.draw(canvas);
        }
        KWHzl(canvas);
    }

    @Override // o.C7904asd.Application
    public void innerDraw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            this.OLrzqt.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.OLrzqt.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.OLrzqt);
    }
}
