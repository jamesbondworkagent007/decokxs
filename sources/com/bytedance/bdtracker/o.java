package com.bytedance.bdtracker;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends p {
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f234o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.p
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", this.b);
        jSONObject.put("device_id", this.c);
        jSONObject.put("bd_did", this.d);
        jSONObject.put("install_id", this.e);
        jSONObject.put("os", this.f);
        jSONObject.put("caid", this.g);
        jSONObject.put("androidid", this.l);
        jSONObject.put("imei", this.m);
        jSONObject.put("oaid", this.n);
        jSONObject.put("google_aid", this.f234o);
        jSONObject.put("ip", this.p);
        jSONObject.put("ua", this.q);
        jSONObject.put("device_model", this.r);
        jSONObject.put("os_version", this.s);
        jSONObject.put("is_new_user", this.h);
        jSONObject.put("exist_app_cache", this.i);
        jSONObject.put("app_version", this.j);
        jSONObject.put(AppsFlyerProperties.CHANNEL, this.k);
        jSONObject.put("package", this.t);
        return jSONObject;
    }

    @Override // com.bytedance.bdtracker.p
    public void a(JSONObject jSONObject) {
    }
}
