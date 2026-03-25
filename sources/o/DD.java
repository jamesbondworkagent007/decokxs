package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DD {
    public final DJ KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DD copy$default(DD dd, java.lang.String str, DJ dj, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dd.OLrzqt;
        }
        if ((i & 2) != 0) {
            dj = dd.KWHzl;
        }
        return dd.KWHzl(str, dj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DD KWHzl(@NotNull java.lang.String str, @NotNull DJ dj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dj, "");
        return new DD(str, dj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DJ OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DD)) {
            return false;
        }
        DD dd = (DD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dd.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, dd.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HostAddress(hostname=" + this.OLrzqt + ", address=" + this.KWHzl + ')';
    }

    public DD(@NotNull java.lang.String str, @NotNull DJ dj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dj, "");
        this.OLrzqt = str;
        this.KWHzl = dj;
    }
}
