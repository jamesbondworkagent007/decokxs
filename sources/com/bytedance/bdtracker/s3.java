package com.bytedance.bdtracker;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.oneid.IDBindCallback;
import com.bytedance.applog.oneid.IDBindResult;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f256a;
    public final Handler b;
    public final IAppLogLogger c;
    public final f0 d;

    public static final class a implements Runnable {
        public final /* synthetic */ Map b;
        public final /* synthetic */ IDBindCallback c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(Map map, IDBindCallback iDBindCallback) {
            this.b = map;
            this.c = iDBindCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            JSONObject jSONObjectA;
            Exception e;
            String str;
            JSONObject jSONObject = new JSONObject();
            x1 x1Var = s3.this.d.i;
            Intrinsics.AEQbTJ(x1Var, "");
            r.a(jSONObject, x1Var.f());
            s3.this.c.debug(15, "BindID identities: {}", this.b);
            Map map = this.b;
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("identities", jSONObject2);
            JSONObject jSONObjectB = a4.b(jSONObject);
            UriConfig uriConfigE = s3.this.d.e();
            Intrinsics.AEQbTJ(uriConfigE, "");
            String iDBindUri = uriConfigE.getIDBindUri();
            if (iDBindUri != null) {
                d dVar = s3.this.f256a;
                Intrinsics.AEQbTJ(dVar, "");
                a4 a4Var = dVar.k;
                a4Var.b.D.debug(11, "Start to bind id to uri:{} with request:{}...", iDBindUri, jSONObjectB);
                try {
                    str = new String(a4Var.b.getNetClient().execute((byte) 1, a4Var.c.a(iDBindUri), jSONObjectB, a4Var.a(), (byte) 0, true, 60000));
                    try {
                        a4Var.b.D.debug(11, "bindId success: {}", str);
                    } catch (Exception e2) {
                        e = e2;
                        a4Var.b.D.error(11, "bindId error", e, new Object[0]);
                        a4Var.b.b().a(e, "bindID");
                    }
                } catch (Exception e3) {
                    e = e3;
                    str = null;
                }
                jSONObjectA = a4Var.a(str);
            } else {
                jSONObjectA = null;
            }
            if (jSONObjectA == null) {
                String strA = com.bytedance.bdtracker.a.a("BindID http request error, url=", iDBindUri);
                s3.this.c.warn(15, strA, new Object[0]);
                IDBindCallback iDBindCallback = this.c;
                if (iDBindCallback != null) {
                    s3.this.b.post(new t3(iDBindCallback, -2, strA));
                    return;
                }
                return;
            }
            int iOptInt = jSONObjectA.optInt("status_code");
            if (iOptInt != 200) {
                String strOptString = jSONObjectA.optString("status_message");
                s3.this.c.warn(15, strOptString, new Object[0]);
                IDBindCallback iDBindCallback2 = this.c;
                if (iDBindCallback2 != null) {
                    s3.this.b.post(new t3(iDBindCallback2, iOptInt, strOptString));
                    return;
                }
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("data");
            IDBindResult iDBindResult = new IDBindResult(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("ssid") : null, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("failed_id_list") : null);
            s3.this.c.debug(15, "BindID reportSuccess, result: {}", iDBindResult);
            IDBindCallback iDBindCallback3 = this.c;
            if (iDBindCallback3 != null) {
                s3.this.b.post(new u3(iDBindCallback3, iDBindResult));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s3(@NotNull f0 f0Var) {
        Intrinsics.EZpvd((Object) f0Var, "");
        this.d = f0Var;
        this.f256a = f0Var.d;
        this.b = new Handler(Looper.getMainLooper());
        d dVar = f0Var.d;
        Intrinsics.AEQbTJ(dVar, "");
        this.c = dVar.D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(@NotNull Map<String, String> map, IDBindCallback iDBindCallback) {
        Intrinsics.EZpvd((Object) map, "");
        y.f301a.submit(new a(map, iDBindCallback));
    }
}
