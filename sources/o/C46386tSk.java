package o;

import com.okinc.core.util.SPUtils;
import com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46386tSk {
    public static final C46386tSk copydefault = new C46386tSk();

    private C46386tSk() {
    }

    public final boolean AubY(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("TRADING_INFO_RESET_RED_DOT" + str, true, "social_trade");
    }

    public final void isConnected(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("TRADING_INFO_RESET_RED_DOT" + str, java.lang.Boolean.FALSE, "social_trade");
    }

    public final void fIwbmz(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("AFFILIATE_BINDING_RED_DOT_IN_BIO" + str, java.lang.Boolean.FALSE, "social_trade");
    }

    public final boolean getFieldNames(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("AFFILIATE_BINDING_RED_DOT_IN_BIO" + str, true, "social_trade");
    }

    public final void AEQbTJ(java.lang.String str, @NotNull OrbitBeanResp orbitBeanResp) {
        Intrinsics.checkNotNullParameter(orbitBeanResp, "");
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_DATA" + str, orbitBeanResp, "planet");
    }

    public final OrbitBeanResp AYXKKw(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return (OrbitBeanResp) SPUtils.getObject("ORBIT_DATA" + str, OrbitBeanResp.class, "planet");
    }

    public final void EZpvd(java.lang.String str, @NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp) {
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        if (str == null) {
            str = "";
        }
        SPUtils.put("PROFILE_INFO" + str, planetBasicUserInfoResp, "planet");
    }

    public final PlanetBasicUserInfoResp values(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return (PlanetBasicUserInfoResp) SPUtils.getObject("PROFILE_INFO" + str, PlanetBasicUserInfoResp.class, "planet");
    }

    public final void copydefault(java.lang.String str, @NotNull PublishPermissionResp publishPermissionResp) {
        Intrinsics.checkNotNullParameter(publishPermissionResp, "");
        if (str == null) {
            str = "";
        }
        SPUtils.put("PUBLISH_PERMISSION" + str, publishPermissionResp, "planet");
    }

    public final PublishPermissionResp DbNXlk(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return (PublishPermissionResp) SPUtils.getObject("PUBLISH_PERMISSION" + str, PublishPermissionResp.class, "planet");
    }

    public static /* synthetic */ void setShowOrbitIntroduction$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.uzCIH(str);
    }

    public final void uzCIH(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_INTRODUCTION_V2_" + str, java.lang.Boolean.FALSE, "planet");
    }

    public static /* synthetic */ boolean shouldShowOrbitIntroduction$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.AuCTelauCTel(str);
    }

    public final boolean AuCTelauCTel(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_INTRODUCTION_V2_" + str, true, "planet");
    }

    public static /* synthetic */ void setShowOrbitOnboarding$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.getNewProxyInstance(str);
    }

    public final void getNewProxyInstance(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_ONBOARDING" + str, java.lang.Boolean.FALSE, "planet");
    }

    public static /* synthetic */ boolean shouldShowOrbitOnboarding$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.wlaJM(str);
    }

    public final boolean wlaJM(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_ONBOARDING" + str, true, "planet");
    }

    public static /* synthetic */ void setShowOrbitAutoUpgrade$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.hDKMBd(str);
    }

    public final void hDKMBd(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_AUTO_UPGRADE" + str, java.lang.Boolean.FALSE, "planet");
    }

    public static /* synthetic */ boolean shouldShowOrbitAutoUpgrade$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.iwGUEr(str);
    }

    public final boolean iwGUEr(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_AUTO_UPGRADE" + str, true, "planet");
    }

    public static /* synthetic */ void clearShowOrbitOnboarding$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.remove("ORBIT_ONBOARDING" + str, "planet");
    }

    public static /* synthetic */ void clearShowOrbitIntroduction$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.OLrzqt(str);
    }

    public final void OLrzqt(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.remove("ORBIT_INTRODUCTION_V2_" + str, "planet");
    }

    public static /* synthetic */ boolean setChartType$default(C46386tSk c46386tSk, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.KWHzl(str, str2);
    }

    public final boolean KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            str = "";
        }
        return SPUtils.put("ORBIT_CHART_TYPE" + str, str2, "planet");
    }

    public static /* synthetic */ java.lang.String getChartType$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.EZpvd(str);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.String string = SPUtils.getString("ORBIT_CHART_TYPE" + str, TopTraderFilterBottomSheet.SelectionPNL.PNL_VALUE.getValue(), "planet");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ boolean setChartDays$default(C46386tSk c46386tSk, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.copydefault(str, str2);
    }

    public final boolean copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            str = "";
        }
        return SPUtils.put("ORBIT_CHART_DAYS" + str, str2, "planet");
    }

    public static /* synthetic */ java.lang.String getChartDays$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.AEQbTJ(str);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.String string = SPUtils.getString("ORBIT_CHART_DAYS" + str, TopTraderFilterBottomSheet.SelectionDays.DAY_30.getValue(), "planet");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ void saveProfileReminderCloseTime$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.AkhnZx(str);
    }

    public final void AkhnZx(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("PROFILE_REMINDER_CLOSE_TIME" + str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "planet");
    }

    public static /* synthetic */ long getProfileReminderCloseTime$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.fetchVPNInfo(str);
    }

    public final long fetchVPNInfo(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.Long l = SPUtils.getLong("PROFILE_REMINDER_CLOSE_TIME" + str, 0L, "planet");
        Intrinsics.checkNotNullExpressionValue(l, "");
        return l.longValue();
    }

    public static /* synthetic */ void clearProfileReminderCloseTime$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.copydefault(str);
    }

    public final void copydefault(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.remove("PROFILE_REMINDER_CLOSE_TIME" + str, "planet");
    }

    public static /* synthetic */ boolean shouldShowProfileReminder$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.zLjUOn(str);
    }

    public final boolean zLjUOn(java.lang.String str) {
        long jFetchVPNInfo = fetchVPNInfo(str);
        if (jFetchVPNInfo == 0) {
            return true;
        }
        return (java.lang.System.currentTimeMillis() - jFetchVPNInfo) / ((long) 86400000) >= 30;
    }

    public static /* synthetic */ void setOrbiterPlusExpiredShowAbove4D$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.ejfBZ(str);
    }

    public final void ejfBZ(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_PLUS_EXPIRED_SHOW_4_7" + str, java.lang.Boolean.TRUE, "orbiter_plus");
    }

    public static /* synthetic */ boolean getOrbiterPlusExpiredShowAbove4D$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.AhwBna(str);
    }

    public final boolean AhwBna(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_PLUS_EXPIRED_SHOW_4_7" + str, false, "orbiter_plus");
    }

    public static /* synthetic */ void setOrbiterPlusExpiredShowBelow4D$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.fARcdN(str);
    }

    public final void fARcdN(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_PLUS_EXPIRED_SHOW_1_3" + str, java.lang.Boolean.TRUE, "orbiter_plus");
    }

    public static /* synthetic */ boolean getOrbiterPlusExpiredShowBelow4D$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.djBIcL(str);
    }

    public final boolean djBIcL(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_PLUS_EXPIRED_SHOW_1_3" + str, false, "orbiter_plus");
    }

    public static /* synthetic */ void setOrbiterPlusHadExpiredShow$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.fJNWhG(str);
    }

    public final void fJNWhG(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_PLUS_HAD_EXPIRED_SHOW" + str, java.lang.Boolean.TRUE, "orbiter_plus");
    }

    public static /* synthetic */ boolean getOrbiterPlusHadExpiredShow$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.gEmmrt(str);
    }

    public final boolean gEmmrt(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_PLUS_HAD_EXPIRED_SHOW" + str, false, "orbiter_plus");
    }

    public static /* synthetic */ void setOrbiterPlusAlertBannerClosed$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c46386tSk.AuCTel(str);
    }

    public final void AuCTel(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("ORBIT_PLUS_HAD_CLOSE_EXPIRED_ALERT" + str, java.lang.Boolean.TRUE, "orbiter_plus");
    }

    public static /* synthetic */ boolean getOrbiterPlusAlertBannerClosed$default(C46386tSk c46386tSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c46386tSk.valueOf(str);
    }

    public final boolean valueOf(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return SPUtils.getBoolean("ORBIT_PLUS_HAD_CLOSE_EXPIRED_ALERT" + str, false, "orbiter_plus");
    }

    public final void OLrzqt() {
        java.lang.String strCopydefault = C46388tSm.Companion.KWHzl().copydefault();
        java.lang.String str = "ORBIT_PLUS_EXPIRED_SHOW_1_3" + (strCopydefault == null ? "" : strCopydefault);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        SPUtils.put(str, bool, "orbiter_plus");
        SPUtils.put("ORBIT_PLUS_EXPIRED_SHOW_4_7" + (strCopydefault == null ? "" : strCopydefault), bool, "orbiter_plus");
        SPUtils.put("ORBIT_PLUS_HAD_EXPIRED_SHOW" + (strCopydefault == null ? "" : strCopydefault), bool, "orbiter_plus");
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        SPUtils.put("ORBIT_PLUS_HAD_CLOSE_EXPIRED_ALERT" + strCopydefault, bool, "orbiter_plus");
    }
}
