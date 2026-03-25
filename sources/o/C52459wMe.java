package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.InstrumentPercentBean;
import com.okinc.unify_trade.bot.data.SingleCoinAllocationData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52459wMe extends android.widget.LinearLayout implements InterfaceC48035uCo {
    public final C43316rmw AEQbTJ;
    public final java.util.ArrayList<SingleCoinAllocationData> EZpvd;
    public final wLT KWHzl;
    public final java.util.List<PieEntry> OLrzqt;
    public uXR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52459wMe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52459wMe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SingleCoinAllocationData> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PieEntry> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.wMe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52459wMe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52459wMe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uXR uxrOLrzqt = uXR.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uxrOLrzqt, "");
        this.copydefault = uxrOLrzqt;
        this.KWHzl = new wLT();
        this.AEQbTJ = new C43316rmw();
        setOrientation(1);
        valueOf();
        this.OLrzqt = new java.util.ArrayList();
        this.EZpvd = new java.util.ArrayList<>();
    }

    public final void valueOf() {
        OLrzqt();
        KWHzl();
        AEQbTJ();
    }

    public final void OLrzqt() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.copydefault.OLrzqt.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi24));
    }

    public final void KWHzl() {
        PieChart pieChart = this.copydefault.KWHzl;
        pieChart.getLegend().setEnabled(false);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleRadius(90.0f);
        pieChart.setTransparentCircleRadius(54.0f);
        pieChart.setDrawCenterText(true);
        Description description = new Description();
        description.setText("");
        pieChart.setDescription(description);
        pieChart.setDrawEntryLabels(false);
        pieChart.setHoleColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
        pieChart.setMinOffset(0.0f);
        pieChart.setRotationEnabled(false);
        setPieCenterText(C33070mpX.AYXKKw(C55688xof.Application.fARcdN), this.KWHzl.EZpvd("1"));
        this.copydefault.KWHzl.setOnChartValueSelectedListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.wMe$TaskDescription */
    public static final class TaskDescription implements OnChartValueSelectedListener {
        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            SingleCoinAllocationData singleCoinAllocationData = C52459wMe.this.EZpvd().get(CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends Entry>) ((java.util.List<? extends java.lang.Object>) C52459wMe.this.copydefault()), entry));
            Intrinsics.checkNotNullExpressionValue(singleCoinAllocationData, "");
            SingleCoinAllocationData singleCoinAllocationData2 = singleCoinAllocationData;
            C52459wMe c52459wMe = C52459wMe.this;
            java.lang.String ccyName = singleCoinAllocationData2.getCcyName();
            if (ccyName == null) {
                ccyName = "";
            }
            java.lang.String ccyRatio = singleCoinAllocationData2.getCcyRatio();
            c52459wMe.setPieCenterText(ccyName, ccyRatio != null ? ccyRatio : "");
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            C52459wMe.this.setPieCenterText(C33070mpX.AYXKKw(C55688xof.Application.fARcdN), C52459wMe.this.KWHzl.EZpvd("1"));
        }
    }

    public final void setPieCenterText(java.lang.String str, java.lang.String str2) {
        this.copydefault.KWHzl.setCenterText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str + "\n" + str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.wMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52459wMe.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.wMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52459wMe.OLrzqt((java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.wMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52459wMe.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.wMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52459wMe.AEQbTJ((java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.wMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52459wMe.valueOf((java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit EZpvd(C52459wMe c52459wMe, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c52459wMe.getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52459wMe c52459wMe, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c52459wMe.getContext(), C52761wXj.LoaderManager.QCjLjM));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.AbsoluteSizeSpan(C55298xhM.dp2px$default(22.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        this.AEQbTJ.register(SingleCoinAllocationData.class, new C52476wMv());
        RecyclerView recyclerView = this.copydefault.AEQbTJ;
        recyclerView.setAdapter(this.AEQbTJ);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(8.0f, null, 1, null), 0));
    }

    @Override // o.InterfaceC48035uCo
    public void setData(BannerOrderDetails bannerOrderDetails) {
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.Object) ((bannerOrderDetails == null || (instrumentPercent = bannerOrderDetails.getInstrumentPercent()) == null) ? null : java.lang.Integer.valueOf(instrumentPercent.size())), (java.lang.Object) 0);
        KWHzl(zOLrzqt);
        if (zOLrzqt) {
            return;
        }
        wLT wlt = this.KWHzl;
        if (bannerOrderDetails == null) {
            bannerOrderDetails = new BannerOrderDetails(null, null, null, null, null, 31, null);
        }
        wlt.AEQbTJ(bannerOrderDetails);
        gEmmrt();
        djBIcL();
    }

    public final void KWHzl(boolean z) {
        C55258xgZ c55258xgZ = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(z ? 0 : 8);
        android.widget.LinearLayout linearLayout = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ^ true ? 0 : 8);
    }

    public final void gEmmrt() {
        this.OLrzqt.clear();
        this.OLrzqt.addAll(this.KWHzl.EZpvd());
        PieDataSet pieDataSet = new PieDataSet(this.OLrzqt, "");
        pieDataSet.setColors(this.KWHzl.OLrzqt());
        pieDataSet.setSliceSpace(1.0f);
        pieDataSet.setSelectionShift(4.0f);
        pieDataSet.setDrawValues(false);
        this.copydefault.KWHzl.setData(new PieData(pieDataSet));
        this.copydefault.KWHzl.notifyDataSetChanged();
        this.copydefault.KWHzl.invalidate();
    }

    public final void djBIcL() {
        this.EZpvd.clear();
        this.EZpvd.addAll(this.KWHzl.AEQbTJ());
        C33064mpR.OLrzqt(this.AEQbTJ, (java.util.List<? extends java.lang.Object>) this.KWHzl.copydefault());
    }
}
