package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ABg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2165ABg {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<ABJ> AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.ABg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2165ABg copy$default(C2165ABg c2165ABg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2165ABg.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c2165ABg.EZpvd;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = c2165ABg.AEQbTJ;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = c2165ABg.OLrzqt;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = c2165ABg.AhwBna;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = c2165ABg.copydefault;
        }
        java.lang.String str11 = str6;
        if ((i & 64) != 0) {
            list = c2165ABg.AYXKKw;
        }
        return c2165ABg.AEQbTJ(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2165ABg AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<ABJ> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C2165ABg(str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2165ABg)) {
            return false;
        }
        C2165ABg c2165ABg = (C2165ABg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2165ABg.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2165ABg.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2165ABg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2165ABg.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c2165ABg.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2165ABg.copydefault) && Intrinsics.EZpvd(this.AYXKKw, c2165ABg.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ABJ> gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexPoolInfo(dexName=" + this.KWHzl + ", creatorAddress=" + this.EZpvd + ", explorerUrl=" + this.AEQbTJ + ", liquidity=" + this.OLrzqt + ", poolLogoUrl=" + this.AhwBna + ", pairAddress=" + this.copydefault + ", poolTokenInfoList=" + this.AYXKKw + ")";
    }

    public C2165ABg(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<ABJ> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.AhwBna = str5;
        this.copydefault = str6;
        this.AYXKKw = list;
    }
}
