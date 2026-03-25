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
public final class CreateCancelTransferUopRequest {
    private final List<String> orderIds;
    private final int projectId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.uop.model.CreateCancelTransferUopRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateCancelTransferUopRequest copy$default(CreateCancelTransferUopRequest createCancelTransferUopRequest, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = createCancelTransferUopRequest.orderIds;
        }
        if ((i2 & 2) != 0) {
            i = createCancelTransferUopRequest.projectId;
        }
        return createCancelTransferUopRequest.copy(list, i);
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
    public final CreateCancelTransferUopRequest copy(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CreateCancelTransferUopRequest(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCancelTransferUopRequest)) {
            return false;
        }
        CreateCancelTransferUopRequest createCancelTransferUopRequest = (CreateCancelTransferUopRequest) obj;
        return Intrinsics.EZpvd(this.orderIds, createCancelTransferUopRequest.orderIds) && this.projectId == createCancelTransferUopRequest.projectId;
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
        return "CreateCancelTransferUopRequest(orderIds=" + this.orderIds + ", projectId=" + this.projectId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateCancelTransferUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateCancelTransferUopRequest> serializer() {
            return CreateCancelTransferUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateCancelTransferUopRequest(int i, List list, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CreateCancelTransferUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.orderIds = list;
        this.projectId = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateCancelTransferUopRequest createCancelTransferUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], createCancelTransferUopRequest.orderIds);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createCancelTransferUopRequest.projectId);
    }

    public CreateCancelTransferUopRequest(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.orderIds = list;
        this.projectId = i;
    }
}
