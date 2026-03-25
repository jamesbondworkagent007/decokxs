package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AaK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2819AaK {
    public static final int $stable = 8;
    public java.util.List<? extends AbstractC2816AaH> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AaK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2819AaK copy$default(C2819AaK c2819AaK, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2819AaK.OLrzqt;
        }
        return c2819AaK.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.AaH>, java.util.List<o.AaH> */
    public final java.util.List<AbstractC2816AaH> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2819AaK AEQbTJ(@NotNull java.util.List<? extends AbstractC2816AaH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2819AaK(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2819AaK) && Intrinsics.EZpvd(this.OLrzqt, ((C2819AaK) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProfileListState(items=" + this.OLrzqt + ")";
    }

    public C2819AaK(@NotNull java.util.List<? extends AbstractC2816AaH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }
}
