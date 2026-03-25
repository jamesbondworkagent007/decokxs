package com.bytedance.bdtracker;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.network.INetworkClient;
import com.bytedance.applog.network.INetworkClientV2;
import com.bytedance.applog.network.RangersHttpException;
import com.bytedance.applog.network.RangersHttpTimeoutException;
import com.google.android.exoplayer2.C;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q3 implements INetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f247a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public q3(a4 a4Var) {
        this.f247a = a4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b3 A[Catch: all -> 0x02c5, TryCatch #13 {all -> 0x02c5, blocks: (B:119:0x028d, B:124:0x02b3, B:126:0x02b9, B:132:0x02cb, B:134:0x02ce, B:127:0x02c0), top: B:283:0x028d }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0533 A[Catch: all -> 0x0561, TRY_LEAVE, TryCatch #0 {all -> 0x0561, blocks: (B:245:0x0517, B:247:0x0533, B:251:0x0556, B:252:0x055d, B:253:0x055e, B:254:0x0560), top: B:258:0x0517 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x055e A[Catch: all -> 0x0561, TryCatch #0 {all -> 0x0561, blocks: (B:245:0x0517, B:247:0x0533, B:251:0x0556, B:252:0x055d, B:253:0x055e, B:254:0x0560), top: B:258:0x0517 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df A[Catch: all -> 0x01e6, TryCatch #3 {all -> 0x01e6, blocks: (B:77:0x01c6, B:87:0x01df, B:92:0x01ed, B:104:0x0229, B:106:0x0235), top: B:263:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #3 {all -> 0x01e6, blocks: (B:77:0x01c6, B:87:0x01df, B:92:0x01ed, B:104:0x0229, B:106:0x0235), top: B:263:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f7  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.applog.network.INetworkClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] execute(byte b, String str, JSONObject jSONObject, Map<String, String> map, byte b2, boolean z, int i) throws RangersHttpException, UnsupportedEncodingException {
        byte[] bArr;
        String str2;
        String str3;
        String str4;
        int i2;
        HttpURLConnection httpURLConnection;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection2;
        URL url;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        byte[] bArr2;
        String str5;
        HttpURLConnection httpURLConnection5;
        byte[] bArrB;
        DataOutputStream dataOutputStream2;
        HttpURLConnection httpURLConnection6;
        int responseCode;
        long jCurrentTimeMillis;
        BufferedReader bufferedReader;
        StringBuilder sb;
        BufferedReader bufferedReader2;
        byte[] bytes;
        List<String> list;
        HttpURLConnection httpURLConnection7;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] byteArray;
        byte[] bArr3;
        int i3;
        int i4;
        String str6;
        byte[] bArrB2;
        a4 a4Var = this.f247a;
        InitConfig initConfig = a4Var.b.getInitConfig();
        BufferedReader bufferedReader3 = null;
        byte[] bArrExecute = null;
        bufferedReader3 = null;
        if (initConfig == null || initConfig.getNetworkClientV2() == null) {
            a4Var.b.D.debug(11, "Start request http url: {}", str);
            if (a4Var.b.c() && map != null) {
                try {
                    Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, String> next = it.next();
                        if (!TextUtils.isEmpty(next.getKey()) && !TextUtils.isEmpty(next.getValue())) {
                            IAppLogLogger iAppLogLogger = a4Var.b.D;
                            StringBuilder sb2 = new StringBuilder();
                            Iterator<Map.Entry<String, String>> it2 = it;
                            sb2.append("http headers key:");
                            sb2.append(next.getKey());
                            sb2.append(" value:");
                            sb2.append(next.getValue());
                            iAppLogLogger.debug(11, sb2.toString(), new Object[0]);
                            it = it2;
                        }
                    }
                } catch (Throwable th) {
                    a4Var.b.b().a(th, "httpRequestInner header");
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String string = UUID.randomUUID().toString();
            byte[] bArr4 = new byte[0];
            try {
                url = new URL(str);
                httpURLConnection3 = (HttpURLConnection) url.openConnection();
                try {
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection4 = httpURLConnection3;
                    bArr = bArr4;
                    str2 = "Send request failed";
                    str3 = "Request timeout";
                    str4 = "httpRequestInner";
                }
            } catch (Throwable th3) {
                th = th3;
                bArr = bArr4;
                str2 = "Send request failed";
                str3 = "Request timeout";
                str4 = "httpRequestInner";
                i2 = 0;
                httpURLConnection = null;
            }
            if (!(httpURLConnection3 instanceof HttpsURLConnection) || initConfig == null) {
                bArr2 = bArr4;
                str5 = "Send request failed";
                if (i > 0) {
                    httpURLConnection3.setConnectTimeout(i);
                    httpURLConnection3.setReadTimeout(i);
                }
                if (b != 0) {
                    httpURLConnection3.setDoOutput(false);
                    httpURLConnection3.setRequestMethod("GET");
                } else if (b == 1) {
                    try {
                        httpURLConnection3.setDoOutput(true);
                        httpURLConnection3.setRequestMethod("POST");
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection4 = httpURLConnection3;
                        str3 = "Request timeout";
                        str4 = "httpRequestInner";
                        bArr = bArr2;
                        str2 = str5;
                        i2 = 0;
                        httpURLConnection = httpURLConnection4;
                        dataOutputStream = null;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = null;
                        byteArrayOutputStream = null;
                        a4Var.b.D.error(11, str2, th, new Object[i2]);
                        a4Var.b.b().a(th, str4);
                        if (!(th instanceof RangersHttpException)) {
                        }
                    }
                } else {
                    httpURLConnection4 = httpURLConnection3;
                    str3 = "Request timeout";
                    str4 = "httpRequestInner";
                    bArr = bArr2;
                    str2 = str5;
                    i2 = 0;
                    try {
                        a4Var.b.D.warn(11, "Unknown method", new Object[0]);
                        r.a((Closeable) null);
                        r.a((Closeable) null);
                        r.a((Closeable) null);
                        r.a((Closeable) null);
                        return null;
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection = httpURLConnection4;
                        dataOutputStream = null;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = null;
                        byteArrayOutputStream = null;
                        a4Var.b.D.error(11, str2, th, new Object[i2]);
                        a4Var.b.b().a(th, str4);
                        if (!(th instanceof RangersHttpException)) {
                        }
                    }
                }
                if (map != null) {
                    try {
                        if (!map.isEmpty()) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                if (!TextUtils.isEmpty(entry.getKey())) {
                                    if (!TextUtils.isEmpty(entry.getValue())) {
                                        httpURLConnection3.addRequestProperty(entry.getKey(), entry.getValue());
                                    }
                                }
                                a4Var.b.D.error(11, "Header key is empty", new Object[0]);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection4 = httpURLConnection3;
                        str3 = "Request timeout";
                        str4 = "httpRequestInner";
                        bArr = bArr2;
                        str2 = str5;
                        i2 = 0;
                        httpURLConnection = httpURLConnection4;
                        dataOutputStream = null;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = null;
                        byteArrayOutputStream = null;
                        a4Var.b.D.error(11, str2, th, new Object[i2]);
                        a4Var.b.b().a(th, str4);
                        if (!(th instanceof RangersHttpException)) {
                        }
                    }
                }
                httpURLConnection3.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                if (LogUtils.isDisabled()) {
                    try {
                        bArr = bArr2;
                        i2 = 0;
                        httpURLConnection5 = httpURLConnection3;
                        str2 = str5;
                        str3 = "Request timeout";
                        str4 = "httpRequestInner";
                    } catch (Throwable th7) {
                        th = th7;
                        str3 = "Request timeout";
                        str4 = "httpRequestInner";
                        bArr = bArr2;
                        str2 = str5;
                        i2 = 0;
                        httpURLConnection4 = httpURLConnection3;
                        httpURLConnection = httpURLConnection4;
                        dataOutputStream = null;
                    }
                    try {
                        LogUtils.sendJsonFetcher("do_request_begin", new b4(a4Var, httpURLConnection3, string, str, jSONObject, b, jCurrentTimeMillis2));
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection5;
                        dataOutputStream = null;
                    }
                } else {
                    httpURLConnection5 = httpURLConnection3;
                    str3 = "Request timeout";
                    str4 = "httpRequestInner";
                    bArr = bArr2;
                    str2 = str5;
                    i2 = 0;
                }
                if (jSONObject == null) {
                    String string2 = jSONObject.toString();
                    bArrB = z ? a4Var.c.b(string2) : string2.getBytes(C.UTF8_NAME);
                } else {
                    bArrB = null;
                }
                if (bArrB != null || bArrB.length <= 0) {
                    dataOutputStream = null;
                } else {
                    dataOutputStream2 = new DataOutputStream(httpURLConnection5.getOutputStream());
                    try {
                        dataOutputStream2.write(bArrB);
                        dataOutputStream2.flush();
                        dataOutputStream = dataOutputStream2;
                    } catch (Throwable th9) {
                        th = th9;
                        httpURLConnection6 = httpURLConnection5;
                        dataOutputStream = dataOutputStream2;
                        httpURLConnection = httpURLConnection6;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = null;
                        byteArrayOutputStream = null;
                        a4Var.b.D.error(11, str2, th, new Object[i2]);
                        a4Var.b.b().a(th, str4);
                        if (!(th instanceof RangersHttpException)) {
                        }
                    }
                }
                try {
                    responseCode = httpURLConnection5.getResponseCode();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    IAppLogLogger iAppLogLogger2 = a4Var.b.D;
                    Object[] objArr = new Object[2];
                    objArr[i2] = Integer.valueOf(responseCode);
                    objArr[1] = httpURLConnection5.getResponseMessage();
                    iAppLogLogger2.debug(11, "http response:{} message:{}", objArr);
                    p2.a(a4Var.b.getMonitor(), url, jElapsedRealtime, responseCode, httpURLConnection5.getResponseMessage());
                } catch (Throwable th10) {
                    th = th10;
                    httpURLConnection6 = httpURLConnection5;
                }
                if (responseCode != 200) {
                    if (b2 == 0) {
                        try {
                            InputStream inputStream2 = httpURLConnection5.getInputStream();
                            if ("gzip".equalsIgnoreCase(httpURLConnection5.getContentEncoding())) {
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(inputStream2)));
                                } catch (Throwable th11) {
                                    th = th11;
                                    dataOutputStream2 = dataOutputStream;
                                    httpURLConnection6 = httpURLConnection5;
                                    dataOutputStream = dataOutputStream2;
                                    httpURLConnection = httpURLConnection6;
                                    httpURLConnection2 = httpURLConnection;
                                    inputStream = null;
                                    byteArrayOutputStream = null;
                                }
                            } else {
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                            }
                            try {
                                sb = new StringBuilder(inputStream2.available());
                            } catch (Throwable th12) {
                                th = th12;
                                httpURLConnection2 = httpURLConnection5;
                            }
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                                sb.append("\n");
                                inputStream = null;
                                byteArrayOutputStream = null;
                                bufferedReader3 = bufferedReader;
                            }
                            IAppLogLogger iAppLogLogger3 = a4Var.b.D;
                            Object[] objArr2 = new Object[1];
                            objArr2[i2] = sb.toString();
                            iAppLogLogger3.debug(11, "http responseBody: {}", objArr2);
                            JSONObject jSONObject2 = new JSONObject(sb.toString());
                            Map<String, List<String>> headerFields = httpURLConnection5.getHeaderFields();
                            StringBuilder sb3 = new StringBuilder();
                            if (headerFields != null && headerFields.containsKey(HttpHeaders.SET_COOKIE) && (list = headerFields.get(HttpHeaders.SET_COOKIE)) != null) {
                                Iterator<String> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    sb3.append(it3.next());
                                    sb3.append(";");
                                }
                            }
                            jSONObject2.put(HttpHeaders.SET_COOKIE, sb3.toString());
                            httpURLConnection2 = httpURLConnection5;
                            try {
                                String strOptString = a4Var.a(httpURLConnection2).optString("x-tt-logid");
                                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(str) && str.contains(UriConfig.PATH_REGISTER) && !x1.e(jSONObject2)) {
                                    try {
                                        jSONObject2.put("x-tt-logid", strOptString);
                                    } catch (JSONException e) {
                                        a4Var.b.D.error("parseResponseLogId failed", e, new Object[i2]);
                                        a4Var.b.b().a(e, "parseResponseLogId");
                                    }
                                }
                                bufferedReader2 = bufferedReader;
                                inputStream = null;
                                byteArrayOutputStream = null;
                                bytes = jSONObject2.toString().getBytes(C.UTF8_NAME);
                                HttpURLConnection httpURLConnection8 = httpURLConnection2;
                                try {
                                    a4Var.a(string, responseCode, bytes, null, jCurrentTimeMillis, httpURLConnection2);
                                    r.a((Closeable) dataOutputStream);
                                    r.a((Closeable) bufferedReader2);
                                    r.a((Closeable) inputStream);
                                    r.a((Closeable) byteArrayOutputStream);
                                    return bytes;
                                } catch (Throwable th13) {
                                    th = th13;
                                    bArr = bytes;
                                    httpURLConnection2 = httpURLConnection8;
                                    bufferedReader3 = bufferedReader2;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                inputStream = null;
                                byteArrayOutputStream = null;
                                bufferedReader3 = bufferedReader;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            httpURLConnection2 = httpURLConnection5;
                            httpURLConnection6 = httpURLConnection2;
                            httpURLConnection = httpURLConnection6;
                            httpURLConnection2 = httpURLConnection;
                            inputStream = null;
                            byteArrayOutputStream = null;
                        }
                    } else {
                        httpURLConnection2 = httpURLConnection5;
                        try {
                            InputStream inputStream3 = httpURLConnection2.getInputStream();
                            InputStream gZIPInputStream = "gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding()) ? new GZIPInputStream(inputStream3) : inputStream3;
                            try {
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    bArr3 = new byte[1024];
                                } catch (Throwable th16) {
                                    th = th16;
                                    httpURLConnection7 = httpURLConnection2;
                                    byteArray = bArr;
                                }
                            } catch (Throwable th17) {
                                th = th17;
                                httpURLConnection7 = httpURLConnection2;
                                inputStream = gZIPInputStream;
                                byteArrayOutputStream = null;
                            }
                            while (true) {
                                int i5 = gZIPInputStream.read(bArr3);
                                if (i5 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr3, i2, i5);
                                inputStream = gZIPInputStream;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                bArr = byteArray;
                                httpURLConnection2 = httpURLConnection7;
                            }
                            byteArray = byteArrayOutputStream2.toByteArray();
                            try {
                                IAppLogLogger iAppLogLogger4 = a4Var.b.D;
                                Object[] objArr3 = new Object[1];
                                objArr3[i2] = Integer.valueOf(byteArray.length);
                                iAppLogLogger4.debug(11, "http responseBody byte length: {}", objArr3);
                                inputStream = gZIPInputStream;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                bufferedReader2 = null;
                                bytes = byteArray;
                                HttpURLConnection httpURLConnection82 = httpURLConnection2;
                                a4Var.a(string, responseCode, bytes, null, jCurrentTimeMillis, httpURLConnection2);
                                r.a((Closeable) dataOutputStream);
                                r.a((Closeable) bufferedReader2);
                                r.a((Closeable) inputStream);
                                r.a((Closeable) byteArrayOutputStream);
                                return bytes;
                            } catch (Throwable th18) {
                                th = th18;
                                httpURLConnection7 = httpURLConnection2;
                                inputStream = gZIPInputStream;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                bArr = byteArray;
                                httpURLConnection2 = httpURLConnection7;
                            }
                        } catch (Throwable th19) {
                            th = th19;
                            httpURLConnection6 = httpURLConnection2;
                            httpURLConnection = httpURLConnection6;
                            httpURLConnection2 = httpURLConnection;
                            inputStream = null;
                            byteArrayOutputStream = null;
                        }
                    }
                    httpURLConnection2 = httpURLConnection;
                    inputStream = null;
                    byteArrayOutputStream = null;
                } else {
                    httpURLConnection6 = httpURLConnection5;
                    try {
                        a4Var.a(string, responseCode, null, httpURLConnection6.getResponseMessage(), jCurrentTimeMillis, httpURLConnection6);
                        throw new RangersHttpException(responseCode, httpURLConnection6.getResponseMessage());
                    } catch (Throwable th20) {
                        th = th20;
                    }
                }
                httpURLConnection = httpURLConnection6;
                httpURLConnection2 = httpURLConnection;
                inputStream = null;
                byteArrayOutputStream = null;
            } else {
                try {
                    SSLSocketFactory sslSocketFactory = initConfig.getSslSocketFactory();
                    if (sslSocketFactory != null) {
                        ((HttpsURLConnection) httpURLConnection3).setSSLSocketFactory(sslSocketFactory);
                        try {
                            bArr2 = bArr4;
                            str5 = "Send request failed";
                        } catch (Throwable th21) {
                            th = th21;
                            bArr2 = bArr4;
                            str5 = "Send request failed";
                            httpURLConnection4 = httpURLConnection3;
                            str3 = "Request timeout";
                            str4 = "httpRequestInner";
                            bArr = bArr2;
                            str2 = str5;
                            i2 = 0;
                            httpURLConnection = httpURLConnection4;
                            dataOutputStream = null;
                            httpURLConnection2 = httpURLConnection;
                            inputStream = null;
                            byteArrayOutputStream = null;
                            a4Var.b.D.error(11, str2, th, new Object[i2]);
                            a4Var.b.b().a(th, str4);
                            if (!(th instanceof RangersHttpException)) {
                            }
                        }
                        try {
                            a4Var.b.D.debug(11, "use sslSocketFactory: {}", sslSocketFactory);
                        } catch (Throwable th22) {
                            th = th22;
                            httpURLConnection4 = httpURLConnection3;
                            str3 = "Request timeout";
                            str4 = "httpRequestInner";
                            bArr = bArr2;
                            str2 = str5;
                            i2 = 0;
                            httpURLConnection = httpURLConnection4;
                            dataOutputStream = null;
                            httpURLConnection2 = httpURLConnection;
                            inputStream = null;
                            byteArrayOutputStream = null;
                            a4Var.b.D.error(11, str2, th, new Object[i2]);
                            a4Var.b.b().a(th, str4);
                            if (!(th instanceof RangersHttpException)) {
                            }
                        }
                    }
                    if (i > 0) {
                    }
                    if (b != 0) {
                    }
                    if (map != null) {
                    }
                    httpURLConnection3.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                    if (LogUtils.isDisabled()) {
                    }
                    if (jSONObject == null) {
                    }
                } catch (Throwable th23) {
                    th = th23;
                    bArr2 = bArr4;
                    str5 = "Send request failed";
                    httpURLConnection4 = httpURLConnection3;
                    str3 = "Request timeout";
                    str4 = "httpRequestInner";
                    bArr = bArr2;
                    str2 = str5;
                    i2 = 0;
                    httpURLConnection = httpURLConnection4;
                    dataOutputStream = null;
                    httpURLConnection2 = httpURLConnection;
                    inputStream = null;
                    byteArrayOutputStream = null;
                    a4Var.b.D.error(11, str2, th, new Object[i2]);
                    a4Var.b.b().a(th, str4);
                    if (!(th instanceof RangersHttpException)) {
                    }
                }
                if (bArrB != null) {
                    dataOutputStream = null;
                    responseCode = httpURLConnection5.getResponseCode();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    IAppLogLogger iAppLogLogger22 = a4Var.b.D;
                    Object[] objArr4 = new Object[2];
                    objArr4[i2] = Integer.valueOf(responseCode);
                    objArr4[1] = httpURLConnection5.getResponseMessage();
                    iAppLogLogger22.debug(11, "http response:{} message:{}", objArr4);
                    p2.a(a4Var.b.getMonitor(), url, jElapsedRealtime, responseCode, httpURLConnection5.getResponseMessage());
                    if (responseCode != 200) {
                    }
                    httpURLConnection = httpURLConnection6;
                    httpURLConnection2 = httpURLConnection;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            }
            try {
                a4Var.b.D.error(11, str2, th, new Object[i2]);
                a4Var.b.b().a(th, str4);
                if (!(th instanceof RangersHttpException)) {
                    throw th;
                }
                a4Var.a(string, -1, null, th.getMessage(), System.currentTimeMillis(), httpURLConnection2);
                if (th instanceof SocketTimeoutException) {
                    throw new RangersHttpTimeoutException(str3);
                }
                r.a((Closeable) dataOutputStream);
                r.a((Closeable) bufferedReader3);
                r.a((Closeable) inputStream);
                r.a((Closeable) byteArrayOutputStream);
                return bArr;
            } catch (Throwable th24) {
                r.a((Closeable) dataOutputStream);
                r.a((Closeable) bufferedReader3);
                r.a((Closeable) inputStream);
                r.a((Closeable) byteArrayOutputStream);
                throw th24;
            }
        }
        a4Var.b.D.debug(11, "httpRequestInner use custom network client v2", str);
        a4Var.b.D.debug(11, "Start request http use network client v2 url: {}", str);
        byte[] bArr5 = new byte[0];
        try {
            URL url2 = new URL(str);
            InitConfig initConfig2 = a4Var.b.getInitConfig();
            if (jSONObject != null) {
                String string3 = jSONObject.toString();
                bArrB2 = z ? a4Var.c.b(string3) : string3.getBytes(C.UTF8_NAME);
            } else {
                bArrB2 = null;
            }
            INetworkClientV2.RequestType requestType = INetworkClientV2.RequestType.REQUEST_FINDER;
            if (url2.getPath().contains(UriConfig.PATH_AB)) {
                requestType = INetworkClientV2.RequestType.REQUEST_AB;
            } else if (url2.getPath().contains(UriConfig.PATH_ALINK_ATTRIBUTION) || url2.getPath().contains(UriConfig.PATH_ALINK_QUERY)) {
                requestType = INetworkClientV2.RequestType.REQUEST_TRACER;
            }
            HashMap map2 = new HashMap();
            map2.put("request_type", requestType);
            if (initConfig2 != null) {
                i3 = 11;
                byte[] bArr6 = bArrB2;
                i4 = 0;
                str6 = "Send request failed";
                try {
                    bArrExecute = initConfig2.getNetworkClientV2().execute(b == 0 ? INetworkClientV2.RequestMethod.METHOD_GET : INetworkClientV2.RequestMethod.METHOD_POST, url2, bArr6, map, map2);
                } catch (Throwable th25) {
                    th = th25;
                    bArrExecute = bArr5;
                    a4Var.b.D.error(i3, str6, th, new Object[i4]);
                    a4Var.b.b().a(th, "httpRequestInner");
                    if (!(th instanceof RangersHttpException)) {
                        throw th;
                    }
                    if (th instanceof SocketTimeoutException) {
                        throw new RangersHttpTimeoutException("Request timeout");
                    }
                    return bArrExecute;
                }
            } else {
                i3 = 11;
                i4 = 0;
                str6 = "Send request failed";
            }
        } catch (Throwable th26) {
            th = th26;
            i3 = 11;
            i4 = 0;
            str6 = "Send request failed";
        }
        try {
            a4Var.b.D.debug(i3, "End request http use network client v2 url: {}", str);
            return bArrExecute;
        } catch (Throwable th27) {
            th = th27;
            a4Var.b.D.error(i3, str6, th, new Object[i4]);
            a4Var.b.b().a(th, "httpRequestInner");
            if (!(th instanceof RangersHttpException)) {
            }
        }
    }
}
