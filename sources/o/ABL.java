package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ABL {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ABL copy$default(ABL abl, long j, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = abl.copydefault;
        }
        if ((i & 2) != 0) {
            z = abl.EZpvd;
        }
        if ((i & 4) != 0) {
            str = abl.AEQbTJ;
        }
        return abl.copydefault(j, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABL copydefault(long j, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ABL(j, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ABL)) {
            return false;
        }
        ABL abl = (ABL) obj;
        return this.copydefault == abl.copydefault && this.EZpvd == abl.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) abl.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeeOption(feeLevel=" + this.copydefault + ", selected=" + this.EZpvd + ", feeValue=" + this.AEQbTJ + ")";
    }

    public ABL(long j, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = j;
        this.EZpvd = z;
        this.AEQbTJ = str;
    }
}
