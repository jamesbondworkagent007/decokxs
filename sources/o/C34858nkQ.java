package o;

import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.find_ui.data.LongShortRatioData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34858nkQ extends MarkerView {
    public Date AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final float AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.graphics.Paint KWHzl;
    public int OLrzqt;
    public final android.graphics.Paint copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final float valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34858nkQ(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.RKDWNf);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.gEmmrt = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.AYXKKw = (android.widget.TextView) findViewById(qZH.StateListAnimator.validateRelationship);
        this.djBIcL = (android.widget.TextView) findViewById(qZH.StateListAnimator.postMessage);
        this.valueOf = C55298xhM.EZpvd(4.0f, context);
        this.AhwBna = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.KWHzl = paint2;
        paint.setAntiAlias(true);
        paint.setColor(context.getColor(C32113mPz.ActionBar.zLjUOn));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        if (entry != null) {
            java.lang.Object data = entry.getData();
            Intrinsics.copydefault(data, "");
            Date date = new Date(C33129mqd.valueOf(((LongShortRatioData) data).getTs()));
            this.AEQbTJ = date;
            android.widget.TextView textView = this.gEmmrt;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.djBIcL;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            textView2.setText(((LongShortRatioData) data2).getRatio());
            this.OLrzqt = OLrzqt();
            ViewGroup.LayoutParams layoutParams = this.EZpvd.getLayoutParams();
            layoutParams.width = this.OLrzqt;
            this.EZpvd.setLayoutParams(layoutParams);
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
        copydefault(canvas, f, f2);
        super.draw(canvas, f, f2);
    }

    private final void copydefault(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.KWHzl);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AhwBna, this.copydefault);
        }
    }

    private final int OLrzqt() {
        int measuredWidth = this.gEmmrt.getMeasuredWidth();
        android.widget.TextView textView = this.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        if (measuredWidth < textSize$default2) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default2));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return measuredWidth + C55298xhM.copydefault(22.0f, context);
    }
}
