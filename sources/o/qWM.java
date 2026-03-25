package o;

import com.okinc.market.watch.repo.WatchBizRepo$initWatchBiz$2;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWM {
    public static final int KWHzl = 8;
    public final CoroutineDispatcher EZpvd;
    public final C40466qWx OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher copydefault() {
        return this.EZpvd;
    }

    @yCM
    public qWM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40466qWx c40466qWx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40466qWx, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = c40466qWx;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(copydefault(), new WatchBizRepo$initWatchBiz$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<TradeCoinInfo>> continuation) {
        return this.OLrzqt.AYXKKw();
    }
}
