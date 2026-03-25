package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemTransactionFragment$onInputChange$1;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.InterfaceC26680jgr;
import o.InterfaceC54829xWw;
import o.iVG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26707jhR extends AbstractC26694jhE implements InterfaceC33040mou, InterfaceC26609jfZ, InterfaceC27520jwj {
    public ActivityResultLauncher<android.content.Intent> isConnected;
    public InterfaceC26699jhJ valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public final MutableSharedFlow<iXB> AkhnZx = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.jic
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26707jhR.gEmmrt(this.copydefault);
        }
    });
    public final Function1<java.lang.String, Unit> values = new Function1() { // from class: o.jhO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C26707jhR.OLrzqt(this.OLrzqt, (java.lang.String) obj);
        }
    };

    /* JADX INFO: renamed from: o.jhR$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DetailItemType.values().length];
            try {
                iArr[DetailItemType.NETWORK_FEE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.InterfaceC27520jwj
    public void uzCIH() {
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return getNewProxyInstance() ? C25493ixk.Activity.QfsBiF : C25493ixk.Activity.RJOkX;
    }

    public final InterfaceC26699jhJ iwGUEr() {
        InterfaceC26699jhJ interfaceC26699jhJ = this.valueOf;
        Intrinsics.copydefault(interfaceC26699jhJ);
        return interfaceC26699jhJ;
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

    public final boolean getNewProxyInstance() {
        return (valueOf().AuCTelauCTel() || valueOf().zLjUOn()) ? false : true;
    }

    private final InterfaceC9738bbJ AubY() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(aU_().gEmmrt().copydefault());
    }

    private final C26676jgn zLjUOn() {
        return (C26676jgn) this.DbNXlk.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iVG.ActionBar.newInstance$default(o.iVG$ActionBar, com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean, int, boolean, int, java.lang.Object):o.iVG */
    public static final Unit OLrzqt(C26707jhR c26707jhR, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
        iVG.ActionBar.newInstance$default(iVG.Companion, investSubscriptionReceiveInfoUIBean, 0, false, 6, null).show(c26707jhR.getChildFragmentManager(), iVG.class.getName());
        BaseTransactionFragment.trackButtonClick$default(c26707jhR, "redeem_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C26707jhR c26707jhR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c26707jhR.values.invoke(str);
        BaseTransactionFragment.trackButtonClick$default(c26707jhR, "redeem_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C26707jhR c26707jhR, InterfaceC24178iXu.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c26707jhR.OLrzqt(taskDescription);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C26707jhR c26707jhR) {
        c26707jhR.isConnected();
        BaseTransactionFragment.trackButtonClick$default(c26707jhR, "slippage", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final C26676jgn gEmmrt(final C26707jhR c26707jhR) {
        return new C26676jgn(null, new Function1() { // from class: o.jhU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26707jhR.OLrzqt(this.OLrzqt, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }, new Function1() { // from class: o.jhV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26707jhR.gEmmrt(this.OLrzqt, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.jhT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26707jhR.valueOf(this.KWHzl);
            }
        }, null, new Function1() { // from class: o.jhZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26707jhR.KWHzl(this.EZpvd, (InterfaceC24178iXu.TaskDescription) obj);
            }
        }, null, c26707jhR.getNewProxyInstance(), 81, null);
    }

    private final void OLrzqt(InterfaceC24178iXu.TaskDescription taskDescription) {
        NetworkFee networkFee;
        if (TaskDescription.AEQbTJ[taskDescription.EZpvd().ordinal()] == 1) {
            InvestGasPriceConfig value = fetchVPNInfo().OLrzqt().getValue();
            if (value != null && (networkFee = value.getNetworkFee()) != null) {
                OLrzqt(networkFee);
            }
            BaseTransactionFragment.trackButtonClick$default(this, "network_fee", null, null, null, 14, null);
        }
    }

    public static final Unit OLrzqt(C26707jhR c26707jhR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJAubY = c26707jhR.AubY();
        java.lang.String strDbNXlk = interfaceC9738bbJAubY != null ? interfaceC9738bbJAubY.DbNXlk() : null;
        C26601jfR c26601jfRAEQbTJ = C26601jfR.Companion.AEQbTJ(new TokenSelectionParams(C33129mqd.valueOf(java.lang.Long.valueOf(c26707jhR.valueOf().isConnected())), strDbNXlk == null ? "" : strDbNXlk, c26707jhR.valueOf().copydefault(), TokenSelectionAction.Redeem));
        androidx.fragment.app.FragmentManager childFragmentManager = c26707jhR.getChildFragmentManager();
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
        InterfaceC26699jhJ c26701jhL;
        Intrinsics.checkNotNullParameter(view, "");
        if (getNewProxyInstance()) {
            iHQ ihqKWHzl = iHQ.KWHzl(view);
            Intrinsics.checkNotNullExpressionValue(ihqKWHzl, "");
            c26701jhL = new C26703jhN(ihqKWHzl);
        } else {
            iHM ihmEZpvd = iHM.EZpvd(view);
            Intrinsics.checkNotNullExpressionValue(ihmEZpvd, "");
            c26701jhL = new C26701jhL(ihmEZpvd);
        }
        this.valueOf = c26701jhL;
        iwGUEr().EZpvd().setMaxViewVisible(false);
        ejfBZ();
        EZpvd();
        fIwbmz();
    }

    @Override // o.InterfaceC27520jwj
    public void wlaJM() {
        AhwBna();
    }

    @Override // o.InterfaceC27520jwj
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull InvestTokenWithAmount investTokenWithAmount, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RedeemTransactionFragment$onInputChange$1(this, z, str, null), 3, null);
    }

    public final java.lang.String fJNWhG() {
        if (valueOf().sSMYrx()) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.ihnvzI), C56423yEv.EZpvd(C56390yDp.OLrzqt("value", "")));
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.inahnb), C56423yEv.EZpvd(C56390yDp.OLrzqt("value", "")));
    }

    public final void hDKMBd() {
        updateUserInput$default(this, null, null, null, 7, null);
    }

    public final void fIwbmz() {
        this.isConnected = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.jhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C26707jhR.AEQbTJ(this.copydefault, (ActivityResult) obj);
            }
        });
    }

    public static final void AEQbTJ(C26707jhR c26707jhR, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 0 || activityResult.getResultCode() != -1) {
            return;
        }
        c26707jhR.requireActivity().finish();
    }

    /* JADX DEBUG: Possible override for method o.jhE.AhwBna()V */
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

    public final void ejfBZ() {
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        interfaceC26699jhJIwGUEr.AhwBna().setRetryClickListener(new View.OnClickListener() { // from class: o.jhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26707jhR.OLrzqt(this.copydefault, view);
            }
        });
        interfaceC26699jhJIwGUEr.values().copydefault(getNewProxyInstance());
        interfaceC26699jhJIwGUEr.EZpvd().setUseNewLayout(getNewProxyInstance());
        interfaceC26699jhJIwGUEr.KWHzl().setUseNewLayout(getNewProxyInstance());
        interfaceC26699jhJIwGUEr.EZpvd().setMaxClickListener(new View.OnClickListener() { // from class: o.jhP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26707jhR.KWHzl(this.OLrzqt, view);
            }
        });
        interfaceC26699jhJIwGUEr.KWHzl().setOnCTAButtonClick(new Function0() { // from class: o.jhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26707jhR.djBIcL(this.EZpvd);
            }
        });
        interfaceC26699jhJIwGUEr.KWHzl().setOnReminderActionClick(new Function1() { // from class: o.jhX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26707jhR.KWHzl(this.copydefault, (InvestPopUpData) obj);
            }
        });
        interfaceC26699jhJIwGUEr.isConnected().setCoinClickCallback(this.values);
        AuCTelauCTel();
        if (getNewProxyInstance()) {
            zsXlph();
        }
        sSMYrx();
    }

    public static final void OLrzqt(C26707jhR c26707jhR, android.view.View view) {
        AbstractC24170iXm.fetchInitialInfo$default(c26707jhR.fetchVPNInfo(), null, 1, null);
    }

    public static final void KWHzl(C26707jhR c26707jhR, android.view.View view) {
        iXC ixcAEQbTJ;
        java.lang.Object tag = view.getTag();
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 1)) {
            c26707jhR.gHZMYf();
        } else {
            if (!Intrinsics.EZpvd(tag, (java.lang.Object) 2) || (ixcAEQbTJ = C24181iXx.AEQbTJ(c26707jhR.fetchVPNInfo().AhwBna().getValue())) == null) {
                return;
            }
            c26707jhR.AEQbTJ(ixcAEQbTJ.EZpvd().values());
        }
    }

    public static final Unit djBIcL(C26707jhR c26707jhR) {
        c26707jhR.AwvSrB();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C26707jhR c26707jhR, InvestPopUpData investPopUpData) {
        Intrinsics.checkNotNullParameter(investPopUpData, "");
        iUW iuwAEQbTJ = iUW.Companion.AEQbTJ(investPopUpData);
        androidx.fragment.app.FragmentManager childFragmentManager = c26707jhR.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        iuwAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public final void zsXlph() {
        C27444jvM c27444jvMValueOf = iwGUEr().valueOf();
        if (c27444jvMValueOf != null) {
            if (valueOf().gHZMYf()) {
                c27444jvMValueOf.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_MIN", C33070mpX.AYXKKw(C25493ixk.FragmentManager.QkdxfA)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            } else {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                c27444jvMValueOf.setInputRanges(yDY.gEmmrt(new C24180iXw("0.25", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("0.50", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("1", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            }
            c27444jvMValueOf.setInputRangeClickListener(new Function1() { // from class: o.jia
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26707jhR.copydefault(this.copydefault, (java.lang.String) obj);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [346=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C26707jhR c26707jhR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1746763374:
                if (!str.equals("SAFE_MAX")) {
                    java.lang.String strMulS$default = C33129mqd.mulS$default(c26707jhR.OLrzqt(), C33129mqd.EZpvd(str), null, null, null, 14, null);
                    if (C33129mqd.AEQbTJ(strMulS$default, "0")) {
                        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                            c26707jhR.iwGUEr().values().setMaxTag();
                        }
                        c26707jhR.iwGUEr().values().copydefault().setPlainNumericText(strMulS$default);
                    }
                } else {
                    c26707jhR.getFieldNames();
                }
                break;
            case -1746763136:
                if (str.equals("SAFE_MIN")) {
                    c26707jhR.iwGUEr().values().copydefault().setPlainNumericText(c26707jhR.gEmmrt());
                    break;
                }
                break;
            case -312496166:
                if (str.equals("SAFE_QUARTER")) {
                    c26707jhR.iwGUEr().values().copydefault().setPlainNumericText(C33129mqd.mulS$default(c26707jhR.aV_(), "0.25", null, null, null, 14, null));
                    break;
                }
                break;
            case 1684760997:
                if (str.equals("SAFE_HALF")) {
                    c26707jhR.iwGUEr().values().copydefault().setPlainNumericText(C33129mqd.mulS$default(c26707jhR.aV_(), "0.50", null, null, null, 14, null));
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public final void getFieldNames() {
        java.lang.String strEZpvd;
        java.lang.String strAV_ = aV_();
        java.lang.String strSubS$default = C33129mqd.subS$default(OLrzqt(), aV_(), null, null, null, 14, null);
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        iXA ixaEZpvd = ixcAEQbTJ != null ? ixcAEQbTJ.EZpvd() : null;
        boolean z = false;
        if (ixaEZpvd != null && ixaEZpvd.values().isBaseToken()) {
            java.lang.String strSubS$default2 = C33129mqd.subS$default(strSubS$default, ixaEZpvd.djBIcL(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            strEZpvd = "0";
            if (C33129mqd.AEQbTJ(strSubS$default2, "0")) {
                fetchVPNInfo().KWHzl("sp_invest_maxreminder_dialog_never_show");
                if (java.lang.Double.parseDouble(strSubS$default2) < java.lang.Double.parseDouble(strAV_)) {
                    strAV_ = strSubS$default2;
                }
                strEZpvd = C27491jwG.EZpvd(strAV_);
            } else {
                z = true;
            }
        } else {
            strEZpvd = C27491jwG.EZpvd(strAV_);
        }
        if (z) {
            iwGUEr().AYXKKw().AEQbTJ();
            iwGUEr().values().OLrzqt();
        } else {
            iwGUEr().values().setMaxTag();
            iwGUEr().values().copydefault().setPlainNumericText(strEZpvd);
        }
        BaseTransactionFragment.trackButtonClick$default(this, "max", null, null, null, 14, null);
    }

    private final void AuCTelauCTel() {
        android.content.Context context = iwGUEr().DbNXlk().getContext();
        RecyclerView recyclerViewAkhnZx = iwGUEr().AkhnZx();
        recyclerViewAkhnZx.setLayoutManager(new LinearLayoutManager(context));
        recyclerViewAkhnZx.setAdapter(zLjUOn());
        iwGUEr().AkhnZx().addOnScrollListener(new FragmentManager());
    }

    /* JADX INFO: renamed from: o.jhR$FragmentManager */
    public static final class FragmentManager extends RecyclerView.OnScrollListener {
        public FragmentManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            android.view.View viewFindViewById = C26707jhR.this.iwGUEr().DbNXlk().findViewById(C25493ixk.ActionBar.fdazkH);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
            }
            android.view.View viewFindViewById2 = C26707jhR.this.iwGUEr().DbNXlk().findViewById(C25493ixk.ActionBar.RcLksq);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(recyclerView.canScrollVertically(1) ? 0 : 8);
            }
        }
    }

    private final void AwvSrB() {
        C27131jpR c27131jpRKWHzl = iwGUEr().KWHzl();
        java.lang.Object tag = c27131jpRKWHzl.getTag();
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
            c27131jpRKWHzl.AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 2)) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo3 = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo3, "");
            ((C26714jhY) abstractC24170iXmFetchVPNInfo3).KWHzl(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.SUBMIT));
            c27131jpRKWHzl.AEQbTJ();
            InitialInfoModel value = fetchVPNInfo().gEmmrt().getValue();
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo = value instanceof InitialInfoModel.RedeemInitialInfo ? (InitialInfoModel.RedeemInitialInfo) value : null;
            djBIcL().EZpvd();
            KWHzl("confirm_button", redeemInitialInfo != null ? redeemInitialInfo.fARcdN() : null, redeemInitialInfo != null ? redeemInitialInfo.ejfBZ() : null, redeemInitialInfo != null ? redeemInitialInfo.isConnected() : null);
        }
    }

    private final void gHZMYf() {
        java.lang.String strOLrzqt = OLrzqt();
        if (C33129mqd.AEQbTJ(strOLrzqt, "0")) {
            iwGUEr().values().setMaxTag();
            iwGUEr().values().copydefault().setPlainNumericText(strOLrzqt);
        }
        BaseTransactionFragment.trackButtonClick$default(this, "max", null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: o.jhR$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C26707jhR.this.KWHzl(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void EZpvd() {
        super.EZpvd();
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().EZpvd(), null, new StateListAnimator(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().isConnected(), null, new Application(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, FlowKt.debounce(this.AkhnZx, 500L), null, new ActionBar(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().AYXKKw(), null, new Dialog(), 2, null);
    }

    /* JADX INFO: renamed from: o.jhR$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C25481ixY c25481ixY, Continuation<? super Unit> continuation) {
            C26707jhR.this.OLrzqt(c25481ixY);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jhR$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXB ixb, Continuation<? super Unit> continuation) {
            C26707jhR.updateUserInput$default(C26707jhR.this, ixb.EZpvd(), ixb.djBIcL(), null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jhR$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26764jiV interfaceC26764jiV, Continuation<? super Unit> continuation) {
            KeyEventDispatcher.Component activity = C26707jhR.this.getActivity();
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
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        boolean z = interfaceC24182iXy instanceof InterfaceC24182iXy.ActionBar;
        interfaceC26699jhJIwGUEr.djBIcL().setVisibility(z ? 0 : 8);
        if (z) {
            interfaceC26699jhJIwGUEr.djBIcL().setAnimation(C33492mxV.OLrzqt() ? "invest_subscription_loading_new_night.lottie" : "invest_subscription_loading_new.lottie");
            interfaceC26699jhJIwGUEr.djBIcL().KWHzl(0L);
        }
        interfaceC26699jhJIwGUEr.copydefault().setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.Activity ? 0 : 8);
        interfaceC26699jhJIwGUEr.AhwBna().setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.TaskDescription ? 0 : 8);
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(interfaceC24182iXy);
        if (ixcAEQbTJ != null) {
            AEQbTJ(ixcAEQbTJ);
        } else {
            pUU.copydefault("Unexpected Content");
        }
    }

    private final void AEQbTJ(iXC ixc) {
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        DbNXlk();
        ConstraintLayout constraintLayoutOLrzqt = interfaceC26699jhJIwGUEr.OLrzqt();
        TransactionStage transactionStageDbNXlk = ixc.DbNXlk();
        TransactionStage transactionStage = TransactionStage.INPUT;
        constraintLayoutOLrzqt.setVisibility(transactionStageDbNXlk == transactionStage ? 0 : 8);
        interfaceC26699jhJIwGUEr.EZpvd().setVisibility(ixc.DbNXlk() == transactionStage ? 0 : 8);
        interfaceC26699jhJIwGUEr.AkhnZx().setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        android.view.View viewFindViewById = iwGUEr().DbNXlk().findViewById(C25493ixk.ActionBar.fdazkH);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        android.view.View viewFindViewById2 = iwGUEr().DbNXlk().findViewById(C25493ixk.ActionBar.RcLksq);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        KWHzl(ixc);
        if (ixc.DbNXlk() == TransactionStage.CONFIRMATION && valueOf().zLjUOn()) {
            interfaceC26699jhJIwGUEr.gEmmrt().setData(ixc.EZpvd(), valueOf(), ixc.DbNXlk());
        }
        KWHzl(ixc.AuCTel());
        interfaceC26699jhJIwGUEr.values().AEQbTJ(ixc.DbNXlk() != transactionStage);
        C27444jvM c27444jvMValueOf = interfaceC26699jhJIwGUEr.valueOf();
        if (c27444jvMValueOf != null && valueOf().gHZMYf()) {
            if (C33129mqd.OLrzqt(gEmmrt(), "0")) {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                c27444jvMValueOf.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_QUARTER", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            } else {
                c27444jvMValueOf.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_MIN", C33070mpX.AYXKKw(C25493ixk.FragmentManager.QkdxfA)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            }
        }
        if (ixc.fIwbmz() && ixc.copydefault() != null) {
            java.lang.String message = ixc.copydefault().getMessage();
            C55326xho.toast$default((message == null || message.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) message)) ? C43422row.OLrzqt() : message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        djBIcL().gEmmrt(fetchVPNInfo().KWHzl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(C25481ixY c25481ixY) {
        if (valueOf().zLjUOn()) {
            return;
        }
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        interfaceC26699jhJIwGUEr.EZpvd().setNeedFundTips(true);
        interfaceC26699jhJIwGUEr.EZpvd().setTitleText(fJNWhG());
        interfaceC26699jhJIwGUEr.EZpvd().setData(c25481ixY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(InterfaceC24173iXp interfaceC24173iXp) {
        iwGUEr().KWHzl().setButtonState(interfaceC24173iXp);
    }

    private final void KWHzl(iXC ixc) {
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        boolean z = ixc.DbNXlk() == TransactionStage.INPUT && !ixc.EZpvd().ejfBZ();
        interfaceC26699jhJIwGUEr.gEmmrt().setVisibility(ixc.EZpvd().ejfBZ() ? 0 : 8);
        interfaceC26699jhJIwGUEr.values().setVisibility(true ^ ixc.EZpvd().ejfBZ() ? 0 : 8);
        if (!getNewProxyInstance()) {
            interfaceC26699jhJIwGUEr.AEQbTJ().setBackgroundColor(requireContext().getColor(!ixc.EZpvd().ejfBZ() ? C52761wXj.Activity.ORxRYg : C52761wXj.Activity.aBDePw));
        }
        interfaceC26699jhJIwGUEr.EZpvd().setVisibility(z ^ true ? 4 : 0);
        interfaceC26699jhJIwGUEr.isConnected().setVisibility(z ? 0 : 8);
        interfaceC26699jhJIwGUEr.AYXKKw().setVisibility(z ? 0 : 8);
        OLrzqt(ixc.EZpvd(), ixc.DbNXlk());
        if (ixc.gEmmrt() != null) {
            KWHzl(ixc.gEmmrt(), ixc.valueOf(), ixc.fJNWhG());
        }
        if (z) {
            sSMYrx();
        }
    }

    public final void OLrzqt(iXA ixa, TransactionStage transactionStage) {
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        if (ixa.ejfBZ()) {
            C27407juc c27407jucGEmmrt = interfaceC26699jhJIwGUEr.gEmmrt();
            c27407jucGEmmrt.setData(ixa, valueOf(), transactionStage);
            c27407jucGEmmrt.setTokenInputListeners(this);
        } else {
            C27518jwh c27518jwhValues = interfaceC26699jhJIwGUEr.values();
            c27518jwhValues.setData(ixa, valueOf());
            c27518jwhValues.setTokenInputListeners(this);
        }
    }

    public final void KWHzl(InterfaceC24178iXu interfaceC24178iXu, int i, boolean z) {
        iwGUEr().isConnected().setData(interfaceC24178iXu, z, getNewProxyInstance());
    }

    private final void KWHzl(java.util.List<? extends InterfaceC24178iXu> list) {
        iSE.submitList$default(zLjUOn(), list, null, 2, null);
    }

    private final void sSMYrx() {
        InterfaceC26699jhJ interfaceC26699jhJIwGUEr = iwGUEr();
        interfaceC26699jhJIwGUEr.AYXKKw().setEditable(interfaceC26699jhJIwGUEr.values().copydefault().KWHzl());
        interfaceC26699jhJIwGUEr.values().copydefault().requestFocus();
    }

    public static /* synthetic */ void updateUserInput$default(C26707jhR c26707jhR, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "0";
        }
        if ((i & 2) != 0) {
            investTokenWithAmount = null;
        }
        if ((i & 4) != 0) {
            transactionStage = null;
        }
        c26707jhR.KWHzl(str, investTokenWithAmount, transactionStage);
    }

    public final void KWHzl(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage) {
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

    private final void AEQbTJ(InvestTokenWithAmount investTokenWithAmount) {
        java.lang.String strDjBIcL;
        java.lang.String strHDKMBd;
        java.util.ArrayList arrayListCopydefault;
        java.lang.String tokenAddress = !investTokenWithAmount.isBaseToken() ? investTokenWithAmount.getTokenAddress() : "";
        InterfaceC9741bbM interfaceC9741bbMGEmmrt = aU_().gEmmrt();
        InterfaceC9738bbJ interfaceC9738bbJAubY = AubY();
        java.lang.String strDbNXlk = interfaceC9738bbJAubY != null ? interfaceC9738bbJAubY.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = interfaceC9741bbMGEmmrt.OLrzqt(strDbNXlk);
        if (interfaceC9738bbJOLrzqt == null || (strDjBIcL = interfaceC9738bbJOLrzqt.djBIcL(investTokenWithAmount.getChainId())) == null) {
            strDjBIcL = "0";
        }
        InterfaceC9741bbM interfaceC9741bbMGEmmrt2 = aU_().gEmmrt();
        InterfaceC9738bbJ interfaceC9738bbJAubY2 = AubY();
        java.lang.String strDbNXlk2 = interfaceC9738bbJAubY2 != null ? interfaceC9738bbJAubY2.DbNXlk() : null;
        if (strDbNXlk2 == null) {
            strDbNXlk2 = "";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = interfaceC9741bbMGEmmrt2.OLrzqt(strDbNXlk2);
        if (interfaceC9738bbJOLrzqt2 == null || (strHDKMBd = interfaceC9738bbJOLrzqt2.hDKMBd()) == null) {
            strHDKMBd = "0";
        }
        boolean z = (C33129mqd.AEQbTJ(strDjBIcL, "0") || C33129mqd.AEQbTJ(strHDKMBd, "0")) ? false : true;
        InterfaceC23916iOb interfaceC23916iObAU_ = aU_();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(investTokenWithAmount.getChainId()));
        if (z) {
            arrayListCopydefault = yDY.copydefault("dex", "gas_station");
        } else {
            arrayListCopydefault = yDY.copydefault("gas_station");
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC23916iObAU_, abstractActivityC33041mov, new WalletRechargeBean(strGEmmrt, tokenAddress, "yield", "balance", arrayListCopydefault, (java.util.ArrayList) null, true, (java.lang.String) null, 0, 416, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void DbNXlk() {
        iwGUEr().KWHzl().copydefault();
    }

    /* JADX INFO: renamed from: o.jhR$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jhR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C26707jhR copydefault(@NotNull TransactionConfig transactionConfig) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            C26707jhR c26707jhR = new C26707jhR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trx_config", transactionConfig);
            c26707jhR.setArguments(bundle);
            return c26707jhR;
        }
    }
}
