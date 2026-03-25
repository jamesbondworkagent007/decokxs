package org.apache.http.client.protocol;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import o.C59602zkD;
import o.C59851zoo;
import o.InterfaceC59499ziG;
import o.InterfaceC59518ziZ;
import o.InterfaceC59574zjc;
import o.InterfaceC59584zjm;
import o.InterfaceC59585zjn;
import o.InterfaceC59601zkC;
import o.InterfaceC59605zkG;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: loaded from: classes13.dex */
public class ResponseProcessCookies implements InterfaceC59585zjn {
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    @Override // o.InterfaceC59585zjn
    public void process(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        InterfaceC59605zkG cookieSpec = httpClientContextAdapt.getCookieSpec();
        if (cookieSpec == null) {
            this.log.debug("Cookie spec not specified in HTTP context");
            return;
        }
        CookieStore cookieStore = httpClientContextAdapt.getCookieStore();
        if (cookieStore == null) {
            this.log.debug("Cookie store not specified in HTTP context");
            return;
        }
        C59602zkD cookieOrigin = httpClientContextAdapt.getCookieOrigin();
        if (cookieOrigin == null) {
            this.log.debug("Cookie origin not specified in HTTP context");
            return;
        }
        processCookies(interfaceC59584zjm.headerIterator(HttpHeaders.SET_COOKIE), cookieSpec, cookieOrigin, cookieStore);
        if (cookieSpec.AEQbTJ() > 0) {
            processCookies(interfaceC59584zjm.headerIterator(HttpHeaders.SET_COOKIE2), cookieSpec, cookieOrigin, cookieStore);
        }
    }

    private void processCookies(InterfaceC59574zjc interfaceC59574zjc, InterfaceC59605zkG interfaceC59605zkG, C59602zkD c59602zkD, CookieStore cookieStore) {
        while (interfaceC59574zjc.hasNext()) {
            InterfaceC59518ziZ interfaceC59518ziZOLrzqt = interfaceC59574zjc.OLrzqt();
            try {
                for (InterfaceC59601zkC interfaceC59601zkC : interfaceC59605zkG.KWHzl(interfaceC59518ziZOLrzqt, c59602zkD)) {
                    try {
                        interfaceC59605zkG.OLrzqt(interfaceC59601zkC, c59602zkD);
                        cookieStore.addCookie(interfaceC59601zkC);
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Cookie accepted [" + formatCooke(interfaceC59601zkC) + "]");
                        }
                    } catch (MalformedCookieException e) {
                        if (this.log.isWarnEnabled()) {
                            this.log.warn("Cookie rejected [" + formatCooke(interfaceC59601zkC) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (this.log.isWarnEnabled()) {
                    this.log.warn("Invalid cookie header: \"" + interfaceC59518ziZOLrzqt + "\". " + e2.getMessage());
                }
            }
        }
    }

    private static String formatCooke(InterfaceC59601zkC interfaceC59601zkC) {
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC59601zkC.getName());
        sb.append("=\"");
        String value = interfaceC59601zkC.getValue();
        if (value != null) {
            if (value.length() > 100) {
                value = value.substring(0, 100) + "...";
            }
            sb.append(value);
        }
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb.append(", version:");
        sb.append(Integer.toString(interfaceC59601zkC.getVersion()));
        sb.append(", domain:");
        sb.append(interfaceC59601zkC.getDomain());
        sb.append(", path:");
        sb.append(interfaceC59601zkC.getPath());
        sb.append(", expiry:");
        sb.append(interfaceC59601zkC.getExpiryDate());
        return sb.toString();
    }
}
