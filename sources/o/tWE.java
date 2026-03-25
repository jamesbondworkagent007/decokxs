package o;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
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
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.widget.chart.profile.ChartProfileNewData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C47501trL;
import o.C52761wXj;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tWE extends LineChart {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public android.graphics.drawable.Drawable AEQbTJ;
    public tWA AYXKKw;
    public boolean EZpvd;
    public final java.util.ArrayList<java.lang.Float> OLrzqt;
    public java.util.List<ChartProfileNewData> copydefault;
    public Function1<? super ChartProfileNewData, Unit> djBIcL;
    public C46492tWi valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tWE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tWE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isDoubleTapToZoomEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isDragYEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isPinchZoomEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isScaleXEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public boolean isScaleYEnabled() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:66) call: o.tWE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tWE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tWE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = yDY.AhwBna();
        this.valueOf = C46492tWi.Companion.copydefault();
        this.OLrzqt = new java.util.ArrayList<>();
        this.EZpvd = true;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tWE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mAxisLeft = new Activity();
        OLrzqt();
        setupRenderer();
        setupListeners();
    }

    public final void setupRenderer() {
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseHighlightsFill$default = C33512mxp.tradeRiseHighlightsFill$default(c33512mxp, context, 0.0f, 2, null);
        int i = C52761wXj.Activity.DGgkXd;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        tWA twa = new tWA(this, iTradeRiseHighlightsFill$default, C33070mpX.OLrzqt(i, context2), false, 8, null);
        this.AYXKKw = twa;
        setRenderer(twa);
    }

    public static final class StateListAnimator implements OnChartValueSelectedListener {
        public StateListAnimator() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (((ChartProfileNewData) CollectionsKt___CollectionsKt.AkhnZx(tWE.this.copydefault, entry != null ? (int) entry.getX() : -1)) != null) {
                tWE twe = tWE.this;
                if (twe.EZpvd) {
                    tUP.m8767vibrategIAlus$default(tUP.KWHzl, twe, 0L, 2, null);
                }
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }
    }

    public final void setupListeners() {
        setOnChartValueSelectedListener(new StateListAnimator());
        setOnChartGestureListener(new Dialog());
    }

    public static final class Dialog implements OnChartGestureListener {
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
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
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
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            tWE.this.setHighlightPerTapEnabled(true);
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
            tWE.this.EZpvd(motionEvent);
        }
    }

    public final void EZpvd(android.view.MotionEvent motionEvent) {
        IMarker marker = getMarker();
        Application application = marker instanceof Application ? (Application) marker : null;
        if (application == null || motionEvent == null || !application.copydefault(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        highlightValue(null);
        application.AYXKKw();
        setHighlightPerTapEnabled(false);
    }

    private final void OLrzqt() {
        setTouchEnabled(true);
        getDescription().setEnabled(false);
        setDrawMarkers(true);
        setScaleEnabled(false);
        setPinchZoom(false);
        setDoubleTapToZoomEnabled(false);
        setDragXEnabled(false);
        setDragYEnabled(false);
        setDragDecelerationEnabled(false);
        ViewPortHandler viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        YAxis axisLeft = getAxisLeft();
        Intrinsics.checkNotNullExpressionValue(axisLeft, "");
        Transformer transformer = this.mLeftAxisTransformer;
        Intrinsics.checkNotNullExpressionValue(transformer, "");
        setRendererLeftYAxis(new ActionBar(viewPortHandler, axisLeft, transformer));
        getLegend().setEnabled(false);
        getAxisRight().setEnabled(false);
        setNoDataTextTypeface(C55051xce.OLrzqt.valueOf());
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fGEmmrt = C55298xhM.gEmmrt(12.0f, context) / getContext().getResources().getDisplayMetrics().density;
        YAxis axisLeft2 = getAxisLeft();
        Activity activity = axisLeft2 instanceof Activity ? (Activity) axisLeft2 : null;
        if (activity != null) {
            activity.copydefault(fGEmmrt);
        }
        EZpvd(fGEmmrt);
        setupMarker();
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, 24.0f, 0.0f, 12.0f);
    }

    private final void EZpvd(float f) {
        XAxis xAxis = getXAxis();
        xAxis.setTextSize(f);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        int i = C52761wXj.Activity.UlJrfe;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        xAxis.setTextColor(C33070mpX.OLrzqt(i, context));
        xAxis.setLabelCount(5, true);
        xAxis.setYOffset(10.0f);
        xAxis.setXOffset(0.0f);
        xAxis.setAvoidFirstLastClipping(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(false);
    }

    public final void setupMarker() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Application application = new Application(this, context, this);
        application.setChartView(this);
        setMarker(application);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.tWE */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setData-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8768setDatahUnOzRk$default(tWE twe, java.util.List list, boolean z, boolean z2, ValueFormatter valueFormatter, boolean z3, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            valueFormatter = new C46488tWe();
        }
        ValueFormatter valueFormatter2 = valueFormatter;
        if ((i & 32) != 0) {
            function1 = null;
        }
        return twe.KWHzl(list, z4, z5, valueFormatter2, z3, function1);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<ChartProfileNewData> list, boolean z, boolean z2, @NotNull ValueFormatter valueFormatter, boolean z3, Function1<? super ChartProfileNewData, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueFormatter, "");
        try {
            Result.Application application = Result.Companion;
            this.EZpvd = z3;
            this.djBIcL = function1;
            java.util.ArrayList<ChartProfileNewData> arrayListAEQbTJ = AEQbTJ(list);
            this.copydefault = arrayListAEQbTJ;
            EZpvd(arrayListAEQbTJ);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
            java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((ChartProfileNewData) it.next()).OLrzqt()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
            java.util.Iterator<T> it2 = arrayListAEQbTJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ChartProfileNewData) it2.next()).KWHzl());
            }
            setYAxisData(arrayList, arrayList2, z2, valueFormatter);
            Unit unit = null;
            this.mIndicesToHighlight = null;
            setHighlightPerTapEnabled(false);
            OLrzqt(z);
            ChartProfileNewData chartProfileNewData = (ChartProfileNewData) CollectionsKt___CollectionsKt.wlaJM(arrayListAEQbTJ);
            if (chartProfileNewData != null && function1 != null) {
                function1.invoke(chartProfileNewData);
                unit = Unit.INSTANCE;
            }
            return Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.util.ArrayList<ChartProfileNewData> AEQbTJ(java.util.List<ChartProfileNewData> list) {
        java.util.ArrayList<ChartProfileNewData> arrayList;
        if (list.isEmpty()) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            ChartProfileNewData chartProfileNewData = new ChartProfileNewData(jCurrentTimeMillis, bigDecimal, bigDecimal, bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            arrayList = yDY.copydefault(chartProfileNewData, new ChartProfileNewData(jCurrentTimeMillis + 3600000, bigDecimal, bigDecimal, bigDecimal));
        } else if (list.size() == 1) {
            ChartProfileNewData chartProfileNewData2 = list.get(0);
            arrayList = yDY.copydefault(chartProfileNewData2, new ChartProfileNewData(chartProfileNewData2.OLrzqt() + 3600000, C33129mqd.EZpvd(chartProfileNewData2.KWHzl()), chartProfileNewData2.EZpvd(), chartProfileNewData2.AEQbTJ()));
        } else {
            arrayList = new java.util.ArrayList<>(list);
        }
        if (arrayList.size() < 5) {
            getXAxis().setLabelCount(arrayList.size(), false);
        }
        return arrayList;
    }

    public static final class Fragment extends ValueFormatter {
        public final /* synthetic */ java.util.ArrayList<ChartProfileNewData> EZpvd;
        public final /* synthetic */ tWE copydefault;

        public Fragment(java.util.ArrayList<ChartProfileNewData> arrayList, tWE twe) {
            this.EZpvd = arrayList;
            this.copydefault = twe;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            if (i >= 0 && i < this.EZpvd.size()) {
                ChartProfileNewData chartProfileNewData = this.EZpvd.get(i);
                Intrinsics.checkNotNullExpressionValue(chartProfileNewData, "");
                ChartProfileNewData chartProfileNewData2 = chartProfileNewData;
                if (chartProfileNewData2.OLrzqt() != 0) {
                    return this.copydefault.copydefault(pTA.formatDate$default(new Date(chartProfileNewData2.OLrzqt()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null));
                }
            }
            return "--";
        }
    }

    private final void EZpvd(java.util.ArrayList<ChartProfileNewData> arrayList) {
        getXAxis().setValueFormatter(new Fragment(arrayList, this));
    }

    public final void OLrzqt(boolean z) {
        int iGEmmrt;
        if (getData() == 0 || z) {
            if (this.copydefault.size() <= 20) {
                iGEmmrt = 600;
            } else if (this.copydefault.size() <= 30) {
                iGEmmrt = 750;
            } else {
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                iGEmmrt = (int) C59462zhW.gEmmrt(C59519zia.EZpvd(1, DurationUnit.SECONDS));
            }
            animateX(iGEmmrt, Easing.Linear);
            return;
        }
        postInvalidate();
    }

    public static /* synthetic */ void setYAxisData$default(tWE twe, java.util.List list, java.util.List list2, boolean z, ValueFormatter valueFormatter, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            valueFormatter = new C46488tWe();
        }
        twe.setYAxisData(list, list2, z, valueFormatter);
    }

    public final void setYAxisData(java.util.List<java.lang.Long> list, java.util.List<? extends java.lang.Number> list2, boolean z, ValueFormatter valueFormatter) {
        this.OLrzqt.clear();
        java.util.ArrayList<Entry> arrayListOLrzqt = OLrzqt(list, list2);
        KWHzl();
        setData(new LineData(AEQbTJ(arrayListOLrzqt, true)));
        OLrzqt(z, valueFormatter);
    }

    public final void KWHzl() {
        C46489tWf c46489tWf = C46489tWf.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.AEQbTJ = C46489tWf.updateDrawableFill$default(c46489tWf, context, C33129mqd.djBIcL(this.valueOf.OLrzqt()), C33129mqd.djBIcL(this.valueOf.copydefault()), 0.0f, false, null, 56, null);
    }

    public final LineDataSet AEQbTJ(java.util.ArrayList<Entry> arrayList, boolean z) {
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
        lineDataSet.setDrawFilled(z);
        lineDataSet.setFillDrawable(this.AEQbTJ);
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setCubicIntensity(0.5f);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        return lineDataSet;
    }

    public final void OLrzqt(boolean z, ValueFormatter valueFormatter) {
        tWA twa = this.AYXKKw;
        if (twa != null) {
            twa.OLrzqt(this.valueOf);
            twa.AEQbTJ(z);
        }
        kotlin.Pair<java.lang.Float, java.lang.Float> pairKWHzl = C46485tWb.copydefault.KWHzl(this.valueOf, 0.2f, z);
        float fFloatValue = pairKWHzl.component1().floatValue();
        float fFloatValue2 = pairKWHzl.component2().floatValue();
        YAxis axisLeft = getAxisLeft();
        axisLeft.setAxisMinimum(fFloatValue);
        axisLeft.setAxisMaximum(fFloatValue2);
        axisLeft.setValueFormatter(valueFormatter);
    }

    public final class Application extends AbstractC46502tWs {
        public final java.util.ArrayList<java.lang.Integer> AuCTelauCTel;
        public boolean getFieldNames;
        public final tWE iwGUEr;
        public final /* synthetic */ tWE zsXlph;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/util/List; */
        @Override // o.AbstractC46497tWn
        /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
        public java.util.ArrayList<java.lang.Integer> KWHzl() {
            return this.AuCTelauCTel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull tWE twe, @NotNull android.content.Context context, tWE twe2) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(twe2, "");
            this.zsXlph = twe;
            this.iwGUEr = twe2;
            this.AuCTelauCTel = yDY.copydefault(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)));
            android.view.View viewFindViewById = findViewById(C47501trL.TaskDescription.DcqEDu);
            if (viewFindViewById != null) {
                int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.Activity.invokespecialDPHOMC, context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor((iOLrzqt & 16777215) | (-436207616));
                gradientDrawable.setCornerRadius(C55298xhM.EZpvd(2.0f, context));
                viewFindViewById.setBackground(gradientDrawable);
            }
            EZpvd().setVisibility(8);
            copydefault().setVisibility(8);
        }

        @Override // o.AbstractC46497tWn, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public void refreshContent(Entry entry, Highlight highlight) {
            int iTradeFallGraph$default;
            if (entry != null) {
                if (this.zsXlph.OLrzqt.contains(java.lang.Float.valueOf(entry.getX()))) {
                    this.getFieldNames = true;
                    return;
                }
                this.getFieldNames = false;
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
                this.AuCTelauCTel.clear();
                this.AuCTelauCTel.add(java.lang.Integer.valueOf(iTradeFallGraph$default));
                ChartProfileNewData chartProfileNewData = (ChartProfileNewData) CollectionsKt___CollectionsKt.AkhnZx(this.zsXlph.copydefault, (int) entry.getX());
                if (chartProfileNewData != null) {
                    java.lang.String strCopydefault = this.zsXlph.copydefault(pTA.format$default(new Date(chartProfileNewData.OLrzqt()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.NRYds);
                    java.lang.String strKWHzl = KWHzl(chartProfileNewData.EZpvd(), false);
                    java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C47501trL.Fragment.Dap);
                    java.lang.String strKWHzl2 = KWHzl(chartProfileNewData.AEQbTJ(), true);
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C47501trL.Fragment.zDGrpR);
                    Triple<java.lang.String, java.lang.String, java.lang.Integer> tripleAEQbTJ = AEQbTJ(strAYXKKw, strCopydefault, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                    java.lang.String string = chartProfileNewData.KWHzl().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Triple<java.lang.String, java.lang.String, java.lang.Integer> tripleAEQbTJ2 = AEQbTJ(strAYXKKw2, strKWHzl, copydefault(string));
                    java.lang.String string2 = chartProfileNewData.KWHzl().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    setContents(tripleAEQbTJ, tripleAEQbTJ2, AEQbTJ(strAYXKKw3, strKWHzl2, copydefault(string2)));
                }
                super.refreshContent(entry, highlight);
                return;
            }
            super.refreshContent(entry, highlight);
            Unit unit = Unit.INSTANCE;
            this.getFieldNames = false;
        }

        public final java.lang.String KWHzl(java.lang.Number number, boolean z) {
            if (z) {
                return pTB.formatICUPercent$default(C33129mqd.EZpvd(number), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
            }
            return C46367tRs.m8766pnlDollarFormatHYcmJmU$default(PlanetNumericString.AEQbTJ(C33129mqd.gEmmrt(C33129mqd.EZpvd(number))), false, 1, null);
        }

        @Override // o.AbstractC46497tWn, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public void draw(android.graphics.Canvas canvas, float f, float f2) {
            if (this.getFieldNames) {
                return;
            }
            super.draw(canvas, f, f2);
        }

        @Override // o.AbstractC46502tWs, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
            float fOLrzqt;
            Chart chartView = getChartView();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            float fEZpvd = C55298xhM.EZpvd(2.0f, context);
            if (chartView != null) {
                float fOLrzqt2 = OLrzqt() + f + fEZpvd;
                float fOLrzqt3 = ((f - OLrzqt()) - fEZpvd) - getWidth();
                fOLrzqt = (((float) getWidth()) + fOLrzqt2 > ((float) chartView.getWidth()) && fOLrzqt3 >= 0.0f) ? fOLrzqt3 - f : fOLrzqt2 - f;
            } else {
                fOLrzqt = OLrzqt() + fEZpvd;
            }
            MPPointF mPPointF = MPPointF.getInstance(fOLrzqt, -(getHeight() / 2));
            Intrinsics.checkNotNullExpressionValue(mPPointF, "");
            return mPPointF;
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return C59449zhJ.replace$default(C59449zhJ.replace$default(str, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null);
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        return (LineData) this.mData;
    }

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

    public static final class Activity extends YAxis {
        @Override // com.github.mikephil.charting.components.AxisBase
        public boolean isGridDashedLineEnabled() {
            return true;
        }

        public Activity() {
            super(YAxis.AxisDependency.LEFT);
            setEnabled(true);
        }

        public final void copydefault(float f) {
            setDrawAxisLine(false);
            setDrawGridLines(true);
            setGridLineWidth(0.5f);
            setGridColor(C33070mpX.copydefault(C52761wXj.Activity.ORxRYg));
            enableGridDashedLine(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null), C55298xhM.dp2pxFloat$default(3.0f, null, 1, null), 0.0f);
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            setTextSize(f);
            setLabelCount(5, true);
            setDrawZeroLine(false);
            setXOffset(8.0f);
            setDrawLabels(false);
        }

        @Override // com.github.mikephil.charting.components.YAxis
        public float getRequiredWidthSpace(android.graphics.Paint paint) {
            java.lang.Float fValueOf;
            if (paint == null) {
                return 0.0f;
            }
            paint.setTextSize(this.mTextSize);
            paint.setTypeface(C55051xce.OLrzqt.valueOf());
            float[] fArrCopydefault = copydefault();
            if (fArrCopydefault.length == 0) {
                fValueOf = null;
            } else {
                float fMeasureText = paint.measureText(getValueFormatter().getAxisLabel(fArrCopydefault[0], this));
                int iValueOf = yDV.valueOf(fArrCopydefault);
                if (1 <= iValueOf) {
                    int i = 1;
                    while (true) {
                        fMeasureText = java.lang.Math.max(fMeasureText, paint.measureText(getValueFormatter().getAxisLabel(fArrCopydefault[i], this)));
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

        public final float[] copydefault() {
            float fAbs = java.lang.Math.abs(getAxisMaximum() - getAxisMinimum()) / 4;
            float[] fArr = new float[5];
            for (int i = 0; i < 5; i++) {
                fArr[i] = getAxisMinimum() + (i * fAbs);
            }
            return fArr;
        }
    }

    public final java.util.ArrayList<Entry> OLrzqt(java.util.List<java.lang.Long> list, java.util.List<? extends java.lang.Number> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.Number) it.next()).toString());
        }
        C46492tWi c46492tWiKWHzl = C46499tWp.KWHzl(arrayList);
        if (c46492tWiKWHzl == null) {
            c46492tWiKWHzl = C46492tWi.Companion.copydefault();
        }
        this.valueOf = c46492tWiKWHzl;
        java.util.ArrayList<Entry> arrayList2 = new java.util.ArrayList<>();
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            float fDjBIcL = C33129mqd.djBIcL((java.lang.Number) obj);
            if (list.get(i).longValue() == 0) {
                this.OLrzqt.add(java.lang.Float.valueOf(i));
            }
            arrayList2.add(new Entry(i, fDjBIcL, list.get(i)));
            i++;
        }
        return arrayList2;
    }
}
