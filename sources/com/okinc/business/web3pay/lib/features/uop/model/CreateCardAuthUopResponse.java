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
public final class CreateCardAuthUopResponse {
    private final int mfaBizType;
    private final String mfaSessionId;
    private final JsonElement serverOption;
    private final int transactionOperations;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateCardAuthUopResponse copy$default(CreateCardAuthUopResponse createCardAuthUopResponse, int i, String str, String str2, JsonElement jsonElement, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = createCardAuthUopResponse.mfaBizType;
        }
        if ((i3 & 2) != 0) {
            str = createCardAuthUopResponse.mfaSessionId;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = createCardAuthUopResponse.uopHash;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            jsonElement = createCardAuthUopResponse.serverOption;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i3 & 16) != 0) {
            i2 = createCardAuthUopResponse.transactionOperations;
        }
        return createCardAuthUopResponse.copy(i, str3, str4, jsonElement2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.mfaBizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component4() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateCardAuthUopResponse copy(int i, String str, @NotNull String str2, @NotNull JsonElement jsonElement, int i2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new CreateCardAuthUopResponse(i, str, str2, jsonElement, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCardAuthUopResponse)) {
            return false;
        }
        CreateCardAuthUopResponse createCardAuthUopResponse = (CreateCardAuthUopResponse) obj;
        return this.mfaBizType == createCardAuthUopResponse.mfaBizType && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) createCardAuthUopResponse.mfaSessionId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) createCardAuthUopResponse.uopHash) && Intrinsics.EZpvd(this.serverOption, createCardAuthUopResponse.serverOption) && this.transactionOperations == createCardAuthUopResponse.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMfaBizType() {
        return this.mfaBizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfaSessionId() {
        return this.mfaSessionId;
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
        int iHashCode = Integer.hashCode(this.mfaBizType);
        String str = this.mfaSessionId;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.uopHash.hashCode()) * 31) + this.serverOption.hashCode()) * 31) + Integer.hashCode(this.transactionOperations);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateCardAuthUopResponse(mfaBizType=" + this.mfaBizType + ", mfaSessionId=" + this.mfaSessionId + ", uopHash=" + this.uopHash + ", serverOption=" + this.serverOption + ", transactionOperations=" + this.transactionOperations + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateCardAuthUopResponse> serializer() {
            return CreateCardAuthUopResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateCardAuthUopResponse(int i, int i2, String str, String str2, JsonElement jsonElement, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, CreateCardAuthUopResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.mfaBizType = i2;
        this.mfaSessionId = str;
        this.uopHash = str2;
        this.serverOption = jsonElement;
        this.transactionOperations = i3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateCardAuthUopResponse createCardAuthUopResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, createCardAuthUopResponse.mfaBizType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, createCardAuthUopResponse.mfaSessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, createCardAuthUopResponse.uopHash);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, JsonElementSerializer.INSTANCE, createCardAuthUopResponse.serverOption);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, createCardAuthUopResponse.transactionOperations);
    }

    public CreateCardAuthUopResponse(int i, String str, @NotNull String str2, @NotNull JsonElement jsonElement, int i2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.mfaBizType = i;
        this.mfaSessionId = str;
        this.uopHash = str2;
        this.serverOption = jsonElement;
        this.transactionOperations = i2;
    }
}
