package o;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import o.C52761wXj;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUZ extends android.view.View {
    public int AEQbTJ;
    public final float AYXKKw;
    public float AhwBna;
    public boolean AkhnZx;
    public float AuCTel;
    public final int AuCTelauCTel;
    public final android.graphics.Paint AubY;
    public float AwvSrB;
    public android.animation.ValueAnimator AxsJAY;
    public android.animation.ValueAnimator DbNXlk;
    public java.lang.String EZpvd;
    public final long KWHzl;
    public android.animation.ValueAnimator OLrzqt;
    public int OcIXYQ;
    public Function1<? super java.lang.Integer, Unit> QKVWgx;
    public final float copydefault;
    public final int djBIcL;
    public final android.graphics.Paint ejfBZ;
    public final android.graphics.Path fARcdN;
    public final android.graphics.Paint fIwbmz;
    public final float fJNWhG;
    public boolean fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public android.animation.ValueAnimator gHZMYf;
    public int getFieldNames;
    public final int getNewProxyInstance;
    public android.animation.ValueAnimator hDKMBd;
    public float isConnected;
    public final int iwGUEr;
    public int sSMYrx;
    public java.lang.String uzCIH;
    public final int valueOf;
    public boolean values;
    public float wlaJM;
    public final android.graphics.Paint zLjUOn;
    public float zsXlph;
    public android.animation.ValueAnimator zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnVoteListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.QKVWgx = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.tUZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        this.AuCTelauCTel = iTradeRiseGraph$default;
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        this.djBIcL = iTradeFallGraph$default;
        this.iwGUEr = C33512mxp.tradeRiseHighlightsInteractive$default(c33512mxp, context, 0.0f, 2, null);
        this.getNewProxyInstance = C33512mxp.tradeFallHighlightsInteractive$default(c33512mxp, context, 0.0f, 2, null);
        this.valueOf = C55298xhM.dp2px$default(28.0f, null, 1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(iTradeRiseGraph$default);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.ejfBZ = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(iTradeFallGraph$default);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        this.zLjUOn = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        paint3.setTextSize(C55298xhM.sp2pxFloat$default(12.0f, null, 1, null));
        paint3.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint3.setTypeface(c55051xce.OLrzqt());
        this.gEmmrt = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        paint4.setTextSize(C55298xhM.sp2pxFloat$default(12.0f, null, 1, null));
        paint4.setAntiAlias(true);
        paint4.setTextAlign(align);
        paint4.setTypeface(c55051xce.OLrzqt());
        this.fIwbmz = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        paint5.setTextSize(C55298xhM.sp2pxFloat$default(14.0f, null, 1, null));
        paint5.setAntiAlias(true);
        paint5.setTextAlign(align);
        paint5.setTypeface(c55051xce.AEQbTJ());
        this.AubY = paint5;
        this.AuCTel = 0.5f;
        this.AhwBna = 0.5f;
        this.fARcdN = new android.graphics.Path();
        this.AYXKKw = C55298xhM.dp2pxFloat$default(12.0f, null, 1, null);
        this.copydefault = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
        this.fJNWhG = C55298xhM.dp2pxFloat$default(50.0f, null, 1, null);
        this.isConnected = C55298xhM.dp2pxFloat$default(50.0f, null, 1, null);
        this.zsXlph = C55298xhM.dp2pxFloat$default(50.0f, null, 1, null);
        this.KWHzl = 300L;
        this.uzCIH = "";
        this.EZpvd = "";
        this.wlaJM = this.AuCTel;
    }

    public final void setVoteData(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i2, int i3) {
        float f;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z = i != 0;
        this.values = z;
        this.OcIXYQ = i;
        int i4 = i2 + i3;
        this.sSMYrx = i4;
        this.getFieldNames = i2;
        this.AEQbTJ = i3;
        this.uzCIH = str;
        this.EZpvd = str2;
        if (!z || i4 <= 0) {
            f = 0.5f;
        } else {
            this.AwvSrB = 1.0f;
            f = i2 / i4;
        }
        this.AuCTel = f;
        setPercentage(f, false);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.valueOf, 1073741824));
    }

    public final void setPercentage(float f, boolean z) {
        float fKWHzl = C56548yJl.KWHzl(f, 0.0f, 1.0f);
        this.AhwBna = fKWHzl;
        if (!z) {
            this.AuCTel = fKWHzl;
            invalidate();
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.AuCTel, fKWHzl);
        valueAnimatorOfFloat.setDuration(this.KWHzl);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                tUZ.setPercentage$lambda$6$lambda$5(this.KWHzl, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.OLrzqt = valueAnimatorOfFloat;
    }

    public static final void setPercentage$lambda$6$lambda$5(tUZ tuz, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        tuz.AuCTel = ((java.lang.Float) animatedValue).floatValue();
        tuz.invalidate();
    }

    public final void KWHzl() {
        android.animation.ValueAnimator valueAnimator = this.zuBGHE;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.KWHzl);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tVd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                tUZ.EZpvd(this.EZpvd, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.zuBGHE = valueAnimatorOfFloat;
    }

    public static final void EZpvd(tUZ tuz, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        tuz.AwvSrB = ((java.lang.Float) animatedValue).floatValue();
        tuz.invalidate();
    }

    public final void setPressedState(boolean z, boolean z2) {
        int i = z ? z2 ? this.iwGUEr : this.AuCTelauCTel : z2 ? this.getNewProxyInstance : this.djBIcL;
        if (z) {
            android.animation.ValueAnimator valueAnimator = this.DbNXlk;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator valueAnimatorOfArgb = android.animation.ValueAnimator.ofArgb(this.ejfBZ.getColor(), i);
            valueAnimatorOfArgb.setDuration(this.KWHzl);
            valueAnimatorOfArgb.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tVa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    tUZ.setPressedState$lambda$10$lambda$9(this.EZpvd, valueAnimator2);
                }
            });
            valueAnimatorOfArgb.start();
            this.DbNXlk = valueAnimatorOfArgb;
            this.AkhnZx = z2;
            return;
        }
        android.animation.ValueAnimator valueAnimator2 = this.hDKMBd;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfArgb2 = android.animation.ValueAnimator.ofArgb(this.zLjUOn.getColor(), i);
        valueAnimatorOfArgb2.setDuration(this.KWHzl);
        valueAnimatorOfArgb2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tVf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                tUZ.setPressedState$lambda$12$lambda$11(this.KWHzl, valueAnimator3);
            }
        });
        valueAnimatorOfArgb2.start();
        this.hDKMBd = valueAnimatorOfArgb2;
        this.fetchVPNInfo = z2;
    }

    public static final void setPressedState$lambda$10$lambda$9(tUZ tuz, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.graphics.Paint paint = tuz.ejfBZ;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        paint.setColor(((java.lang.Integer) animatedValue).intValue());
        tuz.invalidate();
    }

    public static final void setPressedState$lambda$12$lambda$11(tUZ tuz, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.graphics.Paint paint = tuz.zLjUOn;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        paint.setColor(((java.lang.Integer) animatedValue).intValue());
        tuz.invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.zuBGHE;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.AxsJAY;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        android.animation.ValueAnimator valueAnimator4 = this.DbNXlk;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        android.animation.ValueAnimator valueAnimator5 = this.hDKMBd;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        android.animation.ValueAnimator valueAnimator6 = this.gHZMYf;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.uzCIH.length() == 0 || this.EZpvd.length() == 0) {
            return;
        }
        float width = getWidth();
        float f = this.valueOf;
        float f2 = 2;
        float f3 = f / f2;
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        float f4 = this.fJNWhG;
        float f5 = this.AuCTel;
        if (f5 != 0.0f) {
            f4 = f5 == 1.0f ? width - f4 : f4 + ((width - (f2 * f4)) * f5);
        }
        this.fARcdN.reset();
        this.fARcdN.addArc(0.0f, 0.0f, f, f, 90.0f, 180.0f);
        this.fARcdN.lineTo(f4, 0.0f);
        this.fARcdN.lineTo(f4 - this.AYXKKw, f);
        this.fARcdN.lineTo(f3, f);
        this.fARcdN.close();
        canvas.drawPath(this.fARcdN, this.ejfBZ);
        this.fARcdN.reset();
        float f6 = f4;
        this.fARcdN.addArc(width - f, 0.0f, width, f, 270.0f, 180.0f);
        this.fARcdN.lineTo(f6, f);
        this.fARcdN.lineTo(this.AYXKKw + f6, 0.0f);
        this.fARcdN.lineTo(width - f3, 0.0f);
        this.fARcdN.close();
        canvas.drawPath(this.fARcdN, this.zLjUOn);
        float textSize = ((f + this.gEmmrt.getTextSize()) - this.gEmmrt.descent()) / f2;
        if (!this.values) {
            float f7 = f6 / f2;
            this.isConnected = f7;
            this.zsXlph = (width + f6) / f2;
            canvas.drawText(this.uzCIH, f7, textSize, this.gEmmrt);
            canvas.drawText(this.EZpvd, this.zsXlph, textSize, this.gEmmrt);
        } else {
            float f8 = this.AhwBna;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            C38307pTy.Application application = C38307pTy.Companion;
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(java.lang.Float.valueOf(f8), roundingMode, application.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 20, null);
            java.lang.String iCUPercent$default2 = pTB.formatICUPercent$default(java.lang.Float.valueOf(1 - this.AhwBna), roundingMode, application.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 20, null);
            float f9 = this.isConnected;
            float f10 = this.copydefault;
            float f11 = this.AwvSrB;
            float f12 = this.zsXlph;
            android.graphics.Paint paint = this.fIwbmz;
            Paint.Align align = Paint.Align.LEFT;
            paint.setTextAlign(align);
            this.AubY.setTextAlign(align);
            canvas.drawText(iCUPercent$default, f9 + ((f10 - f9) * f11), textSize, this.OcIXYQ == 1 ? this.AubY : this.fIwbmz);
            android.graphics.Paint paint2 = this.fIwbmz;
            Paint.Align align2 = Paint.Align.RIGHT;
            paint2.setTextAlign(align2);
            this.AubY.setTextAlign(align2);
            canvas.drawText(iCUPercent$default2, f12 + (((width - f10) - f12) * f11), textSize, this.OcIXYQ == 2 ? this.AubY : this.fIwbmz);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        float f;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!C46388tSm.Companion.KWHzl().gEmmrt()) {
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (y < 0.0f || y > this.valueOf) {
                return false;
            }
            float width = getWidth();
            float f2 = this.AuCTel;
            if (f2 == 0.0f) {
                f = this.fJNWhG;
            } else if (f2 == 1.0f) {
                f = width - this.fJNWhG;
            } else {
                float f3 = this.fJNWhG;
                f = ((width - (2 * f3)) * f2) + f3;
            }
            if (!this.values) {
                if (x < f) {
                    setPressedState(true, true);
                    this.OcIXYQ = 1;
                    this.wlaJM = (this.getFieldNames + 1.0f) / (this.sSMYrx + 1.0f);
                } else {
                    setPressedState(false, true);
                    this.wlaJM = 1 - ((this.AEQbTJ + 1.0f) / (this.sSMYrx + 1.0f));
                    this.OcIXYQ = 2;
                }
                invalidate();
            }
            return true;
        }
        if (action == 1 || action == 3) {
            if (!this.values) {
                this.values = true;
                this.sSMYrx++;
                setPercentage(this.wlaJM, true);
                KWHzl();
                Function1<? super java.lang.Integer, Unit> function1 = this.QKVWgx;
                if (function1 != null) {
                    function1.invoke(java.lang.Integer.valueOf(this.OcIXYQ));
                }
            }
            if (this.AkhnZx) {
                setPressedState(true, false);
            }
            if (this.fetchVPNInfo) {
                setPressedState(false, false);
            }
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.zuBGHE;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.AxsJAY;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        android.animation.ValueAnimator valueAnimator4 = this.DbNXlk;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        android.animation.ValueAnimator valueAnimator5 = this.hDKMBd;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        android.animation.ValueAnimator valueAnimator6 = this.gHZMYf;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        this.values = false;
        this.OcIXYQ = 0;
        int i = this.sSMYrx;
        this.sSMYrx = C56548yJl.EZpvd(i, 0, i - 1);
        this.AwvSrB = 0.0f;
        this.AuCTel = 0.5f;
        this.wlaJM = 0.5f;
        this.AkhnZx = false;
        this.fetchVPNInfo = false;
        invalidate();
    }
}
