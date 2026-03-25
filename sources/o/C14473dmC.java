package o;

import com.okinc.base.bugreport.DetectionInfoBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.dmC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14473dmC {
    public static final C14473dmC EZpvd = new C14473dmC();

    private C14473dmC() {
    }

    public final boolean KWHzl() {
        DetectionInfoBean detectionInfoBeanCopydefault = ((InterfaceC33167mrO) C43251rlk.copydefault(InterfaceC33167mrO.class)).copydefault();
        java.lang.Boolean boolValueOf = detectionInfoBeanCopydefault != null ? java.lang.Boolean.valueOf(detectionInfoBeanCopydefault.isRunningInEmulator) : null;
        java.lang.Boolean boolValueOf2 = detectionInfoBeanCopydefault != null ? java.lang.Boolean.valueOf(detectionInfoBeanCopydefault.isRunningInVirtualEnvironment) : null;
        java.lang.Boolean boolValueOf3 = detectionInfoBeanCopydefault != null ? java.lang.Boolean.valueOf(detectionInfoBeanCopydefault.isDeviceRooted) : null;
        java.lang.Boolean boolValueOf4 = detectionInfoBeanCopydefault != null ? java.lang.Boolean.valueOf(detectionInfoBeanCopydefault.isApplicationHooked) : null;
        java.lang.Boolean boolValueOf5 = detectionInfoBeanCopydefault != null ? java.lang.Boolean.valueOf(detectionInfoBeanCopydefault.isAppTampered) : null;
        java.lang.Boolean boolValueOf6 = detectionInfoBeanCopydefault != null ? java.lang.Boolean.valueOf(detectionInfoBeanCopydefault.isCertificateTampered) : null;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean z = Intrinsics.EZpvd(boolValueOf, bool) || Intrinsics.EZpvd(boolValueOf2, bool) || Intrinsics.EZpvd(boolValueOf3, bool) || Intrinsics.EZpvd(boolValueOf4, bool) || Intrinsics.EZpvd(boolValueOf5, bool) || Intrinsics.EZpvd(boolValueOf6, bool);
        if (z) {
            java.lang.String string = detectionInfoBeanCopydefault.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            pUU.KWHzl("DeviceEnvironmentChecker", string);
        }
        return z;
    }
}
