package com.geetest.gtc4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4 f458a;
    public static Context b = null;
    public static boolean c = false;
    public static PackageManager d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Build.MANUFACTURER.toUpperCase();
        f458a = new d4();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String a(Context context) {
        d4 d4Var;
        f4 f4Var;
        e4 e4Var;
        f4 f4Var2;
        d4 d4Var2 = f458a;
        if (d4Var2 != null && context != null) {
            Context applicationContext = context.getApplicationContext();
            b = applicationContext;
            if (applicationContext != null) {
                try {
                    if (d4Var2.a(applicationContext)) {
                        c = d4Var2.b(b);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        boolean z = c;
        if (z) {
            try {
                Context context2 = b;
                if (context2 != null && (d4Var = f458a) != null && z) {
                    if (TextUtils.isEmpty(g4.b) && (f4Var = d4Var.f452a) != null && (e4Var = f4Var.f447a) != null) {
                        try {
                            String strA = e4Var.a();
                            g4.b = strA;
                            if (!TextUtils.isEmpty(strA) && (f4Var2 = d4Var.f452a) != null) {
                                context2.unbindService(f4Var2);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    return g4.b;
                }
            } catch (Throwable unused3) {
            }
        }
        return null;
    }
}
