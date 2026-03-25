package o;

import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundindFeeRateInfoPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.SwapCoinPairPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.repo.FundingFeeRepo$queryEstimateFundingFee$2;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.repo.FundingFeeRepo$queryFundingFee$2;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.repo.FundingFeeRepo$querySwapCoins$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25878jJs {
    public final CoroutineDispatcher KWHzl;
    public final C25877jJr OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher KWHzl() {
        return this.KWHzl;
    }

    @yCM
    public C25878jJs(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25877jJr c25877jJr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25877jJr, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c25877jJr;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super java.util.List<FundingFeePo>> continuation) {
        return BuildersKt.withContext(KWHzl(), new FundingFeeRepo$queryFundingFee$2(this, str, str2, str3, str4, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super java.util.List<FundindFeeRateInfoPo>> continuation) {
        return BuildersKt.withContext(KWHzl(), new FundingFeeRepo$queryEstimateFundingFee$2(this, str, str2, null), continuation);
    }

    public final java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super java.util.List<SwapCoinPairPo>> continuation) {
        return BuildersKt.withContext(KWHzl(), new FundingFeeRepo$querySwapCoins$2(this, str, null), continuation);
    }
}
