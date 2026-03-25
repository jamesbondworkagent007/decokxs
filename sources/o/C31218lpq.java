package o;

import android.graphics.Paint;
import android.view.GestureDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31218lpq extends android.view.View {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final float AEQbTJ;
    public android.graphics.Typeface AYXKKw;
    public boolean AhwBna;
    public android.view.GestureDetector AkhnZx;
    public float AuCTel;
    public Function1<? super java.lang.Float, Unit> AuCTelauCTel;
    public Function0<Unit> AubY;
    public boolean AwvSrB;
    public float AxsJAY;
    public int DTwDnp;
    public float DbNXlk;
    public int EZpvd;
    public int OLrzqt;
    public float ORxRYg;
    public float OcIXYQ;
    public final float QKVWgx;
    public long QOLQEE;
    public float QVAiDq;
    public float copydefault;
    public boolean djBIcL;
    public android.graphics.Paint ejfBZ;
    public float fARcdN;
    public float fIwbmz;
    public float fJNWhG;
    public final float fetchVPNInfo;
    public int gEmmrt;
    public Function1<? super java.lang.Integer, Unit> gHZMYf;
    public float getFieldNames;
    public float getNewProxyInstance;
    public float hDKMBd;
    public boolean isConnected;
    public float iwGUEr;
    public float sSMYrx;
    public android.graphics.Paint uzCIH;
    public int valueOf;
    public Application values;
    public int wlaJM;
    public float zLjUOn;
    public Function2<? super java.lang.Float, ? super java.lang.Float, Unit> zsXlph;
    public final int zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt(float f) {
        float f2 = this.QVAiDq;
        float f3 = this.sSMYrx;
        float f4 = 10;
        return f < (f2 + f3) + f4 && f > (f2 - f3) - f4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIsEnabled(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCancelCallBack(Function0<Unit> function0) {
        this.AubY = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickCallback(Function1<? super java.lang.Float, Unit> function1) {
        this.AuCTelauCTel = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPercentCallback(Function2<? super java.lang.Float, ? super java.lang.Float, Unit> function2) {
        this.zsXlph = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeekbarStateCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.gHZMYf = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31218lpq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z) {
        Paint.FontMetrics fontMetrics;
        Paint.FontMetrics fontMetrics2;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.zuBGHE = i;
        this.AwvSrB = z;
        this.gEmmrt = C25382ivf.copydefault(C52761wXj.Activity.invokespecialDPHOMC, context);
        this.wlaJM = C25382ivf.copydefault(C52761wXj.Activity.htlTjW, context);
        this.valueOf = C25382ivf.copydefault(C52761wXj.Activity.Dmq, context);
        this.AYXKKw = C55051xce.OLrzqt.valueOf();
        this.EZpvd = C25382ivf.copydefault(C52761wXj.Activity.registerUser, context);
        this.DTwDnp = C25382ivf.copydefault(C52761wXj.Activity.Dff, context);
        this.zLjUOn = C55298xhM.dp2pxFloat$default(4.5f, null, 1, null);
        this.iwGUEr = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        this.sSMYrx = C55298xhM.dp2pxFloat$default(6.0f, null, 1, null);
        this.AxsJAY = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        this.AEQbTJ = fDp2pxFloat$default;
        this.fetchVPNInfo = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        float fSp2pxFloat$default = C55298xhM.sp2pxFloat$default(10.0f, null, 1, null);
        this.QKVWgx = fSp2pxFloat$default;
        this.OLrzqt = 100;
        this.fIwbmz = C55298xhM.dp2pxFloat$default(6.0f, null, 1, null);
        this.fARcdN = C55298xhM.dp2pxFloat$default(6.0f, null, 1, null);
        this.isConnected = true;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.ejfBZ = paint;
        paint.setStrokeWidth(fDp2pxFloat$default);
        android.graphics.Paint paint2 = this.ejfBZ;
        if (paint2 != null) {
            paint2.setColor(this.gEmmrt);
        }
        android.graphics.Paint paint3 = this.ejfBZ;
        if (paint3 != null) {
            paint3.setAntiAlias(true);
        }
        android.graphics.Paint paint4 = this.ejfBZ;
        if (paint4 != null) {
            paint4.setStyle(Paint.Style.STROKE);
        }
        Application application = new Application();
        this.values = application;
        Intrinsics.copydefault(application);
        this.AkhnZx = new android.view.GestureDetector(context, application);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.uzCIH = paint5;
        paint5.setTypeface(this.AYXKKw);
        android.graphics.Paint paint6 = this.uzCIH;
        if (paint6 != null) {
            paint6.setStrokeWidth(1.0f);
        }
        android.graphics.Paint paint7 = this.uzCIH;
        if (paint7 != null) {
            paint7.setColor(this.DTwDnp);
        }
        android.graphics.Paint paint8 = this.uzCIH;
        if (paint8 != null) {
            paint8.setTextSize(fSp2pxFloat$default);
        }
        android.graphics.Paint paint9 = this.uzCIH;
        if (paint9 != null) {
            paint9.setAntiAlias(true);
        }
        android.graphics.Paint paint10 = this.uzCIH;
        float f = 0.0f;
        float fAbs = java.lang.Math.abs((paint10 == null || (fontMetrics2 = paint10.getFontMetrics()) == null) ? 0.0f : fontMetrics2.top);
        android.graphics.Paint paint11 = this.uzCIH;
        if (paint11 != null && (fontMetrics = paint11.getFontMetrics()) != null) {
            f = fontMetrics.bottom;
        }
        this.ORxRYg = fAbs + java.lang.Math.abs(f);
    }

    /* JADX INFO: renamed from: o.lpq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lpq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void copydefault() throws java.lang.Exception {
        int i = this.zuBGHE;
        if (i <= 1) {
            throw new java.lang.Exception("pointNum must be greater than 1");
        }
        if (this.OLrzqt % (i - 1) != 0) {
            throw new java.lang.Exception("defaultPercentNum must be in multiples of (pointNum - 1)");
        }
    }

    public final void EZpvd() {
        this.djBIcL = false;
        this.AhwBna = false;
        this.fJNWhG = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) throws java.lang.Exception {
        super.onSizeChanged(i, i2, i3, i4);
        copydefault();
        float f = (i - this.fIwbmz) - this.fARcdN;
        this.getNewProxyInstance = f;
        float f2 = i2;
        this.DbNXlk = f2;
        this.copydefault = f2 / 2.0f;
        this.AuCTel = f / ((this.zuBGHE - 1) * 1.0f);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        int i = C52761wXj.Activity.invokespecialDPHOMC;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.gEmmrt = C25382ivf.copydefault(i, context);
        int i2 = C52761wXj.Activity.Dmq;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.valueOf = C25382ivf.copydefault(i2, context2);
        android.graphics.Paint paint = this.ejfBZ;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint2 = this.ejfBZ;
        if (paint2 != null) {
            paint2.setColor(this.gEmmrt);
        }
        android.graphics.Paint paint3 = this.ejfBZ;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.fetchVPNInfo);
        }
        float f = this.fIwbmz;
        float f2 = this.copydefault;
        float f3 = this.getNewProxyInstance;
        android.graphics.Paint paint4 = this.ejfBZ;
        Intrinsics.copydefault(paint4);
        canvas.drawLine(f, f2, f + f3, f2, paint4);
        if (this.AwvSrB) {
            EZpvd(canvas);
        }
        AEQbTJ(canvas);
        if (this.AhwBna) {
            OLrzqt(canvas);
        }
        if (this.djBIcL && !this.AhwBna) {
            KWHzl(canvas);
        }
        android.graphics.Paint paint5 = this.ejfBZ;
        if (paint5 != null) {
            paint5.setStrokeWidth(this.AEQbTJ);
        }
        if (this.fJNWhG == 0.0f) {
            android.graphics.Paint paint6 = this.ejfBZ;
            if (paint6 != null) {
                paint6.setColor(this.valueOf);
            }
            android.graphics.Paint paint7 = this.ejfBZ;
            if (paint7 != null) {
                paint7.setStyle(Paint.Style.FILL);
            }
            float f4 = this.fIwbmz;
            float f5 = this.copydefault;
            float f6 = this.sSMYrx;
            android.graphics.Paint paint8 = this.ejfBZ;
            Intrinsics.copydefault(paint8);
            canvas.drawCircle(f4, f5, f6, paint8);
            android.graphics.Paint paint9 = this.ejfBZ;
            if (paint9 != null) {
                paint9.setColor(this.EZpvd);
            }
            float f7 = this.fIwbmz;
            float f8 = this.copydefault;
            float f9 = this.AxsJAY;
            android.graphics.Paint paint10 = this.ejfBZ;
            Intrinsics.copydefault(paint10);
            canvas.drawCircle(f7, f8, f9, paint10);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        KWHzl();
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.ejfBZ;
        if (paint != null) {
            paint.setStrokeWidth(this.AEQbTJ);
        }
        int i = this.zuBGHE;
        for (int i2 = 0; i2 < i; i2++) {
            float f = (this.AuCTel * i2) + this.fIwbmz;
            float f2 = this.copydefault;
            android.graphics.Paint paint2 = this.ejfBZ;
            if (paint2 != null) {
                paint2.setStyle(Paint.Style.FILL);
            }
            android.graphics.Paint paint3 = this.ejfBZ;
            if (paint3 != null) {
                paint3.setColor(this.wlaJM);
            }
            if (canvas != null) {
                float f3 = this.zLjUOn;
                android.graphics.Paint paint4 = this.ejfBZ;
                Intrinsics.copydefault(paint4);
                canvas.drawCircle(f, f2, f3, paint4);
            }
            android.graphics.Paint paint5 = this.ejfBZ;
            if (paint5 != null) {
                paint5.setStyle(Paint.Style.FILL);
            }
            android.graphics.Paint paint6 = this.ejfBZ;
            if (paint6 != null) {
                paint6.setColor(this.gEmmrt);
            }
            if (canvas != null) {
                float f4 = this.iwGUEr;
                android.graphics.Paint paint7 = this.ejfBZ;
                Intrinsics.copydefault(paint7);
                canvas.drawCircle(f, f2, f4, paint7);
            }
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.ejfBZ;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint2 = this.ejfBZ;
        if (paint2 != null) {
            paint2.setColor(this.valueOf);
        }
        android.graphics.Paint paint3 = this.ejfBZ;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.fetchVPNInfo);
        }
        if (canvas != null) {
            float f = this.fIwbmz;
            float f2 = this.copydefault;
            float f3 = this.QVAiDq;
            android.graphics.Paint paint4 = this.ejfBZ;
            Intrinsics.copydefault(paint4);
            canvas.drawLine(f, f2, f3, f2, paint4);
        }
        android.graphics.Paint paint5 = this.ejfBZ;
        if (paint5 != null) {
            paint5.setStrokeWidth(this.AEQbTJ);
        }
        int i = this.zuBGHE;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = (this.AuCTel * i2) + this.fIwbmz;
            float f5 = this.copydefault;
            if (f4 < this.QVAiDq) {
                android.graphics.Paint paint6 = this.ejfBZ;
                if (paint6 != null) {
                    paint6.setStyle(Paint.Style.FILL);
                }
                android.graphics.Paint paint7 = this.ejfBZ;
                if (paint7 != null) {
                    paint7.setColor(this.wlaJM);
                }
                if (canvas != null) {
                    float f6 = this.zLjUOn;
                    android.graphics.Paint paint8 = this.ejfBZ;
                    Intrinsics.copydefault(paint8);
                    canvas.drawCircle(f4, f5, f6, paint8);
                }
                android.graphics.Paint paint9 = this.ejfBZ;
                if (paint9 != null) {
                    paint9.setStyle(Paint.Style.FILL);
                }
                android.graphics.Paint paint10 = this.ejfBZ;
                if (paint10 != null) {
                    paint10.setColor(this.valueOf);
                }
                if (canvas != null) {
                    float f7 = this.iwGUEr;
                    android.graphics.Paint paint11 = this.ejfBZ;
                    Intrinsics.copydefault(paint11);
                    canvas.drawCircle(f4, f5, f7, paint11);
                }
            }
        }
        float f8 = this.QVAiDq;
        float f9 = this.fIwbmz;
        if (f8 < f9) {
            android.graphics.Paint paint12 = this.ejfBZ;
            if (paint12 != null) {
                paint12.setStyle(Paint.Style.FILL);
            }
            android.graphics.Paint paint13 = this.ejfBZ;
            if (paint13 != null) {
                paint13.setColor(this.valueOf);
            }
            if (canvas != null) {
                float f10 = this.fIwbmz;
                float f11 = this.copydefault;
                float f12 = this.sSMYrx;
                android.graphics.Paint paint14 = this.ejfBZ;
                Intrinsics.copydefault(paint14);
                canvas.drawCircle(f10, f11, f12, paint14);
            }
            android.graphics.Paint paint15 = this.ejfBZ;
            if (paint15 != null) {
                paint15.setColor(this.EZpvd);
            }
            if (canvas != null) {
                float f13 = this.fIwbmz;
                float f14 = this.copydefault;
                float f15 = this.AxsJAY;
                android.graphics.Paint paint16 = this.ejfBZ;
                Intrinsics.copydefault(paint16);
                canvas.drawCircle(f13, f14, f15, paint16);
                return;
            }
            return;
        }
        if (f8 <= f9 + this.getNewProxyInstance) {
            android.graphics.Paint paint17 = this.ejfBZ;
            if (paint17 != null) {
                paint17.setStyle(Paint.Style.FILL);
            }
            android.graphics.Paint paint18 = this.ejfBZ;
            if (paint18 != null) {
                paint18.setColor(this.valueOf);
            }
            if (canvas != null) {
                float f16 = this.QVAiDq;
                float f17 = this.copydefault;
                float f18 = this.sSMYrx;
                android.graphics.Paint paint19 = this.ejfBZ;
                Intrinsics.copydefault(paint19);
                canvas.drawCircle(f16, f17, f18, paint19);
            }
            android.graphics.Paint paint20 = this.ejfBZ;
            if (paint20 != null) {
                paint20.setColor(this.EZpvd);
            }
            if (canvas != null) {
                float f19 = this.QVAiDq;
                float f20 = this.copydefault;
                float f21 = this.AxsJAY;
                android.graphics.Paint paint21 = this.ejfBZ;
                Intrinsics.copydefault(paint21);
                canvas.drawCircle(f19, f20, f21, paint21);
                return;
            }
            return;
        }
        android.graphics.Paint paint22 = this.ejfBZ;
        if (paint22 != null) {
            paint22.setStyle(Paint.Style.FILL);
        }
        android.graphics.Paint paint23 = this.ejfBZ;
        if (paint23 != null) {
            paint23.setColor(this.valueOf);
        }
        if (canvas != null) {
            float f22 = this.fIwbmz;
            float f23 = this.getNewProxyInstance;
            float f24 = this.copydefault;
            float f25 = this.sSMYrx;
            android.graphics.Paint paint24 = this.ejfBZ;
            Intrinsics.copydefault(paint24);
            canvas.drawCircle(f22 + f23, f24, f25, paint24);
        }
        android.graphics.Paint paint25 = this.ejfBZ;
        if (paint25 != null) {
            paint25.setColor(this.EZpvd);
        }
        if (canvas != null) {
            float f26 = this.fIwbmz;
            float f27 = this.getNewProxyInstance;
            float f28 = this.copydefault;
            float f29 = this.AxsJAY;
            android.graphics.Paint paint26 = this.ejfBZ;
            Intrinsics.copydefault(paint26);
            canvas.drawCircle(f26 + f27, f28, f29, paint26);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        float fMeasureText;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOLrzqt = C55296xhK.OLrzqt(context);
        int i = this.zuBGHE;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 != 0) {
                if (i2 == this.zuBGHE - 1) {
                    java.lang.String iCUPercent$default = pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(((double) this.OLrzqt) / C33129mqd.AEQbTJ(java.lang.Float.valueOf(100.0f)))), null, null, null, null, null, 31, null);
                    if (zOLrzqt) {
                        if (canvas != null) {
                            float f = this.fIwbmz;
                            float f2 = this.fARcdN;
                            float f3 = this.getNewProxyInstance;
                            float f4 = this.copydefault;
                            float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
                            android.graphics.Paint paint = this.uzCIH;
                            Intrinsics.copydefault(paint);
                            canvas.drawText(iCUPercent$default, f + f2 + f3, f4 + fDp2pxFloat$default, paint);
                        }
                    } else if (canvas != null) {
                        float f5 = this.fIwbmz;
                        float f6 = this.fARcdN;
                        float f7 = this.getNewProxyInstance;
                        android.graphics.Paint paint2 = this.uzCIH;
                        fMeasureText = paint2 != null ? paint2.measureText(iCUPercent$default) : 0.0f;
                        float f8 = this.copydefault;
                        float fDp2pxFloat$default2 = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
                        android.graphics.Paint paint3 = this.uzCIH;
                        Intrinsics.copydefault(paint3);
                        canvas.drawText(iCUPercent$default, ((f5 + f6) + f7) - fMeasureText, f8 + fDp2pxFloat$default2, paint3);
                    }
                } else {
                    java.lang.String iCUPercent$default2 = pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(((this.OLrzqt / r10) * i2) / 100.0f)))), null, null, null, null, null, 31, null);
                    if (canvas != null) {
                        float f9 = this.fIwbmz;
                        float f10 = this.AuCTel;
                        float f11 = i2;
                        android.graphics.Paint paint4 = this.uzCIH;
                        fMeasureText = paint4 != null ? paint4.measureText(iCUPercent$default2) : 0.0f;
                        float f12 = this.copydefault;
                        float fDp2pxFloat$default3 = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
                        android.graphics.Paint paint5 = this.uzCIH;
                        Intrinsics.copydefault(paint5);
                        canvas.drawText(iCUPercent$default2, (f9 + (f10 * f11)) - (fMeasureText / 2.0f), f12 + fDp2pxFloat$default3, paint5);
                    }
                }
            } else if (zOLrzqt) {
                java.lang.String iCUPercent$default3 = pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(0))), null, null, null, null, null, 31, null);
                if (canvas != null) {
                    android.graphics.Paint paint6 = this.uzCIH;
                    float fMeasureText2 = paint6 != null ? paint6.measureText(iCUPercent$default3) : 0.0f;
                    float f13 = this.copydefault;
                    float fDp2pxFloat$default4 = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
                    android.graphics.Paint paint7 = this.uzCIH;
                    Intrinsics.copydefault(paint7);
                    canvas.drawText(iCUPercent$default3, 0.0f - fMeasureText2, f13 + fDp2pxFloat$default4, paint7);
                }
            } else if (canvas != null) {
                java.lang.String iCUPercent$default4 = pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(0))), null, null, null, null, null, 31, null);
                float f14 = this.copydefault;
                float fDp2pxFloat$default5 = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
                android.graphics.Paint paint8 = this.uzCIH;
                Intrinsics.copydefault(paint8);
                canvas.drawText(iCUPercent$default4, 0.0f, f14 + fDp2pxFloat$default5, paint8);
            }
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        int iAhwBna;
        if (this.isConnected) {
            float f = (this.QVAiDq - this.fIwbmz) / this.AuCTel;
            double d = f;
            if (d > java.lang.Math.floor(d) + 0.3d) {
                iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(f + 1));
            } else {
                iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(f));
            }
            android.graphics.Paint paint = this.ejfBZ;
            if (paint != null) {
                paint.setColor(this.valueOf);
            }
            android.graphics.Paint paint2 = this.ejfBZ;
            if (paint2 != null) {
                paint2.setStrokeWidth(this.fetchVPNInfo);
            }
            if (canvas != null) {
                float f2 = this.fIwbmz;
                float f3 = this.copydefault;
                android.graphics.Paint paint3 = this.ejfBZ;
                Intrinsics.copydefault(paint3);
                canvas.drawLine(f2, f3, f2 + (this.AuCTel * iAhwBna), f3, paint3);
            }
            android.graphics.Paint paint4 = this.ejfBZ;
            if (paint4 != null) {
                paint4.setStrokeWidth(this.AEQbTJ);
            }
            for (int i = 0; i < iAhwBna; i++) {
                float f4 = (this.AuCTel * i) + this.fIwbmz;
                float f5 = this.copydefault;
                if (f4 < this.QVAiDq) {
                    android.graphics.Paint paint5 = this.ejfBZ;
                    if (paint5 != null) {
                        paint5.setStyle(Paint.Style.FILL);
                    }
                    android.graphics.Paint paint6 = this.ejfBZ;
                    if (paint6 != null) {
                        paint6.setColor(this.wlaJM);
                    }
                    if (canvas != null) {
                        float f6 = this.zLjUOn;
                        android.graphics.Paint paint7 = this.ejfBZ;
                        Intrinsics.copydefault(paint7);
                        canvas.drawCircle(f4, f5, f6, paint7);
                    }
                    android.graphics.Paint paint8 = this.ejfBZ;
                    if (paint8 != null) {
                        paint8.setStyle(Paint.Style.FILL);
                    }
                    android.graphics.Paint paint9 = this.ejfBZ;
                    if (paint9 != null) {
                        paint9.setColor(this.valueOf);
                    }
                    if (canvas != null) {
                        float f7 = this.iwGUEr;
                        android.graphics.Paint paint10 = this.ejfBZ;
                        Intrinsics.copydefault(paint10);
                        canvas.drawCircle(f4, f5, f7, paint10);
                    }
                }
            }
            android.graphics.Paint paint11 = this.ejfBZ;
            if (paint11 != null) {
                paint11.setColor(this.valueOf);
            }
            if (canvas != null) {
                float f8 = this.fIwbmz;
                float f9 = this.copydefault;
                float f10 = this.sSMYrx;
                android.graphics.Paint paint12 = this.ejfBZ;
                Intrinsics.copydefault(paint12);
                canvas.drawCircle(f8 + (this.AuCTel * iAhwBna), f9, f10, paint12);
            }
            android.graphics.Paint paint13 = this.ejfBZ;
            if (paint13 != null) {
                paint13.setColor(this.EZpvd);
            }
            if (canvas != null) {
                float f11 = this.fIwbmz;
                float f12 = this.copydefault;
                float f13 = this.AxsJAY;
                android.graphics.Paint paint14 = this.ejfBZ;
                Intrinsics.copydefault(paint14);
                canvas.drawCircle(f11 + (this.AuCTel * iAhwBna), f12, f13, paint14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        int iAhwBna;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!this.isConnected) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.QOLQEE = java.lang.System.currentTimeMillis();
            if (OLrzqt(motionEvent.getX())) {
                this.AhwBna = true;
                this.djBIcL = false;
            } else {
                this.djBIcL = true;
                this.AhwBna = false;
                float x = motionEvent.getX();
                this.QVAiDq = x;
                float f = (x - this.fIwbmz) / this.AuCTel;
                double d = f;
                if (d > java.lang.Math.floor(d) + 0.3d) {
                    iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(f + 1));
                } else {
                    iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(f));
                }
                float f2 = ((iAhwBna * this.OLrzqt) / (this.zuBGHE - 1)) / 100.0f;
                this.fJNWhG = f2;
                Function1<? super java.lang.Float, Unit> function1 = this.AuCTelauCTel;
                if (function1 != null) {
                    function1.invoke(java.lang.Float.valueOf(f2));
                }
                invalidate();
            }
        } else if (action == 1) {
            Function1<? super java.lang.Integer, Unit> function12 = this.gHZMYf;
            if (function12 != null) {
                function12.invoke(2);
            }
            Function0<Unit> function0 = this.AubY;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (action == 2) {
            if (java.lang.System.currentTimeMillis() - this.QOLQEE > 100) {
                this.AhwBna = true;
                this.djBIcL = false;
            }
            if (this.AhwBna) {
                this.QVAiDq = motionEvent.getX();
                float f3 = this.fJNWhG;
                float fEZpvd = 0.0f;
                if (f3 > 0.0f && f3 < 1.0f) {
                    this.OcIXYQ = motionEvent.getRawX();
                }
                float f4 = this.QVAiDq;
                float f5 = this.fIwbmz;
                if (f4 < f5) {
                    this.QVAiDq = f5;
                } else {
                    float f6 = this.getNewProxyInstance + f5;
                    if (f4 > f6) {
                        this.QVAiDq = f6;
                    }
                }
                float f7 = (this.QVAiDq - f5) / this.getNewProxyInstance;
                float f8 = this.OLrzqt;
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
                this.fJNWhG = f10;
                Function2<? super java.lang.Float, ? super java.lang.Float, Unit> function2 = this.zsXlph;
                if (function2 != null) {
                    function2.invoke(java.lang.Float.valueOf(f10), java.lang.Float.valueOf(this.OcIXYQ));
                }
                invalidate();
            }
        } else if (action == 3 || action == 4) {
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.getFieldNames = motionEvent.getX();
            this.hDKMBd = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fAbs = java.lang.Math.abs(x - this.getFieldNames);
            getParent().requestDisallowInterceptTouchEvent(java.lang.Math.abs(y - this.hDKMBd) <= (((float) 2) * fAbs) + ((float) 80));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: o.lpq$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Application extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            C31218lpq.this.QVAiDq = motionEvent.getX();
            C31218lpq.this.AhwBna = true;
            C31218lpq.this.djBIcL = false;
            C31218lpq.this.invalidate();
        }
    }

    public final void KWHzl() {
        float f;
        if (getLayoutDirection() == 1) {
            android.graphics.Paint paint = this.uzCIH;
            f = -1.0f;
            if (paint != null) {
                paint.setTextScaleX(-1.0f);
            }
        } else {
            android.graphics.Paint paint2 = this.uzCIH;
            f = 1.0f;
            if (paint2 != null) {
                paint2.setTextScaleX(1.0f);
            }
        }
        setScaleX(f);
    }
}
