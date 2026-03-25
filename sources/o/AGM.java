package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AGM {
    public static final int $stable = 8;
    public long AEQbTJ;
    public ABK EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AGM copy$default(AGM agm, java.lang.String str, long j, ABK abk, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = agm.OLrzqt;
        }
        if ((i & 2) != 0) {
            j = agm.AEQbTJ;
        }
        if ((i & 4) != 0) {
            abk = agm.EZpvd;
        }
        return agm.KWHzl(str, j, abk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGM KWHzl(@NotNull java.lang.String str, long j, ABK abk) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AGM(str, j, abk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABK copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGM)) {
            return false;
        }
        AGM agm = (AGM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) agm.OLrzqt) && this.AEQbTJ == agm.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, agm.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.AEQbTJ);
        ABK abk = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (abk == null ? 0 : abk.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TagData(key=" + this.OLrzqt + ", meta=" + this.AEQbTJ + ", extraTagInfo=" + this.EZpvd + ")";
    }

    public AGM(@NotNull java.lang.String str, long j, ABK abk) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AEQbTJ = j;
        this.EZpvd = abk;
    }
}
