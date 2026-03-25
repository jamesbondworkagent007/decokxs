package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo$$serializer;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig$$serializer;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupInfo implements Parcelable {
    private final boolean allowFile;
    private final Boolean allowLeaveGroup;
    private final boolean allowPay;
    private final boolean allowPayGifts;
    private final boolean allowStartGroupVoiceCall;
    private final boolean allowVoice;
    private final double assetAmount;
    private final Integer assetCurrencyId;
    private final String assetCurrencySymbol;
    private final String avatar;
    private final String bizGroupName;
    private final boolean canUpdateBizGroupName;
    private final boolean convertGroupToPublic;
    private final List<CtaInfo> ctas;
    private final String description;
    private final GroupCampaignInfo groupCampaign;
    private final Integer groupCapacity;
    private final int groupCount;
    private final String groupId;
    private final long groupNoticeId;
    private GroupVoiceCallConfig groupVoiceCallConfig;
    private final InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus;
    private final boolean isAllowAddMember;
    private final boolean isAllowAtAll;
    private final boolean isAllowDeleteAnnouncement;
    private final boolean isAllowDisbandGroup;
    private final boolean isAllowGeneratingInvitationQrCode;
    private final boolean isAllowInviteAnyone;
    private final boolean isAllowMembersToAddMembers;
    private final boolean isAllowMentionOthers;
    private final boolean isAllowMentionedRobot;
    private final boolean isAllowMuteUnmuteMember;
    private final boolean isAllowPostAnnouncement;
    private final boolean isAllowPrivacyChat;
    private final boolean isAllowRemoveMember;
    private final boolean isAllowSendLink;
    private final boolean isAllowSendMessageKyc;
    private final boolean isAllowSetRole;
    private final boolean isAllowSharingInvitationQrCode;
    private final boolean isAllowShowGroupInfo;
    private final boolean isAllowUpdateGroupProfile;
    private final boolean isAllowUpdateGroupSetting;
    private final boolean isAssetVerify;
    private final boolean isCanTransferOwnership;
    private final boolean isDissolve;
    private final boolean isJoinedGroup;
    private final boolean isMaterApproval;
    private final boolean isMute;
    private final boolean isPayMode;
    private final boolean isShowAddAffiliateMember;
    private final boolean isShowAddGroupMember;
    private final boolean isShowNotice;
    private final long maxMemberCount;
    private final String name;
    private final String notice;
    private final long noticeEditTime;
    private final OfficialTagInfo officialTags;
    private final Long orbiterExpiryTimeStamp;
    private final String ownerId;
    private final PaidGroupInfo paidGroupInfo;
    private final double payAmount;
    private final Integer payCurrencyId;
    private final String payCurrencySymbol;
    private final int pendingJoinRequests;
    private final GroupPublicType publicGroupType;
    private final boolean requireAdminApprovalToJoin;
    private final boolean reviewJoinApplications;
    private final List<GroupMemberInfo> topGroupMemberList;
    private final Integer type;
    private final GroupUserSettingInfo userSettingInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GroupInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(GroupMemberInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GroupPublicType.Companion.serializer(), null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig.IncreaseGroupStatus", InHouseIMSuperGroupConfig.IncreaseGroupStatus.values()), null, null, null, new ArrayListSerializer(CtaInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<GroupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string7 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            double d = parcel.readDouble();
            boolean z4 = parcel.readInt() != 0;
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            double d2 = parcel.readDouble();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            boolean z5 = z2;
            ArrayList arrayList3 = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList3.add(GroupMemberInfo.CREATOR.createFromParcel(parcel));
                i3++;
                i2 = i2;
            }
            GroupUserSettingInfo groupUserSettingInfoCreateFromParcel = parcel.readInt() == 0 ? null : GroupUserSettingInfo.CREATOR.createFromParcel(parcel);
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            OfficialTagInfo officialTagInfoCreateFromParcel = parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel);
            boolean z8 = parcel.readInt() != 0;
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            boolean z20 = parcel.readInt() != 0;
            boolean z21 = parcel.readInt() != 0;
            boolean z22 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            boolean z25 = parcel.readInt() != 0;
            boolean z26 = parcel.readInt() != 0;
            boolean z27 = parcel.readInt() != 0;
            boolean z28 = parcel.readInt() != 0;
            boolean z29 = parcel.readInt() != 0;
            boolean z30 = parcel.readInt() != 0;
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z31 = parcel.readInt() != 0;
            boolean z32 = parcel.readInt() != 0;
            boolean z33 = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            long j3 = parcel.readLong();
            boolean z34 = parcel.readInt() != 0;
            boolean z35 = parcel.readInt() != 0;
            boolean z36 = parcel.readInt() != 0;
            boolean z37 = parcel.readInt() != 0;
            boolean z38 = parcel.readInt() != 0;
            boolean z39 = parcel.readInt() != 0;
            PaidGroupInfo paidGroupInfoCreateFromParcel = parcel.readInt() == 0 ? null : PaidGroupInfo.CREATOR.createFromParcel(parcel);
            GroupPublicType groupPublicTypeCreateFromParcel = parcel.readInt() == 0 ? null : GroupPublicType.CREATOR.createFromParcel(parcel);
            boolean z40 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatusValueOf = parcel.readInt() == 0 ? null : InHouseIMSuperGroupConfig.IncreaseGroupStatus.valueOf(parcel.readString());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupCampaignInfo groupCampaignInfoCreateFromParcel = parcel.readInt() == 0 ? null : GroupCampaignInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = arrayList3;
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                arrayList = arrayList3;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList4.add(CtaInfo.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList2 = arrayList4;
            }
            return new GroupInfo(string, string2, string3, string4, z, string5, string6, j, j2, string7, z5, z3, numValueOf, string8, d, z4, numValueOf2, string9, d2, i, arrayList, groupUserSettingInfoCreateFromParcel, z6, z7, officialTagInfoCreateFromParcel, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, numValueOf3, z31, z32, z33, i4, j3, z34, z35, z36, z37, z38, z39, paidGroupInfoCreateFromParcel, groupPublicTypeCreateFromParcel, z40, boolValueOf, increaseGroupStatusValueOf, lValueOf, numValueOf4, groupCampaignInfoCreateFromParcel, arrayList2, parcel.readInt() != 0 ? GroupVoiceCallConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupInfo[] newArray(int i) {
            return new GroupInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: com.okinc.okimcore.model.other.GroupInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupInfo copy$default(GroupInfo groupInfo, String str, String str2, String str3, String str4, boolean z, String str5, String str6, long j, long j2, String str7, boolean z2, boolean z3, Integer num, String str8, double d, boolean z4, Integer num2, String str9, double d2, int i, List list, GroupUserSettingInfo groupUserSettingInfo, boolean z5, boolean z6, OfficialTagInfo officialTagInfo, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, Integer num3, boolean z30, boolean z31, boolean z32, int i2, long j3, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, boolean z39, Boolean bool, InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus, Long l, Integer num4, GroupCampaignInfo groupCampaignInfo, List list2, GroupVoiceCallConfig groupVoiceCallConfig, int i3, int i4, int i5, Object obj) {
        String str10 = (i3 & 1) != 0 ? groupInfo.groupId : str;
        String str11 = (i3 & 2) != 0 ? groupInfo.ownerId : str2;
        String str12 = (i3 & 4) != 0 ? groupInfo.name : str3;
        String str13 = (i3 & 8) != 0 ? groupInfo.bizGroupName : str4;
        boolean z40 = (i3 & 16) != 0 ? groupInfo.canUpdateBizGroupName : z;
        String str14 = (i3 & 32) != 0 ? groupInfo.avatar : str5;
        String str15 = (i3 & 64) != 0 ? groupInfo.notice : str6;
        long j4 = (i3 & 128) != 0 ? groupInfo.noticeEditTime : j;
        long j5 = (i3 & 256) != 0 ? groupInfo.groupNoticeId : j2;
        String str16 = (i3 & 512) != 0 ? groupInfo.description : str7;
        boolean z41 = (i3 & 1024) != 0 ? groupInfo.isMaterApproval : z2;
        boolean z42 = (i3 & 2048) != 0 ? groupInfo.isAssetVerify : z3;
        Integer num5 = (i3 & 4096) != 0 ? groupInfo.assetCurrencyId : num;
        String str17 = (i3 & 8192) != 0 ? groupInfo.assetCurrencySymbol : str8;
        String str18 = str16;
        double d3 = (i3 & 16384) != 0 ? groupInfo.assetAmount : d;
        boolean z43 = (i3 & 32768) != 0 ? groupInfo.isPayMode : z4;
        return groupInfo.copy(str10, str11, str12, str13, z40, str14, str15, j4, j5, str18, z41, z42, num5, str17, d3, z43, (i3 & 65536) != 0 ? groupInfo.payCurrencyId : num2, (i3 & 131072) != 0 ? groupInfo.payCurrencySymbol : str9, (i3 & 262144) != 0 ? groupInfo.payAmount : d2, (i3 & 524288) != 0 ? groupInfo.groupCount : i, (i3 & 1048576) != 0 ? groupInfo.topGroupMemberList : list, (i3 & 2097152) != 0 ? groupInfo.userSettingInfo : groupUserSettingInfo, (i3 & 4194304) != 0 ? groupInfo.isJoinedGroup : z5, (i3 & 8388608) != 0 ? groupInfo.isDissolve : z6, (i3 & 16777216) != 0 ? groupInfo.officialTags : officialTagInfo, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? groupInfo.isShowNotice : z7, (i3 & 67108864) != 0 ? groupInfo.isAllowPrivacyChat : z8, (i3 & 134217728) != 0 ? groupInfo.isAllowSendLink : z9, (i3 & 268435456) != 0 ? groupInfo.isAllowMentionedRobot : z10, (i3 & 536870912) != 0 ? groupInfo.isShowAddGroupMember : z11, (i3 & 1073741824) != 0 ? groupInfo.isShowAddAffiliateMember : z12, (i3 & Integer.MIN_VALUE) != 0 ? groupInfo.isMute : z13, (i4 & 1) != 0 ? groupInfo.isAllowMentionOthers : z14, (i4 & 2) != 0 ? groupInfo.isCanTransferOwnership : z15, (i4 & 4) != 0 ? groupInfo.isAllowSetRole : z16, (i4 & 8) != 0 ? groupInfo.isAllowMuteUnmuteMember : z17, (i4 & 16) != 0 ? groupInfo.isAllowDisbandGroup : z18, (i4 & 32) != 0 ? groupInfo.isAllowPostAnnouncement : z19, (i4 & 64) != 0 ? groupInfo.isAllowDeleteAnnouncement : z20, (i4 & 128) != 0 ? groupInfo.isAllowUpdateGroupSetting : z21, (i4 & 256) != 0 ? groupInfo.isAllowUpdateGroupProfile : z22, (i4 & 512) != 0 ? groupInfo.isAllowAddMember : z23, (i4 & 1024) != 0 ? groupInfo.isAllowRemoveMember : z24, (i4 & 2048) != 0 ? groupInfo.isAllowAtAll : z25, (i4 & 4096) != 0 ? groupInfo.isAllowInviteAnyone : z26, (i4 & 8192) != 0 ? groupInfo.isAllowSendMessageKyc : z27, (i4 & 16384) != 0 ? groupInfo.isAllowMembersToAddMembers : z28, (i4 & 32768) != 0 ? groupInfo.isAllowSharingInvitationQrCode : z29, (i4 & 65536) != 0 ? groupInfo.type : num3, (i4 & 131072) != 0 ? groupInfo.isAllowShowGroupInfo : z30, (i4 & 262144) != 0 ? groupInfo.isAllowGeneratingInvitationQrCode : z31, (i4 & 524288) != 0 ? groupInfo.requireAdminApprovalToJoin : z32, (i4 & 1048576) != 0 ? groupInfo.pendingJoinRequests : i2, (i4 & 2097152) != 0 ? groupInfo.maxMemberCount : j3, (i4 & 4194304) != 0 ? groupInfo.reviewJoinApplications : z33, (8388608 & i4) != 0 ? groupInfo.allowPayGifts : z34, (i4 & 16777216) != 0 ? groupInfo.allowStartGroupVoiceCall : z35, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? groupInfo.allowPay : z36, (i4 & 67108864) != 0 ? groupInfo.allowVoice : z37, (i4 & 134217728) != 0 ? groupInfo.allowFile : z38, (i4 & 268435456) != 0 ? groupInfo.paidGroupInfo : paidGroupInfo, (i4 & 536870912) != 0 ? groupInfo.publicGroupType : groupPublicType, (i4 & 1073741824) != 0 ? groupInfo.convertGroupToPublic : z39, (i4 & Integer.MIN_VALUE) != 0 ? groupInfo.allowLeaveGroup : bool, (i5 & 1) != 0 ? groupInfo.increaseGroupStatus : increaseGroupStatus, (i5 & 2) != 0 ? groupInfo.orbiterExpiryTimeStamp : l, (i5 & 4) != 0 ? groupInfo.groupCapacity : num4, (i5 & 8) != 0 ? groupInfo.groupCampaign : groupCampaignInfo, (i5 & 16) != 0 ? groupInfo.ctas : list2, (i5 & 32) != 0 ? groupInfo.groupVoiceCallConfig : groupVoiceCallConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isMaterApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isAssetVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.assetCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.assetCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component15() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isPayMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.payCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.payCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component19() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ownerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.groupCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupMemberInfo> component21() {
        return this.topGroupMemberList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupUserSettingInfo component22() {
        return this.userSettingInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.isJoinedGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.isDissolve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component25() {
        return this.officialTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.isShowNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.isAllowPrivacyChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.isAllowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.isAllowMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.isShowAddGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.isShowAddAffiliateMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.isAllowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.isCanTransferOwnership;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isAllowSetRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isAllowMuteUnmuteMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isAllowDisbandGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component38() {
        return this.isAllowPostAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component39() {
        return this.isAllowDeleteAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.isAllowUpdateGroupSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component41() {
        return this.isAllowUpdateGroupProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component42() {
        return this.isAllowAddMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.isAllowRemoveMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component44() {
        return this.isAllowAtAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component45() {
        return this.isAllowInviteAnyone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component46() {
        return this.isAllowSendMessageKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component47() {
        return this.isAllowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component48() {
        return this.isAllowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component49() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.canUpdateBizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component50() {
        return this.isAllowShowGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component51() {
        return this.isAllowGeneratingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component52() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component53() {
        return this.pendingJoinRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component54() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component55() {
        return this.reviewJoinApplications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component56() {
        return this.allowPayGifts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component57() {
        return this.allowStartGroupVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component58() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component59() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component60() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo component61() {
        return this.paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType component62() {
        return this.publicGroupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component63() {
        return this.convertGroupToPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component64() {
        return this.allowLeaveGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig.IncreaseGroupStatus component65() {
        return this.increaseGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component66() {
        return this.orbiterExpiryTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component67() {
        return this.groupCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupCampaignInfo component68() {
        return this.groupCampaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CtaInfo> component69() {
        return this.ctas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig component70() {
        return this.groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.noticeEditTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, boolean z, @NotNull String str5, @NotNull String str6, long j, long j2, @NotNull String str7, boolean z2, boolean z3, Integer num, String str8, double d, boolean z4, Integer num2, String str9, double d2, int i, @NotNull List<GroupMemberInfo> list, GroupUserSettingInfo groupUserSettingInfo, boolean z5, boolean z6, OfficialTagInfo officialTagInfo, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, Integer num3, boolean z30, boolean z31, boolean z32, int i2, long j3, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, boolean z39, Boolean bool, InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus, Long l, Integer num4, GroupCampaignInfo groupCampaignInfo, List<CtaInfo> list2, GroupVoiceCallConfig groupVoiceCallConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GroupInfo(str, str2, str3, str4, z, str5, str6, j, j2, str7, z2, z3, num, str8, d, z4, num2, str9, d2, i, list, groupUserSettingInfo, z5, z6, officialTagInfo, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, num3, z30, z31, z32, i2, j3, z33, z34, z35, z36, z37, z38, paidGroupInfo, groupPublicType, z39, bool, increaseGroupStatus, l, num4, groupCampaignInfo, list2, groupVoiceCallConfig);
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
        if (!(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) groupInfo.groupId) && Intrinsics.EZpvd((Object) this.ownerId, (Object) groupInfo.ownerId) && Intrinsics.EZpvd((Object) this.name, (Object) groupInfo.name) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) groupInfo.bizGroupName) && this.canUpdateBizGroupName == groupInfo.canUpdateBizGroupName && Intrinsics.EZpvd((Object) this.avatar, (Object) groupInfo.avatar) && Intrinsics.EZpvd((Object) this.notice, (Object) groupInfo.notice) && this.noticeEditTime == groupInfo.noticeEditTime && this.groupNoticeId == groupInfo.groupNoticeId && Intrinsics.EZpvd((Object) this.description, (Object) groupInfo.description) && this.isMaterApproval == groupInfo.isMaterApproval && this.isAssetVerify == groupInfo.isAssetVerify && Intrinsics.EZpvd(this.assetCurrencyId, groupInfo.assetCurrencyId) && Intrinsics.EZpvd((Object) this.assetCurrencySymbol, (Object) groupInfo.assetCurrencySymbol) && Double.compare(this.assetAmount, groupInfo.assetAmount) == 0 && this.isPayMode == groupInfo.isPayMode && Intrinsics.EZpvd(this.payCurrencyId, groupInfo.payCurrencyId) && Intrinsics.EZpvd((Object) this.payCurrencySymbol, (Object) groupInfo.payCurrencySymbol) && Double.compare(this.payAmount, groupInfo.payAmount) == 0 && this.groupCount == groupInfo.groupCount && Intrinsics.EZpvd(this.topGroupMemberList, groupInfo.topGroupMemberList) && Intrinsics.EZpvd(this.userSettingInfo, groupInfo.userSettingInfo) && this.isJoinedGroup == groupInfo.isJoinedGroup && this.isDissolve == groupInfo.isDissolve && Intrinsics.EZpvd(this.officialTags, groupInfo.officialTags) && this.isShowNotice == groupInfo.isShowNotice && this.isAllowPrivacyChat == groupInfo.isAllowPrivacyChat && this.isAllowSendLink == groupInfo.isAllowSendLink && this.isAllowMentionedRobot == groupInfo.isAllowMentionedRobot && this.isShowAddGroupMember == groupInfo.isShowAddGroupMember && this.isShowAddAffiliateMember == groupInfo.isShowAddAffiliateMember && this.isMute == groupInfo.isMute && this.isAllowMentionOthers == groupInfo.isAllowMentionOthers && this.isCanTransferOwnership == groupInfo.isCanTransferOwnership && this.isAllowSetRole == groupInfo.isAllowSetRole && this.isAllowMuteUnmuteMember == groupInfo.isAllowMuteUnmuteMember && this.isAllowDisbandGroup == groupInfo.isAllowDisbandGroup && this.isAllowPostAnnouncement == groupInfo.isAllowPostAnnouncement && this.isAllowDeleteAnnouncement == groupInfo.isAllowDeleteAnnouncement && this.isAllowUpdateGroupSetting == groupInfo.isAllowUpdateGroupSetting && this.isAllowUpdateGroupProfile == groupInfo.isAllowUpdateGroupProfile && this.isAllowAddMember == groupInfo.isAllowAddMember && this.isAllowRemoveMember == groupInfo.isAllowRemoveMember && this.isAllowAtAll == groupInfo.isAllowAtAll && this.isAllowInviteAnyone == groupInfo.isAllowInviteAnyone && this.isAllowSendMessageKyc == groupInfo.isAllowSendMessageKyc && this.isAllowMembersToAddMembers == groupInfo.isAllowMembersToAddMembers && this.isAllowSharingInvitationQrCode == groupInfo.isAllowSharingInvitationQrCode && Intrinsics.EZpvd(this.type, groupInfo.type) && this.isAllowShowGroupInfo == groupInfo.isAllowShowGroupInfo && this.isAllowGeneratingInvitationQrCode == groupInfo.isAllowGeneratingInvitationQrCode && this.requireAdminApprovalToJoin == groupInfo.requireAdminApprovalToJoin && this.pendingJoinRequests == groupInfo.pendingJoinRequests && this.maxMemberCount == groupInfo.maxMemberCount && this.reviewJoinApplications == groupInfo.reviewJoinApplications && this.allowPayGifts == groupInfo.allowPayGifts && this.allowStartGroupVoiceCall == groupInfo.allowStartGroupVoiceCall && this.allowPay == groupInfo.allowPay && this.allowVoice == groupInfo.allowVoice && this.allowFile == groupInfo.allowFile && Intrinsics.EZpvd(this.paidGroupInfo, groupInfo.paidGroupInfo) && this.publicGroupType == groupInfo.publicGroupType && this.convertGroupToPublic == groupInfo.convertGroupToPublic && Intrinsics.EZpvd(this.allowLeaveGroup, groupInfo.allowLeaveGroup) && this.increaseGroupStatus == groupInfo.increaseGroupStatus && Intrinsics.EZpvd(this.orbiterExpiryTimeStamp, groupInfo.orbiterExpiryTimeStamp) && Intrinsics.EZpvd(this.groupCapacity, groupInfo.groupCapacity) && Intrinsics.EZpvd(this.groupCampaign, groupInfo.groupCampaign) && Intrinsics.EZpvd(this.ctas, groupInfo.ctas) && Intrinsics.EZpvd(this.groupVoiceCallConfig, groupInfo.groupVoiceCallConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowFile() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowLeaveGroup() {
        return this.allowLeaveGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowPay() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowPayGifts() {
        return this.allowPayGifts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowStartGroupVoiceCall() {
        return this.allowStartGroupVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowVoice() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getAssetAmount() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAssetCurrencyId() {
        return this.assetCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetCurrencySymbol() {
        return this.assetCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizGroupName() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUpdateBizGroupName() {
        return this.canUpdateBizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getConvertGroupToPublic() {
        return this.convertGroupToPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CtaInfo> getCtas() {
        return this.ctas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupCampaignInfo getGroupCampaign() {
        return this.groupCampaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupCapacity() {
        return this.groupCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroupCount() {
        return this.groupCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupNoticeId() {
        return this.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig getGroupVoiceCallConfig() {
        return this.groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig.IncreaseGroupStatus getIncreaseGroupStatus() {
        return this.increaseGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaxMemberCount() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotice() {
        return this.notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getNoticeEditTime() {
        return this.noticeEditTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTags() {
        return this.officialTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOrbiterExpiryTimeStamp() {
        return this.orbiterExpiryTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo getPaidGroupInfo() {
        return this.paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPayAmount() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPayCurrencyId() {
        return this.payCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCurrencySymbol() {
        return this.payCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPendingJoinRequests() {
        return this.pendingJoinRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType getPublicGroupType() {
        return this.publicGroupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequireAdminApprovalToJoin() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReviewJoinApplications() {
        return this.reviewJoinApplications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupMemberInfo> getTopGroupMemberList() {
        return this.topGroupMemberList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupUserSettingInfo getUserSettingInfo() {
        return this.userSettingInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2;
        int iHashCode3 = this.groupId.hashCode();
        int iHashCode4 = this.ownerId.hashCode();
        int iHashCode5 = this.name.hashCode();
        String str = this.bizGroupName;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Boolean.hashCode(this.canUpdateBizGroupName);
        int iHashCode8 = this.avatar.hashCode();
        int iHashCode9 = this.notice.hashCode();
        int iHashCode10 = Long.hashCode(this.noticeEditTime);
        int iHashCode11 = Long.hashCode(this.groupNoticeId);
        int iHashCode12 = this.description.hashCode();
        int iHashCode13 = Boolean.hashCode(this.isMaterApproval);
        int iHashCode14 = Boolean.hashCode(this.isAssetVerify);
        Integer num = this.assetCurrencyId;
        int iHashCode15 = num == null ? 0 : num.hashCode();
        String str2 = this.assetCurrencySymbol;
        if (str2 == null) {
            i = iHashCode7;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            i = iHashCode7;
        }
        int iHashCode16 = Double.hashCode(this.assetAmount);
        int iHashCode17 = Boolean.hashCode(this.isPayMode);
        Integer num2 = this.payCurrencyId;
        int iHashCode18 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.payCurrencySymbol;
        if (str3 == null) {
            i2 = iHashCode16;
            iHashCode2 = 0;
        } else {
            i2 = iHashCode16;
            iHashCode2 = str3.hashCode();
        }
        int iHashCode19 = Double.hashCode(this.payAmount);
        int iHashCode20 = Integer.hashCode(this.groupCount);
        int iHashCode21 = this.topGroupMemberList.hashCode();
        GroupUserSettingInfo groupUserSettingInfo = this.userSettingInfo;
        int iHashCode22 = groupUserSettingInfo == null ? 0 : groupUserSettingInfo.hashCode();
        int iHashCode23 = Boolean.hashCode(this.isJoinedGroup);
        int iHashCode24 = Boolean.hashCode(this.isDissolve);
        OfficialTagInfo officialTagInfo = this.officialTags;
        int iHashCode25 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        int iHashCode26 = Boolean.hashCode(this.isShowNotice);
        int iHashCode27 = Boolean.hashCode(this.isAllowPrivacyChat);
        int iHashCode28 = Boolean.hashCode(this.isAllowSendLink);
        int iHashCode29 = Boolean.hashCode(this.isAllowMentionedRobot);
        int iHashCode30 = Boolean.hashCode(this.isShowAddGroupMember);
        int iHashCode31 = Boolean.hashCode(this.isShowAddAffiliateMember);
        int iHashCode32 = Boolean.hashCode(this.isMute);
        int iHashCode33 = Boolean.hashCode(this.isAllowMentionOthers);
        int iHashCode34 = Boolean.hashCode(this.isCanTransferOwnership);
        int iHashCode35 = Boolean.hashCode(this.isAllowSetRole);
        int iHashCode36 = Boolean.hashCode(this.isAllowMuteUnmuteMember);
        int iHashCode37 = Boolean.hashCode(this.isAllowDisbandGroup);
        int iHashCode38 = Boolean.hashCode(this.isAllowPostAnnouncement);
        int iHashCode39 = Boolean.hashCode(this.isAllowDeleteAnnouncement);
        int iHashCode40 = Boolean.hashCode(this.isAllowUpdateGroupSetting);
        int iHashCode41 = Boolean.hashCode(this.isAllowUpdateGroupProfile);
        int iHashCode42 = Boolean.hashCode(this.isAllowAddMember);
        int iHashCode43 = Boolean.hashCode(this.isAllowRemoveMember);
        int iHashCode44 = Boolean.hashCode(this.isAllowAtAll);
        int iHashCode45 = Boolean.hashCode(this.isAllowInviteAnyone);
        int iHashCode46 = Boolean.hashCode(this.isAllowSendMessageKyc);
        int iHashCode47 = Boolean.hashCode(this.isAllowMembersToAddMembers);
        int iHashCode48 = Boolean.hashCode(this.isAllowSharingInvitationQrCode);
        Integer num3 = this.type;
        int iHashCode49 = num3 == null ? 0 : num3.hashCode();
        int iHashCode50 = Boolean.hashCode(this.isAllowShowGroupInfo);
        int iHashCode51 = Boolean.hashCode(this.isAllowGeneratingInvitationQrCode);
        int iHashCode52 = Boolean.hashCode(this.requireAdminApprovalToJoin);
        int iHashCode53 = Integer.hashCode(this.pendingJoinRequests);
        int iHashCode54 = Long.hashCode(this.maxMemberCount);
        int iHashCode55 = Boolean.hashCode(this.reviewJoinApplications);
        int iHashCode56 = Boolean.hashCode(this.allowPayGifts);
        int iHashCode57 = Boolean.hashCode(this.allowStartGroupVoiceCall);
        int iHashCode58 = Boolean.hashCode(this.allowPay);
        int iHashCode59 = Boolean.hashCode(this.allowVoice);
        int iHashCode60 = Boolean.hashCode(this.allowFile);
        PaidGroupInfo paidGroupInfo = this.paidGroupInfo;
        int iHashCode61 = paidGroupInfo == null ? 0 : paidGroupInfo.hashCode();
        GroupPublicType groupPublicType = this.publicGroupType;
        int iHashCode62 = groupPublicType == null ? 0 : groupPublicType.hashCode();
        int iHashCode63 = Boolean.hashCode(this.convertGroupToPublic);
        Boolean bool = this.allowLeaveGroup;
        int iHashCode64 = bool == null ? 0 : bool.hashCode();
        InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus = this.increaseGroupStatus;
        int iHashCode65 = increaseGroupStatus == null ? 0 : increaseGroupStatus.hashCode();
        Long l = this.orbiterExpiryTimeStamp;
        int iHashCode66 = l == null ? 0 : l.hashCode();
        Integer num4 = this.groupCapacity;
        int iHashCode67 = num4 == null ? 0 : num4.hashCode();
        GroupCampaignInfo groupCampaignInfo = this.groupCampaign;
        int iHashCode68 = groupCampaignInfo == null ? 0 : groupCampaignInfo.hashCode();
        List<CtaInfo> list = this.ctas;
        int iHashCode69 = list == null ? 0 : list.hashCode();
        GroupVoiceCallConfig groupVoiceCallConfig = this.groupVoiceCallConfig;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + i) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode2) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + (groupVoiceCallConfig == null ? 0 : groupVoiceCallConfig.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowAddMember() {
        return this.isAllowAddMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowAtAll() {
        return this.isAllowAtAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowDeleteAnnouncement() {
        return this.isAllowDeleteAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowDisbandGroup() {
        return this.isAllowDisbandGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowGeneratingInvitationQrCode() {
        return this.isAllowGeneratingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowInviteAnyone() {
        return this.isAllowInviteAnyone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowMembersToAddMembers() {
        return this.isAllowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowMentionOthers() {
        return this.isAllowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowMentionedRobot() {
        return this.isAllowMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowMuteUnmuteMember() {
        return this.isAllowMuteUnmuteMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowPostAnnouncement() {
        return this.isAllowPostAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowPrivacyChat() {
        return this.isAllowPrivacyChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowRemoveMember() {
        return this.isAllowRemoveMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSendLink() {
        return this.isAllowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSendMessageKyc() {
        return this.isAllowSendMessageKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSetRole() {
        return this.isAllowSetRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSharingInvitationQrCode() {
        return this.isAllowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowShowGroupInfo() {
        return this.isAllowShowGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowUpdateGroupProfile() {
        return this.isAllowUpdateGroupProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowUpdateGroupSetting() {
        return this.isAllowUpdateGroupSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAssetVerify() {
        return this.isAssetVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCanTransferOwnership() {
        return this.isCanTransferOwnership;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDissolve() {
        return this.isDissolve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isJoinedGroup() {
        return this.isJoinedGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMaterApproval() {
        return this.isMaterApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMute() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPayMode() {
        return this.isPayMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowAddAffiliateMember() {
        return this.isShowAddAffiliateMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowAddGroupMember() {
        return this.isShowAddGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowNotice() {
        return this.isShowNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupVoiceCallConfig(GroupVoiceCallConfig groupVoiceCallConfig) {
        this.groupVoiceCallConfig = groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupInfo(groupId=" + this.groupId + ", ownerId=" + this.ownerId + ", name=" + this.name + ", bizGroupName=" + this.bizGroupName + ", canUpdateBizGroupName=" + this.canUpdateBizGroupName + ", avatar=" + this.avatar + ", notice=" + this.notice + ", noticeEditTime=" + this.noticeEditTime + ", groupNoticeId=" + this.groupNoticeId + ", description=" + this.description + ", isMaterApproval=" + this.isMaterApproval + ", isAssetVerify=" + this.isAssetVerify + ", assetCurrencyId=" + this.assetCurrencyId + ", assetCurrencySymbol=" + this.assetCurrencySymbol + ", assetAmount=" + this.assetAmount + ", isPayMode=" + this.isPayMode + ", payCurrencyId=" + this.payCurrencyId + ", payCurrencySymbol=" + this.payCurrencySymbol + ", payAmount=" + this.payAmount + ", groupCount=" + this.groupCount + ", topGroupMemberList=" + this.topGroupMemberList + ", userSettingInfo=" + this.userSettingInfo + ", isJoinedGroup=" + this.isJoinedGroup + ", isDissolve=" + this.isDissolve + ", officialTags=" + this.officialTags + ", isShowNotice=" + this.isShowNotice + ", isAllowPrivacyChat=" + this.isAllowPrivacyChat + ", isAllowSendLink=" + this.isAllowSendLink + ", isAllowMentionedRobot=" + this.isAllowMentionedRobot + ", isShowAddGroupMember=" + this.isShowAddGroupMember + ", isShowAddAffiliateMember=" + this.isShowAddAffiliateMember + ", isMute=" + this.isMute + ", isAllowMentionOthers=" + this.isAllowMentionOthers + ", isCanTransferOwnership=" + this.isCanTransferOwnership + ", isAllowSetRole=" + this.isAllowSetRole + ", isAllowMuteUnmuteMember=" + this.isAllowMuteUnmuteMember + ", isAllowDisbandGroup=" + this.isAllowDisbandGroup + ", isAllowPostAnnouncement=" + this.isAllowPostAnnouncement + ", isAllowDeleteAnnouncement=" + this.isAllowDeleteAnnouncement + ", isAllowUpdateGroupSetting=" + this.isAllowUpdateGroupSetting + ", isAllowUpdateGroupProfile=" + this.isAllowUpdateGroupProfile + ", isAllowAddMember=" + this.isAllowAddMember + ", isAllowRemoveMember=" + this.isAllowRemoveMember + ", isAllowAtAll=" + this.isAllowAtAll + ", isAllowInviteAnyone=" + this.isAllowInviteAnyone + ", isAllowSendMessageKyc=" + this.isAllowSendMessageKyc + ", isAllowMembersToAddMembers=" + this.isAllowMembersToAddMembers + ", isAllowSharingInvitationQrCode=" + this.isAllowSharingInvitationQrCode + ", type=" + this.type + ", isAllowShowGroupInfo=" + this.isAllowShowGroupInfo + ", isAllowGeneratingInvitationQrCode=" + this.isAllowGeneratingInvitationQrCode + ", requireAdminApprovalToJoin=" + this.requireAdminApprovalToJoin + ", pendingJoinRequests=" + this.pendingJoinRequests + ", maxMemberCount=" + this.maxMemberCount + ", reviewJoinApplications=" + this.reviewJoinApplications + ", allowPayGifts=" + this.allowPayGifts + ", allowStartGroupVoiceCall=" + this.allowStartGroupVoiceCall + ", allowPay=" + this.allowPay + ", allowVoice=" + this.allowVoice + ", allowFile=" + this.allowFile + ", paidGroupInfo=" + this.paidGroupInfo + ", publicGroupType=" + this.publicGroupType + ", convertGroupToPublic=" + this.convertGroupToPublic + ", allowLeaveGroup=" + this.allowLeaveGroup + ", increaseGroupStatus=" + this.increaseGroupStatus + ", orbiterExpiryTimeStamp=" + this.orbiterExpiryTimeStamp + ", groupCapacity=" + this.groupCapacity + ", groupCampaign=" + this.groupCampaign + ", ctas=" + this.ctas + ", groupVoiceCallConfig=" + this.groupVoiceCallConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupId);
        parcel.writeString(this.ownerId);
        parcel.writeString(this.name);
        parcel.writeString(this.bizGroupName);
        parcel.writeInt(this.canUpdateBizGroupName ? 1 : 0);
        parcel.writeString(this.avatar);
        parcel.writeString(this.notice);
        parcel.writeLong(this.noticeEditTime);
        parcel.writeLong(this.groupNoticeId);
        parcel.writeString(this.description);
        parcel.writeInt(this.isMaterApproval ? 1 : 0);
        parcel.writeInt(this.isAssetVerify ? 1 : 0);
        Integer num = this.assetCurrencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.assetCurrencySymbol);
        parcel.writeDouble(this.assetAmount);
        parcel.writeInt(this.isPayMode ? 1 : 0);
        Integer num2 = this.payCurrencyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.payCurrencySymbol);
        parcel.writeDouble(this.payAmount);
        parcel.writeInt(this.groupCount);
        List<GroupMemberInfo> list = this.topGroupMemberList;
        parcel.writeInt(list.size());
        Iterator<GroupMemberInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        GroupUserSettingInfo groupUserSettingInfo = this.userSettingInfo;
        if (groupUserSettingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupUserSettingInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isJoinedGroup ? 1 : 0);
        parcel.writeInt(this.isDissolve ? 1 : 0);
        OfficialTagInfo officialTagInfo = this.officialTags;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isShowNotice ? 1 : 0);
        parcel.writeInt(this.isAllowPrivacyChat ? 1 : 0);
        parcel.writeInt(this.isAllowSendLink ? 1 : 0);
        parcel.writeInt(this.isAllowMentionedRobot ? 1 : 0);
        parcel.writeInt(this.isShowAddGroupMember ? 1 : 0);
        parcel.writeInt(this.isShowAddAffiliateMember ? 1 : 0);
        parcel.writeInt(this.isMute ? 1 : 0);
        parcel.writeInt(this.isAllowMentionOthers ? 1 : 0);
        parcel.writeInt(this.isCanTransferOwnership ? 1 : 0);
        parcel.writeInt(this.isAllowSetRole ? 1 : 0);
        parcel.writeInt(this.isAllowMuteUnmuteMember ? 1 : 0);
        parcel.writeInt(this.isAllowDisbandGroup ? 1 : 0);
        parcel.writeInt(this.isAllowPostAnnouncement ? 1 : 0);
        parcel.writeInt(this.isAllowDeleteAnnouncement ? 1 : 0);
        parcel.writeInt(this.isAllowUpdateGroupSetting ? 1 : 0);
        parcel.writeInt(this.isAllowUpdateGroupProfile ? 1 : 0);
        parcel.writeInt(this.isAllowAddMember ? 1 : 0);
        parcel.writeInt(this.isAllowRemoveMember ? 1 : 0);
        parcel.writeInt(this.isAllowAtAll ? 1 : 0);
        parcel.writeInt(this.isAllowInviteAnyone ? 1 : 0);
        parcel.writeInt(this.isAllowSendMessageKyc ? 1 : 0);
        parcel.writeInt(this.isAllowMembersToAddMembers ? 1 : 0);
        parcel.writeInt(this.isAllowSharingInvitationQrCode ? 1 : 0);
        Integer num3 = this.type;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.isAllowShowGroupInfo ? 1 : 0);
        parcel.writeInt(this.isAllowGeneratingInvitationQrCode ? 1 : 0);
        parcel.writeInt(this.requireAdminApprovalToJoin ? 1 : 0);
        parcel.writeInt(this.pendingJoinRequests);
        parcel.writeLong(this.maxMemberCount);
        parcel.writeInt(this.reviewJoinApplications ? 1 : 0);
        parcel.writeInt(this.allowPayGifts ? 1 : 0);
        parcel.writeInt(this.allowStartGroupVoiceCall ? 1 : 0);
        parcel.writeInt(this.allowPay ? 1 : 0);
        parcel.writeInt(this.allowVoice ? 1 : 0);
        parcel.writeInt(this.allowFile ? 1 : 0);
        PaidGroupInfo paidGroupInfo = this.paidGroupInfo;
        if (paidGroupInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paidGroupInfo.writeToParcel(parcel, i);
        }
        GroupPublicType groupPublicType = this.publicGroupType;
        if (groupPublicType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupPublicType.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.convertGroupToPublic ? 1 : 0);
        Boolean bool = this.allowLeaveGroup;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus = this.increaseGroupStatus;
        if (increaseGroupStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(increaseGroupStatus.name());
        }
        Long l = this.orbiterExpiryTimeStamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num4 = this.groupCapacity;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        GroupCampaignInfo groupCampaignInfo = this.groupCampaign;
        if (groupCampaignInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupCampaignInfo.writeToParcel(parcel, i);
        }
        List<CtaInfo> list2 = this.ctas;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<CtaInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        GroupVoiceCallConfig groupVoiceCallConfig = this.groupVoiceCallConfig;
        if (groupVoiceCallConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupVoiceCallConfig.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.GroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupInfo> serializer() {
            return GroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupInfo(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, String str5, String str6, long j, long j2, String str7, boolean z2, boolean z3, Integer num, String str8, double d, boolean z4, Integer num2, String str9, double d2, int i4, List list, GroupUserSettingInfo groupUserSettingInfo, boolean z5, boolean z6, OfficialTagInfo officialTagInfo, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, Integer num3, boolean z30, boolean z31, boolean z32, int i5, long j3, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, boolean z39, Boolean bool, InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus, Long l, Integer num4, GroupCampaignInfo groupCampaignInfo, List list2, GroupVoiceCallConfig groupVoiceCallConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((-16777241 != (i & (-16777241))) | (-65537 != (i2 & (-65537))) | (7 != (i3 & 7))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2, i3}, new int[]{-16777241, -65537, 7}, GroupInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = str;
        this.ownerId = str2;
        this.name = str3;
        if ((i & 8) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str4;
        }
        if ((i & 16) == 0) {
            this.canUpdateBizGroupName = false;
        } else {
            this.canUpdateBizGroupName = z;
        }
        this.avatar = str5;
        this.notice = str6;
        this.noticeEditTime = j;
        this.groupNoticeId = j2;
        this.description = str7;
        this.isMaterApproval = z2;
        this.isAssetVerify = z3;
        this.assetCurrencyId = num;
        this.assetCurrencySymbol = str8;
        this.assetAmount = d;
        this.isPayMode = z4;
        this.payCurrencyId = num2;
        this.payCurrencySymbol = str9;
        this.payAmount = d2;
        this.groupCount = i4;
        this.topGroupMemberList = list;
        this.userSettingInfo = groupUserSettingInfo;
        this.isJoinedGroup = z5;
        this.isDissolve = z6;
        if ((16777216 & i) == 0) {
            this.officialTags = null;
        } else {
            this.officialTags = officialTagInfo;
        }
        this.isShowNotice = z7;
        this.isAllowPrivacyChat = z8;
        this.isAllowSendLink = z9;
        this.isAllowMentionedRobot = z10;
        this.isShowAddGroupMember = z11;
        this.isShowAddAffiliateMember = z12;
        this.isMute = z13;
        this.isAllowMentionOthers = z14;
        this.isCanTransferOwnership = z15;
        this.isAllowSetRole = z16;
        this.isAllowMuteUnmuteMember = z17;
        this.isAllowDisbandGroup = z18;
        this.isAllowPostAnnouncement = z19;
        this.isAllowDeleteAnnouncement = z20;
        this.isAllowUpdateGroupSetting = z21;
        this.isAllowUpdateGroupProfile = z22;
        this.isAllowAddMember = z23;
        this.isAllowRemoveMember = z24;
        this.isAllowAtAll = z25;
        this.isAllowInviteAnyone = z26;
        this.isAllowSendMessageKyc = z27;
        this.isAllowMembersToAddMembers = z28;
        this.isAllowSharingInvitationQrCode = z29;
        if ((65536 & i2) == 0) {
            this.type = null;
        } else {
            this.type = num3;
        }
        this.isAllowShowGroupInfo = z30;
        this.isAllowGeneratingInvitationQrCode = z31;
        this.requireAdminApprovalToJoin = z32;
        this.pendingJoinRequests = i5;
        this.maxMemberCount = j3;
        this.reviewJoinApplications = z33;
        this.allowPayGifts = z34;
        this.allowStartGroupVoiceCall = z35;
        this.allowPay = z36;
        this.allowVoice = z37;
        this.allowFile = z38;
        this.paidGroupInfo = paidGroupInfo;
        this.publicGroupType = groupPublicType;
        this.convertGroupToPublic = z39;
        this.allowLeaveGroup = bool;
        this.increaseGroupStatus = increaseGroupStatus;
        this.orbiterExpiryTimeStamp = l;
        this.groupCapacity = num4;
        if ((i3 & 8) == 0) {
            this.groupCampaign = null;
        } else {
            this.groupCampaign = groupCampaignInfo;
        }
        if ((i3 & 16) == 0) {
            this.ctas = null;
        } else {
            this.ctas = list2;
        }
        if ((i3 & 32) == 0) {
            this.groupVoiceCallConfig = null;
        } else {
            this.groupVoiceCallConfig = groupVoiceCallConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupInfo groupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, groupInfo.groupId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, groupInfo.ownerId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, groupInfo.name);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupInfo.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupInfo.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupInfo.canUpdateBizGroupName) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, groupInfo.canUpdateBizGroupName);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, groupInfo.avatar);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, groupInfo.notice);
        compositeEncoder.encodeLongElement(serialDescriptor, 7, groupInfo.noticeEditTime);
        compositeEncoder.encodeLongElement(serialDescriptor, 8, groupInfo.groupNoticeId);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, groupInfo.description);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, groupInfo.isMaterApproval);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 11, groupInfo.isAssetVerify);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, intSerializer, groupInfo.assetCurrencyId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, groupInfo.assetCurrencySymbol);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 14, groupInfo.assetAmount);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 15, groupInfo.isPayMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, intSerializer, groupInfo.payCurrencyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, groupInfo.payCurrencySymbol);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 18, groupInfo.payAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 19, groupInfo.groupCount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], groupInfo.topGroupMemberList);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, GroupUserSettingInfo$$serializer.INSTANCE, groupInfo.userSettingInfo);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 22, groupInfo.isJoinedGroup);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 23, groupInfo.isDissolve);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || groupInfo.officialTags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, OfficialTagInfo$$serializer.INSTANCE, groupInfo.officialTags);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 25, groupInfo.isShowNotice);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 26, groupInfo.isAllowPrivacyChat);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 27, groupInfo.isAllowSendLink);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 28, groupInfo.isAllowMentionedRobot);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 29, groupInfo.isShowAddGroupMember);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 30, groupInfo.isShowAddAffiliateMember);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 31, groupInfo.isMute);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 32, groupInfo.isAllowMentionOthers);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 33, groupInfo.isCanTransferOwnership);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 34, groupInfo.isAllowSetRole);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 35, groupInfo.isAllowMuteUnmuteMember);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 36, groupInfo.isAllowDisbandGroup);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 37, groupInfo.isAllowPostAnnouncement);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 38, groupInfo.isAllowDeleteAnnouncement);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 39, groupInfo.isAllowUpdateGroupSetting);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 40, groupInfo.isAllowUpdateGroupProfile);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 41, groupInfo.isAllowAddMember);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 42, groupInfo.isAllowRemoveMember);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 43, groupInfo.isAllowAtAll);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 44, groupInfo.isAllowInviteAnyone);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 45, groupInfo.isAllowSendMessageKyc);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 46, groupInfo.isAllowMembersToAddMembers);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 47, groupInfo.isAllowSharingInvitationQrCode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || groupInfo.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, intSerializer, groupInfo.type);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 49, groupInfo.isAllowShowGroupInfo);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 50, groupInfo.isAllowGeneratingInvitationQrCode);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 51, groupInfo.requireAdminApprovalToJoin);
        compositeEncoder.encodeIntElement(serialDescriptor, 52, groupInfo.pendingJoinRequests);
        compositeEncoder.encodeLongElement(serialDescriptor, 53, groupInfo.maxMemberCount);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 54, groupInfo.reviewJoinApplications);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 55, groupInfo.allowPayGifts);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 56, groupInfo.allowStartGroupVoiceCall);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 57, groupInfo.allowPay);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 58, groupInfo.allowVoice);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 59, groupInfo.allowFile);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, PaidGroupInfo$$serializer.INSTANCE, groupInfo.paidGroupInfo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, kSerializerArr[61], groupInfo.publicGroupType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 62, groupInfo.convertGroupToPublic);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, BooleanSerializer.INSTANCE, groupInfo.allowLeaveGroup);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, kSerializerArr[64], groupInfo.increaseGroupStatus);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, LongSerializer.INSTANCE, groupInfo.orbiterExpiryTimeStamp);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, intSerializer, groupInfo.groupCapacity);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || groupInfo.groupCampaign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, GroupCampaignInfo$$serializer.INSTANCE, groupInfo.groupCampaign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || groupInfo.ctas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, kSerializerArr[68], groupInfo.ctas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) && groupInfo.groupVoiceCallConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, GroupVoiceCallConfig$$serializer.INSTANCE, groupInfo.groupVoiceCallConfig);
    }

    public GroupInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, boolean z, @NotNull String str5, @NotNull String str6, long j, long j2, @NotNull String str7, boolean z2, boolean z3, Integer num, String str8, double d, boolean z4, Integer num2, String str9, double d2, int i, @NotNull List<GroupMemberInfo> list, GroupUserSettingInfo groupUserSettingInfo, boolean z5, boolean z6, OfficialTagInfo officialTagInfo, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, Integer num3, boolean z30, boolean z31, boolean z32, int i2, long j3, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, boolean z39, Boolean bool, InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus, Long l, Integer num4, GroupCampaignInfo groupCampaignInfo, List<CtaInfo> list2, GroupVoiceCallConfig groupVoiceCallConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupId = str;
        this.ownerId = str2;
        this.name = str3;
        this.bizGroupName = str4;
        this.canUpdateBizGroupName = z;
        this.avatar = str5;
        this.notice = str6;
        this.noticeEditTime = j;
        this.groupNoticeId = j2;
        this.description = str7;
        this.isMaterApproval = z2;
        this.isAssetVerify = z3;
        this.assetCurrencyId = num;
        this.assetCurrencySymbol = str8;
        this.assetAmount = d;
        this.isPayMode = z4;
        this.payCurrencyId = num2;
        this.payCurrencySymbol = str9;
        this.payAmount = d2;
        this.groupCount = i;
        this.topGroupMemberList = list;
        this.userSettingInfo = groupUserSettingInfo;
        this.isJoinedGroup = z5;
        this.isDissolve = z6;
        this.officialTags = officialTagInfo;
        this.isShowNotice = z7;
        this.isAllowPrivacyChat = z8;
        this.isAllowSendLink = z9;
        this.isAllowMentionedRobot = z10;
        this.isShowAddGroupMember = z11;
        this.isShowAddAffiliateMember = z12;
        this.isMute = z13;
        this.isAllowMentionOthers = z14;
        this.isCanTransferOwnership = z15;
        this.isAllowSetRole = z16;
        this.isAllowMuteUnmuteMember = z17;
        this.isAllowDisbandGroup = z18;
        this.isAllowPostAnnouncement = z19;
        this.isAllowDeleteAnnouncement = z20;
        this.isAllowUpdateGroupSetting = z21;
        this.isAllowUpdateGroupProfile = z22;
        this.isAllowAddMember = z23;
        this.isAllowRemoveMember = z24;
        this.isAllowAtAll = z25;
        this.isAllowInviteAnyone = z26;
        this.isAllowSendMessageKyc = z27;
        this.isAllowMembersToAddMembers = z28;
        this.isAllowSharingInvitationQrCode = z29;
        this.type = num3;
        this.isAllowShowGroupInfo = z30;
        this.isAllowGeneratingInvitationQrCode = z31;
        this.requireAdminApprovalToJoin = z32;
        this.pendingJoinRequests = i2;
        this.maxMemberCount = j3;
        this.reviewJoinApplications = z33;
        this.allowPayGifts = z34;
        this.allowStartGroupVoiceCall = z35;
        this.allowPay = z36;
        this.allowVoice = z37;
        this.allowFile = z38;
        this.paidGroupInfo = paidGroupInfo;
        this.publicGroupType = groupPublicType;
        this.convertGroupToPublic = z39;
        this.allowLeaveGroup = bool;
        this.increaseGroupStatus = increaseGroupStatus;
        this.orbiterExpiryTimeStamp = l;
        this.groupCapacity = num4;
        this.groupCampaign = groupCampaignInfo;
        this.ctas = list2;
        this.groupVoiceCallConfig = groupVoiceCallConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c3: CONSTRUCTOR 
  (r79v0 java.lang.String)
  (r80v0 java.lang.String)
  (r81v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r154v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r154v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r83v0 boolean))
  (r84v0 java.lang.String)
  (r85v0 java.lang.String)
  (r86v0 long)
  (r88v0 long)
  (r90v0 java.lang.String)
  (r91v0 boolean)
  (r92v0 boolean)
  (r93v0 java.lang.Integer)
  (r94v0 java.lang.String)
  (r95v0 double)
  (r97v0 boolean)
  (r98v0 java.lang.Integer)
  (r99v0 java.lang.String)
  (r100v0 double)
  (r102v0 int)
  (r103v0 java.util.List)
  (r104v0 com.okinc.okimcore.model.other.GroupUserSettingInfo)
  (r105v0 boolean)
  (r106v0 boolean)
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x0014: ARITH (r154v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r107v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (r108v0 boolean)
  (r109v0 boolean)
  (r110v0 boolean)
  (r111v0 boolean)
  (r112v0 boolean)
  (r113v0 boolean)
  (r114v0 boolean)
  (r115v0 boolean)
  (r116v0 boolean)
  (r117v0 boolean)
  (r118v0 boolean)
  (r119v0 boolean)
  (r120v0 boolean)
  (r121v0 boolean)
  (r122v0 boolean)
  (r123v0 boolean)
  (r124v0 boolean)
  (r125v0 boolean)
  (r126v0 boolean)
  (r127v0 boolean)
  (r128v0 boolean)
  (r129v0 boolean)
  (r130v0 boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r155v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r131v0 java.lang.Integer))
  (r132v0 boolean)
  (r133v0 boolean)
  (r134v0 boolean)
  (r135v0 int)
  (r136v0 long)
  (r138v0 boolean)
  (r139v0 boolean)
  (r140v0 boolean)
  (r141v0 boolean)
  (r142v0 boolean)
  (r143v0 boolean)
  (r144v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo)
  (r145v0 com.okinc.okimcore.model.im.group.GroupPublicType)
  (r146v0 boolean)
  (r147v0 java.lang.Boolean)
  (r148v0 com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig$IncreaseGroupStatus)
  (r149v0 java.lang.Long)
  (r150v0 java.lang.Integer)
  (wrap:com.okinc.okimcore.model.other.GroupCampaignInfo:?: TERNARY null = ((wrap:int:0x0028: ARITH (r156v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.other.GroupCampaignInfo) : (r151v0 com.okinc.okimcore.model.other.GroupCampaignInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r156v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r152v0 java.util.List))
  (wrap:com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig:?: TERNARY null = ((wrap:int:0x003a: ARITH (r156v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig) : (r153v0 com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, long, java.lang.String, boolean, boolean, java.lang.Integer, java.lang.String, double, boolean, java.lang.Integer, java.lang.String, double, int, java.util.List<com.okinc.okimcore.model.other.GroupMemberInfo>, com.okinc.okimcore.model.other.GroupUserSettingInfo, boolean, boolean, com.okinc.okimcore.model.remote.OfficialTagInfo, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer, boolean, boolean, boolean, int, long, boolean, boolean, boolean, boolean, boolean, boolean, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.im.group.GroupPublicType, boolean, java.lang.Boolean, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig$IncreaseGroupStatus, java.lang.Long, java.lang.Integer, com.okinc.okimcore.model.other.GroupCampaignInfo, java.util.List<com.okinc.okimcore.model.other.CtaInfo>, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig):void (m)] (LINE:22) call: com.okinc.okimcore.model.other.GroupInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, long, java.lang.String, boolean, boolean, java.lang.Integer, java.lang.String, double, boolean, java.lang.Integer, java.lang.String, double, int, java.util.List, com.okinc.okimcore.model.other.GroupUserSettingInfo, boolean, boolean, com.okinc.okimcore.model.remote.OfficialTagInfo, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer, boolean, boolean, boolean, int, long, boolean, boolean, boolean, boolean, boolean, boolean, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.im.group.GroupPublicType, boolean, java.lang.Boolean, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig$IncreaseGroupStatus, java.lang.Long, java.lang.Integer, com.okinc.okimcore.model.other.GroupCampaignInfo, java.util.List, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig):void type: THIS */
    public /* synthetic */ GroupInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, long j, long j2, String str7, boolean z2, boolean z3, Integer num, String str8, double d, boolean z4, Integer num2, String str9, double d2, int i, List list, GroupUserSettingInfo groupUserSettingInfo, boolean z5, boolean z6, OfficialTagInfo officialTagInfo, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, Integer num3, boolean z30, boolean z31, boolean z32, int i2, long j3, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, boolean z39, Boolean bool, InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupStatus, Long l, Integer num4, GroupCampaignInfo groupCampaignInfo, List list2, GroupVoiceCallConfig groupVoiceCallConfig, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? false : z, str5, str6, j, j2, str7, z2, z3, num, str8, d, z4, num2, str9, d2, i, list, groupUserSettingInfo, z5, z6, (i3 & 16777216) != 0 ? null : officialTagInfo, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, (i4 & 65536) != 0 ? null : num3, z30, z31, z32, i2, j3, z33, z34, z35, z36, z37, z38, paidGroupInfo, groupPublicType, z39, bool, increaseGroupStatus, l, num4, (i5 & 8) != 0 ? null : groupCampaignInfo, (i5 & 16) != 0 ? null : list2, (i5 & 32) != 0 ? null : groupVoiceCallConfig);
    }
}
