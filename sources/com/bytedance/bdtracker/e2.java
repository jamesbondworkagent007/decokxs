package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.DynamicValueCallback;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.store.kv.IKVStore;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class e2 extends q1 {
    public final Context e;
    public final v1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public e2(Context context, v1 v1Var) {
        super(true, false);
        this.e = context;
        this.f = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Oaid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        IKVStore iKVStore = this.f.f;
        if (!r0.l()) {
            return true;
        }
        DynamicValueCallback<String> customOaidCallback = this.f.c.getCustomOaidCallback();
        if (customOaidCallback == null || TextUtils.isEmpty(customOaidCallback.get())) {
            LoggerImpl.global().debug("use default oaid", new Object[0]);
            Map mapA = w5.a(this.e);
            if (mapA == null) {
                return false;
            }
            jSONObject.put("oaid", new JSONObject(mapA));
            return true;
        }
        LoggerImpl.global().debug("use custom oaid", new Object[0]);
        HashMap map = new HashMap();
        map.put("id", customOaidCallback.get());
        map.put("req_id", UUID.randomUUID().toString());
        map.put("take_ms", "1");
        map.put(CrashHianalyticsData.TIME, "" + System.currentTimeMillis());
        map.put("query_times", "1");
        map.put("is_track_limited", "false");
        jSONObject.put("oaid", new JSONObject(map));
        return true;
    }
}
