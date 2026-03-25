package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.store.kv.IKVStore;
import com.ibm.icu.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f272a;
    public final d b;
    public final InitConfig c;
    public final IKVStore d;
    public final IKVStore e;
    public final IKVStore f;
    public volatile JSONObject g;
    public volatile String h;
    public volatile JSONObject i;
    public final Set<String> j;
    public volatile HashSet<String> k;
    public int l;
    public int m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f273o;
    public long p;
    public boolean q;
    public boolean r;
    public int s;
    public final p1 t;

    public class a implements EventBus.DataFetcher {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            String str;
            String str2;
            String str3;
            String str4;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("appId", v1.this.b.m);
                long j = v1.this.f.getLong("session_interval", 0L);
                if (j > 0) {
                    str = j + DateFormat.MINUTE_SECOND;
                } else {
                    str = "--";
                }
                jSONObject2.put("后台会话时长", str);
                long j2 = v1.this.f.getLong("batch_event_interval", 0L);
                if (j2 > 0) {
                    str2 = j2 + DateFormat.MINUTE_SECOND;
                } else {
                    str2 = "--";
                }
                jSONObject2.put("事件上报周期", str2);
                long j3 = v1.this.f.getLong("abtest_fetch_interval", 0L);
                if (j3 > 0) {
                    str3 = j3 + DateFormat.MINUTE_SECOND;
                } else {
                    str3 = "--";
                }
                jSONObject2.put("AB实验更新周期", str3);
                jSONObject2.put("全埋点开关", v1.this.f.getBoolean("bav_log_collect", false));
                jSONObject2.put("AB实验开关", v1.this.f.getBoolean("bav_ab_config", false));
                jSONObject2.put("实时埋点事件", v1.this.f.getString("real_time_events", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                long j4 = v1.this.f.getLong("fetch_interval", 0L);
                if (j4 > 0) {
                    str4 = j4 + DateFormat.MINUTE_SECOND;
                } else {
                    str4 = "--";
                }
                jSONObject2.put("服务端配置更新周期", str4);
                jSONObject2.put("禁止内部监控开关", v1.this.f.getBoolean("applog_disable_monitor", false));
                int i = v1.this.f.getInt("batch_event_size", -1);
                StringBuilder sb = new StringBuilder();
                sb.append(i >= 0 ? Integer.valueOf(i) : "--");
                sb.append("条");
                jSONObject2.put("事件累计上报数量", sb.toString());
                jSONObject2.put("禁止采集的敏感字段", v1.this.f.getString("sensitive_fields", "--"));
                jSONObject2.put("服务端黑名单事件", v1.this.j);
                jSONObject.put("config", jSONObject2);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v1(d dVar, Context context, InitConfig initConfig) {
        new HashSet();
        this.j = new HashSet();
        this.l = 0;
        this.m = 27;
        this.n = 0L;
        this.f273o = 0;
        this.p = 0L;
        this.q = false;
        this.r = false;
        this.s = 1;
        this.b = dVar;
        this.f272a = context;
        this.c = initConfig;
        IKVStore iKVStoreA = x4.a(initConfig, context, initConfig.getSpName());
        this.f = iKVStoreA;
        this.d = x4.a(initConfig, context, b.a(dVar, "header_custom"));
        this.e = x4.a(initConfig, context, b.a(dVar, "last_sp_session"));
        this.t = new p1(iKVStoreA, dVar.D);
        this.r = iKVStoreA.getBoolean("page_pack_upload", true);
        iKVStoreA.putBoolean("page_pack_upload", false);
        if (i()) {
            this.r = false;
        }
        dVar.D.debug("loadPagePackFirst isPagePackUpdate: {}", Boolean.valueOf(this.r));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<f4> a(List<f4> list) {
        Iterator<f4> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            f4 next = it.next();
            if (next instanceof m4) {
                m4 m4Var = (m4) next;
                HashSet<String> hashSet = this.k;
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    try {
                        JSONArray jSONArray = new JSONArray(this.f.getString("real_time_events", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArray.getString(i);
                            if (!TextUtils.isEmpty(string)) {
                                hashSet.add(string);
                            }
                        }
                    } catch (Throwable th) {
                        this.b.D.error(Collections.singletonList("ConfigManager"), "getRealTimeEvents failed", th, new Object[0]);
                        this.b.b().a(th, "getRealTimeEvents");
                    }
                }
                this.k = hashSet;
                if (hashSet.contains(m4Var.u)) {
                    it.remove();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    public JSONObject a() {
        JSONObject jSONObject = this.g;
        if (jSONObject == null) {
            synchronized (this) {
                try {
                    jSONObject = new JSONObject(this.d.getString("ab_configure", ""));
                } finally {
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                this.g = jSONObject;
            }
        }
        return jSONObject;
    }

    public boolean a(int i) {
        long j = i;
        return j >= 50 && j <= 9999;
    }

    public final boolean a(long j) {
        return j >= WorkRequest.MIN_BACKOFF_MILLIS && j <= 300000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean a(String str) {
        String string = this.f.getString("sensitive_fields", "");
        return !TextUtils.isEmpty(string) && string.contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String b() {
        String channel = this.c.getChannel();
        if (TextUtils.isEmpty(channel)) {
            channel = this.c.getTweakedChannel();
        }
        if (!TextUtils.isEmpty(channel)) {
            return channel;
        }
        try {
            return this.f272a.getPackageManager().getApplicationInfo(this.f272a.getPackageName(), 128).metaData.getString("UMENG_CHANNEL");
        } catch (Throwable th) {
            this.b.D.error(Collections.singletonList("ConfigManager"), "getChannel failed", th, new Object[0]);
            return channel;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String c() {
        String string = this.h;
        if (TextUtils.isEmpty(string)) {
            synchronized (this) {
                string = this.d.getString("external_ab_version", "");
                this.h = string;
            }
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long d() {
        return this.f.getLong("session_interval", 30000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String e() {
        StringBuilder sbA = com.bytedance.bdtracker.a.a("ssid_");
        sbA.append(this.c.getAid());
        return sbA.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String f() {
        return this.d.getString("user_unique_id", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String g() {
        return this.d.getString("user_unique_id_type", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean h() {
        return this.c.isAbEnable() && this.f.getBoolean("bav_ab_config", this.c.isAbEnable());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean i() {
        return this.f.getBoolean("is_first_app_launch", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean j() {
        if (this.c.getProcess() == 0) {
            String strB = r.b();
            if (TextUtils.isEmpty(strB)) {
                this.c.setProcess(0);
            } else {
                this.c.setProcess(strB.contains(":") ? 2 : 1);
            }
        }
        return this.c.getProcess() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean k() {
        return this.f.getBoolean("monitor_enabled", this.c.isMonitorEnabled());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n() {
        if (LogUtils.isDisabled() || this.f.getLong("app_log_last_config_time", 0L) <= 0) {
            return;
        }
        LogUtils.sendJsonFetcher("remote_settings", new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean l() {
        return this.c.isOaidEnabled() && !a("oaid");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean m() {
        return this.c.isOperatorInfoEnabled() && !a("carrier");
    }

    public void a(@NonNull JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("backoff_ratio", 0);
        this.l = iOptInt;
        if (iOptInt < 0 || iOptInt > 10000) {
            this.l = 0;
        }
        int i = this.l > 0 ? 1 : 27;
        int iOptInt2 = jSONObject.optInt("max_request_frequency", i);
        this.m = iOptInt2;
        if (iOptInt2 < 1 || iOptInt2 > 27) {
            this.m = i;
        }
        int i2 = this.l;
        if (i2 > 0 && this.n == 0) {
            this.n = System.currentTimeMillis();
            this.f273o = 1;
        } else if (i2 == 0) {
            this.n = 0L;
            this.f273o = 0;
        }
        this.p = jSONObject.optLong("batch_event_interval", 0L) * 1000;
        this.q = jSONObject.optInt("enter_background_not_send") == 1;
        IAppLogLogger iAppLogLogger = this.b.D;
        List<String> listSingletonList = Collections.singletonList("ConfigManager");
        StringBuilder sbA = com.bytedance.bdtracker.a.a("updateLogRespConfig mBackoffRatio: ");
        sbA.append(this.l);
        sbA.append(", mMaxRequestFrequency: ");
        sbA.append(this.m);
        sbA.append(", mBackoffWindowStartTime: ");
        sbA.append(this.n);
        sbA.append(", mBackoffWindowSendCount: ");
        sbA.append(this.f273o);
        sbA.append(", mEventIntervalFromLogResp: ");
        sbA.append(this.p);
        iAppLogLogger.debug(listSingletonList, sbA.toString(), new Object[0]);
    }
}
