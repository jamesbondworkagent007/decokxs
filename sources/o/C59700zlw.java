package o;

import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;

/* JADX INFO: renamed from: o.zlw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59700zlw implements HttpRequestRetryHandler {
    public static final C59700zlw AEQbTJ = new C59700zlw();
    public final int EZpvd;
    public final boolean KWHzl;
    public final java.util.Set<java.lang.Class<? extends java.io.IOException>> OLrzqt;

    public C59700zlw(int i, boolean z, java.util.Collection<java.lang.Class<? extends java.io.IOException>> collection) {
        this.EZpvd = i;
        this.KWHzl = z;
        this.OLrzqt = new java.util.HashSet();
        java.util.Iterator<java.lang.Class<? extends java.io.IOException>> it = collection.iterator();
        while (it.hasNext()) {
            this.OLrzqt.add(it.next());
        }
    }

    public C59700zlw(int i, boolean z) {
        this(i, z, java.util.Arrays.asList(java.io.InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    public C59700zlw() {
        this(3, false);
    }

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(java.io.IOException iOException, int i, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(iOException, "Exception parameter");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        if (i > this.EZpvd || this.OLrzqt.contains(iOException.getClass())) {
            return false;
        }
        java.util.Iterator<java.lang.Class<? extends java.io.IOException>> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(iOException)) {
                return false;
            }
        }
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        InterfaceC59577zjf request = httpClientContextAdapt.getRequest();
        if (EZpvd(request)) {
            return false;
        }
        return OLrzqt(request) || !httpClientContextAdapt.isRequestSent() || this.KWHzl;
    }

    public boolean OLrzqt(InterfaceC59577zjf interfaceC59577zjf) {
        return !(interfaceC59577zjf instanceof InterfaceC59578zjg);
    }

    @java.lang.Deprecated
    public boolean EZpvd(InterfaceC59577zjf interfaceC59577zjf) {
        if (interfaceC59577zjf instanceof C59666zlO) {
            interfaceC59577zjf = ((C59666zlO) interfaceC59577zjf).AEQbTJ();
        }
        return (interfaceC59577zjf instanceof HttpUriRequest) && ((HttpUriRequest) interfaceC59577zjf).isAborted();
    }
}
