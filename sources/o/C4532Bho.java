package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4532Bho {
    public static final int $stable = 8;
    public java.util.List<C4531Bhn> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bho */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4532Bho copy$default(C4532Bho c4532Bho, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c4532Bho.EZpvd;
        }
        return c4532Bho.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C4531Bhn> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4532Bho copydefault(@NotNull java.util.List<C4531Bhn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C4532Bho(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4532Bho) && Intrinsics.EZpvd(this.EZpvd, ((C4532Bho) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineEconEventResult(events=" + this.EZpvd + ")";
    }

    public C4532Bho(@NotNull java.util.List<C4531Bhn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }
}
