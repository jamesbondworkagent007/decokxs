package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58002yt {
    public final InterfaceC56293yA OLrzqt = C58108yv.AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56293yA AEQbTJ() {
        return this.OLrzqt;
    }

    public final <T> void KWHzl(@NotNull C57737yo<T> c57737yo, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.OLrzqt.OLrzqt(c57737yo, t);
    }

    public final <T> void AEQbTJ(@NotNull java.lang.String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.OLrzqt.OLrzqt(new C57737yo<>(str), t);
    }
}
