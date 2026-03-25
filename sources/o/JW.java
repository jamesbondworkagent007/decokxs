package o;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class JW {
    public static final java.lang.Number AEQbTJ(android.content.pm.PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return java.lang.Long.valueOf(packageInfo.getLongVersionCode());
        }
        return java.lang.Integer.valueOf(packageInfo.versionCode);
    }
}
