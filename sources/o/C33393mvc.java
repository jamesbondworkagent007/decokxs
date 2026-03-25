package o;

import com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import dagger.Lazy;

/* JADX INFO: renamed from: o.mvc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33393mvc {
    public static void KWHzl(WelcomeActivity welcomeActivity, Lazy<OKComplianceRestrictionService> lazy) {
        welcomeActivity.featureRestriction = lazy;
    }

    public static void copydefault(WelcomeActivity welcomeActivity, Lazy<InterfaceC47278tmy> lazy) {
        welcomeActivity.userManager = lazy;
    }

    public static void OLrzqt(WelcomeActivity welcomeActivity, Lazy<InterfaceC33308mtx> lazy) {
        welcomeActivity.environment = lazy;
    }

    public static void EZpvd(WelcomeActivity welcomeActivity, C33285mta c33285mta) {
        welcomeActivity.configManager = c33285mta;
    }
}
