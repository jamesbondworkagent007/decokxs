package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
public class BaseOKPayMessage extends OKCustomMessage implements sJU<BaseOKPayMessage> {
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_ACCEPTED = "OneToOnePaymentAccepted";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_ACCEPT_PROCESSING = "OneToOnePaymentAcceptProcessing";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_CANCELLED = "OneToOnePaymentCancelled";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_CANCEL_FAILED = "OneToOnePaymentCancelFailed";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_DECLINED = "OneToOnePaymentDeclined";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_EXPIRED = "OneToOnePaymentExpired";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_FAILED = "OneToOnePaymentFailed";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_FAILED_TO_ACCEPT = "OneToOnePaymentFailedToAccept";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_PROCESSING = "OneToOnePaymentProcessing";
    public static final String BIZ_NAME_ONE_TO_ONE_PAYMENT_SENT = "OneToOnePaymentSent";
    public static final int STATE_ACCEPTED = 202;
    public static final int STATE_ACCEPT_PROCESSING = 200;
    public static final int STATE_CANCELED = 105;
    public static final int STATE_DECLINED = 203;
    public static final int STATE_EXPIRED = 103;
    public static final int STATE_FAILED_TO_ACCEPT = 201;
    public static final int STATE_FAILED_TO_CANCEL = 104;
    public static final int STATE_FAILED_TO_SEND = 102;
    public static final int STATE_PROCESSING = 100;
    public static final int STATE_SEND_SUCCESS = 101;
    private String amount;
    private String chainIndex;
    private String network;
    private String paymentId;
    private String paymentSenderId;
    private String senderMessage;
    private Integer status;
    private Integer tokenDecimal;
    private String tokenType;
    private String usdValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<BaseOKPayMessage> CREATOR = new Parcelable.Creator<BaseOKPayMessage>() { // from class: com.okinc.okimcore.model.im.BaseOKPayMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseOKPayMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BaseOKPayMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseOKPayMessage[] newArray(int i) {
            return new BaseOKPayMessage[i];
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
    public final Integer getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValue() {
        return this.usdValue;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isAllowInAppPush() {
        return false;
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
    public final void setTokenDecimal(Integer num) {
        this.tokenDecimal = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdValue(String str) {
        this.usdValue = str;
    }

    public /* synthetic */ BaseOKPayMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        BaseOKPayMessage baseOKPayMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            baseOKPayMessage = this;
            baseOKPayMessage.paymentId = null;
        } else {
            baseOKPayMessage = this;
            baseOKPayMessage.paymentId = str10;
        }
        if ((i & 131072) == 0) {
            baseOKPayMessage.paymentSenderId = null;
        } else {
            baseOKPayMessage.paymentSenderId = str11;
        }
        if ((i & 262144) == 0) {
            baseOKPayMessage.network = null;
        } else {
            baseOKPayMessage.network = str12;
        }
        if ((i & 524288) == 0) {
            baseOKPayMessage.tokenType = null;
        } else {
            baseOKPayMessage.tokenType = str13;
        }
        if ((i & 1048576) == 0) {
            baseOKPayMessage.usdValue = null;
        } else {
            baseOKPayMessage.usdValue = str14;
        }
        if ((i & 2097152) == 0) {
            baseOKPayMessage.amount = null;
        } else {
            baseOKPayMessage.amount = str15;
        }
        if ((i & 4194304) == 0) {
            baseOKPayMessage.senderMessage = null;
        } else {
            baseOKPayMessage.senderMessage = str16;
        }
        if ((i & 8388608) == 0) {
            baseOKPayMessage.chainIndex = null;
        } else {
            baseOKPayMessage.chainIndex = str17;
        }
        if ((i & 16777216) == 0) {
            baseOKPayMessage.status = null;
        } else {
            baseOKPayMessage.status = num;
        }
        baseOKPayMessage.tokenDecimal = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? num2 : null;
    }

    public static final /* synthetic */ void write$Self(BaseOKPayMessage baseOKPayMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) baseOKPayMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || baseOKPayMessage.paymentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, baseOKPayMessage.paymentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || baseOKPayMessage.paymentSenderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, baseOKPayMessage.paymentSenderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || baseOKPayMessage.network != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, baseOKPayMessage.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || baseOKPayMessage.tokenType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, baseOKPayMessage.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || baseOKPayMessage.usdValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, baseOKPayMessage.usdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || baseOKPayMessage.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, baseOKPayMessage.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || baseOKPayMessage.senderMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, baseOKPayMessage.senderMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || baseOKPayMessage.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, baseOKPayMessage.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || baseOKPayMessage.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, IntSerializer.INSTANCE, baseOKPayMessage.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && baseOKPayMessage.tokenDecimal == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, baseOKPayMessage.tokenDecimal);
    }

