package o;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Region;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.assets.api.model.ValuationCurrency;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jKC extends android.view.View {
    public final float AEQbTJ;
    public final float AYXKKw;
    public boolean AhwBna;
    public final int AkhnZx;
    public float AuCTel;
    public int AuCTelauCTel;
    public float AubY;
    public android.graphics.Path DbNXlk;
    public StateFlow<ValuationCurrency> EZpvd;
    public final int[] KWHzl;
    public float OLrzqt;
    public float copydefault;
    public final float djBIcL;
    public java.util.List<C25908jKv> ejfBZ;
    public float fARcdN;
    public Region fIwbmz;
    public final int fJNWhG;
    public final android.graphics.Paint fetchVPNInfo;
    public final float gEmmrt;
    public int getFieldNames;
    public final android.graphics.Paint getNewProxyInstance;
    public final android.graphics.Paint hDKMBd;
    public final float isConnected;
    public final android.graphics.Paint iwGUEr;
    public int uzCIH;
    public final float valueOf;
    public final float values;
    public java.lang.String wlaJM;
    public float zLjUOn;
    public java.lang.String zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyFlow(@NotNull StateFlow<ValuationCurrency> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        this.EZpvd = stateFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zsXlph = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jKC(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.fetchVPNInfo = paint;
        this.OLrzqt = 100.0f;
        this.copydefault = 100.0f;
        this.AEQbTJ = 7.0f;
        this.fARcdN = -90.0f;
        this.zsXlph = "";
        this.wlaJM = "";
        int color = ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl);
        this.AkhnZx = color;
        int color2 = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        this.fJNWhG = color2;
        float fDjBIcL = C55298xhM.djBIcL(10.0f, context);
        this.valueOf = fDjBIcL;
        float fDjBIcL2 = C55298xhM.djBIcL(12.0f, context);
        this.AYXKKw = fDjBIcL2;
        float fDjBIcL3 = C55298xhM.djBIcL(18.0f, context);
        this.gEmmrt = fDjBIcL3;
        this.djBIcL = C55298xhM.copydefault(4.0f, context);
        this.isConnected = C55298xhM.copydefault(8.0f, context);
        this.values = C55298xhM.copydefault(90.0f, context);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(fDjBIcL);
        paint2.setFakeBoldText(false);
        paint2.setColor(color2);
        paint2.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(context, C52761wXj.Dialog.KWHzl), 0));
        this.hDKMBd = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setTextSize(fDjBIcL2);
        paint3.setFakeBoldText(false);
        paint3.setColor(color2);
        paint3.setAntiAlias(true);
        paint3.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(context, C52761wXj.Dialog.KWHzl), 0));
        this.getNewProxyInstance = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setTextSize(fDjBIcL3);
        paint4.setFakeBoldText(true);
        paint4.setColor(color);
        paint4.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(context, C52761wXj.Dialog.KWHzl), 0));
        this.iwGUEr = paint4;
        this.KWHzl = new int[]{C33070mpX.copydefault(C52761wXj.Activity.RAQtXZ), C33070mpX.copydefault(C52761wXj.Activity.jh), C33070mpX.copydefault(C52761wXj.Activity.ibnZAm), C33070mpX.copydefault(C52761wXj.Activity.gdmIOq), C33070mpX.copydefault(C52761wXj.Activity.OqCbbx), C33070mpX.copydefault(C52761wXj.Activity.zuBGHE)};
        this.ejfBZ = yDY.AhwBna();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(C55298xhM.EZpvd(4.0f, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new CornerPathEffect(12.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.DbNXlk = new android.graphics.Path();
    }

    public final void setProgress(@NotNull java.util.List<C25908jKv> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ejfBZ = list;
        copydefault();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.OLrzqt = i / 2;
        this.copydefault = i2 / 2;
        this.AuCTel = (C56548yJl.valueOf(i, i2) / 2) - this.fetchVPNInfo.getStrokeWidth();
        float f = this.OLrzqt;
        float f2 = i2 / 2.0f;
        float f3 = this.copydefault;
        this.fIwbmz = new Region((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
        this.getFieldNames = ((int) this.hDKMBd.getFontMetrics().descent) - ((int) this.hDKMBd.getFontMetrics().ascent);
        this.uzCIH = ((int) this.getNewProxyInstance.getFontMetrics().descent) - ((int) this.getNewProxyInstance.getFontMetrics().ascent);
        this.AuCTelauCTel = ((int) this.iwGUEr.getFontMetrics().descent) - ((int) this.iwGUEr.getFontMetrics().ascent);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float f = this.fARcdN;
        float size = this.ejfBZ.size() > 1 ? 360.0f - (this.AEQbTJ * this.ejfBZ.size()) : 360.0f;
        java.util.Iterator<T> it = this.ejfBZ.iterator();
        while (it.hasNext()) {
            if (((C25908jKv) it.next()).KWHzl() * size < 1.0f) {
                size -= 1.0f;
            }
        }
        boolean z2 = true;
        int i = 0;
        for (C25908jKv c25908jKv : this.ejfBZ) {
            float fKWHzl = c25908jKv.KWHzl() * size;
            float f2 = fKWHzl < 1.0f ? 1.0f : fKWHzl;
            if (OLrzqt(f, f2) && this.AhwBna) {
                android.graphics.Paint paint = this.fetchVPNInfo;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                paint.setStrokeWidth(C55298xhM.EZpvd(8.0f, context));
                EZpvd(canvas, c25908jKv, !this.AhwBna);
                z = false;
            } else {
                android.graphics.Paint paint2 = this.fetchVPNInfo;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint2.setStrokeWidth(C55298xhM.EZpvd(4.0f, context2));
                z = z2;
            }
            this.fetchVPNInfo.setColor(EZpvd(i));
            float f3 = this.OLrzqt;
            float f4 = this.AuCTel;
            float f5 = this.copydefault;
            canvas.drawArc(f3 - f4, f5 - f4, f3 + f4, f5 + f4, f, f2, false, this.fetchVPNInfo);
            f += f2 + this.AEQbTJ;
            i++;
            z2 = z;
        }
        if (z2) {
            drawTouchText$default(this, canvas, null, true, 2, null);
        }
    }

    public final int EZpvd(int i) {
        int[] iArr = this.KWHzl;
        if (i < iArr.length) {
            return iArr[i];
        }
        return iArr[i % iArr.length];
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.AhwBna = true;
            this.zLjUOn = motionEvent.getX();
            this.AubY = motionEvent.getY();
            invalidate();
        } else if (action == 1 || action == 3) {
            this.AhwBna = false;
        }
        return true;
    }

    private final void copydefault() {
        java.util.Iterator<T> it = this.ejfBZ.iterator();
        double dAEQbTJ = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dAEQbTJ += C33129mqd.AEQbTJ(java.lang.Double.valueOf(((C25908jKv) it.next()).EZpvd()));
        }
        StateFlow<ValuationCurrency> stateFlow = this.EZpvd;
        if (stateFlow == null) {
            Intrinsics.gEmmrt("");
            stateFlow = null;
        }
        this.wlaJM = C27977kKi.OLrzqt(C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ)), stateFlow.getValue().getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
            }
        } : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
            }
        } : new Function1() { // from class: o.jKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jKC.OLrzqt(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final C38307pTy OLrzqt(int i) {
        return C38307pTy.Companion.AEQbTJ(i);
    }

    public static /* synthetic */ void drawTouchText$default(jKC jkc, android.graphics.Canvas canvas, C25908jKv c25908jKv, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c25908jKv = new C25908jKv(0.0f, "--", AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        jkc.EZpvd(canvas, c25908jKv, z);
    }

    public final void EZpvd(android.graphics.Canvas canvas, C25908jKv c25908jKv, boolean z) {
        java.lang.String strAEQbTJ;
        java.lang.String iCUPercent$default;
        java.lang.String strAEQbTJ2;
        java.lang.String iCUPercent$default2;
        java.lang.String strAEQbTJ3;
        java.lang.String strAEQbTJ4;
        java.lang.String iCUPercent$default3;
        java.lang.String iCUPercent$default4;
        java.lang.String strAEQbTJ5;
        java.lang.String str;
        java.lang.String strAEQbTJ6;
        java.lang.String str2 = "";
        if (z) {
            float fEZpvd = EZpvd(this.getNewProxyInstance, this.zsXlph);
            float fEZpvd2 = EZpvd(this.iwGUEr, this.wlaJM);
            if (fEZpvd > this.values) {
                float fEZpvd3 = EZpvd(this.hDKMBd, this.zsXlph);
                if (fEZpvd3 > this.values) {
                    java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) this.zsXlph, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
                    int size = listSplit$default.size();
                    int i = 0;
                    java.lang.String strSubstring = "";
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.hDKMBd.measureText(strSubstring + listSplit$default.get(i)) > this.values) {
                            strSubstring = strSubstring.substring(0, strSubstring.length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            java.lang.String strSubstring2 = this.zsXlph.substring(strSubstring.length(), this.zsXlph.length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            str2 = strSubstring2;
                            break;
                        }
                        strSubstring = strSubstring + listSplit$default.get(i);
                        i++;
                    }
                    canvas.drawText(strSubstring, this.OLrzqt - (EZpvd(this.hDKMBd, strSubstring) / 2.0f), this.copydefault - this.AuCTelauCTel, this.hDKMBd);
                    canvas.drawText(str2, this.OLrzqt - (EZpvd(this.hDKMBd, str2) / 2.0f), this.copydefault, this.hDKMBd);
                    canvas.drawText(this.wlaJM, this.OLrzqt - (fEZpvd2 / 2.0f), this.copydefault + (this.AuCTelauCTel / 2), this.iwGUEr);
                }
                canvas.drawText(this.zsXlph, this.OLrzqt - (fEZpvd3 / 2.0f), this.copydefault - (this.AuCTelauCTel / 2), this.hDKMBd);
                canvas.drawText(this.wlaJM, this.OLrzqt - (fEZpvd2 / 2.0f), this.copydefault + (this.AuCTelauCTel / 2) + this.isConnected, this.iwGUEr);
                return;
            }
            canvas.drawText(this.zsXlph, this.OLrzqt - (fEZpvd / 2.0f), this.copydefault - (this.uzCIH / 2), this.getNewProxyInstance);
            canvas.drawText(this.wlaJM, this.OLrzqt - (fEZpvd2 / 2.0f), this.copydefault + (this.uzCIH / 2) + this.isConnected, this.iwGUEr);
            return;
        }
        android.graphics.Paint paint = this.getNewProxyInstance;
        java.lang.String str3 = "--";
        if (c25908jKv == null || (strAEQbTJ = c25908jKv.AEQbTJ()) == null) {
            strAEQbTJ = "--";
        }
        float fEZpvd4 = EZpvd(paint, strAEQbTJ);
        float fEZpvd5 = EZpvd(this.iwGUEr, KWHzl(C33129mqd.AEQbTJ(c25908jKv != null ? java.lang.Double.valueOf(c25908jKv.EZpvd()) : null)));
        android.graphics.Paint paint2 = this.getNewProxyInstance;
        if (c25908jKv == null || (iCUPercent$default = pTB.formatICUPercent$default(java.lang.Float.valueOf(c25908jKv.KWHzl()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null)) == null) {
            iCUPercent$default = "--";
        }
        float fEZpvd6 = EZpvd(paint2, iCUPercent$default);
        if (fEZpvd4 <= this.values) {
            if (c25908jKv == null || (strAEQbTJ2 = c25908jKv.AEQbTJ()) == null) {
                strAEQbTJ2 = "";
            }
            canvas.drawText(strAEQbTJ2, this.OLrzqt - (fEZpvd4 / 2.0f), this.copydefault - (this.AuCTelauCTel / 2), this.getNewProxyInstance);
            canvas.drawText(KWHzl(C33129mqd.AEQbTJ(c25908jKv != null ? java.lang.Double.valueOf(c25908jKv.EZpvd()) : null)), this.OLrzqt - (fEZpvd5 / 2.0f), this.copydefault + this.isConnected, this.iwGUEr);
            if (c25908jKv != null && (iCUPercent$default2 = pTB.formatICUPercent$default(java.lang.Float.valueOf(c25908jKv.KWHzl()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null)) != null) {
                str2 = iCUPercent$default2;
            }
            canvas.drawText(str2, this.OLrzqt - (fEZpvd6 / 2.0f), this.copydefault + (this.AuCTelauCTel / 2) + this.isConnected + this.djBIcL, this.getNewProxyInstance);
            return;
        }
        android.graphics.Paint paint3 = this.hDKMBd;
        if (c25908jKv == null || (strAEQbTJ3 = c25908jKv.AEQbTJ()) == null) {
            strAEQbTJ3 = "--";
        }
        float fEZpvd7 = EZpvd(paint3, strAEQbTJ3);
        if (fEZpvd7 > this.values) {
            java.util.List listSplit$default2 = (c25908jKv == null || (strAEQbTJ6 = c25908jKv.AEQbTJ()) == null) ? null : StringsKt__StringsKt.split$default((java.lang.CharSequence) strAEQbTJ6, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
            int size2 = listSplit$default2 != null ? listSplit$default2.size() : 0;
            int i2 = 0;
            java.lang.String strSubstring3 = "";
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                if (this.getNewProxyInstance.measureText(strSubstring3 + (listSplit$default2 != null ? (java.lang.String) listSplit$default2.get(i2) : null)) > this.values) {
                    strSubstring3 = strSubstring3.substring(0, strSubstring3.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    if (c25908jKv != null && (strAEQbTJ5 = c25908jKv.AEQbTJ()) != null) {
                        int length = strSubstring3.length();
                        java.lang.String strAEQbTJ7 = c25908jKv.AEQbTJ();
                        java.lang.String strSubstring4 = strAEQbTJ5.substring(length, strAEQbTJ7 != null ? strAEQbTJ7.length() : 0);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                        if (strSubstring4 != null) {
                            str2 = strSubstring4;
                        }
                    }
                } else {
                    if (listSplit$default2 == null || (str = (java.lang.String) listSplit$default2.get(i2)) == null) {
                        str = "";
                    }
                    strSubstring3 = strSubstring3 + str;
                    i2++;
                }
            }
            canvas.drawText(strSubstring3, this.OLrzqt - (EZpvd(this.hDKMBd, strSubstring3) / 2.0f), this.copydefault - (this.getFieldNames * 2), this.hDKMBd);
            canvas.drawText(str2, this.OLrzqt - (EZpvd(this.hDKMBd, str2) / 2.0f), this.copydefault - this.getFieldNames, this.hDKMBd);
            canvas.drawText(KWHzl(C33129mqd.AEQbTJ(c25908jKv != null ? java.lang.Double.valueOf(c25908jKv.EZpvd()) : null)), this.OLrzqt - (fEZpvd5 / 2.0f), this.copydefault + this.isConnected, this.iwGUEr);
            if (c25908jKv != null && (iCUPercent$default4 = pTB.formatICUPercent$default(java.lang.Float.valueOf(c25908jKv.KWHzl()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null)) != null) {
                str3 = iCUPercent$default4;
            }
            canvas.drawText(str3, this.OLrzqt - (fEZpvd6 / 2.0f), this.copydefault + (this.AuCTelauCTel / 2) + (this.uzCIH / 2) + this.isConnected, this.getNewProxyInstance);
            return;
        }
        if (c25908jKv == null || (strAEQbTJ4 = c25908jKv.AEQbTJ()) == null) {
            strAEQbTJ4 = "";
        }
        canvas.drawText(strAEQbTJ4, this.OLrzqt - (fEZpvd7 / 2.0f), this.copydefault - (this.AuCTelauCTel / 2), this.hDKMBd);
        canvas.drawText(KWHzl(C33129mqd.AEQbTJ(c25908jKv != null ? java.lang.Double.valueOf(c25908jKv.EZpvd()) : null)), this.OLrzqt - (fEZpvd5 / 2.0f), this.copydefault + this.isConnected, this.iwGUEr);
        if (c25908jKv != null && (iCUPercent$default3 = pTB.formatICUPercent$default(java.lang.Float.valueOf(c25908jKv.KWHzl()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null)) != null) {
            str2 = iCUPercent$default3;
        }
        canvas.drawText(str2, this.OLrzqt - (fEZpvd6 / 2.0f), this.copydefault + (this.AuCTelauCTel / 2) + this.isConnected + this.djBIcL, this.hDKMBd);
    }

    public static final C38307pTy copydefault(int i) {
        return C38307pTy.Companion.AEQbTJ(i);
    }

    public final java.lang.String KWHzl(double d) {
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(d));
        StateFlow<ValuationCurrency> stateFlow = this.EZpvd;
        if (stateFlow == null) {
            Intrinsics.gEmmrt("");
            stateFlow = null;
        }
        return C27977kKi.OLrzqt(strGEmmrt, stateFlow.getValue().getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
            }
        } : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
            }
        } : new Function1() { // from class: o.jKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jKC.copydefault(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public final boolean OLrzqt(float f, float f2) {
        double d = this.OLrzqt;
        double d2 = this.AuCTel;
        double d3 = f;
        double dCos = java.lang.Math.cos(java.lang.Math.toRadians(d3));
        double d4 = this.copydefault;
        double d5 = this.AuCTel;
        double dSin = java.lang.Math.sin(java.lang.Math.toRadians(d3));
        android.graphics.Path path = this.DbNXlk;
        path.reset();
        path.moveTo(this.OLrzqt, this.copydefault);
        path.lineTo((float) (d + (d2 * dCos)), (float) (d4 + (d5 * dSin)));
        float f3 = this.OLrzqt;
        float f4 = this.AuCTel;
        float f5 = this.copydefault;
        path.addArc(f3 - f4, f5 - f4, f3 + f4, f5 + f4, f, f2);
        path.lineTo(this.OLrzqt, this.copydefault);
        Region region = new Region();
        android.graphics.Path path2 = this.DbNXlk;
        Region region2 = this.fIwbmz;
        if (region2 == null) {
            Intrinsics.gEmmrt("");
            region2 = null;
        }
        region.setPath(path2, region2);
        return region.contains((int) this.zLjUOn, (int) this.AubY);
    }

    public final float EZpvd(android.graphics.Paint paint, java.lang.String str) {
        return paint.measureText(str);
    }
}
