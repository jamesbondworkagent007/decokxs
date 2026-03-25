package com.okinc.business.defi.biz.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RpcRequestResponse {
    private final RpcRequestError error;
    private final Integer id;
    private final String jsonrpc;
    private final JsonElement result;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RpcRequestResponse() {
        this((String) null, (RpcRequestError) null, (JsonElement) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RpcRequestResponse copy$default(RpcRequestResponse rpcRequestResponse, String str, RpcRequestError rpcRequestError, JsonElement jsonElement, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rpcRequestResponse.jsonrpc;
        }
        if ((i & 2) != 0) {
            rpcRequestError = rpcRequestResponse.error;
        }
        if ((i & 4) != 0) {
            jsonElement = rpcRequestResponse.result;
        }
        if ((i & 8) != 0) {
            num = rpcRequestResponse.id;
        }
        return rpcRequestResponse.copy(str, rpcRequestError, jsonElement, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RpcRequestError component2() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component3() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RpcRequestResponse copy(String str, RpcRequestError rpcRequestError, JsonElement jsonElement, Integer num) {
        return new RpcRequestResponse(str, rpcRequestError, jsonElement, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RpcRequestResponse)) {
            return false;
        }
        RpcRequestResponse rpcRequestResponse = (RpcRequestResponse) obj;
        return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) rpcRequestResponse.jsonrpc) && Intrinsics.EZpvd(this.error, rpcRequestResponse.error) && Intrinsics.EZpvd(this.result, rpcRequestResponse.result) && Intrinsics.EZpvd(this.id, rpcRequestResponse.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RpcRequestError getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.jsonrpc;
        int iHashCode = str == null ? 0 : str.hashCode();
        RpcRequestError rpcRequestError = this.error;
        int iHashCode2 = rpcRequestError == null ? 0 : rpcRequestError.hashCode();
        JsonElement jsonElement = this.result;
        int iHashCode3 = jsonElement == null ? 0 : jsonElement.hashCode();
        Integer num = this.id;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RpcRequestResponse(jsonrpc=" + this.jsonrpc + ", error=" + this.error + ", result=" + this.result + ", id=" + this.id + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.rpc.RpcRequestResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RpcRequestResponse> serializer() {
            return RpcRequestResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RpcRequestResponse(int i, String str, RpcRequestError rpcRequestError, JsonElement jsonElement, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.jsonrpc = (i & 1) == 0 ? "2.0" : str;
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = rpcRequestError;
        }
        if ((i & 4) == 0) {
            this.result = null;
        } else {
            this.result = jsonElement;
        }
        if ((i & 8) == 0) {
            this.id = 1;
        } else {
            this.id = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RpcRequestResponse rpcRequestResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rpcRequestResponse.jsonrpc, (Object) "2.0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rpcRequestResponse.jsonrpc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rpcRequestResponse.error != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, RpcRequestError$$serializer.INSTANCE, rpcRequestResponse.error);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rpcRequestResponse.result != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, rpcRequestResponse.result);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num = rpcRequestResponse.id) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, rpcRequestResponse.id);
        }
    }

    public RpcRequestResponse(String str, RpcRequestError rpcRequestError, JsonElement jsonElement, Integer num) {
        this.jsonrpc = str;
        this.error = rpcRequestError;
        this.result = jsonElement;
        this.id = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.rpc.RpcRequestError:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.rpc.RpcRequestError) : (r3v0 com.okinc.business.defi.biz.rpc.RpcRequestError))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r4v0 kotlinx.serialization.json.JsonElement))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, com.okinc.business.defi.biz.rpc.RpcRequestError, kotlinx.serialization.json.JsonElement, java.lang.Integer):void (m)] (LINE:24) call: com.okinc.business.defi.biz.rpc.RpcRequestResponse.<init>(java.lang.String, com.okinc.business.defi.biz.rpc.RpcRequestError, kotlinx.serialization.json.JsonElement, java.lang.Integer):void type: THIS */
    public /* synthetic */ RpcRequestResponse(String str, RpcRequestError rpcRequestError, JsonElement jsonElement, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "2.0" : str, (i & 2) != 0 ? null : rpcRequestError, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? 1 : num);
    }
}
