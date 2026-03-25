package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.HttpException;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;

/* JADX INFO: renamed from: o.znf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59789znf implements InterfaceC59612zkN {
    public static final C59789znf EZpvd = new C59789znf();
    public final int OLrzqt;

    public C59789znf(int i) {
        this.OLrzqt = i;
    }

    public C59789znf() {
        this(-1);
    }

    @Override // o.InterfaceC59612zkN
    public long OLrzqt(InterfaceC59581zjj interfaceC59581zjj) throws HttpException {
        C59851zoo.AEQbTJ(interfaceC59581zjj, "HTTP message");
        InterfaceC59518ziZ firstHeader = interfaceC59581zjj.getFirstHeader(HttpHeaders.TRANSFER_ENCODING);
        if (firstHeader != null) {
            java.lang.String value = firstHeader.getValue();
            if ("chunked".equalsIgnoreCase(value)) {
                if (!interfaceC59581zjj.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    return -2L;
                }
                throw new ProtocolException("Chunked transfer encoding not allowed for " + interfaceC59581zjj.getProtocolVersion());
            }
            if ("identity".equalsIgnoreCase(value)) {
                return -1L;
            }
            throw new ProtocolException("Unsupported transfer encoding: " + value);
        }
        InterfaceC59518ziZ firstHeader2 = interfaceC59581zjj.getFirstHeader("Content-Length");
        if (firstHeader2 == null) {
            return this.OLrzqt;
        }
        java.lang.String value2 = firstHeader2.getValue();
        try {
            long j = java.lang.Long.parseLong(value2);
            if (j >= 0) {
                return j;
            }
            throw new ProtocolException("Negative content length: " + value2);
        } catch (java.lang.NumberFormatException unused) {
            throw new ProtocolException("Invalid content length: " + value2);
        }
    }
}
