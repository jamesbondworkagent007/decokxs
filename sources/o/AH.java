package o;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AH extends C5057Db implements InterfaceC3709Ar {
    public final InterfaceC3709Ar OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC3972Aw
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull Continuation<? super C58859zS> continuation) {
        return this.OLrzqt.KWHzl(dt, interfaceC5037Ch, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC3972Aw
    public InterfaceC4078Ay OLrzqt() {
        return this.OLrzqt.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.OLrzqt.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.OLrzqt.getCoroutineContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AH(@NotNull InterfaceC3709Ar interfaceC3709Ar) {
        super(interfaceC3709Ar);
        Intrinsics.checkNotNullParameter(interfaceC3709Ar, "");
        this.OLrzqt = interfaceC3709Ar;
    }
}
