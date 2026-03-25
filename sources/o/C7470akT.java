package o;

import android.os.Build;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: renamed from: o.akT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7470akT implements InterfaceC7552alw {
    public boolean OLrzqt;
    public boolean copydefault = false;
    public boolean AEQbTJ = false;

    @Override // o.InterfaceC7552alw
    public boolean KWHzl(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            this.copydefault = C7857arj.OLrzqt(activity);
            this.AEQbTJ = C7857arj.AEQbTJ(activity);
            this.OLrzqt = gEmmrt(activity);
        }
        return (this.copydefault && !this.AEQbTJ) || (this.OLrzqt && this.AEQbTJ);
    }

    public boolean gEmmrt(android.app.Activity activity) {
        return OLrzqt(activity);
    }

    public static boolean OLrzqt(android.app.Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() != null;
        }
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equalsIgnoreCase("HUAWEI")) {
            return AEQbTJ(activity);
        }
        if (str.equalsIgnoreCase(MTPushConstants.Manufacturer.XIAOMI)) {
            return KWHzl(activity);
        }
        if (str.equalsIgnoreCase(MTPushConstants.Manufacturer.OPPO)) {
            return copydefault(activity);
        }
        if (str.equalsIgnoreCase(MTPushConstants.Manufacturer.VIVO)) {
            return EZpvd(activity);
        }
        return false;
    }

    public static boolean EZpvd(android.app.Activity activity) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.util.FtFeature");
            return ((java.lang.Boolean) cls.getMethod("isFeatureSupport", java.lang.Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (java.lang.Exception e) {
            pUU.copydefault("tag", android.util.Log.getStackTraceString(e));
            return false;
        }
    }

    public static boolean copydefault(android.app.Activity activity) {
        return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean KWHzl(android.app.Activity activity) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return ((java.lang.Integer) cls.getMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean AEQbTJ(android.app.Activity activity) {
        try {
            java.lang.Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((java.lang.Boolean) clsLoadClass.getMethod("hasNotchInScreen", new java.lang.Class[0]).invoke(clsLoadClass, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
