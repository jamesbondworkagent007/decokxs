package o;

import org.apache.http.HttpVersion;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestProxyAuthentication;
import org.apache.http.client.protocol.RequestTargetAuthentication;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.params.SyncBasicHttpParams;

/* JADX INFO: renamed from: o.zly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59702zly extends AbstractC59690zlm {
    public C59702zly(InterfaceC59551zjF interfaceC59551zjF, InterfaceC59779znV interfaceC59779znV) {
        super(interfaceC59551zjF, interfaceC59779znV);
    }

    public C59702zly(InterfaceC59551zjF interfaceC59551zjF) {
        super(interfaceC59551zjF, null);
    }

    public C59702zly(InterfaceC59779znV interfaceC59779znV) {
        super(null, interfaceC59779znV);
    }

    public C59702zly() {
        super(null, null);
    }

    @Override // o.AbstractC59690zlm
    public InterfaceC59779znV createHttpParams() {
        SyncBasicHttpParams syncBasicHttpParams = new SyncBasicHttpParams();
        setDefaultHttpParams(syncBasicHttpParams);
        return syncBasicHttpParams;
    }

    public static void setDefaultHttpParams(InterfaceC59779znV interfaceC59779znV) {
        C59781znX.copydefault(interfaceC59779znV, HttpVersion.HTTP_1_1);
        C59781znX.EZpvd(interfaceC59779znV, C59841zoe.OLrzqt.name());
        C59776znS.OLrzqt(interfaceC59779znV, true);
        C59776znS.KWHzl(interfaceC59779znV, 8192);
        C59781znX.copydefault(interfaceC59779znV, C59854zor.OLrzqt("Apache-HttpClient", "org.apache.http.client", (java.lang.Class<?>) C59702zly.class));
    }

    @Override // o.AbstractC59690zlm
    public C59783znZ createHttpProcessor() {
        C59783znZ c59783znZ = new C59783znZ();
        c59783znZ.copydefault(new RequestDefaultHeaders());
        c59783znZ.copydefault(new C59842zof());
        c59783znZ.copydefault(new C59843zog());
        c59783znZ.copydefault(new RequestClientConnControl());
        c59783znZ.copydefault(new C59848zol());
        c59783znZ.copydefault(new C59845zoi());
        c59783znZ.copydefault(new RequestAddCookies());
        c59783znZ.AEQbTJ(new ResponseProcessCookies());
        c59783znZ.copydefault(new RequestAuthCache());
        c59783znZ.copydefault(new RequestTargetAuthentication());
        c59783znZ.copydefault(new RequestProxyAuthentication());
        return c59783znZ;
    }
}
