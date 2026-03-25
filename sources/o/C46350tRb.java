package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46350tRb {
    public final CoroutineDispatcher KWHzl;
    public final tQP copydefault;

    public C46350tRb(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = tqp;
        this.KWHzl = coroutineDispatcher;
    }
}
