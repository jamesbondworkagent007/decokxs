package com.okinc.okimcore.model.remote;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GroupJoinApplicationResultResponse {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, List<String>> inviteFailedMap;
    private final List<GroupJoinApplicationResponse> successfulApplications;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.GroupJoinApplicationResultResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupJoinApplicationResultResponse copy$default(GroupJoinApplicationResultResponse groupJoinApplicationResultResponse, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupJoinApplicationResultResponse.successfulApplications;
        }
        if ((i & 2) != 0) {
            map = groupJoinApplicationResultResponse.inviteFailedMap;
        }
        return groupJoinApplicationResultResponse.copy(list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupJoinApplicationResponse> component1() {
        return this.successfulApplications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> component2() {
        return this.inviteFailedMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupJoinApplicationResultResponse copy(@NotNull List<GroupJoinApplicationResponse> list, @NotNull Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new GroupJoinApplicationResultResponse(list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinApplicationResultResponse)) {
            return false;
        }
        GroupJoinApplicationResultResponse groupJoinApplicationResultResponse = (GroupJoinApplicationResultResponse) obj;
        return Intrinsics.EZpvd(this.successfulApplications, groupJoinApplicationResultResponse.successfulApplications) && Intrinsics.EZpvd(this.inviteFailedMap, groupJoinApplicationResultResponse.inviteFailedMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> getInviteFailedMap() {
        return this.inviteFailedMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupJoinApplicationResponse> getSuccessfulApplications() {
        return this.successfulApplications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.successfulApplications.hashCode() * 31) + this.inviteFailedMap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupJoinApplicationResultResponse(successfulApplications=" + this.successfulApplications + ", inviteFailedMap=" + this.inviteFailedMap + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupJoinApplicationResultResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupJoinApplicationResultResponse> serializer() {
            return GroupJoinApplicationResultResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(GroupJoinApplicationResponse$$serializer.INSTANCE), new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(stringSerializer))};
    }

    public /* synthetic */ GroupJoinApplicationResultResponse(int i, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GroupJoinApplicationResultResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.successfulApplications = list;
        this.inviteFailedMap = map;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupJoinApplicationResultResponse groupJoinApplicationResultResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupJoinApplicationResultResponse.successfulApplications);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupJoinApplicationResultResponse.inviteFailedMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupJoinApplicationResultResponse(@NotNull List<GroupJoinApplicationResponse> list, @NotNull Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.successfulApplications = list;
        this.inviteFailedMap = map;
    }
}
