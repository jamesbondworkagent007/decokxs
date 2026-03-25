package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupAddOrRemoveMemberRequest {
    private final JsonObject extra;
    private final long groupId;
    private final Set<Long> groupMemberUidList;
    private final PaymentRequiredStatus paidGroupPaymentRequiredStatus;
    private final GroupScenarioType scenarioType;
    private final GroupServiceType service;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {GroupServiceType.Companion.serializer(), GroupScenarioType.Companion.serializer(), null, new LinkedHashSetSerializer(LongSerializer.INSTANCE), PaymentRequiredStatus.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupAddOrRemoveMemberRequest copy$default(GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, long j, Set set, PaymentRequiredStatus paymentRequiredStatus, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            groupServiceType = groupAddOrRemoveMemberRequest.service;
        }
        if ((i & 2) != 0) {
            groupScenarioType = groupAddOrRemoveMemberRequest.scenarioType;
        }
        GroupScenarioType groupScenarioType2 = groupScenarioType;
        if ((i & 4) != 0) {
            j = groupAddOrRemoveMemberRequest.groupId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            set = groupAddOrRemoveMemberRequest.groupMemberUidList;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            paymentRequiredStatus = groupAddOrRemoveMemberRequest.paidGroupPaymentRequiredStatus;
        }
        PaymentRequiredStatus paymentRequiredStatus2 = paymentRequiredStatus;
        if ((i & 32) != 0) {
            jsonObject = groupAddOrRemoveMemberRequest.extra;
        }
        return groupAddOrRemoveMemberRequest.copy(groupServiceType, groupScenarioType2, j2, set2, paymentRequiredStatus2, jsonObject);
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
    public final Set<Long> component4() {
        return this.groupMemberUidList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentRequiredStatus component5() {
        return this.paidGroupPaymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component6() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAddOrRemoveMemberRequest copy(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, long j, @NotNull Set<Long> set, PaymentRequiredStatus paymentRequiredStatus, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(set, "");
        return new GroupAddOrRemoveMemberRequest(groupServiceType, groupScenarioType, j, set, paymentRequiredStatus, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAddOrRemoveMemberRequest)) {
            return false;
        }
        GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest = (GroupAddOrRemoveMemberRequest) obj;
        return this.service == groupAddOrRemoveMemberRequest.service && this.scenarioType == groupAddOrRemoveMemberRequest.scenarioType && this.groupId == groupAddOrRemoveMemberRequest.groupId && Intrinsics.EZpvd(this.groupMemberUidList, groupAddOrRemoveMemberRequest.groupMemberUidList) && this.paidGroupPaymentRequiredStatus == groupAddOrRemoveMemberRequest.paidGroupPaymentRequiredStatus && Intrinsics.EZpvd(this.extra, groupAddOrRemoveMemberRequest.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Long> getGroupMemberUidList() {
        return this.groupMemberUidList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentRequiredStatus getPaidGroupPaymentRequiredStatus() {
        return this.paidGroupPaymentRequiredStatus;
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
    public int hashCode() {
        int iHashCode = this.service.hashCode();
        int iHashCode2 = this.scenarioType.hashCode();
        int iHashCode3 = Long.hashCode(this.groupId);
        int iHashCode4 = this.groupMemberUidList.hashCode();
        PaymentRequiredStatus paymentRequiredStatus = this.paidGroupPaymentRequiredStatus;
        int iHashCode5 = paymentRequiredStatus == null ? 0 : paymentRequiredStatus.hashCode();
        JsonObject jsonObject = this.extra;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAddOrRemoveMemberRequest(service=" + this.service + ", scenarioType=" + this.scenarioType + ", groupId=" + this.groupId + ", groupMemberUidList=" + this.groupMemberUidList + ", paidGroupPaymentRequiredStatus=" + this.paidGroupPaymentRequiredStatus + ", extra=" + this.extra + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupAddOrRemoveMemberRequest> serializer() {
            return GroupAddOrRemoveMemberRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupAddOrRemoveMemberRequest(int i, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, long j, Set set, PaymentRequiredStatus paymentRequiredStatus, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, GroupAddOrRemoveMemberRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.service = groupServiceType;
        this.scenarioType = groupScenarioType;
        this.groupId = j;
        this.groupMemberUidList = set;
        if ((i & 16) == 0) {
            this.paidGroupPaymentRequiredStatus = null;
        } else {
            this.paidGroupPaymentRequiredStatus = paymentRequiredStatus;
        }
        if ((i & 32) == 0) {
            this.extra = null;
        } else {
            this.extra = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupAddOrRemoveMemberRequest.service);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupAddOrRemoveMemberRequest.scenarioType);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, groupAddOrRemoveMemberRequest.groupId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], groupAddOrRemoveMemberRequest.groupMemberUidList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupAddOrRemoveMemberRequest.paidGroupPaymentRequiredStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], groupAddOrRemoveMemberRequest.paidGroupPaymentRequiredStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && groupAddOrRemoveMemberRequest.extra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JsonObjectSerializer.INSTANCE, groupAddOrRemoveMemberRequest.extra);
    }

    public GroupAddOrRemoveMemberRequest(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, long j, @NotNull Set<Long> set, PaymentRequiredStatus paymentRequiredStatus, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.service = groupServiceType;
        this.scenarioType = groupScenarioType;
        this.groupId = j;
        this.groupMemberUidList = set;
        this.paidGroupPaymentRequiredStatus = paymentRequiredStatus;
        this.extra = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r11v0 com.okinc.okimcore.model.remote.GroupServiceType)
  (r12v0 com.okinc.okimcore.model.remote.GroupScenarioType)
  (r13v0 long)
  (r15v0 java.util.Set)
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus) : (r16v0 com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r17v0 kotlinx.serialization.json.JsonObject))
 A[MD:(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, long, java.util.Set<java.lang.Long>, com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, kotlinx.serialization.json.JsonObject):void (m)] (LINE:32) call: com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest.<init>(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, long, java.util.Set, com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ GroupAddOrRemoveMemberRequest(GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, long j, Set set, PaymentRequiredStatus paymentRequiredStatus, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupServiceType, groupScenarioType, j, set, (i & 16) != 0 ? null : paymentRequiredStatus, (i & 32) != 0 ? null : jsonObject);
    }
}
