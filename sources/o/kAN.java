package o;

import com.okinc.business.market.features.vibes.domain.GetVibesOverviewUseCase$invoke$1;
import com.okinc.business.market.features.vibes.domain.GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAN {
    public final CoroutineDispatcher EZpvd;
    public final kAM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kAM copydefault() {
        return this.copydefault;
    }

    @yCM
    public kAN(@NotNull kAM kam, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kam, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = kam;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<C29116kna>> continuation) {
        GetVibesOverviewUseCase$invoke$1 getVibesOverviewUseCase$invoke$1;
        if (continuation instanceof GetVibesOverviewUseCase$invoke$1) {
            getVibesOverviewUseCase$invoke$1 = (GetVibesOverviewUseCase$invoke$1) continuation;
            int i = getVibesOverviewUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getVibesOverviewUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getVibesOverviewUseCase$invoke$1 = new GetVibesOverviewUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getVibesOverviewUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getVibesOverviewUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            getVibesOverviewUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getVibesOverviewUseCase$invoke$1);
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
