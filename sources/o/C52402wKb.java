package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractDcaPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wKb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52402wKb extends AbstractC50583vTu {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;
    public DcaOrderReq KWHzl;

    /* JADX INFO: renamed from: o.wKb$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "GuideContractDcaOrderConfirmDialog";
    }

    public C52402wKb() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotGuideContractDcaPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.guide.dialog.GuideContractDcaOrderConfirmDialog$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.guide.dialog.GuideContractDcaOrderConfirmDialog$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.guide.dialog.GuideContractDcaOrderConfirmDialog$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.vTu.AEQbTJ()V */
    public final BotGuideContractDcaPresenter AEQbTJ() {
        return (BotGuideContractDcaPresenter) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.wKb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wKb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull DcaOrderReq dcaOrderReq, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(dcaOrderReq, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C52402wKb c52402wKb = new C52402wKb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key_order_req", dcaOrderReq);
            c52402wKb.setArguments(bundle);
            c52402wKb.show(fragmentManager, "GuideContractDcaOrderConfirmDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        DcaOrderReq dcaOrderReq;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (dcaOrderReq = (DcaOrderReq) arguments.getParcelable("key_order_req")) == null) {
            dcaOrderReq = new DcaOrderReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -1, 15, (DefaultConstructorMarker) null);
        }
        this.KWHzl = dcaOrderReq;
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        wlaJM();
        zLjUOn();
    }

    private final void zLjUOn() {
        C56111xwe<LossInsuranceDisplayData> c56111xweHDKMBd = AEQbTJ().hDKMBd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweHDKMBd.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.wKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52402wKb.copydefault(this.copydefault, (LossInsuranceDisplayData) obj);
            }
        }));
    }

    public static final Unit copydefault(C52402wKb c52402wKb, LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        C33064mpR.OLrzqt(c52402wKb.values(), (java.util.List<? extends java.lang.Object>) c52402wKb.EZpvd());
        return Unit.INSTANCE;
    }

    private final void wlaJM() {
        wYK wyk = DbNXlk().copydefault;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
        DcaOrderReq dcaOrderReq = this.KWHzl;
        DcaOrderReq dcaOrderReq2 = null;
        if (dcaOrderReq == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq = null;
        }
        java.lang.String instType = dcaOrderReq.getInstType();
        java.lang.String str = instType == null ? "" : instType;
        DcaOrderReq dcaOrderReq3 = this.KWHzl;
        if (dcaOrderReq3 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq3 = null;
        }
        java.lang.String instId = dcaOrderReq3.getInstId();
        djBIcL(C56033xvF.getCoinTitle$default(str, instId == null ? "" : instId, false, null, null, 28, null));
        TacticsType.TaskDescription taskDescription = TacticsType.Companion;
        DcaOrderReq dcaOrderReq4 = this.KWHzl;
        if (dcaOrderReq4 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq4 = null;
        }
        TacticsType tacticsTypeAEQbTJ = taskDescription.AEQbTJ(dcaOrderReq4.getOrdType());
        AhwBna(tacticsTypeAEQbTJ != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()) : null);
        DcaOrderReq dcaOrderReq5 = this.KWHzl;
        if (dcaOrderReq5 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq5 = null;
        }
        java.lang.String direction = dcaOrderReq5.getDirection();
        if (direction == null) {
            direction = "";
        }
        int iValueOf = C56033xvF.valueOf(direction);
        DcaOrderReq dcaOrderReq6 = this.KWHzl;
        if (dcaOrderReq6 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq6 = null;
        }
        java.lang.String direction2 = dcaOrderReq6.getDirection();
        if (direction2 == null) {
            direction2 = "";
        }
        copydefault(C56033xvF.AhwBna(direction2));
        OLrzqt(iValueOf);
        DcaOrderReq dcaOrderReq7 = this.KWHzl;
        if (dcaOrderReq7 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq7 = null;
        }
        java.lang.String lever = dcaOrderReq7.getLever();
        if (lever == null) {
            lever = "";
        }
        gEmmrt(C56033xvF.getBotLever$default(lever, false, 2, null));
        AEQbTJ(iValueOf);
        DcaOrderReq dcaOrderReq8 = this.KWHzl;
        if (dcaOrderReq8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            dcaOrderReq2 = dcaOrderReq8;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dcaOrderReq2.getProfitSharingRatio())) {
            hDKMBd();
        }
        LossInsuranceDisplayData value = AEQbTJ().hDKMBd().getValue();
        if (value == null || !value.getCanShowVoucherInfo()) {
            return;
        }
        xMR xmr = xMR.copydefault;
        java.lang.String amount = value.getAmount();
        java.lang.String strCopydefault = xmr.copydefault(amount != null ? amount : "");
        java.lang.String voucherCcy = value.getVoucherCcy();
        if (voucherCcy == null) {
            voucherCcy = "USDT";
        }
        OLrzqt(strCopydefault + " " + voucherCcy);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.createFromParcel), 0.0f, 4.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        xMR xmr = xMR.copydefault;
        DcaOrderReq dcaOrderReq = this.KWHzl;
        if (dcaOrderReq == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq = null;
        }
        java.lang.String annualizedRate = dcaOrderReq.getAnnualizedRate();
        java.lang.String percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xmr, annualizedRate == null ? "" : annualizedRate, 0, 0, RoundingMode.DOWN, 6, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1);
        DcaOrderReq dcaOrderReq2 = this.KWHzl;
        if (dcaOrderReq2 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq2 = null;
        }
        java.lang.String annualizedRate2 = dcaOrderReq2.getAnnualizedRate();
        if (annualizedRate2 == null) {
            annualizedRate2 = "";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw, percentWithSymbol$default, null, 0, 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) annualizedRate2)), null, null, null, null, null, null, 130044, null));
        DcaOrderReq dcaOrderReq3 = this.KWHzl;
        if (dcaOrderReq3 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq3 = null;
        }
        java.lang.String strAYXKKw2 = Intrinsics.EZpvd((java.lang.Object) dcaOrderReq3.getDirection(), (java.lang.Object) "short") ? C33070mpX.AYXKKw(C55688xof.Application.hfdhUn) : C33070mpX.AYXKKw(C55688xof.Application.gqOnQv);
        DcaOrderReq dcaOrderReq4 = this.KWHzl;
        if (dcaOrderReq4 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq4 = null;
        }
        java.lang.String pxSteps = dcaOrderReq4.getPxSteps();
        arrayList.add(new TacticsInsideItemData(strAYXKKw2, xMR.formatPercent$default(xmr, pxSteps == null ? "" : pxSteps, 0, null, 6, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.OijiEz);
        DcaOrderReq dcaOrderReq5 = this.KWHzl;
        if (dcaOrderReq5 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq5 = null;
        }
        java.lang.String maxSafetyOrds = dcaOrderReq5.getMaxSafetyOrds();
        if (maxSafetyOrds == null) {
            maxSafetyOrds = "";
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw3, xmr.copydefault(maxSafetyOrds), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.FQMcgE);
        DcaOrderReq dcaOrderReq6 = this.KWHzl;
        if (dcaOrderReq6 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq6 = null;
        }
        java.lang.String investmentAmt = dcaOrderReq6.getInvestmentAmt();
        if (investmentAmt == null) {
            investmentAmt = "";
        }
        java.lang.String strCopydefault = xmr.copydefault(investmentAmt);
        DcaOrderReq dcaOrderReq7 = this.KWHzl;
        if (dcaOrderReq7 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq7 = null;
        }
        java.lang.String instType = dcaOrderReq7.getInstType();
        if (instType == null) {
            instType = "";
        }
        DcaOrderReq dcaOrderReq8 = this.KWHzl;
        if (dcaOrderReq8 == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq8 = null;
        }
        java.lang.String instId = dcaOrderReq8.getInstId();
        arrayList.add(new TacticsInsideItemData(strAYXKKw4, strCopydefault + " " + new C55887xsS(instType, instId != null ? instId : "").DbNXlk(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        StrategyConfigInfo value = AEQbTJ().valueOf().getValue();
        if (C33129mqd.KWHzl((java.util.Collection) (value != null ? value.getAutoStaking() : null))) {
            C54149wys.AEQbTJ.copydefault(arrayList, value);
        } else {
            if (C33129mqd.KWHzl((java.util.Collection) (value != null ? value.getAutoEarn() : null))) {
            }
        }
        arrayList.add(new TacticsInsideLineItemData(0, 0, 0, 7, null));
        arrayList.add(new BotRemindData(C33070mpX.AYXKKw(C55688xof.Application.hGuIrQ), 0, 0, null, 14, null));
        return arrayList;
    }

    @Override // o.AbstractC50583vTu
    public void OLrzqt() {
        DcaOrderReq dcaOrderReq = this.KWHzl;
        if (dcaOrderReq == null) {
            Intrinsics.gEmmrt("");
            dcaOrderReq = null;
        }
        C56028xvA.OLrzqt("make_order", C56423yEv.EZpvd(C56390yDp.OLrzqt("dcaReq", C33129mqd.gEmmrt(dcaOrderReq))));
        getParentFragmentManager().setFragmentResult("bot_order", new android.os.Bundle());
        dismissAllowingStateLoss();
    }
}
