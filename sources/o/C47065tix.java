package o;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.okrisk.collection.OKRiskDataFetcher;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47065tix {

    /* JADX INFO: renamed from: o.tix$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static class Activity {
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> AEQbTJ;
        public java.lang.String copydefault;

        public Activity(java.lang.String str, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            if (OKRiskDataFetcher.OLrzqt == null) {
                this.copydefault = str;
                this.AEQbTJ = map;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", jSONObject);
                jSONObject2.toString();
                this.copydefault = jSONObject2.toString();
                this.AEQbTJ = map;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Activity copydefault(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str2) throws java.lang.Throwable {
        java.util.HashMap map3 = new java.util.HashMap();
        if (OKRiskDataFetcher.OLrzqt != null) {
            try {
                return OKRiskDataFetcher.OLrzqt.AEQbTJ(new java.net.URL(str).getPath(), map, map2);
            } catch (MalformedURLException unused) {
                return null;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str3 : map.keySet()) {
            java.lang.String strEncode = map.get(str3);
            if (!android.text.TextUtils.isEmpty(str3) && !android.text.TextUtils.isEmpty(strEncode)) {
                try {
                    strEncode = URLEncoder.encode(strEncode, "Utf-8");
                } catch (java.io.UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                sb.append(str3);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(strEncode);
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
        }
        java.util.HashMap map4 = new java.util.HashMap();
        map4.put("X-Requestid", str2);
        byte[] bArrOLrzqt = OLrzqt(str, sb.toString().getBytes(), map4, "POST", map3);
        if (bArrOLrzqt == null || bArrOLrzqt.length == 0) {
            return null;
        }
        return new Activity(new java.lang.String(bArrOLrzqt), map3);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x00b2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static byte[] OLrzqt(java.lang.String str, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2) throws java.lang.Throwable {
        java.lang.Throwable th;
        ?? r6;
        java.lang.Exception e;
        HttpURLConnection httpURLConnection;
        java.io.InputStream inputStream;
        java.net.URL url;
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                url = new java.net.URL(str);
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } catch (java.lang.Exception e2) {
                e = e2;
                httpURLConnection = null;
                inputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                r6 = 0;
            }
            try {
                httpURLConnection.setRequestMethod(str2);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                if (map != null && map.size() > 0) {
                    for (java.lang.String str3 : map.keySet()) {
                        httpURLConnection.setRequestProperty(str3, map.get(str3));
                    }
                }
                if (str2.equalsIgnoreCase("post")) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestProperty("Content-Length", java.lang.String.valueOf(bArr.length));
                }
                httpURLConnection.setRequestProperty("Host", url.getHost());
                httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "*/*");
                if (bArr != null) {
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                    if (headerFields != null && headerFields.size() > 0) {
                        map2.putAll(headerFields);
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArrEZpvd = EZpvd(inputStream);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        httpURLConnection.disconnect();
                        return bArrEZpvd;
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Exception unused2) {
                                return null;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (java.lang.Exception unused3) {
                }
                return null;
            } catch (java.lang.Exception e4) {
                e = e4;
                inputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                r6 = httpURLConnection;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (java.lang.Exception unused4) {
                        throw th;
                    }
                }
                if (r6 != 0) {
                    r6.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            r0 = bArr;
            r6 = str;
        }
    }

    public static byte[] EZpvd(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
