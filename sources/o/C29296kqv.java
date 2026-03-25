package o;

import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingConfigUseCase$invoke$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingConfigUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29296kqv {
    public final InterfaceC29249kqA EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C29296kqv(@NotNull InterfaceC29249kqA interfaceC29249kqA, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29249kqA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC29249kqA;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<TrendingConfigData>> continuation) {
        GetTrendingConfigUseCase$invoke$1 getTrendingConfigUseCase$invoke$1;
        if (continuation instanceof GetTrendingConfigUseCase$invoke$1) {
            getTrendingConfigUseCase$invoke$1 = (GetTrendingConfigUseCase$invoke$1) continuation;
            int i = getTrendingConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrendingConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrendingConfigUseCase$invoke$1 = new GetTrendingConfigUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrendingConfigUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrendingConfigUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            GetTrendingConfigUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 getTrendingConfigUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new GetTrendingConfigUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            getTrendingConfigUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrendingConfigUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, getTrendingConfigUseCase$invoke$1);
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
