package o;

import android.os.Build;
import com.google.api.client.json.Json;
import com.google.common.net.HttpHeaders;
import com.onesignal.OSThrowable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57837ypu {

    /* JADX INFO: renamed from: o.ypu$TaskDescription */
    public static abstract class TaskDescription {
        public void OLrzqt(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public void OLrzqt(java.lang.String str) {
        }
    }

    public static int EZpvd(int i) {
        return i + 5000;
    }

    public static void OLrzqt(final java.lang.String str, final JSONObject jSONObject, final TaskDescription taskDescription) {
        OSUtils.KWHzl(new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypu.4
            @Override // java.lang.Runnable
            public void run() {
                C57837ypu.EZpvd(str, "PUT", jSONObject, taskDescription, 120000, null);
            }
        }, "OS_REST_ASYNC_PUT"));
    }

    public static void KWHzl(final java.lang.String str, final JSONObject jSONObject, final TaskDescription taskDescription) {
        OSUtils.KWHzl(new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypu.5
            @Override // java.lang.Runnable
            public void run() {
                C57837ypu.EZpvd(str, "POST", jSONObject, taskDescription, 120000, null);
            }
        }, "OS_REST_ASYNC_POST"));
    }

    public static void AEQbTJ(final java.lang.String str, final TaskDescription taskDescription, @androidx.annotation.NonNull final java.lang.String str2) {
        OSUtils.KWHzl(new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypu.3
            @Override // java.lang.Runnable
            public void run() {
                C57837ypu.EZpvd(str, null, null, taskDescription, 60000, str2);
            }
        }, "OS_REST_ASYNC_GET"));
    }

    public static void copydefault(java.lang.String str, TaskDescription taskDescription, @androidx.annotation.NonNull java.lang.String str2) {
        EZpvd(str, null, null, taskDescription, 60000, str2);
    }

    public static void AEQbTJ(java.lang.String str, JSONObject jSONObject, TaskDescription taskDescription) {
        EZpvd(str, "PUT", jSONObject, taskDescription, 120000, null);
    }

    public static void copydefault(java.lang.String str, JSONObject jSONObject, TaskDescription taskDescription) {
        EZpvd(str, "POST", jSONObject, taskDescription, 120000, null);
    }

    public static void EZpvd(final java.lang.String str, final java.lang.String str2, final JSONObject jSONObject, final TaskDescription taskDescription, final int i, final java.lang.String str3) {
        if (OSUtils.fIwbmz()) {
            throw new OSThrowable.OSMainThreadException("Method: " + str2 + " was called from the Main Thread!");
        }
        if (str2 == null || !OneSignal.DbNXlk((java.lang.String) null)) {
            final java.lang.Thread[] threadArr = new java.lang.Thread[1];
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypu.2
                @Override // java.lang.Runnable
                public void run() {
                    threadArr[0] = C57837ypu.OLrzqt(str, str2, jSONObject, taskDescription, i, str3);
                }
            }, "OS_HTTPConnection");
            OSUtils.KWHzl(thread);
            try {
                thread.join(EZpvd(i));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                java.lang.Thread thread2 = threadArr[0];
                if (thread2 != null) {
                    thread2.join();
                }
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static java.lang.Thread OLrzqt(java.lang.String str, java.lang.String str2, JSONObject jSONObject, TaskDescription taskDescription, int i, @androidx.annotation.Nullable java.lang.String str3) {
        HttpURLConnection httpURLConnectionKWHzl;
        java.lang.Thread threadEZpvd;
        OneSignal.LOG_LEVEL log_level;
        java.lang.String next;
        java.lang.String headerField;
        if (Build.VERSION.SDK_INT >= 26) {
            android.net.TrafficStats.setThreadStatsTag(10000);
        }
        try {
            log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.KWHzl(log_level, "OneSignalRestClient: Making request to: https://api.onesignal.com/" + str);
            httpURLConnectionKWHzl = KWHzl(str);
        } catch (java.lang.Throwable th) {
            th = th;
            httpURLConnectionKWHzl = null;
        }
        try {
            httpURLConnectionKWHzl.setUseCaches(false);
            httpURLConnectionKWHzl.setConnectTimeout(i);
            httpURLConnectionKWHzl.setReadTimeout(i);
            httpURLConnectionKWHzl.setRequestProperty("SDK-Version", "onesignal/android/" + OneSignal.QUSxYX());
            httpURLConnectionKWHzl.setRequestProperty(HttpHeaders.ACCEPT, "application/vnd.onesignal.v1+json");
            if (jSONObject != null) {
                httpURLConnectionKWHzl.setDoInput(true);
            }
            if (str2 != null) {
                httpURLConnectionKWHzl.setRequestProperty("Content-Type", Json.MEDIA_TYPE);
                httpURLConnectionKWHzl.setRequestMethod(str2);
                httpURLConnectionKWHzl.setDoOutput(true);
            }
            if (jSONObject != null) {
                java.lang.String strAEQbTJ = C57685ynA.AEQbTJ(jSONObject);
                OneSignal.KWHzl(log_level, "OneSignalRestClient: " + str2 + " SEND JSON: " + strAEQbTJ);
                byte[] bytes = strAEQbTJ.getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
                httpURLConnectionKWHzl.setFixedLengthStreamingMode(bytes.length);
                httpURLConnectionKWHzl.getOutputStream().write(bytes);
            }
            if (str3 != null) {
                java.lang.String strAEQbTJ2 = C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_ETAG_PREFIX_" + str3, (java.lang.String) null);
                if (strAEQbTJ2 != null) {
                    httpURLConnectionKWHzl.setRequestProperty("if-none-match", strAEQbTJ2);
                    OneSignal.KWHzl(log_level, "OneSignalRestClient: Adding header if-none-match: " + strAEQbTJ2);
                }
            }
            int responseCode = httpURLConnectionKWHzl.getResponseCode();
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/" + str);
            if (responseCode == 200 || responseCode == 202) {
                OneSignal.KWHzl(log_level, "OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/" + str);
                Scanner scanner = new Scanner(httpURLConnectionKWHzl.getInputStream(), com.google.android.exoplayer2.C.UTF8_NAME);
                next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("OneSignalRestClient: ");
                sb.append(str2 == null ? "GET" : str2);
                sb.append(" RECEIVED JSON: ");
                sb.append(next);
                OneSignal.KWHzl(log_level, sb.toString());
                if (str3 != null && (headerField = httpURLConnectionKWHzl.getHeaderField("etag")) != null) {
                    OneSignal.KWHzl(log_level, "OneSignalRestClient: Response has etag of " + headerField + " so caching the response.");
                    java.lang.String str4 = C57834ypr.copydefault;
                    C57834ypr.copydefault(str4, "PREFS_OS_ETAG_PREFIX_" + str3, headerField);
                    C57834ypr.copydefault(str4, "PREFS_OS_HTTP_CACHE_PREFIX_" + str3, next);
                }
                threadEZpvd = copydefault(taskDescription, next);
            } else if (responseCode == 304) {
                java.lang.String strAEQbTJ3 = C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_HTTP_CACHE_PREFIX_" + str3, (java.lang.String) null);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("OneSignalRestClient: ");
                sb2.append(str2 == null ? "GET" : str2);
                sb2.append(" - Using Cached response due to 304: ");
                sb2.append(strAEQbTJ3);
                OneSignal.KWHzl(log_level, sb2.toString());
                threadEZpvd = copydefault(taskDescription, strAEQbTJ3);
            } else {
                OneSignal.KWHzl(log_level, "OneSignalRestClient: Failed request to: https://api.onesignal.com/" + str);
                java.io.InputStream errorStream = httpURLConnectionKWHzl.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnectionKWHzl.getInputStream();
                }
                if (errorStream != null) {
                    Scanner scanner2 = new Scanner(errorStream, com.google.android.exoplayer2.C.UTF8_NAME);
                    next = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                    scanner2.close();
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "OneSignalRestClient: " + str2 + " RECEIVED JSON: " + next);
                } else {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "OneSignalRestClient: " + str2 + " HTTP Code: " + responseCode + " No response body!");
                    next = null;
                }
                threadEZpvd = EZpvd(taskDescription, responseCode, next, null);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "OneSignalRestClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName());
                } else {
                    OneSignal.OLrzqt(OneSignal.LOG_LEVEL.WARN, "OneSignalRestClient: " + str2 + " Error thrown from network stack. ", th);
                }
                threadEZpvd = EZpvd(taskDescription, -1, null, th);
                return threadEZpvd;
            } finally {
                if (httpURLConnectionKWHzl != null) {
                    httpURLConnectionKWHzl.disconnect();
                }
            }
        }
        return threadEZpvd;
    }

    public static java.lang.Thread copydefault(final TaskDescription taskDescription, final java.lang.String str) {
        if (taskDescription == null) {
            return null;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypu.1
            @Override // java.lang.Runnable
            public void run() {
                taskDescription.OLrzqt(str);
            }
        }, "OS_REST_SUCCESS_CALLBACK");
        OSUtils.KWHzl(thread);
        return thread;
    }

    public static java.lang.Thread EZpvd(final TaskDescription taskDescription, final int i, final java.lang.String str, final java.lang.Throwable th) {
        if (taskDescription == null) {
            return null;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypu.9
            @Override // java.lang.Runnable
            public void run() {
                taskDescription.OLrzqt(i, str, th);
            }
        }, "OS_REST_FAILURE_CALLBACK");
        OSUtils.KWHzl(thread);
        return thread;
    }

    public static HttpURLConnection KWHzl(java.lang.String str) throws java.io.IOException {
        return (HttpURLConnection) new java.net.URL("https://api.onesignal.com/" + str).openConnection();
    }
}
