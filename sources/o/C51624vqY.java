package o;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import androidx.camera.video.AudioStats;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.okinc.tradingbot.impl.market_place.home.view.MarketPlaceHomeLineChartMarkerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51624vqY extends LineChart {
    public Activity EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX INFO: renamed from: o.vqY$Activity */
    public static class Activity implements OnChartGestureListener {
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

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51624vqY(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillStartColor(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGestureListener(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineColor(@androidx.annotation.ColorInt int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:32) call: o.vqY.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C51624vqY(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51624vqY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.AuCTelauCTel);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.zuBGHE, C33070mpX.copydefault(C52761wXj.Activity.fbC));
        this.KWHzl = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.AxsJAY, C33070mpX.copydefault(C52761wXj.Activity.DsL));
        this.OLrzqt = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.AwvSrB, C33070mpX.copydefault(C52761wXj.Activity.fbC));
        typedArrayObtainStyledAttributes.recycle();
        setNoDataText("");
    }

    public final java.util.List<ILineDataSet> AEQbTJ(java.util.List<ActionBar> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ActionBar actionBar = (ActionBar) CollectionsKt___CollectionsKt.firstOrNull(list);
        int i = 0;
        boolean zAEQbTJ = actionBar != null ? C33129mqd.AEQbTJ(java.lang.Double.valueOf(actionBar.AEQbTJ()), 0) : true;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ActionBar actionBar2 = (ActionBar) obj;
            boolean zAEQbTJ2 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(actionBar2.AEQbTJ()), 0);
            if (zAEQbTJ != zAEQbTJ2) {
                float f = i2;
                arrayList2.add(new Entry(f, 0.0f));
                arrayList.add(copydefault(arrayList2, list));
                arrayList2 = new java.util.ArrayList();
                arrayList2.add(new Entry(f, 0.0f));
                i2++;
                arrayList2.add(new Entry(i2, (float) actionBar2.AEQbTJ(), actionBar2.copydefault()));
                zAEQbTJ = zAEQbTJ2;
            } else {
                arrayList2.add(new Entry(i2, (float) actionBar2.AEQbTJ(), actionBar2.copydefault()));
            }
            i2++;
            if (i == list.size() - 1) {
                arrayList.add(copydefault(arrayList2, list));
            }
            i++;
        }
        return arrayList;
    }

    public final void KWHzl(@NotNull java.util.List<ActionBar> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LineData lineData = new LineData(AEQbTJ(list));
        lineData.setDrawValues(false);
        setData(lineData);
        setScaleEnabled(false);
        getDescription().setEnabled(false);
        setDrawBorders(false);
        getLegend().setEnabled(false);
        setExtraBottomOffset(10.0f);
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        getXAxis().setDrawGridLines(false);
        getXAxis().setDrawAxisLine(false);
        getXAxis().setEnabled(false);
        getXAxis().setAvoidFirstLastClipping(true);
        getAxisLeft().setSpaceBottom(50.0f);
        getAxisLeft().setSpaceTop(50.0f);
        getAxisLeft().setEnabled(false);
        getAxisRight().setEnabled(false);
        getRenderer().getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        getRenderer().getPaintRender().setStrokeJoin(Paint.Join.ROUND);
        setTouchEnabled(true);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        MarketPlaceHomeLineChartMarkerView marketPlaceHomeLineChartMarkerView = new MarketPlaceHomeLineChartMarkerView(context);
        setMarker(marketPlaceHomeLineChartMarkerView);
        marketPlaceHomeLineChartMarkerView.setChartView(this);
        setOnChartGestureListener(this.EZpvd);
        invalidate();
    }

    public static /* synthetic */ int getThemeColor$default(C51624vqY c51624vqY, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c51624vqY.AEQbTJ(z, f);
    }

    public final int AEQbTJ(boolean z, float f) {
        return C33512mxp.AEQbTJ.AEQbTJ(this.OLrzqt, f);
    }

    public final int[] OLrzqt(boolean z) {
        return new int[]{AEQbTJ(z, 0.25f), AEQbTJ(z, 0.1f), AEQbTJ(z, 0.05f), AEQbTJ(z, 5.0E-4f), AEQbTJ(z, 2.0E-4f), AEQbTJ(z, 0.0f)};
    }

    public final int[] EZpvd(boolean z) {
        return new int[]{AEQbTJ(z, 0.25f), AEQbTJ(z, 0.2f), AEQbTJ(z, 0.15f), AEQbTJ(z, 5.0E-4f), AEQbTJ(z, 2.0E-4f), AEQbTJ(z, 0.0f)};
    }

    public final int[] KWHzl(boolean z) {
        return new int[]{AEQbTJ(z, 0.25f), AEQbTJ(z, 0.01f), AEQbTJ(z, 0.002f), AEQbTJ(z, 0.001f), AEQbTJ(z, 0.0f)};
    }

    public final int[] AEQbTJ(boolean z) {
        return new int[]{AEQbTJ(z, 0.25f), AEQbTJ(z, 0.2f), AEQbTJ(z, 0.15f), AEQbTJ(z, 5.0E-4f), AEQbTJ(z, 0.0f)};
    }

    public final int[] copydefault(boolean z) {
        return new int[]{AEQbTJ(z, 0.25f), AEQbTJ(z, 0.01f), AEQbTJ(z, 0.002f), AEQbTJ(z, 0.001f), AEQbTJ(z, 0.0f)};
    }

    /* JADX INFO: renamed from: o.vqY$ActionBar */
    public static final class ActionBar {
        public final double EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, double d, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str = actionBar.OLrzqt;
            }
            return actionBar.copydefault(d, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(double d, java.lang.String str) {
            return new ActionBar(d, str);
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
            return java.lang.Double.compare(this.EZpvd, actionBar.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Double.hashCode(this.EZpvd);
            java.lang.String str = this.OLrzqt;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LineChartData(pointData=" + this.EZpvd + ", otherData=" + this.OLrzqt + ")";
        }

        public ActionBar(double d, java.lang.String str) {
            this.EZpvd = d;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 double)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(double, java.lang.String):void (m)] (LINE:335) call: o.vqY.ActionBar.<init>(double, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(double d, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, (i & 2) != 0 ? null : str);
        }
    }

    public final LineDataSet copydefault(java.util.List<? extends Entry> list, java.util.List<ActionBar> list2) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C33129mqd.AhwBna(java.lang.Float.valueOf(((Entry) next).getY()), 0)) {
                break;
            }
        }
        Entry entry = (Entry) next;
        boolean zAEQbTJ = entry != null ? C33129mqd.AEQbTJ(java.lang.Float.valueOf(entry.getY()), 0) : true;
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setColor(this.copydefault);
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(AEQbTJ(list2, zAEQbTJ));
        lineDataSet.setDrawCircles(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.enableDashedHighlightLine(C33518mxv.EZpvd(getContext(), 4.0f), C33518mxv.EZpvd(getContext(), 1.0f), 0.0f);
        lineDataSet.setHighlightLineWidth(C33518mxv.EZpvd(getContext(), 0.5f));
        lineDataSet.setHighLightColor(this.KWHzl);
        setHighlightPerTapEnabled(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        return lineDataSet;
    }

    public final android.graphics.drawable.Drawable AEQbTJ(java.util.List<ActionBar> list, boolean z) {
        GradientDrawable.Orientation orientation;
        double dAEQbTJ = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dAEQbTJ2 = 0.0d;
        for (ActionBar actionBar : list) {
            if (!C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(actionBar.AEQbTJ()), (java.lang.Object) 0)) {
                if (C33129mqd.gEmmrt(java.lang.Double.valueOf(actionBar.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ2)) || C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(dAEQbTJ2), (java.lang.Object) 0)) {
                    dAEQbTJ2 = actionBar.AEQbTJ();
                }
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(actionBar.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ)) || C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(dAEQbTJ2), (java.lang.Object) 0)) {
                    dAEQbTJ = actionBar.AEQbTJ();
                }
            }
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(dAEQbTJ)))), java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(java.lang.Double.valueOf(dAEQbTJ2)))), null, null, null, 14, null);
        if (C33129mqd.copydefault((java.lang.Object) strDivS$default, (java.lang.Object) 3)) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.gt(3)" + strDivS$default);
            if (z) {
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, EZpvd(z));
            }
            return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, KWHzl(z));
        }
        if (C33129mqd.copydefault((java.lang.Object) strDivS$default, (java.lang.Object) 2) && C33129mqd.gEmmrt(strDivS$default, 3)) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.gte(2) && ratio.lte(3)" + strDivS$default);
            if (z) {
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, AEQbTJ(z));
            }
            return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, copydefault(z));
        }
        if (C33129mqd.gEmmrt(strDivS$default, 2) && C33129mqd.copydefault(strDivS$default, java.lang.Double.valueOf(0.5d))) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.lt(2)  && ratio.gt(0.5)" + strDivS$default);
            int[] iArrOLrzqt = OLrzqt(z);
            if (z) {
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            } else {
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
            }
            return new GradientDrawable(orientation, iArrOLrzqt);
        }
        if (C33129mqd.copydefault(strDivS$default, java.lang.Double.valueOf(0.33d)) && C33129mqd.gEmmrt(strDivS$default, java.lang.Double.valueOf(0.5d))) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.gte(0.33)  && ratio.lt(0.5)" + strDivS$default);
            if (z) {
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, copydefault(z));
            }
            return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, AEQbTJ(z));
        }
        C43296rmc.AEQbTJ("ratioTest", "ratio.lt(0.33)" + strDivS$default);
        if (z) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, KWHzl(z));
        }
        return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, EZpvd(z));
    }
}
