package o;

import com.okinc.market.quotation.data.model.DexChainGroupV2Po;
import com.okinc.market.quotation.data.model.DexTokenListRequest;
import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.data.repository.DexRepository$getChainGroupList$2;
import com.okinc.market.quotation.data.repository.DexRepository$getDexBoostTokenRankingList$2;
import com.okinc.market.quotation.data.repository.DexRepository$getDexTokenDetailList$2;
import com.okinc.market.quotation.data.repository.DexRepository$getDexTokenRankingList$2;
import com.okinc.market.quotation.data.repository.DexRepository$searchDexTokenList$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41448qqx {
    public final CoroutineDispatcher EZpvd;
    public final C41445qqu KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher copydefault() {
        return this.EZpvd;
    }

    @yCM
    public C41448qqx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41445qqu c41445qqu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41445qqu, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c41445qqu;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexRepository$getDexTokenRankingList$2(this, str, str2, str3, num, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexRepository$getDexBoostTokenRankingList$2(this, str, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexRepository$searchDexTokenList$2(this, str, str2, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<DexChainGroupV2Po>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexRepository$getChainGroupList$2(this, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<DexTokenListRequest> list, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexRepository$getDexTokenDetailList$2(this, list, null), continuation);
    }
}
