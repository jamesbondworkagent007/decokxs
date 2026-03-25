package com.bytedance.bdtracker;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.network.RangersHttpException;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a4 {
    public static JSONObject d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f133a = "https://databyterangers.com.cn";
    public final d b;
    public final f5 c;

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f134a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(JSONObject jSONObject) {
            this.f134a = jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            r.c(this.f134a, jSONObject);
            try {
                jSONObject.put("appId", a4.this.b.m);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public class b implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f135a;
        public final /* synthetic */ int b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ HttpURLConnection f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(String str, int i, byte[] bArr, String str2, long j, HttpURLConnection httpURLConnection) {
            this.f135a = str;
            this.b = i;
            this.c = bArr;
            this.d = str2;
            this.e = j;
            this.f = httpURLConnection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", a4.this.b.m);
                jSONObject.put("nid", this.f135a);
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, this.b);
                jSONObject.put("responseByte", this.c);
                jSONObject.put("responseString", this.d);
                jSONObject.put(CrashHianalyticsData.TIME, this.e);
                jSONObject.put("header", a4.this.a(this.f));
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public a4(d dVar) {
        this.b = dVar;
        this.c = new f5(dVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        HashMap map = new HashMap(strArr.length);
        for (String str2 : strArr) {
            String queryParameter = uri.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                map.put(str2, queryParameter);
            }
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str3 : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", str);
        jSONObject.put("os", "Android");
        jSONObject.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, "6.17.6");
        jSONObject.put("app_version", str2);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(StringBuilder sb, String str, String str2) {
        if (sb == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        sb.append(sb.toString().indexOf(63) < 0 ? "?" : ContainerUtils.FIELD_DELIMITER);
        sb.append(str);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(Uri.encode(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("magic_tag", "ss_app_log");
        jSONObject2.put("header", jSONObject);
        jSONObject2.put("_gen_time", System.currentTimeMillis());
        return jSONObject2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> a() {
        HashMap map = new HashMap(2);
        InitConfig initConfig = this.b.getInitConfig();
        if (initConfig != null) {
            Map<String, String> httpHeaders = initConfig.getHttpHeaderCallback() != null ? initConfig.getHttpHeaderCallback().get() : initConfig.getHttpHeaders();
            if (httpHeaders != null && !httpHeaders.isEmpty()) {
                map.putAll(httpHeaders);
            }
        }
        return f5.a((HashMap<String, String>) map, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONObject a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a(jSONObject);
            return jSONObject;
        } catch (Throwable th) {
            this.b.D.error(11, "JSON handle failed", th, new Object[0]);
            this.b.b().a(th, "handleTimeDiff");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : headerFields.keySet()) {
            if (r.d(str)) {
                try {
                    jSONObject.put(str, headerFields.get(str));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(String str, int i, byte[] bArr, String str2, long j, HttpURLConnection httpURLConnection) {
        if (LogUtils.isDisabled()) {
            return;
        }
        LogUtils.sendJsonFetcher("do_request_end", new b(str, i, bArr, str2, j, httpURLConnection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(JSONObject jSONObject) {
        try {
            long jOptLong = jSONObject.optLong(MTCoreConstants.Login.KEY_SERVER_TIME);
            if (jOptLong > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(MTCoreConstants.Login.KEY_SERVER_TIME, jOptLong);
                jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                d = jSONObject2;
                if (LogUtils.isDisabled()) {
                    return;
                }
                LogUtils.sendJsonFetcher("server_time_sync", new a(jSONObject2));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject b(String str, JSONObject jSONObject) {
        String str2;
        this.b.D.debug(11, "Start to report oaid to uri:{} with request:{}...", str, jSONObject);
        try {
            str2 = new String(this.b.getNetClient().execute((byte) 1, this.c.a(str), jSONObject, a(), (byte) 0, true, 60000));
            try {
                this.b.D.debug(11, "reportOaid success: {}", str2);
            } catch (Exception e) {
                e = e;
                this.b.D.error(11, "reportOaid error", e, new Object[0]);
                this.b.b().a(e, "reportOaid");
            }
        } catch (Exception e2) {
            e = e2;
            str2 = null;
        }
        return a(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int c(String str, JSONObject jSONObject) {
        int i = 102;
        try {
            String str2 = new String(this.b.getNetClient().execute((byte) 1, str, jSONObject, a(), (byte) 0, true, 60000));
            if (TextUtils.isEmpty(str2)) {
                return 102;
            }
            JSONObject jSONObject2 = new JSONObject(str2);
            a(jSONObject2);
            if (!"ss_app_log".equals(jSONObject2.optString("magic_tag"))) {
                return 102;
            }
            if ("success".equals(jSONObject2.optString("message"))) {
                return 200;
            }
            i = 101;
            this.b.b().a("f_data", 1);
            return 101;
        } catch (Throwable th) {
            this.b.b().a(th, "sendMonitor");
            if (th instanceof RangersHttpException) {
                return th.getResponseCode();
            }
            this.b.D.error(11, "Send monitor to server failed", th, new Object[0]);
            return i;
        }
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        String str2;
        this.b.D.debug(11, "Start to register to uri:{} with request:{}...", str, jSONObject);
        try {
            str2 = new String(this.b.getNetClient().execute((byte) 1, this.c.a(str), jSONObject, a(), (byte) 0, true, 60000));
        } catch (Throwable th) {
            th = th;
            str2 = null;
        }
        try {
            this.b.D.debug(11, "request register success: {}", str2);
        } catch (Throwable th2) {
            th = th2;
            this.b.D.error(11, "request register error", th, new Object[0]);
            this.b.b().a(th, "register");
        }
        return a(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(JSONObject jSONObject, String str, Map<String, String> map, int i) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        byte[] byteArray;
        String strOptString = jSONObject.optString(JwtUtilsKt.DID_METHOD_KEY);
        String strOptString2 = jSONObject.optString("iv");
        boolean z = false;
        boolean z2 = (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) ? false : true;
        this.b.D.debug("requestWithKeyIv, {}", Boolean.valueOf(z2));
        byte[] bArrExecute = this.b.getNetClient().execute((byte) 1, str, jSONObject, map, z2 ? (byte) 1 : (byte) 0, true, i);
        if (!z2) {
            return new String(bArrExecute);
        }
        String str2 = null;
        if (bArrExecute != null) {
            byte[] bArrA = f5.a(bArrExecute, strOptString, strOptString2);
            if (bArrA != null) {
                if (bArrA.length <= 0) {
                    byteArray = null;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(bArrA);
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i2 = gZIPInputStream.read(bArr);
                                    if (i2 < 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            gZIPInputStream = null;
                        }
                    } catch (Throwable unused3) {
                        gZIPInputStream = null;
                        byteArrayInputStream = null;
                    }
                    r.a((Closeable) gZIPInputStream);
                    r.a((Closeable) byteArrayInputStream);
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                if (byteArray != null) {
                    str2 = new String(byteArray);
                } else {
                    z = true;
                }
            } else {
                str2 = new String(bArrExecute);
            }
        }
        return z ? new String(this.b.getNetClient().execute((byte) 1, str, jSONObject, map, (byte) 0, true, 60000)) : str2;
    }

    public int a(String[] strArr, JSONObject jSONObject, v1 v1Var) {
        int i;
        JSONObject jSONObject2;
        int i2;
        int i3;
        long j;
        int i4;
        boolean z;
        int i5;
        String str;
        boolean z2;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap<String, String> mapA = a();
        int length = strArr2.length;
        boolean z3 = false;
        JSONObject jSONObject3 = null;
        int i6 = 0;
        int i7 = 102;
        while (i6 < length) {
            String str2 = strArr2[i6];
            try {
                i3 = i6;
                z2 = z3;
                try {
                    str = new String(this.b.getNetClient().execute((byte) 1, str2, jSONObject, mapA, (byte) 0, true, 60000));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                i3 = i6;
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject4 = new JSONObject(str);
                try {
                    a(jSONObject4);
                } catch (Throwable th3) {
                    th = th3;
                    jSONObject3 = jSONObject4;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    j = jCurrentTimeMillis;
                    i4 = length;
                    this.b.b().a("sampling", new m3(jCurrentTimeMillis, jCurrentTimeMillis2, jCurrentTimeMillis2 - jCurrentTimeMillis, i7, th.toString()));
                    this.b.b().a(th, "sendLog");
                    if (th instanceof RangersHttpException) {
                        int responseCode = th.getResponseCode();
                        if (!v1Var.c.isCongestionControlEnable() || responseCode < 500 || responseCode >= 600) {
                            i7 = responseCode;
                            z = false;
                        } else {
                            i5 = responseCode;
                        }
                    } else {
                        z = false;
                        this.b.D.error(11, "Send to server failed", th, new Object[0]);
                    }
                    i6 = i3 + 1;
                    strArr2 = strArr;
                    z3 = z;
                    length = i4;
                    jCurrentTimeMillis = j;
                }
                if (!"ss_app_log".equals(jSONObject4.optString("magic_tag"))) {
                    jSONObject3 = jSONObject4;
                    i7 = 102;
                } else {
                    if ("success".equals(jSONObject4.optString("message"))) {
                        jSONObject3 = jSONObject4;
                        i5 = 200;
                        jSONObject2 = jSONObject3;
                        i2 = i5;
                        i = 200;
                        break;
                    }
                    i7 = 101;
                    this.b.b().a("f_data", 1);
                    jSONObject3 = jSONObject4;
                }
            }
            z = z2;
            j = jCurrentTimeMillis;
            i4 = length;
            i6 = i3 + 1;
            strArr2 = strArr;
            z3 = z;
            length = i4;
            jCurrentTimeMillis = j;
        }
        i = 200;
        jSONObject2 = jSONObject3;
        i2 = i7;
        if (i2 == i && jSONObject2 != null) {
            v1Var.a(jSONObject2);
            p1 p1Var = v1Var.t;
            p1Var.a(jSONObject2, "blocklist");
            p1Var.a(jSONObject2, "whitelist");
        }
        return i2;
    }

    public boolean a(JSONObject jSONObject, String str) {
        this.b.D.debug(11, "Start to send event:{} with cookie:{} to et...", jSONObject, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("header", this.b.getHeader());
            if (jSONObject != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                jSONObject2.put("event_v3", jSONArray);
            }
        } catch (Throwable th) {
            this.b.D.error(11, "JSON handle failed", th, new Object[0]);
            this.b.b().a(th, "sendToRangersEventVerify header");
        }
        HashMap<String, String> mapA = a();
        mapA.put(HttpHeaders.COOKIE, str);
        try {
            String str2 = new String(this.b.getNetClient().execute((byte) 1, this.f133a + "/simulator/mobile/log", jSONObject2, mapA, (byte) 0, true, 10000));
            if (!new JSONObject(str2).getJSONObject("data").optBoolean("keep", false)) {
                this.b.setRangersEventVerifyEnable(false, str);
            }
            this.b.D.debug(11, "Send event to et with response:{}", str2);
            return true;
        } catch (Throwable th2) {
            this.b.D.error(11, "Post to event verify failed", th2, new Object[0]);
            this.b.b().a(th2, "sendToRangersEventVerify");
            return false;
        }
    }
}
