package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class OKRmVipWelcomeMessage extends OKCustomMessage implements sJU<OKRmVipWelcomeMessage> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKRmVipWelcomeMessage> CREATOR = new Parcelable.Creator<OKRmVipWelcomeMessage>() { // from class: com.okinc.okimcore.model.im.OKRmVipWelcomeMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKRmVipWelcomeMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKRmVipWelcomeMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKRmVipWelcomeMessage[] newArray(int i) {
            return new OKRmVipWelcomeMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isAllowInAppPush() {
        return false;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isSystemMessage() {
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.okimcore.model.im.OKUserInfo)
  (r4v0 com.okinc.okimcore.model.im.OKMentionedInfo)
  (r5v0 java.lang.String)
  (r6v0 boolean)
  (r7v0 long)
  (r9v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType)
  (r10v0 boolean)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 kotlinx.serialization.json.JsonObject)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.OKCustomMessage.<init>(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: SUPER */
    public /* synthetic */ OKRmVipWelcomeMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
    }

    public OKRmVipWelcomeMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRmVipWelcomeMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKRmVipWelcomeMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKRmVipWelcomeMessage> serializer() {
            return OKRmVipWelcomeMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKRmVipWelcomeMessage m6890decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKRmVipWelcomeMessage();
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
    public OKRmVipWelcomeMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
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
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return this;
    }
}
