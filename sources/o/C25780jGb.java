package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25780jGb {
    public final java.lang.String KWHzl;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25780jGb copy$default(C25780jGb c25780jGb, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c25780jGb.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c25780jGb.KWHzl;
        }
        return c25780jGb.EZpvd(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25780jGb EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C25780jGb(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25780jGb)) {
            return false;
        }
        C25780jGb c25780jGb = (C25780jGb) obj;
        return this.OLrzqt == c25780jGb.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25780jGb.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrackerMenuSelectionItem(key=" + this.OLrzqt + ", value=" + this.KWHzl + ")";
    }

    public C25780jGb(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = j;
        this.KWHzl = str;
    }
}
