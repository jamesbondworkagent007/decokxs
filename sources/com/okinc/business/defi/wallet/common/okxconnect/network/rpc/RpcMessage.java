package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RpcMessage {
    private final String id;
    private final String jsonrpc;
    private final String method;
    private final JsonObject params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RpcMessage copy$default(RpcMessage rpcMessage, String str, String str2, String str3, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rpcMessage.jsonrpc;
        }
        if ((i & 2) != 0) {
            str2 = rpcMessage.id;
        }
        if ((i & 4) != 0) {
            str3 = rpcMessage.method;
        }
        if ((i & 8) != 0) {
            jsonObject = rpcMessage.params;
        }
        return rpcMessage.copy(str, str2, str3, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.jsonrpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component4() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RpcMessage copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new RpcMessage(str, str2, str3, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RpcMessage)) {
            return false;
        }
        RpcMessage rpcMessage = (RpcMessage) obj;
        return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) rpcMessage.jsonrpc) && Intrinsics.EZpvd((Object) this.id, (Object) rpcMessage.id) && Intrinsics.EZpvd((Object) this.method, (Object) rpcMessage.method) && Intrinsics.EZpvd(this.params, rpcMessage.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
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
    public final JsonObject getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.jsonrpc.hashCode() * 31) + this.id.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RpcMessage(jsonrpc=" + this.jsonrpc + ", id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RpcMessage> serializer() {
            return RpcMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RpcMessage(int i, String str, String str2, String str3, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, RpcMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.jsonrpc = (i & 1) == 0 ? "2.0" : str;
        if ((i & 2) == 0) {
            this.id = String.valueOf(System.currentTimeMillis());
        } else {
            this.id = str2;
        }
        this.method = str3;
        this.params = jsonObject;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RpcMessage rpcMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rpcMessage.jsonrpc, (Object) "2.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rpcMessage.jsonrpc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rpcMessage.id, (Object) String.valueOf(System.currentTimeMillis()))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rpcMessage.id);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rpcMessage.method);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, JsonObjectSerializer.INSTANCE, rpcMessage.params);
    }

    public RpcMessage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.jsonrpc = str;
        this.id = str2;
        this.method = str3;
        this.params = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000e: INVOKE (wrap:long:0x000a: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:11)) STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:11)) : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (r4v0 kotlinx.serialization.json.JsonObject)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:9) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage.<init>(java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ RpcMessage(String str, String str2, String str3, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "2.0" : str, (i & 2) != 0 ? String.valueOf(System.currentTimeMillis()) : str2, str3, jsonObject);
    }
}
