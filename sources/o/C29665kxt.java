package o;

import android.view.Choreographer;
import android.view.View;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.jobs.MoveViewJob;
import com.github.mikephil.charting.jobs.ZoomJob;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.SignalOverviewLineChart$setupChart$4$onChartTranslate$1;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29665kxt extends LineChart {
    public boolean AYXKKw;
    public boolean AhwBna;
    public final LineDataSet AkhnZx;
    public InterfaceC29581kwO AuCTel;
    public Application DbNXlk;
    public final CoroutineScope EZpvd;
    public final LineDataSet KWHzl;
    public TaskDescription OLrzqt;
    public final android.view.Choreographer copydefault;
    public boolean djBIcL;
    public Job ejfBZ;
    public java.lang.Float fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public float isConnected;
    public final StateListAnimator valueOf;
    public float values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.kxt$TaskDescription */
    public interface TaskDescription {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29665kxt(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:68) call: o.kxt.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29665kxt(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29665kxt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = new LineDataSet(yDY.AhwBna(), "KLine");
        this.KWHzl = new LineDataSet(yDY.AhwBna(), "BuySellMarkers");
        this.EZpvd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.copydefault = android.view.Choreographer.getInstance();
        setupChart();
        this.valueOf = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.kxt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kxt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void OLrzqt() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
            java.lang.reflect.Field declaredField = MoveViewJob.class.getDeclaredField("pool");
            declaredField.setAccessible(true);
            declaredField.set(null, com.github.mikephil.charting.utils.ObjectPool.create(2, new MoveViewJob(null, 0.0f, 0.0f, null, null)));
            MoveViewJob.getInstance(null, 0.0f, 0.0f, null, null);
            java.lang.reflect.Field declaredField2 = ZoomJob.class.getDeclaredField("pool");
            declaredField2.setAccessible(true);
            declaredField2.set(null, com.github.mikephil.charting.utils.ObjectPool.create(2, new ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null)));
            ZoomJob.getInstance(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
        }
    }

    /* JADX INFO: renamed from: o.kxt$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((SignalOverviewKLineUiModel.DataPoint) t).AEQbTJ()), java.lang.Long.valueOf(((SignalOverviewKLineUiModel.DataPoint) t2).AEQbTJ()));
        }
    }

    /* JADX INFO: renamed from: o.kxt$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((BuySellMarker) t).copydefault()), java.lang.Long.valueOf(((BuySellMarker) t2).copydefault()));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x006b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0067 */
    /* JADX DEBUG: Type inference failed for r5v0. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r5v9. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        ?? r10;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        try {
            if (getMarker() != null && getHighlighted() != null) {
                Highlight[] highlighted = getHighlighted();
                Intrinsics.checkNotNullExpressionValue(highlighted, "");
                int length = highlighted.length;
                int i = 0;
                if (!(length == 0)) {
                    IMarker marker = getMarker();
                    Highlight highlight = getHighlighted()[0];
                    LineData lineData = (LineData) getData();
                    ILineDataSet iLineDataSet = lineData != null ? (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex()) : null;
                    if (iLineDataSet != null) {
                        float x = highlight.getX();
                        int entryCount = iLineDataSet.getEntryCount();
                        float f = Float.MAX_VALUE;
                        r10 = 0;
                        while (i < entryCount) {
                            ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
                            float fAbs = java.lang.Math.abs(entryForIndex.getX() - x);
                            if (fAbs < f) {
                                r10 = entryForIndex;
                                f = fAbs;
                            }
                            i++;
                            r10 = r10;
                        }
                    } else {
                        r10 = 0;
                    }
                    if (r10 != 0 && (marker instanceof Application)) {
                        MPPointD pixelForValues = getTransformer(highlight.getAxis()).getPixelForValues(r10.getX(), r10.getY() * getAnimator().getPhaseY());
                        MPPointF offsetForDrawingAtPoint = ((Application) marker).getOffsetForDrawingAtPoint((float) pixelForValues.x, (float) pixelForValues.y);
                        double d = pixelForValues.x + ((double) offsetForDrawingAtPoint.x);
                        double d2 = pixelForValues.y + ((double) offsetForDrawingAtPoint.y);
                        double width = ((Application) marker).getWidth();
                        double height = ((Application) marker).getHeight();
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        double d3 = x2;
                        if (d3 >= d && d3 <= width + d) {
                            double d4 = y;
                            if (d4 >= d2 && d4 <= height + d2) {
                                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                                motionEventObtain.setLocation(C33129mqd.djBIcL(java.lang.Double.valueOf(d3 - d)), C33129mqd.djBIcL(java.lang.Double.valueOf(d4 - d2)));
                                boolean zDispatchTouchEvent = ((Application) marker).dispatchTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                if (motionEvent.getAction() == 1) {
                                    Application application = marker instanceof Application ? (Application) marker : null;
                                    if (application != null) {
                                        application.KWHzl();
                                    }
                                }
                                if (zDispatchTouchEvent) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SignalOverviewLineChart", "Error in onTouchEvent: " + e.getMessage(), e);
            return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: o.kxt$Application */
    public static final class Application extends MarkerView {
        public final android.widget.TextView EZpvd;
        public Entry KWHzl;
        public final android.widget.TextView OLrzqt;
        public InterfaceC29581kwO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(InterfaceC29581kwO interfaceC29581kwO) {
            this.copydefault = interfaceC29581kwO;
        }

        /* JADX INFO: renamed from: o.kxt$Application$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ Application AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, Application application) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.AEQbTJ = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.AEQbTJ.OLrzqt();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.content.Context context, int i, InterfaceC29581kwO interfaceC29581kwO) {
            super(context, i);
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = interfaceC29581kwO;
            android.view.View viewFindViewById = findViewById(C23274hvD.Application.createIntentactivity_release);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = findViewById(C23274hvD.Application.ActivityResultContractsRequestMultiplePermissionsCompanion);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById2;
            setOnClickListener(new Activity(this, 1000L, this));
        }

        public final void setStickyEntry(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "");
            this.KWHzl = entry;
            refreshContent(entry, new Highlight(entry.getX(), entry.getY(), 0));
        }

        public final void KWHzl() {
            OLrzqt();
        }

        public final void OLrzqt() {
            InterfaceC29581kwO interfaceC29581kwO;
            Entry entry = this.KWHzl;
            java.lang.Object data = entry != null ? entry.getData() : null;
            BuySellMarker buySellMarker = data instanceof BuySellMarker ? (BuySellMarker) data : null;
            if (buySellMarker == null || (interfaceC29581kwO = this.copydefault) == null) {
                return;
            }
            interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.LoaderManager(buySellMarker.OLrzqt()));
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public void refreshContent(Entry entry, Highlight highlight) {
            if (highlight != null) {
                if (highlight.getDataSetIndex() != 1) {
                    if (Intrinsics.EZpvd(entry, this.KWHzl)) {
                        setVisibility(0);
                        java.lang.Object data = entry != null ? entry.getData() : null;
                        BuySellMarker buySellMarker = data instanceof BuySellMarker ? (BuySellMarker) data : null;
                        if (buySellMarker == null) {
                            return;
                        }
                        this.EZpvd.setText(buySellMarker.KWHzl());
                        this.OLrzqt.setText(buySellMarker.EZpvd());
                        super.refreshContent(entry, highlight);
                        return;
                    }
                    return;
                }
                setVisibility(8);
            }
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public MPPointF getOffset() {
            return new MPPointF(-(getWidth() / 2.0f), (-getHeight()) - 34.0f);
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
            float width = getWidth();
            float height = getHeight();
            float width2 = getChartView() != null ? r2.getWidth() : 0.0f;
            float height2 = getChartView() != null ? r4.getHeight() : 0.0f;
            float f3 = -(width / 2.0f);
            float f4 = (-height) - 34.0f;
            if (f2 + f4 >= 0.0f) {
                float f5 = f + f3;
                if (f5 < 0.0f) {
                    f3 = -f;
                } else if (f5 + width > width2) {
                    f3 = (width2 - f) - width;
                }
                return new MPPointF(f3, f4);
            }
            if (f2 + 34.0f + height <= height2) {
                float f6 = f + f3;
                if (f6 < 0.0f) {
                    f3 = -f;
                } else if (f6 + width > width2) {
                    f3 = (width2 - f) - width;
                }
                return new MPPointF(f3, 34.0f);
            }
            return new MPPointF(f3, f4);
        }

        public final void copydefault() {
            this.KWHzl = null;
            setVisibility(8);
        }
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataRenderer renderer = getRenderer();
        C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
        if (c29660kxo != null) {
            c29660kxo.EZpvd();
        }
        KWHzl();
    }

    public final void KWHzl() {
        try {
            if (this.DbNXlk != null) {
                copydefault();
            }
            AEQbTJ();
            EZpvd();
            DataRenderer renderer = getRenderer();
            C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
            if (c29660kxo != null) {
                c29660kxo.EZpvd();
            }
            this.AuCTel = null;
            this.OLrzqt = null;
            CoroutineScopeKt.cancel$default(this.EZpvd, null, 1, null);
            Job job = this.ejfBZ;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.ejfBZ = null;
            setRenderer(null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SignalOverviewLineChart", "Error during cleanup: " + e.getMessage(), e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DataRenderer renderer = getRenderer();
        C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
        if (c29660kxo == null) {
            return;
        }
        Entry entryAEQbTJ = c29660kxo.AEQbTJ();
        if (entryAEQbTJ != null) {
            OLrzqt();
            android.graphics.drawable.Drawable icon = entryAEQbTJ.getIcon();
            BuySellMarker.Activity activity = icon instanceof BuySellMarker.Activity ? (BuySellMarker.Activity) icon : null;
            if (activity != null) {
                activity.KWHzl();
            }
        }
        java.lang.Float f = this.fetchVPNInfo;
        if (f != null) {
            final float fFloatValue = f.floatValue();
            if (c29660kxo.AEQbTJ() != null || this.KWHzl.getEntryCount() <= 0) {
                return;
            }
            post(new java.lang.Runnable() { // from class: o.kxv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C29665kxt.KWHzl(this.EZpvd, fFloatValue);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: o.kxt$Application */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: o.kxt$Application */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: o.kxt$Application */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry, java.lang.Object] */
    public static final void KWHzl(C29665kxt c29665kxt, float f) {
        if (c29665kxt.isAttachedToWindow()) {
            int entryCount = c29665kxt.KWHzl.getEntryCount();
            for (int i = 0; i < entryCount; i++) {
                ?? entryForIndex = c29665kxt.KWHzl.getEntryForIndex(i);
                if (entryForIndex.getX() == f) {
                    c29665kxt.AYXKKw();
                    Application application = c29665kxt.DbNXlk;
                    Application application2 = application;
                    if (application == null) {
                        Intrinsics.gEmmrt("");
                        application2 = 0;
                    }
                    Intrinsics.copydefault((java.lang.Object) entryForIndex);
                    application2.setStickyEntry(entryForIndex);
                    c29665kxt.highlightValue(new Highlight(entryForIndex.getX(), entryForIndex.getY(), 0));
                    return;
                }
            }
        }
    }

    public final void setupChart() {
        getAxisRight().setEnabled(false);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        setPinchZoom(false);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Application application = null;
        Application application2 = new Application(context, C23274hvD.Activity.OWSZPf, null);
        this.DbNXlk = application2;
        application2.setChartView(this);
        Application application3 = this.DbNXlk;
        if (application3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            application = application3;
        }
        setMarker(application);
        setScaleXEnabled(false);
        setAutoScaleMinMaxEnabled(true);
        setDoubleTapToZoomEnabled(false);
        setDragYEnabled(false);
        setDragDecelerationEnabled(false);
        setExtraOffsets(17.0f, 0.0f, 0.0f, 17.0f);
        setUnbindEnabled(true);
        XAxis xAxis = getXAxis();
        xAxis.setAvoidFirstLastClipping(true);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(3, true);
        xAxis.setGranularity(1.0f);
        xAxis.setGranularityEnabled(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(getContext().getColor(C52761wXj.Activity.QwvEab));
        xAxis.setTextSize(12.0f);
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        ChartAnimator animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setRenderer(new C29660kxo(this, viewPortHandler, animator, C55298xhM.EZpvd(24.0f, context2)));
        setOnChartValueSelectedListener(new PendingIntent());
        setOnChartGestureListener(new Fragment());
    }

    /* JADX INFO: renamed from: o.kxt$PendingIntent */
    public static final class PendingIntent implements OnChartValueSelectedListener {
        public final int AEQbTJ;

        public PendingIntent() {
            android.content.Context context = C29665kxt.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.AEQbTJ = C55298xhM.OLrzqt(18, context);
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (entry == null || highlight == null) {
                return;
            }
            java.lang.Object obj = null;
            if (highlight.getDataSetIndex() == 1) {
                C29665kxt.this.highlightValue((Highlight) null, false);
                return;
            }
            float[] fArr = {entry.getX(), entry.getY()};
            C29665kxt.this.getTransformer(YAxis.AxisDependency.LEFT).pointValuesToPixel(fArr);
            float f = C29665kxt.this.values - fArr[0];
            float f2 = C29665kxt.this.isConnected - fArr[1];
            if (((float) java.lang.Math.sqrt((f * f) + (f2 * f2))) > this.AEQbTJ) {
                C29665kxt.this.highlightValue((Highlight) null, false);
                return;
            }
            if (highlight.getDataSetIndex() == 0) {
                java.util.List<T> values = C29665kxt.this.KWHzl.getValues();
                Intrinsics.checkNotNullExpressionValue(values, "");
                java.util.ListIterator listIterator = values.listIterator(values.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    java.lang.Object objPrevious = listIterator.previous();
                    if (((Entry) objPrevious).getX() == entry.getX()) {
                        obj = objPrevious;
                        break;
                    }
                }
                Entry entry2 = (Entry) obj;
                if (entry2 != null) {
                    C29665kxt.this.AEQbTJ(entry2, true);
                }
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            C29665kxt.this.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.kxt$Fragment */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Fragment implements OnChartGestureListener {
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

        public Fragment() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            try {
                C29665kxt.this.values = motionEvent.getX();
                C29665kxt.this.isConnected = motionEvent.getY();
                Highlight highlightByTouchPoint = C29665kxt.this.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
                if (highlightByTouchPoint == null || highlightByTouchPoint.getDataSetIndex() != 0) {
                    C29665kxt.this.copydefault();
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("SignalOverviewLineChart", "Error in onChartSingleTapped: " + e.getMessage(), e);
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
            TaskDescription taskDescription;
            try {
                if (C29665kxt.this.getHighlighted() != null) {
                    C29665kxt.this.highlightValues(null);
                }
                if (C29665kxt.this.AYXKKw && C29665kxt.this.getLowestVisibleX() <= 0.0f && (taskDescription = C29665kxt.this.OLrzqt) != null) {
                    taskDescription.copydefault();
                }
                Job job = C29665kxt.this.ejfBZ;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                C29665kxt c29665kxt = C29665kxt.this;
                c29665kxt.ejfBZ = BuildersKt__Builders_commonKt.launch$default(c29665kxt.EZpvd, null, null, new SignalOverviewLineChart$setupChart$4$onChartTranslate$1(C29665kxt.this, null), 3, null);
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("SignalOverviewLineChart", "Error in onChartTranslate: " + e.getMessage(), e);
            }
        }
    }

    public final void OLrzqt(InterfaceC29581kwO interfaceC29581kwO, TaskDescription taskDescription, boolean z, boolean z2) {
        this.AuCTel = interfaceC29581kwO;
        this.OLrzqt = taskDescription;
        this.AhwBna = z;
        this.AYXKKw = z2;
        Application application = this.DbNXlk;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        application.AEQbTJ(interfaceC29581kwO);
    }

    public static /* synthetic */ void setData$default(C29665kxt c29665kxt, java.util.List list, java.util.List list2, TimeIntervalSelector timeIntervalSelector, java.lang.String str, java.lang.Float f, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            f = null;
        }
        c29665kxt.setData(list, list2, timeIntervalSelector, str, f);
    }

    /* JADX INFO: renamed from: o.kxt$LoaderManager */
    public static final class LoaderManager extends ValueFormatter {
        public final /* synthetic */ java.util.List<SignalOverviewKLineUiModel.DataPoint> EZpvd;
        public final java.util.Map<java.lang.Integer, java.lang.String> KWHzl = new LinkedHashMap();

        public LoaderManager(java.util.List<SignalOverviewKLineUiModel.DataPoint> list) {
            this.EZpvd = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            int i = (int) f;
            java.util.Map<java.lang.Integer, java.lang.String> map = this.KWHzl;
            java.util.List<SignalOverviewKLineUiModel.DataPoint> list = this.EZpvd;
            java.lang.String str = map.get(java.lang.Integer.valueOf(i));
            if (str == null) {
                SignalOverviewKLineUiModel.DataPoint dataPoint = (SignalOverviewKLineUiModel.DataPoint) CollectionsKt___CollectionsKt.AkhnZx(list, i);
                return dataPoint != null ? pTA.format$default(new Date(dataPoint.AEQbTJ()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) : "";
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchVPNInfo(C29665kxt c29665kxt) {
        c29665kxt.setDragEnabled(true);
        c29665kxt.setVisibility(0);
    }

    public final void KWHzl(@NotNull final java.util.List<SignalOverviewKLineUiModel.DataPoint> list, @NotNull final java.util.List<BuySellMarker> list2, @NotNull final TimeIntervalSelector timeIntervalSelector, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = false;
        java.util.List<T> values = this.AkhnZx.getValues();
        final float lowestVisibleX = getLowestVisibleX();
        final int size = list.size() - values.size();
        this.gEmmrt = new Function0() { // from class: o.kxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29665kxt.KWHzl(this.OLrzqt, list, list2, timeIntervalSelector, str, size, lowestVisibleX);
            }
        };
    }

    public static final Unit KWHzl(C29665kxt c29665kxt, java.util.List list, java.util.List list2, TimeIntervalSelector timeIntervalSelector, java.lang.String str, int i, float f) {
        c29665kxt.setData(list, list2, timeIntervalSelector, str, i > 0 ? java.lang.Float.valueOf(f + i) : null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        AhwBna();
        DataRenderer renderer = getRenderer();
        C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
        if (c29660kxo != null) {
            c29660kxo.EZpvd();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final void EZpvd() {
        Entry entryAEQbTJ;
        BuySellMarker.Activity activity;
        try {
            int entryCount = this.KWHzl.getEntryCount();
            int i = 0;
            while (true) {
                if (i >= entryCount) {
                    break;
                }
                android.graphics.drawable.Drawable icon = this.KWHzl.getEntryForIndex(i).getIcon();
                activity = icon instanceof BuySellMarker.Activity ? (BuySellMarker.Activity) icon : null;
                if (activity != null) {
                    activity.AEQbTJ();
                }
                i++;
            }
            DataRenderer renderer = getRenderer();
            C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
            if (c29660kxo == null || (entryAEQbTJ = c29660kxo.AEQbTJ()) == null) {
                return;
            }
            android.graphics.drawable.Drawable icon2 = entryAEQbTJ.getIcon();
            activity = icon2 instanceof BuySellMarker.Activity ? (BuySellMarker.Activity) icon2 : null;
            if (activity != null) {
                activity.AEQbTJ();
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SignalOverviewLineChart", "Error cleaning up ripple animations: " + e.getMessage(), e);
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<T> values = this.KWHzl.getValues();
        Intrinsics.checkNotNullExpressionValue(values, "");
        java.util.ListIterator listIterator = values.listIterator(values.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            java.lang.Object objPrevious = listIterator.previous();
            java.lang.Object data = ((Entry) objPrevious).getData();
            BuySellMarker buySellMarker = data instanceof BuySellMarker ? (BuySellMarker) data : null;
            if (Intrinsics.EZpvd(buySellMarker != null ? buySellMarker.AEQbTJ() : null, (java.lang.Object) str)) {
                obj = objPrevious;
                break;
            }
        }
        Entry entry = (Entry) obj;
        if (entry == null || Intrinsics.copydefault(entry.getX(), this.fetchVPNInfo)) {
            return;
        }
        AEQbTJ(entry, false);
    }

    public static /* synthetic */ void selectBuySellMarkerEntry$default(C29665kxt c29665kxt, Entry entry, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c29665kxt.AEQbTJ(entry, z);
    }

    public final void AEQbTJ(Entry entry, boolean z) {
        InterfaceC29581kwO interfaceC29581kwO;
        this.fetchVPNInfo = java.lang.Float.valueOf(entry.getX());
        AYXKKw();
        Application application = this.DbNXlk;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        application.setStickyEntry(entry);
        highlightValue(new Highlight(entry.getX(), entry.getY(), 0));
        java.lang.Object data = entry.getData();
        BuySellMarker buySellMarker = data instanceof BuySellMarker ? (BuySellMarker) data : null;
        if (buySellMarker == null || (interfaceC29581kwO = this.AuCTel) == null) {
            return;
        }
        interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.FragmentManager(buySellMarker, this.AhwBna, z));
    }

    public final void copydefault() {
        Application application = this.DbNXlk;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        application.copydefault();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final void AYXKKw() {
        int entryCount = this.KWHzl.getEntryCount();
        for (int i = 0; i < entryCount; i++) {
            ?? entryForIndex = this.KWHzl.getEntryForIndex(i);
            android.graphics.drawable.Drawable icon = entryForIndex.getIcon();
            BuySellMarker.Activity activity = icon instanceof BuySellMarker.Activity ? (BuySellMarker.Activity) icon : null;
            if (activity != null) {
                activity.AEQbTJ();
            }
            java.lang.Object data = entryForIndex.getData();
            BuySellMarker buySellMarker = data instanceof BuySellMarker ? (BuySellMarker) data : null;
            if (buySellMarker != null) {
                if (Intrinsics.copydefault(entryForIndex.getX(), this.fetchVPNInfo)) {
                    OLrzqt();
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    BuySellMarker.Activity activityOLrzqt = buySellMarker.OLrzqt(context, true);
                    final WeakReference weakReference = new WeakReference(this);
                    activityOLrzqt.EZpvd(new Function0() { // from class: o.kxC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29665kxt.EZpvd(weakReference);
                        }
                    });
                    activityOLrzqt.OLrzqt(new Function0() { // from class: o.kxz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29665kxt.AEQbTJ(weakReference);
                        }
                    });
                    entryForIndex.setIcon(null);
                    DataRenderer renderer = getRenderer();
                    C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
                    if (c29660kxo != null) {
                        c29660kxo.OLrzqt(new Entry(entryForIndex.getX(), entryForIndex.getY(), activityOLrzqt, buySellMarker));
                    }
                } else {
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    entryForIndex.setIcon(BuySellMarker.createDrawable$default(buySellMarker, context2, false, 2, null));
                }
            }
        }
        postInvalidateOnAnimation();
    }

    public static final Unit EZpvd(WeakReference weakReference) {
        C29665kxt c29665kxt = (C29665kxt) weakReference.get();
        if (c29665kxt != null) {
            c29665kxt.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(WeakReference weakReference) {
        C29665kxt c29665kxt = (C29665kxt) weakReference.get();
        if (c29665kxt != null) {
            c29665kxt.AhwBna();
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            this.copydefault.removeFrameCallback(this.valueOf);
        } else if (this.djBIcL) {
            this.copydefault.postFrameCallback(this.valueOf);
        }
    }

    /* JADX INFO: renamed from: o.kxt$StateListAnimator */
    public static final class StateListAnimator implements Choreographer.FrameCallback {
        public StateListAnimator() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (C29665kxt.this.djBIcL) {
                C29665kxt.this.invalidate();
                C29665kxt.this.copydefault.postFrameCallback(this);
            }
        }
    }

    public final void OLrzqt() {
        if (!this.djBIcL && isAttachedToWindow() && getVisibility() == 0) {
            this.djBIcL = true;
            this.copydefault.postFrameCallback(this.valueOf);
        }
    }

    public final void AhwBna() {
        this.djBIcL = false;
        this.copydefault.removeFrameCallback(this.valueOf);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:147:0x01c5 */
    public final void setData(@NotNull java.util.List<SignalOverviewKLineUiModel.DataPoint> list, @NotNull java.util.List<BuySellMarker> list2, @NotNull TimeIntervalSelector timeIntervalSelector, @NotNull final java.lang.String str, final java.lang.Float f) {
        Application application;
        java.lang.Object next;
        java.lang.Integer next2;
        java.lang.Integer num;
        java.lang.Object next3;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        Intrinsics.checkNotNullParameter(str, "");
        setVisibility(4);
        setDragEnabled(false);
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long jAEQbTJ = ((SignalOverviewKLineUiModel.DataPoint) it.next()).AEQbTJ();
        while (it.hasNext()) {
            long jAEQbTJ2 = ((SignalOverviewKLineUiModel.DataPoint) it.next()).AEQbTJ();
            if (jAEQbTJ > jAEQbTJ2) {
                jAEQbTJ = jAEQbTJ2;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((BuySellMarker) obj).copydefault() >= jAEQbTJ) {
                arrayList.add(obj);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new Activity());
        java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Dialog());
        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = listEZpvd2.iterator();
        while (true) {
            application = null;
            if (!it2.hasNext()) {
                break;
            }
            BuySellMarker buySellMarker = (BuySellMarker) it2.next();
            kotlin.ranges.IntRange intRangeValueOf = yDY.valueOf((java.util.Collection<?>) listEZpvd);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Integer num2 : intRangeValueOf) {
                if (((SignalOverviewKLineUiModel.DataPoint) listEZpvd.get(num2.intValue())).AEQbTJ() <= buySellMarker.copydefault()) {
                    arrayList3.add(num2);
                }
            }
            if (true ^ arrayList3.isEmpty()) {
                java.util.Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (it3.hasNext()) {
                        long jAEQbTJ3 = ((SignalOverviewKLineUiModel.DataPoint) listEZpvd.get(((java.lang.Number) next3).intValue())).AEQbTJ();
                        do {
                            java.lang.Object next4 = it3.next();
                            long jAEQbTJ4 = ((SignalOverviewKLineUiModel.DataPoint) listEZpvd.get(((java.lang.Number) next4).intValue())).AEQbTJ();
                            if (jAEQbTJ3 < jAEQbTJ4) {
                                next3 = next4;
                                jAEQbTJ3 = jAEQbTJ4;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next3 = null;
                }
                num = (java.lang.Integer) next3;
            } else {
                java.util.Iterator<java.lang.Integer> it4 = yDY.valueOf((java.util.Collection<?>) listEZpvd).iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        long jAbs = java.lang.Math.abs(((SignalOverviewKLineUiModel.DataPoint) listEZpvd.get(next2.intValue())).AEQbTJ() - buySellMarker.copydefault());
                        do {
                            java.lang.Integer next5 = it4.next();
                            long jAbs2 = java.lang.Math.abs(((SignalOverviewKLineUiModel.DataPoint) listEZpvd.get(next5.intValue())).AEQbTJ() - buySellMarker.copydefault());
                            if (jAbs > jAbs2) {
                                next2 = next5;
                                jAbs = jAbs2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next2 = null;
                }
                num = next2;
            }
            kotlin.Pair pairOLrzqt = num != null ? C56390yDp.OLrzqt(java.lang.Integer.valueOf(num.intValue()), buySellMarker) : null;
            if (pairOLrzqt != null) {
                arrayList2.add(pairOLrzqt);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlin.Pair pair : arrayList2) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((java.lang.Number) pair.getFirst()).intValue());
            java.lang.Object arrayList4 = linkedHashMap.get(numValueOf);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList4);
            }
            ((java.util.List) arrayList4).add((BuySellMarker) pair.getSecond());
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            java.util.Iterator it5 = ((java.util.List) entry.getValue()).iterator();
            if (it5.hasNext()) {
                next = it5.next();
                if (it5.hasNext()) {
                    long jCopydefault = ((BuySellMarker) next).copydefault();
                    do {
                        java.lang.Object next6 = it5.next();
                        long jCopydefault2 = ((BuySellMarker) next6).copydefault();
                        if (jCopydefault < jCopydefault2) {
                            next = next6;
                            jCopydefault = jCopydefault2;
                        }
                    } while (it5.hasNext());
                }
            } else {
                next = null;
            }
            BuySellMarker buySellMarker2 = (BuySellMarker) next;
            kotlin.Pair pairOLrzqt2 = buySellMarker2 != null ? C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), buySellMarker2) : null;
            if (pairOLrzqt2 != null) {
                arrayList5.add(pairOLrzqt2);
            }
        }
        java.util.Map mapCopydefault = C56424yEw.copydefault(arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        int i = 0;
        for (java.lang.Object obj2 : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList6.add(new Entry(i, ((SignalOverviewKLineUiModel.DataPoint) obj2).OLrzqt()));
            i++;
        }
        final java.util.ArrayList arrayList7 = new java.util.ArrayList(mapCopydefault.size());
        for (Map.Entry entry2 : mapCopydefault.entrySet()) {
            int iIntValue2 = ((java.lang.Number) entry2.getKey()).intValue();
            BuySellMarker buySellMarker3 = (BuySellMarker) entry2.getValue();
            float f2 = iIntValue2;
            float fOLrzqt = ((SignalOverviewKLineUiModel.DataPoint) listEZpvd.get(iIntValue2)).OLrzqt();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            arrayList7.add(new Entry(f2, fOLrzqt, BuySellMarker.createDrawable$default(buySellMarker3, context, false, 2, null), buySellMarker3));
        }
        LineDataSet lineDataSet = this.AkhnZx;
        lineDataSet.setColor(getContext().getColor(C52761wXj.Activity.fdOvFl));
        lineDataSet.setHighlightEnabled(false);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setValues(arrayList6);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawHighlightIndicators(false);
        LineDataSet lineDataSet2 = this.KWHzl;
        lineDataSet2.setValues(arrayList7);
        lineDataSet2.setLineWidth(0.0f);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setDrawIcons(false);
        lineDataSet2.setDrawHighlightIndicators(false);
        DataRenderer renderer = getRenderer();
        C29660kxo c29660kxo = renderer instanceof C29660kxo ? (C29660kxo) renderer : null;
        if (c29660kxo != null) {
            c29660kxo.OLrzqt(null);
            Unit unit = Unit.INSTANCE;
        }
        clear();
        if (this.DbNXlk != null) {
            IMarker marker = getMarker();
            Application application2 = this.DbNXlk;
            if (application2 == null) {
                Intrinsics.gEmmrt("");
                application2 = null;
            }
            if (!Intrinsics.EZpvd(marker, application2)) {
                Application application3 = this.DbNXlk;
                if (application3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    application = application3;
                }
                setMarker(application);
            }
        }
        copydefault();
        AEQbTJ();
        fitScreen();
        setData(new LineData(this.KWHzl, this.AkhnZx));
        getXAxis().setValueFormatter(new LoaderManager(listEZpvd));
        notifyDataSetChanged();
        float maxNoOfXPoints = timeIntervalSelector.getMaxNoOfXPoints();
        if (listEZpvd.size() >= maxNoOfXPoints) {
            setVisibleXRange(maxNoOfXPoints, maxNoOfXPoints);
        }
        post(new java.lang.Runnable() { // from class: o.kxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29665kxt.setData$lambda$27(arrayList7, this, str, f);
            }
        });
    }

    public static final void setData$lambda$27(java.util.List list, final C29665kxt c29665kxt, java.lang.String str, java.lang.Float f) {
        java.lang.Object next;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.Object data = ((Entry) next).getData();
            BuySellMarker buySellMarker = data instanceof BuySellMarker ? (BuySellMarker) data : null;
            if (Intrinsics.EZpvd((java.lang.Object) (buySellMarker != null ? buySellMarker.AEQbTJ() : null), (java.lang.Object) str)) {
                break;
            }
        }
        Entry entry = (Entry) next;
        if (entry != null) {
            selectBuySellMarkerEntry$default(c29665kxt, entry, false, 2, null);
            if (f != null) {
                c29665kxt.moveViewToX(f.floatValue());
            } else {
                c29665kxt.centerViewTo(entry.getX(), entry.getY(), YAxis.AxisDependency.LEFT);
            }
        }
        c29665kxt.post(new java.lang.Runnable() { // from class: o.kxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29665kxt.fetchVPNInfo(this.EZpvd);
            }
        });
    }
}
