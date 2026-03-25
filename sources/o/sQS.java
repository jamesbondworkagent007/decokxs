package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser;
import com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SenderName;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta;
import com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQS {
    public static final WSSendMessageDetailData AEQbTJ(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : null, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
    }

    public static final InHouseIMMessageEntity copydefault(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        return inHouseIMMessageEntity.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity.isVisible : null, ((-2) & 512) != 0 ? inHouseIMMessageEntity.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity.sentStatus : 0, ((-2) & 16384) != 0 ? inHouseIMMessageEntity.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity.reactionUpdateTime : 0L);
    }

    public static /* synthetic */ InHouseIMMessageEntity toInHouseIMMessageEntity$default(WSSendMessageDetailData wSSendMessageDetailData, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return copydefault(wSSendMessageDetailData, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InHouseIMMessageEntity copydefault(@NotNull WSSendMessageDetailData wSSendMessageDetailData, int i) {
        java.lang.Long groupId;
        java.lang.String lastMsgSeq;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        java.lang.String clientMsgId = wSSendMessageDetailData.getClientMsgId();
        if (clientMsgId == null) {
            clientMsgId = wSSendMessageDetailData.getChannelId() + wSSendMessageDetailData.getSeq();
        } else {
            if (clientMsgId.length() == 0) {
                clientMsgId = null;
            }
            if (clientMsgId == null) {
            }
        }
        java.lang.String str = clientMsgId;
        C44434sPr c44434sPrOLrzqt = sMS.djBIcL.OLrzqt(wSSendMessageDetailData);
        java.lang.String channelId = wSSendMessageDetailData.getChannelId();
        java.lang.String str2 = channelId == null ? "" : channelId;
        java.lang.String senderUid = wSSendMessageDetailData.getSenderUid();
        java.lang.String str3 = senderUid == null ? "" : senderUid;
        long jValueOf = C33129mqd.valueOf(wSSendMessageDetailData.getSeq());
        InHouseIMPlatformType senderPlatformType = wSSendMessageDetailData.getSenderPlatformType();
        if (senderPlatformType == null) {
            senderPlatformType = InHouseIMPlatformType.Unknown;
        }
        int apiValue = senderPlatformType.getApiValue();
        InHouseIMContentType contentType = wSSendMessageDetailData.getContentType();
        if (contentType == null) {
            contentType = InHouseIMContentType.Unknown;
        }
        int apiValue2 = contentType.getApiValue();
        InHouseIMChannelType channelType = wSSendMessageDetailData.getChannelType();
        if (channelType == null) {
            channelType = InHouseIMChannelType.Unknown;
        }
        int apiValue3 = channelType.getApiValue();
        JsonElement extra = wSSendMessageDetailData.getExtra();
        java.lang.String strGEmmrt = extra != null ? C33129mqd.gEmmrt(extra) : null;
        java.lang.String strKWHzl = KWHzl(wSSendMessageDetailData.getTextMessage());
        java.lang.Long sendTime = wSSendMessageDetailData.getSendTime();
        long jLongValue = sendTime != null ? sendTime.longValue() : 0L;
        WSSendMessageDetailData quotedMessage = wSSendMessageDetailData.getQuotedMessage();
        java.lang.Long seq = quotedMessage != null ? quotedMessage.getSeq() : null;
        WSSendReactionResponse reaction = wSSendMessageDetailData.getReaction();
        long jKWHzl = reaction != null ? reaction.KWHzl() : 0L;
        SenderName senderName = wSSendMessageDetailData.getSenderName();
        java.lang.String nickname = senderName != null ? senderName.getNickname() : null;
        SenderName senderName2 = wSSendMessageDetailData.getSenderName();
        java.lang.String enNickname = senderName2 != null ? senderName2.getEnNickname() : null;
        SenderName senderName3 = wSSendMessageDetailData.getSenderName();
        java.lang.String avatar = senderName3 != null ? senderName3.getAvatar() : null;
        java.lang.Long lookupSeq = wSSendMessageDetailData.getLookupSeq();
        java.lang.Integer status = wSSendMessageDetailData.getStatus();
        FrontendOption frontendOption = wSSendMessageDetailData.getFrontendOption();
        SystemMessageData systemMessage = wSSendMessageDetailData.getSystemMessage();
        CustomMessageData customMessage = wSSendMessageDetailData.getCustomMessage();
        ShareMessageData shareMessage = wSSendMessageDetailData.getShareMessage();
        StreamPlaceHolderMessageData streamPlaceholderMessage = wSSendMessageDetailData.getStreamPlaceholderMessage();
        RecallMessageData senderRecallMessage = wSSendMessageDetailData.getSenderRecallMessage();
        if (senderRecallMessage == null) {
            senderRecallMessage = wSSendMessageDetailData.getAdminRecallMessage();
        }
        RecallMessageData recallMessageData = senderRecallMessage;
        WSSendMessageDetailData quotedMessage2 = wSSendMessageDetailData.getQuotedMessage();
        InHouseIMMessageEntity inHouseIMMessageEntity$default = quotedMessage2 != null ? toInHouseIMMessageEntity$default(quotedMessage2, 0, 1, null) : null;
        ReadReceiptMessageData readReceiptMessage = wSSendMessageDetailData.getReadReceiptMessage();
        java.lang.Long lValueOf = (readReceiptMessage == null || (lastMsgSeq = readReceiptMessage.getLastMsgSeq()) == null) ? null : java.lang.Long.valueOf(C33129mqd.valueOf(lastMsgSeq));
        TextMessageData textMessage = wSSendMessageDetailData.getTextMessage();
        java.lang.Integer numEZpvd = textMessage != null ? textMessage.EZpvd() : null;
        TextMessageData textMessage2 = wSSendMessageDetailData.getTextMessage();
        java.util.List<InhouseIMAtUser> listAEQbTJ = textMessage2 != null ? textMessage2.AEQbTJ() : null;
        TextMessageData textMessage3 = wSSendMessageDetailData.getTextMessage();
        java.lang.String strKWHzl2 = textMessage3 != null ? textMessage3.KWHzl() : null;
        TextMessageData textMessage4 = wSSendMessageDetailData.getTextMessage();
        java.util.List<java.lang.String> listAYXKKw = textMessage4 != null ? textMessage4.AYXKKw() : null;
        TextMessageData textMessage5 = wSSendMessageDetailData.getTextMessage();
        SiteMeta siteMetaOLrzqt = textMessage5 != null ? textMessage5.OLrzqt() : null;
        StickerMessageData stickerMessage = wSSendMessageDetailData.getStickerMessage();
        java.lang.String stickerId = stickerMessage != null ? stickerMessage.getStickerId() : null;
        StickerMessageData stickerMessage2 = wSSendMessageDetailData.getStickerMessage();
        java.lang.String path = stickerMessage2 != null ? stickerMessage2.getPath() : null;
        java.lang.String strOLrzqt = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.OLrzqt() : null;
        java.lang.String strGEmmrt2 = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.gEmmrt() : null;
        java.lang.String strFetchVPNInfo = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.fetchVPNInfo() : null;
        java.lang.String strEZpvd = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.EZpvd() : null;
        java.lang.String strAYXKKw = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.AYXKKw() : null;
        java.lang.Integer numDjBIcL = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.djBIcL() : null;
        java.lang.Integer numValueOf = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.valueOf() : null;
        java.lang.Integer numCopydefault = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.copydefault() : null;
        java.lang.Long lAhwBna = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.AhwBna() : null;
        java.lang.String strKWHzl3 = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.KWHzl() : null;
        java.lang.String strAEQbTJ = c44434sPrOLrzqt != null ? c44434sPrOLrzqt.AEQbTJ() : null;
        CallMessageData callMessage = wSSendMessageDetailData.getCallMessage();
        java.lang.Integer callType = callMessage != null ? callMessage.getCallType() : null;
        CallMessageData callMessage2 = wSSendMessageDetailData.getCallMessage();
        java.lang.Integer signalType = callMessage2 != null ? callMessage2.getSignalType() : null;
        CallMessageData callMessage3 = wSSendMessageDetailData.getCallMessage();
        java.lang.Long duration = callMessage3 != null ? callMessage3.getDuration() : null;
        CallMessageData callMessage4 = wSSendMessageDetailData.getCallMessage();
        java.lang.String callerUid = callMessage4 != null ? callMessage4.getCallerUid() : null;
        GroupInvitationMessageData groupInvitationMessage = wSSendMessageDetailData.getGroupInvitationMessage();
        java.lang.String invitationId = groupInvitationMessage != null ? groupInvitationMessage.getInvitationId() : null;
        GroupInvitationMessageData groupInvitationMessage2 = wSSendMessageDetailData.getGroupInvitationMessage();
        java.lang.String strGEmmrt3 = (groupInvitationMessage2 == null || (groupId = groupInvitationMessage2.getGroupId()) == null) ? null : C33129mqd.gEmmrt(groupId);
        GroupInvitationMessageData groupInvitationMessage3 = wSSendMessageDetailData.getGroupInvitationMessage();
        java.lang.String inviterUid = groupInvitationMessage3 != null ? groupInvitationMessage3.getInviterUid() : null;
        GroupInvitationMessageData groupInvitationMessage4 = wSSendMessageDetailData.getGroupInvitationMessage();
        java.lang.Long expireTime = groupInvitationMessage4 != null ? groupInvitationMessage4.getExpireTime() : null;
        GroupInvitationMessageData groupInvitationMessage5 = wSSendMessageDetailData.getGroupInvitationMessage();
        java.lang.String groupName = groupInvitationMessage5 != null ? groupInvitationMessage5.getGroupName() : null;
        GroupInvitationMessageData groupInvitationMessage6 = wSSendMessageDetailData.getGroupInvitationMessage();
        return new InHouseIMMessageEntity(str, str2, str3, jValueOf, apiValue, apiValue2, apiValue3, null, null, jLongValue, null, strGEmmrt, status, i, null, false, false, null, strKWHzl2, listAEQbTJ, numEZpvd, listAYXKKw, siteMetaOLrzqt, strKWHzl, strOLrzqt, strGEmmrt2, strFetchVPNInfo, strAYXKKw, numDjBIcL, numValueOf, numCopydefault, lAhwBna, strEZpvd, strKWHzl3, strAEQbTJ, callType, signalType, duration, callerUid, seq, inHouseIMMessageEntity$default, customMessage, systemMessage, shareMessage, streamPlaceholderMessage, stickerId, path, lValueOf, recallMessageData, invitationId, strGEmmrt3, inviterUid, expireTime, groupName, groupInvitationMessage6 != null ? groupInvitationMessage6.getGroupAvatar() : null, nickname, avatar, enNickname, lookupSeq, frontendOption, jKWHzl);
    }

    public static final java.lang.String KWHzl(TextMessageData textMessageData) {
        java.util.List<InhouseIMAtUser> listAhwBna;
        java.lang.String strKWHzl = textMessageData != null ? textMessageData.KWHzl() : null;
        if (textMessageData == null || (listAhwBna = textMessageData.AEQbTJ()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (strKWHzl == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl) || listAhwBna.isEmpty()) {
            return strKWHzl;
        }
        java.util.Iterator<T> it = listAhwBna.iterator();
        java.lang.String strReplace$default = strKWHzl;
        while (it.hasNext()) {
            java.lang.String strOLrzqt = ((InhouseIMAtUser) it.next()).OLrzqt();
            if (strOLrzqt != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                strReplace$default = C59449zhJ.replace$default(strReplace$default, strOLrzqt, "", false, 4, (java.lang.Object) null);
            }
        }
        return strReplace$default;
    }

    public static final boolean KWHzl(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        return (inHouseIMMessageEntity.getSenderPlatformType() == InHouseIMPlatformType.Android.getApiValue() && Intrinsics.EZpvd((java.lang.Object) inHouseIMMessageEntity.getSenderUid(), (java.lang.Object) C44157sFk.KWHzl()) && inHouseIMMessageEntity.getMessageId().length() != 0) ? false : true;
    }
}
