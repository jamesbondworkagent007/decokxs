package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.im.group.GroupApplicationType;
import com.okinc.okimcore.model.im.group.TransactionStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupInvitationInfoResponse implements Parcelable {
    public static final int $stable = 0;
    private final GroupEntryAssetVerificationInfo assetVerificationInfo;
    private final Long expireTime;
    private final GroupApplicationStatus groupApplicationStatus;
    private final GroupApplicationType groupApplicationType;
    private final String groupAvatar;
    private final String groupDescription;
    private final Long groupId;
    private final String groupName;
    private final GroupOwnerInfo groupOwnerInfo;
    private final Integer groupType;
    private final Boolean inGroupStatus;
    private final String inviterEnNickname;
    private final String inviterNickname;
    private final Integer memberCount;
    private final Integer mutualRelationCount;
    private final PaidGroupPreview paidGroupPreview;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupInvitationInfoResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, GroupApplicationType.Companion.serializer(), GroupApplicationStatus.Companion.serializer(), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<GroupInvitationInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupInvitationInfoResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupInvitationInfoResponse(lValueOf, string, string2, numValueOf, string3, string4, numValueOf2, numValueOf3, lValueOf2, boolValueOf, parcel.readInt() == 0 ? null : GroupApplicationType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupApplicationStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupEntryAssetVerificationInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : GroupOwnerInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaidGroupPreview.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupInvitationInfoResponse[] newArray(int i) {
            return new GroupInvitationInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupInvitationInfoResponse() {
        this((Long) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Long) null, (Boolean) null, (GroupApplicationType) null, (GroupApplicationStatus) null, (GroupEntryAssetVerificationInfo) null, (String) null, (GroupOwnerInfo) null, (PaidGroupPreview) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationType component11() {
        return this.groupApplicationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus component12() {
        return this.groupApplicationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationInfo component13() {
        return this.assetVerificationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupOwnerInfo component15() {
        return this.groupOwnerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupPreview component16() {
        return this.paidGroupPreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inviterNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.inviterEnNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.mutualRelationCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInvitationInfoResponse copy(Long l, String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Long l2, Boolean bool, GroupApplicationType groupApplicationType, GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, String str5, GroupOwnerInfo groupOwnerInfo, PaidGroupPreview paidGroupPreview) {
        return new GroupInvitationInfoResponse(l, str, str2, num, str3, str4, num2, num3, l2, bool, groupApplicationType, groupApplicationStatus, groupEntryAssetVerificationInfo, str5, groupOwnerInfo, paidGroupPreview);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInvitationInfoResponse)) {
            return false;
        }
        GroupInvitationInfoResponse groupInvitationInfoResponse = (GroupInvitationInfoResponse) obj;
        return Intrinsics.EZpvd(this.groupId, groupInvitationInfoResponse.groupId) && Intrinsics.EZpvd((Object) this.groupName, (Object) groupInvitationInfoResponse.groupName) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) groupInvitationInfoResponse.groupAvatar) && Intrinsics.EZpvd(this.groupType, groupInvitationInfoResponse.groupType) && Intrinsics.EZpvd((Object) this.inviterNickname, (Object) groupInvitationInfoResponse.inviterNickname) && Intrinsics.EZpvd((Object) this.inviterEnNickname, (Object) groupInvitationInfoResponse.inviterEnNickname) && Intrinsics.EZpvd(this.memberCount, groupInvitationInfoResponse.memberCount) && Intrinsics.EZpvd(this.mutualRelationCount, groupInvitationInfoResponse.mutualRelationCount) && Intrinsics.EZpvd(this.expireTime, groupInvitationInfoResponse.expireTime) && Intrinsics.EZpvd(this.inGroupStatus, groupInvitationInfoResponse.inGroupStatus) && this.groupApplicationType == groupInvitationInfoResponse.groupApplicationType && this.groupApplicationStatus == groupInvitationInfoResponse.groupApplicationStatus && Intrinsics.EZpvd(this.assetVerificationInfo, groupInvitationInfoResponse.assetVerificationInfo) && Intrinsics.EZpvd((Object) this.groupDescription, (Object) groupInvitationInfoResponse.groupDescription) && Intrinsics.EZpvd(this.groupOwnerInfo, groupInvitationInfoResponse.groupOwnerInfo) && Intrinsics.EZpvd(this.paidGroupPreview, groupInvitationInfoResponse.paidGroupPreview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationInfo getAssetVerificationInfo() {
        return this.assetVerificationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus getGroupApplicationStatus() {
        return this.groupApplicationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationType getGroupApplicationType() {
        return this.groupApplicationType;
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
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupOwnerInfo getGroupOwnerInfo() {
        return this.groupOwnerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInGroupStatus() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterEnNickname() {
        return this.inviterEnNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterNickname() {
        return this.inviterNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMemberCount() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMutualRelationCount() {
        return this.mutualRelationCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupPreview getPaidGroupPreview() {
        return this.paidGroupPreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.groupId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.groupName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.groupAvatar;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.groupType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str3 = this.inviterNickname;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inviterEnNickname;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.memberCount;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.mutualRelationCount;
        int iHashCode8 = num3 == null ? 0 : num3.hashCode();
        Long l2 = this.expireTime;
        int iHashCode9 = l2 == null ? 0 : l2.hashCode();
        Boolean bool = this.inGroupStatus;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        GroupApplicationType groupApplicationType = this.groupApplicationType;
        int iHashCode11 = groupApplicationType == null ? 0 : groupApplicationType.hashCode();
        GroupApplicationStatus groupApplicationStatus = this.groupApplicationStatus;
        int iHashCode12 = groupApplicationStatus == null ? 0 : groupApplicationStatus.hashCode();
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo = this.assetVerificationInfo;
        int iHashCode13 = groupEntryAssetVerificationInfo == null ? 0 : groupEntryAssetVerificationInfo.hashCode();
        String str5 = this.groupDescription;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        GroupOwnerInfo groupOwnerInfo = this.groupOwnerInfo;
        int iHashCode15 = groupOwnerInfo == null ? 0 : groupOwnerInfo.hashCode();
        PaidGroupPreview paidGroupPreview = this.paidGroupPreview;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (paidGroupPreview == null ? 0 : paidGroupPreview.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupInvitationInfoResponse(groupId=" + this.groupId + ", groupName=" + this.groupName + ", groupAvatar=" + this.groupAvatar + ", groupType=" + this.groupType + ", inviterNickname=" + this.inviterNickname + ", inviterEnNickname=" + this.inviterEnNickname + ", memberCount=" + this.memberCount + ", mutualRelationCount=" + this.mutualRelationCount + ", expireTime=" + this.expireTime + ", inGroupStatus=" + this.inGroupStatus + ", groupApplicationType=" + this.groupApplicationType + ", groupApplicationStatus=" + this.groupApplicationStatus + ", assetVerificationInfo=" + this.assetVerificationInfo + ", groupDescription=" + this.groupDescription + ", groupOwnerInfo=" + this.groupOwnerInfo + ", paidGroupPreview=" + this.paidGroupPreview + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.groupId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.groupName);
        parcel.writeString(this.groupAvatar);
        Integer num = this.groupType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.inviterNickname);
        parcel.writeString(this.inviterEnNickname);
        Integer num2 = this.memberCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.mutualRelationCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Long l2 = this.expireTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Boolean bool = this.inGroupStatus;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        GroupApplicationType groupApplicationType = this.groupApplicationType;
        if (groupApplicationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupApplicationType.writeToParcel(parcel, i);
        }
        GroupApplicationStatus groupApplicationStatus = this.groupApplicationStatus;
        if (groupApplicationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupApplicationStatus.writeToParcel(parcel, i);
        }
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo = this.assetVerificationInfo;
        if (groupEntryAssetVerificationInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupEntryAssetVerificationInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.groupDescription);
        GroupOwnerInfo groupOwnerInfo = this.groupOwnerInfo;
        if (groupOwnerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupOwnerInfo.writeToParcel(parcel, i);
        }
        PaidGroupPreview paidGroupPreview = this.paidGroupPreview;
        if (paidGroupPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paidGroupPreview.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupInvitationInfoResponse> serializer() {
            return GroupInvitationInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupInvitationInfoResponse(int i, Long l, String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Long l2, Boolean bool, GroupApplicationType groupApplicationType, GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, String str5, GroupOwnerInfo groupOwnerInfo, PaidGroupPreview paidGroupPreview, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 2) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str;
        }
        if ((i & 4) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str2;
        }
        if ((i & 8) == 0) {
            this.groupType = null;
        } else {
            this.groupType = num;
        }
        if ((i & 16) == 0) {
            this.inviterNickname = null;
        } else {
            this.inviterNickname = str3;
        }
        if ((i & 32) == 0) {
            this.inviterEnNickname = null;
        } else {
            this.inviterEnNickname = str4;
        }
        if ((i & 64) == 0) {
            this.memberCount = null;
        } else {
            this.memberCount = num2;
        }
        if ((i & 128) == 0) {
            this.mutualRelationCount = null;
        } else {
            this.mutualRelationCount = num3;
        }
        if ((i & 256) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = l2;
        }
        if ((i & 512) == 0) {
            this.inGroupStatus = null;
        } else {
            this.inGroupStatus = bool;
        }
        if ((i & 1024) == 0) {
            this.groupApplicationType = null;
        } else {
            this.groupApplicationType = groupApplicationType;
        }
        if ((i & 2048) == 0) {
            this.groupApplicationStatus = null;
        } else {
            this.groupApplicationStatus = groupApplicationStatus;
        }
        if ((i & 4096) == 0) {
            this.assetVerificationInfo = null;
        } else {
            this.assetVerificationInfo = groupEntryAssetVerificationInfo;
        }
        if ((i & 8192) == 0) {
            this.groupDescription = null;
        } else {
            this.groupDescription = str5;
        }
        if ((i & 16384) == 0) {
            this.groupOwnerInfo = null;
        } else {
            this.groupOwnerInfo = groupOwnerInfo;
        }
        if ((i & 32768) == 0) {
            this.paidGroupPreview = null;
        } else {
            this.paidGroupPreview = paidGroupPreview;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupInvitationInfoResponse groupInvitationInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupInvitationInfoResponse.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, groupInvitationInfoResponse.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupInvitationInfoResponse.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, groupInvitationInfoResponse.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupInvitationInfoResponse.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupInvitationInfoResponse.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupInvitationInfoResponse.groupType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, groupInvitationInfoResponse.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupInvitationInfoResponse.inviterNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupInvitationInfoResponse.inviterNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupInvitationInfoResponse.inviterEnNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, groupInvitationInfoResponse.inviterEnNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupInvitationInfoResponse.memberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, groupInvitationInfoResponse.memberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || groupInvitationInfoResponse.mutualRelationCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, groupInvitationInfoResponse.mutualRelationCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || groupInvitationInfoResponse.expireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, groupInvitationInfoResponse.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || groupInvitationInfoResponse.inGroupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, groupInvitationInfoResponse.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || groupInvitationInfoResponse.groupApplicationType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], groupInvitationInfoResponse.groupApplicationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || groupInvitationInfoResponse.groupApplicationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], groupInvitationInfoResponse.groupApplicationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || groupInvitationInfoResponse.assetVerificationInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, GroupEntryAssetVerificationInfo$$serializer.INSTANCE, groupInvitationInfoResponse.assetVerificationInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || groupInvitationInfoResponse.groupDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, groupInvitationInfoResponse.groupDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || groupInvitationInfoResponse.groupOwnerInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, GroupInvitationInfoResponse$GroupOwnerInfo$$serializer.INSTANCE, groupInvitationInfoResponse.groupOwnerInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && groupInvitationInfoResponse.paidGroupPreview == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, GroupInvitationInfoResponse$PaidGroupPreview$$serializer.INSTANCE, groupInvitationInfoResponse.paidGroupPreview);
    }

    public GroupInvitationInfoResponse(Long l, String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Long l2, Boolean bool, GroupApplicationType groupApplicationType, GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, String str5, GroupOwnerInfo groupOwnerInfo, PaidGroupPreview paidGroupPreview) {
        this.groupId = l;
        this.groupName = str;
        this.groupAvatar = str2;
        this.groupType = num;
        this.inviterNickname = str3;
        this.inviterEnNickname = str4;
        this.memberCount = num2;
        this.mutualRelationCount = num3;
        this.expireTime = l2;
        this.inGroupStatus = bool;
        this.groupApplicationType = groupApplicationType;
        this.groupApplicationStatus = groupApplicationStatus;
        this.assetVerificationInfo = groupEntryAssetVerificationInfo;
        this.groupDescription = str5;
        this.groupOwnerInfo = groupOwnerInfo;
        this.paidGroupPreview = paidGroupPreview;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:com.okinc.okimcore.model.im.group.GroupApplicationType:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupApplicationType) : (r28v0 com.okinc.okimcore.model.im.group.GroupApplicationType))
  (wrap:com.okinc.okimcore.model.im.group.GroupApplicationStatus:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupApplicationStatus) : (r29v0 com.okinc.okimcore.model.im.group.GroupApplicationStatus))
  (wrap:com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo) : (r30v0 com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$GroupOwnerInfo:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$GroupOwnerInfo) : (r32v0 com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$GroupOwnerInfo))
  (wrap:com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$PaidGroupPreview:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$PaidGroupPreview) : (r33v0 com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$PaidGroupPreview))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Boolean, com.okinc.okimcore.model.im.group.GroupApplicationType, com.okinc.okimcore.model.im.group.GroupApplicationStatus, com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo, java.lang.String, com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$GroupOwnerInfo, com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$PaidGroupPreview):void (m)] (LINE:15) call: com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Boolean, com.okinc.okimcore.model.im.group.GroupApplicationType, com.okinc.okimcore.model.im.group.GroupApplicationStatus, com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo, java.lang.String, com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$GroupOwnerInfo, com.okinc.okimcore.model.remote.GroupInvitationInfoResponse$PaidGroupPreview):void type: THIS */
    public /* synthetic */ GroupInvitationInfoResponse(Long l, String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Long l2, Boolean bool, GroupApplicationType groupApplicationType, GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, String str5, GroupOwnerInfo groupOwnerInfo, PaidGroupPreview paidGroupPreview, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : groupApplicationType, (i & 2048) != 0 ? null : groupApplicationStatus, (i & 4096) != 0 ? null : groupEntryAssetVerificationInfo, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : groupOwnerInfo, (i & 32768) != 0 ? null : paidGroupPreview);
    }

    @Serializable
    public static final class GroupOwnerInfo implements Parcelable {
        public static final int $stable = 0;
        private final String avatar;
        private final String nickname;
        private final Long userUid;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<GroupOwnerInfo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<GroupOwnerInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupOwnerInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new GroupOwnerInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupOwnerInfo[] newArray(int i) {
                return new GroupOwnerInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public GroupOwnerInfo() {
            this((Long) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ GroupOwnerInfo copy$default(GroupOwnerInfo groupOwnerInfo, Long l, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = groupOwnerInfo.userUid;
            }
            if ((i & 2) != 0) {
                str = groupOwnerInfo.avatar;
            }
            if ((i & 4) != 0) {
                str2 = groupOwnerInfo.nickname;
            }
            return groupOwnerInfo.copy(l, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component1() {
            return this.userUid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.avatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupOwnerInfo copy(Long l, String str, String str2) {
            return new GroupOwnerInfo(l, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupOwnerInfo)) {
                return false;
            }
            GroupOwnerInfo groupOwnerInfo = (GroupOwnerInfo) obj;
            return Intrinsics.EZpvd(this.userUid, groupOwnerInfo.userUid) && Intrinsics.EZpvd((Object) this.avatar, (Object) groupOwnerInfo.avatar) && Intrinsics.EZpvd((Object) this.nickname, (Object) groupOwnerInfo.nickname);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvatar() {
            return this.avatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getUserUid() {
            return this.userUid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Long l = this.userUid;
            int iHashCode = l == null ? 0 : l.hashCode();
            String str = this.avatar;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.nickname;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GroupOwnerInfo(userUid=" + this.userUid + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Long l = this.userUid;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.avatar);
            parcel.writeString(this.nickname);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.GroupOwnerInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<GroupOwnerInfo> serializer() {
                return GroupInvitationInfoResponse$GroupOwnerInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ GroupOwnerInfo(int i, Long l, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.userUid = null;
            } else {
                this.userUid = l;
            }
            if ((i & 2) == 0) {
                this.avatar = null;
            } else {
                this.avatar = str;
            }
            if ((i & 4) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupOwnerInfo groupOwnerInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupOwnerInfo.userUid != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, groupOwnerInfo.userUid);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupOwnerInfo.avatar != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, groupOwnerInfo.avatar);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && groupOwnerInfo.nickname == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupOwnerInfo.nickname);
        }

        public GroupOwnerInfo(Long l, String str, String str2) {
            this.userUid = l;
            this.avatar = str;
            this.nickname = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.GroupOwnerInfo.<init>(java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ GroupOwnerInfo(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    @Serializable
    public static final class PaidGroupPreview implements Parcelable {
        public static final int $stable = 0;
        private final GroupEntryBillingModel billingModel;
        private final PaymentRequiredStatus paymentRequiredStatus;
        private final TransactionStatus transactionStatus;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PaidGroupPreview> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, PaymentRequiredStatus.Companion.serializer(), TransactionStatus.Companion.serializer()};

        public static final class Creator implements Parcelable.Creator<PaidGroupPreview> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaidGroupPreview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PaidGroupPreview(parcel.readInt() == 0 ? null : GroupEntryBillingModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentRequiredStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TransactionStatus.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaidGroupPreview[] newArray(int i) {
                return new PaidGroupPreview[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PaidGroupPreview() {
            this((GroupEntryBillingModel) null, (PaymentRequiredStatus) null, (TransactionStatus) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PaidGroupPreview copy$default(PaidGroupPreview paidGroupPreview, GroupEntryBillingModel groupEntryBillingModel, PaymentRequiredStatus paymentRequiredStatus, TransactionStatus transactionStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                groupEntryBillingModel = paidGroupPreview.billingModel;
            }
            if ((i & 2) != 0) {
                paymentRequiredStatus = paidGroupPreview.paymentRequiredStatus;
            }
            if ((i & 4) != 0) {
                transactionStatus = paidGroupPreview.transactionStatus;
            }
            return paidGroupPreview.copy(groupEntryBillingModel, paymentRequiredStatus, transactionStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryBillingModel component1() {
            return this.billingModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymentRequiredStatus component2() {
            return this.paymentRequiredStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionStatus component3() {
            return this.transactionStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaidGroupPreview copy(GroupEntryBillingModel groupEntryBillingModel, PaymentRequiredStatus paymentRequiredStatus, TransactionStatus transactionStatus) {
            return new PaidGroupPreview(groupEntryBillingModel, paymentRequiredStatus, transactionStatus);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaidGroupPreview)) {
                return false;
            }
            PaidGroupPreview paidGroupPreview = (PaidGroupPreview) obj;
            return Intrinsics.EZpvd(this.billingModel, paidGroupPreview.billingModel) && this.paymentRequiredStatus == paidGroupPreview.paymentRequiredStatus && this.transactionStatus == paidGroupPreview.transactionStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryBillingModel getBillingModel() {
            return this.billingModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymentRequiredStatus getPaymentRequiredStatus() {
            return this.paymentRequiredStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionStatus getTransactionStatus() {
            return this.transactionStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
            int iHashCode = groupEntryBillingModel == null ? 0 : groupEntryBillingModel.hashCode();
            PaymentRequiredStatus paymentRequiredStatus = this.paymentRequiredStatus;
            int iHashCode2 = paymentRequiredStatus == null ? 0 : paymentRequiredStatus.hashCode();
            TransactionStatus transactionStatus = this.transactionStatus;
            return (((iHashCode * 31) + iHashCode2) * 31) + (transactionStatus != null ? transactionStatus.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaidGroupPreview(billingModel=" + this.billingModel + ", paymentRequiredStatus=" + this.paymentRequiredStatus + ", transactionStatus=" + this.transactionStatus + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
            if (groupEntryBillingModel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                groupEntryBillingModel.writeToParcel(parcel, i);
            }
            PaymentRequiredStatus paymentRequiredStatus = this.paymentRequiredStatus;
            if (paymentRequiredStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                paymentRequiredStatus.writeToParcel(parcel, i);
            }
            TransactionStatus transactionStatus = this.transactionStatus;
            if (transactionStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                transactionStatus.writeToParcel(parcel, i);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.PaidGroupPreview.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PaidGroupPreview> serializer() {
                return GroupInvitationInfoResponse$PaidGroupPreview$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PaidGroupPreview(int i, GroupEntryBillingModel groupEntryBillingModel, PaymentRequiredStatus paymentRequiredStatus, TransactionStatus transactionStatus, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.billingModel = null;
            } else {
                this.billingModel = groupEntryBillingModel;
            }
            if ((i & 2) == 0) {
                this.paymentRequiredStatus = null;
            } else {
                this.paymentRequiredStatus = paymentRequiredStatus;
            }
            if ((i & 4) == 0) {
                this.transactionStatus = null;
            } else {
                this.transactionStatus = transactionStatus;
            }
        }

        public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PaidGroupPreview paidGroupPreview, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || paidGroupPreview.billingModel != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, GroupEntryBillingModel$$serializer.INSTANCE, paidGroupPreview.billingModel);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || paidGroupPreview.paymentRequiredStatus != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], paidGroupPreview.paymentRequiredStatus);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && paidGroupPreview.transactionStatus == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], paidGroupPreview.transactionStatus);
        }

        public PaidGroupPreview(GroupEntryBillingModel groupEntryBillingModel, PaymentRequiredStatus paymentRequiredStatus, TransactionStatus transactionStatus) {
            this.billingModel = groupEntryBillingModel;
            this.paymentRequiredStatus = paymentRequiredStatus;
            this.transactionStatus = transactionStatus;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.GroupEntryBillingModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupEntryBillingModel) : (r2v0 com.okinc.okimcore.model.remote.GroupEntryBillingModel))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus) : (r3v0 com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus))
  (wrap:com.okinc.okimcore.model.im.group.TransactionStatus:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.TransactionStatus) : (r4v0 com.okinc.okimcore.model.im.group.TransactionStatus))
 A[MD:(com.okinc.okimcore.model.remote.GroupEntryBillingModel, com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, com.okinc.okimcore.model.im.group.TransactionStatus):void (m)] (LINE:45) call: com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.PaidGroupPreview.<init>(com.okinc.okimcore.model.remote.GroupEntryBillingModel, com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, com.okinc.okimcore.model.im.group.TransactionStatus):void type: THIS */
        public /* synthetic */ PaidGroupPreview(GroupEntryBillingModel groupEntryBillingModel, PaymentRequiredStatus paymentRequiredStatus, TransactionStatus transactionStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : groupEntryBillingModel, (i & 2) != 0 ? null : paymentRequiredStatus, (i & 4) != 0 ? null : transactionStatus);
        }
    }
}
