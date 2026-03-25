package o;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.ProfitMarginPerCcyVo;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48267uLd {
    public static final C48267uLd KWHzl = new C48267uLd();

    private C48267uLd() {
    }

    public static /* synthetic */ void initializeChart$default(C48267uLd c48267uLd, C51348vlN c51348vlN, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        c48267uLd.KWHzl(c51348vlN, i);
    }

    public final void KWHzl(@NotNull C51348vlN c51348vlN, int i) {
        Intrinsics.checkNotNullParameter(c51348vlN, "");
        c51348vlN.getLegend().setEnabled(false);
        c51348vlN.setScaleEnabled(false);
        c51348vlN.getDescription().setEnabled(false);
        c51348vlN.setTouchEnabled(true);
        c51348vlN.setDragEnabled(true);
        c51348vlN.setNestedScrollingEnabled(false);
        c51348vlN.setHighlightPerDragEnabled(true);
        c51348vlN.setMinOffset(0.0f);
        c51348vlN.setExtraTopOffset(30.0f);
        c51348vlN.setExtraRightOffset(0.0f);
        c51348vlN.setHighlightPerTapEnabled(true);
        c51348vlN.setNoDataText(C33070mpX.AYXKKw(C55688xof.Application.hErYDe));
        c51348vlN.setNoDataTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        c51348vlN.getRenderer().getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        c51348vlN.getRenderer().getPaintRender().setStrokeJoin(Paint.Join.ROUND);
        c51348vlN.getAxisRight().setEnabled(false);
        c51348vlN.getAxisLeft().setEnabled(true);
        YAxis axisLeft = c51348vlN.getAxisLeft();
        axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
        axisLeft.setGranularity(1.0f);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setLabelCount(i, true);
        axisLeft.setTextColor(ContextCompat.getColor(c51348vlN.getContext(), C52761wXj.Activity.QwvEab));
        axisLeft.setTextSize(10.0f);
        C55051xce c55051xce = C55051xce.OLrzqt;
        axisLeft.setTypeface(c55051xce.valueOf());
        axisLeft.setXOffset(4.0f);
        axisLeft.setDrawZeroLine(true);
        axisLeft.setZeroLineWidth(0.5f);
        axisLeft.setGridColor(ContextCompat.getColor(c51348vlN.getContext(), C52761wXj.Activity.fZc));
        XAxis xAxis = c51348vlN.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setTextColor(ContextCompat.getColor(c51348vlN.getContext(), C52761wXj.Activity.QwvEab));
        xAxis.setTextSize(10.0f);
        xAxis.setTypeface(c55051xce.valueOf());
        xAxis.setYOffset(8.0f);
        c51348vlN.setExtraBottomOffset(10.0f);
        c51348vlN.setExtraRightOffset(3.0f);
        c51348vlN.setExtraLeftOffset(3.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(5, true);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
        xAxis.setAvoidFirstLastClipping(true);
        KWHzl.KWHzl(c51348vlN);
        c51348vlN.setOnChartValueSelectedListener(new Application(c51348vlN));
        c51348vlN.setOnChartGestureListener(new Activity(c51348vlN));
    }

    /* JADX INFO: renamed from: o.uLd$Application */
    public static final class Application implements OnChartValueSelectedListener {
        public final /* synthetic */ C51348vlN KWHzl;

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public Application(C51348vlN c51348vlN) {
            this.KWHzl = c51348vlN;
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            wPO.m8782vibrategIAlus$default(wPO.EZpvd, this.KWHzl, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.uLd$Activity */
    public static final class Activity implements OnChartGestureListener {
        public final /* synthetic */ C51348vlN EZpvd;

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
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

        public Activity(C51348vlN c51348vlN) {
            this.EZpvd = c51348vlN;
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            android.view.ViewParent parent = this.EZpvd.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
            wPO.m8782vibrategIAlus$default(wPO.EZpvd, this.EZpvd, 0L, 2, null);
            android.view.ViewParent parent = this.EZpvd.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public static /* synthetic */ void updateChartData$default(C48267uLd c48267uLd, C51348vlN c51348vlN, java.util.List list, C48264uLa c48264uLa, C52580wQr c52580wQr, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c48267uLd.EZpvd(c51348vlN, list, c48264uLa, c52580wQr, z);
    }

    public final void EZpvd(@NotNull C51348vlN c51348vlN, @NotNull java.util.List<StrategyProfitResponse> list, @NotNull C48264uLa c48264uLa, C52580wQr c52580wQr, boolean z) {
        Intrinsics.checkNotNullParameter(c51348vlN, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c48264uLa, "");
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(list.size()), 0)) {
            c51348vlN.clear();
            return;
        }
        java.util.List<StrategyProfitResponse> listHDKMBd = C56405yEd.hDKMBd(list);
        java.lang.String strCopydefault = c48264uLa.copydefault();
        StateListAnimator stateListAnimatorKWHzl = KWHzl(listHDKMBd, c48264uLa.AYXKKw());
        AEQbTJ(c51348vlN);
        if (z) {
            EZpvd(c51348vlN, stateListAnimatorKWHzl);
        }
        OLrzqt(c51348vlN, strCopydefault);
        KWHzl(c51348vlN, c52580wQr, c48264uLa);
        c51348vlN.setData(EZpvd(c51348vlN, stateListAnimatorKWHzl, strCopydefault));
        KWHzl(c51348vlN, listHDKMBd);
        c51348vlN.notifyDataSetChanged();
    }

    public final void OLrzqt(C51348vlN c51348vlN, java.lang.String str) {
        c51348vlN.getAxisLeft().setZeroLineColor(getThemeColor$default(this, c51348vlN, str, 0.0f, 4, null));
    }

    public final void KWHzl(C51348vlN c51348vlN, C52580wQr c52580wQr, C48264uLa c48264uLa) {
        if (c52580wQr == null) {
            return;
        }
        java.lang.String strKWHzl = c48264uLa.KWHzl();
        java.lang.String strEZpvd = c48264uLa.EZpvd();
        java.lang.String strDjBIcL = c48264uLa.djBIcL();
        C55887xsS c55887xsS = new C55887xsS(strEZpvd, strKWHzl);
        c55887xsS.gEmmrt(strDjBIcL);
        c52580wQr.copydefault(c48264uLa.KWHzl(), c48264uLa.EZpvd(), c55887xsS.AEQbTJ(c48264uLa.OLrzqt()), c48264uLa.OLrzqt(), C33129mqd.AEQbTJ(c48264uLa.copydefault()), c48264uLa.AYXKKw());
        c52580wQr.setChartView(c51348vlN);
        c51348vlN.setMarker(c52580wQr);
    }

    /* JADX INFO: renamed from: o.uLd$StateListAnimator */
    public static final class StateListAnimator {
        public final java.util.List<Entry> AEQbTJ;
        public final float OLrzqt;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uLd$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                f = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                f2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(list, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Entry> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.util.List<? extends Entry> list, float f, float f2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && java.lang.Float.compare(this.copydefault, stateListAnimator.copydefault) == 0 && java.lang.Float.compare(this.OLrzqt, stateListAnimator.OLrzqt) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + java.lang.Float.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChartComputedData(entries=" + this.AEQbTJ + ", min=" + this.copydefault + ", max=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.Entry> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull java.util.List<? extends Entry> list, float f, float f2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
            this.copydefault = f;
            this.OLrzqt = f2;
        }
    }

    public final LineData EZpvd(C51348vlN c51348vlN, StateListAnimator stateListAnimator, java.lang.String str) {
        LineData lineData = new LineData(AEQbTJ(c51348vlN, stateListAnimator, str));
        lineData.setDrawValues(false);
        return lineData;
    }

    public final java.util.List<ILineDataSet> AEQbTJ(C51348vlN c51348vlN, StateListAnimator stateListAnimator, java.lang.String str) {
        java.util.List<Entry> listAEQbTJ = stateListAnimator.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : listAEQbTJ) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Entry entry = (Entry) obj;
            arrayList2.add(entry);
            if (entry.getData() == null) {
                arrayList.add(KWHzl.EZpvd(c51348vlN, arrayList2, stateListAnimator, str));
                arrayList2 = new java.util.ArrayList();
                arrayList2.add(entry);
            }
            if (i == listAEQbTJ.size() - 1) {
                arrayList.add(KWHzl.EZpvd(c51348vlN, arrayList2, stateListAnimator, str));
            }
            i++;
        }
        return arrayList;
    }

    public final LineDataSet EZpvd(C51348vlN c51348vlN, java.util.List<? extends Entry> list, StateListAnimator stateListAnimator, java.lang.String str) {
        LineDataSet.Mode mode;
        int themeColor$default = getThemeColor$default(this, c51348vlN, str, 0.0f, 4, null);
        android.graphics.drawable.Drawable drawableCreateFillDrawable$default = createFillDrawable$default(this, c51348vlN, stateListAnimator, str, 0.0f, 8, null);
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setColor(themeColor$default);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(drawableCreateFillDrawable$default);
        lineDataSet.setDrawCircles(false);
        if (list.size() <= 18) {
            mode = LineDataSet.Mode.HORIZONTAL_BEZIER;
        } else {
            mode = LineDataSet.Mode.CUBIC_BEZIER;
        }
        lineDataSet.setMode(mode);
        lineDataSet.setCubicIntensity(0.05f);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.enableDashedHighlightLine(C33518mxv.EZpvd(c51348vlN.getContext(), 5.0f), C33518mxv.EZpvd(c51348vlN.getContext(), 2.0f), 0.0f);
        lineDataSet.setHighlightLineWidth(C33518mxv.EZpvd(c51348vlN.getContext(), 1.0E-6f));
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        lineDataSet.setDrawHorizontalHighlightIndicator(true);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        return lineDataSet;
    }

    public static /* synthetic */ android.graphics.drawable.Drawable createFillDrawable$default(C48267uLd c48267uLd, C51348vlN c51348vlN, StateListAnimator stateListAnimator, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f = 0.45f;
        }
        return c48267uLd.OLrzqt(c51348vlN, stateListAnimator, str, f);
    }

    public final android.graphics.drawable.Drawable OLrzqt(C51348vlN c51348vlN, StateListAnimator stateListAnimator, java.lang.String str, float f) {
        float fKWHzl = stateListAnimator.KWHzl();
        float fOLrzqt = stateListAnimator.OLrzqt();
        int iKWHzl = KWHzl(c51348vlN, str, 0.0f);
        int iKWHzl2 = KWHzl(c51348vlN, str, f);
        float f2 = fOLrzqt - fKWHzl;
        if (java.lang.Math.abs(f2) < 1.0E-7f) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iKWHzl2, iKWHzl});
        }
        if (fKWHzl > 0.0f) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iKWHzl2, iKWHzl});
        }
        if (fOLrzqt < 0.0f) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iKWHzl, iKWHzl2});
        }
        float[] fArr = {0.0f, fOLrzqt == fKWHzl ? 0.5f : fOLrzqt / java.lang.Math.abs(f2), 1.0f};
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(new TaskDescription(new int[]{iKWHzl2, iKWHzl, iKWHzl2}, fArr));
        return paintDrawable;
    }

    /* JADX INFO: renamed from: o.uLd$TaskDescription */
    public static final class TaskDescription extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ float[] AEQbTJ;
        public final /* synthetic */ int[] EZpvd;

        public TaskDescription(int[] iArr, float[] fArr) {
            this.EZpvd = iArr;
            this.AEQbTJ = fArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, i2, this.EZpvd, this.AEQbTJ, Shader.TileMode.REPEAT);
        }
    }

    /* JADX INFO: renamed from: o.uLd$ActionBar */
    public static final class ActionBar extends ValueFormatter {
        public final /* synthetic */ java.util.List<StrategyProfitResponse> OLrzqt;

        public ActionBar(java.util.List<StrategyProfitResponse> list) {
            this.OLrzqt = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            if (i <= 0 || i >= this.OLrzqt.size()) {
                return "";
            }
            StrategyProfitResponse strategyProfitResponse = this.OLrzqt.get(i);
            Date date = new Date(C33129mqd.valueOf(strategyProfitResponse.getCTime()));
            if (Intrinsics.EZpvd((java.lang.Object) strategyProfitResponse.getTimeUnit(), (java.lang.Object) "hour")) {
                return C48267uLd.KWHzl.OLrzqt(pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null)) + pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
            }
            return pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    public final void KWHzl(C51348vlN c51348vlN, java.util.List<StrategyProfitResponse> list) {
        c51348vlN.getXAxis().setValueFormatter(new ActionBar(list));
    }

    public final void KWHzl(C51348vlN c51348vlN) {
        c51348vlN.getAxisLeft().setValueFormatter(new FragmentManager());
    }

    /* JADX INFO: renamed from: o.uLd$FragmentManager */
    public static final class FragmentManager extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Float.valueOf(f)), RoundingMode.CEILING, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(100.0d), null, 20, null);
        }
    }

    public final void AEQbTJ(C51348vlN c51348vlN) {
        c51348vlN.getAxisLeft().resetAxisMinimum();
        c51348vlN.getAxisLeft().resetAxisMaximum();
    }

    public final void EZpvd(C51348vlN c51348vlN, StateListAnimator stateListAnimator) {
        float fKWHzl = stateListAnimator.KWHzl();
        float fOLrzqt = stateListAnimator.OLrzqt();
        if (java.lang.Math.abs(fOLrzqt - fKWHzl) < 1.0E-7f) {
            if (fOLrzqt == 0.0f && fKWHzl == 0.0f) {
                c51348vlN.getAxisLeft().setAxisMinimum(-0.01f);
                c51348vlN.getAxisLeft().setAxisMaximum(0.01f);
                c51348vlN.getAxisLeft().setLabelCount(3, true);
            } else if (fOLrzqt < 0.0f) {
                c51348vlN.getAxisLeft().setAxisMinimum(fKWHzl - (java.lang.Math.abs(fKWHzl) * 0.25f));
                c51348vlN.getAxisLeft().setAxisMaximum(C56548yJl.copydefault(fOLrzqt + (java.lang.Math.abs(fOLrzqt) * 2.5f), 0.0f));
            }
        }
    }

    public static /* synthetic */ int getThemeColor$default(C48267uLd c48267uLd, C51348vlN c51348vlN, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return c48267uLd.KWHzl(c51348vlN, str, f);
    }

    public final int KWHzl(C51348vlN c51348vlN, java.lang.String str, float f) {
        if (C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c51348vlN.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c33512mxp.zLjUOn(context, f);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = c51348vlN.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return c33512mxp2.isConnected(context2, f);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null)) {
            return "";
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(1) + "/");
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "" : objM7377constructorimpl);
    }

    public final StateListAnimator KWHzl(java.util.List<StrategyProfitResponse> list, boolean z) {
        java.lang.String pnlRatio;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        float f = Float.MAX_VALUE;
        float f2 = -3.4028235E38f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) next;
            if (z) {
                ProfitMarginPerCcyVo profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT");
                if (profitMarginPerCcyVo == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                    pnlRatio = strategyProfitResponse.getPnlRatio();
                }
            } else {
                pnlRatio = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy()) ? strategyProfitResponse.getPnlRatio() : strategyProfitResponse.getPnlRatioInSourceCcy();
            }
            java.lang.Float fFIwbmz = C59443zhD.fIwbmz(pnlRatio);
            float fFloatValue = fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f;
            if (fFloatValue < f) {
                f = fFloatValue;
            }
            if (fFloatValue > f2) {
                f2 = fFloatValue;
            }
            arrayList.add(new Entry(i, fFloatValue, strategyProfitResponse));
            i++;
        }
        if (f == Float.MAX_VALUE) {
            f = 0.0f;
        }
        if (f2 == -3.4028235E38f) {
            f2 = 0.0f;
        }
        return new StateListAnimator(arrayList, f, f2);
    }
}
