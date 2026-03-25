package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.ProtocolException;

/* JADX INFO: renamed from: o.zlG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59658zlG extends C59666zlO implements InterfaceC59578zjg {
    public boolean OLrzqt;
    public InterfaceC59576zje copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59578zjg
    public InterfaceC59576zje getEntity() {
        return this.copydefault;
    }

    public C59658zlG(InterfaceC59578zjg interfaceC59578zjg) throws ProtocolException {
        super(interfaceC59578zjg);
        setEntity(interfaceC59578zjg.getEntity());
    }

    @Override // o.InterfaceC59578zjg
    public void setEntity(InterfaceC59576zje interfaceC59576zje) {
        this.copydefault = interfaceC59576zje != null ? new Application(interfaceC59576zje) : null;
        this.OLrzqt = false;
    }

    @Override // o.InterfaceC59578zjg
    public boolean expectContinue() {
        InterfaceC59518ziZ firstHeader = getFirstHeader(HttpHeaders.EXPECT);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // o.C59666zlO
    public boolean OLrzqt() {
        InterfaceC59576zje interfaceC59576zje = this.copydefault;
        return interfaceC59576zje == null || interfaceC59576zje.isRepeatable() || !this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.zlG$Application */
    public class Application extends C59620zkV {
        public Application(InterfaceC59576zje interfaceC59576zje) {
            super(interfaceC59576zje);
        }

        @Override // o.C59620zkV, o.InterfaceC59576zje
        public void consumeContent() throws java.io.IOException {
            C59658zlG.this.OLrzqt = true;
            super.consumeContent();
        }

        @Override // o.C59620zkV, o.InterfaceC59576zje
        public java.io.InputStream getContent() throws java.io.IOException {
            C59658zlG.this.OLrzqt = true;
            return super.getContent();
        }

        @Override // o.C59620zkV, o.InterfaceC59576zje
        public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
            C59658zlG.this.OLrzqt = true;
            super.writeTo(outputStream);
        }
    }
}
