package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.amplitude.analytics.BuildConfig;
import com.ibm.icu.text.DateFormat;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context) {
        String strA;
        long jCurrentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject.toString();
        }
        try {
            strA = context.getSharedPreferences("gt_fp", 0).getString("gt_fp", null);
        } catch (Exception unused) {
            strA = "$unknown";
        }
        try {
            jCurrentTimeMillis = context.getSharedPreferences("gt_fp", 0).getLong("gt_ts", 0L);
        } catch (Exception unused2) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            k.a(context, jCurrentTimeMillis);
        }
        try {
            jSONObject.put("bd", "$unknown");
            Pair<String, String> pairA = o.a(context);
            if (pairA != null) {
                jSONObject.put(DateFormat.DAY, pairA.first);
                jSONObject.put("e", pairA.second);
                if (TextUtils.isEmpty(strA) || "$unknown".equals(strA)) {
                    String str = (String) pairA.first;
                    if (!TextUtils.isEmpty(str) && !"$unknown".equals(str)) {
                        strA = k.a(context, (String) pairA.first);
                    }
                }
            } else {
                jSONObject.put(DateFormat.DAY, "$unknown");
                jSONObject.put("e", "$unknown");
            }
            if (TextUtils.isEmpty(strA) || "$unknown".equals(strA)) {
                strA = k.a(context, UUID.randomUUID().toString());
            }
            jSONObject.put("fp", strA);
            jSONObject.put("ts", jCurrentTimeMillis + "");
            jSONObject.put("ver", BuildConfig.VERSION_NAME);
            jSONObject.put("client_type", "android");
        } catch (JSONException unused3) {
        }
        return jSONObject.toString();
    }
}
