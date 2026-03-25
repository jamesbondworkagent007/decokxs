package o;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Shader;
import android.os.Build;
import androidx.camera.video.AudioStats;
import androidx.core.os.HandlerCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55162xej extends android.view.View {
    public float AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public java.util.List<java.lang.Float> AkhnZx;
    public final android.graphics.Paint AuCTel;
    public java.lang.Integer AuCTelauCTel;
    public TaskDescription AubY;
    public final android.graphics.Paint DbNXlk;
    public C55170xer EZpvd;
    public android.animation.ValueAnimator KWHzl;
    public long OLrzqt;
    public float copydefault;
    public ActionBar djBIcL;
    public boolean ejfBZ;
    public final android.graphics.Path fARcdN;
    public int fIwbmz;
    public final PathMeasure fJNWhG;
    public boolean fetchVPNInfo;
    public float gEmmrt;
    public boolean gHZMYf;
    public int getFieldNames;
    public final java.lang.String getNewProxyInstance;
    public int hDKMBd;
    public boolean isConnected;
    public final java.util.ArrayList<PointF> iwGUEr;
    public float uzCIH;
    public boolean valueOf;
    public boolean values;
    public final android.graphics.Paint wlaJM;
    public Activity zLjUOn;
    public float zsXlph;
    public boolean zuBGHE;

    /* JADX INFO: renamed from: o.xej$ActionBar */
    public interface ActionBar {
        void EZpvd();

        void EZpvd(int i, float f, @NotNull PointF pointF);

        void copydefault(int i, float f, @NotNull PointF pointF);
    }

    /* JADX INFO: renamed from: o.xej$Activity */
    public interface Activity {
        void KWHzl(@NotNull java.util.List<? extends PointF> list, int i, int i2);
    }

    /* JADX INFO: renamed from: o.xej$TaskDescription */
    public interface TaskDescription {
        void OLrzqt();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55162xej(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55162xej(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: setAnimationDuration-LRDsOJo, reason: not valid java name */
    public final void m8792setAnimationDurationLRDsOJo(long j) {
        this.OLrzqt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableDottedGridShade(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDrawLineListener(TaskDescription taskDescription) {
        this.AubY = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLineReadyListener(Activity activity) {
        this.zLjUOn = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPressEntryListener(ActionBar actionBar) {
        this.djBIcL = actionBar;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.xej.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55162xej(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55162xej(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = yDY.AhwBna();
        this.copydefault = 1.0f;
        this.EZpvd = C55170xer.Companion.copydefault();
        this.uzCIH = 4.0f;
        this.fIwbmz = -16711936;
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        this.OLrzqt = C59519zia.EZpvd(1, DurationUnit.SECONDS);
        this.iwGUEr = new java.util.ArrayList<>();
        this.getFieldNames = -1;
        this.hDKMBd = -1;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(this.fIwbmz);
        paint.setStrokeWidth(this.uzCIH);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        this.AuCTel = paint;
        this.fARcdN = new android.graphics.Path();
        this.fJNWhG = new PathMeasure();
        this.isConnected = true;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.DbNXlk = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(style);
        paint3.setColor(0);
        paint3.setStrokeWidth(this.uzCIH);
        paint3.setStrokeCap(cap);
        paint3.setStrokeJoin(join);
        this.wlaJM = paint3;
        this.getNewProxyInstance = "LongPressToken";
        if (isInEditMode()) {
            setEntries$default(this, yDY.gEmmrt(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(2.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(3.0f)), null, 0.0f, 6, null);
            copydefault(false);
        }
        setLayerType(Build.VERSION.SDK_INT >= 28 ? 2 : 1, null);
    }

    /* JADX INFO: renamed from: o.xej$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ android.view.MotionEvent KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.MotionEvent motionEvent) {
            this.KWHzl = motionEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C55162xej.this.values = true;
            java.lang.Integer numCopydefault = C55162xej.this.copydefault(this.KWHzl.getX());
            if (numCopydefault != null) {
                int iIntValue = numCopydefault.intValue();
                C55162xej.this.AuCTelauCTel = java.lang.Integer.valueOf(iIntValue);
                ActionBar actionBar = C55162xej.this.djBIcL;
                if (actionBar != null) {
                    float fFloatValue = ((java.lang.Number) C55162xej.this.AkhnZx.get(iIntValue)).floatValue();
                    java.lang.Object obj = C55162xej.this.iwGUEr.get(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(obj, "");
                    actionBar.EZpvd(iIntValue, fFloatValue, (PointF) obj);
                }
            }
            C55162xej.this.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void setLineWidth(float f) {
        this.uzCIH = f;
        this.AuCTel.setStrokeWidth(f);
        this.wlaJM.setStrokeWidth(f);
        copydefault();
    }

    public final void setLineColor(@androidx.annotation.ColorInt int i) {
        this.fIwbmz = i;
        this.AuCTel.setColor(i);
    }

    public final void setDottedGridShadePattern(@androidx.annotation.ColorInt int i, int i2, int i3) {
        if (i2 <= 0 || i3 < 0) {
            return;
        }
        this.DbNXlk.setShader(EZpvd(i, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BitmapShader EZpvd(@androidx.annotation.ColorInt int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5 = (i3 * 2) + i2;
        int i6 = i5 * i5;
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 / i5;
            int i9 = i7 % i5;
            kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(i3, i3 + i2);
            int iKWHzl = intRangeAhwBna.KWHzl();
            if (i8 > intRangeAhwBna.copydefault() || iKWHzl > i8) {
                z = false;
            } else {
                int iKWHzl2 = intRangeAhwBna.KWHzl();
                if (i9 <= intRangeAhwBna.copydefault() && iKWHzl2 <= i9) {
                    z = true;
                }
            }
            if (z) {
                i4 = i;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = 0;
            }
            iArr[i7] = i4;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr, i5, i5, Bitmap.Config.ARGB_8888);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
    }

    public final void setShadow(float f, @androidx.annotation.ColorInt int i) {
        this.zsXlph = f;
        this.AuCTel.setShadowLayer(f, 0.0f, 0.0f, i);
        this.wlaJM.setShadowLayer(f, 0.0f, 0.0f, i);
    }

    public static /* synthetic */ void setEntries$default(C55162xej c55162xej, java.util.List list, C55170xer c55170xer, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c55170xer = C55170xer.Companion.copydefault();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        c55162xej.setEntries(list, c55170xer, f);
    }

    public final void setEntries(@NotNull java.util.List<java.lang.Float> list, @NotNull C55170xer c55170xer, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, to = 1.0d, toInclusive = true) float f) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c55170xer, "");
        this.AkhnZx = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
        this.EZpvd = c55170xer;
        this.copydefault = f;
        this.ejfBZ = false;
        this.fetchVPNInfo = false;
        this.zuBGHE = true;
        copydefault();
    }

    public final void copydefault(boolean z) {
        this.gHZMYf = z;
        if (z) {
            KWHzl();
        } else {
            invalidate();
        }
    }

    public final void KWHzl() {
        android.animation.ValueAnimator valueAnimator = this.KWHzl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(C59462zhW.gEmmrt(this.OLrzqt));
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C55162xej.copydefault(this.KWHzl, valueAnimator2);
            }
        });
        this.KWHzl = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public static final void copydefault(C55162xej c55162xej, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c55162xej.AEQbTJ = ((java.lang.Float) animatedValue).floatValue();
        c55162xej.postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        KWHzl(canvas);
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        if (this.AkhnZx.isEmpty()) {
            return;
        }
        if (this.AkhnZx.size() == 1) {
            PointF pointF = (PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(this.iwGUEr);
            canvas.drawPoint(pointF.x, pointF.y, this.wlaJM);
            canvas.drawPoint(pointF.x, pointF.y, this.AuCTel);
            TaskDescription taskDescription = this.AubY;
            if (taskDescription == null || this.ejfBZ || this.fetchVPNInfo) {
                return;
            }
            taskDescription.OLrzqt();
            taskDescription.copydefault();
            this.ejfBZ = true;
            this.fetchVPNInfo = true;
            return;
        }
        if (this.gHZMYf) {
            if (this.AEQbTJ == 1.0f) {
                this.gHZMYf = false;
            }
            android.graphics.Path path = new android.graphics.Path();
            float length = this.fJNWhG.getLength() * this.AEQbTJ;
            this.fJNWhG.getSegment(0.0f, length, path, true);
            int iEZpvd = yII.EZpvd(yDY.AuCTel(this.AkhnZx) * this.AEQbTJ);
            int i = this.getFieldNames;
            if (i >= 0 && i <= iEZpvd && !this.ejfBZ) {
                TaskDescription taskDescription2 = this.AubY;
                if (taskDescription2 != null) {
                    taskDescription2.OLrzqt();
                }
                this.ejfBZ = true;
            }
            int i2 = this.hDKMBd;
            if (i2 >= 0 && i2 <= iEZpvd && !this.fetchVPNInfo) {
                TaskDescription taskDescription3 = this.AubY;
                if (taskDescription3 != null) {
                    taskDescription3.copydefault();
                }
                this.fetchVPNInfo = true;
            }
            if (this.valueOf) {
                android.graphics.Path path2 = new android.graphics.Path(path);
                float[] fArr = new float[2];
                this.fJNWhG.getPosTan(length, fArr, new float[2]);
                float height = canvas.getHeight() - (this.isConnected ? getPaddingBottom() : 0);
                path2.lineTo(fArr[0], height);
                path2.lineTo(((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(this.iwGUEr)).x, height);
                path2.close();
                canvas.drawPath(path2, this.DbNXlk);
            }
            canvas.drawPath(path, this.wlaJM);
            canvas.drawPath(path, this.AuCTel);
            return;
        }
        TaskDescription taskDescription4 = this.AubY;
        if (taskDescription4 != null && !this.ejfBZ && !this.fetchVPNInfo) {
            taskDescription4.OLrzqt();
            taskDescription4.copydefault();
            this.ejfBZ = true;
            this.fetchVPNInfo = true;
        }
        if (this.valueOf) {
            android.graphics.Path path3 = new android.graphics.Path(this.fARcdN);
            float height2 = canvas.getHeight() - (this.isConnected ? getPaddingBottom() : 0);
            path3.lineTo(((PointF) CollectionsKt___CollectionsKt.AubY(this.iwGUEr)).x, height2);
            path3.lineTo(((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(this.iwGUEr)).x, height2);
            path3.close();
            canvas.drawPath(path3, this.DbNXlk);
        }
        canvas.drawPath(this.fARcdN, this.wlaJM);
        canvas.drawPath(this.fARcdN, this.AuCTel);
    }

    public final void copydefault() {
        this.iwGUEr.clear();
        this.fARcdN.reset();
        this.AhwBna = OLrzqt();
        if (this.AkhnZx.isEmpty()) {
            post(new java.lang.Runnable() { // from class: o.xek
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C55162xej.valueOf(this.OLrzqt);
                }
            });
            return;
        }
        if (this.AkhnZx.size() == 1) {
            float f = 1;
            this.EZpvd = new C55170xer(((java.lang.Number) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AkhnZx)).floatValue() - f, ((java.lang.Number) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AkhnZx)).floatValue() + f);
            this.iwGUEr.add(new PointF(getPaddingLeft() + (this.gEmmrt / 2), OLrzqt(this.EZpvd, ((java.lang.Number) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AkhnZx)).floatValue())));
            post(new java.lang.Runnable() { // from class: o.xem
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C55162xej.AYXKKw(this.copydefault);
                }
            });
            return;
        }
        this.getFieldNames = -1;
        this.hDKMBd = -1;
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        int i = 0;
        for (java.lang.Object obj : this.AkhnZx) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            float fFloatValue = ((java.lang.Number) obj).floatValue();
            if (fFloatValue >= f3) {
                this.hDKMBd = i;
                f3 = fFloatValue;
            }
            if (fFloatValue <= f2) {
                this.getFieldNames = i;
                f2 = fFloatValue;
            }
            i++;
        }
        if (f3 == f2) {
            float f4 = 1;
            this.EZpvd = new C55170xer(f2 - f4, f4 + f3);
        }
        if (Intrinsics.EZpvd(this.EZpvd, C55170xer.Companion.copydefault())) {
            this.EZpvd = new C55170xer(f2, f3);
        }
        java.util.ArrayList<PointF> arrayList = this.iwGUEr;
        java.util.List<java.lang.Float> list = this.AkhnZx;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj2 : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            arrayList2.add(new PointF(getPaddingLeft() + (i2 * this.AhwBna), OLrzqt(this.EZpvd, ((java.lang.Number) obj2).floatValue())));
            i2++;
        }
        arrayList.addAll(arrayList2);
        this.fARcdN.moveTo(((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(this.iwGUEr)).x, ((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(this.iwGUEr)).y);
        java.util.ArrayList<PointF> arrayList3 = this.iwGUEr;
        java.util.List<PointF> listSubList = arrayList3.subList(1, arrayList3.size());
        Intrinsics.checkNotNullExpressionValue(listSubList, "");
        for (PointF pointF : listSubList) {
            this.fARcdN.lineTo(pointF.x, pointF.y);
        }
        this.fJNWhG.setPath(this.fARcdN, false);
        post(new java.lang.Runnable() { // from class: o.xel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55162xej.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final void valueOf(C55162xej c55162xej) {
        Activity activity = c55162xej.zLjUOn;
        if (activity != null) {
            activity.KWHzl(yDY.AhwBna(), -1, -1);
        }
    }

    public static final void AYXKKw(C55162xej c55162xej) {
        Activity activity = c55162xej.zLjUOn;
        if (activity != null) {
            activity.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c55162xej.iwGUEr), 0, 0);
        }
    }

    public static final void gEmmrt(C55162xej c55162xej) {
        Activity activity = c55162xej.zLjUOn;
        if (activity != null) {
            activity.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c55162xej.iwGUEr), c55162xej.getFieldNames, c55162xej.hDKMBd);
        }
    }

    private final float OLrzqt() {
        if (this.AkhnZx.size() <= 1) {
            return 0.0f;
        }
        return this.gEmmrt / (this.AkhnZx.size() - 1);
    }

    public final float OLrzqt(C55170xer c55170xer, float f) {
        float fKWHzl = c55170xer.KWHzl();
        float f2 = 2;
        float f3 = (this.AYXKKw * this.copydefault) - (this.uzCIH * f2);
        float paddingTop = getPaddingTop();
        float f4 = ((1 - this.copydefault) * this.AYXKKw) / f2;
        float f5 = this.uzCIH;
        float fCopydefault = ((f - fKWHzl) * f3) / c55170xer.copydefault();
        float f6 = f3 / f2;
        if (fCopydefault > f6) {
            fCopydefault -= (fCopydefault - f6) * f2;
        } else if (fCopydefault < f6) {
            fCopydefault += (f6 - fCopydefault) * f2;
        }
        return fCopydefault + paddingTop + f4 + f5;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        EZpvd(getWidth(), getHeight(), i + i3, i2 + i4);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        EZpvd(getWidth(), getHeight(), i + i3, i2 + i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        EZpvd(i, i2, getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void EZpvd(int i, int i2, int i3, int i4) {
        this.gEmmrt = i - i3;
        this.AYXKKw = i2 - i4;
        copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.Integer numCopydefault;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            android.os.Handler handler = getHandler();
            Intrinsics.checkNotNullExpressionValue(handler, "");
            long longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            java.lang.String str = this.getNewProxyInstance;
            StateListAnimator stateListAnimator = new StateListAnimator(motionEvent);
            if (str == null) {
                handler.postDelayed(stateListAnimator, longPressTimeout);
            } else {
                HandlerCompat.postDelayed(handler, stateListAnimator, str, longPressTimeout);
            }
        } else if (action == 1) {
            if (!this.values) {
                performClick();
            }
            getHandler().removeCallbacksAndMessages(this.getNewProxyInstance);
            this.values = false;
            this.AuCTelauCTel = null;
            ActionBar actionBar = this.djBIcL;
            if (actionBar != null) {
                actionBar.EZpvd();
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (this.values && (numCopydefault = copydefault(motionEvent.getX())) != null) {
            int iIntValue = numCopydefault.intValue();
            java.lang.Integer num = this.AuCTelauCTel;
            if (num == null || iIntValue != num.intValue()) {
                this.AuCTelauCTel = java.lang.Integer.valueOf(iIntValue);
                ActionBar actionBar2 = this.djBIcL;
                if (actionBar2 != null) {
                    float fFloatValue = this.AkhnZx.get(iIntValue).floatValue();
                    PointF pointF = this.iwGUEr.get(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(pointF, "");
                    actionBar2.copydefault(iIntValue, fFloatValue, pointF);
                }
            }
        }
        return true;
    }

    public final java.lang.Integer copydefault(float f) {
        if (this.iwGUEr.isEmpty()) {
            return null;
        }
        if (this.iwGUEr.size() == 1 || this.AhwBna == 0.0f) {
            return 0;
        }
        return java.lang.Integer.valueOf(C56548yJl.EZpvd(yII.EZpvd((f - getPaddingLeft()) / this.AhwBna), 0, yDY.AuCTel(this.iwGUEr)));
    }
}
