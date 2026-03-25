package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ListGroupJoinApplicationsRequest {
    public static final int $stable = 0;
    private final String fromApplicationId;
    private final long groupId;
    private final Integer pageSize;
    private final GroupApplicationStatus status;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, GroupApplicationStatus.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ListGroupJoinApplicationsRequest copy$default(ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest, long j, String str, GroupApplicationStatus groupApplicationStatus, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = listGroupJoinApplicationsRequest.groupId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = listGroupJoinApplicationsRequest.fromApplicationId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            groupApplicationStatus = listGroupJoinApplicationsRequest.status;
        }
        GroupApplicationStatus groupApplicationStatus2 = groupApplicationStatus;
        if ((i & 8) != 0) {
            num = listGroupJoinApplicationsRequest.pageSize;
        }
        return listGroupJoinApplicationsRequest.copy(j2, str2, groupApplicationStatus2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromApplicationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListGroupJoinApplicationsRequest copy(long j, String str, GroupApplicationStatus groupApplicationStatus, Integer num) {
        return new ListGroupJoinApplicationsRequest(j, str, groupApplicationStatus, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListGroupJoinApplicationsRequest)) {
            return false;
        }
        ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest = (ListGroupJoinApplicationsRequest) obj;
        return this.groupId == listGroupJoinApplicationsRequest.groupId && Intrinsics.EZpvd((Object) this.fromApplicationId, (Object) listGroupJoinApplicationsRequest.fromApplicationId) && this.status == listGroupJoinApplicationsRequest.status && Intrinsics.EZpvd(this.pageSize, listGroupJoinApplicationsRequest.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromApplicationId() {
        return this.fromApplicationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.groupId);
        String str = this.fromApplicationId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        GroupApplicationStatus groupApplicationStatus = this.status;
        int iHashCode3 = groupApplicationStatus == null ? 0 : groupApplicationStatus.hashCode();
        Integer num = this.pageSize;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListGroupJoinApplicationsRequest(groupId=" + this.groupId + ", fromApplicationId=" + this.fromApplicationId + ", status=" + this.status + ", pageSize=" + this.pageSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.ListGroupJoinApplicationsRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListGroupJoinApplicationsRequest> serializer() {
            return ListGroupJoinApplicationsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListGroupJoinApplicationsRequest(int i, long j, String str, GroupApplicationStatus groupApplicationStatus, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ListGroupJoinApplicationsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.fromApplicationId = str;
        this.status = groupApplicationStatus;
        this.pageSize = num;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, listGroupJoinApplicationsRequest.groupId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, listGroupJoinApplicationsRequest.fromApplicationId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], listGroupJoinApplicationsRequest.status);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, listGroupJoinApplicationsRequest.pageSize);
    }

    public ListGroupJoinApplicationsRequest(long j, String str, GroupApplicationStatus groupApplicationStatus, Integer num) {
        this.groupId = j;
        this.fromApplicationId = str;
        this.status = groupApplicationStatus;
        this.pageSize = num;
    }
}
