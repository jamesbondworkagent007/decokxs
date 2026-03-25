package o;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIUtils;

/* JADX INFO: renamed from: o.zlq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59694zlq implements HttpClient, java.io.Closeable {
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    public abstract CloseableHttpResponse doExecute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws java.io.IOException;

    /* JADX DEBUG: Method merged with bridge method: execute(Lorg/apache/http/HttpHost;Lo/zjf;Lo/zob;)Lo/zjm; */
    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws java.io.IOException {
        return doExecute(httpHost, interfaceC59577zjf, interfaceC59838zob);
    }

    /* JADX DEBUG: Method merged with bridge method: execute(Lorg/apache/http/client/methods/HttpUriRequest;Lo/zob;)Lo/zjm; */
    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpUriRequest httpUriRequest, InterfaceC59838zob interfaceC59838zob) throws java.io.IOException {
        C59851zoo.AEQbTJ(httpUriRequest, "HTTP request");
        return doExecute(determineTarget(httpUriRequest), httpUriRequest, interfaceC59838zob);
    }

    public static HttpHost determineTarget(HttpUriRequest httpUriRequest) throws ClientProtocolException {
        java.net.URI uri = httpUriRequest.getURI();
        if (!uri.isAbsolute()) {
            return null;
        }
        HttpHost httpHostExtractHost = URIUtils.extractHost(uri);
        if (httpHostExtractHost != null) {
            return httpHostExtractHost;
        }
        throw new ClientProtocolException("URI does not specify a valid host name: " + uri);
    }

    /* JADX DEBUG: Method merged with bridge method: execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lo/zjm; */
    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpUriRequest httpUriRequest) throws java.io.IOException {
        return execute(httpUriRequest, (InterfaceC59838zob) null);
    }

    /* JADX DEBUG: Method merged with bridge method: execute(Lorg/apache/http/HttpHost;Lo/zjf;)Lo/zjm; */
    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf) throws java.io.IOException {
        return doExecute(httpHost, interfaceC59577zjf, null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws java.io.IOException {
        return (T) execute(httpUriRequest, responseHandler, (InterfaceC59838zob) null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, InterfaceC59838zob interfaceC59838zob) throws java.io.IOException {
        return (T) execute(determineTarget(httpUriRequest), httpUriRequest, responseHandler, interfaceC59838zob);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, ResponseHandler<? extends T> responseHandler) throws java.io.IOException {
        return (T) execute(httpHost, interfaceC59577zjf, responseHandler, null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, ResponseHandler<? extends T> responseHandler, InterfaceC59838zob interfaceC59838zob) throws java.io.IOException {
        C59851zoo.AEQbTJ(responseHandler, "Response handler");
        CloseableHttpResponse closeableHttpResponseExecute = execute(httpHost, interfaceC59577zjf, interfaceC59838zob);
        try {
            try {
                T tHandleResponse = responseHandler.handleResponse(closeableHttpResponseExecute);
                C59855zos.KWHzl(closeableHttpResponseExecute.EZpvd());
                return tHandleResponse;
            } catch (ClientProtocolException e) {
                try {
                    C59855zos.KWHzl(closeableHttpResponseExecute.EZpvd());
                } catch (java.lang.Exception e2) {
                    this.log.warn("Error consuming content after an exception.", e2);
                }
                throw e;
            }
        } finally {
            closeableHttpResponseExecute.close();
        }
    }
}
