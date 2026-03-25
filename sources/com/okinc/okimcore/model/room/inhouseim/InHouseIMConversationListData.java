package com.okinc.okimcore.model.room.inhouseim;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMConversationListData {
    private final String avatar;
    private final String bizGroupName;
    private final String channelId;
    private final Integer channelType;
    private final List<ConversationIcon> conversationIcons;
    private final Integer conversationStatus;
    private final DraftMessageModel draftMessage;
    private final String enNickname;
    private final JsonElement entityInfoExtra;
    private final String extra;
    private final Integer groupStatus;
    private final Integer groupType;
    private final Integer inGroupStatus;
    private final int isFlagged;
    private final Long lastReadMsgSeq;
    private final long lastUserMessageSendTime;
    private final InHouseIMMessageEntity lastUserMsg;
    private final Integer muteStatus;
    private final String nickname;
    private final String phoneName;
    private final int pinnedStatus;
    private final String relatedId;
    private final String remarkName;
    private final Integer role;
    private final Long startMsgSeq;
    private final List<Integer> tags;
    private final int unreadCount;
    private final int unreadMentionedCount;
    private final Integer unreadMentionedType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMConversationListData() {
        this((String) null, (Integer) null, 0L, 0, 0, 0, (Integer) null, (DraftMessageModel) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (InHouseIMMessageEntity) null, (List) null, (JsonElement) null, 536870911, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.unreadMentionedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component19() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component20() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component26() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity component27() {
        return this.lastUserMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> component28() {
        return this.conversationIcons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component29() {
        return this.entityInfoExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.lastUserMessageSendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.muteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel component8() {
        return this.draftMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.unreadMentionedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMConversationListData copy(@NotNull String str, Integer num, long j, int i, int i2, int i3, Integer num2, DraftMessageModel draftMessageModel, int i4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str2, String str3, String str4, Integer num8, Long l, Long l2, String str5, String str6, String str7, String str8, String str9, List<Integer> list, InHouseIMMessageEntity inHouseIMMessageEntity, List<ConversationIcon> list2, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMConversationListData(str, num, j, i, i2, i3, num2, draftMessageModel, i4, num3, num4, num5, num6, num7, str2, str3, str4, num8, l, l2, str5, str6, str7, str8, str9, list, inHouseIMMessageEntity, list2, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMConversationListData)) {
            return false;
        }
        InHouseIMConversationListData inHouseIMConversationListData = (InHouseIMConversationListData) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMConversationListData.channelId) && Intrinsics.EZpvd(this.channelType, inHouseIMConversationListData.channelType) && this.lastUserMessageSendTime == inHouseIMConversationListData.lastUserMessageSendTime && this.unreadCount == inHouseIMConversationListData.unreadCount && this.pinnedStatus == inHouseIMConversationListData.pinnedStatus && this.isFlagged == inHouseIMConversationListData.isFlagged && Intrinsics.EZpvd(this.muteStatus, inHouseIMConversationListData.muteStatus) && Intrinsics.EZpvd(this.draftMessage, inHouseIMConversationListData.draftMessage) && this.unreadMentionedCount == inHouseIMConversationListData.unreadMentionedCount && Intrinsics.EZpvd(this.unreadMentionedType, inHouseIMConversationListData.unreadMentionedType) && Intrinsics.EZpvd(this.inGroupStatus, inHouseIMConversationListData.inGroupStatus) && Intrinsics.EZpvd(this.groupStatus, inHouseIMConversationListData.groupStatus) && Intrinsics.EZpvd(this.groupType, inHouseIMConversationListData.groupType) && Intrinsics.EZpvd(this.role, inHouseIMConversationListData.role) && Intrinsics.EZpvd((Object) this.extra, (Object) inHouseIMConversationListData.extra) && Intrinsics.EZpvd((Object) this.remarkName, (Object) inHouseIMConversationListData.remarkName) && Intrinsics.EZpvd((Object) this.phoneName, (Object) inHouseIMConversationListData.phoneName) && Intrinsics.EZpvd(this.conversationStatus, inHouseIMConversationListData.conversationStatus) && Intrinsics.EZpvd(this.lastReadMsgSeq, inHouseIMConversationListData.lastReadMsgSeq) && Intrinsics.EZpvd(this.startMsgSeq, inHouseIMConversationListData.startMsgSeq) && Intrinsics.EZpvd((Object) this.relatedId, (Object) inHouseIMConversationListData.relatedId) && Intrinsics.EZpvd((Object) this.enNickname, (Object) inHouseIMConversationListData.enNickname) && Intrinsics.EZpvd((Object) this.nickname, (Object) inHouseIMConversationListData.nickname) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) inHouseIMConversationListData.bizGroupName) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseIMConversationListData.avatar) && Intrinsics.EZpvd(this.tags, inHouseIMConversationListData.tags) && Intrinsics.EZpvd(this.lastUserMsg, inHouseIMConversationListData.lastUserMsg) && Intrinsics.EZpvd(this.conversationIcons, inHouseIMConversationListData.conversationIcons) && Intrinsics.EZpvd(this.entityInfoExtra, inHouseIMConversationListData.entityInfoExtra);
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
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChannelType() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> getConversationIcons() {
        return this.conversationIcons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getConversationStatus() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel getDraftMessage() {
        return this.draftMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickname() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getEntityInfoExtra() {
        return this.entityInfoExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupStatus() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInGroupStatus() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastReadMsgSeq() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLastUserMessageSendTime() {
        return this.lastUserMessageSendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity getLastUserMsg() {
        return this.lastUserMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMuteStatus() {
        return this.muteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneName() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPinnedStatus() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelatedId() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartMsgSeq() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnreadMentionedCount() {
        return this.unreadMentionedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUnreadMentionedType() {
        return this.unreadMentionedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        Integer num = this.channelType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = Long.hashCode(this.lastUserMessageSendTime);
        int iHashCode4 = Integer.hashCode(this.unreadCount);
        int iHashCode5 = Integer.hashCode(this.pinnedStatus);
        int iHashCode6 = Integer.hashCode(this.isFlagged);
        Integer num2 = this.muteStatus;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        DraftMessageModel draftMessageModel = this.draftMessage;
        int iHashCode8 = draftMessageModel == null ? 0 : draftMessageModel.hashCode();
        int iHashCode9 = Integer.hashCode(this.unreadMentionedCount);
        Integer num3 = this.unreadMentionedType;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.inGroupStatus;
        int iHashCode11 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.groupStatus;
        int iHashCode12 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.groupType;
        int iHashCode13 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.role;
        int iHashCode14 = num7 == null ? 0 : num7.hashCode();
        String str = this.extra;
        int iHashCode15 = str == null ? 0 : str.hashCode();
        String str2 = this.remarkName;
        int iHashCode16 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.phoneName;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        Integer num8 = this.conversationStatus;
        int iHashCode18 = num8 == null ? 0 : num8.hashCode();
        Long l = this.lastReadMsgSeq;
        int iHashCode19 = l == null ? 0 : l.hashCode();
        Long l2 = this.startMsgSeq;
        int iHashCode20 = l2 == null ? 0 : l2.hashCode();
        String str4 = this.relatedId;
        int iHashCode21 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.enNickname;
        int iHashCode22 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nickname;
        int iHashCode23 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bizGroupName;
        int iHashCode24 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.avatar;
        int iHashCode25 = str8 == null ? 0 : str8.hashCode();
        List<Integer> list = this.tags;
        int iHashCode26 = list == null ? 0 : list.hashCode();
        InHouseIMMessageEntity inHouseIMMessageEntity = this.lastUserMsg;
        int iHashCode27 = inHouseIMMessageEntity == null ? 0 : inHouseIMMessageEntity.hashCode();
        List<ConversationIcon> list2 = this.conversationIcons;
        int iHashCode28 = list2 == null ? 0 : list2.hashCode();
        JsonElement jsonElement = this.entityInfoExtra;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMConversationListData(channelId=" + this.channelId + ", channelType=" + this.channelType + ", lastUserMessageSendTime=" + this.lastUserMessageSendTime + ", unreadCount=" + this.unreadCount + ", pinnedStatus=" + this.pinnedStatus + ", isFlagged=" + this.isFlagged + ", muteStatus=" + this.muteStatus + ", draftMessage=" + this.draftMessage + ", unreadMentionedCount=" + this.unreadMentionedCount + ", unreadMentionedType=" + this.unreadMentionedType + ", inGroupStatus=" + this.inGroupStatus + ", groupStatus=" + this.groupStatus + ", groupType=" + this.groupType + ", role=" + this.role + ", extra=" + this.extra + ", remarkName=" + this.remarkName + ", phoneName=" + this.phoneName + ", conversationStatus=" + this.conversationStatus + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", startMsgSeq=" + this.startMsgSeq + ", relatedId=" + this.relatedId + ", enNickname=" + this.enNickname + ", nickname=" + this.nickname + ", bizGroupName=" + this.bizGroupName + ", avatar=" + this.avatar + ", tags=" + this.tags + ", lastUserMsg=" + this.lastUserMsg + ", conversationIcons=" + this.conversationIcons + ", entityInfoExtra=" + this.entityInfoExtra + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMConversationListData> serializer() {
            return InHouseIMConversationListData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMConversationListData(int i, String str, Integer num, long j, int i2, int i3, int i4, Integer num2, DraftMessageModel draftMessageModel, int i5, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str2, String str3, String str4, Integer num8, Long l, Long l2, String str5, String str6, String str7, String str8, String str9, List list, InHouseIMMessageEntity inHouseIMMessageEntity, List list2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        this.channelId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num;
        }
        this.lastUserMessageSendTime = (i & 4) == 0 ? 0L : j;
        if ((i & 8) == 0) {
            this.unreadCount = 0;
        } else {
            this.unreadCount = i2;
        }
        if ((i & 16) == 0) {
            this.pinnedStatus = 0;
        } else {
            this.pinnedStatus = i3;
        }
        if ((i & 32) == 0) {
            this.isFlagged = 0;
        } else {
            this.isFlagged = i4;
        }
        if ((i & 64) == 0) {
            this.muteStatus = null;
        } else {
            this.muteStatus = num2;
        }
        if ((i & 128) == 0) {
            this.draftMessage = null;
        } else {
            this.draftMessage = draftMessageModel;
        }
        if ((i & 256) == 0) {
            this.unreadMentionedCount = 0;
        } else {
            this.unreadMentionedCount = i5;
        }
        if ((i & 512) == 0) {
            this.unreadMentionedType = null;
        } else {
            this.unreadMentionedType = num3;
        }
        if ((i & 1024) == 0) {
            this.inGroupStatus = null;
        } else {
            this.inGroupStatus = num4;
        }
        if ((i & 2048) == 0) {
            this.groupStatus = null;
        } else {
            this.groupStatus = num5;
        }
        if ((i & 4096) == 0) {
            this.groupType = null;
        } else {
            this.groupType = num6;
        }
        if ((i & 8192) == 0) {
            this.role = null;
        } else {
            this.role = num7;
        }
        if ((i & 16384) == 0) {
            this.extra = null;
        } else {
            this.extra = str2;
        }
        if ((32768 & i) == 0) {
            this.remarkName = null;
        } else {
            this.remarkName = str3;
        }
        if ((65536 & i) == 0) {
            this.phoneName = null;
        } else {
            this.phoneName = str4;
        }
        if ((131072 & i) == 0) {
            this.conversationStatus = null;
        } else {
            this.conversationStatus = num8;
        }
        if ((262144 & i) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = l;
        }
        if ((524288 & i) == 0) {
            this.startMsgSeq = null;
        } else {
            this.startMsgSeq = l2;
        }
        if ((1048576 & i) == 0) {
            this.relatedId = null;
        } else {
            this.relatedId = str5;
        }
        if ((2097152 & i) == 0) {
            this.enNickname = null;
        } else {
            this.enNickname = str6;
        }
        if ((4194304 & i) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str7;
        }
        if ((8388608 & i) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str8;
        }
        if ((16777216 & i) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str9;
        }
        if ((33554432 & i) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((67108864 & i) == 0) {
            this.lastUserMsg = null;
        } else {
            this.lastUserMsg = inHouseIMMessageEntity;
        }
        if ((134217728 & i) == 0) {
            this.conversationIcons = null;
        } else {
            this.conversationIcons = list2;
        }
        if ((i & 268435456) == 0) {
            this.entityInfoExtra = null;
        } else {
            this.entityInfoExtra = jsonElement;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMConversationListData inHouseIMConversationListData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMConversationListData.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMConversationListData.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMConversationListData.channelType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, inHouseIMConversationListData.channelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMConversationListData.lastUserMessageSendTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, inHouseIMConversationListData.lastUserMessageSendTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMConversationListData.unreadCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, inHouseIMConversationListData.unreadCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMConversationListData.pinnedStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, inHouseIMConversationListData.pinnedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMConversationListData.isFlagged != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, inHouseIMConversationListData.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMConversationListData.muteStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, inHouseIMConversationListData.muteStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMConversationListData.draftMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, DraftMessageModel$$serializer.INSTANCE, inHouseIMConversationListData.draftMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMConversationListData.unreadMentionedCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, inHouseIMConversationListData.unreadMentionedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMConversationListData.unreadMentionedType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, inHouseIMConversationListData.unreadMentionedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMConversationListData.inGroupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, inHouseIMConversationListData.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMConversationListData.groupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, inHouseIMConversationListData.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMConversationListData.groupType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, inHouseIMConversationListData.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMConversationListData.role != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, inHouseIMConversationListData.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMConversationListData.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, inHouseIMConversationListData.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || inHouseIMConversationListData.remarkName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, inHouseIMConversationListData.remarkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || inHouseIMConversationListData.phoneName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, inHouseIMConversationListData.phoneName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || inHouseIMConversationListData.conversationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, inHouseIMConversationListData.conversationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMConversationListData.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, LongSerializer.INSTANCE, inHouseIMConversationListData.lastReadMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMConversationListData.startMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, LongSerializer.INSTANCE, inHouseIMConversationListData.startMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMConversationListData.relatedId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, inHouseIMConversationListData.relatedId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMConversationListData.enNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, inHouseIMConversationListData.enNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || inHouseIMConversationListData.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, inHouseIMConversationListData.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || inHouseIMConversationListData.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, inHouseIMConversationListData.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || inHouseIMConversationListData.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, inHouseIMConversationListData.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || inHouseIMConversationListData.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], inHouseIMConversationListData.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || inHouseIMConversationListData.lastUserMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, InHouseIMMessageEntity$$serializer.INSTANCE, inHouseIMConversationListData.lastUserMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || inHouseIMConversationListData.conversationIcons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], inHouseIMConversationListData.conversationIcons);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && inHouseIMConversationListData.entityInfoExtra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, JsonElementSerializer.INSTANCE, inHouseIMConversationListData.entityInfoExtra);
    }

    public InHouseIMConversationListData(@NotNull String str, Integer num, long j, int i, int i2, int i3, Integer num2, DraftMessageModel draftMessageModel, int i4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str2, String str3, String str4, Integer num8, Long l, Long l2, String str5, String str6, String str7, String str8, String str9, List<Integer> list, InHouseIMMessageEntity inHouseIMMessageEntity, List<ConversationIcon> list2, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.channelType = num;
        this.lastUserMessageSendTime = j;
        this.unreadCount = i;
        this.pinnedStatus = i2;
        this.isFlagged = i3;
        this.muteStatus = num2;
        this.draftMessage = draftMessageModel;
        this.unreadMentionedCount = i4;
        this.unreadMentionedType = num3;
        this.inGroupStatus = num4;
        this.groupStatus = num5;
        this.groupType = num6;
        this.role = num7;
        this.extra = str2;
        this.remarkName = str3;
        this.phoneName = str4;
        this.conversationStatus = num8;
        this.lastReadMsgSeq = l;
        this.startMsgSeq = l2;
        this.relatedId = str5;
        this.enNickname = str6;
        this.nickname = str7;
        this.bizGroupName = str8;
        this.avatar = str9;
        this.tags = list;
        this.lastUserMsg = inHouseIMMessageEntity;
        this.conversationIcons = list2;
        this.entityInfoExtra = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0154: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r61v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r61v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r61v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r61v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r61v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r61v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0035: ARITH (r61v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.room.inhouseim.DraftMessageModel:?: TERNARY null = ((wrap:int:0x003d: ARITH (r61v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.DraftMessageModel) : (r39v0 com.okinc.okimcore.model.room.inhouseim.DraftMessageModel))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r61v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r40v0 int) : (0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004c: ARITH (r61v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0054: ARITH (r61v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005c: ARITH (r61v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r43v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0064: ARITH (r61v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r61v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r61v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r61v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r61v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0097: ARITH (r61v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r61v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r50v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r61v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r51v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r61v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r61v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r61v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r61v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r61v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r61v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r57v0 java.util.List))
  (wrap:com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r61v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity) : (r58v0 com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0105: ARITH (r61v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r59v0 java.util.List))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0110: ARITH (r61v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r60v0 kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.Integer, long, int, int, int, java.lang.Integer, com.okinc.okimcore.model.room.inhouseim.DraftMessageModel, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, java.util.List<com.okinc.okimcore.model.room.inhouseim.ConversationIcon>, kotlinx.serialization.json.JsonElement):void (m)] (LINE:11) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData.<init>(java.lang.String, java.lang.Integer, long, int, int, int, java.lang.Integer, com.okinc.okimcore.model.room.inhouseim.DraftMessageModel, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, java.util.List, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ InHouseIMConversationListData(String str, Integer num, long j, int i, int i2, int i3, Integer num2, DraftMessageModel draftMessageModel, int i4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str2, String str3, String str4, Integer num8, Long l, Long l2, String str5, String str6, String str7, String str8, String str9, List list, InHouseIMMessageEntity inHouseIMMessageEntity, List list2, JsonElement jsonElement, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? null : num2, (i5 & 128) != 0 ? null : draftMessageModel, (i5 & 256) == 0 ? i4 : 0, (i5 & 512) != 0 ? null : num3, (i5 & 1024) != 0 ? null : num4, (i5 & 2048) != 0 ? null : num5, (i5 & 4096) != 0 ? null : num6, (i5 & 8192) != 0 ? null : num7, (i5 & 16384) != 0 ? null : str2, (i5 & 32768) != 0 ? null : str3, (i5 & 65536) != 0 ? null : str4, (i5 & 131072) != 0 ? null : num8, (i5 & 262144) != 0 ? null : l, (i5 & 524288) != 0 ? null : l2, (i5 & 1048576) != 0 ? null : str5, (i5 & 2097152) != 0 ? null : str6, (i5 & 4194304) != 0 ? null : str7, (i5 & 8388608) != 0 ? null : str8, (i5 & 16777216) != 0 ? null : str9, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : list, (i5 & 67108864) != 0 ? null : inHouseIMMessageEntity, (i5 & 134217728) != 0 ? null : list2, (i5 & 268435456) != 0 ? null : jsonElement);
    }
}
