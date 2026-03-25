package com.okinc.business.web3pay.lib.features.uop.model;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateClaimUopResponse {
    private final JsonElement serverOption;
    private final int transactionOperations;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateClaimUopResponse copy$default(CreateClaimUopResponse createClaimUopResponse, JsonElement jsonElement, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jsonElement = createClaimUopResponse.serverOption;
        }
        if ((i2 & 2) != 0) {
            str = createClaimUopResponse.uopHash;
        }
        if ((i2 & 4) != 0) {
            i = createClaimUopResponse.transactionOperations;
        }
        return createClaimUopResponse.copy(jsonElement, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component1() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.transactionOperations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateClaimUopResponse copy(@NotNull JsonElement jsonElement, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CreateClaimUopResponse(jsonElement, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateClaimUopResponse)) {
            return false;
        }
        CreateClaimUopResponse createClaimUopResponse = (CreateClaimUopResponse) obj;
        return Intrinsics.EZpvd(this.serverOption, createClaimUopResponse.serverOption) && Intrinsics.EZpvd((Object) this.uopHash, (Object) createClaimUopResponse.uopHash) && this.transactionOperations == createClaimUopResponse.transactionOperations;
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
        return (((this.serverOption.hashCode() * 31) + this.uopHash.hashCode()) * 31) + Integer.hashCode(this.transactionOperations);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateClaimUopResponse(serverOption=" + this.serverOption + ", uopHash=" + this.uopHash + ", transactionOperations=" + this.transactionOperations + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateClaimUopResponse> serializer() {
            return CreateClaimUopResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateClaimUopResponse(int i, JsonElement jsonElement, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CreateClaimUopResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.serverOption = jsonElement;
        this.uopHash = str;
        this.transactionOperations = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateClaimUopResponse createClaimUopResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonElementSerializer.INSTANCE, createClaimUopResponse.serverOption);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, createClaimUopResponse.uopHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, createClaimUopResponse.transactionOperations);
    }

    public CreateClaimUopResponse(@NotNull JsonElement jsonElement, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.serverOption = jsonElement;
        this.uopHash = str;
        this.transactionOperations = i;
    }
}
