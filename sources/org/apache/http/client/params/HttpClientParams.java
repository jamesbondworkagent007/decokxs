package org.apache.http.client.params;

import o.C59776znS;
import o.C59851zoo;
import o.InterfaceC59779znV;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class HttpClientParams {
    private HttpClientParams() {
    }

    public static boolean isRedirecting(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, true);
    }

    public static void setRedirecting(InterfaceC59779znV interfaceC59779znV, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z);
    }

    public static boolean isAuthenticating(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, true);
    }

    public static void setAuthenticating(InterfaceC59779znV interfaceC59779znV, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z);
    }

    public static String getCookiePolicy(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        String str = (String) interfaceC59779znV.getParameter(ClientPNames.COOKIE_POLICY);
        return str == null ? "best-match" : str;
    }

    public static void setCookiePolicy(InterfaceC59779znV interfaceC59779znV, String str) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public static void setConnectionManagerTimeout(InterfaceC59779znV interfaceC59779znV, long j) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setLongParameter(ClientPNames.CONN_MANAGER_TIMEOUT, j);
    }

    public static long getConnectionManagerTimeout(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        Long l = (Long) interfaceC59779znV.getParameter(ClientPNames.CONN_MANAGER_TIMEOUT);
        if (l != null) {
            return l.longValue();
        }
        return C59776znS.KWHzl(interfaceC59779znV);
    }
}
