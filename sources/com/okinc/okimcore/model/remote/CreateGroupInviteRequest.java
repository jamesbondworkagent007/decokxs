package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreateGroupInviteRequest {
    public static final int $stable = 0;
    private final long groupId;
    private final GroupScenarioType scenarioType;
    private final GroupServiceType service;
    private final Integer validForNumOfDays;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {GroupServiceType.Companion.serializer(), GroupScenarioType.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateGroupInviteRequest copy$default(CreateGroupInviteRequest createGroupInviteRequest, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, long j, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            groupServiceType = createGroupInviteRequest.service;
        }
        if ((i & 2) != 0) {
            groupScenarioType = createGroupInviteRequest.scenarioType;
        }
        GroupScenarioType groupScenarioType2 = groupScenarioType;
        if ((i & 4) != 0) {
            j = createGroupInviteRequest.groupId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            num = createGroupInviteRequest.validForNumOfDays;
        }
        return createGroupInviteRequest.copy(groupServiceType, groupScenarioType2, j2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupServiceType component1() {
        return this.service;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType component2() {
        return this.scenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.validForNumOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateGroupInviteRequest copy(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, long j, Integer num) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        return new CreateGroupInviteRequest(groupServiceType, groupScenarioType, j, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateGroupInviteRequest)) {
            return false;
        }
        CreateGroupInviteRequest createGroupInviteRequest = (CreateGroupInviteRequest) obj;
        return this.service == createGroupInviteRequest.service && this.scenarioType == createGroupInviteRequest.scenarioType && this.groupId == createGroupInviteRequest.groupId && Intrinsics.EZpvd(this.validForNumOfDays, createGroupInviteRequest.validForNumOfDays);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType getScenarioType() {
        return this.scenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupServiceType getService() {
        return this.service;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getValidForNumOfDays() {
        return this.validForNumOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.service.hashCode();
        int iHashCode2 = this.scenarioType.hashCode();
        int iHashCode3 = Long.hashCode(this.groupId);
        Integer num = this.validForNumOfDays;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateGroupInviteRequest(service=" + this.service + ", scenarioType=" + this.scenarioType + ", groupId=" + this.groupId + ", validForNumOfDays=" + this.validForNumOfDays + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreateGroupInviteRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateGroupInviteRequest> serializer() {
            return CreateGroupInviteRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateGroupInviteRequest(int i, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, long j, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CreateGroupInviteRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.service = groupServiceType;
        this.scenarioType = groupScenarioType;
        this.groupId = j;
        if ((i & 8) == 0) {
            this.validForNumOfDays = null;
        } else {
            this.validForNumOfDays = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CreateGroupInviteRequest createGroupInviteRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], createGroupInviteRequest.service);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], createGroupInviteRequest.scenarioType);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, createGroupInviteRequest.groupId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && createGroupInviteRequest.validForNumOfDays == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, createGroupInviteRequest.validForNumOfDays);
    }

    public CreateGroupInviteRequest(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, long j, Integer num) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        this.service = groupServiceType;
        this.scenarioType = groupScenarioType;
        this.groupId = j;
        this.validForNumOfDays = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r7v0 com.okinc.okimcore.model.remote.GroupServiceType)
  (r8v0 com.okinc.okimcore.model.remote.GroupScenarioType)
  (r9v0 long)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, long, java.lang.Integer):void (m)] (LINE:46) call: com.okinc.okimcore.model.remote.CreateGroupInviteRequest.<init>(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, long, java.lang.Integer):void type: THIS */
    public /* synthetic */ CreateGroupInviteRequest(GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, long j, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupServiceType, groupScenarioType, j, (i & 8) != 0 ? null : num);
    }
}
