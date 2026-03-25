package o;

import android.graphics.Bitmap;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48024uCd extends LineChartRenderer {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public android.graphics.Bitmap AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final android.graphics.Paint AuCTel;
    public final int AuCTelauCTel;
    public int AubY;
    public final android.graphics.Paint AwvSrB;
    public final int AxsJAY;
    public final android.graphics.Paint DbNXlk;
    public final float EZpvd;
    public final float OLrzqt;
    public final LineChart copydefault;
    public android.graphics.Bitmap djBIcL;
    public final android.graphics.Paint ejfBZ;
    public final float[] fARcdN;
    public final android.graphics.Paint fIwbmz;
    public final android.graphics.Paint fJNWhG;
    public final InterfaceC48026uCf fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public final float getFieldNames;
    public final float getNewProxyInstance;
    public final float hDKMBd;
    public final android.graphics.Paint isConnected;
    public final float iwGUEr;
    public final int sSMYrx;
    public final android.graphics.Paint uzCIH;
    public final int valueOf;
    public boolean values;
    public java.lang.String wlaJM;
    public java.lang.String zLjUOn;
    public int zsXlph;
    public final int zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ(boolean z) {
        return z ? this.AxsJAY : this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint KWHzl(boolean z) {
        return z ? this.ejfBZ : this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(boolean z) {
        return z ? this.sSMYrx : this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48024uCd(@NotNull LineChart lineChart, int i, @NotNull InterfaceC48026uCf interfaceC48026uCf) {
        super(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler());
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(interfaceC48026uCf, "");
        this.copydefault = lineChart;
        this.fetchVPNInfo = interfaceC48026uCf;
        this.zsXlph = -1;
        this.AubY = -1;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.uzCIH = paint;
        this.zLjUOn = "";
        this.wlaJM = "";
        this.fARcdN = new float[2];
        this.values = true;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        this.AxsJAY = iTradeRiseGraph$default;
        android.content.Context context2 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.AYXKKw = C33512mxp.tradeFallGraph$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.sSMYrx = C33512mxp.tradeRiseDefault$default(c33512mxp, context3, 0.0f, 2, null);
        android.content.Context context4 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.AhwBna = C33512mxp.tradeFallDefault$default(c33512mxp, context4, 0.0f, 2, null);
        android.content.Context context5 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        int iZLjUOn = c33512mxp.zLjUOn(context5, 0.3f);
        this.zuBGHE = iZLjUOn;
        android.content.Context context6 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        int iIsConnected = c33512mxp.isConnected(context6, 0.3f);
        this.valueOf = iIsConnected;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.AwvSrB = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.gEmmrt = paint3;
        android.graphics.Paint paint4 = this.mRenderPaint;
        Intrinsics.checkNotNullExpressionValue(paint4, "");
        this.DbNXlk = paint4;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(C55298xhM.dp2pxFloat$default(10.0f, null, 1, null));
        paint.setTypeface(C55051xce.OLrzqt.valueOf());
        this.AuCTelauCTel = C55298xhM.dp2px$default(2.0f, null, 1, null);
        this.getNewProxyInstance = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.iwGUEr = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.hDKMBd = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
        this.EZpvd = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        this.OLrzqt = 0.0f;
        this.getFieldNames = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        android.graphics.Paint paint5 = new android.graphics.Paint(1);
        this.isConnected = paint5;
        paint5.setColor(i);
        android.graphics.Paint paint6 = new android.graphics.Paint(1);
        this.ejfBZ = paint6;
        paint6.setColor(iZLjUOn);
        android.graphics.Paint paint7 = new android.graphics.Paint(1);
        this.fJNWhG = paint7;
        paint7.setColor(iIsConnected);
        android.graphics.Paint paint8 = new android.graphics.Paint(1);
        this.AkhnZx = paint8;
        paint8.setColor(i);
        android.graphics.Paint paint9 = new android.graphics.Paint(1);
        this.AuCTel = paint9;
        paint9.setColor(i);
        android.graphics.Paint paint10 = new android.graphics.Paint(1);
        this.fIwbmz = paint10;
        paint10.setStyle(Paint.Style.FILL);
        paint2.setColor(iTradeRiseGraph$default);
        paint2.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        paint2.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setPathEffect(new DashPathEffect(new float[]{C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)}, 0.0f));
        int i2 = C52761wXj.Activity.ORxRYg;
        android.content.Context context7 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        paint3.setColor(C33070mpX.OLrzqt(i2, context7));
        paint3.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setPathEffect(new DashPathEffect(new float[]{C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)}, 0.0f));
        paint4.setStrokeWidth(C55298xhM.dp2pxFloat$default(2.0f, null, 1, null));
        paint4.setAntiAlias(true);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint4.setStyle(style);
    }

    /* JADX INFO: renamed from: o.uCd$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.uCd$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;
        public final float copydefault;
        public final float gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, float f, float f2, java.lang.String str, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                f = taskDescription.copydefault;
            }
            if ((i2 & 2) != 0) {
                f2 = taskDescription.gEmmrt;
            }
            float f3 = f2;
            if ((i2 & 4) != 0) {
                str = taskDescription.KWHzl;
            }
            java.lang.String str2 = str;
            if ((i2 & 8) != 0) {
                i = taskDescription.AEQbTJ;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                z = taskDescription.EZpvd;
            }
            boolean z3 = z;
            if ((i2 & 32) != 0) {
                z2 = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(f, f3, str2, i3, z3, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(float f, float f2, @NotNull java.lang.String str, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(f, f2, str, i, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return java.lang.Float.compare(this.copydefault, taskDescription.copydefault) == 0 && java.lang.Float.compare(this.gEmmrt, taskDescription.gEmmrt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && this.AEQbTJ == taskDescription.AEQbTJ && this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((java.lang.Float.hashCode(this.copydefault) * 31) + java.lang.Float.hashCode(this.gEmmrt)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MarkerInfo(x=" + this.copydefault + ", y=" + this.gEmmrt + ", text=" + this.KWHzl + ", textWidth=" + this.AEQbTJ + ", isPositive=" + this.EZpvd + ", isMax=" + this.OLrzqt + ")";
        }

        public TaskDescription(float f, float f2, @NotNull java.lang.String str, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = f;
            this.gEmmrt = f2;
            this.KWHzl = str;
            this.AEQbTJ = i;
            this.EZpvd = z;
            this.OLrzqt = z2;
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        TaskDescription taskDescriptionOLrzqt;
        super.drawValues(canvas);
        if (!OLrzqt() || canvas == null) {
            return;
        }
        java.lang.Object obj = this.mChart.getLineData().getDataSets().get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        ILineDataSet iLineDataSet = (ILineDataSet) obj;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        int i = (int) (this.EZpvd * 1.75f);
        this.mXBounds.set(this.mChart, iLineDataSet);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
        if (fArrGenerateTransformedValuesLine.length < 3) {
            return;
        }
        float f = fArrGenerateTransformedValuesLine[0];
        Intrinsics.copydefault(fArrGenerateTransformedValuesLine);
        float f2 = fArrGenerateTransformedValuesLine[yDV.valueOf(fArrGenerateTransformedValuesLine) - 1];
        TaskDescription taskDescriptionOLrzqt2 = OLrzqt(this.AubY, this.wlaJM, fArrGenerateTransformedValuesLine, iLineDataSet, true);
        if (taskDescriptionOLrzqt2 == null || (taskDescriptionOLrzqt = OLrzqt(this.zsXlph, this.zLjUOn, fArrGenerateTransformedValuesLine, iLineDataSet, false)) == null) {
            return;
        }
        EZpvd(canvas, taskDescriptionOLrzqt2, i, f, f2, true);
        EZpvd(canvas, taskDescriptionOLrzqt, i, f, f2, false);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final TaskDescription OLrzqt(int i, java.lang.String str, float[] fArr, ILineDataSet iLineDataSet, boolean z) {
        int i2 = (i - this.mXBounds.min) * 2;
        if (i2 < 0 || i2 >= fArr.length) {
            return null;
        }
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
        java.lang.String strEZpvd = this.fetchVPNInfo.EZpvd(str, this.values);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.uzCIH.getTextBounds(strEZpvd, 0, strEZpvd.length(), rect);
        return new TaskDescription(fArr[i2], fArr[i2 + 1], strEZpvd, rect.width(), entryForIndex != 0 && entryForIndex.getY() >= 0.0f, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.graphics.Canvas canvas, TaskDescription taskDescription, int i, float f, float f2, boolean z) {
        float f3;
        int iOLrzqt;
        kotlin.Pair pairOLrzqt;
        float fAEQbTJ = taskDescription.AEQbTJ();
        float fOLrzqt = (fAEQbTJ - (taskDescription.OLrzqt() / 2)) - this.getNewProxyInstance;
        float fOLrzqt2 = taskDescription.OLrzqt() / 2;
        float f4 = this.getNewProxyInstance;
        float f5 = fOLrzqt2 + fAEQbTJ + f4;
        if (f5 > f2) {
            f5 = f2 + this.getFieldNames;
            float fOLrzqt3 = taskDescription.OLrzqt();
            float f6 = this.getNewProxyInstance;
            fOLrzqt = ((f5 - f4) - fOLrzqt3) - f6;
            f3 = f6 + fOLrzqt;
            iOLrzqt = taskDescription.OLrzqt() / 2;
        } else {
            if (fOLrzqt < f) {
                fOLrzqt = f - this.getFieldNames;
                float fOLrzqt4 = taskDescription.OLrzqt();
                float f7 = this.getNewProxyInstance;
                f5 = f4 + fOLrzqt + fOLrzqt4 + f7;
                f3 = f7 + fOLrzqt;
                iOLrzqt = taskDescription.OLrzqt() / 2;
            }
            if (!z) {
                float fEZpvd = (taskDescription.EZpvd() - i) - this.AuCTelauCTel;
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(fEZpvd - this.hDKMBd), java.lang.Float.valueOf(fEZpvd));
            } else {
                float fEZpvd2 = taskDescription.EZpvd() + i + this.AuCTelauCTel;
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(fEZpvd2), java.lang.Float.valueOf(this.hDKMBd + fEZpvd2));
            }
            float fFloatValue = ((java.lang.Number) pairOLrzqt.component1()).floatValue();
            RectF rectF = new RectF(fOLrzqt, fFloatValue, f5, ((java.lang.Number) pairOLrzqt.component2()).floatValue());
            android.graphics.Paint paintKWHzl = KWHzl(taskDescription.copydefault());
            float f8 = this.iwGUEr;
            canvas.drawRoundRect(rectF, f8, f8, paintKWHzl);
            int iCopydefault = copydefault(taskDescription.copydefault());
            Paint.FontMetrics fontMetrics = this.uzCIH.getFontMetrics();
            float f9 = fontMetrics.descent;
            float f10 = fontMetrics.ascent;
            float f11 = (this.hDKMBd - (f9 - f10)) / 2;
            this.uzCIH.setColor(iCopydefault);
            canvas.drawText(taskDescription.KWHzl(), fAEQbTJ, (fFloatValue + f11) - f10, this.uzCIH);
        }
        fAEQbTJ = f3 + iOLrzqt;
        if (!z) {
        }
        float fFloatValue2 = ((java.lang.Number) pairOLrzqt.component1()).floatValue();
        RectF rectF2 = new RectF(fOLrzqt, fFloatValue2, f5, ((java.lang.Number) pairOLrzqt.component2()).floatValue());
        android.graphics.Paint paintKWHzl2 = KWHzl(taskDescription.copydefault());
        float f82 = this.iwGUEr;
        canvas.drawRoundRect(rectF2, f82, f82, paintKWHzl2);
        int iCopydefault2 = copydefault(taskDescription.copydefault());
        Paint.FontMetrics fontMetrics2 = this.uzCIH.getFontMetrics();
        float f92 = fontMetrics2.descent;
        float f102 = fontMetrics2.ascent;
        float f112 = (this.hDKMBd - (f92 - f102)) / 2;
        this.uzCIH.setColor(iCopydefault2);
        canvas.drawText(taskDescription.KWHzl(), fAEQbTJ, (fFloatValue2 + f112) - f102, this.uzCIH);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCircles(android.graphics.Canvas canvas) {
        super.drawCircles(canvas);
        if (!OLrzqt() || canvas == null || this.mAnimator.getPhaseX() < 0.8f) {
            return;
        }
        java.lang.Object obj = this.mChart.getLineData().getDataSets().get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        ILineDataSet iLineDataSet = (ILineDataSet) obj;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        if (this.djBIcL == null || this.AEQbTJ == null) {
            EZpvd();
        }
        float fDp2pxFloat$default = this.EZpvd + C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        Intrinsics.copydefault(transformer);
        AEQbTJ(canvas, iLineDataSet, transformer, this.AubY, fDp2pxFloat$default, this.AkhnZx);
        AEQbTJ(canvas, iLineDataSet, transformer, this.zsXlph, fDp2pxFloat$default, this.AuCTel);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final void AEQbTJ(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, int i, float f, android.graphics.Paint paint) {
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
        if (entryForIndex == 0) {
            return;
        }
        this.fARcdN[0] = entryForIndex.getX();
        this.fARcdN[1] = entryForIndex.getY();
        transformer.pointValuesToPixel(this.fARcdN);
        float[] fArr = this.fARcdN;
        if (copydefault(fArr[0], fArr[1])) {
            android.graphics.Bitmap bitmap = entryForIndex.getY() >= 0.0f ? this.djBIcL : this.AEQbTJ;
            if (bitmap != null) {
                float[] fArr2 = this.fARcdN;
                canvas.drawBitmap(bitmap, fArr2[0] - f, fArr2[1] - f, paint);
            }
        }
    }

    public final boolean copydefault(float f, float f2) {
        return this.mViewPortHandler.isInBoundsRight(f) && this.mViewPortHandler.isInBoundsLeft(f) && this.mViewPortHandler.isInBoundsY(f2);
    }

    private final void EZpvd() {
        this.djBIcL = KWHzl(this.AxsJAY);
        this.AEQbTJ = KWHzl(this.AYXKKw);
    }

    public final android.graphics.Bitmap KWHzl(int i) {
        float fDp2pxFloat$default = this.EZpvd + C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        int i2 = (int) (((double) fDp2pxFloat$default) * 2.2d);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        this.fIwbmz.setStyle(Paint.Style.FILL);
        this.fIwbmz.setColor(iCopydefault);
        canvas.drawCircle(fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, this.fIwbmz);
        this.fIwbmz.setColor(i);
        canvas.drawCircle(fDp2pxFloat$default, fDp2pxFloat$default, this.EZpvd, this.fIwbmz);
        return bitmapCreateBitmap;
    }

    private final boolean OLrzqt() {
        if (this.AubY < 0 || this.zsXlph < 0) {
            return false;
        }
        java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
        ILineDataSet iLineDataSet = C33129mqd.KWHzl((java.util.Collection) dataSets) ? (ILineDataSet) dataSets.get(0) : null;
        return iLineDataSet != null && iLineDataSet.getEntryCount() > this.AubY && iLineDataSet.getEntryCount() > this.zsXlph;
    }

    public final void KWHzl(C48023uCc c48023uCc) {
        this.zsXlph = c48023uCc != null ? c48023uCc.EZpvd() : -1;
        java.lang.String strKWHzl = c48023uCc != null ? c48023uCc.KWHzl() : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        this.zLjUOn = strKWHzl;
        this.AubY = c48023uCc != null ? c48023uCc.copydefault() : -1;
        java.lang.String strOLrzqt = c48023uCc != null ? c48023uCc.OLrzqt() : null;
        this.wlaJM = strOLrzqt != null ? strOLrzqt : "";
        this.djBIcL = null;
        this.AEQbTJ = null;
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
                EZpvd(canvas, t, transformer, xBounds);
            }
        }
        copydefault(canvas);
        for (T t2 : lineData.getDataSets()) {
            if (t2.isVisible()) {
                this.mRenderPaint.setStrokeWidth(t2.getLineWidth());
                KWHzl(canvas, t2);
            }
        }
        java.util.Iterator it = lineData.getDataSets().iterator();
        while (it.hasNext()) {
            if (((ILineDataSet) it.next()).isVisible()) {
                drawCircles(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0135, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0139, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0143, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        Intrinsics.checkNotNullExpressionValue(transformer, "");
        float phaseY = this.mAnimator.getPhaseY();
        int entryCount = iLineDataSet.getEntryCount();
        if (entryCount < 2) {
            return;
        }
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        android.graphics.Path path = new android.graphics.Path();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(0);
        MPPointD pixelForValues = transformer.getPixelForValues(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        path.moveTo((float) pixelForValues.x, (float) pixelForValues.y);
        int i = 1;
        while (i < entryCount) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i - 1);
            ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i);
            MPPointD pixelForValues2 = transformer.getPixelForValues(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
            MPPointD pixelForValues3 = transformer.getPixelForValues(entryForIndex3.getX(), entryForIndex3.getY() * phaseY);
            double d = pixelForValues2.x;
            android.graphics.Path path2 = path;
            double d2 = pixelForValues3.x;
            int i2 = entryCount;
            double d3 = (d2 - d) * ((double) cubicIntensity);
            float f = (float) pixelForValues3.y;
            path2.cubicTo((float) (d + d3), (float) pixelForValues2.y, (float) (d2 - d3), f, (float) d2, f);
            i++;
            path = path2;
            phaseY = phaseY;
            entryCount = i2;
        }
        android.graphics.Path path3 = path;
        float[] fArr = {0.0f, 0.0f};
        transformer.pointValuesToPixel(fArr);
        float f2 = fArr[1];
        RectF contentRect = this.mViewPortHandler.getContentRect();
        float fDp2pxFloat$default = f2 + C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        RectF rectF = new RectF(contentRect.left, contentRect.top, contentRect.right, fDp2pxFloat$default);
        RectF rectF2 = new RectF(contentRect.left, fDp2pxFloat$default, contentRect.right, contentRect.bottom);
        float fWidth = contentRect.width();
        float phaseX = this.mAnimator.getPhaseX();
        float f3 = contentRect.left;
        RectF rectF3 = new RectF(f3, contentRect.top, (fWidth * phaseX) + f3, contentRect.bottom);
        this.DbNXlk.setStyle(Paint.Style.STROKE);
        int iSave = canvas.save();
        canvas.clipRect(rectF3);
        try {
            iSave = canvas.save();
            canvas.clipRect(rectF);
            this.DbNXlk.setColor(this.AxsJAY);
            canvas.drawPath(path3, this.DbNXlk);
            canvas.restoreToCount(iSave);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            canvas.clipRect(rectF3);
            try {
                iSave = canvas.save();
                canvas.clipRect(rectF2);
                this.DbNXlk.setColor(this.AYXKKw);
                canvas.drawPath(path3, this.DbNXlk);
                canvas.restoreToCount(iSave);
            } finally {
            }
        } finally {
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCubicFill(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, android.graphics.Path path, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        super.drawCubicFill(canvas, iLineDataSet, path, transformer, xBounds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    private final void EZpvd(android.graphics.Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
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
        float fillLinePosition = (fillFormatter != null ? fillFormatter.getFillLinePosition(iLineDataSet, this.mChart) : this.copydefault.getAxisLeft().getAxisMinimum()) * phaseY;
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
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            RectF contentRect = this.mViewPortHandler.getContentRect();
            android.graphics.drawable.Drawable drawable2 = drawable;
            drawable2.setBounds((int) contentRect.left, (int) contentRect.top, (int) contentRect.right, (int) contentRect.bottom);
            drawable2.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final void copydefault(android.graphics.Canvas canvas) {
        RectF contentRect = this.copydefault.getViewPortHandler().getContentRect();
        float[] fArr = {0.0f, 0.0f};
        this.mChart.getTransformer(YAxis.AxisDependency.LEFT).pointValuesToPixel(fArr);
        float f = fArr[1];
        canvas.drawLine(contentRect.left, f, contentRect.right, f, this.AwvSrB);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(@NotNull android.graphics.Canvas canvas, @NotNull Highlight[] highlightArr) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(highlightArr, "");
        LineData lineData = this.mChart.getLineData();
        RectF contentRect = this.copydefault.getViewPortHandler().getContentRect();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                Entry entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    float f = (float) pixelForValues.x;
                    float f2 = (float) pixelForValues.y;
                    canvas.drawLine(f, contentRect.top, f, contentRect.bottom, this.gEmmrt);
                    canvas.drawLine(contentRect.left, f2, contentRect.right, f2, this.gEmmrt);
                    KWHzl(canvas, f, f2, entryForXValue.getY());
                }
            }
        }
    }

    private final void KWHzl(android.graphics.Canvas canvas, float f, float f2, float f3) {
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        float fDp2pxFloat$default2 = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        this.fIwbmz.setStyle(Paint.Style.FILL);
        android.graphics.Paint paint = this.fIwbmz;
        int i = C52761wXj.Activity.DGgkXd;
        android.content.Context context = this.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setColor(C33070mpX.OLrzqt(i, context));
        canvas.drawCircle(f, f2, fDp2pxFloat$default, this.fIwbmz);
        this.fIwbmz.setColor(AEQbTJ(f3 >= 0.0f));
        canvas.drawCircle(f, f2, fDp2pxFloat$default2, this.fIwbmz);
    }
}
