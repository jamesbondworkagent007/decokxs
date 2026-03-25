package com.geetest.deepknow;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.p2p.api.OtcExtraKeys;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class i {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f394a;
        final /* synthetic */ e b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Context context, e eVar) {
            this.f394a = context;
            this.b = eVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            i.c(f.a(String.format("https://dkapi.geetest.com/deepknow/v2/judge?app_id=%s&pt=3&session_id=%s&sdk_version=%s", this.b.a(), this.b.f(), "1.3.3"), g.a(this.f394a, this.b), 5000), this.b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f395a;
        final /* synthetic */ e b;
        final /* synthetic */ DPListener c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(Context context, e eVar, DPListener dPListener) {
            this.f395a = context;
            this.b = eVar;
            this.c = dPListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            if (i.c(f.a(String.format("https://dkapi.geetest.com/deepknow/v2/judge?app_id=%s&pt=3&session_id=%s&sdk_version=%s", this.b.a(), this.b.f(), "1.3.3"), g.a(this.f395a, this.b), 5000), this.b)) {
                this.c.onSessionResult(this.b.g());
            } else {
                this.c.onSessionResult(this.b.e());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f396a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ e c;
        final /* synthetic */ String d;
        final /* synthetic */ DPListener e;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(Context context, JSONObject jSONObject, e eVar, String str, DPListener dPListener) {
            this.f396a = context;
            this.b = jSONObject;
            this.c = eVar;
            this.d = str;
            this.e = dPListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            this.e.onSessionResult(i.d(f.a(String.format("https://dkapi.geetest.com/deepknow/v2/collector/app?app_id=%s&pt=3&session_id=%s&sdk_version=%s&scene=%s", this.c.a(), this.c.c(), "1.3.3", this.d), g.a(this.f396a, this.b, this.c), 5000), this.c));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void a(Context context, e eVar) {
        com.geetest.deepknow.c.a().a(new a(context, eVar));
    }

    public static void a(Context context, e eVar, DPListener dPListener) {
        com.geetest.deepknow.c.a().a(new b(context, eVar, dPListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject d(String str, e eVar) {
        try {
            t.b(str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("status");
            jSONObject.getString("message");
            if (i == 1) {
                jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, eVar.c());
            }
            return jSONObject;
        } catch (Exception unused) {
            int i2 = n.d;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", i2);
                jSONObject2.put("message", str);
                jSONObject2.put(OtcExtraKeys.PARAMS_SESSION_ID, "");
                return jSONObject2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static void a(Context context, String str, JSONObject jSONObject, e eVar, DPListener dPListener) {
        com.geetest.deepknow.c.a().a(new c(context, jSONObject, eVar, str, dPListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str, e eVar) {
        int i;
        String string = "";
        try {
            t.b(str);
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("status");
            String string2 = jSONObject.getString("message");
            if (i == 1) {
                string = jSONObject.getString(OtcExtraKeys.PARAMS_SESSION_ID);
                int i2 = jSONObject.getInt(RemoteMessageConst.TTL);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jSONObject.getInt("gen_time");
                eVar.a(i2);
                eVar.a(jElapsedRealtime);
                eVar.b(j);
                eVar.a(string);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("status", i);
                jSONObject2.put("message", string2);
                jSONObject2.put(OtcExtraKeys.PARAMS_SESSION_ID, string);
                eVar.b(jSONObject2);
                return true;
            }
            str = string2;
        } catch (Exception unused) {
            i = n.f398a;
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("status", i);
            jSONObject3.put("message", str);
            jSONObject3.put(OtcExtraKeys.PARAMS_SESSION_ID, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        eVar.a(jSONObject3);
        return false;
    }
}
