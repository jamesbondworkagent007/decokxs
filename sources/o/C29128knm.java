package o;

import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.position.domain.GetRecentTransactionsUseCase$invoke$1;
import com.okinc.business.market.features.position.domain.GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetRecentTransactionsUseCase$stopWs$1;
import com.okinc.business.market.features.position.domain.GetRecentTransactionsUseCase$subscribeWs$2;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29128knm {
    public final StateFlow<java.util.List<C29182kon>> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final MutableStateFlow<java.util.List<C29182kon>> KWHzl;
    public final C29137knv OLrzqt;
    public final InterfaceC29132knq copydefault;
    public final kKG gEmmrt;
    public final CoroutineScope valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C29182kon>> KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public C29128knm(@NotNull InterfaceC29132knq interfaceC29132knq, @NotNull kKG kkg, @NotNull C29137knv c29137knv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29132knq, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c29137knv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC29132knq;
        this.gEmmrt = kkg;
        this.OLrzqt = c29137knv;
        this.EZpvd = coroutineDispatcher;
        MutableStateFlow<java.util.List<C29182kon>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, boolean z, @NotNull PositionDetailsParam positionDetailsParam, @NotNull TxType txType, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<C29182kon>, java.lang.Boolean>>> continuation) throws java.lang.Throwable {
        GetRecentTransactionsUseCase$invoke$1 getRecentTransactionsUseCase$invoke$1;
        if (continuation instanceof GetRecentTransactionsUseCase$invoke$1) {
            getRecentTransactionsUseCase$invoke$1 = (GetRecentTransactionsUseCase$invoke$1) continuation;
            int i = getRecentTransactionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRecentTransactionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRecentTransactionsUseCase$invoke$1 = new GetRecentTransactionsUseCase$invoke$1(this, continuation);
            }
        }
        GetRecentTransactionsUseCase$invoke$1 getRecentTransactionsUseCase$invoke$12 = getRecentTransactionsUseCase$invoke$1;
        java.lang.Object objWithContext = getRecentTransactionsUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRecentTransactionsUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 getRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, j, this, positionDetailsParam, txType, z);
            getRecentTransactionsUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, getRecentTransactionsUseCase$invoke$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8670invokeyxL6bBk$default(C29128knm c29128knm, long j, boolean z, PositionDetailsParam positionDetailsParam, TxType txType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            txType = TxType.ALL;
        }
        return c29128knm.copydefault(j, z, positionDetailsParam, txType, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull PositionDetailsParam positionDetailsParam, @NotNull TxType txType, @NotNull Continuation<? super Unit> continuation) {
        java.lang.String strEZpvd;
        if (C22416heu.ejfBZ()) {
            return Unit.INSTANCE;
        }
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.gEmmrt.valueOf();
        if (interfaceC9738bbJValueOf != null && (strEZpvd = interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(positionDetailsParam.getChainId()))) != null) {
            JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
            C25389ivm.safeLaunch$default(this.valueOf, null, null, new GetRecentTransactionsUseCase$subscribeWs$2(positionDetailsParam, txType, strEZpvd, this, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.valueOf, null, null, new GetRecentTransactionsUseCase$stopWs$1(this, null), 3, null);
    }

    public final TokenFilter KWHzl(PositionDetailsParam positionDetailsParam, java.lang.String str, TxType txType) {
        return new TokenFilter(positionDetailsParam.getChainId(), positionDetailsParam.getTokenAddress(), txType.getValue(), null, C56402yEa.EZpvd(str), false, false, null, false, false, null, null, null, 8168, null);
    }
}
