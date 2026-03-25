package o;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import androidx.camera.video.AudioStats;
import o.C35399nuc;

/* JADX INFO: renamed from: o.oHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C35885oHh extends android.widget.FrameLayout {
    public final android.graphics.Rect AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public float AkhnZx;
    public float DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public android.graphics.Bitmap OLrzqt;
    public final android.graphics.Canvas copydefault;
    public int djBIcL;
    public float gEmmrt;
    public float isConnected;
    public final android.graphics.Paint valueOf;

    public C35885oHh(android.content.Context context) {
        this(context, null);
    }

    public C35885oHh(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C35885oHh(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.graphics.Paint paint = new android.graphics.Paint(1) { // from class: o.oHh.4
            {
                setDither(true);
                setFilterBitmap(true);
            }
        };
        this.valueOf = paint;
        this.copydefault = new android.graphics.Canvas();
        this.AEQbTJ = new android.graphics.Rect();
        this.KWHzl = true;
        setWillNotDraw(false);
        setLayerType(2, paint);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35399nuc.VoiceInteractor.sSMYrx);
        try {
            setIsShadowed(typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.QOLQEE, true));
            setShadowRadius(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.QKVWgx, 30.0f));
            setShadowDistance(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.OcIXYQ, 15.0f));
            setShadowAngle(typedArrayObtainStyledAttributes.getInteger(C35399nuc.VoiceInteractor.AxsJAY, 45));
            setShadowColor(typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.DTwDnp, -12303292));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.Bitmap bitmap = this.OLrzqt;
        if (bitmap != null) {
            bitmap.recycle();
            this.OLrzqt = null;
        }
    }

    public void setIsShadowed(boolean z) {
        this.EZpvd = z;
        postInvalidate();
    }

    public void setShadowDistance(float f) {
        this.gEmmrt = f;
        AEQbTJ();
    }

    public void setShadowAngle(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 360.0d) float f) {
        this.AhwBna = java.lang.Math.max(0.0f, java.lang.Math.min(f, 360.0f));
        AEQbTJ();
    }

    public void setShadowRadius(float f) {
        this.AkhnZx = java.lang.Math.max(0.1f, f);
        if (isInEditMode()) {
            return;
        }
        this.valueOf.setMaskFilter(new BlurMaskFilter(this.AkhnZx, BlurMaskFilter.Blur.NORMAL));
        AEQbTJ();
    }

    public void setShadowColor(int i) {
        this.djBIcL = i;
        this.AYXKKw = Color.alpha(i);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        this.DbNXlk = (float) (((double) this.gEmmrt) * java.lang.Math.cos(((double) (this.AhwBna / 180.0f)) * 3.141592653589793d));
        this.isConnected = (float) (((double) this.gEmmrt) * java.lang.Math.sin(((double) (this.AhwBna / 180.0f)) * 3.141592653589793d));
        int i = (int) (this.gEmmrt + this.AkhnZx);
        setPaddingRelative(i, i, i, i);
        requestLayout();
    }

    public final int OLrzqt(boolean z) {
        return Color.argb(z ? 255 : this.AYXKKw, Color.red(this.djBIcL), Color.green(this.djBIcL), Color.blue(this.djBIcL));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.AEQbTJ.set(0, 0, View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.KWHzl = true;
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        if (this.EZpvd) {
            if (this.KWHzl) {
                if (this.AEQbTJ.width() != 0 && this.AEQbTJ.height() != 0) {
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(this.AEQbTJ.width(), this.AEQbTJ.height(), Bitmap.Config.ARGB_8888);
                    this.OLrzqt = bitmapCreateBitmap;
                    this.copydefault.setBitmap(bitmapCreateBitmap);
                    this.KWHzl = false;
                    super.dispatchDraw(this.copydefault);
                    android.graphics.Bitmap bitmapExtractAlpha = this.OLrzqt.extractAlpha();
                    this.copydefault.drawColor(0, PorterDuff.Mode.CLEAR);
                    this.valueOf.setColor(OLrzqt(false));
                    this.copydefault.drawBitmap(bitmapExtractAlpha, this.DbNXlk, this.isConnected, this.valueOf);
                    bitmapExtractAlpha.recycle();
                } else {
                    this.OLrzqt = android.graphics.Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                }
            }
            this.valueOf.setColor(OLrzqt(true));
            if (this.copydefault != null && (bitmap = this.OLrzqt) != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(this.OLrzqt, 0.0f, 0.0f, this.valueOf);
            }
        }
        super.dispatchDraw(canvas);
    }
}
