package o;

import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zlK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59662zlK {
    public volatile java.lang.Object AEQbTJ;
    public final InterfaceC59569zjX EZpvd;
    public volatile C59631zkg KWHzl;
    public volatile C59570zjY OLrzqt;
    public final InterfaceC59555zjJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.Object obj) {
        this.AEQbTJ = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.KWHzl = null;
        this.AEQbTJ = null;
    }

    public AbstractC59662zlK(InterfaceC59555zjJ interfaceC59555zjJ, C59570zjY c59570zjY) {
        C59851zoo.AEQbTJ(interfaceC59555zjJ, "Connection operator");
        this.copydefault = interfaceC59555zjJ;
        this.EZpvd = interfaceC59555zjJ.copydefault();
        this.OLrzqt = c59570zjY;
        this.KWHzl = null;
    }

    public void OLrzqt(C59570zjY c59570zjY, InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(c59570zjY, "Route");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        if (this.KWHzl != null) {
            C59849zom.EZpvd(!this.KWHzl.AhwBna(), "Connection already open");
        }
        this.KWHzl = new C59631zkg(c59570zjY);
        HttpHost httpHostEZpvd = c59570zjY.EZpvd();
        this.copydefault.EZpvd(this.EZpvd, httpHostEZpvd != null ? httpHostEZpvd : c59570zjY.copydefault(), c59570zjY.OLrzqt(), interfaceC59838zob, interfaceC59779znV);
        C59631zkg c59631zkg = this.KWHzl;
        if (c59631zkg == null) {
            throw new java.io.InterruptedIOException("Request aborted");
        }
        if (httpHostEZpvd == null) {
            c59631zkg.copydefault(this.EZpvd.AYXKKw());
        } else {
            c59631zkg.EZpvd(httpHostEZpvd, this.EZpvd.AYXKKw());
        }
    }

    public void OLrzqt(boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        C59849zom.AEQbTJ(this.KWHzl, "Route tracker");
        C59849zom.EZpvd(this.KWHzl.AhwBna(), "Connection not open");
        C59849zom.EZpvd(!this.KWHzl.gEmmrt(), "Connection is already tunnelled");
        this.EZpvd.OLrzqt(null, this.KWHzl.copydefault(), z, interfaceC59779znV);
        this.KWHzl.KWHzl(z);
    }

    public void copydefault(HttpHost httpHost, boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(httpHost, "Next proxy");
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        C59849zom.AEQbTJ(this.KWHzl, "Route tracker");
        C59849zom.EZpvd(this.KWHzl.AhwBna(), "Connection not open");
        this.EZpvd.OLrzqt(null, httpHost, z, interfaceC59779znV);
        this.KWHzl.OLrzqt(httpHost, z);
    }

    public void copydefault(InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        C59849zom.AEQbTJ(this.KWHzl, "Route tracker");
        C59849zom.EZpvd(this.KWHzl.AhwBna(), "Connection not open");
        C59849zom.EZpvd(this.KWHzl.gEmmrt(), "Protocol layering without a tunnel not supported");
        C59849zom.EZpvd(!this.KWHzl.KWHzl(), "Multiple protocol layering not supported");
        this.copydefault.AEQbTJ(this.EZpvd, this.KWHzl.copydefault(), interfaceC59838zob, interfaceC59779znV);
        this.KWHzl.EZpvd(this.EZpvd.AYXKKw());
    }
}
