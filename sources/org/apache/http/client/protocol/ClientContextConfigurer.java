package org.apache.http.client.protocol;

import o.C59595zjx;
import o.C59610zkL;
import o.C59851zoo;
import o.InterfaceC59838zob;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class ClientContextConfigurer implements ClientContext {
    private final InterfaceC59838zob context;

    public ClientContextConfigurer(InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        this.context = interfaceC59838zob;
    }

    public void setCookieSpecRegistry(C59610zkL c59610zkL) {
        this.context.setAttribute("http.cookiespec-registry", c59610zkL);
    }

    public void setAuthSchemeRegistry(C59595zjx c59595zjx) {
        this.context.setAttribute("http.authscheme-registry", c59595zjx);
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.context.setAttribute("http.cookie-store", cookieStore);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.context.setAttribute("http.auth.credentials-provider", credentialsProvider);
    }
}
