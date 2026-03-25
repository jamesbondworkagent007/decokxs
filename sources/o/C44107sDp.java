package o;

import com.okinc.base.utils.OkUtils;
import com.okinc.okex.util.AppWarningConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C44103sDl;

/* JADX INFO: renamed from: o.sDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44107sDp {
    public static final void copydefault() {
        if (InterfaceC32484meU.Companion.KWHzl().AhwBna() == null) {
            return;
        }
        try {
            OLrzqt();
            C44103sDl.ActionBar actionBar = C44103sDl.Companion;
            C48787ucK.AEQbTJ.AEQbTJ("appWarningConfig", new Application());
            C44093sDb.EZpvd.copydefault();
        } catch (java.lang.Exception e) {
            pUU.copydefault("GuardUtil", "setupGuard error: " + e.getMessage());
        }
        C44103sDl.ActionBar actionBar2 = C44103sDl.Companion;
        android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(applicationAEQbTJ, "");
        pUU.OLrzqt("GuardUtil", "readCccFile " + actionBar2.OLrzqt(applicationAEQbTJ));
    }

    /* JADX INFO: renamed from: o.sDp$Application */
    public static final class Application implements InterfaceC48788ucL {
        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            C44107sDp.OLrzqt();
        }
    }

    public static final void OLrzqt() {
        AppWarningConfig appWarningConfig = (AppWarningConfig) C48787ucK.AEQbTJ.EZpvd("appWarningConfig", AppWarningConfig.class);
        pUU.KWHzl("DetectionDialogManager", "OnStrategyUpdateListener appWarningConfig: " + appWarningConfig);
        if (appWarningConfig == null) {
            C44093sDb.EZpvd.EZpvd(false);
            return;
        }
        boolean z = appWarningConfig.getShowAlert() == 1;
        if (appWarningConfig.getDeviceList().contains(xVW.copydefault())) {
            C44093sDb.EZpvd.OLrzqt(1);
        } else {
            C44093sDb.EZpvd.OLrzqt(0);
        }
        C44093sDb.EZpvd.EZpvd(z);
    }
}
