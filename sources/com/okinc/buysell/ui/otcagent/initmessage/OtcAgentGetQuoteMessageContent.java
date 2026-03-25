package com.okinc.buysell.ui.otcagent.initmessage;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKUserInfo;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class OtcAgentGetQuoteMessageContent extends OKCustomMessage implements sJU<OtcAgentGetQuoteMessageContent> {
    private transient String getQuoteMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};

    public static /* synthetic */ void getGetQuoteMessage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OtcAgentGetQuoteMessageContent m6651decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGetQuoteMessage() {
        return this.getQuoteMessage;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.initmessage.OtcAgentGetQuoteMessageContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OtcAgentGetQuoteMessageContent> serializer() {
            return OtcAgentGetQuoteMessageContent$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlinx.serialization.json.JsonObject */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OtcAgentGetQuoteMessageContent(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent;
        String str11;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, (JsonObject) str8, (String) jsonObject, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            str11 = "";
            otcAgentGetQuoteMessageContent = this;
        } else {
            otcAgentGetQuoteMessageContent = this;
            str11 = str10;
        }
        otcAgentGetQuoteMessageContent.getQuoteMessage = str11;
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) otcAgentGetQuoteMessageContent, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) otcAgentGetQuoteMessageContent.getQuoteMessage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, otcAgentGetQuoteMessageContent.getQuoteMessage);
    }

    public OtcAgentGetQuoteMessageContent() {
        this.getQuoteMessage = "";
    }

    @Override // o.sJU
    public String encodeToInHouseCustomContent() {
        String content = getContent();
        return content == null ? "" : content;
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.sJU
    public OtcAgentGetQuoteMessageContent decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        JsonElement jsonElement;
        String asString;
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
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        if (jsonObject != null && (jsonElement = jsonObject.get("payload")) != null && (asString = jsonElement.getAsString()) != null) {
            str2 = asString;
        }
        this.getQuoteMessage = str2;
        return this;
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
}
