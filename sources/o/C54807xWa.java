package o;

import com.okinc.base.utils.OkUtils;
import com.okinc.core.util.SPUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.xWa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54807xWa {
    public static volatile java.lang.Boolean AEQbTJ;
    public static volatile java.util.Set<java.lang.String> AYXKKw;
    public static final C54807xWa EZpvd = new C54807xWa();
    public static final int KWHzl;
    public static volatile boolean OLrzqt;
    public static final java.lang.Object copydefault;

    private C54807xWa() {
    }

    static {
        java.util.Set<java.lang.String> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "");
        AYXKKw = setSynchronizedSet;
        copydefault = new java.lang.Object();
        KWHzl = 8;
    }

    public static final boolean KWHzl() {
        if (OkUtils.AEQbTJ() == null) {
            pUU.valueOf("Monitor.Device", "init: context is null");
            return false;
        }
        if (OLrzqt) {
            pUU.KWHzl("Monitor.Device", "init: already initialized, skipping");
            return false;
        }
        synchronized (copydefault) {
            if (OLrzqt) {
                pUU.KWHzl("Monitor.Device", "init: already initialized, skipping");
                return false;
            }
            try {
                java.util.Set<java.lang.String> stringSet = SPUtils.getStringSet("low_end_device_models", yEE.copydefault());
                Intrinsics.checkNotNullExpressionValue(stringSet, "");
                AYXKKw.clear();
                AYXKKw.addAll(stringSet);
                pUU.KWHzl("Monitor.Device", "init LowEndDevice: loaded " + AYXKKw.size() + "(s) models from SP");
                OLrzqt = true;
                return true;
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("Monitor.Device", "init: error loading data from SP", e);
                OLrzqt = false;
                return false;
            }
        }
    }

    public static final boolean KWHzl(java.util.List<java.lang.String> list) {
        if (OkUtils.AEQbTJ() == null || list == null) {
            pUU.valueOf("Monitor.Device", "setLowEndDeviceList: invalid parameters");
            return false;
        }
        try {
            java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(list);
            SPUtils.putStringSet("low_end_device_models", setOqFWZa);
            pUU.KWHzl("Monitor.Device", "setLowEndDeviceList: saved " + setOqFWZa.size() + "(s) models to SP");
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("Monitor.Device", "setLowEndDeviceList: error saving device list to SP", e);
            return false;
        }
    }

    public static final boolean AEQbTJ() {
        if (OkUtils.AEQbTJ() == null) {
            return false;
        }
        if (!OLrzqt) {
            pUU.KWHzl("Monitor.Device", "isLowEndDevice: not initialized, calling init first");
            KWHzl();
        }
        java.lang.Boolean bool = AEQbTJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (copydefault) {
            java.lang.Boolean bool2 = AEQbTJ;
            if (bool2 != null) {
                boolean zBooleanValue = bool2.booleanValue();
                pUU.KWHzl("Monitor.Device", "isLowEndDevice: using cached result = " + zBooleanValue);
                return zBooleanValue;
            }
            try {
                C54807xWa c54807xWa = EZpvd;
                boolean zAEQbTJ = c54807xWa.AEQbTJ(c54807xWa.EZpvd());
                AEQbTJ = java.lang.Boolean.valueOf(zAEQbTJ);
                return zAEQbTJ;
            } catch (java.lang.Throwable th) {
                pUU.copydefault("Monitor.Device", "isLowEndDevice: error occurred, returning false, " + th);
                return false;
            }
        }
    }

    public final boolean AEQbTJ(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || AYXKKw.isEmpty()) {
            return false;
        }
        if (AYXKKw.contains(str)) {
            pUU.EZpvd("Monitor.Device", "isDeviceInLowEndList: exact match for model: " + str);
            return true;
        }
        java.lang.String strEZpvd = EZpvd(str);
        for (java.lang.String str2 : AYXKKw) {
            if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) EZpvd(str2))) {
                pUU.EZpvd("Monitor.Device", "isDeviceInLowEndList: normalized match for model: " + str + " -> " + str2);
                return true;
            }
        }
        return false;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new Regex("[^a-z0-9]").replace(new Regex("\\s+").replace(lowerCase, ""), "");
    }

    public final java.lang.String EZpvd() {
        java.lang.String str;
        try {
            str = android.os.Build.MODEL;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("Monitor.Device", "getCurrentDeviceModel: error getting device model", e);
        }
        return str == null ? "" : str;
    }
}
