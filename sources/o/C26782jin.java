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
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.V3RedeemTransactionFragment$setupProgressView$1$1$1;
import com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity;
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
import o.C24114iVk;
import o.C25493ixk;
import o.C26601jfR;
import o.C27446jvO;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.InterfaceC26680jgr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26782jin extends AbstractC26698jhI implements InterfaceC33040mou, InterfaceC26609jfZ, InterfaceC27520jwj, InterfaceC27531jwu, C27446jvO.TaskDescription {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public iHT AhwBna;
    public InvestTokenWithAmount AkhnZx;
    public ActivityResultLauncher<android.content.Intent> fARcdN;
    public ActivityResultLauncher<android.content.Intent> isConnected;
    public final int DbNXlk = C25493ixk.Activity.QbewEr;
    public final MutableSharedFlow<iXB> values = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.jiH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26782jin.AYXKKw(this.AEQbTJ);
        }
    });
    public final Function1<java.lang.String, Unit> fetchVPNInfo = new Function1() { // from class: o.jiJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C26782jin.KWHzl(this.KWHzl, (java.lang.String) obj);
        }
    };

    /* JADX INFO: renamed from: o.jin$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27520jwj
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull InvestTokenWithAmount investTokenWithAmount, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    @Override // o.InterfaceC27520jwj
    public void uzCIH() {
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

    private final C26676jgn iwGUEr() {
        return (C26676jgn) this.ejfBZ.getValue();
    }

    public static final Unit OLrzqt(C26782jin c26782jin, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
        iVG.Companion.KWHzl(investSubscriptionReceiveInfoUIBean, 1, c26782jin.fetchVPNInfo().values().values()).show(c26782jin.getChildFragmentManager(), iVG.class.getName());
        BaseTransactionFragment.trackButtonClick$default(c26782jin, "redeem_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C26782jin c26782jin, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c26782jin.fetchVPNInfo.invoke(str);
        BaseTransactionFragment.trackButtonClick$default(c26782jin, "redeem_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C26782jin c26782jin, InterfaceC24178iXu.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c26782jin.copydefault(taskDescription);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C26782jin c26782jin) {
        c26782jin.isConnected();
        BaseTransactionFragment.trackButtonClick$default(c26782jin, "slippage", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C26782jin c26782jin, InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
        Intrinsics.checkNotNullParameter(sharedElementCallback, "");
        c26782jin.KWHzl(sharedElementCallback);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C26782jin c26782jin, InterfaceC24178iXu.ComponentCallbacks2 componentCallbacks2) throws java.io.UnsupportedEncodingException {
        InvestTipInfoVo investTipInfoVoOLrzqt;
        Intrinsics.checkNotNullParameter(componentCallbacks2, "");
        FragmentActivity activity = c26782jin.getActivity();
        if (activity != null && (investTipInfoVoOLrzqt = componentCallbacks2.OLrzqt()) != null) {
            C27569jxf.handleTipInfo$default(C27569jxf.OLrzqt, activity, investTipInfoVoOLrzqt, null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final C26676jgn AYXKKw(final C26782jin c26782jin) {
        return new C26676jgn(new Function1() { // from class: o.jiK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.AEQbTJ(this.OLrzqt, (InvestTransactionLossInfo) obj);
            }
        }, new Function1() { // from class: o.jiw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.OLrzqt(this.EZpvd, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }, new Function1() { // from class: o.jiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.jis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26782jin.valueOf(this.KWHzl);
            }
        }, new Function1() { // from class: o.jiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.copydefault(this.EZpvd, (InterfaceC24178iXu.SharedElementCallback) obj);
            }
        }, new Function1() { // from class: o.jix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.OLrzqt(this.copydefault, (InterfaceC24178iXu.TaskDescription) obj);
            }
        }, new Function1() { // from class: o.jiz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.OLrzqt(this.EZpvd, (InterfaceC24178iXu.ComponentCallbacks2) obj);
            }
        }, true);
    }

    public static final Unit AEQbTJ(C26782jin c26782jin, InvestTransactionLossInfo investTransactionLossInfo) {
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        iUX.Companion.copydefault(investTransactionLossInfo, true).show(c26782jin.getChildFragmentManager(), (java.lang.String) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
        SwapSlippageActivity.ActionBar actionBar = SwapSlippageActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        android.content.Intent intentEZpvd = actionBar.EZpvd(fragmentActivityRequireActivity, sharedElementCallback.valueOf(), sharedElementCallback.KWHzl(), sharedElementCallback.copydefault(), sharedElementCallback.OLrzqt(), sharedElementCallback.djBIcL(), sharedElementCallback.AEQbTJ(), sharedElementCallback.AhwBna(), 0);
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.fARcdN;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(intentEZpvd);
        }
    }

    private final void copydefault(InterfaceC24178iXu.TaskDescription taskDescription) {
        NetworkFee networkFee;
        if (Activity.AEQbTJ[taskDescription.EZpvd().ordinal()] == 1) {
            InvestGasPriceConfig value = fetchVPNInfo().OLrzqt().getValue();
            if (value != null && (networkFee = value.getNetworkFee()) != null) {
                OLrzqt(networkFee);
            }
            BaseTransactionFragment.trackButtonClick$default(this, "network_fee", null, null, null, 14, null);
        }
    }

    public static final Unit KWHzl(C26782jin c26782jin, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJHDKMBd = c26782jin.hDKMBd();
        java.lang.String strDbNXlk = interfaceC9738bbJHDKMBd != null ? interfaceC9738bbJHDKMBd.DbNXlk() : null;
        C26601jfR c26601jfRAEQbTJ = C26601jfR.Companion.AEQbTJ(new TokenSelectionParams(C33129mqd.valueOf(java.lang.Long.valueOf(c26782jin.valueOf().isConnected())), strDbNXlk == null ? "" : strDbNXlk, c26782jin.valueOf().copydefault(), TokenSelectionAction.Redeem));
        androidx.fragment.app.FragmentManager childFragmentManager = c26782jin.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26601jfRAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC26609jfZ
    public void OLrzqt(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        InvestTokenWithAmount investTokenWithAmount2;
        java.lang.String strEZpvd;
        java.util.List<InvestTokenWithAmount> underlyingTokenList;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        if (Intrinsics.EZpvd(this.AkhnZx, investTokenWithAmount)) {
            return;
        }
        java.lang.Object value = fetchVPNInfo().gEmmrt().getValue();
        InvestRedeemInitialInfo investRedeemInitialInfo = value instanceof InvestRedeemInitialInfo ? (InvestRedeemInitialInfo) value : null;
        if (investRedeemInitialInfo == null || (underlyingTokenList = investRedeemInitialInfo.getUnderlyingTokenList()) == null) {
            investTokenWithAmount2 = null;
        } else {
            java.util.Iterator<T> it = underlyingTokenList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                        break;
                    }
                }
            }
            investTokenWithAmount2 = (InvestTokenWithAmount) next;
        }
        if (investTokenWithAmount2 == null) {
            fetchVPNInfo().KWHzl("sp_invest_select_coin_reminder_dialog_never_show");
        }
        this.AkhnZx = investTokenWithAmount;
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        C26714jhY c26714jhYAuCTel = AuCTel();
        if (value2 == null || (strEZpvd = value2.EZpvd()) == null) {
            strEZpvd = "0";
        }
        c26714jhYAuCTel.KWHzl(new InterfaceC26680jgr.Activity(strEZpvd, value2 != null ? value2.djBIcL() : null, investTokenWithAmount, null, false, 24, null));
        InvestTokenWithAmount investTokenWithAmountDjBIcL = value2 != null ? value2.djBIcL() : null;
        fetchVPNInfo().OLrzqt(investTokenWithAmountDjBIcL != null ? new InvestInputData(value2.EZpvd(), investTokenWithAmountDjBIcL.getTokenAddress(), (java.lang.String) null, false, false, 28, (DefaultConstructorMarker) null) : null);
    }

    public final C26714jhY AuCTel() {
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
        Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
        return (C26714jhY) abstractC24170iXmFetchVPNInfo;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = iHT.EZpvd(view);
        getFieldNames();
        EZpvd();
        getNewProxyInstance();
    }

    @Override // o.InterfaceC27520jwj
    public void wlaJM() {
        AhwBna();
    }

    private final void getNewProxyInstance() {
        this.isConnected = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.jit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C26782jin.OLrzqt(this.KWHzl, (ActivityResult) obj);
            }
        });
        this.fARcdN = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.jiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C26782jin.KWHzl(this.EZpvd, (ActivityResult) obj);
            }
        });
    }

    public static final void OLrzqt(C26782jin c26782jin, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 0 || activityResult.getResultCode() != -1) {
            return;
        }
        c26782jin.requireActivity().finish();
    }

    public static final void KWHzl(C26782jin c26782jin, ActivityResult activityResult) {
        android.content.Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        java.lang.String stringExtra = data.getStringExtra("result_slippage_mode");
        if (stringExtra == null) {
            stringExtra = "DYNAMIC";
        }
        SwapSlippageActivity.SlippageMode slippageModeValueOf = SwapSlippageActivity.SlippageMode.valueOf(stringExtra);
        java.lang.String stringExtra2 = data.getStringExtra("result_max_slippage");
        java.lang.String stringExtra3 = data.getStringExtra("result_fixed_slippage");
        if (stringExtra3 == null) {
            stringExtra3 = SlippageConfigVo.MAX_SLIP;
        }
        int i = 0;
        boolean booleanExtra = data.getBooleanExtra("result_is_custom", false);
        boolean booleanExtra2 = data.getBooleanExtra("result_dynamic_is_custom", false);
        boolean booleanExtra3 = data.getBooleanExtra("result_user_set_fixed_slippage", false);
        int i2 = -1;
        for (java.lang.Object obj : c26782jin.iwGUEr().EZpvd()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC24178iXu interfaceC24178iXu = (InterfaceC24178iXu) obj;
            if (interfaceC24178iXu instanceof InterfaceC24178iXu.SharedElementCallback) {
                InterfaceC24178iXu.SharedElementCallback sharedElementCallback = (InterfaceC24178iXu.SharedElementCallback) interfaceC24178iXu;
                sharedElementCallback.AEQbTJ(slippageModeValueOf);
                sharedElementCallback.copydefault(stringExtra2);
                sharedElementCallback.EZpvd(stringExtra3);
                sharedElementCallback.EZpvd(booleanExtra);
                sharedElementCallback.KWHzl(booleanExtra2);
                sharedElementCallback.copydefault(booleanExtra3);
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            c26782jin.iwGUEr().notifyItemChanged(i2);
        }
    }

    /* JADX DEBUG: Possible override for method o.jhI.AhwBna()V */
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

    private final void getFieldNames() {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        iht.AYXKKw.setRetryClickListener(new View.OnClickListener() { // from class: o.jiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26782jin.KWHzl(this.KWHzl, view);
            }
        });
        iht.gEmmrt.setUseNewLayout(true);
        iht.gEmmrt.setOnCTAButtonClick(new Function0() { // from class: o.jiG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26782jin.AhwBna(this.OLrzqt);
            }
        });
        iht.gEmmrt.setOnReminderActionClick(new Function1() { // from class: o.jiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.EZpvd(this.copydefault, (InvestPopUpData) obj);
            }
        });
        iht.DbNXlk.setCoinClickCallback(this.fetchVPNInfo);
        iht.fIwbmz.AEQbTJ(false);
        zLjUOn();
        AubY();
        ejfBZ();
        AuCTelauCTel();
    }

    public static final void KWHzl(C26782jin c26782jin, android.view.View view) {
        AbstractC24170iXm.fetchInitialInfo$default(c26782jin.fetchVPNInfo(), null, 1, null);
    }

    public static final Unit AhwBna(C26782jin c26782jin) {
        c26782jin.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C26782jin c26782jin, InvestPopUpData investPopUpData) {
        Intrinsics.checkNotNullParameter(investPopUpData, "");
        iUW iuwAEQbTJ = iUW.Companion.AEQbTJ(investPopUpData);
        androidx.fragment.app.FragmentManager childFragmentManager = c26782jin.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        iuwAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        final iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        iht.fIwbmz.KWHzl();
        iht.fIwbmz.setDelayContentTextWatcher(new Function1() { // from class: o.jiB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.AhwBna(this.OLrzqt, (java.lang.String) obj);
            }
        });
        iht.fIwbmz.setContentTextWatcher(new Function1() { // from class: o.jiA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.OLrzqt(iht, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AhwBna(C26782jin c26782jin, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        LifecycleOwner viewLifecycleOwner = c26782jin.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new V3RedeemTransactionFragment$setupProgressView$1$1$1(str, c26782jin, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(iHT iht, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iht.fIwbmz.setAmountWithLottie(C33129mqd.gEmmrt(str));
        return Unit.INSTANCE;
    }

    private final void AubY() {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        C27444jvM c27444jvM = iht.valueOf;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("0.25", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("0.50", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("1", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
        c27444jvM.setInputRangeClickListener(new Function1() { // from class: o.jiF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26782jin.AYXKKw(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AYXKKw(C26782jin c26782jin, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        iHT iht = null;
        if (iHashCode != 49) {
            if (iHashCode != 1475777) {
                if (iHashCode == 1475865 && str.equals("0.50")) {
                    iHT iht2 = c26782jin.AhwBna;
                    if (iht2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        iht = iht2;
                    }
                    iht.fIwbmz.KWHzl(C33129mqd.mulS$default("100", "0.50", null, null, null, 14, null));
                }
            } else if (str.equals("0.25")) {
                iHT iht3 = c26782jin.AhwBna;
                if (iht3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    iht = iht3;
                }
                iht.fIwbmz.KWHzl(C33129mqd.mulS$default("100", "0.25", null, null, null, 14, null));
            }
        } else if (str.equals("1")) {
            iHT iht4 = c26782jin.AhwBna;
            if (iht4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                iht = iht4;
            }
            iht.fIwbmz.KWHzl("100");
        }
        return Unit.INSTANCE;
    }

    private final void zLjUOn() {
        iHT iht = this.AhwBna;
        iHT iht2 = null;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        android.content.Context context = iht.getRoot().getContext();
        iHT iht3 = this.AhwBna;
        if (iht3 == null) {
            Intrinsics.gEmmrt("");
            iht3 = null;
        }
        RecyclerView recyclerView = iht3.AkhnZx;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(iwGUEr());
        iHT iht4 = this.AhwBna;
        if (iht4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            iht2 = iht4;
        }
        iht2.AkhnZx.addOnScrollListener(new Fragment());
    }

    /* JADX INFO: renamed from: o.jin$Fragment */
    public static final class Fragment extends RecyclerView.OnScrollListener {
        public Fragment() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            iHT iht = C26782jin.this.AhwBna;
            iHT iht2 = null;
            if (iht == null) {
                Intrinsics.gEmmrt("");
                iht = null;
            }
            android.view.View viewFindViewById = iht.getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
            }
            iHT iht3 = C26782jin.this.AhwBna;
            if (iht3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                iht2 = iht3;
            }
            android.view.View viewFindViewById2 = iht2.getRoot().findViewById(C25493ixk.ActionBar.RcLksq);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(recyclerView.canScrollVertically(1) ? 0 : 8);
            }
        }
    }

    private final void zsXlph() {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        C27131jpR c27131jpR = iht.gEmmrt;
        java.lang.Object tag = c27131jpR.getTag();
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 0)) {
            AuCTel().KWHzl(InterfaceC26680jgr.StateListAnimator.copydefault);
            BaseTransactionFragment.trackButtonClick$default(this, "next_button", null, null, null, 14, null);
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 1)) {
            AuCTel().KWHzl(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.APPROVAL));
            c27131jpR.AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 4)) {
            AuCTel().KWHzl(new InterfaceC26680jgr.Fragment(TransactionStage.RECEIVE_INFO_TIME_OUT));
            c27131jpR.AEQbTJ();
        } else if (Intrinsics.EZpvd(tag, (java.lang.Object) 2)) {
            AuCTel().KWHzl(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.SUBMIT));
            c27131jpR.AEQbTJ();
            InitialInfoModel value = fetchVPNInfo().gEmmrt().getValue();
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo = value instanceof InitialInfoModel.RedeemInitialInfo ? (InitialInfoModel.RedeemInitialInfo) value : null;
            djBIcL().EZpvd();
            KWHzl("confirm_button", redeemInitialInfo != null ? redeemInitialInfo.fARcdN() : null, redeemInitialInfo != null ? redeemInitialInfo.ejfBZ() : null, redeemInitialInfo != null ? redeemInitialInfo.isConnected() : null);
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void EZpvd() {
        super.EZpvd();
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().EZpvd(), null, new ActionBar(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, FlowKt.debounce(this.values, 500L), null, new StateListAnimator(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().gEmmrt(), null, new Application(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().AYXKKw(), null, new LoaderManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.jin$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C26782jin.this.copydefault(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jin$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXB ixb, Continuation<? super Unit> continuation) {
            C26782jin.updateUserInput$default(C26782jin.this, ixb.EZpvd(), ixb.djBIcL(), null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jin$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InitialInfoModel initialInfoModel, Continuation<? super Unit> continuation) {
            C26782jin.this.AEQbTJ(initialInfoModel);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jin$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26764jiV interfaceC26764jiV, Continuation<? super Unit> continuation) {
            KeyEventDispatcher.Component activity = C26782jin.this.getActivity();
            InterfaceC26666jgd interfaceC26666jgd = activity instanceof InterfaceC26666jgd ? (InterfaceC26666jgd) activity : null;
            if (interfaceC26666jgd != null) {
                interfaceC26666jgd.copydefault(interfaceC26764jiV);
            }
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(InitialInfoModel initialInfoModel) {
        java.lang.String tokenLogo;
        java.lang.String tokenSymbol;
        if (initialInfoModel == null) {
            return;
        }
        iHT iht = this.AhwBna;
        java.lang.String str = "";
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo = (InitialInfoModel.RedeemInitialInfo) initialInfoModel;
        InvestTokenWithAmount investTokenWithAmount = this.AkhnZx;
        if (investTokenWithAmount == null) {
            investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemInitialInfo.iwGUEr());
        }
        C27443jvL c27443jvL = iht.KWHzl;
        if (investTokenWithAmount == null || (tokenLogo = investTokenWithAmount.getTokenLogo()) == null) {
            tokenLogo = "";
        }
        c27443jvL.setLeftIcon(tokenLogo);
        C27443jvL c27443jvL2 = iht.KWHzl;
        if (investTokenWithAmount != null && (tokenSymbol = investTokenWithAmount.getTokenSymbol()) != null) {
            str = tokenSymbol;
        }
        c27443jvL2.setLeftTitle(str);
        iht.KWHzl.OLrzqt(redeemInitialInfo.zLjUOn());
        iht.KWHzl.setOnCardClickListener(new View.OnClickListener() { // from class: o.jiC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26782jin.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(C26782jin c26782jin, android.view.View view) {
        C26601jfR.StateListAnimator stateListAnimator = C26601jfR.Companion;
        long jIsConnected = c26782jin.valueOf().isConnected();
        InterfaceC9738bbJ interfaceC9738bbJHDKMBd = c26782jin.hDKMBd();
        java.lang.String strDbNXlk = interfaceC9738bbJHDKMBd != null ? interfaceC9738bbJHDKMBd.DbNXlk() : null;
        C26601jfR c26601jfRAEQbTJ = stateListAnimator.AEQbTJ(new TokenSelectionParams(jIsConnected, strDbNXlk == null ? "" : strDbNXlk, c26782jin.valueOf().copydefault(), TokenSelectionAction.Redeem));
        androidx.fragment.app.FragmentManager childFragmentManager = c26782jin.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26601jfRAEQbTJ.show(childFragmentManager);
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void OLrzqt(@NotNull InterfaceC24182iXy interfaceC24182iXy) {
        Intrinsics.checkNotNullParameter(interfaceC24182iXy, "");
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        C55113xdn c55113xdn = iht.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = interfaceC24182iXy instanceof InterfaceC24182iXy.ActionBar;
        c55113xdn.setVisibility(z ? 0 : 8);
        if (z) {
            iht.AhwBna.setAnimation(C33492mxV.OLrzqt() ? "invest_subscription_loading_new_night.lottie" : "invest_subscription_loading_new.lottie");
            iht.AhwBna.KWHzl(0L);
        }
        C27204jql c27204jql = iht.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c27204jql, "");
        c27204jql.setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.Activity ? 0 : 8);
        C55173xeu c55173xeu = iht.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.TaskDescription ? 0 : 8);
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(interfaceC24182iXy);
        if (ixcAEQbTJ != null) {
            OLrzqt(ixcAEQbTJ);
        } else {
            pUU.copydefault("Unexpected Content");
        }
    }

    private final void OLrzqt(iXC ixc) {
        iHT iht = this.AhwBna;
        iHT iht2 = null;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        KWHzl(ixc);
        EZpvd(ixc);
        DbNXlk();
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC26681jgs interfaceC26681jgs = activity instanceof InterfaceC26681jgs ? (InterfaceC26681jgs) activity : null;
        if (interfaceC26681jgs != null) {
            interfaceC26681jgs.copydefault(ixc.DbNXlk());
        }
        if (ixc.DbNXlk() == TransactionStage.CONFIRMATION) {
            if (fetchVPNInfo().values().values()) {
                KeyEventDispatcher.Component activity2 = getActivity();
                InterfaceC26678jgp interfaceC26678jgp = activity2 instanceof InterfaceC26678jgp ? (InterfaceC26678jgp) activity2 : null;
                if (interfaceC26678jgp != null) {
                    interfaceC26678jgp.copydefault(C56548yJl.copydefault(ixc.AEQbTJ(), 15));
                }
            }
        } else {
            KeyEventDispatcher.Component activity3 = getActivity();
            InterfaceC26678jgp interfaceC26678jgp2 = activity3 instanceof InterfaceC26678jgp ? (InterfaceC26678jgp) activity3 : null;
            if (interfaceC26678jgp2 != null) {
                interfaceC26678jgp2.valueOf();
            }
        }
        iHT iht3 = this.AhwBna;
        if (iht3 == null) {
            Intrinsics.gEmmrt("");
            iht3 = null;
        }
        C27259jrn c27259jrn = iht3.fIwbmz;
        TransactionStage transactionStageDbNXlk = ixc.DbNXlk();
        TransactionStage transactionStage = TransactionStage.INPUT;
        c27259jrn.AEQbTJ(transactionStageDbNXlk != transactionStage);
        ConstraintLayout constraintLayout = iht.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(ixc.DbNXlk() == transactionStage ? 0 : 8);
        iHT iht4 = this.AhwBna;
        if (iht4 == null) {
            Intrinsics.gEmmrt("");
            iht4 = null;
        }
        android.view.View viewFindViewById = iht4.getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        iHT iht5 = this.AhwBna;
        if (iht5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            iht2 = iht5;
        }
        android.view.View viewFindViewById2 = iht2.getRoot().findViewById(C25493ixk.ActionBar.RcLksq);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        AEQbTJ(ixc);
        RecyclerView recyclerView = iht.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(ixc.DbNXlk() == transactionStage ? 8 : 0);
        OLrzqt(ixc.AuCTel());
        fARcdN();
        if (ixc.fIwbmz() && ixc.copydefault() != null) {
            java.lang.String message = ixc.copydefault().getMessage();
            C55326xho.toast$default((message == null || message.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) message)) ? C43422row.OLrzqt() : message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        djBIcL().gEmmrt(fetchVPNInfo().KWHzl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(InterfaceC24173iXp interfaceC24173iXp) {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        iht.gEmmrt.setButtonState(interfaceC24173iXp);
    }

    public final void fARcdN() {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        C27444jvM c27444jvM = iht.valueOf;
        if (valueOf().gHZMYf()) {
            if (C33129mqd.OLrzqt(gEmmrt(), "0")) {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_QUARTER", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            } else {
                c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("SAFE_MIN", C33070mpX.AYXKKw(C25493ixk.FragmentManager.QkdxfA)), new C24180iXw("SAFE_HALF", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, "0.50", false, 2, null)), new C24180iXw("SAFE_MAX", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
            }
        }
    }

    public final void KWHzl(iXC ixc) {
        java.lang.String string;
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        android.widget.TextView textView = iht.fetchVPNInfo;
        if (ixc.DbNXlk() == TransactionStage.INPUT) {
            string = getString(C25493ixk.FragmentManager.fdOvFl) + " #" + valueOf().ejfBZ();
        } else {
            Intrinsics.copydefault(textView);
            KWHzl(textView, fetchVPNInfo().values().values());
            string = getString(C25493ixk.FragmentManager.fERRXa);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        textView.setText(string);
    }

    public final void KWHzl(android.widget.TextView textView, boolean z) {
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getContext().getResources().getDrawable(C25493ixk.StateListAnimator.gEmmrt), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
    }

    public final void EZpvd(iXC ixc) {
        java.util.List<InvestTokenWithAmount> listCopydefault;
        if (this.AhwBna == null) {
            Intrinsics.gEmmrt("");
        }
        TransactionStage transactionStageDbNXlk = ixc.DbNXlk();
        iHT iht = this.AhwBna;
        iHT iht2 = null;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        C27259jrn c27259jrn = iht.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c27259jrn, "");
        c27259jrn.setVisibility(transactionStageDbNXlk == TransactionStage.INPUT ? 0 : 8);
        iHT iht3 = this.AhwBna;
        if (iht3 == null) {
            Intrinsics.gEmmrt("");
            iht3 = null;
        }
        C27449jvR c27449jvR = iht3.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27449jvR, "");
        c27449jvR.setVisibility((transactionStageDbNXlk == TransactionStage.CONFIRMATION || transactionStageDbNXlk == TransactionStage.RECEIVE_INFO_TIME_OUT) ? 0 : 8);
        InterfaceC24178iXu interfaceC24178iXuGEmmrt = ixc.gEmmrt();
        InterfaceC24178iXu.LoaderManager loaderManager = interfaceC24178iXuGEmmrt instanceof InterfaceC24178iXu.LoaderManager ? (InterfaceC24178iXu.LoaderManager) interfaceC24178iXuGEmmrt : null;
        if (loaderManager == null || (listCopydefault = loaderManager.copydefault()) == null) {
            return;
        }
        java.util.ArrayList<InvestTokenWithAmount> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (InvestTokenWithAmount investTokenWithAmount : listCopydefault) {
            arrayList.add(investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : C23626iDi.EZpvd(investTokenWithAmount, (InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)), (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), false, 2, null), (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InvestTokenWithAmount investTokenWithAmount2 : arrayList) {
            arrayList2.add(new C27522jwl(investTokenWithAmount2.getCoinAmount(), investTokenWithAmount2.getTokenSymbol(), investTokenWithAmount2.getCurrencyAmount(), investTokenWithAmount2.getTokenLogo()));
        }
        iHT iht4 = this.AhwBna;
        if (iht4 == null) {
            Intrinsics.gEmmrt("");
            iht4 = null;
        }
        iht4.copydefault.setTokens(arrayList2);
        if (arrayList2.size() == 1) {
            iHT iht5 = this.AhwBna;
            if (iht5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                iht2 = iht5;
            }
            iht2.copydefault.OLrzqt();
        }
    }

    private final void AEQbTJ(iXC ixc) {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        boolean z = ixc.DbNXlk() == TransactionStage.INPUT && !ixc.EZpvd().ejfBZ();
        C27521jwk c27521jwk = iht.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c27521jwk, "");
        c27521jwk.setVisibility(z ? 0 : 8);
        iht.DbNXlk.EZpvd();
        C55030xcJ c55030xcJ = iht.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55030xcJ, "");
        c55030xcJ.setVisibility(z ? 0 : 8);
        if (ixc.gEmmrt() != null) {
            copydefault(ixc.gEmmrt(), ixc.fJNWhG());
        }
        if (z) {
            AuCTelauCTel();
        }
    }

    private final void copydefault(InterfaceC24178iXu interfaceC24178iXu, boolean z) {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        Intrinsics.copydefault(interfaceC24178iXu, "");
        InterfaceC24178iXu.LoaderManager loaderManager = (InterfaceC24178iXu.LoaderManager) interfaceC24178iXu;
        iht.DbNXlk.setData(loaderManager.copydefault((503 & 1) != 0 ? loaderManager.AhwBna : 0, (503 & 2) != 0 ? loaderManager.gEmmrt : null, (503 & 4) != 0 ? loaderManager.KWHzl : 0, (503 & 8) != 0 ? loaderManager.EZpvd : false, (503 & 16) != 0 ? loaderManager.AEQbTJ : false, (503 & 32) != 0 ? loaderManager.copydefault : null, (503 & 64) != 0 ? loaderManager.OLrzqt : false, (503 & 128) != 0 ? loaderManager.valueOf : null, (503 & 256) != 0 ? loaderManager.djBIcL : null), z, true);
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (C33129mqd.OLrzqt(value != null ? value.EZpvd() : null, "0")) {
            iht.KWHzl.EZpvd("0", C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, "0", false, 2, null), false);
            return;
        }
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(loaderManager.copydefault());
        if (investTokenWithAmount != null) {
            iht.KWHzl.EZpvd(C23626iDi.EZpvd(investTokenWithAmount, (InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)), C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), false, 2, null), z);
        }
    }

    private final void OLrzqt(java.util.List<? extends InterfaceC24178iXu> list) {
        iSE.submitList$default(iwGUEr(), list, null, 2, null);
    }

    private final void AuCTelauCTel() {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        iht.djBIcL.setEditable(iht.fIwbmz.AEQbTJ().KWHzl());
        iht.fIwbmz.AEQbTJ().requestFocus();
    }

    public static /* synthetic */ void updateUserInput$default(C26782jin c26782jin, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "0";
        }
        if ((i & 2) != 0) {
            investTokenWithAmount = null;
        }
        if ((i & 4) != 0) {
            transactionStage = null;
        }
        c26782jin.copydefault(str, investTokenWithAmount, transactionStage);
    }

    private final void copydefault(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, TransactionStage transactionStage) {
        iXA ixaEZpvd;
        iXA ixaEZpvd2;
        C26714jhY c26714jhYAuCTel = AuCTel();
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
        c26714jhYAuCTel.KWHzl(new InterfaceC26680jgr.Activity(str, investTokenWithAmount, investTokenWithAmountOLrzqt, transactionStage, false, 16, null));
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void DbNXlk() {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        iht.gEmmrt.copydefault();
    }

    /* JADX INFO: renamed from: o.jin$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jin.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C26782jin OLrzqt(@NotNull TransactionConfig transactionConfig) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            C26782jin c26782jin = new C26782jin();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trx_config", transactionConfig);
            c26782jin.setArguments(bundle);
            return c26782jin;
        }
    }

    @Override // o.InterfaceC27531jwu
    public void copydefault(boolean z) {
        iHT iht = this.AhwBna;
        if (iht == null) {
            Intrinsics.gEmmrt("");
            iht = null;
        }
        C27521jwk c27521jwk = iht.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c27521jwk, "");
        c27521jwk.setVisibility(z ^ true ? 0 : 8);
        iHT iht2 = this.AhwBna;
        if (iht2 == null) {
            Intrinsics.gEmmrt("");
            iht2 = null;
        }
        C27443jvL c27443jvL = iht2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c27443jvL, "");
        c27443jvL.setVisibility(z ? 0 : 8);
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
        TransactionConfig transactionConfigValueOf = valueOf();
        abstractC24170iXmFetchVPNInfo.KWHzl(transactionConfigValueOf.AEQbTJ((33554427 & 1) != 0 ? transactionConfigValueOf.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigValueOf.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfigValueOf.values : 0L, (33554427 & 8) != 0 ? transactionConfigValueOf.AkhnZx : z ? true : valueOf().AwvSrB(), (33554427 & 16) != 0 ? transactionConfigValueOf.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigValueOf.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigValueOf.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigValueOf.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigValueOf.valueOf : null, (33554427 & 512) != 0 ? transactionConfigValueOf.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigValueOf.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfigValueOf.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigValueOf.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigValueOf.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigValueOf.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigValueOf.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigValueOf.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigValueOf.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigValueOf.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigValueOf.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigValueOf.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigValueOf.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigValueOf.fetchVPNInfo : z, (33554427 & 8388608) != 0 ? transactionConfigValueOf.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigValueOf.ejfBZ : null));
        iHT iht3 = this.AhwBna;
        if (iht3 == null) {
            Intrinsics.gEmmrt("");
            iht3 = null;
        }
        android.widget.TextView textView = iht3.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        KWHzl(textView, z);
        AbstractC24170iXm.fetchInitialInfo$default(fetchVPNInfo(), null, 1, null);
    }

    @Override // o.InterfaceC27531jwu
    public void AEQbTJ() {
        C24114iVk.Application application = C24114iVk.Companion;
        java.lang.String string = getString(C25493ixk.FragmentManager.fHqPtx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C25493ixk.FragmentManager.WS);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        application.EZpvd(string, string2).show(getChildFragmentManager(), C24114iVk.class.getName());
    }

    @Override // o.C27446jvO.TaskDescription
    public void KWHzl() {
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        if ((ixcAEQbTJ != null ? ixcAEQbTJ.DbNXlk() : null) == TransactionStage.CONFIRMATION) {
            iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
            if (value == null) {
                value = new iXB("", null, null, null, null, null, 0L, null, 0, false, false, false, 4092, null);
            }
            iXB ixb = value;
            fetchVPNInfo().copydefault(ixb.KWHzl((4091 & 1) != 0 ? ixb.copydefault : null, (4091 & 2) != 0 ? ixb.valueOf : null, (4091 & 4) != 0 ? ixb.AkhnZx : TransactionStage.RECEIVE_INFO_TIME_OUT, (4091 & 8) != 0 ? ixb.OLrzqt : null, (4091 & 16) != 0 ? ixb.AYXKKw : null, (4091 & 32) != 0 ? ixb.gEmmrt : null, (4091 & 64) != 0 ? ixb.fetchVPNInfo : java.lang.System.currentTimeMillis(), (4091 & 128) != 0 ? ixb.djBIcL : null, (4091 & 256) != 0 ? ixb.AEQbTJ : 0, (4091 & 512) != 0 ? ixb.AhwBna : false, (4091 & 1024) != 0 ? ixb.KWHzl : false, (4091 & 2048) != 0 ? ixb.EZpvd : false));
        }
    }
}
