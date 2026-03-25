package com.okinc.wallet.hardware.impl.onekey.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class Success implements Response {
    private final JsonElement payload;
    private final boolean success;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Success copy$default(Success success, boolean z, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            z = success.success;
        }
        if ((i & 2) != 0) {
            jsonElement = success.payload;
        }
        return success.copy(z, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Success copy(boolean z, JsonElement jsonElement) {
        return new Success(z, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Success)) {
            return false;
        }
        Success success = (Success) obj;
        return this.success == success.success && Intrinsics.EZpvd(this.payload, success.payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.hardware.impl.onekey.data.Response
    public boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success);
        JsonElement jsonElement = this.payload;
        return (iHashCode * 31) + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Success(success=" + this.success + ", payload=" + this.payload + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.Success.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Success> serializer() {
            return Success$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Success(int i, boolean z, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, Success$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        if ((i & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = jsonElement;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(Success success, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, success.getSuccess());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && success.payload == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, success.payload);
    }

    public Success(boolean z, JsonElement jsonElement) {
        this.success = z;
        this.payload = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r2v0 kotlinx.serialization.json.JsonElement))
 A[MD:(boolean, kotlinx.serialization.json.JsonElement):void (m)] (LINE:20) call: com.okinc.wallet.hardware.impl.onekey.data.Success.<init>(boolean, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ Success(boolean z, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : jsonElement);
    }
}
