package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.find_ui.data.LongShortRatioData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34853nkL extends MarkerView {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public Date EZpvd;
    public java.lang.String KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final android.graphics.Path copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSymbol(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34853nkL(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.ffGIBT);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.isConnected = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.gEmmrt = (android.widget.TextView) findViewById(qZH.StateListAnimator.DkIxYv);
        this.djBIcL = (android.widget.TextView) findViewById(qZH.StateListAnimator.UvfnWv);
        this.AYXKKw = (android.widget.TextView) findViewById(qZH.StateListAnimator.IPostMessageServiceStubProxy);
        this.AhwBna = (android.widget.TextView) findViewById(qZH.StateListAnimator.IPostMessageServiceDefault);
        this.OLrzqt = new android.graphics.Paint();
        this.copydefault = new android.graphics.Path();
        this.KWHzl = "";
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        if (entry != null) {
            java.lang.Object data = entry.getData();
            Intrinsics.copydefault(data, "");
            Date date = new Date(C33129mqd.valueOf(((LongShortRatioData) data).getTs()));
            this.EZpvd = date;
            android.widget.TextView textView = this.isConnected;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.djBIcL;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(((LongShortRatioData) data2).getLongAmt());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            C38307pTy.Application application = C38307pTy.Companion;
            textView2.setText(pTB.formatICUCompact$default(bigDecimalEZpvd, roundingMode, application.AEQbTJ(2), null, null, 12, null) + " " + this.KWHzl);
            android.widget.TextView textView3 = this.AhwBna;
            java.lang.Object data3 = entry.getData();
            Intrinsics.copydefault(data3, "");
            textView3.setText(pTB.formatICUCompact$default(C33129mqd.EZpvd(((LongShortRatioData) data3).getShortAmt()), roundingMode, application.AEQbTJ(2), null, null, 12, null) + " " + this.KWHzl);
            this.valueOf = EZpvd();
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.getLayoutParams();
            layoutParams.width = this.valueOf;
            this.AEQbTJ.setLayoutParams(layoutParams);
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = new MPPointF();
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        BarChart barChart = (BarChart) chartView;
        float requiredWidthSpace = barChart.getAxisLeft().getRequiredWidthSpace(barChart.getRendererLeftYAxis().getPaintAxisLabels());
        int i = barChart.getXAxis().mLabelHeight;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        float fCopydefault = requiredWidthSpace + C55298xhM.copydefault(2.0f, r5);
        float f3 = i;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fOLrzqt = C55298xhM.OLrzqt(8.0f, context);
        if (f - fCopydefault < getWidth()) {
            float width = barChart.getWidth() - getWidth();
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
        OLrzqt(f, f2);
        if (canvas != null) {
            canvas.drawPath(this.copydefault, this.OLrzqt);
        }
        super.draw(canvas, f, f2);
    }

    public final void OLrzqt(float f, float f2) {
        android.graphics.Paint paint = this.OLrzqt;
        paint.setColor(getResources().getColor(C52761wXj.Activity.dXcUrg));
        paint.setStyle(Paint.Style.STROKE);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint.setStrokeWidth(C55298xhM.copydefault(0.5f, r0));
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        BarChart barChart = (BarChart) chartView;
        float height = barChart.getHeight();
        float f3 = barChart.getXAxis().mLabelHeight;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fOLrzqt = C55298xhM.OLrzqt(15.0f, context);
        float f4 = barChart.getXAxis().mLabelHeight;
        android.graphics.Path path = this.copydefault;
        path.reset();
        path.moveTo(f, (height - f3) - fOLrzqt);
        path.lineTo(f, f4);
        this.OLrzqt.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
    }

    private final int EZpvd() {
        int measuredWidth = this.isConnected.getMeasuredWidth();
        android.widget.TextView textView = this.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        android.widget.TextView textView3 = this.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        float textSize$default3 = C35140nph.getTextSize$default(textView3, 0.0f, 2, null);
        android.widget.TextView textView4 = this.AhwBna;
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
