package org.apache.http.client;

import o.InterfaceC59584zjm;

/* JADX INFO: loaded from: classes13.dex */
public interface ConnectionBackoffStrategy {
    boolean shouldBackoff(Throwable th);

    boolean shouldBackoff(InterfaceC59584zjm interfaceC59584zjm);
}
