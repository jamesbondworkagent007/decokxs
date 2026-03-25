package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import com.okinc.account.api.model.wallet.BoundWalletAccount;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.wallet.api.bean.WalletInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C12827cuN;
import o.C18877fqh;
import o.C19329fzI;
import o.C19332fzL;
import o.C19334fzN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54824xWr;
import o.InterfaceC8107awW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableSharedFlow<String> AYXKKw;
    public final MutableSharedFlow<String> AhwBna;
    public final MutableSharedFlow<BindWalletPreCheckResult> AkhnZx;
    public final StateFlow<List<C18877fqh>> AuCTel;
    public final StateFlow<Boolean> AuCTelauCTel;
    public final SharedFlow<String> AubY;
    public final SharedFlow<Unit> AwvSrB;
    public final SharedFlow<String> AxsJAY;
    public final SharedFlow<String> DTwDnp;
    public final MutableSharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final C19334fzN ORxRYg;
    public final SharedFlow<BindWalletPreCheckResult> OcIXYQ;
    public final SavedStateHandle QKVWgx;
    public boolean QOLQEE;
    public final WalletBindApiService QUSxYX;
    public final C19332fzL QbewEr;
    public final C12827cuN QfsBiF;
    public final MutableStateFlow<List<C18877fqh>> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final MutableSharedFlow<String> ejfBZ;
    public final InterfaceC54824xWr fARcdN;
    public final C19329fzI fIwbmz;
    public final InterfaceC8107awW fJNWhG;
    public final MutableSharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final SharedFlow<Pair<String, String>> gHZMYf;
    public final SharedFlow<Unit> getFieldNames;
    public final SharedFlow<Unit> getNewProxyInstance;
    public final SharedFlow<Unit> hDKMBd;
    public final MutableSharedFlow<Boolean> isConnected;
    public final SharedFlow<Unit> iwGUEr;
    public final SharedFlow<Unit> sSMYrx;
    public final SharedFlow<Unit> uzCIH;
    public final MutableSharedFlow<Unit> valueOf;
    public final MutableSharedFlow<Pair<String, String>> values;
    public boolean wlaJM;
    public final CoroutineDispatcher zLjUOn;
    public final SharedFlow<Unit> zsXlph;
    public final SharedFlow<Boolean> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AhwBna() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AkhnZx() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AuCTel() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> DbNXlk() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C18877fqh>> EZpvd() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.wlaJM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> ejfBZ() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<BindWalletPreCheckResult> fIwbmz() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> fetchVPNInfo() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<String, String>> isConnected() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> iwGUEr() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> values() {
        return this.AubY;
    }

    public static final class ActionBar implements Flow<Boolean> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindViewModel$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                WalletBindViewModel$special$$inlined$map$1$2$1 walletBindViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof WalletBindViewModel$special$$inlined$map$1$2$1) {
                    walletBindViewModel$special$$inlined$map$1$2$1 = (WalletBindViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = walletBindViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletBindViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletBindViewModel$special$$inlined$map$1$2$1 = new WalletBindViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = walletBindViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletBindViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    List list = (List) obj;
                    Boolean boolKWHzl = list != null ? C56443yFo.KWHzl(list.isEmpty()) : null;
                    walletBindViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, walletBindViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public WalletBindViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C12827cuN c12827cuN, @NotNull InterfaceC54824xWr interfaceC54824xWr, InterfaceC8107awW interfaceC8107awW, @NotNull WalletBindApiService walletBindApiService, @NotNull C19329fzI c19329fzI, @NotNull C19334fzN c19334fzN, @NotNull C19332fzL c19332fzL) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC54824xWr, "");
        Intrinsics.checkNotNullParameter(walletBindApiService, "");
        Intrinsics.checkNotNullParameter(c19329fzI, "");
        Intrinsics.checkNotNullParameter(c19334fzN, "");
        Intrinsics.checkNotNullParameter(c19332fzL, "");
        this.QKVWgx = savedStateHandle;
        this.zLjUOn = coroutineDispatcher;
        this.QfsBiF = c12827cuN;
        this.fARcdN = interfaceC54824xWr;
        this.fJNWhG = interfaceC8107awW;
        this.QUSxYX = walletBindApiService;
        this.fIwbmz = c19329fzI;
        this.ORxRYg = c19334fzN;
        this.QbewEr = c19332fzL;
        List<BoundWalletAccount> listOLrzqt = OLrzqt();
        this.QOLQEE = listOLrzqt == null || listOLrzqt.isEmpty();
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default3;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<BindWalletPreCheckResult> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AkhnZx = mutableSharedFlowMutableSharedFlow$default4;
        this.OcIXYQ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default5;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default6;
        this.zuBGHE = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default7;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default8;
        this.AxsJAY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default9;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default10;
        this.AwvSrB = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
        MutableStateFlow<List<C18877fqh>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default11;
        this.sSMYrx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default11);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default12;
        this.AubY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default12);
        MutableSharedFlow<Pair<String, String>> mutableSharedFlowMutableSharedFlow$default13 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.values = mutableSharedFlowMutableSharedFlow$default13;
        this.gHZMYf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default13);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default14 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.ejfBZ = mutableSharedFlowMutableSharedFlow$default14;
        this.DTwDnp = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default14);
        this.AuCTelauCTel = FlowKt.stateIn(new ActionBar(MutableStateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final BoundWalletAccountsResult copydefault() {
        return (BoundWalletAccountsResult) this.QKVWgx.get("BOUND_WALLET_RESULT");
    }

    public final List<BoundWalletAccount> OLrzqt() {
        BoundWalletAccountsResult boundWalletAccountsResultCopydefault = copydefault();
        if (boundWalletAccountsResultCopydefault != null) {
            return boundWalletAccountsResultCopydefault.getWalletAccounts();
        }
        return null;
    }

    public final int fJNWhG() {
        BoundWalletAccountsResult boundWalletAccountsResultCopydefault = copydefault();
        if (boundWalletAccountsResultCopydefault != null) {
            return boundWalletAccountsResultCopydefault.getWithdrawLimit();
        }
        return 0;
    }

    public final Job uzCIH() {
        return interLoadBoundWallets$default(this, null, 1, null);
    }

    public final void hDKMBd() {
        this.wlaJM = true;
        OLrzqt((Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new WalletBindViewModel$onBindWalletSuccess$1(this, null));
    }

    public final void getFieldNames() {
        this.wlaJM = true;
        OLrzqt((Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new WalletBindViewModel$onUnbindWalletSuccess$1(this, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job interLoadBoundWallets$default(WalletBindViewModel walletBindViewModel, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        return walletBindViewModel.OLrzqt((Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    public final Job OLrzqt(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$interLoadBoundWallets$1(this, function2, null), 3, null);
    }

    public final Job wlaJM() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$switchFromGuideToManage$1(this, null), 3, null);
    }

    public final Job getNewProxyInstance() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$onBindWalletButtonClick$1(this, null), 3, null);
    }

    public final Job AuCTelauCTel() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$openFaq$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super Result<? extends List<C18877fqh>>> continuation) throws Throwable {
        WalletBindViewModel$getBoundWallets$1 walletBindViewModel$getBoundWallets$1;
        if (continuation instanceof WalletBindViewModel$getBoundWallets$1) {
            walletBindViewModel$getBoundWallets$1 = (WalletBindViewModel$getBoundWallets$1) continuation;
            int i = walletBindViewModel$getBoundWallets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBindViewModel$getBoundWallets$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBindViewModel$getBoundWallets$1 = new WalletBindViewModel$getBoundWallets$1(this, continuation);
            }
        }
        Object objWithContext = walletBindViewModel$getBoundWallets$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBindViewModel$getBoundWallets$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.zLjUOn;
            WalletBindViewModel$getBoundWallets$2 walletBindViewModel$getBoundWallets$2 = new WalletBindViewModel$getBoundWallets$2(this, null);
            walletBindViewModel$getBoundWallets$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletBindViewModel$getBoundWallets$2, walletBindViewModel$getBoundWallets$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final Job KWHzl(@NotNull WalletInfo walletInfo) {
        Intrinsics.checkNotNullParameter(walletInfo, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$onBindWalletSelected$1(this, walletInfo, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str, @NotNull String str2, @NotNull Intention intention) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(intention, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$startCeFiBind$1(this, str, str2, intention, null), 3, null);
    }

    public final Job KWHzl(@NotNull String str, @NotNull String str2, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindViewModel$unbindCeFi$1(this, str, str2, fragmentManager, null), 3, null);
    }
}
