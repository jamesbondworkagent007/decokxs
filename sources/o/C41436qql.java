package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41436qql<R> {
    public final java.util.List<R> KWHzl;
    public final Function1<java.util.List<? extends R>, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<? extends R>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41436qql(@NotNull java.util.List<? extends R> list, @NotNull Function1<? super java.util.List<? extends R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = list;
        this.OLrzqt = function1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void copydefault() {
        this.OLrzqt.invoke((java.util.List<? extends R>) this.KWHzl);
    }
}
