package o;

import android.view.View;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27229jrJ extends LineChart {
    public ActionBar AEQbTJ;
    public float KWHzl;
    public final C27419juo copydefault;

    /* JADX INFO: renamed from: o.jrJ$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public interface ActionBar {
        void AEQbTJ(kotlin.Pair<java.lang.Float, java.lang.Float> pair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectCallback(ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27229jrJ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1.0f;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.copydefault = new C27419juo(c27569jxf.AEQbTJ(context2), C25493ixk.StateListAnimator.AuCTel, C25493ixk.StateListAnimator.fIwbmz, C25493ixk.StateListAnimator.fetchVPNInfo, C25493ixk.StateListAnimator.ejfBZ, C25493ixk.StateListAnimator.fARcdN, C25493ixk.StateListAnimator.values);
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27229jrJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1.0f;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.copydefault = new C27419juo(c27569jxf.AEQbTJ(context2), C25493ixk.StateListAnimator.AuCTel, C25493ixk.StateListAnimator.fIwbmz, C25493ixk.StateListAnimator.fetchVPNInfo, C25493ixk.StateListAnimator.ejfBZ, C25493ixk.StateListAnimator.fARcdN, C25493ixk.StateListAnimator.values);
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27229jrJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1.0f;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.copydefault = new C27419juo(c27569jxf.AEQbTJ(context2), C25493ixk.StateListAnimator.AuCTel, C25493ixk.StateListAnimator.fIwbmz, C25493ixk.StateListAnimator.fetchVPNInfo, C25493ixk.StateListAnimator.ejfBZ, C25493ixk.StateListAnimator.fARcdN, C25493ixk.StateListAnimator.values);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setDragEnabled(true);
        setDoubleTapToZoomEnabled(false);
        setPinchZoom(false);
        getAxisLeft().setEnabled(false);
        getAxisRight().setEnabled(false);
        getXAxis().setEnabled(false);
        getAxisLeft().setDrawGridLines(false);
        setScaleEnabled(false);
        setMinOffset(0.0f);
        C27419juo c27419juo = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        c27419juo.KWHzl(C55298xhM.copydefault(40.0f, r1));
        setMarker(c27419juo);
        this.copydefault.KWHzl(this);
        setOnChartValueSelectedListener(new StateListAnimator());
        setOnChartGestureListener(new Application());
        setOnTouchListener(new View.OnTouchListener() { // from class: o.jrK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C27229jrJ.EZpvd(this.KWHzl, view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: o.jrJ$StateListAnimator */
    public static final class StateListAnimator implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public StateListAnimator() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            ActionBar actionBar;
            if (entry == null || (actionBar = C27229jrJ.this.AEQbTJ) == null) {
                return;
            }
            actionBar.AEQbTJ(new kotlin.Pair<>(java.lang.Float.valueOf(entry.getX()), java.lang.Float.valueOf(entry.getY())));
        }
    }

    /* JADX INFO: renamed from: o.jrJ$Application */
    public static final class Application implements OnChartGestureListener {
        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        public Application() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            if (motionEvent != null) {
                C27229jrJ c27229jrJ = C27229jrJ.this;
                c27229jrJ.highlightValue(c27229jrJ.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            C27229jrJ.this.highlightValue(null);
            ActionBar actionBar = C27229jrJ.this.AEQbTJ;
            if (actionBar != null) {
                actionBar.AEQbTJ(null);
            }
        }
    }

    public static final boolean EZpvd(C27229jrJ c27229jrJ, android.view.View view, android.view.MotionEvent motionEvent) {
        c27229jrJ.requestDisallowInterceptTouchEvent(motionEvent.getAction() != 1);
        return false;
    }

    public final void setChartData(@NotNull java.util.List<? extends Entry> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list.size() > 1 ? list.get(1).getX() - list.get(0).getX() : 1.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LineDataSet lineDataSet = new LineDataSet(list, "");
        int i = C52761wXj.ActionBar.DNMMPQ;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(C55366xib.KWHzl(i, c27569jxf.AEQbTJ(context)));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setDrawCircles(false);
        arrayList.add(lineDataSet);
        LineData lineData = new LineData(arrayList);
        lineData.setDrawValues(false);
        setData(lineData);
    }
}
