package o;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;

/* JADX INFO: renamed from: o.zlF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59657zlF implements UserTokenHandler {
    public static final C59657zlF OLrzqt = new C59657zlF();

    @Override // org.apache.http.client.UserTokenHandler
    public java.lang.Object getUserToken(InterfaceC59838zob interfaceC59838zob) {
        Principal principalAEQbTJ;
        SSLSession sSLSessionFetchVPNInfo;
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        C59593zjv targetAuthState = httpClientContextAdapt.getTargetAuthState();
        if (targetAuthState != null) {
            principalAEQbTJ = AEQbTJ(targetAuthState);
            if (principalAEQbTJ == null) {
                principalAEQbTJ = AEQbTJ(httpClientContextAdapt.getProxyAuthState());
            }
        } else {
            principalAEQbTJ = null;
        }
        if (principalAEQbTJ != null) {
            return principalAEQbTJ;
        }
        InterfaceC59572zja connection = httpClientContextAdapt.getConnection();
        return (connection.KWHzl() && (connection instanceof InterfaceC59562zjQ) && (sSLSessionFetchVPNInfo = ((InterfaceC59562zjQ) connection).fetchVPNInfo()) != null) ? sSLSessionFetchVPNInfo.getLocalPrincipal() : principalAEQbTJ;
    }

    public static Principal AEQbTJ(C59593zjv c59593zjv) {
        InterfaceC59597zjz interfaceC59597zjzAEQbTJ;
        InterfaceC59588zjq interfaceC59588zjqKWHzl = c59593zjv.KWHzl();
        if (interfaceC59588zjqKWHzl == null || !interfaceC59588zjqKWHzl.isComplete() || !interfaceC59588zjqKWHzl.isConnectionBased() || (interfaceC59597zjzAEQbTJ = c59593zjv.AEQbTJ()) == null) {
            return null;
        }
        return interfaceC59597zjzAEQbTJ.getUserPrincipal();
    }
}
