package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class BhA {
    public static final int $stable = 8;
    public java.util.List<? extends BhD> AEQbTJ;
    public java.lang.String OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BhA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BhA copy$default(BhA bhA, java.lang.String str, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = bhA.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = bhA.copydefault;
        }
        if ((i2 & 4) != 0) {
            list = bhA.AEQbTJ;
        }
        return bhA.KWHzl(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.BhD>, java.util.List<o.BhD> */
    public final java.util.List<BhD> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BhA KWHzl(java.lang.String str, int i, @NotNull java.util.List<? extends BhD> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BhA(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BhA)) {
            return false;
        }
        BhA bhA = (BhA) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) bhA.OLrzqt) && this.copydefault == bhA.copydefault && Intrinsics.EZpvd(this.AEQbTJ, bhA.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        return ((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketEventsResult(nextCursor=" + this.OLrzqt + ", updateCount=" + this.copydefault + ", eventList=" + this.AEQbTJ + ")";
    }

    public BhA(java.lang.String str, int i, @NotNull java.util.List<? extends BhD> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = str;
        this.copydefault = i;
        this.AEQbTJ = list;
    }
}
