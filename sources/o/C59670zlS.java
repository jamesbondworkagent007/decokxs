package o;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;

/* JADX INFO: renamed from: o.zlS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59670zlS extends AbstractC59790zng<InterfaceC59584zjm> {
    public final InterfaceC59583zjl AEQbTJ;
    public final org.apache.http.util.CharArrayBuffer KWHzl;
    public final InterfaceC59499ziG copydefault;

    public boolean OLrzqt(org.apache.http.util.CharArrayBuffer charArrayBuffer, int i) {
        return false;
    }

    @java.lang.Deprecated
    public C59670zlS(InterfaceC59758znA interfaceC59758znA, InterfaceC59769znL interfaceC59769znL, InterfaceC59583zjl interfaceC59583zjl, InterfaceC59779znV interfaceC59779znV) {
        super(interfaceC59758znA, interfaceC59769znL, interfaceC59779znV);
        this.copydefault = LogFactory.copydefault(getClass());
        C59851zoo.AEQbTJ(interfaceC59583zjl, "Response factory");
        this.AEQbTJ = interfaceC59583zjl;
        this.KWHzl = new org.apache.http.util.CharArrayBuffer(128);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/znA;)Lo/zjj; */
    @Override // o.AbstractC59790zng
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC59584zjm OLrzqt(InterfaceC59758znA interfaceC59758znA) throws HttpException, java.io.IOException {
        int i = 0;
        while (true) {
            this.KWHzl.clear();
            int iEZpvd = interfaceC59758znA.EZpvd(this.KWHzl);
            if (iEZpvd == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            C59771znN c59771znN = new C59771znN(0, this.KWHzl.length());
            if (!this.OLrzqt.OLrzqt(this.KWHzl, c59771znN)) {
                if (iEZpvd == -1 || OLrzqt(this.KWHzl, i)) {
                    break;
                }
                if (this.copydefault.isDebugEnabled()) {
                    this.copydefault.debug("Garbage in response: " + this.KWHzl.toString());
                }
                i++;
            } else {
                return this.AEQbTJ.AEQbTJ(this.OLrzqt.AEQbTJ(this.KWHzl, c59771znN), null);
            }
        }
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
    }
}
