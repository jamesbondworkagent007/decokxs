package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nGP {
    public final java.util.List<nGS> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nGP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ nGP copy$default(nGP ngp, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = ngp.KWHzl;
        }
        return ngp.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<nGS> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nGP OLrzqt(@NotNull java.util.List<nGS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new nGP(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nGP) && Intrinsics.EZpvd(this.KWHzl, ((nGP) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrendingGroupsSection(groups=" + this.KWHzl + ")";
    }

    public nGP(@NotNull java.util.List<nGS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }
}
