package o;

import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34854nkM extends MarkerView implements InterfaceC34851nkJ {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public final android.widget.TextView AuCTel;
    public final float DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final android.graphics.Paint copydefault;
    public Highlight djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public MPPointF fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public java.lang.String getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final android.widget.TextView hDKMBd;
    public final float isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public int valueOf;
    public final android.graphics.Paint values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34851nkJ
    public void setResId(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34851nkJ
    public void setType(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34854nkM(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.OBJEWx);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.getNewProxyInstance = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.iwGUEr = (android.widget.TextView) findViewById(qZH.StateListAnimator.gxJrGF);
        this.fARcdN = (android.widget.TextView) findViewById(qZH.StateListAnimator.fhwtiV);
        this.uzCIH = (android.widget.TextView) findViewById(qZH.StateListAnimator.UlpNxW);
        this.hDKMBd = (android.widget.TextView) findViewById(qZH.StateListAnimator.sYOsaF);
        this.fJNWhG = (android.widget.TextView) findViewById(qZH.StateListAnimator.SePrCP);
        this.fIwbmz = (android.widget.TextView) findViewById(qZH.StateListAnimator.RZOtbZ);
        this.AuCTel = (android.widget.TextView) findViewById(qZH.StateListAnimator.SdSTJp);
        this.ejfBZ = (android.widget.TextView) findViewById(qZH.StateListAnimator.DdI);
        this.getFieldNames = "USDT";
        this.AkhnZx = qZH.PendingIntent.ORxRYg;
        this.isConnected = C55298xhM.EZpvd(4.0f, context);
        this.DbNXlk = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.values = paint2;
        this.valueOf = C33070mpX.copydefault(C52761wXj.Activity.RlQdEF);
        this.AYXKKw = C33070mpX.copydefault(C52761wXj.Activity.QKudOq);
        this.fetchVPNInfo = new MPPointF();
        this.AEQbTJ = C55298xhM.copydefault(22.0f, context);
        this.OLrzqt = C55298xhM.copydefault(2.0f, context);
        this.KWHzl = C55298xhM.copydefault(4.0f, context);
        this.EZpvd = C55298xhM.copydefault(8.0f, context);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C32113mPz.ActionBar.QKVWgx));
        paint2.setStyle(style);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        LineDataSet lineDataSet;
        LineDataSet lineDataSet2;
        LineDataSet lineDataSet3;
        java.lang.String strDivS$default;
        java.util.List<T> values;
        java.util.List<T> values2;
        java.util.List<T> values3;
        this.djBIcL = highlight;
        if (entry != null) {
            IDataSet dataSetByIndex = getChartView().getData().getDataSetByIndex(0);
            if (dataSetByIndex != null) {
                Intrinsics.copydefault(dataSetByIndex, "");
                lineDataSet = (LineDataSet) dataSetByIndex;
            } else {
                lineDataSet = null;
            }
            IDataSet dataSetByIndex2 = getChartView().getData().getDataSetByIndex(1);
            if (dataSetByIndex2 != null) {
                Intrinsics.copydefault(dataSetByIndex2, "");
                lineDataSet2 = (LineDataSet) dataSetByIndex2;
            } else {
                lineDataSet2 = null;
            }
            IDataSet dataSetByIndex3 = getChartView().getData().getDataSetByIndex(2);
            if (dataSetByIndex3 != null) {
                Intrinsics.copydefault(dataSetByIndex3, "");
                lineDataSet3 = (LineDataSet) dataSetByIndex3;
            } else {
                lineDataSet3 = null;
            }
            Entry entry2 = (lineDataSet2 == null || (values3 = lineDataSet2.getValues()) == 0) ? null : (Entry) values3.get((int) entry.getX());
            Entry entry3 = (lineDataSet3 == null || (values2 = lineDataSet3.getValues()) == 0) ? null : (Entry) values2.get((int) entry.getX());
            Entry entry4 = (lineDataSet == null || (values = lineDataSet.getValues()) == 0) ? null : (Entry) values.get((int) entry.getX());
            xMR xmr = xMR.copydefault;
            BigDecimal bigDecimalOLrzqt = xmr.OLrzqt(entry2 != null ? java.lang.Float.valueOf(entry2.getY()) : null);
            java.lang.String roundToFixed$default = pTB.formatRoundToFixed$default(bigDecimalOLrzqt, AEQbTJ(bigDecimalOLrzqt.doubleValue()), null, 2, null);
            BigDecimal bigDecimalOLrzqt2 = xmr.OLrzqt(entry3 != null ? java.lang.Float.valueOf(entry3.getY()) : null);
            java.lang.String roundToFixed$default2 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt2, AEQbTJ(bigDecimalOLrzqt2.doubleValue()), null, 2, null);
            BigDecimal bigDecimalOLrzqt3 = xmr.OLrzqt(entry4 != null ? java.lang.Float.valueOf(entry4.getY()) : null);
            java.lang.String roundToFixed$default3 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt3, AEQbTJ(bigDecimalOLrzqt3.doubleValue()), null, 2, null);
            java.lang.String strQUSxYX = Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "USD") ? ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX() : this.getFieldNames;
            this.fARcdN.setText(roundToFixed$default + " " + strQUSxYX);
            this.hDKMBd.setText(roundToFixed$default2 + " " + strQUSxYX);
            this.fIwbmz.setText(roundToFixed$default3 + " " + strQUSxYX);
            android.widget.TextView textView = this.ejfBZ;
            if (entry4 != null) {
                strDivS$default = C33129mqd.divS$default(java.lang.Float.valueOf(entry4.getY()), entry3 != null ? java.lang.Float.valueOf(entry3.getY()) : "", null, null, null, 14, null);
            } else {
                strDivS$default = null;
            }
            BigDecimal bigDecimalMultiply = xmr.OLrzqt((java.lang.Object) strDivS$default).multiply(new BigDecimal(100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            textView.setText(pTB.formatICUPercent$default(bigDecimalMultiply, RoundingMode.UP, C38307pTy.Companion.EZpvd(3), null, null, null, 28, null));
            this.getNewProxyInstance.setText(pTA.format$default(new Date(C33129mqd.valueOf(entry2 != null ? entry2.getData() : null)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
            this.AhwBna = AEQbTJ();
            ViewGroup.LayoutParams layoutParams = this.gEmmrt.getLayoutParams();
            layoutParams.width = this.AhwBna;
            this.gEmmrt.setLayoutParams(layoutParams);
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        LineChart lineChart = (LineChart) chartView;
        float requiredWidthSpace = lineChart.getAxisLeft().getRequiredWidthSpace(lineChart.getRendererLeftYAxis().getPaintAxisLabels());
        int i = lineChart.getXAxis().mLabelHeight;
        float f3 = requiredWidthSpace + this.OLrzqt;
        float requiredWidthSpace2 = lineChart.getAxisRight().getRequiredWidthSpace(lineChart.getRendererRightYAxis().getPaintAxisLabels());
        float f4 = this.KWHzl;
        int i2 = this.EZpvd;
        if (f - f3 < getWidth()) {
            this.fetchVPNInfo.x = ((lineChart.getWidth() - getWidth()) - f) - (requiredWidthSpace2 - f4);
        } else {
            this.fetchVPNInfo.x = (-f) + f3;
        }
        MPPointF mPPointF = this.fetchVPNInfo;
        mPPointF.y = (-f2) + i + i2;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Highlight highlight;
        try {
            android.view.ViewParent chartView = getChartView();
            if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && (highlight = this.djBIcL) != null) {
                IDataSet dataSetByIndex = getChartView().getData().getDataSetByIndex(1);
                Intrinsics.copydefault(dataSetByIndex, "");
                LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
                java.util.List<T> values = lineDataSet.getValues();
                Entry entry = values != 0 ? (Entry) values.get((int) highlight.getX()) : null;
                if (entry != null) {
                    MPPointD pixelForValues = ((BarLineScatterCandleBubbleDataProvider) chartView).getTransformer(lineDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
                    copydefault(canvas, (float) pixelForValues.x, (float) pixelForValues.y, this.valueOf);
                }
                IDataSet dataSetByIndex2 = getChartView().getData().getDataSetByIndex(2);
                Intrinsics.copydefault(dataSetByIndex2, "");
                LineDataSet lineDataSet2 = (LineDataSet) dataSetByIndex2;
                java.util.List<T> values2 = lineDataSet2.getValues();
                Entry entry2 = values2 != 0 ? (Entry) values2.get((int) highlight.getX()) : null;
                if (entry2 != null) {
                    MPPointD pixelForValues2 = ((BarLineScatterCandleBubbleDataProvider) chartView).getTransformer(lineDataSet2.getAxisDependency()).getPixelForValues(entry2.getX(), entry2.getY());
                    copydefault(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, this.AYXKKw);
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineFuturesBasisMarkerView", java.lang.String.valueOf(e.getMessage()));
        }
        super.draw(canvas, f, f2);
    }

    public final void copydefault(android.graphics.Canvas canvas, float f, float f2, int i) {
        this.copydefault.setColor(i);
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.isConnected, this.values);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.DbNXlk, this.copydefault);
        }
    }

    private final int AEQbTJ() {
        int measuredWidth = this.getNewProxyInstance.getMeasuredWidth();
        android.widget.TextView textView = this.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        android.widget.TextView textView3 = this.uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        float textSize$default3 = C35140nph.getTextSize$default(textView3, 0.0f, 2, null);
        android.widget.TextView textView4 = this.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        float textSize$default4 = textSize$default3 + C35140nph.getTextSize$default(textView4, 0.0f, 2, null);
        android.widget.TextView textView5 = this.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        float textSize$default5 = C35140nph.getTextSize$default(textView5, 0.0f, 2, null);
        android.widget.TextView textView6 = this.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        float textSize$default6 = textSize$default5 + C35140nph.getTextSize$default(textView6, 0.0f, 2, null);
        android.widget.TextView textView7 = this.AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        float textSize$default7 = C35140nph.getTextSize$default(textView7, 0.0f, 2, null);
        android.widget.TextView textView8 = this.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        float textSize$default8 = textSize$default7 + C35140nph.getTextSize$default(textView8, 0.0f, 2, null);
        if (measuredWidth < textSize$default2) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default2));
        }
        if (measuredWidth < textSize$default4) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default4));
        }
        if (measuredWidth < textSize$default6) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default6));
        }
        if (measuredWidth < textSize$default8) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default8));
        }
        return measuredWidth + this.AEQbTJ;
    }

    private final int AEQbTJ(double d) {
        return C54573xNj.copydefault.AEQbTJ(d);
    }
}
