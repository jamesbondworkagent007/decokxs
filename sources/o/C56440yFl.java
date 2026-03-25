package o;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56440yFl implements Continuation<java.lang.Object> {
    public static final C56440yFl OLrzqt = new C56440yFl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "This continuation is already complete";
    }

    private C56440yFl() {
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        throw new java.lang.IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull java.lang.Object obj) {
        throw new java.lang.IllegalStateException("This continuation is already complete".toString());
    }
}
