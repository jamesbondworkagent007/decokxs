package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AGP {
    public static final int $stable = 8;
    public double AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public int AuCTel;
    public java.lang.String AuCTelauCTel;
    public int AubY;
    public int AwvSrB;
    public java.lang.String AxsJAY;
    public java.lang.String DTwDnp;
    public boolean DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.util.List<? extends java.util.List<java.lang.String>> ORxRYg;
    public java.lang.String OcIXYQ;
    public java.lang.String QKVWgx;
    public java.lang.String QOLQEE;
    public java.lang.String QUSxYX;
    public java.lang.String QVAiDq;
    public java.lang.String QbewEr;
    public int QfsBiF;
    public java.lang.String RJOkX;
    public java.lang.String RcXXUw;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public long copydefault;
    public java.lang.String djBIcL;
    public int djSkpj;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public long fJNWhG;
    public long fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String gHZMYf;
    public int getFieldNames;
    public int getNewProxyInstance;
    public int hDKMBd;
    public java.lang.String isConnected;
    public int iwGUEr;
    public java.lang.String sSMYrx;
    public int uzCIH;
    public java.lang.String valueOf;
    public java.lang.String values;
    public int wlaJM;
    public int zLjUOn;
    public java.lang.String zsXlph;
    public java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: o.AGP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AGP copy$default(AGP agp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, double d, java.lang.String str18, java.lang.String str19, java.lang.String str20, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, java.lang.String str21, java.lang.String str22, java.lang.String str23, int i12, java.lang.String str24, java.util.List list, java.lang.String str25, int i13, int i14, java.lang.String str26, java.lang.String str27, java.lang.String str28, int i15, long j, long j2, long j3, int i16, int i17, java.lang.Object obj) {
        java.lang.String str29 = (i16 & 1) != 0 ? agp.QOLQEE : str;
        java.lang.String str30 = (i16 & 2) != 0 ? agp.QUSxYX : str2;
        java.lang.String str31 = (i16 & 4) != 0 ? agp.RJOkX : str3;
        java.lang.String str32 = (i16 & 8) != 0 ? agp.QVAiDq : str4;
        int i18 = (i16 & 16) != 0 ? agp.QfsBiF : i;
        java.lang.String str33 = (i16 & 32) != 0 ? agp.aKErDB : str5;
        java.lang.String str34 = (i16 & 64) != 0 ? agp.gEmmrt : str6;
        java.lang.String str35 = (i16 & 128) != 0 ? agp.AhwBna : str7;
        java.lang.String str36 = (i16 & 256) != 0 ? agp.djBIcL : str8;
        java.lang.String str37 = (i16 & 512) != 0 ? agp.valueOf : str9;
        java.lang.String str38 = (i16 & 1024) != 0 ? agp.QbewEr : str10;
        java.lang.String str39 = (i16 & 2048) != 0 ? agp.AkhnZx : str11;
        return agp.KWHzl(str29, str30, str31, str32, i18, str33, str34, str35, str36, str37, str38, str39, (i16 & 4096) != 0 ? agp.AuCTelauCTel : str12, (i16 & 8192) != 0 ? agp.zsXlph : str13, (i16 & 16384) != 0 ? agp.UeEOUB : str14, (i16 & 32768) != 0 ? agp.RcXXUw : str15, (i16 & 65536) != 0 ? agp.EZpvd : str16, (i16 & 131072) != 0 ? agp.QKVWgx : str17, (i16 & 262144) != 0 ? agp.AEQbTJ : d, (i16 & 524288) != 0 ? agp.OcIXYQ : str18, (1048576 & i16) != 0 ? agp.KWHzl : str19, (i16 & 2097152) != 0 ? agp.OLrzqt : str20, (i16 & 4194304) != 0 ? agp.AuCTel : i2, (i16 & 8388608) != 0 ? agp.getFieldNames : i3, (i16 & 16777216) != 0 ? agp.getNewProxyInstance : i4, (i16 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? agp.hDKMBd : i5, (i16 & 67108864) != 0 ? agp.iwGUEr : i6, (i16 & 134217728) != 0 ? agp.uzCIH : i7, (i16 & 268435456) != 0 ? agp.wlaJM : i8, (i16 & 536870912) != 0 ? agp.fIwbmz : i9, (i16 & 1073741824) != 0 ? agp.AubY : i10, (i16 & Integer.MIN_VALUE) != 0 ? agp.zLjUOn : i11, (i17 & 1) != 0 ? agp.DbNXlk : z, (i17 & 2) != 0 ? agp.sSMYrx : str21, (i17 & 4) != 0 ? agp.AYXKKw : str22, (i17 & 8) != 0 ? agp.gHZMYf : str23, (i17 & 16) != 0 ? agp.djSkpj : i12, (i17 & 32) != 0 ? agp.isConnected : str24, (i17 & 64) != 0 ? agp.ORxRYg : list, (i17 & 128) != 0 ? agp.values : str25, (i17 & 256) != 0 ? agp.ejfBZ : i13, (i17 & 512) != 0 ? agp.fARcdN : i14, (i17 & 1024) != 0 ? agp.DTwDnp : str26, (i17 & 2048) != 0 ? agp.AxsJAY : str27, (i17 & 4096) != 0 ? agp.zuBGHE : str28, (i17 & 8192) != 0 ? agp.AwvSrB : i15, (i17 & 16384) != 0 ? agp.fetchVPNInfo : j, (i17 & 32768) != 0 ? agp.copydefault : j2, (i17 & 65536) != 0 ? agp.fJNWhG : j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTelauCTel() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AubY() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DTwDnp() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGP KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, double d, @NotNull java.lang.String str18, @NotNull java.lang.String str19, @NotNull java.lang.String str20, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, @NotNull java.lang.String str21, @NotNull java.lang.String str22, @NotNull java.lang.String str23, int i12, @NotNull java.lang.String str24, @NotNull java.util.List<? extends java.util.List<java.lang.String>> list, @NotNull java.lang.String str25, int i13, int i14, @NotNull java.lang.String str26, @NotNull java.lang.String str27, @NotNull java.lang.String str28, int i15, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        return new AGP(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, d, str18, str19, str20, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, z, str21, str22, str23, i12, str24, list, str25, i13, i14, str26, str27, str28, i15, j, j2, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int ORxRYg() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OcIXYQ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QKVWgx() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QOLQEE() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QUSxYX() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QVAiDq() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QbewEr() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QfsBiF() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int RJOkX() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int RcXXUw() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int UeEOUB() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int aKErDB() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int dNCPSb() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGP)) {
            return false;
        }
        AGP agp = (AGP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.QOLQEE, (java.lang.Object) agp.QOLQEE) && Intrinsics.EZpvd((java.lang.Object) this.QUSxYX, (java.lang.Object) agp.QUSxYX) && Intrinsics.EZpvd((java.lang.Object) this.RJOkX, (java.lang.Object) agp.RJOkX) && Intrinsics.EZpvd((java.lang.Object) this.QVAiDq, (java.lang.Object) agp.QVAiDq) && this.QfsBiF == agp.QfsBiF && Intrinsics.EZpvd((java.lang.Object) this.aKErDB, (java.lang.Object) agp.aKErDB) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) agp.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) agp.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) agp.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) agp.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.QbewEr, (java.lang.Object) agp.QbewEr) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) agp.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.AuCTelauCTel, (java.lang.Object) agp.AuCTelauCTel) && Intrinsics.EZpvd((java.lang.Object) this.zsXlph, (java.lang.Object) agp.zsXlph) && Intrinsics.EZpvd((java.lang.Object) this.UeEOUB, (java.lang.Object) agp.UeEOUB) && Intrinsics.EZpvd((java.lang.Object) this.RcXXUw, (java.lang.Object) agp.RcXXUw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) agp.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.QKVWgx, (java.lang.Object) agp.QKVWgx) && java.lang.Double.compare(this.AEQbTJ, agp.AEQbTJ) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OcIXYQ, (java.lang.Object) agp.OcIXYQ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) agp.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) agp.OLrzqt) && this.AuCTel == agp.AuCTel && this.getFieldNames == agp.getFieldNames && this.getNewProxyInstance == agp.getNewProxyInstance && this.hDKMBd == agp.hDKMBd && this.iwGUEr == agp.iwGUEr && this.uzCIH == agp.uzCIH && this.wlaJM == agp.wlaJM && this.fIwbmz == agp.fIwbmz && this.AubY == agp.AubY && this.zLjUOn == agp.zLjUOn && this.DbNXlk == agp.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.sSMYrx, (java.lang.Object) agp.sSMYrx) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) agp.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) agp.gHZMYf) && this.djSkpj == agp.djSkpj && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) agp.isConnected) && Intrinsics.EZpvd(this.ORxRYg, agp.ORxRYg) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) agp.values) && this.ejfBZ == agp.ejfBZ && this.fARcdN == agp.fARcdN && Intrinsics.EZpvd((java.lang.Object) this.DTwDnp, (java.lang.Object) agp.DTwDnp) && Intrinsics.EZpvd((java.lang.Object) this.AxsJAY, (java.lang.Object) agp.AxsJAY) && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) agp.zuBGHE) && this.AwvSrB == agp.AwvSrB && this.fetchVPNInfo == agp.fetchVPNInfo && this.copydefault == agp.copydefault && this.fJNWhG == agp.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long fIwbmz() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fJNWhG() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gHZMYf() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.QOLQEE.hashCode() * 31) + this.QUSxYX.hashCode()) * 31) + this.RJOkX.hashCode()) * 31) + this.QVAiDq.hashCode()) * 31) + java.lang.Integer.hashCode(this.QfsBiF)) * 31) + this.aKErDB.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.QbewEr.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.AuCTelauCTel.hashCode()) * 31) + this.zsXlph.hashCode()) * 31) + this.UeEOUB.hashCode()) * 31) + this.RcXXUw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.QKVWgx.hashCode()) * 31) + java.lang.Double.hashCode(this.AEQbTJ)) * 31) + this.OcIXYQ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.AuCTel)) * 31) + java.lang.Integer.hashCode(this.getFieldNames)) * 31) + java.lang.Integer.hashCode(this.getNewProxyInstance)) * 31) + java.lang.Integer.hashCode(this.hDKMBd)) * 31) + java.lang.Integer.hashCode(this.iwGUEr)) * 31) + java.lang.Integer.hashCode(this.uzCIH)) * 31) + java.lang.Integer.hashCode(this.wlaJM)) * 31) + java.lang.Integer.hashCode(this.fIwbmz)) * 31) + java.lang.Integer.hashCode(this.AubY)) * 31) + java.lang.Integer.hashCode(this.zLjUOn)) * 31) + java.lang.Boolean.hashCode(this.DbNXlk)) * 31) + this.sSMYrx.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gHZMYf.hashCode()) * 31) + java.lang.Integer.hashCode(this.djSkpj)) * 31) + this.isConnected.hashCode()) * 31) + this.ORxRYg.hashCode()) * 31) + this.values.hashCode()) * 31) + java.lang.Integer.hashCode(this.ejfBZ)) * 31) + java.lang.Integer.hashCode(this.fARcdN)) * 31) + this.DTwDnp.hashCode()) * 31) + this.AxsJAY.hashCode()) * 31) + this.zuBGHE.hashCode()) * 31) + java.lang.Integer.hashCode(this.AwvSrB)) * 31) + java.lang.Long.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.fJNWhG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int iwGUEr() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String sSMYrx() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenInfo(tokenAddress=" + this.QOLQEE + ", tokenSymbol=" + this.QUSxYX + ", tokenName=" + this.RJOkX + ", tokenLogo=" + this.QVAiDq + ", tokenDecimals=" + this.QfsBiF + ", tokenType=" + this.aKErDB + ", chainId=" + this.gEmmrt + ", chainName=" + this.AhwBna + ", chainLogoUrl=" + this.djBIcL + ", chainBwLogoUrl=" + this.valueOf + ", tokenPrice=" + this.QbewEr + ", change=" + this.AkhnZx + ", marketCap=" + this.AuCTelauCTel + ", liquidity=" + this.zsXlph + ", volume=" + this.UeEOUB + ", tvlUsd=" + this.RcXXUw + ", amount=" + this.EZpvd + ", tokenBalance=" + this.QKVWgx + ", amountNumBigDecimal=" + this.AEQbTJ + ", tokenBalanceValue=" + this.OcIXYQ + ", availableAmountNum=" + this.KWHzl + ", availableCurrencyAmount=" + this.OLrzqt + ", isCollect=" + this.AuCTel + ", isNative=" + this.getFieldNames + ", isCustomToken=" + this.getNewProxyInstance + ", isDefault=" + this.hDKMBd + ", isHoneypot=" + this.iwGUEr + ", isLeveraged=" + this.uzCIH + ", isSafeMoonToken=" + this.wlaJM + ", isAuth=" + this.fIwbmz + ", isSubscribe=" + this.AubY + ", isSupportCrossChain=" + this.zLjUOn + ", displayToken=" + this.DbNXlk + ", riskLevel=" + this.sSMYrx + ", buyTaxes=" + this.AYXKKw + ", sellTaxes=" + this.gHZMYf + ", topPlacement=" + this.djSkpj + ", collectTime=" + this.isConnected + ", tagList=" + this.ORxRYg + ", explorerUrl=" + this.values + ", fromCurrency=" + this.ejfBZ + ", fromMarket=" + this.fARcdN + ", systemTokenType=" + this.DTwDnp + ", source=" + this.AxsJAY + ", sourceLogo=" + this.zuBGHE + ", rank=" + this.AwvSrB + ", coinId=" + this.fetchVPNInfo + ", baseCoinId=" + this.copydefault + ", id=" + this.fJNWhG + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<java.util.List<java.lang.String>> */
    public final java.util.List<java.util.List<java.lang.String>> zsXlph() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.QVAiDq;
    }

    public AGP(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, double d, @NotNull java.lang.String str18, @NotNull java.lang.String str19, @NotNull java.lang.String str20, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, @NotNull java.lang.String str21, @NotNull java.lang.String str22, @NotNull java.lang.String str23, int i12, @NotNull java.lang.String str24, @NotNull java.util.List<? extends java.util.List<java.lang.String>> list, @NotNull java.lang.String str25, int i13, int i14, @NotNull java.lang.String str26, @NotNull java.lang.String str27, @NotNull java.lang.String str28, int i15, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        this.QOLQEE = str;
        this.QUSxYX = str2;
        this.RJOkX = str3;
        this.QVAiDq = str4;
        this.QfsBiF = i;
        this.aKErDB = str5;
        this.gEmmrt = str6;
        this.AhwBna = str7;
        this.djBIcL = str8;
        this.valueOf = str9;
        this.QbewEr = str10;
        this.AkhnZx = str11;
        this.AuCTelauCTel = str12;
        this.zsXlph = str13;
        this.UeEOUB = str14;
        this.RcXXUw = str15;
        this.EZpvd = str16;
        this.QKVWgx = str17;
        this.AEQbTJ = d;
        this.OcIXYQ = str18;
        this.KWHzl = str19;
        this.OLrzqt = str20;
        this.AuCTel = i2;
        this.getFieldNames = i3;
        this.getNewProxyInstance = i4;
        this.hDKMBd = i5;
        this.iwGUEr = i6;
        this.uzCIH = i7;
        this.wlaJM = i8;
        this.fIwbmz = i9;
        this.AubY = i10;
        this.zLjUOn = i11;
        this.DbNXlk = z;
        this.sSMYrx = str21;
        this.AYXKKw = str22;
        this.gHZMYf = str23;
        this.djSkpj = i12;
        this.isConnected = str24;
        this.ORxRYg = list;
        this.values = str25;
        this.ejfBZ = i13;
        this.fARcdN = i14;
        this.DTwDnp = str26;
        this.AxsJAY = str27;
        this.zuBGHE = str28;
        this.AwvSrB = i15;
        this.fetchVPNInfo = j;
        this.copydefault = j2;
        this.fJNWhG = j3;
    }
}
