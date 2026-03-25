package org.apache.http.impl.cookie;

import java.util.Collection;
import o.C59756zmz;
import o.InterfaceC59605zkG;
import o.InterfaceC59607zkI;
import o.InterfaceC59608zkJ;
import o.InterfaceC59779znV;
import o.InterfaceC59838zob;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BrowserCompatSpecFactory implements InterfaceC59608zkJ, InterfaceC59607zkI {
    public final InterfaceC59605zkG AEQbTJ;
    public final SecurityLevel copydefault;

    public enum SecurityLevel {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59607zkI
    public InterfaceC59605zkG AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
        return this.AEQbTJ;
    }

    public BrowserCompatSpecFactory(String[] strArr, SecurityLevel securityLevel) {
        this.copydefault = securityLevel;
        this.AEQbTJ = new C59756zmz(strArr, securityLevel);
    }

    public BrowserCompatSpecFactory() {
        this(null, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    @Override // o.InterfaceC59608zkJ
    public InterfaceC59605zkG KWHzl(InterfaceC59779znV interfaceC59779znV) {
        if (interfaceC59779znV != null) {
            Collection collection = (Collection) interfaceC59779znV.getParameter("http.protocol.cookie-datepatterns");
            return new C59756zmz(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, this.copydefault);
        }
        return new C59756zmz(null, this.copydefault);
    }
}
