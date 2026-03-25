package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.user.TokenType;

/* JADX INFO: loaded from: classes14.dex */
public final class BvH {
    public static final int $stable = 8;
    public BvK AEQbTJ;
    public java.lang.String AYXKKw;
    public TokenType AhwBna;
    public java.lang.Boolean EZpvd;
    public boolean KWHzl;
    public C5007Bzd OLrzqt;
    public BvI copydefault;
    public java.lang.String djBIcL;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BvH AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TokenType tokenType, @NotNull java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, BvK bvK, C5007Bzd c5007Bzd, BvI bvI, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BvH(str, str2, str3, tokenType, str4, str5, bool, bvK, c5007Bzd, bvI, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5007Bzd AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenType AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AkhnZx() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BvI OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BvK copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BvH)) {
            return false;
        }
        BvH bvH = (BvH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) bvH.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) bvH.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) bvH.valueOf) && this.AhwBna == bvH.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) bvH.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) bvH.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, bvH.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, bvH.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, bvH.OLrzqt) && Intrinsics.EZpvd(this.copydefault, bvH.copydefault) && this.KWHzl == bvH.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        int iHashCode2 = this.fetchVPNInfo.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.EZpvd;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        BvK bvK = this.AEQbTJ;
        int iHashCode8 = bvK == null ? 0 : bvK.hashCode();
        C5007Bzd c5007Bzd = this.OLrzqt;
        int iHashCode9 = c5007Bzd == null ? 0 : c5007Bzd.hashCode();
        BvI bvI = this.copydefault;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (bvI != null ? bvI.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoreUser(uid=" + this.djBIcL + ", username=" + this.fetchVPNInfo + ", token=" + this.valueOf + ", tokenType=" + this.AhwBna + ", tk=" + this.AYXKKw + ", siteCode=" + this.gEmmrt + ", isTest=" + this.EZpvd + ", info=" + this.AEQbTJ + ", profile=" + this.OLrzqt + ", personalSetting=" + this.copydefault + ", isLogin=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public BvH(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TokenType tokenType, @NotNull java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, BvK bvK, C5007Bzd c5007Bzd, BvI bvI, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL = str;
        this.fetchVPNInfo = str2;
        this.valueOf = str3;
        this.AhwBna = tokenType;
        this.AYXKKw = str4;
        this.gEmmrt = str5;
        this.EZpvd = bool;
        this.AEQbTJ = bvK;
        this.OLrzqt = c5007Bzd;
        this.copydefault = bvI;
        this.KWHzl = z;
    }
}
