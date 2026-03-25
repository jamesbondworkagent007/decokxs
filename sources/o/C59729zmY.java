package o;

import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.zmY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59729zmY {
    public final InterfaceC59612zkN AEQbTJ;

    public C59729zmY(InterfaceC59612zkN interfaceC59612zkN) {
        this.AEQbTJ = (InterfaceC59612zkN) C59851zoo.AEQbTJ(interfaceC59612zkN, "Content length strategy");
    }

    public C59614zkP copydefault(InterfaceC59758znA interfaceC59758znA, InterfaceC59581zjj interfaceC59581zjj) throws HttpException, java.io.IOException {
        C59614zkP c59614zkP = new C59614zkP();
        long jOLrzqt = this.AEQbTJ.OLrzqt(interfaceC59581zjj);
        if (jOLrzqt == -2) {
            c59614zkP.setChunked(true);
            c59614zkP.AEQbTJ(-1L);
            c59614zkP.copydefault(new C59795znl(interfaceC59758znA));
        } else if (jOLrzqt == -1) {
            c59614zkP.setChunked(false);
            c59614zkP.AEQbTJ(-1L);
            c59614zkP.copydefault(new C59797znn(interfaceC59758znA));
        } else {
            c59614zkP.setChunked(false);
            c59614zkP.AEQbTJ(jOLrzqt);
            c59614zkP.copydefault(new C59793znj(interfaceC59758znA, jOLrzqt));
        }
        InterfaceC59518ziZ firstHeader = interfaceC59581zjj.getFirstHeader("Content-Type");
        if (firstHeader != null) {
            c59614zkP.setContentType(firstHeader);
        }
        InterfaceC59518ziZ firstHeader2 = interfaceC59581zjj.getFirstHeader("Content-Encoding");
        if (firstHeader2 != null) {
            c59614zkP.setContentEncoding(firstHeader2);
        }
        return c59614zkP;
    }

    public InterfaceC59576zje OLrzqt(InterfaceC59758znA interfaceC59758znA, InterfaceC59581zjj interfaceC59581zjj) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59758znA, "Session input buffer");
        C59851zoo.AEQbTJ(interfaceC59581zjj, "HTTP message");
        return copydefault(interfaceC59758znA, interfaceC59581zjj);
    }
}
