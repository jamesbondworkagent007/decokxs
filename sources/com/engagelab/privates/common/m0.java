package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f340a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context) {
        return c(context).getString("platform_token_fail", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(Context context) {
        return c(context).getInt("platform_token_fail_from", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void a(Context context, String str) {
        c(context).edit().putString("platform_token_fail", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static SharedPreferences c(Context context) {
        if (f340a == null) {
            f340a = context.getApplicationContext().getSharedPreferences("com.engagelab.privates.push.prefs.platform", 0);
        }
        return f340a;
    }

    public static void a(Context context, int i) {
        c(context).edit().putInt("platform_token_fail_from", i).commit();
    }
}
