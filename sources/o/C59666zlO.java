package o;

import java.net.URISyntaxException;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicRequestLine;

/* JADX INFO: renamed from: o.zlO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59666zlO extends AbstractC59759znB implements HttpUriRequest {
    public java.lang.String AEQbTJ;
    public java.net.URI AhwBna;
    public final InterfaceC59577zjf EZpvd;
    public int KWHzl;
    public ProtocolVersion gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59577zjf AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.KWHzl++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.net.URI uri) {
        this.AhwBna = uri;
    }

    public boolean OLrzqt() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.client.methods.HttpUriRequest
    public java.lang.String getMethod() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.client.methods.HttpUriRequest
    public java.net.URI getURI() {
        return this.AhwBna;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    public C59666zlO(InterfaceC59577zjf interfaceC59577zjf) throws ProtocolException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        this.EZpvd = interfaceC59577zjf;
        setParams(interfaceC59577zjf.getParams());
        setHeaders(interfaceC59577zjf.getAllHeaders());
        if (interfaceC59577zjf instanceof HttpUriRequest) {
            HttpUriRequest httpUriRequest = (HttpUriRequest) interfaceC59577zjf;
            this.AhwBna = httpUriRequest.getURI();
            this.AEQbTJ = httpUriRequest.getMethod();
            this.gEmmrt = null;
        } else {
            InterfaceC59591zjt requestLine = interfaceC59577zjf.getRequestLine();
            try {
                this.AhwBna = new java.net.URI(requestLine.getUri());
                this.AEQbTJ = requestLine.getMethod();
                this.gEmmrt = interfaceC59577zjf.getProtocolVersion();
            } catch (URISyntaxException e) {
                throw new ProtocolException("Invalid request URI: " + requestLine.getUri(), e);
            }
        }
        this.KWHzl = 0;
    }

    public void copydefault() {
        this.headergroup.clear();
        setHeaders(this.EZpvd.getAllHeaders());
    }

    @Override // o.InterfaceC59581zjj
    public ProtocolVersion getProtocolVersion() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C59781znX.copydefault(getParams());
        }
        return this.gEmmrt;
    }

    @Override // o.InterfaceC59577zjf
    public InterfaceC59591zjt getRequestLine() {
        ProtocolVersion protocolVersion = getProtocolVersion();
        java.net.URI uri = this.AhwBna;
        java.lang.String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new BasicRequestLine(getMethod(), aSCIIString, protocolVersion);
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException();
    }
}
