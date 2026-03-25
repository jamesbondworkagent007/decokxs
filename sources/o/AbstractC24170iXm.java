package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$3;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$changeCurrentContentStage$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$checkActionMenu$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$checkShouldShowReminderDialog$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$emitError$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$emitInputErrorState$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$emitInputLoadingState$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$fetchInitialInfo$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$onUserInputChange$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$refreshDataThenSettleTransaction$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$reloadCTAButtonState$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$reloadContent$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$settleTransaction$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$toggleTransactionMethod$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC24173iXp;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.InterfaceC26764jiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24170iXm extends ViewModel implements InterfaceC27096joj {
    public final MutableStateFlow<InterfaceC26764jiV> AEQbTJ;
    public final MutableSharedFlow<iXD> AYXKKw;
    public final MutableStateFlow<iXB> AhwBna;
    public final iXG AkhnZx;
    public final StateFlow<InterfaceC24182iXy> AuCTel;
    public final C26695jhF AuCTelauCTel;
    public final SharedFlow<iXD> AubY;
    public final iXE DbNXlk;
    public final MutableStateFlow<InterfaceC24173iXp> EZpvd;
    public final MutableStateFlow<InitialInfoModel> KWHzl;
    public final MutableSharedFlow<java.lang.String> OLrzqt;
    public final MutableStateFlow<InterfaceC24182iXy> copydefault;
    public MutableLiveData<InvestConsumeData<java.lang.Boolean>> djBIcL;
    public final iXN ejfBZ;
    public final CoroutineDispatcher fARcdN;
    public final CoroutineScope fIwbmz;
    public final StateFlow<InterfaceC26764jiV> fJNWhG;
    public MutableLiveData<InvestGasPriceConfig> fetchVPNInfo;
    public final MutableStateFlow<C25481ixY> gEmmrt;
    public final InterfaceC24171iXn getFieldNames;
    public final StateFlow<C25481ixY> getNewProxyInstance;
    public final SharedFlow<java.lang.String> hDKMBd;
    public final iXH isConnected;
    public final InterfaceC23639iDv iwGUEr;
    public TransactionConfig uzCIH;
    public final StateFlow<InterfaceC24173iXp> valueOf;
    public final StateFlow<InitialInfoModel> values;
    public final StateFlow<iXB> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iXB AEQbTJ(@NotNull InitialInfoModel initialInfoModel) {
        Intrinsics.checkNotNullParameter(initialInfoModel, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26764jiV> AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24182iXy> AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<iXD> AkhnZx() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        this.uzCIH = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestGasPriceConfig> OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestConsumeData<java.lang.Boolean>> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iXB> fetchVPNInfo() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InitialInfoModel> gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C25481ixY> isConnected() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> valueOf() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionConfig values() {
        return this.uzCIH;
    }

    public AbstractC24170iXm(@NotNull TransactionConfig transactionConfig, @NotNull iXG ixg, @NotNull iXE ixe, @NotNull iXN ixn, @NotNull iXH ixh, @NotNull InterfaceC24171iXn interfaceC24171iXn, @NotNull InterfaceC23639iDv interfaceC23639iDv, @NotNull C26695jhF c26695jhF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(ixg, "");
        Intrinsics.checkNotNullParameter(ixe, "");
        Intrinsics.checkNotNullParameter(ixn, "");
        Intrinsics.checkNotNullParameter(ixh, "");
        Intrinsics.checkNotNullParameter(interfaceC24171iXn, "");
        Intrinsics.checkNotNullParameter(interfaceC23639iDv, "");
        Intrinsics.checkNotNullParameter(c26695jhF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.uzCIH = transactionConfig;
        this.AkhnZx = ixg;
        this.DbNXlk = ixe;
        this.ejfBZ = ixn;
        this.isConnected = ixh;
        this.getFieldNames = interfaceC24171iXn;
        this.iwGUEr = interfaceC23639iDv;
        this.AuCTelauCTel = c26695jhF;
        this.fARcdN = coroutineDispatcher;
        this.djBIcL = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        MutableStateFlow<InitialInfoModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC24182iXy> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC24182iXy.ActionBar.copydefault);
        this.copydefault = MutableStateFlow2;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.AubY = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<iXB> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = MutableStateFlow3;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C25481ixY> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C25481ixY("", "", false, false, false, false, false, false, null, 0, null, 1532, null));
        this.gEmmrt = MutableStateFlow4;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.EZpvd = MutableStateFlow5;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow5);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.fIwbmz = CoroutineScope;
        MutableStateFlow<InterfaceC26764jiV> MutableStateFlow6 = StateFlowKt.MutableStateFlow(InterfaceC26764jiV.Application.OLrzqt);
        this.AEQbTJ = MutableStateFlow6;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow6);
        MutableSharedFlow<java.lang.String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.hDKMBd = mutableSharedFlowMutableSharedFlow$default2;
        C27493jwI.safeLaunch$default(CoroutineScope, null, null, new BaseTransactionViewModel$1(this, null), 3, null);
        C27493jwI.safeLaunch$default(CoroutineScope, null, null, new BaseTransactionViewModel$2(this, null), 3, null);
        C27493jwI.safeLaunch$default(CoroutineScope, null, null, new BaseTransactionViewModel$3(this, null), 3, null);
        fetchInitialInfo$default(this, null, 1, null);
    }

    @Override // o.InterfaceC27096joj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames.EZpvd(str, z);
    }

    @Override // o.InterfaceC27096joj
    public void fARcdN() {
        InvestSlippageConfig investSlippage;
        InterfaceC24171iXn interfaceC24171iXn = this.getFieldNames;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(this.uzCIH.copydefault()));
        InvestGasPriceConfig value = OLrzqt().getValue();
        interfaceC24171iXn.OLrzqt(strGEmmrt, (value == null || (investSlippage = value.getInvestSlippage()) == null) ? null : java.lang.Integer.valueOf(investSlippage.getType()));
    }

    @Override // o.InterfaceC27096joj
    public kotlin.Pair<java.lang.String, java.lang.Boolean> djBIcL() {
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.AuCTel.getValue());
        if ((ixcAEQbTJ != null ? ixcAEQbTJ.AhwBna() : null) != null) {
            iXB value = this.zsXlph.getValue();
            java.lang.String strAEQbTJ = value != null ? value.AEQbTJ() : null;
            if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                this.getFieldNames.copydefault();
            }
            return this.getFieldNames.copydefault(C33129mqd.gEmmrt(java.lang.Long.valueOf(this.uzCIH.copydefault())), ixcAEQbTJ.AhwBna());
        }
        return new kotlin.Pair<>(null, null);
    }

    public final InvestTradeManager.TransactionResultExtraData DbNXlk() {
        return this.ejfBZ.copydefault();
    }

    public final TransactionStage KWHzl() {
        TransactionStage transactionStageAhwBna;
        iXB value = this.zsXlph.getValue();
        return (value == null || (transactionStageAhwBna = value.AhwBna()) == null) ? TransactionStage.INPUT : transactionStageAhwBna;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        CoroutineScopeKt.cancel$default(this.fIwbmz, null, 1, null);
        super.onCleared();
    }

    public final void copydefault(@NotNull iXB ixb) {
        Intrinsics.checkNotNullParameter(ixb, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseTransactionViewModel$onUserInputChange$1(this, ixb, null), 3, null);
    }

    public final void fJNWhG() {
        C27493jwI.safeLaunch$default(this.fIwbmz, null, null, new BaseTransactionViewModel$refreshDataThenSettleTransaction$1(this.KWHzl.getValue(), this, this.AhwBna.getValue(), null), 3, null);
    }

    public static /* synthetic */ void settleTransaction$default(AbstractC24170iXm abstractC24170iXm, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: settleTransaction");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC24170iXm.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        C27493jwI.safeLaunch$default(this.fIwbmz, null, null, new BaseTransactionViewModel$settleTransaction$1(this, z, null), 3, null);
    }

    public final java.lang.String EZpvd(java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3) {
        if (!z) {
            return z2 ? C33129mqd.divS$default(str3, "100", null, null, null, 14, null) : str;
        }
        if (str2 == null) {
            str2 = "";
        }
        return C33129mqd.KWHzl(C33129mqd.divS$default(str2, "100", null, null, null, 14, null), str);
    }

    public final void OLrzqt(@NotNull TransactionMethod transactionMethod) {
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        TransactionConfig transactionConfig = this.uzCIH;
        TransactionConfig transactionConfigAEQbTJ = transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : transactionMethod == TransactionMethod.SINGLE, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : null, (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null);
        C27493jwI.safeLaunch$default(this.fIwbmz, null, null, new BaseTransactionViewModel$toggleTransactionMethod$1(this, this.uzCIH.wlaJM() ? "sp_invest_pool_subscribe_select" : "sp_invest_pool_redeem_select", transactionMethod, null), 3, null);
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.copydefault.getValue());
        AEQbTJ(ixcAEQbTJ != null ? ixcAEQbTJ.DbNXlk() : null, TransactionStage.INPUT);
        AEQbTJ(transactionConfigAEQbTJ);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iXB.copy$default(o.iXB, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, java.lang.String, com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, long, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, int, boolean, boolean, boolean, int, java.lang.Object):o.iXB */
    private final void AEQbTJ(TransactionConfig transactionConfig) {
        iXB ixb;
        this.uzCIH = transactionConfig;
        fetchInitialInfo$default(this, null, 1, null);
        iXB value = this.AhwBna.getValue();
        if ((value != null ? value.AhwBna() : null) == TransactionStage.CONFIRMATION) {
            iXB value2 = this.AhwBna.getValue();
            if (value2 == null || (ixb = value2.KWHzl((4091 & 1) != 0 ? value2.copydefault : null, (4091 & 2) != 0 ? value2.valueOf : null, (4091 & 4) != 0 ? value2.AkhnZx : TransactionStage.INPUT, (4091 & 8) != 0 ? value2.OLrzqt : null, (4091 & 16) != 0 ? value2.AYXKKw : null, (4091 & 32) != 0 ? value2.gEmmrt : null, (4091 & 64) != 0 ? value2.fetchVPNInfo : 0L, (4091 & 128) != 0 ? value2.djBIcL : null, (4091 & 256) != 0 ? value2.AEQbTJ : 0, (4091 & 512) != 0 ? value2.AhwBna : false, (4091 & 1024) != 0 ? value2.KWHzl : false, (4091 & 2048) != 0 ? value2.EZpvd : false)) == null) {
                ixb = new iXB(null, null, TransactionStage.INPUT, null, null, null, 0L, null, 0, false, false, false, 4089, null);
            }
            copydefault(ixb);
        }
    }

    public static /* synthetic */ void fetchInitialInfo$default(AbstractC24170iXm abstractC24170iXm, InvestInputData investInputData, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchInitialInfo");
        }
        if ((i & 1) != 0) {
            investInputData = null;
        }
        abstractC24170iXm.OLrzqt(investInputData);
    }

    public final void OLrzqt(InvestInputData investInputData) {
        C27493jwI.safeLaunch$default(this.fIwbmz, null, null, new BaseTransactionViewModel$fetchInitialInfo$1(this, investInputData, null), 3, null);
    }

    public final void OLrzqt(InitialInfoModel initialInfoModel, TransactionConfig transactionConfig) {
        C27493jwI.safeLaunch$default(this.fIwbmz, null, null, new BaseTransactionViewModel$checkActionMenu$1(this, initialInfoModel, transactionConfig, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.iXm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object reloadContent$default(AbstractC24170iXm abstractC24170iXm, InitialInfoModel initialInfoModel, iXB ixb, Function0 function0, Function2 function2, Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return abstractC24170iXm.copydefault(initialInfoModel, ixb, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function2, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadContent");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull InitialInfoModel initialInfoModel, iXB ixb, Function0<Unit> function0, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BaseTransactionViewModel$reloadContent$1 baseTransactionViewModel$reloadContent$1;
        InterfaceC24178iXu interfaceC24178iXu;
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function22;
        java.lang.Object objCopydefault;
        InterfaceC24178iXu.SharedElementCallback sharedElementCallback;
        Function0<Unit> function02;
        AbstractC24170iXm abstractC24170iXm;
        java.util.List<InterfaceC24178iXu> listAuCTel;
        java.lang.Object next;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function23;
        C24177iXt c24177iXtKWHzl;
        java.util.List<InterfaceC24178iXu> listAuCTel2;
        java.util.List<InterfaceC24178iXu> listAuCTel3;
        if (continuation instanceof BaseTransactionViewModel$reloadContent$1) {
            baseTransactionViewModel$reloadContent$1 = (BaseTransactionViewModel$reloadContent$1) continuation;
            int i = baseTransactionViewModel$reloadContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTransactionViewModel$reloadContent$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTransactionViewModel$reloadContent$1 = new BaseTransactionViewModel$reloadContent$1(this, continuation);
            }
        }
        java.lang.Object obj = baseTransactionViewModel$reloadContent$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = baseTransactionViewModel$reloadContent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.copydefault.getValue());
            TransactionStage transactionStageDbNXlk = ixcAEQbTJ != null ? ixcAEQbTJ.DbNXlk() : null;
            if (ixcAEQbTJ == null || !ixcAEQbTJ.fJNWhG()) {
                AEQbTJ(transactionStageDbNXlk, ixb != null ? ixb.AhwBna() : null);
            }
            if (ixcAEQbTJ == null || (listAuCTel = ixcAEQbTJ.AuCTel()) == null) {
                interfaceC24178iXu = null;
            } else {
                java.util.Iterator<T> it = listAuCTel.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((InterfaceC24178iXu) next) instanceof InterfaceC24178iXu.SharedElementCallback) {
                        break;
                    }
                }
                interfaceC24178iXu = (InterfaceC24178iXu) next;
            }
            InterfaceC24178iXu.SharedElementCallback sharedElementCallback2 = interfaceC24178iXu instanceof InterfaceC24178iXu.SharedElementCallback ? (InterfaceC24178iXu.SharedElementCallback) interfaceC24178iXu : null;
            iXE ixe = this.DbNXlk;
            TransactionConfig transactionConfig = this.uzCIH;
            baseTransactionViewModel$reloadContent$1.L$0 = this;
            baseTransactionViewModel$reloadContent$1.L$1 = function0;
            function22 = function2;
            baseTransactionViewModel$reloadContent$1.L$2 = function22;
            baseTransactionViewModel$reloadContent$1.L$3 = sharedElementCallback2;
            baseTransactionViewModel$reloadContent$1.label = 1;
            objCopydefault = ixe.copydefault(transactionConfig, initialInfoModel, ixb, baseTransactionViewModel$reloadContent$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            sharedElementCallback = sharedElementCallback2;
            function02 = function0;
            abstractC24170iXm = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                thM7380exceptionOrNullimpl = (java.lang.Throwable) baseTransactionViewModel$reloadContent$1.L$2;
                function23 = (Function2) baseTransactionViewModel$reloadContent$1.L$0;
                C56391yDq.AEQbTJ(obj);
                if (function23 != null) {
                    function23.invoke(C56443yFo.KWHzl(false), thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            sharedElementCallback = (InterfaceC24178iXu.SharedElementCallback) baseTransactionViewModel$reloadContent$1.L$3;
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function24 = (Function2) baseTransactionViewModel$reloadContent$1.L$2;
            function02 = (Function0) baseTransactionViewModel$reloadContent$1.L$1;
            abstractC24170iXm = (AbstractC24170iXm) baseTransactionViewModel$reloadContent$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            function22 = function24;
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            InterfaceC24182iXy activity = (InterfaceC24182iXy) objCopydefault;
            if (sharedElementCallback != null && (sharedElementCallback.AhwBna() || sharedElementCallback.gEmmrt())) {
                iXC ixcAEQbTJ2 = C24181iXx.AEQbTJ(activity);
                if (ixcAEQbTJ2 == null || (listAuCTel3 = ixcAEQbTJ2.AuCTel()) == null) {
                    listAuCTel2 = ixcAEQbTJ2 != null ? ixcAEQbTJ2.AuCTel() : null;
                } else {
                    listAuCTel2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(listAuCTel3, 10));
                    for (InterfaceC24178iXu interfaceC24178iXuKWHzl : listAuCTel3) {
                        if (interfaceC24178iXuKWHzl instanceof InterfaceC24178iXu.SharedElementCallback) {
                            InterfaceC24178iXu.SharedElementCallback sharedElementCallback3 = (InterfaceC24178iXu.SharedElementCallback) interfaceC24178iXuKWHzl;
                            interfaceC24178iXuKWHzl = sharedElementCallback3.KWHzl((256 & 1) != 0 ? sharedElementCallback3.AhwBna : sharedElementCallback3.AEQbTJ(), (256 & 2) != 0 ? sharedElementCallback3.djBIcL : sharedElementCallback.valueOf(), (256 & 4) != 0 ? sharedElementCallback3.AYXKKw : sharedElementCallback.KWHzl(), (256 & 8) != 0 ? sharedElementCallback3.EZpvd : sharedElementCallback.copydefault(), (256 & 16) != 0 ? sharedElementCallback3.OLrzqt : sharedElementCallback.OLrzqt(), (256 & 32) != 0 ? sharedElementCallback3.KWHzl : sharedElementCallback.AhwBna(), (256 & 64) != 0 ? sharedElementCallback3.copydefault : sharedElementCallback.gEmmrt(), (256 & 128) != 0 ? sharedElementCallback3.gEmmrt : sharedElementCallback3.djBIcL(), (256 & 256) != 0 ? sharedElementCallback3.AEQbTJ : null);
                        }
                        listAuCTel2.add(interfaceC24178iXuKWHzl);
                    }
                }
                if (ixcAEQbTJ2 != null) {
                    iXC ixcKWHzl = ixcAEQbTJ2.KWHzl((16777087 & 1) != 0 ? ixcAEQbTJ2.AkhnZx : false, (16777087 & 2) != 0 ? ixcAEQbTJ2.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcAEQbTJ2.valueOf : null, (16777087 & 8) != 0 ? ixcAEQbTJ2.values : 0L, (16777087 & 16) != 0 ? ixcAEQbTJ2.djBIcL : 0, (16777087 & 32) != 0 ? ixcAEQbTJ2.EZpvd : 0L, (16777087 & 64) != 0 ? ixcAEQbTJ2.DbNXlk : 0, (16777087 & 128) != 0 ? ixcAEQbTJ2.fARcdN : null, (16777087 & 256) != 0 ? ixcAEQbTJ2.fIwbmz : null, (16777087 & 512) != 0 ? ixcAEQbTJ2.KWHzl : null, (16777087 & 1024) != 0 ? ixcAEQbTJ2.gEmmrt : null, (16777087 & 2048) != 0 ? ixcAEQbTJ2.AYXKKw : null, (16777087 & 4096) != 0 ? ixcAEQbTJ2.iwGUEr : listAuCTel2 == null ? yDY.AhwBna() : listAuCTel2, (16777087 & 8192) != 0 ? ixcAEQbTJ2.OLrzqt : null, (16777087 & 16384) != 0 ? ixcAEQbTJ2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcAEQbTJ2.getFieldNames : null, (16777087 & 65536) != 0 ? ixcAEQbTJ2.ejfBZ : null, (16777087 & 131072) != 0 ? ixcAEQbTJ2.isConnected : false, (16777087 & 262144) != 0 ? ixcAEQbTJ2.uzCIH : null, (16777087 & 524288) != 0 ? ixcAEQbTJ2.AhwBna : null, (16777087 & 1048576) != 0 ? ixcAEQbTJ2.copydefault : null, (16777087 & 2097152) != 0 ? ixcAEQbTJ2.AuCTel : null, (16777087 & 4194304) != 0 ? ixcAEQbTJ2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcAEQbTJ2.AEQbTJ : 0);
                    if (ixcKWHzl != null) {
                        activity = new InterfaceC24182iXy.Activity(ixcKWHzl);
                    }
                }
            }
            abstractC24170iXm.copydefault.setValue(activity);
            iXC ixcAEQbTJ3 = C24181iXx.AEQbTJ(activity);
            if (ixcAEQbTJ3 == null || (c24177iXtKWHzl = ixcAEQbTJ3.KWHzl()) == null || !c24177iXtKWHzl.djBIcL()) {
                if (function02 != null) {
                    abstractC24170iXm.OLrzqt(ixcAEQbTJ3);
                }
            } else if (function02 != null) {
                function02.invoke();
            }
            if (function22 != null) {
                function22.invoke(C56443yFo.KWHzl(true), null);
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            iXC ixcAEQbTJ4 = C24181iXx.AEQbTJ(abstractC24170iXm.copydefault.getValue());
            if (ixcAEQbTJ4 != null) {
                MutableStateFlow<InterfaceC24182iXy> mutableStateFlow = abstractC24170iXm.copydefault;
                InterfaceC24182iXy.Activity activity2 = new InterfaceC24182iXy.Activity(ixcAEQbTJ4.KWHzl((16777087 & 1) != 0 ? ixcAEQbTJ4.AkhnZx : false, (16777087 & 2) != 0 ? ixcAEQbTJ4.fetchVPNInfo : true, (16777087 & 4) != 0 ? ixcAEQbTJ4.valueOf : thM7380exceptionOrNullimpl, (16777087 & 8) != 0 ? ixcAEQbTJ4.values : 0L, (16777087 & 16) != 0 ? ixcAEQbTJ4.djBIcL : 0, (16777087 & 32) != 0 ? ixcAEQbTJ4.EZpvd : 0L, (16777087 & 64) != 0 ? ixcAEQbTJ4.DbNXlk : 0, (16777087 & 128) != 0 ? ixcAEQbTJ4.fARcdN : null, (16777087 & 256) != 0 ? ixcAEQbTJ4.fIwbmz : null, (16777087 & 512) != 0 ? ixcAEQbTJ4.KWHzl : null, (16777087 & 1024) != 0 ? ixcAEQbTJ4.gEmmrt : null, (16777087 & 2048) != 0 ? ixcAEQbTJ4.AYXKKw : null, (16777087 & 4096) != 0 ? ixcAEQbTJ4.iwGUEr : null, (16777087 & 8192) != 0 ? ixcAEQbTJ4.OLrzqt : null, (16777087 & 16384) != 0 ? ixcAEQbTJ4.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcAEQbTJ4.getFieldNames : null, (16777087 & 65536) != 0 ? ixcAEQbTJ4.ejfBZ : null, (16777087 & 131072) != 0 ? ixcAEQbTJ4.isConnected : false, (16777087 & 262144) != 0 ? ixcAEQbTJ4.uzCIH : null, (16777087 & 524288) != 0 ? ixcAEQbTJ4.AhwBna : null, (16777087 & 1048576) != 0 ? ixcAEQbTJ4.copydefault : null, (16777087 & 2097152) != 0 ? ixcAEQbTJ4.AuCTel : null, (16777087 & 4194304) != 0 ? ixcAEQbTJ4.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcAEQbTJ4.AEQbTJ : 0));
                baseTransactionViewModel$reloadContent$1.L$0 = null;
                baseTransactionViewModel$reloadContent$1.L$1 = null;
                baseTransactionViewModel$reloadContent$1.L$2 = null;
                baseTransactionViewModel$reloadContent$1.L$3 = null;
                baseTransactionViewModel$reloadContent$1.label = 2;
                if (mutableStateFlow.emit(activity2, baseTransactionViewModel$reloadContent$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            MutableStateFlow<InterfaceC24182iXy> mutableStateFlow2 = abstractC24170iXm.copydefault;
            InterfaceC24182iXy.TaskDescription taskDescription = new InterfaceC24182iXy.TaskDescription(thM7380exceptionOrNullimpl);
            baseTransactionViewModel$reloadContent$1.L$0 = function22;
            baseTransactionViewModel$reloadContent$1.L$1 = objCopydefault;
            baseTransactionViewModel$reloadContent$1.L$2 = thM7380exceptionOrNullimpl;
            baseTransactionViewModel$reloadContent$1.L$3 = null;
            baseTransactionViewModel$reloadContent$1.label = 3;
            if (mutableStateFlow2.emit(taskDescription, baseTransactionViewModel$reloadContent$1) == objCopydefault2) {
                return objCopydefault2;
            }
            function23 = function22;
            if (function23 != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(C24177iXt c24177iXt, java.util.List<TransactionStep> list, TransactionStage transactionStage, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BaseTransactionViewModel$reloadCTAButtonState$1 baseTransactionViewModel$reloadCTAButtonState$1;
        java.lang.Object objEZpvd;
        AbstractC24170iXm abstractC24170iXm;
        if (continuation instanceof BaseTransactionViewModel$reloadCTAButtonState$1) {
            baseTransactionViewModel$reloadCTAButtonState$1 = (BaseTransactionViewModel$reloadCTAButtonState$1) continuation;
            int i = baseTransactionViewModel$reloadCTAButtonState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTransactionViewModel$reloadCTAButtonState$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTransactionViewModel$reloadCTAButtonState$1 = new BaseTransactionViewModel$reloadCTAButtonState$1(this, continuation);
            }
        }
        java.lang.Object obj = baseTransactionViewModel$reloadCTAButtonState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseTransactionViewModel$reloadCTAButtonState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iXH ixh = this.isConnected;
            baseTransactionViewModel$reloadCTAButtonState$1.L$0 = this;
            baseTransactionViewModel$reloadCTAButtonState$1.label = 1;
            objEZpvd = ixh.EZpvd(transactionStage, list, c24177iXt, baseTransactionViewModel$reloadCTAButtonState$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            abstractC24170iXm = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                objEZpvd = baseTransactionViewModel$reloadCTAButtonState$1.L$1;
                abstractC24170iXm = (AbstractC24170iXm) baseTransactionViewModel$reloadCTAButtonState$1.L$0;
                C56391yDq.AEQbTJ(obj);
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    MutableStateFlow<InterfaceC24173iXp> mutableStateFlow = abstractC24170iXm.EZpvd;
                    InterfaceC24173iXp.ActionBar actionBar = new InterfaceC24173iXp.ActionBar(iCP.KWHzl());
                    baseTransactionViewModel$reloadCTAButtonState$1.L$0 = objEZpvd;
                    baseTransactionViewModel$reloadCTAButtonState$1.L$1 = null;
                    baseTransactionViewModel$reloadCTAButtonState$1.label = 3;
                    if (mutableStateFlow.emit(actionBar, baseTransactionViewModel$reloadCTAButtonState$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            AbstractC24170iXm abstractC24170iXm2 = (AbstractC24170iXm) baseTransactionViewModel$reloadCTAButtonState$1.L$0;
            C56391yDq.AEQbTJ(obj);
            abstractC24170iXm = abstractC24170iXm2;
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            MutableStateFlow<InterfaceC24173iXp> mutableStateFlow2 = abstractC24170iXm.EZpvd;
            baseTransactionViewModel$reloadCTAButtonState$1.L$0 = abstractC24170iXm;
            baseTransactionViewModel$reloadCTAButtonState$1.L$1 = objEZpvd;
            baseTransactionViewModel$reloadCTAButtonState$1.label = 2;
            if (mutableStateFlow2.emit((InterfaceC24173iXp) objEZpvd, baseTransactionViewModel$reloadCTAButtonState$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(iXC ixc) {
        if (ixc != null) {
            C27493jwI.safeLaunch$default(this.fIwbmz, null, null, new BaseTransactionViewModel$emitInputErrorState$1(this, ixc, null), 3, null);
        }
    }

    public final void AEQbTJ() {
        iXB value = this.AhwBna.getValue();
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.copydefault.getValue());
        if (ixcAEQbTJ != null) {
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseTransactionViewModel$emitInputLoadingState$1(ixcAEQbTJ, value, this, null), 3, null);
        }
    }

    public static /* synthetic */ void changeCurrentContentStage$default(AbstractC24170iXm abstractC24170iXm, TransactionStage transactionStage, iXC ixc, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeCurrentContentStage");
        }
        if ((i & 2) != 0) {
            ixc = null;
        }
        abstractC24170iXm.OLrzqt(transactionStage, ixc);
    }

    public final void OLrzqt(TransactionStage transactionStage, iXC ixc) {
        iXC ixcKWHzl;
        if (ixc == null) {
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.copydefault.getValue());
            ixcKWHzl = ixcAEQbTJ != null ? ixcAEQbTJ.KWHzl((16777087 & 1) != 0 ? ixcAEQbTJ.AkhnZx : false, (16777087 & 2) != 0 ? ixcAEQbTJ.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcAEQbTJ.valueOf : null, (16777087 & 8) != 0 ? ixcAEQbTJ.values : 0L, (16777087 & 16) != 0 ? ixcAEQbTJ.djBIcL : 0, (16777087 & 32) != 0 ? ixcAEQbTJ.EZpvd : 0L, (16777087 & 64) != 0 ? ixcAEQbTJ.DbNXlk : 0, (16777087 & 128) != 0 ? ixcAEQbTJ.fARcdN : transactionStage, (16777087 & 256) != 0 ? ixcAEQbTJ.fIwbmz : null, (16777087 & 512) != 0 ? ixcAEQbTJ.KWHzl : null, (16777087 & 1024) != 0 ? ixcAEQbTJ.gEmmrt : null, (16777087 & 2048) != 0 ? ixcAEQbTJ.AYXKKw : null, (16777087 & 4096) != 0 ? ixcAEQbTJ.iwGUEr : null, (16777087 & 8192) != 0 ? ixcAEQbTJ.OLrzqt : null, (16777087 & 16384) != 0 ? ixcAEQbTJ.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcAEQbTJ.getFieldNames : null, (16777087 & 65536) != 0 ? ixcAEQbTJ.ejfBZ : null, (16777087 & 131072) != 0 ? ixcAEQbTJ.isConnected : false, (16777087 & 262144) != 0 ? ixcAEQbTJ.uzCIH : null, (16777087 & 524288) != 0 ? ixcAEQbTJ.AhwBna : null, (16777087 & 1048576) != 0 ? ixcAEQbTJ.copydefault : null, (16777087 & 2097152) != 0 ? ixcAEQbTJ.AuCTel : null, (16777087 & 4194304) != 0 ? ixcAEQbTJ.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcAEQbTJ.AEQbTJ : 0) : null;
        } else {
            ixcKWHzl = ixc;
        }
        if (ixcKWHzl != null) {
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseTransactionViewModel$changeCurrentContentStage$1(this, ixcKWHzl, transactionStage, null), 3, null);
        }
    }

    public final void AEQbTJ(TransactionStage transactionStage, TransactionStage transactionStage2) {
        TransactionStage transactionStage3;
        TransactionStage transactionStage4;
        TransactionStage transactionStage5 = TransactionStage.INPUT;
        if (transactionStage == transactionStage5 && transactionStage2 == transactionStage5) {
            AEQbTJ();
            return;
        }
        if (transactionStage == transactionStage5 && transactionStage2 == (transactionStage4 = TransactionStage.CONFIRMATION)) {
            changeCurrentContentStage$default(this, transactionStage4, null, 2, null);
            return;
        }
        TransactionStage transactionStage6 = TransactionStage.CONFIRMATION;
        if (transactionStage == transactionStage6 && transactionStage2 == transactionStage5) {
            AEQbTJ();
            changeCurrentContentStage$default(this, transactionStage5, null, 2, null);
        } else if (transactionStage == transactionStage6 && transactionStage2 == (transactionStage3 = TransactionStage.RECEIVE_INFO_TIME_OUT)) {
            changeCurrentContentStage$default(this, transactionStage3, null, 2, null);
        } else if (transactionStage == TransactionStage.RECEIVE_INFO_TIME_OUT && transactionStage2 == transactionStage6) {
            changeCurrentContentStage$default(this, transactionStage6, null, 2, null);
        }
    }

    public static /* synthetic */ void emitError$default(AbstractC24170iXm abstractC24170iXm, iXD ixd, C24177iXt c24177iXt, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emitError");
        }
        if ((i & 2) != 0) {
            c24177iXt = null;
        }
        abstractC24170iXm.copydefault(ixd, c24177iXt);
    }

    public final void copydefault(@NotNull iXD ixd, C24177iXt c24177iXt) {
        Intrinsics.checkNotNullParameter(ixd, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseTransactionViewModel$emitError$1(this, ixd, c24177iXt, null), 3, null);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseTransactionViewModel$checkShouldShowReminderDialog$1(str, this, null), 3, null);
    }

    public final void EZpvd(InvestGasPriceConfig investGasPriceConfig) {
        if (investGasPriceConfig == null) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            OLrzqt().postValue(investGasPriceConfig);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
