package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BhP {
    public static final int $stable = 8;
    public java.util.List<BhQ> AEQbTJ;
    public java.util.List<BhQ> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BhP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BhP copy$default(BhP bhP, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = bhP.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = bhP.OLrzqt;
        }
        return bhP.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BhQ> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BhP EZpvd(@NotNull java.util.List<BhQ> list, @NotNull java.util.List<BhQ> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new BhP(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BhQ> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BhP)) {
            return false;
        }
        BhP bhP = (BhP) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, bhP.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, bhP.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewsCarouselResult(contentFlash=" + this.AEQbTJ + ", campaign=" + this.OLrzqt + ")";
    }

    public BhP(@NotNull java.util.List<BhQ> list, @NotNull java.util.List<BhQ> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = list;
        this.OLrzqt = list2;
    }
}
