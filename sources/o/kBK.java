package o;

import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.market.features.vibes.ui.chart.TrendPosition;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kBK extends android.widget.FrameLayout {
    public kBJ AEQbTJ;
    public boolean AYXKKw;
    public Function1<? super java.util.List<kAU>, Unit> AhwBna;
    public final C22364hdv EZpvd;
    public boolean KWHzl;
    public float OLrzqt;
    public float copydefault;
    public final kBN djBIcL;
    public int gEmmrt;
    public java.util.Map<java.lang.Float, java.util.List<kAU>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kBK(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialX(float f) {
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialY(float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:39) call: o.kBK.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ kBK(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kBK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C22364hdv c22364hdvOLrzqt = C22364hdv.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c22364hdvOLrzqt, "");
        this.EZpvd = c22364hdvOLrzqt;
        CombinedChart combinedChart = c22364hdvOLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(combinedChart, "");
        kBN kbn = new kBN(context, combinedChart);
        this.djBIcL = kbn;
        this.valueOf = new LinkedHashMap();
        this.KWHzl = true;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout = c22364hdvOLrzqt.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        kbn.KWHzl(frameLayout);
        this.gEmmrt = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            return copydefault(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.OLrzqt = motionEvent.getX();
            this.copydefault = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            float fAbs = java.lang.Math.abs(motionEvent.getX() - this.OLrzqt);
            float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.copydefault);
            float f = this.gEmmrt;
            if (fAbs > f && fAbs > fAbs2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (fAbs2 > f && fAbs2 > fAbs) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        } else if (action == 3) {
        }
        return false;
    }

    public static /* synthetic */ void loadKolChartData$default(kBK kbk, java.util.List list, java.util.List list2, java.util.List list3, boolean z, boolean z2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        kbk.EZpvd(list, list2, list3, z, z2, function1);
    }

    public final void EZpvd(java.util.List<kAS> list, java.util.List<kAR> list2, @NotNull java.util.List<kAU> list3, boolean z, boolean z2, @NotNull Function1<? super java.util.List<kAU>, Unit> function1) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean z3 = list != null && list.isEmpty() && list2 != null && list2.isEmpty();
        this.AYXKKw = z2;
        CombinedChart combinedChart = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(combinedChart, "");
        combinedChart.setVisibility(z3 ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z3 ? 0 : 8);
        this.KWHzl = z;
        if (z3) {
            KWHzl();
            invalidate();
            return;
        }
        this.AhwBna = function1;
        KWHzl();
        this.valueOf.clear();
        CombinedData combinedData = new CombinedData();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MIN_VALUE;
        if (list != null) {
            BarDataSet barDataSetAEQbTJ = AEQbTJ(EZpvd(list, linkedHashMap, linkedHashMap2, list3));
            barDataSetAEQbTJ.setAxisDependency(YAxis.AxisDependency.RIGHT);
            BarData barData = new BarData(barDataSetAEQbTJ);
            barData.setBarWidth(0.5f);
            combinedData.setData(barData);
            java.util.Iterator<T> it = list.iterator();
            f = Float.MAX_VALUE;
            f2 = Float.MIN_VALUE;
            while (it.hasNext()) {
                float fDjBIcL = C33129mqd.djBIcL(((kAS) it.next()).copydefault());
                if (fDjBIcL < f && fDjBIcL != 0.0f) {
                    f = fDjBIcL;
                }
                if (fDjBIcL > f2) {
                    f2 = fDjBIcL;
                }
            }
            if (f2 == Float.MIN_VALUE) {
                f2 = 100.0f;
            }
            if (f == Float.MAX_VALUE) {
                f = 0.0f;
            }
        } else {
            f = Float.MAX_VALUE;
            f2 = Float.MIN_VALUE;
        }
        if (list2 != null) {
            LineDataSet lineDataSetEZpvd = EZpvd(copydefault(list2, linkedHashMap, linkedHashMap2));
            lineDataSetEZpvd.setAxisDependency(YAxis.AxisDependency.LEFT);
            combinedData.setData(new LineData(lineDataSetEZpvd));
            for (kAR kar : list2) {
                float fDjBIcL2 = C33129mqd.djBIcL(this.KWHzl ? kar.EZpvd() : kar.OLrzqt());
                if (fDjBIcL2 < f3) {
                    f3 = fDjBIcL2;
                }
                if (fDjBIcL2 > f4) {
                    f4 = fDjBIcL2;
                }
            }
        }
        this.EZpvd.AYXKKw.setData(combinedData);
        OLrzqt(linkedHashMap);
        KWHzl(f, f2, f3, f4);
        KWHzl(linkedHashMap2);
        CombinedChart combinedChart2 = this.EZpvd.AYXKKw;
        CombinedChart combinedChart3 = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(combinedChart3, "");
        ChartAnimator animator = this.EZpvd.AYXKKw.getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = this.EZpvd.AYXKKw.getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        combinedChart2.setRenderer(new kBP(combinedChart3, animator, viewPortHandler));
        this.EZpvd.AYXKKw.notifyDataSetChanged();
        this.EZpvd.AYXKKw.resetViewPortOffsets();
        this.EZpvd.AYXKKw.invalidate();
        copydefault();
    }

    public final java.util.ArrayList<BarEntry> EZpvd(java.util.List<kAS> list, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.Float, ActionBar> map2, java.util.List<kAU> list2) {
        java.lang.String strOLrzqt;
        java.util.ArrayList<BarEntry> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            kAS kas = (kAS) obj;
            float fDjBIcL = C33129mqd.djBIcL(kas.copydefault());
            float f = i;
            if (this.AYXKKw) {
                strOLrzqt = C25322iuY.OLrzqt.AYXKKw(kas.OLrzqt());
            } else {
                strOLrzqt = C25322iuY.OLrzqt.OLrzqt(kas.OLrzqt());
            }
            map.put(java.lang.Float.valueOf(f), strOLrzqt);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (Intrinsics.EZpvd((java.lang.Object) ((kAU) obj2).OLrzqt(), (java.lang.Object) kas.OLrzqt())) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                this.valueOf.put(java.lang.Float.valueOf(f), arrayList3);
            }
            arrayList.add(new BarEntry(f, fDjBIcL));
            map2.put(java.lang.Float.valueOf(f), new ActionBar(C23319hvw.getFormattedNumberICU$default(kas.copydefault(), null, null, null, null, false, false, 63, null), "", "", C25322iuY.OLrzqt.gEmmrt(kas.OLrzqt()), arrayList3));
            arrayList2.add(Unit.INSTANCE);
            i++;
        }
        return arrayList;
    }

    public final java.util.ArrayList<Entry> copydefault(java.util.List<kAR> list, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.Float, ActionBar> map2) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            kAR kar = (kAR) obj;
            float f = i;
            arrayList.add(new Entry(f, C33129mqd.djBIcL(this.KWHzl ? kar.EZpvd() : kar.OLrzqt())));
            ActionBar actionBar = map2.get(java.lang.Float.valueOf(f));
            if (actionBar != null) {
                map2.put(java.lang.Float.valueOf(f), ActionBar.copy$default(actionBar, null, kar.EZpvd(), kar.OLrzqt(), null, null, 25, null));
            } else {
                C25322iuY c25322iuY = C25322iuY.OLrzqt;
                map.put(java.lang.Float.valueOf(f), java.lang.String.valueOf(c25322iuY.djBIcL(kar.KWHzl())));
                map2.put(java.lang.Float.valueOf(f), new ActionBar("", kar.EZpvd(), kar.OLrzqt(), c25322iuY.gEmmrt(kar.KWHzl()), yDY.AhwBna()));
            }
            arrayList2.add(Unit.INSTANCE);
            i++;
        }
        return arrayList;
    }

    public final void copydefault() {
        this.EZpvd.AYXKKw.post(new java.lang.Runnable() { // from class: o.kBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kBK.AEQbTJ(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(final kBK kbk) {
        LineData lineData;
        java.util.List<T> dataSets;
        ILineDataSet iLineDataSet;
        BarData barData;
        java.util.List<T> dataSets2;
        IBarDataSet iBarDataSet;
        if (kbk.valueOf.isEmpty()) {
            return;
        }
        for (Map.Entry<java.lang.Float, java.util.List<kAU>> entry : kbk.valueOf.entrySet()) {
            float fFloatValue = entry.getKey().floatValue();
            java.util.List<kAU> value = entry.getValue();
            try {
                CombinedChart combinedChart = kbk.EZpvd.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(combinedChart, "");
                int i = (int) fFloatValue;
                TrendPosition trendPositionEZpvd = kBS.EZpvd(combinedChart, i);
                CombinedData combinedData = (CombinedData) kbk.EZpvd.AYXKKw.getData();
                Entry entryForIndex = null;
                BarEntry barEntry = (combinedData == null || (barData = combinedData.getBarData()) == null || (dataSets2 = barData.getDataSets()) == 0 || (iBarDataSet = (IBarDataSet) dataSets2.get(0)) == null) ? null : (BarEntry) iBarDataSet.getEntryForIndex(i);
                CombinedData combinedData2 = (CombinedData) kbk.EZpvd.AYXKKw.getData();
                if (combinedData2 != null && (lineData = combinedData2.getLineData()) != null && (dataSets = lineData.getDataSets()) != 0 && (iLineDataSet = (ILineDataSet) dataSets.get(0)) != null) {
                    entryForIndex = iLineDataSet.getEntryForIndex(i);
                }
                if (barEntry != null && entryForIndex != null && (!value.isEmpty())) {
                    Transformer transformer = kbk.EZpvd.AYXKKw.getTransformer(YAxis.AxisDependency.LEFT);
                    kbk.djBIcL.KWHzl(value, transformer.getPixelForValues(barEntry.getX(), 0.0f).x, transformer.getPixelForValues(0.0f, entryForIndex.getY()).y, trendPositionEZpvd, new Function1() { // from class: o.kBO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return kBK.KWHzl(this.EZpvd, (java.util.List) obj);
                        }
                    });
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        kbk.djBIcL.AEQbTJ();
    }

    public static final Unit KWHzl(kBK kbk, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Function1<? super java.util.List<kAU>, Unit> function1 = kbk.AhwBna;
        if (function1 != null) {
            function1.invoke(list);
        }
        return Unit.INSTANCE;
    }

    public final BarDataSet AEQbTJ(java.util.ArrayList<BarEntry> arrayList) {
        BarDataSet barDataSet = new BarDataSet(arrayList, null);
        barDataSet.setHighLightColor(0);
        barDataSet.setHighLightAlpha(0);
        barDataSet.setDrawValues(false);
        return barDataSet;
    }

    public final LineDataSet EZpvd(java.util.ArrayList<Entry> arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        int i = C52761wXj.Activity.QKudOq;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(C25382ivf.copydefault(i, context));
        lineDataSet.setHighLightColor(0);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(true);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setCircleRadius(6.0f);
        lineDataSet.setCircleColor(0);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        return lineDataSet;
    }

    public final void OLrzqt(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.EZpvd.AYXKKw.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new Application(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setYOffset(15.0f);
            xAxis.setAxisMinimum(-0.5f);
            xAxis.setAxisMaximum((map.size() - 1) + 0.5f);
            xAxis.setGranularity(1.0f);
        }
    }

    public static final class Application extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> OLrzqt;

        public Application(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.OLrzqt = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.OLrzqt.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void KWHzl(float f, float f2, float f3, float f4) {
        YAxis axisRight = this.EZpvd.AYXKKw.getAxisRight();
        if (axisRight != null) {
            axisRight.setLabelCount(7, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            float f5 = (f2 - f) * 0.2f;
            float f6 = f - f5;
            float f7 = f2 + f5;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            axisRight.setAxisMinimum(f6);
            if (f7 > 100.0f) {
                f7 = 100.0f;
            }
            axisRight.setAxisMaximum(f7);
            axisRight.setValueFormatter(new StateListAnimator());
        }
        YAxis axisLeft = this.EZpvd.AYXKKw.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(true);
            axisLeft.setLabelCount(7, true);
            axisLeft.setDrawAxisLine(false);
            axisLeft.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisLeft.setTextSize(10.0f);
            axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisLeft.setGridColor(0);
            axisLeft.setGridLineWidth(0.0f);
            if (f3 != Float.MAX_VALUE && f4 != Float.MIN_VALUE) {
                float f8 = (f4 - f3) * 0.2f;
                axisLeft.setAxisMinimum(C56548yJl.copydefault(f3 - f8, 0.0f));
                axisLeft.setAxisMaximum(f4 + f8);
            }
            axisLeft.setValueFormatter(new Activity());
        }
    }

    public static final class StateListAnimator extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return C23319hvw.getFormattedNumberICU$default(java.lang.String.valueOf(f), null, null, null, null, false, false, 63, null);
        }
    }

    public static final class Activity extends ValueFormatter {
        public Activity() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            if (kBK.this.KWHzl) {
                return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C33129mqd.gEmmrt(java.lang.Float.valueOf(f)), false, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
            }
            return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C33129mqd.gEmmrt(java.lang.Float.valueOf(f)), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void KWHzl(java.util.Map<java.lang.Float, ActionBar> map) {
        BarData barData;
        CombinedChart combinedChart = this.EZpvd.AYXKKw;
        combinedChart.setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.LINE});
        combinedChart.setDragEnabled(true);
        combinedChart.setScaleXEnabled(false);
        combinedChart.setPinchZoom(false);
        combinedChart.setScaleEnabled(false);
        combinedChart.getDescription().setEnabled(false);
        combinedChart.getLegend().setEnabled(false);
        combinedChart.setTouchEnabled(true);
        combinedChart.setHighlightPerTapEnabled(true);
        combinedChart.setExtraBottomOffset(35.0f);
        CombinedData combinedData = (CombinedData) combinedChart.getData();
        if (combinedData != null && (barData = combinedData.getBarData()) != null) {
            barData.setDrawValues(false);
        }
        combinedChart.setDrawMarkers(false);
        Intrinsics.copydefault(combinedChart);
        ConstraintLayout constraintLayout = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        android.content.Context context = combinedChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kBJ kbj = new kBJ(combinedChart, map, constraintLayout, context);
        this.AEQbTJ = kbj;
        combinedChart.setOnChartValueSelectedListener(kbj);
        this.EZpvd.AYXKKw.requestLayout();
    }

    public final void KWHzl() {
        XAxis xAxis = this.EZpvd.AYXKKw.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        YAxis axisRight = this.EZpvd.AYXKKw.getAxisRight();
        if (axisRight != null) {
            axisRight.removeAllLimitLines();
        }
        YAxis axisLeft = this.EZpvd.AYXKKw.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.removeAllLimitLines();
        }
        ConstraintLayout constraintLayout = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        this.djBIcL.OLrzqt();
        this.djBIcL.KWHzl();
        this.EZpvd.AYXKKw.invalidate();
    }

    public static final class ActionBar {
        public final java.util.List<kAU> AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.kBK$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.OLrzqt;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.KWHzl;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                list = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(str, str5, str6, str7, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<kAU> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<kAU> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(str, str2, str3, str4, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "KolChartModel(barValue=" + this.EZpvd + ", priceValue=" + this.copydefault + ", mcapValue=" + this.OLrzqt + ", timeStamp=" + this.KWHzl + ", kols=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<kAU> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.KWHzl = str4;
            this.AEQbTJ = list;
        }
    }
}
