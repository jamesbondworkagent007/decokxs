package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.HttpException;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.zof, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59842zof implements InterfaceC59580zji {
    public final boolean OLrzqt;

    public C59842zof() {
        this(false);
    }

    public C59842zof(boolean z) {
        this.OLrzqt = z;
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf instanceof InterfaceC59578zjg) {
            if (this.OLrzqt) {
                interfaceC59577zjf.removeHeaders(HttpHeaders.TRANSFER_ENCODING);
                interfaceC59577zjf.removeHeaders("Content-Length");
            } else {
                if (interfaceC59577zjf.containsHeader(HttpHeaders.TRANSFER_ENCODING)) {
                    throw new ProtocolException("Transfer-encoding header already present");
                }
                if (interfaceC59577zjf.containsHeader("Content-Length")) {
                    throw new ProtocolException("Content-Length header already present");
                }
            }
            ProtocolVersion protocolVersion = interfaceC59577zjf.getRequestLine().getProtocolVersion();
            InterfaceC59576zje entity = ((InterfaceC59578zjg) interfaceC59577zjf).getEntity();
            if (entity == null) {
                interfaceC59577zjf.addHeader("Content-Length", "0");
                return;
            }
            if (entity.isChunked() || entity.getContentLength() < 0) {
                if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    throw new ProtocolException("Chunked transfer encoding not allowed for " + protocolVersion);
                }
                interfaceC59577zjf.addHeader(HttpHeaders.TRANSFER_ENCODING, "chunked");
            } else {
                interfaceC59577zjf.addHeader("Content-Length", java.lang.Long.toString(entity.getContentLength()));
            }
            if (entity.getContentType() != null && !interfaceC59577zjf.containsHeader("Content-Type")) {
                interfaceC59577zjf.addHeader(entity.getContentType());
            }
            if (entity.getContentEncoding() == null || interfaceC59577zjf.containsHeader("Content-Encoding")) {
                return;
            }
            interfaceC59577zjf.addHeader(entity.getContentEncoding());
        }
    }
}
