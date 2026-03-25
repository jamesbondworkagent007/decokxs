package o;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40491qXv extends AbstractC49400uno<WatchListData, java.lang.Boolean> {
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher EZpvd;
    public final qWQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C40491qXv(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = qwq;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull WatchListData watchListData, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.KWHzl(C55686xod.KWHzl(), qWJ.convertToUserFavorite$default(watchListData, null, 1, null), continuation);
    }
}
