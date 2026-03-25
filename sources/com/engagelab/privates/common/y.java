package com.engagelab.privates.common;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.https.HostVerifier;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.common.utils.Utils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes17.dex */
public class y {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x00b2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x00b4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x0004 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static int a(Context context, String str, String str2, byte[] bArr) {
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        SocketTimeoutException e;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream2;
        int i = -1;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setConnectTimeout(6000);
                    httpURLConnection.setReadTimeout(6000);
                    httpURLConnection.setRequestProperty("Authorization", str2);
                    httpURLConnection.setRequestProperty("Charset", MTCommonConstants.UTF_8);
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/jason");
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                    httpURLConnection.setRequestProperty("content-type", OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE);
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
                    httpURLConnection.setRequestProperty("X-App-Key", MTGlobal.getAppKey(context));
                    httpURLConnection.setRequestProperty("Encrypt-Type", MTGlobal.getEncryptType() == 2 ? "SM4" : "");
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.TLS);
                        sSLContext.init(null, null, null);
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostVerifier(httpURLConnection.getURL().getHost()));
                    }
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setUseCaches(false);
                    outputStream = httpURLConnection.getOutputStream();
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (SocketTimeoutException e3) {
                e = e3;
                outputStream = null;
                httpURLConnection = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                httpURLConnection = null;
            }
            try {
                outputStream.write(bArr);
                outputStream.flush();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                Utils.closeQuietly(outputStream);
                Utils.closeQuietly(null);
                Utils.closeQuietly(null);
                i = responseCode;
                outputStream2 = outputStream;
                httpURLConnection2 = httpURLConnection;
            } catch (SocketTimeoutException e4) {
                e = e4;
                MTCommonLog.w("HttpClient", "post socketTimeoutException:" + e.getMessage());
                Utils.closeQuietly(outputStream);
                Utils.closeQuietly(null);
                Utils.closeQuietly(null);
                outputStream2 = outputStream;
                httpURLConnection2 = httpURLConnection;
                context = outputStream;
                str = httpURLConnection;
                if (httpURLConnection != null) {
                }
                return i;
            } catch (Throwable th4) {
                th = th4;
                MTCommonLog.w("HttpClient", "post failed " + th.getMessage());
                return i;
            }
            return i;
        } finally {
            Utils.closeQuietly(context);
            Utils.closeQuietly(null);
            Utils.closeQuietly(null);
            if (str != 0) {
                str.disconnect();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x00d7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x00d9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x00db */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x00de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00e0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x00e2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x0025 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[Catch: all -> 0x00e5, IOException -> 0x0128, MalformedURLException -> 0x0169, TRY_LEAVE, TryCatch #14 {MalformedURLException -> 0x0169, IOException -> 0x0128, all -> 0x00e5, blocks: (B:7:0x0025, B:18:0x0087, B:20:0x009c), top: B:97:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[Catch: all -> 0x0107, DONT_GENERATE, TRY_LEAVE, TryCatch #4 {all -> 0x0107, blocks: (B:50:0x0103, B:54:0x010b), top: B:92:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #6 {all -> 0x014a, blocks: (B:62:0x0146, B:66:0x014e), top: B:94:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #9 {all -> 0x018b, blocks: (B:74:0x0187, B:78:0x018f), top: B:99:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(Context context, String str, String str2) {
        Throwable th;
        IOException e;
        MalformedURLException e2;
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.d("HttpClient", "can't get, network is disConnected");
            return null;
        }
        ?? inputStream = "requestUrl:" + str;
        MTCommonLog.d("HttpClient", inputStream);
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(6000);
                httpURLConnection.setReadTimeout(6000);
                httpURLConnection.setRequestProperty("Authorization", str2);
                httpURLConnection.setRequestProperty("Charset", MTCommonConstants.UTF_8);
                if (httpURLConnection instanceof HttpsURLConnection) {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.TLS);
                        sSLContext.init(null, null, null);
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostVerifier(httpURLConnection.getURL().getHost()));
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.connect();
                        httpURLConnection.getContentLength();
                        if (httpURLConnection.getResponseCode() == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                str2 = new ByteArrayOutputStream();
                            } catch (MalformedURLException e3) {
                                e2 = e3;
                                str2 = 0;
                                MTCommonLog.w("HttpClient", "get malformedURLException:" + e2.getMessage());
                                if (str2 != 0) {
                                }
                                if (inputStream != 0) {
                                }
                                return null;
                            } catch (IOException e4) {
                                e = e4;
                                str2 = 0;
                                MTCommonLog.w("HttpClient", "get ioException:" + e.getMessage());
                                if (str2 != 0) {
                                }
                                if (inputStream != 0) {
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = 0;
                                MTCommonLog.w("HttpClient", "get failed " + th.getMessage());
                                return null;
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    str2.write(bArr, 0, i);
                                }
                                byte[] byteArray = str2.toByteArray();
                                try {
                                    str2.close();
                                    inputStream.close();
                                } catch (Throwable th3) {
                                    MTCommonLog.w("HttpClient", "close failed " + th3.getMessage());
                                }
                                return byteArray;
                            } catch (MalformedURLException e5) {
                                e2 = e5;
                                MTCommonLog.w("HttpClient", "get malformedURLException:" + e2.getMessage());
                                if (str2 != 0) {
                                }
                                if (inputStream != 0) {
                                }
                                return null;
                            } catch (IOException e6) {
                                e = e6;
                                MTCommonLog.w("HttpClient", "get ioException:" + e.getMessage());
                                if (str2 != 0) {
                                }
                                if (inputStream != 0) {
                                }
                                return null;
                            } catch (Throwable th4) {
                                th = th4;
                                MTCommonLog.w("HttpClient", "get failed " + th.getMessage());
                                return null;
                            }
                        }
                    } catch (MalformedURLException e7) {
                        e2 = e7;
                        inputStream = 0;
                        str2 = 0;
                        MTCommonLog.w("HttpClient", "get malformedURLException:" + e2.getMessage());
                        if (str2 != 0) {
                            try {
                                str2.close();
                            } catch (Throwable th5) {
                                inputStream = "close failed " + th5.getMessage();
                                MTCommonLog.w("HttpClient", inputStream);
                                return null;
                            }
                        }
                        if (inputStream != 0) {
                            inputStream.close();
                        }
                        return null;
                    } catch (IOException e8) {
                        e = e8;
                        inputStream = 0;
                        str2 = 0;
                        MTCommonLog.w("HttpClient", "get ioException:" + e.getMessage());
                        if (str2 != 0) {
                            try {
                                str2.close();
                            } catch (Throwable th6) {
                                inputStream = "close failed " + th6.getMessage();
                                MTCommonLog.w("HttpClient", inputStream);
                                return null;
                            }
                        }
                        if (inputStream != 0) {
                            inputStream.close();
                        }
                        return null;
                    } catch (Throwable th7) {
                        th = th7;
                        inputStream = 0;
                        str2 = 0;
                        MTCommonLog.w("HttpClient", "get failed " + th.getMessage());
                        if (str2 != 0) {
                            try {
                            } catch (Throwable th8) {
                                return null;
                            }
                        }
                        return null;
                    }
                } else {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    httpURLConnection.getContentLength();
                    if (httpURLConnection.getResponseCode() == 200) {
                    }
                }
            } catch (MalformedURLException e9) {
                e2 = e9;
                inputStream = 0;
            } catch (IOException e10) {
                e = e10;
                inputStream = 0;
            } catch (Throwable th9) {
                th = th9;
                inputStream = 0;
            }
            return null;
        } finally {
            if (str2 != 0) {
                try {
                    str2.close();
                } catch (Throwable th82) {
                    MTCommonLog.w("HttpClient", "close failed " + th82.getMessage());
                }
            }
            if (inputStream != 0) {
                inputStream.close();
            }
        }
    }
}
