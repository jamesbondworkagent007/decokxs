package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54138wyh {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54138wyh copy$default(C54138wyh c54138wyh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c54138wyh.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c54138wyh.OLrzqt;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c54138wyh.copydefault;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c54138wyh.gEmmrt;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c54138wyh.valueOf;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c54138wyh.AEQbTJ;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c54138wyh.EZpvd;
        }
        return c54138wyh.OLrzqt(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54138wyh OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C54138wyh(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof C54138wyh)) {
            return false;
        }
        C54138wyh c54138wyh = (C54138wyh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c54138wyh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c54138wyh.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c54138wyh.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c54138wyh.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c54138wyh.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c54138wyh.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c54138wyh.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AutoProfitHistoryUiState(amount=" + this.KWHzl + ", profit=" + this.OLrzqt + ", rateRatio=" + this.copydefault + ", vipLevel=" + this.gEmmrt + ", time=" + this.valueOf + ", earnType=" + this.AEQbTJ + ", ccy=" + this.EZpvd + ")";
    }

    public C54138wyh(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.gEmmrt = str4;
        this.valueOf = str5;
        this.AEQbTJ = str6;
        this.EZpvd = str7;
    }
}
