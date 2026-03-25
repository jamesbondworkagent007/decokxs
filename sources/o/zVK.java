package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class zVK {
    public static final int $stable = 8;
    public java.lang.String EZpvd;
    public zVI KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zVK copy$default(zVK zvk, zVI zvi, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zvi = zvk.KWHzl;
        }
        if ((i & 2) != 0) {
            str = zvk.EZpvd;
        }
        if ((i & 4) != 0) {
            str2 = zvk.copydefault;
        }
        return zvk.copydefault(zvi, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zVI AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zVK copydefault(@NotNull zVI zvi, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(zvi, "");
        return new zVK(zvi, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zVK)) {
            return false;
        }
        zVK zvk = (zVK) obj;
        return Intrinsics.EZpvd(this.KWHzl, zvk.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zvk.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zvk.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyJourneyState(currentStep=" + this.KWHzl + ", mfaSessionId=" + this.EZpvd + ", workflowToken=" + this.copydefault + ")";
    }

    public zVK(@NotNull zVI zvi, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(zvi, "");
        this.KWHzl = zvi;
        this.EZpvd = str;
        this.copydefault = str2;
    }
}
