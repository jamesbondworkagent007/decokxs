package com.okinc.okimcore.model.room.inhouseim;

import androidx.room.TypeConverters;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import o.C44238sIk;
import o.sID;
import o.sIG;
import o.sIO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMConversationEntity {
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
    private final int groupAtType;
    private final Integer groupStatus;
    private final Integer groupType;
    private final Integer inGroupStatus;
    private final int isFlagged;
    private final Long lastReadMsgSeq;
    private final String lastUserMessageId;
    private final long lastUserMessageSendTime;
    private final Integer muteStatus;
    private final String nickname;
    private final int pinnedStatus;
    private final String relatedId;
    private final int role;
    private final Long startMsgSeq;
    private final List<Integer> tags;
    private final int unreadCount;
    private final int unreadMentionedCount;
    private final Integer unreadMentionedType;
    private final String updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.unreadMentionedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.unreadMentionedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.lastUserMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component17() {
        return this.lastUserMessageSendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel component18() {
        return this.draftMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component26() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.groupType;
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
    public final int component3() {
        return this.groupAtType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.muteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMConversationEntity copy(@NotNull String str, Integer num, int i, Integer num2, Integer num3, int i2, int i3, Integer num4, int i4, int i5, int i6, Integer num5, Long l, Long l2, String str2, String str3, long j, @TypeConverters({C44238sIk.class}) DraftMessageModel draftMessageModel, String str4, Integer num6, String str5, String str6, String str7, String str8, String str9, @TypeConverters({sID.class}) List<Integer> list, Integer num7, @TypeConverters({sIO.class}) List<ConversationIcon> list2, @TypeConverters({sIG.class}) JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMConversationEntity(str, num, i, num2, num3, i2, i3, num4, i4, i5, i6, num5, l, l2, str2, str3, j, draftMessageModel, str4, num6, str5, str6, str7, str8, str9, list, num7, list2, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMConversationEntity)) {
            return false;
        }
        InHouseIMConversationEntity inHouseIMConversationEntity = (InHouseIMConversationEntity) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMConversationEntity.channelId) && Intrinsics.EZpvd(this.channelType, inHouseIMConversationEntity.channelType) && this.groupAtType == inHouseIMConversationEntity.groupAtType && Intrinsics.EZpvd(this.inGroupStatus, inHouseIMConversationEntity.inGroupStatus) && Intrinsics.EZpvd(this.groupStatus, inHouseIMConversationEntity.groupStatus) && this.pinnedStatus == inHouseIMConversationEntity.pinnedStatus && this.isFlagged == inHouseIMConversationEntity.isFlagged && Intrinsics.EZpvd(this.muteStatus, inHouseIMConversationEntity.muteStatus) && this.role == inHouseIMConversationEntity.role && this.unreadCount == inHouseIMConversationEntity.unreadCount && this.unreadMentionedCount == inHouseIMConversationEntity.unreadMentionedCount && Intrinsics.EZpvd(this.unreadMentionedType, inHouseIMConversationEntity.unreadMentionedType) && Intrinsics.EZpvd(this.startMsgSeq, inHouseIMConversationEntity.startMsgSeq) && Intrinsics.EZpvd(this.lastReadMsgSeq, inHouseIMConversationEntity.lastReadMsgSeq) && Intrinsics.EZpvd((Object) this.extra, (Object) inHouseIMConversationEntity.extra) && Intrinsics.EZpvd((Object) this.lastUserMessageId, (Object) inHouseIMConversationEntity.lastUserMessageId) && this.lastUserMessageSendTime == inHouseIMConversationEntity.lastUserMessageSendTime && Intrinsics.EZpvd(this.draftMessage, inHouseIMConversationEntity.draftMessage) && Intrinsics.EZpvd((Object) this.updateTime, (Object) inHouseIMConversationEntity.updateTime) && Intrinsics.EZpvd(this.conversationStatus, inHouseIMConversationEntity.conversationStatus) && Intrinsics.EZpvd((Object) this.relatedId, (Object) inHouseIMConversationEntity.relatedId) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseIMConversationEntity.avatar) && Intrinsics.EZpvd((Object) this.nickname, (Object) inHouseIMConversationEntity.nickname) && Intrinsics.EZpvd((Object) this.enNickname, (Object) inHouseIMConversationEntity.enNickname) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) inHouseIMConversationEntity.bizGroupName) && Intrinsics.EZpvd(this.tags, inHouseIMConversationEntity.tags) && Intrinsics.EZpvd(this.groupType, inHouseIMConversationEntity.groupType) && Intrinsics.EZpvd(this.conversationIcons, inHouseIMConversationEntity.conversationIcons) && Intrinsics.EZpvd(this.entityInfoExtra, inHouseIMConversationEntity.entityInfoExtra);
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
    public final int getGroupAtType() {
        return this.groupAtType;
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
    public final String getLastUserMessageId() {
        return this.lastUserMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLastUserMessageSendTime() {
        return this.lastUserMessageSendTime;
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
    public final int getPinnedStatus() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelatedId() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRole() {
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
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.channelId.hashCode();
        Integer num = this.channelType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = Integer.hashCode(this.groupAtType);
        Integer num2 = this.inGroupStatus;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.groupStatus;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        int iHashCode7 = Integer.hashCode(this.pinnedStatus);
        int iHashCode8 = Integer.hashCode(this.isFlagged);
        Integer num4 = this.muteStatus;
        int iHashCode9 = num4 == null ? 0 : num4.hashCode();
        int iHashCode10 = Integer.hashCode(this.role);
        int iHashCode11 = Integer.hashCode(this.unreadCount);
        int iHashCode12 = Integer.hashCode(this.unreadMentionedCount);
        Integer num5 = this.unreadMentionedType;
        int iHashCode13 = num5 == null ? 0 : num5.hashCode();
        Long l = this.startMsgSeq;
        int iHashCode14 = l == null ? 0 : l.hashCode();
        Long l2 = this.lastReadMsgSeq;
        int iHashCode15 = l2 == null ? 0 : l2.hashCode();
        String str = this.extra;
        int iHashCode16 = str == null ? 0 : str.hashCode();
        String str2 = this.lastUserMessageId;
        if (str2 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode17 = Long.hashCode(this.lastUserMessageSendTime);
        DraftMessageModel draftMessageModel = this.draftMessage;
        int iHashCode18 = draftMessageModel == null ? 0 : draftMessageModel.hashCode();
        String str3 = this.updateTime;
        int iHashCode19 = str3 == null ? 0 : str3.hashCode();
        Integer num6 = this.conversationStatus;
        int iHashCode20 = num6 == null ? 0 : num6.hashCode();
        String str4 = this.relatedId;
        int iHashCode21 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.avatar;
        int iHashCode22 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nickname;
        int iHashCode23 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.enNickname;
        int iHashCode24 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.bizGroupName;
        int iHashCode25 = str8 == null ? 0 : str8.hashCode();
        List<Integer> list = this.tags;
        int iHashCode26 = list == null ? 0 : list.hashCode();
        Integer num7 = this.groupType;
        int iHashCode27 = num7 == null ? 0 : num7.hashCode();
        List<ConversationIcon> list2 = this.conversationIcons;
        int iHashCode28 = list2 == null ? 0 : list2.hashCode();
        JsonElement jsonElement = this.entityInfoExtra;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMConversationEntity(channelId=" + this.channelId + ", channelType=" + this.channelType + ", groupAtType=" + this.groupAtType + ", inGroupStatus=" + this.inGroupStatus + ", groupStatus=" + this.groupStatus + ", pinnedStatus=" + this.pinnedStatus + ", isFlagged=" + this.isFlagged + ", muteStatus=" + this.muteStatus + ", role=" + this.role + ", unreadCount=" + this.unreadCount + ", unreadMentionedCount=" + this.unreadMentionedCount + ", unreadMentionedType=" + this.unreadMentionedType + ", startMsgSeq=" + this.startMsgSeq + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", extra=" + this.extra + ", lastUserMessageId=" + this.lastUserMessageId + ", lastUserMessageSendTime=" + this.lastUserMessageSendTime + ", draftMessage=" + this.draftMessage + ", updateTime=" + this.updateTime + ", conversationStatus=" + this.conversationStatus + ", relatedId=" + this.relatedId + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", enNickname=" + this.enNickname + ", bizGroupName=" + this.bizGroupName + ", tags=" + this.tags + ", groupType=" + this.groupType + ", conversationIcons=" + this.conversationIcons + ", entityInfoExtra=" + this.entityInfoExtra + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMConversationEntity> serializer() {
            return InHouseIMConversationEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMConversationEntity(int i, String str, Integer num, int i2, Integer num2, Integer num3, int i3, int i4, Integer num4, int i5, int i6, int i7, Integer num5, Long l, Long l2, String str2, String str3, long j, DraftMessageModel draftMessageModel, String str4, Integer num6, String str5, String str6, String str7, String str8, String str9, List list, Integer num7, List list2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (79691776 != (i & 79691776)) {
            PluginExceptionsKt.throwMissingFieldException(i, 79691776, InHouseIMConversationEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num;
        }
        if ((i & 4) == 0) {
            this.groupAtType = 0;
        } else {
            this.groupAtType = i2;
        }
        if ((i & 8) == 0) {
            this.inGroupStatus = null;
        } else {
            this.inGroupStatus = num2;
        }
        if ((i & 16) == 0) {
            this.groupStatus = null;
        } else {
            this.groupStatus = num3;
        }
        if ((i & 32) == 0) {
            this.pinnedStatus = 0;
        } else {
            this.pinnedStatus = i3;
        }
        if ((i & 64) == 0) {
            this.isFlagged = 0;
        } else {
            this.isFlagged = i4;
        }
        if ((i & 128) == 0) {
            this.muteStatus = null;
        } else {
            this.muteStatus = num4;
        }
        if ((i & 256) == 0) {
            this.role = 0;
        } else {
            this.role = i5;
        }
        if ((i & 512) == 0) {
            this.unreadCount = 0;
        } else {
            this.unreadCount = i6;
        }
        if ((i & 1024) == 0) {
            this.unreadMentionedCount = 0;
        } else {
            this.unreadMentionedCount = i7;
        }
        if ((i & 2048) == 0) {
            this.unreadMentionedType = null;
        } else {
            this.unreadMentionedType = num5;
        }
        if ((i & 4096) == 0) {
            this.startMsgSeq = null;
        } else {
            this.startMsgSeq = l;
        }
        if ((i & 8192) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = l2;
        }
        if ((i & 16384) == 0) {
            this.extra = null;
        } else {
            this.extra = str2;
        }
        if ((32768 & i) == 0) {
            this.lastUserMessageId = null;
        } else {
            this.lastUserMessageId = str3;
        }
        this.lastUserMessageSendTime = (65536 & i) == 0 ? 0L : j;
        if ((131072 & i) == 0) {
            this.draftMessage = null;
        } else {
            this.draftMessage = draftMessageModel;
        }
        if ((262144 & i) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = str4;
        }
        if ((524288 & i) == 0) {
            this.conversationStatus = null;
        } else {
            this.conversationStatus = num6;
        }
        if ((1048576 & i) == 0) {
            this.relatedId = null;
        } else {
            this.relatedId = str5;
        }
        if ((2097152 & i) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str6;
        }
        this.nickname = str7;
        this.enNickname = str8;
        if ((16777216 & i) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str9;
        }
        if ((33554432 & i) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        this.groupType = num7;
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

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMConversationEntity inHouseIMConversationEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMConversationEntity.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMConversationEntity.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMConversationEntity.channelType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, inHouseIMConversationEntity.channelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMConversationEntity.groupAtType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, inHouseIMConversationEntity.groupAtType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMConversationEntity.inGroupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, inHouseIMConversationEntity.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMConversationEntity.groupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, inHouseIMConversationEntity.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMConversationEntity.pinnedStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, inHouseIMConversationEntity.pinnedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMConversationEntity.isFlagged != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, inHouseIMConversationEntity.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMConversationEntity.muteStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, inHouseIMConversationEntity.muteStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMConversationEntity.role != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, inHouseIMConversationEntity.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMConversationEntity.unreadCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, inHouseIMConversationEntity.unreadCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMConversationEntity.unreadMentionedCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, inHouseIMConversationEntity.unreadMentionedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMConversationEntity.unreadMentionedType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, inHouseIMConversationEntity.unreadMentionedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMConversationEntity.startMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, inHouseIMConversationEntity.startMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMConversationEntity.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, inHouseIMConversationEntity.lastReadMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMConversationEntity.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, inHouseIMConversationEntity.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || inHouseIMConversationEntity.lastUserMessageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, inHouseIMConversationEntity.lastUserMessageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || inHouseIMConversationEntity.lastUserMessageSendTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 16, inHouseIMConversationEntity.lastUserMessageSendTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || inHouseIMConversationEntity.draftMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, DraftMessageModel$$serializer.INSTANCE, inHouseIMConversationEntity.draftMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMConversationEntity.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, inHouseIMConversationEntity.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMConversationEntity.conversationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, inHouseIMConversationEntity.conversationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMConversationEntity.relatedId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, inHouseIMConversationEntity.relatedId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMConversationEntity.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, inHouseIMConversationEntity.avatar);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, inHouseIMConversationEntity.nickname);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, inHouseIMConversationEntity.enNickname);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || inHouseIMConversationEntity.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, inHouseIMConversationEntity.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || inHouseIMConversationEntity.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], inHouseIMConversationEntity.tags);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, inHouseIMConversationEntity.groupType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || inHouseIMConversationEntity.conversationIcons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], inHouseIMConversationEntity.conversationIcons);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && inHouseIMConversationEntity.entityInfoExtra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, JsonElementSerializer.INSTANCE, inHouseIMConversationEntity.entityInfoExtra);
    }

    public InHouseIMConversationEntity(@NotNull String str, Integer num, int i, Integer num2, Integer num3, int i2, int i3, Integer num4, int i4, int i5, int i6, Integer num5, Long l, Long l2, String str2, String str3, long j, @TypeConverters({C44238sIk.class}) DraftMessageModel draftMessageModel, String str4, Integer num6, String str5, String str6, String str7, String str8, String str9, @TypeConverters({sID.class}) List<Integer> list, Integer num7, @TypeConverters({sIO.class}) List<ConversationIcon> list2, @TypeConverters({sIG.class}) JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.channelType = num;
        this.groupAtType = i;
        this.inGroupStatus = num2;
        this.groupStatus = num3;
        this.pinnedStatus = i2;
        this.isFlagged = i3;
        this.muteStatus = num4;
        this.role = i4;
        this.unreadCount = i5;
        this.unreadMentionedCount = i6;
        this.unreadMentionedType = num5;
        this.startMsgSeq = l;
        this.lastReadMsgSeq = l2;
        this.extra = str2;
        this.lastUserMessageId = str3;
        this.lastUserMessageSendTime = j;
        this.draftMessage = draftMessageModel;
        this.updateTime = str4;
        this.conversationStatus = num6;
        this.relatedId = str5;
        this.avatar = str6;
        this.nickname = str7;
        this.enNickname = str8;
        this.bizGroupName = str9;
        this.tags = list;
        this.groupType = num7;
        this.conversationIcons = list2;
        this.entityInfoExtra = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003e: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0046: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004e: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005e: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0066: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r46v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x006e: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r47v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (32768 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x008d: ARITH (65536 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r50v0 long))
  (wrap:com.okinc.okimcore.model.room.inhouseim.DraftMessageModel:?: TERNARY null = ((wrap:int:0x0097: ARITH (131072 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.DraftMessageModel) : (r52v0 com.okinc.okimcore.model.room.inhouseim.DraftMessageModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (262144 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ab: ARITH (524288 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r54v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (1048576 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (2097152 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (r57v0 java.lang.String)
  (r58v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (16777216 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00d3: ARITH (33554432 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r60v0 java.util.List))
  (r61v0 java.lang.Integer)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00dd: ARITH (134217728 int) & (r64v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r62v0 java.util.List))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r63v0 kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, int, int, java.lang.Integer, int, int, int, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, long, com.okinc.okimcore.model.room.inhouseim.DraftMessageModel, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.Integer, java.util.List<com.okinc.okimcore.model.room.inhouseim.ConversationIcon>, kotlinx.serialization.json.JsonElement):void (m)] (LINE:33) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity.<init>(java.lang.String, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, int, int, java.lang.Integer, int, int, int, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, long, com.okinc.okimcore.model.room.inhouseim.DraftMessageModel, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.util.List, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ InHouseIMConversationEntity(String str, Integer num, int i, Integer num2, Integer num3, int i2, int i3, Integer num4, int i4, int i5, int i6, Integer num5, Long l, Long l2, String str2, String str3, long j, DraftMessageModel draftMessageModel, String str4, Integer num6, String str5, String str6, String str7, String str8, String str9, List list, Integer num7, List list2, JsonElement jsonElement, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? 0 : i, (i7 & 8) != 0 ? null : num2, (i7 & 16) != 0 ? null : num3, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? null : num4, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? 0 : i5, (i7 & 1024) != 0 ? 0 : i6, (i7 & 2048) != 0 ? null : num5, (i7 & 4096) != 0 ? null : l, (i7 & 8192) != 0 ? null : l2, (i7 & 16384) != 0 ? null : str2, (32768 & i7) != 0 ? null : str3, (65536 & i7) != 0 ? 0L : j, (131072 & i7) != 0 ? null : draftMessageModel, (262144 & i7) != 0 ? null : str4, (524288 & i7) != 0 ? null : num6, (1048576 & i7) != 0 ? null : str5, (2097152 & i7) != 0 ? null : str6, str7, str8, (16777216 & i7) != 0 ? null : str9, (33554432 & i7) != 0 ? null : list, num7, (134217728 & i7) != 0 ? null : list2, (i7 & 268435456) != 0 ? null : jsonElement);
    }
}
