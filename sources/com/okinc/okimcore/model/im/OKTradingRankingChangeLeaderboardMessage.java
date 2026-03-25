package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKTradingRankingChangeLeaderboardMessage extends OKCustomMessage implements sJU<OKTradingRankingChangeLeaderboardMessage> {
    private Integer direction;
    private Integer position;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKTradingRankingChangeLeaderboardMessage> CREATOR = new Parcelable.Creator<OKTradingRankingChangeLeaderboardMessage>() { // from class: com.okinc.okimcore.model.im.OKTradingRankingChangeLeaderboardMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKTradingRankingChangeLeaderboardMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKTradingRankingChangeLeaderboardMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKTradingRankingChangeLeaderboardMessage[] newArray(int i) {
            return new OKTradingRankingChangeLeaderboardMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPosition() {
        return this.position;
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
    public final void setDirection(Integer num) {
        this.direction = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosition(Integer num) {
        this.position = num;
    }

    public /* synthetic */ OKTradingRankingChangeLeaderboardMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        OKTradingRankingChangeLeaderboardMessage oKTradingRankingChangeLeaderboardMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            oKTradingRankingChangeLeaderboardMessage = this;
            oKTradingRankingChangeLeaderboardMessage.direction = null;
        } else {
            oKTradingRankingChangeLeaderboardMessage = this;
            oKTradingRankingChangeLeaderboardMessage.direction = num;
        }
        oKTradingRankingChangeLeaderboardMessage.position = (i & 131072) != 0 ? num2 : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKTradingRankingChangeLeaderboardMessage oKTradingRankingChangeLeaderboardMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKTradingRankingChangeLeaderboardMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKTradingRankingChangeLeaderboardMessage.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, oKTradingRankingChangeLeaderboardMessage.direction);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && oKTradingRankingChangeLeaderboardMessage.position == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, oKTradingRankingChangeLeaderboardMessage.position);
    }

    public OKTradingRankingChangeLeaderboardMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKTradingRankingChangeLeaderboardMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        int i = parcel.readInt();
        this.direction = i == -1 ? null : Integer.valueOf(i);
        int i2 = parcel.readInt();
        this.position = i2 != -1 ? Integer.valueOf(i2) : null;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        Integer num = this.direction;
        parcel.writeInt(num != null ? num.intValue() : 0);
        Integer num2 = this.position;
        parcel.writeInt(num2 != null ? num2.intValue() : -1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKTradingRankingChangeLeaderboardMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKTradingRankingChangeLeaderboardMessage> serializer() {
            return OKTradingRankingChangeLeaderboardMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKTradingRankingChangeLeaderboardMessage m6894decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKTradingRankingChangeLeaderboardMessage();
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
    public OKTradingRankingChangeLeaderboardMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        JsonElement jsonElement;
        JsonElement jsonElement2;
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
        this.direction = (jsonObject == null || (jsonElement2 = jsonObject.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) == null) ? null : Integer.valueOf(jsonElement2.getAsInt());
        if (jsonObject != null && (jsonElement = jsonObject.get("position")) != null) {
            numValueOf = Integer.valueOf(jsonElement.getAsInt());
        }
        this.position = numValueOf;
        return this;
    }
}
