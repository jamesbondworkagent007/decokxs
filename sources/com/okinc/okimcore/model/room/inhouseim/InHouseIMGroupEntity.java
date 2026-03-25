package com.okinc.okimcore.model.room.inhouseim;

import androidx.camera.video.AudioStats;
import androidx.room.TypeConverters;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo$$serializer;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig$$serializer;
import com.okinc.okimcore.model.remote.InHouseIMCtaInfo;
import com.okinc.okimcore.model.remote.InHouseIMCtaInfo$$serializer;
import com.okinc.okimcore.model.remote.InHouseIMGroupCampaign;
import com.okinc.okimcore.model.remote.InHouseIMGroupCampaign$$serializer;
import com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo$$serializer;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig$$serializer;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import com.okinc.okimcore.model.utility.GroupExtField;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C44237sIj;
import o.C44241sIn;
import o.C44474sRd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupEntity {
    private static final KSerializer<Object>[] $childSerializers;
    private String _v2Field;
    private String _v3Field;
    private Integer allowMembersToAddMembers;
    private Integer allowMentionOthers;
    private Integer allowSharingInvitationQrCode;
    private Double assetAmount;
    private Integer assetCurrencyId;
    private String assetCurrencySymbol;
    private int assetStatus;
    private String avatar;
    private String bizGroupName;
    private Integer canTransferOwnership;
    private long createTime;
    private List<InHouseIMCtaInfo> ctas;
    private String description;
    private InHouseIMGroupCampaign groupCampaign;
    private int groupCount;
    private String groupId;
    private Long groupNoticeId;
    private Integer groupStatus;
    private List<InHouseIMGroupMemberEntity> groupTopMembers;
    private GroupVoiceCallConfig groupVoiceCallConfig;
    private Map<String, ? extends List<String>> inviteFailedMap;
    private Integer isAllowPrivateChat;
    private Integer isAllowSendLink;
    private Integer isAllowSetMentionedRobot;
    private Integer isCanAddAffiliateMember;
    private final int isCanAddGroupMember;
    private Integer isMute;
    private String masterId;
    private Long maxMemberCount;
    private String name;
    private int needVerifyStatus;
    private String notice;
    private long noticeEditTime;
    private OfficialTagInfo officialTagInfo;
    private PaidGroupInfo paidGroupInfo;
    private Double payAmount;
    private Integer payCurrencyId;
    private String payCurrencySymbol;
    private int payStatus;
    private Integer pendingJoinRequests;
    private GroupPublicType publicGroupType;
    private Integer requireAdminApprovalToJoin;
    private int status;
    private int storeStatus;
    private InHouseIMSuperGroupConfig superGroupConfig;
    private long timestamp;
    private Integer type;
    private long updateTime;
    private InHouseIMGroupPermissionInfo userGroupPermission;
    private InHouseIMGroupSettingEntity userSetting;
    private String v1Field;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupEntity() {
        this(null, null, null, null, null, null, 0L, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0L, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2097151, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component29() {
        return this._v2Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component30() {
        return this._v3Field;
    }

    @SerialName("allowMembersToAddMembers")
    public static /* synthetic */ void getAllowMembersToAddMembers$annotations() {
    }

    @SerialName("allowMentionOthers")
    public static /* synthetic */ void getAllowMentionOthers$annotations() {
    }

    @SerialName("allowSharingInvitationQrCode")
    public static /* synthetic */ void getAllowSharingInvitationQrCode$annotations() {
    }

    @SerialName("assetAmount")
    public static /* synthetic */ void getAssetAmount$annotations() {
    }

    @SerialName("assetCurrencyId")
    public static /* synthetic */ void getAssetCurrencyId$annotations() {
    }

    @SerialName("assetCurrencySymbol")
    public static /* synthetic */ void getAssetCurrencySymbol$annotations() {
    }

    @SerialName("isAsset")
    public static /* synthetic */ void getAssetStatus$annotations() {
    }

    @SerialName("groupAvatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @SerialName("bizGroupName")
    public static /* synthetic */ void getBizGroupName$annotations() {
    }

    @SerialName("isCanTransferOwnership")
    public static /* synthetic */ void getCanTransferOwnership$annotations() {
    }

    @SerialName("createTime")
    public static /* synthetic */ void getCreateTime$annotations() {
    }

    @SerialName("ctas")
    public static /* synthetic */ void getCtas$annotations() {
    }

    @SerialName("groupDesc")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @SerialName("groupCount")
    public static /* synthetic */ void getGroupCount$annotations() {
    }

    @SerialName("groupId")
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @SerialName("groupNoticeId")
    public static /* synthetic */ void getGroupNoticeId$annotations() {
    }

    @SerialName("groupStatus")
    public static /* synthetic */ void getGroupStatus$annotations() {
    }

    @SerialName("members")
    public static /* synthetic */ void getGroupTopMembers$annotations() {
    }

    @SerialName("groupVoiceCallConfig")
    public static /* synthetic */ void getGroupVoiceCallConfig$annotations() {
    }

    @SerialName("inviteFailedMap")
    public static /* synthetic */ void getInviteFailedMap$annotations() {
    }

    @SerialName("groupMasterId")
    public static /* synthetic */ void getMasterId$annotations() {
    }

    @SerialName("maxMemberCount")
    public static /* synthetic */ void getMaxMemberCount$annotations() {
    }

    @SerialName("groupName")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("isPublic")
    public static /* synthetic */ void getNeedVerifyStatus$annotations() {
    }

    @SerialName("groupNotice")
    public static /* synthetic */ void getNotice$annotations() {
    }

    @SerialName("noticeEditTime")
    public static /* synthetic */ void getNoticeEditTime$annotations() {
    }

    @SerialName("officialTag")
    public static /* synthetic */ void getOfficialTagInfo$annotations() {
    }

    @SerialName("payAmount")
    public static /* synthetic */ void getPayAmount$annotations() {
    }

    @SerialName("payCurrencyId")
    public static /* synthetic */ void getPayCurrencyId$annotations() {
    }

    @SerialName("payCurrencySymbol")
    public static /* synthetic */ void getPayCurrencySymbol$annotations() {
    }

    @SerialName("isPay")
    public static /* synthetic */ void getPayStatus$annotations() {
    }

    @SerialName("pendingJoinRequests")
    public static /* synthetic */ void getPendingJoinRequests$annotations() {
    }

    @SerialName("publicGroupType")
    public static /* synthetic */ void getPublicGroupType$annotations() {
    }

    @SerialName("requireAdminApprovalToJoin")
    public static /* synthetic */ void getRequireAdminApprovalToJoin$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("isStore")
    public static /* synthetic */ void getStoreStatus$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("updateTime")
    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    @SerialName("userGroupPermission")
    public static /* synthetic */ void getUserGroupPermission$annotations() {
    }

    @SerialName("userSetting")
    public static /* synthetic */ void getUserSetting$annotations() {
    }

    @SerialName("v1")
    public static /* synthetic */ void getV1Field$annotations() {
    }

    @Transient
    private static /* synthetic */ void get_v2Field$annotations() {
    }

    @SerialName("v3")
    private static /* synthetic */ void get_v3Field$annotations() {
    }

    @SerialName("isAllowPrivateChat")
    public static /* synthetic */ void isAllowPrivateChat$annotations() {
    }

    @SerialName("isAllowSendLink")
    public static /* synthetic */ void isAllowSendLink$annotations() {
    }

    @SerialName("isAllowMentionedRobot")
    public static /* synthetic */ void isAllowSetMentionedRobot$annotations() {
    }

    @SerialName("isCanAddAffiliateMember")
    public static /* synthetic */ void isCanAddAffiliateMember$annotations() {
    }

    @SerialName("isCanAddGroupMember")
    public static /* synthetic */ void isCanAddGroupMember$annotations() {
    }

    @SerialName("isMute")
    public static /* synthetic */ void isMute$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.needVerifyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.assetStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.payStatus;
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
    public final Double component15() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.payCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.payCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component18() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.masterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component20() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component21() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component22() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.groupCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMGroupMemberEntity> component24() {
        return this.groupTopMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupSettingEntity component25() {
        return this.userSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.util.List<java.lang.String>> */
    public final Map<String, List<String>> component26() {
        return this.inviteFailedMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.v1Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component31() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component32() {
        return this.isAllowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.isAllowPrivateChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.isAllowSetMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component35() {
        return this.isCanAddGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component36() {
        return this.isCanAddAffiliateMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component37() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component38() {
        return this.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.allowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.canTransferOwnership;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component41() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupPermissionInfo component42() {
        return this.userGroupPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig component43() {
        return this.groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component44() {
        return this.allowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component45() {
        return this.allowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component46() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component47() {
        return this.pendingJoinRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component48() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo component49() {
        return this.paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType component50() {
        return this.publicGroupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupCampaign component51() {
        return this.groupCampaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMCtaInfo> component52() {
        return this.ctas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig component53() {
        return this.superGroupConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.noticeEditTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.storeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, int i, int i2, int i3, int i4, Integer num, String str8, Double d, Integer num2, String str9, Double d2, int i5, long j2, long j3, long j4, int i6, List<InHouseIMGroupMemberEntity> list, InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, Map<String, ? extends List<String>> map, Integer num3, @NotNull String str10, @NotNull String str11, @NotNull String str12, OfficialTagInfo officialTagInfo, Integer num4, Integer num5, Integer num6, int i7, Integer num7, Integer num8, Long l, Integer num9, Integer num10, Integer num11, @TypeConverters({C44237sIj.class}) InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, @TypeConverters({C44241sIn.class}) GroupVoiceCallConfig groupVoiceCallConfig, Integer num12, Integer num13, Integer num14, Integer num15, Long l2, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, InHouseIMGroupCampaign inHouseIMGroupCampaign, List<InHouseIMCtaInfo> list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new InHouseIMGroupEntity(str, str2, str3, str4, str5, str6, j, str7, i, i2, i3, i4, num, str8, d, num2, str9, d2, i5, j2, j3, j4, i6, list, inHouseIMGroupSettingEntity, map, num3, str10, str11, str12, officialTagInfo, num4, num5, num6, i7, num7, num8, l, num9, num10, num11, inHouseIMGroupPermissionInfo, groupVoiceCallConfig, num12, num13, num14, num15, l2, paidGroupInfo, groupPublicType, inHouseIMGroupCampaign, list2, inHouseIMSuperGroupConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupEntity)) {
            return false;
        }
        InHouseIMGroupEntity inHouseIMGroupEntity = (InHouseIMGroupEntity) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) inHouseIMGroupEntity.groupId) && Intrinsics.EZpvd((Object) this.masterId, (Object) inHouseIMGroupEntity.masterId) && Intrinsics.EZpvd((Object) this.name, (Object) inHouseIMGroupEntity.name) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) inHouseIMGroupEntity.bizGroupName) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseIMGroupEntity.avatar) && Intrinsics.EZpvd((Object) this.notice, (Object) inHouseIMGroupEntity.notice) && this.noticeEditTime == inHouseIMGroupEntity.noticeEditTime && Intrinsics.EZpvd((Object) this.description, (Object) inHouseIMGroupEntity.description) && this.storeStatus == inHouseIMGroupEntity.storeStatus && this.needVerifyStatus == inHouseIMGroupEntity.needVerifyStatus && this.assetStatus == inHouseIMGroupEntity.assetStatus && this.payStatus == inHouseIMGroupEntity.payStatus && Intrinsics.EZpvd(this.assetCurrencyId, inHouseIMGroupEntity.assetCurrencyId) && Intrinsics.EZpvd((Object) this.assetCurrencySymbol, (Object) inHouseIMGroupEntity.assetCurrencySymbol) && Intrinsics.EZpvd(this.assetAmount, inHouseIMGroupEntity.assetAmount) && Intrinsics.EZpvd(this.payCurrencyId, inHouseIMGroupEntity.payCurrencyId) && Intrinsics.EZpvd((Object) this.payCurrencySymbol, (Object) inHouseIMGroupEntity.payCurrencySymbol) && Intrinsics.EZpvd(this.payAmount, inHouseIMGroupEntity.payAmount) && this.status == inHouseIMGroupEntity.status && this.timestamp == inHouseIMGroupEntity.timestamp && this.createTime == inHouseIMGroupEntity.createTime && this.updateTime == inHouseIMGroupEntity.updateTime && this.groupCount == inHouseIMGroupEntity.groupCount && Intrinsics.EZpvd(this.groupTopMembers, inHouseIMGroupEntity.groupTopMembers) && Intrinsics.EZpvd(this.userSetting, inHouseIMGroupEntity.userSetting) && Intrinsics.EZpvd(this.inviteFailedMap, inHouseIMGroupEntity.inviteFailedMap) && Intrinsics.EZpvd(this.groupStatus, inHouseIMGroupEntity.groupStatus) && Intrinsics.EZpvd((Object) this.v1Field, (Object) inHouseIMGroupEntity.v1Field) && Intrinsics.EZpvd((Object) this._v2Field, (Object) inHouseIMGroupEntity._v2Field) && Intrinsics.EZpvd((Object) this._v3Field, (Object) inHouseIMGroupEntity._v3Field) && Intrinsics.EZpvd(this.officialTagInfo, inHouseIMGroupEntity.officialTagInfo) && Intrinsics.EZpvd(this.isAllowSendLink, inHouseIMGroupEntity.isAllowSendLink) && Intrinsics.EZpvd(this.isAllowPrivateChat, inHouseIMGroupEntity.isAllowPrivateChat) && Intrinsics.EZpvd(this.isAllowSetMentionedRobot, inHouseIMGroupEntity.isAllowSetMentionedRobot) && this.isCanAddGroupMember == inHouseIMGroupEntity.isCanAddGroupMember && Intrinsics.EZpvd(this.isCanAddAffiliateMember, inHouseIMGroupEntity.isCanAddAffiliateMember) && Intrinsics.EZpvd(this.isMute, inHouseIMGroupEntity.isMute) && Intrinsics.EZpvd(this.groupNoticeId, inHouseIMGroupEntity.groupNoticeId) && Intrinsics.EZpvd(this.allowMentionOthers, inHouseIMGroupEntity.allowMentionOthers) && Intrinsics.EZpvd(this.canTransferOwnership, inHouseIMGroupEntity.canTransferOwnership) && Intrinsics.EZpvd(this.type, inHouseIMGroupEntity.type) && Intrinsics.EZpvd(this.userGroupPermission, inHouseIMGroupEntity.userGroupPermission) && Intrinsics.EZpvd(this.groupVoiceCallConfig, inHouseIMGroupEntity.groupVoiceCallConfig) && Intrinsics.EZpvd(this.allowMembersToAddMembers, inHouseIMGroupEntity.allowMembersToAddMembers) && Intrinsics.EZpvd(this.allowSharingInvitationQrCode, inHouseIMGroupEntity.allowSharingInvitationQrCode) && Intrinsics.EZpvd(this.requireAdminApprovalToJoin, inHouseIMGroupEntity.requireAdminApprovalToJoin) && Intrinsics.EZpvd(this.pendingJoinRequests, inHouseIMGroupEntity.pendingJoinRequests) && Intrinsics.EZpvd(this.maxMemberCount, inHouseIMGroupEntity.maxMemberCount) && Intrinsics.EZpvd(this.paidGroupInfo, inHouseIMGroupEntity.paidGroupInfo) && this.publicGroupType == inHouseIMGroupEntity.publicGroupType && Intrinsics.EZpvd(this.groupCampaign, inHouseIMGroupEntity.groupCampaign) && Intrinsics.EZpvd(this.ctas, inHouseIMGroupEntity.ctas) && Intrinsics.EZpvd(this.superGroupConfig, inHouseIMGroupEntity.superGroupConfig);
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
    public final Integer getAllowSharingInvitationQrCode() {
        return this.allowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getAssetAmount() {
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
    public final int getAssetStatus() {
        return this.assetStatus;
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
    public final Integer getCanTransferOwnership() {
        return this.canTransferOwnership;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMCtaInfo> getCtas() {
        return this.ctas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupCampaign getGroupCampaign() {
        return this.groupCampaign;
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
    public final Long getGroupNoticeId() {
        return this.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupStatus() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMGroupMemberEntity> getGroupTopMembers() {
        return this.groupTopMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig getGroupVoiceCallConfig() {
        return this.groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.Map<java.lang.String, java.util.List<java.lang.String>> */
    public final Map<String, List<String>> getInviteFailedMap() {
        return this.inviteFailedMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterId() {
        return this.masterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMaxMemberCount() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNeedVerifyStatus() {
        return this.needVerifyStatus;
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
    public final OfficialTagInfo getOfficialTagInfo() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo getPaidGroupInfo() {
        return this.paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getPayAmount() {
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
    public final int getPayStatus() {
        return this.payStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPendingJoinRequests() {
        return this.pendingJoinRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType getPublicGroupType() {
        return this.publicGroupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRequireAdminApprovalToJoin() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStoreStatus() {
        return this.storeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig getSuperGroupConfig() {
        return this.superGroupConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupPermissionInfo getUserGroupPermission() {
        return this.userGroupPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupSettingEntity getUserSetting() {
        return this.userSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getV1Field() {
        return this.v1Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.groupId.hashCode();
        int iHashCode2 = this.masterId.hashCode();
        int iHashCode3 = this.name.hashCode();
        String str = this.bizGroupName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.avatar.hashCode();
        int iHashCode6 = this.notice.hashCode();
        int iHashCode7 = Long.hashCode(this.noticeEditTime);
        int iHashCode8 = this.description.hashCode();
        int iHashCode9 = Integer.hashCode(this.storeStatus);
        int iHashCode10 = Integer.hashCode(this.needVerifyStatus);
        int iHashCode11 = Integer.hashCode(this.assetStatus);
        int iHashCode12 = Integer.hashCode(this.payStatus);
        Integer num = this.assetCurrencyId;
        int iHashCode13 = num == null ? 0 : num.hashCode();
        String str2 = this.assetCurrencySymbol;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        Double d = this.assetAmount;
        int iHashCode15 = d == null ? 0 : d.hashCode();
        Integer num2 = this.payCurrencyId;
        int iHashCode16 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.payCurrencySymbol;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        Double d2 = this.payAmount;
        int iHashCode18 = d2 == null ? 0 : d2.hashCode();
        int iHashCode19 = Integer.hashCode(this.status);
        int i = iHashCode13;
        int i2 = iHashCode14;
        int iHashCode20 = Long.hashCode(this.timestamp);
        int iHashCode21 = Long.hashCode(this.createTime);
        int iHashCode22 = Long.hashCode(this.updateTime);
        int iHashCode23 = Integer.hashCode(this.groupCount);
        List<InHouseIMGroupMemberEntity> list = this.groupTopMembers;
        int iHashCode24 = list == null ? 0 : list.hashCode();
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = this.userSetting;
        int iHashCode25 = inHouseIMGroupSettingEntity == null ? 0 : inHouseIMGroupSettingEntity.hashCode();
        Map<String, ? extends List<String>> map = this.inviteFailedMap;
        int iHashCode26 = map == null ? 0 : map.hashCode();
        Integer num3 = this.groupStatus;
        int iHashCode27 = num3 == null ? 0 : num3.hashCode();
        int iHashCode28 = this.v1Field.hashCode();
        int iHashCode29 = this._v2Field.hashCode();
        int iHashCode30 = this._v3Field.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        int iHashCode31 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        Integer num4 = this.isAllowSendLink;
        int iHashCode32 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.isAllowPrivateChat;
        int iHashCode33 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.isAllowSetMentionedRobot;
        int iHashCode34 = num6 == null ? 0 : num6.hashCode();
        int iHashCode35 = Integer.hashCode(this.isCanAddGroupMember);
        Integer num7 = this.isCanAddAffiliateMember;
        int iHashCode36 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.isMute;
        int iHashCode37 = num8 == null ? 0 : num8.hashCode();
        Long l = this.groupNoticeId;
        int iHashCode38 = l == null ? 0 : l.hashCode();
        Integer num9 = this.allowMentionOthers;
        int iHashCode39 = num9 == null ? 0 : num9.hashCode();
        Integer num10 = this.canTransferOwnership;
        int iHashCode40 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.type;
        int iHashCode41 = num11 == null ? 0 : num11.hashCode();
        InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo = this.userGroupPermission;
        int iHashCode42 = inHouseIMGroupPermissionInfo == null ? 0 : inHouseIMGroupPermissionInfo.hashCode();
        GroupVoiceCallConfig groupVoiceCallConfig = this.groupVoiceCallConfig;
        int iHashCode43 = groupVoiceCallConfig == null ? 0 : groupVoiceCallConfig.hashCode();
        Integer num12 = this.allowMembersToAddMembers;
        int iHashCode44 = num12 == null ? 0 : num12.hashCode();
        Integer num13 = this.allowSharingInvitationQrCode;
        int iHashCode45 = num13 == null ? 0 : num13.hashCode();
        Integer num14 = this.requireAdminApprovalToJoin;
        int iHashCode46 = num14 == null ? 0 : num14.hashCode();
        Integer num15 = this.pendingJoinRequests;
        int iHashCode47 = num15 == null ? 0 : num15.hashCode();
        Long l2 = this.maxMemberCount;
        int iHashCode48 = l2 == null ? 0 : l2.hashCode();
        PaidGroupInfo paidGroupInfo = this.paidGroupInfo;
        int iHashCode49 = paidGroupInfo == null ? 0 : paidGroupInfo.hashCode();
        GroupPublicType groupPublicType = this.publicGroupType;
        int iHashCode50 = groupPublicType == null ? 0 : groupPublicType.hashCode();
        InHouseIMGroupCampaign inHouseIMGroupCampaign = this.groupCampaign;
        int iHashCode51 = inHouseIMGroupCampaign == null ? 0 : inHouseIMGroupCampaign.hashCode();
        List<InHouseIMCtaInfo> list2 = this.ctas;
        int iHashCode52 = list2 == null ? 0 : list2.hashCode();
        InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig = this.superGroupConfig;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + i2) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + (inHouseIMSuperGroupConfig == null ? 0 : inHouseIMSuperGroupConfig.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isAllowPrivateChat() {
        return this.isAllowPrivateChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isAllowSendLink() {
        return this.isAllowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isAllowSetMentionedRobot() {
        return this.isAllowSetMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isCanAddAffiliateMember() {
        return this.isCanAddAffiliateMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanAddGroupMember() {
        return this.isCanAddGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isMute() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowMembersToAddMembers(Integer num) {
        this.allowMembersToAddMembers = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowMentionOthers(Integer num) {
        this.allowMentionOthers = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowPrivateChat(Integer num) {
        this.isAllowPrivateChat = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowSendLink(Integer num) {
        this.isAllowSendLink = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowSetMentionedRobot(Integer num) {
        this.isAllowSetMentionedRobot = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowSharingInvitationQrCode(Integer num) {
        this.allowSharingInvitationQrCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetAmount(Double d) {
        this.assetAmount = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetCurrencyId(Integer num) {
        this.assetCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetCurrencySymbol(String str) {
        this.assetCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetStatus(int i) {
        this.assetStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizGroupName(String str) {
        this.bizGroupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanAddAffiliateMember(Integer num) {
        this.isCanAddAffiliateMember = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTransferOwnership(Integer num) {
        this.canTransferOwnership = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtas(List<InHouseIMCtaInfo> list) {
        this.ctas = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupCampaign(InHouseIMGroupCampaign inHouseIMGroupCampaign) {
        this.groupCampaign = inHouseIMGroupCampaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupCount(int i) {
        this.groupCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupNoticeId(Long l) {
        this.groupNoticeId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupStatus(Integer num) {
        this.groupStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupTopMembers(List<InHouseIMGroupMemberEntity> list) {
        this.groupTopMembers = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupVoiceCallConfig(GroupVoiceCallConfig groupVoiceCallConfig) {
        this.groupVoiceCallConfig = groupVoiceCallConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviteFailedMap(Map<String, ? extends List<String>> map) {
        this.inviteFailedMap = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMasterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.masterId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxMemberCount(Long l) {
        this.maxMemberCount = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMute(Integer num) {
        this.isMute = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedVerifyStatus(int i) {
        this.needVerifyStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoticeEditTime(long j) {
        this.noticeEditTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialTagInfo(OfficialTagInfo officialTagInfo) {
        this.officialTagInfo = officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaidGroupInfo(PaidGroupInfo paidGroupInfo) {
        this.paidGroupInfo = paidGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayAmount(Double d) {
        this.payAmount = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrencyId(Integer num) {
        this.payCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrencySymbol(String str) {
        this.payCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayStatus(int i) {
        this.payStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingJoinRequests(Integer num) {
        this.pendingJoinRequests = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicGroupType(GroupPublicType groupPublicType) {
        this.publicGroupType = groupPublicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequireAdminApprovalToJoin(Integer num) {
        this.requireAdminApprovalToJoin = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStoreStatus(int i) {
        this.storeStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuperGroupConfig(InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig) {
        this.superGroupConfig = inHouseIMSuperGroupConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserGroupPermission(InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo) {
        this.userGroupPermission = inHouseIMGroupPermissionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserSetting(InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity) {
        this.userSetting = inHouseIMGroupSettingEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV1Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v1Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV2Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._v2Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV3Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._v3Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupEntity(groupId=" + this.groupId + ", masterId=" + this.masterId + ", name=" + this.name + ", bizGroupName=" + this.bizGroupName + ", avatar=" + this.avatar + ", notice=" + this.notice + ", noticeEditTime=" + this.noticeEditTime + ", description=" + this.description + ", storeStatus=" + this.storeStatus + ", needVerifyStatus=" + this.needVerifyStatus + ", assetStatus=" + this.assetStatus + ", payStatus=" + this.payStatus + ", assetCurrencyId=" + this.assetCurrencyId + ", assetCurrencySymbol=" + this.assetCurrencySymbol + ", assetAmount=" + this.assetAmount + ", payCurrencyId=" + this.payCurrencyId + ", payCurrencySymbol=" + this.payCurrencySymbol + ", payAmount=" + this.payAmount + ", status=" + this.status + ", timestamp=" + this.timestamp + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", groupCount=" + this.groupCount + ", groupTopMembers=" + this.groupTopMembers + ", userSetting=" + this.userSetting + ", inviteFailedMap=" + this.inviteFailedMap + ", groupStatus=" + this.groupStatus + ", v1Field=" + this.v1Field + ", _v2Field=" + this._v2Field + ", _v3Field=" + this._v3Field + ", officialTagInfo=" + this.officialTagInfo + ", isAllowSendLink=" + this.isAllowSendLink + ", isAllowPrivateChat=" + this.isAllowPrivateChat + ", isAllowSetMentionedRobot=" + this.isAllowSetMentionedRobot + ", isCanAddGroupMember=" + this.isCanAddGroupMember + ", isCanAddAffiliateMember=" + this.isCanAddAffiliateMember + ", isMute=" + this.isMute + ", groupNoticeId=" + this.groupNoticeId + ", allowMentionOthers=" + this.allowMentionOthers + ", canTransferOwnership=" + this.canTransferOwnership + ", type=" + this.type + ", userGroupPermission=" + this.userGroupPermission + ", groupVoiceCallConfig=" + this.groupVoiceCallConfig + ", allowMembersToAddMembers=" + this.allowMembersToAddMembers + ", allowSharingInvitationQrCode=" + this.allowSharingInvitationQrCode + ", requireAdminApprovalToJoin=" + this.requireAdminApprovalToJoin + ", pendingJoinRequests=" + this.pendingJoinRequests + ", maxMemberCount=" + this.maxMemberCount + ", paidGroupInfo=" + this.paidGroupInfo + ", publicGroupType=" + this.publicGroupType + ", groupCampaign=" + this.groupCampaign + ", ctas=" + this.ctas + ", superGroupConfig=" + this.superGroupConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupEntity> serializer() {
            return InHouseIMGroupEntity$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InHouseIMGroupMemberEntity$$serializer.INSTANCE), null, new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GroupPublicType.Companion.serializer(), null, new ArrayListSerializer(InHouseIMCtaInfo$$serializer.INSTANCE), null};
    }

    public /* synthetic */ InHouseIMGroupEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i3, int i4, int i5, int i6, Integer num, String str8, Double d, Integer num2, String str9, Double d2, int i7, long j2, long j3, long j4, int i8, List list, InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, Map map, Integer num3, String str10, String str11, OfficialTagInfo officialTagInfo, Integer num4, Integer num5, Integer num6, int i9, Integer num7, Integer num8, Long l, Integer num9, Integer num10, Integer num11, InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, GroupVoiceCallConfig groupVoiceCallConfig, Integer num12, Integer num13, Integer num14, Integer num15, Long l2, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, InHouseIMGroupCampaign inHouseIMGroupCampaign, List list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.masterId = "";
        } else {
            this.masterId = str2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str4;
        }
        if ((i & 16) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str5;
        }
        if ((i & 32) == 0) {
            this.notice = "";
        } else {
            this.notice = str6;
        }
        if ((i & 64) == 0) {
            this.noticeEditTime = 0L;
        } else {
            this.noticeEditTime = j;
        }
        if ((i & 128) == 0) {
            this.description = "";
        } else {
            this.description = str7;
        }
        if ((i & 256) == 0) {
            this.storeStatus = 0;
        } else {
            this.storeStatus = i3;
        }
        if ((i & 512) == 0) {
            this.needVerifyStatus = 0;
        } else {
            this.needVerifyStatus = i4;
        }
        if ((i & 1024) == 0) {
            this.assetStatus = 0;
        } else {
            this.assetStatus = i5;
        }
        if ((i & 2048) == 0) {
            this.payStatus = 0;
        } else {
            this.payStatus = i6;
        }
        this.assetCurrencyId = (i & 4096) == 0 ? 0 : num;
        if ((i & 8192) == 0) {
            this.assetCurrencySymbol = "";
        } else {
            this.assetCurrencySymbol = str8;
        }
        this.assetAmount = (i & 16384) == 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d;
        this.payCurrencyId = (i & 32768) == 0 ? 0 : num2;
        if ((i & 65536) == 0) {
            this.payCurrencySymbol = "";
        } else {
            this.payCurrencySymbol = str9;
        }
        this.payAmount = (131072 & i) == 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d2;
        if ((262144 & i) == 0) {
            this.status = 0;
        } else {
            this.status = i7;
        }
        if ((524288 & i) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j2;
        }
        if ((1048576 & i) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j3;
        }
        if ((2097152 & i) == 0) {
            this.updateTime = 0L;
        } else {
            this.updateTime = j4;
        }
        if ((4194304 & i) == 0) {
            this.groupCount = 0;
        } else {
            this.groupCount = i8;
        }
        if ((8388608 & i) == 0) {
            this.groupTopMembers = null;
        } else {
            this.groupTopMembers = list;
        }
        if ((16777216 & i) == 0) {
            this.userSetting = null;
        } else {
            this.userSetting = inHouseIMGroupSettingEntity;
        }
        if ((33554432 & i) == 0) {
            this.inviteFailedMap = null;
        } else {
            this.inviteFailedMap = map;
        }
        if ((67108864 & i) == 0) {
            this.groupStatus = null;
        } else {
            this.groupStatus = num3;
        }
        if ((134217728 & i) == 0) {
            this.v1Field = "";
        } else {
            this.v1Field = str10;
        }
        this._v2Field = "";
        this._v3Field = (268435456 & i) != 0 ? str11 : "";
        if ((536870912 & i) == 0) {
            this.officialTagInfo = null;
        } else {
            this.officialTagInfo = officialTagInfo;
        }
        this.isAllowSendLink = (1073741824 & i) == 0 ? 0 : num4;
        this.isAllowPrivateChat = (i & Integer.MIN_VALUE) == 0 ? 0 : num5;
        this.isAllowSetMentionedRobot = (i2 & 1) == 0 ? 0 : num6;
        if ((i2 & 2) == 0) {
            this.isCanAddGroupMember = 0;
        } else {
            this.isCanAddGroupMember = i9;
        }
        this.isCanAddAffiliateMember = (i2 & 4) == 0 ? 0 : num7;
        this.isMute = (i2 & 8) == 0 ? 0 : num8;
        this.groupNoticeId = (i2 & 16) == 0 ? 0L : l;
        this.allowMentionOthers = (i2 & 32) == 0 ? 0 : num9;
        this.canTransferOwnership = (i2 & 64) == 0 ? 0 : num10;
        if ((i2 & 128) == 0) {
            this.type = null;
        } else {
            this.type = num11;
        }
        if ((i2 & 256) == 0) {
            this.userGroupPermission = null;
        } else {
            this.userGroupPermission = inHouseIMGroupPermissionInfo;
        }
        if ((i2 & 512) == 0) {
            this.groupVoiceCallConfig = null;
        } else {
            this.groupVoiceCallConfig = groupVoiceCallConfig;
        }
        this.allowMembersToAddMembers = (i2 & 1024) == 0 ? 0 : num12;
        this.allowSharingInvitationQrCode = (i2 & 2048) == 0 ? 0 : num13;
        if ((i2 & 4096) == 0) {
            this.requireAdminApprovalToJoin = null;
        } else {
            this.requireAdminApprovalToJoin = num14;
        }
        if ((i2 & 8192) == 0) {
            this.pendingJoinRequests = null;
        } else {
            this.pendingJoinRequests = num15;
        }
        if ((i2 & 16384) == 0) {
            this.maxMemberCount = null;
        } else {
            this.maxMemberCount = l2;
        }
        if ((i2 & 32768) == 0) {
            this.paidGroupInfo = null;
        } else {
            this.paidGroupInfo = paidGroupInfo;
        }
        if ((i2 & 65536) == 0) {
            this.publicGroupType = null;
        } else {
            this.publicGroupType = groupPublicType;
        }
        if ((131072 & i2) == 0) {
            this.groupCampaign = null;
        } else {
            this.groupCampaign = inHouseIMGroupCampaign;
        }
        if ((262144 & i2) == 0) {
            this.ctas = null;
        } else {
            this.ctas = list2;
        }
        if ((524288 & i2) == 0) {
            this.superGroupConfig = null;
        } else {
            this.superGroupConfig = inHouseIMSuperGroupConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupEntity inHouseIMGroupEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Long l;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMGroupEntity.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.masterId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseIMGroupEntity.masterId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, inHouseIMGroupEntity.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupEntity.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inHouseIMGroupEntity.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.avatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, inHouseIMGroupEntity.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.notice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, inHouseIMGroupEntity.notice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMGroupEntity.noticeEditTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, inHouseIMGroupEntity.noticeEditTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, inHouseIMGroupEntity.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMGroupEntity.storeStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, inHouseIMGroupEntity.storeStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMGroupEntity.needVerifyStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, inHouseIMGroupEntity.needVerifyStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMGroupEntity.assetStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, inHouseIMGroupEntity.assetStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMGroupEntity.payStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, inHouseIMGroupEntity.payStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || (num11 = inHouseIMGroupEntity.assetCurrencyId) == null || num11.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, inHouseIMGroupEntity.assetCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.assetCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, inHouseIMGroupEntity.assetCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(inHouseIMGroupEntity.assetAmount, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, DoubleSerializer.INSTANCE, inHouseIMGroupEntity.assetAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || (num10 = inHouseIMGroupEntity.payCurrencyId) == null || num10.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, inHouseIMGroupEntity.payCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.payCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, inHouseIMGroupEntity.payCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(inHouseIMGroupEntity.payAmount, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, DoubleSerializer.INSTANCE, inHouseIMGroupEntity.payAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMGroupEntity.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 18, inHouseIMGroupEntity.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMGroupEntity.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 19, inHouseIMGroupEntity.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMGroupEntity.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 20, inHouseIMGroupEntity.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMGroupEntity.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 21, inHouseIMGroupEntity.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || inHouseIMGroupEntity.groupCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 22, inHouseIMGroupEntity.groupCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || inHouseIMGroupEntity.groupTopMembers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, kSerializerArr[23], inHouseIMGroupEntity.groupTopMembers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || inHouseIMGroupEntity.userSetting != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, InHouseIMGroupSettingEntity$$serializer.INSTANCE, inHouseIMGroupEntity.userSetting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || inHouseIMGroupEntity.inviteFailedMap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], inHouseIMGroupEntity.inviteFailedMap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || inHouseIMGroupEntity.groupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, inHouseIMGroupEntity.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity.v1Field, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, inHouseIMGroupEntity.v1Field);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) inHouseIMGroupEntity._v3Field, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, inHouseIMGroupEntity._v3Field);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || inHouseIMGroupEntity.officialTagInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, OfficialTagInfo$$serializer.INSTANCE, inHouseIMGroupEntity.officialTagInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || (num9 = inHouseIMGroupEntity.isAllowSendLink) == null || num9.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, inHouseIMGroupEntity.isAllowSendLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || (num8 = inHouseIMGroupEntity.isAllowPrivateChat) == null || num8.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, IntSerializer.INSTANCE, inHouseIMGroupEntity.isAllowPrivateChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || (num7 = inHouseIMGroupEntity.isAllowSetMentionedRobot) == null || num7.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, inHouseIMGroupEntity.isAllowSetMentionedRobot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || inHouseIMGroupEntity.isCanAddGroupMember != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, inHouseIMGroupEntity.isCanAddGroupMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || (num6 = inHouseIMGroupEntity.isCanAddAffiliateMember) == null || num6.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, IntSerializer.INSTANCE, inHouseIMGroupEntity.isCanAddAffiliateMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || (num5 = inHouseIMGroupEntity.isMute) == null || num5.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, IntSerializer.INSTANCE, inHouseIMGroupEntity.isMute);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || (l = inHouseIMGroupEntity.groupNoticeId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, LongSerializer.INSTANCE, inHouseIMGroupEntity.groupNoticeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || (num4 = inHouseIMGroupEntity.allowMentionOthers) == null || num4.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, IntSerializer.INSTANCE, inHouseIMGroupEntity.allowMentionOthers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || (num3 = inHouseIMGroupEntity.canTransferOwnership) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, inHouseIMGroupEntity.canTransferOwnership);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || inHouseIMGroupEntity.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, IntSerializer.INSTANCE, inHouseIMGroupEntity.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || inHouseIMGroupEntity.userGroupPermission != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, InHouseIMGroupPermissionInfo$$serializer.INSTANCE, inHouseIMGroupEntity.userGroupPermission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || inHouseIMGroupEntity.groupVoiceCallConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, GroupVoiceCallConfig$$serializer.INSTANCE, inHouseIMGroupEntity.groupVoiceCallConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || (num2 = inHouseIMGroupEntity.allowMembersToAddMembers) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, IntSerializer.INSTANCE, inHouseIMGroupEntity.allowMembersToAddMembers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || (num = inHouseIMGroupEntity.allowSharingInvitationQrCode) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, IntSerializer.INSTANCE, inHouseIMGroupEntity.allowSharingInvitationQrCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || inHouseIMGroupEntity.requireAdminApprovalToJoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, IntSerializer.INSTANCE, inHouseIMGroupEntity.requireAdminApprovalToJoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || inHouseIMGroupEntity.pendingJoinRequests != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, IntSerializer.INSTANCE, inHouseIMGroupEntity.pendingJoinRequests);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || inHouseIMGroupEntity.maxMemberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, LongSerializer.INSTANCE, inHouseIMGroupEntity.maxMemberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || inHouseIMGroupEntity.paidGroupInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, PaidGroupInfo$$serializer.INSTANCE, inHouseIMGroupEntity.paidGroupInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || inHouseIMGroupEntity.publicGroupType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, kSerializerArr[48], inHouseIMGroupEntity.publicGroupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || inHouseIMGroupEntity.groupCampaign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, InHouseIMGroupCampaign$$serializer.INSTANCE, inHouseIMGroupEntity.groupCampaign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || inHouseIMGroupEntity.ctas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, kSerializerArr[50], inHouseIMGroupEntity.ctas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) && inHouseIMGroupEntity.superGroupConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, InHouseIMSuperGroupConfig$$serializer.INSTANCE, inHouseIMGroupEntity.superGroupConfig);
    }

    public InHouseIMGroupEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, int i, int i2, int i3, int i4, Integer num, String str8, Double d, Integer num2, String str9, Double d2, int i5, long j2, long j3, long j4, int i6, List<InHouseIMGroupMemberEntity> list, InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, Map<String, ? extends List<String>> map, Integer num3, @NotNull String str10, @NotNull String str11, @NotNull String str12, OfficialTagInfo officialTagInfo, Integer num4, Integer num5, Integer num6, int i7, Integer num7, Integer num8, Long l, Integer num9, Integer num10, Integer num11, @TypeConverters({C44237sIj.class}) InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, @TypeConverters({C44241sIn.class}) GroupVoiceCallConfig groupVoiceCallConfig, Integer num12, Integer num13, Integer num14, Integer num15, Long l2, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, InHouseIMGroupCampaign inHouseIMGroupCampaign, List<InHouseIMCtaInfo> list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.groupId = str;
        this.masterId = str2;
        this.name = str3;
        this.bizGroupName = str4;
        this.avatar = str5;
        this.notice = str6;
        this.noticeEditTime = j;
        this.description = str7;
        this.storeStatus = i;
        this.needVerifyStatus = i2;
        this.assetStatus = i3;
        this.payStatus = i4;
        this.assetCurrencyId = num;
        this.assetCurrencySymbol = str8;
        this.assetAmount = d;
        this.payCurrencyId = num2;
        this.payCurrencySymbol = str9;
        this.payAmount = d2;
        this.status = i5;
        this.timestamp = j2;
        this.createTime = j3;
        this.updateTime = j4;
        this.groupCount = i6;
        this.groupTopMembers = list;
        this.userSetting = inHouseIMGroupSettingEntity;
        this.inviteFailedMap = map;
        this.groupStatus = num3;
        this.v1Field = str10;
        this._v2Field = str11;
        this._v3Field = str12;
        this.officialTagInfo = officialTagInfo;
        this.isAllowSendLink = num4;
        this.isAllowPrivateChat = num5;
        this.isAllowSetMentionedRobot = num6;
        this.isCanAddGroupMember = i7;
        this.isCanAddAffiliateMember = num7;
        this.isMute = num8;
        this.groupNoticeId = l;
        this.allowMentionOthers = num9;
        this.canTransferOwnership = num10;
        this.type = num11;
        this.userGroupPermission = inHouseIMGroupPermissionInfo;
        this.groupVoiceCallConfig = groupVoiceCallConfig;
        this.allowMembersToAddMembers = num12;
        this.allowSharingInvitationQrCode = num13;
        this.requireAdminApprovalToJoin = num14;
        this.pendingJoinRequests = num15;
        this.maxMemberCount = l2;
        this.paidGroupInfo = paidGroupInfo;
        this.publicGroupType = groupPublicType;
        this.groupCampaign = inHouseIMGroupCampaign;
        this.ctas = list2;
        this.superGroupConfig = inHouseIMSuperGroupConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x02a5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r114v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r114v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r114v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r114v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r114v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r114v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r114v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r63v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r114v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r114v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r66v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r114v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r67v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005b: ARITH (r114v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r68v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r114v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r69v0 int))
  (wrap:java.lang.Integer:0x007a: TERNARY null = ((wrap:int:0x006f: ARITH (r114v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r70v0 java.lang.Integer))
  (wrap:java.lang.String:0x0085: TERNARY null = ((wrap:int:0x007c: ARITH (r114v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0087: ARITH (r114v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008d: INVOKE (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED] (LINE:93)) : (r72v0 java.lang.Double))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0097: ARITH (r114v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r73v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r114v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x00af: ARITH (r114v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: INVOKE (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED] (LINE:105)) : (r75v0 java.lang.Double))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r114v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r76v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r114v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r77v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r114v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r79v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r114v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r81v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r114v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r83v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r114v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r84v0 java.util.List))
  (wrap:com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r114v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity) : (r85v0 com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0109: ARITH (r114v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r86v0 java.util.Map))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0114: ARITH (r114v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r87v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r114v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r114v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0135: ARITH (r114v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x0140: ARITH (r114v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r91v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x014b: ARITH (r114v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r92v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0156: ARITH (r115v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r93v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0161: ARITH (r115v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r94v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x016c: ARITH (r115v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r95v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0175: ARITH (r115v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r96v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0180: ARITH (r115v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r97v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x018b: ARITH (r115v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r98v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0198: ARITH (r115v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r99v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x01b0: TERNARY null = ((wrap:int:0x01a5: ARITH (r115v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r100v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x01ba: TERNARY null = ((wrap:int:0x01b2: ARITH (r115v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r101v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo:0x01c4: TERNARY null = ((wrap:int:0x01bc: ARITH (r115v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo) : (r102v0 com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo))
  (wrap:com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig:0x01ce: TERNARY null = ((wrap:int:0x01c6: ARITH (r115v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig) : (r103v0 com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig))
  (wrap:java.lang.Integer:0x01db: TERNARY null = ((wrap:int:0x01d0: ARITH (r115v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r104v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x01e8: TERNARY null = ((wrap:int:0x01dd: ARITH (r115v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r105v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x01f2: TERNARY null = ((wrap:int:0x01ea: ARITH (r115v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r106v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x01f4: ARITH (r115v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r107v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x01fc: ARITH (r115v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r108v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo:?: TERNARY null = ((wrap:int:0x0205: ARITH (r115v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo) : (r109v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo))
  (wrap:com.okinc.okimcore.model.im.group.GroupPublicType:?: TERNARY null = ((wrap:int:0x0210: ARITH (r115v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupPublicType) : (r110v0 com.okinc.okimcore.model.im.group.GroupPublicType))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMGroupCampaign:?: TERNARY null = ((wrap:int:0x021b: ARITH (r115v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMGroupCampaign) : (r111v0 com.okinc.okimcore.model.remote.InHouseIMGroupCampaign))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0226: ARITH (r115v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r112v0 java.util.List))
  (wrap:com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig:?: TERNARY null = ((wrap:int:0x0231: ARITH (r115v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig) : (r113v0 com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, int, int, int, java.lang.Integer, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.Double, int, long, long, long, int, java.util.List<com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity>, com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.im.group.GroupPublicType, com.okinc.okimcore.model.remote.InHouseIMGroupCampaign, java.util.List<com.okinc.okimcore.model.remote.InHouseIMCtaInfo>, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig):void (m)] (LINE:33) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, int, int, int, java.lang.Integer, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.Double, int, long, long, long, int, java.util.List, com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity, java.util.Map, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.im.group.GroupPublicType, com.okinc.okimcore.model.remote.InHouseIMGroupCampaign, java.util.List, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig):void type: THIS */
    public /* synthetic */ InHouseIMGroupEntity(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, int i2, int i3, int i4, Integer num, String str8, Double d, Integer num2, String str9, Double d2, int i5, long j2, long j3, long j4, int i6, List list, InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, Map map, Integer num3, String str10, String str11, String str12, OfficialTagInfo officialTagInfo, Integer num4, Integer num5, Integer num6, int i7, Integer num7, Integer num8, Long l, Integer num9, Integer num10, Integer num11, InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, GroupVoiceCallConfig groupVoiceCallConfig, Integer num12, Integer num13, Integer num14, Integer num15, Long l2, PaidGroupInfo paidGroupInfo, GroupPublicType groupPublicType, InHouseIMGroupCampaign inHouseIMGroupCampaign, List list2, InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? "" : str5, (i8 & 32) != 0 ? "" : str6, (i8 & 64) != 0 ? 0L : j, (i8 & 128) != 0 ? "" : str7, (i8 & 256) != 0 ? 0 : i, (i8 & 512) != 0 ? 0 : i2, (i8 & 1024) != 0 ? 0 : i3, (i8 & 2048) != 0 ? 0 : i4, (i8 & 4096) != 0 ? 0 : num, (i8 & 8192) != 0 ? "" : str8, (i8 & 16384) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d, (i8 & 32768) != 0 ? 0 : num2, (i8 & 65536) != 0 ? "" : str9, (i8 & 131072) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d2, (i8 & 262144) != 0 ? 0 : i5, (i8 & 524288) != 0 ? 0L : j2, (i8 & 1048576) != 0 ? 0L : j3, (i8 & 2097152) != 0 ? 0L : j4, (i8 & 4194304) != 0 ? 0 : i6, (i8 & 8388608) != 0 ? null : list, (i8 & 16777216) != 0 ? null : inHouseIMGroupSettingEntity, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : map, (i8 & 67108864) != 0 ? null : num3, (i8 & 134217728) != 0 ? "" : str10, (i8 & 268435456) != 0 ? "" : str11, (i8 & 536870912) != 0 ? "" : str12, (i8 & 1073741824) != 0 ? null : officialTagInfo, (i8 & Integer.MIN_VALUE) != 0 ? 0 : num4, (i9 & 1) != 0 ? 0 : num5, (i9 & 2) != 0 ? 0 : num6, (i9 & 4) != 0 ? 0 : i7, (i9 & 8) != 0 ? 0 : num7, (i9 & 16) != 0 ? 0 : num8, (i9 & 32) != 0 ? 0L : l, (i9 & 64) != 0 ? 0 : num9, (i9 & 128) != 0 ? 0 : num10, (i9 & 256) != 0 ? null : num11, (i9 & 512) != 0 ? null : inHouseIMGroupPermissionInfo, (i9 & 1024) != 0 ? null : groupVoiceCallConfig, (i9 & 2048) != 0 ? 0 : num12, (i9 & 4096) != 0 ? 0 : num13, (i9 & 8192) != 0 ? null : num14, (i9 & 16384) != 0 ? null : num15, (i9 & 32768) != 0 ? null : l2, (i9 & 65536) != 0 ? null : paidGroupInfo, (i9 & 131072) != 0 ? null : groupPublicType, (i9 & 262144) != 0 ? null : inHouseIMGroupCampaign, (i9 & 524288) != 0 ? null : list2, (i9 & 1048576) != 0 ? null : inHouseIMSuperGroupConfig);
    }

    public final String getV2Field() {
        String str = this._v2Field;
        return str.length() == 0 ? C44474sRd.KWHzl.OLrzqt(this.officialTagInfo) : str;
    }

    public final String getV3Field() {
        String str = this._v3Field;
        if (str.length() != 0) {
            return str;
        }
        Integer num = this.isAllowPrivateChat;
        boolean z = num != null && 1 == num.intValue();
        Integer num2 = this.isAllowSendLink;
        boolean z2 = num2 != null && 1 == num2.intValue();
        Integer num3 = this.isAllowSetMentionedRobot;
        boolean z3 = num3 != null && 1 == num3.intValue();
        Integer num4 = this.isCanAddAffiliateMember;
        boolean z4 = num4 != null && 1 == num4.intValue();
        Integer num5 = this.isMute;
        boolean z5 = num5 != null && 1 == num5.intValue();
        Long l = this.groupNoticeId;
        return new GroupExtField(z, z2, z3, z4, z5, l != null ? l.longValue() : 0L).toJson();
    }
}
