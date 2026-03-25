package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44384sNv implements InterfaceC44376sNn {
    public final C44382sNt KWHzl;

    @yCM
    public C44384sNv(@NotNull C44382sNt c44382sNt) {
        Intrinsics.checkNotNullParameter(c44382sNt, "");
        this.KWHzl = c44382sNt;
    }

    @Override // o.InterfaceC44376sNn
    public java.lang.Object OLrzqt(@NotNull sQX sqx, @NotNull Continuation<? super sQV> continuation) {
        return this.KWHzl.AEQbTJ(sqx, continuation);
    }
}
