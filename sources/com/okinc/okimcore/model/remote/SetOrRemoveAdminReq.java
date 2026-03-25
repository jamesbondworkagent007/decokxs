package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SetOrRemoveAdminReq {
    private final long groupId;
    private final List<Long> memberUids;
    private final long roleToUpdate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.okimcore.model.remote.SetOrRemoveAdminReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetOrRemoveAdminReq copy$default(SetOrRemoveAdminReq setOrRemoveAdminReq, long j, List list, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = setOrRemoveAdminReq.groupId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            list = setOrRemoveAdminReq.memberUids;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            j2 = setOrRemoveAdminReq.roleToUpdate;
        }
        return setOrRemoveAdminReq.copy(j3, list2, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.memberUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.roleToUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetOrRemoveAdminReq copy(long j, @NotNull List<Long> list, long j2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SetOrRemoveAdminReq(j, list, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetOrRemoveAdminReq)) {
            return false;
        }
        SetOrRemoveAdminReq setOrRemoveAdminReq = (SetOrRemoveAdminReq) obj;
        return this.groupId == setOrRemoveAdminReq.groupId && Intrinsics.EZpvd(this.memberUids, setOrRemoveAdminReq.memberUids) && this.roleToUpdate == setOrRemoveAdminReq.roleToUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getMemberUids() {
        return this.memberUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRoleToUpdate() {
        return this.roleToUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.groupId) * 31) + this.memberUids.hashCode()) * 31) + Long.hashCode(this.roleToUpdate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SetOrRemoveAdminReq(groupId=" + this.groupId + ", memberUids=" + this.memberUids + ", roleToUpdate=" + this.roleToUpdate + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SetOrRemoveAdminReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetOrRemoveAdminReq> serializer() {
            return SetOrRemoveAdminReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetOrRemoveAdminReq(int i, long j, List list, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SetOrRemoveAdminReq$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.memberUids = list;
        this.roleToUpdate = j2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SetOrRemoveAdminReq setOrRemoveAdminReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, setOrRemoveAdminReq.groupId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], setOrRemoveAdminReq.memberUids);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, setOrRemoveAdminReq.roleToUpdate);
    }

    public SetOrRemoveAdminReq(long j, @NotNull List<Long> list, long j2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.groupId = j;
        this.memberUids = list;
        this.roleToUpdate = j2;
    }
}
