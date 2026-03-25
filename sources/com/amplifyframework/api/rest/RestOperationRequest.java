package com.amplifyframework.api.rest;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.util.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class RestOperationRequest {
    private final byte[] data;
    private final Map<String, String> headers;
    private final HttpMethod httpMethod;
    private final String path;
    private final Map<String, String> queryParameters;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    public RestOperationRequest(HttpMethod httpMethod, String str, byte[] bArr, Map<String, String> map, Map<String, String> map2) {
        this.httpMethod = httpMethod;
        this.path = str;
        this.headers = map == null ? Collections.emptyMap() : Immutable.of(map);
        this.data = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.queryParameters = map2 == null ? Collections.emptyMap() : Immutable.of(map2);
    }

    public RestOperationRequest(HttpMethod httpMethod, String str, Map<String, String> map, Map<String, String> map2) {
        this(httpMethod, str, null, map, map2);
    }

    public String toString() {
        return "RestOperationRequest{httpMethod=" + this.httpMethod + ", path='" + this.path + "', data=" + Arrays.toString(this.data) + ", headers=" + this.headers + ", queryParameters=" + this.queryParameters + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestOperationRequest.class != obj.getClass()) {
            return false;
        }
        RestOperationRequest restOperationRequest = (RestOperationRequest) obj;
        if (ObjectsCompat.equals(getHttpMethod(), restOperationRequest.getHttpMethod()) && ObjectsCompat.equals(getPath(), restOperationRequest.getPath()) && ObjectsCompat.equals(getData(), restOperationRequest.getData()) && ObjectsCompat.equals(getHeaders(), restOperationRequest.getHeaders())) {
            return ObjectsCompat.equals(getQueryParameters(), restOperationRequest.getQueryParameters());
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = getHttpMethod() != null ? getHttpMethod().hashCode() : 0;
        int iHashCode2 = getPath() != null ? getPath().hashCode() : 0;
        int iHashCode3 = Arrays.hashCode(getData());
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (getHeaders() != null ? getHeaders().hashCode() : 0)) * 31) + (getQueryParameters() != null ? getQueryParameters().hashCode() : 0);
    }
}
