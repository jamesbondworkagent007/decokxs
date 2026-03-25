package com.okinc.network.model;

import java.net.InetAddress;
import java.net.Proxy;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public final class CallChainExtraInfo {
    public static final int $stable = 8;
    private InetAddress connectIP;
    private Boolean connectSuccess;
    private HttpUrl connectUrl;
    private Proxy.Type proxyType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InetAddress getConnectIP() {
        return this.connectIP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getConnectSuccess() {
        return this.connectSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpUrl getConnectUrl() {
        return this.connectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Proxy.Type getProxyType() {
        return this.proxyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnectIP(InetAddress inetAddress) {
        this.connectIP = inetAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnectSuccess(Boolean bool) {
        this.connectSuccess = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnectUrl(HttpUrl httpUrl) {
        this.connectUrl = httpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProxyType(Proxy.Type type) {
        this.proxyType = type;
    }

    public String toString() {
        return "CallChainExtraInfo(connectUrl=" + this.connectUrl + ", connectSuccess=" + this.connectSuccess + ", connectIP=" + this.connectIP + ", proxyType=" + this.proxyType + ")";
    }
}
