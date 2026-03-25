package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.SingleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.SingleRedeemTransactionFragment$onInputChange$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C25493ixk;
import o.C26773jie;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.InterfaceC26680jgr;
import o.iVG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26773jie extends AbstractC26696jhG implements InterfaceC33040mou, InterfaceC26609jfZ, InterfaceC27520jwj {
    public InitialInfoModel fetchVPNInfo;
    public iHV valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;
    public final int isConnected = C25493ixk.Activity.UeEOUB;
    public final boolean fJNWhG = true;
    public final MutableSharedFlow<iXB> AkhnZx = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.jil
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26773jie.AhwBna(this.AEQbTJ);
        }
    });
    public final Function1<java.lang.String, Unit> values = new Function1() { // from class: o.jio
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C26773jie.AEQbTJ(this.EZpvd, (java.lang.String) obj);
        }
    };

    /* JADX INFO: renamed from: o.jie$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DetailItemType.values().length];
            try {
                iArr[DetailItemType.NETWORK_FEE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    @Override // o.InterfaceC27520jwj
    public void uzCIH() {
    }

    /* JADX INFO: renamed from: o.jie$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements Flow<InitialInfoModel> {
        public final /* synthetic */ C26773jie EZpvd;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.jie$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C26773jie KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C26773jie c26773jie) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c26773jie;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SingleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1 singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1;
                if (continuation instanceof SingleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1) {
                    singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1 = (SingleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1) continuation;
                    int i = singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1 = new SingleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    if (!Intrinsics.EZpvd((InitialInfoModel) obj, this.KWHzl.fetchVPNInfo)) {
                        singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, singleRedeemTransactionFragment$collectFlows$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C26773jie c26773jie) {
            this.KWHzl = flow;
            this.EZpvd = c26773jie;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InitialInfoModel> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final iHV fARcdN() {
        iHV ihv = this.valueOf;
        Intrinsics.copydefault(ihv);
        return ihv;
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public TransactionConfig valueOf() {
        TransactionConfig transactionConfig;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (transactionConfig = (TransactionConfig) arguments.getParcelable("key.trx_config")) == null) {
            throw new java.lang.IllegalStateException("TransactionInfo is required.");
        }
        return transactionConfig;
    }

    private final InterfaceC9738bbJ hDKMBd() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(aU_().gEmmrt().copydefault());
    }

    private final C26676jgn fJNWhG() {
        return (C26676jgn) this.DbNXlk.getValue();
    }

    public static final Unit OLrzqt(C26773jie c26773jie, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
        iVG.ActionBar.newInstance$default(iVG.Companion, investSubscriptionReceiveInfoUIBean, 0, false, 6, null).show(c26773jie.getChildFragmentManager(), iVG.class.getName());
        BaseTransactionFragment.trackButtonClick$default(c26773jie, "redeem_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C26773jie c26773jie, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c26773jie.values.invoke(str);
        BaseTransactionFragment.trackButtonClick$default(c26773jie, "redeem_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C26773jie c26773jie, InterfaceC24178iXu.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c26773jie.copydefault(taskDescription);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C26773jie c26773jie) {
        c26773jie.isConnected();
        BaseTransactionFragment.trackButtonClick$default(c26773jie, "slippage", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final C26676jgn AhwBna(final C26773jie c26773jie) {
        return new C26676jgn(null, new Function1() { // from class: o.jif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26773jie.OLrzqt(this.EZpvd, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }, new Function1() { // from class: o.jig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26773jie.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.jid
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26773jie.AYXKKw(this.OLrzqt);
            }
        }, null, new Function1() { // from class: o.jii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26773jie.AEQbTJ(this.OLrzqt, (InterfaceC24178iXu.TaskDescription) obj);
            }
        }, null, c26773jie.fJNWhG, 81, null);
    }

    private final void copydefault(InterfaceC24178iXu.TaskDescription taskDescription) {
        NetworkFee networkFee;
        if (ActionBar.KWHzl[taskDescription.EZpvd().ordinal()] == 1) {
            InvestGasPriceConfig value = fetchVPNInfo().OLrzqt().getValue();
            if (value != null && (networkFee = value.getNetworkFee()) != null) {
                OLrzqt(networkFee);
            }
            BaseTransactionFragment.trackButtonClick$default(this, "network_fee", null, null, null, 14, null);
        }
    }

    public static final Unit AEQbTJ(C26773jie c26773jie, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJHDKMBd = c26773jie.hDKMBd();
        java.lang.String strDbNXlk = interfaceC9738bbJHDKMBd != null ? interfaceC9738bbJHDKMBd.DbNXlk() : null;
        C26601jfR c26601jfRAEQbTJ = C26601jfR.Companion.AEQbTJ(new TokenSelectionParams(C33129mqd.valueOf(java.lang.Long.valueOf(c26773jie.valueOf().isConnected())), strDbNXlk == null ? "" : strDbNXlk, c26773jie.valueOf().copydefault(), TokenSelectionAction.Redeem));
        androidx.fragment.app.FragmentManager childFragmentManager = c26773jie.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26601jfRAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC26609jfZ
    public void OLrzqt(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        java.lang.String strEZpvd;
        java.util.List<InvestTokenWithAmount> underlyingTokenList;
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        java.lang.Object value = fetchVPNInfo().gEmmrt().getValue();
        java.lang.Object obj = null;
        InvestRedeemInitialInfo investRedeemInitialInfo = value instanceof InvestRedeemInitialInfo ? (InvestRedeemInitialInfo) value : null;
        if (investRedeemInitialInfo != null && (underlyingTokenList = investRedeemInitialInfo.getUnderlyingTokenList()) != null) {
            java.util.Iterator<T> it = underlyingTokenList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                    obj = next;
                    break;
                }
            }
            obj = (InvestTokenWithAmount) obj;
        }
        if (obj == null) {
            fetchVPNInfo().KWHzl("sp_invest_select_coin_reminder_dialog_never_show");
        }
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
        Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
        C26714jhY c26714jhY = (C26714jhY) abstractC24170iXmFetchVPNInfo;
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value2 == null || (strEZpvd = value2.EZpvd()) == null) {
            strEZpvd = "0";
        }
        c26714jhY.KWHzl(new InterfaceC26680jgr.Activity(strEZpvd, null, investTokenWithAmount, null, false, 26, null));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (fetchVPNInfo().KWHzl() != TransactionStage.INPUT) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26714jhY) abstractC24170iXmFetchVPNInfo).KWHzl(InterfaceC26680jgr.Application.copydefault);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = iHV.OLrzqt(view);
        fARcdN().AEQbTJ.setAddFoundsVisible(false);
        ejfBZ();
        EZpvd();
    }

    @Override // o.InterfaceC27520jwj
    public void wlaJM() {
        AhwBna();
    }

    @Override // o.InterfaceC27520jwj
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull InvestTokenWithAmount investTokenWithAmount, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        if (C33129mqd.OLrzqt(str, "0")) {
            fARcdN().AYXKKw.KWHzl("", false);
            fARcdN().isConnected.AEQbTJ();
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SingleRedeemTransactionFragment$onInputChange$1(this, z, str, null), 3, null);
    }

    /* JADX DEBUG: Possible override for method o.jhG.AhwBna()V */
    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        iXB value;
        iXC ixcAEQbTJ;
        iXA ixaEZpvd;
        iXC ixcAEQbTJ2;
        iXA ixaEZpvd2;
        java.lang.String strEZpvd;
        iXC ixcAEQbTJ3;
        iXA ixaEZpvd3;
        java.lang.String strEZpvd2;
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value2 != null && value2.isConnected() && (ixcAEQbTJ3 = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue())) != null && (ixaEZpvd3 = ixcAEQbTJ3.EZpvd()) != null && !ixaEZpvd3.DbNXlk()) {
            iXB value3 = fetchVPNInfo().fetchVPNInfo().getValue();
            updateUserInput$default(this, (value3 == null || (strEZpvd2 = value3.EZpvd()) == null) ? "0" : strEZpvd2, null, null, 6, null);
            return true;
        }
        iXB value4 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value4 == null || !value4.isConnected() || (value = fetchVPNInfo().fetchVPNInfo().getValue()) == null || !value.copydefault() || (ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue())) == null || (ixaEZpvd = ixcAEQbTJ.EZpvd()) == null || !ixaEZpvd.DbNXlk() || (ixcAEQbTJ2 = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue())) == null || (ixaEZpvd2 = ixcAEQbTJ2.EZpvd()) == null || !ixaEZpvd2.copydefault()) {
            return false;
        }
        iXB value5 = fetchVPNInfo().fetchVPNInfo().getValue();
        updateUserInput$default(this, (value5 == null || (strEZpvd = value5.EZpvd()) == null) ? "0" : strEZpvd, null, TransactionStage.INPUT, 2, null);
        return true;
    }

    private final void ejfBZ() {
        iHV ihvFARcdN = fARcdN();
        ihvFARcdN.gEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.jij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26773jie.copydefault(this.copydefault, view);
            }
        });
        ihvFARcdN.isConnected.KWHzl(this.fJNWhG);
        ihvFARcdN.KWHzl.setUseNewLayout(this.fJNWhG);
        ihvFARcdN.KWHzl.setOnCTAButtonClick(new Function0() { // from class: o.jik
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26773jie.gEmmrt(this.KWHzl);
            }
        });
        ihvFARcdN.KWHzl.setOnReminderActionClick(new Function1() { // from class: o.jim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26773jie.KWHzl(this.EZpvd, (InvestPopUpData) obj);
            }
        });
        iwGUEr();
        if (this.fJNWhG) {
            zLjUOn();
        }
        AuCTelauCTel();
    }

    public static final void copydefault(C26773jie c26773jie, android.view.View view) {
        AbstractC24170iXm.fetchInitialInfo$default(c26773jie.fetchVPNInfo(), null, 1, null);
    }

    public static final Unit gEmmrt(C26773jie c26773jie) {
        c26773jie.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C26773jie c26773jie, InvestPopUpData investPopUpData) {
        Intrinsics.checkNotNullParameter(investPopUpData, "");
        iUW iuwAEQbTJ = iUW.Companion.AEQbTJ(investPopUpData);
        androidx.fragment.app.FragmentManager childFragmentManager = c26773jie.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        iuwAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    private final void zLjUOn() {
        C27444jvM c27444jvM = fARcdN().djBIcL;
        if (c27444jvM != null) {
            if (valueOf().gHZMYf()) {
                c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_MIN", C33070mpX.AYXKKw(C25493ixk.FragmentManager.QkdxfA)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            } else {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("0.25", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("0.50", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("1", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            }
            c27444jvM.setInputRangeClickListener(new Function1() { // from class: o.jip
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26773jie.copydefault(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [274=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C26773jie c26773jie, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1746763374:
                if (!str.equals("SAFE_MAX")) {
                    java.lang.String strMulS$default = C33129mqd.mulS$default(c26773jie.OLrzqt(), C33129mqd.EZpvd(str), null, null, null, 14, null);
                    if (C33129mqd.AEQbTJ(strMulS$default, "0")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                            c26773jie.fARcdN().isConnected.setMaxTag();
                        }
                        c26773jie.fARcdN().isConnected.EZpvd().setPlainNumericText(strMulS$default);
                    }
                } else {
                    c26773jie.getNewProxyInstance();
                }
                break;
            case -1746763136:
                if (str.equals("SAFE_MIN")) {
                    c26773jie.fARcdN().isConnected.EZpvd().setPlainNumericText(c26773jie.gEmmrt());
                    break;
                }
                break;
            case -312496166:
                if (str.equals("SAFE_QUARTER")) {
                    c26773jie.fARcdN().isConnected.EZpvd().setPlainNumericText(C33129mqd.mulS$default(c26773jie.aV_(), "0.25", null, null, null, 14, null));
                    break;
                }
                break;
            case 1684760997:
                if (str.equals("SAFE_HALF")) {
                    c26773jie.fARcdN().isConnected.EZpvd().setPlainNumericText(C33129mqd.mulS$default(c26773jie.aV_(), "0.50", null, null, null, 14, null));
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    private final void getNewProxyInstance() {
        java.lang.String strEZpvd;
        java.lang.String strAV_ = aV_();
        java.lang.String strOLrzqt = OLrzqt();
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        iXA ixaEZpvd = ixcAEQbTJ != null ? ixcAEQbTJ.EZpvd() : null;
        boolean z = false;
        if (ixaEZpvd != null && ixaEZpvd.values().isBaseToken()) {
            java.lang.String strSubS$default = C33129mqd.subS$default(strOLrzqt, ixaEZpvd.djBIcL(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            strEZpvd = "0";
            if (C33129mqd.AEQbTJ(strSubS$default, "0")) {
                fetchVPNInfo().KWHzl("sp_invest_maxreminder_dialog_never_show");
                if (java.lang.Double.parseDouble(strSubS$default) < java.lang.Double.parseDouble(strAV_)) {
                    strAV_ = strSubS$default;
                }
                strEZpvd = C27491jwG.EZpvd(strAV_);
            } else {
                z = true;
            }
        } else {
            strEZpvd = C27491jwG.EZpvd(strAV_);
        }
        if (z) {
            fARcdN().valueOf.AEQbTJ();
            fARcdN().isConnected.djBIcL();
        } else {
            fARcdN().isConnected.setMaxTag();
            fARcdN().isConnected.EZpvd().setPlainNumericText(strEZpvd);
        }
        BaseTransactionFragment.trackButtonClick$default(this, "max", null, null, null, 14, null);
    }

    private final void iwGUEr() {
        android.content.Context context = fARcdN().getRoot().getContext();
        RecyclerView recyclerView = fARcdN().AuCTel;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(fJNWhG());
        fARcdN().AuCTel.addOnScrollListener(new FragmentManager());
    }

    /* JADX INFO: renamed from: o.jie$FragmentManager */
    public static final class FragmentManager extends RecyclerView.OnScrollListener {
        public FragmentManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            android.view.View viewFindViewById = C26773jie.this.fARcdN().getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
            }
            android.view.View viewFindViewById2 = C26773jie.this.fARcdN().getRoot().findViewById(C25493ixk.ActionBar.RcLksq);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(recyclerView.canScrollVertically(1) ? 0 : 8);
            }
        }
    }

    private final void getFieldNames() {
        C27131jpR c27131jpR = fARcdN().KWHzl;
        java.lang.Object tag = c27131jpR.getTag();
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 0)) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26714jhY) abstractC24170iXmFetchVPNInfo).KWHzl(InterfaceC26680jgr.StateListAnimator.copydefault);
            BaseTransactionFragment.trackButtonClick$default(this, "next_button", null, null, null, 14, null);
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 1)) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo2 = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo2, "");
            ((C26714jhY) abstractC24170iXmFetchVPNInfo2).KWHzl(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.APPROVAL));
            c27131jpR.AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 2)) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo3 = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo3, "");
            ((C26714jhY) abstractC24170iXmFetchVPNInfo3).KWHzl(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.SUBMIT));
            c27131jpR.AEQbTJ();
            InitialInfoModel value = fetchVPNInfo().gEmmrt().getValue();
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo = value instanceof InitialInfoModel.RedeemInitialInfo ? (InitialInfoModel.RedeemInitialInfo) value : null;
            djBIcL().EZpvd();
            KWHzl("confirm_button", redeemInitialInfo != null ? redeemInitialInfo.fARcdN() : null, redeemInitialInfo != null ? redeemInitialInfo.ejfBZ() : null, redeemInitialInfo != null ? redeemInitialInfo.isConnected() : null);
        }
    }

    /* JADX INFO: renamed from: o.jie$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C26773jie.this.OLrzqt(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void EZpvd() {
        super.EZpvd();
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().EZpvd(), null, new StateListAnimator(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().isConnected(), null, new Activity(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, FlowKt.debounce(this.AkhnZx, 500L), null, new Dialog(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, new Application(fetchVPNInfo().gEmmrt(), this), null, new PendingIntent(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().AYXKKw(), null, new Fragment(), 2, null);
    }

    /* JADX INFO: renamed from: o.jie$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C25481ixY c25481ixY, Continuation<? super Unit> continuation) {
            C26773jie.this.KWHzl(c25481ixY);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jie$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXB ixb, Continuation<? super Unit> continuation) {
            C26773jie.updateUserInput$default(C26773jie.this, ixb.EZpvd(), ixb.djBIcL(), null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jie$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt((InitialInfoModel) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object OLrzqt(InitialInfoModel initialInfoModel, Continuation<? super Unit> continuation) {
            java.lang.String coinAmount;
            BorrowedInfo borrowedInfoEZpvd;
            java.lang.String tokenSymbol;
            java.lang.String str;
            C26773jie.this.fetchVPNInfo = initialInfoModel;
            final InitialInfoModel.RedeemInitialInfo redeemInitialInfo = initialInfoModel instanceof InitialInfoModel.RedeemInitialInfo ? (InitialInfoModel.RedeemInitialInfo) initialInfoModel : null;
            if (redeemInitialInfo != null) {
                final C26773jie c26773jie = C26773jie.this;
                C27443jvL c27443jvL = c26773jie.fARcdN().AYXKKw;
                java.lang.String str2 = "";
                Intrinsics.checkNotNullExpressionValue(c27443jvL, "");
                c27443jvL.setVisibility(redeemInitialInfo.EZpvd() != null ? 0 : 8);
                C27443jvL c27443jvL2 = c26773jie.fARcdN().AYXKKw;
                java.lang.String string = c26773jie.getString(C25493ixk.FragmentManager.DarRvM);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c27443jvL2.setProtocolTitle(string);
                BorrowedInfo borrowedInfoEZpvd2 = redeemInitialInfo.EZpvd();
                if (borrowedInfoEZpvd2 != null && (coinAmount = borrowedInfoEZpvd2.getCoinAmount()) != null) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) coinAmount)) {
                        coinAmount = null;
                    }
                    if (coinAmount == null) {
                    }
                    borrowedInfoEZpvd = redeemInitialInfo.EZpvd();
                    if (borrowedInfoEZpvd != null) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) tokenSymbol)) {
                        }
                        if (str != null) {
                        }
                    }
                    c26773jie.fARcdN().AYXKKw.setApy(coinAmount + " " + str2);
                    c26773jie.fARcdN().AYXKKw.setTvl(C27492jwH.formatTvl$default(C27492jwH.OLrzqt, redeemInitialInfo.zsXlph(), false, true, 2, null));
                    c26773jie.fARcdN().AYXKKw.setGoDetailCallback(new Function0() { // from class: o.jiq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C26773jie.PendingIntent.KWHzl(c26773jie, redeemInitialInfo);
                        }
                    });
                } else {
                    coinAmount = "--";
                    borrowedInfoEZpvd = redeemInitialInfo.EZpvd();
                    if (borrowedInfoEZpvd != null && (tokenSymbol = borrowedInfoEZpvd.getTokenSymbol()) != null) {
                        str = C33129mqd.OLrzqt((java.lang.CharSequence) tokenSymbol) ? tokenSymbol : null;
                        if (str != null) {
                            str2 = str;
                        }
                    }
                    c26773jie.fARcdN().AYXKKw.setApy(coinAmount + " " + str2);
                    c26773jie.fARcdN().AYXKKw.setTvl(C27492jwH.formatTvl$default(C27492jwH.OLrzqt, redeemInitialInfo.zsXlph(), false, true, 2, null));
                    c26773jie.fARcdN().AYXKKw.setGoDetailCallback(new Function0() { // from class: o.jiq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C26773jie.PendingIntent.KWHzl(c26773jie, redeemInitialInfo);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C26773jie c26773jie, InitialInfoModel.RedeemInitialInfo redeemInitialInfo) {
            FragmentActivity activity = c26773jie.getActivity();
            if (activity != null) {
                C27508jwX.startInvestDetailActivity$default(C27508jwX.AEQbTJ, activity, java.lang.Long.valueOf(redeemInitialInfo.values()), null, "investsubscribeentrance", java.lang.Long.valueOf(redeemInitialInfo.copydefault()), true, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jie$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26764jiV interfaceC26764jiV, Continuation<? super Unit> continuation) {
            KeyEventDispatcher.Component activity = C26773jie.this.getActivity();
            InterfaceC26666jgd interfaceC26666jgd = activity instanceof InterfaceC26666jgd ? (InterfaceC26666jgd) activity : null;
            if (interfaceC26666jgd != null) {
                interfaceC26666jgd.copydefault(interfaceC26764jiV);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void OLrzqt(@NotNull InterfaceC24182iXy interfaceC24182iXy) {
        Intrinsics.checkNotNullParameter(interfaceC24182iXy, "");
        iHV ihvFARcdN = fARcdN();
        C55113xdn c55113xdn = ihvFARcdN.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = interfaceC24182iXy instanceof InterfaceC24182iXy.ActionBar;
        c55113xdn.setVisibility(z ? 0 : 8);
        if (z) {
            ihvFARcdN.AhwBna.setAnimation(C33492mxV.OLrzqt() ? "invest_subscription_loading_new_night.lottie" : "invest_subscription_loading_new.lottie");
            ihvFARcdN.AhwBna.KWHzl(0L);
        }
        C27204jql c27204jql = ihvFARcdN.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c27204jql, "");
        c27204jql.setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.Activity ? 0 : 8);
        C55173xeu c55173xeu = ihvFARcdN.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.TaskDescription ? 0 : 8);
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(interfaceC24182iXy);
        if (ixcAEQbTJ != null) {
            KWHzl(ixcAEQbTJ);
        }
    }

    private final void KWHzl(iXC ixc) {
        iHV ihvFARcdN = fARcdN();
        DbNXlk();
        ConstraintLayout constraintLayout = ihvFARcdN.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        TransactionStage transactionStageDbNXlk = ixc.DbNXlk();
        TransactionStage transactionStage = TransactionStage.INPUT;
        constraintLayout.setVisibility(transactionStageDbNXlk == transactionStage ? 0 : 8);
        ihvFARcdN.AEQbTJ.setVisibility(ixc.DbNXlk() == transactionStage ? 0 : 4);
        ihvFARcdN.fIwbmz.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 4);
        RecyclerView recyclerView = ihvFARcdN.AuCTel;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        android.view.View viewFindViewById = fARcdN().getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        android.view.View viewFindViewById2 = fARcdN().getRoot().findViewById(C25493ixk.ActionBar.RcLksq);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        OLrzqt(ixc);
        if (ixc.DbNXlk() == TransactionStage.CONFIRMATION && valueOf().zLjUOn()) {
            ihvFARcdN.fetchVPNInfo.setData(ixc.EZpvd(), valueOf(), ixc.DbNXlk());
        }
        KWHzl(ixc.AuCTel());
        ihvFARcdN.isConnected.EZpvd(ixc.DbNXlk() != transactionStage);
        C27444jvM c27444jvM = ihvFARcdN.djBIcL;
        if (c27444jvM != null && valueOf().gHZMYf()) {
            if (C33129mqd.OLrzqt(gEmmrt(), "0")) {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_QUARTER", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            } else {
                c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_MIN", C33070mpX.AYXKKw(C25493ixk.FragmentManager.QkdxfA)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            }
        }
        if (ixc.fIwbmz() && ixc.copydefault() != null) {
            java.lang.String message = ixc.copydefault().getMessage();
            C55326xho.toast$default((message == null || message.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) message)) ? C43422row.OLrzqt() : message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        djBIcL().gEmmrt(fetchVPNInfo().KWHzl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(C25481ixY c25481ixY) {
        if (valueOf().zLjUOn()) {
            return;
        }
        iHV ihvFARcdN = fARcdN();
        ihvFARcdN.AEQbTJ.setData(c25481ixY);
        ihvFARcdN.fIwbmz.setText(C23628iDk.EZpvd(valueOf(), c25481ixY.KWHzl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(InterfaceC24173iXp interfaceC24173iXp) {
        fARcdN().KWHzl.setButtonState(interfaceC24173iXp);
    }

    private final void OLrzqt(iXC ixc) {
        iHV ihvFARcdN = fARcdN();
        boolean z = ixc.DbNXlk() == TransactionStage.INPUT && !ixc.EZpvd().ejfBZ();
        C27407juc c27407juc = ihvFARcdN.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c27407juc, "");
        c27407juc.setVisibility(ixc.EZpvd().ejfBZ() ? 0 : 8);
        C27456jvY c27456jvY = ihvFARcdN.isConnected;
        Intrinsics.checkNotNullExpressionValue(c27456jvY, "");
        c27456jvY.setVisibility(true ^ ixc.EZpvd().ejfBZ() ? 0 : 8);
        C27130jpQ c27130jpQ = ihvFARcdN.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27130jpQ, "");
        c27130jpQ.setVisibility(z ^ true ? 4 : 0);
        C55030xcJ c55030xcJ = ihvFARcdN.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55030xcJ, "");
        c55030xcJ.setVisibility(z ? 0 : 8);
        copydefault(ixc.EZpvd(), ixc.DbNXlk());
        if (z) {
            AuCTelauCTel();
        }
    }

    private final void copydefault(iXA ixa, TransactionStage transactionStage) {
        java.lang.String strEZpvd;
        iHV ihvFARcdN = fARcdN();
        if (ixa.ejfBZ()) {
            C27407juc c27407juc = ihvFARcdN.fetchVPNInfo;
            c27407juc.setData(ixa, valueOf(), transactionStage);
            c27407juc.setTokenInputListeners(this);
            Intrinsics.checkNotNullExpressionValue(c27407juc, "");
            return;
        }
        C27456jvY c27456jvY = ihvFARcdN.isConnected;
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        java.lang.String str = "0";
        if (C33129mqd.valueOf(value != null ? value.EZpvd() : null, "0") && !ixa.fetchVPNInfo()) {
            ihvFARcdN.isConnected.AEQbTJ();
            return;
        }
        c27456jvY.setData(ixa);
        c27456jvY.setTokenInputListeners(this);
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value2 != null && (strEZpvd = value2.EZpvd()) != null) {
            str = strEZpvd;
        }
        if (!EZpvd(str) && !ixa.AkhnZx()) {
            c27456jvY.KWHzl();
        }
        Intrinsics.checkNotNullExpressionValue(c27456jvY, "");
    }

    private final void KWHzl(java.util.List<? extends InterfaceC24178iXu> list) {
        iSE.submitList$default(fJNWhG(), list, null, 2, null);
    }

    private final void AuCTelauCTel() {
        iHV ihvFARcdN = fARcdN();
        ihvFARcdN.valueOf.setEditable(ihvFARcdN.isConnected.EZpvd().KWHzl());
        ihvFARcdN.isConnected.EZpvd().requestFocus();
    }

    public static /* synthetic */ void updateUserInput$default(C26773jie c26773jie, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "0";
        }
        if ((i & 2) != 0) {
            investTokenWithAmount = null;
        }
        if ((i & 4) != 0) {
            transactionStage = null;
        }
        c26773jie.AEQbTJ(str, investTokenWithAmount, transactionStage);
    }

    private final void AEQbTJ(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage) {
        iXA ixaEZpvd;
        iXA ixaEZpvd2;
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
        Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
        C26714jhY c26714jhY = (C26714jhY) abstractC24170iXmFetchVPNInfo;
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        InvestTokenWithAmount investTokenWithAmountOLrzqt = value != null ? value.OLrzqt() : null;
        if (transactionStage == null) {
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
            if (ixcAEQbTJ != null && (ixaEZpvd2 = ixcAEQbTJ.EZpvd()) != null && !ixaEZpvd2.DbNXlk()) {
                transactionStage = TransactionStage.INPUT;
            } else {
                iXC ixcAEQbTJ2 = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
                if (ixcAEQbTJ2 != null && (ixaEZpvd = ixcAEQbTJ2.EZpvd()) != null && ixaEZpvd.copydefault()) {
                    transactionStage = TransactionStage.INPUT;
                } else {
                    transactionStage = TransactionStage.CONFIRMATION;
                }
            }
        }
        c26714jhY.KWHzl(new InterfaceC26680jgr.Activity(str, investTokenWithAmount, investTokenWithAmountOLrzqt, transactionStage, false, 16, null));
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void DbNXlk() {
        fARcdN().KWHzl.copydefault();
    }

    /* JADX INFO: renamed from: o.jie$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jie.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C26773jie OLrzqt(@NotNull TransactionConfig transactionConfig) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            C26773jie c26773jie = new C26773jie();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trx_config", transactionConfig);
            c26773jie.setArguments(bundle);
            return c26773jie;
        }
    }
}
