package com.bytedance.bdtracker;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.Toast;
import com.amplitude.analytics.BuildConfig;
import com.bytedance.applog.IPicker;
import com.bytedance.applog.simulate.SimulateLaunchActivity;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.adapter.internal.CommonCode;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d4 extends AsyncTask<Void, Void, JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final d g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(d dVar) {
        new d4(dVar).execute(new Void[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.AsyncTask
    public JSONObject doInBackground(Void[] voidArr) throws JSONException {
        String str;
        JSONObject jSONObject;
        int i;
        if (SimulateLaunchActivity.entryMode == 0) {
            d dVar = this.g;
            a4 a4Var = dVar.k;
            String str2 = dVar.m;
            String str3 = this.d;
            int i2 = this.f158a;
            int i3 = this.b;
            String str4 = this.e;
            String str5 = this.c;
            a4Var.b.D.debug(11, "Start to login simulator with device id:{} and qrParam:{}...", str4, str5);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObjectA = a4.a(str2, str3);
                jSONObjectA.put("width", i2);
                jSONObjectA.put("height", i3);
                jSONObjectA.put("device_id", str4);
                jSONObject2.put("header", jSONObjectA);
                jSONObject2.put("qr_param", str5);
                HashMap<String, String> mapA = a4Var.a();
                try {
                    String str6 = new String(a4Var.b.getNetClient().execute((byte) 1, a4Var.f133a + "/simulator/mobile/login", jSONObject2, mapA, (byte) 0, true, 10000));
                    a4Var.b.D.debug(11, "Login simulator with response:{}", str6);
                    if (!r.c(str6)) {
                        return new JSONObject(str6);
                    }
                } catch (Throwable th) {
                    a4Var.b.D.error(11, "Login simulator failed", th, new Object[0]);
                    a4Var.b.b().a(th, "simulateLogin");
                }
            } catch (Throwable th2) {
                a4Var.b.D.error(11, "JSON handle failed", th2, new Object[0]);
                a4Var.b.b().a(th2, "simulateLogin header");
            }
        } else {
            d dVar2 = this.g;
            a4 a4Var2 = dVar2.k;
            String str7 = dVar2.m;
            String str8 = this.d;
            int i4 = this.f158a;
            int i5 = this.b;
            String str9 = this.e;
            a4Var2.b.D.debug(11, "Start to login simulator with device id:{}...", str9);
            JSONObject jSONObject3 = new JSONObject();
            try {
                JSONObject jSONObjectA2 = a4.a(str7, str8);
                r.a(jSONObjectA2, a4Var2.b.getHeader());
                jSONObjectA2.put("width", i4);
                jSONObjectA2.put("height", i5);
                jSONObjectA2.put("device_id", str9);
                jSONObjectA2.put("device_model", Build.MODEL);
                jSONObject3.put("header", jSONObjectA2);
                HashMap<String, String> mapA2 = a4Var2.a();
                String string = "";
                String str10 = null;
                while (true) {
                    if (!isCancelled()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            jSONObject3.put("sync_id", string);
                            str = new String(a4Var2.b.getNetClient().execute((byte) 1, a4Var2.f133a + "/simulator/limited_mobile/try_link", jSONObject3, mapA2, (byte) 0, true, 10000));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            jSONObject = new JSONObject(str);
                            i = jSONObject.getJSONObject("data").getInt("retry");
                        } catch (Throwable th4) {
                            th = th4;
                            str10 = str;
                            a4Var2.b.D.error(11, "Post to simulate login failed", th, new Object[0]);
                            a4Var2.b.b().a(th, "simulateLoginWithoutQR");
                        }
                        if (i == 0) {
                            break;
                        }
                        if (i == 2) {
                            str10 = str;
                            break;
                        }
                        string = jSONObject.getJSONObject("data").getString("sync_id");
                        str10 = str;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 < 1000) {
                            try {
                                Thread.sleep(1000 - jCurrentTimeMillis2);
                            } catch (InterruptedException e) {
                                a4Var2.b.D.error(11, "Sleep interrupted", e, new Object[0]);
                            }
                        }
                    } else {
                        break;
                    }
                }
                a4Var2.b.D.debug(11, "Login simulator with response:{}", str10);
                if (!r.c(str10)) {
                    try {
                        return new JSONObject(str10);
                    } catch (Throwable th5) {
                        a4Var2.b.D.error(11, "JSON handle failed", th5, new Object[0]);
                        a4Var2.b.b().a(th5, "simulateLoginWithoutQR json");
                    }
                }
            } catch (Throwable th6) {
                a4Var2.b.D.error(11, "JSON handle failed", th6, new Object[0]);
                a4Var2.b.b().a(th6, "simulateLoginWithoutQR header");
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public d4(d dVar) {
        this.g = dVar;
        dVar.k.f133a = SimulateLaunchActivity.entryUrlPrefix;
        this.f = SimulateLaunchActivity.entryType;
        this.c = SimulateLaunchActivity.entryQrParam;
        this.e = dVar.getDid();
        String str = (String) dVar.getHeaderValue(CommonCode.MapKey.HAS_RESOLUTION, null, String.class);
        if (r.d(str)) {
            String[] strArrSplit = str.split("x");
            this.b = Integer.parseInt(strArrSplit[0]);
            this.f158a = Integer.parseInt(strArrSplit[1]);
        }
        PackageInfo packageInfoA = j5.a(dVar.n, dVar.n.getApplicationInfo().packageName, 0);
        this.d = packageInfoA != null ? packageInfoA.versionName : BuildConfig.VERSION_NAME;
        dVar.D.debug(Collections.singletonList("SimulateLoginTask"), "Simulate task init success", new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.os.AsyncTask
    public void onPostExecute(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject2 = jSONObject;
        this.g.D.debug(Collections.singletonList("SimulateLoginTask"), "Simulate login with response: {}", jSONObject2);
        if (jSONObject2 == null) {
            Toast.makeText(this.g.n, "Launch event verification failed for server no response", 1).show();
            return;
        }
        String strOptString = jSONObject2.optString("message");
        String strOptString2 = jSONObject2.optString(HttpHeaders.SET_COOKIE);
        int iOptInt = jSONObject2.optInt("status");
        if (SimulateLaunchActivity.entryMode == 1 && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null) {
            this.f = jSONObjectOptJSONObject.optString(OtcExtraKeys.MODE, "").equals("log") ? SimulateLaunchActivity.DEBUG_LOG : SimulateLaunchActivity.BIND_QUERY;
        }
        if (iOptInt == 0 && "OK".equals(strOptString)) {
            if (SimulateLaunchActivity.DEBUG_LOG.equals(this.f)) {
                this.g.setRangersEventVerifyEnable(true, strOptString2);
                return;
            }
            IPicker picker = (this.g.getInitConfig() == null || this.g.getInitConfig().getPicker() == null) ? null : this.g.getInitConfig().getPicker();
            if (picker != null) {
                picker.setMarqueeCookie(strOptString2);
            }
            this.g.startSimulator(strOptString2);
            return;
        }
        if (iOptInt == 0 || !r.d(jSONObject2.optString("message"))) {
            this.g.D.warn(Collections.singletonList("SimulateLoginTask"), "Start simulator failed, please check server response: {}", jSONObject2);
            return;
        }
        Application application = this.g.n;
        StringBuilder sbA = a.a("Launch event verify failed: ");
        sbA.append(jSONObject2.optString("message"));
        Toast.makeText(application, sbA.toString(), 1).show();
    }
}
