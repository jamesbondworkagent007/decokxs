package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.GroupPublicType;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreateGroupRequest {
    private final GroupEntryBillingModel billingModel;
    private final JsonObject extra;
    private final String groupAvatar;
    private final String groupDescription;
    private final Set<Long> groupMemberUidList;
    private final String groupName;
    private final SetGroupSettingsReq groupSettings;
    private final GroupPublicType publicType;
    private final GroupScenarioType scenarioType;
    private final GroupServiceType service;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {GroupServiceType.Companion.serializer(), GroupScenarioType.Companion.serializer(), null, new LinkedHashSetSerializer(LongSerializer.INSTANCE), null, null, GroupPublicType.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupServiceType component1() {
        return this.service;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component10() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType component2() {
        return this.scenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Long> component4() {
        return this.groupMemberUidList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetGroupSettingsReq component6() {
        return this.groupSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType component7() {
        return this.publicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel component9() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateGroupRequest copy(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull String str, Set<Long> set, String str2, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CreateGroupRequest(groupServiceType, groupScenarioType, str, set, str2, setGroupSettingsReq, groupPublicType, str3, groupEntryBillingModel, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateGroupRequest)) {
            return false;
        }
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) obj;
        return this.service == createGroupRequest.service && this.scenarioType == createGroupRequest.scenarioType && Intrinsics.EZpvd((Object) this.groupName, (Object) createGroupRequest.groupName) && Intrinsics.EZpvd(this.groupMemberUidList, createGroupRequest.groupMemberUidList) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) createGroupRequest.groupAvatar) && Intrinsics.EZpvd(this.groupSettings, createGroupRequest.groupSettings) && this.publicType == createGroupRequest.publicType && Intrinsics.EZpvd((Object) this.groupDescription, (Object) createGroupRequest.groupDescription) && Intrinsics.EZpvd(this.billingModel, createGroupRequest.billingModel) && Intrinsics.EZpvd(this.extra, createGroupRequest.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel getBillingModel() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Long> getGroupMemberUidList() {
        return this.groupMemberUidList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetGroupSettingsReq getGroupSettings() {
        return this.groupSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType getPublicType() {
        return this.publicType;
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
        int iHashCode3 = this.groupName.hashCode();
        Set<Long> set = this.groupMemberUidList;
        int iHashCode4 = set == null ? 0 : set.hashCode();
        String str = this.groupAvatar;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        SetGroupSettingsReq setGroupSettingsReq = this.groupSettings;
        int iHashCode6 = setGroupSettingsReq == null ? 0 : setGroupSettingsReq.hashCode();
        GroupPublicType groupPublicType = this.publicType;
        int iHashCode7 = groupPublicType == null ? 0 : groupPublicType.hashCode();
        String str2 = this.groupDescription;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
        int iHashCode9 = groupEntryBillingModel == null ? 0 : groupEntryBillingModel.hashCode();
        JsonObject jsonObject = this.extra;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateGroupRequest(service=" + this.service + ", scenarioType=" + this.scenarioType + ", groupName=" + this.groupName + ", groupMemberUidList=" + this.groupMemberUidList + ", groupAvatar=" + this.groupAvatar + ", groupSettings=" + this.groupSettings + ", publicType=" + this.publicType + ", groupDescription=" + this.groupDescription + ", billingModel=" + this.billingModel + ", extra=" + this.extra + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreateGroupRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateGroupRequest> serializer() {
            return CreateGroupRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateGroupRequest(int i, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, String str, Set set, String str2, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (463 != (i & 463)) {
            PluginExceptionsKt.throwMissingFieldException(i, 463, CreateGroupRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.service = groupServiceType;
        this.scenarioType = groupScenarioType;
        this.groupName = str;
        this.groupMemberUidList = set;
        if ((i & 16) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str2;
        }
        if ((i & 32) == 0) {
            this.groupSettings = null;
        } else {
            this.groupSettings = setGroupSettingsReq;
        }
        this.publicType = groupPublicType;
        this.groupDescription = str3;
        this.billingModel = groupEntryBillingModel;
        if ((i & 512) == 0) {
            this.extra = null;
        } else {
            this.extra = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CreateGroupRequest createGroupRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], createGroupRequest.service);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], createGroupRequest.scenarioType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, createGroupRequest.groupName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], createGroupRequest.groupMemberUidList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || createGroupRequest.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, createGroupRequest.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || createGroupRequest.groupSettings != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, SetGroupSettingsReq$$serializer.INSTANCE, createGroupRequest.groupSettings);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], createGroupRequest.publicType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, createGroupRequest.groupDescription);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, GroupEntryBillingModel$$serializer.INSTANCE, createGroupRequest.billingModel);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && createGroupRequest.extra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, JsonObjectSerializer.INSTANCE, createGroupRequest.extra);
    }

    public CreateGroupRequest(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull String str, Set<Long> set, String str2, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.service = groupServiceType;
        this.scenarioType = groupScenarioType;
        this.groupName = str;
        this.groupMemberUidList = set;
        this.groupAvatar = str2;
        this.groupSettings = setGroupSettingsReq;
        this.publicType = groupPublicType;
        this.groupDescription = str3;
        this.billingModel = groupEntryBillingModel;
        this.extra = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r15v0 com.okinc.okimcore.model.remote.GroupServiceType)
  (r16v0 com.okinc.okimcore.model.remote.GroupScenarioType)
  (r17v0 java.lang.String)
  (r18v0 java.util.Set)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.SetGroupSettingsReq:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.SetGroupSettingsReq) : (r20v0 com.okinc.okimcore.model.remote.SetGroupSettingsReq))
  (r21v0 com.okinc.okimcore.model.im.group.GroupPublicType)
  (r22v0 java.lang.String)
  (r23v0 com.okinc.okimcore.model.remote.GroupEntryBillingModel)
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r24v0 kotlinx.serialization.json.JsonObject))
 A[MD:(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, java.lang.String, java.util.Set<java.lang.Long>, java.lang.String, com.okinc.okimcore.model.remote.SetGroupSettingsReq, com.okinc.okimcore.model.im.group.GroupPublicType, java.lang.String, com.okinc.okimcore.model.remote.GroupEntryBillingModel, kotlinx.serialization.json.JsonObject):void (m)] (LINE:11) call: com.okinc.okimcore.model.remote.CreateGroupRequest.<init>(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, java.lang.String, java.util.Set, java.lang.String, com.okinc.okimcore.model.remote.SetGroupSettingsReq, com.okinc.okimcore.model.im.group.GroupPublicType, java.lang.String, com.okinc.okimcore.model.remote.GroupEntryBillingModel, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ CreateGroupRequest(GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, String str, Set set, String str2, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupServiceType, groupScenarioType, str, set, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : setGroupSettingsReq, groupPublicType, str3, groupEntryBillingModel, (i & 512) != 0 ? null : jsonObject);
    }
}
