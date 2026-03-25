package org.apache.http.client;

import o.InterfaceC59588zjq;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes13.dex */
public interface AuthCache {
    void clear();

    InterfaceC59588zjq get(HttpHost httpHost);

    void put(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq);

    void remove(HttpHost httpHost);
}
