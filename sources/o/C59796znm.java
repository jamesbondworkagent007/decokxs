package o;

import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;

/* JADX INFO: renamed from: o.znm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59796znm extends AbstractC59790zng<InterfaceC59584zjm> {
    public final org.apache.http.util.CharArrayBuffer AEQbTJ;
    public final InterfaceC59583zjl KWHzl;

    @java.lang.Deprecated
    public C59796znm(InterfaceC59758znA interfaceC59758znA, InterfaceC59769znL interfaceC59769znL, InterfaceC59583zjl interfaceC59583zjl, InterfaceC59779znV interfaceC59779znV) {
        super(interfaceC59758znA, interfaceC59769znL, interfaceC59779znV);
        this.KWHzl = (InterfaceC59583zjl) C59851zoo.AEQbTJ(interfaceC59583zjl, "Response factory");
        this.AEQbTJ = new org.apache.http.util.CharArrayBuffer(128);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/znA;)Lo/zjj; */
    @Override // o.AbstractC59790zng
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC59584zjm OLrzqt(InterfaceC59758znA interfaceC59758znA) throws HttpException, org.apache.http.ParseException, java.io.IOException {
        this.AEQbTJ.clear();
        if (interfaceC59758znA.EZpvd(this.AEQbTJ) == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        return this.KWHzl.AEQbTJ(this.OLrzqt.AEQbTJ(this.AEQbTJ, new C59771znN(0, this.AEQbTJ.length())), null);
    }
}
