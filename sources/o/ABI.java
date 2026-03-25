package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ABI {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String AuCTelauCTel;
    public java.lang.String AubY;
    public long AwvSrB;
    public java.lang.Long AxsJAY;
    public long DTwDnp;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String ORxRYg;
    public java.lang.Long OcIXYQ;
    public java.util.List<? extends java.util.List<java.lang.String>> QKVWgx;
    public java.util.List<AGM> QOLQEE;
    public java.lang.String QUSxYX;
    public java.lang.String QVAiDq;
    public java.lang.String QbewEr;
    public long QfsBiF;
    public java.util.List<java.lang.Long> RJOkX;
    public java.lang.String RcXXUw;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public java.lang.String copydefault;
    public java.lang.String dNCPSb;
    public java.lang.String djBIcL;
    public java.lang.Long djSkpj;
    public java.lang.String dvKsVJ;
    public long ejfBZ;
    public long fARcdN;
    public java.lang.String fFgQHt;
    public long fIwbmz;
    public long fJNWhG;
    public long fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String gHZMYf;
    public java.lang.String getFieldNames;
    public java.lang.Long getNewProxyInstance;
    public long hDKMBd;
    public java.lang.String isConnected;
    public java.lang.Long iwGUEr;
    public java.lang.String sSMYrx;
    public java.lang.Long uzCIH;
    public java.lang.String valueOf;
    public boolean values;
    public java.lang.Long wlaJM;
    public java.lang.String zLjUOn;
    public java.lang.String zsXlph;
    public java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: o.ABI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ABI copy$default(ABI abi, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j2, java.lang.String str6, long j3, java.lang.String str7, java.lang.String str8, long j4, long j5, long j6, long j7, long j8, java.lang.String str9, long j9, boolean z, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.Long l7, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, java.lang.String str28, java.lang.String str29, java.lang.String str30, java.lang.String str31, java.util.List list, java.util.List list2, java.lang.String str32, java.util.List list3, int i, int i2, java.lang.Object obj) {
        long j10 = (i & 1) != 0 ? abi.ejfBZ : j;
        java.lang.String str33 = (i & 2) != 0 ? abi.OLrzqt : str;
        java.lang.String str34 = (i & 4) != 0 ? abi.RcXXUw : str2;
        java.lang.String str35 = (i & 8) != 0 ? abi.QUSxYX : str3;
        java.lang.String str36 = (i & 16) != 0 ? abi.QbewEr : str4;
        java.lang.String str37 = (i & 32) != 0 ? abi.QVAiDq : str5;
        long j11 = (i & 64) != 0 ? abi.fetchVPNInfo : j2;
        java.lang.String str38 = (i & 128) != 0 ? abi.UeEOUB : str6;
        long j12 = (i & 256) != 0 ? abi.fARcdN : j3;
        return abi.KWHzl(j10, str33, str34, str35, str36, str37, j11, str38, j12, (i & 512) != 0 ? abi.copydefault : str7, (i & 1024) != 0 ? abi.getFieldNames : str8, (i & 2048) != 0 ? abi.QfsBiF : j4, (i & 4096) != 0 ? abi.fJNWhG : j5, (i & 8192) != 0 ? abi.fIwbmz : j6, (i & 16384) != 0 ? abi.hDKMBd : j7, (i & 32768) != 0 ? abi.AwvSrB : j8, (i & 65536) != 0 ? abi.valueOf : str9, (i & 131072) != 0 ? abi.DTwDnp : j9, (i & 262144) != 0 ? abi.values : z, (i & 524288) != 0 ? abi.AkhnZx : str10, (i & 1048576) != 0 ? abi.DbNXlk : str11, (i & 2097152) != 0 ? abi.isConnected : str12, (i & 4194304) != 0 ? abi.djBIcL : str13, (i & 8388608) != 0 ? abi.gEmmrt : str14, (i & 16777216) != 0 ? abi.AEQbTJ : str15, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? abi.AxsJAY : l, (i & 67108864) != 0 ? abi.djSkpj : l2, (i & 134217728) != 0 ? abi.getNewProxyInstance : l3, (i & 268435456) != 0 ? abi.iwGUEr : l4, (i & 536870912) != 0 ? abi.uzCIH : l5, (i & 1073741824) != 0 ? abi.wlaJM : l6, (i & Integer.MIN_VALUE) != 0 ? abi.EZpvd : str16, (i2 & 1) != 0 ? abi.gHZMYf : str17, (i2 & 2) != 0 ? abi.AuCTel : str18, (i2 & 4) != 0 ? abi.aKErDB : str19, (i2 & 8) != 0 ? abi.AYXKKw : str20, (i2 & 16) != 0 ? abi.OcIXYQ : l7, (i2 & 32) != 0 ? abi.ORxRYg : str21, (i2 & 64) != 0 ? abi.zLjUOn : str22, (i2 & 128) != 0 ? abi.KWHzl : str23, (i2 & 256) != 0 ? abi.dNCPSb : str24, (i2 & 512) != 0 ? abi.dvKsVJ : str25, (i2 & 1024) != 0 ? abi.AubY : str26, (i2 & 2048) != 0 ? abi.zuBGHE : str27, (i2 & 4096) != 0 ? abi.AhwBna : str28, (i2 & 8192) != 0 ? abi.fFgQHt : str29, (i2 & 16384) != 0 ? abi.zsXlph : str30, (i2 & 32768) != 0 ? abi.AuCTelauCTel : str31, (i2 & 65536) != 0 ? abi.QKVWgx : list, (i2 & 131072) != 0 ? abi.QOLQEE : list2, (i2 & 262144) != 0 ? abi.sSMYrx : str32, (i2 & 524288) != 0 ? abi.RJOkX : list3);
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
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AuCTelauCTel() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<java.util.List<java.lang.String>> */
    public final java.util.List<java.util.List<java.lang.String>> AubY() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AGM> AwvSrB() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long DTwDnp() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABI KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, long j2, @NotNull java.lang.String str6, long j3, @NotNull java.lang.String str7, @NotNull java.lang.String str8, long j4, long j5, long j6, long j7, long j8, java.lang.String str9, long j9, boolean z, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.Long l7, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, java.lang.String str28, java.lang.String str29, java.lang.String str30, java.lang.String str31, java.util.List<? extends java.util.List<java.lang.String>> list, java.util.List<AGM> list2, java.lang.String str32, java.util.List<java.lang.Long> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ABI(j, str, str2, str3, str4, str5, j2, str6, j3, str7, str8, j4, j5, j6, j7, j8, str9, j9, z, str10, str11, str12, str13, str14, str15, l, l2, l3, l4, l5, l6, str16, str17, str18, str19, str20, l7, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, list, list2, str32, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ORxRYg() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OcIXYQ() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QKVWgx() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QOLQEE() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QUSxYX() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QVAiDq() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QbewEr() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long QfsBiF() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String RJOkX() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long RcXXUw() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String UeEOUB() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long aKErDB() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long dNCPSb() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djSkpj() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long dxcTrN() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ABI)) {
            return false;
        }
        ABI abi = (ABI) obj;
        return this.ejfBZ == abi.ejfBZ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) abi.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.RcXXUw, (java.lang.Object) abi.RcXXUw) && Intrinsics.EZpvd((java.lang.Object) this.QUSxYX, (java.lang.Object) abi.QUSxYX) && Intrinsics.EZpvd((java.lang.Object) this.QbewEr, (java.lang.Object) abi.QbewEr) && Intrinsics.EZpvd((java.lang.Object) this.QVAiDq, (java.lang.Object) abi.QVAiDq) && this.fetchVPNInfo == abi.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.UeEOUB, (java.lang.Object) abi.UeEOUB) && this.fARcdN == abi.fARcdN && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) abi.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) abi.getFieldNames) && this.QfsBiF == abi.QfsBiF && this.fJNWhG == abi.fJNWhG && this.fIwbmz == abi.fIwbmz && this.hDKMBd == abi.hDKMBd && this.AwvSrB == abi.AwvSrB && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) abi.valueOf) && this.DTwDnp == abi.DTwDnp && this.values == abi.values && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) abi.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) abi.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) abi.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) abi.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) abi.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) abi.AEQbTJ) && Intrinsics.EZpvd(this.AxsJAY, abi.AxsJAY) && Intrinsics.EZpvd(this.djSkpj, abi.djSkpj) && Intrinsics.EZpvd(this.getNewProxyInstance, abi.getNewProxyInstance) && Intrinsics.EZpvd(this.iwGUEr, abi.iwGUEr) && Intrinsics.EZpvd(this.uzCIH, abi.uzCIH) && Intrinsics.EZpvd(this.wlaJM, abi.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) abi.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) abi.gHZMYf) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) abi.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.aKErDB, (java.lang.Object) abi.aKErDB) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) abi.AYXKKw) && Intrinsics.EZpvd(this.OcIXYQ, abi.OcIXYQ) && Intrinsics.EZpvd((java.lang.Object) this.ORxRYg, (java.lang.Object) abi.ORxRYg) && Intrinsics.EZpvd((java.lang.Object) this.zLjUOn, (java.lang.Object) abi.zLjUOn) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) abi.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.dNCPSb, (java.lang.Object) abi.dNCPSb) && Intrinsics.EZpvd((java.lang.Object) this.dvKsVJ, (java.lang.Object) abi.dvKsVJ) && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) abi.AubY) && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) abi.zuBGHE) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) abi.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.fFgQHt, (java.lang.Object) abi.fFgQHt) && Intrinsics.EZpvd((java.lang.Object) this.zsXlph, (java.lang.Object) abi.zsXlph) && Intrinsics.EZpvd((java.lang.Object) this.AuCTelauCTel, (java.lang.Object) abi.AuCTelauCTel) && Intrinsics.EZpvd(this.QKVWgx, abi.QKVWgx) && Intrinsics.EZpvd(this.QOLQEE, abi.QOLQEE) && Intrinsics.EZpvd((java.lang.Object) this.sSMYrx, (java.lang.Object) abi.sSMYrx) && Intrinsics.EZpvd(this.RJOkX, abi.RJOkX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long fFgQHt() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long fIwbmz() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.zsXlph;
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
    public final java.util.List<java.lang.Long> gHZMYf() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long getNewProxyInstance() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2 = java.lang.Long.hashCode(this.ejfBZ);
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.RcXXUw.hashCode();
        int iHashCode5 = this.QUSxYX.hashCode();
        int iHashCode6 = this.QbewEr.hashCode();
        int iHashCode7 = this.QVAiDq.hashCode();
        int iHashCode8 = java.lang.Long.hashCode(this.fetchVPNInfo);
        int iHashCode9 = this.UeEOUB.hashCode();
        int iHashCode10 = java.lang.Long.hashCode(this.fARcdN);
        int iHashCode11 = this.copydefault.hashCode();
        int iHashCode12 = this.getFieldNames.hashCode();
        int iHashCode13 = java.lang.Long.hashCode(this.QfsBiF);
        int iHashCode14 = java.lang.Long.hashCode(this.fJNWhG);
        int iHashCode15 = java.lang.Long.hashCode(this.fIwbmz);
        int iHashCode16 = java.lang.Long.hashCode(this.hDKMBd);
        int iHashCode17 = java.lang.Long.hashCode(this.AwvSrB);
        java.lang.String str = this.valueOf;
        if (str == null) {
            i = iHashCode17;
            iHashCode = 0;
        } else {
            i = iHashCode17;
            iHashCode = str.hashCode();
        }
        int iHashCode18 = java.lang.Long.hashCode(this.DTwDnp);
        int iHashCode19 = java.lang.Boolean.hashCode(this.values);
        java.lang.String str2 = this.AkhnZx;
        int iHashCode20 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.DbNXlk;
        int iHashCode21 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.isConnected;
        int iHashCode22 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.djBIcL;
        int iHashCode23 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.gEmmrt;
        int iHashCode24 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.AEQbTJ;
        int iHashCode25 = str7 == null ? 0 : str7.hashCode();
        java.lang.Long l = this.AxsJAY;
        int iHashCode26 = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.djSkpj;
        int iHashCode27 = l2 == null ? 0 : l2.hashCode();
        java.lang.Long l3 = this.getNewProxyInstance;
        int iHashCode28 = l3 == null ? 0 : l3.hashCode();
        java.lang.Long l4 = this.iwGUEr;
        int iHashCode29 = l4 == null ? 0 : l4.hashCode();
        java.lang.Long l5 = this.uzCIH;
        int iHashCode30 = l5 == null ? 0 : l5.hashCode();
        java.lang.Long l6 = this.wlaJM;
        int iHashCode31 = l6 == null ? 0 : l6.hashCode();
        java.lang.String str8 = this.EZpvd;
        int iHashCode32 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.gHZMYf;
        int iHashCode33 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.AuCTel;
        int iHashCode34 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.aKErDB;
        int iHashCode35 = str11 == null ? 0 : str11.hashCode();
        java.lang.String str12 = this.AYXKKw;
        int iHashCode36 = str12 == null ? 0 : str12.hashCode();
        java.lang.Long l7 = this.OcIXYQ;
        int iHashCode37 = l7 == null ? 0 : l7.hashCode();
        java.lang.String str13 = this.ORxRYg;
        int iHashCode38 = str13 == null ? 0 : str13.hashCode();
        java.lang.String str14 = this.zLjUOn;
        int iHashCode39 = str14 == null ? 0 : str14.hashCode();
        java.lang.String str15 = this.KWHzl;
        int iHashCode40 = str15 == null ? 0 : str15.hashCode();
        java.lang.String str16 = this.dNCPSb;
        int iHashCode41 = str16 == null ? 0 : str16.hashCode();
        java.lang.String str17 = this.dvKsVJ;
        int iHashCode42 = str17 == null ? 0 : str17.hashCode();
        java.lang.String str18 = this.AubY;
        int iHashCode43 = str18 == null ? 0 : str18.hashCode();
        java.lang.String str19 = this.zuBGHE;
        int iHashCode44 = str19 == null ? 0 : str19.hashCode();
        java.lang.String str20 = this.AhwBna;
        int iHashCode45 = str20 == null ? 0 : str20.hashCode();
        java.lang.String str21 = this.fFgQHt;
        int iHashCode46 = str21 == null ? 0 : str21.hashCode();
        java.lang.String str22 = this.zsXlph;
        int iHashCode47 = str22 == null ? 0 : str22.hashCode();
        java.lang.String str23 = this.AuCTelauCTel;
        int iHashCode48 = str23 == null ? 0 : str23.hashCode();
        java.util.List<? extends java.util.List<java.lang.String>> list = this.QKVWgx;
        int iHashCode49 = list == null ? 0 : list.hashCode();
        java.util.List<AGM> list2 = this.QOLQEE;
        int iHashCode50 = list2 == null ? 0 : list2.hashCode();
        java.lang.String str24 = this.sSMYrx;
        int iHashCode51 = str24 == null ? 0 : str24.hashCode();
        java.util.List<java.lang.Long> list3 = this.RJOkX;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + i) * 31) + iHashCode) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long iwGUEr() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String sSMYrx() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexTradeChainsTokenInfo(id=" + this.ejfBZ + ", chainId=" + this.OLrzqt + ", tokenSymbol=" + this.RcXXUw + ", tokenName=" + this.QUSxYX + ", tokenContractAddress=" + this.QbewEr + ", tokenLogoUrl=" + this.QVAiDq + ", decimals=" + this.fetchVPNInfo + ", tokenType=" + this.UeEOUB + ", isDefault=" + this.fARcdN + ", amountNum=" + this.copydefault + ", isNativeToken=" + this.getFieldNames + ", tokenSourceType=" + this.QfsBiF + ", isCollectToken=" + this.fJNWhG + ", isCustomToken=" + this.fIwbmz + ", isSubscribe=" + this.hDKMBd + ", protocolType=" + this.AwvSrB + ", collectTime=" + this.valueOf + ", subscriptionState=" + this.DTwDnp + ", displayToken=" + this.values + ", explorerUrl=" + this.AkhnZx + ", currencyAmount=" + this.DbNXlk + ", displayAmount=" + this.isConnected + ", chainLogoUrl=" + this.djBIcL + ", chainName=" + this.gEmmrt + ", chainBwLogoUrl=" + this.AEQbTJ + ", rank=" + this.AxsJAY + ", tvlUsd=" + this.djSkpj + ", isSafeMoonToken=" + this.getNewProxyInstance + ", isHoneypot=" + this.iwGUEr + ", isLeveraged=" + this.uzCIH + ", needApprove=" + this.wlaJM + ", buyTaxes=" + this.EZpvd + ", sellTaxes=" + this.gHZMYf + ", isAuth=" + this.AuCTel + ", topPlacement=" + this.aKErDB + ", crossAbility=" + this.AYXKKw + ", systemTokenType=" + this.OcIXYQ + ", spotBalance=" + this.ORxRYg + ", netPurchaseAmount=" + this.zLjUOn + ", avgBuyPrice=" + this.KWHzl + ", unrealizedPnl=" + this.dNCPSb + ", unrealizedPnlPercent=" + this.dvKsVJ + ", lastTxPrice=" + this.AubY + ", price=" + this.zuBGHE + ", change=" + this.AhwBna + ", volume=" + this.fFgQHt + ", liquidity=" + this.zsXlph + ", marketCap=" + this.AuCTelauCTel + ", tagList=" + this.QKVWgx + ", tags=" + this.QOLQEE + ", riskLevel=" + this.sSMYrx + ", tokenCategories=" + this.RJOkX + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long zsXlph() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.QbewEr;
    }

    public ABI(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, long j2, @NotNull java.lang.String str6, long j3, @NotNull java.lang.String str7, @NotNull java.lang.String str8, long j4, long j5, long j6, long j7, long j8, java.lang.String str9, long j9, boolean z, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.Long l7, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, java.lang.String str28, java.lang.String str29, java.lang.String str30, java.lang.String str31, java.util.List<? extends java.util.List<java.lang.String>> list, java.util.List<AGM> list2, java.lang.String str32, java.util.List<java.lang.Long> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.ejfBZ = j;
        this.OLrzqt = str;
        this.RcXXUw = str2;
        this.QUSxYX = str3;
        this.QbewEr = str4;
        this.QVAiDq = str5;
        this.fetchVPNInfo = j2;
        this.UeEOUB = str6;
        this.fARcdN = j3;
        this.copydefault = str7;
        this.getFieldNames = str8;
        this.QfsBiF = j4;
        this.fJNWhG = j5;
        this.fIwbmz = j6;
        this.hDKMBd = j7;
        this.AwvSrB = j8;
        this.valueOf = str9;
        this.DTwDnp = j9;
        this.values = z;
        this.AkhnZx = str10;
        this.DbNXlk = str11;
        this.isConnected = str12;
        this.djBIcL = str13;
        this.gEmmrt = str14;
        this.AEQbTJ = str15;
        this.AxsJAY = l;
        this.djSkpj = l2;
        this.getNewProxyInstance = l3;
        this.iwGUEr = l4;
        this.uzCIH = l5;
        this.wlaJM = l6;
        this.EZpvd = str16;
        this.gHZMYf = str17;
        this.AuCTel = str18;
        this.aKErDB = str19;
        this.AYXKKw = str20;
        this.OcIXYQ = l7;
        this.ORxRYg = str21;
        this.zLjUOn = str22;
        this.KWHzl = str23;
        this.dNCPSb = str24;
        this.dvKsVJ = str25;
        this.AubY = str26;
        this.zuBGHE = str27;
        this.AhwBna = str28;
        this.fFgQHt = str29;
        this.zsXlph = str30;
        this.AuCTelauCTel = str31;
        this.QKVWgx = list;
        this.QOLQEE = list2;
        this.sSMYrx = str32;
        this.RJOkX = list3;
    }
}
