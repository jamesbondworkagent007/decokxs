package com.okinc.buysell.ui.otcagent.depositcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType;
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
public final class OtcAgentDepositCardMessageContent extends OKCustomMessage implements sJU<OtcAgentDepositCardMessageContent> {
    private static final String TAG = "OtcAgentDepositCardMessageContent";
    private transient OtcAgentDepositCardMessageData cachedMessageData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OtcAgentDepositCardMessageContent> CREATOR = new Parcelable.Creator<OtcAgentDepositCardMessageContent>() { // from class: com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageContent$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OtcAgentDepositCardMessageContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OtcAgentDepositCardMessageContent(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OtcAgentDepositCardMessageContent[] newArray(int i) {
            return new OtcAgentDepositCardMessageContent[i];
        }
    };

    private static /* synthetic */ void getCachedMessageData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OtcAgentDepositCardMessageContent m6650decodeFromRcJson(@NotNull String str) {
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
    public /* synthetic */ OtcAgentDepositCardMessageContent(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, String str9, OtcAgentDepositCardMessageData otcAgentDepositCardMessageData, SerializationConstructorMarker serializationConstructorMarker) {
        OtcAgentDepositCardMessageContent otcAgentDepositCardMessageContent;
        OtcAgentDepositCardMessageData otcAgentDepositCardMessageData2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, (JsonObject) str8, (String) jsonObject, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            otcAgentDepositCardMessageData2 = null;
            otcAgentDepositCardMessageContent = this;
        } else {
            otcAgentDepositCardMessageContent = this;
            otcAgentDepositCardMessageData2 = otcAgentDepositCardMessageData;
        }
        otcAgentDepositCardMessageContent.cachedMessageData = otcAgentDepositCardMessageData2;
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(OtcAgentDepositCardMessageContent otcAgentDepositCardMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) otcAgentDepositCardMessageContent, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && otcAgentDepositCardMessageContent.cachedMessageData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, OtcAgentDepositCardMessageData$$serializer.INSTANCE, otcAgentDepositCardMessageContent.cachedMessageData);
    }

    public OtcAgentDepositCardMessageContent() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcAgentDepositCardMessageContent(@NotNull Parcel parcel) {
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
    public OtcAgentDepositCardMessageContent decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        String asString;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        String asString2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        String str2 = "";
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
        String asString3 = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        OtcAgentDepositCardDepositType.Activity activity = OtcAgentDepositCardDepositType.Companion;
        if (jsonObject != null && (jsonElement4 = jsonObject.get("depositType")) != null) {
            asString3 = jsonElement4.getAsString();
        }
        OtcAgentDepositCardDepositType otcAgentDepositCardDepositTypeKWHzl = activity.KWHzl(asString3);
        if (jsonObject == null || (jsonElement3 = jsonObject.get(OtcExtraKeys.AMOUNT)) == null || (asString = jsonElement3.getAsString()) == null) {
            asString = "";
        }
        if (jsonObject != null && (jsonElement2 = jsonObject.get("currency")) != null && (asString2 = jsonElement2.getAsString()) != null) {
            str2 = asString2;
        }
        this.cachedMessageData = new OtcAgentDepositCardMessageData(otcAgentDepositCardDepositTypeKWHzl, asString, str2, (jsonObject == null || (jsonElement = jsonObject.get("currencyId")) == null) ? 0 : jsonElement.getAsInt());
        return this;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getContent());
    }

    public final OtcAgentDepositCardMessageData getMessageData() {
        if (this.cachedMessageData == null) {
            this.cachedMessageData = parseContent(getContent());
        }
        return this.cachedMessageData;
    }

    private final OtcAgentDepositCardMessageData parseContent(String str) {
        if (str != null && str.length() != 0) {
            try {
                return (OtcAgentDepositCardMessageData) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) OtcAgentDepositCardMessageData.Companion.serializer(), str);
            } catch (Exception e) {
                pUU.AEQbTJ(TAG, "Failed to parse content for OtcAgentDepositCardMessage", e);
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OtcAgentDepositCardMessageContent> serializer() {
            return OtcAgentDepositCardMessageContent$$serializer.INSTANCE;
        }
    }
}
