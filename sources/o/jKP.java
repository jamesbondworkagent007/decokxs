package o;

import com.okinc.business.market.features.analysis.futures.sub.overview.data.repo.OverviewRepository$getRankingListData$2;
import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jKP {
    public final CoroutineDispatcher KWHzl;
    public final jKJ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public jKP(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull jKJ jkj) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(jkj, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = jkj;
    }

    public final java.lang.Object EZpvd(@NotNull PayloadPeriod payloadPeriod, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super jKO> continuation) {
        return BuildersKt.withContext(AEQbTJ(), new OverviewRepository$getRankingListData$2(this, payloadPeriod, str, str2, null), continuation);
    }
}
