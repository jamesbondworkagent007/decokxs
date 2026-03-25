package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f335a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, int i) {
        m(context).edit().putInt("first_account_offset", i).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Context context) {
        return m(context).getString("account_id", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(Context context) {
        return m(context).getString("active_common_json", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(Context context) {
        return m(context).getString("active_event_json", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(Context context) {
        return m(context).getString("first_account", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(Context context) {
        return m(context).getInt("first_account_offset", -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(Context context) {
        return m(context).getBoolean("first_time", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h(Context context) {
        return m(context).getString("follow_account", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int i(Context context) {
        return m(context).getInt("follow_account_offset", -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j(Context context) {
        return m(context).getString("last_session", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String k(Context context) {
        return m(context).getString("last_session_json", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long l(Context context) {
        return m(context).getLong("last_to_background_time", 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map<String, Object> n(Context context) {
        try {
            HashMap map = new HashMap();
            String string = m(context).getString("static_property_map", "");
            if (TextUtils.isEmpty(string)) {
                return map;
            }
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.opt(next));
            }
            return map;
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalysisConfig", "getCommonProperty failed " + th.getMessage());
            return new HashMap();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String a(Context context) {
        return m(context).getString("account_common_json", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void b(Context context, String str) {
        m(context).edit().putString("account_id", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void c(Context context, String str) {
        m(context).edit().putString("active_common_json", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void d(Context context, String str) {
        m(context).edit().putString("active_event_json", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void e(Context context, String str) {
        m(context).edit().putString("first_account", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void f(Context context, String str) {
        m(context).edit().putString("follow_account", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void g(Context context, String str) {
        m(context).edit().putString("last_session", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void h(Context context, String str) {
        m(context).edit().putString("last_session_json", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static SharedPreferences m(Context context) {
        if (f335a == null) {
            f335a = context.getApplicationContext().getSharedPreferences("com.engagelab.privates.analysis.prefs", 0);
        }
        return f335a;
    }

    public static void a(Context context, String str) {
        m(context).edit().putString("account_common_json", str).commit();
    }

    public static void b(Context context, int i) {
        m(context).edit().putInt("follow_account_offset", i).commit();
    }

    public static void a(Context context, boolean z) {
        m(context).edit().putBoolean("first_time", z).commit();
    }

    public static void b(Context context, long j) {
        m(context).edit().putLong("last_to_foreground_time", j).commit();
    }

    public static void a(Context context, long j) {
        m(context).edit().putLong("last_to_background_time", j).commit();
    }

    public static void a(Context context, Map<String, Object> map) {
        try {
            if (map == null) {
                m(context).edit().putString("static_property_map", "").commit();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            m(context).edit().putString("static_property_map", jSONObject.toString()).commit();
        } catch (Throwable th) {
            MTCommonLog.w("MTAnalysisConfig", "setCommonProperty failed " + th.getMessage());
        }
    }
}
