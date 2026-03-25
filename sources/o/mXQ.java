package o;

import com.okinc.dexkline.market.features.data.domain.usecase.HoldersChartUseCase$getChartData$1;
import com.okinc.dexkline.market.features.data.domain.usecase.HoldersChartUseCase$getChartData0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mXQ {
    public final CoroutineDispatcher EZpvd;
    public final mXO copydefault;

    @yCM
    public mXQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mXO mxo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mxo, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = mxo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<mXM>> continuation) throws java.lang.Throwable {
        HoldersChartUseCase$getChartData$1 holdersChartUseCase$getChartData$1;
        if (continuation instanceof HoldersChartUseCase$getChartData$1) {
            holdersChartUseCase$getChartData$1 = (HoldersChartUseCase$getChartData$1) continuation;
            int i = holdersChartUseCase$getChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holdersChartUseCase$getChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                holdersChartUseCase$getChartData$1 = new HoldersChartUseCase$getChartData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = holdersChartUseCase$getChartData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holdersChartUseCase$getChartData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            HoldersChartUseCase$getChartData0E7RQCE$$inlined$dexRunCatching$1 holdersChartUseCase$getChartData0E7RQCE$$inlined$dexRunCatching$1 = new HoldersChartUseCase$getChartData0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            holdersChartUseCase$getChartData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, holdersChartUseCase$getChartData0E7RQCE$$inlined$dexRunCatching$1, holdersChartUseCase$getChartData$1);
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
