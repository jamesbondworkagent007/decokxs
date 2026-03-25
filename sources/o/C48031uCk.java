package o;

import android.graphics.Paint;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C52761wXj;
import o.C59462zhW;
import o.uBT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48031uCk extends LineChart {
    public InterfaceC48026uCf AhwBna;
    public boolean EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public java.util.List<C48032uCl> OLrzqt;
    public C48029uCi copydefault;
    public C48024uCd djBIcL;
    public C48023uCc gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48031uCk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48031uCk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isDoubleTapToZoomEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isPinchZoomEnabled() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:59) call: o.uCk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C48031uCk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48031uCk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C48023uCc.Companion.copydefault();
        this.EZpvd = true;
        this.AhwBna = InterfaceC48026uCf.Companion.KWHzl();
        this.OLrzqt = yDY.AhwBna();
        this.copydefault = new C48029uCi(false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: o.uCk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void KWHzl(@NotNull C48029uCi c48029uCi, @NotNull InterfaceC48026uCf interfaceC48026uCf) {
        Intrinsics.checkNotNullParameter(c48029uCi, "");
        Intrinsics.checkNotNullParameter(interfaceC48026uCf, "");
        super.init();
        this.copydefault = c48029uCi;
        this.EZpvd = c48029uCi.copydefault();
        this.AhwBna = interfaceC48026uCf;
        this.mAxisLeft = new StateListAnimator();
        setupChartDefaults();
        setupRendererDefaults();
        setupGestureListeners();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fGEmmrt = C55298xhM.gEmmrt(10.0f, context) / getContext().getResources().getDisplayMetrics().density;
        YAxis axisLeft = getAxisLeft();
        StateListAnimator stateListAnimator = axisLeft instanceof StateListAnimator ? (StateListAnimator) axisLeft : null;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault(fGEmmrt);
        }
        EZpvd(fGEmmrt);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C48024uCd c48024uCd = new C48024uCd(this, C33512mxp.tradeRiseHighlightsFill$default(c33512mxp, context2, 0.0f, 2, null), interfaceC48026uCf);
        this.djBIcL = c48024uCd;
        setRenderer(c48024uCd);
        if (c48029uCi.EZpvd()) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Application application = new Application(this, context3);
            application.setChartView(this);
            setMarker(application);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setClipValuesToContent(false);
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, C55298xhM.dp2pxFloat$default(6.0f, null, 1, null), 0.0f, C55298xhM.dp2pxFloat$default(4.0f, null, 1, null));
    }

    public final void setupChartDefaults() {
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setTouchEnabled(true);
        setDragEnabled(false);
        setNestedScrollingEnabled(false);
        setHighlightPerDragEnabled(true);
        setScaleXEnabled(false);
        setScaleYEnabled(false);
        getAxisRight().setEnabled(false);
        setNoDataTextTypeface(C55051xce.OLrzqt.valueOf());
    }

    public final void setupRendererDefaults() {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        YAxis axisLeft = getAxisLeft();
        Intrinsics.checkNotNullExpressionValue(axisLeft, "");
        Transformer transformer = this.mLeftAxisTransformer;
        Intrinsics.checkNotNullExpressionValue(transformer, "");
        this.mAxisRendererLeft = new ActionBar(viewPortHandler, axisLeft, transformer);
    }

    /* JADX INFO: renamed from: o.uCk$TaskDescription */
    public static final class TaskDescription implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (C48031uCk.this.EZpvd) {
                android.content.Context context = C48031uCk.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                android.os.Vibrator vibrator = (android.os.Vibrator) ContextCompat.getSystemService(context, android.os.Vibrator.class);
                if (vibrator == null || !vibrator.hasVibrator() || Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                    return;
                }
                C48031uCk.this.performHapticFeedback(4);
            }
        }
    }

    public final void setupGestureListeners() {
        setOnChartValueSelectedListener(new TaskDescription());
        setOnChartGestureListener(new Dialog());
    }

    /* JADX INFO: renamed from: o.uCk$Dialog */
    public static final class Dialog implements OnChartGestureListener {
        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        public Dialog() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            android.view.ViewParent parent = C48031uCk.this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
            android.view.ViewParent parent = C48031uCk.this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
            C48031uCk.this.copydefault(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(android.view.MotionEvent motionEvent) {
        IMarker marker = getMarker();
        Application application = marker instanceof Application ? (Application) marker : null;
        if (application == null || motionEvent == null || !application.EZpvd(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        highlightValue(null);
        application.AhwBna();
    }

    private final void EZpvd(float f) {
        XAxis xAxis = getXAxis();
        xAxis.setTextSize(f);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        xAxis.setTextColor(C33070mpX.OLrzqt(i, context));
        xAxis.setLabelCount(5, true);
        xAxis.setYOffset(6.0f);
        xAxis.setXOffset(0.0f);
        xAxis.setAvoidFirstLastClipping(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(true);
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setValueFormatter(new LoaderManager());
    }

    /* JADX INFO: renamed from: o.uCk$LoaderManager */
    public static final class LoaderManager extends ValueFormatter {
        public LoaderManager() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            C48032uCl c48032uCl = (C48032uCl) CollectionsKt___CollectionsKt.AkhnZx(C48031uCk.this.OLrzqt, (int) f);
            return c48032uCl != null ? pTA.formatDate$default(new Date(c48032uCl.KWHzl()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null) : "";
        }
    }

    public static /* synthetic */ void setData$default(C48031uCk c48031uCk, java.util.List list, boolean z, ValueFormatter valueFormatter, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        c48031uCk.setData(list, z, valueFormatter, z2);
    }

    public final void setData(@NotNull java.util.List<C48032uCl> list, boolean z, @NotNull ValueFormatter valueFormatter, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueFormatter, "");
        java.util.List<C48032uCl> listOLrzqt = OLrzqt(list);
        this.OLrzqt = listOLrzqt;
        boolean z3 = false;
        if (listOLrzqt.size() < 5) {
            getXAxis().setLabelCount(listOLrzqt.size(), false);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(((C48032uCl) it.next()).OLrzqt().toString());
        }
        C48023uCc c48023uCcCopydefault = C48025uCe.copydefault(arrayList);
        if (c48023uCcCopydefault == null) {
            c48023uCcCopydefault = C48023uCc.Companion.copydefault();
        }
        this.gEmmrt = c48023uCcCopydefault;
        KWHzl();
        setData(new LineData(KWHzl(AEQbTJ(listOLrzqt))));
        AEQbTJ(z, valueFormatter);
        IMarker marker = getMarker();
        Application application = marker instanceof Application ? (Application) marker : null;
        if (application != null) {
            application.setDataList(listOLrzqt);
        }
        this.mIndicesToHighlight = null;
        if (this.copydefault.EZpvd() && getMarker() != null) {
            z3 = true;
        }
        setHighlightPerTapEnabled(z3);
        KWHzl(z2, listOLrzqt.size());
    }

    public final java.util.List<C48032uCl> OLrzqt(java.util.List<C48032uCl> list) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (list.isEmpty()) {
            return yDY.gEmmrt(new C48032uCl(jCurrentTimeMillis, 0, 0, 0), new C48032uCl(jCurrentTimeMillis + 3600000, 0, 0, 0));
        }
        if (list.size() != 1) {
            return list;
        }
        C48032uCl c48032uCl = list.get(0);
        return yDY.gEmmrt(c48032uCl, C48032uCl.copy$default(c48032uCl, c48032uCl.KWHzl() + 3600000, null, null, null, 14, null));
    }

    public final java.util.ArrayList<Entry> AEQbTJ(java.util.List<C48032uCl> list) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C48032uCl c48032uCl = (C48032uCl) obj;
            arrayList.add(new Entry(i, C33129mqd.djBIcL(c48032uCl.OLrzqt()), java.lang.Long.valueOf(c48032uCl.KWHzl())));
            i++;
        }
        return arrayList;
    }

    private final void KWHzl() {
        uBZ ubz = uBZ.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.KWHzl = uBZ.createGradientFill$default(ubz, context, C33129mqd.djBIcL(this.gEmmrt.KWHzl()), C33129mqd.djBIcL(this.gEmmrt.OLrzqt()), 0.0f, 8, null);
    }

    public final LineDataSet KWHzl(java.util.ArrayList<Entry> arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(this.KWHzl);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setCubicIntensity(0.5f);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        return lineDataSet;
    }

    private final void AEQbTJ(boolean z, ValueFormatter valueFormatter) {
        C48024uCd c48024uCd = this.djBIcL;
        if (c48024uCd != null) {
            c48024uCd.KWHzl(this.gEmmrt);
            c48024uCd.EZpvd(z);
        }
        kotlin.Pair<java.lang.Float, java.lang.Float> pairCopydefault = C48022uCb.copydefault.copydefault(this.gEmmrt, 0.2f, z);
        float fFloatValue = pairCopydefault.component1().floatValue();
        float fFloatValue2 = pairCopydefault.component2().floatValue();
        YAxis axisLeft = getAxisLeft();
        axisLeft.setAxisMinimum(fFloatValue);
        axisLeft.setAxisMaximum(fFloatValue2);
        axisLeft.setValueFormatter(valueFormatter);
    }

    public final void KWHzl(boolean z, int i) {
        long jGEmmrt;
        if (getData() == 0 || z) {
            if (i <= 20) {
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                jGEmmrt = C59462zhW.gEmmrt(C59519zia.EZpvd(600, DurationUnit.MILLISECONDS));
            } else if (i <= 30) {
                C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                jGEmmrt = C59462zhW.gEmmrt(C59519zia.EZpvd(750, DurationUnit.MILLISECONDS));
            } else {
                C59462zhW.Activity activity3 = C59462zhW.OLrzqt;
                jGEmmrt = C59462zhW.gEmmrt(C59519zia.EZpvd(1, DurationUnit.SECONDS));
            }
            animateX((int) jGEmmrt, Easing.Linear);
            return;
        }
        postInvalidate();
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        return (LineData) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: renamed from: o.uCk$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator extends YAxis {
        @Override // com.github.mikephil.charting.components.AxisBase
        public boolean isGridDashedLineEnabled() {
            return true;
        }

        public StateListAnimator() {
            super(YAxis.AxisDependency.LEFT);
            setEnabled(true);
        }

        public final void copydefault(float f) {
            setDrawAxisLine(false);
            setDrawGridLines(true);
            setDrawLabels(true);
            setGridLineWidth(this.mZeroLineWidth);
            setGridColor(C33070mpX.copydefault(C52761wXj.Activity.ORxRYg));
            enableGridDashedLine(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null), C55298xhM.dp2pxFloat$default(3.0f, null, 1, null), 0.0f);
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            setTextSize(f);
            setLabelCount(4, true);
            setDrawZeroLine(false);
            setXOffset(8.0f);
            setTypeface(C55051xce.OLrzqt.valueOf());
            setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        }

        private final float[] AEQbTJ() {
            float fAbs = java.lang.Math.abs(getAxisMaximum() - getAxisMinimum()) / 3;
            float[] fArr = new float[4];
            for (int i = 0; i < 4; i++) {
                fArr[i] = getAxisMinimum() + (i * fAbs);
            }
            return fArr;
        }

        @Override // com.github.mikephil.charting.components.YAxis
        public float getRequiredWidthSpace(android.graphics.Paint paint) {
            java.lang.Float fValueOf;
            if (paint == null) {
                return 0.0f;
            }
            paint.setTextSize(this.mTextSize);
            paint.setTypeface(C55051xce.OLrzqt.valueOf());
            float[] fArrAEQbTJ = AEQbTJ();
            if (fArrAEQbTJ.length == 0) {
                fValueOf = null;
            } else {
                float fMeasureText = paint.measureText(getValueFormatter().getAxisLabel(fArrAEQbTJ[0], this));
                int iValueOf = yDV.valueOf(fArrAEQbTJ);
                if (1 <= iValueOf) {
                    int i = 1;
                    while (true) {
                        fMeasureText = java.lang.Math.max(fMeasureText, paint.measureText(getValueFormatter().getAxisLabel(fArrAEQbTJ[i], this)));
                        if (i == iValueOf) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = java.lang.Float.valueOf(fMeasureText);
            }
            return (fValueOf != null ? fValueOf.floatValue() : 0.0f) + C55298xhM.dp2pxFloat$default(8.0f, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.uCk$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar extends YAxisRenderer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ViewPortHandler viewPortHandler, @NotNull YAxis yAxis, @NotNull Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            Intrinsics.checkNotNullParameter(viewPortHandler, "");
            Intrinsics.checkNotNullParameter(yAxis, "");
            Intrinsics.checkNotNullParameter(transformer, "");
            this.mZeroLinePaint.setStrokeCap(Paint.Cap.ROUND);
            this.mZeroLinePaint.setStrokeJoin(Paint.Join.ROUND);
        }
    }

    /* JADX INFO: renamed from: o.uCk$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final class Application extends uBY {
        public boolean AuCTelauCTel;
        public final java.util.ArrayList<java.lang.Integer> AubY;
        public final /* synthetic */ C48031uCk zLjUOn;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/util/List; */
        @Override // o.uBX
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public java.util.ArrayList<java.lang.Integer> AEQbTJ() {
            return this.AubY;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C48031uCk c48031uCk, android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.zLjUOn = c48031uCk;
            this.AubY = yDY.copydefault(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)));
            djBIcL().setVisibility(8);
            gEmmrt().setVisibility(8);
        }

        @Override // o.uBX, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public void refreshContent(Entry entry, Highlight highlight) {
            int iTradeFallGraph$default;
            if (entry == null) {
                super.refreshContent(entry, highlight);
                Unit unit = Unit.INSTANCE;
                this.AuCTelauCTel = false;
                return;
            }
            if (OLrzqt().contains(java.lang.Float.valueOf(entry.getX()))) {
                this.AuCTelauCTel = true;
                return;
            }
            this.AuCTelauCTel = false;
            if (entry.getY() >= 0.0f) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iTradeFallGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
            }
            this.AubY.clear();
            this.AubY.add(java.lang.Integer.valueOf(iTradeFallGraph$default));
            C48032uCl c48032uCl = (C48032uCl) CollectionsKt___CollectionsKt.AkhnZx(EZpvd(), (int) entry.getX());
            if (c48032uCl != null) {
                C48031uCk c48031uCk = this.zLjUOn;
                java.lang.String str = pTA.format$default(new Date(c48032uCl.KWHzl()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                java.lang.String strEZpvd = c48031uCk.AhwBna.EZpvd(c48032uCl.copydefault().toString(), false);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(uBT.Application.AEQbTJ);
                java.lang.String strEZpvd2 = c48031uCk.AhwBna.EZpvd(c48032uCl.AEQbTJ().toString(), true);
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(uBT.Application.copydefault);
                setTitleText(str);
                setContents(AEQbTJ(strAYXKKw, strEZpvd, EZpvd(c48032uCl.OLrzqt().toString())), AEQbTJ(strAYXKKw2, strEZpvd2, EZpvd(c48032uCl.OLrzqt().toString())));
            }
            super.refreshContent(entry, highlight);
        }

        @Override // o.uBX, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public void draw(android.graphics.Canvas canvas, float f, float f2) {
            if (this.AuCTelauCTel) {
                return;
            }
            super.draw(canvas, f, f2);
        }

        @Override // o.uBY, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
            float fKWHzl;
            Chart chartView = getChartView();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            float fEZpvd = C55298xhM.EZpvd(2.0f, context);
            if (chartView != null) {
                float fKWHzl2 = KWHzl() + f + fEZpvd;
                float fKWHzl3 = ((f - KWHzl()) - fEZpvd) - getWidth();
                fKWHzl = (((float) getWidth()) + fKWHzl2 > ((float) chartView.getWidth()) && fKWHzl3 >= 0.0f) ? fKWHzl3 - f : fKWHzl2 - f;
            } else {
                fKWHzl = KWHzl() + fEZpvd;
            }
            MPPointF mPPointF = MPPointF.getInstance(fKWHzl, -(getHeight() / 2));
            Intrinsics.checkNotNullExpressionValue(mPPointF, "");
            return mPPointF;
        }
    }
}
