package o;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zlZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59677zlZ implements InterfaceC59625zka {
    public final C59636zkl KWHzl;
    public ProxySelector OLrzqt;

    public C59677zlZ(C59636zkl c59636zkl, ProxySelector proxySelector) {
        C59851zoo.AEQbTJ(c59636zkl, "SchemeRegistry");
        this.KWHzl = c59636zkl;
        this.OLrzqt = proxySelector;
    }

    @Override // o.InterfaceC59625zka
    public C59570zjY OLrzqt(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59570zjY c59570zjYOLrzqt = C59627zkc.OLrzqt(interfaceC59577zjf.getParams());
        if (c59570zjYOLrzqt != null) {
            return c59570zjYOLrzqt;
        }
        C59849zom.AEQbTJ(httpHost, "Target host");
        java.net.InetAddress inetAddressEZpvd = C59627zkc.EZpvd(interfaceC59577zjf.getParams());
        HttpHost httpHostCopydefault = copydefault(httpHost, interfaceC59577zjf, interfaceC59838zob);
        boolean zEZpvd = this.KWHzl.AEQbTJ(httpHost.getSchemeName()).EZpvd();
        if (httpHostCopydefault == null) {
            return new C59570zjY(httpHost, inetAddressEZpvd, zEZpvd);
        }
        return new C59570zjY(httpHost, inetAddressEZpvd, httpHostCopydefault, zEZpvd);
    }

    public HttpHost copydefault(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException {
        ProxySelector proxySelector = this.OLrzqt;
        if (proxySelector == null) {
            proxySelector = ProxySelector.getDefault();
        }
        if (proxySelector == null) {
            return null;
        }
        try {
            java.net.Proxy proxyEZpvd = EZpvd(proxySelector.select(new java.net.URI(httpHost.toURI())), httpHost, interfaceC59577zjf, interfaceC59838zob);
            if (proxyEZpvd.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (!(proxyEZpvd.address() instanceof InetSocketAddress)) {
                throw new HttpException("Unable to handle non-Inet proxy address: " + proxyEZpvd.address());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyEZpvd.address();
            return new HttpHost(OLrzqt(inetSocketAddress), inetSocketAddress.getPort());
        } catch (URISyntaxException e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }

    public java.lang.String OLrzqt(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    public java.net.Proxy EZpvd(java.util.List<java.net.Proxy> list, HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.copydefault(list, "List of proxies");
        java.net.Proxy proxy = null;
        for (int i = 0; proxy == null && i < list.size(); i++) {
            java.net.Proxy proxy2 = list.get(i);
            int i2 = AnonymousClass4.AEQbTJ[proxy2.type().ordinal()];
            if (i2 == 1 || i2 == 2) {
                proxy = proxy2;
            }
        }
        return proxy == null ? java.net.Proxy.NO_PROXY : proxy;
    }

    /* JADX INFO: renamed from: o.zlZ$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            AEQbTJ = iArr;
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
