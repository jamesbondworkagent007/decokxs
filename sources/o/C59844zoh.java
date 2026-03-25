package o;

import org.apache.http.HttpException;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.zoh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59844zoh {
    public final int OLrzqt;

    public C59844zoh(int i) {
        this.OLrzqt = C59851zoo.EZpvd(i, "Wait for continue time");
    }

    public C59844zoh() {
        this(3000);
    }

    public boolean KWHzl(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm) {
        int statusCode;
        return ("HEAD".equalsIgnoreCase(interfaceC59577zjf.getRequestLine().getMethod()) || (statusCode = interfaceC59584zjm.AEQbTJ().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public InterfaceC59584zjm KWHzl(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59573zjb interfaceC59573zjb, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59573zjb, "Client connection");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        try {
            InterfaceC59584zjm interfaceC59584zjmAEQbTJ = AEQbTJ(interfaceC59577zjf, interfaceC59573zjb, interfaceC59838zob);
            return interfaceC59584zjmAEQbTJ == null ? copydefault(interfaceC59577zjf, interfaceC59573zjb, interfaceC59838zob) : interfaceC59584zjmAEQbTJ;
        } catch (java.io.IOException e) {
            KWHzl(interfaceC59573zjb);
            throw e;
        } catch (java.lang.RuntimeException e2) {
            KWHzl(interfaceC59573zjb);
            throw e2;
        } catch (HttpException e3) {
            KWHzl(interfaceC59573zjb);
            throw e3;
        }
    }

    public static void KWHzl(InterfaceC59573zjb interfaceC59573zjb) {
        try {
            interfaceC59573zjb.close();
        } catch (java.io.IOException unused) {
        }
    }

    public void AEQbTJ(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59837zoa interfaceC59837zoa, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59837zoa, "HTTP processor");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        interfaceC59838zob.setAttribute(C59840zod.HTTP_REQUEST, interfaceC59577zjf);
        interfaceC59837zoa.process(interfaceC59577zjf, interfaceC59838zob);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC59584zjm AEQbTJ(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59573zjb interfaceC59573zjb, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        boolean z;
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59573zjb, "Client connection");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        interfaceC59838zob.setAttribute(C59840zod.HTTP_CONNECTION, interfaceC59573zjb);
        interfaceC59838zob.setAttribute(C59840zod.HTTP_REQ_SENT, java.lang.Boolean.FALSE);
        interfaceC59573zjb.EZpvd(interfaceC59577zjf);
        InterfaceC59584zjm interfaceC59584zjm = null;
        if (interfaceC59577zjf instanceof InterfaceC59578zjg) {
            ProtocolVersion protocolVersion = interfaceC59577zjf.getRequestLine().getProtocolVersion();
            InterfaceC59578zjg interfaceC59578zjg = (InterfaceC59578zjg) interfaceC59577zjf;
            if (!interfaceC59578zjg.expectContinue() || protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                z = true;
                if (z) {
                    interfaceC59573zjb.KWHzl(interfaceC59578zjg);
                }
            } else {
                interfaceC59573zjb.copydefault();
                if (interfaceC59573zjb.OLrzqt(this.OLrzqt)) {
                    InterfaceC59584zjm interfaceC59584zjmAEQbTJ = interfaceC59573zjb.AEQbTJ();
                    if (KWHzl(interfaceC59577zjf, interfaceC59584zjmAEQbTJ)) {
                        interfaceC59573zjb.OLrzqt(interfaceC59584zjmAEQbTJ);
                    }
                    int statusCode = interfaceC59584zjmAEQbTJ.AEQbTJ().getStatusCode();
                    if (statusCode < 200) {
                        if (statusCode != 100) {
                            throw new ProtocolException("Unexpected response: " + interfaceC59584zjmAEQbTJ.AEQbTJ());
                        }
                        z = true;
                        if (z) {
                        }
                    } else {
                        z = false;
                        interfaceC59584zjm = interfaceC59584zjmAEQbTJ;
                        if (z) {
                        }
                    }
                }
            }
        }
        interfaceC59573zjb.copydefault();
        interfaceC59838zob.setAttribute(C59840zod.HTTP_REQ_SENT, java.lang.Boolean.TRUE);
        return interfaceC59584zjm;
    }

    public InterfaceC59584zjm copydefault(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59573zjb interfaceC59573zjb, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59573zjb, "Client connection");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        InterfaceC59584zjm interfaceC59584zjmAEQbTJ = null;
        int statusCode = 0;
        while (true) {
            if (interfaceC59584zjmAEQbTJ != null && statusCode >= 200) {
                return interfaceC59584zjmAEQbTJ;
            }
            interfaceC59584zjmAEQbTJ = interfaceC59573zjb.AEQbTJ();
            if (KWHzl(interfaceC59577zjf, interfaceC59584zjmAEQbTJ)) {
                interfaceC59573zjb.OLrzqt(interfaceC59584zjmAEQbTJ);
            }
            statusCode = interfaceC59584zjmAEQbTJ.AEQbTJ().getStatusCode();
        }
    }

    public void EZpvd(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59837zoa interfaceC59837zoa, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        C59851zoo.AEQbTJ(interfaceC59837zoa, "HTTP processor");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        interfaceC59838zob.setAttribute(C59840zod.HTTP_RESPONSE, interfaceC59584zjm);
        interfaceC59837zoa.process(interfaceC59584zjm, interfaceC59838zob);
    }
}
