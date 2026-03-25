package o;

import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.zna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59784zna {
    public final InterfaceC59612zkN OLrzqt;

    public C59784zna(InterfaceC59612zkN interfaceC59612zkN) {
        this.OLrzqt = (InterfaceC59612zkN) C59851zoo.AEQbTJ(interfaceC59612zkN, "Content length strategy");
    }

    public java.io.OutputStream OLrzqt(InterfaceC59808zny interfaceC59808zny, InterfaceC59581zjj interfaceC59581zjj) throws HttpException, java.io.IOException {
        long jOLrzqt = this.OLrzqt.OLrzqt(interfaceC59581zjj);
        if (jOLrzqt == -2) {
            return new C59794znk(interfaceC59808zny);
        }
        if (jOLrzqt == -1) {
            return new C59805znv(interfaceC59808zny);
        }
        return new C59792zni(interfaceC59808zny, jOLrzqt);
    }

    public void AEQbTJ(InterfaceC59808zny interfaceC59808zny, InterfaceC59581zjj interfaceC59581zjj, InterfaceC59576zje interfaceC59576zje) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59808zny, "Session output buffer");
        C59851zoo.AEQbTJ(interfaceC59581zjj, "HTTP message");
        C59851zoo.AEQbTJ(interfaceC59576zje, "HTTP entity");
        java.io.OutputStream outputStreamOLrzqt = OLrzqt(interfaceC59808zny, interfaceC59581zjj);
        interfaceC59576zje.writeTo(outputStreamOLrzqt);
        outputStreamOLrzqt.close();
    }
}
