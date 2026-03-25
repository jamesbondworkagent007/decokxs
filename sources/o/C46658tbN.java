package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46658tbN extends android.view.View {
    public final android.graphics.Paint AEQbTJ;
    public Function1<? super java.lang.Float, Unit> AYXKKw;
    public float AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final android.graphics.Paint AuCTel;
    public final android.graphics.Paint AuCTelauCTel;
    public float AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public float DTwDnp;
    public float DbNXlk;
    public int EZpvd;
    public boolean KWHzl;
    public float ORxRYg;
    public final android.graphics.Paint OcIXYQ;
    public float QKVWgx;
    public float QOLQEE;
    public int QUSxYX;
    public float QVAiDq;
    public float QbewEr;
    public int QfsBiF;
    public final android.graphics.Paint RJOkX;
    public final android.graphics.Paint RcXXUw;
    public float dNCPSb;
    public boolean djBIcL;
    public final int ejfBZ;
    public float fARcdN;
    public int fIwbmz;
    public float fJNWhG;
    public float fetchVPNInfo;
    public java.lang.Integer gEmmrt;
    public final android.graphics.Rect gHZMYf;
    public int getFieldNames;
    public final android.graphics.Rect getNewProxyInstance;
    public final android.graphics.Paint hDKMBd;
    public int isConnected;
    public final android.graphics.Paint iwGUEr;
    public final RectF sSMYrx;
    public int uzCIH;
    public final float valueOf;
    public int values;
    public final java.lang.String[] wlaJM;
    public float zLjUOn;
    public final float[] zsXlph;
    public int zuBGHE;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final float[] OLrzqt = {0.0f, 25.0f, 50.0f, 75.0f, 100.0f};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46658tbN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46658tbN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ(float f) {
        float f2 = this.dNCPSb;
        return f2 + ((this.fetchVPNInfo / 100.0f) * (f - (2 * f2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnProgressChangeListener(@NotNull Function1<? super java.lang.Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.tbN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46658tbN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46658tbN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.AEQbTJ = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        this.AkhnZx = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(style);
        this.iwGUEr = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        paint4.setStyle(style);
        this.hDKMBd = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint(1);
        paint5.setStyle(style);
        this.RcXXUw = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint(1);
        paint6.setStyle(style);
        this.RJOkX = paint6;
        android.graphics.Paint paint7 = new android.graphics.Paint(1);
        paint7.setStyle(style);
        Paint.Align align = Paint.Align.CENTER;
        paint7.setTextAlign(align);
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint7.setTypeface(c55051xce.valueOf());
        this.AuCTel = paint7;
        android.graphics.Paint paint8 = new android.graphics.Paint(1);
        paint8.setStyle(style);
        this.OcIXYQ = paint8;
        android.graphics.Paint paint9 = new android.graphics.Paint(1);
        paint9.setStyle(style);
        paint9.setTextAlign(align);
        paint9.setTypeface(c55051xce.valueOf());
        this.AuCTelauCTel = paint9;
        this.DbNXlk = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.dNCPSb = C55298xhM.dp$default(9.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.QbewEr = C55298xhM.dp$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fJNWhG = C55298xhM.dp$default(5.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fARcdN = C55298xhM.dp$default(3.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.ejfBZ = 4;
        float[] fArr = OLrzqt;
        this.zsXlph = fArr;
        this.AwvSrB = true;
        this.QVAiDq = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        this.ORxRYg = C55298xhM.dp$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.QOLQEE = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.QKVWgx = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.DTwDnp = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.zLjUOn = C55298xhM.dp$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.EZpvd = C33070mpX.copydefault(C52761wXj.Activity.zuBGHE);
        this.isConnected = C33070mpX.copydefault(C52761wXj.Activity.QVAiDq);
        this.fIwbmz = C33070mpX.copydefault(C52761wXj.Activity.ORxRYg);
        this.getFieldNames = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        this.QfsBiF = C33070mpX.copydefault(C52761wXj.Activity.QVAiDq);
        this.QUSxYX = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        this.values = C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
        this.zuBGHE = C33070mpX.copydefault(C52761wXj.Activity.OBJEWx);
        this.uzCIH = C33070mpX.copydefault(C52761wXj.Activity.OBJEWx);
        this.valueOf = C55298xhM.dp$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.sSMYrx = new RectF();
        this.gHZMYf = new android.graphics.Rect();
        this.getNewProxyInstance = new android.graphics.Rect();
        int length = fArr.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = pTB.formatICUPercent$default(java.lang.Float.valueOf(this.zsXlph[i2]), null, C38307pTy.Companion.EZpvd(0), null, null, null, 29, null);
        }
        this.wlaJM = strArr;
        AEQbTJ(attributeSet);
        setupPaints();
    }

    /* JADX INFO: renamed from: o.tbN$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tbN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qZH.Fragment.AuCTel);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.AxsJAY = typedArrayObtainStyledAttributes.getBoolean(qZH.Fragment.fIwbmz, false);
                this.AwvSrB = typedArrayObtainStyledAttributes.getBoolean(qZH.Fragment.fJNWhG, true);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public final void setupPaints() {
        this.AEQbTJ.setColor(this.EZpvd);
        this.AkhnZx.setColor(this.isConnected);
        this.iwGUEr.setColor(this.fIwbmz);
        this.hDKMBd.setColor(this.getFieldNames);
        this.RcXXUw.setColor(this.QfsBiF);
        this.RJOkX.setColor(this.QUSxYX);
        this.AuCTel.setColor(this.values);
        this.AuCTel.setTextSize(this.QVAiDq);
        this.OcIXYQ.setColor(this.zuBGHE);
        this.AuCTelauCTel.setColor(this.uzCIH);
        this.AuCTelauCTel.setTextSize(this.QVAiDq);
        gEmmrt();
    }

    public final void gEmmrt() {
        this.AuCTelauCTel.getTextBounds("100%", 0, 4, this.getNewProxyInstance);
        this.AubY = this.getNewProxyInstance.height();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float fHeight;
        if (this.AxsJAY) {
            this.AuCTel.getTextBounds("100%", 0, 4, this.gHZMYf);
            fHeight = this.gHZMYf.height();
        } else {
            fHeight = 0.0f;
        }
        float f = 2;
        setMeasuredDimension(View.MeasureSpec.getSize(i), android.view.View.resolveSize((int) (this.AubY + this.zLjUOn + (this.dNCPSb * f) + this.ORxRYg + fHeight + (this.DTwDnp * f)), i2));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth();
        float height = ((getHeight() - this.AubY) - this.zLjUOn) - this.dNCPSb;
        OLrzqt(canvas, width, height);
        AEQbTJ(canvas, width, height);
        EZpvd(canvas, width, height);
        if (this.AwvSrB) {
            copydefault(canvas, width, this.dNCPSb + height + this.zLjUOn + (this.AubY / 2));
        }
        if (this.AxsJAY && this.djBIcL) {
            KWHzl(canvas, width, height);
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, float f, float f2) {
        RectF rectF = this.sSMYrx;
        float f3 = 2;
        float f4 = this.DbNXlk / f3;
        rectF.set(0.0f, f2 - f4, f, f4 + f2);
        RectF rectF2 = this.sSMYrx;
        float f5 = this.DbNXlk / f3;
        canvas.drawRoundRect(rectF2, f5, f5, this.AEQbTJ);
        float f6 = this.fetchVPNInfo;
        if (f6 > 0.0f) {
            RectF rectF3 = this.sSMYrx;
            float f7 = this.DbNXlk / f3;
            rectF3.set(0.0f, f2 - f7, (f6 / 100.0f) * f, f2 + f7);
            RectF rectF4 = this.sSMYrx;
            float f8 = this.DbNXlk / f3;
            canvas.drawRoundRect(rectF4, f8, f8, this.AkhnZx);
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        float f3;
        int i = this.ejfBZ;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 != 0) {
                int i3 = this.ejfBZ;
                if (i2 == i3) {
                    f3 = f - this.fJNWhG;
                } else {
                    float f4 = this.dNCPSb;
                    f3 = f4 + ((i2 * (f - (2 * f4))) / i3);
                }
            } else {
                f3 = this.fJNWhG;
            }
            this.iwGUEr.setColor((this.fetchVPNInfo > (((float) i2) * 25.0f) ? 1 : (this.fetchVPNInfo == (((float) i2) * 25.0f) ? 0 : -1)) >= 0 ? this.isConnected : this.fIwbmz);
            canvas.drawCircle(f3, f2, this.fJNWhG, this.iwGUEr);
            canvas.drawCircle(f3, f2, this.fARcdN, this.hDKMBd);
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, float f, float f2) {
        float fAEQbTJ = AEQbTJ(f);
        canvas.drawCircle(fAEQbTJ, f2, this.dNCPSb, this.RcXXUw);
        canvas.drawCircle(fAEQbTJ, f2, this.QbewEr, this.RJOkX);
    }

    public final void copydefault(android.graphics.Canvas canvas, float f, float f2) {
        float f3;
        int length = this.wlaJM.length;
        for (int i = 0; i < length; i++) {
            if (i == this.wlaJM.length - 1) {
                this.AuCTelauCTel.setTextAlign(Paint.Align.RIGHT);
                f3 = f;
            } else {
                this.AuCTelauCTel.setTextAlign(Paint.Align.CENTER);
                f3 = this.dNCPSb;
                if (i != 0) {
                    f3 += (i * (f - (2 * f3))) / this.ejfBZ;
                }
            }
            canvas.drawText(this.wlaJM[i], f3, f2, this.AuCTelauCTel);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f, float f2) {
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(java.lang.Float.valueOf(this.fetchVPNInfo), null, C38307pTy.Companion.EZpvd(2), null, null, null, 29, null);
        float fAEQbTJ = AEQbTJ(f);
        this.AuCTel.getTextBounds(iCUPercent$default, 0, iCUPercent$default.length(), this.gHZMYf);
        int iWidth = this.gHZMYf.width();
        int iHeight = this.gHZMYf.height();
        float f3 = (f2 - this.dNCPSb) - this.ORxRYg;
        float f4 = 2;
        float f5 = (iWidth + (this.QKVWgx * f4)) / f4;
        float fKWHzl = C56548yJl.KWHzl(fAEQbTJ, f5, f - f5);
        RectF rectF = this.sSMYrx;
        float f6 = iWidth / 2;
        float f7 = this.QKVWgx;
        float f8 = this.DTwDnp;
        rectF.set((fKWHzl - f6) - f7, (f3 - iHeight) - f8, f6 + fKWHzl + f7, f8 + f3);
        RectF rectF2 = this.sSMYrx;
        float f9 = this.QOLQEE;
        canvas.drawRoundRect(rectF2, f9, f9, this.OcIXYQ);
        canvas.drawText(iCUPercent$default, fKWHzl, f3, this.AuCTel);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.AhwBna = motionEvent.getX();
            this.KWHzl = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float fAbs = java.lang.Math.abs(motionEvent.getX() - this.AhwBna);
                if (this.KWHzl && fAbs > this.valueOf) {
                    this.djBIcL = true;
                    this.KWHzl = false;
                }
                if (this.djBIcL) {
                    EZpvd(motionEvent, false);
                    KWHzl();
                    invalidate();
                }
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
        }
        if (this.KWHzl) {
            EZpvd(motionEvent, true);
            AEQbTJ();
            invalidate();
        }
        EZpvd();
        OLrzqt();
        return true;
    }

    public static /* synthetic */ void updateProgress$default(C46658tbN c46658tbN, android.view.MotionEvent motionEvent, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c46658tbN.EZpvd(motionEvent, z);
    }

    public final void EZpvd(android.view.MotionEvent motionEvent, boolean z) {
        float width = getWidth() - (this.dNCPSb * 2);
        float fKWHzl = C56548yJl.KWHzl((C56548yJl.KWHzl(motionEvent.getX() - this.dNCPSb, 0.0f, width) / width) * 100.0f, 0.0f, 100.0f);
        if (z) {
            fKWHzl = OLrzqt(fKWHzl);
        }
        this.fetchVPNInfo = fKWHzl;
        Function1<? super java.lang.Float, Unit> function1 = this.AYXKKw;
        if (function1 != null) {
            function1.invoke(java.lang.Float.valueOf(fKWHzl));
        }
    }

    public final float OLrzqt(float f) {
        float f2 = this.zsXlph[0];
        float fAbs = java.lang.Math.abs(f - f2);
        for (float f3 : this.zsXlph) {
            float fAbs2 = java.lang.Math.abs(f - f3);
            if (fAbs2 < fAbs) {
                f2 = f3;
                fAbs = fAbs2;
            }
        }
        return f2;
    }

    public final void KWHzl() {
        int i = (int) this.fetchVPNInfo;
        java.lang.Integer num = this.gEmmrt;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.gEmmrt = java.lang.Integer.valueOf(i);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        C55168xep c55168xep = C55168xep.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55168xep.KWHzl(context, 10L);
    }

    public final void EZpvd() {
        this.djBIcL = false;
        this.KWHzl = false;
        this.gEmmrt = null;
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
    }

    public final void setProgress(float f) {
        this.fetchVPNInfo = C56548yJl.KWHzl(f, 0.0f, 100.0f);
        invalidate();
    }

    public final void copydefault() {
        this.fetchVPNInfo = 0.0f;
        this.gEmmrt = null;
        invalidate();
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("PriceAlert_AddAlert_PositiveSlider_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
