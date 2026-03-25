package o;

import android.graphics.Paint;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o.C57863yqT;

/* JADX INFO: renamed from: o.yqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57860yqQ extends AbstractC57946yrx implements InterfaceC57933yrk {
    public int AEQbTJ;
    public RefreshState AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public android.widget.ImageView EZpvd;
    public boolean KWHzl;
    public android.graphics.Paint OLrzqt;
    public android.graphics.Path copydefault;
    public C57867yqX djBIcL;
    public boolean gEmmrt;
    public boolean valueOf;

    public C57860yqQ(android.content.Context context) {
        this(context, null);
    }

    public C57860yqQ(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.gEmmrt = false;
        this.valueOf = true;
        this.AuCTelauCTel = C57940yrr.EZpvd;
        setMinimumHeight(InterpolatorC57905yrI.OLrzqt(100.0f));
        C57867yqX c57867yqX = new C57867yqX(this);
        this.djBIcL = c57867yqX;
        c57867yqX.OLrzqt(-16737844, -48060, -10053376, -5609780, -30720);
        C57865yqV c57865yqV = new C57865yqV(context, -328966);
        this.EZpvd = c57865yqV;
        c57865yqV.setImageDrawable(this.djBIcL);
        this.EZpvd.setAlpha(0.0f);
        addView(this.EZpvd);
        this.AEQbTJ = (int) (getResources().getDisplayMetrics().density * 40.0f);
        this.copydefault = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        paint.setAntiAlias(true);
        this.OLrzqt.setStyle(Paint.Style.FILL);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57863yqT.TaskDescription.KWHzl);
        this.gEmmrt = typedArrayObtainStyledAttributes.getBoolean(C57863yqT.TaskDescription.valueOf, this.gEmmrt);
        this.valueOf = typedArrayObtainStyledAttributes.getBoolean(C57863yqT.TaskDescription.AhwBna, this.valueOf);
        this.OLrzqt.setColor(typedArrayObtainStyledAttributes.getColor(C57863yqT.TaskDescription.AEQbTJ, -15614977));
        if (typedArrayObtainStyledAttributes.hasValue(C57863yqT.TaskDescription.djBIcL)) {
            this.OLrzqt.setShadowLayer(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C57863yqT.TaskDescription.djBIcL, 0), 0.0f, 0.0f, typedArrayObtainStyledAttributes.getColor(C57863yqT.TaskDescription.gEmmrt, ViewCompat.MEASURED_STATE_MASK));
            setLayerType(1, null);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.EZpvd.measure(View.MeasureSpec.makeMeasureSpec(this.AEQbTJ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.AEQbTJ, 1073741824));
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (getChildCount() == 0) {
            return;
        }
        android.widget.ImageView imageView = this.EZpvd;
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        if (isInEditMode() && (i5 = this.AhwBna) > 0) {
            int i6 = i5 - (measuredHeight / 2);
            int i7 = measuredWidth / 2;
            int i8 = measuredWidth2 / 2;
            imageView.layout(i7 - i8, i6, i7 + i8, measuredHeight + i6);
            this.djBIcL.KWHzl(true);
            this.djBIcL.EZpvd(0.0f, 0.8f);
            this.djBIcL.AEQbTJ(1.0f);
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
            return;
        }
        int i9 = measuredWidth / 2;
        int i10 = measuredWidth2 / 2;
        imageView.layout(i9 - i10, -measuredHeight, i9 + i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.gEmmrt) {
            this.copydefault.reset();
            this.copydefault.lineTo(0.0f, this.AhwBna);
            this.copydefault.quadTo(getMeasuredWidth() / 2.0f, this.AhwBna + (this.AkhnZx * 1.9f), getMeasuredWidth(), this.AhwBna);
            this.copydefault.lineTo(getMeasuredWidth(), 0.0f);
            canvas.drawPath(this.copydefault, this.OLrzqt);
        }
        super.dispatchDraw(canvas);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void EZpvd(@androidx.annotation.NonNull InterfaceC57931yri interfaceC57931yri, int i, int i2) {
        if (!this.gEmmrt) {
            interfaceC57931yri.KWHzl(this, false);
        }
        if (isInEditMode()) {
            int i3 = i / 2;
            this.AhwBna = i3;
            this.AkhnZx = i3;
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        RefreshState refreshState = this.AYXKKw;
        RefreshState refreshState2 = RefreshState.Refreshing;
        if (refreshState == refreshState2) {
            return;
        }
        if (this.gEmmrt) {
            this.AhwBna = java.lang.Math.min(i, i2);
            this.AkhnZx = java.lang.Math.max(0, i - i2);
            postInvalidate();
        }
        if (z || !(this.djBIcL.isRunning() || this.KWHzl)) {
            if (this.AYXKKw != refreshState2) {
                float f2 = i2;
                float fMax = (((float) java.lang.Math.max(((double) java.lang.Math.min(1.0f, java.lang.Math.abs((i * 1.0f) / f2))) - 0.4d, AudioStats.AUDIO_AMPLITUDE_NONE)) * 5.0f) / 3.0f;
                double dMax = java.lang.Math.max(0.0f, java.lang.Math.min(java.lang.Math.abs(i) - i2, f2 * 2.0f) / f2) / 4.0f;
                float fPow = (float) (dMax - java.lang.Math.pow(dMax, 2.0d));
                this.djBIcL.KWHzl(true);
                this.djBIcL.EZpvd(0.0f, java.lang.Math.min(0.8f, fMax * 0.8f));
                this.djBIcL.AEQbTJ(java.lang.Math.min(1.0f, fMax));
                this.djBIcL.EZpvd((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f * 2.0f)) * 0.5f);
            }
            android.widget.ImageView imageView = this.EZpvd;
            float f3 = i;
            imageView.setTranslationY(java.lang.Math.min(f3, (f3 / 2.0f) + (this.AEQbTJ / 2.0f)));
            imageView.setAlpha(java.lang.Math.min(1.0f, (f3 * 4.0f) / this.AEQbTJ));
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        this.djBIcL.start();
    }

    /* JADX INFO: renamed from: o.yqQ$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[RefreshState.values().length];
            KWHzl = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[RefreshState.Refreshing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[RefreshState.ReleaseToRefresh.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[RefreshState.PullDownToRefresh.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, @androidx.annotation.NonNull RefreshState refreshState, @androidx.annotation.NonNull RefreshState refreshState2) {
        android.widget.ImageView imageView = this.EZpvd;
        this.AYXKKw = refreshState2;
        if (AnonymousClass4.KWHzl[refreshState2.ordinal()] != 4) {
            return;
        }
        this.KWHzl = false;
        imageView.setVisibility(0);
        imageView.setTranslationY(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        android.widget.ImageView imageView = this.EZpvd;
        this.djBIcL.stop();
        imageView.animate().scaleX(0.0f).scaleY(0.0f);
        this.KWHzl = true;
        return 0;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... iArr) {
        if (iArr.length > 0) {
            this.OLrzqt.setColor(iArr[0]);
        }
    }

    public C57860yqQ EZpvd(@androidx.annotation.ColorInt int... iArr) {
        this.djBIcL.OLrzqt(iArr);
        return this;
    }
}
