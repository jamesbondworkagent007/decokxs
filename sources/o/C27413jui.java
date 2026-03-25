package o;

import android.view.View;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27411jug;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27413jui extends LineChart {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public StateListAnimator EZpvd;
    public int OLrzqt;
    public boolean copydefault;
    public InterfaceC27423jus gEmmrt;
    public C27422jur valueOf;

    /* JADX INFO: renamed from: o.jui$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(InvestKLineDataPoint investKLineDataPoint, Highlight highlight);
    }

    /* JADX INFO: renamed from: o.jui$TaskDescription */
    public static class TaskDescription implements OnChartGestureListener {
        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectCallback(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    /* JADX INFO: renamed from: o.jui$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jui.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final LineDataSet KWHzl(java.util.List<? extends Entry> list, @androidx.annotation.ColorInt int i) {
            LineDataSet lineDataSet = new LineDataSet(list, "");
            lineDataSet.setVisible(true);
            lineDataSet.setDrawIcons(false);
            lineDataSet.setColor(i);
            lineDataSet.setLineWidth(3.0f);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawFilled(false);
            lineDataSet.setDrawVerticalHighlightIndicator(false);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSet.setHighlightEnabled(true);
            return lineDataSet;
        }

        public final java.util.List<Entry> copydefault(java.util.List<InvestKLineDataPoint> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (InvestKLineDataPoint investKLineDataPoint : list) {
                arrayList.add(new Entry(investKLineDataPoint.EZpvd(), investKLineDataPoint.KWHzl(), investKLineDataPoint));
            }
            return arrayList;
        }
    }

    public final void setStyle(@NotNull InterfaceC27423jus interfaceC27423jus) {
        Intrinsics.checkNotNullParameter(interfaceC27423jus, "");
        this.gEmmrt = interfaceC27423jus;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27419juo c27419juo = new C27419juo(c27569jxf.AEQbTJ(context), interfaceC27423jus.AYXKKw(), interfaceC27423jus.copydefault(), interfaceC27423jus.KWHzl(), interfaceC27423jus.OLrzqt(), interfaceC27423jus.AEQbTJ(), interfaceC27423jus.EZpvd());
        c27419juo.KWHzl(this);
        setMarker(c27419juo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27413jui(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C27421juq.copydefault;
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27413jui(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C27421juq.copydefault;
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27413jui(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C27421juq.copydefault;
        KWHzl();
    }

    public final int OLrzqt(boolean z) {
        InterfaceC27423jus interfaceC27423jus = this.gEmmrt;
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return interfaceC27423jus.EZpvd(context);
        }
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return interfaceC27423jus.KWHzl(c27569jxf.AEQbTJ(context2));
    }

    public final int KWHzl(boolean z) {
        InterfaceC27423jus interfaceC27423jus = this.gEmmrt;
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return interfaceC27423jus.copydefault(context);
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return interfaceC27423jus.OLrzqt(context2);
    }

    private final int copydefault() {
        InterfaceC27423jus interfaceC27423jus = this.gEmmrt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return interfaceC27423jus.AEQbTJ(context);
    }

    private final void KWHzl() {
        C27411jug.StateListAnimator stateListAnimator = C27411jug.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        stateListAnimator.KWHzl(context, this, null);
        setStyle(C27421juq.copydefault);
        setHighlighter(new C27414juj(this));
        ChartAnimator chartAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(chartAnimator, "");
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C27418jun(this, chartAnimator, viewPortHandler));
        setOnTouchListener(new View.OnTouchListener() { // from class: o.jue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C27413jui.OLrzqt(this.copydefault, view, motionEvent);
            }
        });
        setOnChartGestureListener(new Application());
        setOnChartValueSelectedListener(new ActionBar());
    }

    public static final boolean OLrzqt(C27413jui c27413jui, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            c27413jui.requestDisallowInterceptTouchEvent(false);
        } else {
            c27413jui.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.jui$Application */
    public static final class Application extends TaskDescription {
        public Application() {
        }

        @Override // o.C27413jui.TaskDescription, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            C27413jui.this.EZpvd(true, null);
            StateListAnimator stateListAnimator = C27413jui.this.EZpvd;
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(null, null);
            }
        }

        @Override // o.C27413jui.TaskDescription, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            if (motionEvent != null) {
                C27413jui c27413jui = C27413jui.this;
                c27413jui.EZpvd(false, c27413jui.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
            }
        }
    }

    /* JADX INFO: renamed from: o.jui$ActionBar */
    public static final class ActionBar implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public ActionBar() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            StateListAnimator stateListAnimator;
            java.lang.Object data = entry != null ? entry.getData() : null;
            InvestKLineDataPoint investKLineDataPoint = data instanceof InvestKLineDataPoint ? (InvestKLineDataPoint) data : null;
            if (investKLineDataPoint != null && (stateListAnimator = C27413jui.this.EZpvd) != null) {
                stateListAnimator.AEQbTJ(investKLineDataPoint, highlight);
            }
            C27579jxp.copydefault.AEQbTJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.AEQbTJ = (int) motionEvent.getRawX();
            this.OLrzqt = (int) motionEvent.getRawY();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.copydefault = false;
        } else if (action == 2) {
            if (java.lang.Math.abs(motionEvent.getRawX() - this.AEQbTJ) > java.lang.Math.abs(motionEvent.getRawY() - this.OLrzqt) || this.copydefault) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.copydefault = true;
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 3) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setChartData(@NotNull C23949iPh c23949iPh, float f) {
        Intrinsics.checkNotNullParameter(c23949iPh, "");
        DataRenderer renderer = getRenderer();
        C27418jun c27418jun = renderer instanceof C27418jun ? (C27418jun) renderer : null;
        if (c27418jun != null) {
            c27418jun.copydefault((int) (255 * f));
        }
        C27422jur c27422jur = new C27422jur(KWHzl(c23949iPh.copydefault()), AEQbTJ(c23949iPh.EZpvd()), OLrzqt(c23949iPh.AEQbTJ()), f);
        this.valueOf = c27422jur;
        setData(c27422jur.AEQbTJ());
        animateX(300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z, Highlight highlight) {
        boolean z2 = !z;
        C27422jur c27422jur = this.valueOf;
        if (c27422jur != null) {
            c27422jur.copydefault(OLrzqt(z2));
            c27422jur.KWHzl(KWHzl(z2));
            c27422jur.AEQbTJ(copydefault());
        }
        highlightValue(highlight, true);
    }

    public final java.util.List<LineDataSet> KWHzl(java.util.List<? extends java.util.List<InvestKLineDataPoint>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            Activity activity = Companion;
            arrayList.add(activity.KWHzl(activity.copydefault(list2), OLrzqt(false)));
        }
        return arrayList;
    }

    public final java.util.List<LineDataSet> AEQbTJ(java.util.List<? extends java.util.List<InvestKLineDataPoint>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            Activity activity = Companion;
            arrayList.add(activity.KWHzl(activity.copydefault(list2), KWHzl(false)));
        }
        return arrayList;
    }

    public final java.util.List<LineDataSet> OLrzqt(java.util.List<? extends java.util.List<InvestKLineDataPoint>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            Activity activity = Companion;
            arrayList.add(activity.KWHzl(activity.copydefault(list2), copydefault()));
        }
        return arrayList;
    }
}
