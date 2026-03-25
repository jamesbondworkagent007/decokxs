package o;

import com.okinc.business.market.features.watchlist_cache.domain.FetchWatchlistCacheUseCase$fetch$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27783kDe {
    public final C27781kDc OLrzqt;

    @yCM
    public C27783kDe(@NotNull C27781kDc c27781kDc) {
        Intrinsics.checkNotNullParameter(c27781kDc, "");
        this.OLrzqt = c27781kDc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) {
        FetchWatchlistCacheUseCase$fetch$1 fetchWatchlistCacheUseCase$fetch$1;
        if (continuation instanceof FetchWatchlistCacheUseCase$fetch$1) {
            fetchWatchlistCacheUseCase$fetch$1 = (FetchWatchlistCacheUseCase$fetch$1) continuation;
            int i = fetchWatchlistCacheUseCase$fetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchWatchlistCacheUseCase$fetch$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchWatchlistCacheUseCase$fetch$1 = new FetchWatchlistCacheUseCase$fetch$1(this, continuation);
            }
        }
        java.lang.Object obj = fetchWatchlistCacheUseCase$fetch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchWatchlistCacheUseCase$fetch$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27781kDc c27781kDc = this.OLrzqt;
        fetchWatchlistCacheUseCase$fetch$1.label = 1;
        java.lang.Object objEZpvd = c27781kDc.EZpvd(str, str2, fetchWatchlistCacheUseCase$fetch$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
