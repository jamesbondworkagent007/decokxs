package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AdW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2990AdW {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2990AdW copy$default(C2990AdW c2990AdW, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2990AdW.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c2990AdW.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = c2990AdW.OLrzqt;
        }
        return c2990AdW.EZpvd(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2990AdW EZpvd(java.lang.String str, java.lang.String str2, boolean z) {
        return new C2990AdW(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2990AdW)) {
            return false;
        }
        C2990AdW c2990AdW = (C2990AdW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2990AdW.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2990AdW.AEQbTJ) && this.OLrzqt == c2990AdW.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterPhoneInputState(phone=" + this.EZpvd + ", areaCode=" + this.AEQbTJ + ", isNextButtonEnabled=" + this.OLrzqt + ")";
    }

    public C2990AdW(java.lang.String str, java.lang.String str2, boolean z) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.OLrzqt = z;
    }
}
