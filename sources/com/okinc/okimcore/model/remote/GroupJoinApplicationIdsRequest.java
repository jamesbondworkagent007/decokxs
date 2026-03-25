package com.okinc.okimcore.model.remote;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GroupJoinApplicationIdsRequest {
    private final List<String> applicationIds;
    private final long groupId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.GroupJoinApplicationIdsRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupJoinApplicationIdsRequest copy$default(GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = groupJoinApplicationIdsRequest.groupId;
        }
        if ((i & 2) != 0) {
            list = groupJoinApplicationIdsRequest.applicationIds;
        }
        return groupJoinApplicationIdsRequest.copy(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.applicationIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupJoinApplicationIdsRequest copy(long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new GroupJoinApplicationIdsRequest(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinApplicationIdsRequest)) {
            return false;
        }
        GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest = (GroupJoinApplicationIdsRequest) obj;
        return this.groupId == groupJoinApplicationIdsRequest.groupId && Intrinsics.EZpvd(this.applicationIds, groupJoinApplicationIdsRequest.applicationIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.groupId) * 31) + this.applicationIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupJoinApplicationIdsRequest(groupId=" + this.groupId + ", applicationIds=" + this.applicationIds + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupJoinApplicationIdsRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupJoinApplicationIdsRequest> serializer() {
            return GroupJoinApplicationIdsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupJoinApplicationIdsRequest(int i, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GroupJoinApplicationIdsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.applicationIds = list;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, groupJoinApplicationIdsRequest.groupId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupJoinApplicationIdsRequest.applicationIds);
    }

    public GroupJoinApplicationIdsRequest(long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.groupId = j;
        this.applicationIds = list;
    }
}
