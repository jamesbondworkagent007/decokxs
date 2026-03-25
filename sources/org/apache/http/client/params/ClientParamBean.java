package org.apache.http.client.params;

import java.util.Collection;
import o.AbstractC59775znR;
import o.InterfaceC59518ziZ;
import o.InterfaceC59779znV;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class ClientParamBean extends AbstractC59775znR {
    public ClientParamBean(InterfaceC59779znV interfaceC59779znV) {
        super(interfaceC59779znV);
    }

    @Deprecated
    public void setConnectionManagerFactoryClassName(String str) {
        this.params.setParameter(ClientPNames.CONNECTION_MANAGER_FACTORY_CLASS_NAME, str);
    }

    public void setHandleRedirects(boolean z) {
        this.params.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z);
    }

    public void setRejectRelativeRedirect(boolean z) {
        this.params.setBooleanParameter(ClientPNames.REJECT_RELATIVE_REDIRECT, z);
    }

    public void setMaxRedirects(int i) {
        this.params.setIntParameter(ClientPNames.MAX_REDIRECTS, i);
    }

    public void setAllowCircularRedirects(boolean z) {
        this.params.setBooleanParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, z);
    }

    public void setHandleAuthentication(boolean z) {
        this.params.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z);
    }

    public void setCookiePolicy(String str) {
        this.params.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public void setVirtualHost(HttpHost httpHost) {
        this.params.setParameter(ClientPNames.VIRTUAL_HOST, httpHost);
    }

    public void setDefaultHeaders(Collection<InterfaceC59518ziZ> collection) {
        this.params.setParameter(ClientPNames.DEFAULT_HEADERS, collection);
    }

    public void setDefaultHost(HttpHost httpHost) {
        this.params.setParameter(ClientPNames.DEFAULT_HOST, httpHost);
    }

    public void setConnectionManagerTimeout(long j) {
        this.params.setLongParameter(ClientPNames.CONN_MANAGER_TIMEOUT, j);
    }
}
