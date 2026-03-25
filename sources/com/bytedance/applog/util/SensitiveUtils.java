package com.bytedance.applog.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bytedance.applog.Level;
import com.bytedance.bdtracker.c4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SensitiveUtils {
    public static final String CHANNEL_APP_KEY = "";

    public static void addSensitiveParamsForUrlQuery(c4 c4Var, StringBuilder sb, JSONObject jSONObject) {
    }

    public static void appendSensitiveParams(c4 c4Var, JSONObject jSONObject, Map<String, String> map, boolean z, Level level) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getMacAddress(Context context) {
        return "02:00:00:00:00:00";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getMacAddressFromSystem(Context context) {
        return "02:00:00:00:00:00";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONArray getMultiImeiFallback(Context context) {
        return new JSONArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONArray getMultiImeiFromSystem(Context context) {
        return new JSONArray();
    }

    public static String getSerialNumber(Context context) {
        return null;
    }

    public static boolean validMultiImei(@Nullable String str) {
        return false;
    }

    public static boolean validMultiImei(@Nullable JSONArray jSONArray) {
        return false;
    }
}
