package o;

import com.okinc.tradingbot.impl.order.strategy.domain.UseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vNH<Input, Output> {
    public final CoroutineDispatcher gEmmrt;

    public abstract java.lang.Object OLrzqt(Input input, @NotNull Continuation<? super Output> continuation);

    public vNH(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(Input input, @NotNull Continuation<? super Output> continuation) {
        return BuildersKt.withContext(this.gEmmrt, new UseCase$invoke$2(this, input, null), continuation);
    }
}
