package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.TriggerSource;

/* JADX INFO: loaded from: classes13.dex */
public final class APL {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public TriggerSource AhwBna;
    public java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public java.lang.String KWHzl;
    public byte[] OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerSource AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APL OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TriggerSource triggerSource, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new APL(map, bArr, str, str2, str3, triggerSource, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
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
        if (!(obj instanceof APL)) {
            return false;
        }
        APL apl = (APL) obj;
        return Intrinsics.EZpvd(this.EZpvd, apl.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, apl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) apl.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) apl.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) apl.AEQbTJ) && this.AhwBna == apl.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) apl.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) apl.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) apl.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) apl.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) apl.isConnected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        byte[] bArr = this.OLrzqt;
        int iHashCode2 = bArr == null ? 0 : java.util.Arrays.hashCode(bArr);
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = this.AhwBna.hashCode();
        int iHashCode7 = this.djBIcL.hashCode();
        java.lang.String str = this.valueOf;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.isConnected;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareParamsCommon(extras=" + this.EZpvd + ", extrasAndroidBundle=" + java.util.Arrays.toString(this.OLrzqt) + ", title=" + this.gEmmrt + ", subtitle=" + this.AYXKKw + ", body=" + this.AEQbTJ + ", triggerSource=" + this.AhwBna + ", shareFrom=" + this.djBIcL + ", smsBody=" + this.valueOf + ", emailBody=" + this.KWHzl + ", emailSubject=" + this.copydefault + ", wcMomentBody=" + this.isConnected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public APL(@NotNull java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TriggerSource triggerSource, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = map;
        this.OLrzqt = bArr;
        this.gEmmrt = str;
        this.AYXKKw = str2;
        this.AEQbTJ = str3;
        this.AhwBna = triggerSource;
        this.djBIcL = str4;
        this.valueOf = str5;
        this.KWHzl = str6;
        this.copydefault = str7;
        this.isConnected = str8;
    }
}
