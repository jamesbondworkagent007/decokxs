package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.okinc.components.track.TrackChannel;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46686tbp extends android.view.View {
    public final android.graphics.Paint AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public Function1<? super java.lang.Float, Unit> AkhnZx;
    public int AuCTel;
    public float AuCTelauCTel;
    public int AubY;
    public final android.graphics.Paint AwvSrB;
    public final android.graphics.Paint AxsJAY;
    public int DbNXlk;
    public boolean EZpvd;
    public java.lang.Integer KWHzl;
    public int OLrzqt;
    public final int QKVWgx;
    public final RectF copydefault;
    public float djBIcL;
    public final RectF ejfBZ;
    public int fARcdN;
    public boolean fIwbmz;
    public final android.graphics.Paint fJNWhG;
    public float fetchVPNInfo;
    public float gEmmrt;
    public float gHZMYf;
    public float getFieldNames;
    public final RectF getNewProxyInstance;
    public float hDKMBd;
    public final android.graphics.Paint isConnected;
    public final android.graphics.Rect iwGUEr;
    public int sSMYrx;
    public float uzCIH;
    public int valueOf;
    public float values;
    public float wlaJM;
    public final android.graphics.Paint zLjUOn;
    public float zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46686tbp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46686tbp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt(float f, float f2) {
        return f + ((this.values / this.AhwBna) * ((f2 / 2.0f) - this.zuBGHE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnProgressChangeListener(@NotNull Function1<? super java.lang.Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AkhnZx = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.tbp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46686tbp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46686tbp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new android.graphics.Paint(1);
        this.isConnected = new android.graphics.Paint(1);
        this.AwvSrB = new android.graphics.Paint(1);
        this.AxsJAY = new android.graphics.Paint(1);
        this.zLjUOn = new android.graphics.Paint(1);
        this.fJNWhG = new android.graphics.Paint(1);
        this.fetchVPNInfo = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.zuBGHE = C55298xhM.dp$default(9.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.gHZMYf = C55298xhM.dp$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AhwBna = 25.0f;
        this.djBIcL = -25.0f;
        this.fIwbmz = true;
        this.wlaJM = C55298xhM.dp$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.getFieldNames = C55298xhM.dp$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.hDKMBd = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AuCTelauCTel = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.zsXlph = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.gEmmrt = C55298xhM.dp$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.OLrzqt = C33070mpX.copydefault(C52761wXj.Activity.zuBGHE);
        this.DbNXlk = C33070mpX.copydefault(C52761wXj.Activity.QVAiDq);
        this.AubY = C33070mpX.copydefault(C52761wXj.Activity.QVAiDq);
        this.sSMYrx = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        this.AuCTel = C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
        this.valueOf = C33070mpX.copydefault(C52761wXj.Activity.OBJEWx);
        this.fARcdN = C33070mpX.copydefault(C52761wXj.Activity.OBJEWx);
        this.iwGUEr = new android.graphics.Rect();
        this.copydefault = new RectF();
        this.ejfBZ = new RectF();
        this.getNewProxyInstance = new RectF();
        this.QKVWgx = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qZH.Fragment.gEmmrt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.fIwbmz = typedArrayObtainStyledAttributes.getBoolean(qZH.Fragment.values, true);
            this.AhwBna = typedArrayObtainStyledAttributes.getFloat(qZH.Fragment.DbNXlk, 25.0f);
            this.djBIcL = typedArrayObtainStyledAttributes.getFloat(qZH.Fragment.fetchVPNInfo, -25.0f);
            typedArrayObtainStyledAttributes.recycle();
            setupPaints();
            AEQbTJ();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setupPaints() {
        this.AEQbTJ.setColor(this.OLrzqt);
        android.graphics.Paint paint = this.AEQbTJ;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.isConnected.setColor(this.DbNXlk);
        this.isConnected.setStyle(style);
        this.AwvSrB.setColor(this.AubY);
        this.AwvSrB.setStyle(style);
        this.AxsJAY.setColor(this.sSMYrx);
        this.AxsJAY.setStyle(style);
        this.zLjUOn.setTextSize(this.wlaJM);
        this.zLjUOn.setTextAlign(Paint.Align.CENTER);
        this.zLjUOn.setStyle(style);
        this.zLjUOn.setTypeface(C55051xce.OLrzqt.valueOf());
        this.fJNWhG.setColor(this.fARcdN);
        this.fJNWhG.setStyle(style);
    }

    public final void AEQbTJ() {
        this.zLjUOn.getTextBounds("25%", 0, 3, this.iwGUEr);
        this.uzCIH = this.iwGUEr.height();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f = 2;
        setMeasuredDimension(View.MeasureSpec.getSize(i), android.view.View.resolveSize((int) (this.uzCIH + this.gEmmrt + (this.zuBGHE * f) + this.getFieldNames + (this.fIwbmz ? this.uzCIH : 0.0f) + (this.zsXlph * f)), i2));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = width / 2.0f;
        float f2 = ((height - this.uzCIH) - this.gEmmrt) - this.zuBGHE;
        this.zLjUOn.setColor(this.valueOf);
        this.zLjUOn.setTextAlign(Paint.Align.LEFT);
        float f3 = this.djBIcL;
        C38307pTy.Application application = C38307pTy.Companion;
        canvas.drawText(pTB.formatICUPercent$default(java.lang.Float.valueOf(f3), null, application.EZpvd(0), null, null, null, 29, null), 0.0f, height, this.zLjUOn);
        this.zLjUOn.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(pTB.formatICUPercent$default(java.lang.Float.valueOf(this.AhwBna), null, application.EZpvd(0), null, null, null, 29, null), width, height, this.zLjUOn);
        RectF rectF = this.copydefault;
        float f4 = 2;
        float f5 = this.fetchVPNInfo / f4;
        rectF.set(0.0f, f2 - f5, width, f5 + f2);
        RectF rectF2 = this.copydefault;
        float f6 = this.fetchVPNInfo / f4;
        canvas.drawRoundRect(rectF2, f6, f6, this.AEQbTJ);
        float f7 = this.values;
        if (f7 != 0.0f) {
            float fAbs = (java.lang.Math.abs(f7) / this.AhwBna) * (width / f4);
            if (this.values > 0.0f) {
                RectF rectF3 = this.ejfBZ;
                float f8 = this.fetchVPNInfo / f4;
                rectF3.set(f, f2 - f8, fAbs + f, f8 + f2);
            } else {
                RectF rectF4 = this.ejfBZ;
                float f9 = this.fetchVPNInfo / f4;
                rectF4.set(f - fAbs, f2 - f9, f, f9 + f2);
            }
            RectF rectF5 = this.ejfBZ;
            float f10 = this.fetchVPNInfo / f4;
            canvas.drawRoundRect(rectF5, f10, f10, this.isConnected);
        }
        float fOLrzqt = OLrzqt(f, width);
        canvas.drawCircle(fOLrzqt, f2, this.zuBGHE, this.AwvSrB);
        canvas.drawCircle(fOLrzqt, f2, this.gHZMYf, this.AxsJAY);
        if (this.fIwbmz && this.EZpvd) {
            EZpvd(canvas, fOLrzqt, f2, width);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, float f, float f2, float f3) {
        float f4 = this.values;
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(java.lang.Float.valueOf(f4), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(0), null, null, null, 28, null);
        float fMeasureText = this.zLjUOn.measureText(iCUPercent$default);
        float f5 = (f2 - this.zuBGHE) - this.getFieldNames;
        float f6 = this.AuCTelauCTel;
        float f7 = 2;
        float f8 = ((f6 * f7) + fMeasureText) / f7;
        if (f < f8) {
            f = f8;
        } else {
            float f9 = f3 - f8;
            if (f > f9) {
                f = f9;
            }
        }
        RectF rectF = this.getNewProxyInstance;
        float f10 = fMeasureText / f7;
        float f11 = this.uzCIH;
        float f12 = this.zsXlph;
        rectF.set((f - f10) - f6, (f5 - f11) - f12, f10 + f + f6, f12 + f5);
        RectF rectF2 = this.getNewProxyInstance;
        float f13 = this.hDKMBd;
        canvas.drawRoundRect(rectF2, f13, f13, this.fJNWhG);
        this.zLjUOn.setTextAlign(Paint.Align.CENTER);
        this.zLjUOn.setColor(this.AuCTel);
        canvas.drawText(iCUPercent$default, f, f5, this.zLjUOn);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.AYXKKw = motionEvent.getX();
            this.EZpvd = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            KWHzl(AEQbTJ(motionEvent.getX()));
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.EZpvd || java.lang.Math.abs(motionEvent.getX() - this.AYXKKw) < this.QKVWgx / 4) {
                    return true;
                }
                KWHzl(AEQbTJ(motionEvent.getX()));
                this.AYXKKw = motionEvent.getX();
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
        }
        this.EZpvd = false;
        this.KWHzl = null;
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
        KWHzl();
        return true;
    }

    public final float AEQbTJ(float f) {
        float width = getWidth() / 2.0f;
        return ((f - width) / (width - this.zuBGHE)) * this.AhwBna;
    }

    public final void KWHzl(float f) {
        float fKWHzl = C56548yJl.KWHzl(f, this.djBIcL, this.AhwBna);
        this.values = fKWHzl;
        int i = (int) fKWHzl;
        java.lang.Integer num = this.KWHzl;
        if (num == null || num.intValue() != i) {
            this.KWHzl = java.lang.Integer.valueOf(i);
            Function1<? super java.lang.Float, Unit> function1 = this.AkhnZx;
            if (function1 != null) {
                function1.invoke(java.lang.Float.valueOf(i));
            }
            C55168xep c55168xep = C55168xep.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55168xep.KWHzl(context, 10L);
        }
        invalidate();
    }

    public final void OLrzqt() {
        this.values = 0.0f;
        this.KWHzl = null;
        invalidate();
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("PriceAlert_AddAlert_PositiveNegativeSlider_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
