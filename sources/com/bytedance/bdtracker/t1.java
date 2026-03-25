package com.bytedance.bdtracker;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class t1 extends q1 {
    public final v1 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public t1(v1 v1Var) {
        super(true, false);
        this.e = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Cdid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        String strA = w5.a(this.e.f);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        jSONObject.put("cdid", strA);
        return true;
    }
}
