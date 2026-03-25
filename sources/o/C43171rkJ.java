package o;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import com.okinc.mlnservice.usdg.UDUSDGProgressCurveView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC7383aim;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43171rkJ extends android.view.View implements InterfaceC7383aim<UDUSDGProgressCurveView<?>> {
    public java.lang.Integer AEQbTJ;
    public java.lang.Integer AYXKKw;
    public java.lang.Integer AhwBna;
    public final java.util.List<java.lang.Boolean> AkhnZx;
    public final android.graphics.Paint AuCTel;
    public float AuCTelauCTel;
    public final PathMeasure AubY;
    public java.lang.Integer AwvSrB;
    public boolean AxsJAY;
    public android.animation.TimeInterpolator DbNXlk;
    public float EZpvd;
    public int KWHzl;
    public java.lang.Integer OLrzqt;
    public UDUSDGProgressCurveView<?> QOLQEE;
    public final android.graphics.Paint copydefault;
    public int djBIcL;
    public int ejfBZ;
    public float fARcdN;
    public final android.graphics.Paint fIwbmz;
    public java.lang.Integer fJNWhG;
    public float fetchVPNInfo;
    public final java.util.List<android.animation.ValueAnimator> gEmmrt;
    public int gHZMYf;
    public boolean[] getFieldNames;
    public float getNewProxyInstance;
    public final java.util.List<java.lang.Float> hDKMBd;
    public java.lang.Integer isConnected;
    public boolean iwGUEr;
    public final android.graphics.Path sSMYrx;
    public float uzCIH;
    public long valueOf;
    public final java.util.List<java.lang.Float> values;
    public float wlaJM;
    public final android.graphics.Path zLjUOn;
    public java.lang.Integer zsXlph;
    public final android.graphics.Paint zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public UDUSDGProgressCurveView<?> getUserdata() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableDotBounceOnPass(boolean z) {
        this.iwGUEr = z;
    }

    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43171rkJ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.wlaJM = C55298xhM.dp$default(3.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fARcdN = C55298xhM.dp$default(5.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.KWHzl = C33070mpX.copydefault(C52761wXj.Activity.HJWChP);
        this.gHZMYf = C33070mpX.copydefault(C52761wXj.Activity.DAIeex);
        this.ejfBZ = C33070mpX.copydefault(C52761wXj.Activity.QsIRgs);
        this.djBIcL = C33070mpX.copydefault(C52761wXj.Activity.DAIeex);
        this.EZpvd = 0.28f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        this.zuBGHE = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        this.fIwbmz = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        paint4.setStyle(style2);
        this.AuCTel = paint4;
        this.zLjUOn = new android.graphics.Path();
        this.sSMYrx = new android.graphics.Path();
        this.AubY = new PathMeasure();
        this.values = new java.util.ArrayList();
        this.iwGUEr = true;
        this.fetchVPNInfo = 1.25f;
        this.valueOf = 300L;
        this.DbNXlk = new android.view.animation.PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);
        this.hDKMBd = new java.util.ArrayList();
        this.AkhnZx = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        paint.setColor(this.KWHzl);
        paint.setStrokeWidth(this.wlaJM);
        paint2.setColor(this.gHZMYf);
        paint2.setStrokeWidth(this.wlaJM);
        paint4.setColor(this.ejfBZ);
        paint3.setColor(this.djBIcL);
        this.getNewProxyInstance = 0.0f;
        this.uzCIH = 0.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43171rkJ(@NotNull android.content.Context context, UDUSDGProgressCurveView<?> uDUSDGProgressCurveView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.wlaJM = C55298xhM.dp$default(3.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fARcdN = C55298xhM.dp$default(5.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.KWHzl = C33070mpX.copydefault(C52761wXj.Activity.HJWChP);
        this.gHZMYf = C33070mpX.copydefault(C52761wXj.Activity.DAIeex);
        this.ejfBZ = C33070mpX.copydefault(C52761wXj.Activity.QsIRgs);
        this.djBIcL = C33070mpX.copydefault(C52761wXj.Activity.DAIeex);
        this.EZpvd = 0.28f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        this.zuBGHE = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        this.fIwbmz = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        paint4.setStyle(style2);
        this.AuCTel = paint4;
        this.zLjUOn = new android.graphics.Path();
        this.sSMYrx = new android.graphics.Path();
        this.AubY = new PathMeasure();
        this.values = new java.util.ArrayList();
        this.iwGUEr = true;
        this.fetchVPNInfo = 1.25f;
        this.valueOf = 300L;
        this.DbNXlk = new android.view.animation.PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);
        this.hDKMBd = new java.util.ArrayList();
        this.AkhnZx = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        paint.setColor(this.KWHzl);
        paint.setStrokeWidth(this.wlaJM);
        paint2.setColor(this.gHZMYf);
        paint2.setStrokeWidth(this.wlaJM);
        paint4.setColor(this.ejfBZ);
        paint3.setColor(this.djBIcL);
        this.getNewProxyInstance = 0.0f;
        this.uzCIH = 0.0f;
        this.QOLQEE = uDUSDGProgressCurveView;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        copydefault();
    }

    public final void copydefault() {
        this.zLjUOn.reset();
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0.0f || height <= 0.0f) {
            this.AubY.setPath(this.zLjUOn, false);
            this.AuCTelauCTel = 0.0f;
            return;
        }
        float paddingLeft = getPaddingLeft();
        float width2 = getWidth() - getPaddingRight();
        float paddingTop = getPaddingTop() + (0.72f * height);
        float f = (paddingLeft + width2) / 2.0f;
        float f2 = paddingTop - (height * this.EZpvd);
        if (!this.AxsJAY) {
            this.zLjUOn.moveTo(paddingLeft, paddingTop);
            this.zLjUOn.quadTo(f, f2, width2, paddingTop);
        } else {
            this.zLjUOn.moveTo(width2, paddingTop);
            this.zLjUOn.quadTo(f, f2, paddingLeft, paddingTop);
        }
        KWHzl(paddingLeft, width2, paddingTop);
        this.AubY.setPath(this.zLjUOn, false);
        this.AuCTelauCTel = this.AubY.getLength();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        boolean z;
        android.graphics.Paint paint;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.AuCTelauCTel <= 0.0f) {
            return;
        }
        canvas.drawPath(this.zLjUOn, this.copydefault);
        this.sSMYrx.reset();
        this.AubY.getSegment(0.0f, this.AuCTelauCTel * KWHzl(this.getNewProxyInstance), this.sSMYrx, true);
        canvas.drawPath(this.sSMYrx, this.zuBGHE);
        boolean[] zArr = this.getFieldNames;
        boolean z2 = zArr != null && zArr.length == this.values.size();
        boolean[] zArr2 = this.getFieldNames;
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            float fKWHzl = KWHzl(this.values.get(i).floatValue());
            float[] fArr = new float[2];
            this.AubY.getPosTan(this.AuCTelauCTel * fKWHzl, fArr, null);
            if (z2) {
                Intrinsics.copydefault(zArr2);
                z = zArr2[i];
            } else {
                z = fKWHzl <= this.uzCIH;
            }
            java.lang.Float f = (java.lang.Float) CollectionsKt___CollectionsKt.AkhnZx(this.hDKMBd, i);
            float fFloatValue = this.fARcdN * (f != null ? f.floatValue() : 1.0f);
            if (z) {
                setupDotGradient(this.fIwbmz, fArr[0], fArr[1], fFloatValue, true);
                paint = this.fIwbmz;
            } else {
                setupDotGradient(this.AuCTel, fArr[0], fArr[1], fFloatValue, false);
                paint = this.AuCTel;
            }
            canvas.drawCircle(fArr[0], fArr[1], fFloatValue, paint);
        }
    }

    public final void setLineProgress(float f) {
        float fKWHzl = KWHzl(f);
        if (this.getNewProxyInstance == fKWHzl) {
            return;
        }
        this.getNewProxyInstance = fKWHzl;
        if (this.iwGUEr) {
            copydefault(fKWHzl);
        }
        invalidate();
    }

    public final void setDotsProgress(float f) {
        float fKWHzl = KWHzl(f);
        if (this.uzCIH == fKWHzl) {
            return;
        }
        this.uzCIH = fKWHzl;
        invalidate();
    }

    public final void setDotStates(boolean[] zArr) {
        this.getFieldNames = zArr;
        invalidate();
    }

    public final void setProgress(float f, float f2) {
        this.getNewProxyInstance = KWHzl(f);
        this.uzCIH = KWHzl(f2);
        if (this.iwGUEr) {
            copydefault(this.getNewProxyInstance);
        }
        invalidate();
    }

    public static /* synthetic */ void animateLine$default(C43171rkJ c43171rkJ, float f, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        c43171rkJ.EZpvd(f, j);
    }

    public final void EZpvd(float f, long j) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.getNewProxyInstance, KWHzl(f));
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.rkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C43171rkJ.OLrzqt(this.EZpvd, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static final void OLrzqt(C43171rkJ c43171rkJ, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c43171rkJ.setLineProgress(((java.lang.Float) animatedValue).floatValue());
    }

    public static /* synthetic */ void animateDots$default(C43171rkJ c43171rkJ, float f, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 800;
        }
        c43171rkJ.KWHzl(f, j);
    }

    public final void KWHzl(float f, long j) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.uzCIH, KWHzl(f));
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.rkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C43171rkJ.copydefault(this.copydefault, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static final void copydefault(C43171rkJ c43171rkJ, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c43171rkJ.setDotsProgress(((java.lang.Float) animatedValue).floatValue());
    }

    public final void setLineWidth(float f) {
        float fDp$default = C55298xhM.dp$default(java.lang.Math.max(0.0f, f), (android.content.Context) null, 1, (java.lang.Object) null);
        this.wlaJM = fDp$default;
        this.copydefault.setStrokeWidth(fDp$default);
        this.zuBGHE.setStrokeWidth(this.wlaJM);
        invalidate();
    }

    public final void setDotRadius(float f) {
        this.fARcdN = C55298xhM.dp$default(java.lang.Math.max(0.0f, f), (android.content.Context) null, 1, (java.lang.Object) null);
        invalidate();
    }

    public final void setBaseLineColor(@androidx.annotation.ColorInt int i) {
        this.KWHzl = i;
        this.copydefault.setColor(i);
        this.OLrzqt = null;
        this.AEQbTJ = null;
        this.copydefault.setShader(null);
        invalidate();
    }

    public final void setProgressLineColor(@androidx.annotation.ColorInt int i) {
        this.gHZMYf = i;
        this.zuBGHE.setColor(i);
        this.AwvSrB = null;
        this.zsXlph = null;
        this.zuBGHE.setShader(null);
        invalidate();
    }

    public final void setDotInactiveColor(@androidx.annotation.ColorInt int i) {
        this.ejfBZ = i;
        this.AuCTel.setColor(i);
        this.fJNWhG = null;
        this.isConnected = null;
        this.AuCTel.setShader(null);
        invalidate();
    }

    public final void setDotActiveColor(@androidx.annotation.ColorInt int i) {
        this.djBIcL = i;
        this.fIwbmz.setColor(i);
        this.AYXKKw = null;
        this.AhwBna = null;
        this.fIwbmz.setShader(null);
        invalidate();
    }

    public final void setDotFractions(@NotNull java.util.List<java.lang.Float> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.values.clear();
        java.util.List<java.lang.Float> list2 = this.values;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(KWHzl(((java.lang.Number) it.next()).floatValue())));
        }
        list2.addAll(CollectionsKt___CollectionsKt.AxsJAYaxsJAY(arrayList));
        copydefault(this.values.size());
        this.getFieldNames = null;
        invalidate();
    }

    public final void setDotCount(int i) {
        int iMax = java.lang.Math.max(0, i);
        OLrzqt(iMax);
        copydefault(iMax);
        invalidate();
    }

    public final void setCurve(float f) {
        this.EZpvd = f;
        copydefault();
    }

    public final void setReverse(boolean z) {
        this.AxsJAY = z;
        copydefault();
    }

    public final void setBaseLineGradient(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        this.OLrzqt = java.lang.Integer.valueOf(i);
        this.AEQbTJ = java.lang.Integer.valueOf(i2);
        AEQbTJ();
        invalidate();
    }

    public final void setProgressLineGradient(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        this.AwvSrB = java.lang.Integer.valueOf(i);
        this.zsXlph = java.lang.Integer.valueOf(i2);
        AEQbTJ();
        invalidate();
    }

    public final void setDotActiveGradient(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        this.AYXKKw = java.lang.Integer.valueOf(i);
        this.AhwBna = java.lang.Integer.valueOf(i2);
        OLrzqt();
        invalidate();
    }

    public final void setDotInActiveGradient(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        this.fJNWhG = java.lang.Integer.valueOf(i);
        this.isConnected = java.lang.Integer.valueOf(i2);
        OLrzqt();
        invalidate();
    }

    public static /* synthetic */ void setDotBounceParams$default(C43171rkJ c43171rkJ, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.25f;
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        c43171rkJ.setDotBounceParams(f, j);
    }

    public final void setDotBounceParams(float f, long j) {
        this.fetchVPNInfo = java.lang.Math.max(1.0f, f);
        this.valueOf = java.lang.Math.max(0L, j);
    }

    public final void setDotBounceBezier(float f, float f2, float f3, float f4) {
        this.DbNXlk = new android.view.animation.PathInterpolator(f, f2, f3, f4);
    }

    public final void EZpvd() {
        int size = this.AkhnZx.size();
        for (int i = 0; i < size; i++) {
            this.AkhnZx.set(i, java.lang.Boolean.FALSE);
        }
        int size2 = this.hDKMBd.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.hDKMBd.set(i2, java.lang.Float.valueOf(1.0f));
        }
        int size3 = this.gEmmrt.size();
        for (int i3 = 0; i3 < size3; i3++) {
            android.animation.ValueAnimator valueAnimator = this.gEmmrt.get(i3);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.gEmmrt.set(i3, null);
        }
        invalidate();
    }

    public final void OLrzqt(int i) {
        this.values.clear();
        if (i <= 0) {
            return;
        }
        int i2 = 1;
        if (i == 1) {
            this.values.add(java.lang.Float.valueOf(0.5f));
            return;
        }
        float f = 1.0f / (i + 1);
        if (1 > i) {
            return;
        }
        while (true) {
            this.values.add(java.lang.Float.valueOf(i2 * f));
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void copydefault(float f) {
        if (this.values.isEmpty()) {
            return;
        }
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (!this.AkhnZx.get(i).booleanValue() && f >= this.values.get(i).floatValue()) {
                EZpvd(i);
            }
        }
    }

    public final void EZpvd(final int i) {
        if (this.iwGUEr && i >= 0 && i < this.values.size()) {
            this.AkhnZx.set(i, java.lang.Boolean.TRUE);
            android.animation.ValueAnimator valueAnimator = this.gEmmrt.get(i);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, this.fetchVPNInfo, 1.0f);
            valueAnimatorOfFloat.setDuration(this.valueOf);
            valueAnimatorOfFloat.setInterpolator(this.DbNXlk);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.rkK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    C43171rkJ.AEQbTJ(this.OLrzqt, i, valueAnimator2);
                }
            });
            this.gEmmrt.set(i, valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
        }
    }

    public static final void AEQbTJ(C43171rkJ c43171rkJ, int i, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.util.List<java.lang.Float> list = c43171rkJ.hDKMBd;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        list.set(i, (java.lang.Float) animatedValue);
        c43171rkJ.invalidate();
    }

    public final void copydefault(int i) {
        this.hDKMBd.clear();
        this.AkhnZx.clear();
        this.gEmmrt.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.hDKMBd.add(java.lang.Float.valueOf(1.0f));
            this.AkhnZx.add(java.lang.Boolean.FALSE);
            this.gEmmrt.add(null);
        }
    }

    public final void setupDotGradient(android.graphics.Paint paint, float f, float f2, float f3, boolean z) {
        if (z) {
            java.lang.Integer num = this.AYXKKw;
            java.lang.Integer num2 = this.AhwBna;
            if (num != null && num2 != null) {
                paint.setShader(new LinearGradient(f, f2 - f3, f, f2 + f3, new int[]{num.intValue(), num2.intValue()}, (float[]) null, Shader.TileMode.CLAMP));
                return;
            } else {
                paint.setShader(null);
                paint.setColor(this.djBIcL);
                return;
            }
        }
        java.lang.Integer num3 = this.fJNWhG;
        java.lang.Integer num4 = this.isConnected;
        if (num3 != null && num4 != null) {
            paint.setShader(new LinearGradient(f, f2 - f3, f, f2 + f3, new int[]{num3.intValue(), num4.intValue()}, (float[]) null, Shader.TileMode.CLAMP));
        } else {
            paint.setShader(null);
            paint.setColor(this.ejfBZ);
        }
    }

    public final void KWHzl(float f, float f2, float f3) {
        java.lang.Integer num = this.OLrzqt;
        java.lang.Integer num2 = this.AEQbTJ;
        float[] fArr = {0.0f, 0.5f, 1.0f};
        if (num != null && num2 != null) {
            this.copydefault.setShader(new LinearGradient(f, f3, f2, f3, new int[]{num2.intValue(), num.intValue(), num2.intValue()}, fArr, Shader.TileMode.CLAMP));
        } else {
            this.copydefault.setShader(null);
        }
        java.lang.Integer num3 = this.AwvSrB;
        java.lang.Integer num4 = this.zsXlph;
        if (num3 != null && num4 != null) {
            this.zuBGHE.setShader(new LinearGradient(f, f3, f2, f3, new int[]{num4.intValue(), num3.intValue(), num4.intValue()}, fArr, Shader.TileMode.CLAMP));
        } else {
            this.zuBGHE.setShader(null);
        }
    }

    public final void AEQbTJ() {
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0.0f || height <= 0.0f) {
            this.copydefault.setShader(null);
            this.zuBGHE.setShader(null);
        } else {
            KWHzl(getPaddingLeft(), getWidth() - getPaddingRight(), getPaddingTop() + (height * 0.72f));
        }
    }

    public final void OLrzqt() {
        this.fIwbmz.setShader(null);
        this.AuCTel.setShader(null);
    }

    public final float KWHzl(float f) {
        return java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, f));
    }
}
