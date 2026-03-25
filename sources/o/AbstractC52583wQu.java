package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC52583wQu extends MarkerView {
    public final java.lang.String AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final float AhwBna;
    public final MPPointF EZpvd;
    public Highlight KWHzl;
    public Entry OLrzqt;
    public final android.graphics.Paint copydefault;
    public final float djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final PointF valueOf;
    public final android.widget.ImageView values;

    public abstract android.view.View EZpvd(@NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointF KWHzl() {
        return this.valueOf;
    }

    public abstract java.util.ArrayList<java.lang.Integer> copydefault();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC52583wQu(@NotNull android.content.Context context) {
        super(context, C48033uCm.Activity.Ohcwxs);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = "optionsLog markerView";
        android.view.View viewFindViewById = findViewById(C48033uCm.Application.setDrawerIndicatorEnabled);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.values = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(C48033uCm.Application.onDrawerSlide);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.gEmmrt = (android.widget.ImageView) viewFindViewById2;
        this.valueOf = new PointF();
        this.djBIcL = C33052mpF.AEQbTJ(6.0f, context);
        this.AhwBna = C33052mpF.AEQbTJ(4.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AYXKKw = paint2;
        android.view.View viewFindViewById3 = findViewById(C48033uCm.Application.zFtALg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        EZpvd((android.view.ViewGroup) viewFindViewById3);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C32113mPz.ActionBar.QKVWgx));
        paint2.setStyle(style);
        this.EZpvd = new MPPointF();
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.OLrzqt = entry;
        this.KWHzl = highlight;
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            AEQbTJ(this.values, highlight.getDrawX(), getMeasuredWidth());
            AEQbTJ(this.gEmmrt, highlight.getDrawX(), getMeasuredWidth());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private final void AEQbTJ(android.widget.ImageView imageView, float f, int i) {
        Chart chartView = getChartView();
        if (chartView instanceof PieChart) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = (int) ((i / 2.0f) - (r5.width / 2));
            return;
        }
        float f2 = i;
        float f3 = f2 / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (f < f3) {
            layoutParams3.leftMargin = (int) (f - (layoutParams3.width / 2));
        } else if (chartView != null && f + f3 > chartView.getWidth()) {
            layoutParams3.leftMargin = (int) ((f2 - (chartView.getWidth() - f)) - (layoutParams3.width / 2));
        } else {
            layoutParams3.leftMargin = (int) (f3 - (layoutParams3.width / 2));
        }
    }

    public static /* synthetic */ int getThemeColor$default(AbstractC52583wQu abstractC52583wQu, android.content.Context context, boolean z, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getThemeColor");
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return abstractC52583wQu.EZpvd(context, z, f);
    }

    public final int EZpvd(@NotNull android.content.Context context, boolean z, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            return C33512mxp.AEQbTJ.zLjUOn(context, f);
        }
        return C33512mxp.AEQbTJ.isConnected(context, f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Chart chartView = getChartView();
        Entry entry = this.OLrzqt;
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (java.lang.Object obj : copydefault()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if (iIntValue != 0) {
                    android.graphics.Paint paint = this.copydefault;
                    java.lang.Object data = entry.getData();
                    java.lang.Integer numValueOf = null;
                    StrategyProfitResponse strategyProfitResponse = data instanceof StrategyProfitResponse ? (StrategyProfitResponse) data : null;
                    if (strategyProfitResponse != null) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyProfitResponse.getTotalPnl())) {
                            android.content.Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            numValueOf = java.lang.Integer.valueOf(getThemeColor$default(this, context, C33129mqd.copydefault(strategyProfitResponse.getTotalPnl(), "0"), 0.0f, 4, null));
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        }
                    }
                    paint.setColor(iIntValue);
                    C43296rmc.AEQbTJ("posTest", "posX " + f + " posY " + f2);
                    AEQbTJ(canvas, f, f2);
                }
                i++;
            }
        }
        PointF pointF = this.valueOf;
        pointF.x = f;
        pointF.y = f2;
        super.draw(canvas, f, f2);
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        int iAEQbTJ = C33570myu.AEQbTJ();
        Highlight highlight = this.KWHzl;
        int i = iAEQbTJ / 2;
        if (C33129mqd.AEQbTJ(highlight != null ? java.lang.Float.valueOf(highlight.getDrawX()) : null, java.lang.Integer.valueOf(i))) {
            if (canvas != null) {
                canvas.drawCircle(300 + f, f2, this.djBIcL, this.AYXKKw);
            }
            if (canvas != null) {
                canvas.drawCircle(f + 300, f2, this.AhwBna, this.copydefault);
                return;
            }
            return;
        }
        Highlight highlight2 = this.KWHzl;
        if (C33129mqd.gEmmrt(highlight2 != null ? java.lang.Float.valueOf(highlight2.getDrawX()) : null, java.lang.Integer.valueOf(i))) {
            if (canvas != null) {
                canvas.drawCircle(f - 300, f2, this.djBIcL, this.AYXKKw);
            }
            if (canvas != null) {
                canvas.drawCircle(f - 300, f2, this.AhwBna, this.copydefault);
                return;
            }
            return;
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.djBIcL, this.AYXKKw);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AhwBna, this.copydefault);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        MPPointF offset = super.getOffset();
        Intrinsics.checkNotNullExpressionValue(offset, "");
        return offset;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        this.EZpvd.x = OLrzqt(f);
        this.EZpvd.y = KWHzl(f2);
        return this.EZpvd;
    }

    private final float OLrzqt(float f) {
        int width = getWidth() / 2;
        Chart chartView = getChartView();
        float width2 = width;
        if (f < width2) {
            return -f;
        }
        if (chartView != null && f + width2 > chartView.getWidth()) {
            width2 = getWidth() - (chartView.getWidth() - f);
        }
        return -width2;
    }

    private final float KWHzl(float f) {
        if (getChartView() != null && f < r0.getHeight() - f) {
            this.gEmmrt.setVisibility(8);
            this.values.setVisibility(8);
            return this.djBIcL;
        }
        this.gEmmrt.setVisibility(8);
        this.values.setVisibility(8);
        return -(getHeight() + this.djBIcL);
    }
}
