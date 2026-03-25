package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model.PnlDetailPo;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.repo.SpotAnalysisPnlDetailRepository$requestPnlDetail$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25959jMs {
    public final C25954jMn AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public C25959jMs(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25954jMn c25954jMn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25954jMn, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = c25954jMn;
    }

    public final java.lang.Object OLrzqt(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<PnlDetailPo>>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new SpotAnalysisPnlDetailRepository$requestPnlDetail$2(this, num, str, str2, bool, str3, null), continuation);
    }
}
