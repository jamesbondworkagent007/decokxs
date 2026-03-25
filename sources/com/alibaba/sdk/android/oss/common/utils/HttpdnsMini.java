package com.alibaba.sdk.android.oss.common.utils;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.google.android.exoplayer2.C;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.just.agentweb.DefaultWebClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HttpdnsMini {
    private static final String ACCOUNT_ID = "181345";
    private static final int EMPTY_RESULT_HOST_TTL = 30;
    private static final int MAX_HOLD_HOST_NUM = 100;
    private static final int MAX_THREAD_NUM = 5;
    private static final int RESOLVE_TIMEOUT_IN_SEC = 10;
    private static final String SERVER_IP = "203.107.1.1";
    private static final String TAG = "HttpDnsMini";
    private static HttpdnsMini instance;
    private ConcurrentMap<String, HostObject> hostManager = new ConcurrentHashMap();
    private ExecutorService pool = Executors.newFixedThreadPool(5);
    public boolean isHttp2Test = false;

    private HttpdnsMini() {
    }

    public static HttpdnsMini getInstance() {
        if (instance == null) {
            synchronized (HttpdnsMini.class) {
                if (instance == null) {
                    instance = new HttpdnsMini();
                }
            }
        }
        return instance;
    }

    public String getIpByHostAsync(String str) {
        if (this.isHttp2Test) {
            return "118.178.62.19";
        }
        HostObject hostObject = this.hostManager.get(str);
        if (hostObject == null || hostObject.isExpired()) {
            OSSLog.logDebug("[httpdnsmini] - refresh host: " + str);
            this.pool.submit(new QueryHostTask(str));
        }
        if (hostObject == null || !hostObject.isStillAvailable()) {
            return null;
        }
        return hostObject.getIp();
    }

    public class HostObject {
        private String hostName;
        private String ip;
        private long queryTime;
        private long ttl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getHostName() {
            return this.hostName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getIp() {
            return this.ip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long getQueryTime() {
            return this.queryTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long getTtl() {
            return this.ttl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setHostName(String str) {
            this.hostName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setIp(String str) {
            this.ip = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setQueryTime(long j) {
            this.queryTime = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setTtl(long j) {
            this.ttl = j;
        }

        public HostObject() {
        }

        public String toString() {
            return "[hostName=" + getHostName() + ", ip=" + this.ip + ", ttl=" + getTtl() + ", queryTime=" + this.queryTime + "]";
        }

        public boolean isExpired() {
            return getQueryTime() + this.ttl < System.currentTimeMillis() / 1000;
        }

        public boolean isStillAvailable() {
            return (getQueryTime() + this.ttl) + 600 > System.currentTimeMillis() / 1000;
        }
    }

    public class QueryHostTask implements Callable<String> {
        private boolean hasRetryed = false;
        private String hostName;

        public QueryHostTask(String str) {
            this.hostName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [185=4] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x0134 */
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0147 A[EXC_TOP_SPLITTER, PHI: r0
  0x0147: PHI (r0v8 java.io.InputStream) = (r0v7 java.io.InputStream), (r0v17 java.io.InputStream) binds: [B:38:0x0145, B:27:0x012f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.InputStream] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String call() throws Throwable {
            Exception e;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            BufferedReader bufferedReader;
            StringBuilder sb;
            String str = DefaultWebClient.HTTP_SCHEME + HttpdnsMini.SERVER_IP + "/" + HttpdnsMini.ACCOUNT_ID + "/d?host=" + this.hostName;
            OSSLog.logDebug("[httpdnsmini] - buildUrl: " + str);
            ?? r1 = 0;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                } catch (Exception e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (r1 != 0) {
                    }
                    throw th;
                }
                if (httpURLConnection.getResponseCode() != 200) {
                    OSSLog.logError("[httpdnsmini] - responseCodeNot 200, but: " + httpURLConnection.getResponseCode());
                    inputStream = null;
                } else {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
                        sb = new StringBuilder();
                    } catch (Exception e3) {
                        e = e3;
                        if (OSSLog.isEnableLog()) {
                            e.printStackTrace();
                            OSSLog.logThrowable2Local(e);
                        }
                        if (inputStream != null) {
                        }
                    }
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        if (!this.hasRetryed) {
                            return null;
                        }
                        this.hasRetryed = true;
                        return call();
                    }
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    String string = jSONObject.getString("host");
                    long j = jSONObject.getLong(RemoteMessageConst.TTL);
                    JSONArray jSONArray = jSONObject.getJSONArray("ips");
                    OSSLog.logDebug("[httpdnsmini] - ips:" + jSONArray.toString());
                    if (string != null && jSONArray.length() > 0) {
                        if (j == 0) {
                            j = 30;
                        }
                        HostObject hostObject = HttpdnsMini.this.new HostObject();
                        String string2 = jSONArray.getString(0);
                        hostObject.setHostName(string);
                        hostObject.setTtl(j);
                        hostObject.setIp(string2);
                        hostObject.setQueryTime(System.currentTimeMillis() / 1000);
                        OSSLog.logDebug("[httpdnsmini] - resolve result:" + hostObject.toString());
                        if (HttpdnsMini.this.hostManager.size() < 100) {
                            HttpdnsMini.this.hostManager.put(this.hostName, hostObject);
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return string2;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                if (!this.hasRetryed) {
                }
            } catch (Throwable th2) {
                r1 = str;
                th = th2;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }
}
