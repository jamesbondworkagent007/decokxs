package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s4 extends f4 {
    public long s;
    public long t;
    public String u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public f4 a(@NonNull JSONObject jSONObject) {
        d().error(4, this.f174a, "Not allowed", new Object[0]);
        return this;
    }

    @Override // com.bytedance.bdtracker.f4
    public List<String> b() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull ContentValues contentValues) {
        d().error(4, this.f174a, "Not allowed", new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull JSONObject jSONObject) {
        d().error(4, this.f174a, "Not allowed", new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String c() {
        return String.valueOf(this.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String f() {
        return "terminate";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.c);
        jSONObject.put("tea_event_index", this.d);
        jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, this.e);
        jSONObject.put("stop_timestamp", this.t / 1000);
        jSONObject.put("duration", this.s / 1000);
        jSONObject.put("datetime", this.n);
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
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("ab_sdk_version", this.j);
        }
        if (!TextUtils.isEmpty(this.u)) {
            jSONObject.put("uuid_changed", true);
            if (!TextUtils.equals(this.u, this.e)) {
                jSONObject.put("original_session_id", this.u);
            }
        }
        return jSONObject;
    }
}
