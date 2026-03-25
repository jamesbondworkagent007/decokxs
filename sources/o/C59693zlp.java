package o;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.impl.auth.GGSSchemeBase;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

/* JADX INFO: renamed from: o.zlp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59693zlp extends GGSSchemeBase {
    @Override // o.InterfaceC59588zjq
    public java.lang.String getRealm() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59588zjq
    public java.lang.String getSchemeName() {
        return "Negotiate";
    }

    @Override // o.InterfaceC59588zjq
    public boolean isConnectionBased() {
        return true;
    }

    public C59693zlp(boolean z, boolean z2) {
        super(z, z2);
    }

    public C59693zlp() {
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, o.AbstractC59682zle, o.InterfaceC59547zjB
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        return super.authenticate(interfaceC59597zjz, interfaceC59577zjf, interfaceC59838zob);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] OLrzqt(byte[] bArr, java.lang.String str) throws GSSException {
        return super.OLrzqt(bArr, str);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] KWHzl(byte[] bArr, java.lang.String str, InterfaceC59597zjz interfaceC59597zjz) throws GSSException {
        return KWHzl(bArr, new Oid("1.3.6.1.5.5.2"), str, interfaceC59597zjz);
    }
}
