package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.zla, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59678zla implements InterfaceC59515ziW {
    public static final C59678zla EZpvd = new C59678zla();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (java.lang.Integer.parseInt(r8[0].getValue()) < 0) goto L22;
     */
    @Override // o.InterfaceC59515ziW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean OLrzqt(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        C59772znO c59772znO;
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        InterfaceC59577zjf interfaceC59577zjf = (InterfaceC59577zjf) interfaceC59838zob.getAttribute(C59840zod.HTTP_REQUEST);
        if (interfaceC59577zjf != null) {
            try {
                c59772znO = new C59772znO(interfaceC59577zjf.headerIterator(HttpHeaders.CONNECTION));
            } catch (org.apache.http.ParseException unused) {
            }
            while (c59772znO.hasNext()) {
                if ("Close".equalsIgnoreCase(c59772znO.EZpvd())) {
                    return false;
                }
            }
        }
        ProtocolVersion protocolVersion = interfaceC59584zjm.AEQbTJ().getProtocolVersion();
        InterfaceC59518ziZ firstHeader = interfaceC59584zjm.getFirstHeader(HttpHeaders.TRANSFER_ENCODING);
        if (firstHeader != null) {
            if (!"chunked".equalsIgnoreCase(firstHeader.getValue())) {
                return false;
            }
        } else if (AEQbTJ(interfaceC59577zjf, interfaceC59584zjm)) {
            InterfaceC59518ziZ[] headers = interfaceC59584zjm.getHeaders("Content-Length");
            if (headers.length == 1) {
            }
            return false;
        }
        InterfaceC59574zjc interfaceC59574zjcHeaderIterator = interfaceC59584zjm.headerIterator(HttpHeaders.CONNECTION);
        if (!interfaceC59574zjcHeaderIterator.hasNext()) {
            interfaceC59574zjcHeaderIterator = interfaceC59584zjm.headerIterator("Proxy-Connection");
        }
        if (interfaceC59574zjcHeaderIterator.hasNext()) {
            try {
                C59772znO c59772znO2 = new C59772znO(interfaceC59574zjcHeaderIterator);
                boolean z = false;
                while (c59772znO2.hasNext()) {
                    java.lang.String strEZpvd = c59772znO2.EZpvd();
                    if ("Close".equalsIgnoreCase(strEZpvd)) {
                        return false;
                    }
                    if (HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(strEZpvd)) {
                        z = true;
                    }
                }
                if (z) {
                    return true;
                }
            } catch (org.apache.http.ParseException unused2) {
                return false;
            }
        }
        return !protocolVersion.lessEquals(HttpVersion.HTTP_1_0);
    }

    public final boolean AEQbTJ(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm) {
        int statusCode;
        return ((interfaceC59577zjf != null && interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase("HEAD")) || (statusCode = interfaceC59584zjm.AEQbTJ().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }
}
