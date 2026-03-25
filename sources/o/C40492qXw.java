package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40492qXw extends AppCompatTextView {
    public android.os.CountDownTimer AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public CountDownType AhwBna;
    public final RectF AkhnZx;
    public final float AuCTel;
    public java.lang.String AubY;
    public final RectF DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final float KWHzl;
    public final float OLrzqt;
    public final float copydefault;
    public final RectF djBIcL;
    public Function1<? super java.lang.Long, Unit> ejfBZ;
    public final RectF fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final int fJNWhG;
    public final RectF fetchVPNInfo;
    public final RectF gEmmrt;
    public boolean getFieldNames;
    public final float getNewProxyInstance;
    public final float hDKMBd;
    public final RectF isConnected;
    public boolean iwGUEr;
    public final float uzCIH;
    public long valueOf;
    public final InterfaceC56387yDm values;
    public final android.graphics.Rect wlaJM;
    public Quartet<java.lang.String, java.lang.String, java.lang.String, java.lang.String> zsXlph;

    /* JADX INFO: renamed from: o.qXw$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CountDownType.values().length];
            try {
                iArr[CountDownType.SHOW_EXPECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CountDownType.SHOW_COUNT_DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40492qXw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40492qXw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.qXw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40492qXw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40492qXw(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.qXz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40492qXw.AEQbTJ(context);
            }
        });
        this.djBIcL = new RectF();
        this.gEmmrt = new RectF();
        this.AkhnZx = new RectF();
        this.fetchVPNInfo = new RectF();
        this.DbNXlk = new RectF();
        this.isConnected = new RectF();
        this.fARcdN = new RectF();
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.qXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40492qXw.gEmmrt();
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.qXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40492qXw.EZpvd();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40492qXw.OLrzqt();
            }
        });
        this.iwGUEr = true;
        this.getFieldNames = true;
        this.wlaJM = new android.graphics.Rect();
        this.zsXlph = new Quartet<>(null, "00", "00", "00");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pVX.FragmentManager.RJOkX);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.uzCIH = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.flVtFt, C55298xhM.AEQbTJ(24, context));
        this.getNewProxyInstance = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.finit, C55298xhM.AEQbTJ(20, context));
        this.hDKMBd = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.dvKsVJ, C55298xhM.AEQbTJ(3, context));
        int color = typedArrayObtainStyledAttributes.getColor(pVX.FragmentManager.fFgQHt, C41431qqg.getColor$default(this, C52761wXj.Activity.invokespecialDPHOMC, null, 2, null));
        this.fJNWhG = color;
        this.AuCTel = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.fZBcTu, C55298xhM.AEQbTJ(7, context));
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.QbewEr, C55298xhM.OLrzqt(1.5f, context));
        this.KWHzl = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.QUSxYX, C55298xhM.OLrzqt(3.0f, context));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(pVX.FragmentManager.UeEOUB, C52761wXj.Dialog.KWHzl);
        float dimension = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.RcXXUw, C55298xhM.gEmmrt(12.0f, context));
        int color2 = typedArrayObtainStyledAttributes.getColor(pVX.FragmentManager.QVAiDq, C41431qqg.getColor$default(this, C52761wXj.Activity.QwvEab, null, 2, null));
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.djSkpj, C55298xhM.gEmmrt(4.0f, context));
        this.iwGUEr = typedArrayObtainStyledAttributes.getBoolean(pVX.FragmentManager.gasjUx, true);
        this.getFieldNames = typedArrayObtainStyledAttributes.getBoolean(pVX.FragmentManager.fvQaOB, true);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(pVX.FragmentManager.aKErDB, C52761wXj.Dialog.AEQbTJ);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.dxcTrN, C55298xhM.gEmmrt(15.0f, context));
        int color3 = typedArrayObtainStyledAttributes.getColor(pVX.FragmentManager.dNCPSb, C41431qqg.getColor$default(this, C52761wXj.Activity.fdOvFl, null, 2, null));
        typedArrayObtainStyledAttributes.recycle();
        getPaint().setTextAlign(Paint.Align.CENTER);
        getPaint().setColor(getTextColors().getDefaultColor());
        DbNXlk().setColor(color);
        AhwBna().setTypeface(ResourcesCompat.getFont(context, resourceId));
        AhwBna().setTextSize(dimension);
        AhwBna().setColor(color2);
        isConnected().setTypeface(ResourcesCompat.getFont(context, resourceId2));
        isConnected().setTextSize(dimension2);
        isConnected().setColor(color3);
        if (isInEditMode()) {
            setDeadlineTime$default(this, CountDownType.SHOW_COUNT_DOWN, "Trading Count Down", ((long) 86400000) + java.lang.System.currentTimeMillis(), null, 8, null);
        }
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String AEQbTJ(android.content.Context context) {
        return context.getString(pVX.LoaderManager.gEmmrt);
    }

    private final android.graphics.Paint DbNXlk() {
        return (android.graphics.Paint) this.fIwbmz.getValue();
    }

    public static final android.graphics.Paint gEmmrt() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        return paint;
    }

    private final android.text.TextPaint isConnected() {
        return (android.text.TextPaint) this.values.getValue();
    }

    public static final android.text.TextPaint EZpvd() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    private final android.text.TextPaint AhwBna() {
        return (android.text.TextPaint) this.EZpvd.getValue();
    }

    public static final android.text.TextPaint OLrzqt() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    private final void KWHzl(CountDownType countDownType) {
        if (this.AhwBna != countDownType) {
            this.AhwBna = countDownType;
            requestLayout();
        }
    }

    private final void copydefault(Quartet<java.lang.String, java.lang.String, java.lang.String, java.lang.String> quartet) {
        if (Intrinsics.EZpvd(this.zsXlph, quartet)) {
            return;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) this.zsXlph.getFirst(), (java.lang.Object) quartet.getFirst())) {
            requestLayout();
        }
        this.zsXlph = quartet;
        invalidate();
    }

    private final void OLrzqt(long j) {
        if (this.valueOf == j) {
            return;
        }
        this.valueOf = j;
        if (j == 0) {
            valueOf();
        } else {
            AEQbTJ(j);
        }
    }

    public static final void KWHzl(C40492qXw c40492qXw, long j) {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        java.lang.String str = null;
        java.lang.String strValueOf3 = "00";
        if (j <= 0) {
            c40492qXw.valueOf();
            c40492qXw.copydefault(c40492qXw.zsXlph.copy(null, "00", "00", "00"));
            return;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j);
        if (days != 0) {
            str = days + c40492qXw.djBIcL();
        }
        long hours = timeUnit.toHours(j) % ((long) 24);
        if (hours == 0) {
            strValueOf = "00";
        } else if (hours < 10) {
            strValueOf = "0" + hours;
        } else {
            strValueOf = java.lang.String.valueOf(hours);
        }
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        if (minutes == 0) {
            strValueOf2 = "00";
        } else if (minutes < 10) {
            strValueOf2 = "0" + minutes;
        } else {
            strValueOf2 = java.lang.String.valueOf(minutes);
        }
        long seconds = timeUnit.toSeconds(j) % j2;
        if (seconds != 0) {
            if (seconds < 10) {
                strValueOf3 = "0" + seconds;
            } else {
                strValueOf3 = java.lang.String.valueOf(seconds);
            }
        }
        c40492qXw.copydefault(c40492qXw.zsXlph.copy(str, strValueOf, strValueOf2, strValueOf3));
    }

    public final void AEQbTJ(long j) {
        if (j < java.lang.System.currentTimeMillis()) {
            KWHzl(this, 0L);
            return;
        }
        KWHzl(this, j - java.lang.System.currentTimeMillis());
        valueOf();
        StateListAnimator stateListAnimator = new StateListAnimator(j, this, j - java.lang.System.currentTimeMillis());
        this.AEQbTJ = stateListAnimator;
        stateListAnimator.start();
    }

    /* JADX INFO: renamed from: o.qXw$StateListAnimator */
    public static final class StateListAnimator extends android.os.CountDownTimer {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C40492qXw OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(long j, C40492qXw c40492qXw, long j2) {
            super(j2, 1000L);
            this.KWHzl = j;
            this.OLrzqt = c40492qXw;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C40492qXw.KWHzl(this.OLrzqt, this.KWHzl - java.lang.System.currentTimeMillis());
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C40492qXw.KWHzl(this.OLrzqt, this.KWHzl - java.lang.System.currentTimeMillis());
            Function1 function1 = this.OLrzqt.ejfBZ;
            if (function1 != null) {
                function1.invoke(java.lang.Long.valueOf(this.KWHzl));
            }
            this.OLrzqt.AEQbTJ = null;
        }
    }

    private final void valueOf() {
        android.os.CountDownTimer countDownTimer = this.AEQbTJ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.AEQbTJ = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AEQbTJ(this.valueOf);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        valueOf();
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        java.lang.String str = this.AubY;
        if (str == null) {
            str = "";
        }
        CountDownType countDownType = this.AhwBna;
        int i3 = countDownType == null ? -1 : ActionBar.KWHzl[countDownType.ordinal()];
        if (i3 == 1) {
            isConnected().getTextBounds(str, 0, str.length(), this.wlaJM);
            android.graphics.Rect rect = this.wlaJM;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            rect.inset(0, -((int) C55298xhM.AEQbTJ(2, context)));
            this.wlaJM.offsetTo(0, 0);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.wlaJM.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.wlaJM.height(), 1073741824));
            return;
        }
        if (i3 == 2) {
            if (this.getFieldNames && str.length() > 0) {
                AhwBna().getTextBounds(str, 0, str.length(), this.wlaJM);
                android.graphics.Rect rect2 = this.wlaJM;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                rect2.inset(0, -((int) C55298xhM.AEQbTJ(2, context2)));
                this.wlaJM.offsetTo(0, 0);
                f = this.wlaJM.bottom + this.OLrzqt;
            } else {
                this.wlaJM.set(0, 0, 0, 0);
                f = 0.0f;
            }
            int i4 = this.zsXlph.getFirst() != null ? 4 : 3;
            if (this.iwGUEr) {
                int i5 = (int) ((this.uzCIH * i4) + (this.AuCTel * (i4 - 1)));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C56548yJl.copydefault(i5, this.getFieldNames ? this.wlaJM.width() : 0), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (this.getNewProxyInstance + f), 1073741824);
                float f2 = 2;
                float f3 = this.AuCTel / f2;
                float f4 = this.copydefault / f2;
                float f5 = f3 - f4;
                float f6 = this.getNewProxyInstance;
                float f7 = ((f6 / f2) - f4) + f;
                this.djBIcL.set(0.0f, 0.0f, this.uzCIH, f6);
                this.djBIcL.offset(0.0f, f);
                if (this.getFieldNames && this.wlaJM.width() > i5) {
                    this.djBIcL.offset(this.wlaJM.width() - i5, 0.0f);
                }
                if (this.zsXlph.getFirst() == null) {
                    this.djBIcL.offset((-this.uzCIH) - this.AuCTel, 0.0f);
                }
                RectF rectF = this.gEmmrt;
                float f8 = this.copydefault;
                rectF.set(0.0f, 0.0f, f8, f8);
                this.gEmmrt.offset(this.djBIcL.right + f5, f7);
                this.AkhnZx.set(this.djBIcL);
                this.AkhnZx.offset(this.AuCTel + this.djBIcL.width(), 0.0f);
                RectF rectF2 = this.fetchVPNInfo;
                float f9 = this.copydefault;
                rectF2.set(0.0f, 0.0f, f9, f9);
                this.fetchVPNInfo.offset(this.AkhnZx.right + f5, f7);
                this.DbNXlk.set(this.AkhnZx);
                this.DbNXlk.offset(this.AuCTel + this.AkhnZx.width(), 0.0f);
                RectF rectF3 = this.isConnected;
                float f10 = this.copydefault;
                rectF3.set(0.0f, 0.0f, f10, f10);
                this.isConnected.offset(this.DbNXlk.right + f5, f7);
                this.fARcdN.set(this.DbNXlk);
                this.fARcdN.offset(this.AuCTel + this.DbNXlk.width(), 0.0f);
                super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
                return;
            }
            float fMeasureText = getPaint().measureText(AYXKKw());
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            float f11 = fontMetrics.bottom;
            float f12 = fontMetrics.top;
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((int) C56548yJl.copydefault(fMeasureText, this.getFieldNames ? this.wlaJM.width() : 0.0f), 1073741824);
            float f13 = (f11 - f12) + f;
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec((int) f13, 1073741824);
            this.djBIcL.set(0.0f, f, fMeasureText, f13);
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        CountDownType countDownType = this.AhwBna;
        int i = countDownType == null ? -1 : ActionBar.KWHzl[countDownType.ordinal()];
        if (i == 1) {
            KWHzl(canvas);
        } else {
            if (i != 2) {
                return;
            }
            EZpvd(canvas);
            if (this.getFieldNames) {
                AEQbTJ(canvas);
            }
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        java.lang.String str = this.AubY;
        if (str == null) {
            return;
        }
        Paint.FontMetrics fontMetrics = isConnected().getFontMetrics();
        canvas.drawText(str, getWidth() / 2.0f, ((getHeight() - fontMetrics.top) - fontMetrics.bottom) / 2, isConnected());
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        AhwBna().setTextAlign(Paint.Align.RIGHT);
        java.lang.String str = this.AubY;
        if (str == null) {
            return;
        }
        Paint.FontMetrics fontMetrics = AhwBna().getFontMetrics();
        canvas.drawText(str, getWidth(), ((this.wlaJM.height() - fontMetrics.top) - fontMetrics.bottom) / 2, AhwBna());
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        Quartet<java.lang.String, java.lang.String, java.lang.String, java.lang.String> quartet = this.zsXlph;
        java.lang.String strComponent1 = quartet.component1();
        java.lang.String strComponent2 = quartet.component2();
        java.lang.String strComponent3 = quartet.component3();
        java.lang.String strComponent4 = quartet.component4();
        if (this.iwGUEr) {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            float f = 2;
            float fHeight = ((this.djBIcL.height() - fontMetrics.top) - fontMetrics.bottom) / f;
            RectF rectF = this.djBIcL;
            float f2 = fHeight + rectF.top;
            float f3 = (this.KWHzl / f) + (this.copydefault / f);
            if (strComponent1 != null) {
                float f4 = this.hDKMBd;
                canvas.drawRoundRect(rectF, f4, f4, DbNXlk());
                canvas.drawText(strComponent1, this.djBIcL.centerX(), f2, getPaint());
                EZpvd(canvas, this.gEmmrt, f3);
            }
            RectF rectF2 = this.AkhnZx;
            float f5 = this.hDKMBd;
            canvas.drawRoundRect(rectF2, f5, f5, DbNXlk());
            canvas.drawText(strComponent2, this.AkhnZx.centerX(), f2, getPaint());
            EZpvd(canvas, this.fetchVPNInfo, f3);
            RectF rectF3 = this.DbNXlk;
            float f6 = this.hDKMBd;
            canvas.drawRoundRect(rectF3, f6, f6, DbNXlk());
            canvas.drawText(strComponent3, this.DbNXlk.centerX(), f2, getPaint());
            EZpvd(canvas, this.isConnected, f3);
            RectF rectF4 = this.fARcdN;
            float f7 = this.hDKMBd;
            canvas.drawRoundRect(rectF4, f7, f7, DbNXlk());
            canvas.drawText(strComponent4, this.fARcdN.centerX(), f2, getPaint());
            return;
        }
        Paint.FontMetrics fontMetrics2 = getPaint().getFontMetrics();
        RectF rectF5 = this.djBIcL;
        float f8 = rectF5.top;
        float fHeight2 = ((rectF5.height() - fontMetrics2.top) - fontMetrics2.bottom) / 2;
        java.lang.String strAYXKKw = AYXKKw();
        getPaint().setTextAlign(Paint.Align.LEFT);
        canvas.drawText(strAYXKKw, this.djBIcL.left, f8 + fHeight2, getPaint());
    }

    public final void EZpvd(android.graphics.Canvas canvas, RectF rectF, float f) {
        canvas.save();
        canvas.translate(0.0f, -f);
        canvas.drawOval(rectF, getPaint());
        canvas.restore();
        canvas.save();
        canvas.translate(0.0f, f);
        canvas.drawOval(rectF, getPaint());
        canvas.restore();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.qXw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setDeadlineTime$default(C40492qXw c40492qXw, CountDownType countDownType, java.lang.String str, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c40492qXw.setDeadlineTime(countDownType, str, j, function1);
    }

    public final void setDeadlineTime(CountDownType countDownType, java.lang.String str, long j, Function1<? super java.lang.Long, Unit> function1) {
        this.AubY = str;
        KWHzl(countDownType);
        if (countDownType != CountDownType.SHOW_COUNT_DOWN) {
            j = 0;
        }
        OLrzqt(j);
        this.ejfBZ = function1;
    }

    public final java.lang.String AYXKKw() {
        Quartet<java.lang.String, java.lang.String, java.lang.String, java.lang.String> quartet = this.zsXlph;
        java.lang.String strComponent1 = quartet.component1();
        java.lang.String strComponent2 = quartet.component2();
        java.lang.String strComponent3 = quartet.component3();
        java.lang.String strComponent4 = quartet.component4();
        if (strComponent1 == null || C33129mqd.gEmmrt(strComponent1, 0)) {
            android.content.res.Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return C33069mpW.copydefault(resources, pVX.LoaderManager.copydefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("hour", strComponent2), C56390yDp.OLrzqt("minute", strComponent3), C56390yDp.OLrzqt("second", strComponent4)));
        }
        android.content.res.Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        return C33069mpW.copydefault(resources2, pVX.LoaderManager.AEQbTJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strComponent1), C56390yDp.OLrzqt("hour", strComponent2), C56390yDp.OLrzqt("minute", strComponent3)));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            valueOf();
        }
    }
}
