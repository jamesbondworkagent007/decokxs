package org.apache.http.client;

import java.io.IOException;
import o.InterfaceC59551zjF;
import o.InterfaceC59577zjf;
import o.InterfaceC59584zjm;
import o.InterfaceC59779znV;
import o.InterfaceC59838zob;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpUriRequest;

/* JADX INFO: loaded from: classes13.dex */
public interface HttpClient {
    <T> T execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, ResponseHandler<? extends T> responseHandler) throws IOException;

    <T> T execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, ResponseHandler<? extends T> responseHandler, InterfaceC59838zob interfaceC59838zob) throws IOException;

    <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException;

    <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, InterfaceC59838zob interfaceC59838zob) throws IOException;

    InterfaceC59584zjm execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf) throws IOException;

    InterfaceC59584zjm execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws IOException;

    InterfaceC59584zjm execute(HttpUriRequest httpUriRequest) throws IOException;

    InterfaceC59584zjm execute(HttpUriRequest httpUriRequest, InterfaceC59838zob interfaceC59838zob) throws IOException;

    @Deprecated
    InterfaceC59551zjF getConnectionManager();

    @Deprecated
    InterfaceC59779znV getParams();
}
