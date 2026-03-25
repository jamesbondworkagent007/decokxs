package o;

import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.data.OrbitSettingUpgradeCardType;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.manager.OrbitStatus;
import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.InterfaceC46130tIy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46131tIz {
    public static final C46131tIz EZpvd = new C46131tIz();

    /* JADX INFO: renamed from: o.tIz$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrbitStatus.values().length];
            try {
                iArr[OrbitStatus.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrbitStatus.ORBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrbitStatus.ORBIT_PLUS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    private C46131tIz() {
    }

    public final C46126tIu copydefault(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet, CurveResetInfo curveResetInfo, @NotNull OrbitStatus orbitStatus, boolean z, java.lang.String str, boolean z2) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        Intrinsics.checkNotNullParameter(orbitStatus, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String fieldNames = planetBasicUserInfoResp.getFieldNames();
        java.lang.String strFJNWhG = planetBasicUserInfoResp.fJNWhG();
        PlanetAvatarInfo planetAvatarInfo = new PlanetAvatarInfo(fieldNames, null, strFJNWhG == null ? "" : strFJNWhG, planetBasicUserInfoResp.gHZMYf(), 2, null);
        java.lang.String strFJNWhG2 = planetBasicUserInfoResp.fJNWhG();
        if (strFJNWhG2 == null) {
            strFJNWhG2 = "";
        }
        listOLrzqt.add(new InterfaceC46130tIy.Activity(planetAvatarInfo, strFJNWhG2));
        int i = Application.OLrzqt[orbitStatus.ordinal()];
        if (i == 1) {
            listOLrzqt.add(new InterfaceC46130tIy.PendingIntent(OrbitSettingUpgradeCardType.NON_ORBITER_TO_ORBITER));
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (z2) {
            listOLrzqt.add(new InterfaceC46130tIy.PendingIntent(OrbitSettingUpgradeCardType.ORBITER_PLUS_RECALL));
        } else {
            listOLrzqt.add(new InterfaceC46130tIy.PendingIntent(OrbitSettingUpgradeCardType.ORBITER_TO_ORBITER_PLUS));
        }
        if (orbitStatus == OrbitStatus.NORMAL) {
            listOLrzqt.add(InterfaceC46130tIy.Dialog.copydefault);
            listOLrzqt.add(InterfaceC46130tIy.ActionBar.OLrzqt);
        } else {
            InterfaceC46130tIy.Dialog dialog = InterfaceC46130tIy.Dialog.copydefault;
            listOLrzqt.add(dialog);
            listOLrzqt.add(new InterfaceC46130tIy.FragmentManager(z, str));
            if (planetBasicUserInfoResp.RJOkX()) {
                listOLrzqt.add(new InterfaceC46130tIy.TaskDescription(affiliatePartnerBeanForPlanet));
            }
            java.lang.String strHDKMBd = planetBasicUserInfoResp.hDKMBd();
            if (Intrinsics.EZpvd((java.lang.Object) strHDKMBd, (java.lang.Object) "1")) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.apNbdB);
            } else {
                strAYXKKw = Intrinsics.EZpvd((java.lang.Object) strHDKMBd, (java.lang.Object) "2") ? C33070mpX.AYXKKw(C47501trL.Fragment.dvImUD) : "";
            }
            listOLrzqt.add(new InterfaceC46130tIy.Fragment(strAYXKKw));
            if (C46219tMf.Companion.copydefault().KWHzl()) {
                listOLrzqt.add(new InterfaceC46130tIy.LoaderManager(curveResetInfo == null ? new CurveResetInfo(planetBasicUserInfoResp.AhwBna(), "", "") : curveResetInfo));
            }
            listOLrzqt.add(InterfaceC46130tIy.StateListAnimator.AEQbTJ);
            listOLrzqt.add(dialog);
            listOLrzqt.add(InterfaceC46130tIy.ActionBar.OLrzqt);
        }
        Unit unit = Unit.INSTANCE;
        return new C46126tIu(planetBasicUserInfoResp, orbitStatus, C56402yEa.fARcdN(listOLrzqt));
    }
}
