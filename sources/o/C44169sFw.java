package o;

import androidx.core.net.UriKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.extension.InHouseXKt$toInHouseIMPendingMessage$1;
import com.okinc.okimcore.extension.InHouseXKt$toWSSendMessageDetailData$1;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.im.AddContactMessage;
import com.okinc.okimcore.model.im.AllowGeneratingInvitationQrCodeGroupMessage;
import com.okinc.okimcore.model.im.AllowGroupPrivateChatMessage;
import com.okinc.okimcore.model.im.AllowMemberAddMemberGroupMessage;
import com.okinc.okimcore.model.im.AllowMentionMembersGroupMessage;
import com.okinc.okimcore.model.im.AllowSendingLinkGroupMessage;
import com.okinc.okimcore.model.im.AnnouncementGroupMessage;
import com.okinc.okimcore.model.im.ConvertPrivateToPublicGroupMessage;
import com.okinc.okimcore.model.im.CreateGroupMessage;
import com.okinc.okimcore.model.im.DisableGroupChatMessage;
import com.okinc.okimcore.model.im.DisbandGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.MentionedUserInfo;
import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSTerminateMessage;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKIMStartVoiceCallMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReactionMessage;
import com.okinc.okimcore.model.im.OKReadReceiptMessage;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.OKTypingIndicatorMessage;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.PaidGroupBilling;
import com.okinc.okimcore.model.im.RequireAdminApprovalToJoin;
import com.okinc.okimcore.model.im.RequireAssetVerificationToJoin;
import com.okinc.okimcore.model.im.StartGroupVoiceCallMessage;
import com.okinc.okimcore.model.im.TransferGroupOwnershipMessage;
import com.okinc.okimcore.model.im.UpdateAdminGroupMessage;
import com.okinc.okimcore.model.im.UpdateGroupAvatarMessage;
import com.okinc.okimcore.model.im.UpdateGroupMemberMessage;
import com.okinc.okimcore.model.im.UpdateGroupNameMessage;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SenderName;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo;
import com.okinc.okimcore.model.remote.InHouseUserInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.UserGlobalPermissionDto;
import com.okinc.okimcore.model.remote.UserPrivacySettingsDto;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import com.okinc.okimcore.model.room.inhouseim.MessageStatus;
import com.okinc.okimcore.model.room.inhouseim.RelationPermission;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44169sFw {

    /* JADX INFO: renamed from: o.sFw$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[SystemMessageData.VisibleSystemAction.values().length];
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_PIN_GROUP_ANNOUNCEMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_UPDATE_GROUP_ANNOUNCEMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_POST_GROUP_ANNOUNCEMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DELETE_GROUP_ANNOUNCEMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_MEMBER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_MEMBER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_PRIVATE_CHAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_PRIVATE_CHAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_MEMBER_MENTION_OTHER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_MEMBER_MENTION_OTHER.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_MEMBER_SENDING_LINK.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_MEMBER_SENDING_LINK.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_MEMBER_ADD_MEMBER.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_MEMBER_ADD_MEMBER.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_SHARING_INVITATION_QR_CODE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_SHARING_INVITATION_QR_CODE.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_CREATE_GROUP.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISBAND_GROUP.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADD_CONTACT.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_GROUP_TRANSFER_OWNERSHIP.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_GROUP_VOICE_CALL_START.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_CHANGE_GROUP_NAME.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_CHANGE_GROUP_AVATAR.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_ASSET_VERIFICATION.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_UPDATE_ASSET_VERIFICATION.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_ASSET_VERIFICATION.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_PAID_GROUP_BILLING.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_UPDATE_PAID_GROUP_BILLING.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_PAID_GROUP_BILLING.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr2[SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_CONVERT_PRIVATE_TO_PUBLIC_GROUP.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[InHouseIMContentType.values().length];
            try {
                iArr3[InHouseIMContentType.ReadReceipt.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr3[InHouseIMContentType.TypingIndicator.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr3[InHouseIMContentType.RecallMessageByAdmin.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr3[InHouseIMContentType.RecallMessageBySender.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr3[InHouseIMContentType.RecallMessageBySenderServer.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr3[InHouseIMContentType.RecallMessageByAdminServer.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr3[InHouseIMContentType.Text.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr3[InHouseIMContentType.Image.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                iArr3[InHouseIMContentType.Video.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr3[InHouseIMContentType.Media.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr3[InHouseIMContentType.Voice.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                iArr3[InHouseIMContentType.Share.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                iArr3[InHouseIMContentType.SystemMessage.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                iArr3[InHouseIMContentType.Custom.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                iArr3[InHouseIMContentType.VoiceCall.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                iArr3[InHouseIMContentType.GroupInvitation.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                iArr3[InHouseIMContentType.STICKER.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                iArr3[InHouseIMContentType.StreamPlaceHolder.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            AEQbTJ = iArr3;
            int[] iArr4 = new int[ContactRelationType.values().length];
            try {
                iArr4[ContactRelationType.STRANGER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                iArr4[ContactRelationType.ONE_WAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                iArr4[ContactRelationType.TWO_WAY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            copydefault = iArr4;
            int[] iArr5 = new int[OKMessage.SentStatus.values().length];
            try {
                iArr5[OKMessage.SentStatus.FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            KWHzl = iArr5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1319=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKConversation OLrzqt(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        java.lang.Integer intOrNull;
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        OKConversationType oKConversationTypeCopydefault = sPI.copydefault(inHouseIMConversationEntity.getChannelType());
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(inHouseIMConversationEntity.getChannelId());
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(inHouseIMConversationEntity.getRelatedId());
        java.lang.String bizGroupName = inHouseIMConversationEntity.getBizGroupName();
        java.lang.String strGEmmrt3 = (bizGroupName == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizGroupName)) ? C33129mqd.gEmmrt(KWHzl(inHouseIMConversationEntity.getNickname(), inHouseIMConversationEntity.getEnNickname())) : inHouseIMConversationEntity.getBizGroupName();
        java.lang.String bizGroupName2 = inHouseIMConversationEntity.getBizGroupName();
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(KWHzl(inHouseIMConversationEntity.getNickname(), inHouseIMConversationEntity.getEnNickname()));
        java.lang.String avatar = inHouseIMConversationEntity.getAvatar();
        long lastUserMessageSendTime = inHouseIMConversationEntity.getLastUserMessageSendTime();
        OfficialTagInfo officialTagInfoKWHzl = KWHzl(inHouseIMConversationEntity.getTags(), inHouseIMConversationEntity.getChannelType());
        int unreadCount = inHouseIMConversationEntity.getUnreadCount();
        boolean z = inHouseIMConversationEntity.getPinnedStatus() == 1;
        java.lang.Integer muteStatus = inHouseIMConversationEntity.getMuteStatus();
        boolean z2 = muteStatus != null && muteStatus.intValue() == ReceiveMessageOptionType.RECEIVE_SILENTLY.getApiValue();
        DraftMessageModel draftMessage = inHouseIMConversationEntity.getDraftMessage();
        int unreadMentionedCount = inHouseIMConversationEntity.getUnreadMentionedCount();
        java.lang.Integer unreadMentionedType = inHouseIMConversationEntity.getUnreadMentionedType();
        InGroupStatus inGroupStatusOLrzqt = inHouseIMConversationEntity.getInGroupStatus() == null ? InGroupStatus.UNKNOWN : InGroupStatus.Companion.OLrzqt(inHouseIMConversationEntity.getInGroupStatus());
        GroupStatus groupStatusOLrzqt = inHouseIMConversationEntity.getGroupStatus() == null ? GroupStatus.UNKNOWN : GroupStatus.Companion.OLrzqt(inHouseIMConversationEntity.getGroupStatus());
        GroupTagType groupTagTypeCopydefault = GroupTagType.Companion.copydefault(inHouseIMConversationEntity.getGroupType());
        int role = inHouseIMConversationEntity.getRole();
        ConversationStatus conversationStatusCopydefault = ConversationStatus.Companion.copydefault(inHouseIMConversationEntity.getConversationStatus());
        java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(inHouseIMConversationEntity.getLastReadMsgSeq());
        java.lang.String strGEmmrt6 = C33129mqd.gEmmrt(inHouseIMConversationEntity.getStartMsgSeq());
        java.lang.Integer groupType = inHouseIMConversationEntity.getGroupType();
        java.util.List<ConversationIcon> conversationIcons = inHouseIMConversationEntity.getConversationIcons();
        JsonElement entityInfoExtra = inHouseIMConversationEntity.getEntityInfoExtra();
        if (entityInfoExtra != null) {
            try {
                Result.Application application = Result.Companion;
                obj = JsonElementKt.getJsonObject(entityInfoExtra).get((java.lang.Object) "disbandServiceScenarioType");
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (obj == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            JsonElement jsonElement = (JsonElement) obj;
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Integer.class);
            if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                intOrNull = JsonElementKt.getIntOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                if (!(intOrNull instanceof java.lang.Integer)) {
                    intOrNull = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(intOrNull);
                obj = (java.lang.Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            } else {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object content = JsonElementKt.getJsonPrimitive(jsonElement).getContent();
                    if (!(content instanceof java.lang.Integer)) {
                        content = null;
                    }
                    intOrNull = (java.lang.Integer) content;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object booleanOrNull = JsonElementKt.getBooleanOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(booleanOrNull instanceof java.lang.Integer)) {
                        booleanOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) booleanOrNull;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object longOrNull = JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(longOrNull instanceof java.lang.Integer)) {
                        longOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) longOrNull;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object doubleOrNull = JsonElementKt.getDoubleOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(doubleOrNull instanceof java.lang.Integer)) {
                        doubleOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) doubleOrNull;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object floatOrNull = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(floatOrNull instanceof java.lang.Integer)) {
                        floatOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) floatOrNull;
                } else {
                    intOrNull = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(intOrNull);
                obj = (java.lang.Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        return new OKConversation(oKConversationTypeCopydefault, strGEmmrt, strGEmmrt2, strGEmmrt3, bizGroupName2, strGEmmrt4, avatar, unreadCount, unreadMentionedCount, unreadMentionedType, z, false, z2, (OKMessageContent) null, (OKMessage.SentStatus) null, 0L, lastUserMessageSendTime, (java.lang.String) null, draftMessage, officialTagInfoKWHzl, (java.lang.Integer) null, true, inGroupStatusOLrzqt, groupStatusOLrzqt, groupTagTypeCopydefault, java.lang.Integer.valueOf(role), (java.lang.String) null, conversationStatusCopydefault, strGEmmrt5, strGEmmrt6, groupType, (java.util.List) conversationIcons, (java.lang.Integer) obj, 68347904, 0, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1331=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v63, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKConversation AEQbTJ(@NotNull InHouseIMConversationListData inHouseIMConversationListData) {
        OKMessage.SentStatus sentStatus;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        java.lang.Integer intOrNull;
        Intrinsics.checkNotNullParameter(inHouseIMConversationListData, "");
        OKConversationType oKConversationTypeCopydefault = sPI.copydefault(inHouseIMConversationListData.getChannelType());
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(inHouseIMConversationListData.getChannelId());
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(inHouseIMConversationListData.getRelatedId());
        java.lang.String strOLrzqt = OLrzqt(inHouseIMConversationListData);
        java.lang.String bizGroupName = inHouseIMConversationListData.getBizGroupName();
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(KWHzl(inHouseIMConversationListData.getNickname(), inHouseIMConversationListData.getEnNickname()));
        java.lang.String avatar = inHouseIMConversationListData.getAvatar();
        long lastUserMessageSendTime = inHouseIMConversationListData.getLastUserMessageSendTime();
        InHouseIMMessageEntity lastUserMsg = inHouseIMConversationListData.getLastUserMsg();
        OKMessageContent oKMessageContentEZpvd = lastUserMsg != null ? EZpvd(lastUserMsg, true) : null;
        InHouseIMMessageEntity lastUserMsg2 = inHouseIMConversationListData.getLastUserMsg();
        if (lastUserMsg2 != null) {
            int sentStatus2 = lastUserMsg2.getSentStatus();
            sentStatus = sentStatus2 != 1 ? sentStatus2 != 2 ? OKMessage.SentStatus.SENT : OKMessage.SentStatus.FAILED : OKMessage.SentStatus.SENDING;
        } else {
            sentStatus = null;
        }
        OfficialTagInfo officialTagInfoKWHzl = KWHzl(inHouseIMConversationListData.getTags(), inHouseIMConversationListData.getChannelType());
        int unreadCount = inHouseIMConversationListData.getUnreadCount();
        boolean z = inHouseIMConversationListData.getPinnedStatus() == 1;
        boolean z2 = inHouseIMConversationListData.isFlagged() == 1;
        java.lang.Integer muteStatus = inHouseIMConversationListData.getMuteStatus();
        boolean z3 = muteStatus != null && muteStatus.intValue() == ReceiveMessageOptionType.RECEIVE_SILENTLY.getApiValue();
        DraftMessageModel draftMessage = inHouseIMConversationListData.getDraftMessage();
        int unreadMentionedCount = inHouseIMConversationListData.getUnreadMentionedCount();
        java.lang.Integer unreadMentionedType = inHouseIMConversationListData.getUnreadMentionedType();
        InGroupStatus inGroupStatusOLrzqt = inHouseIMConversationListData.getInGroupStatus() == null ? InGroupStatus.UNKNOWN : InGroupStatus.Companion.OLrzqt(inHouseIMConversationListData.getInGroupStatus());
        GroupStatus groupStatusOLrzqt = inHouseIMConversationListData.getGroupStatus() == null ? GroupStatus.UNKNOWN : GroupStatus.Companion.OLrzqt(inHouseIMConversationListData.getGroupStatus());
        GroupTagType groupTagTypeCopydefault = GroupTagType.Companion.copydefault(inHouseIMConversationListData.getGroupType());
        java.lang.Integer role = inHouseIMConversationListData.getRole();
        java.lang.String extra = inHouseIMConversationListData.getExtra();
        ConversationStatus conversationStatusCopydefault = ConversationStatus.Companion.copydefault(inHouseIMConversationListData.getConversationStatus());
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(inHouseIMConversationListData.getLastReadMsgSeq());
        java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(inHouseIMConversationListData.getStartMsgSeq());
        java.util.List<ConversationIcon> conversationIcons = inHouseIMConversationListData.getConversationIcons();
        JsonElement entityInfoExtra = inHouseIMConversationListData.getEntityInfoExtra();
        if (entityInfoExtra != null) {
            try {
                Result.Application application = Result.Companion;
                obj = JsonElementKt.getJsonObject(entityInfoExtra).get((java.lang.Object) "disbandServiceScenarioType");
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (obj == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            JsonElement jsonElement = (JsonElement) obj;
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Integer.class);
            if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                intOrNull = JsonElementKt.getIntOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                if (!(intOrNull instanceof java.lang.Integer)) {
                    intOrNull = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(intOrNull);
                obj = (java.lang.Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            } else {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object content = JsonElementKt.getJsonPrimitive(jsonElement).getContent();
                    if (!(content instanceof java.lang.Integer)) {
                        content = null;
                    }
                    intOrNull = (java.lang.Integer) content;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object booleanOrNull = JsonElementKt.getBooleanOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(booleanOrNull instanceof java.lang.Integer)) {
                        booleanOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) booleanOrNull;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object longOrNull = JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(longOrNull instanceof java.lang.Integer)) {
                        longOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) longOrNull;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object doubleOrNull = JsonElementKt.getDoubleOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(doubleOrNull instanceof java.lang.Integer)) {
                        doubleOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) doubleOrNull;
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object floatOrNull = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
                    if (!(floatOrNull instanceof java.lang.Integer)) {
                        floatOrNull = null;
                    }
                    intOrNull = (java.lang.Integer) floatOrNull;
                } else {
                    intOrNull = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(intOrNull);
                obj = (java.lang.Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        return new OKConversation(oKConversationTypeCopydefault, strGEmmrt, strGEmmrt2, strOLrzqt, bizGroupName, strGEmmrt3, avatar, unreadCount, unreadMentionedCount, unreadMentionedType, z, z2, z3, oKMessageContentEZpvd, sentStatus, 0L, lastUserMessageSendTime, (java.lang.String) null, draftMessage, officialTagInfoKWHzl, (java.lang.Integer) null, true, inGroupStatusOLrzqt, groupStatusOLrzqt, groupTagTypeCopydefault, role, extra, conversationStatusCopydefault, strGEmmrt4, strGEmmrt5, (java.lang.Integer) null, (java.util.List) conversationIcons, (java.lang.Integer) obj, 1074954240, 0, (DefaultConstructorMarker) null);
    }

    public static final com.okinc.okimcore.model.remote.UserInfo KWHzl(@NotNull InHouseUserInfo inHouseUserInfo) {
        java.lang.Integer allowInAppNotification;
        java.lang.Integer allowContactDiscovery;
        java.lang.String string;
        java.lang.Integer allowAutoJoinGroup;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(inHouseUserInfo, "");
        java.lang.String userUid = inHouseUserInfo.getUserUid();
        java.lang.String nickname = inHouseUserInfo.getNickname();
        java.lang.String enNickname = inHouseUserInfo.getEnNickname();
        java.lang.String avatar = inHouseUserInfo.getAvatar();
        java.util.List<UserTagType> tags = inHouseUserInfo.getTags();
        OfficialTagInfo officialTagInfoCopydefault = tags != null ? copydefault(tags) : null;
        UserPrivacySettingsDto userPrivacySettingsDto = inHouseUserInfo.getUserPrivacySettingsDto();
        java.lang.String str = (userPrivacySettingsDto == null || (allowAutoJoinGroup = userPrivacySettingsDto.getAllowAutoJoinGroup()) == null || (string2 = allowAutoJoinGroup.toString()) == null) ? "1" : string2;
        UserPrivacySettingsDto userPrivacySettingsDto2 = inHouseUserInfo.getUserPrivacySettingsDto();
        java.lang.String str2 = (userPrivacySettingsDto2 == null || (allowContactDiscovery = userPrivacySettingsDto2.getAllowContactDiscovery()) == null || (string = allowContactDiscovery.toString()) == null) ? "1" : string;
        UserGlobalPermissionDto userGlobalPermissionDto = inHouseUserInfo.getUserGlobalPermissionDto();
        java.lang.Boolean generateQrCode = userGlobalPermissionDto != null ? userGlobalPermissionDto.getGenerateQrCode() : null;
        UserGlobalPermissionDto userGlobalPermissionDto2 = inHouseUserInfo.getUserGlobalPermissionDto();
        java.lang.Boolean createGroup = userGlobalPermissionDto2 != null ? userGlobalPermissionDto2.getCreateGroup() : null;
        UserGlobalPermissionDto userGlobalPermissionDto3 = inHouseUserInfo.getUserGlobalPermissionDto();
        java.lang.Boolean searchUuid = userGlobalPermissionDto3 != null ? userGlobalPermissionDto3.getSearchUuid() : null;
        java.lang.Long phoneSyncQuota = inHouseUserInfo.getPhoneSyncQuota();
        UserPrivacySettingsDto userPrivacySettingsDto3 = inHouseUserInfo.getUserPrivacySettingsDto();
        int iIntValue = (userPrivacySettingsDto3 == null || (allowInAppNotification = userPrivacySettingsDto3.getAllowInAppNotification()) == null) ? 0 : allowInAppNotification.intValue();
        UserPrivacySettingsDto userPrivacySettingsDto4 = inHouseUserInfo.getUserPrivacySettingsDto();
        return new com.okinc.okimcore.model.remote.UserInfo(userUid, avatar, (java.lang.Integer) null, nickname, enNickname, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str, str2, (java.lang.Long) null, officialTagInfoCopydefault, generateQrCode, createGroup, searchUuid, phoneSyncQuota, java.lang.Integer.valueOf(iIntValue), userPrivacySettingsDto4 != null ? userPrivacySettingsDto4.getAllowChatViaProfile() : null, 5092, (DefaultConstructorMarker) null);
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            return C33129mqd.gEmmrt(str);
        }
        return (str2 == null || str2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? C33129mqd.gEmmrt(str) : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull android.content.Context context, @NotNull Continuation<? super InHouseIMMessageRequest> continuation) {
        InHouseXKt$toInHouseIMPendingMessage$1 inHouseXKt$toInHouseIMPendingMessage$1;
        java.lang.String strCopydefault;
        InHouseIMChannelType inHouseIMChannelType;
        OKMessage oKMessage2;
        java.lang.Object wSSendMessageDetailData$default;
        if (continuation instanceof InHouseXKt$toInHouseIMPendingMessage$1) {
            inHouseXKt$toInHouseIMPendingMessage$1 = (InHouseXKt$toInHouseIMPendingMessage$1) continuation;
            int i = inHouseXKt$toInHouseIMPendingMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseXKt$toInHouseIMPendingMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseXKt$toInHouseIMPendingMessage$1 = new InHouseXKt$toInHouseIMPendingMessage$1(continuation);
            }
        }
        InHouseXKt$toInHouseIMPendingMessage$1 inHouseXKt$toInHouseIMPendingMessage$12 = inHouseXKt$toInHouseIMPendingMessage$1;
        java.lang.Object obj = inHouseXKt$toInHouseIMPendingMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseXKt$toInHouseIMPendingMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C44157sFk.gEmmrt().values()) {
                strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
            } else {
                strCopydefault = sFM.copydefault.copydefault();
            }
            java.lang.String str = strCopydefault;
            java.lang.String targetId = oKMessage.getTargetId();
            InHouseIMContentType inHouseIMContentType = InHouseIMContentType.Unknown;
            int i3 = ActionBar.OLrzqt[oKMessage.getConversationType().ordinal()];
            if (i3 == 1) {
                inHouseIMChannelType = InHouseIMChannelType.Unknown;
            } else if (i3 == 2) {
                inHouseIMChannelType = InHouseIMChannelType.Individual;
            } else {
                inHouseIMChannelType = InHouseIMChannelType.Group;
            }
            WSSendMessageDetailData wSSendMessageDetailData = new WSSendMessageDetailData(str, targetId, inHouseIMContentType, inHouseIMChannelType, (InHouseIMPlatformType) null, (java.lang.Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) null, (StickerMessageData) null, (ReadReceiptMessageData) null, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (java.lang.Long) null, (JsonElement) null, (java.lang.Integer) null, oKMessage.getClientMessageId(), (java.util.List) null, (FrontendOption) null, (java.lang.Long) null, (WSSendReactionResponse) null, (java.util.List) null, -134217744, 1, (DefaultConstructorMarker) null);
            OKMessageContent content = oKMessage.getContent();
            if (content != null) {
                java.lang.String extra = oKMessage.getExtra();
                oKMessage2 = oKMessage;
                inHouseXKt$toInHouseIMPendingMessage$12.L$0 = oKMessage2;
                inHouseXKt$toInHouseIMPendingMessage$12.label = 1;
                wSSendMessageDetailData$default = toWSSendMessageDetailData$default(content, inHouseIMUploadMediaService, wSSendMessageDetailData, context, false, extra, inHouseXKt$toInHouseIMPendingMessage$12, 8, null);
                if (wSSendMessageDetailData$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                oKMessage2 = oKMessage;
                throw new OKIMException("Failed to create WSSendMessage -> " + oKMessage2.getContent(), 0, 2, (DefaultConstructorMarker) null);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OKMessage oKMessage3 = (OKMessage) inHouseXKt$toInHouseIMPendingMessage$12.L$0;
            C56391yDq.AEQbTJ(obj);
            wSSendMessageDetailData$default = obj;
            oKMessage2 = oKMessage3;
        }
        WSSendMessageDetailData wSSendMessageDetailData2 = (WSSendMessageDetailData) wSSendMessageDetailData$default;
        if (wSSendMessageDetailData2 != null) {
            return new InHouseIMMessageRequest(oKMessage2.getTargetId(), wSSendMessageDetailData2);
        }
        throw new OKIMException("Failed to create WSSendMessage -> " + oKMessage2.getContent(), 0, 2, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0362  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.okinc.okimcore.model.im.OKMessageContent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull OKMessageContent oKMessageContent, InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull android.content.Context context, boolean z, java.lang.String str, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseXKt$toWSSendMessageDetailData$1 inHouseXKt$toWSSendMessageDetailData$1;
        java.lang.String str2;
        WSSendMessageDetailData wSSendMessageDetailDataCopy;
        WSSendMessageDetailData wSSendMessageDetailDataOLrzqt;
        WSSendMessageDetailData wSSendMessageDetailData2;
        WSSendMessageDetailData wSSendMessageDetailDataKWHzl;
        ?? r0;
        WSSendMessageDetailData wSSendMessageDetailData3;
        ?? r02;
        ?? r03;
        ?? r04;
        ?? r05;
        ?? r06;
        ?? r07;
        WSSendMessageDetailData wSSendMessageDetailData4;
        ?? r08;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        JsonObject jsonObject;
        java.lang.Object jsonObject2;
        java.lang.Object jsonObject3;
        ?? r09;
        ?? r010;
        ?? r011;
        ?? r012 = oKMessageContent;
        java.lang.String str3 = str;
        if (continuation instanceof InHouseXKt$toWSSendMessageDetailData$1) {
            inHouseXKt$toWSSendMessageDetailData$1 = (InHouseXKt$toWSSendMessageDetailData$1) continuation;
            int i = inHouseXKt$toWSSendMessageDetailData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseXKt$toWSSendMessageDetailData$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseXKt$toWSSendMessageDetailData$1 = new InHouseXKt$toWSSendMessageDetailData$1(continuation);
            }
        }
        InHouseXKt$toWSSendMessageDetailData$1 inHouseXKt$toWSSendMessageDetailData$12 = inHouseXKt$toWSSendMessageDetailData$1;
        java.lang.Object objOLrzqt = inHouseXKt$toWSSendMessageDetailData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (inHouseXKt$toWSSendMessageDetailData$12.label) {
            case 0:
                C56391yDq.AEQbTJ(objOLrzqt);
                if (r012 instanceof OKTextMessage) {
                    wSSendMessageDetailDataKWHzl = C44164sFr.EZpvd(wSSendMessageDetailData, (OKTextMessage) r012);
                    r04 = r012;
                } else if (r012 instanceof OKGIFMessage) {
                    inHouseXKt$toWSSendMessageDetailData$12.L$0 = r012;
                    inHouseXKt$toWSSendMessageDetailData$12.L$1 = str3;
                    inHouseXKt$toWSSendMessageDetailData$12.label = 1;
                    objOLrzqt = C44164sFr.copydefault(wSSendMessageDetailData, (OKGIFMessage) r012, inHouseIMUploadMediaService, z, context, inHouseXKt$toWSSendMessageDetailData$12);
                    r0 = r012;
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                    r05 = r0;
                    wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                    r04 = r05;
                } else if (r012 instanceof OKImageMessage) {
                    inHouseXKt$toWSSendMessageDetailData$12.L$0 = r012;
                    inHouseXKt$toWSSendMessageDetailData$12.L$1 = str3;
                    inHouseXKt$toWSSendMessageDetailData$12.label = 2;
                    objOLrzqt = C44164sFr.EZpvd(wSSendMessageDetailData, (OKImageMessage) r012, inHouseIMUploadMediaService, z, context, inHouseXKt$toWSSendMessageDetailData$12);
                    r02 = r012;
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                    r05 = r02;
                    wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                    r04 = r05;
                } else if (r012 instanceof OKSightMessage) {
                    inHouseXKt$toWSSendMessageDetailData$12.L$0 = r012;
                    inHouseXKt$toWSSendMessageDetailData$12.L$1 = str3;
                    inHouseXKt$toWSSendMessageDetailData$12.label = 3;
                    objOLrzqt = C44164sFr.EZpvd(wSSendMessageDetailData, (OKSightMessage) r012, inHouseIMUploadMediaService, z, context, inHouseXKt$toWSSendMessageDetailData$12);
                    r03 = r012;
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                    r05 = r03;
                    wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                    r04 = r05;
                } else if (r012 instanceof OKStickerMessage) {
                    wSSendMessageDetailDataKWHzl = C44164sFr.AEQbTJ(wSSendMessageDetailData, (OKStickerMessage) r012);
                    r04 = r012;
                } else if (r012 instanceof OKTypingIndicatorMessage) {
                    wSSendMessageDetailDataKWHzl = C44164sFr.KWHzl(wSSendMessageDetailData, (OKTypingIndicatorMessage) r012);
                    r04 = r012;
                } else {
                    if (!(r012 instanceof OKReferenceMessage)) {
                        if (r012 instanceof OKReadReceiptMessage) {
                            str3 = str;
                            wSSendMessageDetailDataCopy = wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : C44157sFk.copydefault(C44157sFk.gEmmrt()), ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : wSSendMessageDetailData.getChannelId(), ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : InHouseIMContentType.ReadReceipt, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : new ReadReceiptMessageData(C33129mqd.gEmmrt(((OKReadReceiptMessage) r012).getMessageUId())), ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
                            str2 = null;
                            r08 = r012;
                        } else {
                            if (r012 instanceof OKCustomMessage) {
                                OKCustomMessage oKCustomMessage = (OKCustomMessage) r012;
                                C44124sEe.imLogMessageDisplayModel$default(wSSendMessageDetailData.getChannelId(), "OKCustomMessage: serviceName=" + oKCustomMessage.getServiceName() + ", bizName=" + oKCustomMessage.getBizName(), null, 4, null);
                                java.lang.String strEncodeToInHouseCustomContent = (oKCustomMessage.getContent() == null || !(r012 instanceof sJU)) ? "" : ((sJU) r012).encodeToInHouseCustomContent();
                                C44124sEe.imLogMessageDisplayModel$default(wSSendMessageDetailData.getChannelId(), "OKCustomMessage: encodeToInHouseCustomContent ==>\n" + strEncodeToInHouseCustomContent, null, 4, null);
                                str2 = null;
                                wSSendMessageDetailDataOLrzqt = wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : InHouseIMContentType.Custom, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : new CustomMessageData(oKCustomMessage.getServiceName(), oKCustomMessage.getBizName(), oKCustomMessage.getPreview(), strEncodeToInHouseCustomContent, oKCustomMessage.getPushTemplate(), oKCustomMessage.m6872getPushData(), oKCustomMessage.getFrontendOption(), (java.util.List) null, 128, (DefaultConstructorMarker) null), ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
                            } else {
                                str2 = null;
                                if (r012 instanceof OKHQVoiceMessage) {
                                    inHouseXKt$toWSSendMessageDetailData$12.L$0 = r012;
                                    str3 = str;
                                    inHouseXKt$toWSSendMessageDetailData$12.L$1 = str3;
                                    inHouseXKt$toWSSendMessageDetailData$12.label = 5;
                                    objOLrzqt = C44164sFr.AEQbTJ(wSSendMessageDetailData, (OKHQVoiceMessage) r012, inHouseIMUploadMediaService, z, context, inHouseXKt$toWSSendMessageDetailData$12);
                                    r07 = r012;
                                    if (objOLrzqt == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    wSSendMessageDetailData4 = (WSSendMessageDetailData) objOLrzqt;
                                    r010 = r07;
                                    wSSendMessageDetailData2 = wSSendMessageDetailData4;
                                    r09 = r010;
                                    wSSendMessageDetailDataCopy = wSSendMessageDetailData2;
                                    r08 = r09;
                                } else {
                                    str3 = str;
                                    if (r012 instanceof OKFileMessage) {
                                        inHouseXKt$toWSSendMessageDetailData$12.L$0 = r012;
                                        inHouseXKt$toWSSendMessageDetailData$12.L$1 = str3;
                                        inHouseXKt$toWSSendMessageDetailData$12.label = 6;
                                        objOLrzqt = C44164sFr.OLrzqt(wSSendMessageDetailData, (OKFileMessage) r012, inHouseIMUploadMediaService, z, context, inHouseXKt$toWSSendMessageDetailData$12);
                                        r011 = r012;
                                        if (objOLrzqt == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        wSSendMessageDetailData4 = (WSSendMessageDetailData) objOLrzqt;
                                        r010 = r011;
                                        wSSendMessageDetailData2 = wSSendMessageDetailData4;
                                        r09 = r010;
                                        wSSendMessageDetailDataCopy = wSSendMessageDetailData2;
                                        r08 = r09;
                                    } else if (r012 instanceof OKIMStartVoiceCallMessage) {
                                        OKIMStartVoiceCallMessage oKIMStartVoiceCallMessage = (OKIMStartVoiceCallMessage) r012;
                                        wSSendMessageDetailDataOLrzqt = wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : C44157sFk.copydefault(C44157sFk.gEmmrt()), ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : wSSendMessageDetailData.getChannelId(), ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : InHouseIMContentType.VoiceCall, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : new CallMessageData(oKIMStartVoiceCallMessage.getCallType(), oKIMStartVoiceCallMessage.getSignalType(), oKIMStartVoiceCallMessage.getDuration(), oKIMStartVoiceCallMessage.getCallerUid(), oKIMStartVoiceCallMessage.getErrorCode()), ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
                                    } else if (r012 instanceof OKReactionMessage) {
                                        wSSendMessageDetailDataOLrzqt = C44164sFr.OLrzqt(wSSendMessageDetailData, (OKMessageContent) r012);
                                    } else {
                                        str3 = str;
                                        wSSendMessageDetailDataCopy = null;
                                        r08 = r012;
                                    }
                                }
                            }
                            str3 = str;
                            wSSendMessageDetailData2 = wSSendMessageDetailDataOLrzqt;
                            r09 = r012;
                            wSSendMessageDetailDataCopy = wSSendMessageDetailData2;
                            r08 = r09;
                        }
                        if (wSSendMessageDetailDataCopy != null) {
                            return str2;
                        }
                        try {
                            Result.Application application = Result.Companion;
                            java.lang.String extra = r08.getExtra();
                            if (extra == null) {
                                jsonObject3 = str2;
                                objM7377constructorimpl = Result.m7377constructorimpl(jsonObject3);
                            } else {
                                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) extra))) {
                                    extra = str2;
                                }
                                if (extra != null) {
                                    jsonObject3 = JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(extra));
                                }
                                objM7377constructorimpl = Result.m7377constructorimpl(jsonObject3);
                            }
                            break;
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        java.lang.Object obj = objM7377constructorimpl;
                        if (Result.m7383isFailureimpl(obj)) {
                            obj = str2;
                        }
                        JsonObject jsonObject4 = (JsonObject) obj;
                        try {
                            Result.Application application3 = Result.Companion;
                            if (str3 == null) {
                                jsonObject2 = str2;
                                objM7377constructorimpl2 = Result.m7377constructorimpl(jsonObject2);
                            } else {
                                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3))) {
                                    str3 = str2;
                                }
                                if (str3 != null) {
                                    jsonObject2 = JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(str3));
                                }
                                objM7377constructorimpl2 = Result.m7377constructorimpl(jsonObject2);
                            }
                            break;
                        } catch (java.lang.Throwable th2) {
                            Result.Application application4 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                        }
                        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                            objM7377constructorimpl2 = str2;
                        }
                        JsonObject jsonObject5 = (JsonObject) objM7377constructorimpl2;
                        if (jsonObject4 == null || jsonObject5 == null) {
                            jsonObject = jsonObject4 == null ? jsonObject5 : jsonObject4;
                        } else {
                            jsonObject = new JsonObject(C56424yEw.OLrzqt(jsonObject4, jsonObject5));
                        }
                        return wSSendMessageDetailDataCopy.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailDataCopy.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailDataCopy.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailDataCopy.contentType : null, ((-17039376) & 8) != 0 ? wSSendMessageDetailDataCopy.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailDataCopy.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailDataCopy.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailDataCopy.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailDataCopy.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailDataCopy.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailDataCopy.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailDataCopy.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailDataCopy.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailDataCopy.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailDataCopy.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailDataCopy.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailDataCopy.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailDataCopy.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailDataCopy.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailDataCopy.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailDataCopy.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailDataCopy.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailDataCopy.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailDataCopy.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailDataCopy.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailDataCopy.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailDataCopy.extra : jsonObject, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailDataCopy.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailDataCopy.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailDataCopy.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailDataCopy.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailDataCopy.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailDataCopy.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailDataCopy.reactionDisplay : null);
                    }
                    inHouseXKt$toWSSendMessageDetailData$12.L$0 = r012;
                    inHouseXKt$toWSSendMessageDetailData$12.L$1 = str3;
                    inHouseXKt$toWSSendMessageDetailData$12.label = 4;
                    objOLrzqt = C44164sFr.copydefault(wSSendMessageDetailData, (OKReferenceMessage) r012, inHouseIMUploadMediaService, z, context, inHouseXKt$toWSSendMessageDetailData$12);
                    r06 = r012;
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                    r05 = r06;
                    wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                    r04 = r05;
                }
                wSSendMessageDetailDataCopy = wSSendMessageDetailDataKWHzl;
                str2 = null;
                r08 = r04;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            case 1:
                java.lang.String str4 = (java.lang.String) inHouseXKt$toWSSendMessageDetailData$12.L$1;
                OKMessageContent oKMessageContent2 = (OKMessageContent) inHouseXKt$toWSSendMessageDetailData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str3 = str4;
                r0 = oKMessageContent2;
                wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                r05 = r0;
                wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                r04 = r05;
                wSSendMessageDetailDataCopy = wSSendMessageDetailDataKWHzl;
                str2 = null;
                r08 = r04;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            case 2:
                java.lang.String str5 = (java.lang.String) inHouseXKt$toWSSendMessageDetailData$12.L$1;
                OKMessageContent oKMessageContent3 = (OKMessageContent) inHouseXKt$toWSSendMessageDetailData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str3 = str5;
                r02 = oKMessageContent3;
                wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                r05 = r02;
                wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                r04 = r05;
                wSSendMessageDetailDataCopy = wSSendMessageDetailDataKWHzl;
                str2 = null;
                r08 = r04;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            case 3:
                java.lang.String str6 = (java.lang.String) inHouseXKt$toWSSendMessageDetailData$12.L$1;
                OKMessageContent oKMessageContent4 = (OKMessageContent) inHouseXKt$toWSSendMessageDetailData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str3 = str6;
                r03 = oKMessageContent4;
                wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                r05 = r03;
                wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                r04 = r05;
                wSSendMessageDetailDataCopy = wSSendMessageDetailDataKWHzl;
                str2 = null;
                r08 = r04;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            case 4:
                java.lang.String str7 = (java.lang.String) inHouseXKt$toWSSendMessageDetailData$12.L$1;
                OKMessageContent oKMessageContent5 = (OKMessageContent) inHouseXKt$toWSSendMessageDetailData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str3 = str7;
                r06 = oKMessageContent5;
                wSSendMessageDetailData3 = (WSSendMessageDetailData) objOLrzqt;
                r05 = r06;
                wSSendMessageDetailDataKWHzl = wSSendMessageDetailData3;
                r04 = r05;
                wSSendMessageDetailDataCopy = wSSendMessageDetailDataKWHzl;
                str2 = null;
                r08 = r04;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            case 5:
                java.lang.String str8 = (java.lang.String) inHouseXKt$toWSSendMessageDetailData$12.L$1;
                OKMessageContent oKMessageContent6 = (OKMessageContent) inHouseXKt$toWSSendMessageDetailData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str3 = str8;
                r07 = oKMessageContent6;
                str2 = null;
                wSSendMessageDetailData4 = (WSSendMessageDetailData) objOLrzqt;
                r010 = r07;
                wSSendMessageDetailData2 = wSSendMessageDetailData4;
                r09 = r010;
                wSSendMessageDetailDataCopy = wSSendMessageDetailData2;
                r08 = r09;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            case 6:
                java.lang.String str9 = (java.lang.String) inHouseXKt$toWSSendMessageDetailData$12.L$1;
                OKMessageContent oKMessageContent7 = (OKMessageContent) inHouseXKt$toWSSendMessageDetailData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str3 = str9;
                r011 = oKMessageContent7;
                str2 = null;
                wSSendMessageDetailData4 = (WSSendMessageDetailData) objOLrzqt;
                r010 = r011;
                wSSendMessageDetailData2 = wSSendMessageDetailData4;
                r09 = r010;
                wSSendMessageDetailDataCopy = wSSendMessageDetailData2;
                r08 = r09;
                if (wSSendMessageDetailDataCopy != null) {
                }
                break;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ java.lang.Object toWSSendMessageDetailData$default(OKMessageContent oKMessageContent, InHouseIMUploadMediaService inHouseIMUploadMediaService, WSSendMessageDetailData wSSendMessageDetailData, android.content.Context context, boolean z, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = null;
        }
        return EZpvd(oKMessageContent, inHouseIMUploadMediaService, wSSendMessageDetailData, context, z2, str, continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.GroupVoiceCallData.copy$default(com.okinc.okimcore.model.im.GroupVoiceCallData, java.lang.String, java.util.List, java.util.List, java.lang.Integer, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, int, java.lang.Object):com.okinc.okimcore.model.im.GroupVoiceCallData */
    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig.copy$default(com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig, java.lang.Integer, java.lang.Long, com.okinc.okimcore.model.im.GroupVoiceCallData, int, java.lang.Object):com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig */
    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity.copy$default(com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, int, int, int, java.lang.Integer, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.Double, int, long, long, long, int, java.util.List, com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity, java.util.Map, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo, com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo, com.okinc.okimcore.model.im.group.GroupPublicType, com.okinc.okimcore.model.remote.InHouseIMGroupCampaign, java.util.List, com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig, int, int, java.lang.Object):com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity */
    /* JADX DEBUG: Type inference failed for r3v9. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InHouseIMGroupEntity copydefault(@NotNull InHouseIMGroupInfo inHouseIMGroupInfo) {
        GroupVoiceCallConfig groupVoiceCallConfigCopy$default;
        java.lang.String groupId;
        java.lang.String memberAlias;
        InHouseUserInfo userInfo;
        java.lang.String enNickname;
        InHouseUserInfo userInfo2;
        java.lang.Long editTime;
        java.lang.String content;
        java.lang.String id;
        InHouseUserInfo userInfo3;
        InHouseUserInfo userInfo4;
        InHouseUserInfo userInfo5;
        InHouseUserInfo userInfo6;
        java.lang.Integer role;
        GroupVoiceCallData groupVoiceCallDataCopy;
        java.lang.Boolean addInvitee;
        java.lang.Boolean transferOwner;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(inHouseIMGroupInfo, "");
        java.lang.String nickname = null;
        OfficialTagInfo officialTagInfo = Intrinsics.EZpvd(inHouseIMGroupInfo.isOfficialGroup(), java.lang.Boolean.TRUE) ? new OfficialTagInfo((java.util.List) null, (java.util.List) null, (java.util.List) null, C56402yEa.EZpvd(OfficialTagType.OfficialGroup), 7, (DefaultConstructorMarker) null) : null;
        InHouseIMGroupEntity inHouseIMGroupEntity = new InHouseIMGroupEntity(null, null, null, null, null, null, 0L, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0L, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2097151, null);
        java.lang.String groupId2 = inHouseIMGroupInfo.getGroupId();
        java.lang.String str2 = groupId2 == null ? "" : groupId2;
        java.lang.String groupName = inHouseIMGroupInfo.getGroupName();
        java.lang.String str3 = groupName == null ? "" : groupName;
        java.lang.String bizGroupName = inHouseIMGroupInfo.getBizGroupName();
        java.lang.String groupAvatar = inHouseIMGroupInfo.getGroupAvatar();
        java.lang.String str4 = groupAvatar == null ? "" : groupAvatar;
        java.lang.String groupDescription = inHouseIMGroupInfo.getGroupDescription();
        java.lang.String str5 = groupDescription == null ? "" : groupDescription;
        GroupPublicType publicType = inHouseIMGroupInfo.getPublicType();
        int rawValue = publicType != null ? publicType.getRawValue() : 0;
        java.lang.Integer allowPrivateChat = inHouseIMGroupInfo.getAllowPrivateChat();
        java.lang.Integer allowMentionRobot = inHouseIMGroupInfo.getAllowMentionRobot();
        java.lang.Integer allowMentionOthers = inHouseIMGroupInfo.getAllowMentionOthers();
        java.lang.Integer allowMembersToAddMembers = inHouseIMGroupInfo.getAllowMembersToAddMembers();
        java.lang.Integer allowSharingInvitationQrCode = inHouseIMGroupInfo.getAllowSharingInvitationQrCode();
        java.lang.Integer requireAdminApprovalToJoin = inHouseIMGroupInfo.getRequireAdminApprovalToJoin();
        java.lang.Integer pendingJoinRequests = inHouseIMGroupInfo.getPendingJoinRequests();
        InHouseIMGroupPermissionInfo userGroupPermission = inHouseIMGroupInfo.getUserGroupPermission();
        ?? BooleanValue = (userGroupPermission == null || (transferOwner = userGroupPermission.getTransferOwner()) == null) ? 0 : transferOwner.booleanValue();
        InHouseIMGroupPermissionInfo userGroupPermission2 = inHouseIMGroupInfo.getUserGroupPermission();
        ?? BooleanValue2 = (userGroupPermission2 == null || (addInvitee = userGroupPermission2.getAddInvitee()) == null) ? 0 : addInvitee.booleanValue();
        InHouseIMGroupPermissionInfo userGroupPermission3 = inHouseIMGroupInfo.getUserGroupPermission();
        GroupVoiceCallConfig groupVoiceCallConfig = inHouseIMGroupInfo.getGroupVoiceCallConfig();
        if (groupVoiceCallConfig != null) {
            GroupVoiceCallData currentCall = inHouseIMGroupInfo.getGroupVoiceCallConfig().getCurrentCall();
            if (currentCall != null) {
                groupVoiceCallDataCopy = currentCall.copy((191 & 1) != 0 ? currentCall.initiatorUid : null, (191 & 2) != 0 ? currentCall.historicalUids : null, (191 & 4) != 0 ? currentCall.activeUsers : null, (191 & 8) != 0 ? currentCall.state : null, (191 & 16) != 0 ? currentCall.startTime : null, (191 & 32) != 0 ? currentCall.targetUids : null, (191 & 64) != 0 ? currentCall.maxParticipants : inHouseIMGroupInfo.getGroupVoiceCallConfig().getMaxParticipants(), (191 & 128) != 0 ? currentCall.endTime : null);
            } else {
                groupVoiceCallDataCopy = null;
            }
            groupVoiceCallConfigCopy$default = GroupVoiceCallConfig.copy$default(groupVoiceCallConfig, null, null, groupVoiceCallDataCopy, 3, null);
        } else {
            groupVoiceCallConfigCopy$default = null;
        }
        int i = inHouseIMGroupInfo.getAllowMembersSendMessage() == 1 ? 0 : 1;
        java.lang.Integer status = inHouseIMGroupInfo.getStatus();
        int iIntValue = status != null ? status.intValue() : 0;
        java.lang.String ownerUid = inHouseIMGroupInfo.getOwnerUid();
        java.lang.String str6 = ownerUid == null ? "" : ownerUid;
        java.lang.Integer type = inHouseIMGroupInfo.getType();
        InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = new InHouseIMGroupSettingEntity();
        InHouseIMGroupMemberInfo currentUser = inHouseIMGroupInfo.getCurrentUser();
        if (currentUser == null || (groupId = currentUser.getGroupId()) == null) {
            groupId = "";
        }
        inHouseIMGroupSettingEntity.setGroupId(groupId);
        InHouseIMGroupMemberInfo currentUser2 = inHouseIMGroupInfo.getCurrentUser();
        if (currentUser2 == null || (memberAlias = currentUser2.getMemberAlias()) == null) {
            memberAlias = "";
        }
        inHouseIMGroupSettingEntity.setGroupNickName(memberAlias);
        InHouseIMGroupMemberInfo currentUser3 = inHouseIMGroupInfo.getCurrentUser();
        inHouseIMGroupSettingEntity.setRole((currentUser3 == null || (role = currentUser3.getRole()) == null) ? GroupRole.Unknown.getCode() : role.intValue());
        InHouseIMGroupMemberInfo currentUser4 = inHouseIMGroupInfo.getCurrentUser();
        java.lang.String nickname2 = (currentUser4 == null || (userInfo6 = currentUser4.getUserInfo()) == null) ? null : userInfo6.getNickname();
        if (nickname2 == null || nickname2.length() == 0) {
            InHouseIMGroupMemberInfo currentUser5 = inHouseIMGroupInfo.getCurrentUser();
            enNickname = (currentUser5 == null || (userInfo = currentUser5.getUserInfo()) == null) ? null : userInfo.getEnNickname();
        } else {
            InHouseIMGroupMemberInfo currentUser6 = inHouseIMGroupInfo.getCurrentUser();
            if (currentUser6 != null && (userInfo5 = currentUser6.getUserInfo()) != null) {
                enNickname = userInfo5.getNickname();
            }
        }
        inHouseIMGroupSettingEntity.setUserNickName(enNickname);
        InHouseIMGroupMemberInfo currentUser7 = inHouseIMGroupInfo.getCurrentUser();
        java.lang.String enNickname2 = (currentUser7 == null || (userInfo4 = currentUser7.getUserInfo()) == null) ? null : userInfo4.getEnNickname();
        if (enNickname2 == null || enNickname2.length() == 0) {
            InHouseIMGroupMemberInfo currentUser8 = inHouseIMGroupInfo.getCurrentUser();
            if (currentUser8 != null && (userInfo2 = currentUser8.getUserInfo()) != null) {
                nickname = userInfo2.getNickname();
            }
        } else {
            InHouseIMGroupMemberInfo currentUser9 = inHouseIMGroupInfo.getCurrentUser();
            if (currentUser9 != null && (userInfo3 = currentUser9.getUserInfo()) != null) {
                nickname = userInfo3.getEnNickname();
            }
        }
        inHouseIMGroupSettingEntity.setUserEnNickName(nickname);
        InHouseIMGroupAnnouncementInfo latestGroupAnnouncement = inHouseIMGroupInfo.getLatestGroupAnnouncement();
        long jLongValue = 0;
        long j = (latestGroupAnnouncement == null || (id = latestGroupAnnouncement.getId()) == null) ? 0L : java.lang.Long.parseLong(id);
        InHouseIMGroupAnnouncementInfo latestGroupAnnouncement2 = inHouseIMGroupInfo.getLatestGroupAnnouncement();
        if (latestGroupAnnouncement2 != null && (content = latestGroupAnnouncement2.getContent()) != null) {
            str = content;
        }
        InHouseIMGroupAnnouncementInfo latestGroupAnnouncement3 = inHouseIMGroupInfo.getLatestGroupAnnouncement();
        if (latestGroupAnnouncement3 != null && (editTime = latestGroupAnnouncement3.getEditTime()) != null) {
            jLongValue = editTime.longValue();
        }
        int iAhwBna = C33129mqd.AhwBna(inHouseIMGroupInfo.getMemberCount());
        java.util.List<InHouseIMGroupMemberInfo> members = inHouseIMGroupInfo.getMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(members, 10));
        java.util.Iterator it = members.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((InHouseIMGroupMemberInfo) it.next()));
        }
        return inHouseIMGroupEntity.copy((1044118784 & 1) != 0 ? inHouseIMGroupEntity.groupId : str2, (1044118784 & 2) != 0 ? inHouseIMGroupEntity.masterId : str6, (1044118784 & 4) != 0 ? inHouseIMGroupEntity.name : str3, (1044118784 & 8) != 0 ? inHouseIMGroupEntity.bizGroupName : bizGroupName, (1044118784 & 16) != 0 ? inHouseIMGroupEntity.avatar : str4, (1044118784 & 32) != 0 ? inHouseIMGroupEntity.notice : str, (1044118784 & 64) != 0 ? inHouseIMGroupEntity.noticeEditTime : jLongValue, (1044118784 & 128) != 0 ? inHouseIMGroupEntity.description : str5, (1044118784 & 256) != 0 ? inHouseIMGroupEntity.storeStatus : 0, (1044118784 & 512) != 0 ? inHouseIMGroupEntity.needVerifyStatus : rawValue, (1044118784 & 1024) != 0 ? inHouseIMGroupEntity.assetStatus : 0, (1044118784 & 2048) != 0 ? inHouseIMGroupEntity.payStatus : 0, (1044118784 & 4096) != 0 ? inHouseIMGroupEntity.assetCurrencyId : null, (1044118784 & 8192) != 0 ? inHouseIMGroupEntity.assetCurrencySymbol : null, (1044118784 & 16384) != 0 ? inHouseIMGroupEntity.assetAmount : null, (1044118784 & 32768) != 0 ? inHouseIMGroupEntity.payCurrencyId : null, (1044118784 & 65536) != 0 ? inHouseIMGroupEntity.payCurrencySymbol : null, (1044118784 & 131072) != 0 ? inHouseIMGroupEntity.payAmount : null, (1044118784 & 262144) != 0 ? inHouseIMGroupEntity.status : iIntValue, (1044118784 & 524288) != 0 ? inHouseIMGroupEntity.timestamp : 0L, (1044118784 & 1048576) != 0 ? inHouseIMGroupEntity.createTime : 0L, (1044118784 & 2097152) != 0 ? inHouseIMGroupEntity.updateTime : 0L, (1044118784 & 4194304) != 0 ? inHouseIMGroupEntity.groupCount : iAhwBna, (8388608 & 1044118784) != 0 ? inHouseIMGroupEntity.groupTopMembers : arrayList, (1044118784 & 16777216) != 0 ? inHouseIMGroupEntity.userSetting : inHouseIMGroupSettingEntity, (1044118784 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMGroupEntity.inviteFailedMap : null, (1044118784 & 67108864) != 0 ? inHouseIMGroupEntity.groupStatus : null, (1044118784 & 134217728) != 0 ? inHouseIMGroupEntity.v1Field : null, (1044118784 & 268435456) != 0 ? inHouseIMGroupEntity._v2Field : null, (1044118784 & 536870912) != 0 ? inHouseIMGroupEntity._v3Field : null, (1044118784 & 1073741824) != 0 ? inHouseIMGroupEntity.officialTagInfo : officialTagInfo, (1044118784 & Integer.MIN_VALUE) != 0 ? inHouseIMGroupEntity.isAllowSendLink : 1, (4 & 1) != 0 ? inHouseIMGroupEntity.isAllowPrivateChat : allowPrivateChat, (4 & 2) != 0 ? inHouseIMGroupEntity.isAllowSetMentionedRobot : allowMentionRobot, (4 & 4) != 0 ? inHouseIMGroupEntity.isCanAddGroupMember : 0, (4 & 8) != 0 ? inHouseIMGroupEntity.isCanAddAffiliateMember : java.lang.Integer.valueOf((int) BooleanValue2), (4 & 16) != 0 ? inHouseIMGroupEntity.isMute : java.lang.Integer.valueOf(i), (4 & 32) != 0 ? inHouseIMGroupEntity.groupNoticeId : java.lang.Long.valueOf(j), (4 & 64) != 0 ? inHouseIMGroupEntity.allowMentionOthers : allowMentionOthers, (4 & 128) != 0 ? inHouseIMGroupEntity.canTransferOwnership : java.lang.Integer.valueOf((int) BooleanValue), (4 & 256) != 0 ? inHouseIMGroupEntity.type : type, (4 & 512) != 0 ? inHouseIMGroupEntity.userGroupPermission : userGroupPermission3, (4 & 1024) != 0 ? inHouseIMGroupEntity.groupVoiceCallConfig : groupVoiceCallConfigCopy$default, (4 & 2048) != 0 ? inHouseIMGroupEntity.allowMembersToAddMembers : allowMembersToAddMembers, (4 & 4096) != 0 ? inHouseIMGroupEntity.allowSharingInvitationQrCode : allowSharingInvitationQrCode, (4 & 8192) != 0 ? inHouseIMGroupEntity.requireAdminApprovalToJoin : requireAdminApprovalToJoin, (4 & 16384) != 0 ? inHouseIMGroupEntity.pendingJoinRequests : pendingJoinRequests, (4 & 32768) != 0 ? inHouseIMGroupEntity.maxMemberCount : inHouseIMGroupInfo.getMaxMemberCount(), (4 & 65536) != 0 ? inHouseIMGroupEntity.paidGroupInfo : inHouseIMGroupInfo.getPaidGroupInfo(), (4 & 131072) != 0 ? inHouseIMGroupEntity.publicGroupType : inHouseIMGroupInfo.getPublicType(), (4 & 262144) != 0 ? inHouseIMGroupEntity.groupCampaign : inHouseIMGroupInfo.getGroupCampaign(), (4 & 524288) != 0 ? inHouseIMGroupEntity.ctas : inHouseIMGroupInfo.getCtas(), (4 & 1048576) != 0 ? inHouseIMGroupEntity.superGroupConfig : inHouseIMGroupInfo.getSuperGroupConfig());
    }

    /* JADX INFO: renamed from: o.sFw$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final OfficialTagInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, OfficialTagInfo officialTagInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = activity.KWHzl;
            }
            if ((i & 4) != 0) {
                str3 = activity.AEQbTJ;
            }
            if ((i & 8) != 0) {
                officialTagInfo = activity.copydefault;
            }
            return activity.KWHzl(str, str2, str3, officialTagInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OfficialTagInfo EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, OfficialTagInfo officialTagInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Activity(str, str2, str3, officialTagInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            OfficialTagInfo officialTagInfo = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (officialTagInfo == null ? 0 : officialTagInfo.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ParseData(displayName=" + this.OLrzqt + ", displayEnName=" + this.KWHzl + ", avatar=" + this.AEQbTJ + ", tagInfo=" + this.copydefault + ")";
        }

        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, OfficialTagInfo officialTagInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
            this.copydefault = officialTagInfo;
        }
    }

    public static final InHouseIMGroupMemberEntity EZpvd(@NotNull InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo) {
        Activity activity;
        Intrinsics.checkNotNullParameter(inHouseIMGroupMemberInfo, "");
        InHouseUserInfo userInfo = inHouseIMGroupMemberInfo.getUserInfo();
        if (userInfo != null) {
            java.lang.String nickname = userInfo.getNickname();
            java.lang.String enNickname = userInfo.getEnNickname();
            if (enNickname == null) {
                enNickname = "";
            }
            if (nickname == null || nickname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) nickname)) {
                nickname = enNickname;
            }
            java.lang.String enNickname2 = userInfo.getEnNickname();
            java.lang.String nickname2 = userInfo.getNickname();
            if (nickname2 == null) {
                nickname2 = "";
            }
            if (enNickname2 == null || enNickname2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enNickname2)) {
                enNickname2 = nickname2;
            }
            java.lang.String avatar = userInfo.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            java.util.List<UserTagType> tags = userInfo.getTags();
            activity = new Activity(nickname, enNickname2, avatar, tags != null ? copydefault(tags) : null);
        } else {
            activity = new Activity("", "", "", null);
        }
        java.lang.String groupId = inHouseIMGroupMemberInfo.getGroupId();
        java.lang.String str = groupId == null ? "" : groupId;
        java.lang.String memberUid = inHouseIMGroupMemberInfo.getMemberUid();
        java.lang.String str2 = memberUid == null ? "" : memberUid;
        java.lang.String inviterUid = inHouseIMGroupMemberInfo.getInviterUid();
        java.lang.String str3 = inviterUid == null ? "" : inviterUid;
        java.lang.String strOLrzqt = activity.OLrzqt();
        java.lang.String strOLrzqt2 = activity.OLrzqt();
        java.lang.String strKWHzl = activity.KWHzl();
        java.lang.String memberAlias = inHouseIMGroupMemberInfo.getMemberAlias();
        java.lang.String str4 = memberAlias == null ? "" : memberAlias;
        java.lang.String strCopydefault = activity.copydefault();
        OfficialTagInfo officialTagInfoEZpvd = activity.EZpvd();
        java.lang.Integer role = inHouseIMGroupMemberInfo.getRole();
        int iIntValue = role != null ? role.intValue() : GroupRole.Common.getCode();
        PaidGroupMemberStatus paidGroupMemberStatus = inHouseIMGroupMemberInfo.getPaidGroupMemberStatus();
        java.lang.Integer memberStatus = inHouseIMGroupMemberInfo.getMemberStatus();
        return new InHouseIMGroupMemberEntity(str2, str, str3, iIntValue, strOLrzqt, strOLrzqt2, strCopydefault, memberStatus != null ? memberStatus.intValue() : 0, 0L, 0L, null, str4, null, officialTagInfoEZpvd, strKWHzl, paidGroupMemberStatus, 5888, null);
    }

    public static final java.lang.Boolean EZpvd(@NotNull OKMessage oKMessage) {
        java.lang.String userId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        OKRecallNotificationMessage oKRecallNotificationMessage = content instanceof OKRecallNotificationMessage ? (OKRecallNotificationMessage) content : null;
        if (oKRecallNotificationMessage == null) {
            return null;
        }
        OKUserInfo userInfo = oKRecallNotificationMessage.getUserInfo();
        if (userInfo != null && (userId = userInfo.getUserId()) != null) {
            str = userId;
        }
        boolean zKWHzl = C44157sFk.KWHzl(str);
        java.lang.String operatorId = oKRecallNotificationMessage.getOperatorId();
        OKUserInfo userInfo2 = oKRecallNotificationMessage.getUserInfo();
        return java.lang.Boolean.valueOf(zKWHzl && Intrinsics.EZpvd((java.lang.Object) operatorId, (java.lang.Object) (userInfo2 != null ? userInfo2.getUserId() : null)));
    }

    public static final java.lang.Boolean KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        if (content != null) {
            return AEQbTJ(content);
        }
        return null;
    }

    public static final java.lang.Boolean AEQbTJ(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        OKRecallNotificationMessage oKRecallNotificationMessage = oKMessageContent instanceof OKRecallNotificationMessage ? (OKRecallNotificationMessage) oKMessageContent : null;
        if (oKRecallNotificationMessage != null) {
            return java.lang.Boolean.valueOf(oKRecallNotificationMessage.isAdmin());
        }
        return null;
    }

    public static final boolean KWHzl(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        OKRecallNotificationMessage oKRecallNotificationMessage = oKMessageContent instanceof OKRecallNotificationMessage ? (OKRecallNotificationMessage) oKMessageContent : null;
        if (oKRecallNotificationMessage == null) {
            return false;
        }
        return oKRecallNotificationMessage.isDelete();
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull OKConversationType oKConversationType, @NotNull sIR sir) {
        GroupRole role;
        GroupRole role2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(sir, "");
        GroupMemberInfo groupMemberInfoOLrzqt = sir.OLrzqt(str2, str);
        boolean z = (groupMemberInfoOLrzqt == null || (role2 = groupMemberInfoOLrzqt.getRole()) == null || role2.getCode() != GroupRole.Owner.getCode()) ? false : true;
        boolean z2 = (groupMemberInfoOLrzqt == null || (role = groupMemberInfoOLrzqt.getRole()) == null || role.getCode() != GroupRole.Administrator.getCode()) ? false : true;
        if (oKConversationType == OKConversationType.GROUP) {
            return z || z2;
        }
        return false;
    }

    public static /* synthetic */ OKMessageContent toOKMessageContent$default(InHouseIMMessageEntity inHouseIMMessageEntity, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return EZpvd(inHouseIMMessageEntity, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.OKTextMessage.CREATOR.obtainSendMessage$default(com.okinc.okimcore.model.im.OKTextMessage$CREATOR, java.lang.String, boolean, int, java.lang.Object):com.okinc.okimcore.model.im.OKTextMessage */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:527:? */
    /* JADX DEBUG: Type inference failed for r3v21. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r3v31. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r6v21. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0d70  */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.okinc.okimcore.model.im.OKTextMessage] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.okinc.okimcore.model.im.OKMessageContent, com.okinc.okimcore.model.im.OKReferenceMessage] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v324 */
    /* JADX WARN: Type inference failed for: r0v368 */
    /* JADX WARN: Type inference failed for: r0v381 */
    /* JADX WARN: Type inference failed for: r0v390, types: [com.okinc.okimcore.model.im.OKCustomMessage] */
    /* JADX WARN: Type inference failed for: r0v391 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.okinc.okimcore.model.im.OKReadReceiptMessage] */
    /* JADX WARN: Type inference failed for: r0v401, types: [com.okinc.okimcore.model.im.OKTextMessage] */
    /* JADX WARN: Type inference failed for: r0v406 */
    /* JADX WARN: Type inference failed for: r0v408 */
    /* JADX WARN: Type inference failed for: r0v409, types: [com.okinc.okimcore.model.im.OKAudioCallRecordMessage] */
    /* JADX WARN: Type inference failed for: r0v410, types: [com.okinc.okimcore.model.im.OKCallSTerminateMessage] */
    /* JADX WARN: Type inference failed for: r0v411, types: [com.okinc.okimcore.model.im.OKCallSTerminateMessage] */
    /* JADX WARN: Type inference failed for: r0v412, types: [com.okinc.okimcore.model.im.OKCallSTerminateMessage] */
    /* JADX WARN: Type inference failed for: r0v413, types: [com.okinc.okimcore.model.im.OKCallSTerminateMessage] */
    /* JADX WARN: Type inference failed for: r0v414, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v415, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v422, types: [com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage] */
    /* JADX WARN: Type inference failed for: r0v424, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r0v426, types: [com.okinc.okimcore.model.im.OKTextMessage] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.okinc.okimcore.model.im.OKTypingIndicatorMessage] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.okinc.okimcore.model.other.OKRecallNotificationMessage] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.okinc.okimcore.model.other.OKRecallNotificationMessage] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKMessageContent EZpvd(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, boolean z) {
        ?? oKReadReceiptMessage;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        AnnouncementGroupMessage announcementGroupMessage;
        java.lang.String strEncodeToString;
        java.lang.String strEncodeToString2;
        java.lang.String strEncodeToString3;
        java.lang.String strEncodeToString4;
        java.lang.String strEncodeToString5;
        java.lang.String strEncodeToString6;
        java.lang.String strEncodeToString7;
        java.lang.String strEncodeToString8;
        java.lang.String strEncodeToString9;
        java.lang.String strEncodeToString10;
        boolean z2;
        java.lang.String strEncodeToString11;
        java.lang.String strEncodeToString12;
        java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ;
        java.lang.String strEncodeToString13;
        boolean z3;
        java.lang.String strEncodeToString14;
        java.lang.String strEncodeToString15;
        java.lang.String strEncodeToString16;
        java.lang.String strEncodeToString17;
        java.lang.String strEncodeToString18;
        java.lang.String strEncodeToString19;
        java.lang.Object obj;
        java.lang.String strEncodeToString20;
        java.lang.String strEncodeToString21;
        java.lang.String strEncodeToString22;
        java.lang.Object obj2;
        java.lang.String strEncodeToString23;
        java.lang.Object objM7377constructorimpl;
        java.lang.Boolean boolEZpvd;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        FrontendOption frontendOption = inHouseIMMessageEntity.getFrontendOption();
        boolean zBooleanValue = (frontendOption == null || (boolEZpvd = frontendOption.EZpvd()) == null) ? true : boolEZpvd.booleanValue();
        InHouseIMContentType inHouseIMContentTypeAEQbTJ = InHouseIMContentType.Companion.AEQbTJ(java.lang.Integer.valueOf(inHouseIMMessageEntity.getContentType()));
        switch (ActionBar.AEQbTJ[inHouseIMContentTypeAEQbTJ.ordinal()]) {
            case 1:
                oKReadReceiptMessage = new OKReadReceiptMessage();
                oKReadReceiptMessage.setLastMessageSendTime(C33129mqd.valueOf(java.lang.Long.valueOf(inHouseIMMessageEntity.getSendTime())));
                java.lang.Long readReceiptSequence = inHouseIMMessageEntity.getReadReceiptSequence();
                oKReadReceiptMessage.setMessageUId(readReceiptSequence != null ? C33129mqd.gEmmrt(readReceiptSequence) : null);
                oKReadReceiptMessage.setType(OKReadReceiptMessage.ReadReceiptType.UID);
                break;
            case 2:
                oKReadReceiptMessage = OKTypingIndicatorMessage.CREATOR.obtain();
                break;
            case 3:
            case 4:
                oKReadReceiptMessage = new OKRecallNotificationMessage();
                oKReadReceiptMessage.setOperatorId(C33129mqd.gEmmrt(inHouseIMMessageEntity.getSenderUid()));
                oKReadReceiptMessage.setAdmin(inHouseIMContentTypeAEQbTJ == InHouseIMContentType.RecallMessageByAdmin);
                RecallMessageData recallMessage = inHouseIMMessageEntity.getRecallMessage();
                oKReadReceiptMessage.setDelete(recallMessage != null ? Intrinsics.EZpvd(recallMessage.isInternal(), java.lang.Boolean.TRUE) : false);
                break;
            case 5:
            case 6:
                oKReadReceiptMessage = new OKRecallNotificationMessage();
                oKReadReceiptMessage.setOperatorId(C33129mqd.gEmmrt(inHouseIMMessageEntity.getSenderUid()));
                oKReadReceiptMessage.setAdmin(inHouseIMContentTypeAEQbTJ == InHouseIMContentType.RecallMessageByAdminServer);
                RecallMessageData recallMessage2 = inHouseIMMessageEntity.getRecallMessage();
                oKReadReceiptMessage.setDelete(recallMessage2 != null ? Intrinsics.EZpvd(recallMessage2.isInternal(), java.lang.Boolean.TRUE) : false);
                break;
            case 7:
                if (inHouseIMMessageEntity.getReplySeq() != null) {
                    InHouseIMMessageEntity quotedMessage = inHouseIMMessageEntity.getQuotedMessage();
                    if (quotedMessage != null) {
                        java.lang.Integer status = quotedMessage.getStatus();
                        int status2 = MessageStatus.Rejected.getStatus();
                        if (status != null && status.intValue() == status2) {
                        }
                    }
                    OKReferenceMessage.CREATOR creator = OKReferenceMessage.CREATOR;
                    InHouseIMMessageEntity quotedMessage2 = inHouseIMMessageEntity.getQuotedMessage();
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(quotedMessage2 != null ? quotedMessage2.getSenderUid() : null);
                    InHouseIMMessageEntity quotedMessage3 = inHouseIMMessageEntity.getQuotedMessage();
                    OKMessageContent oKMessageContent$default = quotedMessage3 != null ? toOKMessageContent$default(quotedMessage3, false, 1, null) : null;
                    InHouseIMMessageEntity quotedMessage4 = inHouseIMMessageEntity.getQuotedMessage();
                    oKReadReceiptMessage = creator.obtain(strGEmmrt, oKMessageContent$default, quotedMessage4 != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(quotedMessage4.getSeq())) : null);
                    oKReadReceiptMessage.setContent(inHouseIMMessageEntity.getTextContent());
                    OKTextMessage oKTextMessageObtainSendMessage$default = OKTextMessage.CREATOR.obtainSendMessage$default(OKTextMessage.CREATOR, inHouseIMMessageEntity.getTextContent(), false, 2, null);
                    OKMentionedInfo.MentionedType mentionedTypeCreateFrom = OKMentionedInfo.MentionedType.CREATOR.createFrom(inHouseIMMessageEntity.getAtType());
                    java.util.List<InhouseIMAtUser> atUserList = inHouseIMMessageEntity.getAtUserList();
                    if (atUserList != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(atUserList, 10));
                        for (InhouseIMAtUser inhouseIMAtUser : atUserList) {
                            arrayList4.add(new MentionedUserInfo(C33129mqd.gEmmrt(inhouseIMAtUser.KWHzl()), inhouseIMAtUser.OLrzqt()));
                        }
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = null;
                    }
                    oKTextMessageObtainSendMessage$default.setMentionedInfo(new OKMentionedInfo(mentionedTypeCreateFrom, arrayList2, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
                    oKTextMessageObtainSendMessage$default.setUrlList(inHouseIMMessageEntity.getUrlList());
                    oKTextMessageObtainSendMessage$default.setSiteMeta(inHouseIMMessageEntity.getSiteMeta());
                    oKReadReceiptMessage.setOriginalOKMessageContent(C44164sFr.KWHzl(oKTextMessageObtainSendMessage$default));
                    OKMentionedInfo.MentionedType mentionedTypeCreateFrom2 = OKMentionedInfo.MentionedType.CREATOR.createFrom(inHouseIMMessageEntity.getAtType());
                    java.util.List<InhouseIMAtUser> atUserList2 = inHouseIMMessageEntity.getAtUserList();
                    if (atUserList2 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(atUserList2, 10));
                        for (InhouseIMAtUser inhouseIMAtUser2 : atUserList2) {
                            arrayList5.add(new MentionedUserInfo(C33129mqd.gEmmrt(inhouseIMAtUser2.KWHzl()), inhouseIMAtUser2.OLrzqt()));
                        }
                        arrayList3 = arrayList5;
                    } else {
                        arrayList3 = null;
                    }
                    oKReadReceiptMessage.setMentionedInfo(new OKMentionedInfo(mentionedTypeCreateFrom2, arrayList3, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
                } else {
                    OKTextMessage oKTextMessageObtainSendMessage$default2 = OKTextMessage.CREATOR.obtainSendMessage$default(OKTextMessage.CREATOR, inHouseIMMessageEntity.getTextContent(), false, 2, null);
                    OKMentionedInfo.MentionedType mentionedTypeCreateFrom3 = OKMentionedInfo.MentionedType.CREATOR.createFrom(inHouseIMMessageEntity.getAtType());
                    java.util.List<InhouseIMAtUser> atUserList3 = inHouseIMMessageEntity.getAtUserList();
                    if (atUserList3 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(atUserList3, 10));
                        for (InhouseIMAtUser inhouseIMAtUser3 : atUserList3) {
                            arrayList6.add(new MentionedUserInfo(C33129mqd.gEmmrt(inhouseIMAtUser3.KWHzl()), inhouseIMAtUser3.OLrzqt()));
                        }
                        arrayList = arrayList6;
                    } else {
                        arrayList = null;
                    }
                    oKTextMessageObtainSendMessage$default2.setMentionedInfo(new OKMentionedInfo(mentionedTypeCreateFrom3, arrayList, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
                    oKTextMessageObtainSendMessage$default2.setUrlList(inHouseIMMessageEntity.getUrlList());
                    oKTextMessageObtainSendMessage$default2.setSiteMeta(inHouseIMMessageEntity.getSiteMeta());
                    oKReadReceiptMessage = C44164sFr.KWHzl(oKTextMessageObtainSendMessage$default2);
                }
                break;
            case 8:
                oKReadReceiptMessage = C44164sFr.AEQbTJ(inHouseIMMessageEntity, z);
                break;
            case 9:
                oKReadReceiptMessage = C44164sFr.EZpvd(inHouseIMMessageEntity, z);
                break;
            case 10:
                oKReadReceiptMessage = C44164sFr.AEQbTJ(inHouseIMMessageEntity);
                break;
            case 11:
                oKReadReceiptMessage = C44164sFr.OLrzqt(inHouseIMMessageEntity);
                break;
            case 12:
                oKReadReceiptMessage = C44164sFr.copydefault(inHouseIMMessageEntity, z);
                break;
            case 13:
                SystemMessageData.VisibleSystemAction.Application application = SystemMessageData.VisibleSystemAction.Companion;
                SystemMessageData systemMessage = inHouseIMMessageEntity.getSystemMessage();
                SystemMessageData.VisibleSystemAction visibleSystemActionKWHzl = application.KWHzl(C33129mqd.AhwBna(systemMessage != null ? systemMessage.EZpvd() : null));
                switch (visibleSystemActionKWHzl == null ? -1 : ActionBar.EZpvd[visibleSystemActionKWHzl.ordinal()]) {
                    case 1:
                        announcementGroupMessage = new AnnouncementGroupMessage();
                        announcementGroupMessage.setOperation(AnnouncementGroupMessage.GROUP_OPERATION_ANNOUNCEMENT);
                        announcementGroupMessage.setPinnedUpdate(true);
                        sHY shyCopydefault = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault = companion.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl = shyCopydefault.KWHzl();
                            shyCopydefault.KWHzl().getSerializersModule();
                            strEncodeToString = jsonKWHzl.encodeToString(companion.serializer(), groupSystemMessageInfoCopydefault);
                        } catch (java.lang.Exception e) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                            strEncodeToString = "";
                        }
                        announcementGroupMessage.setData(strEncodeToString);
                        oKReadReceiptMessage = announcementGroupMessage;
                        break;
                    case 2:
                        announcementGroupMessage = new AnnouncementGroupMessage();
                        announcementGroupMessage.setOperation(AnnouncementGroupMessage.GROUP_OPERATION_ANNOUNCEMENT);
                        announcementGroupMessage.setUpdate(true);
                        sHY shyCopydefault2 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion2 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault2 = companion2.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl2 = shyCopydefault2.KWHzl();
                            shyCopydefault2.KWHzl().getSerializersModule();
                            strEncodeToString2 = jsonKWHzl2.encodeToString(companion2.serializer(), groupSystemMessageInfoCopydefault2);
                        } catch (java.lang.Exception e2) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e2.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                            strEncodeToString2 = "";
                        }
                        announcementGroupMessage.setData(strEncodeToString2);
                        oKReadReceiptMessage = announcementGroupMessage;
                        break;
                    case 3:
                        announcementGroupMessage = new AnnouncementGroupMessage();
                        announcementGroupMessage.setOperation(AnnouncementGroupMessage.GROUP_OPERATION_ANNOUNCEMENT);
                        announcementGroupMessage.setPost(true);
                        sHY shyCopydefault3 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion3 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault3 = companion3.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl3 = shyCopydefault3.KWHzl();
                            shyCopydefault3.KWHzl().getSerializersModule();
                            strEncodeToString3 = jsonKWHzl3.encodeToString(companion3.serializer(), groupSystemMessageInfoCopydefault3);
                        } catch (java.lang.Exception e3) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e3.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e3.getMessage()))));
                            strEncodeToString3 = "";
                        }
                        announcementGroupMessage.setData(strEncodeToString3);
                        oKReadReceiptMessage = announcementGroupMessage;
                        break;
                    case 4:
                        AnnouncementGroupMessage announcementGroupMessage2 = new AnnouncementGroupMessage();
                        announcementGroupMessage2.setPost(false);
                        sHY shyCopydefault4 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion4 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault4 = companion4.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl4 = shyCopydefault4.KWHzl();
                            shyCopydefault4.KWHzl().getSerializersModule();
                            strEncodeToString4 = jsonKWHzl4.encodeToString(companion4.serializer(), groupSystemMessageInfoCopydefault4);
                        } catch (java.lang.Exception e4) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e4.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e4.getMessage()))));
                            strEncodeToString4 = "";
                        }
                        announcementGroupMessage2.setData(strEncodeToString4);
                        obj2 = announcementGroupMessage2;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 5:
                    case 6:
                        DisableGroupChatMessage disableGroupChatMessage = new DisableGroupChatMessage();
                        SystemMessageData systemMessage2 = inHouseIMMessageEntity.getSystemMessage();
                        if (C33129mqd.AhwBna(systemMessage2 != null ? systemMessage2.EZpvd() : null) != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_MEMBER.getSystemAction()) {
                            SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_MEMBER.getSystemAction();
                            z = false;
                        }
                        disableGroupChatMessage.setDisable(z);
                        sHY shyCopydefault5 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion5 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault5 = companion5.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl5 = shyCopydefault5.KWHzl();
                            shyCopydefault5.KWHzl().getSerializersModule();
                            strEncodeToString5 = jsonKWHzl5.encodeToString(companion5.serializer(), groupSystemMessageInfoCopydefault5);
                        } catch (java.lang.Exception e5) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e5.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e5.getMessage()))));
                            strEncodeToString5 = "";
                        }
                        disableGroupChatMessage.setData(strEncodeToString5);
                        obj = disableGroupChatMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 7:
                    case 8:
                        AllowGroupPrivateChatMessage allowGroupPrivateChatMessage = new AllowGroupPrivateChatMessage();
                        SystemMessageData systemMessage3 = inHouseIMMessageEntity.getSystemMessage();
                        int iAhwBna = C33129mqd.AhwBna(systemMessage3 != null ? systemMessage3.EZpvd() : null);
                        allowGroupPrivateChatMessage.setEnabled(iAhwBna != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_PRIVATE_CHAT.getSystemAction() && iAhwBna == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_PRIVATE_CHAT.getSystemAction());
                        sHY shyCopydefault6 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion6 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault6 = companion6.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl6 = shyCopydefault6.KWHzl();
                            shyCopydefault6.KWHzl().getSerializersModule();
                            strEncodeToString6 = jsonKWHzl6.encodeToString(companion6.serializer(), groupSystemMessageInfoCopydefault6);
                        } catch (java.lang.Exception e6) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e6.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e6.getMessage()))));
                            strEncodeToString6 = "";
                        }
                        allowGroupPrivateChatMessage.setData(strEncodeToString6);
                        obj = allowGroupPrivateChatMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 9:
                    case 10:
                        AllowMentionMembersGroupMessage allowMentionMembersGroupMessage = new AllowMentionMembersGroupMessage();
                        SystemMessageData systemMessage4 = inHouseIMMessageEntity.getSystemMessage();
                        if (C33129mqd.AhwBna(systemMessage4 != null ? systemMessage4.EZpvd() : null) != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_MEMBER_MENTION_OTHER.getSystemAction()) {
                            SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_MEMBER_MENTION_OTHER.getSystemAction();
                            z = false;
                        }
                        allowMentionMembersGroupMessage.setEnabled(z);
                        sHY shyCopydefault7 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion7 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault7 = companion7.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl7 = shyCopydefault7.KWHzl();
                            shyCopydefault7.KWHzl().getSerializersModule();
                            strEncodeToString7 = jsonKWHzl7.encodeToString(companion7.serializer(), groupSystemMessageInfoCopydefault7);
                        } catch (java.lang.Exception e7) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e7.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e7.getMessage()))));
                            strEncodeToString7 = "";
                        }
                        allowMentionMembersGroupMessage.setData(strEncodeToString7);
                        obj = allowMentionMembersGroupMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 11:
                    case 12:
                        AllowSendingLinkGroupMessage allowSendingLinkGroupMessage = new AllowSendingLinkGroupMessage();
                        SystemMessageData systemMessage5 = inHouseIMMessageEntity.getSystemMessage();
                        if (C33129mqd.AhwBna(systemMessage5 != null ? systemMessage5.EZpvd() : null) != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_GROUP_MEMBER_SENDING_LINK.getSystemAction()) {
                            SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_GROUP_MEMBER_SENDING_LINK.getSystemAction();
                            z = false;
                        }
                        allowSendingLinkGroupMessage.setEnabled(z);
                        sHY shyCopydefault8 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion8 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault8 = companion8.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl8 = shyCopydefault8.KWHzl();
                            shyCopydefault8.KWHzl().getSerializersModule();
                            strEncodeToString8 = jsonKWHzl8.encodeToString(companion8.serializer(), groupSystemMessageInfoCopydefault8);
                        } catch (java.lang.Exception e8) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e8.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e8.getMessage()))));
                            strEncodeToString8 = "";
                        }
                        allowSendingLinkGroupMessage.setData(strEncodeToString8);
                        obj = allowSendingLinkGroupMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 13:
                    case 14:
                        AllowMemberAddMemberGroupMessage allowMemberAddMemberGroupMessage = new AllowMemberAddMemberGroupMessage();
                        SystemMessageData systemMessage6 = inHouseIMMessageEntity.getSystemMessage();
                        if (C33129mqd.AhwBna(systemMessage6 != null ? systemMessage6.EZpvd() : null) != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_MEMBER_ADD_MEMBER.getSystemAction()) {
                            SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_MEMBER_ADD_MEMBER.getSystemAction();
                            z = false;
                        }
                        allowMemberAddMemberGroupMessage.setEnabled(z);
                        sHY shyCopydefault9 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion9 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault9 = companion9.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl9 = shyCopydefault9.KWHzl();
                            shyCopydefault9.KWHzl().getSerializersModule();
                            strEncodeToString9 = jsonKWHzl9.encodeToString(companion9.serializer(), groupSystemMessageInfoCopydefault9);
                        } catch (java.lang.Exception e9) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e9.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e9.getMessage()))));
                            strEncodeToString9 = "";
                        }
                        allowMemberAddMemberGroupMessage.setData(strEncodeToString9);
                        obj = allowMemberAddMemberGroupMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 15:
                    case 16:
                        AllowGeneratingInvitationQrCodeGroupMessage allowGeneratingInvitationQrCodeGroupMessage = new AllowGeneratingInvitationQrCodeGroupMessage();
                        SystemMessageData systemMessage7 = inHouseIMMessageEntity.getSystemMessage();
                        if (C33129mqd.AhwBna(systemMessage7 != null ? systemMessage7.EZpvd() : null) != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_SHARING_INVITATION_QR_CODE.getSystemAction()) {
                            SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_SHARING_INVITATION_QR_CODE.getSystemAction();
                            z = false;
                        }
                        allowGeneratingInvitationQrCodeGroupMessage.setEnabled(z);
                        sHY shyCopydefault10 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion10 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault10 = companion10.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl10 = shyCopydefault10.KWHzl();
                            shyCopydefault10.KWHzl().getSerializersModule();
                            strEncodeToString10 = jsonKWHzl10.encodeToString(companion10.serializer(), groupSystemMessageInfoCopydefault10);
                        } catch (java.lang.Exception e10) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e10.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e10.getMessage()))));
                            strEncodeToString10 = "";
                        }
                        allowGeneratingInvitationQrCodeGroupMessage.setData(strEncodeToString10);
                        obj = allowGeneratingInvitationQrCodeGroupMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        UpdateAdminGroupMessage updateAdminGroupMessage = new UpdateAdminGroupMessage();
                        SystemMessageData systemMessage8 = inHouseIMMessageEntity.getSystemMessage();
                        int iAhwBna2 = C33129mqd.AhwBna(systemMessage8 != null ? systemMessage8.EZpvd() : null);
                        SystemMessageData.VisibleSystemAction visibleSystemAction = SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT;
                        if (iAhwBna2 == visibleSystemAction.getSystemAction() || iAhwBna2 == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT.getSystemAction()) {
                            z2 = true;
                        } else {
                            if (iAhwBna2 != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.getSystemAction()) {
                                SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT.getSystemAction();
                            }
                            z2 = false;
                        }
                        updateAdminGroupMessage.setAddAdmin(z2);
                        SystemMessageData systemMessage9 = inHouseIMMessageEntity.getSystemMessage();
                        int iAhwBna3 = C33129mqd.AhwBna(systemMessage9 != null ? systemMessage9.EZpvd() : null);
                        if (iAhwBna3 != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT.getSystemAction() && iAhwBna3 != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT.getSystemAction()) {
                            if (iAhwBna3 != visibleSystemAction.getSystemAction()) {
                                SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.getSystemAction();
                            }
                            z = false;
                        }
                        updateAdminGroupMessage.setTargetUsersExceedLimit(z);
                        sHY shyCopydefault11 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion11 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault11 = companion11.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl11 = shyCopydefault11.KWHzl();
                            shyCopydefault11.KWHzl().getSerializersModule();
                            strEncodeToString11 = jsonKWHzl11.encodeToString(companion11.serializer(), groupSystemMessageInfoCopydefault11);
                        } catch (java.lang.Exception e11) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e11.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e11.getMessage()))));
                            strEncodeToString11 = "";
                        }
                        updateAdminGroupMessage.setData(strEncodeToString11);
                        obj = updateAdminGroupMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 21:
                        CreateGroupMessage createGroupMessage = new CreateGroupMessage();
                        SystemMessageData systemMessage10 = inHouseIMMessageEntity.getSystemMessage();
                        java.lang.String str = (systemMessage10 == null || (mapAEQbTJ = systemMessage10.AEQbTJ()) == null) ? null : mapAEQbTJ.get("groupName");
                        if (str == null) {
                            str = "";
                        }
                        createGroupMessage.setGroupName(str);
                        sHY shyCopydefault12 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion12 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault12 = companion12.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl12 = shyCopydefault12.KWHzl();
                            shyCopydefault12.KWHzl().getSerializersModule();
                            strEncodeToString12 = jsonKWHzl12.encodeToString(companion12.serializer(), groupSystemMessageInfoCopydefault12);
                        } catch (java.lang.Exception e12) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e12.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e12.getMessage()))));
                            strEncodeToString12 = "";
                        }
                        createGroupMessage.setData(strEncodeToString12);
                        obj2 = createGroupMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 22:
                        DisbandGroupMessage disbandGroupMessage = new DisbandGroupMessage();
                        sHY shyCopydefault13 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion13 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault13 = companion13.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl13 = shyCopydefault13.KWHzl();
                            shyCopydefault13.KWHzl().getSerializersModule();
                            strEncodeToString13 = jsonKWHzl13.encodeToString(companion13.serializer(), groupSystemMessageInfoCopydefault13);
                        } catch (java.lang.Exception e13) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e13.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e13.getMessage()))));
                            strEncodeToString13 = "";
                        }
                        disbandGroupMessage.setData(strEncodeToString13);
                        obj2 = disbandGroupMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        UpdateGroupMemberMessage updateGroupMemberMessage = new UpdateGroupMemberMessage();
                        SystemMessageData systemMessage11 = inHouseIMMessageEntity.getSystemMessage();
                        int iAhwBna4 = C33129mqd.AhwBna(systemMessage11 != null ? systemMessage11.EZpvd() : null);
                        SystemMessageData.VisibleSystemAction visibleSystemAction2 = SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT;
                        if (iAhwBna4 == visibleSystemAction2.getSystemAction() || iAhwBna4 == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT.getSystemAction()) {
                            z3 = true;
                        } else {
                            if (iAhwBna4 != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.getSystemAction()) {
                                SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT.getSystemAction();
                            }
                            z3 = false;
                        }
                        updateGroupMemberMessage.setAddMember(z3);
                        SystemMessageData systemMessage12 = inHouseIMMessageEntity.getSystemMessage();
                        int iAhwBna5 = C33129mqd.AhwBna(systemMessage12 != null ? systemMessage12.EZpvd() : null);
                        if (iAhwBna5 != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT.getSystemAction() && iAhwBna5 != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT.getSystemAction()) {
                            if (iAhwBna5 != visibleSystemAction2.getSystemAction()) {
                                SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT.getSystemAction();
                            }
                            z = false;
                        }
                        updateGroupMemberMessage.setTargetUsersExceedLimit(z);
                        sHY shyCopydefault14 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion14 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault14 = companion14.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl14 = shyCopydefault14.KWHzl();
                            shyCopydefault14.KWHzl().getSerializersModule();
                            strEncodeToString14 = jsonKWHzl14.encodeToString(companion14.serializer(), groupSystemMessageInfoCopydefault14);
                        } catch (java.lang.Exception e14) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e14.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e14.getMessage()))));
                            strEncodeToString14 = "";
                        }
                        updateGroupMemberMessage.setData(strEncodeToString14);
                        obj = updateGroupMemberMessage;
                        oKReadReceiptMessage = obj;
                        break;
                    case 27:
                        AddContactMessage addContactMessage = new AddContactMessage();
                        sHY shyCopydefault15 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion15 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault15 = companion15.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl15 = shyCopydefault15.KWHzl();
                            shyCopydefault15.KWHzl().getSerializersModule();
                            strEncodeToString15 = jsonKWHzl15.encodeToString(companion15.serializer(), groupSystemMessageInfoCopydefault15);
                        } catch (java.lang.Exception e15) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e15.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e15.getMessage()))));
                            strEncodeToString15 = "";
                        }
                        addContactMessage.setData(strEncodeToString15);
                        obj2 = addContactMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 28:
                        TransferGroupOwnershipMessage transferGroupOwnershipMessage = new TransferGroupOwnershipMessage();
                        sHY shyCopydefault16 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion16 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault16 = companion16.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl16 = shyCopydefault16.KWHzl();
                            shyCopydefault16.KWHzl().getSerializersModule();
                            strEncodeToString16 = jsonKWHzl16.encodeToString(companion16.serializer(), groupSystemMessageInfoCopydefault16);
                        } catch (java.lang.Exception e16) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e16.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e16.getMessage()))));
                            strEncodeToString16 = "";
                        }
                        transferGroupOwnershipMessage.setData(strEncodeToString16);
                        obj2 = transferGroupOwnershipMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 29:
                        StartGroupVoiceCallMessage startGroupVoiceCallMessage = new StartGroupVoiceCallMessage();
                        sHY shyCopydefault17 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion17 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault17 = companion17.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl17 = shyCopydefault17.KWHzl();
                            shyCopydefault17.KWHzl().getSerializersModule();
                            strEncodeToString17 = jsonKWHzl17.encodeToString(companion17.serializer(), groupSystemMessageInfoCopydefault17);
                        } catch (java.lang.Exception e17) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e17.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e17.getMessage()))));
                            strEncodeToString17 = "";
                        }
                        startGroupVoiceCallMessage.setData(strEncodeToString17);
                        obj2 = startGroupVoiceCallMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 30:
                        UpdateGroupNameMessage updateGroupNameMessage = new UpdateGroupNameMessage();
                        SystemMessageData systemMessage13 = inHouseIMMessageEntity.getSystemMessage();
                        java.lang.String strKWHzl = systemMessage13 != null ? systemMessage13.KWHzl() : null;
                        if (strKWHzl == null) {
                            strKWHzl = "";
                        }
                        updateGroupNameMessage.setOperatorUserId(strKWHzl);
                        sHY shyCopydefault18 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion18 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault18 = companion18.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl18 = shyCopydefault18.KWHzl();
                            shyCopydefault18.KWHzl().getSerializersModule();
                            strEncodeToString18 = jsonKWHzl18.encodeToString(companion18.serializer(), groupSystemMessageInfoCopydefault18);
                        } catch (java.lang.Exception e18) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e18.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e18.getMessage()))));
                            strEncodeToString18 = "";
                        }
                        updateGroupNameMessage.setData(strEncodeToString18);
                        obj2 = updateGroupNameMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 31:
                        UpdateGroupAvatarMessage updateGroupAvatarMessage = new UpdateGroupAvatarMessage();
                        SystemMessageData systemMessage14 = inHouseIMMessageEntity.getSystemMessage();
                        java.lang.String strKWHzl2 = systemMessage14 != null ? systemMessage14.KWHzl() : null;
                        if (strKWHzl2 == null) {
                            strKWHzl2 = "";
                        }
                        updateGroupAvatarMessage.setOperatorUserId(strKWHzl2);
                        sHY shyCopydefault19 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion19 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault19 = companion19.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl19 = shyCopydefault19.KWHzl();
                            shyCopydefault19.KWHzl().getSerializersModule();
                            strEncodeToString19 = jsonKWHzl19.encodeToString(companion19.serializer(), groupSystemMessageInfoCopydefault19);
                        } catch (java.lang.Exception e19) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e19.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e19.getMessage()))));
                            strEncodeToString19 = "";
                        }
                        updateGroupAvatarMessage.setData(strEncodeToString19);
                        obj2 = updateGroupAvatarMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 32:
                    case 33:
                        SystemMessageData systemMessage15 = inHouseIMMessageEntity.getSystemMessage();
                        if (C33129mqd.AhwBna(systemMessage15 != null ? systemMessage15.EZpvd() : null) != SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN.getSystemAction()) {
                            SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN.getSystemAction();
                            z = false;
                        }
                        RequireAdminApprovalToJoin requireAdminApprovalToJoin = new RequireAdminApprovalToJoin(z);
                        sHY shyCopydefault20 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion20 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault20 = companion20.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl20 = shyCopydefault20.KWHzl();
                            shyCopydefault20.KWHzl().getSerializersModule();
                            strEncodeToString20 = jsonKWHzl20.encodeToString(companion20.serializer(), groupSystemMessageInfoCopydefault20);
                        } catch (java.lang.Exception e20) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e20.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e20.getMessage()))));
                            strEncodeToString20 = "";
                        }
                        requireAdminApprovalToJoin.setData(strEncodeToString20);
                        obj = requireAdminApprovalToJoin;
                        oKReadReceiptMessage = obj;
                        break;
                    case 34:
                    case 35:
                    case 36:
                        RequireAssetVerificationToJoin.Activity activity = RequireAssetVerificationToJoin.Companion;
                        SystemMessageData systemMessage16 = inHouseIMMessageEntity.getSystemMessage();
                        RequireAssetVerificationToJoin requireAssetVerificationToJoin = new RequireAssetVerificationToJoin(activity.copydefault(C33129mqd.AhwBna(systemMessage16 != null ? systemMessage16.EZpvd() : null)));
                        sHY shyCopydefault21 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion21 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault21 = companion21.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl21 = shyCopydefault21.KWHzl();
                            shyCopydefault21.KWHzl().getSerializersModule();
                            strEncodeToString21 = jsonKWHzl21.encodeToString(companion21.serializer(), groupSystemMessageInfoCopydefault21);
                        } catch (java.lang.Exception e21) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e21.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e21.getMessage()))));
                            strEncodeToString21 = "";
                        }
                        requireAssetVerificationToJoin.setData(strEncodeToString21);
                        obj2 = requireAssetVerificationToJoin;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 37:
                    case 38:
                    case 39:
                        PaidGroupBilling.ActionBar actionBar = PaidGroupBilling.Companion;
                        SystemMessageData systemMessage17 = inHouseIMMessageEntity.getSystemMessage();
                        PaidGroupBilling paidGroupBilling = new PaidGroupBilling(actionBar.copydefault(C33129mqd.AhwBna(systemMessage17 != null ? systemMessage17.EZpvd() : null)));
                        sHY shyCopydefault22 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion22 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault22 = companion22.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl22 = shyCopydefault22.KWHzl();
                            shyCopydefault22.KWHzl().getSerializersModule();
                            strEncodeToString22 = jsonKWHzl22.encodeToString(companion22.serializer(), groupSystemMessageInfoCopydefault22);
                        } catch (java.lang.Exception e22) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e22.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e22.getMessage()))));
                            strEncodeToString22 = "";
                        }
                        paidGroupBilling.setData(strEncodeToString22);
                        obj2 = paidGroupBilling;
                        oKReadReceiptMessage = obj2;
                        break;
                    case 40:
                        ConvertPrivateToPublicGroupMessage convertPrivateToPublicGroupMessage = new ConvertPrivateToPublicGroupMessage();
                        sHY shyCopydefault23 = sHW.copydefault();
                        GroupSystemMessageInfo.Companion companion23 = GroupSystemMessageInfo.Companion;
                        GroupSystemMessageInfo groupSystemMessageInfoCopydefault23 = companion23.copydefault(inHouseIMMessageEntity.getSystemMessage());
                        try {
                            Json jsonKWHzl23 = shyCopydefault23.KWHzl();
                            shyCopydefault23.KWHzl().getSerializersModule();
                            strEncodeToString23 = jsonKWHzl23.encodeToString(companion23.serializer(), groupSystemMessageInfoCopydefault23);
                        } catch (java.lang.Exception e23) {
                            pUU.copydefault("SafeJson", "encodeToString error: " + e23.getMessage());
                            sSR.copydefault("encodeToString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e23.getMessage()))));
                            strEncodeToString23 = "";
                        }
                        convertPrivateToPublicGroupMessage.setData(strEncodeToString23);
                        obj2 = convertPrivateToPublicGroupMessage;
                        oKReadReceiptMessage = obj2;
                        break;
                    default:
                        oKReadReceiptMessage = 0;
                        break;
                }
                break;
            case 14:
                CustomMessageData customMessage = inHouseIMMessageEntity.getCustomMessage();
                if (customMessage != null) {
                    sJU<?> sjuOLrzqt = (customMessage.getServiceName() == null || customMessage.getBizName() == null) ? null : sMP.AEQbTJ.OLrzqt(customMessage.getServiceName(), customMessage.getBizName());
                    if (sjuOLrzqt == null) {
                        C44124sEe.imLogMessageDisplayModel$default(inHouseIMMessageEntity.getChannelId(), "OKCustomMessage: undefined custom message", null, 4, null);
                        oKReadReceiptMessage = OKTextMessage.CREATOR.obtain(C33070mpX.AYXKKw(sDX.StateListAnimator.EZpvd));
                    } else {
                        try {
                            Result.Application application2 = Result.Companion;
                            java.lang.Object objDecodeFromInHouseCustomContent = sjuOLrzqt.decodeFromInHouseCustomContent(customMessage.getContent());
                            objM7377constructorimpl = Result.m7377constructorimpl(objDecodeFromInHouseCustomContent instanceof OKCustomMessage ? (OKCustomMessage) objDecodeFromInHouseCustomContent : null);
                        } catch (java.lang.Throwable th) {
                            Result.Application application3 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                            C44124sEe.imLogMessageDisplayModel$default(inHouseIMMessageEntity.getChannelId(), "OKCustomMessage: unable to decode message", null, 4, null);
                            objM7377constructorimpl = null;
                        }
                        oKReadReceiptMessage = (OKCustomMessage) objM7377constructorimpl;
                        if (oKReadReceiptMessage != 0) {
                            oKReadReceiptMessage.setServiceName(customMessage.getServiceName());
                            oKReadReceiptMessage.setBizName(customMessage.getBizName());
                            oKReadReceiptMessage.setPreview(customMessage.getPreview());
                            oKReadReceiptMessage.setPushTemplate(customMessage.getPushTemplate());
                            oKReadReceiptMessage.setPushData(customMessage.getPushData());
                            oKReadReceiptMessage.setFrontendOption(customMessage.getFrontendOption());
                        } else {
                            oKReadReceiptMessage = 0;
                        }
                    }
                } else {
                    oKReadReceiptMessage = 0;
                }
                break;
            case 15:
                java.lang.Integer callStatus = inHouseIMMessageEntity.getCallStatus();
                if (callStatus != null && callStatus.intValue() == 2) {
                    oKReadReceiptMessage = new OKCallSTerminateMessage();
                    oKReadReceiptMessage.setReason(OKCallCommon.OKCallDisconnectedReason.CANCEL);
                    oKReadReceiptMessage.setMediaType(OKCallCommon.OKCallMediaType.AUDIO);
                } else if (callStatus != null && callStatus.intValue() == 5) {
                    oKReadReceiptMessage = new OKCallSTerminateMessage();
                    oKReadReceiptMessage.setReason(OKCallCommon.OKCallDisconnectedReason.REJECT);
                    oKReadReceiptMessage.setMediaType(OKCallCommon.OKCallMediaType.AUDIO);
                } else if (callStatus != null && callStatus.intValue() == 7) {
                    oKReadReceiptMessage = new OKCallSTerminateMessage();
                    oKReadReceiptMessage.setReason(OKCallCommon.OKCallDisconnectedReason.TERMINATED);
                    oKReadReceiptMessage.setMediaType(OKCallCommon.OKCallMediaType.AUDIO);
                } else if (callStatus != null && callStatus.intValue() == 3) {
                    oKReadReceiptMessage = new OKCallSTerminateMessage();
                    oKReadReceiptMessage.setReason(OKCallCommon.OKCallDisconnectedReason.NO_RESPONSE);
                    oKReadReceiptMessage.setMediaType(OKCallCommon.OKCallMediaType.AUDIO);
                } else if (callStatus != null && callStatus.intValue() == 8) {
                    oKReadReceiptMessage = new OKAudioCallRecordMessage();
                    oKReadReceiptMessage.setReason(OKCallCommon.OKCallDisconnectedReason.HANGUP);
                    oKReadReceiptMessage.setMediaType(OKCallCommon.OKCallMediaType.AUDIO);
                    java.lang.Long callDuration = inHouseIMMessageEntity.getCallDuration();
                    oKReadReceiptMessage.setDuration(callDuration != null ? callDuration.longValue() : 0L);
                    java.lang.String callerUid = inHouseIMMessageEntity.getCallerUid();
                    if (callerUid == null) {
                        callerUid = "";
                    }
                    oKReadReceiptMessage.setCaller(callerUid);
                    java.lang.Long callDuration2 = inHouseIMMessageEntity.getCallDuration();
                    oKReadReceiptMessage.setActiveTime(callDuration2 != null ? callDuration2.longValue() : 0L);
                } else {
                    oKReadReceiptMessage = 0;
                }
                break;
            case 16:
                oKReadReceiptMessage = C44164sFr.KWHzl(inHouseIMMessageEntity);
                break;
            case 17:
                oKReadReceiptMessage = C44164sFr.EZpvd(inHouseIMMessageEntity);
                break;
            case 18:
                StreamPlaceHolderMessageData streamPlaceholderMessage = inHouseIMMessageEntity.getStreamPlaceholderMessage();
                java.lang.String content = streamPlaceholderMessage != null ? streamPlaceholderMessage.getContent() : null;
                StreamPlaceHolderMessageData streamPlaceholderMessage2 = inHouseIMMessageEntity.getStreamPlaceholderMessage();
                pUU.AEQbTJ("streamPlaceholderMessage?.content is " + content + ", isCompleted: " + (streamPlaceholderMessage2 != null ? streamPlaceholderMessage2.getComplete() : null));
                OKStreamPlaceHolderMessage.CREATOR creator2 = OKStreamPlaceHolderMessage.CREATOR;
                StreamPlaceHolderMessageData streamPlaceholderMessage3 = inHouseIMMessageEntity.getStreamPlaceholderMessage();
                java.lang.String content2 = streamPlaceholderMessage3 != null ? streamPlaceholderMessage3.getContent() : null;
                StreamPlaceHolderMessageData streamPlaceholderMessage4 = inHouseIMMessageEntity.getStreamPlaceholderMessage();
                oKReadReceiptMessage = creator2.obtain(content2, streamPlaceholderMessage4 != null ? streamPlaceholderMessage4.getComplete() : null);
                break;
            default:
                oKReadReceiptMessage = OKTextMessage.CREATOR.obtain(C33070mpX.AYXKKw(sDX.StateListAnimator.EZpvd));
                break;
        }
        if (oKReadReceiptMessage == 0) {
            return null;
        }
        oKReadReceiptMessage.setClientMessageId(inHouseIMMessageEntity.getMessageId());
        if (oKReadReceiptMessage.getContentType() != InHouseIMContentType.SystemMessage) {
            java.lang.String senderUid = inHouseIMMessageEntity.getSenderUid();
            java.lang.String senderNickname = inHouseIMMessageEntity.getSenderNickname();
            android.net.Uri uri = android.net.Uri.parse(C43386roM.EZpvd.EZpvd() + "/" + inHouseIMMessageEntity.getSenderAvatar());
            Intrinsics.checkNotNullExpressionValue(uri, "");
            oKReadReceiptMessage.setUserInfo(new OKUserInfo(senderUid, senderNickname, (java.lang.String) null, uri, (java.lang.String) null, 20, (DefaultConstructorMarker) null));
        }
        java.lang.String extra = inHouseIMMessageEntity.getExtra();
        oKReadReceiptMessage.setExtra(extra != null ? extra : null);
        if (oKReadReceiptMessage.getContentType() == null) {
            oKReadReceiptMessage.setContentType(inHouseIMContentTypeAEQbTJ);
        }
        oKReadReceiptMessage.setEnableAppPushNotification(zBooleanValue);
        return oKReadReceiptMessage;
    }

    public static final OKMessage AEQbTJ(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        OKMessage.MessageDirection messageDirection;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        OKMessageContent oKMessageContent$default = toOKMessageContent$default(inHouseIMMessageEntity, false, 1, null);
        if (oKMessageContent$default == null) {
            return null;
        }
        java.lang.String senderUid = (inHouseIMMessageEntity.getContentType() != InHouseIMContentType.VoiceCall.getApiValue() || inHouseIMMessageEntity.getCallerUid() == null) ? inHouseIMMessageEntity.getSenderUid() : inHouseIMMessageEntity.getCallerUid();
        if ((C44157sFk.gEmmrt().values() && Intrinsics.EZpvd((java.lang.Object) senderUid, (java.lang.Object) C44157sFk.copydefault(C44157sFk.gEmmrt()))) || (!C44157sFk.gEmmrt().values() && Intrinsics.EZpvd((java.lang.Object) senderUid, (java.lang.Object) sFM.copydefault.copydefault()))) {
            messageDirection = OKMessage.MessageDirection.SEND;
        } else {
            messageDirection = OKMessage.MessageDirection.RECEIVE;
        }
        OKMessage.MessageDirection messageDirection2 = messageDirection;
        OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(C33129mqd.gEmmrt(inHouseIMMessageEntity.getChannelId()), sPI.copydefault(java.lang.Integer.valueOf(inHouseIMMessageEntity.getChannelType())), oKMessageContent$default);
        long seq = inHouseIMMessageEntity.getSeq();
        java.lang.String messageId = inHouseIMMessageEntity.getMessageId();
        java.lang.String senderUid2 = inHouseIMMessageEntity.getSenderUid();
        long jValueOf = C33129mqd.valueOf(java.lang.Long.valueOf(inHouseIMMessageEntity.getSendTime()));
        long jValueOf2 = C33129mqd.valueOf(inHouseIMMessageEntity.getReceiveTime());
        OKMessage.SentStatus sentStatusOLrzqt = OLrzqt(inHouseIMMessageEntity);
        java.lang.Integer error = inHouseIMMessageEntity.getError();
        java.lang.Boolean boolIsVisible = inHouseIMMessageEntity.isVisible();
        boolean zBooleanValue = boolIsVisible != null ? boolIsVisible.booleanValue() : true;
        java.lang.String extra = inHouseIMMessageEntity.getExtra();
        return oKMessageAEQbTJ.copy((262143 & 1) != 0 ? oKMessageAEQbTJ.seq : seq, (262143 & 2) != 0 ? oKMessageAEQbTJ.clientMessageId : messageId, (262143 & 4) != 0 ? oKMessageAEQbTJ.targetId : null, (262143 & 8) != 0 ? oKMessageAEQbTJ.senderUserId : senderUid2, (262143 & 16) != 0 ? oKMessageAEQbTJ.messageType : null, (262143 & 32) != 0 ? oKMessageAEQbTJ.conversationType : null, (262143 & 64) != 0 ? oKMessageAEQbTJ.sentTime : jValueOf, (262143 & 128) != 0 ? oKMessageAEQbTJ.receivedTime : jValueOf2, (262143 & 256) != 0 ? oKMessageAEQbTJ.extra : extra == null ? "" : extra, (262143 & 512) != 0 ? oKMessageAEQbTJ.objectName : null, (262143 & 1024) != 0 ? oKMessageAEQbTJ.messageDirection : messageDirection2, (262143 & 2048) != 0 ? oKMessageAEQbTJ.sentStatus : sentStatusOLrzqt, (262143 & 4096) != 0 ? oKMessageAEQbTJ.content : null, (262143 & 8192) != 0 ? oKMessageAEQbTJ.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessageAEQbTJ.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessageAEQbTJ.isVisible : zBooleanValue, (262143 & 65536) != 0 ? oKMessageAEQbTJ.error : error, (262143 & 131072) != 0 ? oKMessageAEQbTJ.reactionDisplay : null);
    }

    public static final OKMessage OLrzqt(@NotNull InHouseIMMessageWithReactions inHouseIMMessageWithReactions) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageWithReactions, "");
        OKMessage oKMessageAEQbTJ = AEQbTJ(inHouseIMMessageWithReactions.getImMessageEntity());
        if (oKMessageAEQbTJ != null) {
            return oKMessageAEQbTJ.copy((262143 & 1) != 0 ? oKMessageAEQbTJ.seq : 0L, (262143 & 2) != 0 ? oKMessageAEQbTJ.clientMessageId : null, (262143 & 4) != 0 ? oKMessageAEQbTJ.targetId : null, (262143 & 8) != 0 ? oKMessageAEQbTJ.senderUserId : null, (262143 & 16) != 0 ? oKMessageAEQbTJ.messageType : null, (262143 & 32) != 0 ? oKMessageAEQbTJ.conversationType : null, (262143 & 64) != 0 ? oKMessageAEQbTJ.sentTime : 0L, (262143 & 128) != 0 ? oKMessageAEQbTJ.receivedTime : 0L, (262143 & 256) != 0 ? oKMessageAEQbTJ.extra : null, (262143 & 512) != 0 ? oKMessageAEQbTJ.objectName : null, (262143 & 1024) != 0 ? oKMessageAEQbTJ.messageDirection : null, (262143 & 2048) != 0 ? oKMessageAEQbTJ.sentStatus : null, (262143 & 4096) != 0 ? oKMessageAEQbTJ.content : null, (262143 & 8192) != 0 ? oKMessageAEQbTJ.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessageAEQbTJ.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessageAEQbTJ.isVisible : false, (262143 & 65536) != 0 ? oKMessageAEQbTJ.error : null, (262143 & 131072) != 0 ? oKMessageAEQbTJ.reactionDisplay : !inHouseIMMessageWithReactions.getImMessageEntity().isRecalled() ? inHouseIMMessageWithReactions.getReactionDisplay() : null);
        }
        return null;
    }

    public static final ContactEntity OLrzqt(@NotNull InHouseIMContactInfoEntity inHouseIMContactInfoEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMContactInfoEntity, "");
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactsId(inHouseIMContactInfoEntity.getContactUid());
        java.lang.String remarkName = inHouseIMContactInfoEntity.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        contactEntity.setRemarkName(remarkName);
        java.lang.String nickname = inHouseIMContactInfoEntity.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        contactEntity.setNickName(nickname);
        contactEntity.setEnNickname(inHouseIMContactInfoEntity.getEnNickname());
        java.lang.String avatar = inHouseIMContactInfoEntity.getAvatar();
        contactEntity.setAvatar(avatar != null ? avatar : "");
        java.lang.Integer blacklisted = inHouseIMContactInfoEntity.getBlacklisted();
        int i = 0;
        contactEntity.setBlackListStatus(blacklisted != null ? blacklisted.intValue() : 0);
        int i2 = ActionBar.copydefault[inHouseIMContactInfoEntity.getRelationType().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 1;
            } else if (i2 == 3) {
                i = 2;
            }
        }
        contactEntity.setStrangerStatus(i);
        contactEntity.setRelationSourceType(inHouseIMContactInfoEntity.getRelationSourceType());
        java.util.List<UserTagType> tags = inHouseIMContactInfoEntity.getTags();
        contactEntity.setOfficialTagInfo(tags != null ? copydefault(tags) : null);
        RelationPermission relationPermission = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setShowVoiceCall(relationPermission != null ? relationPermission.getVoiceCall() : null);
        RelationPermission relationPermission2 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowKycBanner(relationPermission2 != null ? relationPermission2.getShowKycBanner() : null);
        RelationPermission relationPermission3 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowSendMessage(relationPermission3 != null ? relationPermission3.isAllowSendMessage() : null);
        RelationPermission relationPermission4 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowAddContact(relationPermission4 != null ? relationPermission4.isAllowSendMessage() : null);
        contactEntity.setHash(inHouseIMContactInfoEntity.getPhoneHash());
        RelationPermission relationPermission5 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowSingleChatInGroup(relationPermission5 != null ? relationPermission5.isAllowSingleChatInGroup() : null);
        RelationPermission relationPermission6 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setShowUnknownContactBanner(relationPermission6 != null ? relationPermission6.getShowUnknownContactBanner() : null);
        RelationPermission relationPermission7 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowVoice(relationPermission7 != null ? relationPermission7.getAllowVoice() : null);
        RelationPermission relationPermission8 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowPlanetProfile(relationPermission8 != null ? relationPermission8.getAllowPlanetProfile() : null);
        RelationPermission relationPermission9 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowBlockUser(relationPermission9 != null ? relationPermission9.getAllowBlockUser() : null);
        RelationPermission relationPermission10 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setShowVipPerformanceDetails(relationPermission10 != null ? relationPermission10.getShowVipPerformanceDetails() : null);
        RelationPermission relationPermission11 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowRemoveGroupMember(relationPermission11 != null ? relationPermission11.getAllowRemoveGroupMember() : null);
        RelationPermission relationPermission12 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowPay(relationPermission12 != null ? relationPermission12.getAllowPay() : null);
        RelationPermission relationPermission13 = inHouseIMContactInfoEntity.getRelationPermission();
        contactEntity.setAllowFile(relationPermission13 != null ? relationPermission13.getAllowFile() : null);
        contactEntity.setCustomNote(inHouseIMContactInfoEntity.getCustomNote());
        return contactEntity;
    }

    public static final ContactEntity EZpvd(@NotNull ContactWithPhoneData contactWithPhoneData) {
        Intrinsics.checkNotNullParameter(contactWithPhoneData, "");
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactsId(contactWithPhoneData.getContactUid());
        java.lang.String remarkName = contactWithPhoneData.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        contactEntity.setRemarkName(remarkName);
        java.lang.String nickname = contactWithPhoneData.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        contactEntity.setNickName(nickname);
        contactEntity.setEnNickname(contactWithPhoneData.getEnNickname());
        java.lang.String avatar = contactWithPhoneData.getAvatar();
        contactEntity.setAvatar(avatar != null ? avatar : "");
        java.lang.Integer blacklisted = contactWithPhoneData.getBlacklisted();
        int i = 0;
        contactEntity.setBlackListStatus(blacklisted != null ? blacklisted.intValue() : 0);
        int i2 = ActionBar.copydefault[contactWithPhoneData.getRelationType().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 1;
            } else if (i2 == 3) {
                i = 2;
            }
        }
        contactEntity.setStrangerStatus(i);
        contactEntity.setRelationSourceType(contactWithPhoneData.getRelationSourceType());
        java.util.List<UserTagType> tags = contactWithPhoneData.getTags();
        contactEntity.setOfficialTagInfo(tags != null ? copydefault(tags) : null);
        RelationPermission relationPermission = contactWithPhoneData.getRelationPermission();
        contactEntity.setShowVoiceCall(relationPermission != null ? relationPermission.getVoiceCall() : null);
        RelationPermission relationPermission2 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowKycBanner(relationPermission2 != null ? relationPermission2.getShowKycBanner() : null);
        RelationPermission relationPermission3 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowSendMessage(relationPermission3 != null ? relationPermission3.isAllowSendMessage() : null);
        RelationPermission relationPermission4 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowAddContact(relationPermission4 != null ? relationPermission4.isAllowSendMessage() : null);
        contactEntity.setHash(contactWithPhoneData.getPhoneHash());
        contactEntity.setPhoneName(contactWithPhoneData.getPhoneName());
        contactEntity.setPhoneRawNumber(contactWithPhoneData.getPhoneRawNumber());
        RelationPermission relationPermission5 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowSingleChatInGroup(relationPermission5 != null ? relationPermission5.isAllowSingleChatInGroup() : null);
        RelationPermission relationPermission6 = contactWithPhoneData.getRelationPermission();
        contactEntity.setShowUnknownContactBanner(relationPermission6 != null ? relationPermission6.getShowUnknownContactBanner() : null);
        RelationPermission relationPermission7 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowVoice(relationPermission7 != null ? relationPermission7.getAllowVoice() : null);
        RelationPermission relationPermission8 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowPlanetProfile(relationPermission8 != null ? relationPermission8.getAllowPlanetProfile() : null);
        RelationPermission relationPermission9 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowBlockUser(relationPermission9 != null ? relationPermission9.getAllowBlockUser() : null);
        RelationPermission relationPermission10 = contactWithPhoneData.getRelationPermission();
        contactEntity.setShowVipPerformanceDetails(relationPermission10 != null ? relationPermission10.getShowVipPerformanceDetails() : null);
        RelationPermission relationPermission11 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowRemoveGroupMember(relationPermission11 != null ? relationPermission11.getAllowRemoveGroupMember() : null);
        contactEntity.setCustomNote(contactWithPhoneData.getCustomNote());
        RelationPermission relationPermission12 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowPay(relationPermission12 != null ? relationPermission12.getAllowPay() : null);
        RelationPermission relationPermission13 = contactWithPhoneData.getRelationPermission();
        contactEntity.setAllowFile(relationPermission13 != null ? relationPermission13.getAllowFile() : null);
        contactEntity.setOrbitBackgroundImage(contactWithPhoneData.getOrbitBackgroundImage());
        contactEntity.setOrbitStatus(contactWithPhoneData.getOrbitStatus());
        return contactEntity;
    }

    public static final GroupAnnouncementInfo copydefault(@NotNull InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo, GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupAnnouncementInfo, "");
        return new GroupAnnouncementInfo(C33129mqd.valueOf(inHouseIMGroupAnnouncementInfo.getId()), C33129mqd.gEmmrt(inHouseIMGroupAnnouncementInfo.getGroupId()), groupMemberInfo, C33129mqd.gEmmrt(inHouseIMGroupAnnouncementInfo.getContent()), inHouseIMGroupAnnouncementInfo.getPinStatus() != 0, C33129mqd.valueOf(java.lang.Long.valueOf(inHouseIMGroupAnnouncementInfo.getCreateTime())), C33129mqd.valueOf(java.lang.Long.valueOf(inHouseIMGroupAnnouncementInfo.getUpdateTime())), java.lang.Long.valueOf(C33129mqd.valueOf(inHouseIMGroupAnnouncementInfo.getEditTime())), C33129mqd.gEmmrt(inHouseIMGroupAnnouncementInfo.getCreateBy()), C33129mqd.gEmmrt(inHouseIMGroupAnnouncementInfo.getCreateByName()), C33129mqd.gEmmrt(inHouseIMGroupAnnouncementInfo.getUpdateBy()), C33129mqd.gEmmrt(inHouseIMGroupAnnouncementInfo.getUpdateByName()));
    }

    public static final java.util.List<InHouseIMGroupMemberEntity> AEQbTJ(@NotNull java.util.List<InHouseIMGroupMemberEntity> list, @NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        if (groupRole == GroupRole.Unknown) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((InHouseIMGroupMemberEntity) obj).getRole() == groupRole.getCode()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.lang.String OLrzqt(InHouseIMConversationListData inHouseIMConversationListData) {
        java.lang.String bizGroupName = inHouseIMConversationListData.getBizGroupName();
        if (bizGroupName != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizGroupName)) {
            return inHouseIMConversationListData.getBizGroupName();
        }
        java.lang.String remarkName = inHouseIMConversationListData.getRemarkName();
        if (remarkName != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) remarkName)) {
            return inHouseIMConversationListData.getRemarkName();
        }
        java.lang.String phoneName = inHouseIMConversationListData.getPhoneName();
        return (phoneName == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) phoneName)) ? C33129mqd.gEmmrt(KWHzl(inHouseIMConversationListData.getNickname(), inHouseIMConversationListData.getEnNickname())) : inHouseIMConversationListData.getPhoneName();
    }

    public static final java.io.File KWHzl(@NotNull OKMessage oKMessage, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.net.Uri uriOLrzqt = OLrzqt(oKMessage, context);
        if (uriOLrzqt != null) {
            return UriKt.toFile(uriOLrzqt);
        }
        return null;
    }

    public static final android.net.Uri OLrzqt(@NotNull OKMessage oKMessage, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(context, "");
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKReferenceMessage) {
            content = ((OKReferenceMessage) content).getOriginalOKMessageContent();
        } else if (content instanceof OKShareMessage) {
            content = ((OKShareMessage) content).getImage();
        }
        OKMediaMessageContent oKMediaMessageContent = content instanceof OKMediaMessageContent ? (OKMediaMessageContent) content : null;
        OKMessage.SentStatus sentStatus = oKMessage.getSentStatus();
        if (sentStatus != null && ActionBar.KWHzl[sentStatus.ordinal()] == 1) {
            if (oKMediaMessageContent != null) {
                return oKMediaMessageContent.getLocalUri();
            }
            return null;
        }
        if (oKMediaMessageContent != null) {
            return EZpvd(oKMediaMessageContent, context);
        }
        return null;
    }

    public static final android.net.Uri EZpvd(@NotNull OKMediaMessageContent oKMediaMessageContent, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(oKMediaMessageContent, "");
        Intrinsics.checkNotNullParameter(context, "");
        return OLrzqt(oKMediaMessageContent.getRemoteUri(), context);
    }

    public static final android.net.Uri OLrzqt(android.net.Uri uri, android.content.Context context) {
        java.lang.String strAEQbTJ = AEQbTJ(uri);
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null) {
            return null;
        }
        return android.net.Uri.fromFile(new java.io.File(externalFilesDir, strAEQbTJ));
    }

    public static final java.lang.String AEQbTJ(android.net.Uri uri) {
        java.lang.String lastPathSegment;
        if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
            return lastPathSegment;
        }
        return "file_" + java.lang.System.currentTimeMillis();
    }

    public static final OKMessage.SentStatus OLrzqt(InHouseIMMessageEntity inHouseIMMessageEntity) {
        if (Intrinsics.EZpvd(inHouseIMMessageEntity.isReceiveReadReceipt(), java.lang.Boolean.TRUE)) {
            return OKMessage.SentStatus.READ;
        }
        OKMessage.SentStatus sentStatusKWHzl = OKMessage.SentStatus.Companion.KWHzl(inHouseIMMessageEntity.getSentStatus());
        if (sentStatusKWHzl != null) {
            return sentStatusKWHzl;
        }
        int sentStatus = inHouseIMMessageEntity.getSentStatus();
        if (sentStatus == 1) {
            return OKMessage.SentStatus.SENDING;
        }
        if (sentStatus == 2) {
            return OKMessage.SentStatus.FAILED;
        }
        return OKMessage.SentStatus.SENT;
    }

    public static final OfficialTagInfo KWHzl(java.util.List<java.lang.Integer> list, java.lang.Integer num) {
        java.util.List listAhwBna;
        OfficialTagType officialTagTypeFromInHouseUserTag;
        if (list == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Number) it.next()).intValue();
                int apiValue = InHouseIMChannelType.Group.getApiValue();
                if (num != null && num.intValue() == apiValue) {
                    officialTagTypeFromInHouseUserTag = OfficialTagType.CREATOR.fromInHouseGroupTag(GroupTagType.Companion.copydefault(java.lang.Integer.valueOf(iIntValue)));
                } else {
                    officialTagTypeFromInHouseUserTag = OfficialTagType.CREATOR.fromInHouseUserTag(UserTagType.Companion.OLrzqt(iIntValue));
                }
                listAhwBna.add(officialTagTypeFromInHouseUserTag);
            }
        }
        return new OfficialTagInfo((java.util.List) null, (java.util.List) null, (java.util.List) null, listAhwBna, 7, (DefaultConstructorMarker) null);
    }

    public static final OfficialTagInfo copydefault(@NotNull java.util.List<? extends UserTagType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OfficialTagType officialTagTypeFromInHouseUserTag = OfficialTagType.CREATOR.fromInHouseUserTag((UserTagType) it.next());
            if (officialTagTypeFromInHouseUserTag != null) {
                arrayList.add(officialTagTypeFromInHouseUserTag);
            }
        }
        return new OfficialTagInfo((java.util.List) null, (java.util.List) null, (java.util.List) null, arrayList, 7, (DefaultConstructorMarker) null);
    }
}
