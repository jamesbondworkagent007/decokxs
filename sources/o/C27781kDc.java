package o;

import com.okinc.business.market.data.model.WatchlistTokenData;
import com.okinc.business.market.features.watchlist_cache.data.WatchlistCacheRepo$fetchAllWatchlistTokens$1;
import com.okinc.business.market.features.watchlist_cache.data.WatchlistCacheRepo$fetchAllWatchlistTokens0E7RQCE$$inlined$dexRunCatching$1;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27781kDc {
    public final java.util.Set<WatchlistTokenData> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC27595jyE KWHzl;

    public C27781kDc(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27595jyE;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) {
        WatchlistCacheRepo$fetchAllWatchlistTokens$1 watchlistCacheRepo$fetchAllWatchlistTokens$1;
        if (continuation instanceof WatchlistCacheRepo$fetchAllWatchlistTokens$1) {
            watchlistCacheRepo$fetchAllWatchlistTokens$1 = (WatchlistCacheRepo$fetchAllWatchlistTokens$1) continuation;
            int i = watchlistCacheRepo$fetchAllWatchlistTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistCacheRepo$fetchAllWatchlistTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistCacheRepo$fetchAllWatchlistTokens$1 = new WatchlistCacheRepo$fetchAllWatchlistTokens$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = watchlistCacheRepo$fetchAllWatchlistTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistCacheRepo$fetchAllWatchlistTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            WatchlistCacheRepo$fetchAllWatchlistTokens0E7RQCE$$inlined$dexRunCatching$1 watchlistCacheRepo$fetchAllWatchlistTokens0E7RQCE$$inlined$dexRunCatching$1 = new WatchlistCacheRepo$fetchAllWatchlistTokens0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            watchlistCacheRepo$fetchAllWatchlistTokens$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, watchlistCacheRepo$fetchAllWatchlistTokens0E7RQCE$$inlined$dexRunCatching$1, watchlistCacheRepo$fetchAllWatchlistTokens$1);
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

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AEQbTJ.contains(new WatchlistTokenData(str, str2));
    }

    public final void KWHzl(@NotNull java.util.List<WatchlistTokenData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            if (z) {
                this.AEQbTJ.addAll(list);
            } else {
                this.AEQbTJ.removeAll(list);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
