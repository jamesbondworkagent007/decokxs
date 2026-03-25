package com.okinc.buysell.ui.otcagent.tradecard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.C33489mxS;
import o.C56391yDq;
import o.pUU;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class OtcAgentTradeCardMessageContent extends OKCustomMessage implements sJU<OtcAgentTradeCardMessageContent> {
    private static final String TAG = "OtcAgentTradeCardMessageContent";
    private transient OtcAgentTradeCardMessageData cachedMessageData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OtcAgentTradeCardMessageContent> CREATOR = new Parcelable.Creator<OtcAgentTradeCardMessageContent>() { // from class: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageContent$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OtcAgentTradeCardMessageContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OtcAgentTradeCardMessageContent(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OtcAgentTradeCardMessageContent[] newArray(int i) {
            return new OtcAgentTradeCardMessageContent[i];
        }
    };

    private static /* synthetic */ void getCachedMessageData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OtcAgentTradeCardMessageContent m6652decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlinx.serialization.json.JsonObject */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OtcAgentTradeCardMessageContent(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, String str9, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, SerializationConstructorMarker serializationConstructorMarker) {
        OtcAgentTradeCardMessageContent otcAgentTradeCardMessageContent;
        OtcAgentTradeCardMessageData otcAgentTradeCardMessageData2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, (JsonObject) str8, (String) jsonObject, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            otcAgentTradeCardMessageData2 = null;
            otcAgentTradeCardMessageContent = this;
        } else {
            otcAgentTradeCardMessageContent = this;
            otcAgentTradeCardMessageData2 = otcAgentTradeCardMessageData;
        }
        otcAgentTradeCardMessageContent.cachedMessageData = otcAgentTradeCardMessageData2;
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(OtcAgentTradeCardMessageContent otcAgentTradeCardMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) otcAgentTradeCardMessageContent, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && otcAgentTradeCardMessageContent.cachedMessageData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, OtcAgentTradeCardMessageData$$serializer.INSTANCE, otcAgentTradeCardMessageContent.cachedMessageData);
    }

    public OtcAgentTradeCardMessageContent() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcAgentTradeCardMessageContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        setContent(parcel.readString());
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
    public OtcAgentTradeCardMessageContent decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        JsonElement jsonElement;
        String asString;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        String asString2;
        JsonElement jsonElement5;
        String asString3;
        JsonElement jsonElement6;
        String asString4;
        JsonElement jsonElement7;
        String asString5;
        JsonElement jsonElement8;
        String asString6;
        JsonElement jsonElement9;
        String asString7;
        JsonElement jsonElement10;
        String asString8;
        JsonElement jsonElement11;
        String asString9;
        JsonElement jsonElement12;
        String asString10;
        JsonElement jsonElement13;
        String asString11;
        JsonElement jsonElement14;
        String asString12;
        JsonElement jsonElement15;
        String asString13;
        JsonElement jsonElement16;
        String asString14;
        JsonElement jsonElement17;
        String asString15;
        JsonElement jsonElement18;
        String asString16;
        JsonElement jsonElement19;
        String asString17;
        JsonElement jsonElement20;
        JsonElement jsonElement21;
        if (str == null || (utf8ContentString = toUtf8ContentString(str)) == null) {
            utf8ContentString = "";
        }
        setContent(utf8ContentString);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(JsonParser.parseString(utf8ContentString).getAsJsonObject().get("data").getAsJsonObject());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String asString18 = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        OtcAgentTradeCardType otcAgentTradeCardTypeAEQbTJ = OtcAgentTradeCardType.Companion.AEQbTJ((jsonObject == null || (jsonElement21 = jsonObject.get(OtcExtraKeys.SIDE)) == null) ? null : jsonElement21.getAsString());
        OtcAgentTradeCardStatus.Application application3 = OtcAgentTradeCardStatus.Companion;
        if (jsonObject != null && (jsonElement20 = jsonObject.get("status")) != null) {
            asString18 = jsonElement20.getAsString();
        }
        OtcAgentTradeCardStatus otcAgentTradeCardStatusAEQbTJ = application3.AEQbTJ(asString18);
        String str2 = (jsonObject == null || (jsonElement19 = jsonObject.get("orderId")) == null || (asString17 = jsonElement19.getAsString()) == null) ? "" : asString17;
        String str3 = (jsonObject == null || (jsonElement18 = jsonObject.get("requestId")) == null || (asString16 = jsonElement18.getAsString()) == null) ? "" : asString16;
        String str4 = (jsonObject == null || (jsonElement17 = jsonObject.get("baseCurrency")) == null || (asString15 = jsonElement17.getAsString()) == null) ? "" : asString15;
        String str5 = (jsonObject == null || (jsonElement16 = jsonObject.get("quoteCurrency")) == null || (asString14 = jsonElement16.getAsString()) == null) ? "" : asString14;
        String str6 = (jsonObject == null || (jsonElement15 = jsonObject.get("baseAmount")) == null || (asString13 = jsonElement15.getAsString()) == null) ? "" : asString13;
        String str7 = (jsonObject == null || (jsonElement14 = jsonObject.get("quoteAmount")) == null || (asString12 = jsonElement14.getAsString()) == null) ? "" : asString12;
        String str8 = (jsonObject == null || (jsonElement13 = jsonObject.get("baseCurrencyIcon")) == null || (asString11 = jsonElement13.getAsString()) == null) ? "" : asString11;
        String str9 = (jsonObject == null || (jsonElement12 = jsonObject.get("quoteCurrencyIcon")) == null || (asString10 = jsonElement12.getAsString()) == null) ? "" : asString10;
        String str10 = (jsonObject == null || (jsonElement11 = jsonObject.get("baseCurrencyIconNight")) == null || (asString9 = jsonElement11.getAsString()) == null) ? "" : asString9;
        String str11 = (jsonObject == null || (jsonElement10 = jsonObject.get("quoteCurrencyIconNight")) == null || (asString8 = jsonElement10.getAsString()) == null) ? "" : asString8;
        String str12 = (jsonObject == null || (jsonElement9 = jsonObject.get("quoteToken")) == null || (asString7 = jsonElement9.getAsString()) == null) ? "" : asString7;
        String str13 = (jsonObject == null || (jsonElement8 = jsonObject.get(FirebaseAnalytics.Param.PRICE)) == null || (asString6 = jsonElement8.getAsString()) == null) ? "" : asString6;
        String str14 = (jsonObject == null || (jsonElement7 = jsonObject.get("paymentChannel")) == null || (asString5 = jsonElement7.getAsString()) == null) ? "" : asString5;
        String str15 = (jsonObject == null || (jsonElement6 = jsonObject.get("feeAmount")) == null || (asString4 = jsonElement6.getAsString()) == null) ? "" : asString4;
        String str16 = (jsonObject == null || (jsonElement5 = jsonObject.get("quoteTime")) == null || (asString3 = jsonElement5.getAsString()) == null) ? "" : asString3;
        String str17 = (jsonObject == null || (jsonElement4 = jsonObject.get("quoteExpireMs")) == null || (asString2 = jsonElement4.getAsString()) == null) ? "" : asString2;
        boolean asBoolean = false;
        boolean asBoolean2 = (jsonObject == null || (jsonElement3 = jsonObject.get("isStablecoin")) == null) ? false : jsonElement3.getAsBoolean();
        if (jsonObject != null && (jsonElement2 = jsonObject.get("isPegged")) != null) {
            asBoolean = jsonElement2.getAsBoolean();
        }
        this.cachedMessageData = new OtcAgentTradeCardMessageData(otcAgentTradeCardTypeAEQbTJ, otcAgentTradeCardStatusAEQbTJ, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, asBoolean2, asBoolean, (jsonObject == null || (jsonElement = jsonObject.get("peggedCurrency")) == null || (asString = jsonElement.getAsString()) == null) ? "" : asString);
        return this;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getContent());
    }

    public final OtcAgentTradeCardMessageData getMessageData() {
        if (this.cachedMessageData == null) {
            this.cachedMessageData = parseContent(getContent());
        }
        return this.cachedMessageData;
    }

    private final OtcAgentTradeCardMessageData parseContent(String str) {
        if (str != null && str.length() != 0) {
            try {
                return (OtcAgentTradeCardMessageData) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) OtcAgentTradeCardMessageData.Companion.serializer(), str);
            } catch (Exception e) {
                pUU.AEQbTJ(TAG, "Failed to parse content for OtcAgentTradeCardMessage", e);
            }
        }
        return null;
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

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OtcAgentTradeCardMessageContent> serializer() {
            return OtcAgentTradeCardMessageContent$$serializer.INSTANCE;
        }
    }
}
