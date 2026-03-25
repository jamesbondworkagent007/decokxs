package o;

import com.okinc.business.defi.biz.net.bean.Article;
import com.okinc.business.defi.biz.net.bean.FusionData;
import com.okinc.business.defi.biz.net.bean.NftCollection;
import com.okinc.business.defi.biz.net.bean.RecommendedInvestment;
import com.okinc.business.defi.wallet.home.repository.FusionDataRepository$getFusionData$1;
import com.okinc.business.defi.wallet.home.repository.FusionDataRepository$queryCryptoReadsArticleList$2;
import com.okinc.business.defi.wallet.home.repository.FusionDataRepository$queryNftTopProjects$2;
import com.okinc.business.defi.wallet.home.repository.FusionDataRepository$queryYieldRecommendList$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18192fdk {
    public final C13934dbu AEQbTJ;
    public volatile Deferred<? extends AbstractC43419rot<FusionData, OKServerException>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu copydefault() {
        return this.AEQbTJ;
    }

    public C18192fdk(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
    }

    public final void copydefault(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = null;
        EZpvd(coroutineScope);
    }

    public final void EZpvd(CoroutineScope coroutineScope) {
        Deferred<? extends AbstractC43419rot<FusionData, OKServerException>> deferred;
        Deferred<? extends AbstractC43419rot<FusionData, OKServerException>> deferred2;
        AbstractC43419rot<FusionData, OKServerException> completed;
        if (this.OLrzqt == null || (deferred = this.OLrzqt) == null || !deferred.isCompleted() || (deferred2 = this.OLrzqt) == null || (completed = deferred2.getCompleted()) == null || !completed.EZpvd()) {
            Deferred<? extends AbstractC43419rot<FusionData, OKServerException>> deferred3 = this.OLrzqt;
            if (deferred3 == null || deferred3.isCompleted()) {
                this.OLrzqt = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FusionDataRepository$getFusionData$1(this, null), 3, null);
            }
        }
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<Article>, OKServerException>> continuation) {
        return SupervisorKt.supervisorScope(new FusionDataRepository$queryCryptoReadsArticleList$2(this, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<NftCollection>, OKServerException>> continuation) {
        return SupervisorKt.supervisorScope(new FusionDataRepository$queryNftTopProjects$2(this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<RecommendedInvestment>, OKServerException>> continuation) {
        return SupervisorKt.supervisorScope(new FusionDataRepository$queryYieldRecommendList$2(this, null), continuation);
    }
}
