package o;

import android.view.ViewTreeObserver;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.widget.chart.MarkerSide;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46496tWm extends LineChart {
    public final LineDataSet AEQbTJ;
    public final float AYXKKw;
    public final float AhwBna;
    public final float AkhnZx;
    public java.util.List<? extends InterfaceC46484tWa> DbNXlk;
    public final float EZpvd;
    public final boolean KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public final boolean copydefault;
    public final int djBIcL;
    public final int gEmmrt;
    public final LineDataSet valueOf;

    /* JADX INFO: renamed from: o.tWm$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarkerSide.values().length];
            try {
                iArr[MarkerSide.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarkerSide.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46496tWm(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46496tWm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:176) call: o.tWm.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46496tWm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46496tWm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = new LineDataSet(yDY.AhwBna(), "KLine");
        this.AEQbTJ = new LineDataSet(yDY.AhwBna(), "BuySellMarkers");
        this.DbNXlk = yDY.AhwBna();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.gEmmrt = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        this.djBIcL = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.DTwDnp, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.AYXKKw = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.QbewEr, C55298xhM.KWHzl(0.0f, context)) / context.getResources().getDisplayMetrics().density;
            this.AkhnZx = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.RJOkX, C55298xhM.KWHzl(0.0f, context)) / context.getResources().getDisplayMetrics().density;
            this.AhwBna = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.QUSxYX, 2.0f);
            this.EZpvd = typedArrayObtainStyledAttributes.getFloat(C47501trL.FragmentManager.QKVWgx, 0.2f);
            this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.QOLQEE, false);
            this.KWHzl = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.ORxRYg, false);
            typedArrayObtainStyledAttributes.recycle();
            AEQbTJ();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void AEQbTJ() {
        getAxisRight().setEnabled(false);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setTextColor(getContext().getColor(C52761wXj.Activity.QwvEab));
        axisLeft.setTextSize(12.0f);
        C55051xce c55051xce = C55051xce.OLrzqt;
        axisLeft.setTypeface(c55051xce.valueOf());
        axisLeft.setGridColor(getContext().getColor(C52761wXj.Activity.fdOvFl));
        axisLeft.setGridLineWidth(1.0f);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setNoDataText("");
        XAxis xAxis = getXAxis();
        xAxis.setDrawLabels(false);
        xAxis.setAvoidFirstLastClipping(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(3, true);
        xAxis.setGranularity(1.0f);
        xAxis.setGranularityEnabled(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(getContext().getColor(C52761wXj.Activity.QwvEab));
        xAxis.setTextSize(12.0f);
        xAxis.setTypeface(c55051xce.valueOf());
        xAxis.setGridColor(getContext().getColor(C52761wXj.Activity.fdOvFl));
        xAxis.setGridLineWidth(1.0f);
        setTouchEnabled(false);
        setScaleXEnabled(false);
        setScaleYEnabled(false);
        setAutoScaleMinMaxEnabled(true);
        setDoubleTapToZoomEnabled(false);
        setDragYEnabled(false);
        setDragEnabled(false);
        setDragDecelerationEnabled(false);
        animateX(0);
        animateY(0);
        setMinOffset(0.0f);
        float f = this.AkhnZx;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fKWHzl = C55298xhM.KWHzl(f, context);
        float f2 = this.AYXKKw;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fKWHzl2 = C55298xhM.KWHzl(f2, context2);
        setExtraOffsets(fKWHzl2, fKWHzl, fKWHzl2, fKWHzl);
        setViewPortOffsets(fKWHzl2, fKWHzl, fKWHzl2, fKWHzl);
        ChartAnimator animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C46503tWt(this, animator, viewPortHandler, this.KWHzl, this.djBIcL, this.gEmmrt));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tWm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C46496tWm c46496tWm, java.util.List list, java.util.List list2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list2 = yDY.AhwBna();
        }
        if ((i & 4) != 0) {
            num = null;
        }
        c46496tWm.setData(list, list2, num);
    }

    public final void setData(@NotNull java.util.List<? extends InterfaceC46484tWa> list, java.util.List<C46487tWd> list2, java.lang.Integer num) {
        int iIntValue;
        java.lang.Number numberKWHzl;
        java.util.List<Entry> listAhwBna;
        java.lang.String strCopydefault;
        java.lang.String strOLrzqt;
        java.util.List<? extends InterfaceC46484tWa> listGEmmrt = list;
        Intrinsics.checkNotNullParameter(listGEmmrt, "");
        clear();
        boolean zIsEmpty = list.isEmpty();
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        if (zIsEmpty) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            listGEmmrt = yDY.gEmmrt(new tVX(jCurrentTimeMillis, fValueOf), new tVX(jCurrentTimeMillis + 3600000, fValueOf));
        } else if (list.size() == 1) {
            InterfaceC46484tWa interfaceC46484tWa = listGEmmrt.get(0);
            listGEmmrt = yDY.gEmmrt(interfaceC46484tWa, new tVX(interfaceC46484tWa.OLrzqt() + 3600000, interfaceC46484tWa.KWHzl()));
        }
        this.DbNXlk = listGEmmrt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        int i = 0;
        for (java.lang.Object obj : listGEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new Entry(i, C33129mqd.djBIcL(((InterfaceC46484tWa) obj).KWHzl())));
            i++;
        }
        java.util.List<? extends InterfaceC46484tWa> list3 = this.DbNXlk;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
        java.util.Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC46484tWa) it.next()).KWHzl().toString());
        }
        C46492tWi c46492tWiKWHzl = C46499tWp.KWHzl(arrayList2);
        float fDjBIcL = (c46492tWiKWHzl == null || (strOLrzqt = c46492tWiKWHzl.OLrzqt()) == null) ? 0.0f : C33129mqd.djBIcL(strOLrzqt);
        float fDjBIcL2 = (c46492tWiKWHzl == null || (strCopydefault = c46492tWiKWHzl.copydefault()) == null) ? 0.0f : C33129mqd.djBIcL(strCopydefault);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            InterfaceC46484tWa interfaceC46484tWa2 = (InterfaceC46484tWa) CollectionsKt___CollectionsKt.wlaJM(this.DbNXlk);
            iIntValue = ((interfaceC46484tWa2 == null || (numberKWHzl = interfaceC46484tWa2.KWHzl()) == null) ? 0.0f : C33129mqd.djBIcL(numberKWHzl)) < 0.0f ? this.gEmmrt : this.djBIcL;
        }
        if (this.copydefault) {
            C46489tWf c46489tWf = C46489tWf.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.OLrzqt = C46489tWf.updateDrawableFill$default(c46489tWf, context, fDjBIcL, fDjBIcL2, 0.0f, this.KWHzl, java.lang.Integer.valueOf(iIntValue), 8, null);
        }
        if (C33129mqd.KWHzl((java.util.Collection) list2)) {
            Intrinsics.copydefault(list2);
            listAhwBna = KWHzl(list2, this.DbNXlk);
        } else {
            listAhwBna = yDY.AhwBna();
        }
        LineDataSet lineDataSet = this.valueOf;
        lineDataSet.setColor(iIntValue);
        lineDataSet.setHighlightEnabled(false);
        lineDataSet.setLineWidth(this.AhwBna);
        lineDataSet.setValues(arrayList);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setCubicIntensity(this.EZpvd);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.setDrawFilled(this.copydefault);
        if (this.copydefault) {
            lineDataSet.setFillDrawable(this.OLrzqt);
        }
        if (!listAhwBna.isEmpty()) {
            LineDataSet lineDataSet2 = this.AEQbTJ;
            lineDataSet2.setValues(listAhwBna);
            lineDataSet2.setLineWidth(0.0f);
            lineDataSet2.setDrawCircles(false);
            lineDataSet2.setDrawValues(false);
            lineDataSet2.setDrawIcons(false);
            lineDataSet2.setDrawHighlightIndicators(false);
            lineDataSet2.setHighlightEnabled(false);
            setData(new LineData(this.AEQbTJ, this.valueOf));
        } else {
            setData(new LineData(this.valueOf));
        }
        getXAxis().setValueFormatter(new Application());
        notifyDataSetChanged();
        pUU.EZpvd("PlanetFutureChart", "setData: view size = " + getWidth() + "x" + getHeight());
        if (getWidth() > 0 && getHeight() > 0) {
            pUU.EZpvd("PlanetFutureChart", "setData: view already laid out, calling fitScreen in post()");
            post(new java.lang.Runnable() { // from class: o.tWo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46496tWm.AEQbTJ(this.EZpvd);
                }
            });
        } else {
            pUU.EZpvd("PlanetFutureChart", "setData: view NOT laid out, waiting for onGlobalLayout");
            getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator());
        }
    }

    /* JADX INFO: renamed from: o.tWm$Application */
    public static final class Application extends ValueFormatter {
        public final java.util.Map<java.lang.Integer, java.lang.String> OLrzqt = new LinkedHashMap();

        public Application() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            int i = (int) f;
            java.util.Map<java.lang.Integer, java.lang.String> map = this.OLrzqt;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            C46496tWm c46496tWm = C46496tWm.this;
            java.lang.String str = map.get(numValueOf);
            if (str == null) {
                InterfaceC46484tWa interfaceC46484tWa = (InterfaceC46484tWa) CollectionsKt___CollectionsKt.AkhnZx(c46496tWm.DbNXlk, i);
                if (interfaceC46484tWa == null) {
                    return "";
                }
                str = pTA.format$default(new Date(interfaceC46484tWa.OLrzqt()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                map.put(numValueOf, str);
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(C46496tWm c46496tWm) {
        c46496tWm.fitScreen();
        c46496tWm.invalidate();
    }

    /* JADX INFO: renamed from: o.tWm$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public StateListAnimator() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            pUU.EZpvd("PlanetFutureChart", "onGlobalLayout: view size = " + C46496tWm.this.getWidth() + "x" + C46496tWm.this.getHeight());
            C46496tWm.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C46496tWm.this.fitScreen();
            C46496tWm.this.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0751  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<Entry> KWHzl(java.util.List<C46487tWd> list, java.util.List<? extends InterfaceC46484tWa> list2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        int i2;
        boolean z;
        java.util.Iterator it;
        java.util.Iterator it2;
        boolean z2;
        java.util.List<Entry> list3;
        float f;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object obj;
        java.lang.Object next;
        boolean z3;
        java.util.Iterator it3;
        java.util.Iterator it4;
        boolean z4;
        C46496tWm c46496tWm;
        java.lang.String str8;
        boolean z5;
        float f2;
        java.lang.Object objPrevious;
        java.lang.Object objPrevious2;
        java.lang.Integer next2;
        java.lang.Integer num;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        C46496tWm c46496tWm2;
        android.graphics.drawable.Drawable drawableOLrzqt;
        Entry entry;
        java.lang.Object next3;
        C46496tWm c46496tWm3 = this;
        if (list.isEmpty() || list2.isEmpty()) {
            return yDY.AhwBna();
        }
        long jOLrzqt = ((InterfaceC46484tWa) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).OLrzqt();
        long jOLrzqt2 = ((InterfaceC46484tWa) CollectionsKt___CollectionsKt.AubY(list2)).OLrzqt();
        int size = list2.size() - 1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (C46487tWd c46487tWd : list) {
            long jOLrzqt3 = c46487tWd.OLrzqt();
            if (jOLrzqt3 < jOLrzqt) {
                arrayList5.add(c46487tWd);
            } else if (jOLrzqt3 <= jOLrzqt2) {
                arrayList4.add(c46487tWd);
            } else {
                arrayList6.add(c46487tWd);
            }
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.Iterator it5 = arrayList4.iterator();
        while (true) {
            java.lang.String str9 = "";
            java.lang.String str10 = "] at ";
            if (!it5.hasNext()) {
                int i3 = size;
                java.util.ArrayList arrayList8 = arrayList5;
                java.util.ArrayList arrayList9 = arrayList6;
                C46496tWm c46496tWm4 = c46496tWm3;
                java.util.ArrayList arrayList10 = arrayList7;
                java.lang.String str11 = ") → Data[";
                java.util.List<Entry> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList10);
                java.lang.String str12 = "getContext(...)";
                if (!arrayList8.isEmpty()) {
                    float f3 = 0;
                    float fDjBIcL = C33129mqd.djBIcL(list2.get(0).KWHzl());
                    long jOLrzqt4 = list2.get(0).OLrzqt();
                    java.lang.String str13 = pTA.format$default(new Date(jOLrzqt4), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                    boolean z6 = listFJNWhG instanceof java.util.Collection;
                    if (z6 && listFJNWhG.isEmpty()) {
                        str = str11;
                        str3 = str10;
                        z3 = false;
                        if (z6) {
                            it3 = listFJNWhG.iterator();
                            while (it3.hasNext()) {
                            }
                            z4 = false;
                            if (z3) {
                            }
                            z5 = z4;
                            f2 = fDjBIcL;
                            if (z5) {
                            }
                        }
                    } else {
                        for (Entry entry2 : listFJNWhG) {
                            if (entry2.getX() == f3) {
                                str3 = str10;
                                java.lang.Object data = entry2.getData();
                                str = str11;
                                C46487tWd c46487tWd2 = data instanceof C46487tWd ? (C46487tWd) data : null;
                                if ((c46487tWd2 != null ? c46487tWd2.EZpvd() : null) == MarkerSide.BUY) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                str = str11;
                                str3 = str10;
                            }
                            str11 = str;
                            str10 = str3;
                        }
                        str = str11;
                        str3 = str10;
                        z3 = false;
                        if (z6 || !listFJNWhG.isEmpty()) {
                            it3 = listFJNWhG.iterator();
                            while (it3.hasNext()) {
                                Entry entry3 = (Entry) it3.next();
                                if (entry3.getX() == f3) {
                                    java.lang.Object data2 = entry3.getData();
                                    it4 = it3;
                                    C46487tWd c46487tWd3 = data2 instanceof C46487tWd ? (C46487tWd) data2 : null;
                                    if ((c46487tWd3 != null ? c46487tWd3.EZpvd() : null) == MarkerSide.SELL) {
                                        z4 = true;
                                        break;
                                    }
                                } else {
                                    it4 = it3;
                                }
                                it3 = it4;
                            }
                            z4 = false;
                            if (z3) {
                                c46496tWm = c46496tWm4;
                                str8 = "getContext(...)";
                            } else {
                                java.util.ListIterator listIterator = arrayList8.listIterator(arrayList8.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        str8 = str12;
                                        objPrevious2 = null;
                                        break;
                                    }
                                    objPrevious2 = listIterator.previous();
                                    java.util.ListIterator listIterator2 = listIterator;
                                    str8 = str12;
                                    if (((C46487tWd) objPrevious2).EZpvd() == MarkerSide.BUY) {
                                        break;
                                    }
                                    str12 = str8;
                                    listIterator = listIterator2;
                                }
                                C46487tWd c46487tWd4 = (C46487tWd) objPrevious2;
                                if (c46487tWd4 != null) {
                                    arrayList8 = arrayList8;
                                    long jOLrzqt5 = c46487tWd4.OLrzqt();
                                    z5 = z4;
                                    pUU.EZpvd("PlanetFutureChart", "Before-first marker mapped: buy marker at " + pTA.format$default(new Date(jOLrzqt5), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) + " (" + jOLrzqt5 + ") → Data[0] at " + str13 + " (" + jOLrzqt4 + ") | diff=" + java.lang.Math.abs(jOLrzqt4 - jOLrzqt5) + "ms | value=" + c46487tWd4.KWHzl());
                                    android.content.Context context = getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "");
                                    c46496tWm = this;
                                    f2 = fDjBIcL;
                                    f3 = f3;
                                    Entry entry4 = new Entry(f3, f2, c46496tWm.OLrzqt(context), c46487tWd4);
                                    listFJNWhG = listFJNWhG;
                                    listFJNWhG.add(0, entry4);
                                    if (z5) {
                                        java.util.ListIterator listIterator3 = arrayList8.listIterator(arrayList8.size());
                                        while (true) {
                                            if (!listIterator3.hasPrevious()) {
                                                objPrevious = null;
                                                break;
                                            }
                                            objPrevious = listIterator3.previous();
                                            if (((C46487tWd) objPrevious).EZpvd() == MarkerSide.SELL) {
                                                break;
                                            }
                                        }
                                        C46487tWd c46487tWd5 = (C46487tWd) objPrevious;
                                        if (c46487tWd5 != null) {
                                            long jOLrzqt6 = c46487tWd5.OLrzqt();
                                            java.util.List<Entry> list4 = listFJNWhG;
                                            pUU.EZpvd("PlanetFutureChart", "Before-first marker mapped: sell marker at " + pTA.format$default(new Date(jOLrzqt6), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) + " (" + jOLrzqt6 + ") → Data[0] at " + str13 + " (" + jOLrzqt4 + ") | diff=" + java.lang.Math.abs(jOLrzqt4 - jOLrzqt6) + "ms | value=" + c46487tWd5.KWHzl());
                                            android.content.Context context2 = getContext();
                                            str2 = str8;
                                            Intrinsics.checkNotNullExpressionValue(context2, str2);
                                            Entry entry5 = new Entry(f3, f2, AEQbTJ(context2), c46487tWd5);
                                            listFJNWhG = list4;
                                            listFJNWhG.add(0, entry5);
                                        } else {
                                            str2 = str8;
                                        }
                                    }
                                } else {
                                    arrayList8 = arrayList8;
                                    c46496tWm = c46496tWm4;
                                }
                            }
                            z5 = z4;
                            f2 = fDjBIcL;
                            if (z5) {
                            }
                        } else {
                            z4 = false;
                            if (z3) {
                            }
                            z5 = z4;
                            f2 = fDjBIcL;
                            if (z5) {
                            }
                        }
                    }
                } else {
                    str = str11;
                    str2 = "getContext(...)";
                    str3 = "] at ";
                }
                if (!arrayList9.isEmpty()) {
                    float f4 = i3;
                    float fDjBIcL2 = C33129mqd.djBIcL(list2.get(i3).KWHzl());
                    long jOLrzqt7 = list2.get(i3).OLrzqt();
                    java.lang.String str14 = pTA.format$default(new Date(jOLrzqt7), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                    boolean z7 = listFJNWhG instanceof java.util.Collection;
                    if (z7 && listFJNWhG.isEmpty()) {
                        z = false;
                        if (z7) {
                            it = listFJNWhG.iterator();
                            while (it.hasNext()) {
                            }
                            z2 = false;
                            if (!z) {
                            }
                        }
                    } else {
                        for (Entry entry6 : listFJNWhG) {
                            if (entry6.getX() == f4) {
                                java.lang.Object data3 = entry6.getData();
                                C46487tWd c46487tWd6 = data3 instanceof C46487tWd ? (C46487tWd) data3 : null;
                                if ((c46487tWd6 != null ? c46487tWd6.EZpvd() : null) == MarkerSide.BUY) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z7 || !listFJNWhG.isEmpty()) {
                            it = listFJNWhG.iterator();
                            while (it.hasNext()) {
                                Entry entry7 = (Entry) it.next();
                                if (entry7.getX() == f4) {
                                    java.lang.Object data4 = entry7.getData();
                                    it2 = it;
                                    C46487tWd c46487tWd7 = data4 instanceof C46487tWd ? (C46487tWd) data4 : null;
                                    if ((c46487tWd7 != null ? c46487tWd7.EZpvd() : null) == MarkerSide.SELL) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    it2 = it;
                                }
                                it = it2;
                            }
                            z2 = false;
                            if (!z) {
                                java.util.Iterator it6 = arrayList9.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it6.next();
                                    java.util.Iterator it7 = it6;
                                    if (((C46487tWd) next).EZpvd() == MarkerSide.BUY) {
                                        break;
                                    }
                                    it6 = it7;
                                }
                                C46487tWd c46487tWd8 = (C46487tWd) next;
                                if (c46487tWd8 != null) {
                                    long jOLrzqt8 = c46487tWd8.OLrzqt();
                                    java.util.List<Entry> list5 = listFJNWhG;
                                    java.lang.String str15 = pTA.format$default(new Date(jOLrzqt8), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                                    long jAbs = java.lang.Math.abs(jOLrzqt7 - jOLrzqt8);
                                    java.lang.Number numberKWHzl = c46487tWd8.KWHzl();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.String str16 = str2;
                                    sb.append("After-last marker mapped: buy marker at ");
                                    sb.append(str15);
                                    sb.append(" (");
                                    sb.append(jOLrzqt8);
                                    str5 = str;
                                    sb.append(str5);
                                    sb.append(i3);
                                    str7 = str3;
                                    sb.append(str7);
                                    sb.append(str14);
                                    sb.append(" (");
                                    sb.append(jOLrzqt7);
                                    sb.append(") | diff=");
                                    sb.append(jAbs);
                                    sb.append("ms | value=");
                                    sb.append(numberKWHzl);
                                    pUU.EZpvd("PlanetFutureChart", sb.toString());
                                    android.content.Context context3 = getContext();
                                    str6 = str16;
                                    Intrinsics.checkNotNullExpressionValue(context3, str6);
                                    fDjBIcL2 = fDjBIcL2;
                                    f = f4;
                                    Entry entry8 = new Entry(f, fDjBIcL2, OLrzqt(context3), c46487tWd8);
                                    list3 = list5;
                                    list3.add(entry8);
                                } else {
                                    list3 = listFJNWhG;
                                    f = f4;
                                    str5 = str;
                                    str6 = str2;
                                    str7 = str3;
                                }
                                if (!z2) {
                                    java.util.Iterator it8 = arrayList9.iterator();
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        java.lang.Object next4 = it8.next();
                                        java.util.Iterator it9 = it8;
                                        if (((C46487tWd) next4).EZpvd() == MarkerSide.SELL) {
                                            obj = next4;
                                            break;
                                        }
                                        it8 = it9;
                                    }
                                    C46487tWd c46487tWd9 = (C46487tWd) obj;
                                    if (c46487tWd9 != null) {
                                        long jOLrzqt9 = c46487tWd9.OLrzqt();
                                        java.util.List<Entry> list6 = list3;
                                        str4 = "PlanetFutureChart";
                                        pUU.EZpvd(str4, "After-last marker mapped: sell marker at " + pTA.format$default(new Date(jOLrzqt9), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) + " (" + jOLrzqt9 + str5 + i3 + str7 + str14 + " (" + jOLrzqt7 + ") | diff=" + java.lang.Math.abs(jOLrzqt7 - jOLrzqt9) + "ms | value=" + c46487tWd9.KWHzl());
                                        android.content.Context context4 = getContext();
                                        Intrinsics.checkNotNullExpressionValue(context4, str6);
                                        Entry entry9 = new Entry(f, fDjBIcL2, AEQbTJ(context4), c46487tWd9);
                                        listFJNWhG = list6;
                                        listFJNWhG.add(entry9);
                                    } else {
                                        listFJNWhG = list3;
                                        str4 = "PlanetFutureChart";
                                    }
                                }
                            }
                        } else {
                            z2 = false;
                            if (!z) {
                            }
                        }
                    }
                } else {
                    str4 = "PlanetFutureChart";
                }
                boolean z8 = listFJNWhG instanceof java.util.Collection;
                if (z8 && listFJNWhG.isEmpty()) {
                    i = 0;
                } else {
                    java.util.Iterator<T> it10 = listFJNWhG.iterator();
                    i = 0;
                    while (it10.hasNext()) {
                        java.lang.Object data5 = ((Entry) it10.next()).getData();
                        C46487tWd c46487tWd10 = data5 instanceof C46487tWd ? (C46487tWd) data5 : null;
                        if ((c46487tWd10 != null ? c46487tWd10.EZpvd() : null) == MarkerSide.BUY && (i = i + 1) < 0) {
                            yDY.djBIcL();
                        }
                    }
                }
                if (z8 && listFJNWhG.isEmpty()) {
                    i2 = 0;
                } else {
                    java.util.Iterator<T> it11 = listFJNWhG.iterator();
                    i2 = 0;
                    while (it11.hasNext()) {
                        java.lang.Object data6 = ((Entry) it11.next()).getData();
                        C46487tWd c46487tWd11 = data6 instanceof C46487tWd ? (C46487tWd) data6 : null;
                        if ((c46487tWd11 != null ? c46487tWd11.EZpvd() : null) == MarkerSide.SELL && (i2 = i2 + 1) < 0) {
                            yDY.djBIcL();
                        }
                    }
                }
                pUU.EZpvd(str4, "Marker mapping complete: " + listFJNWhG.size() + " total markers mapped (" + i + " buy, " + i2 + " sell) | Data range: " + list2.size() + " points");
                return listFJNWhG;
            }
            C46487tWd c46487tWd12 = (C46487tWd) it5.next();
            long jOLrzqt10 = c46487tWd12.OLrzqt();
            kotlin.ranges.IntRange intRangeValueOf = yDY.valueOf((java.util.Collection<?>) list2);
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            for (java.lang.Integer num2 : intRangeValueOf) {
                java.util.Iterator it12 = it5;
                int i4 = size;
                if (list2.get(num2.intValue()).OLrzqt() <= jOLrzqt10) {
                    arrayList11.add(num2);
                }
                it5 = it12;
                size = i4;
            }
            java.util.Iterator it13 = it5;
            int i5 = size;
            if (!arrayList11.isEmpty()) {
                java.util.Iterator it14 = arrayList11.iterator();
                if (it14.hasNext()) {
                    next3 = it14.next();
                    if (it14.hasNext()) {
                        java.lang.Long lValueOf = java.lang.Long.valueOf(list2.get(((java.lang.Number) next3).intValue()).OLrzqt());
                        do {
                            java.lang.Object next5 = it14.next();
                            java.lang.Object obj2 = next3;
                            java.lang.Long lValueOf2 = java.lang.Long.valueOf(list2.get(((java.lang.Number) next5).intValue()).OLrzqt());
                            if (lValueOf.compareTo(lValueOf2) < 0) {
                                lValueOf = lValueOf2;
                                next3 = next5;
                            } else {
                                next3 = obj2;
                            }
                        } while (it14.hasNext());
                    }
                } else {
                    next3 = null;
                }
                num = (java.lang.Integer) next3;
            } else {
                java.util.Iterator<java.lang.Integer> it15 = yDY.valueOf((java.util.Collection<?>) list2).iterator();
                if (it15.hasNext()) {
                    next2 = it15.next();
                    if (it15.hasNext()) {
                        long jAbs2 = java.lang.Math.abs(list2.get(next2.intValue()).OLrzqt() - jOLrzqt10);
                        while (true) {
                            java.lang.Integer next6 = it15.next();
                            java.lang.Integer num3 = next2;
                            long jAbs3 = java.lang.Math.abs(list2.get(next6.intValue()).OLrzqt() - jOLrzqt10);
                            if (jAbs2 > jAbs3) {
                                next2 = next6;
                                jAbs2 = jAbs3;
                            } else {
                                next2 = num3;
                            }
                            if (!it15.hasNext()) {
                                break;
                            }
                            c46496tWm3 = c46496tWm3;
                            str9 = str9;
                            c46487tWd12 = c46487tWd12;
                            arrayList5 = arrayList5;
                        }
                    }
                } else {
                    next2 = null;
                }
                num = next2;
            }
            if (num == null) {
                pUU.valueOf("PlanetFutureChart", "Cannot find closest data point for marker: timestamp=" + jOLrzqt10);
                c46496tWm2 = c46496tWm3;
                arrayList3 = arrayList7;
                arrayList2 = arrayList5;
                arrayList = arrayList6;
                entry = null;
            } else {
                java.util.ArrayList arrayList12 = arrayList5;
                arrayList = arrayList6;
                long jOLrzqt11 = list2.get(num.intValue()).OLrzqt();
                Date date = new Date(jOLrzqt10);
                OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
                OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
                java.lang.String str17 = pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null);
                arrayList2 = arrayList12;
                java.lang.String str18 = pTA.format$default(new Date(jOLrzqt11), oKDateEnum, oKTimeEnum, null, null, false, 28, null);
                arrayList3 = arrayList7;
                MarkerSide markerSideEZpvd = c46487tWd12.EZpvd();
                java.lang.Number numberKWHzl2 = c46487tWd12.KWHzl();
                java.lang.String str19 = str9;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                C46487tWd c46487tWd13 = c46487tWd12;
                sb2.append("Marker mapped (left): ");
                sb2.append(markerSideEZpvd);
                sb2.append(" marker at ");
                sb2.append(str17);
                sb2.append(" (");
                sb2.append(jOLrzqt10);
                sb2.append(") → Data[");
                sb2.append(num);
                sb2.append("] at ");
                sb2.append(str18);
                sb2.append(" (");
                sb2.append(jOLrzqt11);
                sb2.append(") | diff=+");
                sb2.append(jOLrzqt10 - jOLrzqt11);
                sb2.append("ms | value=");
                sb2.append(numberKWHzl2);
                pUU.EZpvd("PlanetFutureChart", sb2.toString());
                float fIntValue = num.intValue();
                float fDjBIcL3 = C33129mqd.djBIcL(list2.get(num.intValue()).KWHzl());
                int i6 = Activity.OLrzqt[c46487tWd13.EZpvd().ordinal()];
                if (i6 == 1) {
                    c46496tWm2 = this;
                    android.content.Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, str19);
                    drawableOLrzqt = c46496tWm2.OLrzqt(context5);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    android.content.Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, str19);
                    c46496tWm2 = this;
                    drawableOLrzqt = c46496tWm2.AEQbTJ(context6);
                }
                entry = new Entry(fIntValue, fDjBIcL3, drawableOLrzqt, c46487tWd13);
            }
            java.util.ArrayList arrayList13 = arrayList3;
            if (entry != null) {
                arrayList13.add(entry);
            }
            arrayList7 = arrayList13;
            c46496tWm3 = c46496tWm2;
            arrayList6 = arrayList;
            it5 = it13;
            size = i5;
            arrayList5 = arrayList2;
        }
    }

    public final android.graphics.drawable.Drawable OLrzqt(android.content.Context context) {
        return new tVW(context, "B", C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null), context.getColor(C52761wXj.Activity.htlTjW), true);
    }

    public final android.graphics.drawable.Drawable AEQbTJ(android.content.Context context) {
        return new tVW(context, ExifInterface.LATITUDE_SOUTH, C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null), context.getColor(C52761wXj.Activity.htlTjW), false);
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OLrzqt();
    }

    private final void OLrzqt() {
        this.DbNXlk = yDY.AhwBna();
        setRenderer(null);
    }
}
