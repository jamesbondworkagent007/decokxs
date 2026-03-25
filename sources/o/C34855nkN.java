package o;

import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.find_ui.data.VolumeBean;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34855nkN extends MarkerView {
    public final android.graphics.Paint AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public MPPointF AhwBna;
    public final android.widget.TextView DbNXlk;
    public Date EZpvd;
    public final android.graphics.Paint KWHzl;
    public int OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final float gEmmrt;
    public final android.widget.TextView isConnected;
    public final float valueOf;
    public final android.widget.TextView values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34855nkN(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.QkdxfA);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.values = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.djBIcL = (android.widget.TextView) findViewById(qZH.StateListAnimator.OYuSWK);
        this.AYXKKw = (android.widget.TextView) findViewById(qZH.StateListAnimator.UNDaji);
        this.DbNXlk = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi214);
        this.isConnected = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi217);
        this.valueOf = C55298xhM.EZpvd(4.0f, context);
        this.gEmmrt = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AEQbTJ = paint2;
        this.AhwBna = new MPPointF();
        paint.setAntiAlias(true);
        paint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
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
            Date date = new Date(C33129mqd.valueOf(((VolumeBean) data).getTs()));
            this.EZpvd = date;
            android.widget.TextView textView = this.values;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.AYXKKw;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            textView2.setText(((VolumeBean) data2).getOi());
            android.widget.TextView textView3 = this.isConnected;
            java.lang.Object data3 = entry.getData();
            Intrinsics.copydefault(data3, "");
            textView3.setText(((VolumeBean) data3).getVol());
            this.OLrzqt = AEQbTJ();
            ViewGroup.LayoutParams layoutParams = this.copydefault.getLayoutParams();
            layoutParams.width = this.OLrzqt;
            this.copydefault.setLayoutParams(layoutParams);
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        CombinedChart combinedChart = (CombinedChart) chartView;
        float requiredWidthSpace = combinedChart.getAxisLeft().getRequiredWidthSpace(combinedChart.getRendererLeftYAxis().getPaintAxisLabels());
        int i = combinedChart.getXAxis().mLabelHeight;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        float fCopydefault = requiredWidthSpace + C55298xhM.copydefault(2.0f, r4);
        float requiredWidthSpace2 = combinedChart.getAxisRight().getRequiredWidthSpace(combinedChart.getRendererRightYAxis().getPaintAxisLabels());
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fCopydefault2 = C55298xhM.copydefault(4.0f, context);
        float f3 = i;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fOLrzqt = C55298xhM.OLrzqt(8.0f, context2);
        if (f - fCopydefault < getWidth()) {
            this.AhwBna.x = ((combinedChart.getWidth() - getWidth()) - f) - (requiredWidthSpace2 - fCopydefault2);
        } else {
            this.AhwBna.x = (-f) + fCopydefault;
        }
        MPPointF mPPointF = this.AhwBna;
        mPPointF.y = (-f2) + f3 + fOLrzqt;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        AEQbTJ(canvas, f, f2);
        super.draw(canvas, f, f2);
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.AEQbTJ);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.gEmmrt, this.KWHzl);
        }
    }

    private final int AEQbTJ() {
        int measuredWidth = this.values.getMeasuredWidth();
        android.widget.TextView textView = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        android.widget.TextView textView3 = this.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        float textSize$default3 = C35140nph.getTextSize$default(textView3, 0.0f, 2, null);
        android.widget.TextView textView4 = this.isConnected;
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
