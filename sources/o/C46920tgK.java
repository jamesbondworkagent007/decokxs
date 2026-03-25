package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tgK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46920tgK {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46920tgK copy$default(C46920tgK c46920tgK, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46920tgK.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c46920tgK.KWHzl;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c46920tgK.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c46920tgK.AEQbTJ;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c46920tgK.EZpvd;
        }
        return c46920tgK.EZpvd(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46920tgK EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return new C46920tgK(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46920tgK)) {
            return false;
        }
        C46920tgK c46920tgK = (C46920tgK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46920tgK.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46920tgK.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46920tgK.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46920tgK.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46920tgK.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AEQbTJ;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JPushConfig(hostUrl=" + this.copydefault + ", reportUrl=" + this.KWHzl + ", port=" + this.OLrzqt + ", channelId=" + this.AEQbTJ + ", channelName=" + this.EZpvd + ")";
    }

    public C46920tgK(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
        this.EZpvd = str5;
    }
}
