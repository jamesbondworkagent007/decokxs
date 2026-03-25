package com.okinc.business.defi.biz.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RpcRequestBody {
    private final int id;
    private final String jsonrpc;
    private final String method;
    private final JsonArray params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RpcRequestBody copy$default(RpcRequestBody rpcRequestBody, String str, String str2, JsonArray jsonArray, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rpcRequestBody.jsonrpc;
        }
        if ((i2 & 2) != 0) {
            str2 = rpcRequestBody.method;
        }
        if ((i2 & 4) != 0) {
            jsonArray = rpcRequestBody.params;
        }
        if ((i2 & 8) != 0) {
            i = rpcRequestBody.id;
        }
        return rpcRequestBody.copy(str, str2, jsonArray, i);
    }

    @EncodeDefault
    public static /* synthetic */ void getId$annotations() {
    }

    @EncodeDefault
    public static /* synthetic */ void getJsonrpc$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RpcRequestBody copy(@NotNull String str, @NotNull String str2, @NotNull JsonArray jsonArray, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new RpcRequestBody(str, str2, jsonArray, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RpcRequestBody)) {
            return false;
        }
        RpcRequestBody rpcRequestBody = (RpcRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) rpcRequestBody.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) rpcRequestBody.method) && Intrinsics.EZpvd(this.params, rpcRequestBody.params) && this.id == rpcRequestBody.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.jsonrpc.hashCode() * 31) + this.method.hashCode()) * 31) + this.params.hashCode()) * 31) + Integer.hashCode(this.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RpcRequestBody(jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ", id=" + this.id + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.rpc.RpcRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RpcRequestBody> serializer() {
            return RpcRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RpcRequestBody(int i, String str, String str2, JsonArray jsonArray, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, RpcRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.jsonrpc = (i & 1) == 0 ? "2.0" : str;
        this.method = str2;
        this.params = jsonArray;
        if ((i & 8) == 0) {
            this.id = 1;
        } else {
            this.id = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RpcRequestBody rpcRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rpcRequestBody.jsonrpc);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rpcRequestBody.method);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, JsonArraySerializer.INSTANCE, rpcRequestBody.params);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, rpcRequestBody.id);
    }

    public RpcRequestBody(@NotNull String str, @NotNull String str2, @NotNull JsonArray jsonArray, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.jsonrpc = str;
        this.method = str2;
        this.params = jsonArray;
        this.id = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (r2v0 java.lang.String)
  (r3v0 kotlinx.serialization.json.JsonArray)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonArray, int):void (m)] (LINE:13) call: com.okinc.business.defi.biz.rpc.RpcRequestBody.<init>(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonArray, int):void type: THIS */
    public /* synthetic */ RpcRequestBody(String str, String str2, JsonArray jsonArray, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "2.0" : str, str2, jsonArray, (i2 & 8) != 0 ? 1 : i);
    }
}
