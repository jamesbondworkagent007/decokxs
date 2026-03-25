package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemTransactionViewModel$1;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemTransactionViewModel$checkIsRedeemAllowed$1;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemTransactionViewModel$refreshTransactionData$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC24178iXu;
import o.InterfaceC26680jgr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26714jhY extends AbstractC24170iXm {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int wlaJM = 8;
    public static final java.util.Set<java.lang.Integer> zLjUOn = yEE.AhwBna(2, 0, 11, 38, 36, 5);
    public final CoroutineDispatcher AwvSrB;
    public final InterfaceC23693iFv AxsJAY;
    public final InterfaceC24171iXn DTwDnp;
    public boolean ORxRYg;
    public final C26695jhF OcIXYQ;
    public final TransactionConfig QKVWgx;
    public final C23597iCg QOLQEE;
    public final MutableLiveData<InterfaceC24178iXu.SharedElementCallback> QUSxYX;
    public final iXG gHZMYf;
    public final iXE sSMYrx;
    public final MutableStateFlow<java.lang.Boolean> zuBGHE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26714jhY(@NotNull TransactionConfig transactionConfig, @NotNull iXG ixg, @NotNull iXE ixe, @NotNull iXN ixn, @NotNull iXH ixh, @NotNull InterfaceC24171iXn interfaceC24171iXn, @NotNull C23597iCg c23597iCg, @NotNull InterfaceC23693iFv interfaceC23693iFv, @NotNull InterfaceC23639iDv interfaceC23639iDv, @NotNull C26695jhF c26695jhF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(transactionConfig, ixg, ixe, ixn, ixh, interfaceC24171iXn, interfaceC23639iDv, c26695jhF, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(ixg, "");
        Intrinsics.checkNotNullParameter(ixe, "");
        Intrinsics.checkNotNullParameter(ixn, "");
        Intrinsics.checkNotNullParameter(ixh, "");
        Intrinsics.checkNotNullParameter(interfaceC24171iXn, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(interfaceC23693iFv, "");
        Intrinsics.checkNotNullParameter(interfaceC23639iDv, "");
        Intrinsics.checkNotNullParameter(c26695jhF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.QKVWgx = transactionConfig;
        this.gHZMYf = ixg;
        this.sSMYrx = ixe;
        this.DTwDnp = interfaceC24171iXn;
        this.QOLQEE = c23597iCg;
        this.AxsJAY = interfaceC23693iFv;
        this.OcIXYQ = c26695jhF;
        this.AwvSrB = coroutineDispatcher;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RedeemTransactionViewModel$1(this, null), 3, null);
        this.zuBGHE = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.QUSxYX = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o.jhY$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jhY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean OLrzqt(java.lang.Integer num) {
            return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) C26714jhY.zLjUOn), num);
        }
    }

    public final void copydefault(boolean z) {
        this.zuBGHE.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // o.AbstractC24170iXm
    public iXB AEQbTJ(@NotNull InitialInfoModel initialInfoModel) {
        java.lang.String amount;
        InvestTokenWithAmount investTokenWithAmount;
        java.lang.String tokenAddress;
        java.util.List<InvestTokenWithAmount> listIwGUEr;
        Intrinsics.checkNotNullParameter(initialInfoModel, "");
        if (!this.QKVWgx.fetchVPNInfo() || this.ORxRYg) {
            return null;
        }
        this.ORxRYg = true;
        copydefault(true);
        InvestInputData investInputData = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(this.QKVWgx.valueOf());
        if (investInputData == null || (amount = investInputData.getAmount()) == null) {
            amount = "0";
        }
        java.lang.String str = amount;
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo = initialInfoModel instanceof InitialInfoModel.RedeemInitialInfo ? (InitialInfoModel.RedeemInitialInfo) initialInfoModel : null;
        if (redeemInitialInfo == null || (listIwGUEr = redeemInitialInfo.iwGUEr()) == null || (investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(listIwGUEr)) == null) {
            InvestInputData investInputData2 = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(this.QKVWgx.valueOf());
            investTokenWithAmount = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (investInputData2 == null || (tokenAddress = investInputData2.getTokenAddress()) == null) ? "" : tokenAddress, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268434943, (DefaultConstructorMarker) null);
        }
        InvestTokenWithAmount investTokenWithAmount2 = investTokenWithAmount;
        TransactionStage transactionStage = TransactionStage.CONFIRMATION;
        InvestInputData investInputData3 = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(this.QKVWgx.valueOf());
        return new iXB(str, null, transactionStage, null, null, null, 0L, investTokenWithAmount2, 0, false, investInputData3 != null ? investInputData3.getRedeemAll() : false, true, 888, null);
    }

    public final void KWHzl(@NotNull InterfaceC26680jgr interfaceC26680jgr) {
        Intrinsics.checkNotNullParameter(interfaceC26680jgr, "");
        iXB value = super.fetchVPNInfo().getValue();
        if (value == null) {
            value = new iXB("", null, null, null, null, null, 0L, null, 0, false, false, false, 4092, null);
        }
        iXB ixbKWHzl = value;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (interfaceC26680jgr instanceof InterfaceC26680jgr.Activity) {
            InterfaceC26680jgr.Activity activity = (InterfaceC26680jgr.Activity) interfaceC26680jgr;
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : activity.OLrzqt(), (4091 & 2) != 0 ? ixbKWHzl.valueOf : activity.KWHzl(), (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : activity.copydefault(), (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : null, (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : 0L, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : activity.EZpvd(), (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : false, (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : this.zuBGHE.getValue().booleanValue(), (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.StateListAnimator) {
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : null, (4091 & 2) != 0 ? ixbKWHzl.valueOf : null, (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : TransactionStage.CONFIRMATION, (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : null, (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : jCurrentTimeMillis, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : null, (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : false, (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : false, (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.Application) {
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : null, (4091 & 2) != 0 ? ixbKWHzl.valueOf : null, (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : TransactionStage.APPROVAL, (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : null, (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : jCurrentTimeMillis, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : null, (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : false, (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : false, (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.TaskDescription) {
            AuCTel();
            return;
        } else if ((interfaceC26680jgr instanceof InterfaceC26680jgr.Fragment) && ((InterfaceC26680jgr.Fragment) interfaceC26680jgr).EZpvd() == TransactionStage.RECEIVE_INFO_TIME_OUT) {
            ejfBZ();
            return;
        }
        super.copydefault(ixbKWHzl);
    }

    public final void ejfBZ() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RedeemTransactionViewModel$refreshTransactionData$1(this, null), 3, null);
    }

    public final void AuCTel() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RedeemTransactionViewModel$checkIsRedeemAllowed$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
        Intrinsics.checkNotNullParameter(sharedElementCallback, "");
        this.QUSxYX.setValue(sharedElementCallback);
    }
}
