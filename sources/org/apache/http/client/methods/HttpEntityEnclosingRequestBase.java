package org.apache.http.client.methods;

import com.google.common.net.HttpHeaders;
import o.InterfaceC59518ziZ;
import o.InterfaceC59576zje;
import o.InterfaceC59578zjg;
import org.apache.http.client.utils.CloneUtils;

/* JADX INFO: loaded from: classes13.dex */
public abstract class HttpEntityEnclosingRequestBase extends HttpRequestBase implements InterfaceC59578zjg {
    private InterfaceC59576zje entity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59578zjg
    public InterfaceC59576zje getEntity() {
        return this.entity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59578zjg
    public void setEntity(InterfaceC59576zje interfaceC59576zje) {
        this.entity = interfaceC59576zje;
    }

    @Override // o.InterfaceC59578zjg
    public boolean expectContinue() {
        InterfaceC59518ziZ firstHeader = getFirstHeader(HttpHeaders.EXPECT);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // org.apache.http.client.methods.AbstractExecutionAwareRequest
    public Object clone() throws CloneNotSupportedException {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase = (HttpEntityEnclosingRequestBase) super.clone();
        InterfaceC59576zje interfaceC59576zje = this.entity;
        if (interfaceC59576zje != null) {
            httpEntityEnclosingRequestBase.entity = (InterfaceC59576zje) CloneUtils.cloneObject(interfaceC59576zje);
        }
        return httpEntityEnclosingRequestBase;
    }
}
