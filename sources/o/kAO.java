package o;

import com.okinc.business.market.features.vibes.domain.VibesChartUseCase$getVibesChartData$1;
import com.okinc.business.market.features.vibes.domain.VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAO {
    public final kAQ EZpvd;
    public final CoroutineDispatcher KWHzl;

    public kAO(@NotNull kAQ kaq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kaq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = kaq;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull VibesTimeRange vibesTimeRange, @NotNull Continuation<? super Result<kAV>> continuation) {
        VibesChartUseCase$getVibesChartData$1 vibesChartUseCase$getVibesChartData$1;
        if (continuation instanceof VibesChartUseCase$getVibesChartData$1) {
            vibesChartUseCase$getVibesChartData$1 = (VibesChartUseCase$getVibesChartData$1) continuation;
            int i = vibesChartUseCase$getVibesChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vibesChartUseCase$getVibesChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                vibesChartUseCase$getVibesChartData$1 = new VibesChartUseCase$getVibesChartData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = vibesChartUseCase$getVibesChartData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = vibesChartUseCase$getVibesChartData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1 vibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1 = new VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, vibesTimeRange);
            vibesChartUseCase$getVibesChartData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, vibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1, vibesChartUseCase$getVibesChartData$1);
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
}
