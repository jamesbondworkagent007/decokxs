package org.apache.http.client.methods;

import java.io.IOException;
import o.InterfaceC59556zjK;
import o.InterfaceC59558zjM;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface AbortableHttpRequest {
    void abort();

    void setConnectionRequest(InterfaceC59558zjM interfaceC59558zjM) throws IOException;

    void setReleaseTrigger(InterfaceC59556zjK interfaceC59556zjK) throws IOException;
}
