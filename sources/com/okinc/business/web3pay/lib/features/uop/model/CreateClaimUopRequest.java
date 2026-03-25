package com.okinc.business.web3pay.lib.features.uop.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateClaimUopRequest {
    private final List<String> orderIds;
    private final int projectId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateClaimUopRequest copy$default(CreateClaimUopRequest createClaimUopRequest, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = createClaimUopRequest.orderIds;
        }
        if ((i2 & 2) != 0) {
            i = createClaimUopRequest.projectId;
        }
        return createClaimUopRequest.copy(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.orderIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateClaimUopRequest copy(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CreateClaimUopRequest(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateClaimUopRequest)) {
            return false;
        }
        CreateClaimUopRequest createClaimUopRequest = (CreateClaimUopRequest) obj;
        return Intrinsics.EZpvd(this.orderIds, createClaimUopRequest.orderIds) && this.projectId == createClaimUopRequest.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOrderIds() {
        return this.orderIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.orderIds.hashCode() * 31) + Integer.hashCode(this.projectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateClaimUopRequest(orderIds=" + this.orderIds + ", projectId=" + this.projectId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateClaimUopRequest> serializer() {
            return CreateClaimUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateClaimUopRequest(int i, List list, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CreateClaimUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.orderIds = list;
        this.projectId = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateClaimUopRequest createClaimUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], createClaimUopRequest.orderIds);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createClaimUopRequest.projectId);
    }

    public CreateClaimUopRequest(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.orderIds = list;
        this.projectId = i;
    }
}
