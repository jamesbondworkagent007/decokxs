package o;

import o.C7904asd;

/* JADX INFO: renamed from: o.aqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7812aqr extends C7771aqC implements InterfaceC7410ajM, InterfaceC7408ajK, C7904asd.Application {
    private final C7808aqn backgroundDrawable;
    private final C7904asd viewClipHelper;
    private final C7907asg viewShadowHelper;

    public C7812aqr(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
        this.backgroundDrawable = new C7808aqn();
        this.viewClipHelper = new C7904asd();
        this.viewShadowHelper = new C7907asg();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C7808aqn c7808aqn = this.backgroundDrawable;
        if (c7808aqn != null) {
            c7808aqn.setLayoutDirection(i);
        }
        C7904asd c7904asd = this.viewClipHelper;
        if (c7904asd != null) {
            c7904asd.OLrzqt(i);
        }
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.backgroundDrawable.setBgColor(i);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.backgroundDrawable.setBgDrawable(drawable);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
        this.viewClipHelper.AEQbTJ(z);
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.backgroundDrawable.getBgColor();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        this.backgroundDrawable.setGradientColor(i, i2, i3);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
        this.viewClipHelper.copydefault(i);
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
        this.viewShadowHelper.EZpvd(i, c7350aiF, f, f2);
        this.viewShadowHelper.AEQbTJ(this);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.backgroundDrawable.setStrokeWidth(f);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.backgroundDrawable.setStrokeColor(i);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }

    public void setGradientStrokeColor(int[] iArr) {
        this.backgroundDrawable.EZpvd(iArr);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        this.backgroundDrawable.setCornerRadius(f);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
        this.viewClipHelper.KWHzl(f);
        this.viewShadowHelper.AEQbTJ(f);
        this.viewShadowHelper.OLrzqt(false);
        this.viewClipHelper.AEQbTJ(1);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.backgroundDrawable.OLrzqt(f, f2, f3, f4);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
        this.viewClipHelper.EZpvd(f, f2, f3, f4);
        this.viewClipHelper.AEQbTJ(1);
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.backgroundDrawable.setRadius(i, f);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
        this.viewClipHelper.OLrzqt(this.backgroundDrawable);
        this.viewClipHelper.AEQbTJ(2);
        this.viewShadowHelper.OLrzqt(true);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.backgroundDrawable.setMaskRadius(i, f);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
        this.viewClipHelper.OLrzqt(this.backgroundDrawable);
        this.viewShadowHelper.OLrzqt(false);
    }

    @Override // o.InterfaceC7408ajK
    public void initCornerManager(boolean z) {
        this.viewClipHelper.EZpvd(z);
    }

    @Override // o.InterfaceC7408ajK
    public void forceClipLevel(int i) {
        this.viewClipHelper.KWHzl(i);
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.backgroundDrawable.getStrokeWidth();
    }

    public int getStrokeColor() {
        return this.backgroundDrawable.AEQbTJ();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return this.backgroundDrawable.getCornerRadiusWithDirection(i);
    }

    public float getRadius(int i) {
        return this.backgroundDrawable.OLrzqt(i);
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.backgroundDrawable.getRadii();
    }

    public void drawBorder(android.graphics.Canvas canvas) {
        this.backgroundDrawable.copydefault(canvas);
    }

    @Override // o.C7771aqC, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewClipHelper.AEQbTJ(i, i2, this.backgroundDrawable.getStrokeWidth());
    }

    @Override // o.C7771aqC, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.viewClipHelper.OLrzqt()) {
            this.viewClipHelper.AEQbTJ(canvas, this, C7904asd.AEQbTJ(this));
        } else {
            super.draw(canvas);
        }
        drawBorder(canvas);
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
            this.backgroundDrawable.EZpvd(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (z) {
            setClickable(true);
        }
        this.backgroundDrawable.setDrawRipple(z);
        C7823arB.AEQbTJ(this, this.backgroundDrawable);
    }
}
