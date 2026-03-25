package o;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47244tmQ;
import o.C52761wXj;
import o.pWU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46663tbS extends android.widget.FrameLayout {
    public java.lang.String AEQbTJ;
    public int AYXKKw;
    public java.lang.String AhwBna;
    public InterfaceC46660tbP DbNXlk;
    public android.widget.LinearLayout EZpvd;
    public final int KWHzl;
    public int OLrzqt;
    public LineChart copydefault;
    public InterfaceC34851nkJ djBIcL;
    public java.lang.String fetchVPNInfo;
    public int gEmmrt;
    public LineDataSet valueOf;

    public static final float EZpvd(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmptyView(android.widget.LinearLayout linearLayout) {
        this.EZpvd = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnValueSelectedListener(@NotNull InterfaceC46660tbP interfaceC46660tbP) {
        Intrinsics.checkNotNullParameter(interfaceC46660tbP, "");
        this.DbNXlk = interfaceC46660tbP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceDigits(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPricePrecision(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeType(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46663tbS(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AhwBna = MultiTransferSignData.DEFAULT_INTERVAL;
        this.AEQbTJ = "BTC";
        this.fetchVPNInfo = "USD";
        this.AYXKKw = 2;
        this.gEmmrt = this.KWHzl;
        EZpvd(context, false, attributeSet);
    }

    public final void EZpvd(android.content.Context context, boolean z, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qZH.Fragment.KWHzl);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.gEmmrt = typedArrayObtainStyledAttributes.getInt(qZH.Fragment.AYXKKw, this.KWHzl);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.OLrzqt = this.gEmmrt == this.KWHzl ? 0 : 400;
        this.copydefault = (LineChart) android.view.LayoutInflater.from(context).inflate(qZH.ActionBar.dNCPSb, this).findViewById(qZH.StateListAnimator.OeawrHRnVkix);
        this.EZpvd = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.Swccd);
        LineChart lineChart = this.copydefault;
        if (lineChart == null) {
            Intrinsics.gEmmrt("");
            lineChart = null;
        }
        lineChart.setNoDataText("");
        this.djBIcL = this.gEmmrt == this.KWHzl ? new C46659tbO(context) : new C34854nkM(context);
        this.valueOf = z ? new LineDataSet(null, C46656tbL.EZpvd(context, qZH.PendingIntent.ORxRYg)) : new LineDataSet(null, "");
        KWHzl(context, z);
    }

    public final void KWHzl(@NotNull android.content.Context context, boolean z) {
        MarkerView markerView;
        Intrinsics.checkNotNullParameter(context, "");
        pWU.Application application = pWU.Companion;
        LineChart lineChart = this.copydefault;
        LineChart lineChart2 = null;
        if (lineChart == null) {
            Intrinsics.gEmmrt("");
            lineChart = null;
        }
        if (z) {
            markerView = null;
        } else {
            java.lang.Object obj = this.djBIcL;
            if (obj == null) {
                Intrinsics.gEmmrt("");
                obj = null;
            }
            markerView = (MarkerView) obj;
        }
        application.OLrzqt(context, lineChart, markerView, z);
        if (z) {
            LineChart lineChart3 = this.copydefault;
            if (lineChart3 == null) {
                Intrinsics.gEmmrt("");
                lineChart3 = null;
            }
            ViewGroup.LayoutParams layoutParams = lineChart3.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams2.setMarginStart(C33052mpF.EZpvd(14.0f, context2));
            LineChart lineChart4 = this.copydefault;
            if (lineChart4 == null) {
                Intrinsics.gEmmrt("");
                lineChart4 = null;
            }
            lineChart4.setLayoutParams(layoutParams2);
        }
        LineChart lineChart5 = this.copydefault;
        if (lineChart5 == null) {
            Intrinsics.gEmmrt("");
            lineChart5 = null;
        }
        lineChart5.getAxisLeft().resetAxisMinimum();
        LineChart lineChart6 = this.copydefault;
        if (lineChart6 == null) {
            Intrinsics.gEmmrt("");
            lineChart6 = null;
        }
        lineChart6.getAxisRight().resetAxisMinimum();
        LineChart lineChart7 = this.copydefault;
        if (lineChart7 == null) {
            Intrinsics.gEmmrt("");
            lineChart7 = null;
        }
        lineChart7.getAxisRight().setEnabled(true);
        LineChart lineChart8 = this.copydefault;
        if (lineChart8 == null) {
            Intrinsics.gEmmrt("");
            lineChart8 = null;
        }
        lineChart8.setNoDataText("");
        if (z) {
            LineChart lineChart9 = this.copydefault;
            if (lineChart9 == null) {
                Intrinsics.gEmmrt("");
                lineChart9 = null;
            }
            lineChart9.getLegend().setForm(Legend.LegendForm.SQUARE);
            if (C55296xhK.OLrzqt(context)) {
                LineChart lineChart10 = this.copydefault;
                if (lineChart10 == null) {
                    Intrinsics.gEmmrt("");
                    lineChart10 = null;
                }
                lineChart10.getLegend().setDirection(Legend.LegendDirection.RIGHT_TO_LEFT);
            } else {
                LineChart lineChart11 = this.copydefault;
                if (lineChart11 == null) {
                    Intrinsics.gEmmrt("");
                    lineChart11 = null;
                }
                lineChart11.getLegend().setDirection(Legend.LegendDirection.LEFT_TO_RIGHT);
            }
        } else {
            LineChart lineChart12 = this.copydefault;
            if (lineChart12 == null) {
                Intrinsics.gEmmrt("");
                lineChart12 = null;
            }
            lineChart12.getLegend().setForm(Legend.LegendForm.NONE);
        }
        LineChart lineChart13 = this.copydefault;
        if (lineChart13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            lineChart2 = lineChart13;
        }
        lineChart2.setOnChartValueSelectedListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.tbS$TaskDescription */
    public static final class TaskDescription implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            InterfaceC46660tbP interfaceC46660tbP = C46663tbS.this.DbNXlk;
            if (interfaceC46660tbP != null) {
                interfaceC46660tbP.OLrzqt(entry, highlight);
            }
        }
    }

    public final void setData(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.String> arrayList2, @NotNull java.util.ArrayList<java.lang.String> arrayList3, @NotNull java.lang.String str, boolean z) {
        LineChart lineChart;
        LineChart lineChart2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (arrayList.size() == 0 || arrayList2.size() == 0 || arrayList3.size() == 0) {
            android.widget.LinearLayout linearLayout = this.EZpvd;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LineChart lineChart3 = this.copydefault;
            if (lineChart3 == null) {
                Intrinsics.gEmmrt("");
                lineChart = null;
            } else {
                lineChart = lineChart3;
            }
            lineChart.setVisibility(8);
            return;
        }
        android.widget.LinearLayout linearLayout2 = this.EZpvd;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LineChart lineChart4 = this.copydefault;
        if (lineChart4 == null) {
            Intrinsics.gEmmrt("");
            lineChart4 = null;
        }
        lineChart4.setVisibility(0);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList4.add(java.lang.String.valueOf(C33129mqd.AEQbTJ(arrayList2.get(i)) - C33129mqd.AEQbTJ(arrayList3.get(i))));
        }
        java.lang.Object obj = arrayList4.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        double dAbs = java.lang.Math.abs(java.lang.Double.parseDouble((java.lang.String) obj));
        int size2 = arrayList4.size();
        for (int i2 = 0; i2 < size2; i2++) {
            java.lang.Object obj2 = arrayList4.get(i2);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            if (dAbs < java.lang.Math.abs(java.lang.Double.parseDouble((java.lang.String) obj2))) {
                java.lang.Object obj3 = arrayList4.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj3, "");
                dAbs = java.lang.Math.abs(java.lang.Double.parseDouble((java.lang.String) obj3));
            }
        }
        LineChart lineChart5 = this.copydefault;
        if (lineChart5 == null) {
            Intrinsics.gEmmrt("");
            lineChart5 = null;
        }
        lineChart5.getAxisLeft().setValueFormatter(new C35143npk(this.AYXKKw));
        LineChart lineChart6 = this.copydefault;
        if (lineChart6 == null) {
            Intrinsics.gEmmrt("");
            lineChart6 = null;
        }
        lineChart6.getAxisRight().setValueFormatter(new C35143npk(this.AYXKKw));
        LineChart lineChart7 = this.copydefault;
        if (lineChart7 == null) {
            Intrinsics.gEmmrt("");
            lineChart7 = null;
        }
        lineChart7.getAxisRight().setAxisMaximum(java.lang.Float.parseFloat(copydefault(this.AYXKKw, dAbs, RoundingMode.UP)));
        LineChart lineChart8 = this.copydefault;
        if (lineChart8 == null) {
            Intrinsics.gEmmrt("");
            lineChart8 = null;
        }
        lineChart8.getAxisRight().setAxisMinimum(-java.lang.Float.parseFloat(copydefault(this.AYXKKw, dAbs, RoundingMode.DOWN)));
        LineChart lineChart9 = this.copydefault;
        if (lineChart9 == null) {
            Intrinsics.gEmmrt("");
            lineChart9 = null;
        }
        lineChart9.getXAxis().setSpaceMin(1.0f);
        java.util.ArrayList<Entry> arrayList5 = new java.util.ArrayList<>();
        java.util.ArrayList<Entry> arrayList6 = new java.util.ArrayList<>();
        java.util.ArrayList<Entry> arrayList7 = new java.util.ArrayList<>();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            float f = i3 * 1.0f;
            arrayList5.add(new Entry(f, C33129mqd.djBIcL(arrayList2.get(i3)), arrayList.get(i3)));
            arrayList6.add(new Entry(f, C33129mqd.djBIcL(arrayList3.get(i3)), arrayList.get(i3)));
            arrayList7.add(new Entry(f, C33129mqd.djBIcL(arrayList4.get(i3)), arrayList.get(i3)));
        }
        LineChart lineChart10 = this.copydefault;
        if (lineChart10 == null) {
            Intrinsics.gEmmrt("");
            lineChart10 = null;
        }
        lineChart10.getXAxis().setValueFormatter(new Activity(arrayList, this));
        LineChart lineChart11 = this.copydefault;
        if (lineChart11 == null) {
            Intrinsics.gEmmrt("");
            lineChart2 = null;
        } else {
            lineChart2 = lineChart11;
        }
        setChartFuturesSpotGapData(lineChart2, arrayList5, arrayList6, arrayList7, z);
    }

    /* JADX INFO: renamed from: o.tbS$Activity */
    public static final class Activity extends ValueFormatter {
        public final /* synthetic */ java.util.ArrayList<java.lang.String> EZpvd;
        public final /* synthetic */ C46663tbS KWHzl;

        public Activity(java.util.ArrayList<java.lang.String> arrayList, C46663tbS c46663tbS) {
            this.EZpvd = arrayList;
            this.KWHzl = c46663tbS;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            return (this.EZpvd.size() <= i || i < 0) ? "" : (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.AEQbTJ(), (java.lang.Object) "2") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl.AEQbTJ(), (java.lang.Object) "1")) ? pTA.formatDate$default(new Date(C33129mqd.valueOf(this.EZpvd.get(i))), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null) : pTA.formatTime$default(new Date(C33129mqd.valueOf(this.EZpvd.get(i))), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }
    }

    public final java.lang.String copydefault(int i, double d, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return java.lang.String.valueOf(C33129mqd.formatD$default(new BigDecimal(java.lang.String.valueOf(d)), java.lang.Integer.valueOf(i), null, roundingMode, 2, null));
    }

    public final void setChartFuturesSpotGapData(LineChart lineChart, java.util.ArrayList<Entry> arrayList, java.util.ArrayList<Entry> arrayList2, java.util.ArrayList<Entry> arrayList3, boolean z) {
        java.util.ArrayList<Entry> arrayList4;
        LineDataSet lineDataSet;
        LineDataSet lineDataSet2;
        LineDataSet lineDataSet3;
        Highlight[] highlighted;
        LineDataSet lineDataSet4 = this.valueOf;
        if (lineDataSet4 == null) {
            Intrinsics.gEmmrt("");
            arrayList4 = arrayList;
            lineDataSet4 = null;
        } else {
            arrayList4 = arrayList;
        }
        lineDataSet4.setValues(arrayList4);
        LineDataSet lineDataSet5 = this.valueOf;
        if (lineDataSet5 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet5 = null;
        }
        LineDataSet.Mode mode = LineDataSet.Mode.CUBIC_BEZIER;
        lineDataSet5.setMode(mode);
        LineDataSet lineDataSet6 = this.valueOf;
        if (lineDataSet6 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet6 = null;
        }
        lineDataSet6.setCubicIntensity(0.02f);
        LineDataSet lineDataSet7 = this.valueOf;
        if (lineDataSet7 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet7 = null;
        }
        lineDataSet7.setDrawIcons(false);
        LineDataSet lineDataSet8 = this.valueOf;
        if (lineDataSet8 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet8 = null;
        }
        lineDataSet8.setColor(getResources().getColor(C52761wXj.Activity.RlQdEF));
        LineDataSet lineDataSet9 = this.valueOf;
        if (lineDataSet9 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet9 = null;
        }
        lineDataSet9.setCircleColor(getResources().getColor(C52761wXj.Activity.RlQdEF));
        LineDataSet lineDataSet10 = this.valueOf;
        if (lineDataSet10 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet10 = null;
        }
        lineDataSet10.setLineWidth(1.5f);
        LineDataSet lineDataSet11 = this.valueOf;
        if (lineDataSet11 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet11 = null;
        }
        lineDataSet11.setCircleRadius(4.0f);
        LineDataSet lineDataSet12 = this.valueOf;
        if (lineDataSet12 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet12 = null;
        }
        lineDataSet12.setCircleHoleRadius(2.0f);
        LineDataSet lineDataSet13 = this.valueOf;
        if (lineDataSet13 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet13 = null;
        }
        lineDataSet13.setDrawCircleHole(false);
        LineDataSet lineDataSet14 = this.valueOf;
        if (lineDataSet14 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet14 = null;
        }
        lineDataSet14.setFormLineWidth(1.0f);
        LineDataSet lineDataSet15 = this.valueOf;
        if (lineDataSet15 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet15 = null;
        }
        lineDataSet15.setFormSize(15.0f);
        LineDataSet lineDataSet16 = this.valueOf;
        if (lineDataSet16 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet16 = null;
        }
        lineDataSet16.setDrawValues(false);
        LineDataSet lineDataSet17 = this.valueOf;
        if (lineDataSet17 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet17 = null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        lineDataSet17.setAxisDependency(axisDependency);
        LineDataSet lineDataSet18 = this.valueOf;
        if (lineDataSet18 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet18 = null;
        }
        lineDataSet18.setHighLightColor(C33070mpX.copydefault(this.gEmmrt == this.KWHzl ? C32113mPz.ActionBar.fJNWhG : C52761wXj.Activity.dXcUrg));
        LineDataSet lineDataSet19 = this.valueOf;
        if (lineDataSet19 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet19 = null;
        }
        lineDataSet19.setHighlightLineWidth(0.5f);
        LineDataSet lineDataSet20 = this.valueOf;
        if (lineDataSet20 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet20 = null;
        }
        lineDataSet20.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        if (this.gEmmrt == this.KWHzl) {
            LineDataSet lineDataSet21 = this.valueOf;
            if (lineDataSet21 == null) {
                Intrinsics.gEmmrt("");
                lineDataSet21 = null;
            }
            lineDataSet21.disableDashedHighlightLine();
        }
        LineDataSet lineDataSet22 = this.valueOf;
        if (lineDataSet22 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet22 = null;
        }
        lineDataSet22.setDrawHorizontalHighlightIndicator(false);
        LineDataSet lineDataSet23 = this.valueOf;
        if (lineDataSet23 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet23 = null;
        }
        lineDataSet23.setDrawCircles(false);
        LineDataSet lineDataSet24 = this.valueOf;
        if (lineDataSet24 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet24 = null;
        }
        lineDataSet24.setFormSize(6.0f);
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            lineDataSet = new LineDataSet(arrayList2, C46656tbL.EZpvd(context, qZH.PendingIntent.OcIXYQ));
        } else {
            lineDataSet = new LineDataSet(arrayList2, "");
        }
        lineDataSet.setMode(mode);
        lineDataSet.setCubicIntensity(0.02f);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setColor(getResources().getColor(C52761wXj.Activity.QKudOq));
        lineDataSet.setCircleColor(getResources().getColor(C52761wXj.Activity.QKudOq));
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setCircleRadius(4.0f);
        lineDataSet.setAxisDependency(axisDependency);
        lineDataSet.setCircleHoleRadius(2.0f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setFormLineWidth(1.0f);
        lineDataSet.setFormSize(15.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setHighLightColor(C33070mpX.copydefault(this.gEmmrt == this.KWHzl ? C32113mPz.ActionBar.fJNWhG : C52761wXj.Activity.dXcUrg));
        lineDataSet.setHighlightLineWidth(0.5f);
        lineDataSet.setHighlightEnabled(this.gEmmrt != this.KWHzl);
        lineDataSet.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        if (this.gEmmrt == this.KWHzl) {
            lineDataSet.disableDashedHighlightLine();
        }
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setFormSize(6.0f);
        if (z) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            lineDataSet2 = new LineDataSet(arrayList3, C46656tbL.EZpvd(context2, qZH.PendingIntent.DGgkXd));
        } else {
            lineDataSet2 = new LineDataSet(arrayList3, "");
        }
        lineDataSet2.setDrawIcons(false);
        lineDataSet2.setColor(ContextCompat.getColor(getContext(), z ? C47244tmQ.Application.copydefault : C52761wXj.Activity.DGgkXd));
        lineDataSet2.setAxisDependency(YAxis.AxisDependency.RIGHT);
        lineDataSet2.setLineWidth(0.0f);
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setHighLightColor(getResources().getColor(C52761wXj.Activity.fZc));
        lineDataSet2.setHighlightLineWidth(0.5f);
        lineDataSet2.enableDashedHighlightLine(10.0f, 5.0f, 0.0f);
        lineDataSet2.disableDashedHighlightLine();
        lineDataSet2.setHighlightEnabled(false);
        lineDataSet2.setDrawHorizontalHighlightIndicator(false);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setDrawFilled(true);
        lineDataSet2.setFillColor(getResources().getColor(C52761wXj.Activity.OqFWZa));
        lineDataSet2.setFillFormatter(new IFillFormatter() { // from class: o.tbQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.github.mikephil.charting.formatter.IFillFormatter
            public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
                return C46663tbS.EZpvd(iLineDataSet, lineDataProvider);
            }
        });
        lineDataSet2.setFormSize(6.0f);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(lineDataSet2);
        LineDataSet lineDataSet25 = this.valueOf;
        if (lineDataSet25 == null) {
            Intrinsics.gEmmrt("");
            lineDataSet3 = null;
        } else {
            lineDataSet3 = lineDataSet25;
        }
        arrayList5.add(lineDataSet3);
        arrayList5.add(lineDataSet);
        LineData lineData = new LineData(arrayList5);
        if (z) {
            lineChart.getLegend().setTextColor(getResources().getColor(C32113mPz.ActionBar.iwGUEr));
            lineChart.getLegend().setYEntrySpace(12.0f);
        }
        if (this.gEmmrt != this.KWHzl) {
            copydefault();
        }
        lineChart.setData(lineData);
        if (z) {
            return;
        }
        if (this.gEmmrt == this.KWHzl && ((highlighted = lineChart.getHighlighted()) == null || highlighted.length == 0)) {
            lineChart.highlightValue(lineChart.getHighlightByTouchPoint(lineChart.getContentRect().right, 0.0f));
        }
        lineChart.animateX(this.OLrzqt);
    }

    public final void copydefault() {
        LineChart lineChart = this.copydefault;
        if (lineChart == null) {
            Intrinsics.gEmmrt("");
            lineChart = null;
        }
        lineChart.clear();
    }

    public final void setMarketViewType(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC34851nkJ interfaceC34851nkJ = this.djBIcL;
        if (interfaceC34851nkJ == null) {
            Intrinsics.gEmmrt("");
            interfaceC34851nkJ = null;
        }
        interfaceC34851nkJ.setType(str);
    }

    public final void setResId(int i) {
        InterfaceC34851nkJ interfaceC34851nkJ = this.djBIcL;
        if (interfaceC34851nkJ == null) {
            Intrinsics.gEmmrt("");
            interfaceC34851nkJ = null;
        }
        interfaceC34851nkJ.setResId(i);
    }
}
