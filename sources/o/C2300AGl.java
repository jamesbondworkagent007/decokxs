package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AGl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2300AGl {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2300AGl copy$default(C2300AGl c2300AGl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2300AGl.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c2300AGl.KWHzl;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c2300AGl.EZpvd;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c2300AGl.AEQbTJ;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c2300AGl.copydefault;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c2300AGl.AhwBna;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c2300AGl.AYXKKw;
        }
        return c2300AGl.KWHzl(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
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
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2300AGl KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C2300AGl(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof C2300AGl)) {
            return false;
        }
        C2300AGl c2300AGl = (C2300AGl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2300AGl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2300AGl.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2300AGl.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2300AGl.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2300AGl.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c2300AGl.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c2300AGl.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RiskDetailData(newRiskDesc=" + this.OLrzqt + ", newRiskLabel=" + this.KWHzl + ", newRiskName=" + this.EZpvd + ", riskControlLevel=" + this.AEQbTJ + ", riskDesc=" + this.copydefault + ", riskKey=" + this.AhwBna + ", riskName=" + this.AYXKKw + ")";
    }

    public C2300AGl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.AEQbTJ = str4;
        this.copydefault = str5;
        this.AhwBna = str6;
        this.AYXKKw = str7;
    }
}
