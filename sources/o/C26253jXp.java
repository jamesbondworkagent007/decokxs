package o;

import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.history.repo.HistoryFilterConfigRepo$getPriceRangeConfig$1;
import com.okinc.business.market.features.history.repo.HistoryFilterConfigRepo$getPriceRangeConfig$2$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26253jXp {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC27595jyE KWHzl;

    public C26253jXp(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27595jyE;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends java.util.List<PriceRangeFilter>>> continuation) {
        HistoryFilterConfigRepo$getPriceRangeConfig$1 historyFilterConfigRepo$getPriceRangeConfig$1;
        if (continuation instanceof HistoryFilterConfigRepo$getPriceRangeConfig$1) {
            historyFilterConfigRepo$getPriceRangeConfig$1 = (HistoryFilterConfigRepo$getPriceRangeConfig$1) continuation;
            int i = historyFilterConfigRepo$getPriceRangeConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyFilterConfigRepo$getPriceRangeConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                historyFilterConfigRepo$getPriceRangeConfig$1 = new HistoryFilterConfigRepo$getPriceRangeConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = historyFilterConfigRepo$getPriceRangeConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = historyFilterConfigRepo$getPriceRangeConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                HistoryFilterConfigRepo$getPriceRangeConfig$2$1 historyFilterConfigRepo$getPriceRangeConfig$2$1 = new HistoryFilterConfigRepo$getPriceRangeConfig$2$1(this, null);
                historyFilterConfigRepo$getPriceRangeConfig$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, historyFilterConfigRepo$getPriceRangeConfig$2$1, historyFilterConfigRepo$getPriceRangeConfig$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            return Result.m7377constructorimpl((java.util.List) objWithContext);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
