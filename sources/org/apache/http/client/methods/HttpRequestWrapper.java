package org.apache.http.client.methods;

import com.google.common.net.HttpHeaders;
import java.net.URI;
import o.AbstractC59759znB;
import o.C59851zoo;
import o.InterfaceC59518ziZ;
import o.InterfaceC59576zje;
import o.InterfaceC59577zjf;
import o.InterfaceC59578zjg;
import o.InterfaceC59591zjt;
import o.InterfaceC59779znV;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicRequestLine;

/* JADX INFO: loaded from: classes24.dex */
public class HttpRequestWrapper extends AbstractC59759znB implements HttpUriRequest {
    private final String method;
    private final InterfaceC59577zjf original;
    private InterfaceC59591zjt requestLine;
    private final HttpHost target;
    private URI uri;
    private ProtocolVersion version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59577zjf getOriginal() {
        return this.original;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpHost getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
        this.requestLine = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setURI(URI uri) {
        this.uri = uri;
        this.requestLine = null;
    }

    private HttpRequestWrapper(InterfaceC59577zjf interfaceC59577zjf, HttpHost httpHost) {
        InterfaceC59577zjf interfaceC59577zjf2 = (InterfaceC59577zjf) C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        this.original = interfaceC59577zjf2;
        this.target = httpHost;
        this.version = interfaceC59577zjf2.getRequestLine().getProtocolVersion();
        this.method = interfaceC59577zjf2.getRequestLine().getMethod();
        this.uri = interfaceC59577zjf instanceof HttpUriRequest ? ((HttpUriRequest) interfaceC59577zjf).getURI() : null;
        setHeaders(interfaceC59577zjf.getAllHeaders());
    }

    @Override // o.InterfaceC59581zjj
    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.version;
        return protocolVersion != null ? protocolVersion : this.original.getProtocolVersion();
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC59577zjf
    public InterfaceC59591zjt getRequestLine() {
        String uri;
        if (this.requestLine == null) {
            URI uri2 = this.uri;
            if (uri2 != null) {
                uri = uri2.toASCIIString();
            } else {
                uri = this.original.getRequestLine().getUri();
            }
            if (uri == null || uri.isEmpty()) {
                uri = "/";
            }
            this.requestLine = new BasicRequestLine(this.method, uri, getProtocolVersion());
        }
        return this.requestLine;
    }

    public String toString() {
        return getRequestLine() + " " + this.headergroup;
    }

    public static class HttpEntityEnclosingRequestWrapper extends HttpRequestWrapper implements InterfaceC59578zjg {
        private InterfaceC59576zje entity;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59578zjg
        public InterfaceC59576zje getEntity() {
            return this.entity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59578zjg
        public void setEntity(InterfaceC59576zje interfaceC59576zje) {
            this.entity = interfaceC59576zje;
        }

        public HttpEntityEnclosingRequestWrapper(InterfaceC59578zjg interfaceC59578zjg, HttpHost httpHost) {
            super(interfaceC59578zjg, httpHost);
            this.entity = interfaceC59578zjg.getEntity();
        }

        @Override // o.InterfaceC59578zjg
        public boolean expectContinue() {
            InterfaceC59518ziZ firstHeader = getFirstHeader(HttpHeaders.EXPECT);
            return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
        }
    }

    public static HttpRequestWrapper wrap(InterfaceC59577zjf interfaceC59577zjf) {
        return wrap(interfaceC59577zjf, null);
    }

    public static HttpRequestWrapper wrap(InterfaceC59577zjf interfaceC59577zjf, HttpHost httpHost) {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf instanceof InterfaceC59578zjg) {
            return new HttpEntityEnclosingRequestWrapper((InterfaceC59578zjg) interfaceC59577zjf, httpHost);
        }
        return new HttpRequestWrapper(interfaceC59577zjf, httpHost);
    }

    @Override // o.AbstractC59759znB, o.InterfaceC59581zjj
    @Deprecated
    public InterfaceC59779znV getParams() {
        if (this.params == null) {
            this.params = this.original.getParams().copy();
        }
        return this.params;
    }
}
