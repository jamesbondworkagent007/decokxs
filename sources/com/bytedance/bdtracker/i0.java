package com.bytedance.bdtracker;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.bytedance.applog.DynamicValueCallback;
import com.bytedance.applog.Level;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i0 extends d0 {
    public static final long[] g = {60000, 60000, 60000, 120000, 120000, 180000, 180000, 360000, 360000, 540000, 540000};
    public static final long[] h = {180000, 180000, 360000, 360000, 540000, 540000, 720000, 720000};
    public static final long[] i = {2000, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MIN_BACKOFF_MILLIS, SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, 60000, 60000, 120000, 120000, 180000, 180000, 360000, 360000, 540000, 540000};

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f190a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f190a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", i0.this.f.m);
                jSONObject.put(JwtUtilsKt.DID_PREFIX, this.f190a);
                jSONObject.put("installId", this.b);
                jSONObject.put("ssid", this.c);
                jSONObject.put("bdDid", this.d);
                jSONObject.put("uuid", this.e);
                jSONObject.put("uuidType", this.f);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i0(f0 f0Var) {
        super(f0Var, f0Var.i.d.optLong("register_time", 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            this.e.d.D.debug(1, "Start do register work", new Object[0]);
            String strOptString = jSONObject.optString("user_unique_id");
            String strOptString2 = jSONObject.optString("user_unique_id_type");
            f0 f0Var = this.e;
            x1 x1Var = f0Var.i;
            v1 v1Var = f0Var.e;
            v1Var.c.getPreInstallCallback();
            Map<String, Object> commonHeader = v1Var.c.getCommonHeader();
            jSONObject.put("req_id", m5.f223a.b(new Object[0]));
            if (v1Var.l()) {
                try {
                    boolean z = w5.f291a.b(this.f.n).c;
                    this.e.d.D.debug(1, "Oaid maySupport: {}", Boolean.valueOf(z));
                    DynamicValueCallback<String> customOaidCallback = v1Var.c.getCustomOaidCallback();
                    if (customOaidCallback == null || TextUtils.isEmpty(customOaidCallback.get())) {
                        jSONObject.put("oaid_may_support", z);
                    } else {
                        jSONObject.put("oaid_may_support", true);
                    }
                } catch (Throwable th) {
                    this.e.d.D.error(1, "Check oaid maySupport failed.", th, new Object[0]);
                }
            }
            if (commonHeader != null) {
                for (Map.Entry<String, Object> entry : commonHeader.entrySet()) {
                    if (entry.getValue() != null) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            JSONObject jSONObjectB = b(jSONObject);
            if (jSONObjectB == null) {
                this.e.d.D.debug(1, "Register finished", new Object[0]);
                return false;
            }
            String strOptString3 = jSONObjectB.optString("device_id", "");
            String strOptString4 = jSONObjectB.optString("install_id", "");
            String strOptString5 = jSONObjectB.optString("ssid", "");
            String strOptString6 = jSONObjectB.optString("bd_did", "");
            String strOptString7 = jSONObjectB.optString("cd", "");
            if (r.a(strOptString5)) {
                this.e.c().a(strOptString, strOptString5);
            }
            boolean zA = x1Var.a(jSONObjectB, strOptString, strOptString3, strOptString4, strOptString5, strOptString6, strOptString7);
            if (zA) {
                f0 f0Var2 = this.e;
                f0Var2.a(f0Var2.m);
                if (this.e.e.c.isReportOaidEnable()) {
                    this.e.a();
                }
                if (!LogUtils.isDisabled()) {
                    LogUtils.sendJsonFetcher("device_register_end", new a(strOptString3, strOptString4, strOptString5, strOptString6, strOptString, strOptString2));
                }
            }
            return zA;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject b(@NonNull JSONObject jSONObject) {
        this.e.d.D.debug(1, "Start to invokeRegister", new Object[0]);
        try {
            if (jSONObject.opt("oaid") instanceof String) {
                jSONObject.remove("oaid");
                x1 x1Var = this.e.i;
                if (x1Var != null && x1Var.f() != null) {
                    Object objOpt = this.e.i.f().opt("oaid");
                    if (objOpt instanceof JSONObject) {
                        jSONObject.put("oaid", objOpt);
                    }
                }
            }
            JSONObject jSONObjectB = a4.b(jSONObject);
            return this.f.k.a(this.f.j.a(jSONObject, this.e.e().getRegisterUri(), true, Level.L1), jSONObjectB);
        } catch (Throwable th) {
            this.e.d.D.error(1, "Request to register server failed.", th, new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public boolean c() {
        JSONObject jSONObject = new JSONObject();
        r.a(jSONObject, this.e.i.f());
        return a(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public String d() {
        return "register";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public long[] e() {
        int i2 = this.e.i.i();
        if (i2 == 0) {
            return i;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return g;
            }
            this.e.d.D.error(1, "Unknown register state", new Object[0]);
        }
        return h;
    }

    @Override // com.bytedance.bdtracker.d0
    public boolean f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public long g() {
        return this.e.n.j ? 21600000L : 43200000L;
    }

    public JSONObject c(@NonNull JSONObject jSONObject) {
        try {
            JSONObject jSONObjectB = a4.b(jSONObject);
            return this.f.k.b(this.e.e().getReportOaidUri(), jSONObjectB);
        } catch (Throwable th) {
            this.e.d.D.error(1, "Report oaid failed.", th, new Object[0]);
            return null;
        }
    }
}
