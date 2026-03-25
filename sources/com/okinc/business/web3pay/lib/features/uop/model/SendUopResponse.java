package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SendUopResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean needShareLink;
    private final String orderId;
    private final String uopHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendUopResponse copy$default(SendUopResponse sendUopResponse, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendUopResponse.orderId;
        }
        if ((i & 2) != 0) {
            str2 = sendUopResponse.uopHash;
        }
        if ((i & 4) != 0) {
            bool = sendUopResponse.needShareLink;
        }
        return sendUopResponse.copy(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.needShareLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendUopResponse copy(@NotNull String str, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SendUopResponse(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendUopResponse)) {
            return false;
        }
        SendUopResponse sendUopResponse = (SendUopResponse) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) sendUopResponse.orderId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) sendUopResponse.uopHash) && Intrinsics.EZpvd(this.needShareLink, sendUopResponse.needShareLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedShareLink() {
        return this.needShareLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.uopHash.hashCode();
        Boolean bool = this.needShareLink;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendUopResponse(orderId=" + this.orderId + ", uopHash=" + this.uopHash + ", needShareLink=" + this.needShareLink + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.SendUopResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendUopResponse> serializer() {
            return SendUopResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SendUopResponse(int i, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SendUopResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.uopHash = str2;
        if ((i & 4) == 0) {
            this.needShareLink = null;
        } else {
            this.needShareLink = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(SendUopResponse sendUopResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sendUopResponse.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, sendUopResponse.uopHash);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && sendUopResponse.needShareLink == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, sendUopResponse.needShareLink);
    }

    public SendUopResponse(@NotNull String str, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.uopHash = str2;
        this.needShareLink = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:11) call: com.okinc.business.web3pay.lib.features.uop.model.SendUopResponse.<init>(java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SendUopResponse(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bool);
    }
}
