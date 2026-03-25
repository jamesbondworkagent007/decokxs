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
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.KlineFundingRateData;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53019wdb extends MarkerView {
    public Date AEQbTJ;
    public final float AYXKKw;
    public final android.graphics.Paint AhwBna;
    public int EZpvd;
    public final android.graphics.Paint KWHzl;
    public Entry OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final float valueOf;
    public final android.widget.TextView values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53019wdb(@NotNull android.content.Context context) {
        super(context, C48033uCm.Activity.Th);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = (android.widget.LinearLayout) findViewById(C48033uCm.Application.getLong);
        this.values = (android.widget.TextView) findViewById(C48033uCm.Application.detect);
        this.gEmmrt = (android.widget.TextView) findViewById(C48033uCm.Application.onInterceptTouchEvent);
        this.djBIcL = (android.widget.TextView) findViewById(C48033uCm.Application.isOutOfBounds);
        this.valueOf = C55298xhM.EZpvd(4.0f, context);
        this.AYXKKw = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AhwBna = paint2;
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
            this.OLrzqt = entry;
            if (Intrinsics.EZpvd(entry.getData(), (java.lang.Object) "")) {
                return;
            }
            java.lang.Object data = entry.getData();
            Intrinsics.copydefault(data, "");
            Date date = new Date(C33129mqd.valueOf(((KlineFundingRateData) data).getTs()));
            this.AEQbTJ = date;
            android.widget.TextView textView = this.values;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.djBIcL;
            pTF ptf = pTF.KWHzl;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            textView2.setText(ptf.AEQbTJ(pTB.KWHzl(pTB.OLrzqt((java.lang.Object) ((KlineFundingRateData) data2).getRate()), 3, RoundingMode.HALF_UP)));
            java.lang.CharSequence text = this.djBIcL.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (StringsKt__StringsKt.contains$default(text, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                android.widget.TextView textView3 = this.djBIcL;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView3.setTextColor(C33508mxl.AEQbTJ(context));
                android.graphics.Paint paint = this.KWHzl;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setColor(C33508mxl.AEQbTJ(context2));
            } else {
                android.widget.TextView textView4 = this.djBIcL;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView4.setTextColor(C33508mxl.copydefault(context3));
                android.graphics.Paint paint2 = this.KWHzl;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                paint2.setColor(C33508mxl.copydefault(context4));
            }
            this.EZpvd = OLrzqt();
            ViewGroup.LayoutParams layoutParams = this.copydefault.getLayoutParams();
            layoutParams.width = this.EZpvd;
            this.copydefault.setLayoutParams(layoutParams);
            super.refreshContent(entry, highlight);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = new MPPointF();
        Entry entry = this.OLrzqt;
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
        Entry entry = this.OLrzqt;
        if (entry != null && !Intrinsics.EZpvd(entry.getData(), (java.lang.Object) "")) {
            copydefault(canvas, f, f2);
        }
        super.draw(canvas, f, f2);
    }

    private final void copydefault(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.AhwBna);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AYXKKw, this.KWHzl);
        }
    }

    private final int OLrzqt() {
        int measuredWidth = this.values.getMeasuredWidth();
        android.widget.TextView textView = this.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = getTextSize$default(this, textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + getTextSize$default(this, textView2, 0.0f, 2, null);
        if (measuredWidth < textSize$default2) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default2));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return measuredWidth + C55298xhM.copydefault(22.0f, context);
    }

    public static /* synthetic */ float getTextSize$default(C53019wdb c53019wdb, android.widget.TextView textView, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        return c53019wdb.KWHzl(textView, f);
    }

    public final float KWHzl(@NotNull android.widget.TextView textView, float f) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.text.TextPaint paint = textView.getPaint();
        paint.setTextSize(C55298xhM.sp2pxFloat$default(f, null, 1, null));
        return paint.measureText(C33129mqd.gEmmrt(textView.getText()));
    }
}
