package o;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.market_place.my_bot.view.MyBotAssetDateType;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51722vsQ extends android.widget.LinearLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public InterfaceC51726vsU AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public MyBotAssetDateType EZpvd;
    public boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public C51725vsT djBIcL;
    public BotUserSummaryData fetchVPNInfo;
    public Entry gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public Entry valueOf;

    /* JADX INFO: renamed from: o.vsQ$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MyBotAssetDateType.values().length];
            try {
                iArr[MyBotAssetDateType.ONE_DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.vsQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vsQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final android.widget.TextView AhwBna() {
        return (android.widget.TextView) this.AYXKKw.getValue();
    }

    public static final android.widget.TextView gEmmrt(C51722vsQ c51722vsQ) {
        return (android.widget.TextView) c51722vsQ.findViewById(C48033uCm.Application.rateWithExtras);
    }

    private final android.widget.TextView valueOf() {
        return (android.widget.TextView) this.isConnected.getValue();
    }

    public static final android.widget.TextView AhwBna(C51722vsQ c51722vsQ) {
        return (android.widget.TextView) c51722vsQ.findViewById(C48033uCm.Application.setVolumeTo);
    }

    private final android.widget.TextView gEmmrt() {
        return (android.widget.TextView) this.AkhnZx.getValue();
    }

    public static final android.widget.TextView djBIcL(C51722vsQ c51722vsQ) {
        return (android.widget.TextView) c51722vsQ.findViewById(C48033uCm.Application.OnBackPressedDispatcher1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C51731vsZ AEQbTJ() {
        return (C51731vsZ) this.copydefault.getValue();
    }

    public static final C51731vsZ AYXKKw(C51722vsQ c51722vsQ) {
        return (C51731vsZ) c51722vsQ.findViewById(C48033uCm.Application.DcMfJKffREWX);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51722vsQ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vsO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.gEmmrt(this.AEQbTJ);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.vsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.AhwBna(this.OLrzqt);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.vsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.djBIcL(this.KWHzl);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.AYXKKw(this.copydefault);
            }
        });
        this.OLrzqt = true;
        this.EZpvd = MyBotAssetDateType.ONE_DAY;
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51722vsQ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vsO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.gEmmrt(this.AEQbTJ);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.vsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.AhwBna(this.OLrzqt);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.vsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.djBIcL(this.KWHzl);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.AYXKKw(this.copydefault);
            }
        });
        this.OLrzqt = true;
        this.EZpvd = MyBotAssetDateType.ONE_DAY;
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51722vsQ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vsO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.gEmmrt(this.AEQbTJ);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.vsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.AhwBna(this.OLrzqt);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.vsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.djBIcL(this.KWHzl);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51722vsQ.AYXKKw(this.copydefault);
            }
        });
        this.OLrzqt = true;
        this.EZpvd = MyBotAssetDateType.ONE_DAY;
        KWHzl(context);
    }

    public final void KWHzl(android.content.Context context) {
        android.view.View.inflate(context, C48033uCm.Activity.aeJQwa, this);
        copydefault();
    }

    public final void copydefault() {
        C51731vsZ c51731vsZAEQbTJ = AEQbTJ();
        c51731vsZAEQbTJ.setViewPortOffsets(3.0f, 0.0f, 3.0f, C55298xhM.dp2pxFloat$default(20.0f, null, 1, null));
        c51731vsZAEQbTJ.setScaleEnabled(false);
        c51731vsZAEQbTJ.setPinchZoom(false);
        c51731vsZAEQbTJ.setTouchEnabled(true);
        c51731vsZAEQbTJ.setNoDataText("");
        c51731vsZAEQbTJ.setClipDataToContent(false);
        c51731vsZAEQbTJ.getLegend().setEnabled(false);
        c51731vsZAEQbTJ.getDescription().setEnabled(false);
        c51731vsZAEQbTJ.getXAxis().setEnabled(false);
        c51731vsZAEQbTJ.getAxisLeft().setEnabled(false);
        c51731vsZAEQbTJ.getAxisLeft().setSpaceTop(10.0f);
        c51731vsZAEQbTJ.getAxisLeft().setSpaceBottom(0.0f);
        c51731vsZAEQbTJ.getAxisRight().setSpaceTop(10.0f);
        c51731vsZAEQbTJ.getAxisRight().setSpaceBottom(0.0f);
        c51731vsZAEQbTJ.getAxisRight().setEnabled(false);
        c51731vsZAEQbTJ.setRenderer(new C51729vsX(AEQbTJ(), c51731vsZAEQbTJ.getAnimator(), c51731vsZAEQbTJ.getViewPortHandler()));
        DataRenderer renderer = c51731vsZAEQbTJ.getRenderer();
        if (renderer instanceof LineChartRenderer) {
            LineChartRenderer lineChartRenderer = (LineChartRenderer) renderer;
            lineChartRenderer.getPaintRender().setAntiAlias(true);
            lineChartRenderer.getPaintRender().setStrokeJoin(Paint.Join.ROUND);
            lineChartRenderer.getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        }
        setListener();
    }

    public final void setListener() {
        C51731vsZ c51731vsZAEQbTJ = AEQbTJ();
        c51731vsZAEQbTJ.setHighlightPerDragEnabled(false);
        c51731vsZAEQbTJ.setHighlightPerTapEnabled(false);
        c51731vsZAEQbTJ.setOnChartValueSelectedListener(new Activity(c51731vsZAEQbTJ));
        c51731vsZAEQbTJ.setOnChartGestureListener(new Application(c51731vsZAEQbTJ, this));
    }

    /* JADX INFO: renamed from: o.vsQ$Activity */
    public static final class Activity extends C51727vsV {
        public final /* synthetic */ C51731vsZ OLrzqt;

        public Activity(C51731vsZ c51731vsZ) {
            this.OLrzqt = c51731vsZ;
        }

        @Override // o.C51727vsV, com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            super.onValueSelected(entry, highlight);
            MPPointF position = C51722vsQ.this.AEQbTJ().getPosition(entry, YAxis.AxisDependency.LEFT);
            if (position != null && entry != null && entry.getData() != null) {
                InterfaceC51726vsU interfaceC51726vsU = C51722vsQ.this.AEQbTJ;
                if (interfaceC51726vsU != null) {
                    interfaceC51726vsU.EZpvd(entry);
                }
                C51722vsQ.this.copydefault(false);
                C51722vsQ.this.KWHzl(true, position.x, entry);
                C51722vsQ.this.EZpvd();
                return;
            }
            this.OLrzqt.highlightValue(null);
        }
    }

    /* JADX INFO: renamed from: o.vsQ$Application */
    public static final class Application extends C51724vsS {
        public final /* synthetic */ C51722vsQ EZpvd;
        public final /* synthetic */ C51731vsZ KWHzl;

        public Application(C51731vsZ c51731vsZ, C51722vsQ c51722vsQ) {
            this.KWHzl = c51731vsZ;
            this.EZpvd = c51722vsQ;
        }

        @Override // o.C51724vsS, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
            if (motionEvent != null) {
                C51731vsZ c51731vsZ = this.KWHzl;
                C51722vsQ c51722vsQ = this.EZpvd;
                Highlight highlightByTouchPoint = c51731vsZ.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
                if (highlightByTouchPoint != null) {
                    c51731vsZ.setHighlightPerDragEnabled(true);
                    c51731vsZ.setHighlightPerTapEnabled(true);
                    Entry entryByTouchPoint = c51731vsZ.getEntryByTouchPoint(motionEvent.getX(), motionEvent.getY());
                    if (entryByTouchPoint != null && entryByTouchPoint.getData() != null) {
                        InterfaceC51726vsU interfaceC51726vsU = c51722vsQ.AEQbTJ;
                        if (interfaceC51726vsU != null) {
                            interfaceC51726vsU.copydefault(entryByTouchPoint);
                        }
                        c51731vsZ.highlightValue(highlightByTouchPoint);
                        c51722vsQ.copydefault(false);
                        c51722vsQ.KWHzl(true, motionEvent.getX(), entryByTouchPoint);
                    }
                    c51731vsZ.requestDisallowInterceptTouchEvent(true);
                }
            }
        }

        @Override // o.C51724vsS, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            this.KWHzl.setHighlightPerDragEnabled(false);
            this.KWHzl.setHighlightPerTapEnabled(false);
            this.KWHzl.highlightValue(null);
            this.EZpvd.copydefault(true);
            this.EZpvd.KWHzl(false, 0.0f, null);
            this.KWHzl.requestDisallowInterceptTouchEvent(false);
            InterfaceC51726vsU interfaceC51726vsU = this.EZpvd.AEQbTJ;
            if (interfaceC51726vsU != null) {
                interfaceC51726vsU.copydefault();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v19, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(@NotNull java.util.List<? extends Entry> list, boolean z, @NotNull Entry entry, @NotNull Entry entry2, @NotNull MyBotAssetDateType myBotAssetDateType, java.lang.String str, BotUserSummaryData botUserSummaryData, InterfaceC51726vsU interfaceC51726vsU) {
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(entry, "");
        Intrinsics.checkNotNullParameter(entry2, "");
        Intrinsics.checkNotNullParameter(myBotAssetDateType, "");
        this.gEmmrt = entry;
        this.valueOf = entry2;
        this.EZpvd = myBotAssetDateType;
        this.fetchVPNInfo = botUserSummaryData;
        this.AEQbTJ = interfaceC51726vsU;
        if (str != null) {
            bigDecimalEZpvd = C33129mqd.EZpvd(str);
            if (bigDecimalEZpvd.compareTo(BigDecimal.ZERO) <= 0) {
                bigDecimalEZpvd = null;
            }
        }
        if (entry.getY() == entry2.getY()) {
            float f = 1;
            float f2 = 2;
            AEQbTJ().getAxisLeft().setAxisMaximum(entry.getY() + f + (entry.getY() / f2));
            AEQbTJ().getAxisLeft().setAxisMinimum((entry2.getY() - f) - (entry2.getY() / f2));
        } else if (bigDecimalEZpvd != null) {
            double dDivD$default = C33129mqd.divD$default(C33129mqd.EZpvd(java.lang.Float.valueOf(entry.getY() + entry2.getY())), C33129mqd.EZpvd(java.lang.Float.valueOf(2.0f)), null, null, null, 14, null);
            double dMulD$default = C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), bigDecimalEZpvd, null, null, null, 14, null);
            double dMulD$default2 = C33129mqd.mulD$default(java.lang.Double.valueOf(C33129mqd.subD$default(java.lang.Float.valueOf(entry.getY()), java.lang.Float.valueOf(entry2.getY()), null, null, null, 14, null)), bigDecimalEZpvd, null, null, null, 14, null);
            double dDivD$default2 = C33129mqd.divD$default(C33129mqd.EZpvd(java.lang.Float.valueOf(entry.getY())), java.lang.Double.valueOf(dDivD$default), null, null, null, 14, null);
            if (C33129mqd.valueOf(java.lang.Double.valueOf(dMulD$default), 100)) {
                if (C33129mqd.gEmmrt(java.lang.Double.valueOf(dMulD$default2), java.lang.Double.valueOf(0.1d))) {
                    double dDivD$default3 = C33129mqd.divD$default(C33129mqd.EZpvd(java.lang.Double.valueOf(0.05d)), bigDecimalEZpvd, null, null, null, 14, null);
                    AEQbTJ().getAxisLeft().setAxisMaximum((float) (dDivD$default + dDivD$default3));
                    AEQbTJ().getAxisLeft().setAxisMinimum((float) (dDivD$default - dDivD$default3));
                } else {
                    AEQbTJ().getAxisLeft().resetAxisMaximum();
                    AEQbTJ().getAxisLeft().resetAxisMinimum();
                }
            } else if (C33129mqd.valueOf(java.lang.Double.valueOf(dDivD$default2), C33129mqd.EZpvd(java.lang.Double.valueOf(1.0005d)))) {
                AEQbTJ().getAxisLeft().setAxisMaximum(entry.getY() * 1.0005f);
                AEQbTJ().getAxisLeft().setAxisMinimum(entry2.getY() * 0.9995f);
            } else {
                AEQbTJ().getAxisLeft().resetAxisMaximum();
                AEQbTJ().getAxisLeft().resetAxisMinimum();
            }
        } else {
            AEQbTJ().getAxisLeft().resetAxisMaximum();
            AEQbTJ().getAxisLeft().resetAxisMinimum();
        }
        int iEZpvd = EZpvd(z);
        int i = C52761wXj.Activity.Dff;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C33070mpX.OLrzqt(i, context);
        if (AEQbTJ().getData() != 0 && ((LineData) AEQbTJ().getData()).getDataSetCount() > 0) {
            T dataSetByIndex = ((LineData) AEQbTJ().getData()).getDataSetByIndex(0);
            Intrinsics.copydefault(dataSetByIndex, "");
            LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
            lineDataSet.setValues(list);
            lineDataSet.setColor(iEZpvd);
            C51725vsT c51725vsT = this.djBIcL;
            if (c51725vsT != null) {
                c51725vsT.setPointBg(z);
            }
            ((LineData) AEQbTJ().getData()).notifyDataChanged();
            AEQbTJ().notifyDataSetChanged();
        } else {
            LineDataSet lineDataSet2 = new LineDataSet(list, "");
            lineDataSet2.setDrawIcons(false);
            lineDataSet2.setDrawValues(false);
            lineDataSet2.setDrawCircleHole(false);
            lineDataSet2.setDrawCircles(false);
            lineDataSet2.setMode(LineDataSet.Mode.LINEAR);
            lineDataSet2.setLineWidth(1.6f);
            lineDataSet2.setColor(iEZpvd);
            lineDataSet2.setHighLightColor(iOLrzqt);
            lineDataSet2.setDrawHorizontalHighlightIndicator(false);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            lineDataSet2.setHighlightLineWidth(C55298xhM.EZpvd(0.5f, context2));
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            float fEZpvd = C55298xhM.EZpvd(3.0f, context3);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            lineDataSet2.enableDashedHighlightLine(fEZpvd, C55298xhM.EZpvd(3.0f, context4), 0.0f);
            AEQbTJ().setData(new LineData(lineDataSet2));
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            C51725vsT c51725vsT2 = new C51725vsT(context5);
            c51725vsT2.setPointBg(z);
            this.djBIcL = c51725vsT2;
            AEQbTJ().setMarker(this.djBIcL);
        }
        AEQbTJ().animateX(600);
        copydefault(true);
    }

    public final void KWHzl() {
        AEQbTJ().setData(new LineData());
        AEQbTJ().notifyDataSetChanged();
        copydefault(false);
    }

    public final void setEyesOpen(boolean z) {
        this.OLrzqt = z;
        copydefault(this.AhwBna);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        if (AEQbTJ().getData() == 0 || ((LineData) AEQbTJ().getData()).getDataSetCount() <= 0) {
            return;
        }
        T dataSetByIndex = ((LineData) AEQbTJ().getData()).getDataSetByIndex(0);
        Intrinsics.copydefault(dataSetByIndex, "");
        LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
        int iEZpvd = EZpvd(z);
        if (lineDataSet.getColor() != iEZpvd) {
            lineDataSet.setColor(iEZpvd);
            C51725vsT c51725vsT = this.djBIcL;
            if (c51725vsT != null) {
                c51725vsT.setPointBg(z);
            }
        }
    }

    public final void copydefault(final boolean z) {
        AEQbTJ().post(new java.lang.Runnable() { // from class: o.vsN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51722vsQ.KWHzl(this.OLrzqt, z);
            }
        });
    }

    public static final void KWHzl(C51722vsQ c51722vsQ, boolean z) {
        c51722vsQ.AhwBna = z;
        C51731vsZ c51731vsZAEQbTJ = c51722vsQ.AEQbTJ();
        Entry entry = c51722vsQ.gEmmrt;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        MPPointF position = c51731vsZAEQbTJ.getPosition(entry, axisDependency);
        MPPointF position2 = c51722vsQ.AEQbTJ().getPosition(c51722vsQ.valueOf, axisDependency);
        if (c51722vsQ.OLrzqt && z && position != null && position2 != null) {
            if (c51722vsQ.OLrzqt()) {
                c51722vsQ.valueOf().setText("");
                c51722vsQ.valueOf().setVisibility(8);
                android.widget.TextView textViewAhwBna = c51722vsQ.AhwBna();
                Entry entry2 = c51722vsQ.gEmmrt;
                java.lang.Object data = entry2 != null ? entry2.getData() : null;
                textViewAhwBna.setText(c51722vsQ.copydefault(data instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data : null));
                if (textViewAhwBna.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    Intrinsics.copydefault(textViewAhwBna);
                    float fDjBIcL = C55296xhK.AEQbTJ(textViewAhwBna) ? C33570myu.djBIcL(textViewAhwBna.getContext()) - position.x : position.x;
                    ViewGroup.LayoutParams layoutParams = textViewAhwBna.getLayoutParams();
                    Intrinsics.copydefault(layoutParams, "");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(c51722vsQ.EZpvd(fDjBIcL, textViewAhwBna));
                    int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(position.y));
                    ViewGroup.LayoutParams layoutParams2 = textViewAhwBna.getLayoutParams();
                    Intrinsics.copydefault(layoutParams2, "");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (iAhwBna < 0) {
                        iAhwBna = 0;
                    }
                    marginLayoutParams.topMargin = iAhwBna;
                }
                C33616mzn.EZpvd(textViewAhwBna, 600, C33616mzn.djBIcL, null, 0.0f, 1.0f);
                c51722vsQ.AhwBna().setVisibility(0);
                return;
            }
            android.widget.TextView textViewAhwBna2 = c51722vsQ.AhwBna();
            Entry entry3 = c51722vsQ.gEmmrt;
            java.lang.Object data2 = entry3 != null ? entry3.getData() : null;
            textViewAhwBna2.setText(c51722vsQ.copydefault(data2 instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data2 : null));
            if (textViewAhwBna2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                Intrinsics.copydefault(textViewAhwBna2);
                float fDjBIcL2 = C55296xhK.AEQbTJ(textViewAhwBna2) ? C33570myu.djBIcL(textViewAhwBna2.getContext()) - position.x : position.x;
                ViewGroup.LayoutParams layoutParams3 = textViewAhwBna2.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(c51722vsQ.EZpvd(fDjBIcL2, textViewAhwBna2));
                int iAhwBna2 = C33129mqd.AhwBna(java.lang.Float.valueOf(position.y));
                ViewGroup.LayoutParams layoutParams4 = textViewAhwBna2.getLayoutParams();
                Intrinsics.copydefault(layoutParams4, "");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (iAhwBna2 < 0) {
                    iAhwBna2 = 0;
                }
                marginLayoutParams2.topMargin = iAhwBna2;
            }
            android.view.animation.Interpolator interpolator = C33616mzn.djBIcL;
            C33616mzn.EZpvd(textViewAhwBna2, 600, interpolator, null, 0.0f, 1.0f);
            android.widget.TextView textViewValueOf = c51722vsQ.valueOf();
            Entry entry4 = c51722vsQ.valueOf;
            java.lang.Object data3 = entry4 != null ? entry4.getData() : null;
            textViewValueOf.setText(c51722vsQ.copydefault(data3 instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data3 : null));
            if (textViewValueOf.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                Intrinsics.copydefault(textViewValueOf);
                float fDjBIcL3 = C55296xhK.AEQbTJ(textViewValueOf) ? C33570myu.djBIcL(textViewValueOf.getContext()) - position2.x : position2.x;
                ViewGroup.LayoutParams layoutParams5 = textViewValueOf.getLayoutParams();
                Intrinsics.copydefault(layoutParams5, "");
                ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart(c51722vsQ.EZpvd(fDjBIcL3, textViewValueOf));
                int iAhwBna3 = C33129mqd.AhwBna(java.lang.Float.valueOf(position2.y));
                int iAhwBna4 = C33129mqd.AhwBna(java.lang.Float.valueOf(c51722vsQ.AEQbTJ().getViewPortHandler().contentBottom()));
                ViewGroup.LayoutParams layoutParams6 = textViewValueOf.getLayoutParams();
                Intrinsics.copydefault(layoutParams6, "");
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
                if (iAhwBna3 > iAhwBna4) {
                    iAhwBna3 = iAhwBna4;
                }
                marginLayoutParams3.topMargin = iAhwBna3 + C55298xhM.dp2px$default(4.0f, null, 1, null);
            }
            C33616mzn.EZpvd(textViewValueOf, 600, interpolator, null, 0.0f, 1.0f);
            c51722vsQ.AhwBna().setVisibility(0);
            c51722vsQ.valueOf().setVisibility(0);
            return;
        }
        c51722vsQ.AhwBna().setVisibility(8);
        c51722vsQ.valueOf().setVisibility(8);
        c51722vsQ.AhwBna().setText("");
        c51722vsQ.valueOf().setText("");
    }

    public final void KWHzl(boolean z, float f, Entry entry) {
        android.widget.TextView textViewGEmmrt = gEmmrt();
        textViewGEmmrt.setVisibility(z ? 0 : 4);
        if (z && (textViewGEmmrt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            android.widget.TextView textViewGEmmrt2 = gEmmrt();
            java.lang.Object data = entry != null ? entry.getData() : null;
            textViewGEmmrt2.setText(OLrzqt(data instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data : null, this.EZpvd));
            Intrinsics.copydefault(textViewGEmmrt);
            if (C55296xhK.AEQbTJ(textViewGEmmrt)) {
                f = C33570myu.djBIcL(textViewGEmmrt.getContext()) - f;
            }
            ViewGroup.LayoutParams layoutParams = textViewGEmmrt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(EZpvd(f, textViewGEmmrt));
            return;
        }
        gEmmrt().setText("");
    }

    public final java.lang.String OLrzqt(BotAssetsHistoryData botAssetsHistoryData, MyBotAssetDateType myBotAssetDateType) {
        OKDateEnum oKDateEnum;
        OKTimeEnum oKTimeEnum;
        java.lang.String ts = botAssetsHistoryData != null ? botAssetsHistoryData.getTs() : null;
        if (ts == null || ts.length() == 0 || C33129mqd.valueOf(ts) == 0) {
            return "";
        }
        if (StateListAnimator.KWHzl[myBotAssetDateType.ordinal()] == 1) {
            oKDateEnum = OKDateEnum.NONE;
            oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
        } else {
            oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE_MD;
            oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
        }
        return pTA.format$default(new Date(C33129mqd.valueOf(ts)), oKDateEnum, oKTimeEnum, null, null, false, 28, null);
    }

    public final int EZpvd(float f, android.widget.TextView textView) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
        int iDjBIcL = C33570myu.djBIcL(getContext());
        int measuredWidth = textView.getMeasuredWidth();
        float f2 = measuredWidth / 2;
        float f3 = f - f2;
        return f3 <= ((float) iDp2px$default) ? iDp2px$default : f + f2 >= ((float) (iDjBIcL - iDp2px$default)) ? (iDjBIcL - measuredWidth) - iDp2px$default : C33129mqd.AhwBna(java.lang.Float.valueOf(f3));
    }

    public final boolean OLrzqt() {
        Entry entry = this.gEmmrt;
        if (entry == null || this.valueOf == null) {
            return false;
        }
        java.lang.Object data = entry != null ? entry.getData() : null;
        BotAssetsHistoryData botAssetsHistoryData = data instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data : null;
        java.lang.String assets = botAssetsHistoryData != null ? botAssetsHistoryData.getAssets() : null;
        Entry entry2 = this.valueOf;
        java.lang.Object data2 = entry2 != null ? entry2.getData() : null;
        BotAssetsHistoryData botAssetsHistoryData2 = data2 instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data2 : null;
        return C33129mqd.OLrzqt(assets, botAssetsHistoryData2 != null ? botAssetsHistoryData2.getAssets() : null);
    }

    public final void EZpvd() {
        try {
            java.lang.Object systemService = getContext().getSystemService("vibrator");
            Intrinsics.copydefault(systemService, "");
            android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(android.os.VibrationEffect.createOneShot(3L, -1));
            } else {
                vibrator.vibrate(3L);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final java.lang.String copydefault(BotAssetsHistoryData botAssetsHistoryData) {
        java.lang.String botPnl$default;
        java.lang.String assetSymbol;
        if (botAssetsHistoryData == null) {
            return "0";
        }
        BotUserSummaryData botUserSummaryData = this.fetchVPNInfo;
        if (botUserSummaryData != null && botUserSummaryData.isNeedTransfer()) {
            java.lang.String assets = botAssetsHistoryData.getAssets();
            BotUserSummaryData botUserSummaryData2 = this.fetchVPNInfo;
            java.lang.String multiplierForBotAssets = botUserSummaryData2 != null ? botUserSummaryData2.getMultiplierForBotAssets() : null;
            BotUserSummaryData botUserSummaryData3 = this.fetchVPNInfo;
            java.lang.String strMulS$default = C33129mqd.mulS$default(assets, multiplierForBotAssets, java.lang.Integer.valueOf(botUserSummaryData3 != null ? botUserSummaryData3.getPrecision() : 2), null, null, 12, null);
            BotUserSummaryData botUserSummaryData4 = this.fetchVPNInfo;
            if (botUserSummaryData4 == null || (assetSymbol = botUserSummaryData4.getAssetSymbol()) == null) {
                assetSymbol = "USDT";
            }
            java.lang.String str = assetSymbol;
            BotUserSummaryData botUserSummaryData5 = this.fetchVPNInfo;
            botPnl$default = C56033xvF.getBotPnl$default("", "", strMulS$default, str, false, false, java.lang.String.valueOf(botUserSummaryData5 != null ? botUserSummaryData5.getPrecision() : 2), false, null, null, null, 1968, null);
        } else {
            java.lang.String assets2 = botAssetsHistoryData.getAssets();
            if (assets2 == null) {
                assets2 = "";
            }
            botPnl$default = C56033xvF.getBotPnl$default("", "", assets2, "USDT", false, false, "2", false, null, null, null, 1968, null);
        }
        return Intrinsics.EZpvd((java.lang.Object) botPnl$default, (java.lang.Object) "--") ? "0" : botPnl$default;
    }

    public final int EZpvd(boolean z) {
        if (z) {
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
}
