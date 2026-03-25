package o;

import androidx.appcompat.widget.AppCompatImageView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55064xcr extends AppCompatImageView {
    public int AEQbTJ;
    public float EZpvd;
    public final android.graphics.Path KWHzl;
    public int OLrzqt;
    public int copydefault;
    public float djBIcL;
    public int gEmmrt;

    public C55064xcr(android.content.Context context) {
        this(context, null);
        KWHzl(context, null);
    }

    public C55064xcr(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        KWHzl(context, attributeSet);
    }

    public C55064xcr(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = new android.graphics.Path();
        KWHzl(context, attributeSet);
    }

    private void KWHzl(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.dcEsSD);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.sjbWxX, 0);
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.DjzMc, 0);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.GVpNrs, 0);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.fVBECu, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.sGvRiA, 0);
        this.copydefault = dimensionPixelOffset2;
        if (this.OLrzqt == 0) {
            this.OLrzqt = dimensionPixelOffset;
        }
        if (this.gEmmrt == 0) {
            this.gEmmrt = dimensionPixelOffset;
        }
        if (this.AEQbTJ == 0) {
            this.AEQbTJ = dimensionPixelOffset;
        }
        if (dimensionPixelOffset2 == 0) {
            this.copydefault = dimensionPixelOffset;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.djBIcL = getWidth();
        this.EZpvd = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int iMax = java.lang.Math.max(this.OLrzqt, this.copydefault);
        int iMax2 = java.lang.Math.max(this.gEmmrt, this.AEQbTJ);
        int iMax3 = java.lang.Math.max(this.OLrzqt, this.gEmmrt);
        int iMax4 = java.lang.Math.max(this.copydefault, this.AEQbTJ);
        if (this.djBIcL >= iMax + iMax2 && this.EZpvd > iMax3 + iMax4) {
            this.KWHzl.reset();
            this.KWHzl.moveTo(this.OLrzqt, 0.0f);
            this.KWHzl.lineTo(this.djBIcL - this.gEmmrt, 0.0f);
            android.graphics.Path path = this.KWHzl;
            float f = this.djBIcL;
            path.quadTo(f, 0.0f, f, this.gEmmrt);
            this.KWHzl.lineTo(this.djBIcL, this.EZpvd - this.AEQbTJ);
            android.graphics.Path path2 = this.KWHzl;
            float f2 = this.djBIcL;
            float f3 = this.EZpvd;
            path2.quadTo(f2, f3, f2 - this.AEQbTJ, f3);
            this.KWHzl.lineTo(this.copydefault, this.EZpvd);
            android.graphics.Path path3 = this.KWHzl;
            float f4 = this.EZpvd;
            path3.quadTo(0.0f, f4, 0.0f, f4 - this.copydefault);
            this.KWHzl.lineTo(0.0f, this.OLrzqt);
            this.KWHzl.quadTo(0.0f, 0.0f, this.OLrzqt, 0.0f);
            canvas.clipPath(this.KWHzl);
        }
        super.onDraw(canvas);
    }
}
