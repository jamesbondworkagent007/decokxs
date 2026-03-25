package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.p2p.api.OtcExtraKeys;
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
public final class OKFailedAcceptPayMessage extends OKCustomMessage implements sJU<OKFailedAcceptPayMessage> {
    private String amount;
    private String chainIndex;
    private String network;
    private String paymentId;
    private String paymentSenderId;
    private String senderMessage;
    private Integer status;
    private String tokenType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKFailedAcceptPayMessage> CREATOR = new Parcelable.Creator<OKFailedAcceptPayMessage>() { // from class: com.okinc.okimcore.model.im.OKFailedAcceptPayMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKFailedAcceptPayMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKFailedAcceptPayMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKFailedAcceptPayMessage[] newArray(int i) {
            return new OKFailedAcceptPayMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentSenderId() {
        return this.paymentSenderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderMessage() {
        return this.senderMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
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
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(String str) {
        this.chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(String str) {
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentId(String str) {
        this.paymentId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentSenderId(String str) {
        this.paymentSenderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderMessage(String str) {
        this.senderMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    public /* synthetic */ OKFailedAcceptPayMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        OKFailedAcceptPayMessage oKFailedAcceptPayMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            oKFailedAcceptPayMessage = this;
            oKFailedAcceptPayMessage.paymentId = null;
        } else {
            oKFailedAcceptPayMessage = this;
            oKFailedAcceptPayMessage.paymentId = str10;
        }
        if ((i & 131072) == 0) {
            oKFailedAcceptPayMessage.paymentSenderId = null;
        } else {
            oKFailedAcceptPayMessage.paymentSenderId = str11;
        }
        if ((i & 262144) == 0) {
            oKFailedAcceptPayMessage.amount = null;
        } else {
            oKFailedAcceptPayMessage.amount = str12;
        }
        if ((i & 524288) == 0) {
            oKFailedAcceptPayMessage.tokenType = null;
        } else {
            oKFailedAcceptPayMessage.tokenType = str13;
        }
        if ((i & 1048576) == 0) {
            oKFailedAcceptPayMessage.network = null;
        } else {
            oKFailedAcceptPayMessage.network = str14;
        }
        if ((i & 2097152) == 0) {
            oKFailedAcceptPayMessage.senderMessage = null;
        } else {
            oKFailedAcceptPayMessage.senderMessage = str15;
        }
        if ((i & 4194304) == 0) {
            oKFailedAcceptPayMessage.chainIndex = null;
        } else {
            oKFailedAcceptPayMessage.chainIndex = str16;
        }
        oKFailedAcceptPayMessage.status = (i & 8388608) != 0 ? num : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKFailedAcceptPayMessage oKFailedAcceptPayMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKFailedAcceptPayMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKFailedAcceptPayMessage.paymentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.paymentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKFailedAcceptPayMessage.paymentSenderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.paymentSenderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || oKFailedAcceptPayMessage.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || oKFailedAcceptPayMessage.tokenType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || oKFailedAcceptPayMessage.network != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || oKFailedAcceptPayMessage.senderMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.senderMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || oKFailedAcceptPayMessage.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, oKFailedAcceptPayMessage.chainIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && oKFailedAcceptPayMessage.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, oKFailedAcceptPayMessage.status);
    }

    public OKFailedAcceptPayMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKFailedAcceptPayMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.paymentId = parcel.readString();
        this.paymentSenderId = parcel.readString();
        this.amount = parcel.readString();
        this.tokenType = parcel.readString();
        this.network = parcel.readString();
        this.senderMessage = parcel.readString();
        this.chainIndex = parcel.readString();
        int i = parcel.readInt();
        this.status = i == -1 ? null : Integer.valueOf(i);
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.paymentId);
        parcel.writeString(this.paymentSenderId);
        parcel.writeString(this.amount);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.network);
        parcel.writeString(this.senderMessage);
        parcel.writeString(this.chainIndex);
        Integer num = this.status;
        parcel.writeInt(num != null ? num.intValue() : -1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKFailedAcceptPayMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKFailedAcceptPayMessage> serializer() {
            return OKFailedAcceptPayMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKFailedAcceptPayMessage m6875decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKFailedAcceptPayMessage();
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
    public OKFailedAcceptPayMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        JsonElement jsonElement6;
        JsonElement jsonElement7;
        JsonElement jsonElement8;
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
        Integer numValueOf = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        this.paymentId = (jsonObject == null || (jsonElement8 = jsonObject.get("paymentId")) == null) ? null : jsonElement8.getAsString();
        this.paymentSenderId = (jsonObject == null || (jsonElement7 = jsonObject.get("paymentSenderId")) == null) ? null : jsonElement7.getAsString();
        this.amount = (jsonObject == null || (jsonElement6 = jsonObject.get(OtcExtraKeys.AMOUNT)) == null) ? null : jsonElement6.getAsString();
        this.tokenType = (jsonObject == null || (jsonElement5 = jsonObject.get("tokenType")) == null) ? null : jsonElement5.getAsString();
        this.network = (jsonObject == null || (jsonElement4 = jsonObject.get("network")) == null) ? null : jsonElement4.getAsString();
        this.senderMessage = (jsonObject == null || (jsonElement3 = jsonObject.get("senderMessage")) == null) ? null : jsonElement3.getAsString();
        this.chainIndex = (jsonObject == null || (jsonElement2 = jsonObject.get("chainIndex")) == null) ? null : jsonElement2.getAsString();
        if (jsonObject != null && (jsonElement = jsonObject.get("status")) != null) {
            numValueOf = Integer.valueOf(jsonElement.getAsInt());
        }
        this.status = numValueOf;
        return this;
    }
}
