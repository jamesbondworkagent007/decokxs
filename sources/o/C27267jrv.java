package o;

import android.view.View;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27267jrv extends BarChart {
    public float KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27267jrv(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1.0000001E-9f;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27267jrv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1.0000001E-9f;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27267jrv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1.0000001E-9f;
        AEQbTJ();
    }

    private final void AEQbTJ() {
        setDrawBarShadow(false);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setFitBars(true);
        setDragEnabled(false);
        setDoubleTapToZoomEnabled(false);
        setPinchZoom(false);
        getAxisLeft().setEnabled(false);
        getAxisRight().setEnabled(false);
        getXAxis().setEnabled(false);
        getXAxis().setDrawLabels(false);
        getXAxis().setDrawGridLines(false);
        setScaleEnabled(false);
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setScaleYEnabled(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: o.jrw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C27267jrv.KWHzl(this.KWHzl, view, motionEvent);
            }
        });
    }

    public static final boolean KWHzl(C27267jrv c27267jrv, android.view.View view, android.view.MotionEvent motionEvent) {
        c27267jrv.requestDisallowInterceptTouchEvent(motionEvent.getAction() != 1);
        return false;
    }

    public final void setChartData(@NotNull java.util.List<? extends BarEntry> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        BarDataSet barDataSet = new BarDataSet(list, "");
        barDataSet.setColor(i);
        barDataSet.setBarBorderWidth(0.0f);
        arrayList.add(barDataSet);
        ChartAnimator chartAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(chartAnimator, "");
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C27223jrD(this, chartAnimator, viewPortHandler));
        BarData barData = new BarData(arrayList);
        barData.setBarWidth(this.KWHzl);
        barData.setDrawValues(false);
        setData(barData);
    }

    public final void KWHzl() {
        setRenderer(null);
        setData(null);
        setOnTouchListener((ChartTouchListener) null);
    }
}
