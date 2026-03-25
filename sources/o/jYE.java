package o;

import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import com.okinc.business.market.features.holders.domain.usecase.GetHistoryStatisticsUseCase$invoke$1;
import com.okinc.business.market.features.holders.domain.usecase.GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holders.domain.usecase.GetHistoryStatisticsUseCase$subscribeWs$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
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

/* JADX INFO: loaded from: classes7.dex */
public final class jYE {
    public final MutableStateFlow<HistoryStatistics> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final StateFlow<HistoryStatistics> KWHzl;
    public final jYA OLrzqt;
    public final C26285jYu copydefault;
    public final CoroutineScope valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<HistoryStatistics> EZpvd() {
        return this.KWHzl;
    }

    @yCM
    public jYE(@NotNull jYA jya, @NotNull C26285jYu c26285jYu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jya, "");
        Intrinsics.checkNotNullParameter(c26285jYu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = jya;
        this.copydefault = c26285jYu;
        this.EZpvd = coroutineDispatcher;
        MutableStateFlow<HistoryStatistics> MutableStateFlow = StateFlowKt.MutableStateFlow(new HistoryStatistics(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null));
        this.AEQbTJ = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<HistoryStatistics>> continuation) {
        GetHistoryStatisticsUseCase$invoke$1 getHistoryStatisticsUseCase$invoke$1;
        if (continuation instanceof GetHistoryStatisticsUseCase$invoke$1) {
            getHistoryStatisticsUseCase$invoke$1 = (GetHistoryStatisticsUseCase$invoke$1) continuation;
            int i = getHistoryStatisticsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHistoryStatisticsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getHistoryStatisticsUseCase$invoke$1 = new GetHistoryStatisticsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getHistoryStatisticsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHistoryStatisticsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            getHistoryStatisticsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getHistoryStatisticsUseCase$invoke$1);
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

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.valueOf, null, null, new GetHistoryStatisticsUseCase$subscribeWs$1(str, str2, str3, this, null), 3, null);
    }

    public final void AEQbTJ() {
        JobKt__JobKt.cancelChildren$default(this.valueOf.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        this.OLrzqt.EZpvd();
    }
}
