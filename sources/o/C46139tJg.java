package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46139tJg implements InterfaceC47500trK {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public float AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String AuCTelauCTel;
    public final java.lang.String AubY;
    public java.lang.Boolean AwvSrB;
    public final java.lang.String AxsJAY;
    public java.lang.Integer DbNXlk;
    public java.lang.String EZpvd;
    public int KWHzl;
    public final PlanetAvatarInfo OLrzqt;
    public final java.lang.String djBIcL;
    public int ejfBZ;
    public java.lang.CharSequence fARcdN;
    public final java.lang.String fIwbmz;
    public boolean fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public final java.lang.String gHZMYf;
    public final java.lang.String getFieldNames;
    public java.lang.String getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public java.lang.String isConnected;
    public java.lang.String iwGUEr;
    public java.lang.CharSequence sSMYrx;
    public boolean uzCIH;
    public java.lang.String valueOf;
    public java.lang.String values;
    public java.lang.String wlaJM;
    public int zLjUOn;
    public java.lang.String zsXlph;
    public final java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46139tJg() {
        this(null, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 0.0f, -1, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(float f) {
        this.AkhnZx = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.uzCIH = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTelauCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTelauCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AubY() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetAvatarInfo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.sSMYrx = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Integer num) {
        this.DbNXlk = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46139tJg KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, boolean z2, @NotNull java.lang.String str9, int i, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str13, int i2, java.lang.Integer num, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.String str14, java.lang.Boolean bool, int i3, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, @NotNull java.lang.String str18, @NotNull java.lang.String str19, @NotNull java.lang.String str20, @NotNull java.lang.String str21, @NotNull java.lang.String str22, @NotNull java.lang.String str23, float f) {
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
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
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
        return new C46139tJg(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, i, str10, str11, str12, charSequence, str13, i2, num, charSequence2, str14, bool, i3, str15, str16, str17, str18, str19, str20, str21, str22, str23, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Boolean bool) {
        this.AwvSrB = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.zLjUOn = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.fARcdN = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46139tJg)) {
            return false;
        }
        C46139tJg c46139tJg = (C46139tJg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) c46139tJg.getFieldNames) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c46139tJg.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) c46139tJg.zuBGHE) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46139tJg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) c46139tJg.AubY) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46139tJg.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c46139tJg.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c46139tJg.AuCTel) && this.uzCIH == c46139tJg.uzCIH && this.fJNWhG == c46139tJg.fJNWhG && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c46139tJg.djBIcL) && this.KWHzl == c46139tJg.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) c46139tJg.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) c46139tJg.gHZMYf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46139tJg.EZpvd) && Intrinsics.EZpvd(this.fARcdN, c46139tJg.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c46139tJg.values) && this.ejfBZ == c46139tJg.ejfBZ && Intrinsics.EZpvd(this.DbNXlk, c46139tJg.DbNXlk) && Intrinsics.EZpvd(this.sSMYrx, c46139tJg.sSMYrx) && Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) c46139tJg.wlaJM) && Intrinsics.EZpvd(this.AwvSrB, c46139tJg.AwvSrB) && this.zLjUOn == c46139tJg.zLjUOn && Intrinsics.EZpvd((java.lang.Object) this.zsXlph, (java.lang.Object) c46139tJg.zsXlph) && Intrinsics.EZpvd((java.lang.Object) this.AuCTelauCTel, (java.lang.Object) c46139tJg.AuCTelauCTel) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c46139tJg.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c46139tJg.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c46139tJg.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c46139tJg.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) c46139tJg.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) c46139tJg.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.AxsJAY, (java.lang.Object) c46139tJg.AxsJAY) && java.lang.Float.compare(this.AkhnZx, c46139tJg.AkhnZx) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gHZMYf() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.getFieldNames.hashCode();
        int iHashCode2 = this.fIwbmz.hashCode();
        int iHashCode3 = this.zuBGHE.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.AubY.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        int iHashCode7 = this.fetchVPNInfo.hashCode();
        int iHashCode8 = this.AuCTel.hashCode();
        int iHashCode9 = java.lang.Boolean.hashCode(this.uzCIH);
        int iHashCode10 = java.lang.Boolean.hashCode(this.fJNWhG);
        int iHashCode11 = this.djBIcL.hashCode();
        int iHashCode12 = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode13 = this.hDKMBd.hashCode();
        int iHashCode14 = this.gHZMYf.hashCode();
        int iHashCode15 = this.EZpvd.hashCode();
        int iHashCode16 = this.fARcdN.hashCode();
        int iHashCode17 = this.values.hashCode();
        int iHashCode18 = java.lang.Integer.hashCode(this.ejfBZ);
        java.lang.Integer num = this.DbNXlk;
        int iHashCode19 = num == null ? 0 : num.hashCode();
        int iHashCode20 = this.sSMYrx.hashCode();
        int iHashCode21 = this.wlaJM.hashCode();
        java.lang.Boolean bool = this.AwvSrB;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.zLjUOn)) * 31) + this.zsXlph.hashCode()) * 31) + this.AuCTelauCTel.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.getNewProxyInstance.hashCode()) * 31) + this.iwGUEr.hashCode()) * 31) + this.AxsJAY.hashCode()) * 31) + java.lang.Float.hashCode(this.AkhnZx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wlaJM = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String sSMYrx() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.getFieldNames;
        java.lang.String str2 = this.fIwbmz;
        java.lang.String str3 = this.zuBGHE;
        java.lang.String str4 = this.AEQbTJ;
        java.lang.String str5 = this.AubY;
        java.lang.String str6 = this.gEmmrt;
        java.lang.String str7 = this.fetchVPNInfo;
        java.lang.String str8 = this.AuCTel;
        boolean z = this.uzCIH;
        boolean z2 = this.fJNWhG;
        java.lang.String str9 = this.djBIcL;
        int i = this.KWHzl;
        java.lang.String str10 = this.hDKMBd;
        java.lang.String str11 = this.gHZMYf;
        java.lang.String str12 = this.EZpvd;
        java.lang.CharSequence charSequence = this.fARcdN;
        java.lang.String str13 = this.values;
        int i2 = this.ejfBZ;
        java.lang.Integer num = this.DbNXlk;
        java.lang.CharSequence charSequence2 = this.sSMYrx;
        return "FollowDynamicItemData(strategyType=" + str + ", orderFinishTime=" + str2 + ", userName=" + str3 + ", avatar=" + str4 + ", time=" + str5 + ", desc=" + str6 + ", marginMode=" + str7 + ", sideLever=" + str8 + ", sideLeverTextColor=" + z + ", showInfoLayout=" + z2 + ", coinUrl=" + str9 + ", coinRes=" + i + ", targetId=" + str10 + ", userId=" + str11 + ", coinTitle=" + str12 + ", oneTitle=" + ((java.lang.Object) charSequence) + ", oneText=" + str13 + ", oneTextStyle=" + i2 + ", oneTextColor=" + num + ", twoTitle=" + ((java.lang.Object) charSequence2) + ", twoText=" + this.wlaJM + ", twoTextUpColor=" + this.AwvSrB + ", twoTextStyle=" + this.zLjUOn + ", threeTitle=" + this.zsXlph + ", threeText=" + this.AuCTelauCTel + ", fourTitle=" + this.isConnected + ", fourText=" + this.valueOf + ", fiveTitle=" + this.AhwBna + ", fiveText=" + this.AYXKKw + ", sixTitle=" + this.getNewProxyInstance + ", sixText=" + this.iwGUEr + ", uniqueName=" + this.AxsJAY + ", onTextPaddingTop=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zsXlph = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence wlaJM() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean zsXlph() {
        return this.AwvSrB;
    }

    public C46139tJg(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, boolean z2, @NotNull java.lang.String str9, int i, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str13, int i2, java.lang.Integer num, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.String str14, java.lang.Boolean bool, int i3, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, @NotNull java.lang.String str18, @NotNull java.lang.String str19, @NotNull java.lang.String str20, @NotNull java.lang.String str21, @NotNull java.lang.String str22, @NotNull java.lang.String str23, float f) {
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
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
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
        this.getFieldNames = str;
        this.fIwbmz = str2;
        this.zuBGHE = str3;
        this.AEQbTJ = str4;
        this.AubY = str5;
        this.gEmmrt = str6;
        this.fetchVPNInfo = str7;
        this.AuCTel = str8;
        this.uzCIH = z;
        this.fJNWhG = z2;
        this.djBIcL = str9;
        this.KWHzl = i;
        this.hDKMBd = str10;
        this.gHZMYf = str11;
        this.EZpvd = str12;
        this.fARcdN = charSequence;
        this.values = str13;
        this.ejfBZ = i2;
        this.DbNXlk = num;
        this.sSMYrx = charSequence2;
        this.wlaJM = str14;
        this.AwvSrB = bool;
        this.zLjUOn = i3;
        this.zsXlph = str15;
        this.AuCTelauCTel = str16;
        this.isConnected = str17;
        this.valueOf = str18;
        this.AhwBna = str19;
        this.AYXKKw = str20;
        this.getNewProxyInstance = str21;
        this.iwGUEr = str22;
        this.AxsJAY = str23;
        this.AkhnZx = f;
        this.OLrzqt = new PlanetAvatarInfo(str4, null, str3, str10, 2, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x018a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r67v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r67v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r67v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r67v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r67v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r67v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r67v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r67v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r67v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r67v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r43v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r67v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r67v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r67v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r67v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r67v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0082: ARITH (r67v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r67v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0098: ARITH (r67v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r51v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r67v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r67v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r67v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r67v0 int) & (2097152 int) A[WRAPPED]) == (0 int)) ? (r55v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r67v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r56v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r67v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r67v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r67v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r67v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r67v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r67v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r67v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r67v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r67v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x013d: ARITH (r68v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r66v0 float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, int, java.lang.Integer, java.lang.CharSequence, java.lang.String, java.lang.Boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float):void (m)] (LINE:181) call: o.tJg.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, int, java.lang.Integer, java.lang.CharSequence, java.lang.String, java.lang.Boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float):void type: THIS */
    public /* synthetic */ C46139tJg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z, boolean z2, java.lang.String str9, int i, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.CharSequence charSequence, java.lang.String str13, int i2, java.lang.Integer num, java.lang.CharSequence charSequence2, java.lang.String str14, java.lang.Boolean bool, int i3, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22, java.lang.String str23, float f, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? "" : str7, (i4 & 128) != 0 ? "" : str8, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? true : z2, (i4 & 1024) != 0 ? "" : str9, (i4 & 2048) != 0 ? 0 : i, (i4 & 4096) != 0 ? "" : str10, (i4 & 8192) != 0 ? "" : str11, (i4 & 16384) != 0 ? "" : str12, (i4 & 32768) != 0 ? "" : charSequence, (i4 & 65536) != 0 ? "" : str13, (i4 & 131072) != 0 ? 0 : i2, (i4 & 262144) != 0 ? null : num, (i4 & 524288) != 0 ? "" : charSequence2, (i4 & 1048576) != 0 ? "" : str14, (i4 & 2097152) == 0 ? bool : null, (i4 & 4194304) != 0 ? 0 : i3, (i4 & 8388608) != 0 ? "" : str15, (i4 & 16777216) != 0 ? "" : str16, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str17, (i4 & 67108864) != 0 ? "" : str18, (i4 & 134217728) != 0 ? "" : str19, (i4 & 268435456) != 0 ? "" : str20, (i4 & 536870912) != 0 ? "" : str21, (i4 & 1073741824) != 0 ? "" : str22, (i4 & Integer.MIN_VALUE) != 0 ? "" : str23, (i5 & 1) != 0 ? 0.0f : f);
    }

    /* JADX INFO: renamed from: o.tJg$TaskDescription */
    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z2 = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(boolean z, boolean z2) {
            return new TaskDescription(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.AEQbTJ == taskDescription.AEQbTJ && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Payload(isAvatarChanged=" + this.AEQbTJ + ", isCoinChanged=" + this.KWHzl + ")";
        }

        public TaskDescription(boolean z, boolean z2) {
            this.AEQbTJ = z;
            this.KWHzl = z2;
        }
    }

    /* JADX INFO: renamed from: o.tJg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TaskDescription EZpvd(@NotNull C46139tJg c46139tJg, @NotNull C46139tJg c46139tJg2) {
            Intrinsics.checkNotNullParameter(c46139tJg, "");
            Intrinsics.checkNotNullParameter(c46139tJg2, "");
            return new TaskDescription(!Intrinsics.EZpvd((java.lang.Object) c46139tJg.OLrzqt(), (java.lang.Object) c46139tJg2.OLrzqt()), (c46139tJg.KWHzl() == c46139tJg2.KWHzl() && Intrinsics.EZpvd((java.lang.Object) c46139tJg.AEQbTJ(), (java.lang.Object) c46139tJg2.AEQbTJ())) ? false : true);
        }
    }
}
