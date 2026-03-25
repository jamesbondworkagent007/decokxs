package com.bytedance.bdtracker;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.applog.Level;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class e0 extends d0 {

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f161a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(JSONObject jSONObject) {
            this.f161a = jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            r.c(this.f161a, jSONObject);
            try {
                jSONObject.put("appId", e0.this.f.m);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e0(f0 f0Var) {
        super(f0Var, f0Var.e.f.getLong("app_log_last_config_time", 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.bdtracker.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c() throws JSONException {
        String strA;
        x1 x1Var = this.e.i;
        JSONObject jSONObjectF = x1Var.f();
        if (x1Var.i() != 0 && jSONObjectF != null) {
            JSONObject jSONObjectB = a4.b(jSONObjectF);
            if (this.e.e.c.isEventFilterEnable()) {
                jSONObjectB.put("event_filter", 1);
            }
            f5.a(this.f, jSONObjectB);
            String strA2 = this.f.j.a(x1Var.f(), this.e.e().getSettingUri(), true, Level.L1);
            a4 a4Var = this.f.k;
            String strA3 = a4.a(strA2, f5.b);
            a4Var.b.D.debug(11, "Start to get config to uri:{} with request:{}...", strA3, jSONObjectB);
            try {
                strA = a4Var.a(jSONObjectB, strA3, a4Var.a(), 60000);
            } catch (Throwable th) {
                a4Var.b.D.error(11, "Config failed", th, new Object[0]);
                a4Var.b.b().a(th, "config");
                strA = null;
            }
            a4Var.b.D.debug(11, "Get config with response:{}", strA);
            JSONObject jSONObjectA = a4Var.a(strA);
            JSONObject jSONObjectOptJSONObject = (jSONObjectA == null || !"ss_app_log".equals(jSONObjectA.optString("magic_tag", ""))) ? null : jSONObjectA.optJSONObject("config");
            v1 v1Var = this.e.e;
            i1 i1Var = this.f.y;
            if (i1Var != null) {
                i1Var.onRemoteConfigGet(!r.b(jSONObjectOptJSONObject, v1Var.i), jSONObjectOptJSONObject);
            }
            if (jSONObjectOptJSONObject != null) {
                v1Var.b.D.debug(Collections.singletonList("ConfigManager"), "Set config:{}", jSONObjectOptJSONObject);
                v1Var.i = jSONObjectOptJSONObject;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jOptInt = jSONObjectOptJSONObject.optInt("session_interval", 0);
                if (jOptInt <= 0 || jOptInt > 604800) {
                    v1Var.f.remove("session_interval");
                } else {
                    v1Var.f.putLong("session_interval", jOptInt * 1000);
                }
                long jOptInt2 = ((long) jSONObjectOptJSONObject.optInt("batch_event_interval", 60)) * 1000;
                if (jOptInt2 < WorkRequest.MIN_BACKOFF_MILLIS || jOptInt2 > 300000) {
                    v1Var.f.remove("batch_event_interval");
                } else {
                    v1Var.f.putLong("batch_event_interval", jOptInt2);
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("batch_event_size", -1);
                if (v1Var.a(iOptInt)) {
                    v1Var.f.putInt("batch_event_size", iOptInt);
                } else {
                    v1Var.f.remove("batch_event_size");
                }
                int iOptInt2 = jSONObjectOptJSONObject.optInt("send_launch_timely", 0);
                if (iOptInt2 <= 0 || iOptInt2 > 604800) {
                    v1Var.f.remove("send_launch_timely");
                } else {
                    v1Var.f.putInt("send_launch_timely", iOptInt2);
                }
                long jOptInt3 = jSONObjectOptJSONObject.optInt("abtest_fetch_interval", 0);
                if (jOptInt3 <= 20 || jOptInt3 > 604800) {
                    v1Var.f.remove("abtest_fetch_interval");
                } else {
                    v1Var.f.putLong("abtest_fetch_interval", jOptInt3 * 1000);
                }
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("bav_log_collect", v1Var.c.isAutoTrackEnabled());
                v1Var.f.putBoolean("bav_log_collect", zOptBoolean);
                v1Var.s = zOptBoolean ? 1 : 0;
                v1Var.f.putBoolean("bav_ab_config", jSONObjectOptJSONObject.optBoolean("bav_ab_config", v1Var.c.isAbEnable()));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("real_time_events");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    v1Var.f.remove("real_time_events");
                } else {
                    v1Var.f.putString("real_time_events", jSONArrayOptJSONArray.toString());
                }
                v1Var.k = null;
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("sensitive_fields");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    v1Var.f.remove("sensitive_fields");
                } else {
                    v1Var.f.putString("sensitive_fields", jSONArrayOptJSONArray2.toString());
                }
                v1Var.f.putLong("app_log_last_config_time", jCurrentTimeMillis);
                long jOptLong = jSONObjectOptJSONObject.optLong("fetch_interval", 21600L) * 1000;
                if (jOptLong < 1800000 || jOptLong > 172800000) {
                    jOptLong = 21600000;
                }
                v1Var.f.putLong("fetch_interval", jOptLong);
                if (jSONObjectOptJSONObject.has("applog_disable_monitor")) {
                    v1Var.f.putBoolean("monitor_enabled", jSONObjectOptJSONObject.optInt("applog_disable_monitor", 0) == 1);
                }
                if (jSONObjectOptJSONObject.has("enter_background_not_send")) {
                    v1Var.f.putBoolean("enter_background_not_send", jSONObjectOptJSONObject.optInt("enter_background_not_send") == 1);
                }
                if (1 == jSONObjectOptJSONObject.optInt("observe_enable", 0)) {
                    String strOptString = jSONObjectOptJSONObject.optString("observe_appid", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        v1Var.f.remove("observe_appid");
                    } else {
                        v1Var.f.putString("observe_appid", strOptString);
                    }
                }
                v1Var.n();
                if (!v1Var.k()) {
                    this.e.q = null;
                }
                f0 f0Var = this.e;
                f0Var.j.removeMessages(13);
                f0Var.j.sendEmptyMessage(13);
                if (this.e.e.c.isEventFilterEnable()) {
                    String strA4 = b.a(this.f, "sp_filter_name");
                    f0 f0Var2 = this.e;
                    f0Var2.y = f1.a(f0Var2.b(), strA4, jSONObjectOptJSONObject);
                }
                if (!LogUtils.isDisabled()) {
                    LogUtils.sendJsonFetcher("fetch_log_settings_end", new a(jSONObjectOptJSONObject));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public String d() {
        return "Configure";
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
        return this.e.e.f.getLong("fetch_interval", 21600000L);
    }
}
