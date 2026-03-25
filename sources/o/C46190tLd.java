package o;

import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetBioContent;
import com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus;
import com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto;
import com.okinc.planet.biz_userprofile.data.PlanetRoleType;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.biz_userprofile.data.PlanetUserType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46190tLd {
    public static final C46193tLg EZpvd(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, boolean z) {
        PlanetBioContent planetBioContent;
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        PlanetAvatarInfo planetAvatarInfo = new PlanetAvatarInfo(planetBasicUserInfoResp.getFieldNames(), planetBasicUserInfoResp.iwGUEr(), planetBasicUserInfoResp.fJNWhG(), planetBasicUserInfoResp.gHZMYf());
        java.lang.String strFJNWhG = planetBasicUserInfoResp.fJNWhG();
        java.lang.String strFetchVPNInfo = planetBasicUserInfoResp.fetchVPNInfo();
        java.lang.String strAEQbTJ = PlanetUniqueName.AEQbTJ(planetBasicUserInfoResp.QOLQEE());
        PlanetProfileCountryInfoDto planetProfileCountryInfoDtoDjBIcL = planetBasicUserInfoResp.djBIcL();
        java.lang.String strAEQbTJ2 = planetProfileCountryInfoDtoDjBIcL != null ? planetProfileCountryInfoDtoDjBIcL.AEQbTJ() : null;
        java.lang.String str = strAEQbTJ2 != null ? strAEQbTJ2 : "";
        boolean zValues = planetBasicUserInfoResp.values();
        FollowStatusV2Enum followStatusV2EnumAEQbTJ = FollowStatusV2Enum.Companion.AEQbTJ(planetBasicUserInfoResp.AkhnZx());
        PlanetRoleType.Companion companion = PlanetRoleType.Companion;
        PlanetRoleType planetRoleTypeCopydefault = companion.copydefault(planetBasicUserInfoResp.zLjUOn());
        java.lang.String strHDKMBd = planetBasicUserInfoResp.hDKMBd();
        PlanetRoleType planetRoleTypeCopydefault2 = companion.copydefault(planetBasicUserInfoResp.sSMYrx());
        PlanetRoleType planetRoleTypeCopydefault3 = companion.copydefault(planetBasicUserInfoResp.AuCTelauCTel());
        PlanetRoleType planetRoleTypeCopydefault4 = companion.copydefault(planetBasicUserInfoResp.zsXlph());
        PlanetOfficialStatus planetOfficialStatusKWHzl = PlanetOfficialStatus.Companion.KWHzl(planetBasicUserInfoResp.getNewProxyInstance());
        if (z) {
            planetBioContent = new PlanetBioContent(planetBasicUserInfoResp.OLrzqt(), null);
        } else {
            planetBioContent = new PlanetBioContent(planetBasicUserInfoResp.OLrzqt(), planetBasicUserInfoResp.AwvSrB());
        }
        return new C46193tLg(z, planetAvatarInfo, strFJNWhG, strFetchVPNInfo, strAEQbTJ, str, zValues, followStatusV2EnumAEQbTJ, strHDKMBd, planetRoleTypeCopydefault, planetRoleTypeCopydefault2, planetRoleTypeCopydefault3, planetRoleTypeCopydefault4, planetOfficialStatusKWHzl, planetBasicUserInfoResp, planetBioContent, PlanetAuthorId.KWHzl(planetBasicUserInfoResp.EZpvd()), planetBasicUserInfoResp.isConnected(), planetBasicUserInfoResp.DbNXlk(), planetBasicUserInfoResp.KWHzl(), planetBasicUserInfoResp.AubY(), PlanetUserType.Companion.EZpvd(planetBasicUserInfoResp.OcIXYQ()), planetBasicUserInfoResp.ejfBZ(), planetBasicUserInfoResp.valueOf(), C33129mqd.gEmmrt(planetBasicUserInfoResp.wlaJM()), null);
    }
}
