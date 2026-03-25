package o;

import com.onesignal.OneSignal;
import o.C57835yps;

/* JADX INFO: renamed from: o.yoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57752yoO {
    public C57835yps.Application copydefault = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57835yps.Application OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.copydefault = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.copydefault != null;
    }

    public void OLrzqt(C57835yps.Application application, C57873yqd c57873yqd, InterfaceC57757yoT interfaceC57757yoT, InterfaceC57738yoA interfaceC57738yoA) {
        this.copydefault = application;
        java.lang.String str = C57834ypr.copydefault;
        C57834ypr.KWHzl(str, "GT_FIREBASE_TRACKING_ENABLED", application.gEmmrt);
        copydefault(application.DbNXlk);
        C57834ypr.KWHzl(str, "OS_CLEAR_GROUP_SUMMARY_CLICK", application.copydefault);
        C57834ypr.KWHzl(str, interfaceC57757yoT.AEQbTJ(), application.djBIcL.AhwBna);
        AEQbTJ(application.fetchVPNInfo);
        interfaceC57738yoA.OLrzqt("OneSignal saveInfluenceParams: " + application.djBIcL.toString());
        c57873yqd.OLrzqt(application.djBIcL);
        java.lang.Boolean bool = application.EZpvd;
        if (bool != null) {
            EZpvd(bool.booleanValue());
        }
        java.lang.Boolean bool2 = application.values;
        if (bool2 != null) {
            AhwBna(bool2.booleanValue());
        }
        java.lang.Boolean bool3 = application.valueOf;
        if (bool3 != null) {
            OneSignal.gEmmrt(bool3.booleanValue());
        }
        java.lang.Boolean bool4 = application.AkhnZx;
        if (bool4 != null) {
            OLrzqt(bool4.booleanValue());
        }
    }

    public boolean AYXKKw() {
        C57835yps.Application application = this.copydefault;
        return (application == null || application.EZpvd == null) ? false : true;
    }

    public boolean AhwBna() {
        C57835yps.Application application = this.copydefault;
        return (application == null || application.AkhnZx == null) ? false : true;
    }

    public final void copydefault(boolean z) {
        C57834ypr.KWHzl(C57834ypr.copydefault, "OS_RESTORE_TTL_FILTER", this.copydefault.DbNXlk);
    }

    public boolean values() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "OS_RESTORE_TTL_FILTER", true);
    }

    public final void AEQbTJ(boolean z) {
        C57834ypr.KWHzl(C57834ypr.copydefault, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z);
    }

    public boolean isConnected() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    public boolean AEQbTJ() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    public boolean KWHzl() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    public boolean AkhnZx() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }

    public void AhwBna(boolean z) {
        C57834ypr.KWHzl(C57834ypr.copydefault, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z);
    }

    public boolean valueOf() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    public void EZpvd(boolean z) {
        C57834ypr.KWHzl(C57834ypr.copydefault, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z);
    }

    public boolean gEmmrt() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_LOCATION_SHARED", true);
    }

    public void KWHzl(boolean z) {
        C57834ypr.KWHzl(C57834ypr.copydefault, "PREFS_OS_LOCATION_SHARED", z);
    }

    public boolean djBIcL() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    public void OLrzqt(boolean z) {
        C57834ypr.KWHzl(C57834ypr.copydefault, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z);
    }

    public boolean EZpvd() {
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }
}
