package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.engagelab.privates.core.constants.MTCoreConstants;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f348a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static boolean f349a = true;
        public static String b = "mt_sp_version";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public static void a(SharedPreferences sharedPreferences) {
            int i;
            if (!f349a || 1 == (i = sharedPreferences.getInt(b, 0))) {
                return;
            }
            if (i == 0) {
                sharedPreferences.edit().putString("p_d", sharedPreferences.getString(HintConstants.AUTOFILL_HINT_PASSWORD, "")).apply();
                sharedPreferences.edit().remove(HintConstants.AUTOFILL_HINT_PASSWORD).apply();
            }
            sharedPreferences.edit().putInt(b, 1).apply();
            f349a = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(Context context) {
        return k(context).getString("p_d", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte f(Context context) {
        return (byte) k(context).getInt("platform_state", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(Context context) {
        return k(context).getInt("register_code", -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h(Context context) {
        return k(context).getString(MTCoreConstants.Register.KEY_REGISTRATION_ID, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int i(Context context) {
        return f348a.getInt(MTCoreConstants.Login.KEY_SEED_ID, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long j(Context context) {
        return k(context).getLong(MTCoreConstants.Login.KEY_SERVER_TIME, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long o(Context context) {
        return k(context).getLong(MTCoreConstants.Register.KEY_USER_ID, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static SharedPreferences k(Context context) {
        if (f348a == null) {
            synchronized (w.class) {
                if (f348a == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.engagelab.privates.core.prefs", 0);
                    a.a(sharedPreferences);
                    f348a = sharedPreferences;
                }
            }
        }
        return f348a;
    }

    public static void a(Context context, Set<String> set) {
        k(context).edit().putStringSet("http_address", set).commit();
    }

    public static void b(Context context, Set<String> set) {
        k(context).edit().putStringSet("tcp_address", set).commit();
    }

    public static void c(Context context, Set<String> set) {
        k(context).edit().putStringSet("tcp_address_ssl", set).commit();
    }

    public static void d(Context context, Set<String> set) {
        k(context).edit().putStringSet("udp_address", set).commit();
    }

    public static Set<String> l(Context context) {
        return k(context).getStringSet("tcp_address", new LinkedHashSet());
    }

    public static Set<String> m(Context context) {
        return k(context).getStringSet("tcp_address_ssl", new LinkedHashSet());
    }

    public static Set<String> n(Context context) {
        return k(context).getStringSet("udp_address", new LinkedHashSet());
    }

    public static void a(Context context, int i) {
        k(context).edit().putInt("login_code", i).commit();
    }

    public static void b(Context context, int i) {
        k(context).edit().putInt("register_code", i).commit();
    }

    public static int d(Context context) {
        return k(context).getInt("login_code", -1);
    }

    public static void a(Context context, long j) {
        k(context).edit().putLong(MTCoreConstants.Login.KEY_SERVER_TIME, j).commit();
    }

    public static void b(Context context, long j) {
        k(context).edit().putLong(MTCoreConstants.Register.KEY_USER_ID, j).commit();
    }

    public static void a(Context context, boolean z) {
        k(context).edit().putBoolean("connect_state", z).commit();
    }

    public static void b(Context context, String str) {
        k(context).edit().putString("p_d", str).commit();
    }

    public static void a(Context context, byte b) {
        k(context).edit().putInt("platform_state", b).commit();
    }

    public static boolean b(Context context) {
        return k(context).getBoolean("connect_state", true);
    }

    public static Set<String> c(Context context) {
        return k(context).getStringSet("http_address", new LinkedHashSet());
    }

    public static String a(Context context) {
        return k(context).getString("connect_ssl_crt", "");
    }

    public static void c(Context context, String str) {
        k(context).edit().putString(MTCoreConstants.Register.KEY_REGISTRATION_ID, str).commit();
    }

    public static void a(Context context, String str) {
        k(context).edit().putString("connect_ssl_crt", str).commit();
    }

    public static void c(Context context, int i) {
        k(context).edit().putInt(MTCoreConstants.Login.KEY_SEED_ID, i).commit();
    }
}
