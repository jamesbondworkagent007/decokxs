package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g4 {
    public static String b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static final CountDownLatch e = new CountDownLatch(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f4 f452a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(Context context) {
        if (context != null && !TextUtils.isEmpty("com.huawei.hwid")) {
            if (this.f452a == null) {
                this.f452a = new f4(e);
            }
            Intent intent = new Intent();
            e4 e4Var = null;
            if (TextUtils.isEmpty(null)) {
                intent.setPackage("com.huawei.hwid");
            } else {
                intent.setComponent(new ComponentName("com.huawei.hwid", (String) null));
            }
            if (!TextUtils.isEmpty("com.uodis.opendevice.OPENIDS_SERVICE")) {
                intent.setAction("com.uodis.opendevice.OPENIDS_SERVICE");
            }
            f4 f4Var = this.f452a;
            if (f4Var.f447a != null) {
                return true;
            }
            try {
                boolean zBindService = context.bindService(intent, f4Var, 1);
                f4Var.b.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = f4Var.c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    e4Var = iInterfaceQueryLocalInterface instanceof e4 ? (e4) iInterfaceQueryLocalInterface : new e4(iBinder);
                }
                f4Var.f447a = e4Var;
                return zBindService;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final boolean a(Context context) {
        if (d) {
            return c;
        }
        boolean z = false;
        if (context != null && !TextUtils.isEmpty("com.huawei.hwid")) {
            try {
                if (h4.d == null) {
                    h4.d = context.getPackageManager();
                }
                PackageInfo packageInfo = h4.d.getPackageInfo("com.huawei.hwid", 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    if (packageInfo != null) {
                        if (packageInfo.getLongVersionCode() >= 1) {
                            return true;
                        }
                    }
                    return false;
                }
                if (packageInfo != null && packageInfo.versionCode > 0) {
                    z = true;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        c = z;
        d = true;
        return c;
    }
}
