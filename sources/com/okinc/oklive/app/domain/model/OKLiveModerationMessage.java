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
public final class OKLiveModerationMessage extends OKCustomMessage implements sJU<OKLiveModerationMessage> {
    private ModerationMessage moderationMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKLiveModerationMessage> CREATOR = new Parcelable.Creator<OKLiveModerationMessage>() { // from class: com.okinc.oklive.app.domain.model.OKLiveModerationMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveModerationMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKLiveModerationMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveModerationMessage[] newArray(int i) {
            return new OKLiveModerationMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModerationMessage getModerationMessage() {
        return this.moderationMessage;
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
    public final void setModerationMessage(ModerationMessage moderationMessage) {
        this.moderationMessage = moderationMessage;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlinx.serialization.json.JsonObject */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OKLiveModerationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, String str9, ModerationMessage moderationMessage, SerializationConstructorMarker serializationConstructorMarker) {
        OKLiveModerationMessage oKLiveModerationMessage;
        ModerationMessage moderationMessage2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, (JsonObject) str8, (String) jsonObject, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            moderationMessage2 = null;
            oKLiveModerationMessage = this;
        } else {
            oKLiveModerationMessage = this;
            moderationMessage2 = moderationMessage;
        }
        oKLiveModerationMessage.moderationMessage = moderationMessage2;
    }

    public static final /* synthetic */ void write$Self$OKLive_oklive_impl(OKLiveModerationMessage oKLiveModerationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKLiveModerationMessage, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKLiveModerationMessage.moderationMessage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, ModerationMessage$$serializer.INSTANCE, oKLiveModerationMessage.moderationMessage);
    }

    public OKLiveModerationMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLiveModerationMessage(@NotNull Parcel parcel) {
        Object objM7377constructorimpl;
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        ModerationMessage moderationMessage = null;
        moderationMessage = null;
        if (string != null) {
            string = StringsKt__StringsKt.fARcdN((CharSequence) string) ^ true ? string : null;
            if (string != null) {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl((ModerationMessage) new Gson().fromJson(string, ModerationMessage.class));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                moderationMessage = (ModerationMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        this.moderationMessage = moderationMessage;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        String json;
        String str = "";
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        ModerationMessage moderationMessage = this.moderationMessage;
        if (moderationMessage != null && (json = new Gson().toJson(moderationMessage)) != null) {
            str = json;
        }
        parcel.writeString(str);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.OKLiveModerationMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKLiveModerationMessage> serializer() {
            return OKLiveModerationMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKLiveModerationMessage m6912decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKLiveModerationMessage();
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
    public OKLiveModerationMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        if (str == null || (utf8ContentString = toUtf8ContentString(str)) == null) {
            utf8ContentString = "";
        }
        setContent(utf8ContentString);
        ModerationMessage moderationMessage = null;
        if (!StringsKt__StringsKt.fARcdN((CharSequence) utf8ContentString)) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((ModerationMessage) new Gson().fromJson(utf8ContentString, ModerationMessage.class));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            moderationMessage = (ModerationMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        this.moderationMessage = moderationMessage;
        return this;
    }
}
