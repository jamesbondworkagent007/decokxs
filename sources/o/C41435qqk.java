package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41435qqk<R, B> {
    public final Function1<java.util.List<? extends B>, java.util.List<R>> AEQbTJ;
    public final Function1<java.util.List<? extends R>, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<? extends B>, ? extends java.util.List<? extends R>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<? extends R>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41435qqk(@NotNull Function1<? super java.util.List<? extends B>, ? extends java.util.List<? extends R>> function1, @NotNull Function1<? super java.util.List<? extends R>, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = function1;
        this.KWHzl = function12;
    }

    public final C41436qql<R> AEQbTJ(@NotNull java.util.List<? extends B> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C41436qql<>(this.AEQbTJ.invoke(list), this.KWHzl);
    }
}
