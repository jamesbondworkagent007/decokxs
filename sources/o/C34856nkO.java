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
import com.okinc.find_ui.data.KlineFundingRateData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34856nkO extends MarkerView {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final android.widget.TextView AhwBna;
    public int EZpvd;
    public Entry KWHzl;
    public final android.graphics.Paint OLrzqt;
    public Date copydefault;
    public final android.widget.TextView djBIcL;
    public final float gEmmrt;
    public final float valueOf;
    public final android.widget.TextView values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34856nkO(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.DCUTEI);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.values = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.djBIcL = (android.widget.TextView) findViewById(qZH.StateListAnimator.extraCommand);
        this.AhwBna = (android.widget.TextView) findViewById(qZH.StateListAnimator.newSession);
        this.gEmmrt = C55298xhM.EZpvd(4.0f, context);
        this.valueOf = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
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
        if (entry != null) {
            this.KWHzl = entry;
            if (Intrinsics.EZpvd(entry.getData(), (java.lang.Object) "")) {
                return;
            }
            java.lang.Object data = entry.getData();
            Intrinsics.copydefault(data, "");
            Date date = new Date(C33129mqd.valueOf(((KlineFundingRateData) data).getTs()));
            this.copydefault = date;
            android.widget.TextView textView = this.values;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.AhwBna;
            pTF ptf = pTF.KWHzl;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            textView2.setText(ptf.AEQbTJ(pTB.KWHzl(pTB.OLrzqt((java.lang.Object) ((KlineFundingRateData) data2).getRate()), 3, RoundingMode.HALF_UP)));
            java.lang.CharSequence text = this.AhwBna.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (StringsKt__StringsKt.contains$default(text, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                android.widget.TextView textView3 = this.AhwBna;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView3.setTextColor(C33508mxl.AEQbTJ(context));
                android.graphics.Paint paint = this.OLrzqt;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setColor(C33508mxl.AEQbTJ(context2));
            } else {
                android.widget.TextView textView4 = this.AhwBna;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView4.setTextColor(C33508mxl.copydefault(context3));
                android.graphics.Paint paint2 = this.OLrzqt;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                paint2.setColor(C33508mxl.copydefault(context4));
            }
            this.EZpvd = KWHzl();
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.getLayoutParams();
            layoutParams.width = this.EZpvd;
            this.AEQbTJ.setLayoutParams(layoutParams);
            super.refreshContent(entry, highlight);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = new MPPointF();
        Entry entry = this.KWHzl;
        if (entry != null) {
            Chart chartView = getChartView();
            Intrinsics.copydefault(chartView, "");
            LineChart lineChart = (LineChart) chartView;
            if (!Intrinsics.EZpvd(entry.getData(), (java.lang.Object) "")) {
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
                    mPPointF.x = (width - f) - C55298xhM.copydefault(18.0f, r2);
                } else {
                    mPPointF.x = (-f) + fCopydefault;
                }
                mPPointF.y = (-f2) + f3 + fOLrzqt;
            } else {
                mPPointF.x = C33129mqd.djBIcL(java.lang.Integer.valueOf(lineChart.getWidth()));
            }
        }
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Entry entry = this.KWHzl;
        if (entry != null && !Intrinsics.EZpvd(entry.getData(), (java.lang.Object) "")) {
            AEQbTJ(canvas, f, f2);
        }
        super.draw(canvas, f, f2);
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.gEmmrt, this.AYXKKw);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.OLrzqt);
        }
    }

    private final int KWHzl() {
        int measuredWidth = this.values.getMeasuredWidth();
        android.widget.TextView textView = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.AhwBna;
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
