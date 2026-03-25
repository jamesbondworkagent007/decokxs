package o;

import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import o.C57923yra;

/* JADX INFO: renamed from: o.yro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57937yro extends AbstractC57946yrx implements InterfaceC57927yre {
    public float AEQbTJ;
    public long AYXKKw;
    public android.graphics.Paint AhwBna;
    public boolean EZpvd;
    public android.animation.TimeInterpolator KWHzl;
    public int OLrzqt;
    public boolean copydefault;
    public int djBIcL;
    public boolean gEmmrt;

    public C57937yro(android.content.Context context) {
        this(context, null);
    }

    public C57937yro(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.djBIcL = -1118482;
        this.OLrzqt = -1615546;
        this.AYXKKw = 0L;
        this.copydefault = false;
        this.KWHzl = new android.view.animation.AccelerateDecelerateInterpolator();
        setMinimumHeight(InterpolatorC57905yrI.OLrzqt(60.0f));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57923yra.StateListAnimator.AEQbTJ);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AhwBna = paint;
        paint.setColor(-1);
        this.AhwBna.setStyle(Paint.Style.FILL);
        this.AhwBna.setAntiAlias(true);
        C57940yrr c57940yrr = C57940yrr.KWHzl;
        this.AuCTelauCTel = c57940yrr;
        this.AuCTelauCTel = C57940yrr.djBIcL[typedArrayObtainStyledAttributes.getInt(C57923yra.StateListAnimator.EZpvd, c57940yrr.AYXKKw)];
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.KWHzl)) {
            copydefault(typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.KWHzl, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.OLrzqt)) {
            AEQbTJ(typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.OLrzqt, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.AEQbTJ = InterpolatorC57905yrI.OLrzqt(4.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = java.lang.Math.min(width, height);
        float f = this.AEQbTJ;
        float f2 = (fMin - (f * 2.0f)) / 6.0f;
        float f3 = width / 2.0f;
        float f4 = f2 * 2.0f;
        float f5 = height / 2.0f;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int i = 0;
        while (i < 3) {
            int i2 = i + 1;
            float interpolation = this.KWHzl.getInterpolation((jCurrentTimeMillis - this.AYXKKw) - ((long) (i2 * 120)) > 0 ? (r11 % 750) / 750.0f : 0.0f);
            canvas.save();
            float f6 = i;
            canvas.translate((f4 * f6) + (f3 - (f + f4)) + (this.AEQbTJ * f6), f5);
            float f7 = f4;
            if (interpolation < 0.5d) {
                float f8 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f8, f8);
            } else {
                float f9 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f9, f9);
            }
            canvas.drawCircle(0.0f, 0.0f, f2, this.AhwBna);
            canvas.restore();
            f4 = f7;
            i = i2;
        }
        super.dispatchDraw(canvas);
        if (this.copydefault) {
            invalidate();
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void KWHzl(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        if (this.copydefault) {
            return;
        }
        invalidate();
        this.copydefault = true;
        this.AYXKKw = java.lang.System.currentTimeMillis();
        this.AhwBna.setColor(this.OLrzqt);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        this.copydefault = false;
        this.AYXKKw = 0L;
        this.AhwBna.setColor(this.djBIcL);
        return 0;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... iArr) {
        if (!this.EZpvd && iArr.length > 1) {
            AEQbTJ(iArr[0]);
            this.EZpvd = false;
        }
        if (this.gEmmrt) {
            return;
        }
        if (iArr.length > 1) {
            copydefault(iArr[1]);
        } else if (iArr.length > 0) {
            copydefault(ColorUtils.compositeColors(-1711276033, iArr[0]));
        }
        this.gEmmrt = false;
    }

    public C57937yro copydefault(@androidx.annotation.ColorInt int i) {
        this.djBIcL = i;
        this.gEmmrt = true;
        if (!this.copydefault) {
            this.AhwBna.setColor(i);
        }
        return this;
    }

    public C57937yro AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
        this.EZpvd = true;
        if (this.copydefault) {
            this.AhwBna.setColor(i);
        }
        return this;
    }
}
