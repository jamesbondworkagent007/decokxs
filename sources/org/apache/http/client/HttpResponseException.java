package org.apache.http.client;

/* JADX INFO: loaded from: classes24.dex */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpResponseException(int i, String str) {
        super(str);
        this.statusCode = i;
    }
}
