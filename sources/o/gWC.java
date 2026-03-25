package o;

import kotlin.jvm.internal.Intrinsics;
import o.gWH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWC {
    public final java.util.List<gWH.StateListAnimator> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gWC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ gWC copy$default(gWC gwc, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = gwc.OLrzqt;
        }
        return gwc.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<gWH.StateListAnimator> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gWC OLrzqt(@NotNull java.util.List<gWH.StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new gWC(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gWC) && Intrinsics.EZpvd(this.OLrzqt, ((gWC) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletStrategiesEmptyItem(kolList=" + this.OLrzqt + ")";
    }

    public gWC(@NotNull java.util.List<gWH.StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }
}
