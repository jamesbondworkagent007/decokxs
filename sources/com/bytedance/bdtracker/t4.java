package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.i5;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t4 extends f4 {
    public static final JSONObject s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        JSONObject jSONObject = new JSONObject();
        s = jSONObject;
        try {
            jSONObject.put("_staging_flag", 1);
            jSONObject.put("params_for_special", "applog_trace");
        } catch (Throwable th) {
            LoggerImpl.global().error(4, Collections.singletonList("trace"), "JSON handle failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String f() {
        return "trace";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.f4
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.c);
        jSONObject.put("tea_event_index", this.d);
        jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, this.e);
        long j = this.f;
        if (j > 0) {
            jSONObject.put(MTCoreConstants.Register.KEY_USER_ID, j);
        }
        jSONObject.put("user_unique_id", TextUtils.isEmpty(this.g) ? JSONObject.NULL : this.g);
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("$user_unique_id_type", this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("ssid", this.i);
        }
        jSONObject.put("event", "rangersapplog_trace");
        a(jSONObject, s);
        int i = this.k;
        if (i != i5.a.UNKNOWN.f193a) {
            jSONObject.put("nt", i);
        }
        jSONObject.put("datetime", this.n);
        return jSONObject;
    }
}
