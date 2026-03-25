package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateClaimRedPacketRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String externalGiftId;
    private final String groupId;
    private final int projectId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateClaimRedPacketRequest copy$default(CreateClaimRedPacketRequest createClaimRedPacketRequest, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createClaimRedPacketRequest.chainIndex;
        }
        if ((i2 & 2) != 0) {
            i = createClaimRedPacketRequest.projectId;
        }
        if ((i2 & 4) != 0) {
            str2 = createClaimRedPacketRequest.externalGiftId;
        }
        if ((i2 & 8) != 0) {
            str3 = createClaimRedPacketRequest.groupId;
        }
        return createClaimRedPacketRequest.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.externalGiftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateClaimRedPacketRequest copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CreateClaimRedPacketRequest(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateClaimRedPacketRequest)) {
            return false;
        }
        CreateClaimRedPacketRequest createClaimRedPacketRequest = (CreateClaimRedPacketRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) createClaimRedPacketRequest.chainIndex) && this.projectId == createClaimRedPacketRequest.projectId && Intrinsics.EZpvd((Object) this.externalGiftId, (Object) createClaimRedPacketRequest.externalGiftId) && Intrinsics.EZpvd((Object) this.groupId, (Object) createClaimRedPacketRequest.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExternalGiftId() {
        return this.externalGiftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chainIndex.hashCode() * 31) + Integer.hashCode(this.projectId)) * 31) + this.externalGiftId.hashCode()) * 31) + this.groupId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateClaimRedPacketRequest(chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ", externalGiftId=" + this.externalGiftId + ", groupId=" + this.groupId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateClaimRedPacketRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateClaimRedPacketRequest> serializer() {
            return CreateClaimRedPacketRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateClaimRedPacketRequest(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CreateClaimRedPacketRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.projectId = i2;
        this.externalGiftId = str2;
        this.groupId = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateClaimRedPacketRequest createClaimRedPacketRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createClaimRedPacketRequest.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createClaimRedPacketRequest.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, createClaimRedPacketRequest.externalGiftId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, createClaimRedPacketRequest.groupId);
    }

    public CreateClaimRedPacketRequest(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainIndex = str;
        this.projectId = i;
        this.externalGiftId = str2;
        this.groupId = str3;
    }
}
