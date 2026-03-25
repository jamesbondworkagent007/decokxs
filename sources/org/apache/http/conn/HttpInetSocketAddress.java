package org.apache.http.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import o.C59851zoo;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class HttpInetSocketAddress extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    private final HttpHost httphost;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpHost getHttpHost() {
        return this.httphost;
    }

    public HttpInetSocketAddress(HttpHost httpHost, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        this.httphost = httpHost;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.httphost.getHostName() + ":" + getPort();
    }
}
