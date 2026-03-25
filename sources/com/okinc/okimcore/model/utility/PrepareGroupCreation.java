package com.okinc.okimcore.model.utility;

import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel$$serializer;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq$$serializer;
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
public final class PrepareGroupCreation {
    private final GroupEntryBillingModel billingModel;
    private final JsonObject extras;
    private final String groupDescription;
    private final String groupImageUri;
    private final String groupName;
    private final GroupScenarioType groupScenarioType;
    private final GroupServiceType groupServiceType;
    private final SetGroupSettingsReq groupSettings;
    private final Set<Long> memberIds;
    private final GroupPublicType publicType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {GroupServiceType.Companion.serializer(), GroupScenarioType.Companion.serializer(), null, null, new LinkedHashSetSerializer(LongSerializer.INSTANCE), null, GroupPublicType.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupServiceType component1() {
        return this.groupServiceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component10() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType component2() {
        return this.groupScenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupImageUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Long> component5() {
        return this.memberIds;
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
    public final PrepareGroupCreation copy(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull String str, String str2, @NotNull Set<Long> set, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        return new PrepareGroupCreation(groupServiceType, groupScenarioType, str, str2, set, setGroupSettingsReq, groupPublicType, str3, groupEntryBillingModel, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepareGroupCreation)) {
            return false;
        }
        PrepareGroupCreation prepareGroupCreation = (PrepareGroupCreation) obj;
        return this.groupServiceType == prepareGroupCreation.groupServiceType && this.groupScenarioType == prepareGroupCreation.groupScenarioType && Intrinsics.EZpvd((Object) this.groupName, (Object) prepareGroupCreation.groupName) && Intrinsics.EZpvd((Object) this.groupImageUri, (Object) prepareGroupCreation.groupImageUri) && Intrinsics.EZpvd(this.memberIds, prepareGroupCreation.memberIds) && Intrinsics.EZpvd(this.groupSettings, prepareGroupCreation.groupSettings) && this.publicType == prepareGroupCreation.publicType && Intrinsics.EZpvd((Object) this.groupDescription, (Object) prepareGroupCreation.groupDescription) && Intrinsics.EZpvd(this.billingModel, prepareGroupCreation.billingModel) && Intrinsics.EZpvd(this.extras, prepareGroupCreation.extras);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel getBillingModel() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupImageUri() {
        return this.groupImageUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType getGroupScenarioType() {
        return this.groupScenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupServiceType getGroupServiceType() {
        return this.groupServiceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetGroupSettingsReq getGroupSettings() {
        return this.groupSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Long> getMemberIds() {
        return this.memberIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType getPublicType() {
        return this.publicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.groupServiceType.hashCode();
        int iHashCode2 = this.groupScenarioType.hashCode();
        int iHashCode3 = this.groupName.hashCode();
        String str = this.groupImageUri;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.memberIds.hashCode();
        SetGroupSettingsReq setGroupSettingsReq = this.groupSettings;
        int iHashCode6 = setGroupSettingsReq == null ? 0 : setGroupSettingsReq.hashCode();
        GroupPublicType groupPublicType = this.publicType;
        int iHashCode7 = groupPublicType == null ? 0 : groupPublicType.hashCode();
        String str2 = this.groupDescription;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
        int iHashCode9 = groupEntryBillingModel == null ? 0 : groupEntryBillingModel.hashCode();
        JsonObject jsonObject = this.extras;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrepareGroupCreation(groupServiceType=" + this.groupServiceType + ", groupScenarioType=" + this.groupScenarioType + ", groupName=" + this.groupName + ", groupImageUri=" + this.groupImageUri + ", memberIds=" + this.memberIds + ", groupSettings=" + this.groupSettings + ", publicType=" + this.publicType + ", groupDescription=" + this.groupDescription + ", billingModel=" + this.billingModel + ", extras=" + this.extras + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.utility.PrepareGroupCreation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrepareGroupCreation> serializer() {
            return PrepareGroupCreation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PrepareGroupCreation(int i, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, String str, String str2, Set set, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, PrepareGroupCreation$$serializer.INSTANCE.getDescriptor());
        }
        this.groupServiceType = groupServiceType;
        this.groupScenarioType = groupScenarioType;
        this.groupName = str;
        this.groupImageUri = str2;
        this.memberIds = set;
        if ((i & 32) == 0) {
            this.groupSettings = null;
        } else {
            this.groupSettings = setGroupSettingsReq;
        }
        if ((i & 64) == 0) {
            this.publicType = null;
        } else {
            this.publicType = groupPublicType;
        }
        if ((i & 128) == 0) {
            this.groupDescription = null;
        } else {
            this.groupDescription = str3;
        }
        if ((i & 256) == 0) {
            this.billingModel = null;
        } else {
            this.billingModel = groupEntryBillingModel;
        }
        if ((i & 512) == 0) {
            this.extras = null;
        } else {
            this.extras = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PrepareGroupCreation prepareGroupCreation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], prepareGroupCreation.groupServiceType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], prepareGroupCreation.groupScenarioType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, prepareGroupCreation.groupName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, prepareGroupCreation.groupImageUri);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], prepareGroupCreation.memberIds);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || prepareGroupCreation.groupSettings != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, SetGroupSettingsReq$$serializer.INSTANCE, prepareGroupCreation.groupSettings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || prepareGroupCreation.publicType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], prepareGroupCreation.publicType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || prepareGroupCreation.groupDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, prepareGroupCreation.groupDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || prepareGroupCreation.billingModel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, GroupEntryBillingModel$$serializer.INSTANCE, prepareGroupCreation.billingModel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && prepareGroupCreation.extras == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, JsonObjectSerializer.INSTANCE, prepareGroupCreation.extras);
    }

    public PrepareGroupCreation(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull String str, String str2, @NotNull Set<Long> set, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.groupServiceType = groupServiceType;
        this.groupScenarioType = groupScenarioType;
        this.groupName = str;
        this.groupImageUri = str2;
        this.memberIds = set;
        this.groupSettings = setGroupSettingsReq;
        this.publicType = groupPublicType;
        this.groupDescription = str3;
        this.billingModel = groupEntryBillingModel;
        this.extras = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r15v0 com.okinc.okimcore.model.remote.GroupServiceType)
  (r16v0 com.okinc.okimcore.model.remote.GroupScenarioType)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.util.Set)
  (wrap:com.okinc.okimcore.model.remote.SetGroupSettingsReq:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.SetGroupSettingsReq) : (r20v0 com.okinc.okimcore.model.remote.SetGroupSettingsReq))
  (wrap:com.okinc.okimcore.model.im.group.GroupPublicType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupPublicType) : (r21v0 com.okinc.okimcore.model.im.group.GroupPublicType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.GroupEntryBillingModel:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupEntryBillingModel) : (r23v0 com.okinc.okimcore.model.remote.GroupEntryBillingModel))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r24v0 kotlinx.serialization.json.JsonObject))
 A[MD:(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, java.lang.String, java.lang.String, java.util.Set<java.lang.Long>, com.okinc.okimcore.model.remote.SetGroupSettingsReq, com.okinc.okimcore.model.im.group.GroupPublicType, java.lang.String, com.okinc.okimcore.model.remote.GroupEntryBillingModel, kotlinx.serialization.json.JsonObject):void (m)] (LINE:14) call: com.okinc.okimcore.model.utility.PrepareGroupCreation.<init>(com.okinc.okimcore.model.remote.GroupServiceType, com.okinc.okimcore.model.remote.GroupScenarioType, java.lang.String, java.lang.String, java.util.Set, com.okinc.okimcore.model.remote.SetGroupSettingsReq, com.okinc.okimcore.model.im.group.GroupPublicType, java.lang.String, com.okinc.okimcore.model.remote.GroupEntryBillingModel, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ PrepareGroupCreation(GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, String str, String str2, Set set, SetGroupSettingsReq setGroupSettingsReq, GroupPublicType groupPublicType, String str3, GroupEntryBillingModel groupEntryBillingModel, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupServiceType, groupScenarioType, str, str2, set, (i & 32) != 0 ? null : setGroupSettingsReq, (i & 64) != 0 ? null : groupPublicType, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : groupEntryBillingModel, (i & 512) != 0 ? null : jsonObject);
    }
}
