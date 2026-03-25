package com.okinc.tradeuilib.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33052mpF;
import o.C33129mqd;
import o.C49511upt;
import o.C52761wXj;
import o.C55051xce;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTB;
import o.yII;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TradeSeekBar extends View {
    public int AYXKKw;
    public int AhwBna;
    public Application AkhnZx;
    public Paint AuCTel;
    public Function2<? super Float, ? super Float, Unit> AuCTelauCTel;
    public int AubY;
    public float AwvSrB;
    public Function1<? super Integer, Unit> AxsJAY;
    public int DTwDnp;
    public float DbNXlk;
    public State EZpvd;
    public final float KWHzl;
    public float OLrzqt;
    public float ORxRYg;
    public final float OcIXYQ;
    public long QKVWgx;
    public float QOLQEE;
    public float QUSxYX;
    public int copydefault;
    public Typeface djBIcL;
    public float ejfBZ;
    public float fARcdN;
    public Paint fIwbmz;
    public float fJNWhG;
    public boolean fetchVPNInfo;
    public final float gEmmrt;
    public boolean gHZMYf;
    public float getFieldNames;
    public float getNewProxyInstance;
    public float hDKMBd;
    public float isConnected;
    public float iwGUEr;
    public final int sSMYrx;
    public float uzCIH;
    public int valueOf;
    public GestureDetector values;
    public Function0<Unit> wlaJM;
    public Function1<? super Float, Unit> zLjUOn;
    public int zsXlph;
    public float zuBGHE;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.LONG_PRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PROGRAM_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(float f) {
        float f2 = this.QUSxYX;
        float f3 = this.AwvSrB;
        float f4 = 10;
        return f < (f2 + f3) + f4 && f > (f2 - f3) - f4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIsEnabled(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCancelCallBack(Function0<Unit> function0) {
        this.wlaJM = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickCallback(Function1<? super Float, Unit> function1) {
        this.zLjUOn = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPercentCallback(Function2<? super Float, ? super Float, Unit> function2) {
        this.AuCTelauCTel = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeekbarStateCallback(Function1<? super Integer, Unit> function1) {
        this.AxsJAY = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSeekBar(@NotNull Context context, AttributeSet attributeSet, int i, boolean z) {
        Paint.FontMetrics fontMetrics;
        Paint.FontMetrics fontMetrics2;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.sSMYrx = i;
        this.gHZMYf = z;
        this.valueOf = ContextCompat.getColor(context, C49511upt.ActionBar.copydefault);
        this.AubY = ContextCompat.getColor(context, C49511upt.ActionBar.EZpvd);
        this.zsXlph = ContextCompat.getColor(context, C52761wXj.Activity.fbC);
        this.AYXKKw = ContextCompat.getColor(context, C52761wXj.Activity.Dmq);
        this.djBIcL = C55051xce.OLrzqt.valueOf();
        this.copydefault = ContextCompat.getColor(context, C52761wXj.Activity.registerUser);
        this.DTwDnp = ContextCompat.getColor(context, C52761wXj.Activity.Dff);
        this.uzCIH = C33052mpF.EZpvd(4.5f, context);
        this.getNewProxyInstance = C33052mpF.EZpvd(2.5f, context);
        this.AwvSrB = C33052mpF.EZpvd(6.0f, context);
        this.zuBGHE = C33052mpF.EZpvd(4.0f, context);
        float fEZpvd = C33052mpF.EZpvd(2.0f, context);
        this.KWHzl = fEZpvd;
        this.gEmmrt = C33052mpF.EZpvd(2.5f, context);
        float fAYXKKw = C33052mpF.AYXKKw(10.0f, context);
        this.OcIXYQ = fAYXKKw;
        this.EZpvd = State.NONE;
        this.AhwBna = 100;
        this.DbNXlk = C33052mpF.EZpvd(6.0f, context);
        this.ejfBZ = C33052mpF.EZpvd(6.0f, context);
        this.fetchVPNInfo = true;
        Paint paint = new Paint();
        this.fIwbmz = paint;
        paint.setStrokeWidth(fEZpvd);
        Paint paint2 = this.fIwbmz;
        if (paint2 != null) {
            paint2.setColor(this.valueOf);
        }
        Paint paint3 = this.fIwbmz;
        if (paint3 != null) {
            paint3.setAntiAlias(true);
        }
        Paint paint4 = this.fIwbmz;
        if (paint4 != null) {
            paint4.setStyle(Paint.Style.STROKE);
        }
        Application application = new Application();
        this.AkhnZx = application;
        Intrinsics.copydefault(application);
        this.values = new GestureDetector(context, application);
        Paint paint5 = new Paint();
        this.AuCTel = paint5;
        paint5.setTypeface(this.djBIcL);
        Paint paint6 = this.AuCTel;
        if (paint6 != null) {
            paint6.setStrokeWidth(1.0f);
        }
        Paint paint7 = this.AuCTel;
        if (paint7 != null) {
            paint7.setColor(this.DTwDnp);
        }
        Paint paint8 = this.AuCTel;
        if (paint8 != null) {
            paint8.setTextSize(fAYXKKw);
        }
        Paint paint9 = this.AuCTel;
        if (paint9 != null) {
            paint9.setAntiAlias(true);
        }
        Paint paint10 = this.AuCTel;
        float f = 0.0f;
        float fAbs = Math.abs((paint10 == null || (fontMetrics2 = paint10.getFontMetrics()) == null) ? 0.0f : fontMetrics2.top);
        Paint paint11 = this.AuCTel;
        if (paint11 != null && (fontMetrics = paint11.getFontMetrics()) != null) {
            f = fontMetrics.bottom;
        }
        this.QOLQEE = fAbs + Math.abs(f);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.widget.TradeSeekBar.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NONE = new State("NONE", 0);
        public static final State CLICK = new State("CLICK", 1);
        public static final State LONG_PRESS = new State("LONG_PRESS", 2);
        public static final State PROGRAM_SET = new State("PROGRAM_SET", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ State[] $values() {
            return new State[]{NONE, CLICK, LONG_PRESS, PROGRAM_SET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final void setDefaultPercentNum(int i) {
        copydefault();
        this.AhwBna = i;
        invalidate();
    }

    public final void copydefault() throws Exception {
        int i = this.sSMYrx;
        if (i <= 1) {
            throw new Exception("pointNum must be greater than 1");
        }
        if (this.AhwBna % (i - 1) != 0) {
            throw new Exception("defaultPercentNum must be in multiples of (pointNum - 1)");
        }
    }

    public final void setMaxPercent(boolean z) {
        Function1<? super Float, Unit> function1;
        float f = this.AhwBna / 100.0f;
        this.fARcdN = f;
        if (z && (function1 = this.zLjUOn) != null) {
            function1.invoke(Float.valueOf(f));
        }
        this.QUSxYX = (this.fJNWhG * (this.sSMYrx - 1)) + this.DbNXlk;
        this.EZpvd = State.CLICK;
        invalidate();
    }

    public final void setPercent(float f) {
        this.fARcdN = f;
        this.EZpvd = State.PROGRAM_SET;
        invalidate();
    }

    public final void AEQbTJ() {
        this.EZpvd = State.NONE;
        this.fARcdN = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) throws Exception {
        super.onSizeChanged(i, i2, i3, i4);
        copydefault();
        float f = (i - this.DbNXlk) - this.ejfBZ;
        this.iwGUEr = f;
        float f2 = i2;
        this.isConnected = f2;
        this.OLrzqt = f2 / 2.0f;
        this.fJNWhG = f / ((this.sSMYrx - 1) * 1.0f);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        this.valueOf = ContextCompat.getColor(getContext(), C49511upt.ActionBar.copydefault);
        this.AYXKKw = ContextCompat.getColor(getContext(), C52761wXj.Activity.Dmq);
        Paint paint = this.fIwbmz;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        Paint paint2 = this.fIwbmz;
        if (paint2 != null) {
            paint2.setColor(this.valueOf);
        }
        Paint paint3 = this.fIwbmz;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.gEmmrt);
        }
        float f = this.DbNXlk;
        float f2 = this.OLrzqt;
        float f3 = this.iwGUEr;
        Paint paint4 = this.fIwbmz;
        Intrinsics.copydefault(paint4);
        canvas.drawLine(f, f2, f + f3, f2, paint4);
        if (this.gHZMYf) {
            OLrzqt(canvas);
        }
        copydefault(canvas);
        int i = Activity.EZpvd[this.EZpvd.ordinal()];
        if (i == 1) {
            EZpvd(canvas);
        } else if (i == 2) {
            KWHzl(canvas);
        } else if (i == 3) {
            this.QUSxYX = this.DbNXlk + (this.iwGUEr * this.fARcdN);
            KWHzl(canvas);
        }
        Paint paint5 = this.fIwbmz;
        if (paint5 != null) {
            paint5.setStrokeWidth(this.KWHzl);
        }
        if (this.fARcdN == 0.0f) {
            Paint paint6 = this.fIwbmz;
            if (paint6 != null) {
                paint6.setColor(this.AYXKKw);
            }
            Paint paint7 = this.fIwbmz;
            if (paint7 != null) {
                paint7.setStyle(Paint.Style.FILL);
            }
            float f4 = this.DbNXlk;
            float f5 = this.OLrzqt;
            float f6 = this.AwvSrB;
            Paint paint8 = this.fIwbmz;
            Intrinsics.copydefault(paint8);
            canvas.drawCircle(f4, f5, f6, paint8);
            Paint paint9 = this.fIwbmz;
            if (paint9 != null) {
                paint9.setColor(this.copydefault);
            }
            float f7 = this.DbNXlk;
            float f8 = this.OLrzqt;
            float f9 = this.zuBGHE;
            Paint paint10 = this.fIwbmz;
            Intrinsics.copydefault(paint10);
            canvas.drawCircle(f7, f8, f9, paint10);
        }
    }

    public final void copydefault(Canvas canvas) {
        Paint paint = this.fIwbmz;
        if (paint != null) {
            paint.setStrokeWidth(this.KWHzl);
        }
        int i = this.sSMYrx;
        for (int i2 = 0; i2 < i; i2++) {
            float f = (this.fJNWhG * i2) + this.DbNXlk;
            float f2 = this.OLrzqt;
            Paint paint2 = this.fIwbmz;
            if (paint2 != null) {
                paint2.setStyle(Paint.Style.FILL);
            }
            Paint paint3 = this.fIwbmz;
            if (paint3 != null) {
                paint3.setColor(this.valueOf);
            }
            if (canvas != null) {
                float f3 = this.uzCIH;
                Paint paint4 = this.fIwbmz;
                Intrinsics.copydefault(paint4);
                canvas.drawCircle(f, f2, f3, paint4);
            }
            Paint paint5 = this.fIwbmz;
            if (paint5 != null) {
                paint5.setStyle(Paint.Style.FILL);
            }
            Paint paint6 = this.fIwbmz;
            if (paint6 != null) {
                paint6.setColor(this.copydefault);
            }
            if (canvas != null) {
                float f4 = this.getNewProxyInstance;
                Paint paint7 = this.fIwbmz;
                Intrinsics.copydefault(paint7);
                canvas.drawCircle(f, f2, f4, paint7);
            }
        }
    }

    public final void KWHzl(Canvas canvas) {
        Paint paint = this.fIwbmz;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        Paint paint2 = this.fIwbmz;
        if (paint2 != null) {
            paint2.setColor(this.AYXKKw);
        }
        Paint paint3 = this.fIwbmz;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.gEmmrt);
        }
        if (canvas != null) {
            float f = this.DbNXlk;
            float f2 = this.OLrzqt;
            float f3 = this.QUSxYX;
            Paint paint4 = this.fIwbmz;
            Intrinsics.copydefault(paint4);
            canvas.drawLine(f, f2, f3, f2, paint4);
        }
        Paint paint5 = this.fIwbmz;
        if (paint5 != null) {
            paint5.setStrokeWidth(this.KWHzl);
        }
        int i = this.sSMYrx;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = (this.fJNWhG * i2) + this.DbNXlk;
            float f5 = this.OLrzqt;
            if (f4 < this.QUSxYX) {
                Paint paint6 = this.fIwbmz;
                if (paint6 != null) {
                    paint6.setStyle(Paint.Style.FILL);
                }
                Paint paint7 = this.fIwbmz;
                if (paint7 != null) {
                    paint7.setColor(this.AYXKKw);
                }
                if (canvas != null) {
                    float f6 = this.uzCIH;
                    Paint paint8 = this.fIwbmz;
                    Intrinsics.copydefault(paint8);
                    canvas.drawCircle(f4, f5, f6, paint8);
                }
                Paint paint9 = this.fIwbmz;
                if (paint9 != null) {
                    paint9.setStyle(Paint.Style.FILL);
                }
                Paint paint10 = this.fIwbmz;
                if (paint10 != null) {
                    paint10.setColor(this.copydefault);
                }
                if (canvas != null) {
                    float f7 = this.getNewProxyInstance;
                    Paint paint11 = this.fIwbmz;
                    Intrinsics.copydefault(paint11);
                    canvas.drawCircle(f4, f5, f7, paint11);
                }
            }
        }
        float f8 = this.QUSxYX;
        float f9 = this.DbNXlk;
        if (f8 < f9) {
            Paint paint12 = this.fIwbmz;
            if (paint12 != null) {
                paint12.setStyle(Paint.Style.FILL);
            }
            Paint paint13 = this.fIwbmz;
            if (paint13 != null) {
                paint13.setColor(this.AYXKKw);
            }
            if (canvas != null) {
                float f10 = this.DbNXlk;
                float f11 = this.OLrzqt;
                float f12 = this.AwvSrB;
                Paint paint14 = this.fIwbmz;
                Intrinsics.copydefault(paint14);
                canvas.drawCircle(f10, f11, f12, paint14);
            }
            Paint paint15 = this.fIwbmz;
            if (paint15 != null) {
                paint15.setColor(this.copydefault);
            }
            if (canvas != null) {
                float f13 = this.DbNXlk;
                float f14 = this.OLrzqt;
                float f15 = this.zuBGHE;
                Paint paint16 = this.fIwbmz;
                Intrinsics.copydefault(paint16);
                canvas.drawCircle(f13, f14, f15, paint16);
                return;
            }
            return;
        }
        if (f8 <= f9 + this.iwGUEr) {
            Paint paint17 = this.fIwbmz;
            if (paint17 != null) {
                paint17.setStyle(Paint.Style.FILL);
            }
            Paint paint18 = this.fIwbmz;
            if (paint18 != null) {
                paint18.setColor(this.AYXKKw);
            }
            if (canvas != null) {
                float f16 = this.QUSxYX;
                float f17 = this.OLrzqt;
                float f18 = this.AwvSrB;
                Paint paint19 = this.fIwbmz;
                Intrinsics.copydefault(paint19);
                canvas.drawCircle(f16, f17, f18, paint19);
            }
            Paint paint20 = this.fIwbmz;
            if (paint20 != null) {
                paint20.setColor(this.copydefault);
            }
            if (canvas != null) {
                float f19 = this.QUSxYX;
                float f20 = this.OLrzqt;
                float f21 = this.zuBGHE;
                Paint paint21 = this.fIwbmz;
                Intrinsics.copydefault(paint21);
                canvas.drawCircle(f19, f20, f21, paint21);
                return;
            }
            return;
        }
        Paint paint22 = this.fIwbmz;
        if (paint22 != null) {
            paint22.setStyle(Paint.Style.FILL);
        }
        Paint paint23 = this.fIwbmz;
        if (paint23 != null) {
            paint23.setColor(this.AYXKKw);
        }
        if (canvas != null) {
            float f22 = this.DbNXlk;
            float f23 = this.iwGUEr;
            float f24 = this.OLrzqt;
            float f25 = this.AwvSrB;
            Paint paint24 = this.fIwbmz;
            Intrinsics.copydefault(paint24);
            canvas.drawCircle(f22 + f23, f24, f25, paint24);
        }
        Paint paint25 = this.fIwbmz;
        if (paint25 != null) {
            paint25.setColor(this.copydefault);
        }
        if (canvas != null) {
            float f26 = this.DbNXlk;
            float f27 = this.iwGUEr;
            float f28 = this.OLrzqt;
            float f29 = this.zuBGHE;
            Paint paint26 = this.fIwbmz;
            Intrinsics.copydefault(paint26);
            canvas.drawCircle(f26 + f27, f28, f29, paint26);
        }
    }

    public final void OLrzqt(Canvas canvas) {
        float fMeasureText;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOLrzqt = C55296xhK.OLrzqt(context);
        int i = this.sSMYrx;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 != 0) {
                if (i2 == this.sSMYrx - 1) {
                    String percent$default = pTB.formatPercent$default(pTB.OLrzqt(Double.valueOf(((double) this.AhwBna) / C33129mqd.AEQbTJ(Float.valueOf(100.0f)))), 0, null, 2, null);
                    if (zOLrzqt) {
                        if (canvas != null) {
                            float f = this.DbNXlk;
                            float f2 = this.ejfBZ;
                            float f3 = this.iwGUEr;
                            float f4 = this.OLrzqt;
                            Context context2 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            float fEZpvd = C33052mpF.EZpvd(16.0f, context2);
                            Paint paint = this.AuCTel;
                            Intrinsics.copydefault(paint);
                            canvas.drawText(percent$default, f + f2 + f3, f4 + fEZpvd, paint);
                        }
                    } else if (canvas != null) {
                        float f5 = this.DbNXlk;
                        float f6 = this.ejfBZ;
                        float f7 = this.iwGUEr;
                        Paint paint2 = this.AuCTel;
                        fMeasureText = paint2 != null ? paint2.measureText(percent$default) : 0.0f;
                        float f8 = this.OLrzqt;
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        float fEZpvd2 = C33052mpF.EZpvd(16.0f, context3);
                        Paint paint3 = this.AuCTel;
                        Intrinsics.copydefault(paint3);
                        canvas.drawText(percent$default, ((f5 + f6) + f7) - fMeasureText, f8 + fEZpvd2, paint3);
                    }
                } else {
                    String percent$default2 = pTB.formatPercent$default(pTB.OLrzqt(Double.valueOf(C33129mqd.AEQbTJ(Float.valueOf(((this.AhwBna / r10) * i2) / 100.0f)))), 0, null, 2, null);
                    if (canvas != null) {
                        float f9 = this.DbNXlk;
                        float f10 = this.fJNWhG;
                        float f11 = i2;
                        Paint paint4 = this.AuCTel;
                        fMeasureText = paint4 != null ? paint4.measureText(percent$default2) : 0.0f;
                        float f12 = this.OLrzqt;
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        float fEZpvd3 = C33052mpF.EZpvd(16.0f, context4);
                        Paint paint5 = this.AuCTel;
                        Intrinsics.copydefault(paint5);
                        canvas.drawText(percent$default2, (f9 + (f10 * f11)) - (fMeasureText / 2.0f), f12 + fEZpvd3, paint5);
                    }
                }
            } else if (zOLrzqt) {
                String percent$default3 = pTB.formatPercent$default(pTB.OLrzqt(Double.valueOf(C33129mqd.AEQbTJ(0))), 0, null, 2, null);
                if (canvas != null) {
                    Paint paint6 = this.AuCTel;
                    float fMeasureText2 = paint6 != null ? paint6.measureText(percent$default3) : 0.0f;
                    float f13 = this.OLrzqt;
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    float fEZpvd4 = C33052mpF.EZpvd(16.0f, context5);
                    Paint paint7 = this.AuCTel;
                    Intrinsics.copydefault(paint7);
                    canvas.drawText(percent$default3, 0.0f - fMeasureText2, f13 + fEZpvd4, paint7);
                }
            } else if (canvas != null) {
                String percent$default4 = pTB.formatPercent$default(pTB.OLrzqt(Double.valueOf(C33129mqd.AEQbTJ(0))), 0, null, 2, null);
                float f14 = this.OLrzqt;
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                float fEZpvd5 = C33052mpF.EZpvd(16.0f, context6);
                Paint paint8 = this.AuCTel;
                Intrinsics.copydefault(paint8);
                canvas.drawText(percent$default4, 0.0f, f14 + fEZpvd5, paint8);
            }
        }
    }

    public final void EZpvd(Canvas canvas) {
        int iAhwBna;
        if (this.fetchVPNInfo) {
            float f = (this.QUSxYX - this.DbNXlk) / this.fJNWhG;
            double d = f;
            if (d > Math.floor(d) + 0.3d) {
                iAhwBna = C33129mqd.AhwBna(Float.valueOf(f + 1));
            } else {
                iAhwBna = C33129mqd.AhwBna(Float.valueOf(f));
            }
            Paint paint = this.fIwbmz;
            if (paint != null) {
                paint.setColor(this.AYXKKw);
            }
            Paint paint2 = this.fIwbmz;
            if (paint2 != null) {
                paint2.setStrokeWidth(this.gEmmrt);
            }
            if (canvas != null) {
                float f2 = this.DbNXlk;
                float f3 = this.OLrzqt;
                Paint paint3 = this.fIwbmz;
                Intrinsics.copydefault(paint3);
                canvas.drawLine(f2, f3, f2 + (this.fJNWhG * iAhwBna), f3, paint3);
            }
            Paint paint4 = this.fIwbmz;
            if (paint4 != null) {
                paint4.setStrokeWidth(this.KWHzl);
            }
            for (int i = 0; i < iAhwBna; i++) {
                float f4 = (this.fJNWhG * i) + this.DbNXlk;
                float f5 = this.OLrzqt;
                if (f4 < this.QUSxYX) {
                    Paint paint5 = this.fIwbmz;
                    if (paint5 != null) {
                        paint5.setStyle(Paint.Style.FILL);
                    }
                    Paint paint6 = this.fIwbmz;
                    if (paint6 != null) {
                        paint6.setColor(this.AYXKKw);
                    }
                    if (canvas != null) {
                        float f6 = this.uzCIH;
                        Paint paint7 = this.fIwbmz;
                        Intrinsics.copydefault(paint7);
                        canvas.drawCircle(f4, f5, f6, paint7);
                    }
                    Paint paint8 = this.fIwbmz;
                    if (paint8 != null) {
                        paint8.setStyle(Paint.Style.FILL);
                    }
                    Paint paint9 = this.fIwbmz;
                    if (paint9 != null) {
                        paint9.setColor(this.AubY);
                    }
                    if (canvas != null) {
                        float f7 = this.getNewProxyInstance;
                        Paint paint10 = this.fIwbmz;
                        Intrinsics.copydefault(paint10);
                        canvas.drawCircle(f4, f5, f7, paint10);
                    }
                }
            }
            Paint paint11 = this.fIwbmz;
            if (paint11 != null) {
                paint11.setColor(this.AYXKKw);
            }
            if (canvas != null) {
                float f8 = this.DbNXlk;
                float f9 = this.OLrzqt;
                float f10 = this.AwvSrB;
                Paint paint12 = this.fIwbmz;
                Intrinsics.copydefault(paint12);
                canvas.drawCircle(f8 + (this.fJNWhG * iAhwBna), f9, f10, paint12);
            }
            Paint paint13 = this.fIwbmz;
            if (paint13 != null) {
                paint13.setColor(this.copydefault);
            }
            if (canvas != null) {
                float f11 = this.DbNXlk;
                float f12 = this.OLrzqt;
                float f13 = this.zuBGHE;
                Paint paint14 = this.fIwbmz;
                Intrinsics.copydefault(paint14);
                canvas.drawCircle(f11 + (this.fJNWhG * iAhwBna), f12, f13, paint14);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int iAhwBna;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!this.fetchVPNInfo) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.QKVWgx = System.currentTimeMillis();
            if (AEQbTJ(motionEvent.getX())) {
                this.EZpvd = State.LONG_PRESS;
            } else {
                this.EZpvd = State.CLICK;
                float x = motionEvent.getX();
                this.QUSxYX = x;
                float f = (x - this.DbNXlk) / this.fJNWhG;
                double d = f;
                if (d > Math.floor(d) + 0.3d) {
                    iAhwBna = C33129mqd.AhwBna(Float.valueOf(f + 1));
                } else {
                    iAhwBna = C33129mqd.AhwBna(Float.valueOf(f));
                }
                float f2 = ((iAhwBna * this.AhwBna) / (this.sSMYrx - 1)) / 100.0f;
                this.fARcdN = f2;
                Function1<? super Float, Unit> function1 = this.zLjUOn;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(f2));
                }
                invalidate();
            }
        } else if (action == 1 || action == 3 || action == 4) {
            Function1<? super Integer, Unit> function12 = this.AxsJAY;
            if (function12 != null) {
                function12.invoke(2);
            }
            Function0<Unit> function0 = this.wlaJM;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (action == 2) {
            if (System.currentTimeMillis() - this.QKVWgx > 100) {
                this.EZpvd = State.LONG_PRESS;
            }
            if (this.EZpvd == State.LONG_PRESS) {
                this.QUSxYX = motionEvent.getX();
                float f3 = this.fARcdN;
                float fEZpvd = 0.0f;
                if (f3 > 0.0f && f3 < 1.0f) {
                    this.ORxRYg = motionEvent.getRawX();
                }
                float f4 = this.QUSxYX;
                float f5 = this.DbNXlk;
                if (f4 < f5) {
                    this.QUSxYX = f5;
                } else {
                    float f6 = this.iwGUEr + f5;
                    if (f4 > f6) {
                        this.QUSxYX = f6;
                    }
                }
                float f7 = (this.QUSxYX - f5) / this.iwGUEr;
                float f8 = this.AhwBna;
                float f9 = f7 * f8;
                if (f9 >= 0.0f) {
                    if (f9 > f8) {
                        fEZpvd = f8;
                    } else if (f9 > 1.0f) {
                        fEZpvd = yII.EZpvd(f9);
                    } else if (f9 > 0.0f) {
                        fEZpvd = 1.0f;
                    }
                }
                float f10 = fEZpvd / 100.0f;
                this.fARcdN = f10;
                Function2<? super Float, ? super Float, Unit> function2 = this.AuCTelauCTel;
                if (function2 != null) {
                    function2.invoke(Float.valueOf(f10), Float.valueOf(this.ORxRYg));
                }
                invalidate();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hDKMBd = motionEvent.getX();
            this.getFieldNames = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (Math.abs(motionEvent.getY() - this.getFieldNames) > (2 * Math.abs(motionEvent.getX() - this.hDKMBd)) + 80) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final class Application extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            TradeSeekBar.this.QUSxYX = motionEvent.getX();
            TradeSeekBar.this.EZpvd = State.LONG_PRESS;
            TradeSeekBar.this.invalidate();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        EZpvd();
    }

    public final void EZpvd() {
        float f;
        if (getLayoutDirection() == 1) {
            Paint paint = this.AuCTel;
            f = -1.0f;
            if (paint != null) {
                paint.setTextScaleX(-1.0f);
            }
        } else {
            Paint paint2 = this.AuCTel;
            f = 1.0f;
            if (paint2 != null) {
                paint2.setTextScaleX(1.0f);
            }
        }
        setScaleX(f);
    }
}
