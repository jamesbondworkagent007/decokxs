package aws.smithy.kotlin.runtime.http.middleware;

import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import o.InterfaceC5037Ch;
import o.InterfaceC58725zN;

/* JADX INFO: loaded from: classes21.dex */
public final class HttpResponseException extends SdkBaseException {
    private byte[] body;
    private InterfaceC58725zN headers;
    private InterfaceC5037Ch request;
    private HttpStatusCode statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58725zN getHeaders() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5037Ch getRequest() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBody(byte[] bArr) {
        this.body = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaders(InterfaceC58725zN interfaceC58725zN) {
        this.headers = interfaceC58725zN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequest(InterfaceC5037Ch interfaceC5037Ch) {
        this.request = interfaceC5037Ch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatusCode(HttpStatusCode httpStatusCode) {
        this.statusCode = httpStatusCode;
    }

    public HttpResponseException() {
    }

    public HttpResponseException(String str) {
        super(str);
    }

    public HttpResponseException(String str, Throwable th) {
        super(str, th);
    }

    public HttpResponseException(Throwable th) {
        super(th);
    }
}
