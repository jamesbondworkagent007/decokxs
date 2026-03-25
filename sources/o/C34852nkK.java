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
import com.okinc.find_ui.data.BuySellBean;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34852nkK extends MarkerView {
    public Date AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final float AhwBna;
    public Highlight EZpvd;
    public final android.graphics.Paint KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public int copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final float gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34852nkK(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.getPostValueLengthLimit);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.isConnected = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.djBIcL = (android.widget.TextView) findViewById(qZH.StateListAnimator.Srftgn);
        this.valueOf = (android.widget.TextView) findViewById(qZH.StateListAnimator.ibrGus);
        this.values = (android.widget.TextView) findViewById(qZH.StateListAnimator.onExtraCallback);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(qZH.StateListAnimator.IPostMessageServiceStub);
        this.gEmmrt = C55298xhM.EZpvd(4.0f, context);
        this.AhwBna = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AYXKKw = paint2;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.EZpvd = highlight;
        if (entry != null) {
            java.lang.Object data = entry.getData();
            Intrinsics.copydefault(data, "");
            Date date = new Date(C33129mqd.valueOf(((BuySellBean) data).getTs()));
            this.AEQbTJ = date;
            android.widget.TextView textView = this.isConnected;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.valueOf;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            textView2.setText(((BuySellBean) data2).getBuyVol());
            android.widget.TextView textView3 = this.fetchVPNInfo;
            java.lang.Object data3 = entry.getData();
            Intrinsics.copydefault(data3, "");
            textView3.setText(((BuySellBean) data3).getSellVol());
            this.copydefault = copydefault();
            ViewGroup.LayoutParams layoutParams = this.OLrzqt.getLayoutParams();
            layoutParams.width = this.copydefault;
            this.OLrzqt.setLayoutParams(layoutParams);
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = new MPPointF();
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        LineChart lineChart = (LineChart) chartView;
        float requiredWidthSpace = lineChart.getAxisLeft().getRequiredWidthSpace(lineChart.getRendererLeftYAxis().getPaintAxisLabels());
        int i = lineChart.getXAxis().mLabelHeight;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        float fCopydefault = requiredWidthSpace + C55298xhM.copydefault(2.0f, r5);
        float f3 = i;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fOLrzqt = C55298xhM.OLrzqt(8.0f, context);
        if (f - fCopydefault < getWidth()) {
            float width = lineChart.getWidth() - getWidth();
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            mPPointF.x = (width - f) - C55298xhM.copydefault(18.0f, r3);
        } else {
            mPPointF.x = (-f) + fCopydefault;
        }
        mPPointF.y = (-f2) + f3 + fOLrzqt;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Entry entry;
        Entry entry2;
        android.view.ViewParent chartView = getChartView();
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && this.EZpvd != null) {
            IDataSet dataSetByIndex = getChartView().getData().getDataSetByIndex(0);
            Intrinsics.copydefault(dataSetByIndex, "");
            LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
            java.util.List<T> values = lineDataSet.getValues();
            if (values != 0) {
                Highlight highlight = this.EZpvd;
                Intrinsics.copydefault(highlight);
                entry = (Entry) values.get((int) highlight.getX());
            } else {
                entry = null;
            }
            if (entry != null) {
                MPPointD pixelForValues = ((BarLineScatterCandleBubbleDataProvider) chartView).getTransformer(lineDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
                copydefault(canvas, (float) pixelForValues.x, (float) pixelForValues.y, C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null));
            }
            IDataSet dataSetByIndex2 = getChartView().getData().getDataSetByIndex(1);
            Intrinsics.copydefault(dataSetByIndex2, "");
            LineDataSet lineDataSet2 = (LineDataSet) dataSetByIndex2;
            java.util.List<T> values2 = lineDataSet2.getValues();
            if (values2 != 0) {
                Highlight highlight2 = this.EZpvd;
                Intrinsics.copydefault(highlight2);
                entry2 = (Entry) values2.get((int) highlight2.getX());
            } else {
                entry2 = null;
            }
            if (entry2 != null) {
                MPPointD pixelForValues2 = ((BarLineScatterCandleBubbleDataProvider) chartView).getTransformer(lineDataSet2.getAxisDependency()).getPixelForValues(entry2.getX(), entry2.getY());
                copydefault(canvas, (float) pixelForValues2.x, (float) pixelForValues2.y, C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null));
            }
        }
        super.draw(canvas, f, f2);
    }

    private final void copydefault(android.graphics.Canvas canvas, float f, float f2, int i) {
        this.KWHzl.setColor(i);
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.gEmmrt, this.AYXKKw);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AhwBna, this.KWHzl);
        }
    }

    private final int copydefault() {
        int measuredWidth = this.isConnected.getMeasuredWidth();
        android.widget.TextView textView = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        android.widget.TextView textView3 = this.values;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        float textSize$default3 = C35140nph.getTextSize$default(textView3, 0.0f, 2, null);
        android.widget.TextView textView4 = this.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        float textSize$default4 = textSize$default3 + C35140nph.getTextSize$default(textView4, 0.0f, 2, null);
        if (measuredWidth < textSize$default2) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default2));
        }
        if (measuredWidth < textSize$default4) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default4));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return measuredWidth + C55298xhM.copydefault(22.0f, context);
    }
}
