package com.okinc.okimcore.model.room.inhouseim;

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
public final class InHouseIMServerConversationEntity {
    private final String avatar;
    private final String bizGroupName;
    private final String channelId;
    private final Integer channelType;
    private final List<ConversationIcon> conversationIcons;
    private final Integer conversationStatus;
    private final String enNickname;
    private final JsonElement entityInfoExtra;
    private final String extra;
    private final int groupAtType;
    private final Integer groupStatus;
    private final Integer groupType;
    private final Integer inGroupStatus;
    private final int isFlagged;
    private final Long lastReadMsgSeq;
    private final Integer muteStatus;
    private final String nickname;
    private final int pinnedStatus;
    private final String relatedId;
    private final int role;
    private final Long startMsgSeq;
    private final List<Integer> tags;
    private final Integer unreadCount;
    private final String updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMServerConversationEntity() {
        this((String) null, (Integer) null, (String) null, (List) null, (String) null, 0, (Integer) null, (Integer) null, (Long) null, 0, 0, (Integer) null, 0, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (List) null, (JsonElement) null, 16777215, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.muteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> component23() {
        return this.conversationIcons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component24() {
        return this.entityInfoExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.groupAtType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMServerConversationEntity copy(@NotNull String str, Integer num, String str2, List<Integer> list, String str3, int i, Integer num2, Integer num3, Long l, int i2, int i3, Integer num4, int i4, Long l2, String str4, String str5, String str6, String str7, String str8, Integer num5, Integer num6, Integer num7, List<ConversationIcon> list2, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMServerConversationEntity(str, num, str2, list, str3, i, num2, num3, l, i2, i3, num4, i4, l2, str4, str5, str6, str7, str8, num5, num6, num7, list2, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMServerConversationEntity)) {
            return false;
        }
        InHouseIMServerConversationEntity inHouseIMServerConversationEntity = (InHouseIMServerConversationEntity) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMServerConversationEntity.channelId) && Intrinsics.EZpvd(this.channelType, inHouseIMServerConversationEntity.channelType) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseIMServerConversationEntity.avatar) && Intrinsics.EZpvd(this.tags, inHouseIMServerConversationEntity.tags) && Intrinsics.EZpvd((Object) this.extra, (Object) inHouseIMServerConversationEntity.extra) && this.groupAtType == inHouseIMServerConversationEntity.groupAtType && Intrinsics.EZpvd(this.inGroupStatus, inHouseIMServerConversationEntity.inGroupStatus) && Intrinsics.EZpvd(this.groupStatus, inHouseIMServerConversationEntity.groupStatus) && Intrinsics.EZpvd(this.lastReadMsgSeq, inHouseIMServerConversationEntity.lastReadMsgSeq) && this.pinnedStatus == inHouseIMServerConversationEntity.pinnedStatus && this.isFlagged == inHouseIMServerConversationEntity.isFlagged && Intrinsics.EZpvd(this.muteStatus, inHouseIMServerConversationEntity.muteStatus) && this.role == inHouseIMServerConversationEntity.role && Intrinsics.EZpvd(this.startMsgSeq, inHouseIMServerConversationEntity.startMsgSeq) && Intrinsics.EZpvd((Object) this.updateTime, (Object) inHouseIMServerConversationEntity.updateTime) && Intrinsics.EZpvd((Object) this.relatedId, (Object) inHouseIMServerConversationEntity.relatedId) && Intrinsics.EZpvd((Object) this.enNickname, (Object) inHouseIMServerConversationEntity.enNickname) && Intrinsics.EZpvd((Object) this.nickname, (Object) inHouseIMServerConversationEntity.nickname) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) inHouseIMServerConversationEntity.bizGroupName) && Intrinsics.EZpvd(this.groupType, inHouseIMServerConversationEntity.groupType) && Intrinsics.EZpvd(this.unreadCount, inHouseIMServerConversationEntity.unreadCount) && Intrinsics.EZpvd(this.conversationStatus, inHouseIMServerConversationEntity.conversationStatus) && Intrinsics.EZpvd(this.conversationIcons, inHouseIMServerConversationEntity.conversationIcons) && Intrinsics.EZpvd(this.entityInfoExtra, inHouseIMServerConversationEntity.entityInfoExtra);
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
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        Integer num = this.channelType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.avatar;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<Integer> list = this.tags;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str2 = this.extra;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = Integer.hashCode(this.groupAtType);
        Integer num2 = this.inGroupStatus;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.groupStatus;
        int iHashCode8 = num3 == null ? 0 : num3.hashCode();
        Long l = this.lastReadMsgSeq;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        int iHashCode10 = Integer.hashCode(this.pinnedStatus);
        int iHashCode11 = Integer.hashCode(this.isFlagged);
        Integer num4 = this.muteStatus;
        int iHashCode12 = num4 == null ? 0 : num4.hashCode();
        int iHashCode13 = Integer.hashCode(this.role);
        Long l2 = this.startMsgSeq;
        int iHashCode14 = l2 == null ? 0 : l2.hashCode();
        String str3 = this.updateTime;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.relatedId;
        int iHashCode16 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.enNickname;
        int iHashCode17 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nickname;
        int iHashCode18 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bizGroupName;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        Integer num5 = this.groupType;
        int iHashCode20 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.unreadCount;
        int iHashCode21 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.conversationStatus;
        int iHashCode22 = num7 == null ? 0 : num7.hashCode();
        List<ConversationIcon> list2 = this.conversationIcons;
        int iHashCode23 = list2 == null ? 0 : list2.hashCode();
        JsonElement jsonElement = this.entityInfoExtra;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMServerConversationEntity(channelId=" + this.channelId + ", channelType=" + this.channelType + ", avatar=" + this.avatar + ", tags=" + this.tags + ", extra=" + this.extra + ", groupAtType=" + this.groupAtType + ", inGroupStatus=" + this.inGroupStatus + ", groupStatus=" + this.groupStatus + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", pinnedStatus=" + this.pinnedStatus + ", isFlagged=" + this.isFlagged + ", muteStatus=" + this.muteStatus + ", role=" + this.role + ", startMsgSeq=" + this.startMsgSeq + ", updateTime=" + this.updateTime + ", relatedId=" + this.relatedId + ", enNickname=" + this.enNickname + ", nickname=" + this.nickname + ", bizGroupName=" + this.bizGroupName + ", groupType=" + this.groupType + ", unreadCount=" + this.unreadCount + ", conversationStatus=" + this.conversationStatus + ", conversationIcons=" + this.conversationIcons + ", entityInfoExtra=" + this.entityInfoExtra + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMServerConversationEntity> serializer() {
            return InHouseIMServerConversationEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMServerConversationEntity(int i, String str, Integer num, String str2, List list, String str3, int i2, Integer num2, Integer num3, Long l, int i3, int i4, Integer num4, int i5, Long l2, String str4, String str5, String str6, String str7, String str8, Integer num5, Integer num6, Integer num7, List list2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        this.channelId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num;
        }
        if ((i & 4) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str2;
        }
        if ((i & 8) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 16) == 0) {
            this.extra = null;
        } else {
            this.extra = str3;
        }
        if ((i & 32) == 0) {
            this.groupAtType = 0;
        } else {
            this.groupAtType = i2;
        }
        if ((i & 64) == 0) {
            this.inGroupStatus = null;
        } else {
            this.inGroupStatus = num2;
        }
        if ((i & 128) == 0) {
            this.groupStatus = null;
        } else {
            this.groupStatus = num3;
        }
        if ((i & 256) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = l;
        }
        if ((i & 512) == 0) {
            this.pinnedStatus = 0;
        } else {
            this.pinnedStatus = i3;
        }
        if ((i & 1024) == 0) {
            this.isFlagged = 0;
        } else {
            this.isFlagged = i4;
        }
        if ((i & 2048) == 0) {
            this.muteStatus = null;
        } else {
            this.muteStatus = num4;
        }
        if ((i & 4096) == 0) {
            this.role = 0;
        } else {
            this.role = i5;
        }
        if ((i & 8192) == 0) {
            this.startMsgSeq = null;
        } else {
            this.startMsgSeq = l2;
        }
        if ((i & 16384) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = str4;
        }
        if ((32768 & i) == 0) {
            this.relatedId = null;
        } else {
            this.relatedId = str5;
        }
        if ((65536 & i) == 0) {
            this.enNickname = null;
        } else {
            this.enNickname = str6;
        }
        if ((131072 & i) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str7;
        }
        if ((262144 & i) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str8;
        }
        if ((524288 & i) == 0) {
            this.groupType = null;
        } else {
            this.groupType = num5;
        }
        if ((1048576 & i) == 0) {
            this.unreadCount = null;
        } else {
            this.unreadCount = num6;
        }
        if ((2097152 & i) == 0) {
            this.conversationStatus = null;
        } else {
            this.conversationStatus = num7;
        }
        if ((4194304 & i) == 0) {
            this.conversationIcons = null;
        } else {
            this.conversationIcons = list2;
        }
        if ((i & 8388608) == 0) {
            this.entityInfoExtra = null;
        } else {
            this.entityInfoExtra = jsonElement;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMServerConversationEntity inHouseIMServerConversationEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMServerConversationEntity.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMServerConversationEntity.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMServerConversationEntity.channelType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.channelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMServerConversationEntity.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMServerConversationEntity.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], inHouseIMServerConversationEntity.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMServerConversationEntity.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMServerConversationEntity.groupAtType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, inHouseIMServerConversationEntity.groupAtType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMServerConversationEntity.inGroupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMServerConversationEntity.groupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMServerConversationEntity.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, inHouseIMServerConversationEntity.lastReadMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMServerConversationEntity.pinnedStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, inHouseIMServerConversationEntity.pinnedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMServerConversationEntity.isFlagged != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, inHouseIMServerConversationEntity.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMServerConversationEntity.muteStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.muteStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMServerConversationEntity.role != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, inHouseIMServerConversationEntity.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMServerConversationEntity.startMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, inHouseIMServerConversationEntity.startMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMServerConversationEntity.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || inHouseIMServerConversationEntity.relatedId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.relatedId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || inHouseIMServerConversationEntity.enNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.enNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || inHouseIMServerConversationEntity.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMServerConversationEntity.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, inHouseIMServerConversationEntity.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMServerConversationEntity.groupType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMServerConversationEntity.unreadCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.unreadCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMServerConversationEntity.conversationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, inHouseIMServerConversationEntity.conversationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || inHouseIMServerConversationEntity.conversationIcons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, kSerializerArr[22], inHouseIMServerConversationEntity.conversationIcons);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && inHouseIMServerConversationEntity.entityInfoExtra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, JsonElementSerializer.INSTANCE, inHouseIMServerConversationEntity.entityInfoExtra);
    }

    public InHouseIMServerConversationEntity(@NotNull String str, Integer num, String str2, List<Integer> list, String str3, int i, Integer num2, Integer num3, Long l, int i2, int i3, Integer num4, int i4, Long l2, String str4, String str5, String str6, String str7, String str8, Integer num5, Integer num6, Integer num7, List<ConversationIcon> list2, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.channelType = num;
        this.avatar = str2;
        this.tags = list;
        this.extra = str3;
        this.groupAtType = i;
        this.inGroupStatus = num2;
        this.groupStatus = num3;
        this.lastReadMsgSeq = l;
        this.pinnedStatus = i2;
        this.isFlagged = i3;
        this.muteStatus = num4;
        this.role = i4;
        this.startMsgSeq = l2;
        this.updateTime = str4;
        this.relatedId = str5;
        this.enNickname = str6;
        this.nickname = str7;
        this.bizGroupName = str8;
        this.groupType = num5;
        this.unreadCount = num6;
        this.conversationStatus = num7;
        this.conversationIcons = list2;
        this.entityInfoExtra = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0110: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002b: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0034: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003c: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r34v0 java.lang.Long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005c: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r38v0 int) : (0 int))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x006b: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r39v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r47v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r48v0 java.util.List))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x00d6: ARITH (r50v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r49v0 kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, int, java.lang.Integer, java.lang.Integer, java.lang.Long, int, int, java.lang.Integer, int, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.List<com.okinc.okimcore.model.room.inhouseim.ConversationIcon>, kotlinx.serialization.json.JsonElement):void (m)] (LINE:10) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.util.List, java.lang.String, int, java.lang.Integer, java.lang.Integer, java.lang.Long, int, int, java.lang.Integer, int, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.List, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ InHouseIMServerConversationEntity(String str, Integer num, String str2, List list, String str3, int i, Integer num2, Integer num3, Long l, int i2, int i3, Integer num4, int i4, Long l2, String str4, String str5, String str6, String str7, String str8, Integer num5, Integer num6, Integer num7, List list2, JsonElement jsonElement, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : list, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? null : num2, (i5 & 128) != 0 ? null : num3, (i5 & 256) != 0 ? null : l, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? null : num4, (i5 & 4096) == 0 ? i4 : 0, (i5 & 8192) != 0 ? null : l2, (i5 & 16384) != 0 ? null : str4, (i5 & 32768) != 0 ? null : str5, (i5 & 65536) != 0 ? null : str6, (i5 & 131072) != 0 ? null : str7, (i5 & 262144) != 0 ? null : str8, (i5 & 524288) != 0 ? null : num5, (i5 & 1048576) != 0 ? null : num6, (i5 & 2097152) != 0 ? null : num7, (i5 & 4194304) != 0 ? null : list2, (i5 & 8388608) != 0 ? null : jsonElement);
    }
}
