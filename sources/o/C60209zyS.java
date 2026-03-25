package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zyS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C60209zyS {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.Integer KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60209zyS copy$default(C60209zyS c60209zyS, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c60209zyS.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c60209zyS.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c60209zyS.OLrzqt;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            num = c60209zyS.KWHzl;
        }
        java.lang.Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = c60209zyS.copydefault;
        }
        return c60209zyS.copydefault(str, str4, str5, num3, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60209zyS copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2) {
        return new C60209zyS(str, str2, str3, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60209zyS)) {
            return false;
        }
        C60209zyS c60209zyS = (C60209zyS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c60209zyS.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c60209zyS.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c60209zyS.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c60209zyS.KWHzl) && Intrinsics.EZpvd(this.copydefault, c60209zyS.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.Integer num = this.KWHzl;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AlternateAccountInformationResponse(avatar=" + this.AEQbTJ + ", nickname=" + this.EZpvd + ", uid=" + this.OLrzqt + ", displayStatus=" + this.KWHzl + ", accountType=" + this.copydefault + ")";
    }

    public C60209zyS(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2) {
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.KWHzl = num;
        this.copydefault = num2;
    }
}
