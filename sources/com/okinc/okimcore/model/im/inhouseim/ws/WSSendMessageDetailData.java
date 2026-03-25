package com.okinc.okimcore.model.im.inhouseim.ws;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSSendMessageDetailData {
    private RecallMessageData adminRecallMessage;
    private CallMessageData callMessage;
    private final String channelId;
    private final InHouseIMChannelType channelType;
    private final String clientMsgId;
    private final InHouseIMContentType contentType;
    private CustomMessageData customMessage;
    private final JsonElement extra;
    private final FrontendOption frontendOption;
    private GroupInvitationMessageData groupInvitationMessage;
    private ImageMessageData imageMessage;
    private final Long lookupSeq;
    private MediaMessageData mediaMessage;
    private final List<InHouseMessageHandling> messageHandling;
    private WSSendMessageDetailData quotedMessage;
    private final WSSendReactionResponse reaction;
    private List<ReactionDisplay> reactionDisplay;
    private ReadReceiptMessageData readReceiptMessage;
    private final Long sendTime;
    private SenderName senderName;
    private final InHouseIMPlatformType senderPlatformType;
    private RecallMessageData senderRecallMessage;
    private String senderUid;
    private final Long seq;
    private ShareMessageData shareMessage;
    private final Integer status;
    private StickerMessageData stickerMessage;
    private StreamPlaceHolderMessageData streamMessage;
    private StreamPlaceHolderMessageData streamPlaceholderMessage;
    private SystemMessageData systemMessage;
    private TextMessageData textMessage;
    private VideoMessageData videoMessage;
    private VoiceMessageData voiceMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, InHouseIMContentType.Companion.serializer(), InHouseIMChannelType.Companion.serializer(), InHouseIMPlatformType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InHouseMessageHandling$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(ReactionDisplay$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WSSendMessageDetailData() {
        this((String) null, (String) null, (InHouseIMContentType) null, (InHouseIMChannelType) null, (InHouseIMPlatformType) null, (Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) null, (StickerMessageData) null, (ReadReceiptMessageData) null, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (Long) null, (JsonElement) null, (Integer) null, (String) null, (List) null, (FrontendOption) null, (Long) null, (WSSendReactionResponse) null, (List) null, -1, 1, (DefaultConstructorMarker) null);
    }

    @SerialName("messageHandlingList")
    public static /* synthetic */ void getMessageHandling$annotations() {
    }

    @SerialName("reaction")
    public static /* synthetic */ void getReaction$annotations() {
    }

    @SerialName("reactionDisplay")
    public static /* synthetic */ void getReactionDisplay$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoiceMessageData component10() {
        return this.voiceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareMessageData component11() {
        return this.shareMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallMessageData component12() {
        return this.callMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData component13() {
        return this.quotedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomMessageData component14() {
        return this.customMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemMessageData component15() {
        return this.systemMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerMessageData component16() {
        return this.stickerMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReadReceiptMessageData component17() {
        return this.readReceiptMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData component18() {
        return this.senderRecallMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData component19() {
        return this.adminRecallMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInvitationMessageData component20() {
        return this.groupInvitationMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StreamPlaceHolderMessageData component21() {
        return this.streamPlaceholderMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StreamPlaceHolderMessageData component22() {
        return this.streamMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaMessageData component23() {
        return this.mediaMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SenderName component24() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component25() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component26() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.clientMsgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseMessageHandling> component29() {
        return this.messageHandling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContentType component3() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrontendOption component30() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component31() {
        return this.lookupSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionResponse component32() {
        return this.reaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDisplay> component33() {
        return this.reactionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMChannelType component4() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMPlatformType component5() {
        return this.senderPlatformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.sendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextMessageData component7() {
        return this.textMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageMessageData component8() {
        return this.imageMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoMessageData component9() {
        return this.videoMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData copy(String str, String str2, InHouseIMContentType inHouseIMContentType, InHouseIMChannelType inHouseIMChannelType, InHouseIMPlatformType inHouseIMPlatformType, Long l, TextMessageData textMessageData, ImageMessageData imageMessageData, VideoMessageData videoMessageData, VoiceMessageData voiceMessageData, ShareMessageData shareMessageData, CallMessageData callMessageData, WSSendMessageDetailData wSSendMessageDetailData, CustomMessageData customMessageData, SystemMessageData systemMessageData, StickerMessageData stickerMessageData, ReadReceiptMessageData readReceiptMessageData, RecallMessageData recallMessageData, RecallMessageData recallMessageData2, GroupInvitationMessageData groupInvitationMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData2, MediaMessageData mediaMessageData, SenderName senderName, Long l2, JsonElement jsonElement, Integer num, String str3, List<InHouseMessageHandling> list, FrontendOption frontendOption, Long l3, WSSendReactionResponse wSSendReactionResponse, List<ReactionDisplay> list2) {
        return new WSSendMessageDetailData(str, str2, inHouseIMContentType, inHouseIMChannelType, inHouseIMPlatformType, l, textMessageData, imageMessageData, videoMessageData, voiceMessageData, shareMessageData, callMessageData, wSSendMessageDetailData, customMessageData, systemMessageData, stickerMessageData, readReceiptMessageData, recallMessageData, recallMessageData2, groupInvitationMessageData, streamPlaceHolderMessageData, streamPlaceHolderMessageData2, mediaMessageData, senderName, l2, jsonElement, num, str3, list, frontendOption, l3, wSSendReactionResponse, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSSendMessageDetailData)) {
            return false;
        }
        WSSendMessageDetailData wSSendMessageDetailData = (WSSendMessageDetailData) obj;
        return Intrinsics.EZpvd((Object) this.senderUid, (Object) wSSendMessageDetailData.senderUid) && Intrinsics.EZpvd((Object) this.channelId, (Object) wSSendMessageDetailData.channelId) && this.contentType == wSSendMessageDetailData.contentType && this.channelType == wSSendMessageDetailData.channelType && this.senderPlatformType == wSSendMessageDetailData.senderPlatformType && Intrinsics.EZpvd(this.sendTime, wSSendMessageDetailData.sendTime) && Intrinsics.EZpvd(this.textMessage, wSSendMessageDetailData.textMessage) && Intrinsics.EZpvd(this.imageMessage, wSSendMessageDetailData.imageMessage) && Intrinsics.EZpvd(this.videoMessage, wSSendMessageDetailData.videoMessage) && Intrinsics.EZpvd(this.voiceMessage, wSSendMessageDetailData.voiceMessage) && Intrinsics.EZpvd(this.shareMessage, wSSendMessageDetailData.shareMessage) && Intrinsics.EZpvd(this.callMessage, wSSendMessageDetailData.callMessage) && Intrinsics.EZpvd(this.quotedMessage, wSSendMessageDetailData.quotedMessage) && Intrinsics.EZpvd(this.customMessage, wSSendMessageDetailData.customMessage) && Intrinsics.EZpvd(this.systemMessage, wSSendMessageDetailData.systemMessage) && Intrinsics.EZpvd(this.stickerMessage, wSSendMessageDetailData.stickerMessage) && Intrinsics.EZpvd(this.readReceiptMessage, wSSendMessageDetailData.readReceiptMessage) && Intrinsics.EZpvd(this.senderRecallMessage, wSSendMessageDetailData.senderRecallMessage) && Intrinsics.EZpvd(this.adminRecallMessage, wSSendMessageDetailData.adminRecallMessage) && Intrinsics.EZpvd(this.groupInvitationMessage, wSSendMessageDetailData.groupInvitationMessage) && Intrinsics.EZpvd(this.streamPlaceholderMessage, wSSendMessageDetailData.streamPlaceholderMessage) && Intrinsics.EZpvd(this.streamMessage, wSSendMessageDetailData.streamMessage) && Intrinsics.EZpvd(this.mediaMessage, wSSendMessageDetailData.mediaMessage) && Intrinsics.EZpvd(this.senderName, wSSendMessageDetailData.senderName) && Intrinsics.EZpvd(this.seq, wSSendMessageDetailData.seq) && Intrinsics.EZpvd(this.extra, wSSendMessageDetailData.extra) && Intrinsics.EZpvd(this.status, wSSendMessageDetailData.status) && Intrinsics.EZpvd((Object) this.clientMsgId, (Object) wSSendMessageDetailData.clientMsgId) && Intrinsics.EZpvd(this.messageHandling, wSSendMessageDetailData.messageHandling) && Intrinsics.EZpvd(this.frontendOption, wSSendMessageDetailData.frontendOption) && Intrinsics.EZpvd(this.lookupSeq, wSSendMessageDetailData.lookupSeq) && Intrinsics.EZpvd(this.reaction, wSSendMessageDetailData.reaction) && Intrinsics.EZpvd(this.reactionDisplay, wSSendMessageDetailData.reactionDisplay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData getAdminRecallMessage() {
        return this.adminRecallMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallMessageData getCallMessage() {
        return this.callMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMChannelType getChannelType() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientMsgId() {
        return this.clientMsgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContentType getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomMessageData getCustomMessage() {
        return this.customMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrontendOption getFrontendOption() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInvitationMessageData getGroupInvitationMessage() {
        return this.groupInvitationMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageMessageData getImageMessage() {
        return this.imageMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLookupSeq() {
        return this.lookupSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaMessageData getMediaMessage() {
        return this.mediaMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseMessageHandling> getMessageHandling() {
        return this.messageHandling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData getQuotedMessage() {
        return this.quotedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionResponse getReaction() {
        return this.reaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDisplay> getReactionDisplay() {
        return this.reactionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReadReceiptMessageData getReadReceiptMessage() {
        return this.readReceiptMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSendTime() {
        return this.sendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SenderName getSenderName() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMPlatformType getSenderPlatformType() {
        return this.senderPlatformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData getSenderRecallMessage() {
        return this.senderRecallMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderUid() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareMessageData getShareMessage() {
        return this.shareMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerMessageData getStickerMessage() {
        return this.stickerMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StreamPlaceHolderMessageData getStreamMessage() {
        return this.streamMessage;
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
    public final TextMessageData getTextMessage() {
        return this.textMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoMessageData getVideoMessage() {
        return this.videoMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoiceMessageData getVoiceMessage() {
        return this.voiceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.senderUid;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.channelId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        InHouseIMContentType inHouseIMContentType = this.contentType;
        int iHashCode3 = inHouseIMContentType == null ? 0 : inHouseIMContentType.hashCode();
        InHouseIMChannelType inHouseIMChannelType = this.channelType;
        int iHashCode4 = inHouseIMChannelType == null ? 0 : inHouseIMChannelType.hashCode();
        InHouseIMPlatformType inHouseIMPlatformType = this.senderPlatformType;
        int iHashCode5 = inHouseIMPlatformType == null ? 0 : inHouseIMPlatformType.hashCode();
        Long l = this.sendTime;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        TextMessageData textMessageData = this.textMessage;
        int iHashCode7 = textMessageData == null ? 0 : textMessageData.hashCode();
        ImageMessageData imageMessageData = this.imageMessage;
        int iHashCode8 = imageMessageData == null ? 0 : imageMessageData.hashCode();
        VideoMessageData videoMessageData = this.videoMessage;
        int iHashCode9 = videoMessageData == null ? 0 : videoMessageData.hashCode();
        VoiceMessageData voiceMessageData = this.voiceMessage;
        int iHashCode10 = voiceMessageData == null ? 0 : voiceMessageData.hashCode();
        ShareMessageData shareMessageData = this.shareMessage;
        int iHashCode11 = shareMessageData == null ? 0 : shareMessageData.hashCode();
        CallMessageData callMessageData = this.callMessage;
        int iHashCode12 = callMessageData == null ? 0 : callMessageData.hashCode();
        WSSendMessageDetailData wSSendMessageDetailData = this.quotedMessage;
        int iHashCode13 = wSSendMessageDetailData == null ? 0 : wSSendMessageDetailData.hashCode();
        CustomMessageData customMessageData = this.customMessage;
        int iHashCode14 = customMessageData == null ? 0 : customMessageData.hashCode();
        SystemMessageData systemMessageData = this.systemMessage;
        int iHashCode15 = systemMessageData == null ? 0 : systemMessageData.hashCode();
        StickerMessageData stickerMessageData = this.stickerMessage;
        int iHashCode16 = stickerMessageData == null ? 0 : stickerMessageData.hashCode();
        ReadReceiptMessageData readReceiptMessageData = this.readReceiptMessage;
        int iHashCode17 = readReceiptMessageData == null ? 0 : readReceiptMessageData.hashCode();
        RecallMessageData recallMessageData = this.senderRecallMessage;
        int iHashCode18 = recallMessageData == null ? 0 : recallMessageData.hashCode();
        RecallMessageData recallMessageData2 = this.adminRecallMessage;
        int iHashCode19 = recallMessageData2 == null ? 0 : recallMessageData2.hashCode();
        GroupInvitationMessageData groupInvitationMessageData = this.groupInvitationMessage;
        int iHashCode20 = groupInvitationMessageData == null ? 0 : groupInvitationMessageData.hashCode();
        StreamPlaceHolderMessageData streamPlaceHolderMessageData = this.streamPlaceholderMessage;
        int iHashCode21 = streamPlaceHolderMessageData == null ? 0 : streamPlaceHolderMessageData.hashCode();
        StreamPlaceHolderMessageData streamPlaceHolderMessageData2 = this.streamMessage;
        int iHashCode22 = streamPlaceHolderMessageData2 == null ? 0 : streamPlaceHolderMessageData2.hashCode();
        MediaMessageData mediaMessageData = this.mediaMessage;
        int iHashCode23 = mediaMessageData == null ? 0 : mediaMessageData.hashCode();
        SenderName senderName = this.senderName;
        int iHashCode24 = senderName == null ? 0 : senderName.hashCode();
        Long l2 = this.seq;
        int iHashCode25 = l2 == null ? 0 : l2.hashCode();
        JsonElement jsonElement = this.extra;
        int iHashCode26 = jsonElement == null ? 0 : jsonElement.hashCode();
        Integer num = this.status;
        int iHashCode27 = num == null ? 0 : num.hashCode();
        String str3 = this.clientMsgId;
        int iHashCode28 = str3 == null ? 0 : str3.hashCode();
        List<InHouseMessageHandling> list = this.messageHandling;
        int iHashCode29 = list == null ? 0 : list.hashCode();
        FrontendOption frontendOption = this.frontendOption;
        int iHashCode30 = frontendOption == null ? 0 : frontendOption.hashCode();
        Long l3 = this.lookupSeq;
        int iHashCode31 = l3 == null ? 0 : l3.hashCode();
        WSSendReactionResponse wSSendReactionResponse = this.reaction;
        int iHashCode32 = wSSendReactionResponse == null ? 0 : wSSendReactionResponse.hashCode();
        List<ReactionDisplay> list2 = this.reactionDisplay;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (list2 == null ? 0 : list2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdminRecallMessage(RecallMessageData recallMessageData) {
        this.adminRecallMessage = recallMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallMessage(CallMessageData callMessageData) {
        this.callMessage = callMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomMessage(CustomMessageData customMessageData) {
        this.customMessage = customMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupInvitationMessage(GroupInvitationMessageData groupInvitationMessageData) {
        this.groupInvitationMessage = groupInvitationMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageMessage(ImageMessageData imageMessageData) {
        this.imageMessage = imageMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaMessage(MediaMessageData mediaMessageData) {
        this.mediaMessage = mediaMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotedMessage(WSSendMessageDetailData wSSendMessageDetailData) {
        this.quotedMessage = wSSendMessageDetailData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReactionDisplay(List<ReactionDisplay> list) {
        this.reactionDisplay = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReadReceiptMessage(ReadReceiptMessageData readReceiptMessageData) {
        this.readReceiptMessage = readReceiptMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderName(SenderName senderName) {
        this.senderName = senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderRecallMessage(RecallMessageData recallMessageData) {
        this.senderRecallMessage = recallMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderUid(String str) {
        this.senderUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareMessage(ShareMessageData shareMessageData) {
        this.shareMessage = shareMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStickerMessage(StickerMessageData stickerMessageData) {
        this.stickerMessage = stickerMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStreamMessage(StreamPlaceHolderMessageData streamPlaceHolderMessageData) {
        this.streamMessage = streamPlaceHolderMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStreamPlaceholderMessage(StreamPlaceHolderMessageData streamPlaceHolderMessageData) {
        this.streamPlaceholderMessage = streamPlaceHolderMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemMessage(SystemMessageData systemMessageData) {
        this.systemMessage = systemMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextMessage(TextMessageData textMessageData) {
        this.textMessage = textMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoMessage(VideoMessageData videoMessageData) {
        this.videoMessage = videoMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoiceMessage(VoiceMessageData voiceMessageData) {
        this.voiceMessage = voiceMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendMessageDetailData(senderUid=" + this.senderUid + ", channelId=" + this.channelId + ", contentType=" + this.contentType + ", channelType=" + this.channelType + ", senderPlatformType=" + this.senderPlatformType + ", sendTime=" + this.sendTime + ", textMessage=" + this.textMessage + ", imageMessage=" + this.imageMessage + ", videoMessage=" + this.videoMessage + ", voiceMessage=" + this.voiceMessage + ", shareMessage=" + this.shareMessage + ", callMessage=" + this.callMessage + ", quotedMessage=" + this.quotedMessage + ", customMessage=" + this.customMessage + ", systemMessage=" + this.systemMessage + ", stickerMessage=" + this.stickerMessage + ", readReceiptMessage=" + this.readReceiptMessage + ", senderRecallMessage=" + this.senderRecallMessage + ", adminRecallMessage=" + this.adminRecallMessage + ", groupInvitationMessage=" + this.groupInvitationMessage + ", streamPlaceholderMessage=" + this.streamPlaceholderMessage + ", streamMessage=" + this.streamMessage + ", mediaMessage=" + this.mediaMessage + ", senderName=" + this.senderName + ", seq=" + this.seq + ", extra=" + this.extra + ", status=" + this.status + ", clientMsgId=" + this.clientMsgId + ", messageHandling=" + this.messageHandling + ", frontendOption=" + this.frontendOption + ", lookupSeq=" + this.lookupSeq + ", reaction=" + this.reaction + ", reactionDisplay=" + this.reactionDisplay + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendMessageDetailData> serializer() {
            return WSSendMessageDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendMessageDetailData(int i, int i2, String str, String str2, InHouseIMContentType inHouseIMContentType, InHouseIMChannelType inHouseIMChannelType, InHouseIMPlatformType inHouseIMPlatformType, Long l, TextMessageData textMessageData, ImageMessageData imageMessageData, VideoMessageData videoMessageData, VoiceMessageData voiceMessageData, ShareMessageData shareMessageData, CallMessageData callMessageData, WSSendMessageDetailData wSSendMessageDetailData, CustomMessageData customMessageData, SystemMessageData systemMessageData, StickerMessageData stickerMessageData, ReadReceiptMessageData readReceiptMessageData, RecallMessageData recallMessageData, RecallMessageData recallMessageData2, GroupInvitationMessageData groupInvitationMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData2, MediaMessageData mediaMessageData, SenderName senderName, Long l2, JsonElement jsonElement, Integer num, String str3, List list, FrontendOption frontendOption, Long l3, WSSendReactionResponse wSSendReactionResponse, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.senderUid = null;
        } else {
            this.senderUid = str;
        }
        if ((i & 2) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
        this.contentType = (i & 4) == 0 ? InHouseIMContentType.Unknown : inHouseIMContentType;
        this.channelType = (i & 8) == 0 ? InHouseIMChannelType.Unknown : inHouseIMChannelType;
        this.senderPlatformType = (i & 16) == 0 ? InHouseIMPlatformType.Android : inHouseIMPlatformType;
        this.sendTime = (i & 32) == 0 ? Long.valueOf(new Date().getTime()) : l;
        if ((i & 64) == 0) {
            this.textMessage = null;
        } else {
            this.textMessage = textMessageData;
        }
        if ((i & 128) == 0) {
            this.imageMessage = null;
        } else {
            this.imageMessage = imageMessageData;
        }
        if ((i & 256) == 0) {
            this.videoMessage = null;
        } else {
            this.videoMessage = videoMessageData;
        }
        if ((i & 512) == 0) {
            this.voiceMessage = null;
        } else {
            this.voiceMessage = voiceMessageData;
        }
        if ((i & 1024) == 0) {
            this.shareMessage = null;
        } else {
            this.shareMessage = shareMessageData;
        }
        if ((i & 2048) == 0) {
            this.callMessage = null;
        } else {
            this.callMessage = callMessageData;
        }
        if ((i & 4096) == 0) {
            this.quotedMessage = null;
        } else {
            this.quotedMessage = wSSendMessageDetailData;
        }
        if ((i & 8192) == 0) {
            this.customMessage = null;
        } else {
            this.customMessage = customMessageData;
        }
        if ((i & 16384) == 0) {
            this.systemMessage = null;
        } else {
            this.systemMessage = systemMessageData;
        }
        if ((32768 & i) == 0) {
            this.stickerMessage = null;
        } else {
            this.stickerMessage = stickerMessageData;
        }
        if ((65536 & i) == 0) {
            this.readReceiptMessage = null;
        } else {
            this.readReceiptMessage = readReceiptMessageData;
        }
        if ((131072 & i) == 0) {
            this.senderRecallMessage = null;
        } else {
            this.senderRecallMessage = recallMessageData;
        }
        if ((262144 & i) == 0) {
            this.adminRecallMessage = null;
        } else {
            this.adminRecallMessage = recallMessageData2;
        }
        if ((524288 & i) == 0) {
            this.groupInvitationMessage = null;
        } else {
            this.groupInvitationMessage = groupInvitationMessageData;
        }
        if ((1048576 & i) == 0) {
            this.streamPlaceholderMessage = null;
        } else {
            this.streamPlaceholderMessage = streamPlaceHolderMessageData;
        }
        if ((2097152 & i) == 0) {
            this.streamMessage = null;
        } else {
            this.streamMessage = streamPlaceHolderMessageData2;
        }
        if ((4194304 & i) == 0) {
            this.mediaMessage = null;
        } else {
            this.mediaMessage = mediaMessageData;
        }
        if ((8388608 & i) == 0) {
            this.senderName = null;
        } else {
            this.senderName = senderName;
        }
        if ((16777216 & i) == 0) {
            this.seq = null;
        } else {
            this.seq = l2;
        }
        if ((33554432 & i) == 0) {
            this.extra = null;
        } else {
            this.extra = jsonElement;
        }
        if ((67108864 & i) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        if ((134217728 & i) == 0) {
            this.clientMsgId = null;
        } else {
            this.clientMsgId = str3;
        }
        if ((268435456 & i) == 0) {
            this.messageHandling = null;
        } else {
            this.messageHandling = list;
        }
        if ((536870912 & i) == 0) {
            this.frontendOption = null;
        } else {
            this.frontendOption = frontendOption;
        }
        if ((1073741824 & i) == 0) {
            this.lookupSeq = null;
        } else {
            this.lookupSeq = l3;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.reaction = null;
        } else {
            this.reaction = wSSendReactionResponse;
        }
        if ((i2 & 1) == 0) {
            this.reactionDisplay = null;
        } else {
            this.reactionDisplay = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [9=5] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(WSSendMessageDetailData wSSendMessageDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || wSSendMessageDetailData.senderUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, wSSendMessageDetailData.senderUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || wSSendMessageDetailData.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, wSSendMessageDetailData.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || wSSendMessageDetailData.contentType != InHouseIMContentType.Unknown) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], wSSendMessageDetailData.contentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || wSSendMessageDetailData.channelType != InHouseIMChannelType.Unknown) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], wSSendMessageDetailData.channelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || wSSendMessageDetailData.senderPlatformType != InHouseIMPlatformType.Android) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], wSSendMessageDetailData.senderPlatformType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, wSSendMessageDetailData.sendTime);
        } else {
            Long l = wSSendMessageDetailData.sendTime;
            long time = new Date().getTime();
            if (l == null || l.longValue() != time) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || wSSendMessageDetailData.textMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, TextMessageData$$serializer.INSTANCE, wSSendMessageDetailData.textMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || wSSendMessageDetailData.imageMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, ImageMessageData$$serializer.INSTANCE, wSSendMessageDetailData.imageMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || wSSendMessageDetailData.videoMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, VideoMessageData$$serializer.INSTANCE, wSSendMessageDetailData.videoMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || wSSendMessageDetailData.voiceMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, VoiceMessageData$$serializer.INSTANCE, wSSendMessageDetailData.voiceMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || wSSendMessageDetailData.shareMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, ShareMessageData$$serializer.INSTANCE, wSSendMessageDetailData.shareMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || wSSendMessageDetailData.callMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, CallMessageData$$serializer.INSTANCE, wSSendMessageDetailData.callMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || wSSendMessageDetailData.quotedMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, WSSendMessageDetailData$$serializer.INSTANCE, wSSendMessageDetailData.quotedMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || wSSendMessageDetailData.customMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, CustomMessageData$$serializer.INSTANCE, wSSendMessageDetailData.customMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || wSSendMessageDetailData.systemMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, SystemMessageData$$serializer.INSTANCE, wSSendMessageDetailData.systemMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || wSSendMessageDetailData.stickerMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StickerMessageData$$serializer.INSTANCE, wSSendMessageDetailData.stickerMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || wSSendMessageDetailData.readReceiptMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, ReadReceiptMessageData$$serializer.INSTANCE, wSSendMessageDetailData.readReceiptMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || wSSendMessageDetailData.senderRecallMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, RecallMessageData$$serializer.INSTANCE, wSSendMessageDetailData.senderRecallMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || wSSendMessageDetailData.adminRecallMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, RecallMessageData$$serializer.INSTANCE, wSSendMessageDetailData.adminRecallMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || wSSendMessageDetailData.groupInvitationMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, GroupInvitationMessageData$$serializer.INSTANCE, wSSendMessageDetailData.groupInvitationMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || wSSendMessageDetailData.streamPlaceholderMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StreamPlaceHolderMessageData$$serializer.INSTANCE, wSSendMessageDetailData.streamPlaceholderMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || wSSendMessageDetailData.streamMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StreamPlaceHolderMessageData$$serializer.INSTANCE, wSSendMessageDetailData.streamMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || wSSendMessageDetailData.mediaMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, MediaMessageData$$serializer.INSTANCE, wSSendMessageDetailData.mediaMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || wSSendMessageDetailData.senderName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, SenderName$$serializer.INSTANCE, wSSendMessageDetailData.senderName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || wSSendMessageDetailData.seq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, LongSerializer.INSTANCE, wSSendMessageDetailData.seq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || wSSendMessageDetailData.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, JsonElementSerializer.INSTANCE, wSSendMessageDetailData.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || wSSendMessageDetailData.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, wSSendMessageDetailData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || wSSendMessageDetailData.clientMsgId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, wSSendMessageDetailData.clientMsgId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || wSSendMessageDetailData.messageHandling != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], wSSendMessageDetailData.messageHandling);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || wSSendMessageDetailData.frontendOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, FrontendOption$$serializer.INSTANCE, wSSendMessageDetailData.frontendOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || wSSendMessageDetailData.lookupSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, LongSerializer.INSTANCE, wSSendMessageDetailData.lookupSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || wSSendMessageDetailData.reaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, WSSendReactionResponse$$serializer.INSTANCE, wSSendMessageDetailData.reaction);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) && wSSendMessageDetailData.reactionDisplay == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, kSerializerArr[32], wSSendMessageDetailData.reactionDisplay);
    }

    public WSSendMessageDetailData(String str, String str2, InHouseIMContentType inHouseIMContentType, InHouseIMChannelType inHouseIMChannelType, InHouseIMPlatformType inHouseIMPlatformType, Long l, TextMessageData textMessageData, ImageMessageData imageMessageData, VideoMessageData videoMessageData, VoiceMessageData voiceMessageData, ShareMessageData shareMessageData, CallMessageData callMessageData, WSSendMessageDetailData wSSendMessageDetailData, CustomMessageData customMessageData, SystemMessageData systemMessageData, StickerMessageData stickerMessageData, ReadReceiptMessageData readReceiptMessageData, RecallMessageData recallMessageData, RecallMessageData recallMessageData2, GroupInvitationMessageData groupInvitationMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData2, MediaMessageData mediaMessageData, SenderName senderName, Long l2, JsonElement jsonElement, Integer num, String str3, List<InHouseMessageHandling> list, FrontendOption frontendOption, Long l3, WSSendReactionResponse wSSendReactionResponse, List<ReactionDisplay> list2) {
        this.senderUid = str;
        this.channelId = str2;
        this.contentType = inHouseIMContentType;
        this.channelType = inHouseIMChannelType;
        this.senderPlatformType = inHouseIMPlatformType;
        this.sendTime = l;
        this.textMessage = textMessageData;
        this.imageMessage = imageMessageData;
        this.videoMessage = videoMessageData;
        this.voiceMessage = voiceMessageData;
        this.shareMessage = shareMessageData;
        this.callMessage = callMessageData;
        this.quotedMessage = wSSendMessageDetailData;
        this.customMessage = customMessageData;
        this.systemMessage = systemMessageData;
        this.stickerMessage = stickerMessageData;
        this.readReceiptMessage = readReceiptMessageData;
        this.senderRecallMessage = recallMessageData;
        this.adminRecallMessage = recallMessageData2;
        this.groupInvitationMessage = groupInvitationMessageData;
        this.streamPlaceholderMessage = streamPlaceHolderMessageData;
        this.streamMessage = streamPlaceHolderMessageData2;
        this.mediaMessage = mediaMessageData;
        this.senderName = senderName;
        this.seq = l2;
        this.extra = jsonElement;
        this.status = num;
        this.clientMsgId = str3;
        this.messageHandling = list;
        this.frontendOption = frontendOption;
        this.lookupSeq = l3;
        this.reaction = wSSendReactionResponse;
        this.reactionDisplay = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0191: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r67v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r67v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType:?: TERNARY null = ((wrap:int:0x0012: ARITH (r67v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] (LINE:16) com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType.Unknown com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType) : (r36v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType:?: TERNARY null = ((wrap:int:0x001b: ARITH (r67v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] (LINE:17) com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Unknown com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType) : (r37v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r67v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] (LINE:19) com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType.Android com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType) : (r38v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r67v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: INVOKE 
  (wrap:long:0x0036: INVOKE 
  (wrap:java.util.Date:0x0033: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:20) call: java.util.Date.<init>():void type: CONSTRUCTOR)
 VIRTUAL call: java.util.Date.getTime():long A[MD:():long (c), WRAPPED] (LINE:20))
 STATIC call: java.lang.Long.valueOf(long):java.lang.Long A[MD:(long):java.lang.Long (c), WRAPPED] (LINE:20)) : (r39v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData:?: TERNARY null = ((wrap:int:0x0041: ARITH (r67v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData) : (r40v0 com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData:?: TERNARY null = ((wrap:int:0x0049: ARITH (r67v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData) : (r41v0 com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData:?: TERNARY null = ((wrap:int:0x0051: ARITH (r67v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData) : (r42v0 com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData:?: TERNARY null = ((wrap:int:0x0059: ARITH (r67v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData) : (r43v0 com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData:?: TERNARY null = ((wrap:int:0x0061: ARITH (r67v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData) : (r44v0 com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData:?: TERNARY null = ((wrap:int:0x0069: ARITH (r67v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData) : (r45v0 com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData:?: TERNARY null = ((wrap:int:0x0071: ARITH (r67v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData) : (r46v0 com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData:?: TERNARY null = ((wrap:int:0x0079: ARITH (r67v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData) : (r47v0 com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData:?: TERNARY null = ((wrap:int:0x0081: ARITH (r67v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData) : (r48v0 com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData:?: TERNARY null = ((wrap:int:0x008c: ARITH (r67v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData) : (r49v0 com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData:?: TERNARY null = ((wrap:int:0x0097: ARITH (r67v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData) : (r50v0 com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r67v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData) : (r51v0 com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r67v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData) : (r52v0 com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r67v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData) : (r53v0 com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r67v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData) : (r54v0 com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r67v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData) : (r55v0 com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r67v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData) : (r56v0 com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.SenderName:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r67v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.SenderName) : (r57v0 com.okinc.okimcore.model.im.inhouseim.ws.SenderName))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r67v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r58v0 java.lang.Long))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r67v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r59v0 kotlinx.serialization.json.JsonElement))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0105: ARITH (r67v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0110: ARITH (r67v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x011b: ARITH (r67v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r62v0 java.util.List))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption:?: TERNARY null = ((wrap:int:0x0126: ARITH (r67v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption) : (r63v0 com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0131: ARITH (r67v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r64v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse:?: TERNARY null = ((wrap:int:0x013c: ARITH (r67v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse) : (r65v0 com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0144: ARITH (r68v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r66v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData, com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData, com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData, com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData, com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SenderName, java.lang.Long, kotlinx.serialization.json.JsonElement, java.lang.Integer, java.lang.String, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.InHouseMessageHandling>, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay>):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData.<init>(java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData, com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData, com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData, com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData, com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SenderName, java.lang.Long, kotlinx.serialization.json.JsonElement, java.lang.Integer, java.lang.String, java.util.List, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse, java.util.List):void type: THIS */
    public /* synthetic */ WSSendMessageDetailData(String str, String str2, InHouseIMContentType inHouseIMContentType, InHouseIMChannelType inHouseIMChannelType, InHouseIMPlatformType inHouseIMPlatformType, Long l, TextMessageData textMessageData, ImageMessageData imageMessageData, VideoMessageData videoMessageData, VoiceMessageData voiceMessageData, ShareMessageData shareMessageData, CallMessageData callMessageData, WSSendMessageDetailData wSSendMessageDetailData, CustomMessageData customMessageData, SystemMessageData systemMessageData, StickerMessageData stickerMessageData, ReadReceiptMessageData readReceiptMessageData, RecallMessageData recallMessageData, RecallMessageData recallMessageData2, GroupInvitationMessageData groupInvitationMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData, StreamPlaceHolderMessageData streamPlaceHolderMessageData2, MediaMessageData mediaMessageData, SenderName senderName, Long l2, JsonElement jsonElement, Integer num, String str3, List list, FrontendOption frontendOption, Long l3, WSSendReactionResponse wSSendReactionResponse, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? InHouseIMContentType.Unknown : inHouseIMContentType, (i & 8) != 0 ? InHouseIMChannelType.Unknown : inHouseIMChannelType, (i & 16) != 0 ? InHouseIMPlatformType.Android : inHouseIMPlatformType, (i & 32) != 0 ? Long.valueOf(new Date().getTime()) : l, (i & 64) != 0 ? null : textMessageData, (i & 128) != 0 ? null : imageMessageData, (i & 256) != 0 ? null : videoMessageData, (i & 512) != 0 ? null : voiceMessageData, (i & 1024) != 0 ? null : shareMessageData, (i & 2048) != 0 ? null : callMessageData, (i & 4096) != 0 ? null : wSSendMessageDetailData, (i & 8192) != 0 ? null : customMessageData, (i & 16384) != 0 ? null : systemMessageData, (i & 32768) != 0 ? null : stickerMessageData, (i & 65536) != 0 ? null : readReceiptMessageData, (i & 131072) != 0 ? null : recallMessageData, (i & 262144) != 0 ? null : recallMessageData2, (i & 524288) != 0 ? null : groupInvitationMessageData, (i & 1048576) != 0 ? null : streamPlaceHolderMessageData, (i & 2097152) != 0 ? null : streamPlaceHolderMessageData2, (i & 4194304) != 0 ? null : mediaMessageData, (i & 8388608) != 0 ? null : senderName, (i & 16777216) != 0 ? null : l2, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : jsonElement, (i & 67108864) != 0 ? null : num, (i & 134217728) != 0 ? null : str3, (i & 268435456) != 0 ? null : list, (i & 536870912) != 0 ? null : frontendOption, (i & 1073741824) != 0 ? null : l3, (i & Integer.MIN_VALUE) != 0 ? null : wSSendReactionResponse, (i2 & 1) != 0 ? null : list2);
    }
}
