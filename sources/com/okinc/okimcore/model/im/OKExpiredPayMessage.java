package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
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
public final class OKExpiredPayMessage extends OKCustomMessage implements sJU<OKExpiredPayMessage> {
    private String paymentId;
    private String paymentSenderId;
    private Integer status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKExpiredPayMessage> CREATOR = new Parcelable.Creator<OKExpiredPayMessage>() { // from class: com.okinc.okimcore.model.im.OKExpiredPayMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKExpiredPayMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKExpiredPayMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKExpiredPayMessage[] newArray(int i) {
            return new OKExpiredPayMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
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
    public final Integer getStatus() {
        return this.status;
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
    public final void setPaymentId(String str) {
        this.paymentId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentSenderId(String str) {
        this.paymentSenderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    public /* synthetic */ OKExpiredPayMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        OKExpiredPayMessage oKExpiredPayMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            oKExpiredPayMessage = this;
            oKExpiredPayMessage.paymentId = null;
        } else {
            oKExpiredPayMessage = this;
            oKExpiredPayMessage.paymentId = str10;
        }
        if ((i & 131072) == 0) {
            oKExpiredPayMessage.paymentSenderId = null;
        } else {
            oKExpiredPayMessage.paymentSenderId = str11;
        }
        oKExpiredPayMessage.status = (i & 262144) != 0 ? num : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKExpiredPayMessage oKExpiredPayMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKExpiredPayMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKExpiredPayMessage.paymentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKExpiredPayMessage.paymentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKExpiredPayMessage.paymentSenderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKExpiredPayMessage.paymentSenderId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && oKExpiredPayMessage.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, oKExpiredPayMessage.status);
    }

    public OKExpiredPayMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKExpiredPayMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.paymentId = parcel.readString();
        this.paymentSenderId = parcel.readString();
        int i = parcel.readInt();
        this.status = i == -1 ? null : Integer.valueOf(i);
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.paymentId);
        parcel.writeString(this.paymentSenderId);
        Integer num = this.status;
        parcel.writeInt(num != null ? num.intValue() : -1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKExpiredPayMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKExpiredPayMessage> serializer() {
            return OKExpiredPayMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKExpiredPayMessage m6874decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKExpiredPayMessage();
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
    public OKExpiredPayMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
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
        this.paymentId = (jsonObject == null || (jsonElement3 = jsonObject.get("paymentId")) == null) ? null : jsonElement3.getAsString();
        this.paymentSenderId = (jsonObject == null || (jsonElement2 = jsonObject.get("paymentSenderId")) == null) ? null : jsonElement2.getAsString();
        if (jsonObject != null && (jsonElement = jsonObject.get("status")) != null) {
            numValueOf = Integer.valueOf(jsonElement.getAsInt());
        }
        this.status = numValueOf;
        return this;
    }
}
