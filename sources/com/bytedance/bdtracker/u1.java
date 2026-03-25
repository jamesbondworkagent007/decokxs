package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class u1 extends q1 {
    public final d e;
    public final v1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public u1(d dVar, Context context, v1 v1Var) {
        super(false, false);
        this.e = dVar;
        this.f = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Config";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, 6170690);
        jSONObject.put("sdk_version_code", 16170289);
        jSONObject.put("sdk_version_name", "6.17.6");
        jSONObject.put(AppsFlyerProperties.CHANNEL, this.f.b());
        jSONObject.put("not_request_sender", this.f.c.getNotReuqestSender() ? 1 : 0);
        x1.a(jSONObject, "aid", this.f.c.getAid());
        x1.a(jSONObject, "release_build", this.f.c.getReleaseBuild());
        x1.a(jSONObject, "user_agent", this.f.f.getString("user_agent", null));
        x1.a(jSONObject, "ab_sdk_version", this.f.d.getString("ab_sdk_version", ""));
        String language = this.f.c.getLanguage();
        if (TextUtils.isEmpty(language)) {
            language = this.f.f.getString("app_language", null);
        }
        x1.a(jSONObject, "app_language", language);
        String region = this.f.c.getRegion();
        if (TextUtils.isEmpty(region)) {
            region = this.f.f.getString("app_region", null);
        }
        if (TextUtils.isEmpty(region)) {
            region = Locale.getDefault().getCountry();
        }
        x1.a(jSONObject, "app_region", region);
        String string = this.f.d.getString("app_track", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONObject.put("app_track", new JSONObject(string));
            } catch (Throwable th) {
                this.e.D.error("JSON handle appTrack failed", th, new Object[0]);
            }
        }
        String string2 = this.f.d.getString("header_custom_info", null);
        if (string2 != null && string2.length() > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                jSONObject2.remove("_debug_flag");
                jSONObject.put("custom", jSONObject2);
            } catch (Throwable th2) {
                this.e.D.error("JSON handle failed", th2, new Object[0]);
            }
        }
        String strF = this.f.f();
        if (!TextUtils.isEmpty(strF)) {
            x1.a(jSONObject, "user_unique_id", strF);
        }
        String strG = this.f.g();
        if (TextUtils.isEmpty(strG)) {
            return true;
        }
        x1.a(jSONObject, "user_unique_id_type", strG);
        return true;
    }
}
