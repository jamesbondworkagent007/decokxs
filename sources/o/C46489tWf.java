package o;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46489tWf {
    public static final C46489tWf EZpvd = new C46489tWf();

    private C46489tWf() {
    }

    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void OLrzqt(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase, MarkerView markerView, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(barLineChartBase, "");
        int color = ContextCompat.getColor(context, C52761wXj.Activity.Dff);
        int color2 = ContextCompat.getColor(context, C32113mPz.ActionBar.DTwDnp);
        if (!z) {
            color2 = color;
        }
        barLineChartBase.getDescription().setEnabled(false);
        barLineChartBase.setDrawGridBackground(false);
        barLineChartBase.setDragEnabled(true);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setPinchZoom(false);
        if (markerView != null) {
            barLineChartBase.setBackgroundColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
            barLineChartBase.setMarker(markerView);
            markerView.setChartView(barLineChartBase);
        }
        barLineChartBase.setExtraOffsets(0.0f, 0.0f, 0.0f, 10.0f);
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisLineColor(color2);
        xAxis.setTextColor(color);
        C55051xce c55051xce = C55051xce.OLrzqt;
        xAxis.setTypeface(c55051xce.valueOf());
        xAxis.setGranularity(1.0f);
        xAxis.setGranularityEnabled(true);
        xAxis.setAxisLineWidth(0.5f);
        YAxis axisLeft = barLineChartBase.getAxisLeft();
        axisLeft.setDrawGridLines(true);
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setTextColor(color);
        axisLeft.setTypeface(c55051xce.valueOf());
        YAxis axisRight = barLineChartBase.getAxisRight();
        axisRight.setDrawGridLines(true);
        axisRight.setDrawAxisLine(false);
        axisRight.setAxisMinimum(0.0f);
        axisRight.setTextColor(color);
        axisRight.setTypeface(c55051xce.valueOf());
        axisRight.setEnabled(false);
    }

    public final LineDataSet OLrzqt(@NotNull android.content.Context context, @NotNull java.util.ArrayList<Entry> arrayList, int i, @NotNull YAxis.AxisDependency axisDependency, boolean z, boolean z2, boolean z3, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(axisDependency, "");
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(z2);
        if (z2) {
            lineDataSet.setCircleRadius(2.5f);
            lineDataSet.setCircleColor(i);
        }
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighlightEnabled(z);
        if (z) {
            lineDataSet.setHighLightColor(ContextCompat.getColor(context, C52761wXj.Activity.Qsauvs));
            lineDataSet.setHighlightLineWidth(0.5f);
        }
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setColor(i);
        lineDataSet.setAxisDependency(axisDependency);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setDrawFilled(z3);
        if (z3) {
            if (num != null) {
                lineDataSet.setFillDrawable(C33070mpX.KWHzl(num.intValue()));
            } else if (drawable != null) {
                lineDataSet.setFillDrawable(drawable);
            }
        }
        lineDataSet.setValueFormatter(new DefaultValueFormatter(i2));
        return lineDataSet;
    }

    public static /* synthetic */ android.graphics.drawable.Drawable updateDrawableFill$default(C46489tWf c46489tWf, android.content.Context context, float f, float f2, float f3, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f3 = 0.3f;
        }
        float f4 = f3;
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            num = null;
        }
        return c46489tWf.KWHzl(context, f, f2, f4, z2, num);
    }

    public final android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context, float f, float f2, float f3, boolean z, java.lang.Integer num) {
        android.graphics.drawable.Drawable gradientDrawable;
        Intrinsics.checkNotNullParameter(context, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!z && num != null) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            int iAEQbTJ = c33512mxp.AEQbTJ(num.intValue(), 0.0f);
            int iAEQbTJ2 = c33512mxp.AEQbTJ(num.intValue(), f3);
            if (f >= 0.0f) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                arrayList.add(java.lang.Integer.valueOf(iAEQbTJ2));
                arrayList.add(java.lang.Integer.valueOf(iAEQbTJ));
                return new GradientDrawable(orientation, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
            }
            if (f2 <= 0.0f) {
                GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
                arrayList.add(java.lang.Integer.valueOf(iAEQbTJ));
                arrayList.add(java.lang.Integer.valueOf(iAEQbTJ2));
                return new GradientDrawable(orientation2, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
            }
            arrayList.add(java.lang.Integer.valueOf(iAEQbTJ2));
            arrayList.add(java.lang.Integer.valueOf(iAEQbTJ));
            arrayList.add(java.lang.Integer.valueOf(iAEQbTJ));
            arrayList.add(java.lang.Integer.valueOf(iAEQbTJ2));
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = 0.5f;
            if (f2 != f) {
                floatRef.element = f2 / java.lang.Math.abs(f2 - f);
            }
            ActionBar actionBar = new ActionBar(arrayList, floatRef);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(actionBar);
            return paintDrawable;
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        int iZLjUOn = c33512mxp2.zLjUOn(context, 0.0f);
        int iZLjUOn2 = c33512mxp2.zLjUOn(context, f3);
        int iIsConnected = c33512mxp2.isConnected(context, 0.0f);
        int iIsConnected2 = c33512mxp2.isConnected(context, f3);
        if (f >= 0.0f) {
            GradientDrawable.Orientation orientation3 = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn2));
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn));
            return new GradientDrawable(orientation3, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        if (f2 <= 0.0f) {
            GradientDrawable.Orientation orientation4 = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iIsConnected));
            arrayList.add(java.lang.Integer.valueOf(iIsConnected2));
            gradientDrawable = new GradientDrawable(orientation4, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        } else {
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn2));
            arrayList.add(java.lang.Integer.valueOf(iZLjUOn));
            arrayList.add(java.lang.Integer.valueOf(iIsConnected));
            arrayList.add(java.lang.Integer.valueOf(iIsConnected2));
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = 0.5f;
            if (f2 != f) {
                floatRef2.element = f2 / java.lang.Math.abs(f2 - f);
            }
            TaskDescription taskDescription = new TaskDescription(arrayList, floatRef2);
            PaintDrawable paintDrawable2 = new PaintDrawable();
            paintDrawable2.setShape(new RectShape());
            paintDrawable2.setShaderFactory(taskDescription);
            gradientDrawable = paintDrawable2;
        }
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: o.tWf$ActionBar */
    public static final class ActionBar extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ Ref.FloatRef AEQbTJ;
        public final /* synthetic */ java.util.ArrayList<java.lang.Integer> OLrzqt;

        public ActionBar(java.util.ArrayList<java.lang.Integer> arrayList, Ref.FloatRef floatRef) {
            this.OLrzqt = arrayList;
            this.AEQbTJ = floatRef;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(i2));
            int[] iArrFARcdN = CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) this.OLrzqt);
            float f = this.AEQbTJ.element;
            return new LinearGradient(0.0f, 0.0f, 0.0f, fDjBIcL, iArrFARcdN, new float[]{0.0f, f, f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    /* JADX INFO: renamed from: o.tWf$TaskDescription */
    public static final class TaskDescription extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ Ref.FloatRef EZpvd;
        public final /* synthetic */ java.util.ArrayList<java.lang.Integer> copydefault;

        public TaskDescription(java.util.ArrayList<java.lang.Integer> arrayList, Ref.FloatRef floatRef) {
            this.copydefault = arrayList;
            this.EZpvd = floatRef;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(i2));
            int[] iArrFARcdN = CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) this.copydefault);
            float f = this.EZpvd.element;
            return new LinearGradient(0.0f, 0.0f, 0.0f, fDjBIcL, iArrFARcdN, new float[]{0.0f, f, f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final int AEQbTJ(@NotNull java.lang.String str, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        return C33129mqd.AEQbTJ(bigDecimalOLrzqt, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33129mqd.gEmmrt(bigDecimalOLrzqt, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
    }
}
