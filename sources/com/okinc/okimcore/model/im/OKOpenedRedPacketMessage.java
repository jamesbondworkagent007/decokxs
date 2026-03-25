package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.utility.UriSerializer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKOpenedRedPacketMessage extends OKCustomMessage implements sJU<OKOpenedRedPacketMessage> {
    private String giftId;
    private String giftReceiverUid;
    private String giftSenderName;
    private String giftSenderUid;
    private Uri image;
    private Integer state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKOpenedRedPacketMessage> CREATOR = new Parcelable.Creator<OKOpenedRedPacketMessage>() { // from class: com.okinc.okimcore.model.im.OKOpenedRedPacketMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKOpenedRedPacketMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKOpenedRedPacketMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKOpenedRedPacketMessage[] newArray(int i) {
            return new OKOpenedRedPacketMessage[i];
        }
    };

    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getImage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGiftReceiverUid() {
        return this.giftReceiverUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGiftSenderName() {
        return this.giftSenderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGiftSenderUid() {
        return this.giftSenderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getState() {
        return this.state;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isAllowInAppPush() {
        return false;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isSystemMessage() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGiftId(String str) {
        this.giftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGiftReceiverUid(String str) {
        this.giftReceiverUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGiftSenderName(String str) {
        this.giftSenderName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGiftSenderUid(String str) {
        this.giftSenderUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImage(Uri uri) {
        this.image = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(Integer num) {
        this.state = num;
    }

    public /* synthetic */ OKOpenedRedPacketMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, String str12, String str13, Uri uri, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        OKOpenedRedPacketMessage oKOpenedRedPacketMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            oKOpenedRedPacketMessage = this;
            oKOpenedRedPacketMessage.giftId = null;
        } else {
            oKOpenedRedPacketMessage = this;
            oKOpenedRedPacketMessage.giftId = str10;
        }
        if ((i & 131072) == 0) {
            oKOpenedRedPacketMessage.giftReceiverUid = null;
        } else {
            oKOpenedRedPacketMessage.giftReceiverUid = str11;
        }
        if ((i & 262144) == 0) {
            oKOpenedRedPacketMessage.giftSenderUid = null;
        } else {
            oKOpenedRedPacketMessage.giftSenderUid = str12;
        }
        if ((i & 524288) == 0) {
            oKOpenedRedPacketMessage.giftSenderName = null;
        } else {
            oKOpenedRedPacketMessage.giftSenderName = str13;
        }
        if ((i & 1048576) == 0) {
            oKOpenedRedPacketMessage.image = null;
        } else {
            oKOpenedRedPacketMessage.image = uri;
        }
        oKOpenedRedPacketMessage.state = (i & 2097152) != 0 ? num : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKOpenedRedPacketMessage oKOpenedRedPacketMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKOpenedRedPacketMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKOpenedRedPacketMessage.giftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKOpenedRedPacketMessage.giftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKOpenedRedPacketMessage.giftReceiverUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKOpenedRedPacketMessage.giftReceiverUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || oKOpenedRedPacketMessage.giftSenderUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, oKOpenedRedPacketMessage.giftSenderUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || oKOpenedRedPacketMessage.giftSenderName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, oKOpenedRedPacketMessage.giftSenderName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || oKOpenedRedPacketMessage.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, UriSerializer.INSTANCE, oKOpenedRedPacketMessage.image);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && oKOpenedRedPacketMessage.state == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, oKOpenedRedPacketMessage.state);
    }

    public OKOpenedRedPacketMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKOpenedRedPacketMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.giftId = parcel.readString();
        this.giftReceiverUid = parcel.readString();
        this.giftSenderUid = parcel.readString();
        this.giftSenderName = parcel.readString();
        this.image = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int i = parcel.readInt();
        this.state = i == -1 ? null : Integer.valueOf(i);
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.giftId);
        parcel.writeString(this.giftReceiverUid);
        parcel.writeString(this.giftSenderUid);
        parcel.writeString(this.giftSenderName);
        parcel.writeParcelable(this.image, i);
        Integer num = this.state;
        parcel.writeInt(num != null ? num.intValue() : -1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKOpenedRedPacketMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKOpenedRedPacketMessage> serializer() {
            return OKOpenedRedPacketMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKOpenedRedPacketMessage m6885decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKOpenedRedPacketMessage();
    }

    private final String toUtf8ContentString(String str) {
        Object objM7377constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            objM7377constructorimpl = Result.m7377constructorimpl(new String(bytes, charset));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    @Override // o.sJU
    public String encodeToInHouseCustomContent() {
        String utf8ContentString;
        String content = getContent();
        return (content == null || (utf8ContentString = toUtf8ContentString(content)) == null) ? "" : utf8ContentString;
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.sJU
    public OKOpenedRedPacketMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        Uri uri;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        JsonElement jsonElement6;
        String asString;
        Object objM7377constructorimpl2;
        if (str == null || (utf8ContentString = toUtf8ContentString(str)) == null) {
            utf8ContentString = "";
        }
        setContent(utf8ContentString);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(JsonParser.parseString(utf8ContentString).getAsJsonObject());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String asString2 = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        if (jsonObject == null || (jsonElement6 = jsonObject.get(TtmlNode.TAG_IMAGE)) == null || (asString = jsonElement6.getAsString()) == null) {
            uri = null;
        } else {
            try {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(Uri.parse(asString));
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = null;
            }
            uri = (Uri) objM7377constructorimpl2;
        }
        this.image = uri;
        this.state = (jsonObject == null || (jsonElement5 = jsonObject.get("state")) == null) ? null : Integer.valueOf(jsonElement5.getAsInt());
        this.giftId = (jsonObject == null || (jsonElement4 = jsonObject.get("giftId")) == null) ? null : jsonElement4.getAsString();
        this.giftSenderUid = (jsonObject == null || (jsonElement3 = jsonObject.get("giftSenderUid")) == null) ? null : jsonElement3.getAsString();
        this.giftReceiverUid = (jsonObject == null || (jsonElement2 = jsonObject.get("giftReceiverUid")) == null) ? null : jsonElement2.getAsString();
        if (jsonObject != null && (jsonElement = jsonObject.get("giftSenderName")) != null) {
            asString2 = jsonElement.getAsString();
        }
        this.giftSenderName = asString2;
        return this;
    }
}
