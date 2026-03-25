package com.okinc.business.defi.biz.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RpcRequestError {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RpcRequestError copy$default(RpcRequestError rpcRequestError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rpcRequestError.code;
        }
        if ((i2 & 2) != 0) {
            str = rpcRequestError.message;
        }
        return rpcRequestError.copy(i, str);
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
    public final RpcRequestError copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RpcRequestError(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RpcRequestError)) {
            return false;
        }
        RpcRequestError rpcRequestError = (RpcRequestError) obj;
        return this.code == rpcRequestError.code && Intrinsics.EZpvd((Object) this.message, (Object) rpcRequestError.message);
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
        return "RpcRequestError(code=" + this.code + ", message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.rpc.RpcRequestError.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RpcRequestError> serializer() {
            return RpcRequestError$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RpcRequestError(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RpcRequestError$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.message = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RpcRequestError rpcRequestError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, rpcRequestError.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rpcRequestError.message);
    }

    public RpcRequestError(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.message = str;
    }
}
