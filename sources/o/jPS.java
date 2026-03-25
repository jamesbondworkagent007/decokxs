package o;

import com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange;
import com.okinc.business.market.features.coindetail_liquidity.domain.LoadLiquidityChangeUseCase$load$1;
import com.okinc.business.market.features.coindetail_liquidity.domain.LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.coindetail_liquidity.domain.LoadLiquidityChangeUseCase$stopWs$1;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPS {
    public final jPU AEQbTJ;
    public final CoroutineScope AYXKKw;
    public final MutableStateFlow<java.util.List<LiquidityChange>> EZpvd;
    public final CoroutineScope KWHzl;
    public final StateFlow<java.util.List<LiquidityChange>> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final ConcurrentHashMap<jPT, Deferred<java.lang.Object>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<LiquidityChange>> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public jPS(@NotNull jPU jpu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jpu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = jpu;
        this.copydefault = coroutineDispatcher;
        MutableStateFlow<java.util.List<LiquidityChange>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        this.gEmmrt = new ConcurrentHashMap<>();
        this.KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX INFO: renamed from: load-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8642loadBWLJW6A$default(jPS jps, java.lang.String str, TokenFilter tokenFilter, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return jps.copydefault(str, tokenFilter, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        LoadLiquidityChangeUseCase$load$1 loadLiquidityChangeUseCase$load$1;
        if (continuation instanceof LoadLiquidityChangeUseCase$load$1) {
            loadLiquidityChangeUseCase$load$1 = (LoadLiquidityChangeUseCase$load$1) continuation;
            int i = loadLiquidityChangeUseCase$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loadLiquidityChangeUseCase$load$1.label = i - Integer.MIN_VALUE;
            } else {
                loadLiquidityChangeUseCase$load$1 = new LoadLiquidityChangeUseCase$load$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = loadLiquidityChangeUseCase$load$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = loadLiquidityChangeUseCase$load$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1 loadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1 = new LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1(null, str, tokenFilter, z, this);
            loadLiquidityChangeUseCase$load$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, loadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1, loadLiquidityChangeUseCase$load$1);
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

    public final void EZpvd() {
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.AYXKKw, null, null, new LoadLiquidityChangeUseCase$stopWs$1(this, null), 3, null);
    }

    public final Flow<LiquidityChange> copydefault(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        return this.AEQbTJ.OLrzqt(tokenFilter);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<LiquidityChange> value = this.OLrzqt.getValue();
        if (value == null) {
            return false;
        }
        java.util.Iterator<LiquidityChange> it = value.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) it.next().OLrzqt(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return i >= 0 && i < yDY.AuCTel(value);
    }

    public final void copydefault() {
        java.util.Iterator<Map.Entry<jPT, Deferred<java.lang.Object>>> it = this.gEmmrt.entrySet().iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next().getValue(), (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gEmmrt.clear();
    }
}
