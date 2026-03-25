package com.geetest.gtc4;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class OaidHelper {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Throwable added to exception handler: 'Exception', keep only Throwable */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getOaid(Context context) {
        String strA;
        if (g6.c() || !TextUtils.isEmpty(g6.a("ro.build.version.emui", ""))) {
            try {
                if (context.getPackageManager().getPackageInfo("com.huawei.hwid", 0) == null) {
                    if (!f6.a(context).a()) {
                        return "";
                    }
                }
            } catch (Throwable unused) {
                return "";
            }
        }
        if (g6.c() || !TextUtils.isEmpty(g6.a("ro.build.version.emui", ""))) {
            strA = h4.a(context);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            i3 i3Var = new i3(atomicReference, countDownLatch);
            x4 x4VarA = f6.a(context);
            x4VarA.getClass();
            x4VarA.a(i3Var);
            if (!countDownLatch.await(1L, TimeUnit.SECONDS)) {
                return "";
            }
            strA = (String) atomicReference.get();
        }
        return strA;
    }
}
