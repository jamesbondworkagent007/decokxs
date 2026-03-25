package o;

import androidx.appcompat.widget.AppCompatImageView;
import o.C31351lsQ;

/* JADX INFO: loaded from: classes7.dex */
public class lSR extends AppCompatImageView {
    public int AEQbTJ;
    public float AYXKKw;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public float copydefault;
    public int djBIcL;
    public int gEmmrt;

    public lSR(android.content.Context context) {
        this(context, null);
        copydefault(context, null);
    }

    public lSR(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        copydefault(context, attributeSet);
    }

    public lSR(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AEQbTJ = 0;
        copydefault(context, attributeSet);
    }

    private void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31351lsQ.LoaderManager.AEQbTJ);
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C31351lsQ.LoaderManager.gEmmrt, this.AEQbTJ);
        this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C31351lsQ.LoaderManager.EZpvd, this.AEQbTJ);
        this.djBIcL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C31351lsQ.LoaderManager.valueOf, this.AEQbTJ);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C31351lsQ.LoaderManager.djBIcL, this.AEQbTJ);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C31351lsQ.LoaderManager.KWHzl, this.AEQbTJ);
        this.KWHzl = dimensionPixelOffset;
        int i = this.AEQbTJ;
        if (i == this.EZpvd) {
            this.EZpvd = this.OLrzqt;
        }
        if (i == this.djBIcL) {
            this.djBIcL = this.OLrzqt;
        }
        if (i == this.gEmmrt) {
            this.gEmmrt = this.OLrzqt;
        }
        if (i == dimensionPixelOffset) {
            this.KWHzl = this.OLrzqt;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.AYXKKw = getWidth();
        this.copydefault = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int iMax = java.lang.Math.max(this.EZpvd, this.KWHzl);
        int iMax2 = java.lang.Math.max(this.djBIcL, this.gEmmrt);
        int iMax3 = java.lang.Math.max(this.EZpvd, this.djBIcL);
        int iMax4 = java.lang.Math.max(this.KWHzl, this.gEmmrt);
        if (this.AYXKKw >= iMax + iMax2 && this.copydefault > iMax3 + iMax4) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(this.EZpvd, 0.0f);
            path.lineTo(this.AYXKKw - this.djBIcL, 0.0f);
            float f = this.AYXKKw;
            path.quadTo(f, 0.0f, f, this.djBIcL);
            path.lineTo(this.AYXKKw, this.copydefault - this.gEmmrt);
            float f2 = this.AYXKKw;
            float f3 = this.copydefault;
            path.quadTo(f2, f3, f2 - this.gEmmrt, f3);
            path.lineTo(this.KWHzl, this.copydefault);
            float f4 = this.copydefault;
            path.quadTo(0.0f, f4, 0.0f, f4 - this.KWHzl);
            path.lineTo(0.0f, this.EZpvd);
            path.quadTo(0.0f, 0.0f, this.EZpvd, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }
}