    public BaseOKPayMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOKPayMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.paymentId = parcel.readString();
        this.paymentSenderId = parcel.readString();
        this.network = parcel.readString();
        this.tokenType = parcel.readString();
        this.usdValue = parcel.readString();
        this.amount = parcel.readString();
        this.senderMessage = parcel.readString();
        this.chainIndex = parcel.readString();
        int i = parcel.readInt();
        this.status = i == -1 ? null : Integer.valueOf(i);
        int i2 = parcel.readInt();
        this.tokenDecimal = i2 != -1 ? Integer.valueOf(i2) : null;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.paymentId);
        parcel.writeString(this.paymentSenderId);
        parcel.writeString(this.network);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.usdValue);
        parcel.writeString(this.amount);
        parcel.writeString(this.senderMessage);
        parcel.writeString(this.chainIndex);
        Integer num = this.status;
        parcel.writeInt(num != null ? num.intValue() : -1);
        Integer num2 = this.tokenDecimal;
        parcel.writeInt(num2 != null ? num2.intValue() : -1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.BaseOKPayMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BaseOKPayMessage> serializer() {
            return BaseOKPayMessage$$serializer.INSTANCE;
        }

        public final BaseOKPayMessage EZpvd(@NotNull OKCanceledPayMessage oKCanceledPayMessage) {
            Intrinsics.checkNotNullParameter(oKCanceledPayMessage, "");
            BaseOKPayMessage baseOKPayMessage = new BaseOKPayMessage();
            baseOKPayMessage.setPaymentId(oKCanceledPayMessage.getPaymentId());
            baseOKPayMessage.setNetwork(oKCanceledPayMessage.getNetwork());
            baseOKPayMessage.setTokenType(oKCanceledPayMessage.getTokenType());
            baseOKPayMessage.setAmount(oKCanceledPayMessage.getAmount());
            baseOKPayMessage.setStatus(oKCanceledPayMessage.getStatus());
            baseOKPayMessage.setPaymentSenderId(oKCanceledPayMessage.getPaymentSenderId());
            return baseOKPayMessage;
        }

        public final BaseOKPayMessage KWHzl(@NotNull OKFailedAcceptPayMessage oKFailedAcceptPayMessage) {
            Intrinsics.checkNotNullParameter(oKFailedAcceptPayMessage, "");
            OKPayMessage oKPayMessage = new OKPayMessage();
            oKPayMessage.setPaymentId(oKFailedAcceptPayMessage.getPaymentId());
            oKPayMessage.setNetwork(oKFailedAcceptPayMessage.getNetwork());
            oKPayMessage.setTokenType(oKFailedAcceptPayMessage.getTokenType());
            oKPayMessage.setAmount(oKFailedAcceptPayMessage.getAmount());
            oKPayMessage.setStatus(oKFailedAcceptPayMessage.getStatus());
            oKPayMessage.setPaymentSenderId(oKFailedAcceptPayMessage.getPaymentSenderId());
            return oKPayMessage;
        }

        public final BaseOKPayMessage OLrzqt(@NotNull OKExpiredPayMessage oKExpiredPayMessage) {
            Intrinsics.checkNotNullParameter(oKExpiredPayMessage, "");
            OKPayMessage oKPayMessage = new OKPayMessage();
            oKPayMessage.setPaymentId(oKExpiredPayMessage.getPaymentId());
            oKPayMessage.setStatus(oKExpiredPayMessage.getStatus());
            oKPayMessage.setPaymentSenderId(oKExpiredPayMessage.getPaymentSenderId());
            return oKPayMessage;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public BaseOKPayMessage m6869decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BaseOKPayMessage();
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
    public BaseOKPayMessage decodeFromInHouseCustomContent(String str) {
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
        JsonElement jsonElement9;
        JsonElement jsonElement10;
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
        this.amount = (jsonObject == null || (jsonElement10 = jsonObject.get(OtcExtraKeys.AMOUNT)) == null) ? null : jsonElement10.getAsString();
        this.tokenType = (jsonObject == null || (jsonElement9 = jsonObject.get("tokenType")) == null) ? null : jsonElement9.getAsString();
        this.usdValue = (jsonObject == null || (jsonElement8 = jsonObject.get("usdValue")) == null) ? null : jsonElement8.getAsString();
        this.paymentId = (jsonObject == null || (jsonElement7 = jsonObject.get("paymentId")) == null) ? null : jsonElement7.getAsString();
        this.paymentSenderId = (jsonObject == null || (jsonElement6 = jsonObject.get("paymentSenderId")) == null) ? null : jsonElement6.getAsString();
        this.network = (jsonObject == null || (jsonElement5 = jsonObject.get("network")) == null) ? null : jsonElement5.getAsString();
        this.senderMessage = (jsonObject == null || (jsonElement4 = jsonObject.get("senderMessage")) == null) ? null : jsonElement4.getAsString();
        this.chainIndex = (jsonObject == null || (jsonElement3 = jsonObject.get("chainIndex")) == null) ? null : jsonElement3.getAsString();
        this.status = (jsonObject == null || (jsonElement2 = jsonObject.get("status")) == null) ? null : Integer.valueOf(jsonElement2.getAsInt());
        if (jsonObject != null && (jsonElement = jsonObject.get("tokenDecimal")) != null) {
            numValueOf = Integer.valueOf(jsonElement.getAsInt());
        }
        this.tokenDecimal = numValueOf;
        Integer num = this.status;
        if (num != null && num.intValue() == 105) {
            OKCanceledPayMessage oKCanceledPayMessage = new OKCanceledPayMessage();
            oKCanceledPayMessage.setContent(getContent());
            oKCanceledPayMessage.setAmount(this.amount);
            oKCanceledPayMessage.setTokenType(this.tokenType);
            oKCanceledPayMessage.setUsdValue(this.usdValue);
            oKCanceledPayMessage.setPaymentId(this.paymentId);
            oKCanceledPayMessage.setPaymentSenderId(this.paymentSenderId);
            oKCanceledPayMessage.setNetwork(this.network);
            oKCanceledPayMessage.setSenderMessage(this.senderMessage);
            oKCanceledPayMessage.setChainIndex(this.chainIndex);
            oKCanceledPayMessage.setStatus(this.status);
            oKCanceledPayMessage.setTokenDecimal(this.tokenDecimal);
            return oKCanceledPayMessage;
        }
        OKPayMessage oKPayMessage = new OKPayMessage();
        oKPayMessage.setContent(getContent());
        oKPayMessage.setAmount(this.amount);
        oKPayMessage.setTokenType(this.tokenType);
        oKPayMessage.setUsdValue(this.usdValue);
        oKPayMessage.setPaymentId(this.paymentId);
        oKPayMessage.setPaymentSenderId(this.paymentSenderId);
        oKPayMessage.setNetwork(this.network);
        oKPayMessage.setSenderMessage(this.senderMessage);
        oKPayMessage.setChainIndex(this.chainIndex);
        oKPayMessage.setStatus(this.status);
        oKPayMessage.setTokenDecimal(this.tokenDecimal);
        return oKPayMessage;
    }
}
