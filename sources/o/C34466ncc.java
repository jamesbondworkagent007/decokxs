package o;

import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.position.domain.GetRecentTransactionsUseCase$invoke$1;
import com.okinc.dexkline.market.features.position.domain.GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.position.domain.GetRecentTransactionsUseCase$stopWs$1;
import com.okinc.dexkline.market.features.position.domain.GetRecentTransactionsUseCase$subscribeWs$2;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
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

/* JADX INFO: renamed from: o.ncc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34466ncc {
    public final MutableStateFlow<java.util.List<C34462ncY>> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC34475ncl KWHzl;
    public final C34476ncm OLrzqt;
    public final StateFlow<java.util.List<C34462ncY>> copydefault;
    public final C34587ner djBIcL;
    public final CoroutineScope valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C34462ncY>> copydefault() {
        return this.copydefault;
    }

    @yCM
    public C34466ncc(@NotNull InterfaceC34475ncl interfaceC34475ncl, @NotNull C34587ner c34587ner, @NotNull C34476ncm c34476ncm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC34475ncl, "");
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(c34476ncm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC34475ncl;
        this.djBIcL = c34587ner;
        this.OLrzqt = c34476ncm;
        this.EZpvd = coroutineDispatcher;
        MutableStateFlow<java.util.List<C34462ncY>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, boolean z, @NotNull PositionDetailsParam positionDetailsParam, @NotNull TxType txType, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<C34462ncY>, java.lang.Boolean>>> continuation) throws java.lang.Throwable {
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
    public static /* synthetic */ java.lang.Object m8695invokeyxL6bBk$default(C34466ncc c34466ncc, long j, boolean z, PositionDetailsParam positionDetailsParam, TxType txType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            txType = TxType.ALL;
        }
        return c34466ncc.copydefault(j, z, positionDetailsParam, txType, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull PositionDetailsParam positionDetailsParam, @NotNull TxType txType, @NotNull Continuation<? super Unit> continuation) {
        java.lang.String strEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.djBIcL.KWHzl();
        if (interfaceC9738bbJKWHzl != null && (strEZpvd = interfaceC9738bbJKWHzl.EZpvd(C33129mqd.valueOf(positionDetailsParam.getChainId()))) != null) {
            JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
            mUR.safeLaunch$default(this.valueOf, null, null, new GetRecentTransactionsUseCase$subscribeWs$2(positionDetailsParam, txType, strEZpvd, this, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        mUR.safeLaunch$default(this.valueOf, null, null, new GetRecentTransactionsUseCase$stopWs$1(this, null), 3, null);
    }

    public final TokenFilter OLrzqt(PositionDetailsParam positionDetailsParam, java.lang.String str, TxType txType) {
        return new TokenFilter(positionDetailsParam.getChainId(), positionDetailsParam.getTokenAddress(), txType.getValue(), null, C56402yEa.EZpvd(str), false, false, null, false, false, null, null, null, null, 16360, null);
    }
}
