package o;

import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.repo.SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jLQ {
    public final jLR KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher copydefault() {
        return this.copydefault;
    }

    @yCM
    public jLQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull jLR jlr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(jlr, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = jlr;
    }

    public final java.lang.Object EZpvd(@NotNull PayloadPeriod payloadPeriod, @NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CumulativePnlPo>>> continuation) {
        return BuildersKt.withContext(copydefault(), new SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2(this, payloadPeriod, str, str2, null), continuation);
    }
}
