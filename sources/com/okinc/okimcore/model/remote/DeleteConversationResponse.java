package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class DeleteConversationResponse {
    private final List<Long> deletedConversationChanIds;
    private final Boolean success;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeleteConversationResponse() {
        this((Boolean) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.DeleteConversationResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteConversationResponse copy$default(DeleteConversationResponse deleteConversationResponse, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = deleteConversationResponse.success;
        }
        if ((i & 2) != 0) {
            list = deleteConversationResponse.deletedConversationChanIds;
        }
        return deleteConversationResponse.copy(bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.deletedConversationChanIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeleteConversationResponse copy(Boolean bool, List<Long> list) {
        return new DeleteConversationResponse(bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteConversationResponse)) {
            return false;
        }
        DeleteConversationResponse deleteConversationResponse = (DeleteConversationResponse) obj;
        return Intrinsics.EZpvd(this.success, deleteConversationResponse.success) && Intrinsics.EZpvd(this.deletedConversationChanIds, deleteConversationResponse.deletedConversationChanIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getDeletedConversationChanIds() {
        return this.deletedConversationChanIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        List<Long> list = this.deletedConversationChanIds;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeleteConversationResponse(success=" + this.success + ", deletedConversationChanIds=" + this.deletedConversationChanIds + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.DeleteConversationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteConversationResponse> serializer() {
            return DeleteConversationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteConversationResponse(int i, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.success = null;
        } else {
            this.success = bool;
        }
        if ((i & 2) == 0) {
            this.deletedConversationChanIds = null;
        } else {
            this.deletedConversationChanIds = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(DeleteConversationResponse deleteConversationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deleteConversationResponse.success != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, deleteConversationResponse.success);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && deleteConversationResponse.deletedConversationChanIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], deleteConversationResponse.deletedConversationChanIds);
    }

    public DeleteConversationResponse(Boolean bool, List<Long> list) {
        this.success = bool;
        this.deletedConversationChanIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.Boolean, java.util.List<java.lang.Long>):void (m)] (LINE:28) call: com.okinc.okimcore.model.remote.DeleteConversationResponse.<init>(java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ DeleteConversationResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list);
    }

    public final boolean isSuccess() {
        return Intrinsics.EZpvd(Boolean.TRUE, this.success);
    }
}
