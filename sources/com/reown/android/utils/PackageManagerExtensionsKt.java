package com.reown.android.utils;

import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class PackageManagerExtensionsKt {
    public static final boolean isWalletInstalled(@NotNull PackageManager packageManager, String str) {
        Intrinsics.checkNotNullParameter(packageManager, "");
        try {
            Intrinsics.copydefault((Object) str);
            return isPackageInstalled(packageManager, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean isPackageInstalled(@NotNull PackageManager packageManager, @NotNull String str) {
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageManager.getPackageInfo(str, 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
