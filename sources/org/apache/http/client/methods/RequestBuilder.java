package org.apache.http.client.methods;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o.C59514ziV;
import o.C59841zoe;
import o.C59851zoo;
import o.InterfaceC59518ziZ;
import o.InterfaceC59574zjc;
import o.InterfaceC59576zje;
import o.InterfaceC59577zjf;
import o.InterfaceC59578zjg;
import o.InterfaceC59582zjk;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderGroup;

/* JADX INFO: loaded from: classes13.dex */
public class RequestBuilder {
    private Charset charset;
    private RequestConfig config;
    private InterfaceC59576zje entity;
    private HeaderGroup headergroup;
    private String method;
    private List<InterfaceC59582zjk> parameters;
    private URI uri;
    private ProtocolVersion version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Charset getCharset() {
        return this.charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59576zje getEntity() {
        return this.entity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URI getUri() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolVersion getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestBuilder setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestBuilder setConfig(RequestConfig requestConfig) {
        this.config = requestConfig;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestBuilder setEntity(InterfaceC59576zje interfaceC59576zje) {
        this.entity = interfaceC59576zje;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestBuilder setUri(URI uri) {
        this.uri = uri;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestBuilder setVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
        return this;
    }

    public RequestBuilder(String str) {
        this.charset = C59514ziV.KWHzl;
        this.method = str;
    }

    public RequestBuilder(String str, URI uri) {
        this.method = str;
        this.uri = uri;
    }

    public RequestBuilder(String str, String str2) {
        this.method = str;
        this.uri = str2 != null ? URI.create(str2) : null;
    }

    public RequestBuilder() {
        this(null);
    }

    public static RequestBuilder create(String str) {
        C59851zoo.copydefault(str, "HTTP method");
        return new RequestBuilder(str);
    }

    public static RequestBuilder get() {
        return new RequestBuilder("GET");
    }

    public static RequestBuilder get(URI uri) {
        return new RequestBuilder("GET", uri);
    }

    public static RequestBuilder get(String str) {
        return new RequestBuilder("GET", str);
    }

    public static RequestBuilder head() {
        return new RequestBuilder("HEAD");
    }

    public static RequestBuilder head(URI uri) {
        return new RequestBuilder("HEAD", uri);
    }

    public static RequestBuilder head(String str) {
        return new RequestBuilder("HEAD", str);
    }

    public static RequestBuilder patch() {
        return new RequestBuilder("PATCH");
    }

    public static RequestBuilder patch(URI uri) {
        return new RequestBuilder("PATCH", uri);
    }

    public static RequestBuilder patch(String str) {
        return new RequestBuilder("PATCH", str);
    }

    public static RequestBuilder post() {
        return new RequestBuilder("POST");
    }

    public static RequestBuilder post(URI uri) {
        return new RequestBuilder("POST", uri);
    }

    public static RequestBuilder post(String str) {
        return new RequestBuilder("POST", str);
    }

    public static RequestBuilder put() {
        return new RequestBuilder("PUT");
    }

    public static RequestBuilder put(URI uri) {
        return new RequestBuilder("PUT", uri);
    }

    public static RequestBuilder put(String str) {
        return new RequestBuilder("PUT", str);
    }

    public static RequestBuilder delete() {
        return new RequestBuilder("DELETE");
    }

    public static RequestBuilder delete(URI uri) {
        return new RequestBuilder("DELETE", uri);
    }

    public static RequestBuilder delete(String str) {
        return new RequestBuilder("DELETE", str);
    }

    public static RequestBuilder trace() {
        return new RequestBuilder("TRACE");
    }

    public static RequestBuilder trace(URI uri) {
        return new RequestBuilder("TRACE", uri);
    }

    public static RequestBuilder trace(String str) {
        return new RequestBuilder("TRACE", str);
    }

    public static RequestBuilder options() {
        return new RequestBuilder("OPTIONS");
    }

    public static RequestBuilder options(URI uri) {
        return new RequestBuilder("OPTIONS", uri);
    }

    public static RequestBuilder options(String str) {
        return new RequestBuilder("OPTIONS", str);
    }

    public static RequestBuilder copy(InterfaceC59577zjf interfaceC59577zjf) {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        return new RequestBuilder().doCopy(interfaceC59577zjf);
    }

    private RequestBuilder doCopy(InterfaceC59577zjf interfaceC59577zjf) {
        if (interfaceC59577zjf == null) {
            return this;
        }
        this.method = interfaceC59577zjf.getRequestLine().getMethod();
        this.version = interfaceC59577zjf.getRequestLine().getProtocolVersion();
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.clear();
        this.headergroup.setHeaders(interfaceC59577zjf.getAllHeaders());
        this.parameters = null;
        this.entity = null;
        if (interfaceC59577zjf instanceof InterfaceC59578zjg) {
            InterfaceC59576zje entity = ((InterfaceC59578zjg) interfaceC59577zjf).getEntity();
            ContentType contentType = ContentType.get(entity);
            if (contentType == null || !contentType.getMimeType().equals(ContentType.APPLICATION_FORM_URLENCODED.getMimeType())) {
                this.entity = entity;
            } else {
                try {
                    List<InterfaceC59582zjk> list = URLEncodedUtils.parse(entity);
                    if (!list.isEmpty()) {
                        this.parameters = list;
                    }
                } catch (IOException unused) {
                }
            }
        }
        if (interfaceC59577zjf instanceof HttpUriRequest) {
            this.uri = ((HttpUriRequest) interfaceC59577zjf).getURI();
        } else {
            this.uri = URI.create(interfaceC59577zjf.getRequestLine().getUri());
        }
        if (interfaceC59577zjf instanceof Configurable) {
            this.config = ((Configurable) interfaceC59577zjf).getConfig();
        } else {
            this.config = null;
        }
        return this;
    }

    public RequestBuilder setUri(String str) {
        this.uri = str != null ? URI.create(str) : null;
        return this;
    }

    public InterfaceC59518ziZ getFirstHeader(String str) {
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            return headerGroup.getFirstHeader(str);
        }
        return null;
    }

    public InterfaceC59518ziZ getLastHeader(String str) {
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            return headerGroup.getLastHeader(str);
        }
        return null;
    }

    public InterfaceC59518ziZ[] getHeaders(String str) {
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            return headerGroup.getHeaders(str);
        }
        return null;
    }

    public RequestBuilder addHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.addHeader(interfaceC59518ziZ);
        return this;
    }

