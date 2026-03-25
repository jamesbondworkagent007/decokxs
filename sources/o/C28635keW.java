package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.meme.domain.model.Media;
import com.okinc.business.market.features.meme.domain.model.SignalType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28635keW {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final boolean AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String AuCTelauCTel;
    public final java.lang.String AubY;
    public final java.util.List<CompactTagData> AwvSrB;
    public final java.lang.String AxsJAY;
    public final java.lang.String DTwDnp;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String ORxRYg;
    public final java.lang.String OcIXYQ;
    public final java.lang.String QKVWgx;
    public final java.lang.String QOLQEE;
    public final java.lang.String QUSxYX;
    public final java.lang.String QfsBiF;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final java.lang.String fIwbmz;
    public final Media fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String gHZMYf;
    public final java.lang.String getFieldNames;
    public final long getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final boolean isConnected;
    public final java.lang.String iwGUEr;
    public final java.lang.String sSMYrx;
    public final java.lang.String uzCIH;
    public final java.lang.String valueOf;
    public final java.lang.String values;
    public final SignalType wlaJM;
    public final java.lang.String zLjUOn;
    public final java.lang.String zsXlph;
    public final java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: o.keW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28635keW copy$default(C28635keW c28635keW, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, java.util.List list, java.lang.String str28, java.lang.String str29, java.lang.String str30, java.lang.String str31, java.lang.String str32, java.lang.String str33, java.lang.String str34, java.lang.String str35, Media media, boolean z2, long j, java.lang.String str36, SignalType signalType, int i, int i2, java.lang.Object obj) {
        return c28635keW.KWHzl((i & 1) != 0 ? c28635keW.KWHzl : str, (i & 2) != 0 ? c28635keW.DTwDnp : str2, (i & 4) != 0 ? c28635keW.ORxRYg : str3, (i & 8) != 0 ? c28635keW.gHZMYf : str4, (i & 16) != 0 ? c28635keW.AxsJAY : str5, (i & 32) != 0 ? c28635keW.isConnected : z, (i & 64) != 0 ? c28635keW.OLrzqt : str6, (i & 128) != 0 ? c28635keW.sSMYrx : str7, (i & 256) != 0 ? c28635keW.AEQbTJ : str8, (i & 512) != 0 ? c28635keW.valueOf : str9, (i & 1024) != 0 ? c28635keW.OcIXYQ : str10, (i & 2048) != 0 ? c28635keW.QOLQEE : str11, (i & 4096) != 0 ? c28635keW.QUSxYX : str12, (i & 8192) != 0 ? c28635keW.QfsBiF : str13, (i & 16384) != 0 ? c28635keW.values : str14, (i & 32768) != 0 ? c28635keW.AYXKKw : str15, (i & 65536) != 0 ? c28635keW.copydefault : str16, (i & 131072) != 0 ? c28635keW.DbNXlk : str17, (i & 262144) != 0 ? c28635keW.QKVWgx : str18, (i & 524288) != 0 ? c28635keW.gEmmrt : str19, (i & 1048576) != 0 ? c28635keW.AuCTelauCTel : str20, (i & 2097152) != 0 ? c28635keW.zsXlph : str21, (i & 4194304) != 0 ? c28635keW.AubY : str22, (i & 8388608) != 0 ? c28635keW.zLjUOn : str23, (i & 16777216) != 0 ? c28635keW.EZpvd : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c28635keW.fetchVPNInfo : str25, (i & 67108864) != 0 ? c28635keW.zuBGHE : str26, (i & 134217728) != 0 ? c28635keW.AhwBna : str27, (i & 268435456) != 0 ? c28635keW.AwvSrB : list, (i & 536870912) != 0 ? c28635keW.fIwbmz : str28, (i & 1073741824) != 0 ? c28635keW.fARcdN : str29, (i & Integer.MIN_VALUE) != 0 ? c28635keW.ejfBZ : str30, (i2 & 1) != 0 ? c28635keW.hDKMBd : str31, (i2 & 2) != 0 ? c28635keW.djBIcL : str32, (i2 & 4) != 0 ? c28635keW.uzCIH : str33, (i2 & 8) != 0 ? c28635keW.iwGUEr : str34, (i2 & 16) != 0 ? c28635keW.AuCTel : str35, (i2 & 32) != 0 ? c28635keW.fJNWhG : media, (i2 & 64) != 0 ? c28635keW.AkhnZx : z2, (i2 & 128) != 0 ? c28635keW.getNewProxyInstance : j, (i2 & 256) != 0 ? c28635keW.getFieldNames : str36, (i2 & 512) != 0 ? c28635keW.wlaJM : signalType);
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
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Media AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTelauCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AubY() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DTwDnp() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.DbNXlk;
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
    public final C28635keW KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, @NotNull java.lang.String str18, @NotNull java.lang.String str19, @NotNull java.lang.String str20, @NotNull java.lang.String str21, @NotNull java.lang.String str22, @NotNull java.lang.String str23, @NotNull java.lang.String str24, @NotNull java.lang.String str25, @NotNull java.lang.String str26, @NotNull java.lang.String str27, @NotNull java.util.List<CompactTagData> list, @NotNull java.lang.String str28, @NotNull java.lang.String str29, @NotNull java.lang.String str30, @NotNull java.lang.String str31, @NotNull java.lang.String str32, @NotNull java.lang.String str33, @NotNull java.lang.String str34, @NotNull java.lang.String str35, @NotNull Media media, boolean z2, long j, @NotNull java.lang.String str36, @NotNull SignalType signalType) {
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
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(media, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(signalType, "");
        return new C28635keW(str, str2, str3, str4, str5, z, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, list, str28, str29, str30, str31, str32, str33, str34, str35, media, z2, j, str36, signalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ORxRYg() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OcIXYQ() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QKVWgx() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QOLQEE() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QUSxYX() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QVAiDq() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28635keW)) {
            return false;
        }
        C28635keW c28635keW = (C28635keW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c28635keW.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.DTwDnp, (java.lang.Object) c28635keW.DTwDnp) && Intrinsics.EZpvd((java.lang.Object) this.ORxRYg, (java.lang.Object) c28635keW.ORxRYg) && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) c28635keW.gHZMYf) && Intrinsics.EZpvd((java.lang.Object) this.AxsJAY, (java.lang.Object) c28635keW.AxsJAY) && this.isConnected == c28635keW.isConnected && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c28635keW.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.sSMYrx, (java.lang.Object) c28635keW.sSMYrx) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c28635keW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c28635keW.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OcIXYQ, (java.lang.Object) c28635keW.OcIXYQ) && Intrinsics.EZpvd((java.lang.Object) this.QOLQEE, (java.lang.Object) c28635keW.QOLQEE) && Intrinsics.EZpvd((java.lang.Object) this.QUSxYX, (java.lang.Object) c28635keW.QUSxYX) && Intrinsics.EZpvd((java.lang.Object) this.QfsBiF, (java.lang.Object) c28635keW.QfsBiF) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c28635keW.values) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c28635keW.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28635keW.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c28635keW.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.QKVWgx, (java.lang.Object) c28635keW.QKVWgx) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c28635keW.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AuCTelauCTel, (java.lang.Object) c28635keW.AuCTelauCTel) && Intrinsics.EZpvd((java.lang.Object) this.zsXlph, (java.lang.Object) c28635keW.zsXlph) && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) c28635keW.AubY) && Intrinsics.EZpvd((java.lang.Object) this.zLjUOn, (java.lang.Object) c28635keW.zLjUOn) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28635keW.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c28635keW.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) c28635keW.zuBGHE) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c28635keW.AhwBna) && Intrinsics.EZpvd(this.AwvSrB, c28635keW.AwvSrB) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c28635keW.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c28635keW.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c28635keW.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) c28635keW.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c28635keW.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) c28635keW.uzCIH) && Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) c28635keW.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c28635keW.AuCTel) && Intrinsics.EZpvd(this.fJNWhG, c28635keW.fJNWhG) && this.AkhnZx == c28635keW.AkhnZx && this.getNewProxyInstance == c28635keW.getNewProxyInstance && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) c28635keW.getFieldNames) && this.wlaJM == c28635keW.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CompactTagData> gHZMYf() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalType hDKMBd() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.DTwDnp.hashCode()) * 31) + this.ORxRYg.hashCode()) * 31) + this.gHZMYf.hashCode()) * 31) + this.AxsJAY.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isConnected)) * 31) + this.OLrzqt.hashCode()) * 31) + this.sSMYrx.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OcIXYQ.hashCode()) * 31) + this.QOLQEE.hashCode()) * 31) + this.QUSxYX.hashCode()) * 31) + this.QfsBiF.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.QKVWgx.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AuCTelauCTel.hashCode()) * 31) + this.zsXlph.hashCode()) * 31) + this.AubY.hashCode()) * 31) + this.zLjUOn.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.zuBGHE.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AwvSrB.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.fARcdN.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.hDKMBd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.uzCIH.hashCode()) * 31) + this.iwGUEr.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AkhnZx)) * 31) + java.lang.Long.hashCode(this.getNewProxyInstance)) * 31) + this.getFieldNames.hashCode()) * 31) + this.wlaJM.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String sSMYrx() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MemePumpToken(chainId=" + this.KWHzl + ", tokenName=" + this.DTwDnp + ", tokenSymbol=" + this.ORxRYg + ", tokenLogo=" + this.gHZMYf + ", tokenLogoBase64=" + this.AxsJAY + ", logoPassReview=" + this.isConnected + ", bigLogo=" + this.OLrzqt + ", tokenContractAddress=" + this.sSMYrx + ", createTime=" + this.AEQbTJ + ", creator=" + this.valueOf + ", txs1h=" + this.OcIXYQ + ", txsb1h=" + this.QOLQEE + ", txss1h=" + this.QUSxYX + ", vol1h=" + this.QfsBiF + ", mcap=" + this.values + ", fee=" + this.AYXKKw + ", bots=" + this.copydefault + ", hold=" + this.DbNXlk + ", top10HoldRto=" + this.QKVWgx + ", devHoldRto=" + this.gEmmrt + ", suspHoldRto=" + this.AuCTelauCTel + ", sniperBuy=" + this.zsXlph + ", sniperCount=" + this.AubY + ", sniperHoldingRatio=" + this.zLjUOn + ", bundHoldRto=" + this.EZpvd + ", freshHoldRto=" + this.fetchVPNInfo + ", suspPhishHoldRto=" + this.zuBGHE + ", creatorMigrCnt=" + this.AhwBna + ", tagData=" + this.AwvSrB + ", migrBegin=" + this.fIwbmz + ", migrEnd=" + this.fARcdN + ", progress=" + this.ejfBZ + ", protocolId=" + this.hDKMBd + ", extProtocolId=" + this.djBIcL + ", sameCarNumber=" + this.uzCIH + ", sameCarFollowedCount=" + this.iwGUEr + ", projectLink=" + this.AuCTel + ", media=" + this.fJNWhG + ", isCollected=" + this.AkhnZx + ", signalTimestamp=" + this.getNewProxyInstance + ", signalAmt=" + this.getFieldNames + ", signalType=" + this.wlaJM + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long uzCIH() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zsXlph() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.DTwDnp;
    }

    public C28635keW(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, @NotNull java.lang.String str18, @NotNull java.lang.String str19, @NotNull java.lang.String str20, @NotNull java.lang.String str21, @NotNull java.lang.String str22, @NotNull java.lang.String str23, @NotNull java.lang.String str24, @NotNull java.lang.String str25, @NotNull java.lang.String str26, @NotNull java.lang.String str27, @NotNull java.util.List<CompactTagData> list, @NotNull java.lang.String str28, @NotNull java.lang.String str29, @NotNull java.lang.String str30, @NotNull java.lang.String str31, @NotNull java.lang.String str32, @NotNull java.lang.String str33, @NotNull java.lang.String str34, @NotNull java.lang.String str35, @NotNull Media media, boolean z2, long j, @NotNull java.lang.String str36, @NotNull SignalType signalType) {
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
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(media, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(signalType, "");
        this.KWHzl = str;
        this.DTwDnp = str2;
        this.ORxRYg = str3;
        this.gHZMYf = str4;
        this.AxsJAY = str5;
        this.isConnected = z;
        this.OLrzqt = str6;
        this.sSMYrx = str7;
        this.AEQbTJ = str8;
        this.valueOf = str9;
        this.OcIXYQ = str10;
        this.QOLQEE = str11;
        this.QUSxYX = str12;
        this.QfsBiF = str13;
        this.values = str14;
        this.AYXKKw = str15;
        this.copydefault = str16;
        this.DbNXlk = str17;
        this.QKVWgx = str18;
        this.gEmmrt = str19;
        this.AuCTelauCTel = str20;
        this.zsXlph = str21;
        this.AubY = str22;
        this.zLjUOn = str23;
        this.EZpvd = str24;
        this.fetchVPNInfo = str25;
        this.zuBGHE = str26;
        this.AhwBna = str27;
        this.AwvSrB = list;
        this.fIwbmz = str28;
        this.fARcdN = str29;
        this.ejfBZ = str30;
        this.hDKMBd = str31;
        this.djBIcL = str32;
        this.uzCIH = str33;
        this.iwGUEr = str34;
        this.AuCTel = str35;
        this.fJNWhG = media;
        this.AkhnZx = z2;
        this.getNewProxyInstance = j;
        this.getFieldNames = str36;
        this.wlaJM = signalType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0080: CONSTRUCTOR 
  (r48v0 java.lang.String)
  (r49v0 java.lang.String)
  (r50v0 java.lang.String)
  (r51v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r91v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r91v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r53v0 boolean))
  (r54v0 java.lang.String)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 java.lang.String)
  (r58v0 java.lang.String)
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (r63v0 java.lang.String)
  (r64v0 java.lang.String)
  (r65v0 java.lang.String)
  (r66v0 java.lang.String)
  (r67v0 java.lang.String)
  (r68v0 java.lang.String)
  (r69v0 java.lang.String)
  (r70v0 java.lang.String)
  (r71v0 java.lang.String)
  (r72v0 java.lang.String)
  (r73v0 java.lang.String)
  (r74v0 java.lang.String)
  (r75v0 java.lang.String)
  (r76v0 java.util.List)
  (r77v0 java.lang.String)
  (r78v0 java.lang.String)
  (r79v0 java.lang.String)
  (r80v0 java.lang.String)
  (r81v0 java.lang.String)
  (r82v0 java.lang.String)
  (r83v0 java.lang.String)
  (r84v0 java.lang.String)
  (r85v0 com.okinc.business.market.features.meme.domain.model.Media)
  (r86v0 boolean)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r92v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r87v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r92v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.domain.model.SignalType:?: TERNARY null = ((wrap:int:0x0029: ARITH (r92v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: SGET  A[WRAPPED] (LINE:47) com.okinc.business.market.features.meme.domain.model.SignalType.UNKNOWN com.okinc.business.market.features.meme.domain.model.SignalType) : (r90v0 com.okinc.business.market.features.meme.domain.model.SignalType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.Media, boolean, long, java.lang.String, com.okinc.business.market.features.meme.domain.model.SignalType):void (m)] (LINE:5) call: o.keW.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.Media, boolean, long, java.lang.String, com.okinc.business.market.features.meme.domain.model.SignalType):void type: THIS */
    public /* synthetic */ C28635keW(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, java.util.List list, java.lang.String str28, java.lang.String str29, java.lang.String str30, java.lang.String str31, java.lang.String str32, java.lang.String str33, java.lang.String str34, java.lang.String str35, Media media, boolean z2, long j, java.lang.String str36, SignalType signalType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? true : z, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, list, str28, str29, str30, str31, str32, str33, str34, str35, media, z2, (i2 & 128) != 0 ? 0L : j, (i2 & 256) != 0 ? "" : str36, (i2 & 512) != 0 ? SignalType.UNKNOWN : signalType);
    }

    public final C28635keW copydefault(int i, int i2, java.lang.Long l, java.lang.String str, SignalType signalType) {
        return copy$default(this, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, java.lang.String.valueOf(C56548yJl.copydefault(i, 0)), java.lang.String.valueOf(C56548yJl.copydefault(i2, 0)), null, null, false, l != null ? l.longValue() : this.getNewProxyInstance, str == null ? this.getFieldNames : str, signalType == null ? this.wlaJM : signalType, -1, 115, null);
    }
}
