package com.okinc.okimcore.model.room.inhouseim;

import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMServerConversationResponse {
    private final String attachedInfo;
    private final String channelId;
    private final InHouseIMChannelType channelType;
    private final Integer conversationStatus;
    private final EntityInfo entityInfo;
    private final String extra;
    private final int groupAtType;
    private final GroupStatus groupStatus;
    private final InGroupStatus inGroupStatus;
    private final int isFlagged;
    private final String lastReadMsgSeq;
    private final String lastReceivedMsgSeq;
    private final int pinnedStatus;
    private final ReceiveMessageOptionType receiveMsgOption;
    private final int role;
    private final int sendMsgOption;
    private final WSSendMessageDetailData serverLastUserMsg;
    private final String startMsgSeq;
    private final int unreadCount;
    private final String unreadCountUpdateTime;
    private final String updateTime;
    private final String userUid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, InHouseIMChannelType.Companion.serializer(), null, null, null, InGroupStatus.Companion.serializer(), GroupStatus.Companion.serializer(), null, null, null, null, null, ReceiveMessageOptionType.Companion.serializer(), null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMServerConversationResponse() {
        this((String) null, (String) null, (InHouseIMChannelType) null, (EntityInfo) null, (String) null, 0, (InGroupStatus) null, (GroupStatus) null, (String) null, (String) null, (WSSendMessageDetailData) null, 0, 0, (ReceiveMessageOptionType) null, 0, 0, (String) null, (String) null, (String) null, (String) null, 0, (Integer) null, 4194303, (DefaultConstructorMarker) null);
    }

    @SerialName("lastUserMsg")
    public static /* synthetic */ void getServerLastUserMsg$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.lastReceivedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData component11() {
        return this.serverLastUserMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceiveMessageOptionType component14() {
        return this.receiveMsgOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.sendMsgOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.unreadCountUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.attachedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMChannelType component3() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntityInfo component4() {
        return this.entityInfo;
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
    public final InGroupStatus component7() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupStatus component8() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMServerConversationResponse copy(@NotNull String str, String str2, InHouseIMChannelType inHouseIMChannelType, EntityInfo entityInfo, String str3, int i, InGroupStatus inGroupStatus, GroupStatus groupStatus, String str4, String str5, WSSendMessageDetailData wSSendMessageDetailData, int i2, int i3, ReceiveMessageOptionType receiveMessageOptionType, int i4, int i5, String str6, String str7, String str8, String str9, int i6, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMServerConversationResponse(str, str2, inHouseIMChannelType, entityInfo, str3, i, inGroupStatus, groupStatus, str4, str5, wSSendMessageDetailData, i2, i3, receiveMessageOptionType, i4, i5, str6, str7, str8, str9, i6, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMServerConversationResponse)) {
            return false;
        }
        InHouseIMServerConversationResponse inHouseIMServerConversationResponse = (InHouseIMServerConversationResponse) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMServerConversationResponse.channelId) && Intrinsics.EZpvd((Object) this.attachedInfo, (Object) inHouseIMServerConversationResponse.attachedInfo) && this.channelType == inHouseIMServerConversationResponse.channelType && Intrinsics.EZpvd(this.entityInfo, inHouseIMServerConversationResponse.entityInfo) && Intrinsics.EZpvd((Object) this.extra, (Object) inHouseIMServerConversationResponse.extra) && this.groupAtType == inHouseIMServerConversationResponse.groupAtType && this.inGroupStatus == inHouseIMServerConversationResponse.inGroupStatus && this.groupStatus == inHouseIMServerConversationResponse.groupStatus && Intrinsics.EZpvd((Object) this.lastReadMsgSeq, (Object) inHouseIMServerConversationResponse.lastReadMsgSeq) && Intrinsics.EZpvd((Object) this.lastReceivedMsgSeq, (Object) inHouseIMServerConversationResponse.lastReceivedMsgSeq) && Intrinsics.EZpvd(this.serverLastUserMsg, inHouseIMServerConversationResponse.serverLastUserMsg) && this.pinnedStatus == inHouseIMServerConversationResponse.pinnedStatus && this.isFlagged == inHouseIMServerConversationResponse.isFlagged && this.receiveMsgOption == inHouseIMServerConversationResponse.receiveMsgOption && this.role == inHouseIMServerConversationResponse.role && this.sendMsgOption == inHouseIMServerConversationResponse.sendMsgOption && Intrinsics.EZpvd((Object) this.startMsgSeq, (Object) inHouseIMServerConversationResponse.startMsgSeq) && Intrinsics.EZpvd((Object) this.unreadCountUpdateTime, (Object) inHouseIMServerConversationResponse.unreadCountUpdateTime) && Intrinsics.EZpvd((Object) this.userUid, (Object) inHouseIMServerConversationResponse.userUid) && Intrinsics.EZpvd((Object) this.updateTime, (Object) inHouseIMServerConversationResponse.updateTime) && this.unreadCount == inHouseIMServerConversationResponse.unreadCount && Intrinsics.EZpvd(this.conversationStatus, inHouseIMServerConversationResponse.conversationStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttachedInfo() {
        return this.attachedInfo;
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
    public final Integer getConversationStatus() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntityInfo getEntityInfo() {
        return this.entityInfo;
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
    public final GroupStatus getGroupStatus() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InGroupStatus getInGroupStatus() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastReadMsgSeq() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastReceivedMsgSeq() {
        return this.lastReceivedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPinnedStatus() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceiveMessageOptionType getReceiveMsgOption() {
        return this.receiveMsgOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSendMsgOption() {
        return this.sendMsgOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData getServerLastUserMsg() {
        return this.serverLastUserMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartMsgSeq() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnreadCountUpdateTime() {
        return this.unreadCountUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        String str = this.attachedInfo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        InHouseIMChannelType inHouseIMChannelType = this.channelType;
        int iHashCode3 = inHouseIMChannelType == null ? 0 : inHouseIMChannelType.hashCode();
        EntityInfo entityInfo = this.entityInfo;
        int iHashCode4 = entityInfo == null ? 0 : entityInfo.hashCode();
        String str2 = this.extra;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = Integer.hashCode(this.groupAtType);
        InGroupStatus inGroupStatus = this.inGroupStatus;
        int iHashCode7 = inGroupStatus == null ? 0 : inGroupStatus.hashCode();
        GroupStatus groupStatus = this.groupStatus;
        int iHashCode8 = groupStatus == null ? 0 : groupStatus.hashCode();
        String str3 = this.lastReadMsgSeq;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lastReceivedMsgSeq;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        WSSendMessageDetailData wSSendMessageDetailData = this.serverLastUserMsg;
        int iHashCode11 = wSSendMessageDetailData == null ? 0 : wSSendMessageDetailData.hashCode();
        int iHashCode12 = Integer.hashCode(this.pinnedStatus);
        int iHashCode13 = Integer.hashCode(this.isFlagged);
        ReceiveMessageOptionType receiveMessageOptionType = this.receiveMsgOption;
        int iHashCode14 = receiveMessageOptionType == null ? 0 : receiveMessageOptionType.hashCode();
        int iHashCode15 = Integer.hashCode(this.role);
        int iHashCode16 = Integer.hashCode(this.sendMsgOption);
        String str5 = this.startMsgSeq;
        int iHashCode17 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.unreadCountUpdateTime;
        int iHashCode18 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.userUid;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.updateTime;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        int iHashCode21 = Integer.hashCode(this.unreadCount);
        Integer num = this.conversationStatus;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMServerConversationResponse(channelId=" + this.channelId + ", attachedInfo=" + this.attachedInfo + ", channelType=" + this.channelType + ", entityInfo=" + this.entityInfo + ", extra=" + this.extra + ", groupAtType=" + this.groupAtType + ", inGroupStatus=" + this.inGroupStatus + ", groupStatus=" + this.groupStatus + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", lastReceivedMsgSeq=" + this.lastReceivedMsgSeq + ", serverLastUserMsg=" + this.serverLastUserMsg + ", pinnedStatus=" + this.pinnedStatus + ", isFlagged=" + this.isFlagged + ", receiveMsgOption=" + this.receiveMsgOption + ", role=" + this.role + ", sendMsgOption=" + this.sendMsgOption + ", startMsgSeq=" + this.startMsgSeq + ", unreadCountUpdateTime=" + this.unreadCountUpdateTime + ", userUid=" + this.userUid + ", updateTime=" + this.updateTime + ", unreadCount=" + this.unreadCount + ", conversationStatus=" + this.conversationStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMServerConversationResponse> serializer() {
            return InHouseIMServerConversationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMServerConversationResponse(int i, String str, String str2, InHouseIMChannelType inHouseIMChannelType, EntityInfo entityInfo, String str3, int i2, InGroupStatus inGroupStatus, GroupStatus groupStatus, String str4, String str5, WSSendMessageDetailData wSSendMessageDetailData, int i3, int i4, ReceiveMessageOptionType receiveMessageOptionType, int i5, int i6, String str6, String str7, String str8, String str9, int i7, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.channelId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.attachedInfo = null;
        } else {
            this.attachedInfo = str2;
        }
        if ((i & 4) == 0) {
            this.channelType = null;
        } else {
            this.channelType = inHouseIMChannelType;
        }
        if ((i & 8) == 0) {
            this.entityInfo = null;
        } else {
            this.entityInfo = entityInfo;
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
            this.inGroupStatus = inGroupStatus;
        }
        if ((i & 128) == 0) {
            this.groupStatus = null;
        } else {
            this.groupStatus = groupStatus;
        }
        if ((i & 256) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = str4;
        }
        if ((i & 512) == 0) {
            this.lastReceivedMsgSeq = null;
        } else {
            this.lastReceivedMsgSeq = str5;
        }
        if ((i & 1024) == 0) {
            this.serverLastUserMsg = null;
        } else {
            this.serverLastUserMsg = wSSendMessageDetailData;
        }
        if ((i & 2048) == 0) {
            this.pinnedStatus = 0;
        } else {
            this.pinnedStatus = i3;
        }
        if ((i & 4096) == 0) {
            this.isFlagged = 0;
        } else {
            this.isFlagged = i4;
        }
        if ((i & 8192) == 0) {
            this.receiveMsgOption = null;
        } else {
            this.receiveMsgOption = receiveMessageOptionType;
        }
        if ((i & 16384) == 0) {
            this.role = 0;
        } else {
            this.role = i5;
        }
        if ((32768 & i) == 0) {
            this.sendMsgOption = 0;
        } else {
            this.sendMsgOption = i6;
        }
        if ((65536 & i) == 0) {
            this.startMsgSeq = null;
        } else {
            this.startMsgSeq = str6;
        }
        if ((131072 & i) == 0) {
            this.unreadCountUpdateTime = null;
        } else {
            this.unreadCountUpdateTime = str7;
        }
        if ((262144 & i) == 0) {
            this.userUid = null;
        } else {
            this.userUid = str8;
        }
        if ((524288 & i) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = str9;
        }
        if ((1048576 & i) == 0) {
            this.unreadCount = 0;
        } else {
            this.unreadCount = i7;
        }
        if ((i & 2097152) == 0) {
            this.conversationStatus = null;
        } else {
            this.conversationStatus = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMServerConversationResponse inHouseIMServerConversationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMServerConversationResponse.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMServerConversationResponse.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMServerConversationResponse.attachedInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.attachedInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMServerConversationResponse.channelType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], inHouseIMServerConversationResponse.channelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMServerConversationResponse.entityInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, EntityInfo$$serializer.INSTANCE, inHouseIMServerConversationResponse.entityInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMServerConversationResponse.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMServerConversationResponse.groupAtType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, inHouseIMServerConversationResponse.groupAtType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMServerConversationResponse.inGroupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], inHouseIMServerConversationResponse.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMServerConversationResponse.groupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], inHouseIMServerConversationResponse.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMServerConversationResponse.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.lastReadMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMServerConversationResponse.lastReceivedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.lastReceivedMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMServerConversationResponse.serverLastUserMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, WSSendMessageDetailData$$serializer.INSTANCE, inHouseIMServerConversationResponse.serverLastUserMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMServerConversationResponse.pinnedStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, inHouseIMServerConversationResponse.pinnedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMServerConversationResponse.isFlagged != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, inHouseIMServerConversationResponse.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMServerConversationResponse.receiveMsgOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], inHouseIMServerConversationResponse.receiveMsgOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMServerConversationResponse.role != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, inHouseIMServerConversationResponse.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || inHouseIMServerConversationResponse.sendMsgOption != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, inHouseIMServerConversationResponse.sendMsgOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || inHouseIMServerConversationResponse.startMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.startMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || inHouseIMServerConversationResponse.unreadCountUpdateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.unreadCountUpdateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMServerConversationResponse.userUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.userUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMServerConversationResponse.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, inHouseIMServerConversationResponse.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMServerConversationResponse.unreadCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, inHouseIMServerConversationResponse.unreadCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && inHouseIMServerConversationResponse.conversationStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, inHouseIMServerConversationResponse.conversationStatus);
    }

    public InHouseIMServerConversationResponse(@NotNull String str, String str2, InHouseIMChannelType inHouseIMChannelType, EntityInfo entityInfo, String str3, int i, InGroupStatus inGroupStatus, GroupStatus groupStatus, String str4, String str5, WSSendMessageDetailData wSSendMessageDetailData, int i2, int i3, ReceiveMessageOptionType receiveMessageOptionType, int i4, int i5, String str6, String str7, String str8, String str9, int i6, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.attachedInfo = str2;
        this.channelType = inHouseIMChannelType;
        this.entityInfo = entityInfo;
        this.extra = str3;
        this.groupAtType = i;
        this.inGroupStatus = inGroupStatus;
        this.groupStatus = groupStatus;
        this.lastReadMsgSeq = str4;
        this.lastReceivedMsgSeq = str5;
        this.serverLastUserMsg = wSSendMessageDetailData;
        this.pinnedStatus = i2;
        this.isFlagged = i3;
        this.receiveMsgOption = receiveMessageOptionType;
        this.role = i4;
        this.sendMsgOption = i5;
        this.startMsgSeq = str6;
        this.unreadCountUpdateTime = str7;
        this.userUid = str8;
        this.updateTime = str9;
        this.unreadCount = i6;
        this.conversationStatus = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType:?: TERNARY null = ((wrap:int:0x0013: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType) : (r26v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType))
  (wrap:com.okinc.okimcore.model.room.inhouseim.EntityInfo:?: TERNARY null = ((wrap:int:0x001b: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.EntityInfo) : (r27v0 com.okinc.okimcore.model.room.inhouseim.EntityInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002b: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus:?: TERNARY null = ((wrap:int:0x0033: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus) : (r30v0 com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus:?: TERNARY null = ((wrap:int:0x003b: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus) : (r31v0 com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData:?: TERNARY null = ((wrap:int:0x0053: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData) : (r34v0 com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005b: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0063: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType:?: TERNARY null = ((wrap:int:0x006b: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType) : (r37v0 com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0073: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007e: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType, com.okinc.okimcore.model.room.inhouseim.EntityInfo, java.lang.String, int, com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus, com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData, int, int, com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer):void (m)] (LINE:16) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationResponse.<init>(java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType, com.okinc.okimcore.model.room.inhouseim.EntityInfo, java.lang.String, int, com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus, com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData, int, int, com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer):void type: THIS */
    public /* synthetic */ InHouseIMServerConversationResponse(String str, String str2, InHouseIMChannelType inHouseIMChannelType, EntityInfo entityInfo, String str3, int i, InGroupStatus inGroupStatus, GroupStatus groupStatus, String str4, String str5, WSSendMessageDetailData wSSendMessageDetailData, int i2, int i3, ReceiveMessageOptionType receiveMessageOptionType, int i4, int i5, String str6, String str7, String str8, String str9, int i6, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : inHouseIMChannelType, (i7 & 8) != 0 ? null : entityInfo, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? null : inGroupStatus, (i7 & 128) != 0 ? null : groupStatus, (i7 & 256) != 0 ? null : str4, (i7 & 512) != 0 ? null : str5, (i7 & 1024) != 0 ? null : wSSendMessageDetailData, (i7 & 2048) != 0 ? 0 : i2, (i7 & 4096) != 0 ? 0 : i3, (i7 & 8192) != 0 ? null : receiveMessageOptionType, (i7 & 16384) != 0 ? 0 : i4, (i7 & 32768) != 0 ? 0 : i5, (i7 & 65536) != 0 ? null : str6, (i7 & 131072) != 0 ? null : str7, (i7 & 262144) != 0 ? null : str8, (i7 & 524288) != 0 ? null : str9, (i7 & 1048576) != 0 ? 0 : i6, (i7 & 2097152) != 0 ? null : num);
    }
}
