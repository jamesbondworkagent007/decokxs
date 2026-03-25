package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo$$serializer;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupInfo {
    private final int allowMembersSendMessage;
    private final Integer allowMembersToAddMembers;
    private final Integer allowMentionOthers;
    private final Integer allowMentionRobot;
    private final Integer allowPrivateChat;
    private final Integer allowSendLink;
    private final Integer allowSharingInvitationQrCode;
    private final Integer allowViewHistory;
    private final String bizGroupName;
    private final List<InHouseIMCtaInfo> ctas;
    private final InHouseIMGroupMemberInfo currentUser;
    private final String groupAvatar;
    private final InHouseIMGroupCampaign groupCampaign;
    private final String groupDescription;
    private final String groupId;
    private final String groupName;
    private final InHouseIMGroupOfficialInfo groupOfficialInfo;
    private final GroupVoiceCallConfig groupVoiceCallConfig;
    private final Integer isCanTransferOwnership;
    private final Boolean isOfficialGroup;
    private final InHouseIMGroupAnnouncementInfo latestGroupAnnouncement;
    private final Long maxMemberCount;
    private final String memberCount;
    private final List<InHouseIMGroupMemberInfo> members;
    private final String ownerUid;
    private final PaidGroupInfo paidGroupInfo;
    private final Integer pendingJoinRequests;
    private final GroupPublicType publicType;
    private final Integer requireAdminApprovalToJoin;
    private final Integer status;
    private final InHouseIMSuperGroupConfig superGroupConfig;
    private final Integer type;
    private final InHouseIMGroupPermissionInfo userGroupPermission;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, GroupPublicType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InHouseIMGroupMemberInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InHouseIMCtaInfo$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.allowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.allowViewHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.allowMembersSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.ownerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupOfficialInfo component16() {
        return this.groupOfficialInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.isOfficialGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMGroupMemberInfo> component18() {
        return this.members;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberInfo component19() {
        return this.currentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupAnnouncementInfo component20() {
        return this.latestGroupAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.isCanTransferOwnership;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupPermissionInfo component23() {
        return this.userGroupPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig component24() {
        return this.groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component25() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.allowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.allowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component28() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.pendingJoinRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo component30() {
        return this.paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupCampaign component31() {
        return this.groupCampaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMCtaInfo> component32() {
        return this.ctas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig component33() {
        return this.superGroupConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType component6() {
        return this.publicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.allowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.allowPrivateChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.allowMentionRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupInfo copy(String str, String str2, String str3, String str4, String str5, GroupPublicType groupPublicType, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Integer num6, String str6, Integer num7, InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo, Boolean bool, @NotNull List<InHouseIMGroupMemberInfo> list, InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo, InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo, String str7, Integer num8, InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, GroupVoiceCallConfig groupVoiceCallConfig, Long l, Integer num9, Integer num10, Integer num11, Integer num12, PaidGroupInfo paidGroupInfo, InHouseIMGroupCampaign inHouseIMGroupCampaign, List<InHouseIMCtaInfo> list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InHouseIMGroupInfo(str, str2, str3, str4, str5, groupPublicType, num, num2, num3, num4, num5, i, num6, str6, num7, inHouseIMGroupOfficialInfo, bool, list, inHouseIMGroupMemberInfo, inHouseIMGroupAnnouncementInfo, str7, num8, inHouseIMGroupPermissionInfo, groupVoiceCallConfig, l, num9, num10, num11, num12, paidGroupInfo, inHouseIMGroupCampaign, list2, inHouseIMSuperGroupConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupInfo)) {
            return false;
        }
        InHouseIMGroupInfo inHouseIMGroupInfo = (InHouseIMGroupInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) inHouseIMGroupInfo.groupId) && Intrinsics.EZpvd((Object) this.groupName, (Object) inHouseIMGroupInfo.groupName) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) inHouseIMGroupInfo.bizGroupName) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) inHouseIMGroupInfo.groupAvatar) && Intrinsics.EZpvd((Object) this.groupDescription, (Object) inHouseIMGroupInfo.groupDescription) && this.publicType == inHouseIMGroupInfo.publicType && Intrinsics.EZpvd(this.allowSendLink, inHouseIMGroupInfo.allowSendLink) && Intrinsics.EZpvd(this.allowPrivateChat, inHouseIMGroupInfo.allowPrivateChat) && Intrinsics.EZpvd(this.allowMentionRobot, inHouseIMGroupInfo.allowMentionRobot) && Intrinsics.EZpvd(this.allowMentionOthers, inHouseIMGroupInfo.allowMentionOthers) && Intrinsics.EZpvd(this.allowViewHistory, inHouseIMGroupInfo.allowViewHistory) && this.allowMembersSendMessage == inHouseIMGroupInfo.allowMembersSendMessage && Intrinsics.EZpvd(this.status, inHouseIMGroupInfo.status) && Intrinsics.EZpvd((Object) this.ownerUid, (Object) inHouseIMGroupInfo.ownerUid) && Intrinsics.EZpvd(this.type, inHouseIMGroupInfo.type) && Intrinsics.EZpvd(this.groupOfficialInfo, inHouseIMGroupInfo.groupOfficialInfo) && Intrinsics.EZpvd(this.isOfficialGroup, inHouseIMGroupInfo.isOfficialGroup) && Intrinsics.EZpvd(this.members, inHouseIMGroupInfo.members) && Intrinsics.EZpvd(this.currentUser, inHouseIMGroupInfo.currentUser) && Intrinsics.EZpvd(this.latestGroupAnnouncement, inHouseIMGroupInfo.latestGroupAnnouncement) && Intrinsics.EZpvd((Object) this.memberCount, (Object) inHouseIMGroupInfo.memberCount) && Intrinsics.EZpvd(this.isCanTransferOwnership, inHouseIMGroupInfo.isCanTransferOwnership) && Intrinsics.EZpvd(this.userGroupPermission, inHouseIMGroupInfo.userGroupPermission) && Intrinsics.EZpvd(this.groupVoiceCallConfig, inHouseIMGroupInfo.groupVoiceCallConfig) && Intrinsics.EZpvd(this.maxMemberCount, inHouseIMGroupInfo.maxMemberCount) && Intrinsics.EZpvd(this.allowMembersToAddMembers, inHouseIMGroupInfo.allowMembersToAddMembers) && Intrinsics.EZpvd(this.allowSharingInvitationQrCode, inHouseIMGroupInfo.allowSharingInvitationQrCode) && Intrinsics.EZpvd(this.requireAdminApprovalToJoin, inHouseIMGroupInfo.requireAdminApprovalToJoin) && Intrinsics.EZpvd(this.pendingJoinRequests, inHouseIMGroupInfo.pendingJoinRequests) && Intrinsics.EZpvd(this.paidGroupInfo, inHouseIMGroupInfo.paidGroupInfo) && Intrinsics.EZpvd(this.groupCampaign, inHouseIMGroupInfo.groupCampaign) && Intrinsics.EZpvd(this.ctas, inHouseIMGroupInfo.ctas) && Intrinsics.EZpvd(this.superGroupConfig, inHouseIMGroupInfo.superGroupConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAllowMembersSendMessage() {
        return this.allowMembersSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowMembersToAddMembers() {
        return this.allowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowMentionOthers() {
        return this.allowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowMentionRobot() {
        return this.allowMentionRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowPrivateChat() {
        return this.allowPrivateChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowSendLink() {
        return this.allowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowSharingInvitationQrCode() {
        return this.allowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowViewHistory() {
        return this.allowViewHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizGroupName() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMCtaInfo> getCtas() {
        return this.ctas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberInfo getCurrentUser() {
        return this.currentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupCampaign getGroupCampaign() {
        return this.groupCampaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupOfficialInfo getGroupOfficialInfo() {
        return this.groupOfficialInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig getGroupVoiceCallConfig() {
        return this.groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupAnnouncementInfo getLatestGroupAnnouncement() {
        return this.latestGroupAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMaxMemberCount() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemberCount() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMGroupMemberInfo> getMembers() {
        return this.members;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerUid() {
        return this.ownerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo getPaidGroupInfo() {
        return this.paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPendingJoinRequests() {
        return this.pendingJoinRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType getPublicType() {
        return this.publicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRequireAdminApprovalToJoin() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig getSuperGroupConfig() {
        return this.superGroupConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupPermissionInfo getUserGroupPermission() {
        return this.userGroupPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.groupId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.groupName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bizGroupName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.groupAvatar;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.groupDescription;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        GroupPublicType groupPublicType = this.publicType;
        int iHashCode6 = groupPublicType == null ? 0 : groupPublicType.hashCode();
        Integer num = this.allowSendLink;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.allowPrivateChat;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.allowMentionRobot;
        int iHashCode9 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.allowMentionOthers;
        int iHashCode10 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.allowViewHistory;
        int iHashCode11 = num5 == null ? 0 : num5.hashCode();
        int iHashCode12 = Integer.hashCode(this.allowMembersSendMessage);
        Integer num6 = this.status;
        int iHashCode13 = num6 == null ? 0 : num6.hashCode();
        String str6 = this.ownerUid;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        Integer num7 = this.type;
        int iHashCode15 = num7 == null ? 0 : num7.hashCode();
        InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo = this.groupOfficialInfo;
        int iHashCode16 = inHouseIMGroupOfficialInfo == null ? 0 : inHouseIMGroupOfficialInfo.hashCode();
        Boolean bool = this.isOfficialGroup;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        int iHashCode18 = this.members.hashCode();
        InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo = this.currentUser;
        int iHashCode19 = inHouseIMGroupMemberInfo == null ? 0 : inHouseIMGroupMemberInfo.hashCode();
        InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo = this.latestGroupAnnouncement;
        int iHashCode20 = inHouseIMGroupAnnouncementInfo == null ? 0 : inHouseIMGroupAnnouncementInfo.hashCode();
        String str7 = this.memberCount;
        int iHashCode21 = str7 == null ? 0 : str7.hashCode();
        Integer num8 = this.isCanTransferOwnership;
        int iHashCode22 = num8 == null ? 0 : num8.hashCode();
        InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo = this.userGroupPermission;
        int iHashCode23 = inHouseIMGroupPermissionInfo == null ? 0 : inHouseIMGroupPermissionInfo.hashCode();
        GroupVoiceCallConfig groupVoiceCallConfig = this.groupVoiceCallConfig;
        int iHashCode24 = groupVoiceCallConfig == null ? 0 : groupVoiceCallConfig.hashCode();
        Long l = this.maxMemberCount;
        int iHashCode25 = l == null ? 0 : l.hashCode();
        Integer num9 = this.allowMembersToAddMembers;
        int iHashCode26 = num9 == null ? 0 : num9.hashCode();
        Integer num10 = this.allowSharingInvitationQrCode;
        int iHashCode27 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.requireAdminApprovalToJoin;
        int iHashCode28 = num11 == null ? 0 : num11.hashCode();
        Integer num12 = this.pendingJoinRequests;
        int iHashCode29 = num12 == null ? 0 : num12.hashCode();
        PaidGroupInfo paidGroupInfo = this.paidGroupInfo;
        int iHashCode30 = paidGroupInfo == null ? 0 : paidGroupInfo.hashCode();
        InHouseIMGroupCampaign inHouseIMGroupCampaign = this.groupCampaign;
        int iHashCode31 = inHouseIMGroupCampaign == null ? 0 : inHouseIMGroupCampaign.hashCode();
        List<InHouseIMCtaInfo> list = this.ctas;
        int iHashCode32 = list == null ? 0 : list.hashCode();
        InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig = this.superGroupConfig;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (inHouseIMSuperGroupConfig == null ? 0 : inHouseIMSuperGroupConfig.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isCanTransferOwnership() {
        return this.isCanTransferOwnership;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isOfficialGroup() {
        return this.isOfficialGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupInfo(groupId=" + this.groupId + ", groupName=" + this.groupName + ", bizGroupName=" + this.bizGroupName + ", groupAvatar=" + this.groupAvatar + ", groupDescription=" + this.groupDescription + ", publicType=" + this.publicType + ", allowSendLink=" + this.allowSendLink + ", allowPrivateChat=" + this.allowPrivateChat + ", allowMentionRobot=" + this.allowMentionRobot + ", allowMentionOthers=" + this.allowMentionOthers + ", allowViewHistory=" + this.allowViewHistory + ", allowMembersSendMessage=" + this.allowMembersSendMessage + ", status=" + this.status + ", ownerUid=" + this.ownerUid + ", type=" + this.type + ", groupOfficialInfo=" + this.groupOfficialInfo + ", isOfficialGroup=" + this.isOfficialGroup + ", members=" + this.members + ", currentUser=" + this.currentUser + ", latestGroupAnnouncement=" + this.latestGroupAnnouncement + ", memberCount=" + this.memberCount + ", isCanTransferOwnership=" + this.isCanTransferOwnership + ", userGroupPermission=" + this.userGroupPermission + ", groupVoiceCallConfig=" + this.groupVoiceCallConfig + ", maxMemberCount=" + this.maxMemberCount + ", allowMembersToAddMembers=" + this.allowMembersToAddMembers + ", allowSharingInvitationQrCode=" + this.allowSharingInvitationQrCode + ", requireAdminApprovalToJoin=" + this.requireAdminApprovalToJoin + ", pendingJoinRequests=" + this.pendingJoinRequests + ", paidGroupInfo=" + this.paidGroupInfo + ", groupCampaign=" + this.groupCampaign + ", ctas=" + this.ctas + ", superGroupConfig=" + this.superGroupConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupInfo> serializer() {
            return InHouseIMGroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, GroupPublicType groupPublicType, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i3, Integer num6, String str6, Integer num7, InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo, Boolean bool, List list, InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo, InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo, String str7, Integer num8, InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, GroupVoiceCallConfig groupVoiceCallConfig, Long l, Integer num9, Integer num10, Integer num11, Integer num12, PaidGroupInfo paidGroupInfo, InHouseIMGroupCampaign inHouseIMGroupCampaign, List list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (2048 != (i & 2048)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{2048, 0}, InHouseIMGroupInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str2;
        }
        if ((i & 4) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str3;
        }
        if ((i & 8) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str4;
        }
        if ((i & 16) == 0) {
            this.groupDescription = null;
        } else {
            this.groupDescription = str5;
        }
        if ((i & 32) == 0) {
            this.publicType = null;
        } else {
            this.publicType = groupPublicType;
        }
        if ((i & 64) == 0) {
            this.allowSendLink = null;
        } else {
            this.allowSendLink = num;
        }
        if ((i & 128) == 0) {
            this.allowPrivateChat = null;
        } else {
            this.allowPrivateChat = num2;
        }
        if ((i & 256) == 0) {
            this.allowMentionRobot = null;
        } else {
            this.allowMentionRobot = num3;
        }
        if ((i & 512) == 0) {
            this.allowMentionOthers = null;
        } else {
            this.allowMentionOthers = num4;
        }
        if ((i & 1024) == 0) {
            this.allowViewHistory = null;
        } else {
            this.allowViewHistory = num5;
        }
        this.allowMembersSendMessage = i3;
        if ((i & 4096) == 0) {
            this.status = null;
        } else {
            this.status = num6;
        }
        if ((i & 8192) == 0) {
            this.ownerUid = null;
        } else {
            this.ownerUid = str6;
        }
        if ((i & 16384) == 0) {
            this.type = null;
        } else {
            this.type = num7;
        }
        if ((32768 & i) == 0) {
            this.groupOfficialInfo = null;
        } else {
            this.groupOfficialInfo = inHouseIMGroupOfficialInfo;
        }
        if ((65536 & i) == 0) {
            this.isOfficialGroup = null;
        } else {
            this.isOfficialGroup = bool;
        }
        this.members = (131072 & i) == 0 ? yDY.AhwBna() : list;
        if ((262144 & i) == 0) {
            this.currentUser = null;
        } else {
            this.currentUser = inHouseIMGroupMemberInfo;
        }
        if ((524288 & i) == 0) {
            this.latestGroupAnnouncement = null;
        } else {
            this.latestGroupAnnouncement = inHouseIMGroupAnnouncementInfo;
        }
        if ((1048576 & i) == 0) {
            this.memberCount = null;
        } else {
            this.memberCount = str7;
        }
        if ((2097152 & i) == 0) {
            this.isCanTransferOwnership = null;
        } else {
            this.isCanTransferOwnership = num8;
        }
        if ((4194304 & i) == 0) {
            this.userGroupPermission = null;
        } else {
            this.userGroupPermission = inHouseIMGroupPermissionInfo;
        }
        if ((8388608 & i) == 0) {
            this.groupVoiceCallConfig = null;
        } else {
            this.groupVoiceCallConfig = groupVoiceCallConfig;
        }
        if ((16777216 & i) == 0) {
            this.maxMemberCount = null;
        } else {
            this.maxMemberCount = l;
        }
        if ((33554432 & i) == 0) {
            this.allowMembersToAddMembers = null;
        } else {
            this.allowMembersToAddMembers = num9;
        }
        if ((67108864 & i) == 0) {
            this.allowSharingInvitationQrCode = null;
        } else {
            this.allowSharingInvitationQrCode = num10;
        }
        if ((134217728 & i) == 0) {
            this.requireAdminApprovalToJoin = null;
        } else {
            this.requireAdminApprovalToJoin = num11;
        }
        if ((268435456 & i) == 0) {
            this.pendingJoinRequests = null;
        } else {
            this.pendingJoinRequests = num12;
        }
        if ((536870912 & i) == 0) {
            this.paidGroupInfo = null;
        } else {
            this.paidGroupInfo = paidGroupInfo;
        }
        if ((1073741824 & i) == 0) {
            this.groupCampaign = null;
        } else {
            this.groupCampaign = inHouseIMGroupCampaign;
        }
        this.ctas = (i & Integer.MIN_VALUE) == 0 ? yDY.AhwBna() : list2;
        if ((i2 & 1) == 0) {
            this.superGroupConfig = null;
        } else {
            this.superGroupConfig = inHouseIMSuperGroupConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupInfo inHouseIMGroupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMGroupInfo.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inHouseIMGroupInfo.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMGroupInfo.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMGroupInfo.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMGroupInfo.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseIMGroupInfo.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupInfo.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inHouseIMGroupInfo.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMGroupInfo.groupDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMGroupInfo.groupDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMGroupInfo.publicType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], inHouseIMGroupInfo.publicType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMGroupInfo.allowSendLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowSendLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMGroupInfo.allowPrivateChat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowPrivateChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMGroupInfo.allowMentionRobot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowMentionRobot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMGroupInfo.allowMentionOthers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowMentionOthers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMGroupInfo.allowViewHistory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowViewHistory);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 11, inHouseIMGroupInfo.allowMembersSendMessage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMGroupInfo.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, inHouseIMGroupInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMGroupInfo.ownerUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, inHouseIMGroupInfo.ownerUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMGroupInfo.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, inHouseIMGroupInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || inHouseIMGroupInfo.groupOfficialInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, InHouseIMGroupOfficialInfo$$serializer.INSTANCE, inHouseIMGroupInfo.groupOfficialInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || inHouseIMGroupInfo.isOfficialGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, inHouseIMGroupInfo.isOfficialGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(inHouseIMGroupInfo.members, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], inHouseIMGroupInfo.members);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMGroupInfo.currentUser != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, InHouseIMGroupMemberInfo$$serializer.INSTANCE, inHouseIMGroupInfo.currentUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMGroupInfo.latestGroupAnnouncement != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, InHouseIMGroupAnnouncementInfo$$serializer.INSTANCE, inHouseIMGroupInfo.latestGroupAnnouncement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMGroupInfo.memberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, inHouseIMGroupInfo.memberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMGroupInfo.isCanTransferOwnership != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, inHouseIMGroupInfo.isCanTransferOwnership);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || inHouseIMGroupInfo.userGroupPermission != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, InHouseIMGroupPermissionInfo$$serializer.INSTANCE, inHouseIMGroupInfo.userGroupPermission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || inHouseIMGroupInfo.groupVoiceCallConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, GroupVoiceCallConfig$$serializer.INSTANCE, inHouseIMGroupInfo.groupVoiceCallConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || inHouseIMGroupInfo.maxMemberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, LongSerializer.INSTANCE, inHouseIMGroupInfo.maxMemberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || inHouseIMGroupInfo.allowMembersToAddMembers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowMembersToAddMembers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || inHouseIMGroupInfo.allowSharingInvitationQrCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, inHouseIMGroupInfo.allowSharingInvitationQrCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || inHouseIMGroupInfo.requireAdminApprovalToJoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, IntSerializer.INSTANCE, inHouseIMGroupInfo.requireAdminApprovalToJoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || inHouseIMGroupInfo.pendingJoinRequests != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, IntSerializer.INSTANCE, inHouseIMGroupInfo.pendingJoinRequests);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || inHouseIMGroupInfo.paidGroupInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, PaidGroupInfo$$serializer.INSTANCE, inHouseIMGroupInfo.paidGroupInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || inHouseIMGroupInfo.groupCampaign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, InHouseIMGroupCampaign$$serializer.INSTANCE, inHouseIMGroupInfo.groupCampaign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd(inHouseIMGroupInfo.ctas, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], inHouseIMGroupInfo.ctas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) && inHouseIMGroupInfo.superGroupConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, InHouseIMSuperGroupConfig$$serializer.INSTANCE, inHouseIMGroupInfo.superGroupConfig);
    }

    public InHouseIMGroupInfo(String str, String str2, String str3, String str4, String str5, GroupPublicType groupPublicType, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Integer num6, String str6, Integer num7, InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo, Boolean bool, @NotNull List<InHouseIMGroupMemberInfo> list, InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo, InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo, String str7, Integer num8, InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, GroupVoiceCallConfig groupVoiceCallConfig, Long l, Integer num9, Integer num10, Integer num11, Integer num12, PaidGroupInfo paidGroupInfo, InHouseIMGroupCampaign inHouseIMGroupCampaign, List<InHouseIMCtaInfo> list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig) {
        Intrinsics.checkNotNullParameter(list, "");
        this.groupId = str;
        this.groupName = str2;
        this.bizGroupName = str3;
        this.groupAvatar = str4;
        this.groupDescription = str5;
        this.publicType = groupPublicType;
        this.allowSendLink = num;
        this.allowPrivateChat = num2;
        this.allowMentionRobot = num3;
        this.allowMentionOthers = num4;
        this.allowViewHistory = num5;
        this.allowMembersSendMessage = i;
        this.status = num6;
        this.ownerUid = str6;
        this.type = num7;
        this.groupOfficialInfo = inHouseIMGroupOfficialInfo;
        this.isOfficialGroup = bool;
        this.members = list;
        this.currentUser = inHouseIMGroupMemberInfo;
        this.latestGroupAnnouncement = inHouseIMGroupAnnouncementInfo;
        this.memberCount = str7;
        this.isCanTransferOwnership = num8;
        this.userGroupPermission = inHouseIMGroupPermissionInfo;
        this.groupVoiceCallConfig = groupVoiceCallConfig;
        this.maxMemberCount = l;
        this.allowMembersToAddMembers = num9;
        this.allowSharingInvitationQrCode = num10;
        this.requireAdminApprovalToJoin = num11;
        this.pendingJoinRequests = num12;
        this.paidGroupInfo = paidGroupInfo;
        this.groupCampaign = inHouseIMGroupCampaign;
        this.ctas = list2;
        this.superGroupConfig = inHouseIMSuperGroupConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0136: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r71v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r71v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r71v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.group.GroupPublicType:?: TERNARY null = ((wrap:int:0x002b: ARITH (r71v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupPublicType) : (r43v0 com.okinc.okimcore.model.im.group.GroupPublicType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0033: ARITH (r71v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (r71v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0043: ARITH (r71v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004b: ARITH (r71v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r47v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0053: ARITH (r71v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (r49v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005b: ARITH (r71v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r71v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006d: ARITH (r71v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo:?: TERNARY null = ((wrap:int:0x0079: ARITH (32768 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo) : (r53v0 com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0083: ARITH (65536 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r54v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008d: ARITH (131072 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0094: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r55v0 java.util.List))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo:?: TERNARY null = ((wrap:int:0x009b: ARITH (262144 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo) : (r56v0 com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo:?: TERNARY null = ((wrap:int:0x00a5: ARITH (524288 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo) : (r57v0 com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (1048576 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b9: ARITH (2097152 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r59v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo:?: TERNARY null = ((wrap:int:0x00c3: ARITH (4194304 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo) : (r60v0 com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo))
  (wrap:com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig:?: TERNARY null = ((wrap:int:0x00cd: ARITH (8388608 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig) : (r61v0 com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00d7: ARITH (16777216 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r62v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00e1: ARITH (33554432 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r63v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00eb: ARITH (67108864 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r64v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00f5: ARITH (134217728 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r65v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ff: ARITH (268435456 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r66v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo:?: TERNARY null = ((wrap:int:0x0109: ARITH (536870912 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo) : (r67v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupCampaign:?: TERNARY null = ((wrap:int:0x0113: ARITH (1073741824 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupCampaign) : (r68v0 com.okinc.okimcore.model.remote.InHouseIMGroupCampaign))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x011d: ARITH (r71v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0124: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:47)) : (r69v0 java.util.List))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig:?: TERNARY null = ((wrap:int:0x0129: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig) : (r70v0 com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.GroupPublicType, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo, java.lang.Boolean, java.util.List<com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo>, com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo, com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.remote.InHouseIMGroupCampaign, java.util.List<com.okinc.okimcore.model.remote.InHouseIMCtaInfo>, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig):void (m)] (LINE:15) call: com.okinc.okimcore.model.remote.InHouseIMGroupInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.GroupPublicType, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo, java.lang.Boolean, java.util.List, com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo, com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.remote.InHouseIMGroupCampaign, java.util.List, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig):void type: THIS */
    public /* synthetic */ InHouseIMGroupInfo(String str, String str2, String str3, String str4, String str5, GroupPublicType groupPublicType, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Integer num6, String str6, Integer num7, InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo, Boolean bool, List list, InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo, InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo, String str7, Integer num8, InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, GroupVoiceCallConfig groupVoiceCallConfig, Long l, Integer num9, Integer num10, Integer num11, Integer num12, PaidGroupInfo paidGroupInfo, InHouseIMGroupCampaign inHouseIMGroupCampaign, List list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : groupPublicType, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : num4, (i2 & 1024) != 0 ? null : num5, i, (i2 & 4096) != 0 ? null : num6, (i2 & 8192) != 0 ? null : str6, (i2 & 16384) != 0 ? null : num7, (32768 & i2) != 0 ? null : inHouseIMGroupOfficialInfo, (65536 & i2) != 0 ? null : bool, (131072 & i2) != 0 ? yDY.AhwBna() : list, (262144 & i2) != 0 ? null : inHouseIMGroupMemberInfo, (524288 & i2) != 0 ? null : inHouseIMGroupAnnouncementInfo, (1048576 & i2) != 0 ? null : str7, (2097152 & i2) != 0 ? null : num8, (4194304 & i2) != 0 ? null : inHouseIMGroupPermissionInfo, (8388608 & i2) != 0 ? null : groupVoiceCallConfig, (16777216 & i2) != 0 ? null : l, (33554432 & i2) != 0 ? null : num9, (67108864 & i2) != 0 ? null : num10, (134217728 & i2) != 0 ? null : num11, (268435456 & i2) != 0 ? null : num12, (536870912 & i2) != 0 ? null : paidGroupInfo, (1073741824 & i2) != 0 ? null : inHouseIMGroupCampaign, (i2 & Integer.MIN_VALUE) != 0 ? yDY.AhwBna() : list2, (i3 & 1) != 0 ? null : inHouseIMSuperGroupConfig);
    }
}
