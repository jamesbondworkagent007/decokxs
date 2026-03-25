package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.AlertPromptType;
import uniffi.dex.AlertRepeatType;
import uniffi.dex.AlertType;

/* JADX INFO: renamed from: o.Azs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C4176Azs {
    public static final int $stable = 8;
    public AlertType AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public AlertPromptType gEmmrt;
    public AlertRepeatType valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertPromptType AhwBna() {
        return this.gEmmrt;
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
    public final C4176Azs KWHzl(@NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull AlertRepeatType alertRepeatType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C4176Azs(alertType, alertPromptType, alertRepeatType, str, str2, str3, str4, str5, z, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4176Azs)) {
            return false;
        }
        C4176Azs c4176Azs = (C4176Azs) obj;
        return this.AEQbTJ == c4176Azs.AEQbTJ && this.gEmmrt == c4176Azs.gEmmrt && this.valueOf == c4176Azs.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c4176Azs.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4176Azs.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c4176Azs.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c4176Azs.values) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c4176Azs.AYXKKw) && this.copydefault == c4176Azs.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4176Azs.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4176Azs.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRepeatType gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AlertDataResponse(alertType=" + this.AEQbTJ + ", promptType=" + this.gEmmrt + ", repeatType=" + this.valueOf + ", ruleId=" + this.AhwBna + ", chainId=" + this.KWHzl + ", tokenAddress=" + this.djBIcL + ", tokenSymbol=" + this.values + ", threshold=" + this.AYXKKw + ", active=" + this.copydefault + ", createTime=" + this.EZpvd + ", modifyTime=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C4176Azs(@NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull AlertRepeatType alertRepeatType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AEQbTJ = alertType;
        this.gEmmrt = alertPromptType;
        this.valueOf = alertRepeatType;
        this.AhwBna = str;
        this.KWHzl = str2;
        this.djBIcL = str3;
        this.values = str4;
        this.AYXKKw = str5;
        this.copydefault = z;
        this.EZpvd = str6;
        this.OLrzqt = str7;
    }
}
