package o;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51246vjR extends AbstractC59533zio<MpStgyCopyProfitChangeData, C51247vjS> {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.vjR$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vjR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51247vjS onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.dkJJWw, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51247vjS(viewInflate);
    }

    public static /* synthetic */ int onBindViewHolder$getThemeColor$default(C51247vjS c51247vjS, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return AEQbTJ(c51247vjS, z, f);
    }

    public static final int AEQbTJ(C51247vjS c51247vjS, boolean z, float f) {
        if (z) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c51247vjS.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c33512mxp.zLjUOn(context, f);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = c51247vjS.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return c33512mxp2.isConnected(context2, f);
    }

    public static final int[] AEQbTJ(C51247vjS c51247vjS, boolean z) {
        return new int[]{AEQbTJ(c51247vjS, z, 0.25f), AEQbTJ(c51247vjS, z, 0.1f), AEQbTJ(c51247vjS, z, 0.05f), AEQbTJ(c51247vjS, z, 5.0E-4f), AEQbTJ(c51247vjS, z, 2.0E-4f), AEQbTJ(c51247vjS, z, 0.0f)};
    }

    public static final int[] KWHzl(C51247vjS c51247vjS, boolean z) {
        return new int[]{AEQbTJ(c51247vjS, z, 0.25f), AEQbTJ(c51247vjS, z, 0.2f), AEQbTJ(c51247vjS, z, 0.15f), AEQbTJ(c51247vjS, z, 5.0E-4f), AEQbTJ(c51247vjS, z, 2.0E-4f), AEQbTJ(c51247vjS, z, 0.0f)};
    }

    public static final int[] OLrzqt(C51247vjS c51247vjS, boolean z) {
        return new int[]{AEQbTJ(c51247vjS, z, 0.25f), AEQbTJ(c51247vjS, z, 0.01f), AEQbTJ(c51247vjS, z, 0.002f), AEQbTJ(c51247vjS, z, 0.001f), AEQbTJ(c51247vjS, z, 0.0f)};
    }

    public static final int[] EZpvd(C51247vjS c51247vjS, boolean z) {
        return new int[]{AEQbTJ(c51247vjS, z, 0.25f), AEQbTJ(c51247vjS, z, 0.2f), AEQbTJ(c51247vjS, z, 0.15f), AEQbTJ(c51247vjS, z, 5.0E-4f), AEQbTJ(c51247vjS, z, 0.0f)};
    }

    public static final int[] copydefault(C51247vjS c51247vjS, boolean z) {
        return new int[]{AEQbTJ(c51247vjS, z, 0.25f), AEQbTJ(c51247vjS, z, 0.01f), AEQbTJ(c51247vjS, z, 0.002f), AEQbTJ(c51247vjS, z, 0.001f), AEQbTJ(c51247vjS, z, 0.0f)};
    }

    public static final android.graphics.drawable.Drawable copydefault(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, C51247vjS c51247vjS, boolean z) {
        GradientDrawable.Orientation orientation;
        GradientDrawable.Orientation orientation2;
        GradientDrawable.Orientation orientation3 = GradientDrawable.Orientation.TOP_BOTTOM;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<StrategyProfitResponse> profitList = mpStgyCopyProfitChangeData.getProfitList();
        Intrinsics.copydefault(profitList);
        java.util.Iterator<T> it = profitList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(C33129mqd.djBIcL(((StrategyProfitResponse) it.next()).getPnlRatio())));
        }
        java.lang.Float f = (java.lang.Float) Collections.min(arrayList);
        java.lang.Float f2 = (java.lang.Float) Collections.max(arrayList);
        if (C33129mqd.copydefault((java.lang.Object) f, (java.lang.Object) 0) || C33129mqd.valueOf(f2, 0)) {
            int[] iArrAEQbTJ = AEQbTJ(c51247vjS, z);
            if (z) {
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            } else {
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
            }
            return new GradientDrawable(orientation, iArrAEQbTJ);
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(f2))), java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(f))), null, null, null, 14, null);
        if (C33129mqd.copydefault((java.lang.Object) strDivS$default, (java.lang.Object) 3)) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.gt(3)" + strDivS$default);
            if (z) {
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, KWHzl(c51247vjS, z));
            }
            return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, OLrzqt(c51247vjS, z));
        }
        if (C33129mqd.copydefault((java.lang.Object) strDivS$default, (java.lang.Object) 2) && C33129mqd.gEmmrt(strDivS$default, 3)) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.gte(2) && ratio.lte(3)" + strDivS$default);
            if (z) {
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, EZpvd(c51247vjS, z));
            }
            return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, copydefault(c51247vjS, z));
        }
        if (C33129mqd.gEmmrt(strDivS$default, 2) && C33129mqd.copydefault(strDivS$default, java.lang.Double.valueOf(0.5d))) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.lt(2)  && ratio.gt(0.5)" + strDivS$default);
            int[] iArrAEQbTJ2 = AEQbTJ(c51247vjS, z);
            if (z) {
                orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
            } else {
                orientation2 = GradientDrawable.Orientation.BOTTOM_TOP;
            }
            return new GradientDrawable(orientation2, iArrAEQbTJ2);
        }
        if (C33129mqd.copydefault(strDivS$default, java.lang.Double.valueOf(0.33d)) && C33129mqd.gEmmrt(strDivS$default, java.lang.Double.valueOf(0.5d))) {
            C43296rmc.AEQbTJ("ratioTest", "ratio.gte(0.33)  && ratio.lt(0.5)" + strDivS$default);
            if (z) {
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, copydefault(c51247vjS, z));
            }
            return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, EZpvd(c51247vjS, z));
        }
        C43296rmc.AEQbTJ("ratioTest", "ratio.lt(0.33)" + strDivS$default);
        if (z) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, OLrzqt(c51247vjS, z));
        }
        return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, KWHzl(c51247vjS, z));
    }

    public static final LineDataSet OLrzqt(C51247vjS c51247vjS, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.util.List<? extends Entry> list) {
        boolean zCopydefault;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zCopydefault = true;
                break;
            }
            Entry entry = list.get(i);
            if (entry.getData() != null) {
                zCopydefault = C33129mqd.copydefault((java.lang.Object) java.lang.Float.valueOf(entry.getY()), (java.lang.Object) 0);
                break;
            }
            i++;
        }
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setColor(onBindViewHolder$getThemeColor$default(c51247vjS, zCopydefault, 0.0f, 4, null));
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(copydefault(mpStgyCopyProfitChangeData, c51247vjS, zCopydefault));
        lineDataSet.setDrawCircles(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.enableDashedHighlightLine(C33518mxv.EZpvd(c51247vjS.AEQbTJ().getContext(), 5.0f), C33518mxv.EZpvd(c51247vjS.AEQbTJ().getContext(), 2.0f), 0.0f);
        lineDataSet.setHighlightLineWidth(C33518mxv.EZpvd(c51247vjS.AEQbTJ().getContext(), 0.2f));
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawCircles(false);
        return lineDataSet;
    }

    public static final java.util.List<ILineDataSet> EZpvd(C51247vjS c51247vjS, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.util.List<? extends Entry> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Entry entry = (Entry) obj;
            arrayList2.add(entry);
            if (entry.getData() == null) {
                arrayList.add(OLrzqt(c51247vjS, mpStgyCopyProfitChangeData, arrayList2));
                arrayList2 = new java.util.ArrayList();
                arrayList2.add(entry);
            }
            if (i == list.size() - 1) {
                arrayList.add(OLrzqt(c51247vjS, mpStgyCopyProfitChangeData, arrayList2));
            }
            i++;
        }
        return arrayList;
    }

    public static final void EZpvd(C51247vjS c51247vjS, java.util.List<StrategyProfitResponse> list) {
        c51247vjS.AEQbTJ().getXAxis().setValueFormatter(new ActionBar(list));
    }

    /* JADX INFO: renamed from: o.vjR$ActionBar */
    public static final class ActionBar extends ValueFormatter {
        public final /* synthetic */ java.util.List<StrategyProfitResponse> AEQbTJ;

        public ActionBar(java.util.List<StrategyProfitResponse> list) {
            this.AEQbTJ = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            if (i < 0 || i >= this.AEQbTJ.size()) {
                return "";
            }
            StrategyProfitResponse strategyProfitResponse = this.AEQbTJ.get(i);
            java.lang.String timeUnit = strategyProfitResponse.getTimeUnit();
            if (Intrinsics.EZpvd((java.lang.Object) timeUnit, (java.lang.Object) "")) {
                return "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) timeUnit, (java.lang.Object) "hour")) {
                return pTA.format$default(new Date(C33129mqd.valueOf(strategyProfitResponse.getCTime())), OKDateEnum.NONE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            }
            return pTA.formatDate$default(new Date(C33129mqd.valueOf(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    public static final java.util.List<StrategyProfitResponse> AEQbTJ(C51247vjS c51247vjS, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.util.List<StrategyProfitResponse> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) obj;
            boolean zEZpvd = Intrinsics.EZpvd(objAuCTelauCTel, strategyProfitResponse);
            boolean z = (C33129mqd.AEQbTJ(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(strategyProfitResponse.getPnlRatio())), 0) && C33129mqd.AEQbTJ(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(((StrategyProfitResponse) objAuCTelauCTel).getPnlRatio())), 0)) || (C33129mqd.gEmmrt(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(((StrategyProfitResponse) objAuCTelauCTel).getPnlRatio())), 0) && C33129mqd.gEmmrt(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(strategyProfitResponse.getPnlRatio())), 0));
            if (!zEZpvd && !z) {
                arrayList2.add(new Entry(i3, 0.0f));
                arrayList.add(new StrategyProfitResponse((java.lang.String) null, (java.lang.String) null, strategyProfitResponse.getCTime(), (java.lang.String) null, (java.lang.String) null, strategyProfitResponse.getTimeUnit(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 987, (DefaultConstructorMarker) null));
                i3++;
            }
            arrayList.add(strategyProfitResponse);
            arrayList2.add(new Entry(i3, (float) C33129mqd.AEQbTJ(strategyProfitResponse.getPnlRatio()), strategyProfitResponse));
            i3++;
            i2++;
            objAuCTelauCTel = strategyProfitResponse;
        }
        C51347vlM c51347vlMAEQbTJ = c51247vjS.AEQbTJ();
        android.content.Context context = c51347vlMAEQbTJ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C51346vlL c51346vlL = new C51346vlL(context);
        c51346vlL.setChartView(c51347vlMAEQbTJ);
        c51347vlMAEQbTJ.setMarker(c51346vlL);
        c51347vlMAEQbTJ.getAxisLeft().setValueFormatter(new Application());
        LineData lineData = new LineData(EZpvd(c51247vjS, mpStgyCopyProfitChangeData, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2)));
        lineData.setDrawValues(false);
        c51347vlMAEQbTJ.setData(lineData);
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()), (java.lang.Object) 0)) {
            c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(0.0f);
        }
        if (C33129mqd.valueOf(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMaximum()), 0)) {
            c51347vlMAEQbTJ.getAxisLeft().setAxisMaximum(0.0f);
        }
        if (C33129mqd.gEmmrt(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()), 0) && C33129mqd.AEQbTJ(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMaximum()), 0)) {
            double dDivD$default = C33129mqd.divD$default(java.lang.Double.valueOf(C33129mqd.subD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMaximum), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()), null, null, null, 14, null)), 4, null, null, null, 14, null);
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Float.valueOf(java.lang.Math.abs(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum())));
            int i4 = 0;
            for (java.lang.Object obj2 : yDY.copydefault(bigDecimalEZpvd, C33129mqd.EZpvd(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMinimum), java.lang.Double.valueOf(dDivD$default), null, null, null, 14, null)))), C33129mqd.EZpvd(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMinimum), java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), 2, null, null, null, 14, null)), null, null, null, 14, null)))), C33129mqd.EZpvd(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMinimum), java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), 3, null, null, null, 14, null)), null, null, null, 14, null)))), C33129mqd.EZpvd(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.addD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMinimum), java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default), 4, null, null, null, 14, null)), null, null, null, 14, null)))))) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                BigDecimal bigDecimal = (BigDecimal) obj2;
                if (C33129mqd.gEmmrt(bigDecimal, bigDecimalEZpvd)) {
                    i = i4;
                    bigDecimalEZpvd = bigDecimal;
                }
                i4++;
            }
            double dAddD$default = 1.5d;
            if (i == 0 || i == 1) {
                double dDivD$default2 = C33129mqd.divD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMaximum), -3, null, null, null, 14, null);
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDivD$default2), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()))) {
                    while (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default2), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null)), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()))) {
                        dAddD$default = C33129mqd.addD$default(java.lang.Double.valueOf(dAddD$default), java.lang.Double.valueOf(0.2d), null, null, null, 14, null);
                    }
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default2), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null))));
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMaximum(C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMaximum()), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null))));
                } else {
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(C33129mqd.djBIcL(java.lang.Double.valueOf(dDivD$default2)));
                }
            } else if (i == 2) {
                double dDivD$default3 = C33129mqd.divD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMaximum), -1, null, null, null, 14, null);
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDivD$default3), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()))) {
                    while (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default3), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null)), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()))) {
                        dAddD$default = C33129mqd.addD$default(java.lang.Double.valueOf(dAddD$default), java.lang.Double.valueOf(0.2d), null, null, null, 14, null);
                    }
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dDivD$default3), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null))));
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMaximum(C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMaximum()), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null))));
                } else {
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(C33129mqd.djBIcL(java.lang.Double.valueOf(dDivD$default3)));
                }
            } else if (i == 3 || i == 4) {
                double dMulD$default = C33129mqd.mulD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().mAxisMaximum), -3, null, null, null, 14, null);
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dMulD$default), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()))) {
                    while (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dMulD$default), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null)), java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMinimum()))) {
                        dAddD$default = C33129mqd.addD$default(java.lang.Double.valueOf(dAddD$default), java.lang.Double.valueOf(0.2d), null, null, null, 14, null);
                    }
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(dMulD$default), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null))));
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMaximum(C33129mqd.djBIcL(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Float.valueOf(c51347vlMAEQbTJ.getAxisLeft().getAxisMaximum()), java.lang.Double.valueOf(dAddD$default), null, null, null, 14, null))));
                } else {
                    c51347vlMAEQbTJ.getAxisLeft().setAxisMinimum(C33129mqd.djBIcL(java.lang.Double.valueOf(dMulD$default)));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.vjR$Application */
    public static final class Application extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return pTB.formatPercent$default(xMR.copydefault.OLrzqt((java.lang.Object) java.lang.String.valueOf(f)), 2, 0, RoundingMode.DOWN, null, 8, null);
        }
    }

    public static final void KWHzl(C51247vjS c51247vjS) {
        C51347vlM c51347vlMAEQbTJ = c51247vjS.AEQbTJ();
        c51347vlMAEQbTJ.getLegend().setEnabled(false);
        c51347vlMAEQbTJ.setScaleEnabled(false);
        c51347vlMAEQbTJ.getDescription().setEnabled(false);
        c51347vlMAEQbTJ.setTouchEnabled(true);
        c51347vlMAEQbTJ.setDragEnabled(true);
        c51347vlMAEQbTJ.setNestedScrollingEnabled(false);
        c51347vlMAEQbTJ.animateXY(300, 300);
        c51347vlMAEQbTJ.setHighlightPerDragEnabled(true);
        c51347vlMAEQbTJ.setMinOffset(0.0f);
        c51347vlMAEQbTJ.setExtraTopOffset(30.0f);
        c51347vlMAEQbTJ.setExtraRightOffset(16.0f);
        c51247vjS.AEQbTJ().setNoDataText(C33070mpX.AYXKKw(C55688xof.Application.hErYDe));
        c51247vjS.AEQbTJ().setNoDataTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
    }

    public static final void EZpvd(C51247vjS c51247vjS) {
        C51347vlM c51347vlMAEQbTJ = c51247vjS.AEQbTJ();
        c51347vlMAEQbTJ.getRenderer().getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        c51347vlMAEQbTJ.getRenderer().getPaintRender().setStrokeJoin(Paint.Join.ROUND);
    }

    public static final void copydefault(C51247vjS c51247vjS) {
        C51347vlM c51347vlMAEQbTJ = c51247vjS.AEQbTJ();
        c51347vlMAEQbTJ.getAxisRight().setEnabled(false);
        YAxis axisLeft = c51347vlMAEQbTJ.getAxisLeft();
        axisLeft.setGranularity(1.0f);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(true);
        axisLeft.setLabelCount(5, true);
        axisLeft.setTextColor(ContextCompat.getColor(c51347vlMAEQbTJ.getContext(), C52761wXj.Activity.DeEinT));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setXOffset(12.0f);
        axisLeft.setGridColor(ContextCompat.getColor(c51347vlMAEQbTJ.getContext(), C52761wXj.Activity.fZc));
        axisLeft.setZeroLineColor(C33070mpX.copydefault(C52761wXj.Activity.fZc));
    }

    public static final void OLrzqt(C51247vjS c51247vjS) {
        C51347vlM c51347vlMAEQbTJ = c51247vjS.AEQbTJ();
        XAxis xAxis = c51347vlMAEQbTJ.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setTextColor(ContextCompat.getColor(c51347vlMAEQbTJ.getContext(), C52761wXj.Activity.DeEinT));
        xAxis.setTextSize(10.0f);
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setYOffset(8.0f);
        c51347vlMAEQbTJ.setExtraBottomOffset(10.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(5, true);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51247vjS c51247vjS, @NotNull MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData) {
        Intrinsics.checkNotNullParameter(c51247vjS, "");
        Intrinsics.checkNotNullParameter(mpStgyCopyProfitChangeData, "");
        KWHzl(c51247vjS);
        EZpvd(c51247vjS);
        OLrzqt(c51247vjS);
        copydefault(c51247vjS);
        java.util.List<StrategyProfitResponse> profitList = mpStgyCopyProfitChangeData.getProfitList();
        boolean zValueOf = C33129mqd.valueOf(profitList != null ? java.lang.Integer.valueOf(profitList.size()) : null, 0);
        c51247vjS.OLrzqt().setVisibility(zValueOf ? 0 : 8);
        c51247vjS.AEQbTJ().setVisibility(zValueOf ^ true ? 0 : 8);
        c51247vjS.EZpvd().setText(mpStgyCopyProfitChangeData.getPnlRatio().getFirst());
        c51247vjS.EZpvd().setTextColor(mpStgyCopyProfitChangeData.getPnlRatio().getSecond().intValue());
        c51247vjS.KWHzl().setText(mpStgyCopyProfitChangeData.getMaxDrawdown());
        if (zValueOf) {
            return;
        }
        java.util.List<StrategyProfitResponse> profitList2 = mpStgyCopyProfitChangeData.getProfitList();
        Intrinsics.copydefault(profitList2);
        EZpvd(c51247vjS, AEQbTJ(c51247vjS, mpStgyCopyProfitChangeData, profitList2));
    }
}
