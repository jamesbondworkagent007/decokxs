package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7818aqx extends C7774aqF implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    public final C7808aqn ejfBZ;
    public final C7904asd getNewProxyInstance;
    public final C7907asg uzCIH;

    public C7818aqx(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
        this.ejfBZ = new C7808aqn();
        this.getNewProxyInstance = new C7904asd();
        this.uzCIH = new C7907asg();
    }

    @Override // com.okinc.core.widget.rtlviewpager.RtlViewPager, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7808aqn c7808aqn = this.ejfBZ;
        if (c7808aqn != null) {
            c7808aqn.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.getNewProxyInstance;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.ejfBZ.setBgColor(i);
        C7823arB.AEQbTJ(this, this.ejfBZ);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.ejfBZ.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.ejfBZ);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.getNewProxyInstance.AEQbTJ(z);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.ejfBZ.getBgColor();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.ejfBZ.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.ejfBZ);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.getNewProxyInstance.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.uzCIH.EZpvd(i, c7350aiF, f, f2);
        this.uzCIH.AEQbTJ(this);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.ejfBZ.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.ejfBZ);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.ejfBZ.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.ejfBZ);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.ejfBZ.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.ejfBZ);
        this.getNewProxyInstance.KWHzl(f);
        this.uzCIH.AEQbTJ(f);
        this.uzCIH.OLrzqt(false);
        this.getNewProxyInstance.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.ejfBZ.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.ejfBZ);
        this.getNewProxyInstance.EZpvd(f, f2, f3, f4);
        this.getNewProxyInstance.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.ejfBZ.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.ejfBZ);
        this.getNewProxyInstance.OLrzqt(this.ejfBZ);
        this.getNewProxyInstance.AEQbTJ(2);
        this.uzCIH.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.ejfBZ.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.ejfBZ);
        this.getNewProxyInstance.OLrzqt(this.ejfBZ);
        this.uzCIH.OLrzqt(false);
    }

    @Override // o.InterfaceC7408ajK
    public void initCornerManager(boolean z) {
        this.getNewProxyInstance.EZpvd(z);
    }

    @Override // o.InterfaceC7408ajK
    public void forceClipLevel(int i) {
        this.getNewProxyInstance.KWHzl(i);
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.ejfBZ.getStrokeWidth();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.ejfBZ.getCornerRadiusWithDirection(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.ejfBZ.getRadii();
    }

    @Override // o.C7774aqF, androidx.viewpager.widget.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.getNewProxyInstance.AEQbTJ(i, i2, this.ejfBZ.getStrokeWidth());
    }

    @Override // o.C7774aqF, androidx.viewpager.widget.ViewPager, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.getNewProxyInstance.OLrzqt()) {
            this.getNewProxyInstance.AEQbTJ(canvas, (C7904asd.Application) this, false);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.C7904asd.Application
    public void innerDraw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            this.ejfBZ.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.ejfBZ.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.ejfBZ);
    }
}
