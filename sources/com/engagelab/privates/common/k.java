package com.engagelab.privates.common;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.https.HostVerifier;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.Utils;
import com.google.common.net.HttpHeaders;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes21.dex */
public class k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x00b2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x00b4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0004 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
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
                    if (j.a().getReportTestState()) {
                        httpURLConnection.setRequestProperty("mt-debug", "mt-default");
                    }
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
}
