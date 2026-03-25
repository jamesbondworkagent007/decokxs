package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKReactionMessage extends OKMessageContent {

    @SerializedName(RemoteMessageConst.Notification.CHANNEL_ID)
    private String channelId;

    @SerializedName("emojiActions")
    private List<ReactionAction> emojiActions;

    @SerializedName("seq")
    private Long seq;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, new ArrayListSerializer(ReactionAction$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionAction> getEmojiActions() {
        return this.emojiActions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelId(String str) {
        this.channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmojiActions(List<ReactionAction> list) {
        this.emojiActions = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeq(Long l) {
        this.seq = l;
    }

    public /* synthetic */ OKReactionMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, Long l, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str3;
        }
        if ((i & 512) == 0) {
            this.seq = null;
        } else {
            this.seq = l;
        }
        if ((i & 1024) == 0) {
            this.emojiActions = null;
        } else {
            this.emojiActions = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKReactionMessage oKReactionMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKReactionMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKReactionMessage.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKReactionMessage.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKReactionMessage.seq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, oKReactionMessage.seq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && oKReactionMessage.emojiActions == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKReactionMessage.emojiActions);
    }

    public OKReactionMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKReactionMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.channelId = parcel.readString();
        this.seq = Long.valueOf(parcel.readLong());
        this.emojiActions = ReactionAction.CREATOR.createListFromParcel(parcel);
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.channelId);
        Long l = this.seq;
        parcel.writeLong(l != null ? l.longValue() : 0L);
        ReactionAction.CREATOR.writeListToParcel(parcel, this.emojiActions, i);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKReactionMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKReactionMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKReactionMessage> serializer() {
            return OKReactionMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKReactionMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKReactionMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKReactionMessage[] newArray(int i) {
            return new OKReactionMessage[i];
        }

        public final OKReactionMessage obtain(@NotNull String str, long j, @NotNull List<ReactionAction> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            OKReactionMessage oKReactionMessage = new OKReactionMessage();
            oKReactionMessage.setChannelId(str);
            oKReactionMessage.setSeq(Long.valueOf(j));
            oKReactionMessage.setEmojiActions(list);
            return oKReactionMessage;
        }
    }
}
