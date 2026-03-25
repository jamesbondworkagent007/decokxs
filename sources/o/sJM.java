package o;

import androidx.camera.video.AudioStats;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.feature.group.utility.GroupDataConverter$convertAnnouncementInfo$1;
import com.okinc.okimcore.feature.group.utility.GroupDataConverter$convertGroupInfo$1;
import com.okinc.okimcore.feature.group.utility.GroupDataConverter$convertMemberEntity$1;
import com.okinc.okimcore.feature.group.utility.GroupDataConverter$convertMemberEntityNew$1;
import com.okinc.okimcore.feature.group.utility.GroupDataConverter$saveGroupEntityToDB$1;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.other.AffiliateUserType;
import com.okinc.okimcore.model.other.CtaIcon;
import com.okinc.okimcore.model.other.CtaInfo;
import com.okinc.okimcore.model.other.GroupCampaignInfo;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.GroupAnnouncementEntity;
import com.okinc.okimcore.model.remote.GroupRolePermissionItem;
import com.okinc.okimcore.model.remote.InHouseIMCtaIcon;
import com.okinc.okimcore.model.remote.InHouseIMCtaInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupCampaign;
import com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.GroupMemberWithDetails;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import com.okinc.okimcore.model.utility.GroupExtField;
import com.okinc.okimcore.model.utility.GroupMemberExtField;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sJM {
    public static final sJM AEQbTJ = new sJM();

    private sJM() {
    }

    public final sIB copydefault() {
        return sDZ.AEQbTJ.djBIcL().copydefault();
    }

    public final InHouseIMContactDao KWHzl() {
        return copydefault().OLrzqt();
    }

    public final InHouseIMGroupInfoDao AEQbTJ() {
        return copydefault().EZpvd();
    }

    public final InHouseIMGroupSettingDao EZpvd() {
        return copydefault().valueOf();
    }

    /* JADX DEBUG: Type inference failed for r1v51. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0401  */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x02ba -> B:64:0x02d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull InHouseIMGroupEntity inHouseIMGroupEntity, @NotNull Continuation<? super GroupInfo> continuation) throws java.lang.Exception {
        GroupDataConverter$convertGroupInfo$1 groupDataConverter$convertGroupInfo$1;
        boolean z;
        OfficialTagInfo officialTagInfoCopydefault;
        GroupExtField groupExtFieldKWHzl;
        java.lang.String groupId;
        java.lang.String masterId;
        java.lang.String name;
        java.lang.String bizGroupName;
        boolean zBooleanValue;
        java.lang.String avatar;
        java.lang.String notice;
        long noticeEditTime;
        long groupNoticeId;
        int i;
        java.lang.Integer assetCurrencyId;
        java.lang.String assetCurrencySymbol;
        double dDoubleValue;
        double dDoubleValue2;
        java.lang.Integer payCurrencyId;
        java.lang.String payCurrencySymbol;
        java.lang.String str;
        ?? r19;
        int i2;
        int i3;
        int i4;
        InHouseIMGroupEntity inHouseIMGroupEntity2;
        java.util.Iterator it;
        java.lang.Object obj;
        int i5;
        long j;
        long j2;
        int i6;
        java.lang.String str2;
        ?? r35;
        int i7;
        java.lang.Integer num;
        java.lang.String str3;
        double d;
        double d2;
        int i8;
        java.lang.Integer num2;
        int i9;
        int i10;
        java.util.Collection collection;
        java.lang.String str4;
        InHouseIMGroupEntity inHouseIMGroupEntity3;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        GroupExtField groupExtField;
        OfficialTagInfo officialTagInfo;
        java.lang.String str8;
        java.lang.Boolean updateBizGroupName;
        OfficialTagInfo officialTagInfo2;
        java.util.List arrayList;
        int i11;
        double d3;
        java.lang.String str9;
        java.lang.Integer num3;
        double d4;
        java.lang.String str10;
        int i12;
        int i13;
        long j3;
        long j4;
        boolean z2;
        boolean z3;
        int i14;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        ?? r352;
        InHouseIMGroupEntity inHouseIMGroupEntity4;
        InHouseIMGroupSettingEntity userSetting;
        GroupUserSettingInfo groupUserSettingInfo;
        java.lang.Integer allowMentionOthers;
        int i15;
        java.lang.Integer allowMembersToAddMembers;
        int i16;
        java.lang.Integer requireAdminApprovalToJoin;
        boolean z4;
        java.util.List<InHouseIMCtaInfo> ctas;
        java.util.ArrayList arrayList2;
        java.lang.Boolean allowStartGroupVoiceCall;
        java.lang.Boolean convertGroupToPublic;
        java.lang.Boolean allowFile;
        java.lang.Boolean allowVoice;
        java.lang.Boolean allowPay;
        java.lang.Boolean allowPayGifts;
        java.lang.Boolean reviewJoinApplications;
        java.lang.Boolean allowGeneratingInvitationQrCode;
        java.lang.Boolean viewGroupInfo;
        java.lang.Boolean boolIsAllowedSendMessageKyc;
        java.lang.Boolean inviteAnyone;
        java.lang.Boolean atAll;
        java.lang.Boolean removeMember;
        java.lang.Boolean addMember;
        java.lang.Boolean updateGroupProfile;
        java.lang.Boolean updateGroupSettings;
        java.lang.Boolean deleteAnnouncement;
        java.lang.Boolean postAnnouncement;
        java.lang.Boolean disbandGroup;
        java.lang.Boolean muteUnmuteMember;
        java.lang.Boolean setRole;
        if (continuation instanceof GroupDataConverter$convertGroupInfo$1) {
            groupDataConverter$convertGroupInfo$1 = (GroupDataConverter$convertGroupInfo$1) continuation;
            int i17 = groupDataConverter$convertGroupInfo$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                groupDataConverter$convertGroupInfo$1.label = i17 - Integer.MIN_VALUE;
            } else {
                groupDataConverter$convertGroupInfo$1 = new GroupDataConverter$convertGroupInfo$1(this, continuation);
            }
        }
        java.lang.Object obj2 = groupDataConverter$convertGroupInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i18 = groupDataConverter$convertGroupInfo$1.label;
        if (i18 == 0) {
            C56391yDq.AEQbTJ(obj2);
            boolean z5 = !C33129mqd.OLrzqt((java.lang.CharSequence) inHouseIMGroupEntity.getGroupId());
            z = android.text.TextUtils.isEmpty(inHouseIMGroupEntity.getV1Field()) ? true : java.lang.Boolean.parseBoolean(inHouseIMGroupEntity.getV1Field());
            if (inHouseIMGroupEntity.getOfficialTagInfo() != null) {
                officialTagInfoCopydefault = inHouseIMGroupEntity.getOfficialTagInfo();
            } else {
                officialTagInfoCopydefault = C44474sRd.KWHzl.copydefault(inHouseIMGroupEntity.getV2Field());
            }
            if (android.text.TextUtils.isEmpty(inHouseIMGroupEntity.getV3Field())) {
                groupExtFieldKWHzl = GroupExtField.Companion.KWHzl(inHouseIMGroupEntity.isAllowPrivateChat(), inHouseIMGroupEntity.isAllowSendLink(), inHouseIMGroupEntity.isAllowSetMentionedRobot(), inHouseIMGroupEntity.isCanAddAffiliateMember(), inHouseIMGroupEntity.isMute(), inHouseIMGroupEntity.getGroupNoticeId());
            } else {
                groupExtFieldKWHzl = GroupExtField.Companion.KWHzl(inHouseIMGroupEntity.getV3Field());
            }
            groupId = inHouseIMGroupEntity.getGroupId();
            masterId = inHouseIMGroupEntity.getMasterId();
            name = inHouseIMGroupEntity.getName();
            bizGroupName = inHouseIMGroupEntity.getBizGroupName();
            InHouseIMGroupPermissionInfo userGroupPermission = inHouseIMGroupEntity.getUserGroupPermission();
            zBooleanValue = (userGroupPermission == null || (updateBizGroupName = userGroupPermission.getUpdateBizGroupName()) == null) ? false : updateBizGroupName.booleanValue();
            avatar = inHouseIMGroupEntity.getAvatar();
            notice = inHouseIMGroupEntity.getNotice();
            noticeEditTime = inHouseIMGroupEntity.getNoticeEditTime();
            groupNoticeId = groupExtFieldKWHzl != null ? groupExtFieldKWHzl.getGroupNoticeId() : 0L;
            java.lang.String description = inHouseIMGroupEntity.getDescription();
            i = inHouseIMGroupEntity.getNeedVerifyStatus() == 1 ? 1 : 0;
            int i19 = inHouseIMGroupEntity.getAssetStatus() == 1 ? 1 : 0;
            assetCurrencyId = inHouseIMGroupEntity.getAssetCurrencyId();
            assetCurrencySymbol = inHouseIMGroupEntity.getAssetCurrencySymbol();
            java.lang.Double assetAmount = inHouseIMGroupEntity.getAssetAmount();
            dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            dDoubleValue2 = assetAmount != null ? assetAmount.doubleValue() : 0.0d;
            int i20 = i19;
            int i21 = inHouseIMGroupEntity.getPayStatus() == 1 ? 1 : 0;
            payCurrencyId = inHouseIMGroupEntity.getPayCurrencyId();
            payCurrencySymbol = inHouseIMGroupEntity.getPayCurrencySymbol();
            java.lang.Double payAmount = inHouseIMGroupEntity.getPayAmount();
            if (payAmount != null) {
                dDoubleValue = payAmount.doubleValue();
            }
            int groupCount = inHouseIMGroupEntity.getGroupCount();
            java.util.List<InHouseIMGroupMemberEntity> groupTopMembers = inHouseIMGroupEntity.getGroupTopMembers();
            if (groupTopMembers == null) {
                int i22 = i21;
                boolean z6 = z ? 1 : 0;
                str = description;
                r19 = z5;
                i2 = i20;
                i3 = groupCount;
                i4 = i22;
                inHouseIMGroupEntity2 = inHouseIMGroupEntity;
                i12 = i2;
                z2 = z;
                i11 = i3;
                officialTagInfo2 = officialTagInfoCopydefault;
                arrayList = new java.util.ArrayList();
                str13 = masterId;
                str12 = name;
                str11 = bizGroupName;
                z3 = zBooleanValue;
                j4 = noticeEditTime;
                j3 = groupNoticeId;
                inHouseIMGroupEntity4 = inHouseIMGroupEntity2;
                r352 = r19;
                i14 = i;
                num = assetCurrencyId;
                str10 = assetCurrencySymbol;
                d3 = dDoubleValue;
                d4 = dDoubleValue2;
                num3 = payCurrencyId;
                str9 = payCurrencySymbol;
                i13 = i4;
                str2 = str;
                str7 = groupId;
                groupExtField = groupExtFieldKWHzl;
                userSetting = inHouseIMGroupEntity4.getUserSetting();
                if (userSetting != null) {
                }
                if (r352 == 0) {
                }
                if (groupExtField != null) {
                }
                if (groupExtField != null) {
                }
                if (groupExtField != null) {
                }
                if (inHouseIMGroupEntity4.isCanAddGroupMember() == 1) {
                }
                if (groupExtField != null) {
                }
                if (groupExtField != null) {
                }
                allowMentionOthers = inHouseIMGroupEntity4.getAllowMentionOthers();
                if (allowMentionOthers != null) {
                }
                java.lang.Integer canTransferOwnership = inHouseIMGroupEntity4.getCanTransferOwnership();
                if (canTransferOwnership == null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission2 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission2 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission3 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission3 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission4 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission4 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission5 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission5 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission6 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission6 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission7 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission7 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission8 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission8 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission9 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission9 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission10 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission10 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission11 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission11 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission12 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission12 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission13 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission13 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission14 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission14 != null) {
                }
                allowMembersToAddMembers = inHouseIMGroupEntity4.getAllowMembersToAddMembers();
                if (allowMembersToAddMembers == null) {
                }
                java.lang.Integer allowSharingInvitationQrCode = inHouseIMGroupEntity4.getAllowSharingInvitationQrCode();
                if (allowSharingInvitationQrCode != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission15 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission15 == null) {
                }
                requireAdminApprovalToJoin = inHouseIMGroupEntity4.getRequireAdminApprovalToJoin();
                if (requireAdminApprovalToJoin != null) {
                }
                java.lang.Integer pendingJoinRequests = inHouseIMGroupEntity4.getPendingJoinRequests();
                if (pendingJoinRequests == null) {
                }
                java.lang.Integer type = inHouseIMGroupEntity4.getType();
                java.lang.Long maxMemberCount = inHouseIMGroupEntity4.getMaxMemberCount();
                if (maxMemberCount == null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission16 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission16 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission17 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission17 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission18 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission18 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission19 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission19 != null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission20 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission20 != null) {
                }
                PaidGroupInfo paidGroupInfo = inHouseIMGroupEntity4.getPaidGroupInfo();
                GroupPublicType publicGroupType = inHouseIMGroupEntity4.getPublicGroupType();
                InHouseIMGroupPermissionInfo userGroupPermission21 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission21 != null) {
                }
                InHouseIMSuperGroupConfig superGroupConfig = inHouseIMGroupEntity4.getSuperGroupConfig();
                if (superGroupConfig == null) {
                }
                InHouseIMSuperGroupConfig superGroupConfig2 = inHouseIMGroupEntity4.getSuperGroupConfig();
                if (superGroupConfig2 == null) {
                }
                InHouseIMSuperGroupConfig superGroupConfig3 = inHouseIMGroupEntity4.getSuperGroupConfig();
                if (superGroupConfig3 == null) {
                }
                InHouseIMGroupCampaign groupCampaign = inHouseIMGroupEntity4.getGroupCampaign();
                if (groupCampaign == null) {
                }
                ctas = inHouseIMGroupEntity4.getCtas();
                if (ctas == null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission22 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission22 == null) {
                }
                InHouseIMGroupPermissionInfo userGroupPermission23 = inHouseIMGroupEntity4.getUserGroupPermission();
                if (userGroupPermission23 != null) {
                }
                return new GroupInfo(str7, str13, str12, str11, !z3 ? z4 : false, avatar, notice, j4, j3, str2, i14 == 0 ? z4 : false, i12 == 0 ? z4 : false, num, str10, d4, i13 == 0 ? z4 : false, num3, str9, d3, i11, arrayList, groupUserSettingInfo, z, r352 == 0 ? z4 : false, officialTagInfo2, !z2 ? z4 : false, zIsAllowPrivacyChat, zIsAllowSendLink, zIsAllowMentionedRobot, z, zIsCanAddAffiliateMember, zIsMute, z, z, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, zBooleanValue, z, z, type, zBooleanValue, zBooleanValue, z, iIntValue, jLongValue, zBooleanValue, zBooleanValue, (userGroupPermission23 != null || (allowStartGroupVoiceCall = userGroupPermission23.getAllowStartGroupVoiceCall()) == null) ? false : allowStartGroupVoiceCall.booleanValue(), zBooleanValue, zBooleanValue, zBooleanValue, paidGroupInfo, publicGroupType, zBooleanValue, allowLeaveGroup, increaseGroupConfigStatus, orbiterPlusExpiryTimestamp, capacity, groupCampaignInfoEZpvd, arrayList2, inHouseIMGroupEntity4.getGroupVoiceCallConfig());
            }
            int i23 = i21;
            boolean z7 = z ? 1 : 0;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(groupTopMembers, 10));
            it = groupTopMembers.iterator();
            obj = objCopydefault;
            i5 = zBooleanValue ? 1 : 0;
            j = noticeEditTime;
            j2 = groupNoticeId;
            i6 = z7 ? 1 : 0;
            str2 = description;
            r35 = z5;
            i7 = i;
            num = assetCurrencyId;
            str3 = assetCurrencySymbol;
            d = dDoubleValue;
            d2 = dDoubleValue2;
            i8 = i20;
            num2 = payCurrencyId;
            i9 = groupCount;
            i10 = i23;
            groupDataConverter$convertGroupInfo$1 = groupDataConverter$convertGroupInfo$1;
            collection = arrayList3;
            str4 = bizGroupName;
            inHouseIMGroupEntity3 = inHouseIMGroupEntity;
            str5 = name;
            str6 = masterId;
            str7 = groupId;
            groupExtField = groupExtFieldKWHzl;
            officialTagInfo = officialTagInfoCopydefault;
            str8 = payCurrencySymbol;
            if (it.hasNext()) {
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i24 = groupDataConverter$convertGroupInfo$1.I$6;
            double d5 = groupDataConverter$convertGroupInfo$1.D$1;
            int i25 = groupDataConverter$convertGroupInfo$1.I$5;
            double d6 = groupDataConverter$convertGroupInfo$1.D$0;
            int i26 = groupDataConverter$convertGroupInfo$1.I$4;
            int i27 = groupDataConverter$convertGroupInfo$1.I$3;
            long j5 = groupDataConverter$convertGroupInfo$1.J$1;
            long j6 = groupDataConverter$convertGroupInfo$1.J$0;
            int i28 = groupDataConverter$convertGroupInfo$1.I$2;
            int i29 = groupDataConverter$convertGroupInfo$1.I$1;
            int i30 = groupDataConverter$convertGroupInfo$1.I$0;
            java.util.Collection collection2 = (java.util.Collection) groupDataConverter$convertGroupInfo$1.L$16;
            java.util.Iterator it2 = (java.util.Iterator) groupDataConverter$convertGroupInfo$1.L$15;
            java.util.Collection collection3 = (java.util.Collection) groupDataConverter$convertGroupInfo$1.L$14;
            java.lang.String str14 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$13;
            java.lang.Integer num4 = (java.lang.Integer) groupDataConverter$convertGroupInfo$1.L$12;
            java.lang.String str15 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$11;
            java.lang.Integer num5 = (java.lang.Integer) groupDataConverter$convertGroupInfo$1.L$10;
            java.lang.String str16 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$9;
            java.lang.String str17 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$8;
            java.lang.String str18 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$7;
            java.lang.String str19 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$6;
            java.lang.String str20 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$5;
            java.lang.String str21 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$4;
            java.lang.String str22 = (java.lang.String) groupDataConverter$convertGroupInfo$1.L$3;
            GroupExtField groupExtField2 = (GroupExtField) groupDataConverter$convertGroupInfo$1.L$2;
            OfficialTagInfo officialTagInfo3 = (OfficialTagInfo) groupDataConverter$convertGroupInfo$1.L$1;
            InHouseIMGroupEntity inHouseIMGroupEntity5 = (InHouseIMGroupEntity) groupDataConverter$convertGroupInfo$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            int i31 = i30;
            i9 = i24;
            j = j6;
            i5 = i28;
            i6 = i29;
            j2 = j5;
            i7 = i27;
            i10 = i25;
            d2 = d6;
            i8 = i26;
            d = d5;
            java.util.Collection collection4 = collection3;
            java.lang.String str23 = str14;
            java.lang.Integer num6 = num4;
            str3 = str15;
            num = num5;
            str2 = str16;
            notice = str17;
            avatar = str18;
            str4 = str19;
            str5 = str20;
            str6 = str21;
            str7 = str22;
            groupExtField = groupExtField2;
            officialTagInfo = officialTagInfo3;
            java.lang.Object obj3 = objCopydefault;
            java.util.Collection collection5 = collection2;
            Intrinsics.copydefault(obj2);
            collection5.add((GroupMemberInfo) obj2);
            inHouseIMGroupEntity3 = inHouseIMGroupEntity5;
            obj = obj3;
            num2 = num6;
            collection = collection4;
            it = it2;
            str8 = str23;
            r35 = i31;
            if (it.hasNext()) {
                java.util.Iterator it3 = it;
                InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = (InHouseIMGroupMemberEntity) it.next();
                sJM sjm = AEQbTJ;
                groupDataConverter$convertGroupInfo$1.L$0 = inHouseIMGroupEntity3;
                groupDataConverter$convertGroupInfo$1.L$1 = officialTagInfo;
                groupDataConverter$convertGroupInfo$1.L$2 = groupExtField;
                groupDataConverter$convertGroupInfo$1.L$3 = str7;
                groupDataConverter$convertGroupInfo$1.L$4 = str6;
                groupDataConverter$convertGroupInfo$1.L$5 = str5;
                groupDataConverter$convertGroupInfo$1.L$6 = str4;
                groupDataConverter$convertGroupInfo$1.L$7 = avatar;
                groupDataConverter$convertGroupInfo$1.L$8 = notice;
                groupDataConverter$convertGroupInfo$1.L$9 = str2;
                groupDataConverter$convertGroupInfo$1.L$10 = num;
                groupDataConverter$convertGroupInfo$1.L$11 = str3;
                groupDataConverter$convertGroupInfo$1.L$12 = num2;
                groupDataConverter$convertGroupInfo$1.L$13 = str8;
                InHouseIMGroupEntity inHouseIMGroupEntity6 = inHouseIMGroupEntity3;
                java.util.Collection collection6 = collection;
                groupDataConverter$convertGroupInfo$1.L$14 = collection6;
                num6 = num2;
                groupDataConverter$convertGroupInfo$1.L$15 = it3;
                groupDataConverter$convertGroupInfo$1.L$16 = collection6;
                ?? r3 = r35;
                groupDataConverter$convertGroupInfo$1.I$0 = r3 == true ? 1 : 0;
                int i32 = i6;
                groupDataConverter$convertGroupInfo$1.I$1 = i32 == true ? 1 : 0;
                int i33 = i5;
                groupDataConverter$convertGroupInfo$1.I$2 = i33 == true ? 1 : 0;
                str23 = str8;
                long j7 = j;
                groupDataConverter$convertGroupInfo$1.J$0 = j7;
                long j8 = j2;
                groupDataConverter$convertGroupInfo$1.J$1 = j8;
                int i34 = i7;
                groupDataConverter$convertGroupInfo$1.I$3 = i34;
                int i35 = i8;
                groupDataConverter$convertGroupInfo$1.I$4 = i35;
                double d7 = d2;
                groupDataConverter$convertGroupInfo$1.D$0 = d7;
                int i36 = i10;
                groupDataConverter$convertGroupInfo$1.I$5 = i36;
                double d8 = d;
                groupDataConverter$convertGroupInfo$1.D$1 = d8;
                int i37 = i9;
                groupDataConverter$convertGroupInfo$1.I$6 = i37;
                groupDataConverter$convertGroupInfo$1.label = 1;
                java.lang.Object objEZpvd = sjm.EZpvd(inHouseIMGroupMemberEntity, groupDataConverter$convertGroupInfo$1);
                obj3 = obj;
                if (objEZpvd == obj3) {
                    return obj3;
                }
                collection4 = collection6;
                i9 = i37;
                i31 = r3 == true ? 1 : 0;
                i6 = i32 == true ? 1 : 0;
                i5 = i33 == true ? 1 : 0;
                j2 = j8;
                i7 = i34;
                i8 = i35;
                d2 = d7;
                i10 = i36;
                d = d8;
                it2 = it3;
                collection5 = collection4;
                obj2 = objEZpvd;
                inHouseIMGroupEntity5 = inHouseIMGroupEntity6;
                j = j7;
                Intrinsics.copydefault(obj2);
                collection5.add((GroupMemberInfo) obj2);
                inHouseIMGroupEntity3 = inHouseIMGroupEntity5;
                obj = obj3;
                num2 = num6;
                collection = collection4;
                it = it2;
                str8 = str23;
                r35 = i31;
                if (it.hasNext()) {
                    inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                    java.lang.String str24 = str8;
                    java.util.Collection collection7 = collection;
                    ?? r192 = r35;
                    long j9 = j;
                    int i38 = i7;
                    int i39 = i5;
                    int i40 = i6;
                    long j10 = j2;
                    double d9 = d;
                    i4 = i10;
                    double d10 = d2;
                    int i41 = i8;
                    java.lang.Integer num7 = num2;
                    i3 = i9;
                    java.util.List list = (java.util.List) collection7;
                    if (list == null) {
                        officialTagInfoCopydefault = officialTagInfo;
                        groupExtFieldKWHzl = groupExtField;
                        groupId = str7;
                        masterId = str6;
                        name = str5;
                        bizGroupName = str4;
                        str = str2;
                        z = i40 == true ? 1 : 0;
                        zBooleanValue = i39 == true ? 1 : 0;
                        i2 = i41;
                        assetCurrencyId = num;
                        noticeEditTime = j9;
                        assetCurrencySymbol = str3;
                        payCurrencyId = num7;
                        payCurrencySymbol = str24;
                        groupNoticeId = j10;
                        i = i38;
                        dDoubleValue2 = d10;
                        dDoubleValue = d9;
                        r19 = r192;
                        i12 = i2;
                        z2 = z;
                        i11 = i3;
                        officialTagInfo2 = officialTagInfoCopydefault;
                        arrayList = new java.util.ArrayList();
                        str13 = masterId;
                        str12 = name;
                        str11 = bizGroupName;
                        z3 = zBooleanValue;
                        j4 = noticeEditTime;
                        j3 = groupNoticeId;
                        inHouseIMGroupEntity4 = inHouseIMGroupEntity2;
                        r352 = r19;
                        i14 = i;
                        num = assetCurrencyId;
                        str10 = assetCurrencySymbol;
                        d3 = dDoubleValue;
                        d4 = dDoubleValue2;
                        num3 = payCurrencyId;
                        str9 = payCurrencySymbol;
                        i13 = i4;
                        str2 = str;
                        str7 = groupId;
                        groupExtField = groupExtFieldKWHzl;
                        userSetting = inHouseIMGroupEntity4.getUserSetting();
                        if (userSetting != null) {
                            GroupUserSettingInfo groupUserSettingInfoOLrzqt = AEQbTJ.OLrzqt(userSetting);
                            Intrinsics.copydefault(groupUserSettingInfoOLrzqt);
                            groupUserSettingInfo = groupUserSettingInfoOLrzqt;
                        } else {
                            groupUserSettingInfo = null;
                        }
                        boolean z8 = (r352 == 0 && inHouseIMGroupEntity4.getUserSetting() == null) ? false : true;
                        boolean zIsAllowPrivacyChat = groupExtField != null ? groupExtField.isAllowPrivacyChat() : false;
                        boolean zIsAllowSendLink = groupExtField != null ? groupExtField.isAllowSendLink() : false;
                        boolean zIsAllowMentionedRobot = groupExtField != null ? groupExtField.isAllowMentionedRobot() : false;
                        boolean z9 = inHouseIMGroupEntity4.isCanAddGroupMember() == 1;
                        boolean zIsCanAddAffiliateMember = groupExtField != null ? groupExtField.isCanAddAffiliateMember() : false;
                        boolean zIsMute = groupExtField != null ? groupExtField.isMute() : false;
                        allowMentionOthers = inHouseIMGroupEntity4.getAllowMentionOthers();
                        if (allowMentionOthers != null) {
                            i15 = 1;
                            boolean z10 = allowMentionOthers.intValue() == 1;
                            java.lang.Integer canTransferOwnership2 = inHouseIMGroupEntity4.getCanTransferOwnership();
                            boolean z11 = canTransferOwnership2 == null && canTransferOwnership2.intValue() == i15;
                            InHouseIMGroupPermissionInfo userGroupPermission24 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue2 = (userGroupPermission24 != null || (setRole = userGroupPermission24.getSetRole()) == null) ? false : setRole.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission32 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue3 = (userGroupPermission32 != null || (muteUnmuteMember = userGroupPermission32.getMuteUnmuteMember()) == null) ? false : muteUnmuteMember.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission42 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue4 = (userGroupPermission42 != null || (disbandGroup = userGroupPermission42.getDisbandGroup()) == null) ? false : disbandGroup.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission52 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue5 = (userGroupPermission52 != null || (postAnnouncement = userGroupPermission52.getPostAnnouncement()) == null) ? false : postAnnouncement.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission62 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue6 = (userGroupPermission62 != null || (deleteAnnouncement = userGroupPermission62.getDeleteAnnouncement()) == null) ? false : deleteAnnouncement.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission72 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue7 = (userGroupPermission72 != null || (updateGroupSettings = userGroupPermission72.getUpdateGroupSettings()) == null) ? false : updateGroupSettings.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission82 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue8 = (userGroupPermission82 != null || (updateGroupProfile = userGroupPermission82.getUpdateGroupProfile()) == null) ? false : updateGroupProfile.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission92 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue9 = (userGroupPermission92 != null || (addMember = userGroupPermission92.getAddMember()) == null) ? false : addMember.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission102 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue10 = (userGroupPermission102 != null || (removeMember = userGroupPermission102.getRemoveMember()) == null) ? false : removeMember.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission112 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue11 = (userGroupPermission112 != null || (atAll = userGroupPermission112.getAtAll()) == null) ? false : atAll.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission122 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue12 = (userGroupPermission122 != null || (inviteAnyone = userGroupPermission122.getInviteAnyone()) == null) ? false : inviteAnyone.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission132 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue13 = (userGroupPermission132 != null || (boolIsAllowedSendMessageKyc = userGroupPermission132.isAllowedSendMessageKyc()) == null) ? false : boolIsAllowedSendMessageKyc.booleanValue();
                            InHouseIMGroupPermissionInfo userGroupPermission142 = inHouseIMGroupEntity4.getUserGroupPermission();
                            boolean zBooleanValue14 = (userGroupPermission142 != null || (viewGroupInfo = userGroupPermission142.getViewGroupInfo()) == null) ? false : viewGroupInfo.booleanValue();
                            allowMembersToAddMembers = inHouseIMGroupEntity4.getAllowMembersToAddMembers();
                            if (allowMembersToAddMembers == null) {
                                i16 = 1;
                                boolean z12 = allowMembersToAddMembers.intValue() == 1;
                                java.lang.Integer allowSharingInvitationQrCode2 = inHouseIMGroupEntity4.getAllowSharingInvitationQrCode();
                                boolean z13 = allowSharingInvitationQrCode2 != null && allowSharingInvitationQrCode2.intValue() == i16;
                                InHouseIMGroupPermissionInfo userGroupPermission152 = inHouseIMGroupEntity4.getUserGroupPermission();
                                boolean zBooleanValue15 = (userGroupPermission152 == null || (allowGeneratingInvitationQrCode = userGroupPermission152.getAllowGeneratingInvitationQrCode()) == null) ? false : allowGeneratingInvitationQrCode.booleanValue();
                                requireAdminApprovalToJoin = inHouseIMGroupEntity4.getRequireAdminApprovalToJoin();
                                if (requireAdminApprovalToJoin != null) {
                                    z4 = true;
                                    boolean z14 = requireAdminApprovalToJoin.intValue() == 1;
                                    java.lang.Integer pendingJoinRequests2 = inHouseIMGroupEntity4.getPendingJoinRequests();
                                    int iIntValue = pendingJoinRequests2 == null ? pendingJoinRequests2.intValue() : 0;
                                    java.lang.Integer type2 = inHouseIMGroupEntity4.getType();
                                    java.lang.Long maxMemberCount2 = inHouseIMGroupEntity4.getMaxMemberCount();
                                    long jLongValue = maxMemberCount2 == null ? maxMemberCount2.longValue() : 0L;
                                    InHouseIMGroupPermissionInfo userGroupPermission162 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    boolean zBooleanValue16 = (userGroupPermission162 != null || (reviewJoinApplications = userGroupPermission162.getReviewJoinApplications()) == null) ? false : reviewJoinApplications.booleanValue();
                                    InHouseIMGroupPermissionInfo userGroupPermission172 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    boolean zBooleanValue17 = (userGroupPermission172 != null || (allowPayGifts = userGroupPermission172.getAllowPayGifts()) == null) ? false : allowPayGifts.booleanValue();
                                    InHouseIMGroupPermissionInfo userGroupPermission182 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    boolean zBooleanValue18 = (userGroupPermission182 != null || (allowPay = userGroupPermission182.getAllowPay()) == null) ? false : allowPay.booleanValue();
                                    InHouseIMGroupPermissionInfo userGroupPermission192 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    boolean zBooleanValue19 = (userGroupPermission192 != null || (allowVoice = userGroupPermission192.getAllowVoice()) == null) ? z4 : allowVoice.booleanValue();
                                    InHouseIMGroupPermissionInfo userGroupPermission202 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    boolean zBooleanValue20 = (userGroupPermission202 != null || (allowFile = userGroupPermission202.getAllowFile()) == null) ? false : allowFile.booleanValue();
                                    PaidGroupInfo paidGroupInfo2 = inHouseIMGroupEntity4.getPaidGroupInfo();
                                    GroupPublicType publicGroupType2 = inHouseIMGroupEntity4.getPublicGroupType();
                                    InHouseIMGroupPermissionInfo userGroupPermission212 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    boolean zBooleanValue21 = (userGroupPermission212 != null || (convertGroupToPublic = userGroupPermission212.getConvertGroupToPublic()) == null) ? false : convertGroupToPublic.booleanValue();
                                    InHouseIMSuperGroupConfig superGroupConfig4 = inHouseIMGroupEntity4.getSuperGroupConfig();
                                    InHouseIMSuperGroupConfig.IncreaseGroupStatus increaseGroupConfigStatus = superGroupConfig4 == null ? superGroupConfig4.getIncreaseGroupConfigStatus() : null;
                                    InHouseIMSuperGroupConfig superGroupConfig22 = inHouseIMGroupEntity4.getSuperGroupConfig();
                                    java.lang.Long orbiterPlusExpiryTimestamp = superGroupConfig22 == null ? superGroupConfig22.getOrbiterPlusExpiryTimestamp() : null;
                                    InHouseIMSuperGroupConfig superGroupConfig32 = inHouseIMGroupEntity4.getSuperGroupConfig();
                                    java.lang.Integer capacity = superGroupConfig32 == null ? superGroupConfig32.getCapacity() : null;
                                    InHouseIMGroupCampaign groupCampaign2 = inHouseIMGroupEntity4.getGroupCampaign();
                                    GroupCampaignInfo groupCampaignInfoEZpvd = groupCampaign2 == null ? AEQbTJ.EZpvd(groupCampaign2) : null;
                                    ctas = inHouseIMGroupEntity4.getCtas();
                                    if (ctas == null) {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(ctas, 10));
                                        java.util.Iterator it4 = ctas.iterator();
                                        while (it4.hasNext()) {
                                            arrayList4.add(AEQbTJ.copydefault((InHouseIMCtaInfo) it4.next()));
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    InHouseIMGroupPermissionInfo userGroupPermission222 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    java.lang.Boolean allowLeaveGroup = userGroupPermission222 == null ? userGroupPermission222.getAllowLeaveGroup() : null;
                                    InHouseIMGroupPermissionInfo userGroupPermission232 = inHouseIMGroupEntity4.getUserGroupPermission();
                                    return new GroupInfo(str7, str13, str12, str11, !z3 ? z4 : false, avatar, notice, j4, j3, str2, i14 == 0 ? z4 : false, i12 == 0 ? z4 : false, num, str10, d4, i13 == 0 ? z4 : false, num3, str9, d3, i11, arrayList, groupUserSettingInfo, z8, r352 == 0 ? z4 : false, officialTagInfo2, !z2 ? z4 : false, zIsAllowPrivacyChat, zIsAllowSendLink, zIsAllowMentionedRobot, z9, zIsCanAddAffiliateMember, zIsMute, z10, z11, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, z12, z13, type2, zBooleanValue14, zBooleanValue15, z14, iIntValue, jLongValue, zBooleanValue16, zBooleanValue17, (userGroupPermission232 != null || (allowStartGroupVoiceCall = userGroupPermission232.getAllowStartGroupVoiceCall()) == null) ? false : allowStartGroupVoiceCall.booleanValue(), zBooleanValue18, zBooleanValue19, zBooleanValue20, paidGroupInfo2, publicGroupType2, zBooleanValue21, allowLeaveGroup, increaseGroupConfigStatus, orbiterPlusExpiryTimestamp, capacity, groupCampaignInfoEZpvd, arrayList2, inHouseIMGroupEntity4.getGroupVoiceCallConfig());
                                }
                                z4 = true;
                                java.lang.Integer pendingJoinRequests22 = inHouseIMGroupEntity4.getPendingJoinRequests();
                                if (pendingJoinRequests22 == null) {
                                }
                                java.lang.Integer type22 = inHouseIMGroupEntity4.getType();
                                java.lang.Long maxMemberCount22 = inHouseIMGroupEntity4.getMaxMemberCount();
                                if (maxMemberCount22 == null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission1622 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission1622 != null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission1722 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission1722 != null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission1822 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission1822 != null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission1922 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission1922 != null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission2022 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission2022 != null) {
                                }
                                PaidGroupInfo paidGroupInfo22 = inHouseIMGroupEntity4.getPaidGroupInfo();
                                GroupPublicType publicGroupType22 = inHouseIMGroupEntity4.getPublicGroupType();
                                InHouseIMGroupPermissionInfo userGroupPermission2122 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission2122 != null) {
                                }
                                InHouseIMSuperGroupConfig superGroupConfig42 = inHouseIMGroupEntity4.getSuperGroupConfig();
                                if (superGroupConfig42 == null) {
                                }
                                InHouseIMSuperGroupConfig superGroupConfig222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                                if (superGroupConfig222 == null) {
                                }
                                InHouseIMSuperGroupConfig superGroupConfig322 = inHouseIMGroupEntity4.getSuperGroupConfig();
                                if (superGroupConfig322 == null) {
                                }
                                InHouseIMGroupCampaign groupCampaign22 = inHouseIMGroupEntity4.getGroupCampaign();
                                if (groupCampaign22 == null) {
                                }
                                ctas = inHouseIMGroupEntity4.getCtas();
                                if (ctas == null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission2222 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission2222 == null) {
                                }
                                InHouseIMGroupPermissionInfo userGroupPermission2322 = inHouseIMGroupEntity4.getUserGroupPermission();
                                if (userGroupPermission2322 != null) {
                                }
                                return new GroupInfo(str7, str13, str12, str11, !z3 ? z4 : false, avatar, notice, j4, j3, str2, i14 == 0 ? z4 : false, i12 == 0 ? z4 : false, num, str10, d4, i13 == 0 ? z4 : false, num3, str9, d3, i11, arrayList, groupUserSettingInfo, z8, r352 == 0 ? z4 : false, officialTagInfo2, !z2 ? z4 : false, zIsAllowPrivacyChat, zIsAllowSendLink, zIsAllowMentionedRobot, z9, zIsCanAddAffiliateMember, zIsMute, z10, z11, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, z12, z13, type22, zBooleanValue14, zBooleanValue15, z14, iIntValue, jLongValue, zBooleanValue16, zBooleanValue17, (userGroupPermission2322 != null || (allowStartGroupVoiceCall = userGroupPermission2322.getAllowStartGroupVoiceCall()) == null) ? false : allowStartGroupVoiceCall.booleanValue(), zBooleanValue18, zBooleanValue19, zBooleanValue20, paidGroupInfo22, publicGroupType22, zBooleanValue21, allowLeaveGroup, increaseGroupConfigStatus, orbiterPlusExpiryTimestamp, capacity, groupCampaignInfoEZpvd, arrayList2, inHouseIMGroupEntity4.getGroupVoiceCallConfig());
                            }
                            i16 = 1;
                            java.lang.Integer allowSharingInvitationQrCode22 = inHouseIMGroupEntity4.getAllowSharingInvitationQrCode();
                            if (allowSharingInvitationQrCode22 != null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission1522 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission1522 == null) {
                            }
                            requireAdminApprovalToJoin = inHouseIMGroupEntity4.getRequireAdminApprovalToJoin();
                            if (requireAdminApprovalToJoin != null) {
                            }
                            java.lang.Integer pendingJoinRequests222 = inHouseIMGroupEntity4.getPendingJoinRequests();
                            if (pendingJoinRequests222 == null) {
                            }
                            java.lang.Integer type222 = inHouseIMGroupEntity4.getType();
                            java.lang.Long maxMemberCount222 = inHouseIMGroupEntity4.getMaxMemberCount();
                            if (maxMemberCount222 == null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission16222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission16222 != null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission17222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission17222 != null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission18222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission18222 != null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission19222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission19222 != null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission20222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission20222 != null) {
                            }
                            PaidGroupInfo paidGroupInfo222 = inHouseIMGroupEntity4.getPaidGroupInfo();
                            GroupPublicType publicGroupType222 = inHouseIMGroupEntity4.getPublicGroupType();
                            InHouseIMGroupPermissionInfo userGroupPermission21222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission21222 != null) {
                            }
                            InHouseIMSuperGroupConfig superGroupConfig422 = inHouseIMGroupEntity4.getSuperGroupConfig();
                            if (superGroupConfig422 == null) {
                            }
                            InHouseIMSuperGroupConfig superGroupConfig2222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                            if (superGroupConfig2222 == null) {
                            }
                            InHouseIMSuperGroupConfig superGroupConfig3222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                            if (superGroupConfig3222 == null) {
                            }
                            InHouseIMGroupCampaign groupCampaign222 = inHouseIMGroupEntity4.getGroupCampaign();
                            if (groupCampaign222 == null) {
                            }
                            ctas = inHouseIMGroupEntity4.getCtas();
                            if (ctas == null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission22222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission22222 == null) {
                            }
                            InHouseIMGroupPermissionInfo userGroupPermission23222 = inHouseIMGroupEntity4.getUserGroupPermission();
                            if (userGroupPermission23222 != null) {
                            }
                            return new GroupInfo(str7, str13, str12, str11, !z3 ? z4 : false, avatar, notice, j4, j3, str2, i14 == 0 ? z4 : false, i12 == 0 ? z4 : false, num, str10, d4, i13 == 0 ? z4 : false, num3, str9, d3, i11, arrayList, groupUserSettingInfo, z8, r352 == 0 ? z4 : false, officialTagInfo2, !z2 ? z4 : false, zIsAllowPrivacyChat, zIsAllowSendLink, zIsAllowMentionedRobot, z9, zIsCanAddAffiliateMember, zIsMute, z10, z11, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, z12, z13, type222, zBooleanValue14, zBooleanValue15, z14, iIntValue, jLongValue, zBooleanValue16, zBooleanValue17, (userGroupPermission23222 != null || (allowStartGroupVoiceCall = userGroupPermission23222.getAllowStartGroupVoiceCall()) == null) ? false : allowStartGroupVoiceCall.booleanValue(), zBooleanValue18, zBooleanValue19, zBooleanValue20, paidGroupInfo222, publicGroupType222, zBooleanValue21, allowLeaveGroup, increaseGroupConfigStatus, orbiterPlusExpiryTimestamp, capacity, groupCampaignInfoEZpvd, arrayList2, inHouseIMGroupEntity4.getGroupVoiceCallConfig());
                        }
                        i15 = 1;
                        java.lang.Integer canTransferOwnership22 = inHouseIMGroupEntity4.getCanTransferOwnership();
                        if (canTransferOwnership22 == null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission242 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission242 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission322 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission322 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission422 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission422 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission522 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission522 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission622 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission622 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission722 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission722 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission822 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission822 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission922 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission922 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission1022 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission1022 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission1122 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission1122 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission1222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission1222 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission1322 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission1322 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission1422 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission1422 != null) {
                        }
                        allowMembersToAddMembers = inHouseIMGroupEntity4.getAllowMembersToAddMembers();
                        if (allowMembersToAddMembers == null) {
                        }
                        java.lang.Integer allowSharingInvitationQrCode222 = inHouseIMGroupEntity4.getAllowSharingInvitationQrCode();
                        if (allowSharingInvitationQrCode222 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission15222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission15222 == null) {
                        }
                        requireAdminApprovalToJoin = inHouseIMGroupEntity4.getRequireAdminApprovalToJoin();
                        if (requireAdminApprovalToJoin != null) {
                        }
                        java.lang.Integer pendingJoinRequests2222 = inHouseIMGroupEntity4.getPendingJoinRequests();
                        if (pendingJoinRequests2222 == null) {
                        }
                        java.lang.Integer type2222 = inHouseIMGroupEntity4.getType();
                        java.lang.Long maxMemberCount2222 = inHouseIMGroupEntity4.getMaxMemberCount();
                        if (maxMemberCount2222 == null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission162222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission162222 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission172222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission172222 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission182222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission182222 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission192222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission192222 != null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission202222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission202222 != null) {
                        }
                        PaidGroupInfo paidGroupInfo2222 = inHouseIMGroupEntity4.getPaidGroupInfo();
                        GroupPublicType publicGroupType2222 = inHouseIMGroupEntity4.getPublicGroupType();
                        InHouseIMGroupPermissionInfo userGroupPermission212222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission212222 != null) {
                        }
                        InHouseIMSuperGroupConfig superGroupConfig4222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                        if (superGroupConfig4222 == null) {
                        }
                        InHouseIMSuperGroupConfig superGroupConfig22222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                        if (superGroupConfig22222 == null) {
                        }
                        InHouseIMSuperGroupConfig superGroupConfig32222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                        if (superGroupConfig32222 == null) {
                        }
                        InHouseIMGroupCampaign groupCampaign2222 = inHouseIMGroupEntity4.getGroupCampaign();
                        if (groupCampaign2222 == null) {
                        }
                        ctas = inHouseIMGroupEntity4.getCtas();
                        if (ctas == null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission222222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission222222 == null) {
                        }
                        InHouseIMGroupPermissionInfo userGroupPermission232222 = inHouseIMGroupEntity4.getUserGroupPermission();
                        if (userGroupPermission232222 != null) {
                        }
                        return new GroupInfo(str7, str13, str12, str11, !z3 ? z4 : false, avatar, notice, j4, j3, str2, i14 == 0 ? z4 : false, i12 == 0 ? z4 : false, num, str10, d4, i13 == 0 ? z4 : false, num3, str9, d3, i11, arrayList, groupUserSettingInfo, z8, r352 == 0 ? z4 : false, officialTagInfo2, !z2 ? z4 : false, zIsAllowPrivacyChat, zIsAllowSendLink, zIsAllowMentionedRobot, z9, zIsCanAddAffiliateMember, zIsMute, z10, z11, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, z12, z13, type2222, zBooleanValue14, zBooleanValue15, z14, iIntValue, jLongValue, zBooleanValue16, zBooleanValue17, (userGroupPermission232222 != null || (allowStartGroupVoiceCall = userGroupPermission232222.getAllowStartGroupVoiceCall()) == null) ? false : allowStartGroupVoiceCall.booleanValue(), zBooleanValue18, zBooleanValue19, zBooleanValue20, paidGroupInfo2222, publicGroupType2222, zBooleanValue21, allowLeaveGroup, increaseGroupConfigStatus, orbiterPlusExpiryTimestamp, capacity, groupCampaignInfoEZpvd, arrayList2, inHouseIMGroupEntity4.getGroupVoiceCallConfig());
                    }
                    arrayList = list;
                    i11 = i3;
                    officialTagInfo2 = officialTagInfo;
                    str10 = str3;
                    str13 = str6;
                    num3 = num7;
                    inHouseIMGroupEntity4 = inHouseIMGroupEntity2;
                    r352 = r192 == true ? 1 : 0;
                    z2 = i40 == true ? 1 : 0;
                    str9 = str24;
                    z3 = i39 == true ? 1 : 0;
                    j4 = j9;
                    j3 = j10;
                    i14 = i38;
                    i12 = i41;
                    d4 = d10;
                    i13 = i4;
                    d3 = d9;
                    str12 = str5;
                    str11 = str4;
                    userSetting = inHouseIMGroupEntity4.getUserSetting();
                    if (userSetting != null) {
                    }
                    if (r352 == 0) {
                    }
                    if (groupExtField != null) {
                    }
                    if (groupExtField != null) {
                    }
                    if (groupExtField != null) {
                    }
                    if (inHouseIMGroupEntity4.isCanAddGroupMember() == 1) {
                    }
                    if (groupExtField != null) {
                    }
                    if (groupExtField != null) {
                    }
                    allowMentionOthers = inHouseIMGroupEntity4.getAllowMentionOthers();
                    if (allowMentionOthers != null) {
                    }
                    java.lang.Integer canTransferOwnership222 = inHouseIMGroupEntity4.getCanTransferOwnership();
                    if (canTransferOwnership222 == null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission2422 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission2422 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission3222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission3222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission4222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission4222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission5222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission5222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission6222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission6222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission7222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission7222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission8222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission8222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission9222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission9222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission10222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission10222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission11222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission11222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission12222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission12222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission13222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission13222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission14222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission14222 != null) {
                    }
                    allowMembersToAddMembers = inHouseIMGroupEntity4.getAllowMembersToAddMembers();
                    if (allowMembersToAddMembers == null) {
                    }
                    java.lang.Integer allowSharingInvitationQrCode2222 = inHouseIMGroupEntity4.getAllowSharingInvitationQrCode();
                    if (allowSharingInvitationQrCode2222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission152222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission152222 == null) {
                    }
                    requireAdminApprovalToJoin = inHouseIMGroupEntity4.getRequireAdminApprovalToJoin();
                    if (requireAdminApprovalToJoin != null) {
                    }
                    java.lang.Integer pendingJoinRequests22222 = inHouseIMGroupEntity4.getPendingJoinRequests();
                    if (pendingJoinRequests22222 == null) {
                    }
                    java.lang.Integer type22222 = inHouseIMGroupEntity4.getType();
                    java.lang.Long maxMemberCount22222 = inHouseIMGroupEntity4.getMaxMemberCount();
                    if (maxMemberCount22222 == null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission1622222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission1622222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission1722222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission1722222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission1822222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission1822222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission1922222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission1922222 != null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission2022222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission2022222 != null) {
                    }
                    PaidGroupInfo paidGroupInfo22222 = inHouseIMGroupEntity4.getPaidGroupInfo();
                    GroupPublicType publicGroupType22222 = inHouseIMGroupEntity4.getPublicGroupType();
                    InHouseIMGroupPermissionInfo userGroupPermission2122222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission2122222 != null) {
                    }
                    InHouseIMSuperGroupConfig superGroupConfig42222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                    if (superGroupConfig42222 == null) {
                    }
                    InHouseIMSuperGroupConfig superGroupConfig222222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                    if (superGroupConfig222222 == null) {
                    }
                    InHouseIMSuperGroupConfig superGroupConfig322222 = inHouseIMGroupEntity4.getSuperGroupConfig();
                    if (superGroupConfig322222 == null) {
                    }
                    InHouseIMGroupCampaign groupCampaign22222 = inHouseIMGroupEntity4.getGroupCampaign();
                    if (groupCampaign22222 == null) {
                    }
                    ctas = inHouseIMGroupEntity4.getCtas();
                    if (ctas == null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission2222222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission2222222 == null) {
                    }
                    InHouseIMGroupPermissionInfo userGroupPermission2322222 = inHouseIMGroupEntity4.getUserGroupPermission();
                    if (userGroupPermission2322222 != null) {
                    }
                    return new GroupInfo(str7, str13, str12, str11, !z3 ? z4 : false, avatar, notice, j4, j3, str2, i14 == 0 ? z4 : false, i12 == 0 ? z4 : false, num, str10, d4, i13 == 0 ? z4 : false, num3, str9, d3, i11, arrayList, groupUserSettingInfo, z8, r352 == 0 ? z4 : false, officialTagInfo2, !z2 ? z4 : false, zIsAllowPrivacyChat, zIsAllowSendLink, zIsAllowMentionedRobot, z9, zIsCanAddAffiliateMember, zIsMute, z10, z11, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, z12, z13, type22222, zBooleanValue14, zBooleanValue15, z14, iIntValue, jLongValue, zBooleanValue16, zBooleanValue17, (userGroupPermission2322222 != null || (allowStartGroupVoiceCall = userGroupPermission2322222.getAllowStartGroupVoiceCall()) == null) ? false : allowStartGroupVoiceCall.booleanValue(), zBooleanValue18, zBooleanValue19, zBooleanValue20, paidGroupInfo22222, publicGroupType22222, zBooleanValue21, allowLeaveGroup, increaseGroupConfigStatus, orbiterPlusExpiryTimestamp, capacity, groupCampaignInfoEZpvd, arrayList2, inHouseIMGroupEntity4.getGroupVoiceCallConfig());
                }
            }
        }
    }

    public final GroupCampaignInfo EZpvd(InHouseIMGroupCampaign inHouseIMGroupCampaign) {
        return new GroupCampaignInfo(inHouseIMGroupCampaign.getActivityId(), inHouseIMGroupCampaign.getUrlSlug(), inHouseIMGroupCampaign.getUrlSubPath(), inHouseIMGroupCampaign.getCampaignStartTime(), inHouseIMGroupCampaign.getCampaignEndTime(), inHouseIMGroupCampaign.getRegistrationStartTime(), inHouseIMGroupCampaign.getMinAppVersion());
    }

    public final CtaInfo copydefault(InHouseIMCtaInfo inHouseIMCtaInfo) {
        java.lang.String name = inHouseIMCtaInfo.getName();
        java.lang.String link = inHouseIMCtaInfo.getLink();
        InHouseIMCtaIcon icon = inHouseIMCtaInfo.getIcon();
        return new CtaInfo(name, link, icon != null ? new CtaIcon(icon.getLight(), icon.getDark()) : null, inHouseIMCtaInfo.getCampaignStartTime(), inHouseIMCtaInfo.getCampaignEndTime());
    }

    /* JADX DEBUG: Duplicate block (B:236:0x0559) to fix multi-entry loop: BACK_EDGE: B:236:0x0559 -> B:237:0x0565 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x0325 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:192:0x04c2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:233:0x0553 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:283:0x0565 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0122 */
    /* JADX DEBUG: Type inference failed for r0v108. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v25. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v55. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v86. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r11v10. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v6. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x03d6: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:153:0x03d6 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035b A[Catch: all -> 0x0060, TryCatch #1 {all -> 0x0060, blocks: (B:15:0x0058, B:130:0x034a, B:131:0x034d, B:135:0x0355, B:137:0x035b, B:139:0x0365, B:140:0x0368, B:141:0x0369, B:142:0x036c, B:144:0x037e, B:146:0x038b), top: B:252:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038b A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:15:0x0058, B:130:0x034a, B:131:0x034d, B:135:0x0355, B:137:0x035b, B:139:0x0365, B:140:0x0368, B:141:0x0369, B:142:0x036c, B:144:0x037e, B:146:0x038b), top: B:252:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f2 A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:33:0x010e, B:208:0x04e1, B:209:0x04e4, B:213:0x04ec, B:215:0x04f2, B:217:0x04fc, B:218:0x04ff, B:219:0x0500, B:220:0x0503), top: B:252:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02de  */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v19, types: [T] */
    /* JADX WARN: Type inference failed for: r0v64, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x03b6 -> B:150:0x03b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x03c4 -> B:152:0x03ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, @NotNull Continuation<? super GroupMemberInfo> continuation) throws java.lang.Exception {
        GroupDataConverter$convertMemberEntity$1 groupDataConverter$convertMemberEntity$1;
        BaseDao baseDao;
        BaseDao baseDao2;
        ?? r6;
        ?? r2;
        boolean z;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        int i;
        java.lang.String str;
        GroupDataConverter$convertMemberEntity$1 groupDataConverter$convertMemberEntity$12;
        BaseDao baseDao3;
        int i2;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity2;
        java.lang.Exception e;
        Ref.LongRef longRef2;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        BaseDao baseDao4;
        Ref.LongRef longRef3;
        int i3;
        int i4;
        boolean z2;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity3;
        int i5;
        ?? r0;
        Ref.LongRef longRef4;
        GroupDataConverter$convertMemberEntity$1 groupDataConverter$convertMemberEntity$13;
        Ref.ObjectRef objectRef2;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity4;
        java.lang.String str6;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef3;
        boolean z3;
        Ref.LongRef longRef6;
        BaseDao baseDao5;
        long j;
        Ref.ObjectRef objectRef4;
        ?? r02;
        java.lang.String remarkName;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        boolean z4;
        Ref.ObjectRef objectRef5;
        Ref.LongRef longRef7;
        java.lang.String str10;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity5;
        int i6;
        int i7;
        java.lang.String str11;
        java.lang.String str12;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        java.lang.Exception e3;
        java.lang.IllegalStateException e4;
        java.lang.String message2;
        java.lang.String str13;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity6;
        boolean z5;
        java.lang.String str14;
        BaseDao baseDao6;
        Ref.LongRef longRef8;
        Ref.ObjectRef objectRef6;
        int i8;
        int i9;
        int i10;
        java.lang.String str15;
        ?? r03;
        OfficialTagInfo officialTagInfo;
        GroupMemberExtField groupMemberExtFieldAEQbTJ;
        GroupDataConverter$convertMemberEntity$1 groupDataConverter$convertMemberEntity$14;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        Ref.ObjectRef objectRef7;
        long jNanoTime;
        int i11;
        int i12;
        int i13;
        Ref.ObjectRef objectRef8;
        Ref.LongRef longRef9;
        BaseDao baseDao7;
        Ref.LongRef longRef10;
        Ref.ObjectRef objectRef9;
        ?? r04;
        java.lang.String groupNickName;
        java.lang.String v2Field;
        java.lang.String str19;
        android.database.sqlite.SQLiteDatabaseLockedException e5;
        if (continuation instanceof GroupDataConverter$convertMemberEntity$1) {
            groupDataConverter$convertMemberEntity$1 = (GroupDataConverter$convertMemberEntity$1) continuation;
            int i14 = groupDataConverter$convertMemberEntity$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                groupDataConverter$convertMemberEntity$1.label = i14 - Integer.MIN_VALUE;
            } else {
                groupDataConverter$convertMemberEntity$1 = new GroupDataConverter$convertMemberEntity$1(this, continuation);
            }
        }
        java.lang.Object obj = groupDataConverter$convertMemberEntity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i15 = groupDataConverter$convertMemberEntity$1.label;
        ?? r7 = 4;
        ?? r8 = 2;
        ?? r82 = 2;
        java.lang.String str20 = "Database Operation failed after ";
        java.lang.String str21 = " attempts";
        java.lang.String str22 = "not open";
        try {
            try {
                if (i15 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (inHouseIMGroupMemberEntity == null) {
                        return null;
                    }
                    java.lang.String memberId = inHouseIMGroupMemberEntity.getMemberId();
                    boolean zKWHzl = C44157sFk.KWHzl(memberId);
                    InHouseIMContactDao inHouseIMContactDaoKWHzl = AEQbTJ.KWHzl();
                    z = zKWHzl;
                    longRef = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 3;
                    str = memberId;
                    groupDataConverter$convertMemberEntity$12 = groupDataConverter$convertMemberEntity$1;
                    baseDao3 = inHouseIMContactDaoKWHzl;
                    i2 = 0;
                    inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity;
                    if (i2 < i) {
                    }
                } else if (i15 == 1) {
                    j = groupDataConverter$convertMemberEntity$1.J$0;
                    int i16 = groupDataConverter$convertMemberEntity$1.I$2;
                    int i17 = groupDataConverter$convertMemberEntity$1.I$1;
                    int i18 = groupDataConverter$convertMemberEntity$1.I$0;
                    boolean z6 = groupDataConverter$convertMemberEntity$1.Z$0;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$7;
                    Ref.LongRef longRef11 = (Ref.LongRef) groupDataConverter$convertMemberEntity$1.L$6;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$5;
                    objectRef = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$4;
                    Ref.LongRef longRef12 = (Ref.LongRef) groupDataConverter$convertMemberEntity$1.L$3;
                    BaseDao baseDao8 = (BaseDao) groupDataConverter$convertMemberEntity$1.L$2;
                    java.lang.String str23 = (java.lang.String) groupDataConverter$convertMemberEntity$1.L$1;
                    InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity7 = (InHouseIMGroupMemberEntity) groupDataConverter$convertMemberEntity$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef6 = longRef12;
                        groupDataConverter$convertMemberEntity$13 = groupDataConverter$convertMemberEntity$1;
                        objectRef4 = objectRef11;
                        str3 = "Database Operation failed after ";
                        z3 = z6;
                        i3 = i18;
                        i4 = i17;
                        str = str23;
                        objectRef2 = objectRef;
                        str6 = " attempts";
                        objectRef3 = objectRef10;
                        baseDao5 = baseDao8;
                        str2 = "not open";
                        longRef5 = longRef11;
                        inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity7;
                        i5 = i16;
                        r02 = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        longRef3 = longRef12;
                        inHouseIMGroupMemberEntity3 = inHouseIMGroupMemberEntity7;
                        z2 = z6;
                        str3 = "Database Operation failed after ";
                        i5 = i16;
                        baseDao4 = baseDao8;
                        i3 = i18;
                        str2 = "not open";
                        i4 = i17;
                        str4 = " attempts";
                        str5 = str23;
                        r0 = e6;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i5 < i3 - 1) {
                        }
                        int i19 = i4 + i;
                        groupDataConverter$convertMemberEntity$12 = groupDataConverter$convertMemberEntity$1;
                        i = i;
                        i2 = i19;
                        longRef = longRef;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r6 = longRef12;
                        r2 = baseDao8;
                        C44159sFm.EZpvd(r2, r6.element);
                        throw th;
                    }
                    objectRef3.element = r02;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    java.lang.Object obj2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao5, longRef6.element);
                    ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) obj2;
                    if (contactWithPhoneData == null) {
                    }
                    if (remarkName == null) {
                    }
                    if (contactWithPhoneData == null) {
                    }
                    if (phoneName != null) {
                    }
                    if (!z3) {
                    }
                } else {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            long j2 = groupDataConverter$convertMemberEntity$1.J$0;
                            i8 = groupDataConverter$convertMemberEntity$1.I$2;
                            int i20 = groupDataConverter$convertMemberEntity$1.I$1;
                            int i21 = groupDataConverter$convertMemberEntity$1.I$0;
                            boolean z7 = groupDataConverter$convertMemberEntity$1.Z$0;
                            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$8;
                            Ref.LongRef longRef13 = (Ref.LongRef) groupDataConverter$convertMemberEntity$1.L$7;
                            Ref.ObjectRef objectRef13 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$6;
                            Ref.ObjectRef objectRef14 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$5;
                            Ref.LongRef longRef14 = (Ref.LongRef) groupDataConverter$convertMemberEntity$1.L$4;
                            BaseDao baseDao9 = (BaseDao) groupDataConverter$convertMemberEntity$1.L$3;
                            java.lang.String str24 = (java.lang.String) groupDataConverter$convertMemberEntity$1.L$2;
                            java.lang.String str25 = (java.lang.String) groupDataConverter$convertMemberEntity$1.L$1;
                            InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity8 = (InHouseIMGroupMemberEntity) groupDataConverter$convertMemberEntity$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj);
                                str18 = "not open";
                                objectRef8 = objectRef14;
                                groupDataConverter$convertMemberEntity$14 = groupDataConverter$convertMemberEntity$1;
                                objectRef9 = objectRef13;
                                objectRef7 = objectRef12;
                                i12 = i20;
                                str10 = str24;
                                str9 = str25;
                                inHouseIMGroupMemberEntity5 = inHouseIMGroupMemberEntity8;
                                longRef10 = longRef14;
                                baseDao7 = baseDao9;
                                str17 = "Database Operation failed after ";
                                str16 = " attempts";
                                jNanoTime = j2;
                                i11 = i21;
                                i13 = i8;
                                longRef9 = longRef13;
                                z5 = z7;
                                r04 = obj;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                                inHouseIMGroupMemberEntity6 = inHouseIMGroupMemberEntity8;
                                i10 = i20;
                                i9 = i21;
                                z5 = z7;
                                longRef8 = longRef14;
                                baseDao6 = baseDao9;
                                str15 = str24;
                                str14 = str25;
                                objectRef6 = objectRef14;
                                str13 = "Database Operation failed after ";
                                r03 = e9;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r03;
                                if (i8 >= i9 - 1) {
                                }
                            } catch (java.lang.IllegalStateException e10) {
                                e4 = e10;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e11) {
                                e3 = e11;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                r82 = longRef14;
                                baseDao2 = baseDao9;
                                C44159sFm.EZpvd(baseDao2, r82.element);
                                throw th;
                            }
                            objectRef7.element = r04;
                            longRef9.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj3 = objectRef9.element;
                            C44159sFm.EZpvd(baseDao7, longRef10.element);
                            InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = (InHouseIMGroupSettingEntity) obj3;
                            if (inHouseIMGroupSettingEntity == null) {
                            }
                            v2Field = inHouseIMGroupMemberEntity5.getV2Field();
                            if (groupNickName != null) {
                                groupNickName = v2Field;
                                str7 = groupNickName;
                                inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity5;
                                str8 = str10;
                                z4 = z5;
                            }
                            officialTagInfo = inHouseIMGroupMemberEntity4.getOfficialTagInfo();
                            if (officialTagInfo == null) {
                            }
                            OfficialTagInfo officialTagInfo2 = officialTagInfo;
                            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) inHouseIMGroupMemberEntity4.getV3Field())) {
                            }
                            return new GroupMemberInfo(str9, inHouseIMGroupMemberEntity4.getGroupId(), inHouseIMGroupMemberEntity4.getName(), inHouseIMGroupMemberEntity4.getNickName(), str7, inHouseIMGroupMemberEntity4.getAvatar(), z4, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntity4.getRole()), officialTagInfo2, groupMemberExtFieldAEQbTJ != null ? groupMemberExtFieldAEQbTJ.getEnNickName() : null, (java.lang.String) null, str8, inHouseIMGroupMemberEntity4.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
                        }
                        if (i15 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = groupDataConverter$convertMemberEntity$1.I$1;
                        i9 = groupDataConverter$convertMemberEntity$1.I$0;
                        boolean z8 = groupDataConverter$convertMemberEntity$1.Z$0;
                        objectRef6 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$5;
                        longRef8 = (Ref.LongRef) groupDataConverter$convertMemberEntity$1.L$4;
                        baseDao6 = (BaseDao) groupDataConverter$convertMemberEntity$1.L$3;
                        java.lang.String str26 = (java.lang.String) groupDataConverter$convertMemberEntity$1.L$2;
                        str14 = (java.lang.String) groupDataConverter$convertMemberEntity$1.L$1;
                        inHouseIMGroupMemberEntity6 = (InHouseIMGroupMemberEntity) groupDataConverter$convertMemberEntity$1.L$0;
                        C56391yDq.AEQbTJ(obj);
                        str15 = str26;
                        z5 = z8;
                        java.lang.String str27 = str15;
                        baseDao2 = baseDao6;
                        i7 = i9;
                        inHouseIMGroupMemberEntity5 = inHouseIMGroupMemberEntity6;
                        int i22 = 1;
                        boolean z9 = z5;
                        str3 = str20;
                        z3 = z9;
                        str = str14;
                        longRef7 = longRef8;
                        i6 = i10 + i22;
                        objectRef5 = objectRef6;
                        str10 = str27;
                        if (i6 >= i7) {
                            try {
                                try {
                                } catch (java.lang.Exception e12) {
                                    e3 = e12;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    r82 = longRef7;
                                    C44159sFm.EZpvd(baseDao2, r82.element);
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                str9 = str;
                                str16 = str21;
                                str19 = str22;
                                e5 = e13;
                            } catch (java.lang.IllegalStateException e14) {
                                e4 = e14;
                                str19 = str22;
                            }
                            Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                            java.lang.String str28 = str21;
                            str19 = str22;
                            try {
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                    e5 = e15;
                                    str9 = str;
                                    str17 = str3;
                                    str16 = str28;
                                }
                                jNanoTime = java.lang.System.nanoTime();
                                str16 = str28;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                    str9 = str;
                                    e5 = e16;
                                    str17 = str3;
                                    str22 = str19;
                                    inHouseIMGroupMemberEntity6 = inHouseIMGroupMemberEntity5;
                                    i8 = i6;
                                    i9 = i7;
                                    z5 = z3;
                                    str13 = str17;
                                    str21 = str16;
                                    baseDao6 = baseDao2;
                                    str15 = str10;
                                    objectRef6 = objectRef5;
                                    i10 = i8;
                                    longRef8 = longRef7;
                                    str14 = str9;
                                    r03 = e5;
                                    C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                    objectRef6.element = r03;
                                    if (i8 >= i9 - 1) {
                                        java.lang.String str29 = str21;
                                        groupDataConverter$convertMemberEntity$1.L$0 = inHouseIMGroupMemberEntity6;
                                        groupDataConverter$convertMemberEntity$1.L$1 = str14;
                                        groupDataConverter$convertMemberEntity$1.L$2 = str15;
                                        groupDataConverter$convertMemberEntity$1.L$3 = baseDao6;
                                        groupDataConverter$convertMemberEntity$1.L$4 = longRef8;
                                        groupDataConverter$convertMemberEntity$1.L$5 = objectRef6;
                                        groupDataConverter$convertMemberEntity$1.L$6 = null;
                                        groupDataConverter$convertMemberEntity$1.L$7 = null;
                                        groupDataConverter$convertMemberEntity$1.L$8 = null;
                                        groupDataConverter$convertMemberEntity$1.Z$0 = z5;
                                        groupDataConverter$convertMemberEntity$1.I$0 = i9;
                                        groupDataConverter$convertMemberEntity$1.I$1 = i10;
                                        groupDataConverter$convertMemberEntity$1.label = 4;
                                        if (DelayKt.delay(((long) (i8 + 1)) * 50, groupDataConverter$convertMemberEntity$1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        str20 = str13;
                                        str21 = str29;
                                        java.lang.String str272 = str15;
                                        baseDao2 = baseDao6;
                                        i7 = i9;
                                        inHouseIMGroupMemberEntity5 = inHouseIMGroupMemberEntity6;
                                        int i222 = 1;
                                        boolean z92 = z5;
                                        str3 = str20;
                                        z3 = z92;
                                        str = str14;
                                        longRef7 = longRef8;
                                        i6 = i10 + i222;
                                        objectRef5 = objectRef6;
                                        str10 = str272;
                                        if (i6 >= i7) {
                                        }
                                    } else {
                                        str272 = str15;
                                        baseDao2 = baseDao6;
                                        z3 = z5;
                                        str3 = str13;
                                        i7 = i9;
                                        inHouseIMGroupMemberEntity5 = inHouseIMGroupMemberEntity6;
                                        i222 = 1;
                                        str = str14;
                                        longRef7 = longRef8;
                                        i6 = i10 + i222;
                                        objectRef5 = objectRef6;
                                        str10 = str272;
                                        if (i6 >= i7) {
                                        }
                                    }
                                }
                                InHouseIMGroupSettingDao inHouseIMGroupSettingDaoEZpvd = AEQbTJ.EZpvd();
                                str17 = str3;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e17) {
                                    e5 = e17;
                                    str9 = str;
                                }
                                java.lang.String groupId = inHouseIMGroupMemberEntity5.getGroupId();
                                groupDataConverter$convertMemberEntity$1.L$0 = inHouseIMGroupMemberEntity5;
                                groupDataConverter$convertMemberEntity$1.L$1 = str;
                                groupDataConverter$convertMemberEntity$1.L$2 = str10;
                                groupDataConverter$convertMemberEntity$1.L$3 = baseDao2;
                                groupDataConverter$convertMemberEntity$1.L$4 = longRef7;
                                groupDataConverter$convertMemberEntity$1.L$5 = objectRef5;
                                groupDataConverter$convertMemberEntity$1.L$6 = objectRef15;
                                groupDataConverter$convertMemberEntity$1.L$7 = longRef7;
                                groupDataConverter$convertMemberEntity$1.L$8 = objectRef15;
                                groupDataConverter$convertMemberEntity$1.Z$0 = z3;
                                groupDataConverter$convertMemberEntity$1.I$0 = i7;
                                groupDataConverter$convertMemberEntity$1.I$1 = i6;
                                groupDataConverter$convertMemberEntity$1.I$2 = i6;
                                groupDataConverter$convertMemberEntity$1.J$0 = jNanoTime;
                                str9 = str;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e18) {
                                    e5 = e18;
                                    str22 = str19;
                                    inHouseIMGroupMemberEntity6 = inHouseIMGroupMemberEntity5;
                                    i8 = i6;
                                    i9 = i7;
                                    z5 = z3;
                                    str13 = str17;
                                    str21 = str16;
                                    baseDao6 = baseDao2;
                                    str15 = str10;
                                    objectRef6 = objectRef5;
                                    i10 = i8;
                                    longRef8 = longRef7;
                                    str14 = str9;
                                    r03 = e5;
                                    C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                    objectRef6.element = r03;
                                    if (i8 >= i9 - 1) {
                                    }
                                }
                                groupDataConverter$convertMemberEntity$1.label = 3;
                                java.lang.Object settingInfoById = inHouseIMGroupSettingDaoEZpvd.getSettingInfoById(groupId, groupDataConverter$convertMemberEntity$1);
                                if (settingInfoById == objCopydefault) {
                                    return objCopydefault;
                                }
                                str18 = str19;
                                objectRef7 = objectRef15;
                                groupDataConverter$convertMemberEntity$14 = groupDataConverter$convertMemberEntity$1;
                                longRef9 = longRef7;
                                objectRef9 = objectRef7;
                                r04 = settingInfoById;
                                z5 = z3;
                                i11 = i7;
                                i13 = i6;
                                i12 = i13;
                                objectRef8 = objectRef5;
                                baseDao7 = baseDao2;
                                longRef10 = longRef9;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e19) {
                                    groupDataConverter$convertMemberEntity$1 = groupDataConverter$convertMemberEntity$14;
                                    inHouseIMGroupMemberEntity6 = inHouseIMGroupMemberEntity5;
                                    i8 = i13;
                                    i9 = i11;
                                    str22 = str18;
                                    str13 = str17;
                                    str21 = str16;
                                    baseDao6 = baseDao7;
                                    i10 = i12;
                                    str14 = str9;
                                    Ref.ObjectRef objectRef16 = objectRef8;
                                    longRef8 = longRef10;
                                    str15 = str10;
                                    objectRef6 = objectRef16;
                                    r03 = e19;
                                    C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                    objectRef6.element = r03;
                                    if (i8 >= i9 - 1) {
                                    }
                                } catch (java.lang.IllegalStateException e20) {
                                    e4 = e20;
                                    str22 = str18;
                                    message2 = e4.getMessage();
                                    if (message2 == null) {
                                    }
                                    C44159sFm.copydefault(e4);
                                    throw e4;
                                } catch (java.lang.Exception e21) {
                                    e3 = e21;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    r82 = longRef10;
                                    baseDao2 = baseDao7;
                                    C44159sFm.EZpvd(baseDao2, r82.element);
                                    throw th;
                                }
                                objectRef7.element = r04;
                                longRef9.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                                java.lang.Object obj32 = objectRef9.element;
                                C44159sFm.EZpvd(baseDao7, longRef10.element);
                                InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity2 = (InHouseIMGroupSettingEntity) obj32;
                                groupNickName = inHouseIMGroupSettingEntity2 == null ? inHouseIMGroupSettingEntity2.getGroupNickName() : null;
                                v2Field = inHouseIMGroupMemberEntity5.getV2Field();
                                if (groupNickName != null || groupNickName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) groupNickName)) {
                                    groupNickName = v2Field;
                                }
                                str7 = groupNickName;
                                inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity5;
                                str8 = str10;
                                z4 = z5;
                                officialTagInfo = inHouseIMGroupMemberEntity4.getOfficialTagInfo();
                                if (officialTagInfo == null) {
                                    officialTagInfo = C44474sRd.KWHzl.copydefault(inHouseIMGroupMemberEntity4.getV1Field());
                                }
                                OfficialTagInfo officialTagInfo22 = officialTagInfo;
                                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) inHouseIMGroupMemberEntity4.getV3Field())) {
                                    groupMemberExtFieldAEQbTJ = GroupMemberExtField.Companion.copydefault(inHouseIMGroupMemberEntity4.getEnNickname());
                                } else {
                                    groupMemberExtFieldAEQbTJ = GroupMemberExtField.Companion.AEQbTJ(inHouseIMGroupMemberEntity4.getV3Field());
                                }
                                return new GroupMemberInfo(str9, inHouseIMGroupMemberEntity4.getGroupId(), inHouseIMGroupMemberEntity4.getName(), inHouseIMGroupMemberEntity4.getNickName(), str7, inHouseIMGroupMemberEntity4.getAvatar(), z4, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntity4.getRole()), officialTagInfo22, groupMemberExtFieldAEQbTJ != null ? groupMemberExtFieldAEQbTJ.getEnNickName() : null, (java.lang.String) null, str8, inHouseIMGroupMemberEntity4.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
                            } catch (java.lang.IllegalStateException e22) {
                                e4 = e22;
                                str22 = str19;
                                message2 = e4.getMessage();
                                if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str22, false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e4);
                                    throw e4;
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            }
                        }
                        java.lang.String str30 = str21;
                        java.lang.String str31 = str3;
                        C44159sFm.EZpvd(baseDao2, longRef7.element);
                        java.lang.Exception exc = (java.lang.Exception) objectRef5.element;
                        if (exc == null) {
                            exc = new java.lang.Exception(str31 + i7 + str30);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    int i23 = groupDataConverter$convertMemberEntity$1.I$1;
                    int i24 = groupDataConverter$convertMemberEntity$1.I$0;
                    boolean z10 = groupDataConverter$convertMemberEntity$1.Z$0;
                    Ref.ObjectRef objectRef17 = (Ref.ObjectRef) groupDataConverter$convertMemberEntity$1.L$4;
                    Ref.LongRef longRef15 = (Ref.LongRef) groupDataConverter$convertMemberEntity$1.L$3;
                    BaseDao baseDao10 = (BaseDao) groupDataConverter$convertMemberEntity$1.L$2;
                    java.lang.String str32 = (java.lang.String) groupDataConverter$convertMemberEntity$1.L$1;
                    InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity9 = (InHouseIMGroupMemberEntity) groupDataConverter$convertMemberEntity$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    GroupDataConverter$convertMemberEntity$1 groupDataConverter$convertMemberEntity$15 = groupDataConverter$convertMemberEntity$1;
                    objectRef = objectRef17;
                    str = str32;
                    inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity9;
                    int i25 = 1;
                    Ref.LongRef longRef16 = longRef15;
                    i4 = i23;
                    z = z10;
                    baseDao3 = baseDao10;
                    int i192 = i4 + i25;
                    groupDataConverter$convertMemberEntity$12 = groupDataConverter$convertMemberEntity$15;
                    i = i24;
                    i2 = i192;
                    longRef = longRef16;
                    if (i2 < i) {
                        try {
                            try {
                                try {
                                } catch (java.lang.Exception e23) {
                                    e = e23;
                                    longRef2 = longRef;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    r2 = baseDao3;
                                    r6 = longRef;
                                    C44159sFm.EZpvd(r2, r6.element);
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e24) {
                                inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity2;
                                str11 = str;
                                str12 = str22;
                                sQLiteDatabaseLockedException = e24;
                            }
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e25) {
                                inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity2;
                                str11 = str;
                                str12 = str22;
                                sQLiteDatabaseLockedException = e25;
                            }
                            Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                            str12 = str22;
                            try {
                                try {
                                } catch (java.lang.IllegalStateException e26) {
                                    e2 = e26;
                                    str22 = str12;
                                    message = e2.getMessage();
                                    if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str22, false, 2, (java.lang.Object) null)) {
                                        C44159sFm.OLrzqt(e2);
                                        throw e2;
                                    }
                                    C44159sFm.copydefault(e2);
                                    throw e2;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e27) {
                                inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity2;
                                str11 = str;
                                sQLiteDatabaseLockedException = e27;
                            }
                            long jNanoTime2 = java.lang.System.nanoTime();
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e28) {
                                e = e28;
                                inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity2;
                            }
                            InHouseIMContactDao inHouseIMContactDaoKWHzl2 = AEQbTJ.KWHzl();
                            groupDataConverter$convertMemberEntity$12.L$0 = inHouseIMGroupMemberEntity2;
                            groupDataConverter$convertMemberEntity$12.L$1 = str;
                            groupDataConverter$convertMemberEntity$12.L$2 = baseDao3;
                            groupDataConverter$convertMemberEntity$12.L$3 = longRef;
                            groupDataConverter$convertMemberEntity$12.L$4 = objectRef;
                            groupDataConverter$convertMemberEntity$12.L$5 = objectRef18;
                            groupDataConverter$convertMemberEntity$12.L$6 = longRef;
                            groupDataConverter$convertMemberEntity$12.L$7 = objectRef18;
                            groupDataConverter$convertMemberEntity$12.Z$0 = z;
                            groupDataConverter$convertMemberEntity$12.I$0 = i;
                            groupDataConverter$convertMemberEntity$12.I$1 = i2;
                            groupDataConverter$convertMemberEntity$12.I$2 = i2;
                            groupDataConverter$convertMemberEntity$12.J$0 = jNanoTime2;
                            inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity2;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e29) {
                                try {
                                    e = e29;
                                    str11 = str;
                                    sQLiteDatabaseLockedException = e;
                                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                    objectRef.element = r0;
                                    if (i5 < i3 - 1) {
                                        longRef4 = longRef3;
                                        long j3 = i5 + 1;
                                        try {
                                            groupDataConverter$convertMemberEntity$1.L$0 = inHouseIMGroupMemberEntity3;
                                            groupDataConverter$convertMemberEntity$1.L$1 = str5;
                                            groupDataConverter$convertMemberEntity$1.L$2 = baseDao4;
                                            groupDataConverter$convertMemberEntity$1.L$3 = longRef4;
                                            groupDataConverter$convertMemberEntity$1.L$4 = objectRef;
                                            groupDataConverter$convertMemberEntity$1.L$5 = null;
                                            groupDataConverter$convertMemberEntity$1.L$6 = null;
                                            groupDataConverter$convertMemberEntity$1.L$7 = null;
                                            groupDataConverter$convertMemberEntity$1.Z$0 = z2;
                                            groupDataConverter$convertMemberEntity$1.I$0 = i3;
                                            groupDataConverter$convertMemberEntity$1.I$1 = i4;
                                            groupDataConverter$convertMemberEntity$1.label = 2;
                                            if (DelayKt.delay(j3 * 50, groupDataConverter$convertMemberEntity$1) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            groupDataConverter$convertMemberEntity$15 = groupDataConverter$convertMemberEntity$1;
                                            inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity3;
                                            longRef16 = longRef4;
                                            i24 = i3;
                                            str = str5;
                                            str21 = str4;
                                            str22 = str2;
                                            i25 = 1;
                                            z = z2;
                                            baseDao3 = baseDao4;
                                            str20 = str3;
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                            r2 = baseDao4;
                                            r6 = longRef4;
                                            C44159sFm.EZpvd(r2, r6.element);
                                            throw th;
                                        }
                                    } else {
                                        groupDataConverter$convertMemberEntity$15 = groupDataConverter$convertMemberEntity$1;
                                        inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity3;
                                        longRef16 = longRef3;
                                        i24 = i3;
                                        str = str5;
                                        str21 = str4;
                                        str22 = str2;
                                        i25 = 1;
                                        z = z2;
                                        baseDao3 = baseDao4;
                                        str20 = str3;
                                    }
                                    int i1922 = i4 + i25;
                                    groupDataConverter$convertMemberEntity$12 = groupDataConverter$convertMemberEntity$15;
                                    i = i24;
                                    i2 = i1922;
                                    longRef = longRef16;
                                    if (i2 < i) {
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    longRef4 = longRef3;
                                }
                                str2 = str12;
                                str3 = str20;
                                str4 = str21;
                                str5 = str11;
                                groupDataConverter$convertMemberEntity$1 = groupDataConverter$convertMemberEntity$12;
                                i5 = i2;
                                baseDao4 = baseDao3;
                                z2 = z;
                                i3 = i;
                                i4 = i5;
                                inHouseIMGroupMemberEntity3 = inHouseIMGroupMemberEntity4;
                                r0 = sQLiteDatabaseLockedException;
                                longRef3 = longRef;
                            }
                            groupDataConverter$convertMemberEntity$12.label = 1;
                            java.lang.Object contactById = inHouseIMContactDaoKWHzl2.getContactById(str, groupDataConverter$convertMemberEntity$12);
                            if (contactById == objCopydefault) {
                                return objCopydefault;
                            }
                            str2 = str12;
                            groupDataConverter$convertMemberEntity$13 = groupDataConverter$convertMemberEntity$12;
                            i5 = i2;
                            objectRef4 = objectRef18;
                            objectRef2 = objectRef;
                            str6 = str21;
                            objectRef3 = objectRef4;
                            baseDao5 = baseDao3;
                            j = jNanoTime2;
                            longRef5 = longRef;
                            str3 = str20;
                            z3 = z;
                            i3 = i;
                            i4 = i5;
                            r02 = contactById;
                            longRef6 = longRef;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e30) {
                                groupDataConverter$convertMemberEntity$1 = groupDataConverter$convertMemberEntity$13;
                                str5 = str;
                                z2 = z3;
                                str4 = str6;
                                inHouseIMGroupMemberEntity3 = inHouseIMGroupMemberEntity4;
                                objectRef = objectRef2;
                                baseDao4 = baseDao5;
                                r0 = e30;
                                longRef3 = longRef6;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i5 < i3 - 1) {
                                }
                                int i19222 = i4 + i25;
                                groupDataConverter$convertMemberEntity$12 = groupDataConverter$convertMemberEntity$15;
                                i = i24;
                                i2 = i19222;
                                longRef = longRef16;
                                if (i2 < i) {
                                }
                            } catch (java.lang.IllegalStateException e31) {
                                e2 = e31;
                                str22 = str2;
                                message = e2.getMessage();
                                if (message == null) {
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e32) {
                                e = e32;
                                longRef2 = longRef6;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                r8 = baseDao5;
                                r7 = longRef6;
                                r6 = r7;
                                r2 = r8;
                                C44159sFm.EZpvd(r2, r6.element);
                                throw th;
                            }
                            objectRef3.element = r02;
                            longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                            java.lang.Object obj22 = objectRef4.element;
                            C44159sFm.EZpvd(baseDao5, longRef6.element);
                            ContactWithPhoneData contactWithPhoneData2 = (ContactWithPhoneData) obj22;
                            remarkName = contactWithPhoneData2 == null ? contactWithPhoneData2.getRemarkName() : null;
                            if (remarkName == null) {
                                remarkName = "";
                            }
                            java.lang.String phoneName = contactWithPhoneData2 == null ? contactWithPhoneData2.getPhoneName() : null;
                            java.lang.String str33 = phoneName != null ? phoneName : "";
                            if (!z3) {
                                InHouseIMGroupSettingDao inHouseIMGroupSettingDaoEZpvd2 = AEQbTJ.EZpvd();
                                Ref.LongRef longRef17 = new Ref.LongRef();
                                objectRef5 = new Ref.ObjectRef();
                                longRef7 = longRef17;
                                str10 = str33;
                                str21 = str6;
                                inHouseIMGroupMemberEntity5 = inHouseIMGroupMemberEntity4;
                                str22 = str2;
                                i6 = 0;
                                i7 = 3;
                                groupDataConverter$convertMemberEntity$1 = groupDataConverter$convertMemberEntity$13;
                                baseDao2 = inHouseIMGroupSettingDaoEZpvd2;
                                if (i6 >= i7) {
                                }
                            } else {
                                java.lang.String str34 = str;
                                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) remarkName))) {
                                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str33)) {
                                        remarkName = str33;
                                    } else {
                                        remarkName = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) C44157sFk.KWHzl(inHouseIMGroupMemberEntity4)) ^ true ? C44157sFk.KWHzl(inHouseIMGroupMemberEntity4) : inHouseIMGroupMemberEntity4.getV2Field();
                                    }
                                }
                                str7 = remarkName;
                                str8 = str33;
                                str9 = str34;
                                z4 = z3;
                                officialTagInfo = inHouseIMGroupMemberEntity4.getOfficialTagInfo();
                                if (officialTagInfo == null) {
                                }
                                OfficialTagInfo officialTagInfo222 = officialTagInfo;
                                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) inHouseIMGroupMemberEntity4.getV3Field())) {
                                }
                                return new GroupMemberInfo(str9, inHouseIMGroupMemberEntity4.getGroupId(), inHouseIMGroupMemberEntity4.getName(), inHouseIMGroupMemberEntity4.getNickName(), str7, inHouseIMGroupMemberEntity4.getAvatar(), z4, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntity4.getRole()), officialTagInfo222, groupMemberExtFieldAEQbTJ != null ? groupMemberExtFieldAEQbTJ.getEnNickName() : null, (java.lang.String) null, str8, inHouseIMGroupMemberEntity4.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
                            }
                        } catch (java.lang.IllegalStateException e33) {
                            e2 = e33;
                            str12 = str22;
                        }
                    } else {
                        C44159sFm.EZpvd(baseDao3, longRef.element);
                        java.lang.Exception exc2 = (java.lang.Exception) objectRef.element;
                        if (exc2 == null) {
                            exc2 = new java.lang.Exception(str20 + i + str21);
                        }
                        C44159sFm.OLrzqt(exc2);
                        throw exc2;
                    }
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x01b1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0226: MOVE (r8 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:102:0x0226 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0227: MOVE (r7 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:102:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0 A[Catch: all -> 0x0055, TryCatch #4 {all -> 0x0055, blocks: (B:13:0x004c, B:48:0x010d, B:50:0x013f, B:79:0x01b5, B:80:0x01b8, B:82:0x01ba, B:84:0x01c0, B:86:0x01cc, B:87:0x01cf, B:88:0x01d0, B:89:0x01d3, B:93:0x01de, B:95:0x01eb), top: B:135:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #4 {all -> 0x0055, blocks: (B:13:0x004c, B:48:0x010d, B:50:0x013f, B:79:0x01b5, B:80:0x01b8, B:82:0x01ba, B:84:0x01c0, B:86:0x01cc, B:87:0x01cf, B:88:0x01d0, B:89:0x01d3, B:93:0x01de, B:95:0x01eb), top: B:135:0x0028 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x021a -> B:99:0x0217). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0213 -> B:98:0x0216). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(GroupMemberWithDetails groupMemberWithDetails, @NotNull Continuation<? super GroupMemberInfo> continuation) throws java.lang.Exception {
        GroupDataConverter$convertMemberEntityNew$1 groupDataConverter$convertMemberEntityNew$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntityEZpvd;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        java.lang.String str4;
        java.lang.String str5;
        Ref.ObjectRef objectRef;
        BaseDao baseDao3;
        Ref.LongRef longRef3;
        int i;
        int i2;
        boolean z2;
        java.lang.String str6;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str7;
        java.lang.String str8;
        boolean z3;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity2;
        int i3;
        ?? r0;
        OfficialTagInfo officialTagInfo;
        java.lang.String str9;
        java.lang.String enNickName;
        GroupDataConverter$convertMemberEntityNew$1 groupDataConverter$convertMemberEntityNew$12;
        java.lang.String str10;
        long jNanoTime;
        Ref.ObjectRef objectRef2;
        int i4;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        T t;
        java.lang.String groupNickName;
        java.lang.String v2Field;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity4;
        if (continuation instanceof GroupDataConverter$convertMemberEntityNew$1) {
            groupDataConverter$convertMemberEntityNew$1 = (GroupDataConverter$convertMemberEntityNew$1) continuation;
            int i5 = groupDataConverter$convertMemberEntityNew$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                groupDataConverter$convertMemberEntityNew$1.label = i5 - Integer.MIN_VALUE;
            } else {
                groupDataConverter$convertMemberEntityNew$1 = new GroupDataConverter$convertMemberEntityNew$1(this, continuation);
            }
        }
        java.lang.Object obj = groupDataConverter$convertMemberEntityNew$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = groupDataConverter$convertMemberEntityNew$1.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    long j = groupDataConverter$convertMemberEntityNew$1.J$0;
                    i2 = groupDataConverter$convertMemberEntityNew$1.I$2;
                    i4 = groupDataConverter$convertMemberEntityNew$1.I$1;
                    i = groupDataConverter$convertMemberEntityNew$1.I$0;
                    boolean z4 = groupDataConverter$convertMemberEntityNew$1.Z$0;
                    objectRef2 = (Ref.ObjectRef) groupDataConverter$convertMemberEntityNew$1.L$8;
                    Ref.LongRef longRef5 = (Ref.LongRef) groupDataConverter$convertMemberEntityNew$1.L$7;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) groupDataConverter$convertMemberEntityNew$1.L$6;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) groupDataConverter$convertMemberEntityNew$1.L$5;
                    longRef2 = (Ref.LongRef) groupDataConverter$convertMemberEntityNew$1.L$4;
                    baseDao2 = (BaseDao) groupDataConverter$convertMemberEntityNew$1.L$3;
                    java.lang.String str11 = (java.lang.String) groupDataConverter$convertMemberEntityNew$1.L$2;
                    str10 = (java.lang.String) groupDataConverter$convertMemberEntityNew$1.L$1;
                    InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity5 = (InHouseIMGroupMemberEntity) groupDataConverter$convertMemberEntityNew$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        str = str11;
                        groupDataConverter$convertMemberEntityNew$12 = groupDataConverter$convertMemberEntityNew$1;
                        longRef4 = longRef5;
                        inHouseIMGroupMemberEntity3 = inHouseIMGroupMemberEntity5;
                        z2 = z4;
                        objectRef3 = objectRef4;
                        jNanoTime = j;
                        longRef3 = longRef2;
                        objectRef = objectRef5;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str8 = str11;
                        inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity5;
                        baseDao3 = baseDao2;
                        i3 = i4;
                        z3 = z4;
                        str7 = str10;
                        longRef3 = longRef2;
                        objectRef = objectRef5;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i2 < i - 1) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef2.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = (InHouseIMGroupSettingEntity) t2;
                    if (inHouseIMGroupSettingEntity == null) {
                    }
                    v2Field = inHouseIMGroupMemberEntity3.getV2Field();
                    if (groupNickName != null) {
                        groupNickName = v2Field;
                        str4 = groupNickName;
                        inHouseIMGroupMemberEntityEZpvd = inHouseIMGroupMemberEntity3;
                        z = z2;
                        str5 = str;
                        str3 = str10;
                        str2 = null;
                    }
                    officialTagInfo = inHouseIMGroupMemberEntityEZpvd.getOfficialTagInfo();
                    if (officialTagInfo == null) {
                    }
                    OfficialTagInfo officialTagInfo2 = officialTagInfo;
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) inHouseIMGroupMemberEntityEZpvd.getV3Field())) {
                    }
                    str9 = enNickName;
                    return new GroupMemberInfo(str3, inHouseIMGroupMemberEntityEZpvd.getGroupId(), inHouseIMGroupMemberEntityEZpvd.getName(), inHouseIMGroupMemberEntityEZpvd.getNickName(), str4, inHouseIMGroupMemberEntityEZpvd.getAvatar(), z, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntityEZpvd.getRole()), officialTagInfo2, str9, (java.lang.String) null, str5, inHouseIMGroupMemberEntityEZpvd.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
                }
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = groupDataConverter$convertMemberEntityNew$1.I$1;
                int i7 = groupDataConverter$convertMemberEntityNew$1.I$0;
                z3 = groupDataConverter$convertMemberEntityNew$1.Z$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) groupDataConverter$convertMemberEntityNew$1.L$5;
                longRef3 = (Ref.LongRef) groupDataConverter$convertMemberEntityNew$1.L$4;
                baseDao3 = (BaseDao) groupDataConverter$convertMemberEntityNew$1.L$3;
                str8 = (java.lang.String) groupDataConverter$convertMemberEntityNew$1.L$2;
                str7 = (java.lang.String) groupDataConverter$convertMemberEntityNew$1.L$1;
                inHouseIMGroupMemberEntity2 = (InHouseIMGroupMemberEntity) groupDataConverter$convertMemberEntityNew$1.L$0;
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef objectRef7 = objectRef6;
                i = i7;
                objectRef = objectRef7;
                str = str8;
                i2 = i3 + 1;
                inHouseIMGroupMemberEntity = inHouseIMGroupMemberEntity2;
                z2 = z3;
                str6 = str7;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        e = e8;
                        inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity;
                    }
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMGroupSettingDao inHouseIMGroupSettingDaoEZpvd = AEQbTJ.EZpvd();
                    java.lang.String groupId = inHouseIMGroupMemberEntity.getGroupId();
                    groupDataConverter$convertMemberEntityNew$1.L$0 = inHouseIMGroupMemberEntity;
                    groupDataConverter$convertMemberEntityNew$1.L$1 = str6;
                    groupDataConverter$convertMemberEntityNew$1.L$2 = str;
                    groupDataConverter$convertMemberEntityNew$1.L$3 = baseDao3;
                    groupDataConverter$convertMemberEntityNew$1.L$4 = longRef3;
                    groupDataConverter$convertMemberEntityNew$1.L$5 = objectRef;
                    groupDataConverter$convertMemberEntityNew$1.L$6 = objectRef8;
                    groupDataConverter$convertMemberEntityNew$1.L$7 = longRef3;
                    groupDataConverter$convertMemberEntityNew$1.L$8 = objectRef8;
                    groupDataConverter$convertMemberEntityNew$1.Z$0 = z2;
                    groupDataConverter$convertMemberEntityNew$1.I$0 = i;
                    groupDataConverter$convertMemberEntityNew$1.I$1 = i2;
                    groupDataConverter$convertMemberEntityNew$1.I$2 = i2;
                    groupDataConverter$convertMemberEntityNew$1.J$0 = jNanoTime;
                    inHouseIMGroupMemberEntity4 = inHouseIMGroupMemberEntity;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        e = e9;
                        str7 = str6;
                        z3 = z2;
                        str8 = str;
                        i3 = i2;
                        inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity4;
                        r0 = e;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i2 < i - 1) {
                            objectRef7 = objectRef;
                            groupDataConverter$convertMemberEntityNew$1.L$0 = inHouseIMGroupMemberEntity2;
                            groupDataConverter$convertMemberEntityNew$1.L$1 = str7;
                            groupDataConverter$convertMemberEntityNew$1.L$2 = str8;
                            groupDataConverter$convertMemberEntityNew$1.L$3 = baseDao3;
                            groupDataConverter$convertMemberEntityNew$1.L$4 = longRef3;
                            groupDataConverter$convertMemberEntityNew$1.L$5 = objectRef7;
                            groupDataConverter$convertMemberEntityNew$1.L$6 = null;
                            groupDataConverter$convertMemberEntityNew$1.L$7 = null;
                            groupDataConverter$convertMemberEntityNew$1.L$8 = null;
                            groupDataConverter$convertMemberEntityNew$1.Z$0 = z3;
                            groupDataConverter$convertMemberEntityNew$1.I$0 = i;
                            groupDataConverter$convertMemberEntityNew$1.I$1 = i3;
                            groupDataConverter$convertMemberEntityNew$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, groupDataConverter$convertMemberEntityNew$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            objectRef = objectRef7;
                            str = str8;
                            i2 = i3 + 1;
                            inHouseIMGroupMemberEntity = inHouseIMGroupMemberEntity2;
                            z2 = z3;
                            str6 = str7;
                            if (i2 >= i) {
                            }
                        } else {
                            str = str8;
                            i2 = i3 + 1;
                            inHouseIMGroupMemberEntity = inHouseIMGroupMemberEntity2;
                            z2 = z3;
                            str6 = str7;
                            if (i2 >= i) {
                            }
                        }
                    }
                    groupDataConverter$convertMemberEntityNew$1.label = 1;
                    java.lang.Object settingInfoById = inHouseIMGroupSettingDaoEZpvd.getSettingInfoById(groupId, groupDataConverter$convertMemberEntityNew$1);
                    if (settingInfoById == objCopydefault) {
                        return objCopydefault;
                    }
                    str10 = str6;
                    i4 = i2;
                    baseDao2 = baseDao3;
                    inHouseIMGroupMemberEntity3 = inHouseIMGroupMemberEntity4;
                    objectRef2 = objectRef8;
                    groupDataConverter$convertMemberEntityNew$12 = groupDataConverter$convertMemberEntityNew$1;
                    longRef4 = longRef3;
                    t = settingInfoById;
                    objectRef3 = objectRef2;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        groupDataConverter$convertMemberEntityNew$1 = groupDataConverter$convertMemberEntityNew$12;
                        str8 = str;
                        baseDao3 = baseDao2;
                        str7 = str10;
                        boolean z5 = z2;
                        inHouseIMGroupMemberEntity2 = inHouseIMGroupMemberEntity3;
                        i3 = i4;
                        z3 = z5;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i2 < i - 1) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef2.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity2 = (InHouseIMGroupSettingEntity) t22;
                    groupNickName = inHouseIMGroupSettingEntity2 == null ? inHouseIMGroupSettingEntity2.getGroupNickName() : null;
                    v2Field = inHouseIMGroupMemberEntity3.getV2Field();
                    if (groupNickName != null || groupNickName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) groupNickName)) {
                        groupNickName = v2Field;
                    }
                    str4 = groupNickName;
                    inHouseIMGroupMemberEntityEZpvd = inHouseIMGroupMemberEntity3;
                    z = z2;
                    str5 = str;
                    str3 = str10;
                    str2 = null;
                    officialTagInfo = inHouseIMGroupMemberEntityEZpvd.getOfficialTagInfo();
                    if (officialTagInfo == null) {
                        officialTagInfo = C44474sRd.KWHzl.copydefault(inHouseIMGroupMemberEntityEZpvd.getV1Field());
                    }
                    OfficialTagInfo officialTagInfo22 = officialTagInfo;
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) inHouseIMGroupMemberEntityEZpvd.getV3Field())) {
                        enNickName = inHouseIMGroupMemberEntityEZpvd.getEnNickname();
                    } else {
                        GroupMemberExtField groupMemberExtFieldAEQbTJ = GroupMemberExtField.Companion.AEQbTJ(inHouseIMGroupMemberEntityEZpvd.getV3Field());
                        if (groupMemberExtFieldAEQbTJ == null) {
                            str9 = str2;
                            return new GroupMemberInfo(str3, inHouseIMGroupMemberEntityEZpvd.getGroupId(), inHouseIMGroupMemberEntityEZpvd.getName(), inHouseIMGroupMemberEntityEZpvd.getNickName(), str4, inHouseIMGroupMemberEntityEZpvd.getAvatar(), z, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntityEZpvd.getRole()), officialTagInfo22, str9, (java.lang.String) null, str5, inHouseIMGroupMemberEntityEZpvd.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
                        }
                        enNickName = groupMemberExtFieldAEQbTJ.getEnNickName();
                    }
                    str9 = enNickName;
                    return new GroupMemberInfo(str3, inHouseIMGroupMemberEntityEZpvd.getGroupId(), inHouseIMGroupMemberEntityEZpvd.getName(), inHouseIMGroupMemberEntityEZpvd.getNickName(), str4, inHouseIMGroupMemberEntityEZpvd.getAvatar(), z, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntityEZpvd.getRole()), officialTagInfo22, str9, (java.lang.String) null, str5, inHouseIMGroupMemberEntityEZpvd.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            if ((groupMemberWithDetails != null ? groupMemberWithDetails.EZpvd() : null) == null) {
                return null;
            }
            inHouseIMGroupMemberEntityEZpvd = groupMemberWithDetails.EZpvd();
            java.lang.String memberId = inHouseIMGroupMemberEntityEZpvd.getMemberId();
            boolean zKWHzl = C44157sFk.KWHzl(memberId);
            java.lang.String strOLrzqt = groupMemberWithDetails.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            java.lang.String strCopydefault = groupMemberWithDetails.copydefault();
            str = strCopydefault != null ? strCopydefault : "";
            java.lang.String strKWHzl = C44157sFk.KWHzl(inHouseIMGroupMemberEntityEZpvd);
            if (zKWHzl) {
                InHouseIMGroupSettingDao inHouseIMGroupSettingDaoEZpvd2 = EZpvd();
                Ref.LongRef longRef6 = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                baseDao3 = inHouseIMGroupSettingDaoEZpvd2;
                longRef3 = longRef6;
                i = 3;
                i2 = 0;
                z2 = zKWHzl;
                str6 = memberId;
                inHouseIMGroupMemberEntity = inHouseIMGroupMemberEntityEZpvd;
                if (i2 >= i) {
                }
            } else {
                str2 = null;
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                    str3 = memberId;
                    z = zKWHzl;
                    str4 = strOLrzqt;
                    str5 = str;
                } else if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                    str3 = memberId;
                    z = zKWHzl;
                    str4 = str;
                    str5 = str4;
                } else if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                    str3 = memberId;
                    z = zKWHzl;
                    str5 = str;
                    str4 = strKWHzl;
                } else {
                    strOLrzqt = inHouseIMGroupMemberEntityEZpvd.getV2Field();
                    str3 = memberId;
                    z = zKWHzl;
                    str4 = strOLrzqt;
                    str5 = str;
                }
                officialTagInfo = inHouseIMGroupMemberEntityEZpvd.getOfficialTagInfo();
                if (officialTagInfo == null) {
                }
                OfficialTagInfo officialTagInfo222 = officialTagInfo;
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) inHouseIMGroupMemberEntityEZpvd.getV3Field())) {
                }
                str9 = enNickName;
                return new GroupMemberInfo(str3, inHouseIMGroupMemberEntityEZpvd.getGroupId(), inHouseIMGroupMemberEntityEZpvd.getName(), inHouseIMGroupMemberEntityEZpvd.getNickName(), str4, inHouseIMGroupMemberEntityEZpvd.getAvatar(), z, GroupRole.Companion.KWHzl(inHouseIMGroupMemberEntityEZpvd.getRole()), officialTagInfo222, str9, (java.lang.String) null, str5, inHouseIMGroupMemberEntityEZpvd.getPaidGroupMemberStatus(), 1024, (DefaultConstructorMarker) null);
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    public final GroupUserSettingInfo OLrzqt(InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity) {
        if (inHouseIMGroupSettingEntity == null) {
            return null;
        }
        java.lang.String string = inHouseIMGroupSettingEntity.getGroupId().toString();
        java.lang.String groupNickName = inHouseIMGroupSettingEntity.getGroupNickName();
        java.lang.String str = groupNickName == null ? "" : groupNickName;
        java.lang.String userNickName = inHouseIMGroupSettingEntity.getUserNickName();
        return new GroupUserSettingInfo(string, str, userNickName == null ? "" : userNickName, inHouseIMGroupSettingEntity.getUserEnNickName(), GroupRole.Companion.KWHzl(inHouseIMGroupSettingEntity.getRole()), inHouseIMGroupSettingEntity.getNoDisturbStatus() == 1, inHouseIMGroupSettingEntity.getTopStatus() == 1, AffiliateUserType.COMMON_USER);
    }

    /* JADX DEBUG: Duplicate block (B:250:0x0691) to fix multi-entry loop: BACK_EDGE: B:250:0x0691 -> B:251:0x069c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:111:0x0411 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:152:0x04e4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:160:0x0504 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:168:0x0510 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:213:0x0601 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:295:0x069c */
    /* JADX DEBUG: Type inference failed for r0v118. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v133. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v31. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v50. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v77. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v92. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r10v22. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r10v39. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r12v7. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x05b1: MOVE (r12 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:197:0x05b1 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x063d: MOVE (r15 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:240:0x063d */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x05b2: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:197:0x05b1 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x063e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:240:0x063d */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0430 A[Catch: all -> 0x005c, TryCatch #45 {all -> 0x005c, blocks: (B:13:0x0057, B:119:0x041f, B:120:0x0422, B:124:0x042a, B:126:0x0430, B:128:0x043a, B:129:0x043d, B:130:0x043e, B:131:0x0441, B:133:0x0454, B:135:0x0461), top: B:266:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0461 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #45 {all -> 0x005c, blocks: (B:13:0x0057, B:119:0x041f, B:120:0x0422, B:124:0x042a, B:126:0x0430, B:128:0x043a, B:129:0x043d, B:130:0x043e, B:131:0x0441, B:133:0x0454, B:135:0x0461), top: B:266:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0526 A[Catch: all -> 0x0106, TryCatch #28 {all -> 0x0106, blocks: (B:29:0x0101, B:170:0x0514, B:171:0x0517, B:176:0x0520, B:178:0x0526, B:180:0x0530, B:181:0x0533, B:182:0x0534, B:183:0x0537, B:188:0x0552, B:190:0x055f), top: B:266:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x055f A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #28 {all -> 0x0106, blocks: (B:29:0x0101, B:170:0x0514, B:171:0x0517, B:176:0x0520, B:178:0x0526, B:180:0x0530, B:181:0x0533, B:182:0x0534, B:183:0x0537, B:188:0x0552, B:190:0x055f), top: B:266:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x062b A[Catch: all -> 0x01c5, TryCatch #26 {all -> 0x01c5, blocks: (B:47:0x01b1, B:226:0x061a, B:227:0x061d, B:232:0x0625, B:234:0x062b, B:236:0x0635, B:237:0x0638, B:238:0x0639, B:239:0x063c), top: B:266:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0660 A[Catch: all -> 0x06a0, TRY_LEAVE, TryCatch #0 {all -> 0x06a0, blocks: (B:244:0x0653, B:246:0x0660), top: B:262:0x0653 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x02ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036a  */
    /* JADX WARN: Type inference failed for: r0v106, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v24, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v34, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r12v36, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27, types: [com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v39, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r7v32, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x048c -> B:139:0x0490). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x049d -> B:141:0x04af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x058a -> B:194:0x058f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x059d -> B:196:0x05ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull InHouseIMGroupEntity inHouseIMGroupEntity, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        GroupDataConverter$saveGroupEntityToDB$1 groupDataConverter$saveGroupEntityToDB$1;
        java.lang.Object obj;
        ?? r12;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        Ref.LongRef longRef3;
        Ref.LongRef longRef4;
        BaseDao baseDao;
        BaseDao baseDao2;
        BaseDao baseDao3;
        Ref.LongRef longRef5;
        sJM sjm;
        BaseDao baseDao4;
        BaseDao baseDao5;
        ?? r8;
        Ref.ObjectRef objectRef;
        java.lang.String str;
        int i;
        int i2;
        java.lang.String str2;
        Ref.LongRef longRef6;
        GroupDataConverter$saveGroupEntityToDB$1 groupDataConverter$saveGroupEntityToDB$12;
        InHouseIMGroupEntity inHouseIMGroupEntity2;
        Ref.LongRef longRef7;
        ?? r82;
        InHouseIMGroupEntity inHouseIMGroupEntity3;
        BaseDao baseDao6;
        sJM sjm2;
        int i3;
        java.lang.String str3;
        BaseDao baseDao7;
        GroupDataConverter$saveGroupEntityToDB$1 groupDataConverter$saveGroupEntityToDB$13;
        Ref.LongRef longRef8;
        Ref.ObjectRef objectRef2;
        int i4;
        java.lang.String str4;
        long jNanoTime;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef9;
        java.lang.String str5;
        Ref.ObjectRef objectRef4;
        java.lang.String message;
        ?? r0;
        GroupDataConverter$saveGroupEntityToDB$1 groupDataConverter$saveGroupEntityToDB$14;
        int i5;
        ?? r20;
        ?? r02;
        InHouseIMGroupEntity inHouseIMGroupEntity4;
        Ref.LongRef longRef10;
        Ref.ObjectRef objectRef5;
        int i6;
        int i7;
        java.lang.String str6;
        InHouseIMGroupEntity inHouseIMGroupEntity5;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        int i8;
        Ref.ObjectRef objectRef6;
        int i9;
        sJM sjm3;
        int i10;
        ?? r5;
        int i11;
        ?? r9;
        BaseDao baseDao8;
        InHouseIMGroupEntity inHouseIMGroupEntity6;
        Ref.LongRef longRef11;
        java.lang.String str7;
        Ref.LongRef longRef12;
        int i12;
        GroupDataConverter$saveGroupEntityToDB$1 groupDataConverter$saveGroupEntityToDB$15;
        Ref.ObjectRef objectRef7;
        int i13;
        Ref.ObjectRef objectRef8;
        java.lang.String str8;
        java.lang.String str9;
        long jNanoTime2;
        Ref.ObjectRef objectRef9;
        BaseDao baseDao9;
        ?? r21;
        ?? r122;
        ?? r123;
        java.lang.String message2;
        ?? r124;
        ?? r03;
        ?? r125;
        ?? r4;
        int i14;
        Ref.ObjectRef objectRef10;
        java.lang.String str10;
        ?? r126;
        ?? r42;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        InHouseIMGroupSettingEntity userSetting;
        InHouseIMGroupSettingDao inHouseIMGroupSettingDao;
        BaseDao baseDao10;
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity;
        Ref.LongRef longRef13;
        int i15;
        int i16;
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity2;
        Ref.ObjectRef objectRef11;
        BaseDao baseDao11;
        ?? r43;
        java.lang.String str11;
        ?? r92;
        ?? r52;
        int i17;
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity3;
        Ref.LongRef longRef14;
        BaseDao baseDao12;
        int i18;
        java.lang.String str12;
        BaseDao baseDao13;
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity4;
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity5;
        InHouseIMGroupSettingDao inHouseIMGroupSettingDao2;
        Ref.ObjectRef objectRef12;
        int i19;
        GroupDataConverter$saveGroupEntityToDB$1 groupDataConverter$saveGroupEntityToDB$16;
        Ref.ObjectRef objectRef13;
        BaseDao baseDao14;
        java.lang.String str13;
        long jNanoTime3;
        Ref.ObjectRef objectRef14;
        Ref.LongRef longRef15;
        java.lang.String message3;
        ?? r04;
        int i20;
        int i21;
        InHouseIMGroupSettingDao inHouseIMGroupSettingDao3;
        java.lang.String str14;
        if (continuation instanceof GroupDataConverter$saveGroupEntityToDB$1) {
            groupDataConverter$saveGroupEntityToDB$1 = (GroupDataConverter$saveGroupEntityToDB$1) continuation;
            int i22 = groupDataConverter$saveGroupEntityToDB$1.label;
            if ((i22 & Integer.MIN_VALUE) != 0) {
                groupDataConverter$saveGroupEntityToDB$1.label = i22 - Integer.MIN_VALUE;
            } else {
                groupDataConverter$saveGroupEntityToDB$1 = new GroupDataConverter$saveGroupEntityToDB$1(this, continuation);
            }
        }
        java.lang.Object obj2 = groupDataConverter$saveGroupEntityToDB$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        java.lang.String str15 = "Database Operation failed after ";
        java.lang.String str16 = " attempts";
        java.lang.String str17 = "not open";
        try {
            try {
                try {
                    switch (groupDataConverter$saveGroupEntityToDB$1.label) {
                        case 0:
                            C56391yDq.AEQbTJ(obj2);
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDaoAEQbTJ = AEQbTJ();
                            Ref.LongRef longRef16 = new Ref.LongRef();
                            sjm = this;
                            baseDao4 = inHouseIMGroupInfoDaoAEQbTJ;
                            baseDao5 = baseDao4;
                            r8 = baseDao5;
                            objectRef = new Ref.ObjectRef();
                            str = " attempts";
                            i = 0;
                            i2 = 3;
                            str2 = "Database Operation failed after ";
                            longRef6 = longRef16;
                            groupDataConverter$saveGroupEntityToDB$12 = groupDataConverter$saveGroupEntityToDB$1;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity;
                            if (i < i2) {
                                try {
                                    try {
                                    } catch (java.lang.Exception e) {
                                        e = e;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        baseDao2 = baseDao4;
                                        longRef4 = longRef6;
                                        C44159sFm.EZpvd(baseDao2, longRef4.element);
                                        throw th;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                                    inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                    groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$12;
                                    str3 = str;
                                    str6 = str17;
                                    sQLiteDatabaseLockedException = e2;
                                } catch (java.lang.IllegalStateException e3) {
                                    e = e3;
                                    str6 = str17;
                                }
                                Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                                java.lang.String str18 = str;
                                str6 = str17;
                                try {
                                    try {
                                    } catch (java.lang.IllegalStateException e4) {
                                        e = e4;
                                        str17 = str6;
                                        message = e.getMessage();
                                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str17, false, 2, (java.lang.Object) null)) {
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                    inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                    groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$12;
                                    str3 = str18;
                                    sQLiteDatabaseLockedException = e5;
                                }
                                jNanoTime = java.lang.System.nanoTime();
                                str3 = str18;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                                    e = e6;
                                    inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                }
                                java.lang.String groupId = inHouseIMGroupEntity2.getGroupId();
                                groupDataConverter$saveGroupEntityToDB$12.L$0 = sjm;
                                groupDataConverter$saveGroupEntityToDB$12.L$1 = inHouseIMGroupEntity2;
                                groupDataConverter$saveGroupEntityToDB$12.L$2 = baseDao5;
                                groupDataConverter$saveGroupEntityToDB$12.L$3 = r8;
                                groupDataConverter$saveGroupEntityToDB$12.L$4 = baseDao4;
                                groupDataConverter$saveGroupEntityToDB$12.L$5 = longRef6;
                                groupDataConverter$saveGroupEntityToDB$12.L$6 = objectRef;
                                groupDataConverter$saveGroupEntityToDB$12.L$7 = objectRef15;
                                groupDataConverter$saveGroupEntityToDB$12.L$8 = longRef6;
                                groupDataConverter$saveGroupEntityToDB$12.L$9 = objectRef15;
                                groupDataConverter$saveGroupEntityToDB$12.I$0 = i2;
                                groupDataConverter$saveGroupEntityToDB$12.I$1 = i;
                                groupDataConverter$saveGroupEntityToDB$12.I$2 = i;
                                groupDataConverter$saveGroupEntityToDB$12.J$0 = jNanoTime;
                                inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e7) {
                                    try {
                                        e = e7;
                                        groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$12;
                                        sQLiteDatabaseLockedException = e;
                                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                        objectRef.element = r0;
                                        if (i3 < i2 - 1) {
                                            java.lang.String str19 = str2;
                                            groupDataConverter$saveGroupEntityToDB$1.L$0 = sjm2;
                                            groupDataConverter$saveGroupEntityToDB$1.L$1 = inHouseIMGroupEntity3;
                                            groupDataConverter$saveGroupEntityToDB$1.L$2 = baseDao7;
                                            groupDataConverter$saveGroupEntityToDB$1.L$3 = r82;
                                            groupDataConverter$saveGroupEntityToDB$1.L$4 = baseDao6;
                                            groupDataConverter$saveGroupEntityToDB$1.L$5 = longRef7;
                                            groupDataConverter$saveGroupEntityToDB$1.L$6 = objectRef;
                                            groupDataConverter$saveGroupEntityToDB$1.L$7 = null;
                                            groupDataConverter$saveGroupEntityToDB$1.L$8 = null;
                                            groupDataConverter$saveGroupEntityToDB$1.L$9 = null;
                                            groupDataConverter$saveGroupEntityToDB$1.I$0 = i2;
                                            groupDataConverter$saveGroupEntityToDB$1.I$1 = i;
                                            groupDataConverter$saveGroupEntityToDB$1.label = 2;
                                            if (DelayKt.delay(((long) (i3 + 1)) * 50, groupDataConverter$saveGroupEntityToDB$1) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            str2 = str19;
                                            groupDataConverter$saveGroupEntityToDB$14 = groupDataConverter$saveGroupEntityToDB$1;
                                            inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                                            baseDao4 = baseDao6;
                                            baseDao5 = baseDao7;
                                            str = str3;
                                            longRef6 = longRef7;
                                            sjm = sjm2;
                                            i5 = 1;
                                        } else {
                                            str2 = str2;
                                            groupDataConverter$saveGroupEntityToDB$14 = groupDataConverter$saveGroupEntityToDB$1;
                                            inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                                            baseDao4 = baseDao6;
                                            baseDao5 = baseDao7;
                                            str = str3;
                                            longRef6 = longRef7;
                                            sjm = sjm2;
                                            i5 = 1;
                                        }
                                        i += i5;
                                        groupDataConverter$saveGroupEntityToDB$12 = groupDataConverter$saveGroupEntityToDB$14;
                                        r8 = r82;
                                        if (i < i2) {
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        longRef8 = longRef7;
                                        baseDao2 = baseDao6;
                                        longRef4 = longRef8;
                                        C44159sFm.EZpvd(baseDao2, longRef4.element);
                                        throw th;
                                    }
                                    str17 = str6;
                                    i3 = i;
                                    sjm2 = sjm;
                                    longRef7 = longRef6;
                                    baseDao7 = baseDao5;
                                    baseDao6 = baseDao4;
                                    inHouseIMGroupEntity3 = inHouseIMGroupEntity5;
                                    r0 = sQLiteDatabaseLockedException;
                                    r82 = r8;
                                }
                                groupDataConverter$saveGroupEntityToDB$12.label = 1;
                                java.lang.Object groupInfoById = r8.getGroupInfoById(groupId, groupDataConverter$saveGroupEntityToDB$12);
                                if (groupInfoById == objCopydefault) {
                                    return objCopydefault;
                                }
                                str4 = str6;
                                objectRef2 = objectRef15;
                                groupDataConverter$saveGroupEntityToDB$13 = groupDataConverter$saveGroupEntityToDB$12;
                                baseDao2 = baseDao4;
                                objectRef3 = objectRef;
                                inHouseIMGroupEntity3 = inHouseIMGroupEntity5;
                                r20 = r8;
                                str5 = str2;
                                r02 = groupInfoById;
                                i4 = i;
                                longRef8 = longRef6;
                                longRef9 = longRef8;
                                objectRef4 = objectRef2;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                    sjm2 = sjm;
                                    baseDao7 = baseDao5;
                                    str2 = str5;
                                    str17 = str4;
                                    objectRef = objectRef3;
                                    longRef7 = longRef8;
                                    baseDao6 = baseDao2;
                                    i3 = i;
                                    i = i4;
                                    r82 = r20;
                                    groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$13;
                                    r0 = e8;
                                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                    objectRef.element = r0;
                                    if (i3 < i2 - 1) {
                                    }
                                    i += i5;
                                    groupDataConverter$saveGroupEntityToDB$12 = groupDataConverter$saveGroupEntityToDB$14;
                                    r8 = r82;
                                    if (i < i2) {
                                    }
                                } catch (java.lang.IllegalStateException e9) {
                                    e = e9;
                                    longRef6 = longRef8;
                                    baseDao4 = baseDao2;
                                    str17 = str4;
                                    message = e.getMessage();
                                    if (message == null) {
                                    }
                                    C44159sFm.copydefault(e);
                                    throw e;
                                } catch (java.lang.Exception e10) {
                                    e = e10;
                                    longRef6 = longRef8;
                                    baseDao4 = baseDao2;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    longRef4 = longRef8;
                                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                                    throw th;
                                }
                                objectRef4.element = r02;
                                longRef9.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                                java.lang.Object obj3 = objectRef2.element;
                                C44159sFm.EZpvd(baseDao2, longRef8.element);
                                inHouseIMGroupEntity4 = (InHouseIMGroupEntity) obj3;
                                if (inHouseIMGroupEntity4 != null) {
                                    inHouseIMGroupEntity3.setV1Field(inHouseIMGroupEntity4.getV1Field());
                                    Unit unit = Unit.INSTANCE;
                                }
                                longRef10 = new Ref.LongRef();
                                objectRef5 = new Ref.ObjectRef();
                                str16 = str3;
                                ?? r44 = r20;
                                r12 = r44;
                                str17 = str4;
                                i6 = 0;
                                i7 = 3;
                                groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$13;
                                r43 = r44;
                                if (i6 < i7) {
                                    try {
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e11) {
                                            e = e11;
                                            i9 = i6;
                                            str11 = str17;
                                            str8 = str5;
                                        } catch (java.lang.IllegalStateException e12) {
                                            e = e12;
                                            str11 = str17;
                                        }
                                        Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                                        str11 = str17;
                                        str8 = str5;
                                        try {
                                            try {
                                            } catch (java.lang.IllegalStateException e13) {
                                                e = e13;
                                                str17 = str11;
                                                r124 = r12;
                                                r123 = r124;
                                                message2 = e.getMessage();
                                                if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str17, false, 2, (java.lang.Object) null)) {
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                }
                                                C44159sFm.copydefault(e);
                                                throw e;
                                            }
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                            e = e14;
                                            i9 = i6;
                                        }
                                        jNanoTime2 = java.lang.System.nanoTime();
                                        groupDataConverter$saveGroupEntityToDB$1.L$0 = sjm;
                                        groupDataConverter$saveGroupEntityToDB$1.L$1 = inHouseIMGroupEntity3;
                                        groupDataConverter$saveGroupEntityToDB$1.L$2 = baseDao5;
                                        groupDataConverter$saveGroupEntityToDB$1.L$3 = r43;
                                        groupDataConverter$saveGroupEntityToDB$1.L$4 = longRef10;
                                        groupDataConverter$saveGroupEntityToDB$1.L$5 = objectRef5;
                                        groupDataConverter$saveGroupEntityToDB$1.L$6 = objectRef16;
                                        groupDataConverter$saveGroupEntityToDB$1.L$7 = objectRef16;
                                        groupDataConverter$saveGroupEntityToDB$1.L$8 = r12;
                                        groupDataConverter$saveGroupEntityToDB$1.L$9 = longRef10;
                                        groupDataConverter$saveGroupEntityToDB$1.I$0 = i7;
                                        groupDataConverter$saveGroupEntityToDB$1.I$1 = i6;
                                        groupDataConverter$saveGroupEntityToDB$1.I$2 = i6;
                                        groupDataConverter$saveGroupEntityToDB$1.J$0 = jNanoTime2;
                                        i9 = i6;
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                            e = e15;
                                            str17 = str11;
                                            str10 = str8;
                                            i11 = i9;
                                            sQLiteDatabaseLockedException2 = e;
                                            r42 = r43;
                                            r126 = r12;
                                            sjm3 = sjm;
                                            str7 = str10;
                                            i8 = i9;
                                            inHouseIMGroupEntity6 = inHouseIMGroupEntity3;
                                            r5 = r126;
                                            baseDao8 = baseDao5;
                                            longRef11 = longRef10;
                                            Ref.ObjectRef objectRef17 = objectRef5;
                                            r9 = r42;
                                            i10 = i7;
                                            objectRef6 = objectRef17;
                                            r03 = sQLiteDatabaseLockedException2;
                                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                            objectRef6.element = r03;
                                            if (i11 < i10 - 1) {
                                                java.lang.String str20 = str16;
                                                groupDataConverter$saveGroupEntityToDB$1.L$0 = sjm3;
                                                groupDataConverter$saveGroupEntityToDB$1.L$1 = inHouseIMGroupEntity6;
                                                groupDataConverter$saveGroupEntityToDB$1.L$2 = baseDao8;
                                                groupDataConverter$saveGroupEntityToDB$1.L$3 = r9;
                                                groupDataConverter$saveGroupEntityToDB$1.L$4 = longRef11;
                                                groupDataConverter$saveGroupEntityToDB$1.L$5 = objectRef6;
                                                groupDataConverter$saveGroupEntityToDB$1.L$6 = r5;
                                                groupDataConverter$saveGroupEntityToDB$1.L$7 = null;
                                                groupDataConverter$saveGroupEntityToDB$1.L$8 = null;
                                                groupDataConverter$saveGroupEntityToDB$1.L$9 = null;
                                                groupDataConverter$saveGroupEntityToDB$1.I$0 = i10;
                                                groupDataConverter$saveGroupEntityToDB$1.I$1 = i8;
                                                groupDataConverter$saveGroupEntityToDB$1.label = 4;
                                                if (DelayKt.delay(((long) (i11 + 1)) * 50, groupDataConverter$saveGroupEntityToDB$1) == objCopydefault) {
                                                    return objCopydefault;
                                                }
                                                str15 = str7;
                                                str16 = str20;
                                                i14 = i8;
                                                objectRef10 = objectRef6;
                                                r52 = r5;
                                                r92 = r9;
                                                i7 = i10;
                                                r4 = r92;
                                                objectRef5 = objectRef10;
                                                i8 = i14;
                                                BaseDao baseDao15 = baseDao8;
                                                r125 = r52;
                                                inHouseIMGroupEntity3 = inHouseIMGroupEntity6;
                                                str5 = str15;
                                                longRef10 = longRef11;
                                                baseDao5 = baseDao15;
                                                i6 = i8 + 1;
                                                sjm = sjm3;
                                                r43 = r4;
                                                r12 = r125;
                                                if (i6 < i7) {
                                                }
                                            } else {
                                                longRef10 = longRef11;
                                                baseDao5 = baseDao8;
                                                r125 = r5;
                                                inHouseIMGroupEntity3 = inHouseIMGroupEntity6;
                                                str5 = str7;
                                                Ref.ObjectRef objectRef18 = objectRef6;
                                                i7 = i10;
                                                r4 = r9;
                                                objectRef5 = objectRef18;
                                                i6 = i8 + 1;
                                                sjm = sjm3;
                                                r43 = r4;
                                                r12 = r125;
                                                if (i6 < i7) {
                                                }
                                            }
                                        }
                                        groupDataConverter$saveGroupEntityToDB$1.label = 3;
                                        if (r43.insert(inHouseIMGroupEntity3, groupDataConverter$saveGroupEntityToDB$1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        str9 = str11;
                                        groupDataConverter$saveGroupEntityToDB$15 = groupDataConverter$saveGroupEntityToDB$1;
                                        r21 = r43;
                                        baseDao9 = baseDao5;
                                        longRef2 = longRef10;
                                        objectRef7 = objectRef16;
                                        objectRef9 = objectRef7;
                                        longRef12 = longRef2;
                                        objectRef8 = objectRef5;
                                        i12 = i7;
                                        i13 = i9;
                                        r12 = r12;
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                            groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$15;
                                            str10 = str8;
                                            str17 = str9;
                                            r42 = r21;
                                            baseDao5 = baseDao9;
                                            Ref.ObjectRef objectRef19 = objectRef8;
                                            longRef10 = longRef2;
                                            i11 = i9;
                                            i9 = i13;
                                            i7 = i12;
                                            objectRef5 = objectRef19;
                                            sQLiteDatabaseLockedException2 = e16;
                                            r126 = r12;
                                            sjm3 = sjm;
                                            str7 = str10;
                                            i8 = i9;
                                            inHouseIMGroupEntity6 = inHouseIMGroupEntity3;
                                            r5 = r126;
                                            baseDao8 = baseDao5;
                                            longRef11 = longRef10;
                                            Ref.ObjectRef objectRef172 = objectRef5;
                                            r9 = r42;
                                            i10 = i7;
                                            objectRef6 = objectRef172;
                                            r03 = sQLiteDatabaseLockedException2;
                                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                            objectRef6.element = r03;
                                            if (i11 < i10 - 1) {
                                            }
                                        } catch (java.lang.IllegalStateException e17) {
                                            e = e17;
                                            longRef10 = longRef2;
                                            str17 = str9;
                                            r124 = r12;
                                            r123 = r124;
                                            message2 = e.getMessage();
                                            if (message2 == null) {
                                            }
                                            C44159sFm.copydefault(e);
                                            throw e;
                                        } catch (java.lang.Exception e18) {
                                            e = e18;
                                            longRef10 = longRef2;
                                            r122 = r12;
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            C44159sFm.EZpvd(r12, longRef2.element);
                                            throw th;
                                        }
                                        objectRef7.element = Unit.INSTANCE;
                                        longRef12.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                        java.lang.Object obj4 = objectRef9.element;
                                        C44159sFm.EZpvd(r12, longRef2.element);
                                        InHouseIMGroupSettingDao inHouseIMGroupSettingDaoEZpvd = sjm.EZpvd();
                                        userSetting = inHouseIMGroupEntity3.getUserSetting();
                                        if (userSetting != null) {
                                            userSetting.setGroupId(inHouseIMGroupEntity3.getGroupId());
                                            inHouseIMGroupSettingDao = inHouseIMGroupSettingDaoEZpvd;
                                            baseDao10 = inHouseIMGroupSettingDao;
                                            inHouseIMGroupSettingEntity = userSetting;
                                            longRef13 = new Ref.LongRef();
                                            str15 = str8;
                                            str17 = str9;
                                            i15 = 3;
                                            i16 = 0;
                                            inHouseIMGroupSettingEntity2 = inHouseIMGroupSettingEntity;
                                            objectRef11 = new Ref.ObjectRef();
                                            groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$15;
                                            baseDao11 = baseDao10;
                                            if (i16 >= i15) {
                                                try {
                                                    try {
                                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e19) {
                                                        e = e19;
                                                        str14 = str17;
                                                    } catch (java.lang.IllegalStateException e20) {
                                                        e = e20;
                                                        str14 = str17;
                                                    }
                                                    Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                                                    str14 = str17;
                                                    try {
                                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                                                        e = e21;
                                                        str17 = str14;
                                                        baseDao12 = baseDao11;
                                                        str12 = str15;
                                                        i18 = i16;
                                                        Ref.LongRef longRef17 = longRef13;
                                                        inHouseIMGroupSettingEntity4 = inHouseIMGroupSettingEntity2;
                                                        inHouseIMGroupSettingDao2 = inHouseIMGroupSettingDao;
                                                        longRef14 = longRef17;
                                                        int i23 = i15;
                                                        inHouseIMGroupSettingEntity5 = inHouseIMGroupSettingEntity;
                                                        baseDao13 = baseDao10;
                                                        i17 = i23;
                                                        r04 = e;
                                                        C44159sFm.copydefault(r04, (java.lang.Exception) objectRef11.element);
                                                        objectRef11.element = r04;
                                                        if (i16 < i17 - 1) {
                                                            java.lang.String str21 = str16;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$0 = baseDao12;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$1 = inHouseIMGroupSettingDao2;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$2 = inHouseIMGroupSettingEntity5;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$3 = inHouseIMGroupSettingEntity4;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$4 = baseDao13;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$5 = longRef14;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$6 = objectRef11;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$7 = null;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$8 = null;
                                                            groupDataConverter$saveGroupEntityToDB$1.L$9 = null;
                                                            groupDataConverter$saveGroupEntityToDB$1.I$0 = i17;
                                                            groupDataConverter$saveGroupEntityToDB$1.I$1 = i18;
                                                            groupDataConverter$saveGroupEntityToDB$1.label = 6;
                                                            if (DelayKt.delay(((long) (i16 + 1)) * 50, groupDataConverter$saveGroupEntityToDB$1) == objCopydefault) {
                                                                return objCopydefault;
                                                            }
                                                            str15 = str12;
                                                            str16 = str21;
                                                            inHouseIMGroupSettingDao3 = inHouseIMGroupSettingDao2;
                                                            i20 = i18;
                                                            inHouseIMGroupSettingEntity2 = inHouseIMGroupSettingEntity4;
                                                            baseDao11 = baseDao12;
                                                            longRef13 = longRef14;
                                                            inHouseIMGroupSettingDao = inHouseIMGroupSettingDao3;
                                                            i21 = 1;
                                                            int i24 = i17;
                                                            baseDao10 = baseDao13;
                                                            inHouseIMGroupSettingEntity = inHouseIMGroupSettingEntity5;
                                                            i15 = i24;
                                                            i16 = i20 + i21;
                                                            if (i16 >= i15) {
                                                            }
                                                        } else {
                                                            str15 = str12;
                                                            i20 = i18;
                                                            baseDao11 = baseDao12;
                                                            i21 = 1;
                                                            Ref.LongRef longRef18 = longRef14;
                                                            inHouseIMGroupSettingDao = inHouseIMGroupSettingDao2;
                                                            inHouseIMGroupSettingEntity2 = inHouseIMGroupSettingEntity4;
                                                            longRef13 = longRef18;
                                                            int i25 = i17;
                                                            baseDao10 = baseDao13;
                                                            inHouseIMGroupSettingEntity = inHouseIMGroupSettingEntity5;
                                                            i15 = i25;
                                                            i16 = i20 + i21;
                                                            if (i16 >= i15) {
                                                            }
                                                        }
                                                    } catch (java.lang.IllegalStateException e22) {
                                                        e = e22;
                                                        str17 = str14;
                                                        message3 = e.getMessage();
                                                        if (message3 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message3, (java.lang.CharSequence) str17, false, 2, (java.lang.Object) null)) {
                                                            C44159sFm.OLrzqt(e);
                                                            throw e;
                                                        }
                                                        C44159sFm.copydefault(e);
                                                        throw e;
                                                    }
                                                    jNanoTime3 = java.lang.System.nanoTime();
                                                    groupDataConverter$saveGroupEntityToDB$1.L$0 = baseDao11;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$1 = inHouseIMGroupSettingDao;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$2 = inHouseIMGroupSettingEntity;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$3 = inHouseIMGroupSettingEntity2;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$4 = baseDao10;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$5 = longRef13;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$6 = objectRef11;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$7 = objectRef20;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$8 = longRef13;
                                                    groupDataConverter$saveGroupEntityToDB$1.L$9 = objectRef20;
                                                    groupDataConverter$saveGroupEntityToDB$1.I$0 = i15;
                                                    groupDataConverter$saveGroupEntityToDB$1.I$1 = i16;
                                                    groupDataConverter$saveGroupEntityToDB$1.I$2 = i16;
                                                    groupDataConverter$saveGroupEntityToDB$1.J$0 = jNanoTime3;
                                                    groupDataConverter$saveGroupEntityToDB$1.label = 5;
                                                    if (inHouseIMGroupSettingDao.insert(inHouseIMGroupSettingEntity2, groupDataConverter$saveGroupEntityToDB$1) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                    inHouseIMGroupSettingEntity3 = inHouseIMGroupSettingEntity2;
                                                    baseDao14 = baseDao11;
                                                    baseDao3 = baseDao10;
                                                    i19 = i16;
                                                    objectRef14 = objectRef11;
                                                    objectRef12 = objectRef20;
                                                    longRef15 = longRef13;
                                                    str13 = str14;
                                                    groupDataConverter$saveGroupEntityToDB$16 = groupDataConverter$saveGroupEntityToDB$1;
                                                    objectRef13 = objectRef12;
                                                    try {
                                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e23) {
                                                        groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$16;
                                                        i18 = i19;
                                                        i17 = i15;
                                                        str12 = str15;
                                                        str17 = str13;
                                                        objectRef11 = objectRef14;
                                                        baseDao12 = baseDao14;
                                                        inHouseIMGroupSettingEntity5 = inHouseIMGroupSettingEntity;
                                                        baseDao13 = baseDao3;
                                                        inHouseIMGroupSettingDao2 = inHouseIMGroupSettingDao;
                                                        longRef14 = longRef13;
                                                        inHouseIMGroupSettingEntity4 = inHouseIMGroupSettingEntity3;
                                                        r04 = e23;
                                                        C44159sFm.copydefault(r04, (java.lang.Exception) objectRef11.element);
                                                        objectRef11.element = r04;
                                                        if (i16 < i17 - 1) {
                                                        }
                                                    } catch (java.lang.IllegalStateException e24) {
                                                        e = e24;
                                                        str17 = str13;
                                                        message3 = e.getMessage();
                                                        if (message3 == null) {
                                                        }
                                                        C44159sFm.copydefault(e);
                                                        throw e;
                                                    } catch (java.lang.Exception e25) {
                                                        e = e25;
                                                        C44159sFm.OLrzqt(e);
                                                        throw e;
                                                    } catch (java.lang.Throwable th5) {
                                                        th = th5;
                                                        longRef5 = longRef13;
                                                        C44159sFm.EZpvd(baseDao3, longRef5.element);
                                                        throw th;
                                                    }
                                                    objectRef12.element = Unit.INSTANCE;
                                                    longRef15.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                                                    java.lang.Object obj5 = objectRef13.element;
                                                    C44159sFm.EZpvd(baseDao3, longRef13.element);
                                                } catch (java.lang.Exception e26) {
                                                    e = e26;
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    longRef5 = longRef13;
                                                    BaseDao baseDao16 = baseDao10;
                                                    baseDao3 = baseDao16;
                                                    C44159sFm.EZpvd(baseDao3, longRef5.element);
                                                    throw th;
                                                }
                                            } else {
                                                C44159sFm.EZpvd(baseDao10, longRef13.element);
                                                java.lang.Exception exc = (java.lang.Exception) objectRef11.element;
                                                if (exc == null) {
                                                    exc = new java.lang.Exception(str15 + i15 + str16);
                                                }
                                                C44159sFm.OLrzqt(exc);
                                                throw exc;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    } catch (java.lang.Exception e27) {
                                        e = e27;
                                        r122 = r12;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        longRef2 = longRef10;
                                        C44159sFm.EZpvd(r12, longRef2.element);
                                        throw th;
                                    }
                                }
                                java.lang.String str22 = str5;
                                C44159sFm.EZpvd(r12, longRef10.element);
                                java.lang.Exception exc2 = (java.lang.Exception) objectRef5.element;
                                if (exc2 == null) {
                                    exc2 = new java.lang.Exception(str22 + i7 + str16);
                                }
                                C44159sFm.OLrzqt(exc2);
                                throw exc2;
                            }
                            java.lang.String str23 = str;
                            C44159sFm.EZpvd(baseDao4, longRef6.element);
                            java.lang.Exception exc3 = (java.lang.Exception) objectRef.element;
                            if (exc3 == null) {
                                exc3 = new java.lang.Exception(str2 + i2 + str23);
                            }
                            C44159sFm.OLrzqt(exc3);
                            throw exc3;
                        case 1:
                            long j = groupDataConverter$saveGroupEntityToDB$1.J$0;
                            int i26 = groupDataConverter$saveGroupEntityToDB$1.I$2;
                            int i27 = groupDataConverter$saveGroupEntityToDB$1.I$1;
                            int i28 = groupDataConverter$saveGroupEntityToDB$1.I$0;
                            Ref.ObjectRef objectRef21 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$9;
                            Ref.LongRef longRef19 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$8;
                            Ref.ObjectRef objectRef22 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$7;
                            objectRef = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$6;
                            longRef4 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$5;
                            BaseDao baseDao17 = (BaseDao) groupDataConverter$saveGroupEntityToDB$1.L$4;
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDao = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$3;
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDao2 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$2;
                            InHouseIMGroupEntity inHouseIMGroupEntity7 = (InHouseIMGroupEntity) groupDataConverter$saveGroupEntityToDB$1.L$1;
                            sJM sjm4 = (sJM) groupDataConverter$saveGroupEntityToDB$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                baseDao2 = baseDao17;
                                groupDataConverter$saveGroupEntityToDB$13 = groupDataConverter$saveGroupEntityToDB$1;
                                longRef8 = longRef4;
                                objectRef2 = objectRef22;
                                sjm = sjm4;
                                i4 = i27;
                                i2 = i28;
                                baseDao5 = inHouseIMGroupInfoDao2;
                                str4 = "not open";
                                jNanoTime = j;
                                i = i26;
                                inHouseIMGroupEntity3 = inHouseIMGroupEntity7;
                                str3 = " attempts";
                                objectRef3 = objectRef;
                                longRef9 = longRef19;
                                str5 = "Database Operation failed after ";
                                objectRef4 = objectRef21;
                                r02 = obj2;
                                r20 = inHouseIMGroupInfoDao;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e28) {
                                i = i27;
                                i2 = i28;
                                longRef7 = longRef4;
                                r82 = inHouseIMGroupInfoDao;
                                inHouseIMGroupEntity3 = inHouseIMGroupEntity7;
                                baseDao6 = baseDao17;
                                sjm2 = sjm4;
                                i3 = i26;
                                str3 = " attempts";
                                str2 = "Database Operation failed after ";
                                baseDao7 = inHouseIMGroupInfoDao2;
                                r0 = e28;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i3 < i2 - 1) {
                                }
                                i += i5;
                                groupDataConverter$saveGroupEntityToDB$12 = groupDataConverter$saveGroupEntityToDB$14;
                                r8 = r82;
                                if (i < i2) {
                                }
                            } catch (java.lang.IllegalStateException e29) {
                                e = e29;
                                message = e.getMessage();
                                if (message == null) {
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e30) {
                                e = e30;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                baseDao2 = baseDao17;
                                C44159sFm.EZpvd(baseDao2, longRef4.element);
                                throw th;
                            }
                            objectRef4.element = r02;
                            longRef9.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj32 = objectRef2.element;
                            C44159sFm.EZpvd(baseDao2, longRef8.element);
                            inHouseIMGroupEntity4 = (InHouseIMGroupEntity) obj32;
                            if (inHouseIMGroupEntity4 != null) {
                            }
                            longRef10 = new Ref.LongRef();
                            objectRef5 = new Ref.ObjectRef();
                            str16 = str3;
                            ?? r442 = r20;
                            r12 = r442;
                            str17 = str4;
                            i6 = 0;
                            i7 = 3;
                            groupDataConverter$saveGroupEntityToDB$1 = groupDataConverter$saveGroupEntityToDB$13;
                            r43 = r442;
                            if (i6 < i7) {
                            }
                            break;
                        case 2:
                            int i29 = groupDataConverter$saveGroupEntityToDB$1.I$1;
                            int i30 = groupDataConverter$saveGroupEntityToDB$1.I$0;
                            Ref.ObjectRef objectRef23 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$6;
                            Ref.LongRef longRef20 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$5;
                            BaseDao baseDao18 = (BaseDao) groupDataConverter$saveGroupEntityToDB$1.L$4;
                            r82 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$3;
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDao3 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$2;
                            InHouseIMGroupEntity inHouseIMGroupEntity8 = (InHouseIMGroupEntity) groupDataConverter$saveGroupEntityToDB$1.L$1;
                            sJM sjm5 = (sJM) groupDataConverter$saveGroupEntityToDB$1.L$0;
                            C56391yDq.AEQbTJ(obj2);
                            groupDataConverter$saveGroupEntityToDB$14 = groupDataConverter$saveGroupEntityToDB$1;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity8;
                            i5 = 1;
                            str = " attempts";
                            str2 = "Database Operation failed after ";
                            longRef6 = longRef20;
                            sjm = sjm5;
                            objectRef = objectRef23;
                            baseDao4 = baseDao18;
                            baseDao5 = inHouseIMGroupInfoDao3;
                            i2 = i30;
                            i = i29;
                            i += i5;
                            groupDataConverter$saveGroupEntityToDB$12 = groupDataConverter$saveGroupEntityToDB$14;
                            r8 = r82;
                            if (i < i2) {
                            }
                            break;
                        case 3:
                            long j2 = groupDataConverter$saveGroupEntityToDB$1.J$0;
                            int i31 = groupDataConverter$saveGroupEntityToDB$1.I$2;
                            i8 = groupDataConverter$saveGroupEntityToDB$1.I$1;
                            int i32 = groupDataConverter$saveGroupEntityToDB$1.I$0;
                            Ref.LongRef longRef21 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$9;
                            r12 = (BaseDao) groupDataConverter$saveGroupEntityToDB$1.L$8;
                            Ref.ObjectRef objectRef24 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$7;
                            Ref.ObjectRef objectRef25 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$6;
                            objectRef6 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$5;
                            i9 = i31;
                            Ref.LongRef longRef22 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$4;
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDao4 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$3;
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDao5 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$2;
                            InHouseIMGroupEntity inHouseIMGroupEntity9 = (InHouseIMGroupEntity) groupDataConverter$saveGroupEntityToDB$1.L$1;
                            sJM sjm6 = (sJM) groupDataConverter$saveGroupEntityToDB$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                longRef12 = longRef21;
                                i12 = i32;
                                longRef2 = longRef22;
                                groupDataConverter$saveGroupEntityToDB$15 = groupDataConverter$saveGroupEntityToDB$1;
                                objectRef7 = objectRef24;
                                sjm = sjm6;
                                i13 = i8;
                                objectRef8 = objectRef6;
                                str8 = "Database Operation failed after ";
                                str9 = "not open";
                                jNanoTime2 = j2;
                                objectRef9 = objectRef25;
                                inHouseIMGroupEntity3 = inHouseIMGroupEntity9;
                                baseDao9 = inHouseIMGroupInfoDao5;
                                r21 = inHouseIMGroupInfoDao4;
                                r12 = r12;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e31) {
                                sjm3 = sjm6;
                                i10 = i32;
                                r5 = r12;
                                i11 = i9;
                                r9 = inHouseIMGroupInfoDao4;
                                baseDao8 = inHouseIMGroupInfoDao5;
                                inHouseIMGroupEntity6 = inHouseIMGroupEntity9;
                                longRef11 = longRef22;
                                str7 = "Database Operation failed after ";
                                r03 = e31;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r03;
                                if (i11 < i10 - 1) {
                                }
                            } catch (java.lang.IllegalStateException e32) {
                                e = e32;
                                r123 = r12;
                                message2 = e.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e33) {
                                e = e33;
                                r122 = r12;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                longRef2 = longRef22;
                                C44159sFm.EZpvd(r12, longRef2.element);
                                throw th;
                            }
                            objectRef7.element = Unit.INSTANCE;
                            longRef12.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                            java.lang.Object obj42 = objectRef9.element;
                            C44159sFm.EZpvd(r12, longRef2.element);
                            InHouseIMGroupSettingDao inHouseIMGroupSettingDaoEZpvd2 = sjm.EZpvd();
                            userSetting = inHouseIMGroupEntity3.getUserSetting();
                            if (userSetting != null) {
                            }
                            return Unit.INSTANCE;
                        case 4:
                            i14 = groupDataConverter$saveGroupEntityToDB$1.I$1;
                            i10 = groupDataConverter$saveGroupEntityToDB$1.I$0;
                            BaseDao baseDao19 = (BaseDao) groupDataConverter$saveGroupEntityToDB$1.L$6;
                            objectRef10 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$5;
                            longRef11 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$4;
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDao6 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$3;
                            baseDao8 = (InHouseIMGroupInfoDao) groupDataConverter$saveGroupEntityToDB$1.L$2;
                            inHouseIMGroupEntity6 = (InHouseIMGroupEntity) groupDataConverter$saveGroupEntityToDB$1.L$1;
                            sjm3 = (sJM) groupDataConverter$saveGroupEntityToDB$1.L$0;
                            C56391yDq.AEQbTJ(obj2);
                            r52 = baseDao19;
                            r92 = inHouseIMGroupInfoDao6;
                            i7 = i10;
                            r4 = r92;
                            objectRef5 = objectRef10;
                            i8 = i14;
                            BaseDao baseDao152 = baseDao8;
                            r125 = r52;
                            inHouseIMGroupEntity3 = inHouseIMGroupEntity6;
                            str5 = str15;
                            longRef10 = longRef11;
                            baseDao5 = baseDao152;
                            i6 = i8 + 1;
                            sjm = sjm3;
                            r43 = r4;
                            r12 = r125;
                            if (i6 < i7) {
                            }
                            break;
                        case 5:
                            long j3 = groupDataConverter$saveGroupEntityToDB$1.J$0;
                            int i33 = groupDataConverter$saveGroupEntityToDB$1.I$2;
                            int i34 = groupDataConverter$saveGroupEntityToDB$1.I$1;
                            i17 = groupDataConverter$saveGroupEntityToDB$1.I$0;
                            Ref.ObjectRef objectRef26 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$9;
                            Ref.LongRef longRef23 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$8;
                            Ref.ObjectRef objectRef27 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$7;
                            objectRef11 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$6;
                            Ref.LongRef longRef24 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$5;
                            BaseDao baseDao20 = (BaseDao) groupDataConverter$saveGroupEntityToDB$1.L$4;
                            inHouseIMGroupSettingEntity3 = (InHouseIMGroupSettingEntity) groupDataConverter$saveGroupEntityToDB$1.L$3;
                            InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity6 = (InHouseIMGroupSettingEntity) groupDataConverter$saveGroupEntityToDB$1.L$2;
                            InHouseIMGroupSettingDao inHouseIMGroupSettingDao4 = (InHouseIMGroupSettingDao) groupDataConverter$saveGroupEntityToDB$1.L$1;
                            InHouseIMGroupSettingDao inHouseIMGroupSettingDao5 = (InHouseIMGroupSettingDao) groupDataConverter$saveGroupEntityToDB$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                objectRef12 = objectRef26;
                                i15 = i17;
                                i19 = i34;
                                longRef13 = longRef24;
                                groupDataConverter$saveGroupEntityToDB$16 = groupDataConverter$saveGroupEntityToDB$1;
                                objectRef13 = objectRef27;
                                baseDao14 = inHouseIMGroupSettingDao5;
                                baseDao3 = baseDao20;
                                str13 = "not open";
                                jNanoTime3 = j3;
                                inHouseIMGroupSettingDao = inHouseIMGroupSettingDao4;
                                i16 = i33;
                                inHouseIMGroupSettingEntity = inHouseIMGroupSettingEntity6;
                                objectRef14 = objectRef11;
                                longRef15 = longRef23;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e34) {
                                longRef14 = longRef24;
                                baseDao12 = inHouseIMGroupSettingDao5;
                                i16 = i33;
                                i18 = i34;
                                str12 = "Database Operation failed after ";
                                baseDao13 = baseDao20;
                                inHouseIMGroupSettingEntity4 = inHouseIMGroupSettingEntity3;
                                inHouseIMGroupSettingEntity5 = inHouseIMGroupSettingEntity6;
                                inHouseIMGroupSettingDao2 = inHouseIMGroupSettingDao4;
                                r04 = e34;
                                C44159sFm.copydefault(r04, (java.lang.Exception) objectRef11.element);
                                objectRef11.element = r04;
                                if (i16 < i17 - 1) {
                                }
                            } catch (java.lang.IllegalStateException e35) {
                                e = e35;
                                message3 = e.getMessage();
                                if (message3 == null) {
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e36) {
                                e = e36;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                longRef5 = longRef24;
                                baseDao3 = baseDao20;
                                C44159sFm.EZpvd(baseDao3, longRef5.element);
                                throw th;
                            }
                            objectRef12.element = Unit.INSTANCE;
                            longRef15.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                            java.lang.Object obj52 = objectRef13.element;
                            C44159sFm.EZpvd(baseDao3, longRef13.element);
                            return Unit.INSTANCE;
                        case 6:
                            i18 = groupDataConverter$saveGroupEntityToDB$1.I$1;
                            i17 = groupDataConverter$saveGroupEntityToDB$1.I$0;
                            objectRef11 = (Ref.ObjectRef) groupDataConverter$saveGroupEntityToDB$1.L$6;
                            longRef14 = (Ref.LongRef) groupDataConverter$saveGroupEntityToDB$1.L$5;
                            baseDao13 = (BaseDao) groupDataConverter$saveGroupEntityToDB$1.L$4;
                            inHouseIMGroupSettingEntity4 = (InHouseIMGroupSettingEntity) groupDataConverter$saveGroupEntityToDB$1.L$3;
                            inHouseIMGroupSettingEntity5 = (InHouseIMGroupSettingEntity) groupDataConverter$saveGroupEntityToDB$1.L$2;
                            inHouseIMGroupSettingDao3 = (InHouseIMGroupSettingDao) groupDataConverter$saveGroupEntityToDB$1.L$1;
                            baseDao12 = (InHouseIMGroupSettingDao) groupDataConverter$saveGroupEntityToDB$1.L$0;
                            C56391yDq.AEQbTJ(obj2);
                            i20 = i18;
                            inHouseIMGroupSettingEntity2 = inHouseIMGroupSettingEntity4;
                            baseDao11 = baseDao12;
                            longRef13 = longRef14;
                            inHouseIMGroupSettingDao = inHouseIMGroupSettingDao3;
                            i21 = 1;
                            int i242 = i17;
                            baseDao10 = baseDao13;
                            inHouseIMGroupSettingEntity = inHouseIMGroupSettingEntity5;
                            i15 = i242;
                            i16 = i20 + i21;
                            if (i16 >= i15) {
                            }
                            break;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                r12 = obj;
                longRef2 = longRef;
            }
        } catch (java.lang.Throwable th13) {
            th = th13;
            longRef4 = longRef3;
            baseDao2 = baseDao;
        }
    }

    public final C44457sQn KWHzl(@NotNull GroupRolePermissionItem groupRolePermissionItem) {
        Intrinsics.checkNotNullParameter(groupRolePermissionItem, "");
        return new C44457sQn(1 == groupRolePermissionItem.isCanAddMember(), 1 == groupRolePermissionItem.isCanDismissGroup(), 1 == groupRolePermissionItem.isCanModifyAvatar(), 1 == groupRolePermissionItem.isCanModifyNotice(), 1 == groupRolePermissionItem.isCanModifyPetname(), 1 == groupRolePermissionItem.isCanQuitGroup(), 1 == groupRolePermissionItem.isCanRemoveMember(), 1 == groupRolePermissionItem.isCanSetAsset(), 1 == groupRolePermissionItem.isCanSetAudit(), 1 == groupRolePermissionItem.isCanSetManager(), 1 == groupRolePermissionItem.isCanSetPay(), 1 == groupRolePermissionItem.isCanShowBlockList(), 1 == groupRolePermissionItem.isCanSendPrivateMessage(), 1 == groupRolePermissionItem.isCanSendLink(), 1 == groupRolePermissionItem.isCanSetMentionedRobot(), 1 == groupRolePermissionItem.isCanMute(), 1 == groupRolePermissionItem.isCanAddMember(), 1 == groupRolePermissionItem.isCanSetMentionOthers(), 1 == groupRolePermissionItem.isCanAllowMembersToAddMembers(), 1 == groupRolePermissionItem.isCanShareInvitationQrCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, GroupAnnouncementEntity groupAnnouncementEntity, @NotNull Continuation<? super GroupAnnouncementInfo> continuation) throws java.lang.Exception {
        GroupDataConverter$convertAnnouncementInfo$1 groupDataConverter$convertAnnouncementInfo$1;
        java.lang.String str2;
        long j;
        GroupAnnouncementEntity groupAnnouncementEntity2 = groupAnnouncementEntity;
        if (continuation instanceof GroupDataConverter$convertAnnouncementInfo$1) {
            groupDataConverter$convertAnnouncementInfo$1 = (GroupDataConverter$convertAnnouncementInfo$1) continuation;
            int i = groupDataConverter$convertAnnouncementInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupDataConverter$convertAnnouncementInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                groupDataConverter$convertAnnouncementInfo$1 = new GroupDataConverter$convertAnnouncementInfo$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = groupDataConverter$convertAnnouncementInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupDataConverter$convertAnnouncementInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (groupAnnouncementEntity2 == null) {
                return null;
            }
            java.lang.Long id = groupAnnouncementEntity.getId();
            long jLongValue = id != null ? id.longValue() : 0L;
            InHouseIMGroupMemberEntity author = groupAnnouncementEntity.getAuthor();
            groupDataConverter$convertAnnouncementInfo$1.L$0 = str;
            groupDataConverter$convertAnnouncementInfo$1.L$1 = groupAnnouncementEntity2;
            groupDataConverter$convertAnnouncementInfo$1.J$0 = jLongValue;
            groupDataConverter$convertAnnouncementInfo$1.label = 1;
            objEZpvd = EZpvd(author, groupDataConverter$convertAnnouncementInfo$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            j = jLongValue;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = groupDataConverter$convertAnnouncementInfo$1.J$0;
            groupAnnouncementEntity2 = (GroupAnnouncementEntity) groupDataConverter$convertAnnouncementInfo$1.L$1;
            java.lang.String str3 = (java.lang.String) groupDataConverter$convertAnnouncementInfo$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            str2 = str3;
            j = j2;
        }
        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) objEZpvd;
        java.lang.String content = groupAnnouncementEntity2.getContent();
        java.lang.String str4 = content == null ? "" : content;
        java.lang.Long createDate = groupAnnouncementEntity2.getCreateDate();
        long jLongValue2 = createDate != null ? createDate.longValue() : 0L;
        java.lang.Long updateDate = groupAnnouncementEntity2.getUpdateDate();
        long jLongValue3 = updateDate != null ? updateDate.longValue() : 0L;
        java.lang.Integer pin = groupAnnouncementEntity2.getPin();
        boolean z = pin != null && 1 == pin.intValue();
        java.lang.Long editTime = groupAnnouncementEntity2.getEditTime();
        long jLongValue4 = editTime != null ? editTime.longValue() : 0L;
        java.lang.String createBy = groupAnnouncementEntity2.getCreateBy();
        java.lang.String str5 = createBy == null ? "" : createBy;
        java.lang.String createByName = groupAnnouncementEntity2.getCreateByName();
        java.lang.String str6 = createByName == null ? "" : createByName;
        java.lang.String updateBy = groupAnnouncementEntity2.getUpdateBy();
        java.lang.String str7 = updateBy == null ? "" : updateBy;
        java.lang.String updateByName = groupAnnouncementEntity2.getUpdateByName();
        return new GroupAnnouncementInfo(j, str2, groupMemberInfo, str4, z, jLongValue2, jLongValue3, C56443yFo.KWHzl(jLongValue4), str5, str6, str7, updateByName == null ? "" : updateByName);
    }
}
