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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKLiveModeratorInvitationMessage extends OKCustomMessage implements sJU<OKLiveModeratorInvitationMessage> {
    private String shareCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKLiveModeratorInvitationMessage> CREATOR = new Parcelable.Creator<OKLiveModeratorInvitationMessage>() { // from class: com.okinc.okimcore.model.im.OKLiveModeratorInvitationMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveModeratorInvitationMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKLiveModeratorInvitationMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveModeratorInvitationMessage[] newArray(int i) {
            return new OKLiveModeratorInvitationMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareCode() {
        return this.shareCode;
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
    public final void setShareCode(String str) {
        this.shareCode = str;
    }

    public /* synthetic */ OKLiveModeratorInvitationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage;
        String str11;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            str11 = null;
            oKLiveModeratorInvitationMessage = this;
        } else {
            oKLiveModeratorInvitationMessage = this;
            str11 = str10;
        }
        oKLiveModeratorInvitationMessage.shareCode = str11;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKLiveModeratorInvitationMessage, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKLiveModeratorInvitationMessage.shareCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKLiveModeratorInvitationMessage.shareCode);
    }

    public OKLiveModeratorInvitationMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLiveModeratorInvitationMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        this.shareCode = Intrinsics.EZpvd((Object) string, (Object) "") ? null : string;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        String str = this.shareCode;
        parcel.writeString(str != null ? str : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKLiveModeratorInvitationMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKLiveModeratorInvitationMessage> serializer() {
            return OKLiveModeratorInvitationMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKLiveModeratorInvitationMessage m6879decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKLiveModeratorInvitationMessage();
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
    public OKLiveModeratorInvitationMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        JsonElement jsonElement;
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
        String asString = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) objM7377constructorimpl;
        if (jsonObject != null && (jsonElement = jsonObject.get("shareCode")) != null) {
            asString = jsonElement.getAsString();
        }
        this.shareCode = asString;
        return this;
    }
}
