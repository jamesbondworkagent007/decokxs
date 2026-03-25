package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Azz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C4183Azz {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public java.util.List<C4176Azs> KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C4176Azs> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4183Azz OLrzqt(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<C4176Azs> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C4183Azz(z, str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4183Azz)) {
            return false;
        }
        C4183Azz c4183Azz = (C4183Azz) obj;
        return this.AEQbTJ == c4183Azz.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4183Azz.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c4183Azz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c4183Azz.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c4183Azz.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c4183Azz.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4183Azz.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c4183Azz.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AlertListResponse(native=" + this.AEQbTJ + ", chainId=" + this.EZpvd + ", tokenAddress=" + this.copydefault + ", tokenName=" + this.valueOf + ", tokenSymbol=" + this.djBIcL + ", tokenLogoUrl=" + this.AYXKKw + ", chainLogoUrl=" + this.OLrzqt + ", alerts=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public C4183Azz(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<C4176Azs> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = z;
        this.EZpvd = str;
        this.copydefault = str2;
        this.valueOf = str3;
        this.djBIcL = str4;
        this.AYXKKw = str5;
        this.OLrzqt = str6;
        this.KWHzl = list;
    }
}
