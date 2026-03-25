package com.okinc.oklive.app.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
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
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKLiveTokenUpdateMessage extends OKCustomMessage implements sJU<OKLiveTokenUpdateMessage> {
    private TokenUpdateMessage tokenUpdate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKLiveTokenUpdateMessage> CREATOR = new Parcelable.Creator<OKLiveTokenUpdateMessage>() { // from class: com.okinc.oklive.app.domain.model.OKLiveTokenUpdateMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveTokenUpdateMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKLiveTokenUpdateMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveTokenUpdateMessage[] newArray(int i) {
            return new OKLiveTokenUpdateMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenUpdateMessage getTokenUpdate() {
        return this.tokenUpdate;
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
    public final void setTokenUpdate(TokenUpdateMessage tokenUpdateMessage) {
        this.tokenUpdate = tokenUpdateMessage;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlinx.serialization.json.JsonObject */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OKLiveTokenUpdateMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, String str9, TokenUpdateMessage tokenUpdateMessage, SerializationConstructorMarker serializationConstructorMarker) {
        OKLiveTokenUpdateMessage oKLiveTokenUpdateMessage;
        TokenUpdateMessage tokenUpdateMessage2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, (JsonObject) str8, (String) jsonObject, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            tokenUpdateMessage2 = null;
            oKLiveTokenUpdateMessage = this;
        } else {
            oKLiveTokenUpdateMessage = this;
            tokenUpdateMessage2 = tokenUpdateMessage;
        }
        oKLiveTokenUpdateMessage.tokenUpdate = tokenUpdateMessage2;
    }

    public static final /* synthetic */ void write$Self$OKLive_oklive_impl(OKLiveTokenUpdateMessage oKLiveTokenUpdateMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKLiveTokenUpdateMessage, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKLiveTokenUpdateMessage.tokenUpdate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, TokenUpdateMessage$$serializer.INSTANCE, oKLiveTokenUpdateMessage.tokenUpdate);
    }

    public OKLiveTokenUpdateMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLiveTokenUpdateMessage(@NotNull Parcel parcel) {
        Object objM7377constructorimpl;
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        TokenUpdateMessage tokenUpdateMessage = null;
        tokenUpdateMessage = null;
        if (string != null) {
            string = StringsKt__StringsKt.fARcdN((CharSequence) string) ^ true ? string : null;
            if (string != null) {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl((TokenUpdateMessage) new Gson().fromJson(string, TokenUpdateMessage.class));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                tokenUpdateMessage = (TokenUpdateMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        this.tokenUpdate = tokenUpdateMessage;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        String json;
        String str = "";
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        TokenUpdateMessage tokenUpdateMessage = this.tokenUpdate;
        if (tokenUpdateMessage != null && (json = new Gson().toJson(tokenUpdateMessage)) != null) {
            str = json;
        }
        parcel.writeString(str);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.OKLiveTokenUpdateMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKLiveTokenUpdateMessage> serializer() {
            return OKLiveTokenUpdateMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKLiveTokenUpdateMessage m6915decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKLiveTokenUpdateMessage();
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
    public OKLiveTokenUpdateMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        if (str == null || (utf8ContentString = toUtf8ContentString(str)) == null) {
            utf8ContentString = "";
        }
        setContent(utf8ContentString);
        TokenUpdateMessage tokenUpdateMessage = null;
        if (!StringsKt__StringsKt.fARcdN((CharSequence) utf8ContentString)) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((TokenUpdateMessage) new Gson().fromJson(utf8ContentString, TokenUpdateMessage.class));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            tokenUpdateMessage = (TokenUpdateMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        this.tokenUpdate = tokenUpdateMessage;
        return this;
    }
}
