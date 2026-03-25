package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.kline.features.kline.bottom.marketevents.data.repo.MarketEventsRepository$getMarketEventList$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36130oQj {
    public final C36126oQf EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public C36130oQj(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C36126oQf c36126oQf) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c36126oQf, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c36126oQf;
    }

    public final java.lang.Object AEQbTJ(@NotNull MarketEventReq marketEventReq, @NotNull Continuation<? super MarketEventResp> continuation) {
        return BuildersKt.withContext(copydefault(), new MarketEventsRepository$getMarketEventList$2(this, marketEventReq, null), continuation);
    }
}
