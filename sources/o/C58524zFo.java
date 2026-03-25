package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.MfaStep;

/* JADX INFO: renamed from: o.zFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58524zFo {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public int AhwBna;
    public java.lang.String AkhnZx;
    public boolean DbNXlk;
    public java.util.List<java.lang.String> EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public int fIwbmz;
    public int fJNWhG;
    public java.lang.String fetchVPNInfo;
    public MfaStep gEmmrt;
    public java.lang.String isConnected;
    public int valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58524zFo copydefault(@NotNull MfaStep mfaStep, @NotNull java.util.List<java.lang.String> list, boolean z, boolean z2, boolean z3, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z4, boolean z5, java.lang.String str6, int i3, int i4) {
        Intrinsics.checkNotNullParameter(mfaStep, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C58524zFo(mfaStep, list, z, z2, z3, i, i2, str, str2, str3, str4, str5, z4, z5, str6, i3, i4);
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
        if (!(obj instanceof C58524zFo)) {
            return false;
        }
        C58524zFo c58524zFo = (C58524zFo) obj;
        return this.gEmmrt == c58524zFo.gEmmrt && Intrinsics.EZpvd(this.EZpvd, c58524zFo.EZpvd) && this.KWHzl == c58524zFo.KWHzl && this.copydefault == c58524zFo.copydefault && this.AEQbTJ == c58524zFo.AEQbTJ && this.valueOf == c58524zFo.valueOf && this.fJNWhG == c58524zFo.fJNWhG && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c58524zFo.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c58524zFo.values) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58524zFo.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c58524zFo.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c58524zFo.fetchVPNInfo) && this.DbNXlk == c58524zFo.DbNXlk && this.djBIcL == c58524zFo.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c58524zFo.AYXKKw) && this.fIwbmz == c58524zFo.fIwbmz && this.AhwBna == c58524zFo.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaStep gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode5 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode6 = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode7 = java.lang.Integer.hashCode(this.fJNWhG);
        java.lang.String str = this.AkhnZx;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.values;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.isConnected;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.fetchVPNInfo;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        int iHashCode13 = java.lang.Boolean.hashCode(this.DbNXlk);
        int iHashCode14 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.String str6 = this.AYXKKw;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31) + java.lang.Integer.hashCode(this.fIwbmz)) * 31) + java.lang.Integer.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MfaJourneyState(currentStep=" + this.gEmmrt + ", alternativeSteps=" + this.EZpvd + ", allowResetMfa=" + this.KWHzl + ", allowResetPasskey=" + this.copydefault + ", allowFaceVerifyWhitelist=" + this.AEQbTJ + ", currentStepper=" + this.valueOf + ", totalSteps=" + this.fJNWhG + ", maskedEmail=" + this.AkhnZx + ", maskedPhone=" + this.values + ", business=" + this.OLrzqt + ", scenario=" + this.isConnected + ", reminderContent=" + this.fetchVPNInfo + ", requiredCaptcha=" + this.DbNXlk + ", isPasskeyEnabled=" + this.djBIcL + ", currentAuthType=" + this.AYXKKw + ", totalCountdownTime=" + this.fIwbmz + ", countdownRemaining=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.fIwbmz;
    }

    public C58524zFo(@NotNull MfaStep mfaStep, @NotNull java.util.List<java.lang.String> list, boolean z, boolean z2, boolean z3, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z4, boolean z5, java.lang.String str6, int i3, int i4) {
        Intrinsics.checkNotNullParameter(mfaStep, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = mfaStep;
        this.EZpvd = list;
        this.KWHzl = z;
        this.copydefault = z2;
        this.AEQbTJ = z3;
        this.valueOf = i;
        this.fJNWhG = i2;
        this.AkhnZx = str;
        this.values = str2;
        this.OLrzqt = str3;
        this.isConnected = str4;
        this.fetchVPNInfo = str5;
        this.DbNXlk = z4;
        this.djBIcL = z5;
        this.AYXKKw = str6;
        this.fIwbmz = i3;
        this.AhwBna = i4;
    }
}