    public RequestBuilder addHeader(String str, String str2) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.addHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder removeHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.removeHeader(interfaceC59518ziZ);
        return this;
    }

    public RequestBuilder removeHeaders(String str) {
        HeaderGroup headerGroup;
        if (str != null && (headerGroup = this.headergroup) != null) {
            InterfaceC59574zjc it = headerGroup.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.OLrzqt().getName())) {
                    it.remove();
                }
            }
        }
        return this;
    }

    public RequestBuilder setHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.updateHeader(interfaceC59518ziZ);
        return this;
    }

    public RequestBuilder setHeader(String str, String str2) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.updateHeader(new BasicHeader(str, str2));
        return this;
    }

    public List<InterfaceC59582zjk> getParameters() {
        return this.parameters != null ? new ArrayList(this.parameters) : new ArrayList();
    }

    public RequestBuilder addParameter(InterfaceC59582zjk interfaceC59582zjk) {
        C59851zoo.AEQbTJ(interfaceC59582zjk, "Name value pair");
        if (this.parameters == null) {
            this.parameters = new LinkedList();
        }
        this.parameters.add(interfaceC59582zjk);
        return this;
    }

    public RequestBuilder addParameter(String str, String str2) {
        return addParameter(new BasicNameValuePair(str, str2));
    }

    public RequestBuilder addParameters(InterfaceC59582zjk... interfaceC59582zjkArr) {
        for (InterfaceC59582zjk interfaceC59582zjk : interfaceC59582zjkArr) {
            addParameter(interfaceC59582zjk);
        }
        return this;
    }

    public HttpUriRequest build() {
        HttpRequestBase internalRequest;
        URI uriBuild = this.uri;
        if (uriBuild == null) {
            uriBuild = URI.create("/");
        }
        InterfaceC59576zje urlEncodedFormEntity = this.entity;
        List<InterfaceC59582zjk> list = this.parameters;
        if (list != null && !list.isEmpty()) {
            if (urlEncodedFormEntity == null && ("POST".equalsIgnoreCase(this.method) || "PUT".equalsIgnoreCase(this.method))) {
                List<InterfaceC59582zjk> list2 = this.parameters;
                Charset charset = this.charset;
                if (charset == null) {
                    charset = C59841zoe.OLrzqt;
                }
                urlEncodedFormEntity = new UrlEncodedFormEntity(list2, charset);
            } else {
                try {
                    uriBuild = new URIBuilder(uriBuild).setCharset(this.charset).addParameters(this.parameters).build();
                } catch (URISyntaxException unused) {
                }
            }
        }
        if (urlEncodedFormEntity == null) {
            internalRequest = new InternalRequest(this.method);
        } else {
            InternalEntityEclosingRequest internalEntityEclosingRequest = new InternalEntityEclosingRequest(this.method);
            internalEntityEclosingRequest.setEntity(urlEncodedFormEntity);
            internalRequest = internalEntityEclosingRequest;
        }
        internalRequest.setProtocolVersion(this.version);
        internalRequest.setURI(uriBuild);
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            internalRequest.setHeaders(headerGroup.getAllHeaders());
        }
        internalRequest.setConfig(this.config);
        return internalRequest;
    }

    public static class InternalRequest extends HttpRequestBase {
        private final String method;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.method;
        }

        public InternalRequest(String str) {
            this.method = str;
        }
    }

    public static class InternalEntityEclosingRequest extends HttpEntityEnclosingRequestBase {
        private final String method;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.method;
        }

        public InternalEntityEclosingRequest(String str) {
            this.method = str;
        }
    }
}
