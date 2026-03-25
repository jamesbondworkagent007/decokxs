package o;

import android.graphics.Bitmap;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.serializer.PlanetNumericString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tWA extends LineChartRenderer {
    public final float AEQbTJ;
    public final int AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final android.graphics.Paint AuCTel;
    public java.lang.String AuCTelauCTel;
    public java.lang.String AubY;
    public final boolean AwvSrB;
    public final int AxsJAY;
    public final android.graphics.Paint DbNXlk;
    public final LineChart EZpvd;
    public android.graphics.Bitmap KWHzl;
    public final float OLrzqt;
    public android.graphics.Bitmap copydefault;
    public final int djBIcL;
    public final android.graphics.Paint ejfBZ;
    public final android.graphics.Paint fARcdN;
    public final int fIwbmz;
    public final float[] fJNWhG;
    public boolean fetchVPNInfo;
    public final int gEmmrt;
    public final int gHZMYf;
    public final float getFieldNames;
    public final int getNewProxyInstance;
    public final float hDKMBd;
    public final android.graphics.Paint isConnected;
    public final float iwGUEr;
    public final android.graphics.Paint sSMYrx;
    public final float uzCIH;
    public final int valueOf;
    public final android.graphics.Paint values;
    public int wlaJM;
    public final int zLjUOn;
    public int zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.github.mikephil.charting.charts.LineChart)
  (r2v0 int)
  (r3v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(com.github.mikephil.charting.charts.LineChart, int, int, boolean):void (m)] (LINE:30) call: o.tWA.<init>(com.github.mikephil.charting.charts.LineChart, int, int, boolean):void type: THIS */
    public /* synthetic */ tWA(LineChart lineChart, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(lineChart, i, i2, (i3 & 8) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tWA(@NotNull LineChart lineChart, int i, int i2, boolean z) {
        super(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler());
        Intrinsics.checkNotNullParameter(lineChart, "");
        this.EZpvd = lineChart;
        this.valueOf = i2;
        this.AwvSrB = z;
        this.wlaJM = -1;
        this.zsXlph = -1;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.ejfBZ = paint;
        PlanetNumericString.Companion companion = PlanetNumericString.Companion;
        this.AuCTelauCTel = companion.EZpvd();
        this.AubY = companion.EZpvd();
        this.fJNWhG = new float[2];
        this.fetchVPNInfo = true;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        this.AxsJAY = iTradeRiseGraph$default;
        android.content.Context context2 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.gEmmrt = C33512mxp.tradeFallGraph$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.gHZMYf = C33512mxp.tradeRiseDefault$default(c33512mxp, context3, 0.0f, 2, null);
        android.content.Context context4 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.AYXKKw = C33512mxp.tradeFallDefault$default(c33512mxp, context4, 0.0f, 2, null);
        android.content.Context context5 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        int iZLjUOn = c33512mxp.zLjUOn(context5, 0.3f);
        this.zLjUOn = iZLjUOn;
        android.content.Context context6 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        int iIsConnected = c33512mxp.isConnected(context6, 0.3f);
        this.djBIcL = iIsConnected;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.sSMYrx = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.AhwBna = paint3;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(C55298xhM.dp2pxFloat$default(10.0f, null, 1, null));
        paint.setTypeface(C55051xce.OLrzqt.valueOf());
        this.fIwbmz = C55298xhM.dp2px$default(8.0f, null, 1, null);
        this.getNewProxyInstance = C55298xhM.dp2px$default(15.0f, null, 1, null);
        this.iwGUEr = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.uzCIH = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.getFieldNames = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        this.OLrzqt = 0.0f;
        this.hDKMBd = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.AkhnZx = paint4;
        paint4.setColor(i);
        android.graphics.Paint paint5 = new android.graphics.Paint(1);
        this.AuCTel = paint5;
        paint5.setColor(iZLjUOn);
        android.graphics.Paint paint6 = new android.graphics.Paint(1);
        this.DbNXlk = paint6;
        paint6.setColor(iIsConnected);
        android.graphics.Paint paint7 = new android.graphics.Paint(1);
        this.isConnected = paint7;
        paint7.setColor(i);
        android.graphics.Paint paint8 = new android.graphics.Paint(1);
        this.values = paint8;
        paint8.setColor(i);
        android.graphics.Paint paint9 = new android.graphics.Paint(1);
        this.fARcdN = paint9;
        paint9.setStyle(Paint.Style.FILL);
        paint2.setColor(iTradeRiseGraph$default);
        paint2.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        paint2.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setPathEffect(new DashPathEffect(new float[]{C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)}, 0.0f));
        int i3 = C52761wXj.Activity.ORxRYg;
        android.content.Context context7 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        paint3.setColor(C33070mpX.OLrzqt(i3, context7));
        paint3.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setPathEffect(new DashPathEffect(new float[]{C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)}, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawValues(android.graphics.Canvas canvas) {
        int i;
        java.lang.String strM8766pnlDollarFormatHYcmJmU$default;
        int i2;
        java.lang.String strM8766pnlDollarFormatHYcmJmU$default2;
        float f;
        float f2;
        int i3;
        super.drawValues(canvas);
        if (!AEQbTJ()) {
            return;
        }
        java.lang.Object obj = this.mChart.getLineData().getDataSets().get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        ILineDataSet iLineDataSet = (ILineDataSet) obj;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
        this.mXBounds.set(this.mChart, iLineDataSet);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
        if (fArrGenerateTransformedValuesLine.length < 3 || (i = this.zsXlph * 2) >= fArrGenerateTransformedValuesLine.length) {
            return;
        }
        float f3 = fArrGenerateTransformedValuesLine[0];
        Intrinsics.copydefault(fArrGenerateTransformedValuesLine);
        float f4 = fArrGenerateTransformedValuesLine[yDV.valueOf(fArrGenerateTransformedValuesLine) - 1];
        float f5 = fArrGenerateTransformedValuesLine[i];
        float f6 = fArrGenerateTransformedValuesLine[i + 1];
        if (this.fetchVPNInfo) {
            strM8766pnlDollarFormatHYcmJmU$default = pTB.formatICUPercent$default(pTB.OLrzqt(PlanetNumericString.OLrzqt(this.AubY)), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
        } else {
            strM8766pnlDollarFormatHYcmJmU$default = C46367tRs.m8766pnlDollarFormatHYcmJmU$default(this.AubY, false, 1, null);
        }
        int i4 = this.wlaJM * 2;
        if (i4 >= fArrGenerateTransformedValuesLine.length) {
            return;
        }
        float f7 = fArrGenerateTransformedValuesLine[i4];
        float f8 = fArrGenerateTransformedValuesLine[i4 + 1];
        if (this.fetchVPNInfo) {
            strM8766pnlDollarFormatHYcmJmU$default2 = pTB.formatICUPercent$default(pTB.OLrzqt(PlanetNumericString.OLrzqt(this.AuCTelauCTel)), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
            i2 = 0;
        } else {
            i2 = 0;
            strM8766pnlDollarFormatHYcmJmU$default2 = C46367tRs.m8766pnlDollarFormatHYcmJmU$default(this.AuCTelauCTel, false, 1, null);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        this.ejfBZ.getTextBounds(strM8766pnlDollarFormatHYcmJmU$default, i2, strM8766pnlDollarFormatHYcmJmU$default.length(), rect);
        int iWidth = rect.width();
        float f9 = iWidth / 2;
        float f10 = this.iwGUEr;
        float f11 = (f5 - f9) - f10;
        float f12 = f5 + f9 + f10;
        if (f12 > f4) {
            float f13 = this.hDKMBd + f4;
            f11 = ((f13 - f10) - iWidth) - f10;
            f12 = f13;
        } else {
            if (f11 < f3) {
                float f14 = f3 - this.hDKMBd;
                f12 = f14 + f10 + iWidth + f10;
                f11 = f14;
            }
            float f15 = circleRadius;
            float f16 = (f6 - f15) - this.fIwbmz;
            float f17 = f16 - this.getFieldNames;
            RectF rectF = new RectF(f11, f17, f12, f16);
            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.zsXlph);
            android.graphics.Paint paint = (entryForIndex != 0 || entryForIndex.getY() < 0.0f) ? this.DbNXlk : this.AuCTel;
            if (canvas != null) {
                float f18 = this.uzCIH;
                canvas.drawRoundRect(rectF, f18, f18, paint);
            }
            android.graphics.Rect rect2 = new android.graphics.Rect();
            float f19 = f5;
            this.ejfBZ.getTextBounds(strM8766pnlDollarFormatHYcmJmU$default2, 0, strM8766pnlDollarFormatHYcmJmU$default2.length(), rect2);
            int iWidth2 = rect2.width();
            float f20 = iWidth2 / 2;
            float f21 = this.iwGUEr;
            f = (f7 - f20) - f21;
            float f22 = f7 + f20 + f21;
            if (f >= f3) {
                float f23 = f3 - this.hDKMBd;
                f22 = f23 + f21 + iWidth2 + f21;
                f = f23;
            } else {
                if (f22 > f4) {
                    float f24 = f4 + this.hDKMBd;
                    f = ((f24 - f21) - iWidth2) - f21;
                    f22 = f24;
                }
                float f25 = this.getNewProxyInstance + f8 + f15;
                float f26 = f25 - this.getFieldNames;
                RectF rectF2 = new RectF(f, f26, f22, f25);
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(this.wlaJM);
                android.graphics.Paint paint2 = (entryForIndex2 == 0 || entryForIndex2.getY() < 0.0f) ? this.DbNXlk : this.AuCTel;
                if (canvas != null) {
                    float f27 = this.uzCIH;
                    canvas.drawRoundRect(rectF2, f27, f27, paint2);
                }
                if (!this.AwvSrB) {
                    return;
                }
                if (entryForIndex != 0) {
                    float y = entryForIndex.getY();
                    f2 = 0.0f;
                    if (y >= 0.0f) {
                        i3 = this.gHZMYf;
                    }
                    int i5 = (entryForIndex2 != 0 || entryForIndex2.getY() < f2) ? this.AYXKKw : this.gHZMYf;
                    Paint.FontMetrics fontMetrics = this.ejfBZ.getFontMetrics();
                    float f28 = fontMetrics.descent;
                    float f29 = fontMetrics.ascent;
                    float f30 = f28 - f29;
                    float f31 = 2;
                    float f32 = (this.getFieldNames - f30) / f31;
                    this.ejfBZ.setColor(i3);
                    if (canvas != null) {
                        canvas.drawText(strM8766pnlDollarFormatHYcmJmU$default, f19, (f17 + f32) - f29, this.ejfBZ);
                    }
                    float f33 = (this.getFieldNames - f30) / f31;
                    float f34 = fontMetrics.ascent;
                    this.ejfBZ.setColor(i5);
                    if (canvas == null) {
                        canvas.drawText(strM8766pnlDollarFormatHYcmJmU$default2, f7, (f26 + f33) - f34, this.ejfBZ);
                        return;
                    }
                    return;
                }
                f2 = 0.0f;
                i3 = this.AYXKKw;
                if (entryForIndex2 != 0) {
                }
                Paint.FontMetrics fontMetrics2 = this.ejfBZ.getFontMetrics();
                float f282 = fontMetrics2.descent;
                float f292 = fontMetrics2.ascent;
                float f302 = f282 - f292;
                float f312 = 2;
                float f322 = (this.getFieldNames - f302) / f312;
                this.ejfBZ.setColor(i3);
                if (canvas != null) {
                }
                float f332 = (this.getFieldNames - f302) / f312;
                float f342 = fontMetrics2.ascent;
                this.ejfBZ.setColor(i5);
                if (canvas == null) {
                }
            }
            f7 = f21 + f + f20;
            float f252 = this.getNewProxyInstance + f8 + f15;
            float f262 = f252 - this.getFieldNames;
            RectF rectF22 = new RectF(f, f262, f22, f252);
            ?? entryForIndex22 = iLineDataSet.getEntryForIndex(this.wlaJM);
            if (entryForIndex22 == 0) {
            }
            if (canvas != null) {
            }
            if (!this.AwvSrB) {
            }
        }
        f5 = f10 + f11 + f9;
        float f152 = circleRadius;
        float f162 = (f6 - f152) - this.fIwbmz;
        float f172 = f162 - this.getFieldNames;
        RectF rectF3 = new RectF(f11, f172, f12, f162);
        ?? entryForIndex3 = iLineDataSet.getEntryForIndex(this.zsXlph);
        if (entryForIndex3 != 0) {
        }
        if (canvas != null) {
        }
        android.graphics.Rect rect22 = new android.graphics.Rect();
        float f192 = f5;
        this.ejfBZ.getTextBounds(strM8766pnlDollarFormatHYcmJmU$default2, 0, strM8766pnlDollarFormatHYcmJmU$default2.length(), rect22);
        int iWidth22 = rect22.width();
        float f202 = iWidth22 / 2;
        float f212 = this.iwGUEr;
        f = (f7 - f202) - f212;
        float f222 = f7 + f202 + f212;
        if (f >= f3) {
        }
        f7 = f212 + f + f202;
        float f2522 = this.getNewProxyInstance + f8 + f152;
        float f2622 = f2522 - this.getFieldNames;
        RectF rectF222 = new RectF(f, f2622, f222, f2522);
        ?? entryForIndex222 = iLineDataSet.getEntryForIndex(this.wlaJM);
        if (entryForIndex222 == 0) {
        }
        if (canvas != null) {
        }
        if (!this.AwvSrB) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCircles(android.graphics.Canvas canvas) {
        super.drawCircles(canvas);
        if (AEQbTJ() && this.mAnimator.getPhaseX() >= 0.8f) {
            java.lang.Object obj = this.mChart.getLineData().getDataSets().get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            ILineDataSet iLineDataSet = (ILineDataSet) obj;
            Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
            if (this.copydefault == null || this.KWHzl == null) {
                KWHzl();
            }
            float fDp2pxFloat$default = this.AEQbTJ + C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.zsXlph);
            if (entryForIndex == 0) {
                return;
            }
            this.fJNWhG[0] = entryForIndex.getX();
            this.fJNWhG[1] = entryForIndex.getY();
            transformer.pointValuesToPixel(this.fJNWhG);
            if (this.mViewPortHandler.isInBoundsRight(this.fJNWhG[0]) && this.mViewPortHandler.isInBoundsLeft(this.fJNWhG[0]) && this.mViewPortHandler.isInBoundsY(this.fJNWhG[1])) {
                android.graphics.Bitmap bitmap = entryForIndex.getY() >= 0.0f ? this.copydefault : this.KWHzl;
                if (bitmap != null && canvas != null) {
                    float[] fArr = this.fJNWhG;
                    canvas.drawBitmap(bitmap, fArr[0] - fDp2pxFloat$default, fArr[1] - fDp2pxFloat$default, this.isConnected);
                }
            }
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(this.wlaJM);
            if (entryForIndex2 == 0) {
                return;
            }
            this.fJNWhG[0] = entryForIndex2.getX();
            this.fJNWhG[1] = entryForIndex2.getY();
            transformer.pointValuesToPixel(this.fJNWhG);
            if (this.mViewPortHandler.isInBoundsRight(this.fJNWhG[0]) && this.mViewPortHandler.isInBoundsLeft(this.fJNWhG[0]) && this.mViewPortHandler.isInBoundsY(this.fJNWhG[1])) {
                android.graphics.Bitmap bitmap2 = entryForIndex2.getY() >= 0.0f ? this.copydefault : this.KWHzl;
                if (bitmap2 == null || canvas == null) {
                    return;
                }
                float[] fArr2 = this.fJNWhG;
                canvas.drawBitmap(bitmap2, fArr2[0] - fDp2pxFloat$default, fArr2[1] - fDp2pxFloat$default, this.values);
            }
        }
    }

    public final void KWHzl() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        float fDp2pxFloat$default = this.AEQbTJ + C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        int i = (int) (((double) fDp2pxFloat$default) * 2.2d);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = this.fARcdN;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.fARcdN.setColor(iCopydefault);
        canvas.drawCircle(fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, this.fARcdN);
        this.fARcdN.setColor(this.AxsJAY);
        canvas.drawCircle(fDp2pxFloat$default, fDp2pxFloat$default, this.AEQbTJ, this.fARcdN);
        this.copydefault = bitmapCreateBitmap;
        android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i, i, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
        this.fARcdN.setStyle(style);
        this.fARcdN.setColor(iCopydefault);
        canvas2.drawCircle(fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, this.fARcdN);
        this.fARcdN.setColor(this.gEmmrt);
        canvas2.drawCircle(fDp2pxFloat$default, fDp2pxFloat$default, this.AEQbTJ, this.fARcdN);
        this.KWHzl = bitmapCreateBitmap2;
    }

    public final boolean AEQbTJ() {
        if (this.zsXlph < 0 || this.wlaJM < 0) {
            return false;
        }
        java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
        ILineDataSet iLineDataSet = C33129mqd.KWHzl((java.util.Collection) dataSets) ? (ILineDataSet) dataSets.get(0) : null;
        return iLineDataSet != null && iLineDataSet.getEntryCount() > this.zsXlph && iLineDataSet.getEntryCount() > this.wlaJM;
    }

    public final void OLrzqt(C46492tWi c46492tWi) {
        this.wlaJM = c46492tWi != null ? c46492tWi.EZpvd() : -1;
        java.lang.String strOLrzqt = c46492tWi != null ? c46492tWi.OLrzqt() : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        this.AuCTelauCTel = PlanetNumericString.AEQbTJ(strOLrzqt);
        this.zsXlph = c46492tWi != null ? c46492tWi.KWHzl() : -1;
        java.lang.String strCopydefault = c46492tWi != null ? c46492tWi.copydefault() : null;
        this.AubY = PlanetNumericString.AEQbTJ(strCopydefault != null ? strCopydefault : "");
        this.copydefault = null;
        this.KWHzl = null;
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        LineData lineData = this.mChart.getLineData();
        for (T t : lineData.getDataSets()) {
            if (t.isVisible() && t.isDrawFilledEnabled()) {
                Transformer transformer = this.mChart.getTransformer(t.getAxisDependency());
                this.mXBounds.set(this.mChart, t);
                Intrinsics.copydefault(transformer);
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                Intrinsics.checkNotNullExpressionValue(xBounds, "");
                OLrzqt(canvas, t, transformer, xBounds);
            }
        }
        AEQbTJ(canvas);
        for (T t2 : lineData.getDataSets()) {
            if (t2.isVisible()) {
                this.mRenderPaint.setStrokeWidth(t2.getLineWidth());
                AEQbTJ(canvas, t2);
            }
        }
        java.util.Iterator it = lineData.getDataSets().iterator();
        while (it.hasNext()) {
            if (((ILineDataSet) it.next()).isVisible()) {
                drawCircles(canvas);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final void AEQbTJ(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        ?? entryForIndex;
        iLineDataSet.getEntryCount();
        iLineDataSet.getMode();
        LineDataSet.Mode mode = LineDataSet.Mode.STEPPED;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        canvas.save();
        canvas.clipRect(this.EZpvd.getViewPortHandler().getContentRect());
        this.mXBounds.set(this.mChart, iLineDataSet);
        java.util.ArrayList<float[]> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        int i = xBounds.min;
        int i2 = xBounds.range;
        for (int i3 = i; i3 < i2 + i && i3 < iLineDataSet.getEntryCount() - 1; i3++) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3);
            if (entryForIndex2 != 0 && (entryForIndex = iLineDataSet.getEntryForIndex(i3 + 1)) != 0) {
                if ((entryForIndex2.getY() >= 0.0f && entryForIndex.getY() < 0.0f) || (entryForIndex2.getY() < 0.0f && entryForIndex.getY() >= 0.0f)) {
                    float x = entryForIndex2.getX() + ((entryForIndex2.getY() / (entryForIndex2.getY() - entryForIndex.getY())) * (entryForIndex.getX() - entryForIndex2.getX()));
                    float[] fArr = {entryForIndex2.getX(), entryForIndex2.getY() * phaseY, x, 0.0f};
                    if (entryForIndex2.getY() >= 0.0f) {
                        arrayList.add(fArr);
                    } else {
                        arrayList2.add(fArr);
                    }
                    float[] fArr2 = {x, 0.0f, entryForIndex.getX(), entryForIndex.getY() * phaseY};
                    if (entryForIndex.getY() >= 0.0f) {
                        arrayList.add(fArr2);
                    } else {
                        arrayList2.add(fArr2);
                    }
                } else {
                    ((entryForIndex2.getY() < 0.0f || entryForIndex.getY() < 0.0f) ? arrayList2 : arrayList).add(new float[]{entryForIndex2.getX(), entryForIndex2.getY() * phaseY, entryForIndex.getX(), entryForIndex.getY() * phaseY});
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.mRenderPaint.setColor(this.AxsJAY);
            for (float[] fArr3 : arrayList) {
                transformer.pointValuesToPixel(fArr3);
                if (iLineDataSet.getMode() == LineDataSet.Mode.HORIZONTAL_BEZIER) {
                    KWHzl(canvas, iLineDataSet, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                } else {
                    canvas.drawLine(fArr3[0], fArr3[1], fArr3[2], fArr3[3], this.mRenderPaint);
                    arrayList2 = arrayList2;
                }
            }
        }
        java.util.ArrayList<float[]> arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            this.mRenderPaint.setColor(this.gEmmrt);
            for (float[] fArr4 : arrayList3) {
                transformer.pointValuesToPixel(fArr4);
                if (iLineDataSet.getMode() == LineDataSet.Mode.HORIZONTAL_BEZIER) {
                    KWHzl(canvas, iLineDataSet, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                } else {
                    canvas.drawLine(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.mRenderPaint);
                }
            }
        }
        canvas.restore();
        this.mRenderPaint.setPathEffect(null);
    }

    private final void KWHzl(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, float f, float f2, float f3, float f4) {
        float cubicIntensity = (f3 - f) * iLineDataSet.getCubicIntensity();
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, f2);
        path.cubicTo(f + cubicIntensity, f2, f3 - cubicIntensity, f4, f3, f4);
        canvas.drawPath(path, this.mRenderPaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    private final void OLrzqt(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        android.graphics.drawable.Drawable drawable;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        ?? r9;
        android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable == null) {
            return;
        }
        float phaseY = this.mAnimator.getPhaseY();
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        if (xBounds.range <= 0) {
            return;
        }
        android.graphics.Path path = new android.graphics.Path();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(xBounds.min);
        if (entryForIndex == 0) {
            return;
        }
        IFillFormatter fillFormatter = iLineDataSet.getFillFormatter();
        float fillLinePosition = (fillFormatter != null ? fillFormatter.getFillLinePosition(iLineDataSet, this.mChart) : this.EZpvd.getAxisLeft().getAxisMinimum()) * phaseY;
        MPPointD pixelForValues = transformer.getPixelForValues(entryForIndex.getX(), fillLinePosition);
        path.moveTo((float) pixelForValues.x, (float) pixelForValues.y);
        MPPointD pixelForValues2 = transformer.getPixelForValues(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        path.lineTo((float) pixelForValues2.x, (float) pixelForValues2.y);
        int i3 = xBounds.min;
        int i4 = i3 + 1;
        int i5 = i3 + xBounds.range;
        if (i4 <= i5) {
            int i6 = i4;
            ?? r92 = entryForIndex;
            while (i6 < iLineDataSet.getEntryCount()) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i6);
                if (entryForIndex2 == 0) {
                    drawable = fillDrawable;
                    f2 = phaseY;
                    f3 = cubicIntensity;
                    i = i6;
                    i2 = i5;
                    f = fillLinePosition;
                    r9 = r92;
                } else {
                    MPPointD pixelForValues3 = transformer.getPixelForValues(r92.getX(), r92.getY() * phaseY);
                    MPPointD pixelForValues4 = transformer.getPixelForValues(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                    double d = pixelForValues3.x;
                    int i7 = i6;
                    double d2 = pixelForValues4.x;
                    drawable = fillDrawable;
                    f2 = phaseY;
                    double d3 = (d2 - d) * ((double) cubicIntensity);
                    f3 = cubicIntensity;
                    float f4 = (float) pixelForValues4.y;
                    i = i7;
                    i2 = i5;
                    f = fillLinePosition;
                    path.cubicTo((float) (d + d3), (float) pixelForValues3.y, (float) (d2 - d3), f4, (float) d2, f4);
                    r9 = entryForIndex2;
                }
                if (i == i2) {
                    break;
                }
                i6 = i + 1;
                fillLinePosition = f;
                i5 = i2;
                fillDrawable = drawable;
                phaseY = f2;
                cubicIntensity = f3;
                r92 = r9;
            }
            drawable = fillDrawable;
            f = fillLinePosition;
        } else {
            drawable = fillDrawable;
            f = fillLinePosition;
        }
        ?? entryForIndex3 = iLineDataSet.getEntryForIndex(java.lang.Math.min(xBounds.min + xBounds.range, iLineDataSet.getEntryCount() - 1));
        if (entryForIndex3 == 0) {
            return;
        }
        MPPointD pixelForValues5 = transformer.getPixelForValues(entryForIndex3.getX(), f);
        path.lineTo((float) pixelForValues5.x, (float) pixelForValues5.y);
        path.close();
        canvas.save();
        canvas.clipPath(path);
        RectF contentRect = this.mViewPortHandler.getContentRect();
        android.graphics.drawable.Drawable drawable2 = drawable;
        drawable2.setBounds((int) contentRect.left, (int) contentRect.top, (int) contentRect.right, (int) contentRect.bottom);
        drawable2.draw(canvas);
        canvas.restore();
    }

    private final void AEQbTJ(android.graphics.Canvas canvas) {
        RectF contentRect = this.EZpvd.getViewPortHandler().getContentRect();
        float[] fArr = {0.0f, 0.0f};
        this.mChart.getTransformer(YAxis.AxisDependency.LEFT).pointValuesToPixel(fArr);
        float f = fArr[1];
        canvas.drawLine(contentRect.left, f, contentRect.right, f, this.sSMYrx);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(@NotNull android.graphics.Canvas canvas, @NotNull Highlight[] highlightArr) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(highlightArr, "");
        LineData lineData = this.mChart.getLineData();
        RectF contentRect = this.EZpvd.getViewPortHandler().getContentRect();
        for (Highlight highlight : highlightArr) {
            T dataSetByIndex = lineData.getDataSetByIndex(highlight.getDataSetIndex());
            ILineDataSet iLineDataSet = dataSetByIndex instanceof ILineDataSet ? (ILineDataSet) dataSetByIndex : null;
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                Entry entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    float f = (float) pixelForValues.x;
                    float f2 = (float) pixelForValues.y;
                    canvas.drawLine(f, contentRect.top, f, contentRect.bottom, this.AhwBna);
                    canvas.drawLine(contentRect.left, f2, contentRect.right, f2, this.AhwBna);
                    EZpvd(canvas, f, f2, entryForXValue.getY());
                }
            }
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, float f, float f2, float f3) {
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        float fDp2pxFloat$default2 = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        this.fARcdN.setStyle(Paint.Style.FILL);
        android.graphics.Paint paint = this.fARcdN;
        int i = C52761wXj.Activity.DGgkXd;
        android.content.Context context = this.EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setColor(C33070mpX.OLrzqt(i, context));
        canvas.drawCircle(f, f2, fDp2pxFloat$default, this.fARcdN);
        this.fARcdN.setColor(f3 >= 0.0f ? this.AxsJAY : this.gEmmrt);
        canvas.drawCircle(f, f2, fDp2pxFloat$default2, this.fARcdN);
    }
}
