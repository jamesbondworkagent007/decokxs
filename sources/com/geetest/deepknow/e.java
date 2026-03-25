package com.geetest.deepknow;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class e {
    private static long l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f392a;
    private volatile JSONObject b;
    private volatile JSONObject c;
    private volatile int d;
    private volatile long e;
    private volatile String f;
    private volatile long g;
    private Context h;
    private String i;
    private String j;
    private JSONObject k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Context context, String str) {
        v.a(context);
        a(context, str);
        b(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void a(Context context, String str) {
        if (k.a(context)) {
            throw new IllegalArgumentException("Context is an illegal parameter.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("App_id is an illegal parameter.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String a() {
        return this.f392a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(int i) {
        this.d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(long j) {
        this.e = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(String str) {
        this.f = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject b() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(long j) {
        this.g = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String c() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String d() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject e() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String f() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject g() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String h() {
        return "1.3.3";
    }

    private void b(Context context, String str) {
        this.h = context;
        this.f392a = str;
        new j(context, this);
        this.b = new JSONObject();
        try {
            this.b.put("status", n.b);
            this.b.put("message", this.b);
            this.b.put(OtcExtraKeys.PARAMS_SESSION_ID, "");
        } catch (JSONException unused) {
        }
        this.d = 900000;
        this.i = UUID.randomUUID().toString();
        this.k = o.a(context);
        String strA = h.a(context, w.f408a, (String) null);
        if (TextUtils.isEmpty(strA) || "$unknown".equalsIgnoreCase(strA)) {
            d.a(context);
        }
    }

    public void a(boolean z) {
        t.a(z ? 1 : 6, "Geetest_DeepKnow");
    }

    public void a(DPListener dPListener) {
        if (!TextUtils.isEmpty(this.f) && SystemClock.elapsedRealtime() - this.e < ((long) (this.d - 20)) * 1000 && System.currentTimeMillis() - (this.g * 1000) < ((long) (this.d - 20)) * 1000) {
            dPListener.onSessionStatus(true);
            dPListener.onSessionResult(this.c);
            if (System.currentTimeMillis() - l > 1000) {
                l = System.currentTimeMillis();
                i.a(this.h, this);
                return;
            }
            return;
        }
        dPListener.onSessionStatus(false);
        i.a(this.h, this, x.a(dPListener));
    }

    public void a(JSONObject jSONObject, DPListener dPListener) {
        if (dPListener == null) {
            try {
                throw new RuntimeException("The parameter 'callBack' is null.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jSONObject == null) {
                dPListener.onSessionStatus(true);
                dPListener.onSessionResult(n.a(n.c, "The parameter 'json' is null."));
                return;
            }
            this.j = (TextUtils.isEmpty(this.f) || SystemClock.elapsedRealtime() - this.e >= ((long) (this.d + (-20))) * 1000 || System.currentTimeMillis() - (this.g * 1000) >= ((long) (this.d + (-20))) * 1000) ? "61d960668bdd04dba7abc3edd6b413c1" : this.f;
            try {
                String string = jSONObject.getString("scene");
                dPListener.onSessionStatus(false);
                i.a(this.h, string, jSONObject, this, x.a(dPListener));
            } catch (Exception e2) {
                dPListener.onSessionStatus(true);
                dPListener.onSessionResult(n.a(n.c, e2.toString()));
            }
        }
    }
}
