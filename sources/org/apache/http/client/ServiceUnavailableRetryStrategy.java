package org.apache.http.client;

import o.InterfaceC59584zjm;
import o.InterfaceC59838zob;

/* JADX INFO: loaded from: classes24.dex */
public interface ServiceUnavailableRetryStrategy {
    long getRetryInterval();

    boolean retryRequest(InterfaceC59584zjm interfaceC59584zjm, int i, InterfaceC59838zob interfaceC59838zob);
}
