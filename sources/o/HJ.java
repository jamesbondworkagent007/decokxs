package o;

import aws.smithy.kotlin.runtime.util.OsFamily;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HJ {
    public final OsFamily AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HJ copy$default(HJ hj, OsFamily osFamily, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            osFamily = hj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = hj.OLrzqt;
        }
        return hj.KWHzl(osFamily, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OsFamily KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HJ KWHzl(@NotNull OsFamily osFamily, java.lang.String str) {
        Intrinsics.checkNotNullParameter(osFamily, "");
        return new HJ(osFamily, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HJ)) {
            return false;
        }
        HJ hj = (HJ) obj;
        return this.AEQbTJ == hj.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) hj.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OperatingSystem(family=" + this.AEQbTJ + ", version=" + this.OLrzqt + ')';
    }

    public HJ(@NotNull OsFamily osFamily, java.lang.String str) {
        Intrinsics.checkNotNullParameter(osFamily, "");
        this.AEQbTJ = osFamily;
        this.OLrzqt = str;
    }
}
