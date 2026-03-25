package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* JADX INFO: renamed from: o.znd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59787znd implements InterfaceC59612zkN {
    public static final C59787znd KWHzl = new C59787znd();
    public final int copydefault;

    public C59787znd(int i) {
        this.copydefault = i;
    }

    public C59787znd() {
        this(-1);
    }

    @Override // o.InterfaceC59612zkN
    public long OLrzqt(InterfaceC59581zjj interfaceC59581zjj) throws HttpException {
        long j;
        C59851zoo.AEQbTJ(interfaceC59581zjj, "HTTP message");
        InterfaceC59518ziZ firstHeader = interfaceC59581zjj.getFirstHeader(HttpHeaders.TRANSFER_ENCODING);
        if (firstHeader != null) {
            try {
                InterfaceC59517ziY[] elements = firstHeader.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(firstHeader.getValue()) && length > 0 && "chunked".equalsIgnoreCase(elements[length + (-1)].copydefault())) ? -2L : -1L;
            } catch (org.apache.http.ParseException e) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e);
            }
        }
        if (interfaceC59581zjj.getFirstHeader("Content-Length") == null) {
            return this.copydefault;
        }
        InterfaceC59518ziZ[] headers = interfaceC59581zjj.getHeaders("Content-Length");
        int length2 = headers.length - 1;
        while (true) {
            if (length2 < 0) {
                j = -1;
                break;
            }
            try {
                j = java.lang.Long.parseLong(headers[length2].getValue());
                break;
            } catch (java.lang.NumberFormatException unused) {
                length2--;
            }
        }
        if (j >= 0) {
            return j;
        }
        return -1L;
    }
}
