package o;

import com.google.common.net.HttpHeaders;
import java.net.SocketException;

/* JADX INFO: renamed from: o.zjH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59553zjH extends C59620zkV implements InterfaceC59556zjK, InterfaceC59561zjP {
    public InterfaceC59560zjO AEQbTJ;
    public final boolean copydefault;

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public boolean isRepeatable() {
        return false;
    }

    public C59553zjH(InterfaceC59576zje interfaceC59576zje, InterfaceC59560zjO interfaceC59560zjO, boolean z) {
        super(interfaceC59576zje);
        C59851zoo.AEQbTJ(interfaceC59560zjO, HttpHeaders.CONNECTION);
        this.AEQbTJ = interfaceC59560zjO;
        this.copydefault = z;
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.io.IOException {
        return new C59563zjR(this.wrappedEntity.getContent(), this);
    }

    public final void OLrzqt() throws java.io.IOException {
        InterfaceC59560zjO interfaceC59560zjO = this.AEQbTJ;
        if (interfaceC59560zjO == null) {
            return;
        }
        try {
            if (this.copydefault) {
                C59855zos.KWHzl(this.wrappedEntity);
                this.AEQbTJ.AhwBna();
            } else {
                interfaceC59560zjO.djBIcL();
            }
        } finally {
            KWHzl();
        }
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    @java.lang.Deprecated
    public void consumeContent() throws java.io.IOException {
        OLrzqt();
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        super.writeTo(outputStream);
        OLrzqt();
    }

    @Override // o.InterfaceC59556zjK
    public void ca_() throws java.io.IOException {
        OLrzqt();
    }

    @Override // o.InterfaceC59556zjK
    public void bZ_() throws java.io.IOException {
        InterfaceC59560zjO interfaceC59560zjO = this.AEQbTJ;
        if (interfaceC59560zjO != null) {
            try {
                interfaceC59560zjO.bZ_();
            } finally {
                this.AEQbTJ = null;
            }
        }
    }

    @Override // o.InterfaceC59561zjP
    public boolean AEQbTJ(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            InterfaceC59560zjO interfaceC59560zjO = this.AEQbTJ;
            if (interfaceC59560zjO != null) {
                if (this.copydefault) {
                    inputStream.close();
                    this.AEQbTJ.AhwBna();
                } else {
                    interfaceC59560zjO.djBIcL();
                }
            }
            KWHzl();
            return false;
        } catch (java.lang.Throwable th) {
            KWHzl();
            throw th;
        }
    }

    @Override // o.InterfaceC59561zjP
    public boolean copydefault(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            InterfaceC59560zjO interfaceC59560zjO = this.AEQbTJ;
            if (interfaceC59560zjO != null) {
                if (this.copydefault) {
                    boolean zKWHzl = interfaceC59560zjO.KWHzl();
                    try {
                        inputStream.close();
                        this.AEQbTJ.AhwBna();
                    } catch (SocketException e) {
                        if (zKWHzl) {
                            throw e;
                        }
                    }
                } else {
                    interfaceC59560zjO.djBIcL();
                }
            }
            KWHzl();
            return false;
        } catch (java.lang.Throwable th) {
            KWHzl();
            throw th;
        }
    }

    @Override // o.InterfaceC59561zjP
    public boolean EZpvd(java.io.InputStream inputStream) throws java.io.IOException {
        InterfaceC59560zjO interfaceC59560zjO = this.AEQbTJ;
        if (interfaceC59560zjO == null) {
            return false;
        }
        interfaceC59560zjO.bZ_();
        return false;
    }

    public void KWHzl() throws java.io.IOException {
        InterfaceC59560zjO interfaceC59560zjO = this.AEQbTJ;
        if (interfaceC59560zjO != null) {
            try {
                interfaceC59560zjO.ca_();
            } finally {
                this.AEQbTJ = null;
            }
        }
    }
}
