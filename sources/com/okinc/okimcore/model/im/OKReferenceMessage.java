package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKReferenceMessage extends OKMediaMessageContent {
    private static final KSerializer<Object>[] $childSerializers;
    private String content;
    private String objName;
    private OKMessageContent originalOKMessageContent;
    private OKMessageContent referMsg;
    private String referMsgUid;
    private String referMsgUserId;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getObjName() {
        return this.objName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent getOriginalOKMessageContent() {
        return this.originalOKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent getReferMsg() {
        return this.referMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferMsgUid() {
        return this.referMsgUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferMsgUserId() {
        return this.referMsgUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObjName(String str) {
        this.objName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalOKMessageContent(OKMessageContent oKMessageContent) {
        this.originalOKMessageContent = oKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferMsg(OKMessageContent oKMessageContent) {
        this.referMsg = oKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferMsgUid(String str) {
        this.referMsgUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferMsgUserId(String str) {
        this.referMsgUserId = str;
    }

    public /* synthetic */ OKReferenceMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, String str4, OKMessageContent oKMessageContent, String str5, String str6, String str7, OKMessageContent oKMessageContent2, SerializationConstructorMarker serializationConstructorMarker) {
        OKReferenceMessage oKReferenceMessage;
        int i2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            oKReferenceMessage = this;
            i2 = i;
            oKReferenceMessage.referMsgUserId = null;
        } else {
            oKReferenceMessage = this;
            i2 = i;
            oKReferenceMessage.referMsgUserId = str4;
        }
        if ((i2 & 4096) == 0) {
            oKReferenceMessage.referMsg = null;
        } else {
            oKReferenceMessage.referMsg = oKMessageContent;
        }
        if ((i2 & 8192) == 0) {
            oKReferenceMessage.content = null;
        } else {
            oKReferenceMessage.content = str5;
        }
        if ((i2 & 16384) == 0) {
            oKReferenceMessage.objName = null;
        } else {
            oKReferenceMessage.objName = str6;
        }
        if ((32768 & i2) == 0) {
            oKReferenceMessage.referMsgUid = null;
        } else {
            oKReferenceMessage.referMsgUid = str7;
        }
        oKReferenceMessage.originalOKMessageContent = (i2 & 65536) != 0 ? oKMessageContent2 : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKReferenceMessage oKReferenceMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKReferenceMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKReferenceMessage.referMsgUserId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKReferenceMessage.referMsgUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKReferenceMessage.referMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], oKReferenceMessage.referMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKReferenceMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, oKReferenceMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKReferenceMessage.objName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, oKReferenceMessage.objName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || oKReferenceMessage.referMsgUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, oKReferenceMessage.referMsgUid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKReferenceMessage.originalOKMessageContent == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], oKReferenceMessage.originalOKMessageContent);
    }

    public OKReferenceMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKReferenceMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.referMsgUserId = parcel.readString();
        this.referMsg = (OKMessageContent) parcel.readParcelable(OKMessageContent.class.getClassLoader());
        this.content = parcel.readString();
        this.objName = parcel.readString();
        this.referMsgUid = parcel.readString();
        this.originalOKMessageContent = (OKMessageContent) parcel.readParcelable(OKMessageContent.class.getClassLoader());
    }

    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.referMsgUserId);
        parcel.writeParcelable(this.referMsg, i);
        parcel.writeString(this.content);
        parcel.writeString(this.objName);
        parcel.writeString(this.referMsgUid);
        parcel.writeParcelable(this.originalOKMessageContent, i);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKReferenceMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKReferenceMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKReferenceMessage> serializer() {
            return OKReferenceMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKReferenceMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKReferenceMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKReferenceMessage[] newArray(int i) {
            return new OKReferenceMessage[i];
        }

        public static /* synthetic */ OKReferenceMessage obtain$default(CREATOR creator, String str, OKMessageContent oKMessageContent, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return creator.obtain(str, oKMessageContent, str2);
        }

        public final OKReferenceMessage obtain(@NotNull String str, OKMessageContent oKMessageContent, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            OKReferenceMessage oKReferenceMessage = new OKReferenceMessage();
            oKReferenceMessage.setReferMsgUserId(str);
            oKReferenceMessage.setReferMsg(oKMessageContent);
            oKReferenceMessage.setReferMsgUid(str2);
            return oKReferenceMessage;
        }

        public final OKReferenceMessage createForReference(@NotNull OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            String senderUserId = oKMessage.getSenderUserId();
            OKReferenceMessage oKReferenceMessageObtain = obtain(senderUserId != null ? senderUserId : "", oKMessage.getContent(), C33129mqd.gEmmrt(Long.valueOf(oKMessage.getSeq())));
            oKReferenceMessageObtain.setOriginalOKMessageContent(oKMessage.getContent());
            return oKReferenceMessageObtain;
        }
    }

    static {
        KSerializer<InHouseIMContentType> kSerializerSerializer = InHouseIMContentType.Companion.serializer();
        OKMessageContent.Companion companion = OKMessageContent.Companion;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, kSerializerSerializer, null, null, null, null, null, companion.serializer(), null, null, null, companion.serializer()};
    }
}
