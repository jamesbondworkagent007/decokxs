package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.find_ui.data.ContractLongShortRatioData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C38307pTy;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34857nkP extends MarkerView {
    public final android.graphics.Paint AEQbTJ;
    public int AYXKKw;
    public final float AhwBna;
    public Date EZpvd;
    public final android.graphics.Paint KWHzl;
    public final C42680raw OLrzqt;
    public final android.graphics.Path copydefault;
    public final android.graphics.Paint gEmmrt;
    public final float valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34857nkP(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.zuWLRA);
        Intrinsics.checkNotNullParameter(context, "");
        C42680raw c42680rawKWHzl = C42680raw.KWHzl(findViewById(qZH.StateListAnimator.RFmUsE));
        Intrinsics.checkNotNullExpressionValue(c42680rawKWHzl, "");
        this.OLrzqt = c42680rawKWHzl;
        this.AEQbTJ = new android.graphics.Paint();
        this.copydefault = new android.graphics.Path();
        this.AhwBna = C55298xhM.EZpvd(4.0f, context);
        this.valueOf = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.gEmmrt = paint2;
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
            ContractLongShortRatioData contractLongShortRatioData = data instanceof ContractLongShortRatioData ? (ContractLongShortRatioData) data : null;
            if (contractLongShortRatioData != null) {
                Date date = new Date(C33129mqd.valueOf(contractLongShortRatioData.getTs()));
                this.EZpvd = date;
                android.widget.TextView textView = this.OLrzqt.djBIcL;
                java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                if (str == null) {
                    str = "--";
                }
                textView.setText(str);
                android.widget.TextView textView2 = this.OLrzqt.OLrzqt;
                BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) contractLongShortRatioData.getLongPercent());
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                C38307pTy.Application application = C38307pTy.Companion;
                textView2.setText(pTB.formatICUPercent$default(bigDecimalOLrzqt, roundingMode, application.AEQbTJ(2), null, null, null, 28, null));
                this.OLrzqt.AYXKKw.setText(pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) contractLongShortRatioData.getShortPercent()), roundingMode, application.AEQbTJ(2), null, null, null, 28, null));
                this.OLrzqt.copydefault.setText(pTB.formatICUCompact$default(new BigDecimal(contractLongShortRatioData.getRatio()), roundingMode, application.AEQbTJ(2), null, null, 12, null));
                this.AYXKKw = OLrzqt();
                ViewGroup.LayoutParams layoutParams = this.OLrzqt.AEQbTJ.getLayoutParams();
                layoutParams.width = this.AYXKKw;
                this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams);
            }
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = new MPPointF();
        Chart chartView = getChartView();
        CombinedChart combinedChart = chartView instanceof CombinedChart ? (CombinedChart) chartView : null;
        if (combinedChart == null) {
            return mPPointF;
        }
        float requiredWidthSpace = combinedChart.getAxisLeft().getRequiredWidthSpace(combinedChart.getRendererLeftYAxis().getPaintAxisLabels());
        int i = combinedChart.getXAxis().mLabelHeight;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        float fCopydefault = requiredWidthSpace + C55298xhM.copydefault(2.0f, r4);
        float f3 = i;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fOLrzqt = C55298xhM.OLrzqt(8.0f, context);
        if (f - fCopydefault < getWidth()) {
            float width = combinedChart.getWidth() - getWidth();
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            mPPointF.x = (width - f) - C55298xhM.copydefault(18.0f, r2);
        } else {
            mPPointF.x = (-f) + fCopydefault;
        }
        mPPointF.y = (-f2) + f3 + fOLrzqt;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        EZpvd(f, f2);
        if (canvas != null) {
            canvas.drawPath(this.copydefault, this.AEQbTJ);
        }
        AEQbTJ(canvas, f, f2);
        super.draw(canvas, f, f2);
    }

    private final void EZpvd(float f, float f2) {
        android.graphics.Paint paint = this.AEQbTJ;
        paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.dXcUrg));
        paint.setStyle(Paint.Style.STROKE);
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint.setStrokeWidth(C55298xhM.copydefault(0.5f, r0));
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        CombinedChart combinedChart = (CombinedChart) chartView;
        float height = combinedChart.getHeight();
        float f3 = combinedChart.getXAxis().mLabelHeight;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fOLrzqt = C55298xhM.OLrzqt(33.0f, context);
        float f4 = combinedChart.getXAxis().mLabelHeight;
        android.graphics.Path path = this.copydefault;
        path.reset();
        path.moveTo(f, (height - f3) - fOLrzqt);
        path.lineTo(f, f4);
        this.AEQbTJ.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AhwBna, this.gEmmrt);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.KWHzl);
        }
    }

    private final int OLrzqt() {
        int measuredWidth = this.OLrzqt.djBIcL.getMeasuredWidth();
        android.widget.TextView textView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        android.widget.TextView textView3 = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        float textSize$default3 = C35140nph.getTextSize$default(textView3, 0.0f, 2, null);
        android.widget.TextView textView4 = this.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        float textSize$default4 = textSize$default3 + C35140nph.getTextSize$default(textView4, 0.0f, 2, null);
        android.widget.TextView textView5 = this.OLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        float textSize$default5 = C35140nph.getTextSize$default(textView5, 0.0f, 2, null);
        android.widget.TextView textView6 = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        float textSize$default6 = textSize$default5 + C35140nph.getTextSize$default(textView6, 0.0f, 2, null);
        if (measuredWidth < textSize$default2) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default2));
        }
        if (measuredWidth < textSize$default4) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default4));
        }
        if (measuredWidth < textSize$default6) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default6));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return measuredWidth + C55298xhM.copydefault(22.0f, context);
    }
}
