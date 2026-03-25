package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreatePayTransferUopResponse {
    private final String mfaSessionId;
    private final boolean need2FA;
    private final JsonElement serverOption;
    private final int transactionOperations;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreatePayTransferUopResponse copy$default(CreatePayTransferUopResponse createPayTransferUopResponse, boolean z, String str, JsonElement jsonElement, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = createPayTransferUopResponse.need2FA;
        }
        if ((i2 & 2) != 0) {
            str = createPayTransferUopResponse.uopHash;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            jsonElement = createPayTransferUopResponse.serverOption;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i2 & 8) != 0) {
            i = createPayTransferUopResponse.transactionOperations;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = createPayTransferUopResponse.mfaSessionId;
        }
        return createPayTransferUopResponse.copy(z, str3, jsonElement2, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component3() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreatePayTransferUopResponse copy(boolean z, @NotNull String str, @NotNull JsonElement jsonElement, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new CreatePayTransferUopResponse(z, str, jsonElement, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePayTransferUopResponse)) {
            return false;
        }
        CreatePayTransferUopResponse createPayTransferUopResponse = (CreatePayTransferUopResponse) obj;
        return this.need2FA == createPayTransferUopResponse.need2FA && Intrinsics.EZpvd((Object) this.uopHash, (Object) createPayTransferUopResponse.uopHash) && Intrinsics.EZpvd(this.serverOption, createPayTransferUopResponse.serverOption) && this.transactionOperations == createPayTransferUopResponse.transactionOperations && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) createPayTransferUopResponse.mfaSessionId);
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
        int iHashCode = Boolean.hashCode(this.need2FA);
        int iHashCode2 = this.uopHash.hashCode();
        int iHashCode3 = this.serverOption.hashCode();
        int iHashCode4 = Integer.hashCode(this.transactionOperations);
        String str = this.mfaSessionId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreatePayTransferUopResponse(need2FA=" + this.need2FA + ", uopHash=" + this.uopHash + ", serverOption=" + this.serverOption + ", transactionOperations=" + this.transactionOperations + ", mfaSessionId=" + this.mfaSessionId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreatePayTransferUopResponse> serializer() {
            return CreatePayTransferUopResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreatePayTransferUopResponse(int i, boolean z, String str, JsonElement jsonElement, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CreatePayTransferUopResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.need2FA = z;
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.transactionOperations = i2;
        if ((i & 16) == 0) {
            this.mfaSessionId = null;
        } else {
            this.mfaSessionId = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreatePayTransferUopResponse createPayTransferUopResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, createPayTransferUopResponse.need2FA);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, createPayTransferUopResponse.uopHash);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, createPayTransferUopResponse.serverOption);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, createPayTransferUopResponse.transactionOperations);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && createPayTransferUopResponse.mfaSessionId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, createPayTransferUopResponse.mfaSessionId);
    }

    public CreatePayTransferUopResponse(boolean z, @NotNull String str, @NotNull JsonElement jsonElement, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.need2FA = z;
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.transactionOperations = i;
        this.mfaSessionId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 boolean)
  (r8v0 java.lang.String)
  (r9v0 kotlinx.serialization.json.JsonElement)
  (r10v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(boolean, java.lang.String, kotlinx.serialization.json.JsonElement, int, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopResponse.<init>(boolean, java.lang.String, kotlinx.serialization.json.JsonElement, int, java.lang.String):void type: THIS */
    public /* synthetic */ CreatePayTransferUopResponse(boolean z, String str, JsonElement jsonElement, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, jsonElement, i, (i2 & 16) != 0 ? null : str2);
    }
}
