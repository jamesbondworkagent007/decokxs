package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.IntroductionCoin;
import com.okinc.kline.ui.IntroductionDataFrom;
import com.okinc.kline.ui.IntroductionText;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.InterfaceC43033rhe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38525pbA extends AbstractC32998moE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public java.lang.String AYXKKw;
    public android.content.Context EZpvd;
    public RecyclerView KWHzl;
    public java.lang.String djBIcL;
    public KlineCoinInfo valueOf;
    public C43316rmw gEmmrt = new C43316rmw();
    public java.util.ArrayList<java.lang.Object> AhwBna = new java.util.ArrayList<>();
    public final int AEQbTJ = C55298xhM.dp2px$default(8.0f, null, 1, null);
    public boolean OLrzqt = true;

    /* JADX INFO: renamed from: o.pbA$TaskDescription */
    public static final class TaskDescription extends GridLayoutManager.SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return i == 0 ? 2 : 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.sSMYrx;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.pbA$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pbA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C38525pbA AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull KlineCoinInfo klineCoinInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(klineCoinInfo, "");
            C38525pbA c38525pbA = new C38525pbA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putParcelable(oLT.AEQbTJ(), klineCoinInfo);
            c38525pbA.setArguments(bundle);
            return c38525pbA;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
        android.os.Bundle arguments2 = getArguments();
        this.djBIcL = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
        android.os.Bundle arguments3 = getArguments();
        this.valueOf = arguments3 != null ? (KlineCoinInfo) arguments3.getParcelable(oLT.AEQbTJ()) : null;
        this.KWHzl = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.fdt);
        KWHzl();
        copydefault();
        view.post(new java.lang.Runnable() { // from class: o.pbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38525pbA.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(C38525pbA c38525pbA) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38525pbA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        this.gEmmrt.register(IntroductionCoin.class, new C38570pbt(new Function1() { // from class: o.pbz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38525pbA.EZpvd((java.lang.String) obj);
            }
        }));
        this.gEmmrt.register(IntroductionText.class, new C38528pbD(new Function1() { // from class: o.pbx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38525pbA.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }, new Function2() { // from class: o.pbF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C38525pbA.KWHzl(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }));
        this.gEmmrt.register(IntroductionDataFrom.class, new C38568pbr(new Function0() { // from class: o.pbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38525pbA.EZpvd(this.OLrzqt);
            }
        }));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.EZpvd, 2);
        gridLayoutManager.setSpanSizeLookup(new TaskDescription());
        RecyclerView recyclerView = this.KWHzl;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new StateListAnimator());
        }
        RecyclerView recyclerView2 = this.KWHzl;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView3 = this.KWHzl;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.gEmmrt);
        }
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38525pbA c38525pbA, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = c38525pbA.EZpvd;
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(str);
            java.lang.String string = context.getString(C35964oKf.Fragment.adevsa);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.OLrzqt(string, (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38525pbA c38525pbA, java.lang.String str, java.lang.String str2) {
        android.content.Context context;
        InterfaceC43033rhe interfaceC43033rhe;
        InterfaceC43033rhe interfaceC43033rhe2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) oLT.OLrzqt())) {
            c38525pbA.copydefault("app_k_hotrank_click", str2);
            android.content.Context context2 = c38525pbA.getContext();
            if (context2 != null && (interfaceC43033rhe2 = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) != null) {
                InterfaceC43033rhe.StateListAnimator.gotoRankingActivity$default(interfaceC43033rhe2, context2, 0, null, null, c38525pbA.djBIcL, 12, null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) oLT.AkhnZx()) && (context = c38525pbA.getContext()) != null && (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) != null) {
            InterfaceC43033rhe.StateListAnimator.gotoRankingActivity$default(interfaceC43033rhe, context, 5, null, null, c38525pbA.djBIcL, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C38525pbA c38525pbA) {
        C39369pqx c39369pqxEZpvd = C39369pqx.Companion.EZpvd();
        if (c39369pqxEZpvd != null) {
            c39369pqxEZpvd.show(c38525pbA.getChildFragmentManager(), C39369pqx.class.getSimpleName());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pbA$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ItemDecoration {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.top = C38525pbA.this.AEQbTJ;
            rect.left = C38525pbA.this.AEQbTJ;
            rect.right = C38525pbA.this.AEQbTJ;
            rect.bottom = C38525pbA.this.AEQbTJ;
        }
    }

    private final void copydefault() {
        java.lang.String fullName;
        this.AhwBna.clear();
        KlineCoinInfo klineCoinInfo = this.valueOf;
        if (klineCoinInfo != null && (fullName = klineCoinInfo.getFullName()) != null) {
            java.lang.String str = fullName.length() > 0 ? fullName : null;
            if (str != null) {
                KlineCoinInfo klineCoinInfo2 = this.valueOf;
                java.lang.String icon = klineCoinInfo2 != null ? klineCoinInfo2.getIcon() : null;
                KlineCoinInfo klineCoinInfo3 = this.valueOf;
                this.AhwBna.add(new IntroductionCoin(icon, (java.lang.String) null, str, klineCoinInfo3 != null ? klineCoinInfo3.getProject() : null, 2, (DefaultConstructorMarker) null));
            }
        }
        KlineCoinInfo klineCoinInfo4 = this.valueOf;
        if (klineCoinInfo4 != null) {
            copydefault(klineCoinInfo4);
        }
        this.gEmmrt.setItems((this.AhwBna.size() <= 9 || this.OLrzqt) ? this.AhwBna : new java.util.ArrayList<>(this.AhwBna.subList(0, 9)));
        this.gEmmrt.notifyDataSetChanged();
    }

    public final void copydefault(KlineCoinInfo klineCoinInfo) {
        java.lang.String str;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getHotRank()) && !klineCoinInfo.getHotRank().equals("0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.ODWQjV), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.zlzhuY), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, klineCoinInfo.getHotRank()))), (java.lang.String) null, ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames() ? oLT.OLrzqt() : "", false, 20, (DefaultConstructorMarker) null));
            copydefault("app_k_hotrank_show", klineCoinInfo.getHotRank());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getMarketCapRank()) && !klineCoinInfo.getMarketCapRank().equals("0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.OuxcSI), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.zlzhuY), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, klineCoinInfo.getMarketCapRank()))), (java.lang.String) null, ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames() ? oLT.AkhnZx() : "", false, 20, (DefaultConstructorMarker) null));
            copydefault("app_k_volrank_show", klineCoinInfo.getMarketCapRank());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getMarCap()) && !klineCoinInfo.getMarCap().equals("0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.getPostValueLengthLimit), klineCoinInfo.getMarCap(), C33070mpX.AYXKKw(C35964oKf.Fragment.ODXsMY), (java.lang.String) null, true, 8, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getFlowTotal()) && !klineCoinInfo.getFlowTotal().equals("0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.OqFWZa), pTB.formatLocalized$default(klineCoinInfo.getFlowTotal(), null, 1, null) + " " + klineCoinInfo.getProject(), C33070mpX.AYXKKw(C35964oKf.Fragment.RdAHlO), (java.lang.String) null, true, 8, (DefaultConstructorMarker) null));
        }
        if (!klineCoinInfo.getSelNumPer().equals("0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.DarRvM), pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(C33129mqd.divS$default(klineCoinInfo.getSelNumPer(), 100, null, null, null, 14, null)))), 0, null, 3, null), C33070mpX.AYXKKw(C35964oKf.Fragment.DLWbHP), (java.lang.String) null, true, 8, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getFlowTotal()) && C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getMaxSup()) && !klineCoinInfo.getMaxSup().equals("0") && !klineCoinInfo.getMaxSup().equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
            double dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(klineCoinInfo.getFlowTotal())), klineCoinInfo.getMaxSup(), null, null, null, 14, null)));
            if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.DCJXGO), pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(dAEQbTJ)), 0, RoundingMode.DOWN, 1, null), C33070mpX.AYXKKw(C35964oKf.Fragment.dUDNAs), (java.lang.String) null, true, 8, (DefaultConstructorMarker) null));
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getHisHighPrice()) && !klineCoinInfo.getHisHighPrice().equals("0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.QKudOq), oLF.EZpvd.KWHzl(C33129mqd.formatS$default(klineCoinInfo.getHisHighPrice(), null, null, null, 7, null)) + " (" + pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(klineCoinInfo.getHisHighPriceTs())), null, 1, null) + ")", C33070mpX.AYXKKw(C35964oKf.Fragment.dmfpNf), (java.lang.String) null, false, 8, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getHisLowPrice()) && C33129mqd.AhwBna(klineCoinInfo.getHisLowPrice(), "0")) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.AxsJAYsNCnLh), oLF.EZpvd.KWHzl(C33129mqd.formatS$default(klineCoinInfo.getHisLowPrice(), null, null, null, 7, null)) + " (" + pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(klineCoinInfo.getHisLowPriceTs())), null, 1, null) + ")", C33070mpX.AYXKKw(C35964oKf.Fragment.dmfpNf), (java.lang.String) null, false, 8, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getIssueTime())) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.IKQXqd), klineCoinInfo.getIssueTime(), (java.lang.String) null, (java.lang.String) null, false, 12, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getVolumeMarketCapRatio())) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.iMXFZQ), klineCoinInfo.getVolumeMarketCapRatio(), (java.lang.String) null, (java.lang.String) null, false, 12, (DefaultConstructorMarker) null));
        }
        if (!klineCoinInfo.getMaxSup().equals("0")) {
            java.util.ArrayList<java.lang.Object> arrayList = this.AhwBna;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.zuWLRA);
            if (klineCoinInfo.getMaxSup().equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                str = "∞";
            } else {
                str = pTB.formatLocalized$default(klineCoinInfo.getMaxSup(), null, 1, null) + " " + klineCoinInfo.getProject();
            }
            arrayList.add(new IntroductionText(strAYXKKw, str, C33070mpX.AYXKKw(C35964oKf.Fragment.UlJrfe), (java.lang.String) null, true, 8, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getMaxSupMar()) && !klineCoinInfo.getMaxSup().equals("0") && !klineCoinInfo.getMaxSup().equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.ffGIBT), oLF.EZpvd.KWHzl(new BigDecimal(C33129mqd.formatS$default(klineCoinInfo.getMaxSupMar(), null, null, null, 7, null))), C33070mpX.AYXKKw(C35964oKf.Fragment.QSLkRj), (java.lang.String) null, true, 8, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getIndustry())) {
            this.AhwBna.add(new IntroductionText(C33070mpX.AYXKKw(C35964oKf.Fragment.FF), klineCoinInfo.getIndustry(), (java.lang.String) null, (java.lang.String) null, false, 28, (DefaultConstructorMarker) null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.EZpvd = context;
    }

    private final void copydefault(java.lang.String str, final java.lang.String str2) {
        C32869mli.onNewOKexEventWithParams$default(str, null, new Function1() { // from class: o.pbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38525pbA.KWHzl(this.KWHzl, str2, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C38525pbA c38525pbA, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String project;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", "page_k", false);
        java.lang.String str2 = c38525pbA.djBIcL;
        if (str2 != null) {
            eventParamsList.put("deal_type", str2, false);
        }
        java.lang.String str3 = c38525pbA.AYXKKw;
        if (str3 != null) {
            eventParamsList.put("deal_name", str3, false);
        }
        eventParamsList.put("rank", str, false);
        KlineCoinInfo klineCoinInfo = c38525pbA.valueOf;
        if (klineCoinInfo != null && (project = klineCoinInfo.getProject()) != null) {
            eventParamsList.put("coin_name", project, false);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oLF.EZpvd.AEQbTJ();
    }
}
