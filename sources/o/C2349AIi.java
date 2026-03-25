package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C2349AIi {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public java.lang.Integer copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2349AIi KWHzl(boolean z, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C2349AIi(z, i, str, str2, str3, num, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2349AIi)) {
            return false;
        }
        C2349AIi c2349AIi = (C2349AIi) obj;
        return this.AYXKKw == c2349AIi.AYXKKw && this.OLrzqt == c2349AIi.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c2349AIi.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c2349AIi.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c2349AIi.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c2349AIi.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2349AIi.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2349AIi.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c2349AIi.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c2349AIi.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2349AIi.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode2 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.copydefault;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.DbNXlk;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.valueOf;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.AEQbTJ;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeatureInfo(isSuccess=" + this.AYXKKw + ", code=" + this.OLrzqt + ", message=" + this.djBIcL + ", featureCode=" + this.AhwBna + ", featureName=" + this.gEmmrt + ", defaultStatus=" + this.copydefault + ", app=" + this.KWHzl + ", channelId=" + this.EZpvd + ", platform=" + this.DbNXlk + ", link=" + this.valueOf + ", extraConfigJson=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C2349AIi(boolean z, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = z;
        this.OLrzqt = i;
        this.djBIcL = str;
        this.AhwBna = str2;
        this.gEmmrt = str3;
        this.copydefault = num;
        this.KWHzl = str4;
        this.EZpvd = str5;
        this.DbNXlk = str6;
        this.valueOf = str7;
        this.AEQbTJ = str8;
    }
}
