package o;

import com.okinc.market.ticker.TickerRepoV2Kt$executeAsyncTasks$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40394qUf {
    public static final <T> java.lang.Object KWHzl(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object>[] function1Arr, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        return CoroutineScopeKt.coroutineScope(new TickerRepoV2Kt$executeAsyncTasks$2(function1Arr, null), continuation);
    }
}
