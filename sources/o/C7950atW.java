package o;

/* JADX INFO: renamed from: o.atW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7950atW extends android.view.View implements InterfaceC7948atU {
    public android.view.animation.Animation AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.OLrzqt = true;
        this.EZpvd = false;
        this.KWHzl = false;
    }

    public C7950atW(android.content.Context context) {
        this(context, null);
    }

    public C7950atW(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7950atW(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OLrzqt = false;
        this.EZpvd = false;
        this.KWHzl = false;
        copydefault();
    }

    @Override // o.InterfaceC7948atU
    public void gEmmrt() {
        this.KWHzl = true;
        AEQbTJ();
    }

    @Override // o.InterfaceC7948atU
    public void AhwBna() {
        this.KWHzl = false;
        AEQbTJ();
    }

    @Override // o.InterfaceC7948atU
    public void EZpvd() {
        setVisibility(0);
        gEmmrt();
    }

    @Override // o.InterfaceC7948atU
    public void KWHzl() {
        setVisibility(8);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.EZpvd = false;
        AEQbTJ();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.EZpvd = true;
        AEQbTJ();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.OLrzqt = i == 0;
        AEQbTJ();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void OLrzqt() {
        if (this.AEQbTJ == null) {
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(800L);
            rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setRepeatMode(1);
            this.AEQbTJ = rotateAnimation;
        }
    }

    public final void AEQbTJ() {
        if (this.KWHzl && this.OLrzqt && this.EZpvd) {
            OLrzqt();
            clearAnimation();
            startAnimation(this.AEQbTJ);
            return;
        }
        clearAnimation();
    }
}
