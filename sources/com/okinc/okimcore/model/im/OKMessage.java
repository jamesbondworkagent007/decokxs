package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay$$serializer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKMessage implements Parcelable {
    private String clientMessageId;
    private OKMessageContent content;
    private OKConversationType conversationType;
    private Integer error;
    private String extra;
    private boolean isVisible;
    private MessageDirection messageDirection;
    private OKMessagePushConfig messagePushConfig;
    private String messageType;
    private String objectName;
    private List<ReactionDisplay> reactionDisplay;
    private long receivedTime;
    private String senderUserId;
    private SentStatus sentStatus;
    private long sentTime;
    private long seq;
    private String sourceJsonString;
    private String targetId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKMessage> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, OKConversationType.Companion.serializer(), null, null, null, null, MessageDirection.Companion.serializer(), SentStatus.Companion.serializer(), OKMessageContent.Companion.serializer(), null, null, null, null, new ArrayListSerializer(ReactionDisplay$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<OKMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKMessage createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            OKConversationType oKConversationTypeCreateFromParcel = OKConversationType.CREATOR.createFromParcel(parcel);
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            MessageDirection messageDirectionCreateFromParcel = MessageDirection.CREATOR.createFromParcel(parcel);
            SentStatus sentStatusCreateFromParcel = parcel.readInt() == 0 ? null : SentStatus.CREATOR.createFromParcel(parcel);
            OKMessageContent oKMessageContent = (OKMessageContent) parcel.readParcelable(OKMessage.class.getClassLoader());
            OKMessagePushConfig oKMessagePushConfigCreateFromParcel = parcel.readInt() == 0 ? null : OKMessagePushConfig.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                z = z2;
                arrayList = null;
                str = string6;
            } else {
                int i = parcel.readInt();
                z = z2;
                arrayList = new ArrayList(i);
                str = string6;
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(ReactionDisplay.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
            }
            return new OKMessage(j, string, string2, string3, string4, oKConversationTypeCreateFromParcel, j2, j3, string5, str, messageDirectionCreateFromParcel, sentStatusCreateFromParcel, oKMessageContent, oKMessagePushConfigCreateFromParcel, string7, z, numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKMessage[] newArray(int i) {
            return new OKMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.objectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageDirection component11() {
        return this.messageDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SentStatus component12() {
        return this.sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent component13() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessagePushConfig component14() {
        return this.messagePushConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.sourceJsonString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDisplay> component18() {
        return this.reactionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.clientMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.senderUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.messageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType component6() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.sentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.receivedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage copy(long j, String str, @NotNull String str2, String str3, String str4, @NotNull OKConversationType oKConversationType, long j2, long j3, @NotNull String str5, @NotNull String str6, @NotNull MessageDirection messageDirection, SentStatus sentStatus, OKMessageContent oKMessageContent, OKMessagePushConfig oKMessagePushConfig, String str7, boolean z, Integer num, List<ReactionDisplay> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(messageDirection, "");
        return new OKMessage(j, str, str2, str3, str4, oKConversationType, j2, j3, str5, str6, messageDirection, sentStatus, oKMessageContent, oKMessagePushConfig, str7, z, num, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientMessageId() {
        return this.clientMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType getConversationType() {
        return this.conversationType;
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
    public final MessageDirection getMessageDirection() {
        return this.messageDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessagePushConfig getMessagePushConfig() {
        return this.messagePushConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getObjectName() {
        return this.objectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDisplay> getReactionDisplay() {
        return this.reactionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReceivedTime() {
        return this.receivedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderUserId() {
        return this.senderUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SentStatus getSentStatus() {
        return this.sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSentTime() {
        return this.sentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceJsonString() {
        return this.sourceJsonString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVisible() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientMessageId(String str) {
        this.clientMessageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(OKMessageContent oKMessageContent) {
        this.content = oKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConversationType(@NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        this.conversationType = oKConversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(Integer num) {
        this.error = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtra(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extra = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessageDirection(@NotNull MessageDirection messageDirection) {
        Intrinsics.checkNotNullParameter(messageDirection, "");
        this.messageDirection = messageDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessagePushConfig(OKMessagePushConfig oKMessagePushConfig) {
        this.messagePushConfig = oKMessagePushConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessageType(String str) {
        this.messageType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObjectName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.objectName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReactionDisplay(List<ReactionDisplay> list) {
        this.reactionDisplay = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceivedTime(long j) {
        this.receivedTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderUserId(String str) {
        this.senderUserId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSentStatus(SentStatus sentStatus) {
        this.sentStatus = sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSentTime(long j) {
        this.sentTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeq(long j) {
        this.seq = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceJsonString(String str) {
        this.sourceJsonString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKMessage(seq=" + this.seq + ", clientMessageId=" + this.clientMessageId + ", targetId=" + this.targetId + ", senderUserId=" + this.senderUserId + ", messageType=" + this.messageType + ", conversationType=" + this.conversationType + ", sentTime=" + this.sentTime + ", receivedTime=" + this.receivedTime + ", extra=" + this.extra + ", objectName=" + this.objectName + ", messageDirection=" + this.messageDirection + ", sentStatus=" + this.sentStatus + ", content=" + this.content + ", messagePushConfig=" + this.messagePushConfig + ", sourceJsonString=" + this.sourceJsonString + ", isVisible=" + this.isVisible + ", error=" + this.error + ", reactionDisplay=" + this.reactionDisplay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.seq);
        parcel.writeString(this.clientMessageId);
        parcel.writeString(this.targetId);
        parcel.writeString(this.senderUserId);
        parcel.writeString(this.messageType);
        this.conversationType.writeToParcel(parcel, i);
        parcel.writeLong(this.sentTime);
        parcel.writeLong(this.receivedTime);
        parcel.writeString(this.extra);
        parcel.writeString(this.objectName);
        this.messageDirection.writeToParcel(parcel, i);
        SentStatus sentStatus = this.sentStatus;
        if (sentStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sentStatus.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.content, i);
        OKMessagePushConfig oKMessagePushConfig = this.messagePushConfig;
        if (oKMessagePushConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKMessagePushConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sourceJsonString);
        parcel.writeInt(this.isVisible ? 1 : 0);
        Integer num = this.error;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ReactionDisplay> list = this.reactionDisplay;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ReactionDisplay> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ OKMessage(int i, long j, String str, String str2, String str3, String str4, OKConversationType oKConversationType, long j2, long j3, String str5, String str6, MessageDirection messageDirection, SentStatus sentStatus, OKMessageContent oKMessageContent, OKMessagePushConfig oKMessagePushConfig, String str7, boolean z, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (38 != (i & 38)) {
            PluginExceptionsKt.throwMissingFieldException(i, 38, OKMessage$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.seq = 0L;
        } else {
            this.seq = j;
        }
        this.clientMessageId = str;
        this.targetId = str2;
        if ((i & 8) == 0) {
            this.senderUserId = "";
        } else {
            this.senderUserId = str3;
        }
        if ((i & 16) == 0) {
            this.messageType = "";
        } else {
            this.messageType = str4;
        }
        this.conversationType = oKConversationType;
        if ((i & 64) == 0) {
            this.sentTime = 0L;
        } else {
            this.sentTime = j2;
        }
        if ((i & 128) == 0) {
            this.receivedTime = 0L;
        } else {
            this.receivedTime = j3;
        }
        if ((i & 256) == 0) {
            this.extra = "";
        } else {
            this.extra = str5;
        }
        if ((i & 512) == 0) {
            this.objectName = "";
        } else {
            this.objectName = str6;
        }
        this.messageDirection = (i & 1024) == 0 ? MessageDirection.SEND : messageDirection;
        if ((i & 2048) == 0) {
            this.sentStatus = null;
        } else {
            this.sentStatus = sentStatus;
        }
        if ((i & 4096) == 0) {
            this.content = null;
        } else {
            this.content = oKMessageContent;
        }
        if ((i & 8192) == 0) {
            this.messagePushConfig = null;
        } else {
            this.messagePushConfig = oKMessagePushConfig;
        }
        if ((i & 16384) == 0) {
            this.sourceJsonString = null;
        } else {
            this.sourceJsonString = str7;
        }
        this.isVisible = (32768 & i) == 0 ? true : z;
        if ((65536 & i) == 0) {
            this.error = null;
        } else {
            this.error = num;
        }
        if ((i & 131072) == 0) {
            this.reactionDisplay = null;
        } else {
            this.reactionDisplay = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKMessage oKMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKMessage.seq != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, oKMessage.seq);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, oKMessage.clientMessageId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oKMessage.targetId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) oKMessage.senderUserId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, oKMessage.senderUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) oKMessage.messageType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, oKMessage.messageType);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], oKMessage.conversationType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || oKMessage.sentTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, oKMessage.sentTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || oKMessage.receivedTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, oKMessage.receivedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) oKMessage.extra, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, oKMessage.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) oKMessage.objectName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, oKMessage.objectName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKMessage.messageDirection != MessageDirection.SEND) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKMessage.messageDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKMessage.sentStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], oKMessage.sentStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], oKMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKMessage.messagePushConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, OKMessagePushConfig$$serializer.INSTANCE, oKMessage.messagePushConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKMessage.sourceJsonString != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, oKMessage.sourceJsonString);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !oKMessage.isVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, oKMessage.isVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKMessage.error != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, oKMessage.error);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && oKMessage.reactionDisplay == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], oKMessage.reactionDisplay);
    }

    public OKMessage(long j, String str, @NotNull String str2, String str3, String str4, @NotNull OKConversationType oKConversationType, long j2, long j3, @NotNull String str5, @NotNull String str6, @NotNull MessageDirection messageDirection, SentStatus sentStatus, OKMessageContent oKMessageContent, OKMessagePushConfig oKMessagePushConfig, String str7, boolean z, Integer num, List<ReactionDisplay> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(messageDirection, "");
        this.seq = j;
        this.clientMessageId = str;
        this.targetId = str2;
        this.senderUserId = str3;
        this.messageType = str4;
        this.conversationType = oKConversationType;
        this.sentTime = j2;
        this.receivedTime = j3;
        this.extra = str5;
        this.objectName = str6;
        this.messageDirection = messageDirection;
        this.sentStatus = sentStatus;
        this.content = oKMessageContent;
        this.messagePushConfig = oKMessagePushConfig;
        this.sourceJsonString = str7;
        this.isVisible = z;
        this.error = num;
        this.reactionDisplay = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0098: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (r33v0 com.okinc.okimcore.model.im.OKConversationType)
  (wrap:long:?: TERNARY null = ((wrap:int:0x001e: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r34v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r36v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.OKMessage$MessageDirection:?: TERNARY null = ((wrap:int:0x0040: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0046: SGET  A[WRAPPED] (LINE:31) com.okinc.okimcore.model.im.OKMessage.MessageDirection.SEND com.okinc.okimcore.model.im.OKMessage$MessageDirection) : (r40v0 com.okinc.okimcore.model.im.OKMessage$MessageDirection))
  (wrap:com.okinc.okimcore.model.im.OKMessage$SentStatus:?: TERNARY null = ((wrap:int:0x004b: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessage$SentStatus) : (r41v0 com.okinc.okimcore.model.im.OKMessage$SentStatus))
  (wrap:com.okinc.okimcore.model.im.OKMessageContent:?: TERNARY null = ((wrap:int:0x0055: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessageContent) : (r42v0 com.okinc.okimcore.model.im.OKMessageContent))
  (wrap:com.okinc.okimcore.model.im.OKMessagePushConfig:?: TERNARY null = ((wrap:int:0x005e: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessagePushConfig) : (r43v0 com.okinc.okimcore.model.im.OKMessagePushConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0073: ARITH (32768 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? true : (r45v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007e: ARITH (65536 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0088: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r47v0 java.util.List))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKConversationType, long, long, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKMessage$MessageDirection, com.okinc.okimcore.model.im.OKMessage$SentStatus, com.okinc.okimcore.model.im.OKMessageContent, com.okinc.okimcore.model.im.OKMessagePushConfig, java.lang.String, boolean, java.lang.Integer, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay>):void (m)] (LINE:20) call: com.okinc.okimcore.model.im.OKMessage.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKConversationType, long, long, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKMessage$MessageDirection, com.okinc.okimcore.model.im.OKMessage$SentStatus, com.okinc.okimcore.model.im.OKMessageContent, com.okinc.okimcore.model.im.OKMessagePushConfig, java.lang.String, boolean, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ OKMessage(long j, String str, String str2, String str3, String str4, OKConversationType oKConversationType, long j2, long j3, String str5, String str6, MessageDirection messageDirection, SentStatus sentStatus, OKMessageContent oKMessageContent, OKMessagePushConfig oKMessagePushConfig, String str7, boolean z, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, oKConversationType, (i & 64) != 0 ? 0L : j2, (i & 128) != 0 ? 0L : j3, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? MessageDirection.SEND : messageDirection, (i & 2048) != 0 ? null : sentStatus, (i & 4096) != 0 ? null : oKMessageContent, (i & 8192) != 0 ? null : oKMessagePushConfig, (i & 16384) != 0 ? null : str7, (32768 & i) != 0 ? true : z, (65536 & i) != 0 ? null : num, (i & 131072) != 0 ? null : list);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKMessage> serializer() {
            return OKMessage$$serializer.INSTANCE;
        }

        public final OKMessage AEQbTJ(@NotNull String str, @NotNull OKConversationType oKConversationType, OKMessageContent oKMessageContent) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            return new OKMessage(0L, String.valueOf(System.currentTimeMillis()), str, (String) null, (String) null, oKConversationType, 0L, 0L, (String) null, (String) null, (MessageDirection) null, (SentStatus) null, oKMessageContent, (OKMessagePushConfig) null, (String) null, false, (Integer) null, (List) null, 258009, (DefaultConstructorMarker) null);
        }

        public final OKMessage OLrzqt(@NotNull String str, @NotNull OKConversationType oKConversationType, OKMessageContent oKMessageContent) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            return new OKMessage(0L, String.valueOf(System.currentTimeMillis()), str, (String) null, (String) null, oKConversationType, 0L, 0L, (String) null, (String) null, (MessageDirection) null, (SentStatus) null, oKMessageContent, (OKMessagePushConfig) null, (String) null, false, (Integer) null, (List) null, 258009, (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class MessageDirection implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MessageDirection[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<MessageDirection> CREATOR;
        public static final Companion Companion;
        private final int value;

        @SerialName("1")
        public static final MessageDirection SEND = new MessageDirection("SEND", 0, 1);

        @SerialName("2")
        public static final MessageDirection RECEIVE = new MessageDirection("RECEIVE", 1, 2);

        public static final class Creator implements Parcelable.Creator<MessageDirection> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageDirection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return MessageDirection.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageDirection[] newArray(int i) {
                return new MessageDirection[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MessageDirection[] $values() {
            return new MessageDirection[]{SEND, RECEIVE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MessageDirection> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private MessageDirection(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            MessageDirection[] messageDirectionArr$values = $values();
            $VALUES = messageDirectionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(messageDirectionArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKMessage.MessageDirection._init_$_anonymous_();
                }
            });
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMessage.MessageDirection.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ KSerializer copydefault() {
                return (KSerializer) MessageDirection.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<MessageDirection> serializer() {
                return copydefault();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.im.OKMessage.MessageDirection", values(), new String[]{"1", "2"}, new Annotation[][]{null, null}, null);
        }

        public static MessageDirection valueOf(String str) {
            return (MessageDirection) Enum.valueOf(MessageDirection.class, str);
        }

        public static MessageDirection[] values() {
            return (MessageDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class SentStatus implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SentStatus[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<SentStatus> CREATOR;
        public static final Companion Companion;
        private final int value;

        @SerialName("10")
        public static final SentStatus SENDING = new SentStatus("SENDING", 0, 10);

        @SerialName("20")
        public static final SentStatus FAILED = new SentStatus(CardSyncResponse.FAILED, 1, 20);

        @SerialName("30")
        public static final SentStatus SENT = new SentStatus("SENT", 2, 30);

        @SerialName("40")
        public static final SentStatus RECEIVED = new SentStatus("RECEIVED", 3, 40);

        @SerialName("50")
        public static final SentStatus READ = new SentStatus("READ", 4, 50);

        @SerialName("60")
        public static final SentStatus DESTROYED = new SentStatus("DESTROYED", 5, 60);

        @SerialName("70")
        public static final SentStatus CANCELED = new SentStatus("CANCELED", 6, 70);

        public static final class Creator implements Parcelable.Creator<SentStatus> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SentStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return SentStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SentStatus[] newArray(int i) {
                return new SentStatus[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SentStatus[] $values() {
            return new SentStatus[]{SENDING, FAILED, SENT, RECEIVED, READ, DESTROYED, CANCELED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SentStatus> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private SentStatus(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            SentStatus[] sentStatusArr$values = $values();
            $VALUES = sentStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sentStatusArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKMessage.SentStatus._init_$_anonymous_();
                }
            });
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMessage.SentStatus.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ KSerializer copydefault() {
                return (KSerializer) SentStatus.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<SentStatus> serializer() {
                return copydefault();
            }

            public final SentStatus KWHzl(int i) {
                for (SentStatus sentStatus : SentStatus.values()) {
                    if (sentStatus.getValue() == i) {
                        return sentStatus;
                    }
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.im.OKMessage.SentStatus", values(), new String[]{"10", "20", "30", "40", "50", "60", "70"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
        }

        public static SentStatus valueOf(String str) {
            return (SentStatus) Enum.valueOf(SentStatus.class, str);
        }

        public static SentStatus[] values() {
            return (SentStatus[]) $VALUES.clone();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(OKMessage.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        OKMessage oKMessage = (OKMessage) obj;
        if (this.seq == oKMessage.seq && Intrinsics.EZpvd((Object) this.clientMessageId, (Object) oKMessage.clientMessageId) && Intrinsics.EZpvd((Object) this.targetId, (Object) oKMessage.targetId) && Intrinsics.EZpvd((Object) this.senderUserId, (Object) oKMessage.senderUserId) && Intrinsics.EZpvd((Object) this.messageType, (Object) oKMessage.messageType) && this.conversationType == oKMessage.conversationType && this.sentTime == oKMessage.sentTime && this.receivedTime == oKMessage.receivedTime && Intrinsics.EZpvd((Object) this.extra, (Object) oKMessage.extra) && Intrinsics.EZpvd((Object) this.objectName, (Object) oKMessage.objectName) && this.messageDirection == oKMessage.messageDirection && this.sentStatus == oKMessage.sentStatus && this.content == oKMessage.content && Intrinsics.EZpvd(this.messagePushConfig, oKMessage.messagePushConfig) && Intrinsics.EZpvd((Object) this.sourceJsonString, (Object) oKMessage.sourceJsonString) && this.isVisible == oKMessage.isVisible && Intrinsics.EZpvd(this.reactionDisplay, oKMessage.reactionDisplay)) {
            return Intrinsics.EZpvd(this.error, oKMessage.error);
        }
        return false;
    }

    public int hashCode() {
        int iAhwBna = C33129mqd.AhwBna(Long.valueOf(this.seq));
        String str = this.clientMessageId;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = this.targetId.hashCode();
        String str2 = this.senderUserId;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.messageType;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        int iHashCode5 = this.conversationType.hashCode();
        int iHashCode6 = Long.hashCode(this.sentTime);
        int iHashCode7 = Long.hashCode(this.receivedTime);
        int iHashCode8 = this.extra.hashCode();
        int iHashCode9 = this.objectName.hashCode();
        int iHashCode10 = this.messageDirection.hashCode();
        SentStatus sentStatus = this.sentStatus;
        int iHashCode11 = sentStatus != null ? sentStatus.hashCode() : 0;
        OKMessageContent oKMessageContent = this.content;
        int iHashCode12 = oKMessageContent != null ? oKMessageContent.hashCode() : 0;
        OKMessagePushConfig oKMessagePushConfig = this.messagePushConfig;
        int iHashCode13 = oKMessagePushConfig != null ? oKMessagePushConfig.hashCode() : 0;
        String str4 = this.sourceJsonString;
        int iHashCode14 = str4 != null ? str4.hashCode() : 0;
        int iHashCode15 = Boolean.hashCode(this.isVisible);
        Integer num = this.error;
        int iIntValue = num != null ? num.intValue() : 0;
        List<ReactionDisplay> list = this.reactionDisplay;
        return (((((((((((((((((((((((((((((((((iAhwBna * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iIntValue) * 31) + (list != null ? list.hashCode() : 0);
    }
}
