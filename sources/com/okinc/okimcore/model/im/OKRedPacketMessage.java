package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import o.C33069mpW;
import o.C33070mpX;
import o.C44157sFk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.sDX;
import o.sDZ;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKRedPacketMessage extends OKCustomMessage implements sJU<OKRedPacketMessage> {
    public static final String BIZ_NAME_CRYPTO_GIFT_EXPIRED = "CryptoGiftExpired";
    public static final String BIZ_NAME_CRYPTO_GIFT_FULLY_CLAIMED = "CryptoGiftFullyClaimed";
    public static final String BIZ_NAME_CRYPTO_GIFT_FULLY_CLAIMED_SYSTEM = "CryptoGiftFullyClaimed_System";
    public static final String BIZ_NAME_CRYPTO_GIFT_OPENED = "CryptoGiftOpened";
    public static final String BIZ_NAME_CRYPTO_GIFT_OPEN_FAILED = "CryptoGiftOpenFailed";
    public static final String BIZ_NAME_CRYPTO_GIFT_OPEN_PROCESSING = "CryptoGiftOpenProcessing";
    public static final String BIZ_NAME_CRYPTO_GIFT_PROCESSING = "CryptoGiftProcessing";
    public static final String BIZ_NAME_CRYPTO_GIFT_RECEIVER_OPENED = "CryptoGiftReceiverOpened_System";
    public static final String BIZ_NAME_CRYPTO_GIFT_SEND_FAILED = "CryptoGiftSendFailed";
    public static final String BIZ_NAME_CRYPTO_GIFT_SEND_SUCCESS = "CryptoGiftSendSuccess";
    public static final int SCENARIO_EXCLUSIVE = 2;
    public static final int SCENARIO_GROUP = 1;
    public static final int STATE_EXPIRED = 103;
    public static final int STATE_FAILED_TO_OPEN = 201;
    public static final int STATE_FAILED_TO_SEND = 101;
    public static final int STATE_FULLY_CLAIMED = 104;
    public static final int STATE_OPENED = 202;
    public static final int STATE_OPENING = 200;
    public static final int STATE_PROCESSING = 100;
    public static final int STATE_SEND_SUCCESS = 102;
    private Boolean dim;
    private List<String> exclusiveGiftReceiverUids;
    private String giftId;
    private String message;
    private Integer scenario;
    private Integer state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};
    public static final Parcelable.Creator<OKRedPacketMessage> CREATOR = new Parcelable.Creator<OKRedPacketMessage>() { // from class: com.okinc.okimcore.model.im.OKRedPacketMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKRedPacketMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKRedPacketMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKRedPacketMessage[] newArray(int i) {
            return new OKRedPacketMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDim() {
        return this.dim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getExclusiveGiftReceiverUids() {
        return this.exclusiveGiftReceiverUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDim(Boolean bool) {
        this.dim = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExclusiveGiftReceiverUids(List<String> list) {
        this.exclusiveGiftReceiverUids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGiftId(String str) {
        this.giftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessage(String str) {
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScenario(Integer num) {
        this.scenario = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(Integer num) {
        this.state = num;
    }

    public /* synthetic */ OKRedPacketMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, Boolean bool, Integer num, List list, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        OKRedPacketMessage oKRedPacketMessage;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, serializationConstructorMarker);
        if ((i & 65536) == 0) {
            oKRedPacketMessage = this;
            oKRedPacketMessage.giftId = null;
        } else {
            oKRedPacketMessage = this;
            oKRedPacketMessage.giftId = str10;
        }
        if ((i & 131072) == 0) {
            oKRedPacketMessage.message = null;
        } else {
            oKRedPacketMessage.message = str11;
        }
        if ((i & 262144) == 0) {
            oKRedPacketMessage.dim = null;
        } else {
            oKRedPacketMessage.dim = bool;
        }
        if ((i & 524288) == 0) {
            oKRedPacketMessage.state = null;
        } else {
            oKRedPacketMessage.state = num;
        }
        if ((i & 1048576) == 0) {
            oKRedPacketMessage.exclusiveGiftReceiverUids = null;
        } else {
            oKRedPacketMessage.exclusiveGiftReceiverUids = list;
        }
        oKRedPacketMessage.scenario = (i & 2097152) != 0 ? num2 : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKRedPacketMessage oKRedPacketMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCustomMessage.write$Self((OKCustomMessage) oKRedPacketMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKRedPacketMessage.giftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKRedPacketMessage.giftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKRedPacketMessage.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKRedPacketMessage.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || oKRedPacketMessage.dim != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, oKRedPacketMessage.dim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || oKRedPacketMessage.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, oKRedPacketMessage.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || oKRedPacketMessage.exclusiveGiftReceiverUids != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], oKRedPacketMessage.exclusiveGiftReceiverUids);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && oKRedPacketMessage.scenario == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, oKRedPacketMessage.scenario);
    }

    public OKRedPacketMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRedPacketMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.giftId = parcel.readString();
        this.message = parcel.readString();
        this.exclusiveGiftReceiverUids = parcel.createStringArrayList();
        int i = parcel.readInt();
        this.scenario = i == -1 ? null : Integer.valueOf(i);
        this.dim = Boolean.valueOf(parcel.readInt() != 0);
        int i2 = parcel.readInt();
        this.state = i2 != -1 ? Integer.valueOf(i2) : null;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.giftId);
        parcel.writeString(this.message);
        parcel.writeStringList(this.exclusiveGiftReceiverUids);
        Integer num = this.scenario;
        parcel.writeInt(num != null ? num.intValue() : -1);
        parcel.writeInt(Intrinsics.EZpvd(this.dim, Boolean.TRUE) ? 1 : 0);
        Integer num2 = this.state;
        parcel.writeInt(num2 != null ? num2.intValue() : -1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKRedPacketMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKRedPacketMessage> serializer() {
            return OKRedPacketMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKRedPacketMessage m6889decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKRedPacketMessage();
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
    public OKRedPacketMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        ArrayList arrayList;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonArray asJsonArray;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
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
        this.giftId = (jsonObject == null || (jsonElement5 = jsonObject.get("giftId")) == null) ? null : jsonElement5.getAsString();
        this.state = (jsonObject == null || (jsonElement4 = jsonObject.get("state")) == null) ? null : Integer.valueOf(jsonElement4.getAsInt());
        if (jsonObject == null || (jsonElement3 = jsonObject.get("exclusiveGiftReceiverUids")) == null || (asJsonArray = jsonElement3.getAsJsonArray()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C56403yEb.AYXKKw(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
        }
        this.exclusiveGiftReceiverUids = arrayList;
        this.scenario = (jsonObject == null || (jsonElement2 = jsonObject.get("scenario")) == null) ? null : Integer.valueOf(jsonElement2.getAsInt());
        if (jsonObject != null && (jsonElement = jsonObject.get("message")) != null) {
            asString = jsonElement.getAsString();
        }
        this.message = asString;
        this.dim = getBoolean(jsonObject);
        return this;
    }

    private final com.google.gson.JsonObject getCover(com.google.gson.JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("cover");
        if (jsonElement != null) {
            return jsonElement.getAsJsonObject();
        }
        return null;
    }

    private final Boolean getBoolean(com.google.gson.JsonObject jsonObject) {
        Object objM7377constructorimpl;
        com.google.gson.JsonObject cover;
        JsonElement jsonElement;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((jsonObject == null || (cover = getCover(jsonObject)) == null || (jsonElement = cover.get("dim")) == null) ? null : Boolean.valueOf(jsonElement.getAsBoolean()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OKCustomMessage.Application getPushData() {
        String name;
        String userId;
        if (!Intrinsics.EZpvd((Object) getBizName(), (Object) BIZ_NAME_CRYPTO_GIFT_SEND_SUCCESS)) {
            return null;
        }
        OKUserInfo userInfo = getUserInfo();
        if (userInfo != null && (userId = userInfo.getUserId()) != null) {
            RelationInfo relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(userId);
            name = relationInfoKWHzl != null ? C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null) : null;
            if (name == null) {
            }
        } else {
            OKUserInfo userInfo2 = getUserInfo();
            name = userInfo2 != null ? userInfo2.getName() : null;
            if (name == null) {
                name = "";
            }
        }
        return new OKCustomMessage.Application(null, C33069mpW.OLrzqt(C33070mpX.AYXKKw(sDX.StateListAnimator.OLrzqt), C56423yEv.EZpvd(C56390yDp.OLrzqt("Sender", name))));
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isAllowInAppPush() {
        return Intrinsics.EZpvd((Object) getBizName(), (Object) BIZ_NAME_CRYPTO_GIFT_SEND_SUCCESS);
    }
}
