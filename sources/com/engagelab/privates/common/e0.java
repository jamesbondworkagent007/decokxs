package com.engagelab.privates.common;

import android.text.TextUtils;
import com.engagelab.privates.push.utils.NotificationUtil;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f328a;
    public String b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e0(String str, String str2) {
        this.f328a = str;
        this.b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e0 a(JSONObject jSONObject) {
        return new e0(NotificationUtil.getMessageId(jSONObject), jSONObject.optString("override_msg_id"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (TextUtils.isEmpty(this.f328a) || TextUtils.isEmpty(e0Var.f328a) || !TextUtils.equals(this.f328a, e0Var.f328a)) {
            return false;
        }
        if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(e0Var.b)) {
            return true;
        }
        return (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(e0Var.b) || !TextUtils.equals(this.b, e0Var.b)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "msg_id = " + this.f328a + ",  override_msg_id = " + this.b;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg_id", this.f328a);
            jSONObject.put("override_msg_id", this.b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
