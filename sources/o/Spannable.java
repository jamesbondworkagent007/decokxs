package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Spannable extends C5057Db implements InterfaceC52778wY {
    public final InterfaceC52778wY KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.KWHzl.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        return this.KWHzl.resolve(interfaceC57843yq, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spannable(@NotNull InterfaceC52778wY interfaceC52778wY) {
        super(interfaceC52778wY);
        Intrinsics.checkNotNullParameter(interfaceC52778wY, "");
        this.KWHzl = interfaceC52778wY;
    }
}
