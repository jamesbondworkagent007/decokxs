package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rKs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42218rKs {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C42218rKs copy$default(C42218rKs c42218rKs, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c42218rKs.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c42218rKs.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = c42218rKs.EZpvd;
        }
        return c42218rKs.KWHzl(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42218rKs KWHzl(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C42218rKs(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42218rKs)) {
            return false;
        }
        C42218rKs c42218rKs = (C42218rKs) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c42218rKs.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c42218rKs.AEQbTJ) && this.EZpvd == c42218rKs.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddMoreModel(text=" + this.copydefault + ", maxStr=" + this.AEQbTJ + ", canClick=" + this.EZpvd + ")";
    }

    public C42218rKs(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = z;
    }
}
