package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.store.kv.IKVStore;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IKVStore f137a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public a6(Context context) {
        this.f137a = x4.a(context, "device_register_oaid_refine");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z5 a() {
        String string = this.f137a.getString("oaid", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            return new z5(jSONObject.optString("id", null), jSONObject.optString("req_id", null), jSONObject.has("is_track_limited") ? Boolean.valueOf(jSONObject.optBoolean("is_track_limited")) : null, jSONObject.has("take_ms") ? Long.valueOf(jSONObject.optLong("take_ms", -1L)) : null, jSONObject.has(CrashHianalyticsData.TIME) ? Long.valueOf(jSONObject.optLong(CrashHianalyticsData.TIME, -1L)) : null, jSONObject.has("query_times") ? Integer.valueOf(jSONObject.optInt("query_times", -1)) : null, jSONObject.has("hw_id_version_code") ? Long.valueOf(jSONObject.optLong("hw_id_version_code", -1L)) : null);
        } catch (Throwable th) {
            LoggerImpl.global().error(1, "Oaid#Create model failed", th, new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(@Nullable z5 z5Var) {
        if (z5Var == null) {
            return;
        }
        this.f137a.putString("oaid", z5Var.b().toString());
    }
}
