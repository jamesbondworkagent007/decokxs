package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AZe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2786AZe {
    public static final int $stable = 8;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2786AZe copy$default(C2786AZe c2786AZe, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2786AZe.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c2786AZe.copydefault;
        }
        return c2786AZe.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2786AZe KWHzl(java.lang.String str, java.lang.String str2) {
        return new C2786AZe(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2786AZe)) {
            return false;
        }
        C2786AZe c2786AZe = (C2786AZe) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2786AZe.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2786AZe.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AsymmetricSignConfig(privateKey=" + this.OLrzqt + ", publicKey=" + this.copydefault + ")";
    }

    public C2786AZe(java.lang.String str, java.lang.String str2) {
        this.OLrzqt = str;
        this.copydefault = str2;
    }
}
