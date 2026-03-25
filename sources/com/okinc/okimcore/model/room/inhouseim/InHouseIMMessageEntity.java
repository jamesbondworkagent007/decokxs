package com.okinc.okimcore.model.room.inhouseim;

import androidx.room.TypeConverters;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser;
import com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData$$serializer;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData$$serializer;
import java.util.List;
import java.util.UUID;
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
import o.C44232sIe;
import o.C44239sIl;
import o.C44245sIr;
import o.C44252sIy;
import o.sII;
import o.sIJ;
import o.sIK;
import o.sIO;
import o.sIP;
import o.sIQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMMessageEntity {
    public static final int SEND_STATUS_FAILED = 2;
    public static final int SEND_STATUS_SENDING = 1;
    public static final int SEND_STATUS_SENT = 0;
    private final Integer atType;
    private final List<InhouseIMAtUser> atUserList;
    private final Long callDuration;
    private final Integer callStatus;
    private final Integer callType;
    private final String callerUid;
    private final String channelId;
    private final int channelType;
    private final int contentType;
    private final CustomMessageData customMessage;
    private Integer error;
    private final String extra;
    private final String fileExtension;
    private final String fileId;
    private final String fileName;
    private final FrontendOption frontendOption;
    private final String groupInvitationGroupId;
    private final String groupInviteAvatar;
    private final Long groupInviteExpireTime;
    private final String groupInviteName;
    private final String groupInviterUid;
    private final String invitationId;
    private final boolean isMentionMe;
    private final Boolean isRead;
    private final boolean isRecalled;
    private final Boolean isReceiveReadReceipt;
    private final Boolean isVisible;
    private final String localUri;
    private final Long lookupSeq;
    private final Integer mediaDuration;
    private final Integer mediaHeight;
    private final Long mediaSize;
    private final String mediaThumbnail;
    private final Integer mediaWidth;
    private final String messageId;
    private final String messageTextWithoutTagContent;
    private final InHouseIMMessageEntity quotedMessage;
    private final long reactionUpdateTime;
    private final Long readReceiptSequence;
    private final RecallMessageData recallMessage;
    private final Long receiveTime;
    private final Long replySeq;
    private final long sendTime;
    private final String senderAvatar;
    private final String senderEnNickName;
    private final String senderNickname;
    private final int senderPlatformType;
    private final String senderUid;
    private final int sentStatus;
    private final long seq;
    private final ShareMessageData shareMessage;
    private final Boolean shouldIncludeInUnreadCount;
    private final SiteMeta siteMeta;
    private final Integer status;
    private final String stickerId;
    private final String stickerPath;
    private final StreamPlaceHolderMessageData streamPlaceholderMessage;
    private final SystemMessageData systemMessage;
    private final String textContent;
    private final List<String> urlList;
    private final String urlPathCn;
    private final String urlPathDefault;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InhouseIMAtUser$$serializer.INSTANCE), null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.sendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.shouldIncludeInUnreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.receiveTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isRecalled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isMentionMe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.isReceiveReadReceipt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.textContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InhouseIMAtUser> component20() {
        return this.atUserList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.atType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component22() {
        return this.urlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteMeta component23() {
        return this.siteMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.messageTextWithoutTagContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.urlPathCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.urlPathDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.mediaThumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.mediaWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component30() {
        return this.mediaHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.mediaDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component32() {
        return this.mediaSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.fileExtension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component36() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component37() {
        return this.callStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component38() {
        return this.callDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.callerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component40() {
        return this.replySeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity component41() {
        return this.quotedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomMessageData component42() {
        return this.customMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemMessageData component43() {
        return this.systemMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareMessageData component44() {
        return this.shareMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StreamPlaceHolderMessageData component45() {
        return this.streamPlaceholderMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.stickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.stickerPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component48() {
        return this.readReceiptSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData component49() {
        return this.recallMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.senderPlatformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.groupInvitationGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.groupInviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component53() {
        return this.groupInviteExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.groupInviteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.groupInviteAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.senderNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.senderAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.senderEnNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component59() {
        return this.lookupSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrontendOption component60() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component61() {
        return this.reactionUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isRead;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, int i2, int i3, Boolean bool, Boolean bool2, long j2, Boolean bool3, String str4, Integer num, int i4, Long l, boolean z, boolean z2, Boolean bool4, String str5, @TypeConverters({C44245sIr.class}) List<InhouseIMAtUser> list, Integer num2, @TypeConverters({sIO.class}) List<String> list2, @TypeConverters({sII.class}) SiteMeta siteMeta, String str6, String str7, String str8, String str9, String str10, Integer num3, Integer num4, Integer num5, Long l2, String str11, String str12, String str13, Integer num6, Integer num7, Long l3, String str14, Long l4, @TypeConverters({C44252sIy.class}) InHouseIMMessageEntity inHouseIMMessageEntity, @TypeConverters({C44232sIe.class}) CustomMessageData customMessageData, @TypeConverters({sIQ.class}) SystemMessageData systemMessageData, @TypeConverters({sIK.class}) ShareMessageData shareMessageData, @TypeConverters({sIP.class}) StreamPlaceHolderMessageData streamPlaceHolderMessageData, String str15, String str16, Long l5, @TypeConverters({sIJ.class}) RecallMessageData recallMessageData, String str17, String str18, String str19, Long l6, String str20, String str21, String str22, String str23, String str24, Long l7, @TypeConverters({C44239sIl.class}) FrontendOption frontendOption, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InHouseIMMessageEntity(str, str2, str3, j, i, i2, i3, bool, bool2, j2, bool3, str4, num, i4, l, z, z2, bool4, str5, list, num2, list2, siteMeta, str6, str7, str8, str9, str10, num3, num4, num5, l2, str11, str12, str13, num6, num7, l3, str14, l4, inHouseIMMessageEntity, customMessageData, systemMessageData, shareMessageData, streamPlaceHolderMessageData, str15, str16, l5, recallMessageData, str17, str18, str19, l6, str20, str21, str22, str23, str24, l7, frontendOption, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageEntity)) {
            return false;
        }
        InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) obj;
        return Intrinsics.EZpvd((Object) this.messageId, (Object) inHouseIMMessageEntity.messageId) && Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMMessageEntity.channelId) && Intrinsics.EZpvd((Object) this.senderUid, (Object) inHouseIMMessageEntity.senderUid) && this.seq == inHouseIMMessageEntity.seq && this.senderPlatformType == inHouseIMMessageEntity.senderPlatformType && this.contentType == inHouseIMMessageEntity.contentType && this.channelType == inHouseIMMessageEntity.channelType && Intrinsics.EZpvd(this.isRead, inHouseIMMessageEntity.isRead) && Intrinsics.EZpvd(this.isVisible, inHouseIMMessageEntity.isVisible) && this.sendTime == inHouseIMMessageEntity.sendTime && Intrinsics.EZpvd(this.shouldIncludeInUnreadCount, inHouseIMMessageEntity.shouldIncludeInUnreadCount) && Intrinsics.EZpvd((Object) this.extra, (Object) inHouseIMMessageEntity.extra) && Intrinsics.EZpvd(this.status, inHouseIMMessageEntity.status) && this.sentStatus == inHouseIMMessageEntity.sentStatus && Intrinsics.EZpvd(this.receiveTime, inHouseIMMessageEntity.receiveTime) && this.isRecalled == inHouseIMMessageEntity.isRecalled && this.isMentionMe == inHouseIMMessageEntity.isMentionMe && Intrinsics.EZpvd(this.isReceiveReadReceipt, inHouseIMMessageEntity.isReceiveReadReceipt) && Intrinsics.EZpvd((Object) this.textContent, (Object) inHouseIMMessageEntity.textContent) && Intrinsics.EZpvd(this.atUserList, inHouseIMMessageEntity.atUserList) && Intrinsics.EZpvd(this.atType, inHouseIMMessageEntity.atType) && Intrinsics.EZpvd(this.urlList, inHouseIMMessageEntity.urlList) && Intrinsics.EZpvd(this.siteMeta, inHouseIMMessageEntity.siteMeta) && Intrinsics.EZpvd((Object) this.messageTextWithoutTagContent, (Object) inHouseIMMessageEntity.messageTextWithoutTagContent) && Intrinsics.EZpvd((Object) this.fileId, (Object) inHouseIMMessageEntity.fileId) && Intrinsics.EZpvd((Object) this.urlPathCn, (Object) inHouseIMMessageEntity.urlPathCn) && Intrinsics.EZpvd((Object) this.urlPathDefault, (Object) inHouseIMMessageEntity.urlPathDefault) && Intrinsics.EZpvd((Object) this.mediaThumbnail, (Object) inHouseIMMessageEntity.mediaThumbnail) && Intrinsics.EZpvd(this.mediaWidth, inHouseIMMessageEntity.mediaWidth) && Intrinsics.EZpvd(this.mediaHeight, inHouseIMMessageEntity.mediaHeight) && Intrinsics.EZpvd(this.mediaDuration, inHouseIMMessageEntity.mediaDuration) && Intrinsics.EZpvd(this.mediaSize, inHouseIMMessageEntity.mediaSize) && Intrinsics.EZpvd((Object) this.localUri, (Object) inHouseIMMessageEntity.localUri) && Intrinsics.EZpvd((Object) this.fileName, (Object) inHouseIMMessageEntity.fileName) && Intrinsics.EZpvd((Object) this.fileExtension, (Object) inHouseIMMessageEntity.fileExtension) && Intrinsics.EZpvd(this.callType, inHouseIMMessageEntity.callType) && Intrinsics.EZpvd(this.callStatus, inHouseIMMessageEntity.callStatus) && Intrinsics.EZpvd(this.callDuration, inHouseIMMessageEntity.callDuration) && Intrinsics.EZpvd((Object) this.callerUid, (Object) inHouseIMMessageEntity.callerUid) && Intrinsics.EZpvd(this.replySeq, inHouseIMMessageEntity.replySeq) && Intrinsics.EZpvd(this.quotedMessage, inHouseIMMessageEntity.quotedMessage) && Intrinsics.EZpvd(this.customMessage, inHouseIMMessageEntity.customMessage) && Intrinsics.EZpvd(this.systemMessage, inHouseIMMessageEntity.systemMessage) && Intrinsics.EZpvd(this.shareMessage, inHouseIMMessageEntity.shareMessage) && Intrinsics.EZpvd(this.streamPlaceholderMessage, inHouseIMMessageEntity.streamPlaceholderMessage) && Intrinsics.EZpvd((Object) this.stickerId, (Object) inHouseIMMessageEntity.stickerId) && Intrinsics.EZpvd((Object) this.stickerPath, (Object) inHouseIMMessageEntity.stickerPath) && Intrinsics.EZpvd(this.readReceiptSequence, inHouseIMMessageEntity.readReceiptSequence) && Intrinsics.EZpvd(this.recallMessage, inHouseIMMessageEntity.recallMessage) && Intrinsics.EZpvd((Object) this.invitationId, (Object) inHouseIMMessageEntity.invitationId) && Intrinsics.EZpvd((Object) this.groupInvitationGroupId, (Object) inHouseIMMessageEntity.groupInvitationGroupId) && Intrinsics.EZpvd((Object) this.groupInviterUid, (Object) inHouseIMMessageEntity.groupInviterUid) && Intrinsics.EZpvd(this.groupInviteExpireTime, inHouseIMMessageEntity.groupInviteExpireTime) && Intrinsics.EZpvd((Object) this.groupInviteName, (Object) inHouseIMMessageEntity.groupInviteName) && Intrinsics.EZpvd((Object) this.groupInviteAvatar, (Object) inHouseIMMessageEntity.groupInviteAvatar) && Intrinsics.EZpvd((Object) this.senderNickname, (Object) inHouseIMMessageEntity.senderNickname) && Intrinsics.EZpvd((Object) this.senderAvatar, (Object) inHouseIMMessageEntity.senderAvatar) && Intrinsics.EZpvd((Object) this.senderEnNickName, (Object) inHouseIMMessageEntity.senderEnNickName) && Intrinsics.EZpvd(this.lookupSeq, inHouseIMMessageEntity.lookupSeq) && Intrinsics.EZpvd(this.frontendOption, inHouseIMMessageEntity.frontendOption) && this.reactionUpdateTime == inHouseIMMessageEntity.reactionUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAtType() {
        return this.atType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InhouseIMAtUser> getAtUserList() {
        return this.atUserList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCallDuration() {
        return this.callDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallStatus() {
        return this.callStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallType() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallerUid() {
        return this.callerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChannelType() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomMessageData getCustomMessage() {
        return this.customMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrontendOption getFrontendOption() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupInvitationGroupId() {
        return this.groupInvitationGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupInviteAvatar() {
        return this.groupInviteAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupInviteExpireTime() {
        return this.groupInviteExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupInviteName() {
        return this.groupInviteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupInviterUid() {
        return this.groupInviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalUri() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLookupSeq() {
        return this.lookupSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMediaDuration() {
        return this.mediaDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMediaHeight() {
        return this.mediaHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMediaSize() {
        return this.mediaSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMediaThumbnail() {
        return this.mediaThumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMediaWidth() {
        return this.mediaWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageTextWithoutTagContent() {
        return this.messageTextWithoutTagContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity getQuotedMessage() {
        return this.quotedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReactionUpdateTime() {
        return this.reactionUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getReadReceiptSequence() {
        return this.readReceiptSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData getRecallMessage() {
        return this.recallMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getReceiveTime() {
        return this.receiveTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getReplySeq() {
        return this.replySeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSendTime() {
        return this.sendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderAvatar() {
        return this.senderAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderEnNickName() {
        return this.senderEnNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderNickname() {
        return this.senderNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSenderPlatformType() {
        return this.senderPlatformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderUid() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSentStatus() {
        return this.sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareMessageData getShareMessage() {
        return this.shareMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldIncludeInUnreadCount() {
        return this.shouldIncludeInUnreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteMeta getSiteMeta() {
        return this.siteMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStickerId() {
        return this.stickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStickerPath() {
        return this.stickerPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StreamPlaceHolderMessageData getStreamPlaceholderMessage() {
        return this.streamPlaceholderMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemMessageData getSystemMessage() {
        return this.systemMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextContent() {
        return this.textContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUrlList() {
        return this.urlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlPathCn() {
        return this.urlPathCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlPathDefault() {
        return this.urlPathDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.messageId.hashCode();
        int iHashCode2 = this.channelId.hashCode();
        int iHashCode3 = this.senderUid.hashCode();
        int iHashCode4 = Long.hashCode(this.seq);
        int iHashCode5 = Integer.hashCode(this.senderPlatformType);
        int iHashCode6 = Integer.hashCode(this.contentType);
        int iHashCode7 = Integer.hashCode(this.channelType);
        Boolean bool = this.isRead;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isVisible;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode10 = Long.hashCode(this.sendTime);
        Boolean bool3 = this.shouldIncludeInUnreadCount;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.extra;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        Integer num = this.status;
        int iHashCode13 = num == null ? 0 : num.hashCode();
        int iHashCode14 = Integer.hashCode(this.sentStatus);
        Long l = this.receiveTime;
        int iHashCode15 = l == null ? 0 : l.hashCode();
        int iHashCode16 = Boolean.hashCode(this.isRecalled);
        int iHashCode17 = Boolean.hashCode(this.isMentionMe);
        Boolean bool4 = this.isReceiveReadReceipt;
        int iHashCode18 = bool4 == null ? 0 : bool4.hashCode();
        String str2 = this.textContent;
        int iHashCode19 = str2 == null ? 0 : str2.hashCode();
        List<InhouseIMAtUser> list = this.atUserList;
        int iHashCode20 = list == null ? 0 : list.hashCode();
        Integer num2 = this.atType;
        int iHashCode21 = num2 == null ? 0 : num2.hashCode();
        List<String> list2 = this.urlList;
        int iHashCode22 = list2 == null ? 0 : list2.hashCode();
        SiteMeta siteMeta = this.siteMeta;
        int iHashCode23 = siteMeta == null ? 0 : siteMeta.hashCode();
        String str3 = this.messageTextWithoutTagContent;
        int iHashCode24 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fileId;
        int iHashCode25 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.urlPathCn;
        int iHashCode26 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.urlPathDefault;
        int iHashCode27 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.mediaThumbnail;
        int iHashCode28 = str7 == null ? 0 : str7.hashCode();
        Integer num3 = this.mediaWidth;
        int iHashCode29 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.mediaHeight;
        int iHashCode30 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.mediaDuration;
        int iHashCode31 = num5 == null ? 0 : num5.hashCode();
        Long l2 = this.mediaSize;
        int iHashCode32 = l2 == null ? 0 : l2.hashCode();
        String str8 = this.localUri;
        int iHashCode33 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.fileName;
        int iHashCode34 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.fileExtension;
        int iHashCode35 = str10 == null ? 0 : str10.hashCode();
        Integer num6 = this.callType;
        int iHashCode36 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.callStatus;
        int iHashCode37 = num7 == null ? 0 : num7.hashCode();
        Long l3 = this.callDuration;
        int iHashCode38 = l3 == null ? 0 : l3.hashCode();
        String str11 = this.callerUid;
        int iHashCode39 = str11 == null ? 0 : str11.hashCode();
        Long l4 = this.replySeq;
        int iHashCode40 = l4 == null ? 0 : l4.hashCode();
        InHouseIMMessageEntity inHouseIMMessageEntity = this.quotedMessage;
        int iHashCode41 = inHouseIMMessageEntity == null ? 0 : inHouseIMMessageEntity.hashCode();
        CustomMessageData customMessageData = this.customMessage;
        int iHashCode42 = customMessageData == null ? 0 : customMessageData.hashCode();
        SystemMessageData systemMessageData = this.systemMessage;
        int iHashCode43 = systemMessageData == null ? 0 : systemMessageData.hashCode();
        ShareMessageData shareMessageData = this.shareMessage;
        int iHashCode44 = shareMessageData == null ? 0 : shareMessageData.hashCode();
        StreamPlaceHolderMessageData streamPlaceHolderMessageData = this.streamPlaceholderMessage;
        int iHashCode45 = streamPlaceHolderMessageData == null ? 0 : streamPlaceHolderMessageData.hashCode();
        String str12 = this.stickerId;
        int iHashCode46 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.stickerPath;
        int iHashCode47 = str13 == null ? 0 : str13.hashCode();
        Long l5 = this.readReceiptSequence;
        int iHashCode48 = l5 == null ? 0 : l5.hashCode();
        RecallMessageData recallMessageData = this.recallMessage;
        int iHashCode49 = recallMessageData == null ? 0 : recallMessageData.hashCode();
        String str14 = this.invitationId;
        int iHashCode50 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.groupInvitationGroupId;
        int iHashCode51 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.groupInviterUid;
        int iHashCode52 = str16 == null ? 0 : str16.hashCode();
        Long l6 = this.groupInviteExpireTime;
        int iHashCode53 = l6 == null ? 0 : l6.hashCode();
        String str17 = this.groupInviteName;
        int iHashCode54 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.groupInviteAvatar;
        int iHashCode55 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.senderNickname;
        int iHashCode56 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.senderAvatar;
        int iHashCode57 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.senderEnNickName;
        int iHashCode58 = str21 == null ? 0 : str21.hashCode();
        Long l7 = this.lookupSeq;
        int iHashCode59 = l7 == null ? 0 : l7.hashCode();
        FrontendOption frontendOption = this.frontendOption;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + (frontendOption == null ? 0 : frontendOption.hashCode())) * 31) + Long.hashCode(this.reactionUpdateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMentionMe() {
        return this.isMentionMe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRead() {
        return this.isRead;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecalled() {
        return this.isRecalled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isReceiveReadReceipt() {
        return this.isReceiveReadReceipt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isVisible() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(Integer num) {
        this.error = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageEntity(messageId=" + this.messageId + ", channelId=" + this.channelId + ", senderUid=" + this.senderUid + ", seq=" + this.seq + ", senderPlatformType=" + this.senderPlatformType + ", contentType=" + this.contentType + ", channelType=" + this.channelType + ", isRead=" + this.isRead + ", isVisible=" + this.isVisible + ", sendTime=" + this.sendTime + ", shouldIncludeInUnreadCount=" + this.shouldIncludeInUnreadCount + ", extra=" + this.extra + ", status=" + this.status + ", sentStatus=" + this.sentStatus + ", receiveTime=" + this.receiveTime + ", isRecalled=" + this.isRecalled + ", isMentionMe=" + this.isMentionMe + ", isReceiveReadReceipt=" + this.isReceiveReadReceipt + ", textContent=" + this.textContent + ", atUserList=" + this.atUserList + ", atType=" + this.atType + ", urlList=" + this.urlList + ", siteMeta=" + this.siteMeta + ", messageTextWithoutTagContent=" + this.messageTextWithoutTagContent + ", fileId=" + this.fileId + ", urlPathCn=" + this.urlPathCn + ", urlPathDefault=" + this.urlPathDefault + ", mediaThumbnail=" + this.mediaThumbnail + ", mediaWidth=" + this.mediaWidth + ", mediaHeight=" + this.mediaHeight + ", mediaDuration=" + this.mediaDuration + ", mediaSize=" + this.mediaSize + ", localUri=" + this.localUri + ", fileName=" + this.fileName + ", fileExtension=" + this.fileExtension + ", callType=" + this.callType + ", callStatus=" + this.callStatus + ", callDuration=" + this.callDuration + ", callerUid=" + this.callerUid + ", replySeq=" + this.replySeq + ", quotedMessage=" + this.quotedMessage + ", customMessage=" + this.customMessage + ", systemMessage=" + this.systemMessage + ", shareMessage=" + this.shareMessage + ", streamPlaceholderMessage=" + this.streamPlaceholderMessage + ", stickerId=" + this.stickerId + ", stickerPath=" + this.stickerPath + ", readReceiptSequence=" + this.readReceiptSequence + ", recallMessage=" + this.recallMessage + ", invitationId=" + this.invitationId + ", groupInvitationGroupId=" + this.groupInvitationGroupId + ", groupInviterUid=" + this.groupInviterUid + ", groupInviteExpireTime=" + this.groupInviteExpireTime + ", groupInviteName=" + this.groupInviteName + ", groupInviteAvatar=" + this.groupInviteAvatar + ", senderNickname=" + this.senderNickname + ", senderAvatar=" + this.senderAvatar + ", senderEnNickName=" + this.senderEnNickName + ", lookupSeq=" + this.lookupSeq + ", frontendOption=" + this.frontendOption + ", reactionUpdateTime=" + this.reactionUpdateTime + ")";
    }

    public /* synthetic */ InHouseIMMessageEntity(int i, int i2, String str, String str2, String str3, long j, int i3, int i4, int i5, Boolean bool, Boolean bool2, long j2, Boolean bool3, String str4, Integer num, int i6, Long l, boolean z, boolean z2, Boolean bool4, String str5, List list, Integer num2, List list2, SiteMeta siteMeta, String str6, String str7, String str8, String str9, String str10, Integer num3, Integer num4, Integer num5, Long l2, String str11, String str12, String str13, Integer num6, Integer num7, Long l3, String str14, Long l4, InHouseIMMessageEntity inHouseIMMessageEntity, CustomMessageData customMessageData, SystemMessageData systemMessageData, ShareMessageData shareMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData, String str15, String str16, Long l5, RecallMessageData recallMessageData, String str17, String str18, String str19, Long l6, String str20, String str21, String str22, String str23, String str24, Long l7, FrontendOption frontendOption, long j3, Integer num8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((8646654 != (i & 8646654)) | (128 != (i2 & 128))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{8646654, 128}, InHouseIMMessageEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = (i & 1) == 0 ? UUID.randomUUID().toString() : str;
        this.channelId = str2;
        this.senderUid = str3;
        this.seq = j;
        this.senderPlatformType = i3;
        this.contentType = i4;
        this.channelType = i5;
        this.isRead = bool;
        this.isVisible = bool2;
        this.sendTime = j2;
        this.shouldIncludeInUnreadCount = bool3;
        this.extra = str4;
        if ((i & 4096) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        this.sentStatus = i6;
        this.receiveTime = l;
        this.isRecalled = z;
        this.isMentionMe = z2;
        this.isReceiveReadReceipt = bool4;
        if ((i & 262144) == 0) {
            this.textContent = null;
        } else {
            this.textContent = str5;
        }
        if ((i & 524288) == 0) {
            this.atUserList = null;
        } else {
            this.atUserList = list;
        }
        if ((i & 1048576) == 0) {
            this.atType = null;
        } else {
            this.atType = num2;
        }
        if ((i & 2097152) == 0) {
            this.urlList = null;
        } else {
            this.urlList = list2;
        }
        if ((i & 4194304) == 0) {
            this.siteMeta = null;
        } else {
            this.siteMeta = siteMeta;
        }
        this.messageTextWithoutTagContent = str6;
        if ((i & 16777216) == 0) {
            this.fileId = null;
        } else {
            this.fileId = str7;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.urlPathCn = null;
        } else {
            this.urlPathCn = str8;
        }
        if ((i & 67108864) == 0) {
            this.urlPathDefault = null;
        } else {
            this.urlPathDefault = str9;
        }
        if ((i & 134217728) == 0) {
            this.mediaThumbnail = null;
        } else {
            this.mediaThumbnail = str10;
        }
        if ((i & 268435456) == 0) {
            this.mediaWidth = null;
        } else {
            this.mediaWidth = num3;
        }
        if ((i & 536870912) == 0) {
            this.mediaHeight = null;
        } else {
            this.mediaHeight = num4;
        }
        if ((1073741824 & i) == 0) {
            this.mediaDuration = null;
        } else {
            this.mediaDuration = num5;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.mediaSize = null;
        } else {
            this.mediaSize = l2;
        }
        if ((i2 & 1) == 0) {
            this.localUri = null;
        } else {
            this.localUri = str11;
        }
        if ((i2 & 2) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str12;
        }
        if ((i2 & 4) == 0) {
            this.fileExtension = null;
        } else {
            this.fileExtension = str13;
        }
        if ((i2 & 8) == 0) {
            this.callType = null;
        } else {
            this.callType = num6;
        }
        if ((i2 & 16) == 0) {
            this.callStatus = null;
        } else {
            this.callStatus = num7;
        }
        if ((i2 & 32) == 0) {
            this.callDuration = null;
        } else {
            this.callDuration = l3;
        }
        if ((i2 & 64) == 0) {
            this.callerUid = null;
        } else {
            this.callerUid = str14;
        }
        this.replySeq = l4;
        if ((i2 & 256) == 0) {
            this.quotedMessage = null;
        } else {
            this.quotedMessage = inHouseIMMessageEntity;
        }
        if ((i2 & 512) == 0) {
            this.customMessage = null;
        } else {
            this.customMessage = customMessageData;
        }
        if ((i2 & 1024) == 0) {
            this.systemMessage = null;
        } else {
            this.systemMessage = systemMessageData;
        }
        if ((i2 & 2048) == 0) {
            this.shareMessage = null;
        } else {
            this.shareMessage = shareMessageData;
        }
        if ((i2 & 4096) == 0) {
            this.streamPlaceholderMessage = null;
        } else {
            this.streamPlaceholderMessage = streamPlaceHolderMessageData;
        }
        if ((i2 & 8192) == 0) {
            this.stickerId = null;
        } else {
            this.stickerId = str15;
        }
        if ((i2 & 16384) == 0) {
            this.stickerPath = null;
        } else {
            this.stickerPath = str16;
        }
        if ((32768 & i2) == 0) {
            this.readReceiptSequence = null;
        } else {
            this.readReceiptSequence = l5;
        }
        if ((65536 & i2) == 0) {
            this.recallMessage = null;
        } else {
            this.recallMessage = recallMessageData;
        }
        if ((131072 & i2) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str17;
        }
        if ((i2 & 262144) == 0) {
            this.groupInvitationGroupId = null;
        } else {
            this.groupInvitationGroupId = str18;
        }
        if ((i2 & 524288) == 0) {
            this.groupInviterUid = null;
        } else {
            this.groupInviterUid = str19;
        }
        if ((i2 & 1048576) == 0) {
            this.groupInviteExpireTime = null;
        } else {
            this.groupInviteExpireTime = l6;
        }
        if ((i2 & 2097152) == 0) {
            this.groupInviteName = null;
        } else {
            this.groupInviteName = str20;
        }
        if ((i2 & 4194304) == 0) {
            this.groupInviteAvatar = null;
        } else {
            this.groupInviteAvatar = str21;
        }
        if ((8388608 & i2) == 0) {
            this.senderNickname = null;
        } else {
            this.senderNickname = str22;
        }
        if ((i2 & 16777216) == 0) {
            this.senderAvatar = null;
        } else {
            this.senderAvatar = str23;
        }
        if ((i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.senderEnNickName = null;
        } else {
            this.senderEnNickName = str24;
        }
        if ((i2 & 67108864) == 0) {
            this.lookupSeq = null;
        } else {
            this.lookupSeq = l7;
        }
        if ((i2 & 134217728) == 0) {
            this.frontendOption = null;
        } else {
            this.frontendOption = frontendOption;
        }
        this.reactionUpdateTime = (i2 & 268435456) == 0 ? 0L : j3;
        if ((i2 & 536870912) == 0) {
            this.error = null;
        } else {
            this.error = num8;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMMessageEntity inHouseIMMessageEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMMessageEntity.messageId, (Object) UUID.randomUUID().toString())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMMessageEntity.messageId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseIMMessageEntity.channelId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, inHouseIMMessageEntity.senderUid);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, inHouseIMMessageEntity.seq);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, inHouseIMMessageEntity.senderPlatformType);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, inHouseIMMessageEntity.contentType);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, inHouseIMMessageEntity.channelType);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, inHouseIMMessageEntity.isRead);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, inHouseIMMessageEntity.isVisible);
        compositeEncoder.encodeLongElement(serialDescriptor, 9, inHouseIMMessageEntity.sendTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, inHouseIMMessageEntity.shouldIncludeInUnreadCount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, inHouseIMMessageEntity.extra);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMMessageEntity.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, inHouseIMMessageEntity.status);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 13, inHouseIMMessageEntity.sentStatus);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, longSerializer, inHouseIMMessageEntity.receiveTime);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 15, inHouseIMMessageEntity.isRecalled);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 16, inHouseIMMessageEntity.isMentionMe);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, inHouseIMMessageEntity.isReceiveReadReceipt);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMMessageEntity.textContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, inHouseIMMessageEntity.textContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMMessageEntity.atUserList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], inHouseIMMessageEntity.atUserList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMMessageEntity.atType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, inHouseIMMessageEntity.atType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMMessageEntity.urlList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], inHouseIMMessageEntity.urlList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || inHouseIMMessageEntity.siteMeta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, SiteMeta$$serializer.INSTANCE, inHouseIMMessageEntity.siteMeta);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, inHouseIMMessageEntity.messageTextWithoutTagContent);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || inHouseIMMessageEntity.fileId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, inHouseIMMessageEntity.fileId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || inHouseIMMessageEntity.urlPathCn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, inHouseIMMessageEntity.urlPathCn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || inHouseIMMessageEntity.urlPathDefault != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, inHouseIMMessageEntity.urlPathDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || inHouseIMMessageEntity.mediaThumbnail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, stringSerializer, inHouseIMMessageEntity.mediaThumbnail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || inHouseIMMessageEntity.mediaWidth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, IntSerializer.INSTANCE, inHouseIMMessageEntity.mediaWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || inHouseIMMessageEntity.mediaHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, inHouseIMMessageEntity.mediaHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || inHouseIMMessageEntity.mediaDuration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, inHouseIMMessageEntity.mediaDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || inHouseIMMessageEntity.mediaSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, longSerializer, inHouseIMMessageEntity.mediaSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || inHouseIMMessageEntity.localUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, stringSerializer, inHouseIMMessageEntity.localUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || inHouseIMMessageEntity.fileName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, stringSerializer, inHouseIMMessageEntity.fileName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || inHouseIMMessageEntity.fileExtension != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, stringSerializer, inHouseIMMessageEntity.fileExtension);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || inHouseIMMessageEntity.callType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, IntSerializer.INSTANCE, inHouseIMMessageEntity.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || inHouseIMMessageEntity.callStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, IntSerializer.INSTANCE, inHouseIMMessageEntity.callStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || inHouseIMMessageEntity.callDuration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, longSerializer, inHouseIMMessageEntity.callDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || inHouseIMMessageEntity.callerUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, stringSerializer, inHouseIMMessageEntity.callerUid);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, longSerializer, inHouseIMMessageEntity.replySeq);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || inHouseIMMessageEntity.quotedMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, InHouseIMMessageEntity$$serializer.INSTANCE, inHouseIMMessageEntity.quotedMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || inHouseIMMessageEntity.customMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, CustomMessageData$$serializer.INSTANCE, inHouseIMMessageEntity.customMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || inHouseIMMessageEntity.systemMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, SystemMessageData$$serializer.INSTANCE, inHouseIMMessageEntity.systemMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || inHouseIMMessageEntity.shareMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, ShareMessageData$$serializer.INSTANCE, inHouseIMMessageEntity.shareMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || inHouseIMMessageEntity.streamPlaceholderMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StreamPlaceHolderMessageData$$serializer.INSTANCE, inHouseIMMessageEntity.streamPlaceholderMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || inHouseIMMessageEntity.stickerId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, stringSerializer, inHouseIMMessageEntity.stickerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || inHouseIMMessageEntity.stickerPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, stringSerializer, inHouseIMMessageEntity.stickerPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || inHouseIMMessageEntity.readReceiptSequence != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, longSerializer, inHouseIMMessageEntity.readReceiptSequence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || inHouseIMMessageEntity.recallMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, RecallMessageData$$serializer.INSTANCE, inHouseIMMessageEntity.recallMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || inHouseIMMessageEntity.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, stringSerializer, inHouseIMMessageEntity.invitationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || inHouseIMMessageEntity.groupInvitationGroupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, stringSerializer, inHouseIMMessageEntity.groupInvitationGroupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || inHouseIMMessageEntity.groupInviterUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, stringSerializer, inHouseIMMessageEntity.groupInviterUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || inHouseIMMessageEntity.groupInviteExpireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, longSerializer, inHouseIMMessageEntity.groupInviteExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || inHouseIMMessageEntity.groupInviteName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, stringSerializer, inHouseIMMessageEntity.groupInviteName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || inHouseIMMessageEntity.groupInviteAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, stringSerializer, inHouseIMMessageEntity.groupInviteAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || inHouseIMMessageEntity.senderNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, stringSerializer, inHouseIMMessageEntity.senderNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || inHouseIMMessageEntity.senderAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, stringSerializer, inHouseIMMessageEntity.senderAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || inHouseIMMessageEntity.senderEnNickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, stringSerializer, inHouseIMMessageEntity.senderEnNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || inHouseIMMessageEntity.lookupSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, longSerializer, inHouseIMMessageEntity.lookupSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || inHouseIMMessageEntity.frontendOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, FrontendOption$$serializer.INSTANCE, inHouseIMMessageEntity.frontendOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || inHouseIMMessageEntity.reactionUpdateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 60, inHouseIMMessageEntity.reactionUpdateTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) && inHouseIMMessageEntity.error == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, IntSerializer.INSTANCE, inHouseIMMessageEntity.error);
    }

    public InHouseIMMessageEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, int i2, int i3, Boolean bool, Boolean bool2, long j2, Boolean bool3, String str4, Integer num, int i4, Long l, boolean z, boolean z2, Boolean bool4, String str5, @TypeConverters({C44245sIr.class}) List<InhouseIMAtUser> list, Integer num2, @TypeConverters({sIO.class}) List<String> list2, @TypeConverters({sII.class}) SiteMeta siteMeta, String str6, String str7, String str8, String str9, String str10, Integer num3, Integer num4, Integer num5, Long l2, String str11, String str12, String str13, Integer num6, Integer num7, Long l3, String str14, Long l4, @TypeConverters({C44252sIy.class}) InHouseIMMessageEntity inHouseIMMessageEntity, @TypeConverters({C44232sIe.class}) CustomMessageData customMessageData, @TypeConverters({sIQ.class}) SystemMessageData systemMessageData, @TypeConverters({sIK.class}) ShareMessageData shareMessageData, @TypeConverters({sIP.class}) StreamPlaceHolderMessageData streamPlaceHolderMessageData, String str15, String str16, Long l5, @TypeConverters({sIJ.class}) RecallMessageData recallMessageData, String str17, String str18, String str19, Long l6, String str20, String str21, String str22, String str23, String str24, Long l7, @TypeConverters({C44239sIl.class}) FrontendOption frontendOption, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.messageId = str;
        this.channelId = str2;
        this.senderUid = str3;
        this.seq = j;
        this.senderPlatformType = i;
        this.contentType = i2;
        this.channelType = i3;
        this.isRead = bool;
        this.isVisible = bool2;
        this.sendTime = j2;
        this.shouldIncludeInUnreadCount = bool3;
        this.extra = str4;
        this.status = num;
        this.sentStatus = i4;
        this.receiveTime = l;
        this.isRecalled = z;
        this.isMentionMe = z2;
        this.isReceiveReadReceipt = bool4;
        this.textContent = str5;
        this.atUserList = list;
        this.atType = num2;
        this.urlList = list2;
        this.siteMeta = siteMeta;
        this.messageTextWithoutTagContent = str6;
        this.fileId = str7;
        this.urlPathCn = str8;
        this.urlPathDefault = str9;
        this.mediaThumbnail = str10;
        this.mediaWidth = num3;
        this.mediaHeight = num4;
        this.mediaDuration = num5;
        this.mediaSize = l2;
        this.localUri = str11;
        this.fileName = str12;
        this.fileExtension = str13;
        this.callType = num6;
        this.callStatus = num7;
        this.callDuration = l3;
        this.callerUid = str14;
        this.replySeq = l4;
        this.quotedMessage = inHouseIMMessageEntity;
        this.customMessage = customMessageData;
        this.systemMessage = systemMessageData;
        this.shareMessage = shareMessageData;
        this.streamPlaceholderMessage = streamPlaceHolderMessageData;
        this.stickerId = str15;
        this.stickerPath = str16;
        this.readReceiptSequence = l5;
        this.recallMessage = recallMessageData;
        this.invitationId = str17;
        this.groupInvitationGroupId = str18;
        this.groupInviterUid = str19;
        this.groupInviteExpireTime = l6;
        this.groupInviteName = str20;
        this.groupInviteAvatar = str21;
        this.senderNickname = str22;
        this.senderAvatar = str23;
        this.senderEnNickName = str24;
        this.lookupSeq = l7;
        this.frontendOption = frontendOption;
        this.reactionUpdateTime = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01d3: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r133v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE 
  (wrap:java.util.UUID:0x0008: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:70))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:70)) : (r69v0 java.lang.String))
  (r70v0 java.lang.String)
  (r71v0 java.lang.String)
  (r72v0 long)
  (r74v0 int)
  (r75v0 int)
  (r76v0 int)
  (r77v0 java.lang.Boolean)
  (r78v0 java.lang.Boolean)
  (r79v0 long)
  (r81v0 java.lang.Boolean)
  (r82v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r133v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r83v0 java.lang.Integer))
  (r84v0 int)
  (r85v0 java.lang.Long)
  (r86v0 boolean)
  (r87v0 boolean)
  (r88v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r133v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r133v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r90v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0036: ARITH (r133v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r91v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r133v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r92v0 java.util.List))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta:?: TERNARY null = ((wrap:int:0x004c: ARITH (r133v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta) : (r93v0 com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta))
  (r94v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r133v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r133v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r133v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r133v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r98v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0083: ARITH (r133v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r99v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x008e: ARITH (536870912 int) & (r133v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r100v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0098: ARITH (1073741824 int) & (r133v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r101v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r133v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r102v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r134v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r103v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r134v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r104v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r134v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r105v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r134v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r106v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r134v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r107v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r134v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r108v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r134v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r109v0 java.lang.String))
  (r110v0 java.lang.Long)
  (wrap:com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity:?: TERNARY null = ((wrap:int:0x00e9: ARITH (r134v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity) : (r111v0 com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r134v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData) : (r112v0 com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r134v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData) : (r113v0 com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData:?: TERNARY null = ((wrap:int:0x0104: ARITH (r134v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData) : (r114v0 com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData:?: TERNARY null = ((wrap:int:0x010d: ARITH (r134v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData) : (r115v0 com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r134v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r134v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r117v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x012b: ARITH (32768 int) & (r134v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r118v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData:?: TERNARY null = ((wrap:int:0x0135: ARITH (65536 int) & (r134v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData) : (r119v0 com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (131072 int) & (r134v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0147: ARITH (r134v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0150: ARITH (r134v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r122v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0159: ARITH (r134v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r123v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0162: ARITH (r134v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016b: ARITH (r134v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (8388608 int) & (r134v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r126v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017e: ARITH (r134v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r127v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0187: ARITH (r134v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r128v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0190: ARITH (r134v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r129v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption:?: TERNARY null = ((wrap:int:0x0199: ARITH (r134v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption) : (r130v0 com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption))
  (wrap:long:?: TERNARY null = ((wrap:int:0x01a2: ARITH (r134v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r131v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.Boolean, java.lang.Boolean, long, java.lang.Boolean, java.lang.String, java.lang.Integer, int, java.lang.Long, boolean, boolean, java.lang.Boolean, java.lang.String, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser>, java.lang.Integer, java.util.List<java.lang.String>, com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption, long):void (m)] (LINE:68) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity.<init>(java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.Boolean, java.lang.Boolean, long, java.lang.Boolean, java.lang.String, java.lang.Integer, int, java.lang.Long, boolean, boolean, java.lang.Boolean, java.lang.String, java.util.List, java.lang.Integer, java.util.List, com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption, long):void type: THIS */
    public /* synthetic */ InHouseIMMessageEntity(String str, String str2, String str3, long j, int i, int i2, int i3, Boolean bool, Boolean bool2, long j2, Boolean bool3, String str4, Integer num, int i4, Long l, boolean z, boolean z2, Boolean bool4, String str5, List list, Integer num2, List list2, SiteMeta siteMeta, String str6, String str7, String str8, String str9, String str10, Integer num3, Integer num4, Integer num5, Long l2, String str11, String str12, String str13, Integer num6, Integer num7, Long l3, String str14, Long l4, InHouseIMMessageEntity inHouseIMMessageEntity, CustomMessageData customMessageData, SystemMessageData systemMessageData, ShareMessageData shareMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData, String str15, String str16, Long l5, RecallMessageData recallMessageData, String str17, String str18, String str19, Long l6, String str20, String str21, String str22, String str23, String str24, Long l7, FrontendOption frontendOption, long j3, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, j, i, i2, i3, bool, bool2, j2, bool3, str4, (i5 & 4096) != 0 ? null : num, i4, l, z, z2, bool4, (i5 & 262144) != 0 ? null : str5, (i5 & 524288) != 0 ? null : list, (i5 & 1048576) != 0 ? null : num2, (i5 & 2097152) != 0 ? null : list2, (i5 & 4194304) != 0 ? null : siteMeta, str6, (i5 & 16777216) != 0 ? null : str7, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str8, (i5 & 67108864) != 0 ? null : str9, (i5 & 134217728) != 0 ? null : str10, (i5 & 268435456) != 0 ? null : num3, (536870912 & i5) != 0 ? null : num4, (1073741824 & i5) != 0 ? null : num5, (i5 & Integer.MIN_VALUE) != 0 ? null : l2, (i6 & 1) != 0 ? null : str11, (i6 & 2) != 0 ? null : str12, (i6 & 4) != 0 ? null : str13, (i6 & 8) != 0 ? null : num6, (i6 & 16) != 0 ? null : num7, (i6 & 32) != 0 ? null : l3, (i6 & 64) != 0 ? null : str14, l4, (i6 & 256) != 0 ? null : inHouseIMMessageEntity, (i6 & 512) != 0 ? null : customMessageData, (i6 & 1024) != 0 ? null : systemMessageData, (i6 & 2048) != 0 ? null : shareMessageData, (i6 & 4096) != 0 ? null : streamPlaceHolderMessageData, (i6 & 8192) != 0 ? null : str15, (i6 & 16384) != 0 ? null : str16, (32768 & i6) != 0 ? null : l5, (65536 & i6) != 0 ? null : recallMessageData, (131072 & i6) != 0 ? null : str17, (i6 & 262144) != 0 ? null : str18, (i6 & 524288) != 0 ? null : str19, (i6 & 1048576) != 0 ? null : l6, (i6 & 2097152) != 0 ? null : str20, (i6 & 4194304) != 0 ? null : str21, (8388608 & i6) != 0 ? null : str22, (i6 & 16777216) != 0 ? null : str23, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24, (i6 & 67108864) != 0 ? null : l7, (i6 & 134217728) != 0 ? null : frontendOption, (i6 & 268435456) != 0 ? 0L : j3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InHouseIMMessageEntity> serializer() {
            return InHouseIMMessageEntity$$serializer.INSTANCE;
        }
    }
}
