package o;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54800xVu {
    public static final C54800xVu copydefault = new C54800xVu();

    private C54800xVu() {
    }

    public static /* synthetic */ void initLineBarChart$default(C54800xVu c54800xVu, android.content.Context context, BarLineChartBase barLineChartBase, MarkerView markerView, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        c54800xVu.copydefault(context, barLineChartBase, markerView, z);
    }

    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void copydefault(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(barLineChartBase, "");
        int color = ContextCompat.getColor(context, C32113mPz.ActionBar.iwGUEr);
        int color2 = ContextCompat.getColor(context, C52761wXj.Activity.Qsauvs);
        int color3 = ContextCompat.getColor(context, C52761wXj.Activity.sZqaRl);
        int color4 = ContextCompat.getColor(context, C32113mPz.ActionBar.DTwDnp);
        int color5 = ContextCompat.getColor(context, C32113mPz.ActionBar.QOLQEE);
        int color6 = Color.parseColor("#FFCCCCCC");
        if (z) {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            color3 = C38303pTu.OLrzqt(locale) ? color4 : color6;
        }
        if (z) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            color2 = C38303pTu.OLrzqt(locale2) ? color5 : color6;
        }
        barLineChartBase.setTouchEnabled(true);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setDragEnabled(true);
        barLineChartBase.setDoubleTapToZoomEnabled(false);
        barLineChartBase.getDescription().setEnabled(false);
        barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
        barLineChartBase.setNoDataText(context.getString(C55688xof.Application.hErYDe));
        barLineChartBase.setNoDataTextColor(color);
        if (markerView != null) {
            markerView.setChartView(barLineChartBase);
            barLineChartBase.setMarker(markerView);
        }
        if (z) {
            java.util.Locale locale3 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            if (!C38303pTu.OLrzqt(locale3)) {
                ViewGroup.LayoutParams layoutParams = barLineChartBase.getLayoutParams();
                layoutParams.width = C33052mpF.EZpvd(286.0f, context);
                layoutParams.height = C33052mpF.EZpvd(131.0f, context);
                barLineChartBase.setLayoutParams(layoutParams);
            }
        }
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setTextColor(color2);
        xAxis.setTextSize(10.0f);
        xAxis.setYOffset(3.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(true);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisLineColor(color3);
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setLabelCount(6, false);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
        if (barLineChartBase.getAxisLeft().isEnabled()) {
            YAxis axisLeft = barLineChartBase.getAxisLeft();
            axisLeft.setDrawAxisLine(false);
            axisLeft.setDrawGridLines(false);
            axisLeft.setTextColor(color2);
            axisLeft.setTextSize(10.0f);
            axisLeft.setDrawTopYLabelEntry(true);
        }
        if (barLineChartBase.getAxisRight().isEnabled()) {
            YAxis axisRight = barLineChartBase.getAxisRight();
            axisRight.setDrawAxisLine(false);
            axisRight.setDrawGridLines(false);
            axisRight.setTextColor(color2);
            axisRight.setTextSize(10.0f);
            axisRight.setDrawTopYLabelEntry(true);
        }
    }

    public static /* synthetic */ Entry getDataEntry$default(C54800xVu c54800xVu, BarLineScatterCandleBubbleData barLineScatterCandleBubbleData, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return c54800xVu.OLrzqt(barLineScatterCandleBubbleData, i, num);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.mikephil.charting.data.Entry, java.lang.Object] */
    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> Entry OLrzqt(@NotNull T t, int i, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(t, "");
        ?? entryForIndex = ((IBarLineScatterCandleBubbleDataSet) t.getDataSetByIndex(i)).getEntryForIndex(num != null ? num.intValue() : r2.getEntryCount() - 1);
        Intrinsics.checkNotNullExpressionValue(entryForIndex, "");
        return entryForIndex;
    }

    /* JADX INFO: renamed from: o.xVu$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final int KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = actionBar.EZpvd;
            }
            if ((i3 & 2) != 0) {
                str2 = actionBar.AEQbTJ;
            }
            if ((i3 & 4) != 0) {
                i = actionBar.KWHzl;
            }
            if ((i3 & 8) != 0) {
                i2 = actionBar.OLrzqt;
            }
            return actionBar.copydefault(str, str2, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(java.lang.String str, java.lang.String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, i, i2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && this.KWHzl == actionBar.KWHzl && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MinMax(min=" + this.EZpvd + ", max=" + this.AEQbTJ + ", minIndex=" + this.KWHzl + ", maxIndex=" + this.OLrzqt + ")";
        }

        public ActionBar(java.lang.String str, java.lang.String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.KWHzl = i;
            this.OLrzqt = i2;
        }
    }

    public static final ActionBar AEQbTJ(java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return null;
        }
        Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        doubleRef.element = Double.MAX_VALUE;
        Ref.DoubleRef doubleRef2 = new Ref.DoubleRef();
        doubleRef2.element = -1.7976931348623157E308d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            double dGEmmrt = C56548yJl.gEmmrt(doubleRef.element, C33129mqd.AEQbTJ(str));
            if (dGEmmrt == C33129mqd.AEQbTJ(str) && dGEmmrt != doubleRef.element) {
                i = i3;
            }
            doubleRef.element = dGEmmrt;
            double dKWHzl = C56548yJl.KWHzl(doubleRef2.element, C33129mqd.AEQbTJ(str));
            if (dKWHzl == C33129mqd.AEQbTJ(str)) {
                i2 = i3;
            }
            doubleRef2.element = dKWHzl;
            i3++;
        }
        return new ActionBar(C33129mqd.gEmmrt(java.lang.Double.valueOf(doubleRef.element)), C33129mqd.gEmmrt(java.lang.Double.valueOf(doubleRef2.element)), i, i2);
    }

    public static /* synthetic */ int createLineDataSet$getThemeColor$default(android.content.Context context, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return KWHzl(context, z, f);
    }

    public static final int KWHzl(android.content.Context context, boolean z, float f) {
        if (z) {
            return C33512mxp.AEQbTJ.zLjUOn(context, f);
        }
        return C33512mxp.AEQbTJ.isConnected(context, f);
    }

    public static /* synthetic */ android.graphics.drawable.Drawable createLineDataSet$updateDrawableFill$default(android.content.Context context, boolean z, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            f3 = 0.12f;
        }
        return KWHzl(context, z, f, f2, f3);
    }

    public static final android.graphics.drawable.Drawable KWHzl(android.content.Context context, boolean z, float f, float f2, float f3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iKWHzl = KWHzl(context, z, 0.0f);
        int iKWHzl2 = KWHzl(context, z, f3);
        if (f > 0.0f) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iKWHzl2));
            arrayList.add(java.lang.Integer.valueOf(iKWHzl));
            return new GradientDrawable(orientation, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        if (f2 < 0.0f) {
            GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iKWHzl));
            arrayList.add(java.lang.Integer.valueOf(iKWHzl2));
            return new GradientDrawable(orientation2, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        arrayList.add(java.lang.Integer.valueOf(iKWHzl2));
        arrayList.add(java.lang.Integer.valueOf(iKWHzl));
        arrayList.add(java.lang.Integer.valueOf(iKWHzl2));
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 0.5f;
        if (f2 != f) {
            floatRef.element = f2 / java.lang.Math.abs(f2 - f);
        }
        TaskDescription taskDescription = new TaskDescription(arrayList, floatRef);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(taskDescription);
        return paintDrawable;
    }

    /* JADX INFO: renamed from: o.xVu$TaskDescription */
    public static final class TaskDescription extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ java.util.ArrayList<java.lang.Integer> KWHzl;
        public final /* synthetic */ Ref.FloatRef OLrzqt;

        public TaskDescription(java.util.ArrayList<java.lang.Integer> arrayList, Ref.FloatRef floatRef) {
            this.KWHzl = arrayList;
            this.OLrzqt = floatRef;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)), CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) this.KWHzl), new float[]{0.0f, this.OLrzqt.element, 1.0f}, Shader.TileMode.REPEAT);
        }
    }

    public static final LineDataSet EZpvd(java.util.List<StrategyProfitResponse> list, android.content.Context context, java.lang.Integer num, java.util.List<? extends Entry> list2) {
        boolean zCopydefault;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zCopydefault = true;
                break;
            }
            Entry entry = list2.get(i);
            if (entry.getData() != null) {
                zCopydefault = C33129mqd.copydefault((java.lang.Object) java.lang.Float.valueOf(entry.getY()), (java.lang.Object) 0);
                break;
            }
            i++;
        }
        android.graphics.drawable.Drawable drawableCopydefault = copydefault(list, context, num, zCopydefault);
        LineDataSet lineDataSet = new LineDataSet(list2, "");
        lineDataSet.setColor(createLineDataSet$getThemeColor$default(context, zCopydefault, 0.0f, 4, null));
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawFilled(true);
        if (drawableCopydefault == null) {
            lineDataSet.setDrawFilled(false);
        } else {
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(drawableCopydefault);
        }
        lineDataSet.setDrawCircles(false);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.enableDashedHighlightLine(C33518mxv.EZpvd(context, 5.0f), C33518mxv.EZpvd(context, 2.0f), 0.0f);
        lineDataSet.setHighlightLineWidth(C33518mxv.EZpvd(context, 1.0E-6f));
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        lineDataSet.setDrawHorizontalHighlightIndicator(true);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        lineDataSet.setDrawCircles(false);
        return lineDataSet;
    }

    public static final java.util.List<ILineDataSet> copydefault(java.util.List<StrategyProfitResponse> list, android.content.Context context, java.lang.Integer num, java.util.List<? extends Entry> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Entry entry = (Entry) obj;
            arrayList2.add(entry);
            if (entry.getData() == null) {
                arrayList.add(EZpvd(list, context, num, arrayList2));
                arrayList2 = new java.util.ArrayList();
                arrayList2.add(entry);
            }
            if (i == list2.size() - 1) {
                arrayList.add(EZpvd(list, context, num, arrayList2));
            }
            i++;
        }
        return arrayList;
    }

    public final java.util.List<ILineDataSet> OLrzqt(@NotNull android.content.Context context, @NotNull java.util.List<StrategyProfitResponse> list, @NotNull java.util.ArrayList<Entry> arrayList, int i, @NotNull YAxis.AxisDependency axisDependency, boolean z, boolean z2, boolean z3, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(axisDependency, "");
        return copydefault(list, context, num, (java.util.List<? extends Entry>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
    }

    public static final android.graphics.drawable.Drawable copydefault(java.util.List<StrategyProfitResponse> list, android.content.Context context, java.lang.Integer num, boolean z) {
        android.graphics.drawable.Drawable drawableCreateLineDataSet$updateDrawableFill$default;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StrategyProfitResponse) it.next()).getPnlRatio());
        }
        ActionBar actionBarAEQbTJ = AEQbTJ(arrayList);
        java.lang.String strEZpvd = actionBarAEQbTJ != null ? actionBarAEQbTJ.EZpvd() : null;
        java.lang.String strAEQbTJ = actionBarAEQbTJ != null ? actionBarAEQbTJ.AEQbTJ() : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) && !C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            drawableCreateLineDataSet$updateDrawableFill$default = null;
        } else {
            if (java.lang.Math.abs(C33129mqd.AEQbTJ(C33129mqd.subS$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(strAEQbTJ)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(strEZpvd)), null, null, null, 14, null))) < 9.999999747378752E-6d) {
                return null;
            }
            drawableCreateLineDataSet$updateDrawableFill$default = createLineDataSet$updateDrawableFill$default(context, z, C33129mqd.djBIcL(strEZpvd), C33129mqd.djBIcL(strAEQbTJ), 0.0f, 16, null);
        }
        if (drawableCreateLineDataSet$updateDrawableFill$default == null) {
            return num != null ? C33070mpX.KWHzl(num.intValue()) : null;
        }
        return drawableCreateLineDataSet$updateDrawableFill$default;
    }
}
