package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OrderUopResponse {
    private final Integer mfaBizType;
    private final String mfaSessionId;
    private final boolean need2FA;
    private final JsonElement serverOption;
    private final int transactionOperations;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderUopResponse copy$default(OrderUopResponse orderUopResponse, String str, JsonElement jsonElement, int i, boolean z, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderUopResponse.uopHash;
        }
        if ((i2 & 2) != 0) {
            jsonElement = orderUopResponse.serverOption;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i2 & 4) != 0) {
            i = orderUopResponse.transactionOperations;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = orderUopResponse.need2FA;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str2 = orderUopResponse.mfaSessionId;
        }
        String str3 = str2;
        if ((i2 & 32) != 0) {
            num = orderUopResponse.mfaBizType;
        }
        return orderUopResponse.copy(str, jsonElement2, i3, z2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component2() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.mfaBizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderUopResponse copy(@NotNull String str, @NotNull JsonElement jsonElement, int i, boolean z, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new OrderUopResponse(str, jsonElement, i, z, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderUopResponse)) {
            return false;
        }
        OrderUopResponse orderUopResponse = (OrderUopResponse) obj;
        return Intrinsics.EZpvd((Object) this.uopHash, (Object) orderUopResponse.uopHash) && Intrinsics.EZpvd(this.serverOption, orderUopResponse.serverOption) && this.transactionOperations == orderUopResponse.transactionOperations && this.need2FA == orderUopResponse.need2FA && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) orderUopResponse.mfaSessionId) && Intrinsics.EZpvd(this.mfaBizType, orderUopResponse.mfaBizType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMfaBizType() {
        return this.mfaBizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfaSessionId() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeed2FA() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getServerOption() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransactionOperations() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.uopHash.hashCode();
        int iHashCode2 = this.serverOption.hashCode();
        int iHashCode3 = Integer.hashCode(this.transactionOperations);
        int iHashCode4 = Boolean.hashCode(this.need2FA);
        String str = this.mfaSessionId;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Integer num = this.mfaBizType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderUopResponse(uopHash=" + this.uopHash + ", serverOption=" + this.serverOption + ", transactionOperations=" + this.transactionOperations + ", need2FA=" + this.need2FA + ", mfaSessionId=" + this.mfaSessionId + ", mfaBizType=" + this.mfaBizType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.OrderUopResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderUopResponse> serializer() {
            return OrderUopResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderUopResponse(int i, String str, JsonElement jsonElement, int i2, boolean z, String str2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OrderUopResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.transactionOperations = i2;
        this.need2FA = z;
        if ((i & 16) == 0) {
            this.mfaSessionId = null;
        } else {
            this.mfaSessionId = str2;
        }
        if ((i & 32) == 0) {
            this.mfaBizType = null;
        } else {
            this.mfaBizType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OrderUopResponse orderUopResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, orderUopResponse.uopHash);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, orderUopResponse.serverOption);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, orderUopResponse.transactionOperations);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, orderUopResponse.need2FA);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || orderUopResponse.mfaSessionId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, orderUopResponse.mfaSessionId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && orderUopResponse.mfaBizType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, orderUopResponse.mfaBizType);
    }

    public OrderUopResponse(@NotNull String str, @NotNull JsonElement jsonElement, int i, boolean z, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.transactionOperations = i;
        this.need2FA = z;
        this.mfaSessionId = str2;
        this.mfaBizType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 kotlinx.serialization.json.JsonElement)
  (r12v0 int)
  (r13v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
 A[MD:(java.lang.String, kotlinx.serialization.json.JsonElement, int, boolean, java.lang.String, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.business.web3pay.lib.features.uop.model.OrderUopResponse.<init>(java.lang.String, kotlinx.serialization.json.JsonElement, int, boolean, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ OrderUopResponse(String str, JsonElement jsonElement, int i, boolean z, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonElement, i, z, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : num);
    }
}
