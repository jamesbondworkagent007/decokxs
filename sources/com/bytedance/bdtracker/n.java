package com.bytedance.bdtracker;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends p {
    public String A;
    public String B;
    public String C;
    public String D;
    public a E = a.PROMOTION;
    public String F;
    public boolean G;
    public JSONObject H;
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
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f224o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    /* JADX INFO: loaded from: classes17.dex */
    public enum a {
        PROMOTION,
        ORGANIC
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.p
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.b);
        jSONObject.put("utm_campaign", this.c);
        jSONObject.put("utm_source", this.d);
        jSONObject.put("utm_medium", this.e);
        jSONObject.put("utm_content", this.f);
        jSONObject.put("utm_term", this.g);
        jSONObject.put("tr_shareuser", this.h);
        jSONObject.put("tr_admaster", this.i);
        jSONObject.put("tr_param1", this.j);
        jSONObject.put("tr_param2", this.k);
        jSONObject.put("tr_param3", this.l);
        jSONObject.put("tr_param4", this.m);
        jSONObject.put("is_retargeting", this.n);
        jSONObject.put("reengagement_window", this.f224o);
        jSONObject.put("tr_dp", this.p);
        jSONObject.put("deeplink_value", this.q);
        jSONObject.put("tr_site_id", this.r);
        jSONObject.put("tr_site_name", this.s);
        jSONObject.put("account_id", this.t);
        jSONObject.put("account_name", this.u);
        jSONObject.put("campaign_id", this.v);
        jSONObject.put("campaign_name", this.w);
        jSONObject.put("ad_id", this.x);
        jSONObject.put("ad_name", this.y);
        jSONObject.put("creative_id", this.z);
        jSONObject.put(FirebaseAnalytics.Param.CREATIVE_NAME, this.A);
        jSONObject.put("tr_install_type", this.B);
        jSONObject.put("touch_type", this.C);
        jSONObject.put("touch_timestamp", this.D);
        String strName = this.E.name();
        Locale locale = Locale.ROOT;
        Intrinsics.AEQbTJ(locale, "");
        if (strName == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.AEQbTJ(lowerCase, "");
        jSONObject.put("activation_type", lowerCase);
        jSONObject.put("activation_timestamp", this.F);
        jSONObject.put("is_first_launch", this.G);
        jSONObject.put(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, this.H);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.p
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.b = jSONObject.optString("name", null);
            this.c = jSONObject.optString("utm_campaign", null);
            this.d = jSONObject.optString("utm_source", null);
            this.e = jSONObject.optString("utm_medium", null);
            this.f = jSONObject.optString("utm_content", null);
            this.g = jSONObject.optString("utm_term", null);
            this.h = jSONObject.optString("tr_shareuser", null);
            this.i = jSONObject.optString("tr_admaster", null);
            this.j = jSONObject.optString("tr_param1", null);
            this.k = jSONObject.optString("tr_param2", null);
            this.l = jSONObject.optString("tr_param3", null);
            this.m = jSONObject.optString("tr_param4", null);
            this.n = jSONObject.optBoolean("is_retargeting");
            this.f224o = jSONObject.optInt("reengagement_window");
            this.p = jSONObject.optString("tr_dp", null);
            this.q = jSONObject.optString("deeplink_value", null);
            this.r = jSONObject.optString("tr_site_id", null);
            this.s = jSONObject.optString("tr_site_name", null);
            this.t = jSONObject.optString("account_id", null);
            this.u = jSONObject.optString("account_name", null);
            this.v = jSONObject.optString("campaign_id", null);
            this.w = jSONObject.optString("campaign_name", null);
            this.x = jSONObject.optString("ad_id", null);
            this.y = jSONObject.optString("ad_name", null);
            this.z = jSONObject.optString("creative_id", null);
            this.A = jSONObject.optString(FirebaseAnalytics.Param.CREATIVE_NAME, null);
            this.B = jSONObject.optString("tr_install_type", null);
            this.C = jSONObject.optString("touch_type", null);
            this.D = jSONObject.optString("touch_timestamp", null);
            this.E = Intrinsics.EZpvd((Object) jSONObject.optString("activation_type"), (Object) "promotion") ? a.PROMOTION : a.ORGANIC;
            this.F = jSONObject.optString("activation_timestamp", null);
            this.G = jSONObject.optBoolean("is_first_launch");
            this.H = jSONObject.optJSONObject(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR);
        }
    }
}
