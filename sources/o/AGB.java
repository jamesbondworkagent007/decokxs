package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AGB {
    public static final int $stable = 8;
    public java.lang.String KWHzl;
    public long OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AGB copy$default(AGB agb, boolean z, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = agb.copydefault;
        }
        if ((i & 2) != 0) {
            j = agb.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = agb.KWHzl;
        }
        return agb.AEQbTJ(z, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGB AEQbTJ(boolean z, long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AGB(z, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGB)) {
            return false;
        }
        AGB agb = (AGB) obj;
        return this.copydefault == agb.copydefault && this.OLrzqt == agb.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) agb.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SlippageRange(selected=" + this.copydefault + ", slippageLevel=" + this.OLrzqt + ", slippageValue=" + this.KWHzl + ")";
    }

    public AGB(boolean z, long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = z;
        this.OLrzqt = j;
        this.KWHzl = str;
    }
}
