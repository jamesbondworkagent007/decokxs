package o;

import com.okinc.planet.domain.usecase.UseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46360tRl<Input, Output> {
    public final CoroutineDispatcher AYXKKw;

    public abstract java.lang.Object AEQbTJ(Input input, @NotNull Continuation<? super Output> continuation);

    public AbstractC46360tRl(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(Input input, @NotNull Continuation<? super Output> continuation) {
        return BuildersKt.withContext(this.AYXKKw, new UseCase$invoke$2(this, input, null), continuation);
    }
}
