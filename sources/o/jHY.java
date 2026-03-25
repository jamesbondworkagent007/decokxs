package o;

import android.graphics.RectF;
import android.widget.FrameLayout;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25841jIi;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jHY extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public float AYXKKw;
    public Entry AhwBna;
    public final C25841jIi AkhnZx;
    public boolean AuCTel;
    public final LineChart DbNXlk;
    public final int EZpvd;
    public jHZ KWHzl;
    public jHX copydefault;
    public float djBIcL;
    public float ejfBZ;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public float isConnected;
    public boolean valueOf;
    public InterfaceC25847jIo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jHY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jHY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnHighlightDataCallback(InterfaceC25847jIo interfaceC25847jIo) {
        this.values = interfaceC25847jIo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.jHY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ jHY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jHY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LineChart lineChart = new LineChart(context);
        lineChart.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.DbNXlk = lineChart;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
        this.EZpvd = iCopydefault;
        this.copydefault = new jHX(false, false, false, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4095, null);
        this.fetchVPNInfo = iCopydefault;
        C25841jIi c25841jIi = new C25841jIi(context, new C25841jIi.Activity() { // from class: o.jHY.3
            @Override // o.C25841jIi.Activity
            public RectF KWHzl() {
                return jHY.this.OLrzqt();
            }
        }, new C25841jIi.Application() { // from class: o.jHY.5
            @Override // o.C25841jIi.Application
            public java.lang.String AEQbTJ(float f) {
                return jHY.this.AEQbTJ(f);
            }
        }, C33070mpX.copydefault(this.copydefault.AYXKKw()));
        c25841jIi.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c25841jIi.setVisibility(8);
        this.AkhnZx = c25841jIi;
        addView(lineChart);
        addView(c25841jIi);
        setupChart();
        setupChartListener();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jHY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void setupChart() {
        LineChart lineChart = this.DbNXlk;
        lineChart.setTouchEnabled(this.copydefault.KWHzl());
        lineChart.setDragEnabled(this.copydefault.OLrzqt());
        lineChart.setScaleEnabled(this.copydefault.AEQbTJ());
        float f = 2;
        lineChart.setViewPortOffsets(this.copydefault.gEmmrt(), this.copydefault.djBIcL() * f, this.copydefault.valueOf(), this.copydefault.copydefault() * f);
        lineChart.getAxisRight().setEnabled(false);
        lineChart.getAxisLeft().setEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.setRenderer(new C25839jIg(lineChart, C33070mpX.copydefault(this.copydefault.AYXKKw())));
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setDrawLabels(true);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(5, true);
        xAxis.setAvoidFirstLastClipping(true);
        xAxis.setLabelRotationAngle(0.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
        xAxis.setTextSize(10.0f);
        xAxis.setGranularity(1.0f);
        xAxis.setValueFormatter(new TaskDescription());
        this.DbNXlk.invalidate();
        C41349qpD.AEQbTJ(lineChart, (Function1<? super android.view.MotionEvent, Unit>) new Function1() { // from class: o.jIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jHY.OLrzqt(this.copydefault, (android.view.MotionEvent) obj);
            }
        }, (Function1<? super android.view.MotionEvent, Unit>) new Function1() { // from class: o.jIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jHY.EZpvd(this.copydefault, (android.view.MotionEvent) obj);
            }
        });
    }

    public static final class TaskDescription extends ValueFormatter {
        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return jHY.this.AEQbTJ(f);
        }
    }

    public static final Unit OLrzqt(jHY jhy, android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            jhy.copydefault(motionEvent.getX(), motionEvent.getY());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(jHY jhy, android.view.MotionEvent motionEvent) {
        jhy.copydefault();
        return Unit.INSTANCE;
    }

    public final void setupChartListener() {
        C41349qpD.AEQbTJ(this.DbNXlk, (Function0<Unit>) new Function0() { // from class: o.jIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jHY.EZpvd(this.KWHzl);
            }
        }, (Function2<? super Entry, ? super Highlight, Unit>) new Function2() { // from class: o.jId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jHY.OLrzqt(this.KWHzl, (Entry) obj, (Highlight) obj2);
            }
        });
    }

    public static final Unit EZpvd(jHY jhy) {
        jhy.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(jHY jhy, Entry entry, Highlight highlight) {
        if (jhy.gEmmrt && highlight != null && entry != null) {
            jhy.AEQbTJ(entry, jhy.KWHzl);
            LineData lineData = (LineData) jhy.DbNXlk.getData();
            ILineDataSet iLineDataSet = lineData != null ? (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex()) : null;
            showHighlight$default(jhy, highlight.getX(), entry, iLineDataSet != null ? iLineDataSet.getColor() : jhy.EZpvd, false, 8, null);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.DbNXlk.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final boolean OLrzqt(float f, float f2, RectF rectF) {
        return f >= rectF.left && f <= rectF.right && f2 >= rectF.top && f2 <= rectF.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF OLrzqt() {
        ViewPortHandler viewPortHandler = this.DbNXlk.getViewPortHandler();
        return new RectF(viewPortHandler.contentLeft(), viewPortHandler.contentTop(), viewPortHandler.contentRight(), viewPortHandler.contentBottom());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isConnected = motionEvent.getX();
            this.ejfBZ = motionEvent.getY();
            this.AuCTel = this.valueOf;
            if (OLrzqt(motionEvent.getX(), motionEvent.getY(), OLrzqt())) {
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.AEQbTJ = true;
            }
        } else if (action == 1 || action == 3) {
            if (this.AEQbTJ) {
                android.view.ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                this.AEQbTJ = false;
            }
            this.AuCTel = false;
        }
        return false;
    }

    public static /* synthetic */ void showHighlight$default(jHY jhy, float f, Entry entry, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        jhy.OLrzqt(f, entry, i, z);
    }

    public final void OLrzqt(float f, Entry entry, int i, boolean z) {
        InterfaceC25847jIo interfaceC25847jIo;
        pUU.EZpvd("MarketAnalysisPerformanceLineChartView", "showing highlight at x=" + f + ", entry=" + entry.getX() + "," + entry.getY() + ", isLongPress=" + z);
        LineChart lineChart = this.DbNXlk;
        float x = entry.getX();
        float y = entry.getY();
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        MPPointD pixelForValues = lineChart.getPixelForValues(x, y, axisDependency);
        this.djBIcL = C33129mqd.djBIcL(java.lang.Double.valueOf(pixelForValues.x));
        this.AYXKKw = C33129mqd.djBIcL(java.lang.Double.valueOf(pixelForValues.y));
        this.AhwBna = entry;
        this.fetchVPNInfo = i;
        this.valueOf = true;
        if (z) {
            EZpvd(true);
            this.AuCTel = true;
        }
        KWHzl();
        this.AkhnZx.setVisibility(0);
        this.AkhnZx.setHighlightInfo(this.djBIcL, this.AYXKKw, i, z, entry);
        this.AkhnZx.invalidate();
        if (this.AuCTel && this.valueOf && (interfaceC25847jIo = this.values) != null) {
            try {
                MPPointD pixelForValues2 = this.DbNXlk.getPixelForValues(entry.getX(), entry.getY(), axisDependency);
                interfaceC25847jIo.OLrzqt(entry, (int) entry.getX(), C33129mqd.djBIcL(java.lang.Double.valueOf(pixelForValues2.x)), C33129mqd.djBIcL(java.lang.Double.valueOf(pixelForValues2.y)));
            } catch (java.lang.Exception e) {
                pUU.copydefault("MarketAnalysisPerformanceLineChartView", "Error in highlight callback: " + e.getMessage());
            }
        }
    }

    public final void EZpvd(boolean z) {
        int iCopydefault;
        XAxis xAxis = this.DbNXlk.getXAxis();
        xAxis.setDrawLabels(z);
        if (z) {
            iCopydefault = C33070mpX.copydefault(this.copydefault.AYXKKw());
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.aBDePw);
        }
        xAxis.setTextColor(iCopydefault);
        this.DbNXlk.invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(float f, float f2) {
        Triple<Entry, java.lang.Integer, java.lang.Float> tripleEZpvd;
        if (OLrzqt(f, f2, OLrzqt()) && (tripleEZpvd = EZpvd(f, f2)) != null) {
            Entry entryComponent1 = tripleEZpvd.component1();
            int iIntValue = tripleEZpvd.component2().intValue();
            LineData lineData = (LineData) this.DbNXlk.getData();
            ILineDataSet iLineDataSet = lineData != null ? (ILineDataSet) lineData.getDataSetByIndex(iIntValue) : null;
            int color = iLineDataSet != null ? iLineDataSet.getColor() : this.EZpvd;
            this.gEmmrt = true;
            OLrzqt(entryComponent1.getX(), entryComponent1, color, true);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0065 */
    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r9v0. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Triple<Entry, java.lang.Integer, java.lang.Float> EZpvd(float f, float f2) {
        jHY jhy = this;
        LineData lineData = (LineData) jhy.DbNXlk.getData();
        if (lineData == null) {
            return null;
        }
        int dataSetCount = lineData.getDataSetCount();
        int i = -1;
        float fDjBIcL = Float.MAX_VALUE;
        ?? r8 = 0;
        int i2 = 0;
        while (i2 < dataSetCount) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(i2);
            int entryCount = iLineDataSet.getEntryCount();
            int i3 = 0;
            ?? r82 = r8;
            while (i3 < entryCount) {
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i3);
                MPPointD pixelForValues = jhy.DbNXlk.getPixelForValues(entryForIndex.getX(), entryForIndex.getY(), YAxis.AxisDependency.LEFT);
                int i4 = i;
                LineData lineData2 = lineData;
                double d = ((double) f) - pixelForValues.x;
                int i5 = dataSetCount;
                double d2 = ((double) f2) - pixelForValues.y;
                double dSqrt = java.lang.Math.sqrt((d * d) + (d2 * d2));
                if (dSqrt < fDjBIcL) {
                    fDjBIcL = C33129mqd.djBIcL(java.lang.Double.valueOf(dSqrt));
                    i = i2;
                    r82 = entryForIndex;
                } else {
                    i = i4;
                }
                i3++;
                jhy = this;
                dataSetCount = i5;
                lineData = lineData2;
                r82 = r82;
            }
            i2++;
            jhy = this;
            r8 = r82;
        }
        if (r8 != 0) {
            return new Triple<>(r8, java.lang.Integer.valueOf(i), java.lang.Float.valueOf(fDjBIcL));
        }
        return null;
    }

    public final void copydefault() {
        this.gEmmrt = false;
        this.valueOf = false;
        this.djBIcL = 0.0f;
        this.AYXKKw = 0.0f;
        this.AhwBna = null;
        this.fetchVPNInfo = this.EZpvd;
        this.DbNXlk.highlightValues(null);
        EZpvd(false);
        this.AkhnZx.setVisibility(8);
        this.AkhnZx.setHighlightInfo(0.0f, 0.0f, this.EZpvd, false, null);
        this.AkhnZx.invalidate();
        EZpvd();
        AEQbTJ();
        invalidate();
        InterfaceC25847jIo interfaceC25847jIo = this.values;
        if (interfaceC25847jIo != null) {
            try {
                interfaceC25847jIo.KWHzl();
                pUU.KWHzl("MarketAnalysisPerformanceLineChartView", "Called onHighlightCleared");
            } catch (java.lang.Exception e) {
                pUU.copydefault("MarketAnalysisPerformanceLineChartView", "Error in highlight cleared callback: " + e.getMessage());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        LineData lineData;
        int iTradeFallGraph$default;
        jHZ jhz = this.KWHzl;
        if (jhz == null || !jhz.EZpvd().AEQbTJ() || (lineData = (LineData) this.DbNXlk.getData()) == null || lineData.getDataSetCount() <= 0) {
            return;
        }
        T dataSetByIndex = lineData.getDataSetByIndex(0);
        LineDataSet lineDataSet = dataSetByIndex instanceof LineDataSet ? (LineDataSet) dataSetByIndex : null;
        if (lineDataSet != null) {
            if ((jhz.AEQbTJ().isEmpty() ^ true ? ((C25833jIa) CollectionsKt___CollectionsKt.AubY(jhz.AEQbTJ())).OLrzqt() : 0.0f) >= 0.0f) {
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
            int i = iTradeFallGraph$default;
            lineDataSet.setColor(i);
            lineDataSet.setCircleColor(i);
            if (jhz.EZpvd().AhwBna()) {
                jHW jhwEZpvd = jhz.EZpvd();
                EZpvd(lineDataSet, jHZ.copy$default(jhz, null, jhwEZpvd.copydefault((4078 & 1) != 0 ? jhwEZpvd.EZpvd : i, (4078 & 2) != 0 ? jhwEZpvd.djBIcL : 0.0f, (4078 & 4) != 0 ? jhwEZpvd.AEQbTJ : 0.0f, (4078 & 8) != 0 ? jhwEZpvd.OLrzqt : 0.0f, (4078 & 16) != 0 ? jhwEZpvd.gEmmrt : null, (4078 & 32) != 0 ? jhwEZpvd.valueOf : false, (4078 & 64) != 0 ? jhwEZpvd.KWHzl : false, (4078 & 128) != 0 ? jhwEZpvd.AYXKKw : false, (4078 & 256) != 0 ? jhwEZpvd.copydefault : false, (4078 & 512) != 0 ? jhwEZpvd.AkhnZx : 0, (4078 & 1024) != 0 ? jhwEZpvd.AhwBna : false, (4078 & 2048) != 0 ? jhwEZpvd.fetchVPNInfo : false), 1, null), true);
            }
            this.DbNXlk.invalidate();
        }
    }

    public final void setData(@NotNull jHZ jhz) {
        Intrinsics.checkNotNullParameter(jhz, "");
        KWHzl();
        this.KWHzl = jhz;
        post(new java.lang.Runnable() { // from class: o.jIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jHY.OLrzqt(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(jHY jhy) {
        jhy.valueOf(jhy.KWHzl);
    }

    public final void EZpvd(@NotNull jHX jhx) {
        Intrinsics.checkNotNullParameter(jhx, "");
        this.copydefault = jhx;
        setupChart();
        this.AkhnZx.OLrzqt(C33070mpX.copydefault(this.copydefault.AYXKKw()));
    }

    public final LineDataSet OLrzqt(jHZ jhz) {
        if (jhz == null) {
            return null;
        }
        java.util.List<C25833jIa> listAEQbTJ = jhz.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (C25833jIa c25833jIa : listAEQbTJ) {
            arrayList.add(new Entry(c25833jIa.AEQbTJ(), c25833jIa.OLrzqt()));
        }
        int iAEQbTJ = AEQbTJ(jhz);
        java.lang.Integer numKWHzl = KWHzl(jhz);
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setColor(iAEQbTJ);
        lineDataSet.setLineWidth(jhz.EZpvd().gEmmrt());
        lineDataSet.setCircleColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        lineDataSet.setCircleHoleColor(iAEQbTJ);
        lineDataSet.setCircleRadius(jhz.EZpvd().EZpvd());
        lineDataSet.setCircleHoleRadius(jhz.EZpvd().copydefault());
        lineDataSet.setDrawCircles(jhz.EZpvd().KWHzl());
        lineDataSet.setDrawValues(jhz.EZpvd().valueOf());
        if (jhz.EZpvd().AhwBna()) {
            lineDataSet.setDrawFilled(true);
            if (numKWHzl != null) {
                iAEQbTJ = numKWHzl.intValue();
            }
            lineDataSet.setFillColor(iAEQbTJ);
            lineDataSet.setFillAlpha(30);
            lineDataSet.setFillFormatter(new IFillFormatter() { // from class: o.jIk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.github.mikephil.charting.formatter.IFillFormatter
                public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
                    return jHY.copydefault(iLineDataSet, lineDataProvider);
                }
            });
        }
        lineDataSet.setHighlightLineWidth(1.5f);
        lineDataSet.enableDashedHighlightLine(10.0f, 5.0f, 0.0f);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.setHighlightEnabled(jhz.EZpvd().AYXKKw());
        return lineDataSet;
    }

    public static final float copydefault(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        return lineDataProvider.getYChartMin();
    }

    public final int AEQbTJ(jHZ jhz) {
        jHW jhwEZpvd = jhz.EZpvd();
        if (!jhwEZpvd.AEQbTJ()) {
            return jhwEZpvd.OLrzqt();
        }
        if (EZpvd(jhz) >= 0.0f) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    public final java.lang.Integer KWHzl(jHZ jhz) {
        jHW jhwEZpvd = jhz.EZpvd();
        if (!jhwEZpvd.AhwBna()) {
            return null;
        }
        if (!jhwEZpvd.AEQbTJ()) {
            return jhwEZpvd.djBIcL();
        }
        if (EZpvd(jhz) >= 0.0f) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null));
    }

    public final float EZpvd(jHZ jhz) {
        int iValueOf;
        java.util.List<C25833jIa> listAEQbTJ = jhz.AEQbTJ();
        if (listAEQbTJ.isEmpty()) {
            return 0.0f;
        }
        jHW jhwEZpvd = jhz.EZpvd();
        if (jhwEZpvd.isConnected() < 0) {
            iValueOf = listAEQbTJ.size() - 1;
        } else {
            iValueOf = C56548yJl.valueOf(jhwEZpvd.isConnected(), listAEQbTJ.size() - 1);
        }
        return listAEQbTJ.get(iValueOf).OLrzqt();
    }

    public final void EZpvd(LineDataSet lineDataSet, jHZ jhz, boolean z) {
        int iAEQbTJ;
        try {
            if (z) {
                iAEQbTJ = jhz.EZpvd().OLrzqt();
            } else {
                iAEQbTJ = AEQbTJ(jhz);
            }
            C41349qpD.AEQbTJ(lineDataSet, iAEQbTJ);
            this.DbNXlk.invalidate();
        } catch (java.lang.Exception e) {
            pUU.copydefault("MarketAnalysisPerformanceLineChartView", "applyGradientFillToChart: Error applying gradient: " + e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(Entry entry, jHZ jhz) {
        int iTradeFallGraph$default;
        if (entry == null || jhz == null) {
            return;
        }
        try {
            LineData lineData = (LineData) this.DbNXlk.getData();
            if (lineData != null && lineData.getDataSetCount() > 0) {
                T dataSetByIndex = lineData.getDataSetByIndex(0);
                LineDataSet lineDataSet = dataSetByIndex instanceof LineDataSet ? (LineDataSet) dataSetByIndex : null;
                if (lineDataSet == null) {
                    return;
                }
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
                int i = iTradeFallGraph$default;
                lineDataSet.setColor(i);
                lineDataSet.setCircleColor(i);
                if (jhz.EZpvd().AhwBna()) {
                    jHW jhwEZpvd = jhz.EZpvd();
                    EZpvd(lineDataSet, jHZ.copy$default(jhz, null, jhwEZpvd.copydefault((4078 & 1) != 0 ? jhwEZpvd.EZpvd : i, (4078 & 2) != 0 ? jhwEZpvd.djBIcL : 0.0f, (4078 & 4) != 0 ? jhwEZpvd.AEQbTJ : 0.0f, (4078 & 8) != 0 ? jhwEZpvd.OLrzqt : 0.0f, (4078 & 16) != 0 ? jhwEZpvd.gEmmrt : java.lang.Integer.valueOf(i), (4078 & 32) != 0 ? jhwEZpvd.valueOf : false, (4078 & 64) != 0 ? jhwEZpvd.KWHzl : false, (4078 & 128) != 0 ? jhwEZpvd.AYXKKw : false, (4078 & 256) != 0 ? jhwEZpvd.copydefault : false, (4078 & 512) != 0 ? jhwEZpvd.AkhnZx : 0, (4078 & 1024) != 0 ? jhwEZpvd.AhwBna : false, (4078 & 2048) != 0 ? jhwEZpvd.fetchVPNInfo : false), 1, null), true);
                }
                this.DbNXlk.invalidate();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("MarketAnalysisPerformanceLineChartView", "updateColorsForHighlightedPoint: Error updating colors: " + e.getMessage());
        }
    }

    public final void valueOf(final jHZ jhz) {
        jHW jhwEZpvd;
        java.util.List<C25833jIa> listAEQbTJ;
        LineDataSet lineDataSetOLrzqt = OLrzqt(jhz);
        if (lineDataSetOLrzqt != null) {
            this.DbNXlk.setData(new LineData(lineDataSetOLrzqt));
            int size = (jhz == null || (listAEQbTJ = jhz.AEQbTJ()) == null) ? 0 : listAEQbTJ.size();
            int iEZpvd = EZpvd(size, this.copydefault.EZpvd());
            if (size <= 10) {
                this.DbNXlk.animateX(iEZpvd, Easing.Linear);
            } else {
                this.DbNXlk.animateX(iEZpvd);
            }
            if (jhz != null && (jhwEZpvd = jhz.EZpvd()) != null && jhwEZpvd.AhwBna()) {
                EZpvd(lineDataSetOLrzqt, jhz, false);
            }
            postDelayed(new java.lang.Runnable() { // from class: o.jIb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    jHY.OLrzqt(this.KWHzl, jhz);
                }
            }, iEZpvd);
            this.DbNXlk.invalidate();
        }
    }

    public static final void OLrzqt(jHY jhy, jHZ jhz) {
        jHW jhwEZpvd;
        jhy.DbNXlk.invalidate();
        jHZ jhz2 = jhy.KWHzl;
        if (jhz2 == null || (jhwEZpvd = jhz2.EZpvd()) == null || !jhwEZpvd.AkhnZx()) {
            return;
        }
        jhy.copydefault(jhz);
    }

    public final int EZpvd(int i, int i2) {
        float f;
        float f2;
        int i3;
        if (i <= 0) {
            i3 = 0;
        } else {
            if (i <= 7) {
                f = i2;
                f2 = 0.3f;
            } else if (i <= 90) {
                f = i2;
                f2 = 0.5f;
            } else {
                f = i2;
                f2 = 0.7f;
            }
            i3 = (int) (f * f2);
        }
        return C56548yJl.copydefault(i3, 150);
    }

    public final void copydefault(jHZ jhz) {
        jHZ jhz2;
        jHW jhwEZpvd;
        java.lang.Object next;
        java.lang.Object next2 = null;
        java.util.List<C25833jIa> listAEQbTJ = jhz != null ? jhz.AEQbTJ() : null;
        if (listAEQbTJ == null || listAEQbTJ.isEmpty() || (jhz2 = this.KWHzl) == null || (jhwEZpvd = jhz2.EZpvd()) == null || !jhwEZpvd.AkhnZx()) {
            KWHzl();
            return;
        }
        java.util.List<C25833jIa> listAEQbTJ2 = jhz.AEQbTJ();
        java.util.Iterator<T> it = listAEQbTJ2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fOLrzqt = ((C25833jIa) next).OLrzqt();
                do {
                    java.lang.Object next3 = it.next();
                    float fOLrzqt2 = ((C25833jIa) next3).OLrzqt();
                    if (java.lang.Float.compare(fOLrzqt, fOLrzqt2) < 0) {
                        next = next3;
                        fOLrzqt = fOLrzqt2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        final C25833jIa c25833jIa = (C25833jIa) next;
        java.util.Iterator<T> it2 = listAEQbTJ2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float fOLrzqt3 = ((C25833jIa) next2).OLrzqt();
                do {
                    java.lang.Object next4 = it2.next();
                    float fOLrzqt4 = ((C25833jIa) next4).OLrzqt();
                    if (java.lang.Float.compare(fOLrzqt3, fOLrzqt4) > 0) {
                        next2 = next4;
                        fOLrzqt3 = fOLrzqt4;
                    }
                } while (it2.hasNext());
            }
        }
        final C25833jIa c25833jIa2 = (C25833jIa) next2;
        if (c25833jIa != null && c25833jIa2 != null) {
            post(new java.lang.Runnable() { // from class: o.jIf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    jHY.KWHzl(this.AEQbTJ, c25833jIa, c25833jIa2);
                }
            });
        } else {
            KWHzl();
        }
    }

    public static final void KWHzl(jHY jhy, C25833jIa c25833jIa, C25833jIa c25833jIa2) {
        DataRenderer renderer = jhy.DbNXlk.getRenderer();
        C25839jIg c25839jIg = renderer instanceof C25839jIg ? (C25839jIg) renderer : null;
        if (c25839jIg != null) {
            c25839jIg.KWHzl(c25833jIa, c25833jIa2);
        }
        jhy.DbNXlk.invalidate();
    }

    public final void KWHzl() {
        DataRenderer renderer = this.DbNXlk.getRenderer();
        C25839jIg c25839jIg = renderer instanceof C25839jIg ? (C25839jIg) renderer : null;
        if (c25839jIg != null) {
            c25839jIg.KWHzl(null, null);
        }
        this.DbNXlk.invalidate();
    }

    public final void AEQbTJ() {
        jHZ jhz = this.KWHzl;
        if (jhz == null || !jhz.EZpvd().AkhnZx()) {
            return;
        }
        copydefault(jhz);
    }

    public final java.lang.String AEQbTJ(float f) {
        jHZ jhz = this.KWHzl;
        if (jhz == null) {
            return java.lang.String.valueOf(f);
        }
        int i = (int) f;
        return (i < 0 || i >= jhz.AEQbTJ().size()) ? "" : pTA.formatDate$default(new Date(C33129mqd.valueOf(jhz.AEQbTJ().get(i).KWHzl())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.AkhnZx.OLrzqt();
    }
}
