package o;

import android.content.pm.PackageManager;
import android.icu.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47134tkM {
    public static final C47134tkM KWHzl = new C47134tkM();

    private C47134tkM() {
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        java.lang.String string;
        java.lang.String str2 = "unknown";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null) {
                return null;
            }
            try {
                android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
                string = packageManager.getApplicationLabel(applicationInfo).toString();
            } catch (java.lang.Exception unused) {
                string = "unknown";
            }
            java.lang.String str3 = packageInfo.versionName;
            if (str3 != null) {
                str2 = str3;
            }
            return string + ":" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", java.util.Locale.getDefault()).format(new Date(packageInfo.firstInstallTime)) + ":" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", java.util.Locale.getDefault()).format(new Date(packageInfo.lastUpdateTime)) + ":" + str2;
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            return null;
        } catch (java.lang.Exception e2) {
            e2.getMessage();
            return null;
        }
    }
}
