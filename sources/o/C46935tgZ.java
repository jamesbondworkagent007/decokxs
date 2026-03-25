package o;

import com.huawei.hms.api.HuaweiApiAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46935tgZ {
    public static volatile boolean EZpvd;
    public static final C46935tgZ KWHzl = new C46935tgZ();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.thc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46935tgZ.KWHzl();
        }
    });
    public static final int AEQbTJ = 8;

    private C46935tgZ() {
    }

    public static final C46915tgF KWHzl() {
        return KWHzl.EZpvd();
    }

    public final C46915tgF AEQbTJ() {
        return (C46915tgF) copydefault.getValue();
    }

    public final C46915tgF EZpvd() {
        java.lang.String str;
        java.lang.Object systemService;
        java.lang.Object objInvoke;
        java.lang.Object objInvoke2;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("country_detector");
        } catch (java.lang.Exception e) {
            e = e;
            str = null;
        }
        if (systemService == null || (objInvoke = systemService.getClass().getMethod("detectCountry", new java.lang.Class[0]).invoke(systemService, new java.lang.Object[0])) == null) {
            return null;
        }
        java.lang.Class<?> cls = objInvoke.getClass();
        java.lang.Object objInvoke3 = cls.getMethod("getCountryIso", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
        str = objInvoke3 instanceof java.lang.String ? (java.lang.String) objInvoke3 : null;
        try {
            objInvoke2 = cls.getMethod("getSource", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
        } catch (java.lang.Exception e2) {
            e = e2;
            pUU.AEQbTJ("DeviceUtils", e);
        }
        java.lang.Integer num = objInvoke2 instanceof java.lang.Integer ? (java.lang.Integer) objInvoke2 : null;
        pUU.KWHzl("DeviceUtils", "getCountry, finished. cost:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        if (str == null && num != null) {
            return new C46915tgF(str, num.intValue());
        }
        pUU.AEQbTJ("DeviceUtils", e);
        pUU.KWHzl("DeviceUtils", "getCountry, finished. cost:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        return str == null ? null : null;
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd = KWHzl(context);
        pUU.KWHzl("DeviceUtils", "initPushInfoSync deviceCountry:" + AEQbTJ() + ",isSupportHms:" + EZpvd);
    }

    public final boolean OLrzqt() {
        pUU.KWHzl("DeviceUtils", "isSupportHms:" + EZpvd);
        return EZpvd;
    }

    public final boolean KWHzl(android.content.Context context) {
        try {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0;
    }
}
