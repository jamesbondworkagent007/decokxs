package com.okinc.business.defi.wallet.walletaddressbinding;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C10337bmZ;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8107awW;
import o.gJK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBindViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final SharedFlow<gJK> AEQbTJ;
    public final CoroutineDispatcher AhwBna;
    public final InterfaceC8107awW EZpvd;
    public final MutableSharedFlow<gJK> KWHzl;
    public boolean OLrzqt;
    public final SavedStateHandle djBIcL;
    public final C12827cuN gEmmrt;
    public final C10337bmZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<gJK> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public WalletAddressBindViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C12827cuN c12827cuN, InterfaceC8107awW interfaceC8107awW, @NotNull C10337bmZ c10337bmZ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10337bmZ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = savedStateHandle;
        this.gEmmrt = c12827cuN;
        this.EZpvd = interfaceC8107awW;
        this.valueOf = c10337bmZ;
        this.AhwBna = coroutineDispatcher;
        MutableSharedFlow<gJK> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final int EZpvd() {
        Integer num = (Integer) this.djBIcL.get("ARG_WITHDRAW_LIMIT");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String AEQbTJ() {
        return (String) this.djBIcL.get("wallet_address");
    }

    public final String OLrzqt() {
        return (String) this.djBIcL.get("chain_id");
    }

    public static /* synthetic */ Job startBindWalletProcess$default(WalletAddressBindViewModel walletAddressBindViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return walletAddressBindViewModel.copydefault(str);
    }

    public final Job copydefault(String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletAddressBindViewModel$startBindWalletProcess$1(this, str, null), 3, null);
    }

    public static /* synthetic */ Object handleBindWalletPreCheckResult$default(WalletAddressBindViewModel walletAddressBindViewModel, BindWalletPreCheckResult bindWalletPreCheckResult, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return walletAddressBindViewModel.AEQbTJ(bindWalletPreCheckResult, str, continuation);
    }

    public final Object AEQbTJ(BindWalletPreCheckResult bindWalletPreCheckResult, String str, Continuation<? super Unit> continuation) {
        if ((bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedAddWallet) || Intrinsics.EZpvd(bindWalletPreCheckResult, BindWalletPreCheckResult.Success.INSTANCE)) {
            Object objWithContext = BuildersKt.withContext(this.AhwBna, new WalletAddressBindViewModel$handleBindWalletPreCheckResult$2(this, str, null), continuation);
            return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
        }
        if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedKYC) {
            Object objEmit = this.KWHzl.emit(gJK.ActionBar.AEQbTJ, continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedLogin) {
            Object objEmit2 = this.KWHzl.emit(gJK.Activity.AEQbTJ, continuation);
            return objEmit2 == C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
        }
        if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedSwitchMainAccount) {
            Object objEmit3 = this.KWHzl.emit(gJK.FragmentManager.copydefault, continuation);
            return objEmit3 == C56442yFn.copydefault() ? objEmit3 : Unit.INSTANCE;
        }
        if (!(bindWalletPreCheckResult instanceof BindWalletPreCheckResult.ReachedMaxAccLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objEmit4 = this.KWHzl.emit(new gJK.LoaderManager(((BindWalletPreCheckResult.ReachedMaxAccLimit) bindWalletPreCheckResult).getMaxCapacity()), continuation);
        return objEmit4 == C56442yFn.copydefault() ? objEmit4 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull String str, @NotNull Continuation<? super Result<String>> continuation) throws Throwable {
        WalletAddressBindViewModel$getWalletAddress$1 walletAddressBindViewModel$getWalletAddress$1;
        if (continuation instanceof WalletAddressBindViewModel$getWalletAddress$1) {
            walletAddressBindViewModel$getWalletAddress$1 = (WalletAddressBindViewModel$getWalletAddress$1) continuation;
            int i = walletAddressBindViewModel$getWalletAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAddressBindViewModel$getWalletAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAddressBindViewModel$getWalletAddress$1 = new WalletAddressBindViewModel$getWalletAddress$1(this, continuation);
            }
        }
        Object objWithContext = walletAddressBindViewModel$getWalletAddress$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletAddressBindViewModel$getWalletAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AhwBna;
            WalletAddressBindViewModel$getWalletAddress$2 walletAddressBindViewModel$getWalletAddress$2 = new WalletAddressBindViewModel$getWalletAddress$2(this, str, null);
            walletAddressBindViewModel$getWalletAddress$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletAddressBindViewModel$getWalletAddress$2, walletAddressBindViewModel$getWalletAddress$1);
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
}
