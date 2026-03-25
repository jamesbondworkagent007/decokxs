package com.reown.android.internal.common;

import com.reown.android.internal.common.model.type.SerializableJsonRpc;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class JsonRpcResponse implements SerializableJsonRpc {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.JsonRpcResponse.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ JsonRpcResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getId();

    private JsonRpcResponse() {
    }

    @JsonClass(generateAdapter = false)
    public static final class JsonRpcResult extends JsonRpcResponse {
        public final long id;
        public final String jsonrpc;
        public final Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ JsonRpcResult copy$default(JsonRpcResult jsonRpcResult, long j, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                j = jsonRpcResult.id;
            }
            if ((i & 2) != 0) {
                str = jsonRpcResult.jsonrpc;
            }
            if ((i & 4) != 0) {
                obj = jsonRpcResult.result;
            }
            return jsonRpcResult.copy(j, str, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component3() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonRpcResult copy(long j, @NotNull String str, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return new JsonRpcResult(j, str, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsonRpcResult)) {
                return false;
            }
            JsonRpcResult jsonRpcResult = (JsonRpcResult) obj;
            return this.id == jsonRpcResult.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcResult.jsonrpc) && Intrinsics.EZpvd(this.result, jsonRpcResult.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.JsonRpcResponse
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.result.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "JsonRpcResult(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 java.lang.Object)
 A[MD:(long, java.lang.String, java.lang.Object):void (m)] (LINE:10) call: com.reown.android.internal.common.JsonRpcResponse.JsonRpcResult.<init>(long, java.lang.String, java.lang.Object):void type: THIS */
        public /* synthetic */ JsonRpcResult(long j, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? "2.0" : str, obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JsonRpcResult(long j, @NotNull String str, @NotNull Object obj) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(obj, "");
            this.id = j;
            this.jsonrpc = str;
            this.result = obj;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class JsonRpcError extends JsonRpcResponse {
        public final Error error;
        public final String errorMessage;
        public final long id;
        public final String jsonrpc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, long j, String str, Error error, int i, Object obj) {
            if ((i & 1) != 0) {
                j = jsonRpcError.id;
            }
            if ((i & 2) != 0) {
                str = jsonRpcError.jsonrpc;
            }
            if ((i & 4) != 0) {
                error = jsonRpcError.error;
            }
            return jsonRpcError.copy(j, str, error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error component3() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonRpcError copy(long j, @NotNull String str, @NotNull Error error) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(error, "");
            return new JsonRpcError(j, str, error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsonRpcError)) {
                return false;
            }
            JsonRpcError jsonRpcError = (JsonRpcError) obj;
            return this.id == jsonRpcError.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.JsonRpcResponse
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.error.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "JsonRpcError(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", error=" + this.error + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 com.reown.android.internal.common.JsonRpcResponse$Error)
 A[MD:(long, java.lang.String, com.reown.android.internal.common.JsonRpcResponse$Error):void (m)] (LINE:17) call: com.reown.android.internal.common.JsonRpcResponse.JsonRpcError.<init>(long, java.lang.String, com.reown.android.internal.common.JsonRpcResponse$Error):void type: THIS */
        public /* synthetic */ JsonRpcError(long j, String str, Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? "2.0" : str, error);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JsonRpcError(long j, @NotNull String str, @NotNull Error error) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(error, "");
            this.id = j;
            this.jsonrpc = str;
            this.error = error;
            this.errorMessage = error.getMessage() + " : code: " + error.getCode();
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class Error {
        public final int code;
        public final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = error.code;
            }
            if ((i2 & 2) != 0) {
                str = error.message;
            }
            return error.copy(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Error(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.code == error.code && Intrinsics.EZpvd((Object) this.message, (Object) error.message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(code=" + this.code + ", message=" + this.message + ")";
        }

        public Error(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.message = str;
        }
    }
}
