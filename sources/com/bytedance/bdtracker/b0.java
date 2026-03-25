package com.bytedance.bdtracker;

import com.bytedance.applog.Level;
import com.bytedance.applog.network.RangersHttpTimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b0 extends d0 {
    public long g;
    public JSONObject h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public b0(f0 f0Var) {
        super(f0Var);
        this.g = 0L;
        this.h = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject a(int i) {
        boolean z;
        RangersHttpTimeoutException rangersHttpTimeoutException;
        JSONObject jSONObjectA;
        synchronized (this) {
            f0 f0Var = this.e;
            v1 v1Var = f0Var.e;
            x1 x1Var = f0Var.i;
            if (x1Var.i() != 0 && x1Var.f() != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = this.h;
                if (jSONObject != null && jCurrentTimeMillis - this.g < this.e.f167a) {
                    return jSONObject;
                }
                this.g = jCurrentTimeMillis;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("header", x1Var.f());
                    jSONObject2.put("magic_tag", "ss_app_log");
                    jSONObject2.put("_gen_time", jCurrentTimeMillis);
                    f5.a(this.f, jSONObject2);
                } catch (Throwable th) {
                    this.f.D.error(2, "Set header failed", th, new Object[0]);
                }
                String strA = this.f.j.a(x1Var.f(), this.e.e().getAbUri(), true, Level.L1);
                a4 a4Var = this.f.k;
                String strA2 = a4.a(strA, f5.b);
                a4Var.b.D.debug(11, "Start to get ab config to uri:{} with request:{}...", strA2, jSONObject2);
                try {
                    String strA3 = a4Var.a(jSONObject2, strA2, a4Var.a(), i);
                    a4Var.b.D.debug(11, "Get ab config with response:{}", strA3);
                    jSONObjectA = a4Var.a(strA3);
                } finally {
                    if (z) {
                    }
                }
                JSONObject jSONObjectOptJSONObject = (jSONObjectA == null || !"success".equals(jSONObjectA.optString("message", ""))) ? null : jSONObjectA.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    this.h = jSONObjectOptJSONObject;
                    boolean z2 = !r.b(v1Var.a(), jSONObjectOptJSONObject);
                    this.f.D.debug(2, "getAbConfig changed:{}", Boolean.valueOf(z2));
                    x1Var.a(jSONObjectOptJSONObject);
                    i1 i1Var = this.f.y;
                    if (i1Var != null) {
                        i1Var.onRemoteAbConfigGet(z2, jSONObjectOptJSONObject);
                    }
                    return jSONObjectOptJSONObject;
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public boolean c() {
        try {
            return a(60000) != null;
        } catch (Throwable th) {
            this.f.D.error(2, "Do fetch config failed", th, new Object[0]);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public String d() {
        return "AbConfigure";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public long[] e() {
        return i0.h;
    }

    @Override // com.bytedance.bdtracker.d0
    public boolean f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public long g() {
        long j = this.e.e.f.getLong("abtest_fetch_interval", 0L);
        if (j < 600000) {
            return 600000L;
        }
        return j;
    }
}
