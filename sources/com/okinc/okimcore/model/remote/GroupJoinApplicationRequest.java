package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GroupJoinApplicationRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long groupId;
    private final String invitationId;
    private final String reason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupJoinApplicationRequest copy$default(GroupJoinApplicationRequest groupJoinApplicationRequest, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupJoinApplicationRequest.invitationId;
        }
        if ((i & 2) != 0) {
            j = groupJoinApplicationRequest.groupId;
        }
        if ((i & 4) != 0) {
            str2 = groupJoinApplicationRequest.reason;
        }
        return groupJoinApplicationRequest.copy(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupJoinApplicationRequest copy(@NotNull String str, long j, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GroupJoinApplicationRequest(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinApplicationRequest)) {
            return false;
        }
        GroupJoinApplicationRequest groupJoinApplicationRequest = (GroupJoinApplicationRequest) obj;
        return Intrinsics.EZpvd((Object) this.invitationId, (Object) groupJoinApplicationRequest.invitationId) && this.groupId == groupJoinApplicationRequest.groupId && Intrinsics.EZpvd((Object) this.reason, (Object) groupJoinApplicationRequest.reason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.invitationId.hashCode();
        int iHashCode2 = Long.hashCode(this.groupId);
        String str = this.reason;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupJoinApplicationRequest(invitationId=" + this.invitationId + ", groupId=" + this.groupId + ", reason=" + this.reason + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupJoinApplicationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupJoinApplicationRequest> serializer() {
            return GroupJoinApplicationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupJoinApplicationRequest(int i, String str, long j, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GroupJoinApplicationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.invitationId = str;
        this.groupId = j;
        this.reason = str2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupJoinApplicationRequest groupJoinApplicationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, groupJoinApplicationRequest.invitationId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, groupJoinApplicationRequest.groupId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupJoinApplicationRequest.reason);
    }

    public GroupJoinApplicationRequest(@NotNull String str, long j, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.invitationId = str;
        this.groupId = j;
        this.reason = str2;
    }
}
