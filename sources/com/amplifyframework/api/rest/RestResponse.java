package com.amplifyframework.api.rest;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.util.Immutable;
import com.amplifyframework.util.Range;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class RestResponse {
    private final Code code;
    private final Data data;
    private final Map<String, String> headers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Code getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Data getData() {
        return this.data;
    }

    public RestResponse(int i, Map<String, String> map) {
        this(i, map, null);
    }

    public RestResponse(int i, Map<String, String> map, byte[] bArr) {
        this.data = new Data(bArr);
        this.headers = map;
        this.code = new Code(i);
    }

    public Map<String, String> getHeaders() {
        return Immutable.of(this.headers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestResponse.class != obj.getClass()) {
            return false;
        }
        RestResponse restResponse = (RestResponse) obj;
        if (ObjectsCompat.equals(getData(), restResponse.getData())) {
            return ObjectsCompat.equals(getCode(), restResponse.getCode());
        }
        return false;
    }

    public int hashCode() {
        return ((getData() != null ? getData().hashCode() : 0) * 31) + (getCode() != null ? getCode().hashCode() : 0);
    }

    public String toString() {
        return "RestResponse{data=" + this.data + ", code=" + this.code + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Data {
        private final byte[] rawBytes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] getRawBytes() {
            return this.rawBytes;
        }

        public Data(byte[] bArr) {
            this.rawBytes = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        }

        public String asString() {
            return new String(this.rawBytes);
        }

        public JSONObject asJSONObject() throws JSONException {
            return new JSONObject(asString());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Data.class != obj.getClass()) {
                return false;
            }
            return ObjectsCompat.equals(getRawBytes(), ((Data) obj).getRawBytes());
        }

        public int hashCode() {
            return Arrays.hashCode(getRawBytes());
        }

        public String toString() {
            return "Data{rawBytes=" + Arrays.toString(this.rawBytes) + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Code {
        private final int statusCode;
        private static final Range<Integer> ALL_VALID_CODES = new Range<>(100, 599);
        private static final Range<Integer> SERVICE_FAILURE_CODES = new Range<>(500, 599);
        private static final Range<Integer> CLIENT_ERROR_CODES = new Range<>(400, 499);
        private static final Range<Integer> SUCCESS_CODES = new Range<>(200, 299);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.statusCode;
        }

        public Code(int i) {
            this.statusCode = validateValue(i);
        }

        private int validateValue(int i) {
            if (ALL_VALID_CODES.contains(Integer.valueOf(i))) {
                return i;
            }
            return -1;
        }

        public boolean isServiceFailure() {
            return SERVICE_FAILURE_CODES.contains(Integer.valueOf(this.statusCode));
        }

        public boolean isClientError() {
            return CLIENT_ERROR_CODES.contains(Integer.valueOf(this.statusCode));
        }

        public boolean isSuccessful() {
            return SUCCESS_CODES.contains(Integer.valueOf(this.statusCode));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && Code.class == obj.getClass() && this.statusCode == ((Code) obj).statusCode;
        }

        public String toString() {
            return "Code{statusCode=" + this.statusCode + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
