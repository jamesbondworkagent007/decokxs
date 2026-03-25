package com.bytedance.bdtracker;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.applog.IActiveCustomParamsCallback;
import com.bytedance.applog.Level;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.util.SensitiveUtils;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class c0 extends d0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c0(f0 f0Var) {
        super(f0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public boolean c() {
        String str;
        Map<String, String> params;
        x1 x1Var = this.e.i;
        boolean z = false;
        if (x1Var.i() != 0) {
            UriConfig uriConfigE = this.e.e();
            JSONObject jSONObjectF = x1Var.f();
            if (jSONObjectF != null) {
                String strA = this.f.j.a(x1Var.f(), uriConfigE.getActiveUri(), true, Level.L0);
                a4 a4Var = this.f.k;
                a4Var.b.D.debug(11, "Start to active to uri:{} with request:{}...", strA, jSONObjectF);
                StringBuilder sb = new StringBuilder(strA);
                c4 c4Var = a4Var.b.j;
                String str2 = null;
                a4.a(sb, "google_aid", (String) c4Var.a(jSONObjectF, "google_aid", (Object) null, (Class<Object>) String.class));
                float rawOffset = (TimeZone.getDefault().getRawOffset() * 1.0f) / 3600000.0f;
                if (rawOffset < -12.0f) {
                    rawOffset = -12.0f;
                }
                if (rawOffset > 12.0f) {
                    rawOffset = 12.0f;
                }
                a4.a(sb, "timezone", rawOffset + "");
                IActiveCustomParamsCallback activeCustomParams = a4Var.b.getActiveCustomParams();
                if (activeCustomParams != null && (params = activeCustomParams.getParams()) != null && !params.isEmpty()) {
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                                a4.a(sb, ContentMetadata.KEY_CUSTOM_PREFIX + key, value);
                            }
                        }
                    }
                }
                String str3 = (String) c4Var.a(jSONObjectF, "real_package_name", (Object) null, (Class<Object>) String.class);
                if (!TextUtils.isEmpty(str3)) {
                    a4.a(sb, "package", (String) c4Var.a(jSONObjectF, "package", (Object) null, (Class<Object>) String.class));
                    a4.a(sb, "real_package_name", str3);
                }
                a4.a(sb, "carrier", (String) c4Var.a(jSONObjectF, "carrier", (Object) null, (Class<Object>) String.class));
                a4.a(sb, "sim_region", (String) c4Var.a(jSONObjectF, "sim_region", (Object) null, (Class<Object>) String.class));
                a4.a(sb, "app_version_minor", (String) c4Var.a(jSONObjectF, "app_version_minor", (Object) null, (Class<Object>) String.class));
                SensitiveUtils.addSensitiveParamsForUrlQuery(c4Var, sb, jSONObjectF);
                String strA2 = w5.a((JSONObject) c4Var.a(jSONObjectF, "oaid", (Object) null, (Class<Object>) JSONObject.class));
                if (TextUtils.isEmpty(strA2)) {
                    a4Var.b.D.warn(11, "active oaid is empty", new Object[0]);
                } else {
                    a4.a(sb, "oaid", strA2);
                }
                a4.a(sb, "click_id", (String) c4Var.a(jSONObjectF, "click_id", (Object) null, (Class<Object>) String.class));
                a4.a(sb, "click_id_nature", (String) c4Var.a(jSONObjectF, "click_id_nature", (Object) null, (Class<Object>) String.class));
                a4.a(sb, "client_tun", (String) c4Var.a(jSONObjectF, "client_tun", (Object) null, (Class<Object>) String.class));
                a4.a(sb, "client_anpi", (String) c4Var.a(jSONObjectF, "client_anpi", (Object) null, (Class<Object>) String.class));
                String string = sb.toString();
                String strA3 = m5.a();
                try {
                    if (!TextUtils.isEmpty("req_id") && !TextUtils.isEmpty(strA3)) {
                        string = Uri.parse(string).buildUpon().appendQueryParameter("req_id", strA3).build().toString();
                    }
                } catch (Throwable th) {
                    a4Var.b.D.error(11, "addQuery", th, new Object[0]);
                }
                try {
                    str = new String(a4Var.b.getNetClient().execute((byte) 0, a4Var.c.a(string), null, a4Var.a(), (byte) 0, true, 60000));
                    try {
                        a4Var.b.D.debug(11, "request active success: {}", str);
                    } catch (Exception e) {
                        e = e;
                        str2 = str;
                        a4Var.b.D.error(11, "request active error", e, new Object[0]);
                        a4Var.b.b().a(e, "active");
                        str = str2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                JSONObject jSONObjectA = a4Var.a(str);
                if (jSONObjectA != null && "success".equals(jSONObjectA.optString("message", ""))) {
                    z = true;
                }
            } else {
                this.e.d.D.error("Device header is null", new Object[0]);
            }
        }
        if (z) {
            this.d = true;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public String d() {
        return "Activator";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public long[] e() {
        return i0.g;
    }

    @Override // com.bytedance.bdtracker.d0
    public boolean f() {
        return true;
    }

    @Override // com.bytedance.bdtracker.d0
    public long g() {
        return 3600000L;
    }
}
