package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oUF {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public double AhwBna;
    public java.lang.String AkhnZx;
    public double AuCTel;
    public java.lang.String DbNXlk;
    public double EZpvd;
    public java.lang.String KWHzl;
    public double OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String ejfBZ;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oUF() {
        this(null, null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oUF copy$default(oUF ouf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, double d, java.lang.String str6, java.lang.String str7, java.lang.String str8, double d2, java.lang.String str9, java.lang.String str10, java.lang.String str11, double d3, java.lang.String str12, java.lang.String str13, double d4, int i, java.lang.Object obj) {
        java.lang.String str14 = (i & 1) != 0 ? ouf.ejfBZ : str;
        java.lang.String str15 = (i & 2) != 0 ? ouf.fetchVPNInfo : str2;
        java.lang.String str16 = (i & 4) != 0 ? ouf.gEmmrt : str3;
        java.lang.String str17 = (i & 8) != 0 ? ouf.djBIcL : str4;
        java.lang.String str18 = (i & 16) != 0 ? ouf.AYXKKw : str5;
        double d5 = (i & 32) != 0 ? ouf.OLrzqt : d;
        java.lang.String str19 = (i & 64) != 0 ? ouf.AEQbTJ : str6;
        java.lang.String str20 = (i & 128) != 0 ? ouf.KWHzl : str7;
        java.lang.String str21 = (i & 256) != 0 ? ouf.copydefault : str8;
        double d6 = (i & 512) != 0 ? ouf.EZpvd : d2;
        java.lang.String str22 = (i & 1024) != 0 ? ouf.AkhnZx : str9;
        return ouf.copydefault(str14, str15, str16, str17, str18, d5, str19, str20, str21, d6, str22, (i & 2048) != 0 ? ouf.DbNXlk : str10, (i & 4096) != 0 ? ouf.valueOf : str11, (i & 8192) != 0 ? ouf.AhwBna : d3, (i & 16384) != 0 ? ouf.values : str12, (32768 & i) != 0 ? ouf.isConnected : str13, (i & 65536) != 0 ? ouf.AuCTel : d4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.DbNXlk;
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
    public final double OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUF copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, double d, java.lang.String str6, java.lang.String str7, java.lang.String str8, double d2, java.lang.String str9, java.lang.String str10, java.lang.String str11, double d3, java.lang.String str12, java.lang.String str13, double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new oUF(str, str2, str3, str4, str5, d, str6, str7, str8, d2, str9, str10, str11, d3, str12, str13, d4);
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
        if (!(obj instanceof oUF)) {
            return false;
        }
        oUF ouf = (oUF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) ouf.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) ouf.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) ouf.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) ouf.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) ouf.AYXKKw) && java.lang.Double.compare(this.OLrzqt, ouf.OLrzqt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ouf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ouf.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ouf.copydefault) && java.lang.Double.compare(this.EZpvd, ouf.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) ouf.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) ouf.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) ouf.valueOf) && java.lang.Double.compare(this.AhwBna, ouf.AhwBna) == 0 && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) ouf.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) ouf.isConnected) && java.lang.Double.compare(this.AuCTel, ouf.AuCTel) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2 = this.ejfBZ.hashCode();
        java.lang.String str = this.fetchVPNInfo;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.gEmmrt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.djBIcL;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AYXKKw;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = java.lang.Double.hashCode(this.OLrzqt);
        java.lang.String str5 = this.AEQbTJ;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.KWHzl;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.copydefault;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        int iHashCode11 = java.lang.Double.hashCode(this.EZpvd);
        java.lang.String str8 = this.AkhnZx;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.DbNXlk;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.valueOf;
        if (str10 == null) {
            i = iHashCode4;
            iHashCode = 0;
        } else {
            iHashCode = str10.hashCode();
            i = iHashCode4;
        }
        int iHashCode14 = java.lang.Double.hashCode(this.AhwBna);
        java.lang.String str11 = this.values;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        java.lang.String str12 = this.isConnected;
        return (((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + i) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str12 == null ? 0 : str12.hashCode())) * 31) + java.lang.Double.hashCode(this.AuCTel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FutureIndicatorPlotterData(time=" + this.ejfBZ + ", oiVol=" + this.fetchVPNInfo + ", elsAccountLongPercent=" + this.gEmmrt + ", elsAccountShortPercent=" + this.djBIcL + ", elsAccountLSRatio=" + this.AYXKKw + ", elsAccountDiff=" + this.OLrzqt + ", elLSOILongPercent=" + this.AEQbTJ + ", elLSOIShortPercent=" + this.KWHzl + ", elLSOILSRatio=" + this.copydefault + ", elLSOIDiff=" + this.EZpvd + ", lSAccountLongPercent=" + this.AkhnZx + ", lSAccountShortPercent=" + this.DbNXlk + ", lSAccountLSRatio=" + this.valueOf + ", lSAccountDiff=" + this.AhwBna + ", takerBuyVolume=" + this.values + ", takerSellVolume=" + this.isConnected + ", totalBSVolume=" + this.AuCTel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.values;
    }

    public oUF(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, double d, java.lang.String str6, java.lang.String str7, java.lang.String str8, double d2, java.lang.String str9, java.lang.String str10, java.lang.String str11, double d3, java.lang.String str12, java.lang.String str13, double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
        this.fetchVPNInfo = str2;
        this.gEmmrt = str3;
        this.djBIcL = str4;
        this.AYXKKw = str5;
        this.OLrzqt = d;
        this.AEQbTJ = str6;
        this.KWHzl = str7;
        this.copydefault = str8;
        this.EZpvd = d2;
        this.AkhnZx = str9;
        this.DbNXlk = str10;
        this.valueOf = str11;
        this.AhwBna = d3;
        this.values = str12;
        this.isConnected = str13;
        this.AuCTel = d4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r27v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r28v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("0") : (r32v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x004d: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r33v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("0") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("0") : (r36v0 java.lang.String))
  (wrap:java.lang.String:0x0071: TERNARY null = ((wrap:int:0x0068: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("0") : (r37v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0073: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0077: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r38v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("0") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("0") : (r41v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0093: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0097: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r42v0 double))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, double):void (m)] (LINE:3) call: o.oUF.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, double):void type: THIS */
    public /* synthetic */ oUF(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, double d, java.lang.String str6, java.lang.String str7, java.lang.String str8, double d2, java.lang.String str9, java.lang.String str10, java.lang.String str11, double d3, java.lang.String str12, java.lang.String str13, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? "0" : str4, (i & 16) != 0 ? "0" : str5, (i & 32) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 64) != 0 ? "0" : str6, (i & 128) != 0 ? "0" : str7, (i & 256) != 0 ? "0" : str8, (i & 512) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d2, (i & 1024) != 0 ? "0" : str9, (i & 2048) != 0 ? "0" : str10, (i & 4096) != 0 ? "0" : str11, (i & 8192) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d3, (i & 16384) != 0 ? "0" : str12, (i & 32768) != 0 ? "0" : str13, (i & 65536) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d4);
    }
}
