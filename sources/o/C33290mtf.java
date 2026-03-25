package o;

import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.config.ThemeSyncConfigUnit$run$1;
import com.okinc.core.ok_app.configuration.config.ThemeSyncConfigUnit$run$2$updated$1;
import com.okinc.core.ok_app.configuration.config.ThemeSyncConfigUnit$run$3$updated$1;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okuser.data.PersonalSetting;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33290mtf {
    public final OKComplianceRestrictionService AEQbTJ;
    public final InterfaceC47278tmy EZpvd;
    public final InterfaceC33171mrS KWHzl;

    @yCM
    public C33290mtf(@NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.KWHzl = interfaceC33171mrS;
        this.EZpvd = interfaceC47278tmy;
        this.AEQbTJ = oKComplianceRestrictionService;
    }

    public final boolean AEQbTJ(@NotNull Scenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "");
        if (Intrinsics.EZpvd(scenario, new Scenario.Logout(false, 1, null))) {
            int iOLrzqt = OLrzqt();
            pUU.KWHzl("ConfigManager", "expectedColorTheme: " + iOLrzqt + ", currentTheme: " + C33512mxp.AEQbTJ.AYXKKw() + "}");
            return KWHzl(iOLrzqt);
        }
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = copydefault();
        if (pairCopydefault == null) {
            return false;
        }
        java.lang.Integer first = pairCopydefault.getFirst();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iIsConnected = c33512mxp.isConnected();
        java.lang.Integer second = pairCopydefault.getSecond();
        int iAYXKKw = c33512mxp.AYXKKw();
        boolean z = c33512mxp.DbNXlk() != null;
        pUU.KWHzl("ConfigManager", "user theme: " + first + ", current: " + iIsConnected + ", user chart: " + second + ", current: " + iAYXKKw + ", isEnforcing: " + z + ", target To Pro Mode: " + EZpvd() + ",");
        return c33512mxp.isConnected() != pairCopydefault.getFirst().intValue() || (KWHzl(pairCopydefault.getSecond().intValue()) && !this.KWHzl.fIwbmz());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Scenario scenario, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ThemeSyncConfigUnit$run$1 themeSyncConfigUnit$run$1;
        int iIntValue;
        int i;
        if (continuation instanceof ThemeSyncConfigUnit$run$1) {
            themeSyncConfigUnit$run$1 = (ThemeSyncConfigUnit$run$1) continuation;
            int i2 = themeSyncConfigUnit$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                themeSyncConfigUnit$run$1.label = i2 - Integer.MIN_VALUE;
            } else {
                themeSyncConfigUnit$run$1 = new ThemeSyncConfigUnit$run$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = themeSyncConfigUnit$run$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = themeSyncConfigUnit$run$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (Intrinsics.EZpvd(scenario, new Scenario.Logout(false, 1, null))) {
                int iOLrzqt = OLrzqt();
                MainCoroutineDispatcher main = Dispatchers.getMain();
                ThemeSyncConfigUnit$run$2$updated$1 themeSyncConfigUnit$run$2$updated$1 = new ThemeSyncConfigUnit$run$2$updated$1(this, iOLrzqt, null);
                themeSyncConfigUnit$run$1.label = 1;
                objWithContext = BuildersKt.withContext(main, themeSyncConfigUnit$run$2$updated$1, themeSyncConfigUnit$run$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                if (((java.lang.Boolean) objWithContext).booleanValue()) {
                }
            } else {
                kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = copydefault();
                if (pairCopydefault != null) {
                    int iIntValue2 = pairCopydefault.component1().intValue();
                    iIntValue = pairCopydefault.component2().intValue();
                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                    ThemeSyncConfigUnit$run$3$updated$1 themeSyncConfigUnit$run$3$updated$1 = new ThemeSyncConfigUnit$run$3$updated$1(this, iIntValue2, iIntValue, null);
                    themeSyncConfigUnit$run$1.I$0 = iIntValue2;
                    themeSyncConfigUnit$run$1.I$1 = iIntValue;
                    themeSyncConfigUnit$run$1.label = 2;
                    java.lang.Object objWithContext2 = BuildersKt.withContext(main2, themeSyncConfigUnit$run$3$updated$1, themeSyncConfigUnit$run$1);
                    if (objWithContext2 == objCopydefault) {
                        return objCopydefault;
                    }
                    i = iIntValue2;
                    objWithContext = objWithContext2;
                    if (((java.lang.Boolean) objWithContext).booleanValue()) {
                    }
                }
            }
        } else if (i3 == 1) {
            C56391yDq.AEQbTJ(objWithContext);
            if (((java.lang.Boolean) objWithContext).booleanValue()) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                RxBus.AEQbTJ(new C33504mxh(c33512mxp.isConnected(), c33512mxp.AYXKKw()));
            }
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = themeSyncConfigUnit$run$1.I$1;
            i = themeSyncConfigUnit$run$1.I$0;
            C56391yDq.AEQbTJ(objWithContext);
            if (((java.lang.Boolean) objWithContext).booleanValue()) {
                RxBus.AEQbTJ(new C33504mxh(i, iIntValue));
            }
        }
        return Unit.INSTANCE;
    }

    public final int OLrzqt() {
        return !EZpvd() ? 1 : 0;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault() {
        PersonalSetting personalSetting;
        User userOLrzqt = this.EZpvd.OLrzqt();
        if (userOLrzqt == null || (personalSetting = userOLrzqt.getPersonalSetting()) == null) {
            return null;
        }
        int upDownColor = personalSetting.getUpDownColor();
        int i = 1;
        if (EZpvd()) {
            int colorPalette = personalSetting.getColorPalette();
            if (colorPalette == 0 || colorPalette == 1) {
                i = 0;
            } else if (colorPalette != 2) {
                if (colorPalette != 3) {
                    pUU.copydefault("Unknown chart style: " + personalSetting.getColorPalette() + ", rollback to classic");
                }
                i = 0;
            }
        }
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(upDownColor), java.lang.Integer.valueOf(i));
    }

    public final boolean EZpvd() {
        return this.AEQbTJ.fIwbmz().contains(OKComplianceRestrictionService.CefiMode.PRO.getModeName());
    }

    public final boolean KWHzl(int i) {
        if (!EZpvd()) {
            if (C33512mxp.AEQbTJ.AYXKKw() != 1) {
                return true;
            }
        } else if (C33512mxp.AEQbTJ.AYXKKw() != i) {
            return true;
        }
        return false;
    }

    public final void KWHzl() {
        if (EZpvd()) {
            C33512mxp.AEQbTJ.OLrzqt((java.lang.Integer) null);
        }
    }
}
