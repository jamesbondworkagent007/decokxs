package o;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.UnsupportedSchemeException;

/* JADX INFO: renamed from: o.zlr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59695zlr implements AuthCache {
    public final java.util.Map<HttpHost, byte[]> AEQbTJ;
    public final InterfaceC59499ziG KWHzl;
    public final InterfaceC59565zjT copydefault;

    public C59695zlr(InterfaceC59565zjT interfaceC59565zjT) {
        this.KWHzl = LogFactory.copydefault(getClass());
        this.AEQbTJ = new ConcurrentHashMap();
        this.copydefault = interfaceC59565zjT == null ? C59675zlX.copydefault : interfaceC59565zjT;
    }

    public C59695zlr() {
        this(null);
    }

    public HttpHost KWHzl(HttpHost httpHost) {
        if (httpHost.getPort() <= 0) {
            try {
                return new HttpHost(httpHost.getHostName(), this.copydefault.copydefault(httpHost), httpHost.getSchemeName());
            } catch (UnsupportedSchemeException unused) {
            }
        }
        return httpHost;
    }

    @Override // org.apache.http.client.AuthCache
    public void put(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq) {
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        if (interfaceC59588zjq == null) {
            return;
        }
        if (interfaceC59588zjq instanceof java.io.Serializable) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(interfaceC59588zjq);
                objectOutputStream.close();
                this.AEQbTJ.put(KWHzl(httpHost), byteArrayOutputStream.toByteArray());
                return;
            } catch (java.io.IOException e) {
                if (this.KWHzl.isWarnEnabled()) {
                    this.KWHzl.warn("Unexpected I/O error while serializing auth scheme", e);
                    return;
                }
                return;
            }
        }
        if (this.KWHzl.isDebugEnabled()) {
            this.KWHzl.debug("Auth scheme " + interfaceC59588zjq.getClass() + " is not serializable");
        }
    }

    @Override // org.apache.http.client.AuthCache
    public InterfaceC59588zjq get(HttpHost httpHost) {
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        byte[] bArr = this.AEQbTJ.get(KWHzl(httpHost));
        if (bArr != null) {
            try {
                java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(bArr));
                InterfaceC59588zjq interfaceC59588zjq = (InterfaceC59588zjq) objectInputStream.readObject();
                objectInputStream.close();
                return interfaceC59588zjq;
            } catch (java.io.IOException e) {
                if (this.KWHzl.isWarnEnabled()) {
                    this.KWHzl.warn("Unexpected I/O error while de-serializing auth scheme", e);
                }
            } catch (java.lang.ClassNotFoundException e2) {
                if (this.KWHzl.isWarnEnabled()) {
                    this.KWHzl.warn("Unexpected error while de-serializing auth scheme", e2);
                }
                return null;
            }
        }
        return null;
    }

    @Override // org.apache.http.client.AuthCache
    public void remove(HttpHost httpHost) {
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        this.AEQbTJ.remove(KWHzl(httpHost));
    }

    @Override // org.apache.http.client.AuthCache
    public void clear() {
        this.AEQbTJ.clear();
    }

    public java.lang.String toString() {
        return this.AEQbTJ.toString();
    }
}
