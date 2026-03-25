package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GroupOwnerTransferRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long groupId;
    private final long userUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupOwnerTransferRequest copy$default(GroupOwnerTransferRequest groupOwnerTransferRequest, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = groupOwnerTransferRequest.groupId;
        }
        if ((i & 2) != 0) {
            j2 = groupOwnerTransferRequest.userUid;
        }
        return groupOwnerTransferRequest.copy(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupOwnerTransferRequest copy(long j, long j2) {
        return new GroupOwnerTransferRequest(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupOwnerTransferRequest)) {
            return false;
        }
        GroupOwnerTransferRequest groupOwnerTransferRequest = (GroupOwnerTransferRequest) obj;
        return this.groupId == groupOwnerTransferRequest.groupId && this.userUid == groupOwnerTransferRequest.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.groupId) * 31) + Long.hashCode(this.userUid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupOwnerTransferRequest(groupId=" + this.groupId + ", userUid=" + this.userUid + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupOwnerTransferRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupOwnerTransferRequest> serializer() {
            return GroupOwnerTransferRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupOwnerTransferRequest(int i, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GroupOwnerTransferRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.userUid = j2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupOwnerTransferRequest groupOwnerTransferRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, groupOwnerTransferRequest.groupId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, groupOwnerTransferRequest.userUid);
    }

    public GroupOwnerTransferRequest(long j, long j2) {
        this.groupId = j;
        this.userUid = j2;
    }
}
