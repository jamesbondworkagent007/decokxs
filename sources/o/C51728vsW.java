package o;

import android.graphics.Paint;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51728vsW extends C51731vsZ {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.vsW$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vsW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51728vsW(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51728vsW(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51728vsW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    private final void copydefault() {
        setViewPortOffsets(2.0f, C33052mpF.dp2pxFloat$default(3.0f, null, 1, null), 2.0f, C33052mpF.dp2pxFloat$default(3.0f, null, 1, null));
        setDrawGridBackground(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setDrawBorders(false);
        setTouchEnabled(true);
        setNoDataText("");
        setClipDataToContent(false);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        setDragEnabled(false);
        getXAxis().setEnabled(false);
        getAxisLeft().setEnabled(false);
        getAxisLeft().setSpaceTop(0.0f);
        getAxisLeft().setSpaceBottom(0.0f);
        getAxisRight().setSpaceBottom(0.0f);
        getAxisRight().setSpaceBottom(0.0f);
        getAxisRight().setEnabled(false);
        DataRenderer renderer = getRenderer();
        if (renderer instanceof LineChartRenderer) {
            LineChartRenderer lineChartRenderer = (LineChartRenderer) renderer;
            lineChartRenderer.getPaintRender().setAntiAlias(true);
            lineChartRenderer.getPaintRender().setStrokeJoin(Paint.Join.ROUND);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(@NotNull java.util.List<? extends Entry> list, boolean z, @NotNull Entry entry, @NotNull Entry entry2, java.lang.String str) {
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(entry, "");
        Intrinsics.checkNotNullParameter(entry2, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseGraph$default = z ? C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null) : C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        if (str != null) {
            bigDecimalEZpvd = C33129mqd.EZpvd(str);
            if (bigDecimalEZpvd.compareTo(BigDecimal.ZERO) <= 0) {
                bigDecimalEZpvd = null;
            }
        }
        if (entry.getY() == entry2.getY()) {
            float f = 1;
            float f2 = 2;
            getAxisLeft().setAxisMaximum(entry.getY() + f + (entry.getY() / f2));
            getAxisLeft().setAxisMinimum((entry2.getY() - f) - (entry2.getY() / f2));
        } else if (bigDecimalEZpvd != null) {
            double dDivD$default = C33129mqd.divD$default(C33129mqd.EZpvd(java.lang.Float.valueOf(entry.getY() + entry2.getY())), C33129mqd.EZpvd(java.lang.Float.valueOf(2.0f)), null, null, null, 14, null);
            double dMulD$default = C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), bigDecimalEZpvd, null, null, null, 14, null);
            double dMulD$default2 = C33129mqd.mulD$default(java.lang.Double.valueOf(C33129mqd.subD$default(java.lang.Float.valueOf(entry.getY()), java.lang.Float.valueOf(entry2.getY()), null, null, null, 14, null)), bigDecimalEZpvd, null, null, null, 14, null);
            double dDivD$default2 = C33129mqd.divD$default(C33129mqd.EZpvd(java.lang.Float.valueOf(entry.getY())), java.lang.Double.valueOf(dDivD$default), null, null, null, 14, null);
            if (C33129mqd.valueOf(java.lang.Double.valueOf(dMulD$default), 100)) {
                if (C33129mqd.gEmmrt(java.lang.Double.valueOf(dMulD$default2), java.lang.Double.valueOf(0.1d))) {
                    double dDivD$default3 = C33129mqd.divD$default(C33129mqd.EZpvd(java.lang.Double.valueOf(0.05d)), bigDecimalEZpvd, null, null, null, 14, null);
                    getAxisLeft().setAxisMaximum((float) (dDivD$default + dDivD$default3));
                    getAxisLeft().setAxisMinimum((float) (dDivD$default - dDivD$default3));
                } else {
                    getAxisLeft().resetAxisMaximum();
                    getAxisLeft().resetAxisMinimum();
                }
            } else if (C33129mqd.valueOf(java.lang.Double.valueOf(dDivD$default2), C33129mqd.EZpvd(java.lang.Double.valueOf(1.0005d)))) {
                getAxisLeft().setAxisMaximum(entry.getY() * 1.0005f);
                getAxisLeft().setAxisMinimum(entry2.getY() * 0.9995f);
            } else {
                getAxisLeft().resetAxisMaximum();
                getAxisLeft().resetAxisMinimum();
            }
        } else {
            getAxisLeft().resetAxisMaximum();
            getAxisLeft().resetAxisMinimum();
        }
        if (getData() == 0 || ((LineData) getData()).getDataSetCount() <= 0) {
            setData(new LineData(copydefault(list, iTradeRiseGraph$default, 1.8f)));
        } else {
            T dataSetByIndex = ((LineData) getData()).getDataSetByIndex(0);
            Intrinsics.copydefault(dataSetByIndex, "");
            LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
            lineDataSet.setValues(list);
            lineDataSet.setColor(iTradeRiseGraph$default);
            ((LineData) getData()).notifyDataChanged();
            notifyDataSetChanged();
        }
        animateX(600);
    }

    public final LineDataSet copydefault(java.util.List<? extends Entry> list, int i, float f) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.disableDashedHighlightLine();
        lineDataSet.setHighlightEnabled(false);
        lineDataSet.setFormSize(0.0f);
        lineDataSet.setColor(i);
        lineDataSet.setLineWidth(f);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setCubicIntensity(1.0f);
        return lineDataSet;
    }
}
