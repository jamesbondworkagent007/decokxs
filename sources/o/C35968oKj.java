package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35968oKj {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35968oKj copy$default(C35968oKj c35968oKj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c35968oKj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c35968oKj.copydefault;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c35968oKj.KWHzl;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c35968oKj.AYXKKw;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c35968oKj.OLrzqt;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c35968oKj.gEmmrt;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c35968oKj.EZpvd;
        }
        return c35968oKj.KWHzl(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35968oKj KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C35968oKj(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35968oKj)) {
            return false;
        }
        C35968oKj c35968oKj = (C35968oKj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c35968oKj.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35968oKj.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35968oKj.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c35968oKj.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c35968oKj.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c35968oKj.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c35968oKj.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineCedefiTokenBean(chainId=" + this.AEQbTJ + ", tokenAddress=" + this.copydefault + ", chainName=" + this.KWHzl + ", tokenSymbol=" + this.AYXKKw + ", chainLogoUrl=" + this.OLrzqt + ", tokenLogoUrl=" + this.gEmmrt + ", riskControlLevel=" + this.EZpvd + ")";
    }

    public C35968oKj(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.AYXKKw = str4;
        this.OLrzqt = str5;
        this.gEmmrt = str6;
        this.EZpvd = str7;
    }
}
