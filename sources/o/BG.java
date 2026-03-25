package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BG<Input, Output> implements CG<Input, Output> {
    public final CG<Input, Output> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super Input, ? extends Output> */
    /* JADX WARN: Multi-variable type inference failed */
    public BG(@NotNull CG<? super Input, ? extends Output> cg) {
        Intrinsics.checkNotNullParameter(cg, "");
        this.EZpvd = cg;
    }

    @Override // o.CG
    public java.lang.Object OLrzqt(Input input, @NotNull Continuation<? super Output> continuation) {
        return this.EZpvd.OLrzqt(input, continuation);
    }
}
