package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f338a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context, int i) {
        return k(context).getString("notification_layout_" + i, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Context context, int i) {
        k(context).edit().putInt(MTPushConstants.NotificationBadge.KEY_BADGE, i).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Context context, String str) {
        k(context).edit().putString("notification_show_time", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Context context, String str) {
        k(context).edit().putString("notification_silence_time", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(Context context) {
        return k(context).getInt(MTPushConstants.NotificationBadge.KEY_BADGE, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(Context context) {
        return k(context).getInt(MTPushConstants.NotificationCount.KEY_COUNT, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(Context context) {
        return k(context).getString("notification_show_time", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h(Context context) {
        return k(context).getString("notification_silence_time", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void a(Context context, int i, String str) {
        k(context).edit().putString("notification_layout_" + i, str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void c(Context context, int i) {
        k(context).edit().putInt(MTPushConstants.NotificationCount.KEY_COUNT, i).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static long d(Context context) {
        return k(context).getLong("last_to_foreground_time", 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Set<String> i(Context context) {
        return k(context).getStringSet("override_message_id_set", new LinkedHashSet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Set<String> j(Context context) {
        return k(context).getStringSet("revoke_message_id_set", new LinkedHashSet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static SharedPreferences k(Context context) {
        if (f338a == null) {
            f338a = context.getApplicationContext().getSharedPreferences("com.engagelab.privates.push.prefs", 0);
        }
        return f338a;
    }

    public static void b(Context context, Set<String> set) {
        k(context).edit().putStringSet("revoke_message_id_set", set).commit();
    }

    public static long c(Context context) {
        return k(context).getLong("last_to_background_time", 0L);
    }

    public static Set<String> a(Context context, byte b) {
        return k(context).getStringSet("message_id_set_" + ((int) b), new LinkedHashSet());
    }

    public static String b(Context context, byte b) {
        return k(context).getString("platform_token_" + ((int) b), "");
    }

    public static void b(Context context, long j) {
        k(context).edit().putLong("last_to_foreground_time", j).commit();
    }

    public static String b(Context context) {
        return k(context).getString("last_lifecycle_session_json", "");
    }

    public static void b(Context context, String str) {
        k(context).edit().putString("last_lifecycle_session_json", str).commit();
    }

    public static void a(Context context, byte b, Set<String> set) {
        k(context).edit().putStringSet("message_id_set_" + ((int) b), set).commit();
    }

    public static void a(Context context, Set<String> set) {
        k(context).edit().putStringSet("override_message_id_set", set).commit();
    }

    public static void a(Context context, byte b, String str) {
        k(context).edit().putString("platform_token_" + ((int) b), str).commit();
    }

    public static void a(Context context, long j) {
        k(context).edit().putLong("last_to_background_time", j).commit();
    }

    public static String a(Context context) {
        return k(context).getString("last_lifecycle_session", "");
    }

    public static void a(Context context, String str) {
        k(context).edit().putString("last_lifecycle_session", str).commit();
    }
}
