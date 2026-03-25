package com.bytedance.bdtracker;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends p {
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f208o;
    public Integer p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.p
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f208o);
        jSONObject.put("aid", this.b);
        jSONObject.put("os", this.l);
        jSONObject.put("bd_did", this.c);
        jSONObject.put("ssid", this.d);
        jSONObject.put("user_unique_id", this.e);
        jSONObject.put("androidid", this.h);
        jSONObject.put("imei", this.i);
        jSONObject.put("oaid", this.j);
        jSONObject.put("os_version", this.m);
        jSONObject.put("device_model", this.n);
        jSONObject.put("google_aid", this.k);
        jSONObject.put("click_time", this.p);
        jSONObject.put("tr_shareuser", this.q);
        jSONObject.put("tr_admaster", this.r);
        jSONObject.put("tr_param1", this.s);
        jSONObject.put("tr_param2", this.t);
        jSONObject.put("tr_param3", this.u);
        jSONObject.put("tr_param4", this.v);
        jSONObject.put("ab_version", this.f);
        jSONObject.put("tr_web_ssid", this.g);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(String str) {
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.p
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f208o = jSONObject.optString("tr_token", null);
            this.b = jSONObject.optString("aid", null);
            this.l = jSONObject.optString("os", null);
            this.c = jSONObject.optString("bd_did", null);
            this.d = jSONObject.optString("ssid", null);
            this.e = jSONObject.optString("user_unique_id", null);
            this.h = jSONObject.optString("androidid", null);
            this.i = jSONObject.optString("imei", null);
            this.j = jSONObject.optString("oaid", null);
            this.m = jSONObject.optString("os_version", null);
            this.n = jSONObject.optString("device_model", null);
            this.k = jSONObject.optString("google_aid", null);
            this.p = Integer.valueOf(jSONObject.optInt("click_time"));
            this.q = jSONObject.optString("tr_shareuser", null);
            this.r = jSONObject.optString("tr_admaster", null);
            this.s = jSONObject.optString("tr_param1", null);
            this.t = jSONObject.optString("tr_param2", null);
            this.u = jSONObject.optString("tr_param3", null);
            this.v = jSONObject.optString("tr_param4", null);
            this.f = jSONObject.optString("ab_version", null);
            this.g = jSONObject.optString("tr_web_ssid", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String b() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void b(String str) {
        this.c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String c() {
        return this.f208o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void c(String str) {
        this.d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String d() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void d(String str) {
        this.e = str;
    }
}
