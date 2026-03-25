package com.amplifyframework.api.rest;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.util.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class RestOptions {
    private final byte[] data;
    private final Map<String, String> headers;
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
    public String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasData() {
        return this.data != null;
    }

    private RestOptions(String str, byte[] bArr, Map<String, String> map, Map<String, String> map2) {
        this.path = str;
        this.data = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.headers = map == null ? Collections.emptyMap() : Immutable.of(map);
        this.queryParameters = map2 == null ? Collections.emptyMap() : Immutable.of(map2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestOptions.class != obj.getClass()) {
            return false;
        }
        RestOptions restOptions = (RestOptions) obj;
        if (ObjectsCompat.equals(getPath(), restOptions.getPath()) && ObjectsCompat.equals(getData(), restOptions.getData()) && ObjectsCompat.equals(getHeaders(), restOptions.getHeaders())) {
            return ObjectsCompat.equals(getQueryParameters(), restOptions.getQueryParameters());
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = getPath() != null ? getPath().hashCode() : 0;
        int iHashCode2 = Arrays.hashCode(getData());
        return (((((iHashCode * 31) + iHashCode2) * 31) + (getHeaders() != null ? getHeaders().hashCode() : 0)) * 31) + (getQueryParameters() != null ? getQueryParameters().hashCode() : 0);
    }

    public String toString() {
        return "RestOptions{path='" + this.path + "', data=" + Arrays.toString(this.data) + ", headers=" + this.headers + ", queryParameters=" + this.queryParameters + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private byte[] data;
        private Map<String, String> headers;
        private String path;
        private Map<String, String> queryParameters;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder addBody(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder addPath(String str) {
            this.path = str;
            return this;
        }

        public Builder addQueryParameters(Map<String, String> map) {
            if (this.queryParameters == null) {
                this.queryParameters = new HashMap();
            }
            this.queryParameters.putAll(map);
            return this;
        }

        public Builder addHeaders(Map<String, String> map) {
            if (this.headers == null) {
                this.headers = new HashMap();
            }
            this.headers.putAll(map);
            return this;
        }

        public Builder addHeader(String str, String str2) {
            if (this.headers == null) {
                this.headers = new HashMap();
            }
            this.headers.put(str, str2);
            return this;
        }

        public RestOptions build() {
            return new RestOptions(this.path, this.data, this.headers, this.queryParameters);
        }
    }
}
