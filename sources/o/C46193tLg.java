package o;

import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetBioContent;
import com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus;
import com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo;
import com.okinc.planet.biz_userprofile.data.PlanetRoleType;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.biz_userprofile.data.PlanetUserType;
import com.okinc.planet.serializer.PlanetNumericString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.tKZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46193tLg implements tKZ {
    public final PlanetBioContent AEQbTJ;
    public final FollowStatusV2Enum AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final PlanetRoleType AuCTel;
    public final boolean DbNXlk;
    public final java.lang.String EZpvd;
    public PlanetBasicUserInfoResp KWHzl;
    public final PlanetAvatarInfo OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final java.lang.String djBIcL;
    public final PlanetOfficialStatus ejfBZ;
    public final java.lang.String fARcdN;
    public final PlanetRoleType fIwbmz;
    public final java.lang.String fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final PlanetRoleType getFieldNames;
    public final PlanetUserType getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final boolean isConnected;
    public final java.lang.String iwGUEr;
    public final PlanetRoleType uzCIH;
    public final java.lang.String valueOf;
    public final java.util.List<PlanetProfileGroupInfo> values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 boolean)
  (r8v0 com.okinc.planet.biz_notifications.model.FollowStatusV2Enum)
  (r9v0 java.lang.String)
  (r10v0 com.okinc.planet.biz_userprofile.data.PlanetRoleType)
  (r11v0 com.okinc.planet.biz_userprofile.data.PlanetRoleType)
  (r12v0 com.okinc.planet.biz_userprofile.data.PlanetRoleType)
  (r13v0 com.okinc.planet.biz_userprofile.data.PlanetRoleType)
  (r14v0 com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus)
  (r15v0 com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp)
  (r16v0 com.okinc.planet.biz_userprofile.data.PlanetBioContent)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.util.List)
  (r21v0 java.lang.String)
  (r22v0 com.okinc.planet.biz_userprofile.data.PlanetUserType)
  (r23v0 java.util.List)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
 A[MD:(boolean, com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.planet.biz_notifications.model.FollowStatusV2Enum, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus, com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp, com.okinc.planet.biz_userprofile.data.PlanetBioContent, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetUserType, java.util.List<com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo>, java.lang.String, java.lang.String):void (m)] call: o.tLg.<init>(boolean, com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.planet.biz_notifications.model.FollowStatusV2Enum, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetRoleType, com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus, com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp, com.okinc.planet.biz_userprofile.data.PlanetBioContent, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetUserType, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46193tLg(boolean z, PlanetAvatarInfo planetAvatarInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, FollowStatusV2Enum followStatusV2Enum, java.lang.String str5, PlanetRoleType planetRoleType, PlanetRoleType planetRoleType2, PlanetRoleType planetRoleType3, PlanetRoleType planetRoleType4, PlanetOfficialStatus planetOfficialStatus, PlanetBasicUserInfoResp planetBasicUserInfoResp, PlanetBioContent planetBioContent, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.util.List list, java.lang.String str9, PlanetUserType planetUserType, java.util.List list2, java.lang.String str10, java.lang.String str11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, planetAvatarInfo, str, str2, str3, str4, z2, followStatusV2Enum, str5, planetRoleType, planetRoleType2, planetRoleType3, planetRoleType4, planetOfficialStatus, planetBasicUserInfoResp, planetBioContent, str6, str7, str8, list, str9, planetUserType, list2, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tKZ
    public boolean AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowStatusV2Enum AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType AuCTel() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<PlanetProfileGroupInfo> DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetAvatarInfo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46193tLg KWHzl(boolean z, @NotNull PlanetAvatarInfo planetAvatarInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z2, FollowStatusV2Enum followStatusV2Enum, @NotNull java.lang.String str5, @NotNull PlanetRoleType planetRoleType, @NotNull PlanetRoleType planetRoleType2, @NotNull PlanetRoleType planetRoleType3, @NotNull PlanetRoleType planetRoleType4, @NotNull PlanetOfficialStatus planetOfficialStatus, @NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, PlanetBioContent planetBioContent, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str9, @NotNull PlanetUserType planetUserType, @NotNull java.util.List<PlanetProfileGroupInfo> list2, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
        Intrinsics.checkNotNullParameter(planetAvatarInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(planetRoleType, "");
        Intrinsics.checkNotNullParameter(planetRoleType2, "");
        Intrinsics.checkNotNullParameter(planetRoleType3, "");
        Intrinsics.checkNotNullParameter(planetRoleType4, "");
        Intrinsics.checkNotNullParameter(planetOfficialStatus, "");
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(planetUserType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new C46193tLg(z, planetAvatarInfo, str, str2, str3, str4, z2, followStatusV2Enum, str5, planetRoleType, planetRoleType2, planetRoleType3, planetRoleType4, planetOfficialStatus, planetBasicUserInfoResp, planetBioContent, str6, str7, str8, list, str9, planetUserType, list2, str10, str11, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetBioContent OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetBasicUserInfoResp copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType ejfBZ() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46193tLg)) {
            return false;
        }
        C46193tLg c46193tLg = (C46193tLg) obj;
        return this.isConnected == c46193tLg.isConnected && Intrinsics.EZpvd(this.OLrzqt, c46193tLg.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c46193tLg.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c46193tLg.valueOf) && PlanetUniqueName.KWHzl(this.iwGUEr, c46193tLg.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46193tLg.gEmmrt) && this.DbNXlk == c46193tLg.DbNXlk && this.AYXKKw == c46193tLg.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c46193tLg.fARcdN) && this.AuCTel == c46193tLg.AuCTel && this.uzCIH == c46193tLg.uzCIH && this.getFieldNames == c46193tLg.getFieldNames && this.fIwbmz == c46193tLg.fIwbmz && this.ejfBZ == c46193tLg.ejfBZ && Intrinsics.EZpvd(this.KWHzl, c46193tLg.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c46193tLg.AEQbTJ) && PlanetAuthorId.OLrzqt(this.EZpvd, c46193tLg.EZpvd) && PlanetNumericString.EZpvd(this.AkhnZx, c46193tLg.AkhnZx) && PlanetNumericString.EZpvd(this.AhwBna, c46193tLg.AhwBna) && Intrinsics.EZpvd(this.copydefault, c46193tLg.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) c46193tLg.hDKMBd) && this.getNewProxyInstance == c46193tLg.getNewProxyInstance && Intrinsics.EZpvd(this.values, c46193tLg.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c46193tLg.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c46193tLg.fJNWhG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fARcdN() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.isConnected);
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.fetchVPNInfo.hashCode();
        int iHashCode4 = this.valueOf.hashCode();
        int iOLrzqt = PlanetUniqueName.OLrzqt(this.iwGUEr);
        int iHashCode5 = this.gEmmrt.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.DbNXlk);
        FollowStatusV2Enum followStatusV2Enum = this.AYXKKw;
        int iHashCode7 = followStatusV2Enum == null ? 0 : followStatusV2Enum.hashCode();
        int iHashCode8 = this.fARcdN.hashCode();
        int iHashCode9 = this.AuCTel.hashCode();
        int iHashCode10 = this.uzCIH.hashCode();
        int iHashCode11 = this.getFieldNames.hashCode();
        int iHashCode12 = this.fIwbmz.hashCode();
        int iHashCode13 = this.ejfBZ.hashCode();
        int iHashCode14 = this.KWHzl.hashCode();
        PlanetBioContent planetBioContent = this.AEQbTJ;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iOLrzqt) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (planetBioContent == null ? 0 : planetBioContent.hashCode())) * 31) + PlanetAuthorId.AEQbTJ(this.EZpvd)) * 31) + PlanetNumericString.EZpvd(this.AkhnZx)) * 31) + PlanetNumericString.EZpvd(this.AhwBna)) * 31) + this.copydefault.hashCode()) * 31) + this.hDKMBd.hashCode()) * 31) + this.getNewProxyInstance.hashCode()) * 31) + this.values.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.fJNWhG.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetOfficialStatus isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetUserProperties(isSelf=" + this.isConnected + ", avatarInfo=" + this.OLrzqt + ", nickName=" + this.fetchVPNInfo + ", enNickName=" + this.valueOf + ", uniqueName=" + PlanetUniqueName.copydefault(this.iwGUEr) + ", countryId=" + this.gEmmrt + ", hasFollowedThisUser=" + this.DbNXlk + ", followStatusV2=" + this.AYXKKw + ", publicStatus=" + this.fARcdN + ", roleType=" + this.AuCTel + ", strategyRoleType=" + this.uzCIH + ", spotRoleType=" + this.getFieldNames + ", signalRoleType=" + this.fIwbmz + ", officialStatus=" + this.ejfBZ + ", basicData=" + this.KWHzl + ", bioContent=" + this.AEQbTJ + ", authorId=" + PlanetAuthorId.EZpvd(this.EZpvd) + ", followerCount=" + PlanetNumericString.copydefault(this.AkhnZx) + ", followeeCount=" + PlanetNumericString.copydefault(this.AhwBna) + ", badgeList=" + this.copydefault + ", sourceUrl=" + this.hDKMBd + ", userType=" + this.getNewProxyInstance + ", groupInfoList=" + this.values + ", competitionUrl=" + this.djBIcL + ", shareCode=" + this.fJNWhG + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String values() {
        return this.AkhnZx;
    }

    public C46193tLg(boolean z, PlanetAvatarInfo planetAvatarInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, FollowStatusV2Enum followStatusV2Enum, java.lang.String str5, PlanetRoleType planetRoleType, PlanetRoleType planetRoleType2, PlanetRoleType planetRoleType3, PlanetRoleType planetRoleType4, PlanetOfficialStatus planetOfficialStatus, PlanetBasicUserInfoResp planetBasicUserInfoResp, PlanetBioContent planetBioContent, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.util.List<java.lang.String> list, java.lang.String str9, PlanetUserType planetUserType, java.util.List<PlanetProfileGroupInfo> list2, java.lang.String str10, java.lang.String str11) {
        Intrinsics.checkNotNullParameter(planetAvatarInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(planetRoleType, "");
        Intrinsics.checkNotNullParameter(planetRoleType2, "");
        Intrinsics.checkNotNullParameter(planetRoleType3, "");
        Intrinsics.checkNotNullParameter(planetRoleType4, "");
        Intrinsics.checkNotNullParameter(planetOfficialStatus, "");
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(planetUserType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.isConnected = z;
        this.OLrzqt = planetAvatarInfo;
        this.fetchVPNInfo = str;
        this.valueOf = str2;
        this.iwGUEr = str3;
        this.gEmmrt = str4;
        this.DbNXlk = z2;
        this.AYXKKw = followStatusV2Enum;
        this.fARcdN = str5;
        this.AuCTel = planetRoleType;
        this.uzCIH = planetRoleType2;
        this.getFieldNames = planetRoleType3;
        this.fIwbmz = planetRoleType4;
        this.ejfBZ = planetOfficialStatus;
        this.KWHzl = planetBasicUserInfoResp;
        this.AEQbTJ = planetBioContent;
        this.EZpvd = str6;
        this.AkhnZx = str7;
        this.AhwBna = str8;
        this.copydefault = list;
        this.hDKMBd = str9;
        this.getNewProxyInstance = planetUserType;
        this.values = list2;
        this.djBIcL = str10;
        this.fJNWhG = str11;
    }

    public boolean AhwBna() {
        return tKZ.Application.EZpvd(this);
    }
}
