package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37726ozK extends CoroutineDispatcher {
    public final C37718ozC EZpvd;

    public C37726ozK(@NotNull C37718ozC c37718ozC) {
        Intrinsics.checkNotNullParameter(c37718ozC, "");
        this.EZpvd = c37718ozC;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo7471dispatch(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.EZpvd.AEQbTJ(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        if (sDN.copydefault.OLrzqt().isDispatchNeeded(coroutineContext)) {
            return true;
        }
        return !this.EZpvd.OLrzqt();
    }
}
