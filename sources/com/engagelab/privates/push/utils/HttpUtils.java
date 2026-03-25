package com.engagelab.privates.push.utils;

import android.content.Context;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.https.HostVerifier;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.SystemUtil;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes17.dex */
public class HttpUtils {
    private static final String TAG = "HttpClient";

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, IF, IF, INVOKE, GOTO, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, GOTO, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x0009 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x00a7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0095 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0097 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x009a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x009d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x00a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x00f2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4 A[Catch: all -> 0x00f0, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {all -> 0x00f0, blocks: (B:44:0x00ec, B:48:0x00f4), top: B:93:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #8 {all -> 0x0133, blocks: (B:56:0x012f, B:60:0x0137), top: B:95:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #9 {all -> 0x0174, blocks: (B:68:0x0170, B:72:0x0178), top: B:97:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] get(Context context, String str) {
        Throwable th;
        IOException e;
        MalformedURLException e2;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? IsNetworkConnecting = SystemUtil.isNetworkConnecting(context);
        try {
            if (IsNetworkConnecting == 0) {
                MTCommonLog.d(TAG, "can't get, network is disConnected");
                return null;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(6000);
                httpURLConnection.setReadTimeout(6000);
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                httpURLConnection.addRequestProperty(HttpHeaders.CONNECTION, "Close");
                httpURLConnection.setRequestProperty("Charset", MTCommonConstants.UTF_8);
                if (httpURLConnection instanceof HttpsURLConnection) {
                    SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.TLS);
                    sSLContext.init(null, null, null);
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostVerifier(httpURLConnection.getURL().getHost()));
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    IsNetworkConnecting = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (MalformedURLException e3) {
                        e2 = e3;
                        byteArrayOutputStream = null;
                        MTCommonLog.w(TAG, "get malformedURLException:" + e2.getMessage());
                        if (byteArrayOutputStream != null) {
                        }
                        if (IsNetworkConnecting != 0) {
                        }
                        if (byteArrayOutputStream == null) {
                        }
                    } catch (IOException e4) {
                        e = e4;
                        byteArrayOutputStream = null;
                        MTCommonLog.w(TAG, "get ioException:" + e.getMessage());
                        if (byteArrayOutputStream != null) {
                        }
                        if (IsNetworkConnecting != 0) {
                        }
                        if (byteArrayOutputStream == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = null;
                        MTCommonLog.w(TAG, "get failed " + th.getMessage());
                        if (byteArrayOutputStream == null) {
                        }
                    }
                    try {
                        byte[] bArr = new byte[contentLength];
                        while (true) {
                            int i = IsNetworkConnecting.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (MalformedURLException e5) {
                        e2 = e5;
                        MTCommonLog.w(TAG, "get malformedURLException:" + e2.getMessage());
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                IsNetworkConnecting = "close failed " + th3.getMessage();
                                MTCommonLog.w(TAG, IsNetworkConnecting);
                                if (byteArrayOutputStream == null) {
                                }
                            }
                        }
                        if (IsNetworkConnecting != 0) {
                            IsNetworkConnecting.close();
                        }
                    } catch (IOException e6) {
                        e = e6;
                        MTCommonLog.w(TAG, "get ioException:" + e.getMessage());
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th4) {
                                IsNetworkConnecting = "close failed " + th4.getMessage();
                                MTCommonLog.w(TAG, IsNetworkConnecting);
                                if (byteArrayOutputStream == null) {
                                }
                            }
                        }
                        if (IsNetworkConnecting != 0) {
                            IsNetworkConnecting.close();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        MTCommonLog.w(TAG, "get failed " + th.getMessage());
                        if (byteArrayOutputStream != null) {
                            try {
                            } catch (Throwable th6) {
                                if (byteArrayOutputStream == null) {
                                }
                            }
                        }
                    }
                } else {
                    IsNetworkConnecting = 0;
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th7) {
                        MTCommonLog.w(TAG, "close failed " + th7.getMessage());
                    }
                }
                if (IsNetworkConnecting != 0) {
                    IsNetworkConnecting.close();
                }
            } catch (MalformedURLException e7) {
                e2 = e7;
                IsNetworkConnecting = 0;
            } catch (IOException e8) {
                e = e8;
                IsNetworkConnecting = 0;
            } catch (Throwable th8) {
                th = th8;
                IsNetworkConnecting = 0;
            }
            if (byteArrayOutputStream == null) {
                return null;
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th62) {
                    MTCommonLog.w(TAG, "close failed " + th62.getMessage());
                }
            }
            if (IsNetworkConnecting != 0) {
                IsNetworkConnecting.close();
            }
        }
    }
}
