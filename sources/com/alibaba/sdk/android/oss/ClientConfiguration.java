package com.alibaba.sdk.android.oss;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ClientConfiguration {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private String mUserAgentMark;
    private String proxyHost;
    private int proxyPort;
    private int maxConcurrentRequest = 5;
    private int socketTimeout = 60000;
    private int connectionTimeout = 60000;
    private long max_log_size = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    private int maxErrorRetry = 2;
    private List<String> customCnameExcludeList = new ArrayList();
    private boolean httpDnsEnable = true;
    private boolean checkCRC64 = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCustomUserMark() {
        return this.mUserAgentMark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxConcurrentRequest() {
        return this.maxConcurrentRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxErrorRetry() {
        return this.maxErrorRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getMaxLogSize() {
        return this.max_log_size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getProxyHost() {
        return this.proxyHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getProxyPort() {
        return this.proxyPort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCheckCRC64() {
        return this.checkCRC64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHttpDnsEnable() {
        return this.httpDnsEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCheckCRC64(boolean z) {
        this.checkCRC64 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHttpDnsEnable(boolean z) {
        this.httpDnsEnable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxConcurrentRequest(int i) {
        this.maxConcurrentRequest = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxErrorRetry(int i) {
        this.maxErrorRetry = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxLogSize(long j) {
        this.max_log_size = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProxyHost(String str) {
        this.proxyHost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProxyPort(int i) {
        this.proxyPort = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSocketTimeout(int i) {
        this.socketTimeout = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUserAgentMark(String str) {
        this.mUserAgentMark = str;
    }

    public static ClientConfiguration getDefaultConf() {
        return new ClientConfiguration();
    }

    public List<String> getCustomCnameExcludeList() {
        return Collections.unmodifiableList(this.customCnameExcludeList);
    }

    public void setCustomCnameExcludeList(List<String> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("cname exclude list should not be null.");
        }
        this.customCnameExcludeList.clear();
        for (String str : list) {
            if (str.contains("://")) {
                this.customCnameExcludeList.add(str.substring(str.indexOf("://") + 3));
            } else {
                this.customCnameExcludeList.add(str);
            }
        }
    }
}
