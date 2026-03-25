package o;

import android.graphics.Paint;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisColumnarBean;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14763drb extends android.view.View {
    public final int AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public float AkhnZx;
    public float AuCTel;
    public float AuCTelauCTel;
    public float AubY;
    public float AwvSrB;
    public float AxsJAY;
    public java.lang.Integer DTwDnp;
    public final int DbNXlk;
    public float EZpvd;
    public final float KWHzl;
    public final int OLrzqt;
    public float ORxRYg;
    public final int OcIXYQ;
    public boolean QKVWgx;
    public float QOLQEE;
    public final float copydefault;
    public float djBIcL;
    public float ejfBZ;
    public float fARcdN;
    public float fIwbmz;
    public final android.graphics.Paint fJNWhG;
    public boolean fetchVPNInfo;
    public float gEmmrt;
    public final android.graphics.Paint gHZMYf;
    public Function1<? super WalletPnlAnalysisColumnarBean, Unit> getFieldNames;
    public final android.graphics.Paint getNewProxyInstance;
    public java.util.List<WalletPnlAnalysisColumnarBean> hDKMBd;
    public final android.graphics.Paint isConnected;
    public final int iwGUEr;
    public final float sSMYrx;
    public Function0<Unit> uzCIH;
    public float valueOf;
    public boolean values;
    public float wlaJM;
    public float zLjUOn;
    public final android.graphics.Paint zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTouchCancelListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.uzCIH = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTouchListener(@NotNull Function1<? super WalletPnlAnalysisColumnarBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.getFieldNames = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14763drb(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE);
        this.AEQbTJ = color;
        int color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE);
        this.OLrzqt = color2;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fCopydefault = C55298xhM.copydefault(0.5f, context2);
        this.copydefault = fCopydefault;
        this.DbNXlk = 3;
        this.iwGUEr = 7;
        this.AubY = 2.5f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.fIwbmz = C55298xhM.copydefault(10.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AkhnZx = C55298xhM.copydefault(24.0f, r4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.zuBGHE = C55298xhM.copydefault(10.0f, r4);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fDjBIcL = C55298xhM.djBIcL(10.0f, context3);
        this.sSMYrx = fDjBIcL;
        int color3 = ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe);
        this.OcIXYQ = color3;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStrokeWidth(fCopydefault);
        paint.setColor(color);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.isConnected = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(fDjBIcL);
        paint2.setColor(color3);
        paint2.setAntiAlias(true);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl), 0));
        this.zsXlph = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint3.setTextSize(C55298xhM.djBIcL(12.0f, r11));
        paint3.setColor(color3);
        paint3.setAntiAlias(true);
        paint3.setStyle(style2);
        paint3.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl), 0));
        this.getNewProxyInstance = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setStrokeWidth(fCopydefault);
        paint4.setAntiAlias(true);
        paint4.setStyle(style2);
        this.fJNWhG = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setStrokeWidth(fCopydefault);
        paint5.setColor(color2);
        paint5.setAntiAlias(true);
        paint5.setStyle(style);
        paint5.setPathEffect(paint5.getPathEffect());
        this.gHZMYf = paint5;
        this.QKVWgx = true;
        this.hDKMBd = yDY.AhwBna();
        this.AYXKKw = 0.5f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.wlaJM = C55298xhM.copydefault(10.0f, r14);
        this.KWHzl = 1.0f;
        this.gEmmrt = 0.0625f;
        this.zLjUOn = paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        float fMeasureText = paint2.measureText("ABCD");
        this.AuCTelauCTel = fMeasureText;
        this.fIwbmz = fMeasureText + this.wlaJM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14763drb(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE);
        this.AEQbTJ = color;
        int color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE);
        this.OLrzqt = color2;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fCopydefault = C55298xhM.copydefault(0.5f, context2);
        this.copydefault = fCopydefault;
        this.DbNXlk = 3;
        this.iwGUEr = 7;
        this.AubY = 2.5f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.fIwbmz = C55298xhM.copydefault(10.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AkhnZx = C55298xhM.copydefault(24.0f, r3);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.zuBGHE = C55298xhM.copydefault(10.0f, r3);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fDjBIcL = C55298xhM.djBIcL(10.0f, context3);
        this.sSMYrx = fDjBIcL;
        int color3 = ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe);
        this.OcIXYQ = color3;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStrokeWidth(fCopydefault);
        paint.setColor(color);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.isConnected = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(fDjBIcL);
        paint2.setColor(color3);
        paint2.setAntiAlias(true);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl), 0));
        this.zsXlph = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint3.setTextSize(C55298xhM.djBIcL(12.0f, r10));
        paint3.setColor(color3);
        paint3.setAntiAlias(true);
        paint3.setStyle(style2);
        paint3.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl), 0));
        this.getNewProxyInstance = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setStrokeWidth(fCopydefault);
        paint4.setAntiAlias(true);
        paint4.setStyle(style2);
        this.fJNWhG = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setStrokeWidth(fCopydefault);
        paint5.setColor(color2);
        paint5.setAntiAlias(true);
        paint5.setStyle(style);
        paint5.setPathEffect(paint5.getPathEffect());
        this.gHZMYf = paint5;
        this.QKVWgx = true;
        this.hDKMBd = yDY.AhwBna();
        this.AYXKKw = 0.5f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.wlaJM = C55298xhM.copydefault(10.0f, r13);
        this.KWHzl = 1.0f;
        this.gEmmrt = 0.0625f;
        this.zLjUOn = paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        float fMeasureText = paint2.measureText("ABCD");
        this.AuCTelauCTel = fMeasureText;
        this.fIwbmz = fMeasureText + this.wlaJM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14763drb(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE);
        this.AEQbTJ = color;
        int color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE);
        this.OLrzqt = color2;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fCopydefault = C55298xhM.copydefault(0.5f, context2);
        this.copydefault = fCopydefault;
        this.DbNXlk = 3;
        this.iwGUEr = 7;
        this.AubY = 2.5f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.fIwbmz = C55298xhM.copydefault(10.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.AkhnZx = C55298xhM.copydefault(24.0f, r2);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.zuBGHE = C55298xhM.copydefault(10.0f, r2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fDjBIcL = C55298xhM.djBIcL(10.0f, context3);
        this.sSMYrx = fDjBIcL;
        int color3 = ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe);
        this.OcIXYQ = color3;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStrokeWidth(fCopydefault);
        paint.setColor(color);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.isConnected = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(fDjBIcL);
        paint2.setColor(color3);
        paint2.setAntiAlias(true);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl), 0));
        this.zsXlph = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint3.setTextSize(C55298xhM.djBIcL(12.0f, r9));
        paint3.setColor(color3);
        paint3.setAntiAlias(true);
        paint3.setStyle(style2);
        paint3.setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl), 0));
        this.getNewProxyInstance = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setStrokeWidth(fCopydefault);
        paint4.setAntiAlias(true);
        paint4.setStyle(style2);
        this.fJNWhG = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setStrokeWidth(fCopydefault);
        paint5.setColor(color2);
        paint5.setAntiAlias(true);
        paint5.setStyle(style);
        paint5.setPathEffect(paint5.getPathEffect());
        this.gHZMYf = paint5;
        this.QKVWgx = true;
        this.hDKMBd = yDY.AhwBna();
        this.AYXKKw = 0.5f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.wlaJM = C55298xhM.copydefault(10.0f, r12);
        this.KWHzl = 1.0f;
        this.gEmmrt = 0.0625f;
        this.zLjUOn = paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        float fMeasureText = paint2.measureText("ABCD");
        this.AuCTelauCTel = fMeasureText;
        this.fIwbmz = fMeasureText + this.wlaJM;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        java.util.List<kotlin.Pair<java.lang.String, java.lang.Float>> listKWHzl = KWHzl();
        java.util.Iterator<T> it = listKWHzl.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((java.lang.Number) ((kotlin.Pair) next).getSecond()).floatValue();
            do {
                java.lang.Object next2 = it.next();
                float fFloatValue2 = ((java.lang.Number) ((kotlin.Pair) next2).getSecond()).floatValue();
                if (java.lang.Float.compare(fFloatValue, fFloatValue2) < 0) {
                    next = next2;
                    fFloatValue = fFloatValue2;
                }
            } while (it.hasNext());
        }
        this.AuCTelauCTel = ((java.lang.Number) ((kotlin.Pair) next).getSecond()).floatValue();
        this.fIwbmz = this.hDKMBd.isEmpty() ? 0.0f : this.AuCTelauCTel + this.wlaJM;
        AEQbTJ(canvas);
        KWHzl(canvas, listKWHzl);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        int i = this.DbNXlk;
        for (int i2 = 0; i2 < i; i2++) {
            float f = this.fIwbmz;
            float f2 = this.zuBGHE;
            float f3 = this.ORxRYg;
            float f4 = (this.ejfBZ * i2) + f2;
            canvas.drawLine(f, f4, f3 + f, f4, this.isConnected);
        }
        WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean = (WalletPnlAnalysisColumnarBean) CollectionsKt___CollectionsKt.firstOrNull(this.hDKMBd);
        java.lang.String strAEQbTJ = AEQbTJ(walletPnlAnalysisColumnarBean != null ? walletPnlAnalysisColumnarBean.getTimestamp() : null);
        WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean2 = (WalletPnlAnalysisColumnarBean) CollectionsKt___CollectionsKt.wlaJM(this.hDKMBd);
        java.lang.String strAEQbTJ2 = AEQbTJ(walletPnlAnalysisColumnarBean2 != null ? walletPnlAnalysisColumnarBean2.getTimestamp() : null);
        canvas.drawText(strAEQbTJ, this.fIwbmz, this.fARcdN + this.zuBGHE + (this.zLjUOn * this.AubY), this.zsXlph);
        canvas.drawText(strAEQbTJ2, this.ORxRYg - this.zsXlph.measureText(strAEQbTJ2), this.fARcdN + this.zuBGHE + (this.zLjUOn * this.AubY), this.zsXlph);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return C33129mqd.valueOf(str, 0) ? "" : pTA.formatDate$default(new Date(C33129mqd.valueOf(str)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
    }

    public final void KWHzl(android.graphics.Canvas canvas, java.util.List<kotlin.Pair<java.lang.String, java.lang.Float>> list) {
        float fDjBIcL;
        float f = this.QOLQEE;
        if (f != 0.0f) {
            this.djBIcL = (this.fARcdN / 2.0f) / f;
            this.valueOf = (this.AYXKKw * ((this.ORxRYg - this.fIwbmz) - (this.hDKMBd.size() * this.gEmmrt))) / java.lang.Math.max(this.hDKMBd.size(), this.iwGUEr);
            AEQbTJ(canvas, list);
            float f2 = this.valueOf;
            float f3 = f2 / this.AYXKKw;
            this.AhwBna = f3;
            this.EZpvd = (f3 - f2) / 2;
            int i = 0;
            for (java.lang.Object obj : this.hDKMBd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean = (WalletPnlAnalysisColumnarBean) obj;
                float f4 = this.fIwbmz;
                float f5 = this.AhwBna;
                float f6 = i;
                float f7 = this.gEmmrt;
                float f8 = this.EZpvd;
                float f9 = this.valueOf;
                float f10 = this.zuBGHE + this.ejfBZ;
                if (this.fetchVPNInfo) {
                    fDjBIcL = C55298xhM.dp2px$default(4.0f, null, 1, null);
                } else {
                    fDjBIcL = C33129mqd.djBIcL(walletPnlAnalysisColumnarBean.getProfit()) * this.djBIcL;
                }
                android.graphics.Paint paint = this.fJNWhG;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                paint.setColor(OLrzqt(context, walletPnlAnalysisColumnarBean.getProfit(), this.fetchVPNInfo));
                float f11 = (f5 * f6) + f4;
                float f12 = f6 * f7;
                canvas.drawRect(f11 + f12 + f8, f10 - fDjBIcL, f11 + f9 + f12 + f8, f10, this.fJNWhG);
                i++;
            }
            EZpvd(canvas);
            return;
        }
        if (!this.hDKMBd.isEmpty()) {
            EZpvd(canvas);
        }
    }

    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.Float>> KWHzl() {
        float f = this.QOLQEE;
        float f2 = f / ((r2 - 1) / 2.0f);
        kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, this.DbNXlk);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            java.lang.String valuation$default = C54880xYt.formatValuation$default(C54862xYb.OLrzqt(java.lang.Float.valueOf(this.QOLQEE - (((AbstractC56415yEn) it).nextInt() * f2)), java.lang.Double.valueOf(C54864xYd.AEQbTJ.copydefault().getUsdToThisRate())), 0, 0, null, null, null, null, false, 63, null);
            if (!C33129mqd.OLrzqt((java.lang.Object) valuation$default, (java.lang.Object) 0) && this.QKVWgx) {
                valuation$default = C13821dZn.EZpvd.KWHzl(valuation$default);
            }
            arrayList.add(C56390yDp.OLrzqt(valuation$default, java.lang.Float.valueOf(this.zsXlph.measureText(valuation$default))));
        }
        return arrayList;
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        if (this.values && !this.fetchVPNInfo) {
            float fOLrzqt = OLrzqt();
            float f = this.fIwbmz + (this.AhwBna * fOLrzqt) + (this.valueOf / 2.0f) + (fOLrzqt * this.gEmmrt) + this.EZpvd;
            float f2 = this.zuBGHE;
            canvas.drawLine(f, f2, f, f2 + this.fARcdN, this.gHZMYf);
            return;
        }
        canvas.drawLine(0.0f, 0.0f, 0.0f, 0.0f, this.gHZMYf);
    }

    private final int OLrzqt() {
        float f = ((this.AwvSrB - this.fIwbmz) - this.gEmmrt) / this.AhwBna;
        if (f < 0.0f) {
            return 0;
        }
        return f >= ((float) this.hDKMBd.size()) ? this.hDKMBd.size() - 1 : (int) f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 2)) {
            this.values = true;
            this.AwvSrB = motionEvent.getX();
            invalidate();
            AEQbTJ();
        } else if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
            this.values = false;
            this.DTwDnp = null;
            invalidate();
            Function0<Unit> function0 = this.uzCIH;
            if (function0 != null) {
                function0.invoke();
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public final void AEQbTJ() {
        if (this.hDKMBd.isEmpty() || this.fetchVPNInfo) {
            return;
        }
        int iOLrzqt = OLrzqt();
        java.lang.Integer num = this.DTwDnp;
        if (num != null && iOLrzqt == num.intValue()) {
            return;
        }
        this.DTwDnp = java.lang.Integer.valueOf(iOLrzqt);
        Function1<? super WalletPnlAnalysisColumnarBean, Unit> function1 = this.getFieldNames;
        if (function1 != null) {
            function1.invoke(CollectionsKt___CollectionsKt.AkhnZx(this.hDKMBd, iOLrzqt));
        }
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.AwvSrB = motionEvent.getX();
            this.AxsJAY = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fAbs = java.lang.Math.abs(x - this.AwvSrB);
            getParent().requestDisallowInterceptTouchEvent(java.lang.Math.abs(y - this.AxsJAY) <= (((float) 2) * fAbs) + ((float) 80));
        } else if ((numValueOf == null || numValueOf.intValue() != 3) && numValueOf != null) {
            numValueOf.intValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ORxRYg = i;
        float f = i2;
        this.AuCTel = f;
        float f2 = (f - this.AkhnZx) - this.zuBGHE;
        this.fARcdN = f2;
        this.ejfBZ = f2 / ((this.DbNXlk - 1) * 1.0f);
    }

    public final void setData(java.util.List<WalletPnlAnalysisColumnarBean> list, boolean z, boolean z2) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        this.hDKMBd = list;
        this.QKVWgx = z;
        this.fetchVPNInfo = z2;
        this.values = false;
        copydefault(list.size());
        AEQbTJ(this.hDKMBd);
        invalidate();
    }

    private final void copydefault(int i) {
        float f;
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(i), 20)) {
            f = 0.5f;
        } else {
            f = C33129mqd.valueOf(java.lang.Integer.valueOf(i), 35) ? 0.6f : 0.8f;
        }
        this.AYXKKw = f;
    }

    public final void AEQbTJ(java.util.List<WalletPnlAnalysisColumnarBean> list) {
        WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean = (WalletPnlAnalysisColumnarBean) CollectionsKt___CollectionsKt.UeEOUB(list);
        float fDjBIcL = C33129mqd.djBIcL(walletPnlAnalysisColumnarBean != null ? walletPnlAnalysisColumnarBean.getProfit() : null);
        WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean2 = (WalletPnlAnalysisColumnarBean) CollectionsKt___CollectionsKt.fFgQHt(list);
        this.QOLQEE = java.lang.Math.max(java.lang.Math.abs(fDjBIcL), java.lang.Math.abs(C33129mqd.djBIcL(walletPnlAnalysisColumnarBean2 != null ? walletPnlAnalysisColumnarBean2.getProfit() : null))) * this.KWHzl;
    }

    public final int OLrzqt(android.content.Context context, java.lang.String str, boolean z) {
        if (z) {
            return C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN);
        }
        return C33129mqd.AEQbTJ(str, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33129mqd.gEmmrt(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, java.util.List<kotlin.Pair<java.lang.String, java.lang.Float>> list) {
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            canvas.drawText((java.lang.String) ((kotlin.Pair) obj).component1(), 0.0f, this.zuBGHE + (this.ejfBZ * i) + (this.zLjUOn / 2.0f), this.zsXlph);
            i++;
        }
    }
}
