package org.apache.http.client.methods;

import java.net.URI;

/* JADX INFO: loaded from: classes13.dex */
public class HttpGet extends HttpRequestBase {
    public static final String METHOD_NAME = "GET";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return "GET";
    }

    public HttpGet() {
    }

    public HttpGet(URI uri) {
        setURI(uri);
    }

    public HttpGet(String str) {
        setURI(URI.create(str));
    }
}
