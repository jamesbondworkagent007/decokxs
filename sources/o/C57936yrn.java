package o;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o.C57923yra;

/* JADX INFO: renamed from: o.yrn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57936yrn extends AbstractC57946yrx implements InterfaceC57933yrk {
    public android.animation.Animator AEQbTJ;
    public android.graphics.Paint AYXKKw;
    public boolean AhwBna;
    public float AkhnZx;
    public float AuCTel;
    public float DbNXlk;
    public float EZpvd;
    public int KWHzl;
    public float OLrzqt;
    public float copydefault;
    public android.graphics.Path djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public float fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public int getFieldNames;
    public boolean getNewProxyInstance;
    public RectF isConnected;
    public boolean valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57936yrn KWHzl(@androidx.annotation.ColorInt int i) {
        this.values = i;
        this.valueOf = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57936yrn OLrzqt(@androidx.annotation.ColorInt int i) {
        this.KWHzl = i;
        this.gEmmrt = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public boolean gEmmrt() {
        return this.AhwBna;
    }

    public C57936yrn(android.content.Context context) {
        this(context, null);
    }

    public C57936yrn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.AhwBna = false;
        this.ejfBZ = -1;
        this.fJNWhG = 0;
        this.fetchVPNInfo = 0;
        this.AkhnZx = 0.0f;
        this.DbNXlk = 0.0f;
        this.AuCTel = 0.0f;
        this.isConnected = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.AuCTelauCTel = C57940yrr.OLrzqt;
        this.djBIcL = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AYXKKw = paint;
        paint.setAntiAlias(true);
        this.OLrzqt = InterpolatorC57905yrI.OLrzqt(7.0f);
        this.AkhnZx = InterpolatorC57905yrI.OLrzqt(20.0f);
        this.DbNXlk = InterpolatorC57905yrI.OLrzqt(7.0f);
        this.AYXKKw.setStrokeWidth(InterpolatorC57905yrI.OLrzqt(3.0f));
        setMinimumHeight(InterpolatorC57905yrI.OLrzqt(100.0f));
        if (isInEditMode()) {
            this.getFieldNames = 1000;
            this.AuCTel = 1.0f;
            this.fetchVPNInfo = SubsamplingScaleImageView.ORIENTATION_270;
        } else {
            this.AuCTel = 0.0f;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57923yra.StateListAnimator.copydefault);
        this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.AYXKKw, this.AhwBna);
        OLrzqt(typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.djBIcL, -1));
        KWHzl(typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.AhwBna, -14540254));
        this.gEmmrt = typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.djBIcL);
        this.valueOf = typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AhwBna);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.Animator animator = this.AEQbTJ;
        if (animator != null) {
            animator.removeAllListeners();
            this.AEQbTJ.end();
            this.AEQbTJ = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = isInEditMode() ? getHeight() : this.fJNWhG;
        AEQbTJ(canvas, width);
        KWHzl(canvas, width, height);
        AEQbTJ(canvas, width, height);
        copydefault(canvas, width, height);
        super.dispatchDraw(canvas);
    }

    public void AEQbTJ(android.graphics.Canvas canvas, int i) {
        this.djBIcL.reset();
        this.djBIcL.lineTo(0.0f, this.getFieldNames);
        android.graphics.Path path = this.djBIcL;
        int i2 = this.ejfBZ;
        float f = i2 >= 0 ? i2 : i / 2.0f;
        float f2 = i;
        path.quadTo(f, this.fARcdN + r3, f2, this.getFieldNames);
        this.djBIcL.lineTo(f2, 0.0f);
        this.AYXKKw.setColor(this.values);
        canvas.drawPath(this.djBIcL, this.AYXKKw);
    }

    public void KWHzl(android.graphics.Canvas canvas, int i, int i2) {
        int i3;
        float f;
        if (this.EZpvd > 0.0f) {
            this.AYXKKw.setColor(this.KWHzl);
            float fKWHzl = InterpolatorC57905yrI.KWHzl(i2);
            float f2 = i;
            float f3 = 1.0f;
            float f4 = 7.0f;
            float f5 = (f2 * 1.0f) / 7.0f;
            float f6 = this.copydefault;
            if (f6 > 1.0f) {
                f = ((f6 - 1.0f) * f5) / f6;
                i3 = i2;
            } else {
                i3 = i2;
                f = 0.0f;
            }
            float f7 = i3;
            float f8 = 2.0f;
            float f9 = f6 > 1.0f ? (((f6 - 1.0f) * f7) / 2.0f) / f6 : 0.0f;
            int i4 = 0;
            while (i4 < 7) {
                float f10 = (i4 + f3) - 4.0f;
                float fAbs = java.lang.Math.abs(f10) / f4;
                android.graphics.Paint paint = this.AYXKKw;
                float f11 = this.EZpvd * (f3 - (fAbs * f8)) * 255.0f;
                float f12 = f6;
                float f13 = f5;
                paint.setAlpha((int) (((double) f11) * (1.0d - (1.0d / java.lang.Math.pow((((double) fKWHzl) / 800.0d) + 1.0d, 15.0d)))));
                float f14 = this.OLrzqt * (1.0f - (1.0f / ((fKWHzl / 10.0f) + 1.0f)));
                canvas.drawCircle(((f2 / 2.0f) - (f14 / 2.0f)) + (((f13 * f12) - f) * f10), (f7 - f9) / 2.0f, f14, this.AYXKKw);
                i4++;
                f8 = 2.0f;
                f3 = 1.0f;
                f6 = f12;
                f5 = f13;
                f4 = 7.0f;
            }
            this.AYXKKw.setAlpha(255);
        }
    }

    public void AEQbTJ(android.graphics.Canvas canvas, int i, int i2) {
        if (this.AEQbTJ != null || isInEditMode()) {
            float f = this.AkhnZx;
            float f2 = this.AuCTel;
            float f3 = f * f2;
            float f4 = this.DbNXlk;
            this.AYXKKw.setColor(this.KWHzl);
            android.graphics.Paint paint = this.AYXKKw;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            float f5 = i / 2.0f;
            float f6 = i2 / 2.0f;
            canvas.drawCircle(f5, f6, f3, this.AYXKKw);
            android.graphics.Paint paint2 = this.AYXKKw;
            Paint.Style style2 = Paint.Style.STROKE;
            paint2.setStyle(style2);
            float f7 = f3 + (f4 * f2);
            canvas.drawCircle(f5, f6, f7, this.AYXKKw);
            this.AYXKKw.setColor((this.values & 16777215) | 1426063360);
            this.AYXKKw.setStyle(style);
            this.isConnected.set(f5 - f3, f6 - f3, f5 + f3, f3 + f6);
            canvas.drawArc(this.isConnected, 270.0f, this.fetchVPNInfo, true, this.AYXKKw);
            this.AYXKKw.setStyle(style2);
            this.isConnected.set(f5 - f7, f6 - f7, f5 + f7, f6 + f7);
            canvas.drawArc(this.isConnected, 270.0f, this.fetchVPNInfo, false, this.AYXKKw);
            this.AYXKKw.setStyle(style);
        }
    }

    public void copydefault(android.graphics.Canvas canvas, int i, int i2) {
        if (this.fIwbmz > 0.0f) {
            this.AYXKKw.setColor(this.KWHzl);
            canvas.drawCircle(i / 2.0f, i2 / 2.0f, this.fIwbmz, this.AYXKKw);
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        this.fJNWhG = i;
        if (z || this.getNewProxyInstance) {
            this.getNewProxyInstance = true;
            this.getFieldNames = java.lang.Math.min(i2, i);
            this.fARcdN = (int) (java.lang.Math.max(0, i - i2) * 1.9f);
            this.copydefault = f;
            invalidate();
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        this.getFieldNames = i - 1;
        this.getNewProxyInstance = false;
        InterpolatorC57905yrI interpolatorC57905yrI = new InterpolatorC57905yrI(InterpolatorC57905yrI.OLrzqt);
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(interpolatorC57905yrI);
        valueAnimatorOfFloat.addUpdateListener(new StateListAnimator((byte) 2));
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(interpolatorC57905yrI);
        valueAnimatorOfFloat2.addUpdateListener(new StateListAnimator((byte) 0));
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new StateListAnimator((byte) 4));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i3 = this.fARcdN;
        float f = i3;
        android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(i3, 0, -((int) (0.8f * f)), 0, -((int) (f * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new StateListAnimator((byte) 1));
        valueAnimatorOfInt2.setInterpolator(new InterpolatorC57905yrI(InterpolatorC57905yrI.OLrzqt));
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.AEQbTJ = animatorSet;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        android.animation.Animator animator = this.AEQbTJ;
        if (animator != null) {
            animator.removeAllListeners();
            this.AEQbTJ.end();
            this.AEQbTJ = null;
        }
        int width = getWidth();
        int i = this.fJNWhG;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.AkhnZx, (float) java.lang.Math.sqrt((width * width) + (i * i)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new StateListAnimator((byte) 3));
        valueAnimatorOfFloat.start();
        return 400;
    }

    /* JADX INFO: renamed from: o.yrn$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[RefreshState.values().length];
            AEQbTJ = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, @androidx.annotation.NonNull RefreshState refreshState, @androidx.annotation.NonNull RefreshState refreshState2) {
        int i = AnonymousClass2.AEQbTJ[refreshState2.ordinal()];
        if (i == 1 || i == 2) {
            this.EZpvd = 1.0f;
            this.AuCTel = 0.0f;
            this.fIwbmz = 0.0f;
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... iArr) {
        if (iArr.length > 0 && !this.valueOf) {
            KWHzl(iArr[0]);
            this.valueOf = false;
        }
        if (iArr.length <= 1 || this.gEmmrt) {
            return;
        }
        OLrzqt(iArr[1]);
        this.gEmmrt = false;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void OLrzqt(float f, int i, int i2) {
        this.ejfBZ = i;
        invalidate();
    }

    /* JADX INFO: renamed from: o.yrn$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public class StateListAnimator implements ValueAnimator.AnimatorUpdateListener {
        public byte OLrzqt;

        public StateListAnimator(byte b) {
            this.OLrzqt = b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            byte b = this.OLrzqt;
            if (b == 0) {
                C57936yrn.this.AuCTel = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b) {
                C57936yrn c57936yrn = C57936yrn.this;
                if (c57936yrn.getNewProxyInstance) {
                    valueAnimator.cancel();
                    return;
                }
                c57936yrn.fARcdN = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
            } else if (2 == b) {
                C57936yrn.this.EZpvd = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b) {
                C57936yrn.this.fIwbmz = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b) {
                C57936yrn.this.fetchVPNInfo = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            C57936yrn.this.invalidate();
        }
    }
}
