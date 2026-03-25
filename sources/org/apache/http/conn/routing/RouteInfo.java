package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes13.dex */
public interface RouteInfo {

    public enum LayerType {
        PLAIN,
        LAYERED
    }

    public enum TunnelType {
        PLAIN,
        TUNNELLED
    }

    int AEQbTJ();

    HttpHost AEQbTJ(int i);

    boolean AYXKKw();

    HttpHost EZpvd();

    boolean KWHzl();

    InetAddress OLrzqt();

    HttpHost copydefault();

    boolean gEmmrt();
}
