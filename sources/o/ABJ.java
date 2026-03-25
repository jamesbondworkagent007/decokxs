package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ABJ {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ABJ copy$default(ABJ abj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = abj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = abj.OLrzqt;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = abj.EZpvd;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = abj.KWHzl;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = abj.copydefault;
        }
        return abj.OLrzqt(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABJ OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ABJ(str, str2, str3, str4, str5);
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
        if (!(obj instanceof ABJ)) {
            return false;
        }
        ABJ abj = (ABJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) abj.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) abj.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) abj.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) abj.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) abj.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexPoolTokenInfo(amount=" + this.AEQbTJ + ", tokenAmountUsd=" + this.OLrzqt + ", tokenContractAddress=" + this.EZpvd + ", tokenSymbol=" + this.KWHzl + ", tokenLogoUrl=" + this.copydefault + ")";
    }

    public ABJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.KWHzl = str4;
        this.copydefault = str5;
    }
}
