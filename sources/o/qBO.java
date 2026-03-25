package o;

import com.okinc.market.search.features.main.entry.data.po.SearchRecommendPo;
import com.okinc.market.search.features.main.entry.data.repository.SearchRecommendRepository$getSearchRecommend$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qBO {
    public final CoroutineDispatcher EZpvd;
    public final qBP OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher copydefault() {
        return this.EZpvd;
    }

    @yCM
    public qBO(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qBP qbp) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qbp, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = qbp;
    }

    public static /* synthetic */ java.lang.Object getSearchRecommend$default(qBO qbo, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return qbo.copydefault(str, continuation);
    }

    public final java.lang.Object copydefault(java.lang.String str, @NotNull Continuation<? super java.util.List<SearchRecommendPo>> continuation) {
        return BuildersKt.withContext(copydefault(), new SearchRecommendRepository$getSearchRecommend$2(this, str, null), continuation);
    }
}
