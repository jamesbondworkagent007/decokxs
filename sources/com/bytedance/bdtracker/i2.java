package com.bytedance.bdtracker;

import android.content.Context;
import com.bytedance.applog.store.kv.IKVStore;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class i2 extends q1 {
    public final v1 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public i2(Context context, v1 v1Var, x1 x1Var) {
        super(true, false, false);
        this.e = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "ServerId";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        IKVStore iKVStore = this.e.f;
        String string = iKVStore.getString("device_id", null);
        x1.a(jSONObject, "device_id", string);
        String string2 = iKVStore.getString("bd_did", null);
        x1.a(jSONObject, "bd_did", string2);
        String string3 = iKVStore.getString("install_id", null);
        String string4 = iKVStore.getString(this.e.e(), null);
        x1.a(jSONObject, "install_id", string3);
        x1.a(jSONObject, "ssid", string4);
        long j = 0;
        long j2 = iKVStore.getLong("register_time", 0L);
        if ((r.a(string3) && ((r.a(string) || r.a(string2)) && r.a(string4))) || j2 == 0) {
            j = j2;
        } else {
            this.e.f.putLong("register_time", 0L);
        }
        jSONObject.put("register_time", j);
        return true;
    }
}
