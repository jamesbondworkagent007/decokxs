package org.apache.http.client;

import java.io.IOException;
import o.InterfaceC59838zob;

/* JADX INFO: loaded from: classes13.dex */
public interface HttpRequestRetryHandler {
    boolean retryRequest(IOException iOException, int i, InterfaceC59838zob interfaceC59838zob);
}
