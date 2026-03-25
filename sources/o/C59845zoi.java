package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.HttpException;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.zoi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59845zoi implements InterfaceC59580zji {
    public final boolean copydefault;

    @java.lang.Deprecated
    public C59845zoi() {
        this(false);
    }

    public C59845zoi(boolean z) {
        this.copydefault = z;
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf.containsHeader(HttpHeaders.EXPECT) || !(interfaceC59577zjf instanceof InterfaceC59578zjg)) {
            return;
        }
        ProtocolVersion protocolVersion = interfaceC59577zjf.getRequestLine().getProtocolVersion();
        InterfaceC59576zje entity = ((InterfaceC59578zjg) interfaceC59577zjf).getEntity();
        if (entity == null || entity.getContentLength() == 0 || protocolVersion.lessEquals(HttpVersion.HTTP_1_0) || !interfaceC59577zjf.getParams().getBooleanParameter("http.protocol.expect-continue", this.copydefault)) {
            return;
        }
        interfaceC59577zjf.addHeader(HttpHeaders.EXPECT, "100-continue");
    }
}
