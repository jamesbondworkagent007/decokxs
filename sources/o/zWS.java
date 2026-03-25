package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zWS {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public java.util.List<java.lang.String> KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zWS AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new zWS(str, str2, str3, str4, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof zWS)) {
            return false;
        }
        zWS zws = (zWS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zws.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zws.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zws.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) zws.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) zws.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) zws.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) zws.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, zws.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyRegistrationParam(challenge=" + this.copydefault + ", rpId=" + this.EZpvd + ", rpName=" + this.AEQbTJ + ", userId=" + this.djBIcL + ", userName=" + this.valueOf + ", userDisplayName=" + this.AYXKKw + ", attestation=" + this.OLrzqt + ", excludeCredentials=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public zWS(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.djBIcL = str4;
        this.valueOf = str5;
        this.AYXKKw = str6;
        this.OLrzqt = str7;
        this.KWHzl = list;
    }
}
