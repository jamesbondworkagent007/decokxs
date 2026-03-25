package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Axt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4071Axt {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public double AkhnZx;
    public double AuCTel;
    public float AuCTelauCTel;
    public double AubY;
    public double AwvSrB;
    public float AxsJAY;
    public float AxsJAYaxsJAY;
    public boolean DTwDnp;
    public double DbNXlk;
    public int EZpvd;
    public float KWHzl;
    public int OLrzqt;
    public int ORxRYg;
    public boolean OcIXYQ;
    public float QKVWgx;
    public long QOLQEE;
    public int QUSxYX;
    public int QVAiDq;
    public boolean QbewEr;
    public int QfsBiF;
    public double RJOkX;
    public int RcXXUw;
    public int UeEOUB;
    public boolean aKErDB;
    public int copydefault;
    public int dNCPSb;
    public int djBIcL;
    public boolean djSkpj;
    public int dvKsVJ;
    public boolean dxcTrN;
    public double ejfBZ;
    public double fARcdN;
    public boolean fFgQHt;
    public double fIwbmz;
    public boolean fJNWhG;
    public boolean fZBcTu;
    public double fetchVPNInfo;
    public int finit;
    public float flVtFt;
    public int fvQaOB;
    public int gEmmrt;
    public float gGvvIC;
    public java.lang.String gHZMYf;
    public boolean gasjUx;
    public double getFieldNames;
    public double getNewProxyInstance;
    public java.lang.String giSNqX;
    public double hDKMBd;
    public boolean hUfVAv;
    public boolean isConnected;
    public double iwGUEr;
    public boolean sSMYrx;
    public double uzCIH;
    public int valueOf;
    public boolean values;
    public boolean wlaJM;
    public double zLjUOn;
    public double zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4071Axt copy$default(C4071Axt c4071Axt, int i, float f, float f2, double d, boolean z, double d2, boolean z2, int i2, int i3, int i4, boolean z3, float f3, boolean z4, int i5, int i6, int i7, float f4, float f5, int i8, int i9, int i10, float f6, boolean z5, double d3, boolean z6, long j, boolean z7, boolean z8, boolean z9, float f7, float f8, float f9, boolean z10, double d4, double d5, boolean z11, boolean z12, int i11, int i12, boolean z13, int i13, boolean z14, int i14, int i15, boolean z15, int i16, boolean z16, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, float f10, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        int i19 = (i17 & 1) != 0 ? c4071Axt.fvQaOB : i;
        float f11 = (i17 & 2) != 0 ? c4071Axt.QKVWgx : f;
        float f12 = (i17 & 4) != 0 ? c4071Axt.AxsJAY : f2;
        double d18 = (i17 & 8) != 0 ? c4071Axt.zsXlph : d;
        boolean z17 = (i17 & 16) != 0 ? c4071Axt.hUfVAv : z;
        double d19 = (i17 & 32) != 0 ? c4071Axt.AubY : d2;
        boolean z18 = (i17 & 64) != 0 ? c4071Axt.wlaJM : z2;
        int i20 = (i17 & 128) != 0 ? c4071Axt.QVAiDq : i2;
        int i21 = (i17 & 256) != 0 ? c4071Axt.finit : i3;
        int i22 = (i17 & 512) != 0 ? c4071Axt.dvKsVJ : i4;
        boolean z19 = (i17 & 1024) != 0 ? c4071Axt.OcIXYQ : z3;
        float f13 = (i17 & 2048) != 0 ? c4071Axt.AYXKKw : f3;
        boolean z20 = (i17 & 4096) != 0 ? c4071Axt.AEQbTJ : z4;
        int i23 = (i17 & 8192) != 0 ? c4071Axt.valueOf : i5;
        int i24 = (i17 & 16384) != 0 ? c4071Axt.copydefault : i6;
        int i25 = (i17 & 32768) != 0 ? c4071Axt.OLrzqt : i7;
        float f14 = (i17 & 65536) != 0 ? c4071Axt.KWHzl : f4;
        float f15 = (i17 & 131072) != 0 ? c4071Axt.AhwBna : f5;
        int i26 = (i17 & 262144) != 0 ? c4071Axt.gEmmrt : i8;
        int i27 = (i17 & 524288) != 0 ? c4071Axt.djBIcL : i9;
        int i28 = (i17 & 1048576) != 0 ? c4071Axt.EZpvd : i10;
        float f16 = (i17 & 2097152) != 0 ? c4071Axt.gGvvIC : f6;
        int i29 = i22;
        boolean z21 = (i17 & 4194304) != 0 ? c4071Axt.values : z5;
        double d20 = (i17 & 8388608) != 0 ? c4071Axt.fetchVPNInfo : d3;
        boolean z22 = (i17 & 16777216) != 0 ? c4071Axt.isConnected : z6;
        long j2 = (33554432 & i17) != 0 ? c4071Axt.QOLQEE : j;
        boolean z23 = (i17 & 67108864) != 0 ? c4071Axt.fZBcTu : z7;
        boolean z24 = (134217728 & i17) != 0 ? c4071Axt.gasjUx : z8;
        boolean z25 = (i17 & 268435456) != 0 ? c4071Axt.fFgQHt : z9;
        float f17 = (i17 & 536870912) != 0 ? c4071Axt.AxsJAYaxsJAY : f7;
        float f18 = (i17 & 1073741824) != 0 ? c4071Axt.AuCTelauCTel : f8;
        return c4071Axt.copydefault(i19, f11, f12, d18, z17, d19, z18, i20, i21, i29, z19, f13, z20, i23, i24, i25, f14, f15, i26, i27, i28, f16, z21, d20, z22, j2, z23, z24, z25, f17, f18, (i17 & Integer.MIN_VALUE) != 0 ? c4071Axt.zuBGHE : f9, (i18 & 1) != 0 ? c4071Axt.sSMYrx : z10, (i18 & 2) != 0 ? c4071Axt.AwvSrB : d4, (i18 & 4) != 0 ? c4071Axt.RJOkX : d5, (i18 & 8) != 0 ? c4071Axt.dxcTrN : z11, (i18 & 16) != 0 ? c4071Axt.djSkpj : z12, (i18 & 32) != 0 ? c4071Axt.dNCPSb : i11, (i18 & 64) != 0 ? c4071Axt.RcXXUw : i12, (i18 & 128) != 0 ? c4071Axt.DTwDnp : z13, (i18 & 256) != 0 ? c4071Axt.ORxRYg : i13, (i18 & 512) != 0 ? c4071Axt.QbewEr : z14, (i18 & 1024) != 0 ? c4071Axt.QUSxYX : i14, (i18 & 2048) != 0 ? c4071Axt.QfsBiF : i15, (i18 & 4096) != 0 ? c4071Axt.aKErDB : z15, (i18 & 8192) != 0 ? c4071Axt.UeEOUB : i16, (i18 & 16384) != 0 ? c4071Axt.fJNWhG : z16, (i18 & 32768) != 0 ? c4071Axt.ejfBZ : d6, (i18 & 65536) != 0 ? c4071Axt.AuCTel : d7, (i18 & 131072) != 0 ? c4071Axt.fIwbmz : d8, (i18 & 262144) != 0 ? c4071Axt.fARcdN : d9, (i18 & 524288) != 0 ? c4071Axt.uzCIH : d10, (i18 & 1048576) != 0 ? c4071Axt.getNewProxyInstance : d11, (i18 & 2097152) != 0 ? c4071Axt.getFieldNames : d12, (i18 & 4194304) != 0 ? c4071Axt.zLjUOn : d13, (i18 & 8388608) != 0 ? c4071Axt.AkhnZx : d14, (i18 & 16777216) != 0 ? c4071Axt.hDKMBd : d15, (i18 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c4071Axt.DbNXlk : d16, (i18 & 67108864) != 0 ? c4071Axt.iwGUEr : d17, (i18 & 134217728) != 0 ? c4071Axt.flVtFt : f10, (268435456 & i18) != 0 ? c4071Axt.gHZMYf : str, (i18 & 536870912) != 0 ? c4071Axt.giSNqX : str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AuCTelauCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AubY() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DTwDnp() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long ORxRYg() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OcIXYQ() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QKVWgx() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float QOLQEE() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QUSxYX() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QVAiDq() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double QbewEr() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QfsBiF() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RJOkX() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int RcXXUw() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean UeEOUB() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean aKErDB() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4071Axt copydefault(int i, float f, float f2, double d, boolean z, double d2, boolean z2, int i2, int i3, int i4, boolean z3, float f3, boolean z4, int i5, int i6, int i7, float f4, float f5, int i8, int i9, int i10, float f6, boolean z5, double d3, boolean z6, long j, boolean z7, boolean z8, boolean z9, float f7, float f8, float f9, boolean z10, double d4, double d5, boolean z11, boolean z12, int i11, int i12, boolean z13, int i13, boolean z14, int i14, int i15, boolean z15, int i16, boolean z16, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, float f10, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C4071Axt(i, f, f2, d, z, d2, z2, i2, i3, i4, z3, f3, z4, i5, i6, i7, f4, f5, i8, i9, i10, f6, z5, d3, z6, j, z7, z8, z9, f7, f8, f9, z10, d4, d5, z11, z12, i11, i12, z13, i13, z14, i14, i15, z15, i16, z16, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, f10, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int dNCPSb() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djSkpj() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int dvKsVJ() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dxcTrN() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4071Axt)) {
            return false;
        }
        C4071Axt c4071Axt = (C4071Axt) obj;
        return this.fvQaOB == c4071Axt.fvQaOB && java.lang.Float.compare(this.QKVWgx, c4071Axt.QKVWgx) == 0 && java.lang.Float.compare(this.AxsJAY, c4071Axt.AxsJAY) == 0 && java.lang.Double.compare(this.zsXlph, c4071Axt.zsXlph) == 0 && this.hUfVAv == c4071Axt.hUfVAv && java.lang.Double.compare(this.AubY, c4071Axt.AubY) == 0 && this.wlaJM == c4071Axt.wlaJM && this.QVAiDq == c4071Axt.QVAiDq && this.finit == c4071Axt.finit && this.dvKsVJ == c4071Axt.dvKsVJ && this.OcIXYQ == c4071Axt.OcIXYQ && java.lang.Float.compare(this.AYXKKw, c4071Axt.AYXKKw) == 0 && this.AEQbTJ == c4071Axt.AEQbTJ && this.valueOf == c4071Axt.valueOf && this.copydefault == c4071Axt.copydefault && this.OLrzqt == c4071Axt.OLrzqt && java.lang.Float.compare(this.KWHzl, c4071Axt.KWHzl) == 0 && java.lang.Float.compare(this.AhwBna, c4071Axt.AhwBna) == 0 && this.gEmmrt == c4071Axt.gEmmrt && this.djBIcL == c4071Axt.djBIcL && this.EZpvd == c4071Axt.EZpvd && java.lang.Float.compare(this.gGvvIC, c4071Axt.gGvvIC) == 0 && this.values == c4071Axt.values && java.lang.Double.compare(this.fetchVPNInfo, c4071Axt.fetchVPNInfo) == 0 && this.isConnected == c4071Axt.isConnected && this.QOLQEE == c4071Axt.QOLQEE && this.fZBcTu == c4071Axt.fZBcTu && this.gasjUx == c4071Axt.gasjUx && this.fFgQHt == c4071Axt.fFgQHt && java.lang.Float.compare(this.AxsJAYaxsJAY, c4071Axt.AxsJAYaxsJAY) == 0 && java.lang.Float.compare(this.AuCTelauCTel, c4071Axt.AuCTelauCTel) == 0 && java.lang.Float.compare(this.zuBGHE, c4071Axt.zuBGHE) == 0 && this.sSMYrx == c4071Axt.sSMYrx && java.lang.Double.compare(this.AwvSrB, c4071Axt.AwvSrB) == 0 && java.lang.Double.compare(this.RJOkX, c4071Axt.RJOkX) == 0 && this.dxcTrN == c4071Axt.dxcTrN && this.djSkpj == c4071Axt.djSkpj && this.dNCPSb == c4071Axt.dNCPSb && this.RcXXUw == c4071Axt.RcXXUw && this.DTwDnp == c4071Axt.DTwDnp && this.ORxRYg == c4071Axt.ORxRYg && this.QbewEr == c4071Axt.QbewEr && this.QUSxYX == c4071Axt.QUSxYX && this.QfsBiF == c4071Axt.QfsBiF && this.aKErDB == c4071Axt.aKErDB && this.UeEOUB == c4071Axt.UeEOUB && this.fJNWhG == c4071Axt.fJNWhG && java.lang.Double.compare(this.ejfBZ, c4071Axt.ejfBZ) == 0 && java.lang.Double.compare(this.AuCTel, c4071Axt.AuCTel) == 0 && java.lang.Double.compare(this.fIwbmz, c4071Axt.fIwbmz) == 0 && java.lang.Double.compare(this.fARcdN, c4071Axt.fARcdN) == 0 && java.lang.Double.compare(this.uzCIH, c4071Axt.uzCIH) == 0 && java.lang.Double.compare(this.getNewProxyInstance, c4071Axt.getNewProxyInstance) == 0 && java.lang.Double.compare(this.getFieldNames, c4071Axt.getFieldNames) == 0 && java.lang.Double.compare(this.zLjUOn, c4071Axt.zLjUOn) == 0 && java.lang.Double.compare(this.AkhnZx, c4071Axt.AkhnZx) == 0 && java.lang.Double.compare(this.hDKMBd, c4071Axt.hDKMBd) == 0 && java.lang.Double.compare(this.DbNXlk, c4071Axt.DbNXlk) == 0 && java.lang.Double.compare(this.iwGUEr, c4071Axt.iwGUEr) == 0 && java.lang.Float.compare(this.flVtFt, c4071Axt.flVtFt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) c4071Axt.gHZMYf) && Intrinsics.EZpvd((java.lang.Object) this.giSNqX, (java.lang.Object) c4071Axt.giSNqX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fFgQHt() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fZBcTu() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean finit() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean flVtFt() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fvQaOB() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gGvvIC() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gHZMYf() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gasjUx() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getFieldNames() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getNewProxyInstance() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float giSNqX() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double hDKMBd() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float hUfVAv() {
        return this.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.fvQaOB) * 31) + java.lang.Float.hashCode(this.QKVWgx)) * 31) + java.lang.Float.hashCode(this.AxsJAY)) * 31) + java.lang.Double.hashCode(this.zsXlph)) * 31) + java.lang.Boolean.hashCode(this.hUfVAv)) * 31) + java.lang.Double.hashCode(this.AubY)) * 31) + java.lang.Boolean.hashCode(this.wlaJM)) * 31) + java.lang.Integer.hashCode(this.QVAiDq)) * 31) + java.lang.Integer.hashCode(this.finit)) * 31) + java.lang.Integer.hashCode(this.dvKsVJ)) * 31) + java.lang.Boolean.hashCode(this.OcIXYQ)) * 31) + java.lang.Float.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.KWHzl)) * 31) + java.lang.Float.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Float.hashCode(this.gGvvIC)) * 31) + java.lang.Boolean.hashCode(this.values)) * 31) + java.lang.Double.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.isConnected)) * 31) + java.lang.Long.hashCode(this.QOLQEE)) * 31) + java.lang.Boolean.hashCode(this.fZBcTu)) * 31) + java.lang.Boolean.hashCode(this.gasjUx)) * 31) + java.lang.Boolean.hashCode(this.fFgQHt)) * 31) + java.lang.Float.hashCode(this.AxsJAYaxsJAY)) * 31) + java.lang.Float.hashCode(this.AuCTelauCTel)) * 31) + java.lang.Float.hashCode(this.zuBGHE)) * 31) + java.lang.Boolean.hashCode(this.sSMYrx)) * 31) + java.lang.Double.hashCode(this.AwvSrB)) * 31) + java.lang.Double.hashCode(this.RJOkX)) * 31) + java.lang.Boolean.hashCode(this.dxcTrN)) * 31) + java.lang.Boolean.hashCode(this.djSkpj)) * 31) + java.lang.Integer.hashCode(this.dNCPSb)) * 31) + java.lang.Integer.hashCode(this.RcXXUw)) * 31) + java.lang.Boolean.hashCode(this.DTwDnp)) * 31) + java.lang.Integer.hashCode(this.ORxRYg)) * 31) + java.lang.Boolean.hashCode(this.QbewEr)) * 31) + java.lang.Integer.hashCode(this.QUSxYX)) * 31) + java.lang.Integer.hashCode(this.QfsBiF)) * 31) + java.lang.Boolean.hashCode(this.aKErDB)) * 31) + java.lang.Integer.hashCode(this.UeEOUB)) * 31) + java.lang.Boolean.hashCode(this.fJNWhG)) * 31) + java.lang.Double.hashCode(this.ejfBZ)) * 31) + java.lang.Double.hashCode(this.AuCTel)) * 31) + java.lang.Double.hashCode(this.fIwbmz)) * 31) + java.lang.Double.hashCode(this.fARcdN)) * 31) + java.lang.Double.hashCode(this.uzCIH)) * 31) + java.lang.Double.hashCode(this.getNewProxyInstance)) * 31) + java.lang.Double.hashCode(this.getFieldNames)) * 31) + java.lang.Double.hashCode(this.zLjUOn)) * 31) + java.lang.Double.hashCode(this.AkhnZx)) * 31) + java.lang.Double.hashCode(this.hDKMBd)) * 31) + java.lang.Double.hashCode(this.DbNXlk)) * 31) + java.lang.Double.hashCode(this.iwGUEr)) * 31) + java.lang.Float.hashCode(this.flVtFt)) * 31) + this.gHZMYf.hashCode()) * 31) + this.giSNqX.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iZzfmt() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double iwGUEr() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double sSMYrx() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IdScanConfig(requiredSuccessCount=" + this.fvQaOB + ", farRatio=" + this.QKVWgx + ", closeRatio=" + this.AxsJAY + ", blurThreshold=" + this.zsXlph + ", useLaplacianBlur=" + this.hUfVAv + ", brightnessRatio=" + this.AubY + ", brightnessCheckEnabled=" + this.wlaJM + ", glareCountThreshold=" + this.QVAiDq + ", glareSplitThreshold=" + this.finit + ", glareSplitCount=" + this.dvKsVJ + ", glareCheckEnabled=" + this.OcIXYQ + ", angleThreshold=" + this.AYXKKw + ", angleCheckEnabled=" + this.AEQbTJ + ", angleMinPassCount=" + this.valueOf + ", angleGaussianBlurRadius=" + this.copydefault + ", angleCannyThreshold=" + this.OLrzqt + ", angleDetectionRatio=" + this.KWHzl + ", angleMinLengthRatio=" + this.AhwBna + ", angleHoughThreshold=" + this.gEmmrt + ", angleHoughMinLineLength=" + this.djBIcL + ", angleHoughMaxLineGap=" + this.EZpvd + ", shakeThreshold=" + this.gGvvIC + ", autofocusEnabled=" + this.values + ", autofocusBlurThreshold=" + this.fetchVPNInfo + ", autofocusUseCardCenter=" + this.isConnected + ", errorStatusInterval=" + this.QOLQEE + ", opencvFallbackEnabled=" + this.fZBcTu + ", opencvResetOnNoDetection=" + this.gasjUx + ", mlkitFailureUseOpencv=" + this.fFgQHt + ", spacingMultipleRatio=" + this.AxsJAYaxsJAY + ", boundsRatio=" + this.AuCTelauCTel + ", closeSpaceRatio=" + this.zuBGHE + ", centerCheckEnabled=" + this.sSMYrx + ", darkLaplaceRatio=" + this.AwvSrB + ", glareMinThresh=" + this.RJOkX + ", glareUseEnhanced=" + this.dxcTrN + ", glareSaturationOn=" + this.djSkpj + ", glareSaturationMin=" + this.dNCPSb + ", glareSaturationMax=" + this.RcXXUw + ", glareBlurOn=" + this.DTwDnp + ", glareBlurKernel=" + this.ORxRYg + ", glareMorphOn=" + this.QbewEr + ", glareMorphErosion=" + this.QUSxYX + ", glareMorphDilate=" + this.QfsBiF + ", glareResizeOn=" + this.aKErDB + ", glareResizeHeight=" + this.UeEOUB + ", blurFusionEnabled=" + this.fJNWhG + ", blurFusionLaplacianThreshold=" + this.ejfBZ + ", blurFusionCreteThreshold=" + this.AuCTel + ", blurFusionGyroThreshold=" + this.fIwbmz + ", blurFusionNoiseDeltaThreshold=" + this.fARcdN + ", blurFusionWeightLaplacian=" + this.uzCIH + ", blurFusionWeightCrete=" + this.getNewProxyInstance + ", blurFusionWeightGyro=" + this.getFieldNames + ", blurFusionZoneAccept=" + this.zLjUOn + ", blurFusionAutofocusLaplacianThreshold=" + this.AkhnZx + ", blurFusionSigmoidK=" + this.hDKMBd + ", blurFusionCenterCropRatio=" + this.DbNXlk + ", blurFusionNoiseInflatedThreshold=" + this.iwGUEr + ", outputPaddingRatio=" + this.flVtFt + ", cor=" + this.gHZMYf + ", pageType=" + this.giSNqX + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float wlaJM() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double zLjUOn() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float zuBGHE() {
        return this.zuBGHE;
    }

    public C4071Axt(int i, float f, float f2, double d, boolean z, double d2, boolean z2, int i2, int i3, int i4, boolean z3, float f3, boolean z4, int i5, int i6, int i7, float f4, float f5, int i8, int i9, int i10, float f6, boolean z5, double d3, boolean z6, long j, boolean z7, boolean z8, boolean z9, float f7, float f8, float f9, boolean z10, double d4, double d5, boolean z11, boolean z12, int i11, int i12, boolean z13, int i13, boolean z14, int i14, int i15, boolean z15, int i16, boolean z16, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, float f10, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fvQaOB = i;
        this.QKVWgx = f;
        this.AxsJAY = f2;
        this.zsXlph = d;
        this.hUfVAv = z;
        this.AubY = d2;
        this.wlaJM = z2;
        this.QVAiDq = i2;
        this.finit = i3;
        this.dvKsVJ = i4;
        this.OcIXYQ = z3;
        this.AYXKKw = f3;
        this.AEQbTJ = z4;
        this.valueOf = i5;
        this.copydefault = i6;
        this.OLrzqt = i7;
        this.KWHzl = f4;
        this.AhwBna = f5;
        this.gEmmrt = i8;
        this.djBIcL = i9;
        this.EZpvd = i10;
        this.gGvvIC = f6;
        this.values = z5;
        this.fetchVPNInfo = d3;
        this.isConnected = z6;
        this.QOLQEE = j;
        this.fZBcTu = z7;
        this.gasjUx = z8;
        this.fFgQHt = z9;
        this.AxsJAYaxsJAY = f7;
        this.AuCTelauCTel = f8;
        this.zuBGHE = f9;
        this.sSMYrx = z10;
        this.AwvSrB = d4;
        this.RJOkX = d5;
        this.dxcTrN = z11;
        this.djSkpj = z12;
        this.dNCPSb = i11;
        this.RcXXUw = i12;
        this.DTwDnp = z13;
        this.ORxRYg = i13;
        this.QbewEr = z14;
        this.QUSxYX = i14;
        this.QfsBiF = i15;
        this.aKErDB = z15;
        this.UeEOUB = i16;
        this.fJNWhG = z16;
        this.ejfBZ = d6;
        this.AuCTel = d7;
        this.fIwbmz = d8;
        this.fARcdN = d9;
        this.uzCIH = d10;
        this.getNewProxyInstance = d11;
        this.getFieldNames = d12;
        this.zLjUOn = d13;
        this.AkhnZx = d14;
        this.hDKMBd = d15;
        this.DbNXlk = d16;
        this.iwGUEr = d17;
        this.flVtFt = f10;
        this.gHZMYf = str;
        this.giSNqX = str2;
    }
}
