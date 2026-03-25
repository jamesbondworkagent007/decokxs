package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7810aqp extends C7772aqD implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    public final C7907asg AkhnZx;
    public final C7904asd fetchVPNInfo;
    public boolean isConnected;
    public final C7808aqn values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.isConnected;
    }

    public C7810aqp(android.content.Context context) {
        super(context);
        this.values = new C7808aqn();
        this.fetchVPNInfo = new C7904asd();
        this.AkhnZx = new C7907asg();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7808aqn c7808aqn = this.values;
        if (c7808aqn != null) {
            c7808aqn.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.fetchVPNInfo;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.values.setBgColor(i);
        C7823arB.AEQbTJ(this, this.values);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.values.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.values);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.fetchVPNInfo.AEQbTJ(z);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.values.getBgColor();
    }

    @Override // o.InterfaceC7408ajK
    public void initCornerManager(boolean z) {
        this.fetchVPNInfo.EZpvd(z);
    }

    @Override // o.InterfaceC7408ajK
    public void forceClipLevel(int i) {
        this.fetchVPNInfo.KWHzl(1);
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.values.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.values);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.fetchVPNInfo.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.AkhnZx.EZpvd(i, c7350aiF, f, f2);
        this.AkhnZx.AEQbTJ(this);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.values.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.values);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.values.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.values);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.isConnected = f != 0.0f;
        this.values.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.values);
        this.fetchVPNInfo.KWHzl(f);
        this.AkhnZx.AEQbTJ(f);
        this.AkhnZx.OLrzqt(false);
        this.fetchVPNInfo.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.isConnected = (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) ? false : true;
        this.values.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.values);
        this.fetchVPNInfo.EZpvd(f, f2, f3, f4);
        this.fetchVPNInfo.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.isConnected = this.isConnected || f != 0.0f;
        this.values.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.values);
        this.fetchVPNInfo.OLrzqt(this.values);
        this.fetchVPNInfo.AEQbTJ(2);
        this.AkhnZx.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.isConnected = this.isConnected || f != 0.0f;
        this.values.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.values);
        this.fetchVPNInfo.OLrzqt(this.values);
        this.AkhnZx.OLrzqt(false);
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.values.getStrokeWidth();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.values.getCornerRadiusWithDirection(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.values.getRadii();
    }

    public void copydefault(android.graphics.Canvas canvas) {
        this.values.copydefault(canvas);
    }

    @Override // o.C7772aqD, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.fetchVPNInfo.AEQbTJ(i, i2, this.values.getStrokeWidth());
    }

    @Override // o.C7772aqD, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.fetchVPNInfo.OLrzqt()) {
            this.fetchVPNInfo.AEQbTJ(canvas, (C7904asd.Application) this, false);
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
            this.values.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.values.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.values);
    }
}
